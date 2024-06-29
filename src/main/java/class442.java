import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class442 extends class264 {

    @OriginalMember(owner = "client!tq", name = "K", descriptor = "I")
    public int field6539;

    @OriginalMember(owner = "client!tq", name = "Q", descriptor = "I")
    public int field6545;

    @OriginalMember(owner = "client!tq", name = "N", descriptor = "F")
    public float field6542;

    @OriginalMember(owner = "client!tq", name = "I", descriptor = "Z")
    public boolean field6537;

    @OriginalMember(owner = "client!tq", name = "O", descriptor = "F")
    public float field6543;

    @OriginalMember(owner = "client!tq", name = "P", descriptor = "Lnj;")
    public static class162 field6544 = new class162(32);

    @OriginalMember(owner = "client!tq", name = "R", descriptor = "I")
    public static int field6546 = 13156520;

    @OriginalMember(owner = "client!tq", name = "J", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!tq", name = "L", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!tq", name = "M", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BI)Z")
    public static final boolean method2632(byte arg0, int arg1) {
        if (arg0 > -16) {
            field6546 = 105;
        }
        ++field6538;
        if (~arg1 != -61 && arg1 != 46 && arg1 != 5 && ~arg1 != -12 && arg1 != 8) {
            return arg1 == 50 || ~arg1 == -1013;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lef;IIII[I)V")
    public class442(class338 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field6539 = arg1;
        this.field6545 = arg2;
        this.method1585(true, 0, 0, 126, arg1, 0, arg5, arg2, 0);
        this.field6542 = (float) arg1 / (float) arg3;
        this.field6537 = false;
        this.field6543 = (float) arg2 / (float) arg4;
        this.method1579(-6746, false, false);
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)V")
    public static void method2633(byte arg0) {
        field6544 = null;
        if (arg0 >= -106) {
            method2632((byte) 26, 14);
        }
    }

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "(I)Z")
    public static final boolean method2634(int arg0) {
        ++field6541;
        class82 var1 = (class82) class526.field7778.field6997.field3617;
        if (var1 != null && class526.field7778.field6997 != var1) {
            if (arg0 > -23) {
                field6546 = -18;
            }
            if (var1.field1230 >= 2000) {
                var1.field1230 -= 2000;
            }
            return var1.field1230 == 1003;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lef;IIIIZ[BI)V")
    public class442(class338 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (~super.field505 != -34038) {
            this.field6537 = true;
            this.field6542 = this.field6543 = 1.0F;
        } else {
            this.field6543 = (float) arg4;
            this.field6537 = false;
            this.field6542 = (float) arg3;
        }
        this.field6545 = arg4;
        this.field6539 = arg3;
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lef;IIIII[BI)V")
    public class442(class338 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field6539 = arg2;
        this.field6545 = arg3;
        this.method1584(0, 0, arg3, arg7, arg2, 0, true, 0, arg6, 0);
        this.field6542 = (float) arg2 / (float) arg4;
        this.field6537 = false;
        this.field6543 = (float) arg3 / (float) arg5;
        this.method1579(-6746, false, false);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)Z")
    public static final boolean method2635(int arg0, int arg1, int arg2) {
        int var3 = class371.field5429[arg0][arg1][arg2];
        if (-class328.field4485 == var3) {
            return false;
        } else if (class328.field4485 == var3) {
            return true;
        } else {
            int var4 = arg1 << class523.field7736;
            int var5 = arg2 << class523.field7736;
            if (class61.method501(var4 + 1, class211.field2950[arg0].method351(arg1, arg2), var5 + 1) && class61.method501(class424.field6241 + var4 - 1, class211.field2950[arg0].method351(arg1 + 1, arg2), var5 + 1) && class61.method501(class424.field6241 + var4 - 1, class211.field2950[arg0].method351(arg1 + 1, arg2 + 1), class424.field6241 + var5 - 1) && class61.method501(var4 + 1, class211.field2950[arg0].method351(arg1, arg2 + 1), class424.field6241 + var5 - 1) && class61.method501(class131.field1925 + var4, class211.field2950[arg0].method351(arg1, arg2), var5 + 1) && class61.method501(class424.field6241 + var4 - 1, class211.field2950[arg0].method351(arg1 + 1, arg2), class131.field1925 + var5) && class61.method501(class131.field1925 + var4, class211.field2950[arg0].method351(arg1, arg2 + 1), class424.field6241 + var5 - 1) && class61.method501(class424.field6241 + var4 - 1, class211.field2950[arg0].method351(arg1, arg2), class131.field1925 + var5) && class61.method501(class131.field1925 + var4, class211.field2950[arg0].method351(arg1, arg2), class131.field1925 + var5)) {
                class371.field5429[arg0][arg1][arg2] = class328.field4485;
                return true;
            } else {
                class371.field5429[arg0][arg1][arg2] = -class328.field4485;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lef;IIIZ[I)V")
    public class442(class338 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        if (super.field505 != 34037) {
            this.field6537 = true;
            this.field6542 = this.field6543 = 1.0F;
        } else {
            this.field6542 = (float) arg2;
            this.field6543 = (float) arg3;
            this.field6537 = false;
        }
        this.field6539 = arg2;
        this.field6545 = arg3;
    }

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "(B)V")
    public static final void method2636(byte arg0) {
        class121.field1816 = null;
        class211.field2951 = null;
        ++field6540;
        if (arg0 >= -8) {
            method2636((byte) -39);
        }
        class260.field3621 = null;
        class479.field7008 = null;
        class405.field5946 = false;
        class217.field3024 = null;
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lef;IIIIIZ)V")
    public class442(class338 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field6539 = arg4;
        if (~super.field505 != -34038) {
            this.field6537 = true;
            this.field6542 = this.field6543 = 1.0F;
        } else {
            this.field6542 = (float) arg4;
            this.field6543 = (float) arg5;
            this.field6537 = false;
        }
        this.field6545 = arg5;
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lef;IIIIIIZ)V")
    public class442(class338 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field6537 = false;
        this.field6543 = (float) arg4 / (float) arg6;
        this.field6542 = (float) arg3 / (float) arg5;
        this.field6539 = arg3;
        this.field6545 = arg4;
        this.method1579(-6746, false, false);
    }
}
