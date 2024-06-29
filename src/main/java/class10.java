import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class10 extends class120 {

    @OriginalMember(owner = "client!li", name = "O", descriptor = "Z")
    private boolean field153 = false;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "I")
    private int field154;

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field155;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field152;

    @OriginalMember(owner = "client!li", name = "L", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field150;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "[B")
    private byte[] field151;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V")
    public final void method36(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field155 == null ? (field155 = method42("javax.sound.sampled.SourceDataLine")) : field155, this.field152, arg0 << (class110.field1946 ? 2 : 1));
            this.field150 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field150.open();
            this.field150.start();
            this.field154 = arg0;
        } catch (LineUnavailableException var4) {
            if (class275.method1829(45, arg0) == 1) {
                this.field150 = null;
                throw var4;
            } else {
                this.method36(class181.method1214(arg0, -1));
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "()V")
    public final void method37() {
        if (this.field150 != null) {
            this.field150.close();
            this.field150 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method38(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field153 = true;
                    }
                }
            }
        }
        this.field152 = new AudioFormat((float) class84.field1375, 16, class110.field1946 ? 2 : 1, true, false);
        this.field151 = new byte[0x100 << (class110.field1946 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "()V")
    public final void method39() {
        int var1 = 256;
        if (class110.field1946) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2150[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field151[var2 * 2] = (byte) (var3 >> 8);
            this.field151[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field150.write(this.field151, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "()V")
    public final void method40() throws LineUnavailableException {
        this.field150.flush();
        if (!this.field153) {
            return;
        }
        this.field150.close();
        this.field150 = null;
        Info var1 = new Info(field155 == null ? (field155 = method42("javax.sound.sampled.SourceDataLine")) : field155, this.field152, this.field154 << (class110.field1946 ? 2 : 1));
        this.field150 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field150.open();
        this.field150.start();
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "()I")
    public final int method41() {
        return this.field154 - (this.field150.available() >> (class110.field1946 ? 2 : 1));
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method42(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
