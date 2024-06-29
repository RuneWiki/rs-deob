import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class228 extends class123 {

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
    private int field3518 = -1;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
    private int field3519 = 0;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    private int field3514;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!ii", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() throws Throwable {
        field3515++;
        if (this.field3518 != -1) {
            class177.method1308(this.field3518, this.field3519, this.field3514);
            this.field3519 = 0;
            this.field3518 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(Z)V", line = 22)
    public final void method1662(boolean arg0) {
        field3517++;
        int var2 = class53.method442(false);
        if (!arg0) {
            return;
        }
        if ((var2 & 0x1) == 0) {
            class162.method1219(this.field3518);
        }
        if ((var2 & 0x2) == 0) {
            class162.method1206(0);
        }
        if ((var2 & 0x4) == 0) {
            class162.method1211(0);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)I", line = 52)
    public static final int method1663(int arg0, int arg1) {
        field3516++;
        if (arg1 != 1) {
            return 70;
        }
        class18 var2 = class151.method1139(arg0, 0);
        int var3 = var2.field341;
        int var4 = var2.field345;
        int var5 = var2.field346;
        int var6 = class169.field2720[var4 - var5];
        return class123.field1998[var3] >> var5 & var6;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(I)V", line = 83)
    public class228(int arg0) {
        GL var2 = class162.field2654;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field3518 = var3[0];
        this.field3514 = class177.field2819;
        class162.method1219(this.field3518);
        int var4 = class40.field606[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class177.field2820 += var6.limit() - this.field3519;
        this.field3519 = var6.limit();
    }
}
