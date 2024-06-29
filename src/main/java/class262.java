import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class262 extends class3 {

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "Lok;")
    public static class41 field4168 = class137.method956("Gegenstand f-Ur Mitglieder", 45);

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
    public static int field4171 = 3;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "[B")
    public static byte[] field4166;

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "Lbc;")
    public static class302 field4163;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "Lok;")
    public class41 field4154;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "[I")
    public int[] field4155;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "[I")
    public int[] field4156;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "[I")
    public int[] field4157;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "[I")
    public int[] field4167;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[Lok;I)Lok;", line = 19)
    public static final class41 method1839(int arg0, int arg1, class41[] arg2, int arg3) {
        field4159++;
        int var4 = 0;
        if (arg1 != 4961) {
            return (class41) null;
        }
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg2[arg3 + var5] == null) {
                arg2[arg3 + var5] = class125.field1856;
            }
            var4 += arg2[arg3 + var5].field617;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; var8 < arg0; var8++) {
            class41 var9 = arg2[arg3 + var8];
            class21.method144(var9.field660, 0, var7, var6, var9.field617);
            var6 += var9.field617;
        }
        class41 var10 = new class41();
        var10.field617 = var4;
        var10.field660 = var7;
        return var10;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BILlb;)V", line = 76)
    private final void method1840(byte arg0, int arg1, class112 arg2) {
        if (arg1 == 1) {
            this.field4154 = arg2.method763(true);
        } else if (arg1 == 2) {
            int var7 = arg2.method792(2);
            this.field4167 = new int[var7];
            this.field4157 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4157[var8] = arg2.method759((byte) -76);
                int var9 = arg2.method792(2);
                if (var9 == 0) {
                    this.field4167[var8] = -1;
                } else {
                    this.field4167[var8] = var9;
                }
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method792(2);
            this.field4156 = new int[var4];
            this.field4155 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4155[var5] = arg2.method759((byte) -92);
                int var6 = arg2.method792(2);
                if (var6 == 0) {
                    this.field4156[var5] = -1;
                } else {
                    this.field4156[var5] = var6;
                }
            }
        } else if (arg1 == 4) {
        }
        if (arg0 > -85) {
            method1839(-124, -108, (class41[]) null, -30);
        }
        field4152++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)Lok;", line = 147)
    public static final class41 method1841(int arg0, int arg1) {
        field4162++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        class41 var2 = new class41();
        var2.field617 = 1;
        var2.field660 = new byte[1];
        var2.field660[arg1] = (byte) arg0;
        return var2;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZI)I", line = 170)
    public final int method1842(boolean arg0, int arg1) {
        field4172++;
        if (this.field4157 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field4157.length; var3++) {
            if (this.field4167[var3] == arg1) {
                return this.field4157[var3];
            }
        }
        if (!arg0) {
            this.field4156 = (int[]) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lok;ILok;I)V", line = 194)
    public static final void method1843(class41 arg0, int arg1, class41 arg2, int arg3) {
        field4161++;
        if (arg3 > 42) {
            class107.method728(201, arg2, -1, arg0, arg1, (class41) null);
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Llb;I)V", line = 215)
    public final void method1844(class112 arg0, int arg1) {
        field4158++;
        if (arg1 != 127406160) {
            this.method1844((class112) null, -111);
        }
        while (true) {
            int var3 = arg0.method792(2);
            if (var3 == 0) {
                return;
            }
            this.method1840((byte) -118, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V", line = 238)
    public static void method1845(int arg0) {
        field4168 = null;
        if (arg0 != 0) {
            method1845(-36);
        }
        field4166 = null;
        field4163 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B[[I[[B[[I[[I[[B[[B[[I[[BI[[F[[I[[F[[[B[[F)[Ldg;", line = 251)
    public static final class6[] method1846(byte arg0, int[][] arg1, byte[][] arg2, int[][] arg3, int[][] arg4, byte[][] arg5, byte[][] arg6, int[][] arg7, byte[][] arg8, int arg9, float[][] arg10, int[][] arg11, float[][] arg12, byte[][][] arg13, float[][] arg14) {
        int[][] var15 = new int[105][105];
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg6[var16][var17];
                if (var18 == 0) {
                    var18 = arg6[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg6[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg6[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class266 var19 = class268.method1901((var18 & 0xFF) - 1, (byte) -113);
                    var15[var16][var17] = (var19.field4229 + 1 << 16) + var19.field4215;
                }
            }
        }
        field4169++;
        class86 var20 = new class86(128);
        for (int var21 = 1; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg6[var21][var22] != 0) {
                    int[] var23;
                    if (arg8[var21][var22] == 0) {
                        var23 = class301.field4884[0];
                    } else {
                        var23 = class70.field1062[arg2[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = 0;
                    int var25 = var15[var21 + 1][var22];
                    int var26 = var15[var21][var22];
                    if (arg3 != null) {
                        var24 = arg3[var21][var22] & 0xFFFFFF;
                    }
                    int var27 = var15[var21 + 1][var22 + 1];
                    int var28 = var15[var21][var22 + 1];
                    long var29 = (long) var24 | (long) var26 << 32;
                    long var31 = (long) var24 | (long) var25 << 32;
                    long var33 = (long) var24 | (long) var27 << 32;
                    int var35 = var23.length / 2;
                    class6 var36 = (class6) var20.method617(var29, false);
                    if (var36 == null) {
                        var36 = new class6((var26 >> 16) - 1, (float) (var26 & 0xFFFF), false, arg1 != null, var24);
                        var20.method610(115, var36, var29);
                    }
                    var36.field93 += var35;
                    var36.field87++;
                    if (var29 != var31) {
                        class6 var37 = (class6) var20.method617(var31, false);
                        if (var37 == null) {
                            var37 = new class6((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg1 != null, var24);
                            var20.method610(arg0 - 9, var37, var31);
                        }
                        var37.field87++;
                        var37.field93 += var35;
                    }
                    if (var29 != var33 && var31 != var33) {
                        class6 var38 = (class6) var20.method617(var33, false);
                        if (var38 == null) {
                            var38 = new class6((var27 >> 16) - 1, (float) (var27 & 0xFFFF), false, arg1 != null, var24);
                            var20.method610(arg0 ^ 0x1, var38, var33);
                        }
                        var38.field87++;
                        var38.field93 += var35;
                    }
                    long var39 = (long) var28 << 32 | (long) var24;
                    if (var29 != var39 && var31 != var39 && var33 != var39) {
                        class6 var41 = (class6) var20.method617(var39, false);
                        if (var41 == null) {
                            var41 = new class6((var28 >> 16) - 1, (float) (var28 & 0xFFFF), false, arg1 != null, var24);
                            var20.method610(arg0 ^ 0x1E, var41, var39);
                        }
                        var41.field93 += var35;
                        var41.field87++;
                    }
                }
            }
        }
        for (class6 var42 = (class6) var20.method609(26); var42 != null; var42 = (class6) var20.method616(arg0 ^ 0xB)) {
            var42.method21();
        }
        if (arg0 != 120) {
            method1847((byte[]) null, (byte) -31);
        }
        for (int var43 = 1; var43 <= 102; var43++) {
            for (int var44 = 1; var44 <= 102; var44++) {
                if (arg6[var43][var44] != 0) {
                    int var45;
                    if ((arg13[arg9][var43][var44] & 0x8) != 0) {
                        var45 = 0;
                    } else if ((arg13[1][var43][var44] & 0x2) == 2 && arg9 > 0) {
                        var45 = arg9 - 1;
                    } else {
                        var45 = arg9;
                    }
                    int var46 = 0;
                    int var47 = 128;
                    if (arg3 != null) {
                        var46 = arg3[var43][var44] & 0xFFFFFF;
                        var47 = arg3[var43][var44] >>> 24 << 3;
                    }
                    boolean[] var48 = null;
                    int[] var49;
                    byte var50;
                    if (arg8[var43][var44] == 0) {
                        var49 = class301.field4884[0];
                        var50 = 0;
                    } else {
                        var50 = arg5[var43][var44];
                        var49 = class70.field1062[arg2[var43][var44]];
                        var48 = class176.field2856[arg2[var43][var44]];
                        if (var49.length == 0) {
                            continue;
                        }
                    }
                    int var51 = var15[var43][var44];
                    int var52 = var15[var43 + 1][var44 + 1];
                    int var53 = var15[var43 + 1][var44];
                    int var54 = var15[var43][var44 + 1];
                    long var55 = (long) var46 | (long) var51 << 32;
                    long var57 = (long) var46 | (long) var54 << 32;
                    int var59 = arg7[var43][var44];
                    long var60 = (long) var52 << 32 | (long) var46;
                    long var62 = (long) var53 << 32 | (long) var46;
                    int var64 = arg7[var43 + 1][var44];
                    int var65 = arg7[var43 + 1][var44 + 1];
                    int var66 = arg7[var43][var44 + 1];
                    int var67 = arg4[var43][var44];
                    int var68 = arg4[var43 + 1][var44];
                    int var69 = arg4[var43][var44 + 1];
                    int var70 = (var51 >> 16) - 1;
                    int var71 = arg4[var43 + 1][var44 + 1];
                    int var72 = (var53 >> 16) - 1;
                    int var73 = (var54 >> 16) - 1;
                    int var74 = (var52 >> 16) - 1;
                    class6 var75 = (class6) var20.method617(var55, false);
                    class177.method1267(var43, var75, var51 >= var51, arg11, var49, arg14, var44, class221.method1586(var70, var68, var64, 91), var52 >= var51, var54 >= var51, var51 <= var53, 255, var45, class221.method1586(var70, var69, var66, 65), arg12, var50, var47, var48, arg1, class221.method1586(var70, var71, var65, 62), class221.method1586(var70, var67, var59, arg0 ^ 0x34), arg10);
                    if (var55 != var62) {
                        class6 var76 = (class6) var20.method617(var62, false);
                        class177.method1267(var43, var76, var51 >= var53, arg11, var49, arg14, var44, class221.method1586(var72, var68, var64, 76), var53 <= var52, var54 >= var53, var53 >= var53, 255, var45, class221.method1586(var72, var69, var66, 107), arg12, var50, var47, var48, arg1, class221.method1586(var72, var71, var65, 73), class221.method1586(var72, var67, var59, 92), arg10);
                    }
                    if (var55 != var60 && var60 != var62) {
                        class6 var77 = (class6) var20.method617(var60, false);
                        class177.method1267(var43, var77, var52 <= var51, arg11, var49, arg14, var44, class221.method1586(var74, var68, var64, 57), var52 <= var52, var52 <= var54, var53 >= var52, 255, var45, class221.method1586(var74, var69, var66, 76), arg12, var50, var47, var48, arg1, class221.method1586(var74, var71, var65, arg0 ^ 0x44), class221.method1586(var74, var67, var59, 114), arg10);
                    }
                    if (var55 != var57 && var57 != var62 && var57 != var60) {
                        class6 var78 = (class6) var20.method617(var57, false);
                        class177.method1267(var43, var78, var51 >= var54, arg11, var49, arg14, var44, class221.method1586(var73, var68, var64, 123), var52 >= var54, var54 <= var54, var53 >= var54, 255, var45, class221.method1586(var73, var69, var66, 82), arg12, var50, var47, var48, arg1, class221.method1586(var73, var71, var65, 110), class221.method1586(var73, var67, var59, 59), arg10);
                    }
                }
            }
        }
        for (class6 var79 = (class6) var20.method609(117); var79 != null; var79 = (class6) var20.method616(-89)) {
            if (var79.field81 == 0) {
                var79.method418(6971);
            } else {
                var79.method26();
            }
        }
        int var80 = var20.method614(-25);
        class6[] var81 = new class6[var80];
        long[] var82 = new long[var80];
        var20.method612(128, var81);
        for (int var83 = 0; var83 < var80; var83++) {
            var82[var83] = var81[var83].field844;
        }
        class130.method919(var81, 1, var82);
        return var81;
    }

    static {
        int var0 = 0;
        field4166 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field4166[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([BB)Ldk;", line = 575)
    public static final class253 method1847(byte[] arg0, byte arg1) {
        field4153++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != -121) {
            field4166 = (byte[]) null;
        }
        class253 var2;
        if (class166.field2625) {
            var2 = new class280(arg0, class95.field1412, class314.field5288, class69.field1040, class173.field2812, class223.field3562);
        } else {
            var2 = new class82(arg0, class95.field1412, class314.field5288, class69.field1040, class173.field2812, class223.field3562);
        }
        class286.method2005((byte) -9);
        return var2;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V", line = 597)
    public final void method1848(byte arg0) {
        if (arg0 > -98) {
            this.field4167 = (int[]) null;
        }
        if (this.field4155 != null) {
            for (int var2 = 0; var2 < this.field4155.length; var2++) {
                this.field4155[var2] = class255.method1813(this.field4155[var2], 32768);
            }
        }
        if (this.field4157 != null) {
            for (int var3 = 0; var3 < this.field4157.length; var3++) {
                this.field4157[var3] = class255.method1813(this.field4157[var3], 32768);
            }
        }
        field4160++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZIJIILok;I)V", line = 625)
    public static final void method1849(boolean arg0, int arg1, long arg2, int arg3, int arg4, class41 arg5, int arg6) {
        field4164++;
        if (!arg0) {
            method1843((class41) null, 43, (class41) null, -60);
        }
        class112 var8 = new class112(128);
        var8.method797(10, -22096);
        var8.method778((int) (Math.random() * 99999.0D), (byte) -4);
        var8.method778(520, (byte) -4);
        var8.method800(arg2, (byte) -113);
        var8.method787(853918096, (int) (Math.random() * 9.9999999E7D));
        var8.method776(341440880, arg5);
        var8.method787(853918096, (int) (Math.random() * 9.9999999E7D));
        var8.method778(class255.field4096, (byte) -4);
        var8.method797(arg4, -22096);
        var8.method797(arg3, -22096);
        var8.method787(853918096, (int) (Math.random() * 9.9999999E7D));
        var8.method778(arg6, (byte) -4);
        var8.method778(arg1, (byte) -4);
        var8.method787(853918096, (int) (Math.random() * 9.9999999E7D));
        var8.method786(class210.field3378, class235.field3764, 0);
        class285.field4642.field1640 = 0;
        class285.field4642.method797(96, -22096);
        class285.field4642.method797(var8.field1640, -22096);
        class285.field4642.method813(var8.field1640, 0, var8.field1607, -1);
        class32.field479 = 1;
        class167.field2656 = 0;
        class32.field471 = -3;
        class130.field1947 = 0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)I", line = 664)
    public final int method1850(byte arg0, int arg1) {
        field4170++;
        if (this.field4155 == null) {
            return -1;
        }
        if (arg0 != 5) {
            this.field4156 = (int[]) null;
        }
        for (int var3 = 0; var3 < this.field4155.length; var3++) {
            if (this.field4156[var3] == arg1) {
                return this.field4155[var3];
            }
        }
        return -1;
    }
}
