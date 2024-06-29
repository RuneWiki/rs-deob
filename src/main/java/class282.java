import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class282 extends class6 {

    @OriginalMember(owner = "client!rf", name = "db", descriptor = "Z")
    private boolean field4959 = false;

    @OriginalMember(owner = "client!rf", name = "eb", descriptor = "I")
    private int field4960;

    @OriginalMember(owner = "client!rf", name = "fb", descriptor = "Ljava/lang/Class;")
    public static Class field4961;

    @OriginalMember(owner = "client!rf", name = "ab", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4956;

    @OriginalMember(owner = "client!rf", name = "cb", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4958;

    @OriginalMember(owner = "client!rf", name = "bb", descriptor = "[B")
    private byte[] field4957;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public final void method50(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field4961 == null ? (field4961 = method1898("javax.sound.sampled.SourceDataLine")) : field4961, this.field4956, arg0 << (class32.field577 ? 2 : 1));
            this.field4958 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4958.open();
            this.field4958.start();
            this.field4960 = arg0;
        } catch (LineUnavailableException var4) {
            if (class181.method1237((byte) 52, arg0) == 1) {
                this.field4958 = null;
                throw var4;
            } else {
                this.method50(class136.method943((byte) 39, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "()V")
    public final void method48() {
        int var1 = 256;
        if (class32.field577) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field80[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4957[var2 * 2] = (byte) (var3 >> 8);
            this.field4957[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4958.write(this.field4957, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method51(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4959 = true;
                    }
                }
            }
        }
        this.field4956 = new AudioFormat((float) class192.field3479, 16, class32.field577 ? 2 : 1, true, false);
        this.field4957 = new byte[0x100 << (class32.field577 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "()I")
    public final int method58() {
        return this.field4960 - (this.field4958.available() >> (class32.field577 ? 2 : 1));
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "()V")
    public final void method64() throws LineUnavailableException {
        this.field4958.flush();
        if (!this.field4959) {
            return;
        }
        this.field4958.close();
        this.field4958 = null;
        Info var1 = new Info(field4961 == null ? (field4961 = method1898("javax.sound.sampled.SourceDataLine")) : field4961, this.field4956, this.field4960 << (class32.field577 ? 2 : 1));
        this.field4958 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4958.open();
        this.field4958.start();
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "()V")
    public final void method53() {
        if (this.field4958 != null) {
            this.field4958.close();
            this.field4958 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1898(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
