import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class176 extends class209 {

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "[I")
    private int[] field2721;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "[I")
    private int[] field2712;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "Lgl;")
    private class223 field2707;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "Lgl;")
    private class223 field2710;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "Lgl;")
    private class223 field2717;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "[Lgl;")
    private class223[] field2711;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "I")
    public static int field2716 = 0;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "Lud;")
    public static class2 field2708 = new class2();

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "Ltc;")
    public static class186 field2718 = new class186();

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "[I")
    public static int[] field2722 = new int[128];

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "[Lel;")
    public static class213[] field2723;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BZ)V")
    public static final void method1254(byte arg0, boolean arg1) {
        class298.field4807 = 0;
        class156.field2323 = null;
        class86.field1277 = null;
        class116.field1773 = null;
        class300.field4820 = null;
        class36.field622 = null;
        if (arg1 && class92.field1467 != null) {
            class112.field1721 = class92.field1467.field4861;
        } else {
            class112.field1721 = -1;
        }
        class197.field3076 = null;
        class276.field4396 = null;
        class131.field1949 = null;
        class92.field1467 = null;
        class127.field1905 = null;
        class45.field764 = null;
        field2709++;
        field2708.method9(120);
        class279.field4423 = null;
        class295.field4622 = null;
        class35.field612 = null;
        class35.field613 = null;
        class142.field2115 = null;
        class112.field1724 = null;
        class49.field804 = null;
        class298.field4808 = null;
        class232.field3674 = -1;
        class23.field409 = null;
        class254.field4063 = -1;
        class183.field2895 = null;
        if (arg0 != 86) {
            field2723 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIZDIZLub;Lqh;)[I")
    public final int[] method1255(int arg0, int arg1, boolean arg2, double arg3, int arg4, boolean arg5, class92 arg6, class212 arg7) {
        class59.method486((byte) 114, arg3);
        field2720++;
        int[] var10 = new int[arg0 * arg4];
        class9.field155 = arg7;
        class2.field23 = arg6;
        class18.method136(arg1 ^ 0xFFFFA788, arg4, arg0);
        for (int var11 = 0; var11 < this.field2711.length; var11++) {
            this.field2711[var11].method1536(arg4, 255, arg0);
        }
        int var12;
        int var13;
        byte var14;
        if (arg5) {
            var12 = -1;
            var13 = arg4 - 1;
            var14 = -1;
        } else {
            var12 = arg4;
            var14 = 1;
            var13 = 0;
        }
        int var15 = 0;
        if (arg1 != -22647) {
            field2708 = null;
        }
        for (int var16 = 0; var16 < arg0; var16++) {
            if (arg2) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field2710.field3583) {
                int[] var22 = this.field2710.method40((byte) 82, var16);
                var21 = var22;
                var20 = var22;
                var19 = var22;
            } else {
                int[][] var18 = this.field2710.method135(29, var16);
                var19 = var18[1];
                var20 = var18[2];
                var21 = var18[0];
            }
            for (int var23 = var13; var23 != var12; var23 += var14) {
                int var24 = var19[var23] >> 4;
                int var25 = var21[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = var20[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var27 = class40.field675[var26];
                int var28 = class40.field675[var25];
                int var29 = class40.field675[var24];
                var10[var15++] = (var28 << 16) + (var29 << 8) + var27;
                if (arg2) {
                    var15 += arg4 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field2711.length; var17++) {
            this.field2711[var17].method409(112);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lqh;ZLub;IDZI)Ljc;")
    public final class256 method1256(class212 arg0, boolean arg1, class92 arg2, int arg3, double arg4, boolean arg5, int arg6) {
        class59.method486((byte) 124, arg4);
        class2.field23 = arg2;
        field2714++;
        class9.field155 = arg0;
        class18.method136(1, arg6, arg3);
        class256 var9 = new class256(arg6, arg3);
        for (int var10 = 0; var10 < this.field2711.length; var10++) {
            this.field2711[var10].method1536(arg6, 255, arg3);
        }
        if (arg1) {
            this.method1260(-48, (class92) null, (class212) null);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            if (arg5) {
                var11 = var12 << 2;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field2710.field3583) {
                int[] var18 = this.field2710.method40((byte) 122, var12);
                var17 = var18;
                var15 = var18;
                var16 = var18;
            } else {
                int[][] var14 = this.field2710.method135(12, var12);
                var15 = var14[0];
                var16 = var14[1];
                var17 = var14[2];
            }
            int[] var19;
            if (this.field2717.field3583) {
                var19 = this.field2717.method40((byte) 43, var12);
            } else {
                var19 = this.field2717.method135(24, var12)[0];
            }
            for (int var20 = arg6 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                int var22 = var16[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = class40.field675[var21];
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = class40.field675[var22];
                int var25 = var17[var20] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = class40.field675[var25];
                int var27;
                if (var23 == 0 && var24 == 0 && var26 == 0) {
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
                var9.field822[var11++] = (var23 << 16) + (var24 << 8) + (var27 << 24) + var26;
                if (arg5) {
                    var11 += (arg6 << 2) - 4;
                }
            }
        }
        for (int var13 = 0; var13 < this.field2711.length; var13++) {
            this.field2711[var13].method409(123);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V")
    public static final void method1257(int arg0) {
        int var1 = class183.field2900.method1765(8, (byte) -30);
        field2719++;
        if (var1 < class259.field4112) {
            for (int var2 = var1; var2 < class259.field4112; var2++) {
                class178.field2738[class253.field4052++] = class26.field455[var2];
            }
        }
        if (var1 > class259.field4112) {
            throw new RuntimeException("gppov1");
        }
        class259.field4112 = arg0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class26.field455[var3];
            class136 var5 = class233.field3682[var4];
            int var6 = class183.field2900.method1765(1, (byte) -123);
            if (var6 == 0) {
                class26.field455[class259.field4112++] = var4;
                var5.field4761 = class41.field686;
            } else {
                int var7 = class183.field2900.method1765(2, (byte) -115);
                if (var7 == 0) {
                    class26.field455[class259.field4112++] = var4;
                    var5.field4761 = class41.field686;
                    class147.field2179[class122.field1840++] = var4;
                } else if (var7 == 1) {
                    class26.field455[class259.field4112++] = var4;
                    var5.field4761 = class41.field686;
                    int var8 = class183.field2900.method1765(3, (byte) -120);
                    var5.method1980((byte) -125, 1, var8);
                    int var9 = class183.field2900.method1765(1, (byte) 29);
                    if (var9 == 1) {
                        class147.field2179[class122.field1840++] = var4;
                    }
                } else if (var7 == 2) {
                    class26.field455[class259.field4112++] = var4;
                    var5.field4761 = class41.field686;
                    if (class183.field2900.method1765(1, (byte) -115) == 1) {
                        int var10 = class183.field2900.method1765(3, (byte) 112);
                        var5.method1980((byte) -126, 2, var10);
                        int var11 = class183.field2900.method1765(3, (byte) 102);
                        var5.method1980((byte) -126, 2, var11);
                    } else {
                        int var12 = class183.field2900.method1765(3, (byte) -122);
                        var5.method1980((byte) -125, 0, var12);
                    }
                    int var13 = class183.field2900.method1765(1, (byte) 90);
                    if (var13 == 1) {
                        class147.field2179[class122.field1840++] = var4;
                    }
                } else if (var7 == 3) {
                    class178.field2738[class253.field4052++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IDIILqh;Lub;Z)Lej;")
    public final class51 method1258(int arg0, double arg1, int arg2, int arg3, class212 arg4, class92 arg5, boolean arg6) {
        class59.method486((byte) 78, arg1);
        class2.field23 = arg5;
        class9.field155 = arg4;
        field2713++;
        class18.method136(1, arg3, arg0);
        class51 var9 = new class51(arg3, arg0);
        for (int var10 = 0; var10 < this.field2711.length; var10++) {
            this.field2711[var10].method1536(arg3, 255, arg0);
        }
        if (arg2 >= -46) {
            field2716 = -94;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0; var12++) {
            if (arg6) {
                var11 = var12;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field2710.field3583) {
                int[] var14 = this.field2710.method40((byte) 78, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field2710.method135(82, var12);
                var16 = var18[2];
                var15 = var18[0];
                var17 = var18[1];
            }
            for (int var19 = 0; var19 != arg3; var19++) {
                int var20 = var16[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var17[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var22 = class40.field675[var20];
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = class40.field675[var21];
                int var24 = var15[var19] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class40.field675[var24];
                var9.field822[var11++] = (var23 << 8) + ((var25 << 16) + var22);
                if (arg6) {
                    var11 += arg3 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field2711.length; var13++) {
            this.field2711[var13].method409(87);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(B)V")
    public static void method1259(byte arg0) {
        field2708 = null;
        field2718 = null;
        field2722 = null;
        if (arg0 == -63) {
            field2723 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILub;Lqh;)Z")
    public final boolean method1260(int arg0, class92 arg1, class212 arg2) {
        field2715++;
        if (class85.field1268 > 0) {
            for (int var4 = 0; var4 < this.field2721.length; var4++) {
                if (!arg1.method698((byte) 101, this.field2721[var4], class85.field1268)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field2721.length; var5++) {
                if (!arg1.method697(arg0 ^ 0x61, this.field2721[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = arg0; var6 < this.field2712.length; var6++) {
            if (!arg2.method1349(this.field2712[var6], arg0 + 30508)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
    public class176() {
        this.field2721 = new int[0];
        this.field2712 = new int[0];
        this.field2707 = new class298(0);
        this.field2707.field3576 = 1;
        this.field2710 = new class298();
        this.field2710.field3576 = 1;
        this.field2717 = new class298();
        this.field2711 = new class223[] { this.field2710, this.field2717, this.field2707 };
        this.field2717.field3576 = 1;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lha;)V")
    public class176(class31 arg0) {
        int var2 = arg0.method265(-100);
        this.field2711 = new class223[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class223 var16 = class207.method1449(arg0, 32224);
            if (var16.method797(-9338) >= 0) {
                var3++;
            }
            if (var16.method405((byte) -90) >= 0) {
                var4++;
            }
            int var17 = var16.field3593.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method265(-94);
            }
            this.field2711[var6] = var16;
        }
        this.field2712 = new int[var4];
        int var7 = 0;
        this.field2721 = new int[var3];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class223 var11 = this.field2711[var9];
            int var12 = var11.field3593.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field3593[var13] = this.field2711[var5[var9][var13]];
            }
            int var14 = var11.method797(-9338);
            int var15 = var11.method405((byte) -90);
            if (var14 > 0) {
                this.field2721[var8++] = var14;
            }
            if (var15 > 0) {
                this.field2712[var7++] = var15;
            }
            var5[var9] = null;
        }
        this.field2710 = this.field2711[arg0.method265(-83)];
        Object var10 = null;
        this.field2717 = this.field2711[arg0.method265(-108)];
        this.field2707 = this.field2711[arg0.method265(-105)];
    }
}
