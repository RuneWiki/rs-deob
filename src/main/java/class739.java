import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class739 extends class260 {

    @OriginalMember(owner = "client!ega", name = "M", descriptor = "Z")
    private boolean field10297 = false;

    @OriginalMember(owner = "client!ega", name = "J", descriptor = "I")
    private int field10294;

    @OriginalMember(owner = "client!ega", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field10299;

    @OriginalMember(owner = "client!ega", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field10296;

    @OriginalMember(owner = "client!ega", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field10295;

    @OriginalMember(owner = "client!ega", name = "N", descriptor = "[B")
    private byte[] field10298;

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "()V", line = 13)
    public final void method1364() {
        if (this.field10295 != null) {
            this.field10295.close();
            this.field10295 = null;
        }
    }

    @OriginalMember(owner = "client!ega", name = "e", descriptor = "()V", line = 26)
    public final void method1363() throws LineUnavailableException {
        this.field10295.flush();
        if (!this.field10297) {
            return;
        }
        this.field10295.close();
        this.field10295 = null;
        Info var1 = new Info(field10299 == null ? (field10299 = method4152("javax.sound.sampled.SourceDataLine")) : field10299, this.field10296, this.field10294 << (class270.field3189 ? 2 : 1));
        this.field10295 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field10295.open();
        this.field10295.start();
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 33)
    public static Class method4152(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "(I)V", line = 47)
    public final void method1359(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field10299 == null ? (field10299 = method4152("javax.sound.sampled.SourceDataLine")) : field10299, this.field10296, arg0 << (class270.field3189 ? 2 : 1));
            this.field10295 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field10295.open();
            this.field10295.start();
            this.field10294 = arg0;
        } catch (LineUnavailableException var4) {
            if (class519.method3111(arg0, (byte) 120) == 1) {
                this.field10295 = null;
                throw var4;
            } else {
                this.method1359(class783.method4337(arg0, (byte) 79));
            }
        }
    }

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "()V", line = 73)
    public final void method1365() {
        int var1 = 256;
        if (class270.field3189) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3083[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field10298[var2 * 2] = (byte) (var3 >> 8);
            this.field10298[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field10295.write(this.field10298, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "()I", line = 106)
    public final int method1362() {
        return this.field10294 - (this.field10295.available() >> (class270.field3189 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 118)
    public final void method1361(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field10297 = true;
                    }
                }
            }
        }
        this.field10296 = new AudioFormat((float) class478.field6632, 16, class270.field3189 ? 2 : 1, true, false);
        this.field10298 = new byte[0x100 << (class270.field3189 ? 2 : 1)];
    }
}
