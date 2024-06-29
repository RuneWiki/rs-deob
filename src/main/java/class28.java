import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class28 extends class112 {

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "[I")
    private int[] field499;

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "[I")
    private int[] field491;

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "Lgl;")
    private class273 field493;

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "Lgl;")
    private class273 field484;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "Lgl;")
    private class273 field485;

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "[Lgl;")
    private class273[] field486;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "[I")
    public static int[] field490 = new int[8];

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!mf", name = "L", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "Lsb;")
    public static class124 field487;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "Lsb;")
    public static class124 field489;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lkj;B)Lkj;")
    public static final class114 method244(class114 arg0, byte arg1) {
        field497++;
        if (arg0.field1910 != -1) {
            return class8.method43(arg0.field1910, (byte) 104);
        }
        int var2 = arg0.field1789 >>> 16;
        class92 var3 = new class92(class91.field1434);
        class167 var4 = (class167) var3.method701((byte) -108);
        if (arg1 > -118) {
            return null;
        }
        while (var4 != null) {
            if (var4.field2756 == var2) {
                return class8.method43((int) var4.field2406, (byte) 86);
            }
            var4 = (class167) var3.method700(-126);
        }
        return null;
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(B)V")
    public static void method245(byte arg0) {
        field487 = null;
        field490 = null;
        if (arg0 >= -45) {
            method254((class114) null, -48, 77, 113);
        }
        field489 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)Lel;")
    public static final class77 method246(int arg0, int arg1) {
        field496++;
        class77 var2 = (class77) class180.field2994.method1155((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class234.field3709.method900(class254.method1692(arg1, (byte) -96), class34.method288(arg1, 37), false);
        class77 var4 = new class77();
        var4.field1284 = arg1;
        if (var3 != null) {
            var4.method615(new class136(var3), true);
        }
        int var5 = 5 / ((24 - arg0) / 40);
        var4.method619((byte) -70);
        class180.field2994.method1161(var4, (byte) -108, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLsb;IZIIDLwi;)[I")
    public final int[] method247(boolean arg0, class124 arg1, int arg2, boolean arg3, int arg4, int arg5, double arg6, class231 arg7) {
        class94.method706((byte) -95, arg6);
        class10.field139 = arg1;
        class112.field1730 = arg7;
        if (arg2 != -256) {
            field489 = null;
        }
        class206.method1383(arg4, 103, arg5);
        field500++;
        int[] var10 = new int[arg4 * arg5];
        for (int var11 = 0; var11 < this.field486.length; var11++) {
            this.field486[var11].method1851(0, arg5, arg4);
        }
        byte var12;
        int var13;
        int var14;
        if (arg0) {
            var14 = -1;
            var13 = arg4 - 1;
            var12 = -1;
        } else {
            var12 = 1;
            var13 = 0;
            var14 = arg4;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg5; var16++) {
            if (arg3) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field484.field4358) {
                int[] var18 = this.field484.method4(false, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field484.method3(arg2 + 382, var16);
                var20 = var22[0];
                var21 = var22[2];
                var19 = var22[1];
            }
            for (int var23 = var13; var23 != var14; var23 += var12) {
                int var24 = var19[var23] >> 4;
                int var25 = var20[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var21[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                int var27 = class149.field2436[var26];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var28 = class149.field2436[var24];
                int var29 = class149.field2436[var25];
                var10[var15++] = (var28 << 8) + (var29 << 16) + var27;
                if (arg3) {
                    var15 += arg4 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field486.length; var17++) {
            this.field486[var17].method168((byte) 100);
        }
        return var10;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(DLwi;ZBLsb;II)Lwf;")
    public final class17 method248(double arg0, class231 arg1, boolean arg2, byte arg3, class124 arg4, int arg5, int arg6) {
        class94.method706((byte) -108, arg0);
        class10.field139 = arg4;
        field494++;
        class112.field1730 = arg1;
        class206.method1383(arg6, arg3 + 152, arg5);
        class17 var9 = new class17(arg6, arg5);
        if (arg3 != -49) {
            method245((byte) 47);
        }
        for (int var10 = 0; var10 < this.field486.length; var10++) {
            this.field486[var10].method1851(0, arg5, arg6);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            if (arg2) {
                var11 = var12;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field484.field4358) {
                int[] var14 = this.field484.method4(false, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field484.method3(124, var12);
                var16 = var18[2];
                var15 = var18[0];
                var17 = var18[1];
            }
            for (int var19 = 0; var19 != arg6; var19++) {
                int var20 = var15[var19] >> 4;
                int var21 = var17[var19] >> 4;
                int var22 = var16[var19] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = class149.field2436[var22];
                int var24 = class149.field2436[var21];
                int var25 = class149.field2436[var20];
                var9.field244[var11++] = (var25 << 16) + (var24 << 8) + var23;
                if (arg2) {
                    var11 += arg6 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field486.length; var13++) {
            this.field486[var13].method168((byte) -61);
        }
        return var9;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)V")
    public static final void method249(int arg0, byte arg1) {
        field483++;
        if (arg1 != 96) {
            field490 = null;
        }
        class184.field3031.method1163(arg0, false);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILoh;IIII)Z")
    public static final boolean method250(int arg0, int arg1, class248 arg2, int arg3, int arg4, int arg5, int arg6) {
        class6 var7 = class33.method284(34, arg2.field3903);
        field488++;
        if (var7.field77 == -1) {
            return true;
        }
        int var9;
        if (arg2.field3910) {
            int var8 = arg2.field3933 + arg3;
            var9 = var8 & 0x3;
        } else {
            var9 = 0;
        }
        class74 var10 = var7.method29(var9, arg2.field3891, (byte) 88);
        if (var10 == null) {
            return false;
        }
        int var11 = arg2.field3947;
        int var12 = arg2.field3960;
        if ((var9 & 0x1) == 1) {
            var11 = arg2.field3960;
            var12 = arg2.field3947;
        }
        int var13 = var10.field2444;
        if (arg1 < 58) {
            return true;
        }
        int var14 = var10.field2439;
        if (var7.field78) {
            var13 = var12 * 4;
            var14 = var11 * 4;
        }
        if (var7.field76 == 0) {
            var10.method592(arg0 * 4 + 48, 48 - -((-arg6 + 104 + -var12) * 4), var14, var13);
        } else {
            var10.method593(arg0 * 4 + 48, (-arg6 + 104 - var12) * 4 + 48, var14, var13, var7.field76);
        }
        return true;
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(B)V")
    public static final void method251(byte arg0) {
        field498++;
        if (arg0 == 113 && !class47.field869 && class197.field3225 != 2) {
            try {
                class120.method877(class208.field3344, 25718, "tbrefresh");
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lsb;BLwi;)Z")
    public final boolean method252(class124 arg0, byte arg1, class231 arg2) {
        if (arg1 != 88) {
            return true;
        }
        field495++;
        if (class36.field620 > 0) {
            for (int var4 = 0; var4 < this.field499.length; var4++) {
                if (!arg0.method912(false, this.field499[var4], class36.field620)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field499.length; var5++) {
                if (!arg0.method899(this.field499[var5], arg1 - 193)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field491.length; var6++) {
            if (!arg2.method8(arg1 ^ 0xFFFFD55A, this.field491[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(DZLsb;ILwi;II)Lbj;")
    public final class202 method253(double arg0, boolean arg1, class124 arg2, int arg3, class231 arg4, int arg5, int arg6) {
        class94.method706((byte) -91, arg0);
        class10.field139 = arg2;
        field501++;
        class112.field1730 = arg4;
        class206.method1383(arg5, 103, arg3);
        class202 var9 = new class202(arg5, arg3);
        for (int var10 = 0; var10 < this.field486.length; var10++) {
            this.field486[var10].method1851(0, arg3, arg5);
        }
        if (arg6 < 75) {
            method255((byte) -115, (String) null);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            if (arg1) {
                var11 = var12 << 2;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field484.field4358) {
                int[] var14 = this.field484.method4(false, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field484.method3(124, var12);
                var15 = var18[0];
                var17 = var18[2];
                var16 = var18[1];
            }
            int[] var19;
            if (this.field485.field4358) {
                var19 = this.field485.method4(false, var12);
            } else {
                var19 = this.field485.method3(125, var12)[0];
            }
            for (int var20 = arg5 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                int var22 = var16[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = class149.field2436[var21];
                int var24 = var17[var20] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class149.field2436[var22];
                int var26 = class149.field2436[var24];
                int var27;
                if (var23 == 0 && var25 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var9.field244[var11++] = (var23 << 16) + (var25 << 8) + (var27 << 24) + var26;
                if (arg1) {
                    var11 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var13 = 0; var13 < this.field486.length; var13++) {
            this.field486[var13].method168((byte) 98);
        }
        return var9;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lkj;III)V")
    public static final void method254(class114 arg0, int arg1, int arg2, int arg3) {
        field482++;
        if (class42.field776 < 2 && class219.field3514 == 0 && !class239.field3761 || arg1 >= -24) {
            return;
        }
        String var4 = class271.method1843(11673);
        if (arg0 == null) {
            int var6 = class23.field362.method571(var4, arg2 + 4, arg3 + 15, 16777215, 0, class258.field4107, class58.field1008);
            class3.method19((byte) 90, class23.field362.method579(var4) + var6, arg3, 15, arg2 + 4);
            return;
        }
        class73 var5 = arg0.method843(123, class101.field1550);
        if (var5 == null) {
            var5 = class23.field362;
        }
        var5.method576(var4, arg2, arg3, arg0.field1790, arg0.field1919, arg0.field1843, arg0.field1815, arg0.field1905, arg0.field1904, class258.field4107, class58.field1008, class111.field1717);
        class3.method19((byte) 88, class111.field1717[2], class111.field1717[1], class111.field1717[3], class111.field1717[0]);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method255(byte arg0, String arg1) {
        field492++;
        class241.field3801 = arg1;
        if (class205.field3294.field1291 == null) {
            return;
        }
        try {
            if (arg0 == -1) {
                String var2 = class205.field3294.field1291.getParameter("cookieprefix");
                String var3 = class205.field3294.field1291.getParameter("cookiehost");
                String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
                String var5;
                if (arg1.length() == 0) {
                    var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var4 + "; Expires=" + class266.method1816(31129, class62.method472(53) + 94608000000L) + "; Max-Age=" + 94608000L;
                }
                class120.method878(class205.field3294.field1291, "document.cookie=\"" + var5 + "\"", (byte) -120);
            }
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
    public class28() {
        this.field499 = new int[0];
        this.field491 = new int[0];
        this.field493 = new class46(0);
        this.field493.field4363 = 1;
        this.field484 = new class46();
        this.field484.field4363 = 1;
        this.field485 = new class46();
        this.field485.field4363 = 1;
        this.field486 = new class273[] { this.field484, this.field485, this.field493 };
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lig;)V")
    public class28(class136 arg0) {
        int var2 = arg0.method1012(4);
        this.field486 = new class273[var2];
        int var3 = 0;
        int[][] var4 = new int[var2][];
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class273 var16 = class211.method1404(arg0, 0);
            if (var16.method1620(124) >= 0) {
                var3++;
            }
            if (var16.method165(1) >= 0) {
                var5++;
            }
            int var17 = var16.field4355.length;
            var4[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var4[var6][var18] = arg0.method1012(4);
            }
            this.field486[var6] = var16;
        }
        this.field499 = new int[var3];
        int var7 = 0;
        this.field491 = new int[var5];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class273 var11 = this.field486[var9];
            int var12 = var11.field4355.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4355[var13] = this.field486[var4[var9][var13]];
            }
            int var14 = var11.method1620(125);
            int var15 = var11.method165(1);
            if (var14 > 0) {
                this.field499[var7++] = var14;
            }
            if (var15 > 0) {
                this.field491[var8++] = var15;
            }
            var4[var9] = null;
        }
        Object var10 = null;
        this.field484 = this.field486[arg0.method1012(4)];
        this.field485 = this.field486[arg0.method1012(4)];
        this.field493 = this.field486[arg0.method1012(4)];
    }
}
