import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class168 extends class172 {

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
    private int field2672 = 0;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
    private int field2670 = -1;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "I")
    private int field2668;

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "[I")
    public static int[] field2673 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)V", line = 8)
    public final void method1306(int arg0) {
        field2669++;
        int var2 = class250.method1944((byte) -106);
        if (arg0 != -19228) {
            this.field2670 = -58;
        }
        if ((var2 & 0x1) == 0) {
            class42.method273(this.field2670);
        }
        if ((var2 & 0x2) == 0) {
            class42.method275(0);
        }
        if ((var2 & 0x4) == 0) {
            class42.method277(0);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)I", line = 29)
    public static final int method1307(int arg0, int arg1) {
        if (arg1 == 9427) {
            field2674++;
            return arg0 >>> 8;
        } else {
            return 120;
        }
    }

    @OriginalMember(owner = "client!wa", name = "finalize", descriptor = "()V", line = 42)
    protected final void finalize() throws Throwable {
        if (this.field2670 != -1) {
            class199.method1535(this.field2670, this.field2672, this.field2668);
            this.field2672 = 0;
            this.field2670 = -1;
        }
        field2671++;
        super.finalize();
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(Z)V", line = 59)
    public static void method1308(boolean arg0) {
        if (arg0) {
            field2673 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(III)I", line = 69)
    public static final int method1309(int arg0, int arg1, int arg2) {
        field2675++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            if (arg2 <= 120) {
                method1309(-102, 118, -39);
            }
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V", line = 114)
    public class168(int arg0) {
        GL var2 = class42.field627;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field2668 = class199.field3172;
        this.field2670 = var3[0];
        class42.method273(this.field2670);
        int var4 = class153.field2444[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class199.field3173 += var6.limit() - this.field2672;
        this.field2672 = var6.limit();
    }
}
