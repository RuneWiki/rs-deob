import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class226 extends class15 {

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "Z")
    private boolean field4169 = false;

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "I")
    private int field4170;

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field4172;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4167;

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4171;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "[B")
    private byte[] field4168;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "()I")
    public final int method105() {
        return this.field4170 - (this.field4171.available() >> (class32.field650 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "()V")
    public final void method108() {
        if (this.field4171 != null) {
            this.field4171.close();
            this.field4171 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method106(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4169 = true;
                    }
                }
            }
        }
        this.field4167 = new AudioFormat((float) class72.field1278, 16, class32.field650 ? 2 : 1, true, false);
        this.field4168 = new byte[0x100 << (class32.field650 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)V")
    public final void method111(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field4172 == null ? (field4172 = method1479("javax.sound.sampled.SourceDataLine")) : field4172, this.field4167, arg0 << (class32.field650 ? 2 : 1));
            this.field4171 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4171.open();
            this.field4171.start();
            this.field4170 = arg0;
        } catch (LineUnavailableException var4) {
            if (class220.method1453((byte) 40, arg0) == 1) {
                this.field4171 = null;
                throw var4;
            } else {
                this.method111(class241.method1576((byte) -23, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "()V")
    public final void method107() throws LineUnavailableException {
        this.field4171.flush();
        if (!this.field4169) {
            return;
        }
        this.field4171.close();
        this.field4171 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field4172 == null ? (field4172 = method1479("javax.sound.sampled.SourceDataLine")) : field4172, this.field4167, this.field4170 << (class32.field650 ? 2 : 1));
        this.field4171 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4171.open();
        this.field4171.start();
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "()V")
    public final void method104() {
        int var1 = 256;
        if (class32.field650) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field221[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4168[var2 * 2] = (byte) (var3 >> 8);
            this.field4168[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4171.write(this.field4168, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1479(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
