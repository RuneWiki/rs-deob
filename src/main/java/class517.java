import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public abstract class class517 implements class113 {

    @OriginalMember(owner = "client!vaa", name = "j", descriptor = "Z")
    private boolean field7257 = false;

    @OriginalMember(owner = "client!vaa", name = "q", descriptor = "I")
    private int field7264;

    @OriginalMember(owner = "client!vaa", name = "e", descriptor = "Luca;")
    public class287 field7252;

    @OriginalMember(owner = "client!vaa", name = "l", descriptor = "I")
    public int field7259;

    @OriginalMember(owner = "client!vaa", name = "m", descriptor = "I")
    public int field7260;

    @OriginalMember(owner = "client!vaa", name = "o", descriptor = "Z")
    private boolean field7262;

    @OriginalMember(owner = "client!vaa", name = "k", descriptor = "I")
    public int field7258;

    @OriginalMember(owner = "client!vaa", name = "i", descriptor = "Z")
    public static boolean field7256 = false;

    @OriginalMember(owner = "client!vaa", name = "r", descriptor = "Lvg;")
    public static class622 field7265 = new class622(51, 3);

    @OriginalMember(owner = "client!vaa", name = "s", descriptor = "[I")
    public static int[] field7266 = new int[4];

    @OriginalMember(owner = "client!vaa", name = "t", descriptor = "F")
    public static float field7267;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!vaa", name = "f", descriptor = "I")
    public static int field7253;

    @OriginalMember(owner = "client!vaa", name = "g", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!vaa", name = "h", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!vaa", name = "n", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!vaa", name = "p", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Z)I", line = 5)
    private final int method2920(boolean arg0) {
        field7253++;
        int var2 = this.field7252.method1768((byte) 91, this.field7259) * this.field7264;
        if (arg0) {
            this.method2928(-60);
        }
        return this.field7262 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IZ)V", line = 20)
    public final void method2921(int arg0, boolean arg1) {
        field7263++;
        if (this.field7262 != arg1) {
            int var3 = this.method2920(false);
            this.field7262 = true;
            this.method2925(-122);
            this.method2927(0, var3);
        }
        int var4 = 1 % ((65 - arg0) / 42);
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V", line = 39)
    public final void method2922(int arg0) {
        field7255++;
        if (arg0 < this.field7258) {
            this.field7252.method1718(this.method2920(false), (byte) -93, this.field7258);
            this.field7258 = 0;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)V", line = 53)
    public static void method2923(int arg0) {
        field7266 = null;
        field7265 = null;
        if (arg0 >= -7) {
            method2923(24);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZI)V", line = 66)
    public final void method2924(boolean arg0, int arg1) {
        if (this.field7257 != arg0) {
            this.field7257 = arg0;
            this.method2925(71);
        }
        field7261++;
        if (arg1 >= -13) {
            this.method2926((byte) -77);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)V", line = 84)
    private final void method2925(int arg0) {
        field7251++;
        int var2 = -22 / ((arg0 + 73) / 49);
        this.field7252.method1709((byte) -128, this);
        if (this.field7257) {
            OpenGL.glTexParameteri(this.field7260, 10241, this.field7262 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field7260, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field7260, 10241, this.field7262 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field7260, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(B)Z", line = 107)
    public final boolean method2926(byte arg0) {
        field7254++;
        if (arg0 >= -37) {
            this.field7262 = true;
        }
        if (!this.field7252.field4062) {
            return false;
        }
        int var2 = this.method2920(false);
        this.field7252.method1709((byte) -74, this);
        OpenGL.glGenerateMipmapEXT(this.field7260);
        this.field7262 = true;
        this.method2925(63);
        this.method2927(0, var2);
        return true;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(II)V", line = 134)
    private final void method2927(int arg0, int arg1) {
        field7248++;
        if (arg0 != 0) {
            field7265 = null;
        }
        this.field7252.field4038 -= arg1;
        this.field7252.field4038 += this.method2920(false);
    }

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "(I)I", line = 147)
    public final int method2928(int arg0) {
        if (arg0 == 9729) {
            field7249++;
            return this.field7258;
        } else {
            return -54;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Luca;IIIZ)V", line = 168)
    public class517(class287 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field7264 = arg3;
        this.field7252 = arg0;
        this.field7259 = arg2;
        this.field7260 = arg1;
        this.field7262 = arg4;
        OpenGL.glGenTextures(1, class588.field8527, 0);
        this.field7258 = class588.field8527[0];
        this.method2927(0, 0);
    }

    @OriginalMember(owner = "client!vaa", name = "finalize", descriptor = "()V", line = 192)
    protected final void finalize() throws Throwable {
        this.method2922(0);
        field7250++;
        super.finalize();
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)V")
    public abstract void method847(byte arg0);
}
