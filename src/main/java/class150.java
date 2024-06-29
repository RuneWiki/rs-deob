import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class150 extends class49 {

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "Laa;")
    public class2 field3721 = new class2();

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "Lge;")
    public class47 field3734 = new class47();

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "Lc;")
    private class15 field3733;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "[I")
    public static int[] field3713 = new int[4000];

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    public static int field3715 = -1;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "Lfc;")
    public static class39 field3710 = class90.method774("(Z", -104);

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "Lfc;")
    private static class39 field3717 = class90.method774("Loaded textures", -94);

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "Lfc;")
    public static class39 field3728 = class90.method774("::gc", -106);

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "Lfc;")
    public static class39 field3729 = class90.method774("Mem:", -107);

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "Lfc;")
    public static class39 field3718 = field3717;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "Lfc;")
    public static class39 field3731 = class90.method774("Update)2Liste geladen)3", -120);

    @OriginalMember(owner = "client!wb", name = "ab", descriptor = "Lfc;")
    public static class39 field3735 = class90.method774("Handel)4Duell", -105);

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "Leb;")
    public static class31 field3716;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([III)V", line = 3)
    public final void method193(int[] arg0, int arg1, int arg2) {
        this.field3734.method193(arg0, arg1, arg2);
        field3726++;
        for (class53 var4 = (class53) this.field3721.method8(-1); var4 != null; var4 = (class53) this.field3721.method9(1)) {
            if (!this.field3733.method169(var4, (byte) -111)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field1315) {
                        this.method1193(var4, var5 + var6, (byte) -114, var6, var5, arg0);
                        var4.field1315 -= var5;
                        break;
                    }
                    this.method1193(var4, var6 + var5, (byte) -114, var6, var4.field1315, arg0);
                    var6 += var4.field1315;
                    var5 -= var4.field1315;
                } while (!this.field3733.method196(-109, var4, arg0, var5, var6));
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "()I", line = 42)
    public final int method164() {
        field3727++;
        return 0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lhd;IBII[I)V", line = 53)
    private final void method1193(class53 arg0, int arg1, byte arg2, int arg3, int arg4, int[] arg5) {
        field3724++;
        if ((this.field3733.field389[arg0.field1321] & 0x4) != 0 && arg0.field1329 < 0) {
            int var7 = this.field3733.field385[arg0.field1321] / class93.field2181;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field1306) / var7;
                if (arg4 < var8) {
                    arg0.field1306 += arg4 * var7;
                    break;
                }
                arg4 -= var8;
                arg0.field1339.method193(arg5, arg3, var8);
                arg3 += var8;
                arg0.field1306 += var7 * var8 - 1048576;
                int var9 = class93.field2181 / 100;
                class102 var10 = arg0.field1339;
                int var11 = 262144 / var7;
                if (var9 > var11) {
                    var9 = var11;
                }
                if (this.field3733.field375[arg0.field1321] == 0) {
                    arg0.field1339 = class102.method885(arg0.field1311, var10.method881(), var10.method894(), var10.method883());
                } else {
                    arg0.field1339 = class102.method885(arg0.field1311, var10.method881(), 0, var10.method883());
                    this.field3733.method170(arg0, arg0.field1309.field3376[arg0.field1327] < 0, -127);
                    arg0.field1339.method888(var9, var10.method894());
                }
                if (arg0.field1309.field3376[arg0.field1327] < 0) {
                    arg0.field1339.method877(-1);
                }
                var10.method886(var9);
                var10.method193(arg5, arg3, arg1 - arg3);
                if (var10.method901()) {
                    this.field3734.method536(var10);
                }
            }
        }
        if (arg2 != -114) {
            field3735 = null;
        }
        arg0.field1339.method193(arg5, arg3, arg4);
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "()Lh;", line = 115)
    public final class49 method171() {
        field3730++;
        class53 var1;
        do {
            var1 = (class53) this.field3721.method9(1);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1339 == null);
        return var1.field1339;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)V", line = 135)
    public static final void method1194(byte arg0) {
        field3712++;
        if (class60.field1477 != 0 || class100.field2504 != null) {
            return;
        }
        if (arg0 != 71) {
            method1194((byte) -8);
        }
        int var1 = class13.field343;
        if (class97.field2313 && class34.field889 >= 516 && class26.field758 >= 160 && class34.field889 <= 765 && class26.field758 <= 205) {
            var1 = 0;
        }
        if (!class94.field2206) {
            if (var1 == 1 && class126.field3207 > 0) {
                int var2 = class109.field2805[class126.field3207 - 1];
                if (var2 == 18 || var2 == 47 || var2 == 38 || var2 == 40 || var2 == 44 || var2 == 51 || var2 == 41 || var2 == 22 || var2 == 25 || var2 == 42 || var2 == 32 || var2 == 1006) {
                    int var3 = class99.field2439[class126.field3207 - 1];
                    int var4 = class54.field1340[class126.field3207 - 1];
                    class99 var5 = class54.method567(arg0 ^ 0x32, var4);
                    if (class3.method27((byte) -72, class89.method768(var5, -82)) || class50.method551(class89.method768(var5, -93), -15)) {
                        class34.field892 = false;
                        class136.field3417 = var3;
                        class3.field72 = 0;
                        class60.field1477 = 2;
                        if (var4 >> 16 == class126.field3198) {
                            class60.field1477 = 1;
                        }
                        if (var4 >> 16 == class37.field1008) {
                            class60.field1477 = 3;
                        }
                        class12.field326 = class34.field889;
                        class107.field2672 = var4;
                        class118.field3091 = class26.field758;
                        return;
                    }
                }
            }
            if (var1 == 1 && (class90.field2137 == 1 || class101.method862(class126.field3207 - 1, 8192)) && class126.field3207 > 2) {
                var1 = 2;
            }
            if (var1 == 1 && class126.field3207 > 0) {
                class90.method777(class126.field3207 - 1, -128);
            }
            if (var1 == 2 && class126.field3207 > 0) {
                class70.method653(true);
                return;
            }
            return;
        }
        if (var1 != 1) {
            int var6 = class131.field3322;
            int var7 = class12.field314;
            if (class50.field1258 == 0) {
                var6 -= 4;
                var7 -= 4;
            }
            if (class50.field1258 == 1) {
                var6 -= 205;
                var7 -= 553;
            }
            if (class50.field1258 == 2) {
                var6 -= 357;
                var7 -= 17;
            }
            if (class44.field1197 - 10 > var7 || class44.field1197 + class146.field3638 + 10 < var7 || var6 < class93.field2171 - 10 || class93.field2171 + class116.field3037 + 10 < var6) {
                if (class50.field1258 == 1) {
                    class104.field2638 = true;
                }
                class94.field2206 = false;
                if (class50.field1258 == 2) {
                    class128.field3242 = true;
                }
            }
        }
        if (var1 != 1) {
            return;
        }
        int var8 = class44.field1197;
        int var9 = class93.field2171;
        int var10 = class146.field3638;
        int var11 = class26.field758;
        int var12 = -1;
        int var13 = class34.field889;
        if (class50.field1258 == 0) {
            var13 -= 4;
            var11 -= 4;
        }
        if (class50.field1258 == 1) {
            var13 -= 553;
            var11 -= 205;
        }
        if (class50.field1258 == 2) {
            var11 -= 357;
            var13 -= 17;
        }
        for (int var14 = 0; var14 < class126.field3207; var14++) {
            int var15 = (class126.field3207 - var14 - 1) * 15 + var9 + 31;
            if (var8 < var13 && var13 < var8 + var10 && var11 > var15 - 13 && var11 < var15 + 3) {
                var12 = var14;
            }
        }
        if (var12 != -1) {
            class90.method777(var12, -16);
        }
        if (class50.field1258 == 2) {
            class128.field3242 = true;
        }
        if (class50.field1258 == 1) {
            class104.field2638 = true;
        }
        class94.field2206 = false;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(B)V", line = 328)
    public static void method1195(byte arg0) {
        if (arg0 < 45) {
            return;
        }
        field3735 = null;
        field3710 = null;
        field3718 = null;
        field3713 = null;
        field3731 = null;
        field3716 = null;
        field3717 = null;
        field3729 = null;
        field3728 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILhd;)V", line = 357)
    private final void method1196(int arg0, int arg1, class53 arg2) {
        field3720++;
        if (~(this.field3733.field389[arg2.field1321] & 0x4) != arg1 && arg2.field1329 < 0) {
            int var4 = this.field3733.field385[arg2.field1321] / class93.field2181;
            int var5 = (var4 + 1048575 - arg2.field1306) / var4;
            arg2.field1306 = arg0 * var4 + arg2.field1306 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field3733.field375[arg2.field1321] == 0) {
                    arg2.field1339 = class102.method885(arg2.field1311, arg2.field1339.method881(), arg2.field1339.method894(), arg2.field1339.method883());
                } else {
                    arg2.field1339 = class102.method885(arg2.field1311, arg2.field1339.method881(), 0, arg2.field1339.method883());
                    this.field3733.method170(arg2, arg2.field1309.field3376[arg2.field1327] < 0, -122);
                }
                if (arg2.field1309.field3376[arg2.field1327] < 0) {
                    arg2.field1339.method877(-1);
                }
                arg0 = arg2.field1306 / var4;
            }
        }
        arg2.field1339.method163(arg0);
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V", line = 401)
    public final void method163(int arg0) {
        field3723++;
        this.field3734.method163(arg0);
        for (class53 var2 = (class53) this.field3721.method8(-1); var2 != null; var2 = (class53) this.field3721.method9(1)) {
            if (!this.field3733.method169(var2, (byte) -111)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1315) {
                        this.method1196(var3, -1, var2);
                        var2.field1315 -= var3;
                        break;
                    }
                    this.method1196(var2.field1315, -1, var2);
                    var3 -= var2.field1315;
                } while (!this.field3733.method196(-113, var2, null, var3, 0));
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLq;)V", line = 445)
    public static final void method1197(byte arg0, class111 arg1) {
        if (class70.field1654 == arg1.field2880 || arg1.field2888 == -1 || arg1.field2911 != 0 || arg1.field2885 + 1 > class38.method430(arg0 + 2196, arg1.field2888).field3035[arg1.field2886]) {
            int var2 = arg1.field2880 - arg1.field2904;
            int var3 = arg1.field2918 * 64 + arg1.field2874 * 128;
            int var4 = class70.field1654 - arg1.field2904;
            int var5 = arg1.field2918 * 64 + arg1.field2894 * 128;
            int var6 = arg1.field2918 * 64 + arg1.field2862 * 128;
            int var7 = arg1.field2910 * 128 + arg1.field2918 * 64;
            arg1.field2916 = ((var2 - var4) * var3 + var4 * var5) / var2;
            arg1.field2909 = ((var2 - var4) * var6 + var4 * var7) / var2;
        }
        arg1.field2872 = 0;
        field3725++;
        if (arg1.field2922 == 0) {
            arg1.field2887 = 1024;
        }
        if (arg1.field2922 == 1) {
            arg1.field2887 = 1536;
        }
        if (arg0 != 42) {
            field3735 = null;
        }
        if (arg1.field2922 == 2) {
            arg1.field2887 = 0;
        }
        if (arg1.field2922 == 3) {
            arg1.field2887 = 512;
        }
        arg1.field2900 = arg1.field2887;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()Lh;", line = 490)
    public final class49 method159() {
        field3722++;
        class53 var1 = (class53) this.field3721.method8(-1);
        if (var1 == null) {
            return null;
        } else if (var1.field1339 == null) {
            return this.method171();
        } else {
            return var1.field1339;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)V", line = 508)
    public static final void method1198(int arg0, byte arg1) {
        int[] var2 = class70.field1638.field240;
        field3719++;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        int var5 = 1;
        if (arg1 != 6) {
            return;
        }
        while (var5 < 103) {
            int var20 = (103 - var5) * 512 * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class137.field3424[arg0][var21][var5] & 0x18) == 0) {
                    class139.field3503.method70(var2, var20, 512, arg0, var21, var5);
                }
                if (arg0 < 3 && (class137.field3424[arg0 + 1][var21][var5] & 0x8) != 0) {
                    class139.field3503.method70(var2, var20, 512, arg0 + 1, var21, var5);
                }
                var20 += 4;
            }
            var5++;
        }
        class70.field1638.method110();
        int var6 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 + -10 << 8) + 238 - 10;
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class137.field3424[arg0][var19][var8] & 0x18) == 0) {
                    class54.method566(var6, var8, var19, arg1 + 10444, var7, arg0);
                }
                if (arg0 < 3 && (class137.field3424[arg0 + 1][var19][var8] & 0x8) != 0) {
                    class54.method566(var6, var8, var19, 10450, var7, arg0 + 1);
                }
            }
        }
        class27.field762 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class139.field3503.method76(class24.field661, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class90.method776(var12, arg1 - 123).field910;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class117.field3077[class24.field661].field2526;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var9 - 3 < var14 && (var16[var14 - 1][var15] & 0x12C0108) == 0) {
                                    var14--;
                                }
                                if (var18 == 1 && var14 < 103 && var9 + 3 > var14 && (var16[var14 + 1][var15] & 0x12C0180) == 0) {
                                    var14++;
                                }
                                if (var18 == 2 && var15 > 0 && var10 - 3 < var15 && (var16[var14][var15 - 1] & 0x12C0102) == 0) {
                                    var15--;
                                }
                                if (var18 == 3 && var15 < 103 && var10 + 3 > var15 && (var16[var14][var15 + 1] & 0x12C0120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        class10.field296[class27.field762] = class24.field648[var13];
                        class10.field289[class27.field762] = var14;
                        class120.field3150[class27.field762] = var15;
                        class27.field762++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lc;)V", line = 682)
    public class150(class15 arg0) {
        this.field3733 = arg0;
    }
}
