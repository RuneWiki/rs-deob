import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class83 extends class20 {

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "Z")
    private boolean field1653 = false;

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "I")
    private int field1650;

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field1655;

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1651;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1654;

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "[B")
    private byte[] field1652;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "()I")
    public final int method139() {
        return this.field1650 - (this.field1654.available() >> (class131.field2349 ? 2 : 1));
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method142(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            int var3 = 0;
            Info[] var4 = var2;
            while (var3 < var4.length) {
                Info var5 = var4[var3];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1653 = true;
                    }
                }
                var3++;
            }
        }
        this.field1651 = new AudioFormat((float) class271.field4813, 16, class131.field2349 ? 2 : 1, true, false);
        this.field1652 = new byte[0x100 << (class131.field2349 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public final void method134(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field1655 == null ? (field1655 = method550("javax.sound.sampled.SourceDataLine")) : field1655, this.field1651, arg0 << (class131.field2349 ? 2 : 1));
            this.field1654 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1654.open();
            this.field1654.start();
            this.field1650 = arg0;
        } catch (LineUnavailableException var4) {
            if (class203.method1443(arg0, false) == 1) {
                this.field1654 = null;
                throw var4;
            } else {
                this.method134(class82.method540(false, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "()V")
    public final void method147() {
        int var1 = 256;
        if (class131.field2349) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field312[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1652[var2 * 2] = (byte) (var3 >> 8);
            this.field1652[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1654.write(this.field1652, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "()V")
    public final void method145() throws LineUnavailableException {
        this.field1654.flush();
        if (!this.field1653) {
            return;
        }
        this.field1654.close();
        this.field1654 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field1655 == null ? (field1655 = method550("javax.sound.sampled.SourceDataLine")) : field1655, this.field1651, this.field1650 << (class131.field2349 ? 2 : 1));
        this.field1654 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1654.open();
        this.field1654.start();
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "()V")
    public final void method137() {
        if (this.field1654 != null) {
            this.field1654.close();
            this.field1654 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method550(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
