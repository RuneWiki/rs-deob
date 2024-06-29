import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class342 extends class243 {

    @OriginalMember(owner = "client!hs", name = "M", descriptor = "Z")
    private boolean field5067 = false;

    @OriginalMember(owner = "client!hs", name = "I", descriptor = "I")
    private int field5063;

    @OriginalMember(owner = "client!hs", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field5068;

    @OriginalMember(owner = "client!hs", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field5064;

    @OriginalMember(owner = "client!hs", name = "L", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field5066;

    @OriginalMember(owner = "client!hs", name = "K", descriptor = "[B")
    private byte[] field5065;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 16)
    public final void method1235(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field5067 = true;
                    }
                }
            }
        }
        this.field5064 = new AudioFormat((float) class110.field1367, 16, class488.field6909 ? 2 : 1, true, false);
        this.field5065 = new byte[0x100 << (class488.field6909 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "()V", line = 52)
    public final void method1230() {
        int var1 = 256;
        if (class488.field6909) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3475[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field5065[var2 * 2] = (byte) (var3 >> 8);
            this.field5065[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field5066.write(this.field5065, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)V", line = 88)
    public final void method1231(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field5068 == null ? (field5068 = method2188("javax.sound.sampled.SourceDataLine")) : field5068, this.field5064, arg0 << (class488.field6909 ? 2 : 1));
            this.field5066 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field5066.open();
            this.field5066.start();
            this.field5063 = arg0;
        } catch (LineUnavailableException var4) {
            if (class394.method2400(arg0, -20302) == 1) {
                this.field5066 = null;
                throw var4;
            } else {
                this.method1231(class89.method631((byte) -100, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 88)
    public static Class method2188(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "()V", line = 110)
    public final void method1232() {
        if (this.field5066 != null) {
            this.field5066.close();
            this.field5066 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "()I", line = 124)
    public final int method1229() {
        return this.field5063 - (this.field5066.available() >> (class488.field6909 ? 2 : 1));
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "()V", line = 135)
    public final void method1234() throws LineUnavailableException {
        this.field5066.flush();
        if (!this.field5067) {
            return;
        }
        this.field5066.close();
        this.field5066 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field5068 == null ? (field5068 = method2188("javax.sound.sampled.SourceDataLine")) : field5068, this.field5064, this.field5063 << (class488.field6909 ? 2 : 1));
        this.field5066 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field5066.open();
        this.field5066.start();
    }
}
