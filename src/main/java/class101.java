import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class101 extends class425 {

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "[I")
    public int[] field1277 = new int[] { -1 };

    @OriginalMember(owner = "client!vp", name = "v", descriptor = "[I")
    public int[] field1280 = new int[1];

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!vp", name = "t", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!vp", name = "u", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!vp", name = "w", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!vp", name = "x", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIZBII)V", line = 4)
    public static final void method587(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5) {
        if (arg5 < 1) {
            arg5 = 1;
        }
        if (arg1 < 1) {
            arg1 = 1;
        }
        field1282++;
        int var6 = arg1 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class287.field4186 - class131.field1908) * var6 / 100 + class131.field1908;
        if (class245.field3658 > var7) {
            var7 = class245.field3658;
        } else if (var7 > class356.field5148) {
            var7 = class356.field5148;
        }
        int var8 = arg1 * 512 * var7 / (arg5 * 334);
        int var9 = 12 / ((12 - arg3) / 40);
        if (var8 < class293.field4239) {
            short var13 = class293.field4239;
            var7 = var13 * 334 * arg5 / (arg1 * 512);
            if (class356.field5148 < var7) {
                var7 = class356.field5148;
                int var14 = arg1 * var7 * 512 / (var13 * 334);
                int var15 = (arg5 - var14) / 2;
                if (arg2) {
                    class59.field786.method931();
                    class59.field786.method1832(arg0, -16777216, var15, 1, arg4, arg1);
                    class59.field786.method1832(arg0 + arg5 - var15, -16777216, var15, 1, arg4, arg1);
                }
                arg5 -= var15 * 2;
                arg0 += var15;
            }
        } else if (var8 > class94.field1198) {
            short var10 = class94.field1198;
            var7 = arg5 * var10 * 334 / (arg1 * 512);
            if (class245.field3658 > var7) {
                var7 = class245.field3658;
                int var11 = var10 * 334 * arg5 / (var7 * 512);
                int var12 = (arg1 - var11) / 2;
                if (arg2) {
                    class59.field786.method931();
                    class59.field786.method1832(arg0, -16777216, arg5, 1, arg4, var12);
                    class59.field786.method1832(arg0, -16777216, arg5, 1, arg1 + arg4 - var12, var12);
                }
                arg1 -= var12 * 2;
                arg4 += var12;
            }
        }
        class411.field5897 = (short) arg1;
        class308.field4484 = (short) arg5;
        class396.field5573 = arg4;
        class359.field5181 = arg1 * var7 / 334;
        class127.field1766 = arg0;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIII)V", line = 103)
    public static final void method588(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class365.field5224 = arg4;
        if (arg1 == 28120) {
            class409.field5874 = arg3;
            field1275++;
            class241.field3555 = arg2;
            class213.field3011 = arg0;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)Llf;", line = 119)
    public static final class130 method589(boolean arg0) {
        field1278++;
        class130 var1 = new class130(38);
        var1.method831(15, (byte) 116);
        var1.method831(class355.field5139, (byte) 124);
        var1.method831(class399.field5615 ? 1 : 0, (byte) -31);
        var1.method831(class181.field2561 ? 1 : 0, (byte) 112);
        var1.method831(class247.field3703 ? 1 : 0, (byte) -100);
        var1.method831(class103.field1326 ? 1 : 0, (byte) 111);
        var1.method831(0, (byte) 117);
        var1.method831(class266.field3908 ? 1 : 0, (byte) 113);
        var1.method831(class189.field2714 ? 1 : 0, (byte) 123);
        var1.method831(class79.field1027 ? 1 : 0, (byte) 113);
        var1.method831(class194.field2802, (byte) -100);
        var1.method831(class120.field1626 ? 1 : 0, (byte) -66);
        var1.method831(class51.field664 ? 1 : 0, (byte) 127);
        var1.method831(class125.field1678 ? 1 : 0, (byte) -84);
        var1.method831(class26.field339, (byte) 120);
        var1.method831(class358.field5172 ? 1 : 0, (byte) 113);
        var1.method831(class266.field3910, (byte) -83);
        var1.method831(class131.field1914, (byte) -39);
        var1.method831(class170.field2398, (byte) 119);
        var1.method799(class291.field4225, 44);
        var1.method799(class145.field2183, 97);
        var1.method831(class270.method1842((byte) -63), (byte) 120);
        if (arg0) {
            return null;
        }
        var1.method849(class393.field5523, (byte) -73);
        var1.method831(class220.field3168, (byte) 117);
        var1.method831(class338.field4903 ? 1 : 0, (byte) 121);
        var1.method831(class24.field304 ? 1 : 0, (byte) 127);
        var1.method831(class68.field910, (byte) -37);
        var1.method831(class255.field3795 ? 1 : 0, (byte) -75);
        var1.method831(class84.field1077 ? 1 : 0, (byte) -78);
        var1.method831(class145.field2182, (byte) 125);
        var1.method831(class324.field4717 ? 1 : 0, (byte) 113);
        var1.method831(class374.field5319, (byte) 124);
        var1.method831(class70.field930, (byte) 111);
        return var1;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)Ldc;", line = 170)
    public static final class3 method590(int arg0, int arg1) {
        field1274++;
        class15 var2 = class197.field2819;
        class3 var3;
        synchronized (class197.field2819) {
            var3 = (class3) class197.field2819.method99(true, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class243.field3602.method643(32, arg1, true);
        class3 var5 = new class3();
        if (var4 != null) {
            var5.method5(true, new class130(var4));
        }
        var5.method11((byte) -97);
        class15 var6 = class197.field2819;
        synchronized (class197.field2819) {
            class197.field2819.method90(var5, (long) arg1, arg0 ^ arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 199)
    public static final boolean method591(int arg0, String arg1) {
        field1281++;
        if (arg1 == null) {
            return false;
        } else if (arg0 < 92) {
            return true;
        } else {
            for (int var2 = 0; var2 < class417.field5994; var2++) {
                if (arg1.equalsIgnoreCase(class289.field4207[var2])) {
                    return true;
                }
                if (arg1.equalsIgnoreCase(class266.field3905[var2])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z[I[III)J", line = 228)
    private final long method592(boolean arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        field1273++;
        long[] var6 = class86.field1116;
        long var7 = -1L;
        long var9 = var6[(int) (((long) (arg4 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var6[(int) ((var9 ^ (long) arg4) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = arg3; var13 < arg1.length; var13++) {
            long var17 = var6[(int) ((var11 ^ (long) (arg1[var13] >> 24)) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var6[(int) ((var17 ^ (long) (arg1[var13] >> 16)) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var6[(int) ((var19 ^ (long) (arg1[var13] >> 8)) & 0xFFL)] ^ var19 >>> 8;
            var11 = var6[(int) ((var21 ^ (long) arg1[var13]) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg2 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) ((var11 ^ (long) arg2[var14]) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg0 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIIILb;Lvq;ILcn;Z)Lni;", line = 271)
    public final class305 method593(int arg0, int arg1, int arg2, int arg3, int arg4, class183 arg5, class269 arg6, int arg7, class301 arg8, boolean arg9) {
        field1279++;
        class305 var11 = null;
        int var12 = arg0;
        class3 var13 = null;
        if (arg1 != -1) {
            var13 = method590(-1179708536, arg1);
        }
        int[] var14 = this.field1277;
        if (var13 != null && var13.field57 != null) {
            var14 = new int[var13.field57.length];
            for (int var15 = 0; var15 < var13.field57.length; var15++) {
                int var16 = var13.field57[var15];
                if (var16 >= 0 && this.field1277.length > var16) {
                    var14[var15] = this.field1277[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        int var20 = -1;
        int var21 = -1;
        int var22 = 0;
        class385 var23 = null;
        class385 var24 = null;
        if (arg5 != null) {
            var12 = arg0 | 0x20;
            int var25 = arg5.field2609[arg2];
            int var26 = var25 >>> 16;
            var23 = class226.method1583((byte) 13, var26);
            var20 = var25 & 0xFFFF;
            if (var23 != null) {
                var18 |= var23.method2444(var20, arg7 ^ 0xFFFFFD4A);
                var17 |= var23.method2447(var20, 0);
                var19 |= arg5.field2590;
            }
            if ((arg5.field2595 || class333.field4837) && arg3 != -1 && arg3 < arg5.field2609.length) {
                var22 = arg5.field2600[arg2];
                int var27 = arg5.field2609[arg3];
                int var28 = var27 >>> 16;
                var21 = var27 & 0xFFFF;
                if (var26 == var28) {
                    var24 = var23;
                } else {
                    var24 = class226.method1583((byte) 13, var21 >>> 16);
                }
                if (var24 != null) {
                    var18 |= var24.method2444(var21, arg7 - 694);
                    var17 |= var24.method2447(var21, 0);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
        }
        long var29 = this.method592(arg9, var14, arg8 == null ? null : arg8.field4395, 0, arg1);
        if (class419.field6011 != null) {
            var11 = (class305) class419.field6011.method99(true, var29);
        }
        if (var11 == null || arg6.method944(var11.method247(), var12) != 0) {
            if (var11 != null) {
                var12 = arg6.method863(var12, var11.method247());
            }
            int var31 = var12;
            boolean var32 = false;
            for (int var33 = 0; var33 < var14.length; var33++) {
                if (var14[var33] != -1 && !class167.method1202(true, var14[var33]).method2581(arg9, (byte) -52)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class406[] var34 = new class406[var14.length];
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1) {
                    var34[var35] = class167.method1202(true, var14[var35]).method2594((byte) 66, arg9);
                }
            }
            if (var13 != null && var13.field39 != null) {
                for (int var36 = 0; var36 < var13.field39.length; var36++) {
                    if (var13.field39[var36] != null && var34[var36] != null) {
                        int var37 = var13.field39[var36][0];
                        int var38 = var13.field39[var36][1];
                        int var39 = var13.field39[var36][2];
                        int var40 = var13.field39[var36][3];
                        int var41 = var13.field39[var36][4];
                        int var42 = var13.field39[var36][5];
                        if (var40 != 0 || var41 != 0 || var42 != 0) {
                            var34[var36].method2549(var40, var42, var41, arg7 ^ 0x7F);
                        }
                        if (var37 != 0 || var38 != 0 || var39 != 0) {
                            var34[var36].method2545(var38, var39, 4, var37);
                        }
                    }
                }
            }
            class406 var43 = new class406(var34, var34.length);
            if (arg8 != null) {
                var31 = var12 | 0x2000;
            }
            var11 = arg6.method905(var43, var31, class270.field3938, 64, 850);
            if (arg8 != null) {
                for (int var44 = 0; var44 < 5; var44++) {
                    if (class358.field5175[var44].length > arg8.field4395[var44]) {
                        var11.method196(class199.field2848[var44], class358.field5175[var44][arg8.field4395[var44]]);
                    }
                    if (class191.field2778[var44].length > arg8.field4395[var44]) {
                        var11.method196(class423.field6040[var44], class191.field2778[var44][arg8.field4395[var44]]);
                    }
                }
            }
            if (class419.field6011 != null) {
                var11.method233(var12);
                class419.field6011.method90(var11, var29, 0);
            }
        }
        if (arg5 == null || var23 == null) {
            return var11;
        } else {
            class305 var45 = var11.method200((byte) 1, var12, true);
            var45.method2056(0, var21, var23, var24, (byte) -82, var22, arg4 - arg7, arg5.field2590, var20);
            return var45;
        }
    }
}
