import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class227 extends class128 {

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "[I")
    private int[] field3554;

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "[I")
    private int[] field3550;

    @OriginalMember(owner = "client!mk", name = "L", descriptor = "Lfh;")
    private class114 field3552;

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "Lfh;")
    private class114 field3547;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "Lfh;")
    private class114 field3543;

    @OriginalMember(owner = "client!mk", name = "T", descriptor = "[Lfh;")
    private class114[] field3560;

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "[Lbj;")
    public static class215[] field3546 = new class215[2048];

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "I")
    public static int field3551 = -1;

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
    public static int field3544 = 0;

    @OriginalMember(owner = "client!mk", name = "O", descriptor = "Ljava/lang/String;")
    public static String field3555 = "Loading textures - ";

    @OriginalMember(owner = "client!mk", name = "M", descriptor = "[I")
    public static int[] field3553 = new int[1000];

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!mk", name = "Q", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!mk", name = "R", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!mk", name = "S", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!mk", name = "P", descriptor = "Luh;")
    public static class239 field3556;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZILnh;DZLmh;)Lta;")
    public final class203 method1499(int arg0, boolean arg1, int arg2, class305 arg3, double arg4, boolean arg5, class64 arg6) {
        class255.method1663(arg4, 0);
        field3541++;
        class288.field4599 = arg6;
        class171.field2444 = arg3;
        class80.method513(0, arg2, arg0);
        class203 var9 = new class203(arg2, arg0);
        for (int var10 = 0; var10 < this.field3560.length; var10++) {
            this.field3560[var10].method731(arg2, 160, arg0);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0; var12++) {
            if (arg5) {
                var11 = var12;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field3547.field1648) {
                int[] var18 = this.field3547.method16(var12, false);
                var15 = var18;
                var16 = var18;
                var17 = var18;
            } else {
                int[][] var14 = this.field3547.method73((byte) -112, var12);
                var15 = var14[1];
                var16 = var14[2];
                var17 = var14[0];
            }
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = var17[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var21 = class44.field661[var20];
                int var22 = var15[var19] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = class44.field661[var22];
                int var24 = var16[var19] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class44.field661[var24];
                var9.field3058[var11++] = (var21 << 16) + (var23 << 8) + var25;
                if (arg5) {
                    var11 += arg2 - 1;
                }
            }
        }
        int var13 = 0;
        if (arg1) {
            method1506(94);
        }
        while (this.field3560.length > var13) {
            this.field3560[var13].method732(false);
            var13++;
        }
        return var9;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([Lim;IIZII)V")
    public static final void method1500(class178[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        for (int var6 = arg2; var6 < arg0.length; var6++) {
            class178 var7 = arg0[var6];
            if (var7 != null && var7.field2675 == arg4) {
                class25.method158(arg3, var7, -1, arg1, arg5);
                class100.method646((byte) 67, arg1, arg5, var7);
                if (var7.field2644 > var7.field2556 - var7.field2529) {
                    var7.field2644 = var7.field2556 - var7.field2529;
                }
                if (var7.field2644 < 0) {
                    var7.field2644 = 0;
                }
                if ((var7.field2579 - var7.field2571) < var7.field2701) {
                    var7.field2701 = var7.field2579 - var7.field2571;
                }
                if (var7.field2701 < 0) {
                    var7.field2701 = 0;
                }
                if (var7.field2608 == 0) {
                    class141.method890(arg3, (byte) 105, var7);
                }
            }
        }
        field3540++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILnh;Lmh;)Z")
    public final boolean method1501(int arg0, class305 arg1, class64 arg2) {
        field3559++;
        if (arg0 > ~class120.field1715) {
            for (int var4 = 0; var4 < this.field3554.length; var4++) {
                if (!arg1.method2061(class120.field1715, this.field3554[var4], false)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3554.length; var5++) {
                if (!arg1.method2056(true, this.field3554[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field3550.length; var6++) {
            if (!arg2.method396(arg0 ^ 0x71, this.field3550[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILbj;)Ljava/lang/String;")
    public static final String method1502(int arg0, class215 arg1) {
        if (arg0 != 32767) {
            field3556 = null;
        }
        field3549++;
        return class191.method1203(32767, 0, arg1);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V")
    public static void method1503(boolean arg0) {
        if (!arg0) {
            method1506(122);
        }
        field3546 = null;
        field3555 = null;
        field3556 = null;
        field3553 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(DZIILmh;IZLnh;)[I")
    public final int[] method1504(double arg0, boolean arg1, int arg2, int arg3, class64 arg4, int arg5, boolean arg6, class305 arg7) {
        field3542++;
        int[] var10 = new int[arg2 * arg5];
        class255.method1663(arg0, 0);
        class288.field4599 = arg4;
        if (arg3 <= 93) {
            field3551 = -12;
        }
        class171.field2444 = arg7;
        class80.method513(0, arg2, arg5);
        for (int var11 = 0; var11 < this.field3560.length; var11++) {
            this.field3560[var11].method731(arg2, 160, arg5);
        }
        int var12 = 0;
        int var13;
        byte var14;
        int var15;
        if (arg6) {
            var13 = -1;
            var14 = -1;
            var15 = arg2 - 1;
        } else {
            var13 = arg2;
            var14 = 1;
            var15 = 0;
        }
        for (int var16 = 0; var16 < arg5; var16++) {
            if (arg1) {
                var12 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field3547.field1648) {
                int[] var22 = this.field3547.method16(var16, false);
                var20 = var22;
                var21 = var22;
                var19 = var22;
            } else {
                int[][] var18 = this.field3547.method73((byte) -112, var16);
                var19 = var18[0];
                var20 = var18[2];
                var21 = var18[1];
            }
            for (int var23 = var15; var23 != var13; var23 += var14) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
                int var26 = class44.field661[var24];
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var27 = class44.field661[var25];
                int var28 = var20[var23] >> 4;
                if (var28 > 255) {
                    var28 = 255;
                }
                if (var28 < 0) {
                    var28 = 0;
                }
                int var29 = class44.field661[var28];
                var10[var12++] = (var26 << 16) + ((var27 << 8) + var29);
                if (arg1) {
                    var12 += arg2 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field3560.length; var17++) {
            this.field3560[var17].method732(false);
        }
        return var10;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZLmh;IDILnh;)Ljh;")
    public final class269 method1505(int arg0, boolean arg1, class64 arg2, int arg3, double arg4, int arg5, class305 arg6) {
        field3548++;
        class255.method1663(arg4, arg3);
        class288.field4599 = arg2;
        class171.field2444 = arg6;
        class80.method513(0, arg5, arg0);
        class269 var9 = new class269(arg5, arg0);
        for (int var10 = 0; var10 < this.field3560.length; var10++) {
            this.field3560[var10].method731(arg5, 160, arg0);
        }
        int var11 = arg3;
        for (int var12 = 0; var12 < arg0; var12++) {
            if (arg1) {
                var11 = var12 << 2;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field3547.field1648) {
                int[] var14 = this.field3547.method16(var12, false);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field3547.method73((byte) -112, var12);
                var17 = var18[2];
                var15 = var18[1];
                var16 = var18[0];
            }
            int[] var19;
            if (this.field3543.field1648) {
                var19 = this.field3543.method16(var12, false);
            } else {
                var19 = this.field3543.method73((byte) -112, var12)[0];
            }
            for (int var20 = arg5 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                int var22 = var15[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = class44.field661[var21];
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = var16[var20] >> 4;
                int var25 = class44.field661[var22];
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = class44.field661[var24];
                int var27;
                if (var26 == 0 && var25 == 0 && var23 == 0) {
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
                var9.field3058[var11++] = (var25 << 8) + var23 + (var26 << 16) + (var27 << 24);
                if (arg1) {
                    var11 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var13 = 0; var13 < this.field3560.length; var13++) {
            this.field3560[var13].method732(false);
        }
        return var9;
    }

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "(I)V")
    public static final void method1506(int arg0) {
        class179 var1 = class257.field4154;
        synchronized (class257.field4154) {
            if (arg0 < 64) {
                return;
            }
            class228.field3572++;
            class93.field1364 = class145.field2005;
            if (class129.field1797 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class233.field3651[var2] = false;
                }
                class129.field1797 = class157.field2169;
            } else {
                while (class157.field2169 != class129.field1797) {
                    int var3 = class93.field1360[class157.field2169];
                    class157.field2169 = class157.field2169 + 1 & 0x7F;
                    if (var3 < 0) {
                        class233.field3651[~var3] = false;
                    } else {
                        class233.field3651[var3] = true;
                    }
                }
            }
            class145.field2005 = class243.field3818;
        }
        field3545++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIII)V")
    public static final void method1507(int arg0, int arg1, int arg2, int arg3) {
        field3558++;
        int var4 = 58 / ((81 - arg0) / 38);
        class39 var5 = class149.method935(-122, arg2, 9);
        var5.method261(0);
        var5.field593 = arg1;
        var5.field598 = arg3;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
    public class227() {
        this.field3554 = new int[0];
        this.field3550 = new int[0];
        this.field3552 = new class11(0);
        this.field3552.field1641 = 1;
        this.field3547 = new class11();
        this.field3547.field1641 = 1;
        this.field3543 = new class11();
        this.field3560 = new class114[] { this.field3547, this.field3543, this.field3552 };
        this.field3543.field1641 = 1;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lbj;)V")
    public class227(class215 arg0) {
        int var2 = arg0.method1374((byte) -60);
        int var3 = 0;
        this.field3560 = new class114[var2];
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class114 var16 = class48.method295(arg0, true);
            if (var16.method728(true) >= 0) {
                var3++;
            }
            if (var16.method723(-1) >= 0) {
                var4++;
            }
            int var17 = var16.field1645.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1374((byte) -60);
            }
            this.field3560[var6] = var16;
        }
        this.field3554 = new int[var3];
        int var7 = 0;
        this.field3550 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class114 var11 = this.field3560[var9];
            int var12 = var11.field1645.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1645[var13] = this.field3560[var5[var9][var13]];
            }
            int var14 = var11.method728(true);
            int var15 = var11.method723(-1);
            if (var14 > 0) {
                this.field3554[var7++] = var14;
            }
            if (var15 > 0) {
                this.field3550[var8++] = var15;
            }
            var5[var9] = null;
        }
        Object var10 = null;
        this.field3547 = this.field3560[arg0.method1374((byte) -60)];
        this.field3543 = this.field3560[arg0.method1374((byte) -60)];
        this.field3552 = this.field3560[arg0.method1374((byte) -60)];
    }
}
