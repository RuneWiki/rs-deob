import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class56 extends class214 {

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "Z")
    private boolean field814 = false;

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "I")
    private int field812;

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field815;

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field810;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field811;

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "[B")
    private byte[] field813;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V", line = 13)
    public final void method376(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field815 == null ? (field815 = method382("javax.sound.sampled.SourceDataLine")) : field815, this.field810, arg0 << (class215.field3079 ? 2 : 1));
            this.field811 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field811.open();
            this.field811.start();
            this.field812 = arg0;
        } catch (LineUnavailableException var4) {
            if (class419.method2699(28135, arg0) == 1) {
                this.field811 = null;
                throw var4;
            } else {
                this.method376(class8.method64(1388313616, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 13)
    public static Class method382(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "()I", line = 37)
    public final int method377() {
        return this.field812 - (this.field811.available() >> (class215.field3079 ? 2 : 1));
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "()V", line = 44)
    public final void method378() throws LineUnavailableException {
        this.field811.flush();
        if (!this.field814) {
            return;
        }
        this.field811.close();
        this.field811 = null;
        Info var1 = new Info(field815 == null ? (field815 = method382("javax.sound.sampled.SourceDataLine")) : field815, this.field810, this.field812 << (class215.field3079 ? 2 : 1));
        this.field811 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field811.open();
        this.field811.start();
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "()V", line = 64)
    public final void method379() {
        if (this.field811 != null) {
            this.field811.close();
            this.field811 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 78)
    public final void method380(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field814 = true;
                    }
                }
            }
        }
        this.field810 = new AudioFormat((float) class29.field505, 16, class215.field3079 ? 2 : 1, true, false);
        this.field813 = new byte[0x100 << (class215.field3079 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "()V", line = 116)
    public final void method381() {
        int var1 = 256;
        if (class215.field3079) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3062[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field813[var2 * 2] = (byte) (var3 >> 8);
            this.field813[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field811.write(this.field813, 0, var1 << 1);
    }
}
