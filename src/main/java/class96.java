import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class96 extends class78 {

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "Z")
    private boolean field1620 = false;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
    private int field1619;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field1623;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1618;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1622;

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "[B")
    private byte[] field1621;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "()V")
    public final void method478() throws LineUnavailableException {
        this.field1622.flush();
        if (!this.field1620) {
            return;
        }
        this.field1622.close();
        this.field1622 = null;
        Info var1 = new Info(field1623 == null ? (field1623 = method714("javax.sound.sampled.SourceDataLine")) : field1623, this.field1618, this.field1619 << (class7.field160 ? 2 : 1));
        this.field1622 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1622.open();
        this.field1622.start();
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "()V")
    public final void method475() {
        int var1 = 256;
        if (class7.field160) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1281[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1621[var2 * 2] = (byte) (var3 >> 8);
            this.field1621[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1622.write(this.field1621, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "()I")
    public final int method473() {
        return this.field1619 - (this.field1622.available() >> (class7.field160 ? 2 : 1));
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
    public final void method476(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1623 == null ? (field1623 = method714("javax.sound.sampled.SourceDataLine")) : field1623, this.field1618, arg0 << (class7.field160 ? 2 : 1));
            this.field1622 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1622.open();
            this.field1622.start();
            this.field1619 = arg0;
        } catch (LineUnavailableException var4) {
            if (class186.method1252(arg0, 91) == 1) {
                this.field1622 = null;
                throw var4;
            } else {
                this.method476(class89.method685(arg0, -1609027472));
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method477(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1620 = true;
                    }
                }
            }
        }
        this.field1618 = new AudioFormat((float) class186.field2873, 16, class7.field160 ? 2 : 1, true, false);
        this.field1621 = new byte[0x100 << (class7.field160 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "()V")
    public final void method474() {
        if (this.field1622 != null) {
            this.field1622.close();
            this.field1622 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method714(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
