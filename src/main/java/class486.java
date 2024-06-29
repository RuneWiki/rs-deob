import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class486 extends class359 {

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "Z")
    private boolean field7110 = false;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    private int field7111;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field7114;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field7109;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field7113;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "[B")
    private byte[] field7112;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "()V")
    public final void method1988() {
        if (this.field7113 != null) {
            this.field7113.close();
            this.field7113 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "()I")
    public final int method1992() {
        return this.field7111 - (this.field7113.available() >> (class149.field2109 ? 2 : 1));
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1993(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field7110 = true;
                    }
                }
            }
        }
        this.field7109 = new AudioFormat((float) class12.field141, 16, class149.field2109 ? 2 : 1, true, false);
        this.field7112 = new byte[0x100 << (class149.field2109 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "()V")
    public final void method1983() {
        int var1 = 256;
        if (class149.field2109) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4913[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field7112[var2 * 2] = (byte) (var3 >> 8);
            this.field7112[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field7113.write(this.field7112, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public final void method1984(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field7114 == null ? (field7114 = method2863("javax.sound.sampled.SourceDataLine")) : field7114, this.field7109, arg0 << (class149.field2109 ? 2 : 1));
            this.field7113 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field7113.open();
            this.field7113.start();
            this.field7111 = arg0;
        } catch (LineUnavailableException var4) {
            if (class407.method2351(-74, arg0) == 1) {
                this.field7113 = null;
                throw var4;
            } else {
                this.method1984(class420.method2513(arg0, 0));
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "()V")
    public final void method1990() throws LineUnavailableException {
        this.field7113.flush();
        if (!this.field7110) {
            return;
        }
        this.field7113.close();
        this.field7113 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field7114 == null ? (field7114 = method2863("javax.sound.sampled.SourceDataLine")) : field7114, this.field7109, this.field7111 << (class149.field2109 ? 2 : 1));
        this.field7113 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field7113.open();
        this.field7113.start();
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2863(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
