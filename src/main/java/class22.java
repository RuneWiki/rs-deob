import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class22 extends class646 {

    @OriginalMember(owner = "client!an", name = "L", descriptor = "F")
    public float field300;

    @OriginalMember(owner = "client!an", name = "K", descriptor = "F")
    public float field299;

    @OriginalMember(owner = "client!an", name = "P", descriptor = "Z")
    public boolean field304;

    @OriginalMember(owner = "client!an", name = "M", descriptor = "I")
    public int field301;

    @OriginalMember(owner = "client!an", name = "N", descriptor = "I")
    public int field302;

    @OriginalMember(owner = "client!an", name = "Q", descriptor = "Liv;")
    public static class84 field305 = new class84();

    @OriginalMember(owner = "client!an", name = "R", descriptor = "Lhs;")
    public static class295 field306 = new class295(8, 1);

    @OriginalMember(owner = "client!an", name = "S", descriptor = "[I")
    public static int[] field307 = new int[6];

    @OriginalMember(owner = "client!an", name = "O", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!an", name = "T", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!an", name = "U", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Len;IIIZ[I)V")
    public class22(class289 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        if (~super.field8241 != -34038) {
            this.field299 = this.field300 = 1.0F;
            this.field304 = true;
        } else {
            this.field299 = (float) arg2;
            this.field300 = (float) arg3;
            this.field304 = false;
        }
        this.field301 = arg3;
        this.field302 = arg2;
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Len;IIIIIIZ)V")
    public class22(class289 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field304 = false;
        this.field299 = (float) arg3 / (float) arg5;
        this.field302 = arg3;
        this.field301 = arg4;
        this.field300 = (float) arg4 / (float) arg6;
        this.method3601(false, false, -126);
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Len;IIII[I)V")
    public class22(class289 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field301 = arg2;
        this.field302 = arg1;
        this.method3600(true, 0, 0, 0, arg2, 0, (byte) -80, arg1, arg5);
        this.field300 = (float) arg2 / (float) arg4;
        this.field299 = (float) arg1 / (float) arg3;
        this.field304 = false;
        this.method3601(false, false, -126);
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(B)V")
    public static void method111(byte arg0) {
        field307 = null;
        field305 = null;
        field306 = null;
        if (arg0 >= -101) {
            field307 = null;
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Len;IIIIZ[BI)V")
    public class22(class289 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (super.field8241 == 34037) {
            this.field304 = false;
            this.field299 = (float) arg3;
            this.field300 = (float) arg4;
        } else {
            this.field304 = true;
            this.field299 = this.field300 = 1.0F;
        }
        this.field302 = arg3;
        this.field301 = arg4;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZI)V")
    public static final void method112(boolean arg0, int arg1) {
        if (arg1 > 1) {
            ++field303;
            class327.method1976(class547.field7412, class677.field9551, class124.field1711, arg0, true);
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Len;IIIIIZ)V")
    public class22(class289 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field302 = arg4;
        if (~super.field8241 != -34038) {
            this.field304 = true;
            this.field299 = this.field300 = 1.0F;
        } else {
            this.field304 = false;
            this.field299 = (float) arg4;
            this.field300 = (float) arg5;
        }
        this.field301 = arg5;
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Len;IIIII[BI)V")
    public class22(class289 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field301 = arg3;
        this.field302 = arg2;
        this.method3597(arg2, arg6, true, 0, arg3, 0, 0, 0, arg7, 4);
        this.field304 = false;
        this.field300 = (float) arg3 / (float) arg5;
        this.field299 = (float) arg2 / (float) arg4;
        this.method3601(false, false, -123);
    }
}
