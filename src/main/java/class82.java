import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class82 extends class22 {

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "Z")
    private boolean field1285 = false;

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
    private int field1288;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field1289;

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1286;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1287;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "[B")
    private byte[] field1284;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 11)
    public final void method96(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1285 = true;
                    }
                }
            }
        }
        this.field1286 = new AudioFormat((float) class220.field3413, 16, class156.field2337 ? 2 : 1, true, false);
        this.field1284 = new byte[0x100 << (class156.field2337 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "()I", line = 49)
    public final int method97() {
        return this.field1288 - (this.field1287.available() >> (class156.field2337 ? 2 : 1));
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "()V", line = 61)
    public final void method94() {
        int var1 = 256;
        if (class156.field2337) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field349[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1284[var2 * 2] = (byte) (var3 >> 8);
            this.field1284[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1287.write(this.field1284, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "()V", line = 94)
    public final void method98() {
        if (this.field1287 != null) {
            this.field1287.close();
            this.field1287 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "()V", line = 109)
    public final void method100() throws LineUnavailableException {
        this.field1287.flush();
        if (!this.field1285) {
            return;
        }
        this.field1287.close();
        this.field1287 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field1289 == null ? (field1289 = method585("javax.sound.sampled.SourceDataLine")) : field1289, this.field1286, this.field1288 << (class156.field2337 ? 2 : 1));
        this.field1287 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1287.open();
        this.field1287.start();
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 115)
    public static Class method585(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V", line = 132)
    public final void method95(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field1289 == null ? (field1289 = method585("javax.sound.sampled.SourceDataLine")) : field1289, this.field1286, arg0 << (class156.field2337 ? 2 : 1));
            this.field1287 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1287.open();
            this.field1287.start();
            this.field1288 = arg0;
        } catch (LineUnavailableException var4) {
            if (class200.method1427(106, arg0) == 1) {
                this.field1287 = null;
                throw var4;
            } else {
                this.method95(class10.method73((byte) -128, arg0));
            }
        }
    }
}
