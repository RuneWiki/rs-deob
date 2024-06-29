import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class264 extends class60 {

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "Z")
    private boolean field4686 = false;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
    private int field4684;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field4688;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4685;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4687;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "[B")
    private byte[] field4683;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public final void method438(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field4688 == null ? (field4688 = method1820("javax.sound.sampled.SourceDataLine")) : field4688, this.field4685, arg0 << (class286.field5020 ? 2 : 1));
            this.field4687 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4687.open();
            this.field4687.start();
            this.field4684 = arg0;
        } catch (LineUnavailableException var4) {
            if (class172.method1230((byte) 120, arg0) == 1) {
                this.field4687 = null;
                throw var4;
            } else {
                this.method438(class54.method408(true, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "()V")
    public final void method440() {
        if (this.field4687 != null) {
            this.field4687.close();
            this.field4687 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method439(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4686 = true;
                    }
                }
            }
        }
        this.field4685 = new AudioFormat((float) class275.field4822, 16, class286.field5020 ? 2 : 1, true, false);
        this.field4683 = new byte[0x100 << (class286.field5020 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "()I")
    public final int method451() {
        return this.field4684 - (this.field4687.available() >> (class286.field5020 ? 2 : 1));
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "()V")
    public final void method446() {
        int var1 = 256;
        if (class286.field5020) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1100[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4683[var2 * 2] = (byte) (var3 >> 8);
            this.field4683[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4687.write(this.field4683, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "()V")
    public final void method447() throws LineUnavailableException {
        this.field4687.flush();
        if (!this.field4686) {
            return;
        }
        this.field4687.close();
        this.field4687 = null;
        Info var1 = new Info(field4688 == null ? (field4688 = method1820("javax.sound.sampled.SourceDataLine")) : field4688, this.field4685, this.field4684 << (class286.field5020 ? 2 : 1));
        this.field4687 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4687.open();
        this.field4687.start();
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1820(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
