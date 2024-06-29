import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class125 extends class192 {

    @OriginalMember(owner = "client!qa", name = "Y", descriptor = "Z")
    private boolean field2043 = false;

    @OriginalMember(owner = "client!qa", name = "bb", descriptor = "I")
    private int field2046;

    @OriginalMember(owner = "client!qa", name = "db", descriptor = "Ljava/lang/Class;")
    public static Class field2048;

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2044;

    @OriginalMember(owner = "client!qa", name = "ab", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2045;

    @OriginalMember(owner = "client!qa", name = "cb", descriptor = "[B")
    private byte[] field2047;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()V", line = 14)
    public final void method857() throws LineUnavailableException {
        this.field2045.flush();
        if (!this.field2043) {
            return;
        }
        this.field2045.close();
        this.field2045 = null;
        Info var1 = new Info(field2048 == null ? (field2048 = method863("javax.sound.sampled.SourceDataLine")) : field2048, this.field2044, this.field2046 << (class159.field2694 ? 2 : 1));
        this.field2045 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2045.open();
        this.field2045.start();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 21)
    public static Class method863(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 34)
    public final void method858(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2043 = true;
                    }
                }
            }
        }
        this.field2044 = new AudioFormat((float) class218.field3594, 16, class159.field2694 ? 2 : 1, true, false);
        this.field2047 = new byte[0x100 << (class159.field2694 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()I", line = 71)
    public final int method859() {
        return this.field2046 - (this.field2045.available() >> (class159.field2694 ? 2 : 1));
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()V", line = 78)
    public final void method860() {
        if (this.field2045 != null) {
            this.field2045.close();
            this.field2045 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V", line = 93)
    public final void method861(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2048 == null ? (field2048 = method863("javax.sound.sampled.SourceDataLine")) : field2048, this.field2044, arg0 << (class159.field2694 ? 2 : 1));
            this.field2045 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2045.open();
            this.field2045.start();
            this.field2046 = arg0;
        } catch (LineUnavailableException var4) {
            if (class252.method1840(arg0, 858993459) == 1) {
                this.field2045 = null;
                throw var4;
            } else {
                this.method861(class272.method1993(arg0, 110));
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V", line = 125)
    public final void method862() {
        int var1 = 256;
        if (class159.field2694) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3201[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2047[var2 * 2] = (byte) (var3 >> 8);
            this.field2047[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2045.write(this.field2047, 0, var1 << 1);
    }
}
