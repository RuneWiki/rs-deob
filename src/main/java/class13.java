import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class13 extends class19 {

    @OriginalMember(owner = "client!n", name = "A", descriptor = "Z")
    private boolean field172 = false;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    private int field175;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field177;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field176;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field174;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "[B")
    private byte[] field173;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "()V")
    public final void method94() {
        int var1 = 256;
        if (class217.field3062) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field219[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field173[var2 * 2] = (byte) (var3 >> 8);
            this.field173[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field174.write(this.field173, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public final void method95(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field177 == null ? (field177 = method100("javax.sound.sampled.SourceDataLine")) : field177, this.field176, arg0 << (class217.field3062 ? 2 : 1));
            this.field174 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field174.open();
            this.field174.start();
            this.field175 = arg0;
        } catch (LineUnavailableException var4) {
            if (class356.method2272(arg0, (byte) -116) == 1) {
                this.field174 = null;
                throw var4;
            } else {
                this.method95(class328.method2123(arg0, 20867));
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V")
    public final void method96() {
        if (this.field174 != null) {
            this.field174.close();
            this.field174 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method97(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field172 = true;
                    }
                }
            }
        }
        this.field176 = new AudioFormat((float) class313.field4484, 16, class217.field3062 ? 2 : 1, true, false);
        this.field173 = new byte[0x100 << (class217.field3062 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "()I")
    public final int method98() {
        return this.field175 - (this.field174.available() >> (class217.field3062 ? 2 : 1));
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "()V")
    public final void method99() throws LineUnavailableException {
        this.field174.flush();
        if (!this.field172) {
            return;
        }
        this.field174.close();
        this.field174 = null;
        Info var1 = new Info(field177 == null ? (field177 = method100("javax.sound.sampled.SourceDataLine")) : field177, this.field176, this.field175 << (class217.field3062 ? 2 : 1));
        this.field174 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field174.open();
        this.field174.start();
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method100(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
