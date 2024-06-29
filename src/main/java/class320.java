import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class320 extends class629 {

    @OriginalMember(owner = "client!es", name = "Q", descriptor = "I")
    public int field4336;

    @OriginalMember(owner = "client!es", name = "I", descriptor = "Z")
    public boolean field4328;

    @OriginalMember(owner = "client!es", name = "J", descriptor = "F")
    public float field4329;

    @OriginalMember(owner = "client!es", name = "L", descriptor = "F")
    public float field4331;

    @OriginalMember(owner = "client!es", name = "N", descriptor = "I")
    public int field4333;

    @OriginalMember(owner = "client!es", name = "O", descriptor = "Z")
    public static boolean field4334 = false;

    @OriginalMember(owner = "client!es", name = "R", descriptor = "I")
    public static int field4337 = -1;

    @OriginalMember(owner = "client!es", name = "H", descriptor = "Ldv;")
    public static class566 field4327 = new class566(4, -1);

    @OriginalMember(owner = "client!es", name = "K", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!es", name = "P", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!es", name = "S", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!es", name = "M", descriptor = "Lni;")
    public static class444 field4332;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "(I)V")
    public static void method1991(int arg0) {
        field4327 = null;
        if (arg0 < -85) {
            field4332 = null;
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lgi;IIIIIIZ)V")
    public class320(class583 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field4336 = arg4;
        this.field4328 = false;
        this.field4329 = (float) arg3 / (float) arg5;
        this.field4331 = (float) arg4 / (float) arg6;
        this.field4333 = arg3;
        this.method3666(89, false, false);
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lgi;IIIZ[I)V")
    public class320(class583 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field4333 = arg2;
        if (super.field5882 != 34037) {
            this.field4329 = this.field4331 = 1.0F;
            this.field4328 = true;
        } else {
            this.field4331 = (float) arg3;
            this.field4329 = (float) arg2;
            this.field4328 = false;
        }
        this.field4336 = arg3;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(BIIII)V")
    public static final void method1992(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= 71) {
            field4332 = null;
        }
        class107.field1643 = arg2;
        class593.field8555 = arg4;
        class74.field1189 = arg1;
        class483.field6818 = arg3;
        ++field4335;
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lgi;IIIII[BI)V")
    public class320(class583 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field4336 = arg3;
        this.field4333 = arg2;
        this.method3665(0, arg2, arg7, false, true, 0, arg6, arg3, 0, 0);
        this.field4331 = (float) arg3 / (float) arg5;
        this.field4329 = (float) arg2 / (float) arg4;
        this.field4328 = false;
        this.method3666(90, false, false);
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lgi;IIIIIZ)V")
    public class320(class583 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field4336 = arg5;
        if (super.field5882 == 34037) {
            this.field4328 = false;
            this.field4331 = (float) arg5;
            this.field4329 = (float) arg4;
        } else {
            this.field4328 = true;
            this.field4329 = this.field4331 = 1.0F;
        }
        this.field4333 = arg4;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1993(int arg0, byte arg1, int arg2) {
        ++field4338;
        if (arg1 != 5) {
            method1994(122, -58, -10);
        }
        return ~(33 & arg0) != -1;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(III)Z")
    public static final boolean method1994(int arg0, int arg1, int arg2) {
        if (arg0 < 32) {
            return false;
        } else {
            ++field4330;
            return ~(2048 & arg2) != -1;
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lgi;IIIIZ[BI)V")
    public class320(class583 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field4336 = arg4;
        this.field4333 = arg3;
        if (~super.field5882 == -34038) {
            this.field4328 = false;
            this.field4331 = (float) arg4;
            this.field4329 = (float) arg3;
        } else {
            this.field4329 = this.field4331 = 1.0F;
            this.field4328 = true;
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lgi;IIII[I)V")
    public class320(class583 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field4333 = arg1;
        this.field4336 = arg2;
        this.method3662(arg5, 0, 0, arg1, 3314, 0, true, 0, arg2);
        this.field4331 = (float) arg2 / (float) arg4;
        this.field4328 = false;
        this.field4329 = (float) arg1 / (float) arg3;
        this.method3666(27, false, false);
    }
}
