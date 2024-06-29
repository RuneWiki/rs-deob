import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class191 extends class445 {

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "[B")
    public byte[] field2593;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "[S")
    public short[] field2601;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "[I")
    private int[] field2598;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "[Ljn;")
    public class465[] field2591;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "[B")
    public byte[] field2604;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "[Lbd;")
    public class42[] field2594;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "[B")
    public byte[] field2588;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    public int field2599;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "Lh;")
    public static class434 field2603;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "[Ljd;")
    public static class139[] field2597;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "[[[B")
    public static byte[][][] field2589;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V")
    public static final void method1090(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2596++;
        int var5 = 0;
        int var6 = arg1;
        int var7 = -arg1;
        int var8 = -1;
        int var9 = class309.method1706(class425.field5751, arg1 + arg2, 6798, class136.field1985);
        int var10 = class309.method1706(class425.field5751, arg2 - arg1, 6798, class136.field1985);
        if (arg0 != -12066) {
            field2597 = null;
        }
        class330.method1834(var9, class102.field1472[arg3], arg4, var10, 25084);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg3 - var6;
                int var12 = arg3 + var6;
                if (class221.field2942 <= var12 && class205.field2784 >= var11) {
                    int var13 = class309.method1706(class425.field5751, arg2 + var5, 6798, class136.field1985);
                    int var14 = class309.method1706(class425.field5751, arg2 - var5, 6798, class136.field1985);
                    if (class205.field2784 >= var12) {
                        class330.method1834(var13, class102.field1472[var12], arg4, var14, 25084);
                    }
                    if (class221.field2942 <= var11) {
                        class330.method1834(var13, class102.field1472[var11], arg4, var14, 25084);
                    }
                }
            }
            var5++;
            int var15 = arg3 - var5;
            int var16 = arg3 + var5;
            if (class221.field2942 <= var16 && var15 <= class205.field2784) {
                int var17 = class309.method1706(class425.field5751, arg2 + var6, 6798, class136.field1985);
                int var18 = class309.method1706(class425.field5751, arg2 - var6, 6798, class136.field1985);
                if (var16 <= class205.field2784) {
                    class330.method1834(var17, class102.field1472[var16], arg4, var18, 25084);
                }
                if (var15 >= class221.field2942) {
                    class330.method1834(var17, class102.field1472[var15], arg4, var18, arg0 ^ 0xFFFFB122);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
    public final void method1091(int arg0) {
        field2595++;
        this.field2598 = null;
        if (arg0 != 0) {
            field2597 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
    public static final void method1092(int arg0) {
        field2590++;
        class114.field1710 = 0;
        class330.field4382 = false;
        if (arg0 < 43) {
            method1094(95, 56, 39, 60, -104);
        }
        class71.field970 = -1;
        class168.field2329 = 0;
        class18.field256 = 1;
        class68.field924 = 0;
        class297.field3976 = -3;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)V")
    public static void method1093(boolean arg0) {
        field2603 = null;
        field2597 = null;
        if (!arg0) {
            method1095(118, 93, 66, 114, -37, 94, -41, -86, (class261) null, 0, -114);
        }
        field2589 = null;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(IIIII)V")
    public static final void method1094(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2600++;
        if (class369.field5063 == 1) {
            class87.field1218[class175.field2392 / 100].method836(class171.field2349 - 8, class306.field4053 + -8);
        }
        if (class369.field5063 == 2) {
            class87.field1218[(class175.field2392 / 100) + 4].method836(class171.field2349 - 8, class306.field4053 - 8);
        }
        int var5 = -98 % ((arg1 - 57) / 39);
        class433.method2555(-528142201);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIIILdg;II)Z")
    public static final boolean method1095(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class261 arg8, int arg9, int arg10) {
        field2592++;
        int var11 = arg7;
        int var12 = arg0;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg7 - var13;
        int var16 = arg0 - var14;
        class65.field860[var13][var14] = 99;
        class173.field2376[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        if (arg1 != 9481) {
            field2589 = null;
        }
        class68.field933[var17] = arg7;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class203.field2752[var10001] = arg0;
        int[][] var19 = arg8.field3454;
        while (var26 != var18) {
            var11 = class68.field933[var18];
            var12 = class203.field2752[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            int var22 = var11 - arg8.field3451;
            int var23 = var12 - arg8.field3469;
            if (arg9 == -4) {
                if (arg5 == var11 && arg2 == var12) {
                    class114.field1712 = var12;
                    class216.field2911 = var11;
                    return true;
                }
            } else if (arg9 == -3) {
                if (class27.method160(arg6, var12, arg2, var11, -50, arg5, 2, arg10, 2)) {
                    class216.field2911 = var11;
                    class114.field1712 = var12;
                    return true;
                }
            } else if (arg9 == -2) {
                if (arg8.method1480(arg6, var11, 23160, arg2, 2, arg3, arg5, var12, 2, arg10)) {
                    class216.field2911 = var11;
                    class114.field1712 = var12;
                    return true;
                }
            } else if (arg9 == -1) {
                if (arg8.method1483(arg3, arg5, arg6, var11, arg2, arg1 ^ 0x35E8, arg10, var12, 2)) {
                    class216.field2911 = var11;
                    class114.field1712 = var12;
                    return true;
                }
            } else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
                if (arg8.method1472(2, arg5, true, arg9, arg2, arg4, var12, var11)) {
                    class216.field2911 = var11;
                    class114.field1712 = var12;
                    return true;
                }
            } else if (arg8.method1473(arg4, 2, var12, var11, arg9, 19348, arg2, arg5)) {
                class216.field2911 = var11;
                class114.field1712 = var12;
                return true;
            }
            int var25 = class173.field2376[var20][var21] + 1;
            if (var20 > 0 && class65.field860[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class68.field933[var26] = var11 - 1;
                class203.field2752[var26] = var12;
                class65.field860[var20 - 1][var21] = 2;
                var26 = var26 + 1 & 0xFFF;
                class173.field2376[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class65.field860[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class68.field933[var26] = var11 + 1;
                class203.field2752[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class65.field860[var20 + 1][var21] = 8;
                class173.field2376[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class65.field860[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class68.field933[var26] = var11;
                class203.field2752[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class65.field860[var20][var21 - 1] = 1;
                class173.field2376[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class65.field860[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class68.field933[var26] = var11;
                class203.field2752[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class65.field860[var20][var21 + 1] = 4;
                class173.field2376[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class65.field860[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class68.field933[var26] = var11 - 1;
                class203.field2752[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class65.field860[var20 - 1][var21 - 1] = 3;
                class173.field2376[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class65.field860[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class68.field933[var26] = var11 + 1;
                class203.field2752[var26] = var12 - 1;
                class65.field860[var20 + 1][var21 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class173.field2376[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class65.field860[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class68.field933[var26] = var11 - 1;
                class203.field2752[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class65.field860[var20 - 1][var21 + 1] = 6;
                class173.field2376[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class65.field860[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class68.field933[var26] = var11 + 1;
                class203.field2752[var26] = var12 + 1;
                class65.field860[var20 + 1][var21 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class173.field2376[var20 + 1][var21 + 1] = var25;
            }
        }
        class216.field2911 = var11;
        class114.field1712 = var12;
        return false;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([BLbk;I[I)Z")
    public final boolean method1096(byte[] arg0, class231 arg1, int arg2, int[] arg3) {
        field2602++;
        boolean var5 = true;
        if (arg2 != -2903) {
            this.field2593 = null;
        }
        int var6 = 0;
        class465 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field2598[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method1291((byte) -34, var9 >> 2, arg3);
                        } else {
                            var7 = arg1.method1289(arg3, var9 >> 2, 0);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2591[var8] = var7;
                        this.field2598[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class191() {
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([B)V")
    public class191(byte[] arg0) {
        this.field2593 = new byte[128];
        this.field2601 = new short[128];
        this.field2598 = new int[128];
        this.field2591 = new class465[128];
        this.field2604 = new byte[128];
        this.field2594 = new class42[128];
        this.field2588 = new byte[128];
        class32 var2 = new class32(arg0);
        int var3;
        for (var3 = 0; var2.field472[var2.field456 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method211(29861);
        }
        var3++;
        var2.field456++;
        int var6 = var2.field456;
        var2.field456 += var3;
        int var7;
        for (var7 = 0; var2.field472[var2.field456 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method211(29861);
        }
        var7++;
        var2.field456++;
        int var10 = var2.field456;
        var2.field456 += var7;
        int var11;
        for (var11 = 0; var2.field472[var2.field456 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method211(29861);
        }
        var11++;
        var2.field456++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method201((byte) -126);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var15 >= var18) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var11;
        }
        class42[] var19 = new class42[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class42 var103 = var19[var20] = new class42();
            int var104 = var2.method201((byte) -126);
            if (var104 > 0) {
                var103.field594 = new byte[var104 * 2];
            }
            int var105 = var2.method201((byte) -110);
            if (var105 > 0) {
                var103.field600 = new byte[var105 * 2 + 2];
                var103.field600[1] = 64;
            }
        }
        int var21 = var2.method201((byte) -123);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method201((byte) -117);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        int var25;
        for (var25 = 0; var2.field472[var2.field456 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method211(29861);
        }
        var2.field456++;
        var25++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method201((byte) -111);
            this.field2601[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method201((byte) -121);
            this.field2601[var31] = (short) (this.field2601[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 >= var26.length) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var2.method198((byte) -45);
            }
            this.field2601[var35] = (short) (this.field2601[var35] + class99.method612(32768, var34 - 1 << 14));
            this.field2598[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field2598[var39] != 0) {
                if (var37 == 0) {
                    if (var4.length <= var36) {
                        var37 = -1;
                    } else {
                        var37 = var4[var36++];
                    }
                    var38 = var2.field472[var6++] - 1;
                }
                this.field2593[var39] = (byte) var38;
                var37--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field2598[var43] != 0) {
                if (var41 == 0) {
                    if (var40 < var8.length) {
                        var41 = var8[var40++];
                    } else {
                        var41 = -1;
                    }
                    var42 = var2.field472[var10++] + 16 << 2;
                }
                var41--;
                this.field2588[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class42 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field2598[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var45 < var12.length) {
                        var44 = var12[var45++];
                    } else {
                        var44 = -1;
                    }
                }
                this.field2594[var47] = var46;
                var44--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var26.length <= var48) {
                    var49 = -1;
                } else {
                    var49 = var26[var48++];
                }
                if (this.field2598[var51] > 0) {
                    var50 = var2.method201((byte) -107) + 1;
                }
            }
            var49--;
            this.field2604[var51] = (byte) var50;
        }
        this.field2599 = var2.method201((byte) -106) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class42 var100 = var19[var52];
            if (var100.field594 != null) {
                for (int var101 = 1; var101 < var100.field594.length; var101 += 2) {
                    var100.field594[var101] = var2.method211(29861);
                }
            }
            if (var100.field600 != null) {
                for (int var102 = 3; var102 < (var100.field600.length - 2); var102 += 2) {
                    var100.field600[var102] = var2.method211(29861);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method211(29861);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method211(29861);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class42 var97 = var19[var55];
            if (var97.field600 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field600.length; var99 += 2) {
                    var98 += var2.method201((byte) -118) + 1;
                    var97.field600[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class42 var94 = var19[var56];
            if (var94.field594 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field594.length; var96 += 2) {
                    var95 = var95 + var2.method201((byte) -111) + 1;
                    var94.field594[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method201((byte) -117);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var2.method201((byte) -106) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field2604[var61] = (byte) (this.field2604[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class323.method1797(false, var67, var65 - var59);
                    this.field2604[var68] = (byte) (this.field2604[var68] * var69 + 32 >> 6);
                    var67 += var66 - var60;
                }
                var59 = var65;
                var62 += 2;
                var60 = var66;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field2604[var63] = (byte) (this.field2604[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method201((byte) -108);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 += var2.method201((byte) -121) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field2588[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field2588[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class323.method1797(false, var81, var79 - var72);
                    int var84 = (this.field2588[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field2588[var82] = (byte) var84;
                    var81 += var80 - var73;
                }
                var75 += 2;
                var72 = var79;
                var73 = var80;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field2588[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field2588[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field596 = var2.method201((byte) -107);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class42 var93 = var19[var87];
            if (var93.field594 != null) {
                var93.field598 = var2.method201((byte) -116);
            }
            if (var93.field600 != null) {
                var93.field592 = var2.method201((byte) -111);
            }
            if (var93.field596 > 0) {
                var93.field591 = var2.method201((byte) -126);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field599 = var2.method201((byte) -110);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class42 var92 = var19[var89];
            if (var92.field599 > 0) {
                var92.field590 = var2.method201((byte) -107);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class42 var91 = var19[var90];
            if (var91.field590 > 0) {
                var91.field589 = var2.method201((byte) -128);
            }
        }
    }

    static {
        new class206("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        field2603 = new class434(102, 12);
    }
}
