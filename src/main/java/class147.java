import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class147 extends class45 {

    @OriginalMember(owner = "client!ifa", name = "s", descriptor = "[Lql;")
    public class161[] field1978;

    @OriginalMember(owner = "client!ifa", name = "n", descriptor = "[B")
    public byte[] field1973;

    @OriginalMember(owner = "client!ifa", name = "t", descriptor = "[I")
    private int[] field1979;

    @OriginalMember(owner = "client!ifa", name = "j", descriptor = "[B")
    public byte[] field1969;

    @OriginalMember(owner = "client!ifa", name = "k", descriptor = "[Loga;")
    public class179[] field1970;

    @OriginalMember(owner = "client!ifa", name = "o", descriptor = "[B")
    public byte[] field1974;

    @OriginalMember(owner = "client!ifa", name = "q", descriptor = "[S")
    public short[] field1976;

    @OriginalMember(owner = "client!ifa", name = "l", descriptor = "I")
    public int field1971;

    @OriginalMember(owner = "client!ifa", name = "r", descriptor = "Ltt;")
    public static class338 field1977 = new class338(80, -1);

    @OriginalMember(owner = "client!ifa", name = "i", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!ifa", name = "m", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!ifa", name = "p", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!ifa", name = "u", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I[B)Lbm;", line = 3)
    public static final class295 method837(int arg0, byte[] arg1) {
        field1968++;
        class295 var2 = new class295();
        class157 var3 = new class157(arg1);
        var3.field2219 = var3.field2199.length - 2;
        if (arg0 != 2) {
            field1980 = -80;
        }
        int var4 = var3.method963(-125);
        int var5 = var3.field2199.length - var4 - 2 - 12;
        var3.field2219 = var5;
        int var6 = var3.method908(false);
        var2.field3912 = var3.method963(-128);
        var2.field3911 = var3.method963(arg0 ^ 0xFFFFFF8A);
        var2.field3913 = var3.method963(arg0 ^ 0xFFFFFF8A);
        var2.field3915 = var3.method963(-119);
        int var7 = var3.method930(255);
        if (var7 > 0) {
            var2.field3917 = new class546[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method963(-119);
                class546 var10 = new class546(class385.method2206(0, var9));
                var2.field3917[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method908(false);
                    int var12 = var3.method908(false);
                    var10.method3061(125, (long) var11, new class37(var12));
                }
            }
        }
        var3.field2219 = 0;
        var2.field3905 = var3.method940((byte) -81);
        var2.field3916 = new int[var6];
        var2.field3908 = new int[var6];
        var2.field3909 = new String[var6];
        int var13 = 0;
        while (var3.field2219 < var5) {
            int var14 = var3.method963(arg0 - 124);
            if (var14 == 3) {
                var2.field3909[var13] = var3.method925(42).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field3908[var13] = var3.method930(arg0 + 253);
            } else {
                var2.field3908[var13] = var3.method908(false);
            }
            var2.field3916[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILpb;[B[I)Z", line = 92)
    public final boolean method838(int arg0, class400 arg1, byte[] arg2, int[] arg3) {
        field1975++;
        boolean var5 = true;
        int var6 = 0;
        class161 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field1979[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method2290(var9 >> 2, (byte) -64, arg3);
                        } else {
                            var7 = arg1.method2287(arg3, (byte) 66, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1978[var8] = var7;
                        this.field1979[var8] = 0;
                    }
                }
            }
        }
        if (arg0 != 2) {
            this.field1974 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)V", line = 149)
    public static void method839(byte arg0) {
        field1977 = null;
        if (arg0 != 100) {
            method839((byte) -1);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)V", line = 168)
    public final void method840(int arg0) {
        this.field1979 = null;
        field1972++;
        if (arg0 != 0) {
            this.method840(75);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "()V", line = 179)
    public class147() {
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "([B)V", line = 185)
    public class147(byte[] arg0) {
        this.field1978 = new class161[128];
        this.field1973 = new byte[128];
        this.field1979 = new int[128];
        this.field1969 = new byte[128];
        this.field1970 = new class179[128];
        this.field1974 = new byte[128];
        this.field1976 = new short[128];
        class157 var2 = new class157(arg0);
        int var3;
        for (var3 = 0; var2.field2199[var2.field2219 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method969(3);
        }
        var3++;
        var2.field2219++;
        int var6 = var2.field2219;
        var2.field2219 += var3;
        int var7;
        for (var7 = 0; var2.field2199[var2.field2219 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method969(3);
        }
        var2.field2219++;
        var7++;
        int var10 = var2.field2219;
        var2.field2219 += var7;
        int var11;
        for (var11 = 0; var2.field2199[var2.field2219 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method969(3);
        }
        var11++;
        var2.field2219++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method930(255);
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
        } else {
            var15 = var11;
        }
        class179[] var19 = new class179[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class179 var103 = var19[var20] = new class179();
            int var104 = var2.method930(255);
            if (var104 > 0) {
                var103.field2512 = new byte[var104 * 2];
            }
            int var105 = var2.method930(255);
            if (var105 > 0) {
                var103.field2505 = new byte[var105 * 2 + 2];
                var103.field2505[1] = 64;
            }
        }
        int var21 = var2.method930(255);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method930(255);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field2199[var2.field2219 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method969(3);
        }
        var2.field2219++;
        var25++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method930(255);
            this.field1976[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method930(255);
            this.field1976[var31] = (short) (this.field1976[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 < var26.length) {
                    var32 = var26[var33++];
                } else {
                    var32 = -1;
                }
                var34 = var2.method927((byte) -78);
            }
            this.field1976[var35] = (short) (this.field1976[var35] + (class15.method97(var34 - 1, 2) << 14));
            this.field1979[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field1979[var39] != 0) {
                if (var36 == 0) {
                    var38 = var2.field2199[var6++] - 1;
                    if (var37 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                }
                this.field1974[var39] = (byte) var38;
                var36--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field1979[var43] != 0) {
                if (var40 == 0) {
                    if (var8.length <= var41) {
                        var40 = -1;
                    } else {
                        var40 = var8[var41++];
                    }
                    var42 = var2.field2199[var10++] + 16 << 2;
                }
                this.field1973[var43] = (byte) var42;
                var40--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class179 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field1979[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var12.length <= var45) {
                        var44 = -1;
                    } else {
                        var44 = var12[var45++];
                    }
                }
                var44--;
                this.field1970[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var48 >= var26.length) {
                    var49 = -1;
                } else {
                    var49 = var26[var48++];
                }
                if (this.field1979[var51] > 0) {
                    var50 = var2.method930(255) + 1;
                }
            }
            var49--;
            this.field1969[var51] = (byte) var50;
        }
        this.field1971 = var2.method930(255) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class179 var100 = var19[var52];
            if (var100.field2512 != null) {
                for (int var101 = 1; var101 < var100.field2512.length; var101 += 2) {
                    var100.field2512[var101] = var2.method969(3);
                }
            }
            if (var100.field2505 != null) {
                for (int var102 = 3; var102 < (var100.field2505.length - 2); var102 += 2) {
                    var100.field2505[var102] = var2.method969(3);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method969(3);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method969(3);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class179 var97 = var19[var55];
            if (var97.field2505 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field2505.length; var99 += 2) {
                    var98 += var2.method930(255) + 1;
                    var97.field2505[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class179 var94 = var19[var56];
            if (var94.field2512 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field2512.length; var96 += 2) {
                    var95 = var2.method930(255) + var95 + 1;
                    var94.field2512[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method930(255);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var2.method930(255) + var57 + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field1969[var61] = (byte) (this.field1969[var61] * var60 + 32 >> 6);
            }
            for (int var62 = 2; var62 < var22.length; var62 += 2) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class228.method1414(var65 - var59, var67, 80);
                    this.field1969[var68] = (byte) (this.field1969[var68] * var69 + 32 >> 6);
                    var67 += var66 - var60;
                }
                var59 = var65;
                var60 = var66;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field1969[var63] = (byte) (this.field1969[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method930(255);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var2.method930(255) + var70 + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field1973[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field1973[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var24.length) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class228.method1414(var79 - var72, var81, 101);
                    int var84 = (this.field1973[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var80 - var73;
                    this.field1973[var82] = (byte) var84;
                }
                var72 = var79;
                var75 += 2;
                var73 = var80;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field1973[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field1973[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field2504 = var2.method930(255);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class179 var93 = var19[var87];
            if (var93.field2512 != null) {
                var93.field2508 = var2.method930(255);
            }
            if (var93.field2505 != null) {
                var93.field2503 = var2.method930(255);
            }
            if (var93.field2504 > 0) {
                var93.field2509 = var2.method930(255);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field2507 = var2.method930(255);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class179 var92 = var19[var89];
            if (var92.field2507 > 0) {
                var92.field2510 = var2.method930(255);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class179 var91 = var19[var90];
            if (var91.field2510 > 0) {
                var91.field2511 = var2.method930(255);
            }
        }
    }
}
