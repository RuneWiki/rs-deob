import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class239 extends class35 {

    @OriginalMember(owner = "client!ll", name = "G", descriptor = "[S")
    public short[] field3747;

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "[B")
    public byte[] field3734;

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "[B")
    public byte[] field3739;

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "[I")
    private int[] field3737;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "[B")
    public byte[] field3733;

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "[Llj;")
    public class5[] field3746;

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "[Lrb;")
    public class118[] field3732;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
    public int field3731;

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "Ljava/lang/String;")
    public static String field3735 = "Walk here";

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "I")
    public static int field3741 = -1;

    @OriginalMember(owner = "client!ll", name = "D", descriptor = "Ljava/lang/String;")
    public static String field3745 = "red:";

    @OriginalMember(owner = "client!ll", name = "C", descriptor = "J")
    public static long field3744 = 0L;

    @OriginalMember(owner = "client!ll", name = "I", descriptor = "Ljava/lang/String;")
    public static String field3749 = "purple:";

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!ll", name = "A", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!ll", name = "H", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!ll", name = "B", descriptor = "Lbm;")
    public static class307 field3743;

    @OriginalMember(owner = "client!ll", name = "w", descriptor = "[[[Lmj;")
    public static class47[][][] field3738;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IILbm;I)[Loj;", line = 9)
    public static final class283[] method1583(int arg0, int arg1, class307 arg2, int arg3) {
        field3736++;
        if (arg0 != 128) {
            method1584((byte) -34);
        }
        return class135.method885(arg3, arg2, -10948, arg1) ? class244.method1614(255) : null;
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(B)V", line = 23)
    public static void method1584(byte arg0) {
        if (arg0 >= -120) {
            field3749 = (String) null;
        }
        field3745 = null;
        field3743 = null;
        field3749 = null;
        field3735 = null;
        field3738 = (class47[][][]) null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "([ILjh;Z[B)Z", line = 37)
    public final boolean method1585(int[] arg0, class244 arg1, boolean arg2, byte[] arg3) {
        field3750++;
        boolean var5 = arg2;
        class5 var6 = null;
        int var7 = 0;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field3737[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg1.method1619(var9 >> 2, arg0, 9798);
                        } else {
                            var6 = arg1.method1613((byte) 26, var9 >> 2, arg0);
                        }
                        if (var6 == null) {
                            var5 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field3746[var8] = var6;
                        this.field3737[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(Z)I", line = 95)
    public static final int method1586(boolean arg0) {
        field3730++;
        if (class24.field485) {
            return 0;
        } else if (class19.method127(-125)) {
            if (!arg0) {
                method1587(-47, -31, 76, -95, 69, -56, 58, -55);
            }
            return class104.field1794 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIIII)V", line = 125)
    public static final void method1587(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3740++;
        if (arg2 < 128 || arg3 < 128 || arg2 > 13056 || arg3 > 13056) {
            class132.field2233 = -1;
            class24.field476 = -1;
            return;
        }
        int var8 = class325.method2250(arg3, 22771, class289.field4438, arg2) - arg4;
        int var9 = arg3 - class283.field4381;
        int var10 = arg2 - class38.field742;
        int var11 = var8 - class132.field2232;
        int var12 = class284.field4395[class43.field820];
        int var13 = class284.field4398[class43.field820];
        int var14 = class284.field4398[class131.field2213];
        int var15 = class284.field4395[class131.field2213];
        int var16 = var9 * var15 + var10 * var14 >> 16;
        int var17 = var9 * var14 - (var10 * var15) >> 16;
        int var19 = var11 * var13 - var12 * var17 >> 16;
        int var20 = var11 * var12 + (var13 * var17) >> 16;
        if (var20 < 50) {
            class132.field2233 = -1;
            class24.field476 = -1;
        } else if (class249.field3893) {
            int var22 = arg7 * 512 >> 8;
            class132.field2233 = arg5 + (var16 * var22 / var20);
            int var23 = arg0 * 512 >> 8;
            class24.field476 = var19 * var23 / var20 + arg6;
        } else {
            class24.field476 = (var19 << 9) / var20 + arg6;
            class132.field2233 = (var16 << 9) / var20 + arg5;
        }
        if (arg1 != -10452) {
            method1583(113, 18, (class307) null, -90);
        }
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(Z)V", line = 189)
    public final void method1588(boolean arg0) {
        this.field3737 = null;
        if (arg0) {
            this.field3731 = 25;
        }
        field3742++;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V", line = 211)
    public class239() {
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "([B)V", line = 214)
    public class239(byte[] arg0) {
        this.field3747 = new short[128];
        this.field3734 = new byte[128];
        this.field3739 = new byte[128];
        this.field3737 = new int[128];
        this.field3733 = new byte[128];
        this.field3746 = new class5[128];
        this.field3732 = new class118[128];
        class202 var2 = new class202(arg0);
        int var3;
        for (var3 = 0; var2.field3273[var2.field3249 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1333(-125);
        }
        var2.field3249++;
        int var6 = var2.field3249;
        var3++;
        int var7 = 0;
        var2.field3249 += var3;
        while (var2.field3273[var2.field3249 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1333(-127);
        }
        var7++;
        var2.field3249++;
        int var10 = var2.field3249;
        var2.field3249 += var7;
        int var11;
        for (var11 = 0; var2.field3273[var2.field3249 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1333(-128);
        }
        var2.field3249++;
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
                int var18 = var2.method1317((byte) -113);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var18) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        }
        class118[] var19 = new class118[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class118 var21 = var19[var20] = new class118();
            int var22 = var2.method1317((byte) -118);
            if (var22 > 0) {
                var21.field2055 = new byte[var22 * 2];
            }
            int var23 = var2.method1317((byte) -103);
            if (var23 > 0) {
                var21.field2052 = new byte[var23 * 2 + 2];
                var21.field2052[1] = 64;
            }
        }
        int var24 = var2.method1317((byte) -79);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        int var26 = var2.method1317((byte) -95);
        int var27;
        for (var27 = 0; var2.field3273[var2.field3249 + var27] != 0; var27++) {
        }
        byte[] var28 = new byte[var27];
        byte[] var29 = var26 > 0 ? new byte[var26 * 2] : null;
        for (int var30 = 0; var30 < var27; var30++) {
            var28[var30] = var2.method1333(-126);
        }
        var27++;
        var2.field3249++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var2.method1317((byte) -71);
            this.field3747[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var2.method1317((byte) -72);
            this.field3747[var34] = (short) (this.field3747[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var37 >= var28.length) {
                    var35 = -1;
                } else {
                    var35 = var28[var37++];
                }
                var36 = var2.method1295((byte) -118);
            }
            var35--;
            this.field3747[var38] = (short) (this.field3747[var38] + (class61.method475(var36 - 1, 2) << 14));
            this.field3737[var38] = var36;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3737[var42] != 0) {
                if (var39 == 0) {
                    var41 = var2.field3273[var6++] - 1;
                    if (var4.length > var40) {
                        var39 = var4[var40++];
                    } else {
                        var39 = -1;
                    }
                }
                this.field3739[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3737[var46] != 0) {
                if (var44 == 0) {
                    if (var8.length <= var43) {
                        var44 = -1;
                    } else {
                        var44 = var8[var43++];
                    }
                    var45 = var2.field3273[var10++] + 16 << 2;
                }
                this.field3734[var46] = (byte) var45;
                var44--;
            }
        }
        class118 var47 = null;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field3737[var50] != 0) {
                if (var49 == 0) {
                    var47 = var19[var14[var48]];
                    if (var12.length > var48) {
                        var49 = var12[var48++];
                    } else {
                        var49 = -1;
                    }
                }
                this.field3732[var50] = var47;
                var49--;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var51 == 0) {
                if (var28.length > var53) {
                    var51 = var28[var53++];
                } else {
                    var51 = -1;
                }
                if (this.field3737[var54] > 0) {
                    var52 = var2.method1317((byte) -85) + 1;
                }
            }
            this.field3733[var54] = (byte) var52;
            var51--;
        }
        this.field3731 = var2.method1317((byte) -96) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class118 var56 = var19[var55];
            if (var56.field2055 != null) {
                for (int var57 = 1; var57 < var56.field2055.length; var57 += 2) {
                    var56.field2055[var57] = var2.method1333(-127);
                }
            }
            if (var56.field2052 != null) {
                for (int var58 = 3; var58 < var56.field2052.length - 2; var58 += 2) {
                    var56.field2052[var58] = var2.method1333(-125);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var2.method1333(-127);
            }
        }
        if (var29 != null) {
            for (int var60 = 1; var60 < var29.length; var60 += 2) {
                var29[var60] = var2.method1333(-126);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class118 var62 = var19[var61];
            if (var62.field2052 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field2052.length; var64 += 2) {
                    var63 = var2.method1317((byte) -128) + (var63 + 1);
                    var62.field2052[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class118 var66 = var19[var65];
            if (var66.field2055 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field2055.length; var68 += 2) {
                    var67 = var2.method1317((byte) -122) + var67 + 1;
                    var66.field2055[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var2.method1317((byte) -122);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = (var69 + var2.method1317((byte) -106)) + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[1];
            byte var72 = var25[0];
            for (int var73 = 0; var73 < var72; var73++) {
                this.field3733[var73] = (byte) (this.field3733[var73] * var71 + 32 >> 6);
            }
            int var74 = 2;
            while (var74 < var25.length) {
                byte var75 = var25[var74];
                byte var76 = var25[var74 + 1];
                int var77 = (var75 - var72) / 2 + (var75 - var72) * var71;
                var74 += 2;
                for (int var78 = var72; var78 < var75; var78++) {
                    int var79 = class296.method1980(var77, (byte) -97, var75 - var72);
                    var77 += var76 - var71;
                    this.field3733[var78] = (byte) (this.field3733[var78] * var79 + 32 >> 6);
                }
                var72 = var75;
                var71 = var76;
            }
            Object var80 = null;
            for (int var81 = var72; var81 < 128; var81++) {
                this.field3733[var81] = (byte) (this.field3733[var81] * var71 + 32 >> 6);
            }
        }
        if (var29 != null) {
            int var82 = var2.method1317((byte) -103);
            var29[0] = (byte) var82;
            for (int var83 = 2; var83 < var29.length; var83 += 2) {
                var82 = (var82 + var2.method1317((byte) -127)) + 1;
                var29[var83] = (byte) var82;
            }
            int var84 = var29[1] << 1;
            byte var85 = var29[0];
            for (int var86 = 0; var86 < var85; var86++) {
                int var87 = (this.field3734[var86] & 0xFF) + var84;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field3734[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var88 < var29.length) {
                byte var89 = var29[var88];
                int var90 = var29[var88 + 1] << 1;
                int var91 = (var89 - var85) / 2 + (var89 - var85) * var84;
                for (int var92 = var85; var92 < var89; var92++) {
                    int var93 = class296.method1980(var91, (byte) -127, var89 - var85);
                    int var94 = (this.field3734[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    var91 += var90 - var84;
                    this.field3734[var92] = (byte) var94;
                }
                var88 += 2;
                var84 = var90;
                var85 = var89;
            }
            Object var95 = null;
            for (int var96 = var85; var96 < 128; var96++) {
                int var97 = (this.field3734[var96] & 0xFF) + var84;
                if (var97 < 0) {
                    var97 = 0;
                }
                if (var97 > 128) {
                    var97 = 128;
                }
                this.field3734[var96] = (byte) var97;
            }
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field2057 = var2.method1317((byte) -97);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class118 var100 = var19[var99];
            if (var100.field2055 != null) {
                var100.field2053 = var2.method1317((byte) -121);
            }
            if (var100.field2052 != null) {
                var100.field2063 = var2.method1317((byte) -81);
            }
            if (var100.field2057 > 0) {
                var100.field2050 = var2.method1317((byte) -89);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field2059 = var2.method1317((byte) -104);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class118 var103 = var19[var102];
            if (var103.field2059 > 0) {
                var103.field2058 = var2.method1317((byte) -117);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class118 var105 = var19[var104];
            if (var105.field2058 > 0) {
                var105.field2067 = var2.method1317((byte) -90);
            }
        }
    }
}
