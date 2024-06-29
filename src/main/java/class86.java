import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class86 extends class62 {

    @OriginalMember(owner = "client!tf", name = "T", descriptor = "Z")
    private boolean field1616 = false;

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "I")
    private int field1613;

    @OriginalMember(owner = "client!tf", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field1617;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1612;

    @OriginalMember(owner = "client!tf", name = "R", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1614;

    @OriginalMember(owner = "client!tf", name = "S", descriptor = "[B")
    private byte[] field1615;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "()V")
    public final void method422() {
        int var1 = 256;
        if (class12.field187) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1046[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1615[var2 * 2] = (byte) (var3 >> 8);
            this.field1615[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1614.write(this.field1615, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "()I")
    public final int method442() {
        return this.field1613 - (this.field1614.available() >> (class12.field187 ? 2 : 1));
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "()V")
    public final void method439() {
        if (this.field1614 != null) {
            this.field1614.close();
            this.field1614 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method436(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            int var3 = 0;
            Info[] var4 = var2;
            while (var3 < var4.length) {
                Info var5 = var4[var3];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1616 = true;
                    }
                }
                var3++;
            }
        }
        this.field1612 = new AudioFormat((float) class255.field4454, 16, class12.field187 ? 2 : 1, true, false);
        this.field1615 = new byte[0x100 << (class12.field187 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "()V")
    public final void method424() throws LineUnavailableException {
        this.field1614.flush();
        if (!this.field1616) {
            return;
        }
        this.field1614.close();
        this.field1614 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field1617 == null ? (field1617 = method682("javax.sound.sampled.SourceDataLine")) : field1617, this.field1612, this.field1613 << (class12.field187 ? 2 : 1));
        this.field1614 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1614.open();
        this.field1614.start();
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public final void method425(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field1617 == null ? (field1617 = method682("javax.sound.sampled.SourceDataLine")) : field1617, this.field1612, arg0 << (class12.field187 ? 2 : 1));
            this.field1614 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1614.open();
            this.field1614.start();
            this.field1613 = arg0;
        } catch (LineUnavailableException var4) {
            if (class45.method334((byte) -105, arg0) == 1) {
                this.field1614 = null;
                throw var4;
            } else {
                this.method425(class96.method762((byte) -27, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method682(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
