import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class238 extends class720 {

    @OriginalMember(owner = "client!tea", name = "M", descriptor = "Z")
    public boolean field2833;

    @OriginalMember(owner = "client!tea", name = "O", descriptor = "F")
    public float field2835;

    @OriginalMember(owner = "client!tea", name = "B", descriptor = "F")
    public float field2830;

    @OriginalMember(owner = "client!tea", name = "N", descriptor = "I")
    public int field2834;

    @OriginalMember(owner = "client!tea", name = "P", descriptor = "I")
    public int field2836;

    @OriginalMember(owner = "client!tea", name = "L", descriptor = "[I")
    public static int[] field2832 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!tea", name = "E", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lnv;IIIIZ[BI)V", line = 4)
    public class238(class417 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (super.field3591 != 34037) {
            this.field2833 = true;
            this.field2830 = this.field2835 = 1.0F;
        } else {
            this.field2835 = (float) arg4;
            this.field2833 = false;
            this.field2830 = (float) arg3;
        }
        this.field2834 = arg3;
        this.field2836 = arg4;
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lnv;IIIII)V", line = 26)
    public class238(class417 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field2834 = arg2;
        this.field2833 = false;
        this.field2836 = arg3;
        this.field2835 = (float) arg3 / (float) arg5;
        this.field2830 = (float) arg2 / (float) arg4;
        this.method4018(false, false, (byte) 125);
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lnv;IIIIIIZ)V", line = 39)
    public class238(class417 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field2830 = (float) arg3 / (float) arg5;
        this.field2835 = (float) arg4 / (float) arg6;
        this.field2833 = false;
        this.field2834 = arg3;
        this.field2836 = arg4;
        this.method4018(false, false, (byte) 125);
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lnv;IIII[I)V", line = 54)
    public class238(class417 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field2834 = arg1;
        this.field2836 = arg2;
        this.method4016(3314, true, 0, arg2, 0, arg1, arg5, 0, 0);
        this.field2830 = (float) arg1 / (float) arg3;
        this.field2833 = false;
        this.field2835 = (float) arg2 / (float) arg4;
        this.method4018(false, false, (byte) 125);
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lnv;IIII)V", line = 71)
    public class238(class417 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field2834 = arg3;
        if (~super.field3591 != -34038) {
            this.field2830 = this.field2835 = 1.0F;
            this.field2833 = true;
        } else {
            this.field2833 = false;
            this.field2830 = (float) arg3;
            this.field2835 = (float) arg4;
        }
        this.field2836 = arg4;
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lnv;IIIII[BI)V", line = 92)
    public class238(class417 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field2836 = arg3;
        this.field2834 = arg2;
        this.method4013(0, arg2, 114, arg3, arg6, 0, true, 0, arg7, 0);
        this.field2835 = (float) arg3 / (float) arg5;
        this.field2833 = false;
        this.field2830 = (float) arg2 / (float) arg4;
        this.method4018(false, false, (byte) 125);
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lnv;IIIIIZ)V", line = 109)
    public class238(class417 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (super.field3591 != 34037) {
            this.field2830 = this.field2835 = 1.0F;
            this.field2833 = true;
        } else {
            this.field2830 = (float) arg4;
            this.field2835 = (float) arg5;
            this.field2833 = false;
        }
        this.field2836 = arg5;
        this.field2834 = arg4;
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(ZI)V", line = 130)
    public static final void method1404(boolean arg0, int arg1) {
        class352.field4528 = 2;
        ++field2831;
        class126.field1328 = arg1;
        if (arg0) {
            method1405((byte) 13);
        }
        long var2 = 0L;
        if (class10.field79 != null) {
            class244 var4 = new class244(class188.method1153(125, class58.method349(class10.field79, false)));
            long var5 = var4.method1447((byte) -29);
            class504.field7157 = var4.method1447((byte) -113);
            class714.method3989(class628.method3599(-99, var5), true, "", 122);
        } else {
            class40.method240(35, true);
        }
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lnv;IIIZ[III)V", line = 159)
    public class238(class417 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (~super.field3591 == -34038) {
            this.field2835 = (float) arg3;
            this.field2830 = (float) arg2;
            this.field2833 = false;
        } else {
            this.field2833 = true;
            this.field2830 = this.field2835 = 1.0F;
        }
        this.field2836 = arg3;
        this.field2834 = arg2;
    }

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "(B)V", line = 180)
    public static void method1405(byte arg0) {
        int var1 = 62 % ((arg0 - -74) / 36);
        field2832 = null;
    }
}
