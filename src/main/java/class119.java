import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class119 extends class250 {

    @OriginalMember(owner = "client!nj", name = "T", descriptor = "Z")
    private boolean field1940 = false;

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
    private int field1938;

    @OriginalMember(owner = "client!nj", name = "W", descriptor = "Ljava/lang/Class;")
    public static Class field1943;

    @OriginalMember(owner = "client!nj", name = "U", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1941;

    @OriginalMember(owner = "client!nj", name = "S", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1939;

    @OriginalMember(owner = "client!nj", name = "V", descriptor = "[B")
    private byte[] field1942;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "()V")
    public final void method86() {
        int var1 = 256;
        if (class145.field2372) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4349[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1942[var2 * 2] = (byte) (var3 >> 8);
            this.field1942[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1939.write(this.field1942, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method84(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            int var3 = 0;
            Info[] var4 = var2;
            while (var4.length > var3) {
                Info var5 = var4[var3];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1940 = true;
                    }
                }
                var3++;
            }
        }
        this.field1941 = new AudioFormat((float) class207.field3554, 16, class145.field2372 ? 2 : 1, true, false);
        this.field1942 = new byte[0x100 << (class145.field2372 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "()I")
    public final int method80() {
        return this.field1938 - (this.field1939.available() >> (class145.field2372 ? 2 : 1));
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "()V")
    public final void method82() {
        if (this.field1939 != null) {
            this.field1939.close();
            this.field1939 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public final void method81(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field1943 == null ? (field1943 = method784("javax.sound.sampled.SourceDataLine")) : field1943, this.field1941, arg0 << (class145.field2372 ? 2 : 1));
            this.field1939 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1939.open();
            this.field1939.start();
            this.field1938 = arg0;
        } catch (LineUnavailableException var4) {
            if (class241.method1639(858993459, arg0) == 1) {
                this.field1939 = null;
                throw var4;
            } else {
                this.method81(class264.method1789(-114, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "()V")
    public final void method83() throws LineUnavailableException {
        this.field1939.flush();
        if (!this.field1940) {
            return;
        }
        this.field1939.close();
        this.field1939 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field1943 == null ? (field1943 = method784("javax.sound.sampled.SourceDataLine")) : field1943, this.field1941, this.field1938 << (class145.field2372 ? 2 : 1));
        this.field1939 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1939.open();
        this.field1939.start();
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method784(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
