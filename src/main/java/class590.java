import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class590 {

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    private int field7800 = 0;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    private int field7801 = 0;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Lhf;")
    private class367 field7804 = null;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    private int field7806 = 0;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "Lno;")
    private class658 field7811;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "Lhm;")
    private class207 field7803;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "[Lpi;")
    private class465[] field7807;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "Lcaa;")
    public class279 field7812;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field7802;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field7805;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public static int field7809;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static int field7810;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "Lbi;")
    public static class449 field7808;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZZIIZ)V")
    public final void method3239(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        field7805++;
        boolean var7 = arg1 & this.field7811.method390();
        if (!var7 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
            if (arg4 == 4) {
                arg3 = arg0;
            }
            arg4 = 2;
        }
        if (arg4 != 0 && arg2) {
            arg4 |= Integer.MIN_VALUE;
        }
        if (!arg5) {
            this.field7804 = null;
        }
        if (this.field7801 != arg4) {
            if (this.field7801 != 0) {
                this.field7807[Integer.MAX_VALUE & this.field7801].method213(15495);
            }
            if (arg4 != 0) {
                this.field7807[Integer.MAX_VALUE & arg4].method210(83, arg2);
                this.field7807[arg4 & Integer.MAX_VALUE].method214((byte) 99, arg2);
                this.field7807[arg4 & Integer.MAX_VALUE].method215(arg3, 0, arg0);
            }
            this.field7804 = null;
            this.field7806 = arg0;
            this.field7800 = arg3;
            this.field7801 = arg4;
        } else if (this.field7801 != 0) {
            this.field7807[Integer.MAX_VALUE & this.field7801].method214((byte) 99, arg2);
            if (this.field7806 != arg0 || this.field7800 != arg3) {
                this.field7807[Integer.MAX_VALUE & this.field7801].method215(arg3, 0, arg0);
                this.field7806 = arg0;
                this.field7800 = arg3;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lbi;III)Lpf;")
    public static final class545 method3240(class449 arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 106) {
            method3241(false);
        }
        field7809++;
        byte[] var4 = arg0.method2537(false, arg1, arg3);
        return var4 == null ? null : new class545(var4);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V")
    public static void method3241(boolean arg0) {
        if (!arg0) {
            method3240(null, -120, -1, -107);
        }
        field7808 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILhf;I)Z")
    public final boolean method3242(int arg0, class367 arg1, int arg2) {
        field7810++;
        if (this.field7801 == 0) {
            return false;
        }
        if (this.field7804 != arg1) {
            this.field7807[this.field7801 & Integer.MAX_VALUE].method212(0, arg2, arg1);
            this.field7804 = arg1;
        }
        if (arg0 >= -115) {
            this.method3239(40, true, false, 41, -88, true);
        }
        return true;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)Z")
    public final boolean method3243(byte arg0, int arg1) {
        if (arg0 <= 72) {
            method3241(true);
        }
        field7802++;
        return this.field7807[arg1].method218(117);
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lno;)V")
    public class590(class658 arg0) {
        this.field7811 = arg0;
        this.field7803 = new class207(arg0);
        this.field7807 = new class465[10];
        this.field7807[1] = new class310(arg0);
        this.field7807[2] = new class23(arg0, this.field7803);
        this.field7807[4] = new class476(arg0, this.field7803);
        this.field7807[5] = new class146(arg0, this.field7803);
        this.field7807[6] = new class255(arg0);
        this.field7807[7] = new class220(arg0);
        this.field7807[3] = this.field7812 = new class279(arg0);
        this.field7807[8] = new class522(arg0, this.field7803);
        this.field7807[9] = new class373(arg0, this.field7803);
        if (!this.field7807[8].method218(125)) {
            this.field7807[8] = this.field7807[4];
        }
        if (!this.field7807[9].method218(113)) {
            this.field7807[9] = this.field7807[8];
        }
    }
}
