import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class332 extends class23 implements class115 {

    @OriginalMember(owner = "client!wj", name = "X", descriptor = "B")
    private byte field4455;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "B")
    private byte field4434;

    @OriginalMember(owner = "client!wj", name = "W", descriptor = "S")
    private short field4454;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "Z")
    private boolean field4429;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "B")
    private byte field4448;

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "Z")
    private boolean field4449;

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "Z")
    private boolean field4442;

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "Lk;")
    private class485 field4433;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "Lr;")
    private class157 field4440;

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "[I")
    public static int[] field4437 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "Z")
    public static boolean field4432 = false;

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!wj", name = "V", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "Lqb;")
    public static class189 field4446;

    @OriginalMember(owner = "client!wj", name = "U", descriptor = "Lnk;")
    private class611 field4452;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(Z)I")
    public final int method752(boolean arg0) {
        ++field4450;
        return !arg0 ? 14 : this.field4455;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLqa;I)Lr;")
    public final class157 method744(byte arg0, class207 arg1, int arg2) {
        int var4 = 92 % ((-54 - arg0) / 60);
        ++field4436;
        return this.method2032(arg2, arg1, 0);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILqa;I)Lr;")
    private final class157 method2032(int arg0, class207 arg1, int arg2) {
        if (arg2 != 0) {
            this.field4433 = null;
        }
        ++field4428;
        if (this.field4440 != null && arg1.method1357(this.field4440.method166(), arg0) == 0) {
            return this.field4440;
        } else {
            class105 var4 = this.method2034(false, false, arg1, arg0);
            return var4 != null ? var4.field1580 : null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "(I)V")
    public static void method2033(int arg0) {
        if (arg0 > -59) {
            field4447 = -75;
        }
        field4437 = null;
        field4446 = null;
    }

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "(I)I")
    public final int method259(int arg0) {
        if (arg0 < 102) {
            this.field4452 = null;
        }
        ++field4453;
        return this.field4440 == null ? 0 : this.field4440.method133();
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)I")
    public final int method748(boolean arg0) {
        if (arg0) {
            this.field4452 = null;
        }
        ++field4438;
        return 65535 & this.field4454;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILqa;)V")
    public final void method751(int arg0, class207 arg1) {
        if (arg0 >= 0) {
            this.method744((byte) -26, (class207) null, -85);
        }
        ++field4444;
        Object var3 = null;
        class485 var5;
        if (this.field4433 == null && this.field4442) {
            class105 var4 = this.method2034(true, false, arg1, 262144);
            var5 = var4 == null ? null : var4.field1585;
        } else {
            var5 = this.field4433;
            this.field4433 = null;
        }
        if (var5 != null) {
            class294.method1888(var5, this.field4448, super.field337, super.field341, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZLqa;)Lnk;")
    public final class611 method490(boolean arg0, class207 arg1) {
        if (this.field4452 == null) {
            this.field4452 = class563.method3213(super.field345, this.method2032(0, arg1, 0), super.field337, super.field341, !arg0);
        }
        if (arg0) {
            this.field4429 = false;
        }
        ++field4430;
        return this.field4452;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)I")
    public final int method749(int arg0) {
        ++field4441;
        return arg0 != 24194 ? 80 : this.field4434;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZZLqa;I)Lgm;")
    private final class105 method2034(boolean arg0, boolean arg1, class207 arg2, int arg3) {
        ++field4439;
        class364 var5 = class18.field227.method1201((byte) 125, 65535 & this.field4454);
        class174 var6;
        class174 var7;
        if (!this.field4429) {
            if (~this.field4448 <= -4) {
                var6 = null;
            } else {
                var6 = class608.field8767[this.field4448 - -1];
            }
            var7 = class608.field8767[this.field4448];
        } else {
            var6 = class608.field8767[0];
            var7 = client.field3472[this.field4448];
        }
        return arg1 ? null : var5.method2176(this.field4455, arg2, super.field337, var7, this.field4434, arg0, super.field341, var6, -333, super.field345, arg3);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public final void method750(int arg0) {
        if (arg0 > 88) {
            if (this.field4440 != null) {
                this.field4440.method156();
            }
            ++field4435;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lqa;B)V")
    public final void method487(class207 arg0, byte arg1) {
        ++field4431;
        if (arg1 != 21) {
            field4437 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method488(class207 arg0, int arg1, int arg2, int arg3) {
        ++field4427;
        class157 var5 = this.method2032(131072, arg0, 0);
        if (var5 != null) {
            class163 var6 = arg0.method1344();
            var6.method1054(super.field337, super.field345, super.field341);
            return var5.method143(arg1, arg2, var6, false);
        } else {
            if (arg3 != 1) {
                this.method746((byte) 99, (class207) null);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lqa;Lss;IIIIZIIIII)V")
    public class332(class207 arg0, class364 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class131.method890((byte) 42, arg11, arg10));
        this.field4455 = (byte) arg10;
        this.field4434 = (byte) arg11;
        this.field4454 = (short) arg1.field4944;
        this.field4429 = arg6;
        super.field341 = arg5;
        this.field4448 = (byte) arg2;
        this.field4449 = ~arg1.field4881 != -1 && !arg6;
        super.field337 = arg3;
        this.field4442 = arg0.method1345() && arg1.field4913 && !this.field4429 && ~class491.field6875.method1507(class103.field1570, (byte) 121) != -1;
        class105 var13 = this.method2034(this.field4442, false, arg0, 2048);
        if (var13 != null) {
            this.field4433 = var13.field1585;
            this.field4440 = var13.field1580;
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)Z")
    public final boolean method747(int arg0) {
        if (arg0 != -23611) {
            this.field4454 = 41;
        }
        ++field4451;
        return this.field4442;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(ZLqa;)Lvw;")
    public final class254 method483(boolean arg0, class207 arg1) {
        ++field4445;
        if (this.field4440 == null) {
            return null;
        } else {
            if (!arg0) {
                field4447 = -1;
            }
            class163 var3 = arg1.method1344();
            var3.method1054(super.field337 + super.field336, super.field345, super.field341 - -super.field342);
            class254 var4 = null;
            if (this.field4449) {
                var4 = class110.method772(1, 1);
            }
            this.field4440.method154(var3, var4 == null ? null : var4.field3525[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLqa;)V")
    public final void method746(byte arg0, class207 arg1) {
        if (arg0 >= -50) {
            this.method2032(92, (class207) null, 74);
        }
        ++field4443;
        Object var3 = null;
        class485 var5;
        if (this.field4433 == null && this.field4442) {
            class105 var4 = this.method2034(true, false, arg1, 262144);
            var5 = var4 == null ? null : var4.field1585;
        } else {
            var5 = this.field4433;
            this.field4433 = null;
        }
        if (var5 != null) {
            class104.method734(var5, this.field4448, super.field337, super.field341, (boolean[]) null);
        }
    }
}
