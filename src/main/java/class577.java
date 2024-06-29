import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class577 extends class298 {

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    public int field8432;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
    public int field8436;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "Z")
    public boolean field8431;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "F")
    public float field8429;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "F")
    public float field8435;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
    public static int field8430;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
    public static int field8434;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "Lvk;")
    public static class337 field8433;

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lkga;IIIIIIZ)V", line = 3)
    public class577(class506 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field8432 = arg3;
        this.field8436 = arg4;
        this.field8431 = false;
        this.field8429 = (float) arg3 / (float) arg5;
        this.field8435 = (float) arg4 / (float) arg6;
        this.method1767(false, false, 10242);
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lkga;IIIII[BI)V", line = 17)
    public class577(class506 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field8432 = arg2;
        this.field8436 = arg3;
        this.method1768(0, 0, arg3, true, true, arg2, 0, 0, arg6, arg7);
        this.field8429 = (float) arg2 / (float) arg4;
        this.field8435 = (float) arg3 / (float) arg5;
        this.field8431 = false;
        this.method1767(false, false, 10242);
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lkga;IIII)V", line = 32)
    public class577(class506 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        if (~super.field2380 != -34038) {
            this.field8431 = true;
            this.field8429 = this.field8435 = 1.0F;
        } else {
            this.field8435 = (float) arg4;
            this.field8431 = false;
            this.field8429 = (float) arg3;
        }
        this.field8432 = arg3;
        this.field8436 = arg4;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lkga;IIIII)V", line = 54)
    public class577(class506 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field8429 = (float) arg2 / (float) arg4;
        this.field8436 = arg3;
        this.field8432 = arg2;
        this.field8431 = false;
        this.field8435 = (float) arg3 / (float) arg5;
        this.method1767(false, false, 10242);
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lkga;IIIIIZ)V", line = 70)
    public class577(class506 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field8436 = arg5;
        if (~super.field2380 == -34038) {
            this.field8431 = false;
            this.field8429 = (float) arg4;
            this.field8435 = (float) arg5;
        } else {
            this.field8429 = this.field8435 = 1.0F;
            this.field8431 = true;
        }
        this.field8432 = arg4;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lkga;IIIZ[I)V", line = 94)
    public class577(class506 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        if (super.field2380 == 34037) {
            this.field8429 = (float) arg2;
            this.field8431 = false;
            this.field8435 = (float) arg3;
        } else {
            this.field8429 = this.field8435 = 1.0F;
            this.field8431 = true;
        }
        this.field8436 = arg3;
        this.field8432 = arg2;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lkga;IIII[I)V", line = 115)
    public class577(class506 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field8436 = arg2;
        this.field8432 = arg1;
        this.method1769(0, arg5, 0, 0, true, 0, arg1, arg2, (byte) 82);
        this.field8429 = (float) arg1 / (float) arg3;
        this.field8435 = (float) arg2 / (float) arg4;
        this.field8431 = false;
        this.method1767(false, false, 10242);
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lkga;IIIIZ[BI)V", line = 130)
    public class577(class506 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field8432 = arg3;
        this.field8436 = arg4;
        if (super.field2380 != 34037) {
            this.field8429 = this.field8435 = 1.0F;
            this.field8431 = true;
        } else {
            this.field8429 = (float) arg3;
            this.field8435 = (float) arg4;
            this.field8431 = false;
        }
    }

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)V", line = 151)
    public static void method3375(int arg0) {
        field8433 = null;
        if (arg0 != 5126) {
            method3375(-53);
        }
    }
}
