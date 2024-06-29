import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class134 extends class16 {

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "[I")
    public int[] field3024 = new int[5];

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "[Lmf;")
    public class89[] field3029 = new class89[5];

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
    public int field3018 = 0;

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "I")
    public int field3031;

    @OriginalMember(owner = "client!tb", name = "fb", descriptor = "I")
    public int field3035;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    public int field3017;

    @OriginalMember(owner = "client!tb", name = "pb", descriptor = "I")
    public int field3045;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "Lje;")
    private static class67 field3009 = class85.method592(255, "Examine");

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "[I")
    public static int[] field3011 = new int[25];

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "Z")
    public static boolean field3016 = false;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
    public static int field3027 = 0;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "Lje;")
    public static class67 field3010 = field3009;

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "Lje;")
    private static class67 field3030 = class85.method592(255, "wishes to trade with you)3");

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "Lje;")
    public static class67 field3008 = field3030;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "Lje;")
    private static class67 field3006 = class85.method592(255, "white:");

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "Lje;")
    public static class67 field3015 = field3006;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "Lje;")
    public static class67 field3007 = field3006;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "Lje;")
    public static class67 field3021 = class85.method592(255, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
    public int field3025;

    @OriginalMember(owner = "client!tb", name = "eb", descriptor = "I")
    public int field3034;

    @OriginalMember(owner = "client!tb", name = "gb", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!tb", name = "jb", descriptor = "I")
    public int field3039;

    @OriginalMember(owner = "client!tb", name = "kb", descriptor = "I")
    public int field3040;

    @OriginalMember(owner = "client!tb", name = "lb", descriptor = "I")
    public int field3041;

    @OriginalMember(owner = "client!tb", name = "nb", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!tb", name = "qb", descriptor = "I")
    public int field3046;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "Lbd;")
    public class12 field3023;

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "Ltb;")
    public class134 field3028;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "Lvc;")
    public class149 field3020;

    @OriginalMember(owner = "client!tb", name = "hb", descriptor = "Lcb;")
    public class17 field3037;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "Lfe;")
    public class41 field3026;

    @OriginalMember(owner = "client!tb", name = "ob", descriptor = "Lhb;")
    public static class51 field3044;

    @OriginalMember(owner = "client!tb", name = "mb", descriptor = "Ljc;")
    public class65 field3042;

    @OriginalMember(owner = "client!tb", name = "ib", descriptor = "Lmd;")
    public class87 field3038;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "Z")
    public boolean field3022;

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "Z")
    public boolean field3032;

    @OriginalMember(owner = "client!tb", name = "db", descriptor = "Z")
    public boolean field3033;

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(III)V")
    public class134(int arg0, int arg1, int arg2) {
        this.field3031 = arg2;
        this.field3035 = arg1;
        this.field3045 = this.field3017 = arg0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBI)I")
    public static final int method1016(int arg0, byte arg1, int arg2) {
        field3014++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 / 128;
            if (arg1 != 85) {
                method1017(false);
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
    public static void method1017(boolean arg0) {
        field3006 = null;
        field3044 = null;
        field3008 = null;
        if (!arg0) {
            method1022(-73, (byte) -74, -108);
        }
        field3015 = null;
        field3010 = null;
        field3007 = null;
        field3011 = null;
        field3021 = null;
        field3030 = null;
        field3009 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)V")
    public static final void method1018(boolean arg0, int arg1) {
        field3005++;
        if (class15.field266 == null) {
            return;
        }
        try {
            class91 var2 = new class91(4);
            var2.method653(arg0 ? 2 : 3, 76);
            if (arg1 <= 66) {
                method1021((byte) 57);
            }
            var2.method647(0, (byte) 108);
            class15.field266.method842(var2.field1991, 4, 97, 0);
        } catch (IOException var4) {
            try {
                class15.field266.method847(123);
            } catch (Exception var3) {
            }
            class15.field266 = null;
            class19.field367++;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Loe;ZLoe;)V")
    public static final void method1019(class102 arg0, boolean arg1, class102 arg2) {
        field3019++;
        if (class75.field1620) {
            class93.method682(115, arg0, arg2);
            return;
        }
        if (class128.field2823 == 0 || class128.field2823 == 5) {
            byte var3 = 20;
            arg0.method791(class117.field2646, 382, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class8.method68(230, var4, 304, 34, 9179409);
            class8.method68(231, var4 + 1, 302, 32, 0);
            class8.method70(232, var4 + 2, class93.field2100 * 3, 30, 9179409);
            class8.method70(class93.field2100 * 3 + 232, var4 + 2, 300 - class93.field2100 * 3, 30, 0);
            arg0.method791(class106.field2425, 382, 276 - var3, 16777215, -1);
        }
        if (class128.field2823 == 20) {
            class103.field2337.method531(382 - class103.field2337.field1592 / 2, 271 - class103.field2337.field1590 / 2);
            short var5 = 211;
            arg0.method791(class106.field2423, 382, var5, 16776960, 0);
            int var23 = var5 + 15;
            arg0.method791(class106.field2414, 382, var23, 16776960, 0);
            int var24 = var23 + 15;
            arg0.method791(class106.field2412, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg0.method793(class49.method314(new class67[] { class69.field1398, class100.method785(class106.field2413) }, 0), 272, var26, 16777215, 0);
            int var27 = var26 + 15;
            arg0.method793(class49.method314(new class67[] { class77.field1643, class106.field2416.method457(-57) }, 0), 274, var27, 16777215, 0);
            int var28 = var27 + 15;
        }
        if (class128.field2823 == 10) {
            class103.field2337.method531(202, 171);
            if (class142.field3265 == 0) {
                short var6 = 302;
                short var7 = 251;
                short var8 = 291;
                arg0.method791(class2.field18, 382, var7, 16776960, 0);
                int var29 = var7 + 30;
                class105.field2391.method531(var6 - 73, var8 - 20);
                arg0.method786(class69.field1417, var6 - 73, var8 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                short var9 = 462;
                class105.field2391.method531(var9 - 73, var8 + -20);
                arg0.method786(class15.field267, var9 - 73, var8 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class142.field3265 == 2) {
                short var13 = 321;
                short var14 = 211;
                short var15 = 302;
                arg0.method791(class106.field2423, 382, var14, 16776960, 0);
                int var34 = var14 + 15;
                arg0.method791(class106.field2414, 382, var34, 16776960, 0);
                int var35 = var34 + 15;
                arg0.method791(class106.field2412, 382, var35, 16776960, 0);
                int var36 = var35 + 15;
                int var37 = var36 + 10;
                arg0.method793(class49.method314(new class67[] { class69.field1398, class100.method785(class106.field2413), class34.field627 % 40 < 20 & class135.field3065 == 0 ? class126.field2770 : class106.field2422 }, 0), 272, var37, 16777215, 0);
                int var38 = var37 + 15;
                arg0.method793(class49.method314(new class67[] { class77.field1643, class106.field2416.method457(-52), class135.field3065 == 1 & class34.field627 % 40 < 20 ? class126.field2770 : class106.field2422 }, 0), 274, var38, 16777215, 0);
                class105.field2391.method531(var15 - 73, var13 + -20);
                arg0.method791(client.field392, var15, var13 + 5, 16777215, 0);
                short var16 = 462;
                int var39 = var38 + 15;
                class105.field2391.method531(var16 - 73, var13 + -20);
                arg0.method791(class75.field1626, var16, var13 + 5, 16777215, 0);
            } else if (class142.field3265 == 3) {
                arg0.method791(class9.field181, 382, 211, 16776960, 0);
                short var10 = 236;
                short var11 = 382;
                arg0.method791(class9.field212, 382, var10, 16777215, 0);
                short var12 = 321;
                int var30 = var10 + 15;
                arg0.method791(class99.field2213, 382, var30, 16777215, 0);
                int var31 = var30 + 15;
                arg0.method791(class40.field718, 382, var31, 16777215, 0);
                int var32 = var31 + 15;
                arg0.method791(class103.field2297, 382, var32, 16777215, 0);
                class105.field2391.method531(var11 - 73, var12 + -20);
                int var33 = var32 + 15;
                arg0.method791(class75.field1626, var11, var12 + 5, 16777215, 0);
            }
        }
        if (class30.field532 != 1) {
            if (class123.field2741 > 0) {
                class50.method320(class123.field2741, (byte) 91);
                class123.field2741 = 0;
            }
            class56.method395(!arg1);
        }
        class103.field2333[field3016 ? 1 : 0].method531(725, 463);
        if (class128.field2823 > 5 && class3.field44 != 2 && class23.field415 == 0) {
            if (class66.field1281 == null) {
                class66.field1281 = class58.method404(class106.field2422, (byte) 36, class30.field525, class14.field255);
            } else {
                byte var17 = 5;
                short var18 = 463;
                class66.field1281.method531(var17, var18);
                byte var19 = 100;
                byte var20 = 35;
                arg0.method791(class49.method314(new class67[] { class35.field654, class142.field3268, class60.method420(class19.field366, 28498) }, 0), var17 + var19 / 2, var20 / 2 + var18 + -2, 16777215, 0);
                if (class85.field1876 == null) {
                    arg2.method791(class80.field1780, var17 + var19 / 2, var20 / 2 + var18 + 12, 16777215, 0);
                } else {
                    arg2.method791(class47.field866, var19 / 2 + var17, var18 - -(var20 / 2) + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var21 = class98.field2193.getGraphics();
            class81.field1792.method102(arg1, 0, var21, 0);
        } catch (Exception var22) {
            class98.field2193.repaint();
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLfd;Lfd;)I")
    public static final int method1020(byte arg0, class40 arg1, class40 arg2) {
        field3036++;
        int var3 = 0;
        if (arg1.method256(class106.field2422, true, class67.field1322)) {
            var3++;
        }
        if (arg0 != -7) {
            method1020((byte) -35, null, null);
        }
        if (arg2.method256(class106.field2422, true, class19.field370)) {
            var3++;
        }
        if (arg2.method256(class106.field2422, true, class148.field3392)) {
            var3++;
        }
        if (arg2.method256(class106.field2422, true, class147.field3371)) {
            var3++;
        }
        if (arg2.method256(class106.field2422, true, class143.field3284)) {
            var3++;
        }
        if (arg2.method256(class106.field2422, true, class99.field2197)) {
            var3++;
        }
        arg2.method256(class106.field2422, true, class29.field519);
        arg2.method256(class106.field2422, true, class86.field1912);
        arg2.method256(class106.field2422, true, class135.field3047);
        arg2.method256(class106.field2422, true, class145.field3341);
        arg2.method256(class106.field2422, true, class30.field525);
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
    public static final void method1021(byte arg0) {
        class9.field196.method284(false);
        field3013++;
        int var1 = class9.field196.method283(8, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class9.field196.method283(8, 2);
        if (var2 == 0) {
            class89.field1961[class71.field1442++] = 2047;
        } else if (var2 == 1) {
            int var3 = class9.field196.method283(8, 3);
            class37.field667.method1010(false, (byte) 54, var3);
            int var4 = class9.field196.method283(8, 1);
            if (var4 == 1) {
                class89.field1961[class71.field1442++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class9.field196.method283(8, 3);
            class37.field667.method1010(true, (byte) 117, var5);
            int var6 = class9.field196.method283(8, 3);
            class37.field667.method1010(true, (byte) 122, var6);
            int var7 = class9.field196.method283(8, 1);
            if (var7 == 1) {
                class89.field1961[class71.field1442++] = 2047;
            }
        } else {
            int var8 = -82 % ((arg0 + 64) / 37);
            if (var2 == 3) {
                int var9 = class9.field196.method283(8, 7);
                int var10 = class9.field196.method283(8, 7);
                class128.field2817 = class9.field196.method283(8, 2);
                int var11 = class9.field196.method283(8, 1);
                int var12 = class9.field196.method283(8, 1);
                if (var12 == 1) {
                    class89.field1961[class71.field1442++] = 2047;
                }
                class37.field667.method1013(var11 == 1, var10, var9, -9);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(IBI)I")
    public static final int method1022(int arg0, byte arg1, int arg2) {
        if (arg1 != -49) {
            field3011 = null;
        }
        field3012++;
        int var3 = 0;
        while (arg2 > 0) {
            var3 = var3 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
            arg2--;
        }
        return var3;
    }
}
