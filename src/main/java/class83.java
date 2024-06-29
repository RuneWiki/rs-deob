import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class83 extends class648 {

    @OriginalMember(owner = "client!cda", name = "J", descriptor = "Z")
    private boolean field1029 = false;

    @OriginalMember(owner = "client!cda", name = "M", descriptor = "I")
    private int field1032;

    @OriginalMember(owner = "client!cda", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field1034;

    @OriginalMember(owner = "client!cda", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1031;

    @OriginalMember(owner = "client!cda", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1033;

    @OriginalMember(owner = "client!cda", name = "K", descriptor = "[B")
    private byte[] field1030;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V")
    public final void method465(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1034 == null ? (field1034 = method471("javax.sound.sampled.SourceDataLine")) : field1034, this.field1031, arg0 << (class129.field1643 ? 2 : 1));
            this.field1033 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1033.open();
            this.field1033.start();
            this.field1032 = arg0;
        } catch (LineUnavailableException var4) {
            if (class644.method3586(-858993460, arg0) == 1) {
                this.field1033 = null;
                throw var4;
            } else {
                this.method465(class306.method1837((byte) -118, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "()V")
    public final void method466() throws LineUnavailableException {
        this.field1033.flush();
        if (!this.field1029) {
            return;
        }
        this.field1033.close();
        this.field1033 = null;
        Info var1 = new Info(field1034 == null ? (field1034 = method471("javax.sound.sampled.SourceDataLine")) : field1034, this.field1031, this.field1032 << (class129.field1643 ? 2 : 1));
        this.field1033 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1033.open();
        this.field1033.start();
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "()V")
    public final void method467() {
        int var1 = 256;
        if (class129.field1643) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field9158[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1030[var2 * 2] = (byte) (var3 >> 8);
            this.field1030[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1033.write(this.field1030, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "()I")
    public final int method468() {
        return this.field1032 - (this.field1033.available() >> (class129.field1643 ? 2 : 1));
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method469(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1029 = true;
                    }
                }
            }
        }
        this.field1031 = new AudioFormat((float) class519.field7166, 16, class129.field1643 ? 2 : 1, true, false);
        this.field1030 = new byte[0x100 << (class129.field1643 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "()V")
    public final void method470() {
        if (this.field1033 != null) {
            this.field1033.close();
            this.field1033 = null;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method471(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
