import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class482 extends class258 {

    @OriginalMember(owner = "client!o", name = "H", descriptor = "Z")
    private boolean field6410 = false;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    private int field6409;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field6413;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field6408;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field6411;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "[B")
    private byte[] field6412;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V")
    public final void method1206(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field6413 == null ? (field6413 = method2624("javax.sound.sampled.SourceDataLine")) : field6413, this.field6408, arg0 << (class382.field4824 ? 2 : 1));
            this.field6411 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field6411.open();
            this.field6411.start();
            this.field6409 = arg0;
        } catch (LineUnavailableException var4) {
            if (class576.method3176(-125, arg0) == 1) {
                this.field6411 = null;
                throw var4;
            } else {
                this.method1206(class391.method2101(arg0, 128));
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1212(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field6410 = true;
                    }
                }
            }
        }
        this.field6408 = new AudioFormat((float) class392.field4942, 16, class382.field4824 ? 2 : 1, true, false);
        this.field6412 = new byte[0x100 << (class382.field4824 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "()V")
    public final void method1207() throws LineUnavailableException {
        this.field6411.flush();
        if (!this.field6410) {
            return;
        }
        this.field6411.close();
        this.field6411 = null;
        Info var1 = new Info(field6413 == null ? (field6413 = method2624("javax.sound.sampled.SourceDataLine")) : field6413, this.field6408, this.field6409 << (class382.field4824 ? 2 : 1));
        this.field6411 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field6411.open();
        this.field6411.start();
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "()V")
    public final void method1211() {
        int var1 = 256;
        if (class382.field4824) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3146[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field6412[var2 * 2] = (byte) (var3 >> 8);
            this.field6412[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field6411.write(this.field6412, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "()V")
    public final void method1208() {
        if (this.field6411 != null) {
            this.field6411.close();
            this.field6411 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "()I")
    public final int method1210() {
        return this.field6409 - (this.field6411.available() >> (class382.field4824 ? 2 : 1));
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2624(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
