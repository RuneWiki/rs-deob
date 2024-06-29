import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class530 extends class65 {

    @OriginalMember(owner = "client!iba", name = "G", descriptor = "Z")
    private boolean field7199 = false;

    @OriginalMember(owner = "client!iba", name = "J", descriptor = "I")
    private int field7202;

    @OriginalMember(owner = "client!iba", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field7204;

    @OriginalMember(owner = "client!iba", name = "I", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field7201;

    @OriginalMember(owner = "client!iba", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field7203;

    @OriginalMember(owner = "client!iba", name = "H", descriptor = "[B")
    private byte[] field7200;

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "()V")
    public final void method505() throws LineUnavailableException {
        this.field7203.flush();
        if (!this.field7199) {
            return;
        }
        this.field7203.close();
        this.field7203 = null;
        Info var1 = new Info(field7204 == null ? (field7204 = method2933("javax.sound.sampled.SourceDataLine")) : field7204, this.field7201, this.field7202 << (class460.field6375 ? 2 : 1));
        this.field7203 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field7203.open();
        this.field7203.start();
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "()I")
    public final int method504() {
        return this.field7202 - (this.field7203.available() >> (class460.field6375 ? 2 : 1));
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "()V")
    public final void method503() {
        int var1 = 256;
        if (class460.field6375) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field712[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field7200[var2 * 2] = (byte) (var3 >> 8);
            this.field7200[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field7203.write(this.field7200, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method499(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field7199 = true;
                    }
                }
            }
        }
        this.field7201 = new AudioFormat((float) class478.field6609, 16, class460.field6375 ? 2 : 1, true, false);
        this.field7200 = new byte[0x100 << (class460.field6375 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(I)V")
    public final void method496(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field7204 == null ? (field7204 = method2933("javax.sound.sampled.SourceDataLine")) : field7204, this.field7201, arg0 << (class460.field6375 ? 2 : 1));
            this.field7203 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field7203.open();
            this.field7203.start();
            this.field7202 = arg0;
        } catch (LineUnavailableException var4) {
            if (class677.method3846((byte) 116, arg0) == 1) {
                this.field7203 = null;
                throw var4;
            } else {
                this.method496(class128.method814(423660257, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "()V")
    public final void method508() {
        if (this.field7203 != null) {
            this.field7203.close();
            this.field7203 = null;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2933(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
