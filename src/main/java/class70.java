import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class70 {

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "Ljk;")
    private class449 field915 = new class449(64);

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "Ljk;")
    public class449 field919 = new class449(50);

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "Llt;")
    public class478 field921 = new class478(250);

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "Lnv;")
    private class289 field922 = new class289();

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public int field905;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "Z")
    private boolean field914;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "Lqn;")
    private class47 field909;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "Ltl;")
    private class439 field926;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Lqn;")
    public class47 field908;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public int field903;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field925;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "[Ljava/lang/String;")
    private String[] field923;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "Lap;")
    public static class335 field917 = new class335("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    public int field924;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIILeb;Lya;II)Ll;", line = 4)
    public final class16 method616(int arg0, int arg1, int arg2, int arg3, class442 arg4, class38 arg5, int arg6, int arg7) {
        if (arg3 < 63) {
            this.method626(null, null, true, null, -19, 86, 102, 8, -126, false, null, -76);
        }
        this.field922.field3693 = arg2;
        field918++;
        this.field922.field3684 = arg6;
        this.field922.field3690 = arg1;
        this.field922.field3688 = arg4 != null;
        this.field922.field3687 = arg5.field497;
        this.field922.field3691 = arg0;
        this.field922.field3683 = arg7;
        return (class16) this.field921.method2914(0, this.field922);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)V", line = 24)
    public final void method617(byte arg0, int arg1) {
        int var3 = 113 % ((65 - arg0) / 34);
        field913++;
        this.field924 = arg1;
        class449 var4 = this.field919;
        synchronized (this.field919) {
            this.field919.method2642(0);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V", line = 38)
    public final void method618(int arg0) {
        class449 var2 = this.field915;
        synchronized (this.field915) {
            this.field915.method2640(arg0 ^ 0x6F);
        }
        field916++;
        class449 var3 = this.field919;
        synchronized (this.field919) {
            this.field919.method2640(106);
        }
        class478 var4 = this.field921;
        synchronized (this.field921) {
            if (arg0 == 3) {
                this.field921.method2924((byte) -109);
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V", line = 57)
    public final void method619(byte arg0) {
        if (arg0 != -59) {
            this.method626(null, null, false, null, -26, 78, 93, 20, -5, false, null, -71);
        }
        class478 var2 = this.field921;
        synchronized (this.field921) {
            this.field921.method2919(-7);
        }
        field902++;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V", line = 73)
    public static void method620(int arg0) {
        if (arg0 != 1068635073) {
            field917 = null;
        }
        field917 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V", line = 84)
    public final void method621(int arg0, int arg1) {
        field904++;
        class449 var3 = this.field915;
        synchronized (this.field915) {
            this.field915.method2648(false, arg1);
        }
        class449 var4 = this.field919;
        synchronized (this.field919) {
            this.field919.method2648(false, arg1);
        }
        class478 var5 = this.field921;
        synchronized (this.field921) {
            this.field921.method2912((byte) -59, arg1);
            if (arg0 != 5537) {
                this.method617((byte) 15, -80);
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BZ)V", line = 103)
    public final void method622(byte arg0, boolean arg1) {
        field907++;
        if (this.field914 == arg1) {
            return;
        }
        this.field914 = arg1;
        this.method627(0);
        if (arg0 <= 28) {
            this.method619((byte) 88);
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)[[[B", line = 118)
    public static final byte[][][] method623(int arg0, int arg1) {
        field906++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg0;
        int var4 = arg0;
        byte[] var5 = new byte[arg0 * arg0];
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            for (int var132 = 0; var132 < var3; var132++) {
                if (var132 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        var2[0][0] = var5;
        byte[] var8 = new byte[var3 * var4];
        int var9 = 0;
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var131 = 0; var131 < var4; var131++) {
                if (var10 >= var131) {
                    var8[var9] = -1;
                }
                var9++;
            }
        }
        var2[0][1] = var8;
        int var11 = 0;
        byte[] var12 = new byte[var3 * var4];
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var13 <= var130) {
                    var12[var11] = -1;
                }
                var11++;
            }
        }
        var2[0][2] = var12;
        int var14 = 0;
        byte[] var15 = new byte[var3 * var4];
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var16 <= var129) {
                    var15[var14] = -1;
                }
                var14++;
            }
        }
        var2[0][3] = var15;
        int var17 = 0;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var19 >> 1 >= var128) {
                    var18[var17] = -1;
                }
                var17++;
            }
        }
        var2[1][0] = var18;
        int var20 = 0;
        byte[] var21 = new byte[var3 * var4];
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var20 >= 0 && var21.length > var20) {
                    if (var127 >= var22 << 1) {
                        var21[var20] = -1;
                    }
                    var20++;
                } else {
                    var20++;
                }
            }
        }
        var2[1][1] = var21;
        byte[] var23 = new byte[var3 * var4];
        int var24 = 0;
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if (var126 <= var25 >> 1) {
                    var23[var24] = -1;
                }
                var24++;
            }
        }
        var2[1][2] = var23;
        int var26 = 0;
        byte[] var27 = new byte[var3 * var4];
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if (var28 << 1 <= var125) {
                    var27[var26] = -1;
                }
                var26++;
            }
        }
        var2[1][3] = var27;
        byte[] var29 = new byte[var3 * var4];
        int var30 = 0;
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var124 = var3 - 1; var124 >= 0; var124--) {
                if (var124 <= var31 >> 1) {
                    var29[var30] = -1;
                }
                var30++;
            }
        }
        var2[2][0] = var29;
        int var32 = 0;
        byte[] var33 = new byte[var3 * var4];
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var123 = 0; var123 < var3; var123++) {
                if (var123 >= var34 << 1) {
                    var33[var32] = -1;
                }
                var32++;
            }
        }
        var2[2][1] = var33;
        byte[] var35 = new byte[var3 * var4];
        int var36 = 0;
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var122 = 0; var122 < var3; var122++) {
                if (var122 <= var37 >> 1) {
                    var35[var36] = -1;
                }
                var36++;
            }
        }
        var2[2][2] = var35;
        int var38 = 0;
        byte[] var39 = new byte[var3 * var4];
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var121 = var3 - 1; var121 >= 0; var121--) {
                if ((var40 << 1) <= var121) {
                    var39[var38] = -1;
                }
                var38++;
            }
        }
        var2[2][3] = var39;
        int var41 = 0;
        byte[] var42 = new byte[var3 * var4];
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var120 = 0; var120 < var3; var120++) {
                if (var120 >= var43 >> 1) {
                    var42[var41] = -1;
                }
                var41++;
            }
        }
        var2[3][0] = var42;
        byte[] var44 = new byte[var3 * var4];
        int var45 = 0;
        if (arg1 >= -69) {
            method620(-121);
        }
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var119 = 0; var119 < var3; var119++) {
                if (var46 << 1 >= var119) {
                    var44[var45] = -1;
                }
                var45++;
            }
        }
        var2[3][1] = var44;
        int var47 = 0;
        byte[] var48 = new byte[var3 * var4];
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var118 >= var49 >> 1) {
                    var48[var47] = -1;
                }
                var47++;
            }
        }
        var2[3][2] = var48;
        byte[] var50 = new byte[var3 * var4];
        int var51 = 0;
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if ((var52 << 1) >= var117) {
                    var50[var51] = -1;
                }
                var51++;
            }
        }
        var2[3][3] = var50;
        byte[] var53 = new byte[var3 * var4];
        int var54 = 0;
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var116 = var3 - 1; var116 >= 0; var116--) {
                if ((var55 >> 1) <= var116) {
                    var53[var54] = -1;
                }
                var54++;
            }
        }
        var2[4][0] = var53;
        byte[] var56 = new byte[var3 * var4];
        int var57 = 0;
        for (int var58 = var4 - 1; var58 >= 0; var58--) {
            for (int var115 = 0; var115 < var3; var115++) {
                if (var115 <= (var58 << 1)) {
                    var56[var57] = -1;
                }
                var57++;
            }
        }
        var2[4][1] = var56;
        byte[] var59 = new byte[var3 * var4];
        int var60 = 0;
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if (var114 >= (var61 >> 1)) {
                    var59[var60] = -1;
                }
                var60++;
            }
        }
        var2[4][2] = var59;
        byte[] var62 = new byte[var3 * var4];
        int var63 = 0;
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var113 = var3 - 1; var113 >= 0; var113--) {
                if (var64 << 1 >= var113) {
                    var62[var63] = -1;
                }
                var63++;
            }
        }
        var2[4][3] = var62;
        int var65 = 0;
        byte[] var66 = new byte[var3 * var4];
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if (var3 / 2 >= var112) {
                    var66[var65] = -1;
                }
                var65++;
            }
        }
        var2[5][0] = var66;
        byte[] var68 = new byte[var3 * var4];
        int var69 = 0;
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if ((var4 / 2) >= var70) {
                    var68[var69] = -1;
                }
                var69++;
            }
        }
        var2[5][1] = var68;
        byte[] var71 = new byte[var3 * var4];
        int var72 = 0;
        for (int var73 = 0; var73 < var4; var73++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if (var110 >= (var3 / 2)) {
                    var71[var72] = -1;
                }
                var72++;
            }
        }
        var2[5][2] = var71;
        int var74 = 0;
        byte[] var75 = new byte[var3 * var4];
        for (int var76 = 0; var76 < var4; var76++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if (var76 >= (var4 / 2)) {
                    var75[var74] = -1;
                }
                var74++;
            }
        }
        var2[5][3] = var75;
        byte[] var77 = new byte[var3 * var4];
        int var78 = 0;
        for (int var79 = 0; var79 < var4; var79++) {
            for (int var108 = 0; var108 < var3; var108++) {
                if ((var79 - (var4 / 2)) >= var108) {
                    var77[var78] = -1;
                }
                var78++;
            }
        }
        var2[6][0] = var77;
        int var80 = 0;
        byte[] var81 = new byte[var3 * var4];
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var107 = 0; var107 < var3; var107++) {
                if (var107 <= var82 - (var4 / 2)) {
                    var81[var80] = -1;
                }
                var80++;
            }
        }
        var2[6][1] = var81;
        byte[] var83 = new byte[var3 * var4];
        int var84 = 0;
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var85 - (var4 / 2) >= var106) {
                    var83[var84] = -1;
                }
                var84++;
            }
        }
        var2[6][2] = var83;
        byte[] var86 = new byte[var3 * var4];
        int var87 = 0;
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var105 = var3 - 1; var105 >= 0; var105--) {
                if (var105 <= (var88 - (var4 / 2))) {
                    var86[var87] = -1;
                }
                var87++;
            }
        }
        var2[6][3] = var86;
        int var89 = 0;
        byte[] var90 = new byte[var3 * var4];
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var104 = 0; var104 < var3; var104++) {
                if (var104 >= (var91 - (var4 / 2))) {
                    var90[var89] = -1;
                }
                var89++;
            }
        }
        var2[7][0] = var90;
        byte[] var92 = new byte[var3 * var4];
        int var93 = 0;
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var103 = 0; var103 < var3; var103++) {
                if (var103 >= (var94 - (var4 / 2))) {
                    var92[var93] = -1;
                }
                var93++;
            }
        }
        var2[7][1] = var92;
        byte[] var95 = new byte[var3 * var4];
        int var96 = 0;
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if (var97 - (var4 / 2) <= var102) {
                    var95[var96] = -1;
                }
                var96++;
            }
        }
        var2[7][2] = var95;
        byte[] var98 = new byte[var3 * var4];
        int var99 = 0;
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if (var101 >= (var100 - var4 / 2)) {
                    var98[var99] = -1;
                }
                var99++;
            }
        }
        var2[7][3] = var98;
        return var2;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(BI)Lff;", line = 897)
    public final class9 method624(byte arg0, int arg1) {
        field910++;
        class449 var3 = this.field915;
        class9 var4;
        synchronized (this.field915) {
            var4 = (class9) this.field915.method2647(-125, (long) arg1);
            if (arg0 > -111) {
                method623(44, 102);
            }
        }
        if (var4 != null) {
            return var4;
        }
        class47 var5 = this.field909;
        byte[] var6;
        synchronized (this.field909) {
            var6 = this.field909.method481(class276.method1630(arg1, true), class255.method1530(arg1, 255), -76);
        }
        class9 var7 = new class9();
        var7.field153 = arg1;
        var7.field121 = this;
        var7.field137 = new String[] { null, null, class335.field4234.method1936(-26539, this.field905), null, null };
        var7.field101 = new String[] { null, null, null, null, class352.field4525.method1936(-26539, this.field905) };
        if (var6 != null) {
            var7.method51(0, new class463(var6));
        }
        var7.method64(500510720);
        if (var7.field120 != -1) {
            var7.method54(this.method624((byte) -112, var7.field130), (byte) -107, this.method624((byte) -123, var7.field120));
        }
        if (var7.field131 != -1) {
            var7.method63(this.method624((byte) -123, var7.field131), this.method624((byte) -124, var7.field141), (byte) -44);
        }
        if (!this.field914 && var7.field87) {
            var7.field140 = class19.field281.method1936(-26539, this.field905);
            var7.field101 = this.field923;
            var7.field104 = null;
            var7.field152 = 0;
            var7.field137 = this.field925;
            var7.field107 = false;
            if (var7.field103 != null) {
                boolean var8 = false;
                for (class383 var9 = var7.field103.method2021(-35); var9 != null; var9 = var7.field103.method2017(99)) {
                    class172 var10 = this.field926.method2579((byte) -110, (int) var9.field5043);
                    if (var10.field2191) {
                        var9.method2165(16225);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field103 = null;
                }
            }
        }
        class449 var11 = this.field915;
        synchronized (this.field915) {
            this.field915.method2635((long) arg1, -26591, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V", line = 975)
    public final void method625(byte arg0) {
        field920++;
        if (arg0 < 66) {
            method623(52, 86);
        }
        class449 var2 = this.field919;
        synchronized (this.field919) {
            this.field919.method2642(0);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Leb;Lla;ZLya;IIIIIZLya;I)Ll;", line = 988)
    public final class16 method626(class442 arg0, class316 arg1, boolean arg2, class38 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, class38 arg10, int arg11) {
        field912++;
        class16 var13 = this.method616(arg6, arg7, arg11, 67, arg0, arg3, arg5, arg4);
        if (var13 != null) {
            return var13;
        }
        class9 var14 = this.method624((byte) -117, arg5);
        if (arg7 > 1 && var14.field78 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field97[var16] <= arg7 && var14.field97[var16] != 0) {
                    var15 = var14.field78[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method624((byte) -118, var15);
            }
        }
        int[] var17 = var14.method59(arg9, arg0, arg11, arg3, -16777215, arg6, arg4, arg10, arg1, arg7);
        if (var17 == null) {
            return null;
        }
        class16 var18;
        if (arg2) {
            var18 = arg10.method299(var17, 0, 36, 36, 32);
        } else {
            var18 = arg3.method299(var17, 0, 36, 36, 32);
        }
        if (!arg2) {
            class289 var19 = new class289();
            var19.field3691 = arg6;
            var19.field3687 = arg3.field497;
            var19.field3688 = arg0 != null;
            var19.field3683 = arg4;
            var19.field3690 = arg7;
            var19.field3684 = arg5;
            var19.field3693 = arg11;
            this.field921.method2921(var19, -89, var18);
        }
        if (arg8 != 32) {
            this.field924 = -75;
        }
        return var18;
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V", line = 1055)
    public final void method627(int arg0) {
        field911++;
        class449 var2 = this.field915;
        synchronized (this.field915) {
            this.field915.method2642(arg0);
        }
        class449 var3 = this.field919;
        synchronized (this.field919) {
            this.field919.method2642(0);
        }
        class478 var4 = this.field921;
        synchronized (this.field921) {
            this.field921.method2919(-7);
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lae;IZLtl;Lqn;Lqn;)V", line = 1098)
    public class70(class165 arg0, int arg1, boolean arg2, class439 arg3, class47 arg4, class47 arg5) {
        this.field905 = arg1;
        this.field914 = arg2;
        this.field909 = arg4;
        this.field926 = arg3;
        this.field908 = arg5;
        if (this.field909 == null) {
            this.field903 = 0;
        } else {
            int var7 = this.field909.method472((byte) -82) - 1;
            this.field903 = var7 * 256 + this.field909.method469(30322, var7);
        }
        this.field925 = new String[] { null, null, class335.field4234.method1936(-26539, this.field905), null, null };
        this.field923 = new String[] { null, null, null, null, class352.field4525.method1936(-26539, this.field905) };
    }
}
