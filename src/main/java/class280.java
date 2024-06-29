import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class280 extends class105 {

    @OriginalMember(owner = "client!oj", name = "R", descriptor = "Lvf;")
    public static class265 field4950 = class87.method582(-46, "(U1");

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "I")
    public static int field4946 = 0;

    @OriginalMember(owner = "client!oj", name = "Q", descriptor = "Lvf;")
    public static class265 field4949 = class87.method582(-46, "V-Brification des mises -9 jour )2 ");

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!oj", name = "O", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!oj", name = "P", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!oj", name = "S", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)I")
    public static final int method1907(int arg0, int arg1, int arg2) {
        if (arg2 > -19) {
            return -58;
        } else {
            ++field4945;
            int var3 = 0;
            while (~arg0 < -1) {
                var3 = arg1 & 1 | var3 << 1;
                arg1 >>>= 1;
                --arg0;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(BII)V")
    public static final void method1908(byte arg0, int arg1, int arg2) {
        int var3 = 121 % ((arg0 - 30) / 52);
        for (int var4 = 0; ~class275.field4857 < ~var4; ++var4) {
            class110 var5 = class95.method642(false, var4);
            if (var5 != null) {
                int var6 = var5.field1931;
                if (var6 >= 0 && !class247.field4292.method63(255, var6)) {
                    var6 = -1;
                }
                int var7;
                if (var5.field1915 < 0) {
                    if (~var6 > -1) {
                        if (var5.field1921 == -1) {
                            var7 = -1;
                        } else {
                            int var8 = var5.field1921;
                            int var9 = (var8 & 127) + arg1;
                            if (~var9 <= -1) {
                                if (~var9 < -128) {
                                    var9 = 127;
                                }
                            } else {
                                var9 = 0;
                            }
                            int var10 = (arg2 + var8 & 64512) + (896 & var8) - -var9;
                            var7 = class247.field4286[class4.method27(23024, 96, var10)];
                        }
                    } else {
                        var7 = class247.field4286[class4.method27(23024, 96, class247.field4292.method64(-74, var6))];
                    }
                } else {
                    int var11 = var5.field1915;
                    int var12 = (var11 & 127) + arg1;
                    if (~var12 <= -1) {
                        if (var12 > 127) {
                            var12 = 127;
                        }
                    } else {
                        var12 = 0;
                    }
                    int var13 = (64512 & arg2 + var11) + (var11 & 896) + var12;
                    var7 = class247.field4286[class4.method27(23024, 96, var13)];
                }
                class61.field1216[var4 + 1] = var7;
            }
        }
        ++field4951;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
    public class280() {
        super(1, true);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZILfl;)Loe;")
    public static final class108 method1909(boolean arg0, int arg1, class192 arg2) {
        ++field4947;
        if (!arg0) {
            method1908((byte) -87, 17, 59);
        }
        return !class53.method415(arg2, 11465, arg1) ? null : class75.method534(0);
    }

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "(I)V")
    public static void method1910(int arg0) {
        field4949 = null;
        if (arg0 <= -116) {
            field4950 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1911(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class2.field40 = arg1;
        class263.field4588 = arg2;
        class168.field3045 = arg3;
        class211.field3800 = new class137[arg0][class2.field40][class263.field4588];
        class83.field1557 = new int[arg0][class2.field40 + 1][class263.field4588 + 1];
        if (arg4) {
            class183.field3255 = new class137[1][class2.field40][class263.field4588];
            class96.field1692 = new int[class2.field40][class263.field4588];
            class141.field2619 = new int[1][class2.field40 + 1][class263.field4588 + 1];
        } else {
            class183.field3255 = null;
            class96.field1692 = null;
            class141.field2619 = null;
        }
        class198.method1367(false);
        class118.field2082 = new class201[500];
        class112.field1966 = 0;
        class233.field4111 = new class201[500];
        class65.field1262 = 0;
        class207.field3721 = new int[arg0][class2.field40 + 1][class263.field4588 + 1];
        class33.field817 = new class146[5000];
        class16.field454 = 0;
        class179.field3194 = new class146[100];
        class210.field3776 = new boolean[class168.field3045 + class168.field3045 + 1][class168.field3045 + class168.field3045 + 1];
        class174.field3116 = new boolean[class168.field3045 + class168.field3045 + 2][class168.field3045 + class168.field3045 + 2];
        class48.field1023 = new byte[arg0][class2.field40][class263.field4588];
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        ++field4948;
        if (arg0 != 8055) {
            field4949 = null;
        }
        int[] var3 = super.field1862.method458(arg1, false);
        if (super.field1862.field1236) {
            int[][] var4 = this.method702((byte) 94, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            for (int var8 = 0; ~var8 > ~class94.field1668; ++var8) {
                var3[var8] = (var5[var8] - -var7[var8] + var6[var8]) / 3;
            }
        }
        return var3;
    }
}
