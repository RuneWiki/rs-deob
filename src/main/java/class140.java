import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class140 extends class138 {

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "Z")
    private boolean field1934 = false;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "I")
    private int field1933;

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "Ljava/lang/Class;")
    public static Class field1938;

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1937;

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1936;

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "[B")
    private byte[] field1935;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "()V")
    public final void method884() {
        int var1 = 256;
        if (class53.field760) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1911[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1935[var2 * 2] = (byte) (var3 >> 8);
            this.field1935[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1936.write(this.field1935, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method868(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1934 = true;
                    }
                }
            }
        }
        this.field1937 = new AudioFormat((float) class175.field2476, 16, class53.field760 ? 2 : 1, true, false);
        this.field1935 = new byte[0x100 << (class53.field760 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "()V")
    public final void method873() throws LineUnavailableException {
        this.field1936.flush();
        if (!this.field1934) {
            return;
        }
        this.field1936.close();
        this.field1936 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field1938 == null ? (field1938 = method889("javax.sound.sampled.SourceDataLine")) : field1938, this.field1937, this.field1933 << (class53.field760 ? 2 : 1));
        this.field1936 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1936.open();
        this.field1936.start();
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()I")
    public final int method869() {
        return this.field1933 - (this.field1936.available() >> (class53.field760 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V")
    public final void method885(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field1938 == null ? (field1938 = method889("javax.sound.sampled.SourceDataLine")) : field1938, this.field1937, arg0 << (class53.field760 ? 2 : 1));
            this.field1936 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1936.open();
            this.field1936.start();
            this.field1933 = arg0;
        } catch (LineUnavailableException var4) {
            if (class121.method782(arg0, false) == 1) {
                this.field1936 = null;
                throw var4;
            } else {
                this.method885(class216.method1406(true, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "()V")
    public final void method880() {
        if (this.field1936 != null) {
            this.field1936.close();
            this.field1936 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method889(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
