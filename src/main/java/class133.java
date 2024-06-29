import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class133 extends class223 {

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "Z")
    private boolean field1944 = false;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    private int field1946;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field1947;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1942;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1943;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "[B")
    private byte[] field1945;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method45(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1944 = true;
                    }
                }
            }
        }
        this.field1942 = new AudioFormat((float) class276.field4426, 16, class24.field323 ? 2 : 1, true, false);
        this.field1945 = new byte[0x100 << (class24.field323 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()V")
    public final void method48() throws LineUnavailableException {
        this.field1943.flush();
        if (!this.field1944) {
            return;
        }
        this.field1943.close();
        this.field1943 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field1947 == null ? (field1947 = method907("javax.sound.sampled.SourceDataLine")) : field1947, this.field1942, this.field1946 << (class24.field323 ? 2 : 1));
        this.field1943 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1943.open();
        this.field1943.start();
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "()I")
    public final int method44() {
        return this.field1946 - (this.field1943.available() >> (class24.field323 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "()V")
    public final void method46() {
        int var1 = 256;
        if (class24.field323) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3330[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1945[var2 * 2] = (byte) (var3 >> 8);
            this.field1945[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1943.write(this.field1945, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public final void method43(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field1947 == null ? (field1947 = method907("javax.sound.sampled.SourceDataLine")) : field1947, this.field1942, arg0 << (class24.field323 ? 2 : 1));
            this.field1943 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1943.open();
            this.field1943.start();
            this.field1946 = arg0;
        } catch (LineUnavailableException var4) {
            if (class80.method533((byte) 120, arg0) == 1) {
                this.field1943 = null;
                throw var4;
            } else {
                this.method43(class5.method58(arg0, (byte) 125));
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "()V")
    public final void method47() {
        if (this.field1943 != null) {
            this.field1943.close();
            this.field1943 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method907(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
