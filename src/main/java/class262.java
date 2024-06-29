import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public abstract class class262 implements class412 {

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "Z")
    private boolean field3406 = false;

    @OriginalMember(owner = "client!vfa", name = "p", descriptor = "I")
    public int field3417;

    @OriginalMember(owner = "client!vfa", name = "l", descriptor = "I")
    public int field3413;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "Z")
    private boolean field3402;

    @OriginalMember(owner = "client!vfa", name = "u", descriptor = "Lag;")
    public class469 field3422;

    @OriginalMember(owner = "client!vfa", name = "s", descriptor = "I")
    private int field3420;

    @OriginalMember(owner = "client!vfa", name = "n", descriptor = "I")
    public int field3415;

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "[I")
    public static int[] field3403 = new int[4096];

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!vfa", name = "f", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!vfa", name = "g", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!vfa", name = "h", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!vfa", name = "i", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!vfa", name = "k", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!vfa", name = "m", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!vfa", name = "o", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!vfa", name = "q", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!vfa", name = "r", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!vfa", name = "t", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!vfa", name = "j", descriptor = "[I")
    public static int[] field3411;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)V", line = 3)
    public static void method1572(byte arg0) {
        if (arg0 >= -94) {
            method1579(-97);
        }
        field3403 = null;
        field3411 = null;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(III)V", line = 16)
    public static final void method1573(int arg0, int arg1, int arg2) {
        if (arg0 != 8562) {
            field3411 = null;
        }
        field3405++;
        class256 var3 = class592.method3279((byte) -48, 15, 0);
        var3.method1549(-32042);
        var3.field3354 = arg1;
        var3.field3358 = arg2;
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(I)I", line = 31)
    public final int method1574(int arg0) {
        if (arg0 != -15592) {
            this.field3406 = false;
        }
        field3404++;
        return this.field3415;
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(B)V", line = 43)
    private final void method1575(byte arg0) {
        field3409++;
        this.field3422.method2627(82, this);
        int var2 = -48 % ((arg0 - 61) / 42);
        if (this.field3406) {
            OpenGL.glTexParameteri(this.field3417, 10241, this.field3402 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field3417, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field3417, 10241, this.field3402 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field3417, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II)V", line = 67)
    private final void method1576(int arg0, int arg1) {
        if (arg0 != 4096) {
            method1579(69);
        }
        field3407++;
        this.field3422.field6414 -= arg1;
        this.field3422.field6414 += this.method1583(arg0 - 4093);
    }

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "(I)Z", line = 86)
    public final boolean method1577(int arg0) {
        field3421++;
        if (!this.field3422.field6507) {
            if (arg0 != 9729) {
                this.field3417 = -57;
            }
            return false;
        }
        int var2 = this.method1583(3);
        this.field3422.method2627(50, this);
        OpenGL.glGenerateMipmapEXT(this.field3417);
        this.field3402 = true;
        this.method1575((byte) -66);
        this.method1576(4096, var2);
        return true;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(ZI)V", line = 113)
    public final void method1578(boolean arg0, int arg1) {
        if (arg0 != this.field3402) {
            int var3 = this.method1583(3);
            this.field3402 = true;
            this.method1575((byte) 125);
            this.method1576(arg1 + 4096, var3);
        }
        if (arg1 != 0) {
            this.field3406 = true;
        }
        field3419++;
    }

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "(I)Lfw;", line = 133)
    public static final class454 method1579(int arg0) {
        field3418++;
        if (arg0 != 1) {
            method1579(122);
        }
        return class229.method1417(1, (byte) 123);
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Lag;IIIZ)V", line = 232)
    public class262(class469 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3417 = arg1;
        this.field3413 = arg2;
        this.field3402 = arg4;
        this.field3422 = arg0;
        this.field3420 = arg3;
        OpenGL.glGenTextures(1, class562.field7683, 0);
        this.field3415 = class562.field7683[0];
        this.method1576(4096, 0);
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIII)V", line = 151)
    public static final void method1580(int arg0, int arg1, int arg2, int arg3) {
        field3416++;
        class34 var4 = class569.field7760[arg2][arg1];
        if (arg3 != 1) {
            field3411 = null;
        }
        class234.method1449(false, arg0, var4 == null ? class510.field7109 : var4);
    }

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "(I)V", line = 164)
    public final void method1581(int arg0) {
        if (arg0 > -107) {
            this.method1574(-73);
        }
        field3408++;
        if (this.field3415 > 0) {
            this.field3422.method2652(24208728, this.method1583(3), this.field3415);
            this.field3415 = 0;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IZ)V", line = 181)
    public final void method1582(int arg0, boolean arg1) {
        if (arg0 < 114) {
            field3411 = null;
        }
        if (arg1 != this.field3406) {
            this.field3406 = arg1;
            this.method1575((byte) -70);
        }
        field3412++;
    }

    @OriginalMember(owner = "client!vfa", name = "finalize", descriptor = "()V", line = 198)
    protected final void finalize() throws Throwable {
        field3410++;
        this.method1581(-109);
        super.finalize();
    }

    @OriginalMember(owner = "client!vfa", name = "f", descriptor = "(I)I", line = 210)
    private final int method1583(int arg0) {
        field3414++;
        int var2 = this.field3422.method2626(this.field3413, 6120) * this.field3420;
        if (arg0 != 3) {
            this.method1578(true, -103);
        }
        return this.field3402 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)V")
    public abstract void method395(int arg0);
}
