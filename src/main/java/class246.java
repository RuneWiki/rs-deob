import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class246 extends class167 {

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
    private int field4526 = 1024;

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
    private int field4524 = 2048;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
    private int field4525 = 3072;

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "Lkh;")
    public static class117 field4523 = class224.method1450((byte) 122, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!wg", name = "eb", descriptor = "Lkh;")
    private static class117 field4533 = class224.method1450((byte) 122, "Please wait)3)3)3");

    @OriginalMember(owner = "client!wg", name = "Z", descriptor = "Lkh;")
    public static class117 field4528 = field4533;

    @OriginalMember(owner = "client!wg", name = "jb", descriptor = "I")
    public static int field4538 = -1;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!wg", name = "ab", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!wg", name = "bb", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!wg", name = "cb", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!wg", name = "db", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!wg", name = "fb", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!wg", name = "gb", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!wg", name = "hb", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!wg", name = "ib", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!wg", name = "kb", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        if (arg0 != -96) {
            method1613(-1);
        }
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        ++field4529;
        if (super.field3013.field4085) {
            int[] var4 = this.method1186(arg1, arg0 ^ -96, 0);
            for (int var5 = 0; ~var5 > ~class115.field2146; ++var5) {
                var3[var5] = (var4[var5] * this.field4524 >> 12) + this.field4526;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        if (arg1) {
            method1613(82);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field3009 = ~arg0.method998(67) == -2;
                }
            } else {
                this.field4525 = arg0.method1049((byte) 118);
            }
        } else {
            this.field4526 = arg0.method1049((byte) 109);
        }
        ++field4537;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)[[I")
    public final int[][] method116(int arg0, int arg1) {
        ++field4531;
        if (arg1 != -9179) {
            method1613(94);
        }
        int[][] var3 = super.field3022.method1148(arg0, 8708);
        if (super.field3022.field2957) {
            int[][] var4 = this.method1180(arg0, 26851, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~var11 > ~class115.field2146; ++var11) {
                var8[var11] = (var5[var11] * this.field4524 >> 12) + this.field4526;
                var10[var11] = (var6[var11] * this.field4524 >> 12) + this.field4526;
                var9[var11] = (var7[var11] * this.field4524 >> 12) + this.field4526;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V")
    public static void method1613(int arg0) {
        field4533 = null;
        field4528 = null;
        if (arg0 != 2) {
            method1613(29);
        }
        field4523 = null;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
    public class246() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIILf;)V")
    public static final void method1614(int arg0, int arg1, int arg2, class56 arg3) {
        if (arg2 != -2) {
            method1613(27);
        }
        ++field4527;
        if (~arg3.field4213 == ~arg1 && arg1 != -1) {
            class174 var4 = class81.method555(arg1, (byte) 116);
            int var5 = var4.field3128;
            if (~var5 == -2) {
                arg3.field4274 = 0;
                arg3.field4225 = arg0;
                arg3.field4216 = 0;
                arg3.field4243 = 0;
                class99.method673(arg3.field4244, arg3.field4274, 32521, class93.field1712 == arg3, var4, arg3.field4221);
            }
            if (var5 == 2) {
                arg3.field4243 = 0;
                return;
            }
        } else {
            if (~arg1 != 0 && arg3.field4213 != -1 && ~class81.method555(arg1, (byte) 60).field3138 > ~class81.method555(arg3.field4213, (byte) 21).field3138) {
                return;
            }
            arg3.field4267 = arg3.field4272;
            arg3.field4225 = arg0;
            arg3.field4274 = 0;
            arg3.field4243 = 0;
            arg3.field4213 = arg1;
            arg3.field4216 = 0;
            if (~arg3.field4213 != 0) {
                class99.method673(arg3.field4244, arg3.field4274, arg2 + 32523, class93.field1712 == arg3, class81.method555(arg3.field4213, (byte) 86), arg3.field4221);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(BI)Lbb;")
    public static final class14 method1615(byte arg0, int arg1) {
        ++field4539;
        class14 var2 = (class14) class49.field1028.method506(1, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class106.field1926.method104(-24, 16, arg1);
            class14 var4 = new class14();
            if (var3 != null) {
                var4.method131(true, new class145(var3));
            }
            class49.field1028.method497((long) arg1, var4, -107);
            return arg0 <= 44 ? null : var4;
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
    public final void method262(int arg0) {
        int var2 = -37 % ((-18 - arg0) / 59);
        ++field4535;
        this.field4524 = -this.field4526 + this.field4525;
    }
}
