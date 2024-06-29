import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class344 extends class337 {

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "Z")
    private boolean field4932 = false;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
    private int field4936;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field4937;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4933;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4934;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "[B")
    private byte[] field4935;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "()V", line = 10)
    public final void method2065() throws LineUnavailableException {
        this.field4934.flush();
        if (!this.field4932) {
            return;
        }
        this.field4934.close();
        this.field4934 = null;
        Info var1 = new Info(field4937 == null ? (field4937 = method2096("javax.sound.sampled.SourceDataLine")) : field4937, this.field4933, this.field4936 << (class641.field9295 ? 2 : 1));
        this.field4934 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4934.open();
        this.field4934.start();
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 16)
    public static Class method2096(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "()I", line = 30)
    public final int method2075() {
        return this.field4936 - (this.field4934.available() >> (class641.field9295 ? 2 : 1));
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "()V", line = 37)
    public final void method2070() {
        if (this.field4934 != null) {
            this.field4934.close();
            this.field4934 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 55)
    public final void method2073(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4932 = true;
                    }
                }
            }
        }
        this.field4933 = new AudioFormat((float) class604.field8591, 16, class641.field9295 ? 2 : 1, true, false);
        this.field4935 = new byte[0x100 << (class641.field9295 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 93)
    public final void method2066(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field4937 == null ? (field4937 = method2096("javax.sound.sampled.SourceDataLine")) : field4937, this.field4933, arg0 << (class641.field9295 ? 2 : 1));
            this.field4934 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4934.open();
            this.field4934.start();
            this.field4936 = arg0;
        } catch (LineUnavailableException var4) {
            if (class101.method859(-1265031166, arg0) == 1) {
                this.field4934 = null;
                throw var4;
            } else {
                this.method2066(class243.method1546(-26367, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "()V", line = 120)
    public final void method2077() {
        int var1 = 256;
        if (class641.field9295) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4821[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4935[var2 * 2] = (byte) (var3 >> 8);
            this.field4935[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4934.write(this.field4935, 0, var1 << 1);
    }
}
