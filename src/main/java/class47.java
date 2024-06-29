import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class47 extends class17 {

    @OriginalMember(owner = "client!fm", name = "fb", descriptor = "I")
    public static int field696 = 0;

    @OriginalMember(owner = "client!fm", name = "db", descriptor = "Lsf;")
    public static class108 field694 = class140.method973(255, "settings");

    @OriginalMember(owner = "client!fm", name = "bb", descriptor = "[Z")
    public static boolean[] field692 = new boolean[100];

    @OriginalMember(owner = "client!fm", name = "ab", descriptor = "Z")
    public static boolean field691 = false;

    @OriginalMember(owner = "client!fm", name = "mb", descriptor = "Lsf;")
    private static class108 field703 = class140.method973(255, "flash1:");

    @OriginalMember(owner = "client!fm", name = "jb", descriptor = "Lsf;")
    public static class108 field700 = field703;

    @OriginalMember(owner = "client!fm", name = "kb", descriptor = "Lsf;")
    public static class108 field701 = field703;

    @OriginalMember(owner = "client!fm", name = "cb", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!fm", name = "eb", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!fm", name = "gb", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!fm", name = "hb", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!fm", name = "nb", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!fm", name = "ob", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!fm", name = "pb", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!fm", name = "lb", descriptor = "Lii;")
    public static class216 field702;

    @OriginalMember(owner = "client!fm", name = "ib", descriptor = "Z")
    public static boolean field699;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "(I)V", line = 17)
    public static void method331(int arg0) {
        field701 = null;
        field700 = null;
        if (arg0 < 1) {
            method332(71, (int[][]) ((int[][]) null), 94, (float[][]) ((float[][]) null), (int[][]) ((int[][]) null), (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), (int[][]) ((int[][]) null), (byte[][]) ((byte[][]) null), (byte[][]) ((byte[][]) null), (int[][]) ((int[][]) null), (byte[][][]) ((byte[][][]) null), (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), (int[][]) ((int[][]) null));
        }
        field703 = null;
        field694 = null;
        field702 = null;
        field692 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I[[II[[F[[I[[F[[B[[I[[B[[B[[I[[[B[[F[[B[[I)[Lcl;", line = 35)
    public static final class133[] method332(int arg0, int[][] arg1, int arg2, float[][] arg3, int[][] arg4, float[][] arg5, byte[][] arg6, int[][] arg7, byte[][] arg8, byte[][] arg9, int[][] arg10, byte[][][] arg11, float[][] arg12, byte[][] arg13, int[][] arg14) {
        field705++;
        int[][] var15 = new int[105][105];
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg9[var16][var17];
                if (var18 == 0) {
                    var18 = arg9[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg9[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg9[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class306 var19 = class131.method903(-15, (var18 & 0xFF) - 1);
                    var15[var16][var17] = (var19.field5333 + 1 << 16) + var19.field5326;
                }
            }
        }
        class242 var20 = new class242(128);
        for (int var21 = 1; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg9[var21][var22] != 0) {
                    int[] var23;
                    if (arg13[var21][var22] == 0) {
                        var23 = class14.field166[0];
                    } else {
                        var23 = class210.field3760[arg8[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = 0;
                    int var25 = var15[var21][var22 + 1];
                    int var26 = var15[var21 + 1][var22 + 1];
                    if (arg10 != null) {
                        var24 = arg10[var21][var22] & 0xFFFFFF;
                    }
                    int var27 = var15[var21 + 1][var22];
                    int var28 = var15[var21][var22];
                    long var29 = (long) var24 | (long) var28 << 32;
                    long var31 = (long) var27 << 32 | (long) var24;
                    long var33 = (long) var26 << 32 | (long) var24;
                    long var35 = (long) var25 << 32 | (long) var24;
                    int var37 = var23.length / 2;
                    class133 var38 = (class133) var20.method1676(var29, (byte) -75);
                    if (var38 == null) {
                        var38 = new class133((var28 >> 16) - 1, (float) (var28 & 0xFFFF), false, arg14 != null, var24);
                        var20.method1681(arg0 - 8941, var38, var29);
                    }
                    var38.field2277++;
                    var38.field2278 += var37;
                    if (var29 != var31) {
                        class133 var39 = (class133) var20.method1676(var31, (byte) -110);
                        if (var39 == null) {
                            var39 = new class133((var27 >> 16) - 1, (float) (var27 & 0xFFFF), false, arg14 != null, var24);
                            var20.method1681(1, var39, var31);
                        }
                        var39.field2278 += var37;
                        var39.field2277++;
                    }
                    if (var29 != var33 && var31 != var33) {
                        class133 var40 = (class133) var20.method1676(var33, (byte) -71);
                        if (var40 == null) {
                            var40 = new class133((var26 >> 16) - 1, (float) (var26 & 0xFFFF), false, arg14 != null, var24);
                            var20.method1681(1, var40, var33);
                        }
                        var40.field2278 += var37;
                        var40.field2277++;
                    }
                    if (var29 != var35 && var31 != var35 && var33 != var35) {
                        class133 var41 = (class133) var20.method1676(var35, (byte) -104);
                        if (var41 == null) {
                            var41 = new class133((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg14 != null, var24);
                            var20.method1681(arg0 ^ 0x22EF, var41, var35);
                        }
                        var41.field2277++;
                        var41.field2278 += var37;
                    }
                }
            }
        }
        for (class133 var42 = (class133) var20.method1672(arg0 ^ arg0); var42 != null; var42 = (class133) var20.method1678(5)) {
            var42.method913();
        }
        for (int var43 = 1; var43 <= 102; var43++) {
            for (int var44 = 1; var44 <= 102; var44++) {
                byte var45 = arg9[var43][var44];
                if (var45 != 0) {
                    int var46;
                    if ((arg11[arg2][var43][var44] & 0x8) != 0) {
                        var46 = 0;
                    } else if ((arg11[1][var43][var44] & 0x2) == 2 && arg2 > 0) {
                        var46 = arg2 - 1;
                    } else {
                        var46 = arg2;
                    }
                    int var47 = 0;
                    int var48 = 128;
                    if (arg10 != null) {
                        var47 = arg10[var43][var44] & 0xFFFFFF;
                        var48 = arg10[var43][var44] >>> 24 << 3;
                    }
                    boolean[] var49 = null;
                    int[] var58;
                    byte var61;
                    if (arg13[var43][var44] == 0) {
                        byte var50 = 0;
                        int var51 = var50 + (arg9[var43 - 1][var44 - 1] == var45 ? 1 : -1);
                        byte var52 = 0;
                        byte var53 = 0;
                        byte var54 = 0;
                        int var55 = var54 + (arg9[var43 + 1][var44 - 1] == var45 ? 1 : -1);
                        int var56 = var52 + (arg9[var43 - 1][var44 + 1] == var45 ? 1 : -1);
                        int var57 = var53 + (arg9[var43 + 1][var44 + 1] == var45 ? 1 : -1);
                        if (arg9[var43][var44 - 1] == var45) {
                            var55++;
                            var51++;
                        } else {
                            var51--;
                            var55--;
                        }
                        var58 = class14.field166[0];
                        if (arg9[var43 + 1][var44] == var45) {
                            var57++;
                            var55++;
                        } else {
                            var57--;
                            var55--;
                        }
                        if (arg9[var43][var44 + 1] == var45) {
                            var56++;
                            var57++;
                        } else {
                            var57--;
                            var56--;
                        }
                        if (arg9[var43 - 1][var44] == var45) {
                            var51++;
                            var56++;
                        } else {
                            var51--;
                            var56--;
                        }
                        int var59 = var51 - var57;
                        int var60 = var55 - var56;
                        if (var60 < 0) {
                            var60 = -var60;
                        }
                        if (var59 < 0) {
                            var59 = -var59;
                        }
                        var61 = (byte) (var59 >= var60 ? 0 : 1);
                        arg6[var43][var44] = var61;
                    } else {
                        var49 = class114.field1973[arg8[var43][var44]];
                        var58 = class210.field3760[arg8[var43][var44]];
                        var61 = arg6[var43][var44];
                        if (var58.length == 0) {
                            continue;
                        }
                    }
                    int var62 = var15[var43][var44];
                    int var63 = var15[var43 + 1][var44 + 1];
                    int var64 = var15[var43 + 1][var44];
                    long var65 = (long) var62 << 32 | (long) var47;
                    long var67 = (long) var64 << 32 | (long) var47;
                    int var69 = arg7[var43 + 1][var44];
                    int var70 = var15[var43][var44 + 1];
                    long var71 = (long) var47 | (long) var63 << 32;
                    int var73 = arg7[var43][var44];
                    long var74 = (long) var47 | (long) var70 << 32;
                    int var76 = arg1[var43 + 1][var44];
                    int var77 = arg1[var43 + 1][var44 + 1];
                    int var78 = (var62 >> 16) - 1;
                    int var79 = arg1[var43][var44];
                    int var80 = (var64 >> 16) - 1;
                    int var81 = arg7[var43][var44 + 1];
                    int var82 = arg7[var43 + 1][var44 + 1];
                    int var83 = (var63 >> 16) - 1;
                    int var84 = arg1[var43][var44 + 1];
                    int var85 = (var70 >> 16) - 1;
                    class133 var86 = (class133) var20.method1676(var65, (byte) -81);
                    class195.method1391(class73.method485(var76, true, var69, var78), arg4, var70 >= var62, arg14, arg12, var46, var86, var61, class73.method485(var79, true, var73, var78), var64 >= var62, var49, arg5, 255, var44, arg3, var58, var48, var43, class73.method485(var84, true, var81, var78), var63 >= var62, class73.method485(var77, true, var82, var78), var62 <= var62);
                    if (var65 != var67) {
                        class133 var87 = (class133) var20.method1676(var67, (byte) -121);
                        class195.method1391(class73.method485(var76, true, var69, var80), arg4, var64 <= var70, arg14, arg12, var46, var87, var61, class73.method485(var79, true, var73, var80), var64 <= var64, var49, arg5, 255, var44, arg3, var58, var48, var43, class73.method485(var84, true, var81, var80), var64 <= var63, class73.method485(var77, true, var82, var80), var62 >= var64);
                    }
                    if (var65 != var71 && var67 != var71) {
                        class133 var88 = (class133) var20.method1676(var71, (byte) -72);
                        class195.method1391(class73.method485(var76, true, var69, var83), arg4, var70 >= var63, arg14, arg12, var46, var88, var61, class73.method485(var79, true, var73, var83), var64 >= var63, var49, arg5, 255, var44, arg3, var58, var48, var43, class73.method485(var84, true, var81, var83), var63 >= var63, class73.method485(var77, true, var82, var83), var62 >= var63);
                    }
                    if (var65 != var74 && var67 != var74 && var71 != var74) {
                        class133 var89 = (class133) var20.method1676(var74, (byte) -99);
                        class195.method1391(class73.method485(var76, true, var69, var85), arg4, var70 >= var70, arg14, arg12, var46, var89, var61, class73.method485(var79, true, var73, var85), var64 >= var70, var49, arg5, 255, var44, arg3, var58, var48, var43, class73.method485(var84, true, var81, var85), var63 >= var70, class73.method485(var77, true, var82, var85), var62 >= var70);
                    }
                }
            }
        }
        for (class133 var90 = (class133) var20.method1672(0); var90 != null; var90 = (class133) var20.method1678(-128)) {
            if (var90.field2292 == 0) {
                var90.method1325(0);
            } else {
                var90.method916();
            }
        }
        int var91 = var20.method1675(true);
        class133[] var92 = new class133[var91];
        var20.method1683(var92, (byte) 113);
        long[] var93 = new long[var91];
        for (int var94 = 0; var94 < var91; var94++) {
            var93[var94] = var92[var94].field3375;
        }
        class143.method984(var92, var93, 128);
        return var92;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIIII)V", line = 427)
    public static final void method333(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != -6662) {
            return;
        }
        field695++;
        if (arg6 < 1 || arg1 < 1 || arg6 > 102 || arg1 > 102) {
            return;
        }
        if (!class251.method1774(903) && (class166.field2980[0][arg6][arg1] & 0x2) == 0) {
            int var8 = arg5;
            if ((class166.field2980[arg5][arg6][arg1] & 0x8) != 0) {
                var8 = 0;
            }
            if (class90.field1416 != var8) {
                return;
            }
        }
        int var9 = arg5;
        if (arg5 < 3 && (class166.field2980[1][arg6][arg1] & 0x2) == 2) {
            var9 = arg5 + 1;
        }
        class280.method2010(arg5, (byte) -107, var9, arg1, arg3, class330.field5644[arg5], arg6);
        if (arg7 >= 0) {
            boolean var10 = class137.field2427;
            class137.field2427 = true;
            class312.method2173(arg7, arg2, class330.field5644[arg5], arg5, var9, arg1, false, false, arg0, 0, arg6);
            class137.field2427 = var10;
        }
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(II)[I", line = 477)
    public final int[] method120(int arg0, int arg1) {
        if (arg0 > -95) {
            return (int[]) null;
        }
        int[] var3 = this.field217.method1698(-78, arg1);
        field698++;
        if (this.field217.field4295) {
            for (int var4 = 0; var4 < class116.field2008; var4++) {
                this.method334(arg1, false, var4);
                int[] var5 = this.method124(92, 0, class120.field2061);
                var3[var4] = var5[class219.field3895];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BLrm;I)V", line = 521)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        if (arg0 != -114) {
            this.method334(-84, false, -22);
        }
        field693++;
        if (arg2 == 0) {
            this.field225 = arg1.method1731(true) == 1;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZI)[[I", line = 543)
    public final int[][] method122(boolean arg0, int arg1) {
        int[][] var3 = this.field224.method2081(arg1, -101);
        field697++;
        if (this.field224.field5106) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class116.field2008; var7++) {
                this.method334(arg1, false, var7);
                int[][] var8 = this.method111(3, class120.field2061, 0);
                var4[var7] = var8[0][class219.field3895];
                var5[var7] = var8[1][class219.field3895];
                var6[var7] = var8[2][class219.field3895];
            }
        }
        return arg0 ? (int[][]) ((int[][]) null) : var3;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZI)V", line = 582)
    private final void method334(int arg0, boolean arg1, int arg2) {
        field706++;
        int var4 = class61.field979[arg2];
        int var5 = class36.field504[arg0];
        if (arg1) {
            return;
        }
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class120.field2061 = arg0;
            class219.field3895 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && -2.356194490192345D <= (double) var6) {
            class120.field2061 = arg2;
            class219.field3895 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class120.field2061 = arg2;
            class219.field3895 = class116.field2008 - arg0;
        } else if (var6 <= 0.0F && -0.7853981633974483D <= (double) var6) {
            class219.field3895 = arg2;
            class120.field2061 = class289.field5059 - arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class219.field3895 = class116.field2008 - arg2;
            class120.field2061 = class289.field5059 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class120.field2061 = class289.field5059 - arg2;
            class219.field3895 = class116.field2008 - arg0;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class120.field2061 = class289.field5059 - arg2;
            class219.field3895 = arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class219.field3895 = class116.field2008 - arg2;
            class120.field2061 = arg0;
        }
        class120.field2061 &= class219.field3899;
        class219.field3895 &= class249.field4327;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V", line = 656)
    public class47() {
        super(1, false);
    }
}
