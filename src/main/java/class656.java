import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class656 extends class212 {

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "Lmu;")
    public static class303 field8998 = new class303(69, 12);

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field9000 = 1339;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "Lmu;")
    public static class303 field8999 = new class303(64, 2);

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    public static int field9008 = 0;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field9001;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public static int field9002;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field9003;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field9004;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "I")
    public static int field9005;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
    public static int field9006;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    public static int field9007;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(ZI)V", line = 3)
    public static final void method3701(boolean arg0, int arg1) {
        ++field9002;
        class495.method2919((byte) 41);
        int var2 = class537.field7423.method981(-51, arg1).field4867;
        if (~var2 != -1) {
            if (!arg0) {
                method3703(-43);
            }
            int var3 = class390.field5635.field1665[arg1];
            if (var2 == 5) {
                class424.field6109 = var3;
            }
            if (~var2 == -7) {
                class314.field4350 = var3;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)I", line = 29)
    public final int method3702(int arg0) {
        if (arg0 != -32350) {
            method3701(true, -55);
        }
        ++field9007;
        return super.field3006;
    }

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)V", line = 41)
    public static void method3703(int arg0) {
        field8999 = null;
        if (arg0 != 100) {
            method3703(-25);
        }
        field8998 = null;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)I", line = 54)
    public final int method422(int arg0) {
        ++field9005;
        return arg0 != 20014 ? -48 : 0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V", line = 65)
    public final void method418(boolean arg0) {
        if (arg0) {
            this.method418(false);
        }
        ++field9003;
        if (super.field3006 != 1 && ~super.field3006 != -1) {
            super.field3006 = this.method422(20014);
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(ILdh;)V", line = 79)
    public class656(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V", line = 82)
    public final void method419(int arg0, int arg1) {
        ++field9001;
        super.field3006 = arg1;
        int var3 = 98 / ((82 - arg0) / 35);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)I", line = 92)
    public static final int method3704(byte arg0) {
        ++field9006;
        if (class79.field1423 == 0) {
            class277.field3889.method1821(new class604("jaclib"), false);
            if (~class277.field3889.method1823(119).method1377(28) != -101) {
                return 1;
            }
            if (!((class604) class277.field3889.method1823(71)).method3442(124)) {
                class334.field4684.method2231(arg0 + 24);
            }
            class79.field1423 = 1;
        }
        if (~class79.field1423 == -2) {
            class646.field8889 = class277.method1825(110);
            class277.field3884.method1821(new class302(class79.field1420), false);
            class277.field3890.method1821(new class604("jaggl"), false);
            class277.field3891.method1821(new class604("jagdx"), false);
            class277.field3892.method1821(new class604("jagmisc"), false);
            class277.field3893.method1821(new class604("sw3d"), false);
            class277.field3894.method1821(new class604("hw3d"), false);
            class277.field3895.method1821(new class604("jagtheora"), false);
            class277.field3896.method1821(new class302(class419.field6065), false);
            class277.field3897.method1821(new class302(class663.field9075), false);
            class277.field3898.method1821(new class302(class471.field6600), false);
            class277.field3899.method1821(new class302(class660.field9034), false);
            class277.field3900.method1821(new class302(class34.field857), false);
            class277.field3901.method1821(new class302(class194.field2863), false);
            class277.field3902.method1821(new class302(class558.field7731), false);
            class277.field3903.method1821(new class302(class28.field745), false);
            class277.field3904.method1821(new class302(class18.field286), false);
            class277.field3905.method1821(new class302(class12.field196), false);
            class277.field3906.method1821(new class302(class491.field6803), false);
            class277.field3907.method1821(new class302(class549.field7554), false);
            class277.field3908.method1821(new class302(class212.field3014), false);
            class277.field3909.method1821(new class302(class168.field2631), false);
            class277.field3910.method1821(new class192(class313.field4344, "huffman"), false);
            class277.field3911.method1821(new class302(class113.field1949), false);
            class277.field3912.method1821(new class302(class536.field7417), false);
            class277.field3913.method1821(new class302(class416.field6026), false);
            class277.field3914.method1821(new class419(class77.field1395, "details"), false);
            for (int var1 = 0; var1 < class646.field8889.length; ++var1) {
                if (class646.field8889[var1].method1823(78) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class277[] var3 = class646.field8889;
            for (int var4 = 0; var4 < var3.length; ++var4) {
                class277 var5 = var3[var4];
                int var6 = var5.method1820(-1);
                int var7 = var5.method1823(80).method1377(87);
                var2 += var6 * var7 / 100;
            }
            class435.field6220 = var2;
            class79.field1423 = 2;
        }
        if (class646.field8889 == null) {
            return 100;
        } else {
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            if (arg0 != -25) {
                field9000 = -33;
            }
            class277[] var11 = class646.field8889;
            for (int var12 = 0; ~var12 > ~var11.length; ++var12) {
                class277 var16 = var11[var12];
                int var17 = var16.method1820(-1);
                int var18 = var16.method1823(70).method1377(arg0 ^ 117);
                var8 += var17;
                var9 += var17 * var18 / 100;
                if (var18 < 100) {
                    var10 = false;
                }
            }
            if (var10) {
                if (!((class604) class277.field3892.method1823(92)).method3442(102)) {
                    class334.field4684.method2221(true);
                }
                if (!((class604) class277.field3895.method1823(arg0 ^ -101)).method3442(103)) {
                    class479.field6679 = class334.field4684.method2233(arg0 ^ -19);
                }
                class646.field8889 = null;
            }
            int var13 = var8 - class435.field6220;
            int var14 = var9 - class435.field6220;
            int var15 = var13 <= 0 ? 100 : var14 * 100 / var13;
            if (!var10 && ~var15 < -100) {
                var15 = 99;
            }
            return var15;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Ldh;)V", line = 253)
    public class656(class322 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)I", line = 260)
    public final int method417(int arg0, int arg1) {
        if (arg0 != 3) {
            return 94;
        } else {
            ++field9004;
            return 1;
        }
    }
}
