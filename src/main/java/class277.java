import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class277 extends class208 {

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "Z")
    private boolean field4107 = false;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
    private int field4108;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field4111;

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4109;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4106;

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "[B")
    private byte[] field4110;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 13)
    public final void method801(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4107 = true;
                    }
                }
            }
        }
        this.field4109 = new AudioFormat((float) class289.field4225, 16, class366.field5230 ? 2 : 1, true, false);
        this.field4110 = new byte[0x100 << (class366.field5230 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V", line = 52)
    public final void method797(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field4111 == null ? (field4111 = method1739("javax.sound.sampled.SourceDataLine")) : field4111, this.field4109, arg0 << (class366.field5230 ? 2 : 1));
            this.field4106 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4106.open();
            this.field4106.start();
            this.field4108 = arg0;
        } catch (LineUnavailableException var4) {
            if (class509.method3044(2034196003, arg0) == 1) {
                this.field4106 = null;
                throw var4;
            } else {
                this.method797(class280.method1749(-31679, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 52)
    public static Class method1739(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "()V", line = 73)
    public final void method796() throws LineUnavailableException {
        this.field4106.flush();
        if (!this.field4107) {
            return;
        }
        this.field4106.close();
        this.field4106 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field4111 == null ? (field4111 = method1739("javax.sound.sampled.SourceDataLine")) : field4111, this.field4109, this.field4108 << (class366.field5230 ? 2 : 1));
        this.field4106 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4106.open();
        this.field4106.start();
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "()V", line = 93)
    public final void method798() {
        int var1 = 256;
        if (class366.field5230) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3005[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4110[var2 * 2] = (byte) (var3 >> 8);
            this.field4110[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4106.write(this.field4110, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "()V", line = 127)
    public final void method800() {
        if (this.field4106 != null) {
            this.field4106.close();
            this.field4106 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()I", line = 146)
    public final int method795() {
        return this.field4108 - (this.field4106.available() >> (class366.field5230 ? 2 : 1));
    }
}
