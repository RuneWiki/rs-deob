import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class408 extends class35 {

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "[Lhk;")
    public class201[] field5948;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "[B")
    public byte[] field5941;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "[B")
    public byte[] field5952;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "[I")
    private int[] field5946;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "[Lub;")
    public class133[] field5951;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "[B")
    public byte[] field5950;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "[S")
    public short[] field5942;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public int field5947;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "Ljava/lang/String;")
    public static String field5944 = "scroll:";

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public static int field5943 = 0;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "I")
    public static int field5954 = 0;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([IILwc;[B)Z", line = 7)
    public final boolean method2576(int[] arg0, int arg1, class367 arg2, byte[] arg3) {
        field5940++;
        boolean var5 = true;
        int var6 = 0;
        class201 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field5946[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method2341(var9 >> 2, arg0, (byte) 41);
                        } else {
                            var7 = arg2.method2336(arg0, 0, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field5948[var8] = var7;
                        this.field5946[var8] = 0;
                    }
                }
            }
        }
        if (arg1 != -24126) {
            method2577(-39, (class258) null, -69, 93, (class90) null);
        }
        return var5;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILmb;IILja;)V", line = 61)
    public static final void method2577(int arg0, class258 arg1, int arg2, int arg3, class90 arg4) {
        field5945++;
        class134 var5 = arg1.method1871(arg4, arg0 ^ 0x4191);
        if (var5 == null) {
            return;
        }
        if (arg0 != 0) {
            field5944 = null;
        }
        arg4.method752(arg3, arg2, arg1.field3764 + arg3, arg1.field3758 + arg2);
        if (class234.field3392 == 2 || class234.field3392 == 5 || class135.field2165 == null) {
            arg4.method766(-16777216, var5, arg3, arg2);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class322.field4643 == 4) {
            var8 = 4096;
            var9 = class369.field5238;
            var7 = class263.field3956;
            var6 = (int) (-class106.field1756) & 0x3FFF;
        } else {
            var6 = (int) (-class106.field1756) + class1.field3 & 0x3FFF;
            var7 = class86.field1394.field6519;
            var8 = 4096 - (class248.field3593 * 16);
            var9 = class86.field1394.field6520;
        }
        int var10 = var9 / 32 + 208 + 48 - (class183.field2703 * 2);
        int var11 = class66.field1056 * 4 + 208 + 48 - class66.field1056 * 2 - (var7 / 32);
        class135.field2165.method2646((float) arg1.field3764 / 2.0F + (float) arg3, (float) arg1.field3758 / 2.0F + (float) arg2, (float) var10, (float) var11, var8, var6 << 2, var5, arg3, arg2);
        for (class9 var12 = (class9) class244.field3550.method157((byte) -125); var12 != null; var12 = (class9) class244.field3550.method145(12)) {
            int var50 = var12.field117;
            int var51 = (class141.field2233.field5373[var50] >> 14 & 0x3FFF) - class379.field5384;
            int var52 = (class141.field2233.field5373[var50] & 0x3FFF) - class294.field4362;
            int var53 = var51 * 4 - (var9 / 32 - 2);
            int var54 = var52 * 4 + 2 - (var7 / 32);
            class311.method2118(var5, arg1, arg2, var54, var53, (byte) 102, arg4, class141.field2233.field5372[var50], arg3);
        }
        for (int var13 = 0; var13 < class117.field1842; var13++) {
            int var47 = class361.field5140[var13] * 4 + 2 - (var9 / 32);
            int var48 = class239.field3458[var13] * 4 + 2 - (var7 / 32);
            class45 var49 = class451.method2812(arg0 ^ 0x59, class329.field4741[var13]);
            if (var49.field681 != null) {
                var49 = var49.method369(arg0 ^ 0xFFFFFF94);
                if (var49 == null || var49.field668 == -1) {
                    continue;
                }
            }
            class311.method2118(var5, arg1, arg2, var48, var47, (byte) 102, arg4, var49.field668, arg3);
        }
        for (class110 var14 = (class110) class186.field2728.method1222(5656); var14 != null; var14 = (class110) class186.field2728.method1224((byte) -98)) {
            int var44 = (int) (var14.field499 >> 28 & 0x3L);
            if (class390.field5656 == var44) {
                int var45 = (int) (var14.field499 & 0x3FFFL) * 4 + 2 - (var9 / 32);
                int var46 = (int) (var14.field499 >> 14 & 0x3FFFL) * 4 + 2 - (var7 / 32);
                class275.method1967(arg1, class200.field2924[0], var45, arg2, arg3, var46, var5, 16383);
            }
        }
        for (int var15 = 0; var15 < class156.field2376; var15++) {
            class98 var40 = class447.field6512[class416.field6027[var15]];
            if (var40 != null && var40.method820(-1810533241)) {
                class11 var41 = var40.field1545;
                if (var41 != null && var41.field135 != null) {
                    var41 = var41.method75(arg0);
                }
                if (var41 != null && var41.field127 && var41.field166) {
                    int var42 = var40.field6520 / 32 - (var9 / 32);
                    int var43 = var40.field6519 / 32 - (var7 / 32);
                    if (var41.field155 == -1) {
                        class275.method1967(arg1, class200.field2924[1], var42, arg2, arg3, var43, var5, 16383);
                    } else {
                        class311.method2118(var5, arg1, arg2, var43, var42, (byte) 102, arg4, var41.field155, arg3);
                    }
                }
            }
        }
        for (int var16 = 0; var16 < class21.field317; var16++) {
            class127 var32 = class367.field5225[class75.field1290[var16]];
            if (var32 != null && var32.method1069(arg0 ^ 0x94157487)) {
                int var33 = var32.field6520 / 32 - (var9 / 32);
                int var34 = var32.field6519 / 32 - (var7 / 32);
                boolean var35 = false;
                for (int var36 = 0; var36 < class284.field4255; var36++) {
                    if (var32.field2066.equals(class164.field2473[var36]) && class51.field821[var36] != 0) {
                        var35 = true;
                        break;
                    }
                }
                boolean var37 = false;
                for (int var38 = 0; var38 < class110.field1798; var38++) {
                    if (var32.field2066.equals(class377.field5352[var38].field2236)) {
                        var37 = true;
                        break;
                    }
                }
                boolean var39 = false;
                if (class86.field1394.field2080 != 0 && var32.field2080 != 0 && class86.field1394.field2080 == var32.field2080) {
                    var39 = true;
                }
                if (var35) {
                    class275.method1967(arg1, class200.field2924[3], var33, arg2, arg3, var34, var5, arg0 ^ 0x3FFF);
                } else if (var37) {
                    class275.method1967(arg1, class200.field2924[5], var33, arg2, arg3, var34, var5, 16383);
                } else if (var39) {
                    class275.method1967(arg1, class200.field2924[4], var33, arg2, arg3, var34, var5, arg0 ^ 0x3FFF);
                } else {
                    class275.method1967(arg1, class200.field2924[2], var33, arg2, arg3, var34, var5, 16383);
                }
            }
        }
        class257[] var17 = class431.field6220;
        for (int var18 = 0; var18 < var17.length; var18++) {
            class257 var21 = var17[var18];
            if (var21 != null && var21.field3713 != 0 && (class267.field4002 % 20) < 10) {
                if (var21.field3713 == 1 && var21.field3708 >= 0 && class447.field6512.length > var21.field3708) {
                    class98 var22 = class447.field6512[var21.field3708];
                    if (var22 != null) {
                        int var23 = var22.field6520 / 32 - var9 / 32;
                        int var24 = var22.field6519 / 32 - (var7 / 32);
                        class19.method126(arg2, var21.field3721, arg3, var24, 360000, var23, arg0 ^ 0x67, arg1, var5);
                    }
                }
                if (var21.field3713 == 2) {
                    int var25 = (var21.field3710 - class379.field5384) * 4 + 2 - (var9 / 32);
                    int var26 = (var21.field3714 - class294.field4362) * 4 + 2 - (var7 / 32);
                    int var27 = var21.field3706 * 4;
                    int var28 = var27 * var27;
                    class19.method126(arg2, var21.field3721, arg3, var26, var28, var25, 126, arg1, var5);
                }
                if (var21.field3713 == 10 && var21.field3708 >= 0 && var21.field3708 < class367.field5225.length) {
                    class127 var29 = class367.field5225[var21.field3708];
                    if (var29 != null) {
                        int var30 = var29.field6520 / 32 - (var9 / 32);
                        int var31 = var29.field6519 / 32 - var7 / 32;
                        class19.method126(arg2, var21.field3721, arg3, var31, 360000, var30, 107, arg1, var5);
                    }
                }
            }
        }
        if (class322.field4643 == 4) {
            return;
        }
        if (class161.field2434 != 0) {
            int var19 = class161.field2434 * 4 + (class86.field1394.method1070((byte) -50) * 2 - 2) + 2 - (var9 / 32);
            int var20 = class11.field136 * 4 + ((class86.field1394.method1070((byte) -50) + -1) * 2) + 2 - (var7 / 32);
            class275.method1967(arg1, class179.field2669[class420.field6129 ? 1 : 0], var19, arg2, arg3, var20, var5, arg0 ^ 0x3FFF);
        }
        arg4.method736(3, (byte) -40, -1, 3, arg1.field3764 / 2 + arg3 - 1, arg2 - -(arg1.field3758 / 2) + -1);
        return;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V", line = 361)
    public final void method2578(int arg0) {
        field5953++;
        this.field5946 = null;
        if (arg0 != 3) {
            this.method2578(-80);
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)V", line = 381)
    public static void method2579(byte arg0) {
        field5944 = null;
        if (arg0 != 80) {
            field5954 = -57;
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V", line = 391)
    public class408() {
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZI)V", line = 397)
    public static final void method2580(boolean arg0, int arg1) {
        field5949++;
        int var2 = class267.field4002 - class174.field2591;
        if (var2 >= 100) {
            class322.field4643 = 1;
            return;
        }
        int var3 = (int) class436.field6359;
        if ((class164.field2466 >> 8) > var3) {
            var3 = class164.field2466 >> 8;
        }
        if (class1.field6[4] && var3 < (class391.field5716[4] + 128)) {
            var3 = class391.field5716[4] + 128;
        }
        int var4 = (int) class106.field1756 + class389.field5570 & 0x3FFF;
        class30.method227(class109.method957(class86.field1394.field6519, class86.field1394.field6520, class367.field5213, 20663) - 50, var3, class392.field5729, arg1, class99.field1551, var4, (var3 >> 3) * 3 + 600, arg0);
        float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
        class40.field623 = (int) ((float) (class40.field623 - class100.field1565) * var5 + (float) class100.field1565);
        class286.field4288 = (int) ((float) (class286.field4288 - class406.field5903) * var5 + (float) class406.field5903);
        class437.field6364 = (int) ((float) (class437.field6364 - class331.field4760) * var5 + (float) class331.field4760);
        class265.field3985 = (int) ((float) (class265.field3985 - class242.field3533) * var5 + (float) class242.field3533);
        int var6 = class291.field4330 - class77.field1307;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class291.field4330 = (int) ((float) var6 * var5 + (float) class77.field1307);
        class291.field4330 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "([B)V", line = 448)
    public class408(byte[] arg0) {
        this.field5948 = new class201[128];
        this.field5941 = new byte[128];
        this.field5952 = new byte[128];
        this.field5946 = new int[128];
        this.field5951 = new class133[128];
        this.field5950 = new byte[128];
        this.field5942 = new short[128];
        class37 var2 = new class37(arg0);
        int var3;
        for (var3 = 0; var2.field578[var2.field565 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method291(0);
        }
        var2.field565++;
        var3++;
        int var6 = var2.field565;
        var2.field565 += var3;
        int var7;
        for (var7 = 0; var2.field578[var2.field565 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method291(0);
        }
        var7++;
        var2.field565++;
        int var10 = var2.field565;
        var2.field565 += var7;
        int var11;
        for (var11 = 0; var2.field578[var2.field565 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method291(0);
        }
        var2.field565++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method271((byte) 102);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var105) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class133[] var18 = new class133[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class133 var102 = var18[var19] = new class133();
            int var103 = var2.method271((byte) 114);
            if (var103 > 0) {
                var102.field2147 = new byte[var103 * 2];
            }
            int var104 = var2.method271((byte) 114);
            if (var104 > 0) {
                var102.field2140 = new byte[var104 * 2 + 2];
                var102.field2140[1] = 64;
            }
        }
        int var20 = var2.method271((byte) 110);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method271((byte) 112);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field578[var2.field565 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method291(0);
        }
        var2.field565++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method271((byte) 100);
            this.field5942[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method271((byte) 122);
            this.field5942[var30] = (short) (this.field5942[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var32 >= var25.length) {
                    var31 = -1;
                } else {
                    var31 = var25[var32++];
                }
                var33 = var2.method281(0);
            }
            this.field5942[var34] = (short) (this.field5942[var34] + (class35.method254(2, var33 - 1) << 14));
            var31--;
            this.field5946[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field5946[var38] != 0) {
                if (var36 == 0) {
                    var37 = var2.field578[var6++] - 1;
                    if (var4.length > var35) {
                        var36 = var4[var35++];
                    } else {
                        var36 = -1;
                    }
                }
                var36--;
                this.field5941[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field5946[var42] != 0) {
                if (var40 == 0) {
                    if (var8.length > var39) {
                        var40 = var8[var39++];
                    } else {
                        var40 = -1;
                    }
                    var41 = var2.field578[var10++] + 16 << 2;
                }
                this.field5950[var42] = (byte) var41;
                var40--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class133 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field5946[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var12.length > var44) {
                        var43 = var12[var44++];
                    } else {
                        var43 = -1;
                    }
                }
                this.field5951[var46] = var45;
                var43--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var47 < var25.length) {
                    var48 = var25[var47++];
                } else {
                    var48 = -1;
                }
                if (this.field5946[var50] > 0) {
                    var49 = var2.method271((byte) 110) + 1;
                }
            }
            this.field5952[var50] = (byte) var49;
            var48--;
        }
        this.field5947 = var2.method271((byte) 118) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class133 var99 = var18[var51];
            if (var99.field2147 != null) {
                for (int var100 = 1; var100 < var99.field2147.length; var100 += 2) {
                    var99.field2147[var100] = var2.method291(0);
                }
            }
            if (var99.field2140 != null) {
                for (int var101 = 3; var101 < var99.field2140.length - 2; var101 += 2) {
                    var99.field2140[var101] = var2.method291(0);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method291(0);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method291(0);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class133 var96 = var18[var54];
            if (var96.field2140 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field2140.length; var98 += 2) {
                    var97 -= -var2.method271((byte) 110) - 1;
                    var96.field2140[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class133 var93 = var18[var55];
            if (var93.field2147 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field2147.length; var95 += 2) {
                    var94 = var94 + var2.method271((byte) 112) + 1;
                    var93.field2147[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method271((byte) 123);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var2.method271((byte) 120) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field5952[var60] = (byte) (this.field5952[var60] * var59 + 32 >> 6);
            }
            for (int var61 = 2; var61 < var21.length; var61 += 2) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class180.method1407(var64 - var58, var66, 487781503);
                    var66 += var65 - var59;
                    this.field5952[var67] = (byte) (this.field5952[var67] * var68 + 32 >> 6);
                }
                var58 = var64;
                var59 = var65;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field5952[var62] = (byte) (this.field5952[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method271((byte) 126);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var2.method271((byte) 118) + (var69 + 1);
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field5950[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field5950[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class180.method1407(var78 - var71, var80, 487781503);
                    int var83 = (this.field5950[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    var80 += var79 - var72;
                    this.field5950[var81] = (byte) var83;
                }
                var71 = var78;
                var74 += 2;
                var72 = var79;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field5950[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field5950[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field2139 = var2.method271((byte) 112);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class133 var92 = var18[var86];
            if (var92.field2147 != null) {
                var92.field2144 = var2.method271((byte) 101);
            }
            if (var92.field2140 != null) {
                var92.field2142 = var2.method271((byte) 126);
            }
            if (var92.field2139 > 0) {
                var92.field2149 = var2.method271((byte) 109);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field2143 = var2.method271((byte) 125);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class133 var91 = var18[var88];
            if (var91.field2143 > 0) {
                var91.field2146 = var2.method271((byte) 109);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class133 var90 = var18[var89];
            if (var90.field2146 > 0) {
                var90.field2138 = var2.method271((byte) 122);
            }
        }
    }
}
