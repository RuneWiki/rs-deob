import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public abstract class class713 extends class668 {

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "S")
    public short field10024;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "Ltm;")
    public static class334 field10022 = new class334(12, -1);

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "Ltm;")
    public static class334 field10027 = new class334(103, 4);

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "Z")
    public static boolean field10028 = false;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
    public static int field10020;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "I")
    public static int field10021;

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "I")
    public static int field10023;

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "I")
    public static int field10025;

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "I")
    public static int field10026;

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "I")
    public static int field10029;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "(I)V", line = 11)
    public static void method3943(int arg0) {
        field10022 = null;
        if (arg0 > -87) {
            method3945((class544) null, (class277) null, (class302) null, 91);
        }
        field10027 = null;
    }

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "(I)V", line = 23)
    public static final void method3944(int arg0) {
        ++field10026;
        if (class723.field10139 <= 0) {
            class665.field9445 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; class8.field84.length > var2; ++var2) {
                if (~class8.field84[var2].indexOf("--> ") != 0) {
                    ++var1;
                    if (class723.field10139 == var1) {
                        class665.field9445 = class8.field84[var2].substring(2 + class8.field84[var2].indexOf(">"));
                        break;
                    }
                }
            }
        }
        if (arg0 != 9134) {
            field10027 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILha;)Z", line = 56)
    public final boolean method1467(int arg0, class544 arg1) {
        if (arg0 > -26) {
            this.method1469((class759[]) null, -20);
        }
        ++field10021;
        return class429.method2671(super.field9469, (byte) -45, super.field9477 >> class662.field9425, super.field9475 >> class662.field9425);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lha;Lre;Liba;I)V", line = 67)
    public static final void method3945(class544 arg0, class277 arg1, class302 arg2, int arg3) {
        ++field10023;
        class34 var4 = arg1.method1814(-90, arg0);
        if (var4 != null) {
            int var5 = var4.method175();
            if (~var5 > ~var4.method179()) {
                var5 = var4.method179();
            }
            int var7 = arg2.field4600;
            int var8 = arg2.field4603;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            if (arg1.field4225 != null) {
                var9 = class570.field8090.method511((int[]) null, arg3 ^ -7215, (class34[]) null, arg1.field4225, class226.field3627);
                for (int var12 = 0; ~var12 > ~var9; ++var12) {
                    String var13 = class226.field3627[var12];
                    if (var9 + -1 > var12) {
                        var13 = var13.substring(0, -4 + var13.length());
                    }
                    int var14 = class256.field4030.method4171(var13);
                    if (var14 > var10) {
                        var10 = var14;
                    }
                }
                var11 = class256.field4030.method4172() * var9 - -(class256.field4030.method4175() / 2);
            }
            int var15 = arg2.field4600 - -(var5 / 2);
            int var16 = arg2.field4603;
            if (var7 >= class729.field10240 + var5) {
                if (~(-var5 + class729.field10225) > ~var7) {
                    var7 = -var5 + class729.field10225;
                    var15 = -(var10 / 2) + -arg3 + -5 + -(var5 / 2) + class729.field10225;
                }
            } else {
                var15 = var5 / 2 + var10 / 2 + class729.field10240 - -arg3 - -5;
                var7 = class729.field10240;
            }
            if (var8 >= class729.field10222 + var5) {
                if (-var5 + class729.field10219 < var8) {
                    var16 = -(var5 / 2) + -arg3 + -var11 + class729.field10219;
                    var8 = -var5 + class729.field10219;
                }
            } else {
                var8 = class729.field10222;
                var16 = arg3 - -(var5 / 2) + class729.field10222;
            }
            int var17 = 65535 & (int) (32767.0D * (Math.atan2((double) (-arg2.field4600 + var7), (double) (var8 - arg2.field4603)) / 3.141592653589793D));
            var4.method176((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
            int var18 = -2;
            int var19 = -2;
            int var20 = -2;
            int var21 = -2;
            if (arg1.field4225 != null) {
                var18 = -(var10 / 2) + var15 - 5;
                var19 = var16;
                var21 = 3 + var16 + var9 * class256.field4030.method4172();
                var20 = var10 + var18 + 10;
                if (arg1.field4233 != 0) {
                    arg0.method3183(-var18 + var20, -var16 + var21, arg1.field4233, var16, 90, var18);
                }
                if (~arg1.field4218 != -1) {
                    arg0.method3179(var18, arg1.field4218, -var16 + var21, var16, -var18 + var20, true);
                }
                for (int var22 = 0; ~var9 < ~var22; ++var22) {
                    String var23 = class226.field3627[var22];
                    if (~(var9 + -1) < ~var22) {
                        var23 = var23.substring(0, var23.length() + -4);
                    }
                    class256.field4030.method4170(arg0, var23, var15, var16, arg1.field4247, true);
                    var16 += class256.field4030.method4172();
                }
            }
            if (arg1.field4237 != -1 || arg1.field4225 != null) {
                class141 var24 = new class141(arg2);
                int var25 = var5 >> 1;
                var24.field2208 = var20;
                var24.field2209 = var8 - var25;
                var24.field2206 = var18;
                var24.field2203 = var7 + var25;
                var24.field2202 = var19;
                var24.field2204 = var21;
                var24.field2205 = var8 + var25;
                var24.field2207 = -var25 + var7;
                class508.field7390.method3472(113, var24);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IIIIII)V", line = 210)
    public class713(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field9474 = arg1;
        super.field9469 = (byte) arg4;
        super.field9475 = arg2;
        super.field9470 = (byte) arg3;
        super.field9477 = arg0;
        this.field10024 = (short) arg5;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([Lvt;I)I", line = 223)
    public final int method1469(class759[] arg0, int arg1) {
        if (arg1 <= 104) {
            return -59;
        } else {
            ++field10020;
            return this.method3746(super.field9477 >> class662.field9425, 0, arg0, super.field9475 >> class662.field9425);
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)Z", line = 241)
    public final boolean method1468(byte arg0) {
        ++field10025;
        if (arg0 >= -82) {
            field10028 = true;
        }
        return class52.field838[(super.field9477 >> class662.field9425) + class155.field2405 + -class336.field4923][(super.field9475 >> class662.field9425) + -class63.field996 + class155.field2405];
    }
}
