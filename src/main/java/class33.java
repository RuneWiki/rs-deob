import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class33 extends class259 {

    @OriginalMember(owner = "client!u", name = "n", descriptor = "[B")
    public byte[] field410;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "[S")
    public short[] field412;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "[Lha;")
    public class25[] field421;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "[B")
    public byte[] field419;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "[B")
    public byte[] field418;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "[Luk;")
    public class105[] field416;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "[I")
    private int[] field411;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public int field423;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field407 = 1;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "Lpi;")
    public static class201 field413 = new class201(5);

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BILjava/lang/String;Z)Z")
    public static final boolean method209(byte arg0, int arg1, String arg2, boolean arg3) {
        field420++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = arg2.length();
        int var7 = 0;
        if (arg0 != -26) {
            field413 = null;
        }
        for (int var8 = 0; var8 < var6; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg1 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var7 + var11;
            if ((var10 / arg1) != var7) {
                return false;
            }
            var5 = true;
            var7 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([II[BLri;)Z")
    public final boolean method210(int[] arg0, int arg1, byte[] arg2, class41 arg3) {
        field408++;
        if (arg1 != -14234) {
            method217(-92, -15, -93);
        }
        boolean var5 = true;
        int var6 = 0;
        class105 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field411[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method261((byte) 70, arg0, var9 >> 2);
                        } else {
                            var7 = arg3.method262(var9 >> 2, true, arg0);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field416[var8] = var7;
                        this.field411[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZZ)V")
    public static final void method211(boolean arg0, boolean arg1) {
        field409++;
        byte var2 = 4;
        byte[][] var3 = class170.field2576;
        int var4 = var3.length;
        if (!arg0) {
            field413 = null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var11 = null;
            byte[] var12 = var3[var5];
            int var13 = class53.field768[var5] & 0xFF;
            int var14 = class53.field768[var5] >> 8;
            int var15 = var13 * 64 - class149.field2390;
            int var16 = var14 * 64 - class163.field2520;
            if (var12 != null) {
                class52.method316((byte) -115);
                var11 = class253.method1739(var15, var16, class163.field2520, var12, true, class235.field3431, class149.field2390, arg1);
            }
            if (!arg1 && class304.field4925 / 8 == var14 && class180.field2713 / 8 == var13) {
                if (var11 == null) {
                    class247.field3654 = -1;
                } else {
                    class73.field1144 = var11[3];
                    class247.field3654 = var11[0];
                    class158.field2462 = var11[4];
                    class74.field1165 = var11[2];
                    class82.field1325 = var11[1];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class53.field768[var6] & 0xFF) * 64 - class149.field2390;
            byte[] var8 = var3[var6];
            int var9 = (class53.field768[var6] >> 8) * 64 - class163.field2520;
            if (var8 == null && class180.field2713 < 800) {
                class52.method316((byte) -108);
                for (int var10 = 0; var10 < var2; var10++) {
                    class295.method2007(!arg0, var10, var9, 64, var7, 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIZI)V")
    public static final void method212(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field415++;
        class143.field2319 = (long) arg4;
        int var5 = class227.method1570(40);
        boolean var6 = false;
        if (arg2 == 3 || var5 == 3) {
            arg3 = true;
        }
        if (var5 > 0 == arg2 <= 0) {
            var6 = true;
        }
        if (class122.field2011.startsWith("mac") && arg2 > 0) {
            arg3 = true;
        }
        if (arg3 && arg2 > 0) {
            var6 = true;
        }
        class203.method1433(arg0, arg1, false, var5, var6, arg3, arg2);
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
    public static void method213(int arg0) {
        if (arg0 != 0) {
            method213(126);
        }
        field413 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public final void method214(byte arg0) {
        if (arg0 != 64) {
            field407 = -24;
        }
        this.field411 = null;
        field422++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BIIIILke;I)V")
    public static final void method215(byte arg0, int arg1, int arg2, int arg3, int arg4, class248 arg5, int arg6) {
        class308.method2086(arg5.field3753, -15, arg2, arg6, arg1, arg3, arg4, arg5.field3660);
        field424++;
        if (arg0 != -35) {
            method212(72, 86, 29, true, 112);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIBILmh;I)V")
    public static final void method216(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, class263 arg6, int arg7) {
        field414++;
        int var8 = arg0 * arg0 + arg2 * arg2;
        if (arg1 < var8) {
            return;
        }
        int var9 = Math.min(arg6.field4215 / 2, arg6.field4046 / 2);
        int var10 = -27 / ((63 - arg4) / 45);
        if (var8 <= (var9 * var9)) {
            class238.method1636(arg0, 27191, arg3, arg2, arg6, arg5, class282.field4552[arg7]);
            return;
        }
        var9 -= 10;
        int var11 = (int) class102.field1736 + class267.field4279 & 0x7FF;
        int var12 = class244.field3590[var11];
        int var13 = var12 * 256 / (class131.field2168 + 256);
        int var14 = class244.field3592[var11];
        int var15 = var14 * 256 / (class131.field2168 + 256);
        int var16 = arg0 * var13 + (arg2 * var15) >> 16;
        int var17 = arg0 * var15 - (arg2 * var13) >> 16;
        double var18 = Math.atan2((double) var16, (double) var17);
        int var20 = (int) ((double) var9 * Math.sin(var18));
        int var21 = (int) (Math.cos(var18) * (double) var9);
        ((class148) class135.field2202[arg7]).method866(arg6.field4215 / 2 + arg5 + var20 - 10, arg6.field4046 / 2 + -var21 + arg3 + -10, 20, 20, 15, 15, var18, 256);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(III)V")
    public static final void method217(int arg0, int arg1, int arg2) {
        field417++;
        class279 var3 = class111.method844(arg2, 13, -1780180960);
        if (arg1 == 7841) {
            var3.method1928(false);
            var3.field4505 = arg0;
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class33() {
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "([B)V")
    public class33(byte[] arg0) {
        this.field410 = new byte[128];
        this.field412 = new short[128];
        this.field421 = new class25[128];
        this.field419 = new byte[128];
        this.field418 = new byte[128];
        int var2 = 0;
        this.field416 = new class105[128];
        this.field411 = new int[128];
        class53 var3 = new class53(arg0);
        while (var3.field758[var3.field735 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method335((byte) 26);
        }
        var3.field735++;
        int var6 = 0;
        int var7 = var3.field735;
        var2++;
        var3.field735 += var2;
        while (var3.field758[var3.field735 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method335((byte) 26);
        }
        var6++;
        var3.field735++;
        int var10 = var3.field735;
        var3.field735 += var6;
        int var11;
        for (var11 = 0; var3.field758[var3.field735 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method335((byte) 26);
        }
        var3.field735++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method366(-16505);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var18 <= var16) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var11;
        }
        class25[] var19 = new class25[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class25 var103 = var19[var20] = new class25();
            int var104 = var3.method366(-16505);
            if (var104 > 0) {
                var103.field273 = new byte[var104 * 2];
            }
            int var105 = var3.method366(-16505);
            if (var105 > 0) {
                var103.field283 = new byte[var105 * 2 + 2];
                var103.field283[1] = 64;
            }
        }
        int var21 = var3.method366(-16505);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var3.method366(-16505);
        int var24 = 0;
        byte[] var25 = var23 > 0 ? new byte[var23 * 2] : null;
        while (var3.field758[var3.field735 + var24] != 0) {
            var24++;
        }
        byte[] var26 = new byte[var24];
        for (int var27 = 0; var27 < var24; var27++) {
            var26[var27] = var3.method335((byte) 26);
        }
        var24++;
        var3.field735++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method366(-16505);
            this.field412[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method366(-16505);
            this.field412[var31] = (short) (this.field412[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var26.length <= var34) {
                    var32 = -1;
                } else {
                    var32 = var26[var34++];
                }
                var33 = var3.method367(1090211239);
            }
            this.field412[var35] = (short) (this.field412[var35] + class301.method2056(var33 - 1 << 14, 32768));
            this.field411[var35] = var33;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field411[var39] != 0) {
                if (var38 == 0) {
                    if (var4.length > var36) {
                        var38 = var4[var36++];
                    } else {
                        var38 = -1;
                    }
                    var37 = var3.field758[var7++] - 1;
                }
                this.field419[var39] = (byte) var37;
                var38--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field411[var43] != 0) {
                if (var40 == 0) {
                    var41 = var3.field758[var10++] + 16 << 2;
                    if (var42 >= var8.length) {
                        var40 = -1;
                    } else {
                        var40 = var8[var42++];
                    }
                }
                this.field418[var43] = (byte) var41;
                var40--;
            }
        }
        int var44 = 0;
        class25 var45 = null;
        int var46 = 0;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field411[var47] != 0) {
                if (var46 == 0) {
                    var45 = var19[var14[var44]];
                    if (var12.length <= var44) {
                        var46 = -1;
                    } else {
                        var46 = var12[var44++];
                    }
                }
                var46--;
                this.field421[var47] = var45;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var50 >= var26.length) {
                    var49 = -1;
                } else {
                    var49 = var26[var50++];
                }
                if (this.field411[var51] > 0) {
                    var48 = var3.method366(-16505) + 1;
                }
            }
            this.field410[var51] = (byte) var48;
            var49--;
        }
        this.field423 = var3.method366(-16505) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class25 var100 = var19[var52];
            if (var100.field273 != null) {
                for (int var101 = 1; var101 < var100.field273.length; var101 += 2) {
                    var100.field273[var101] = var3.method335((byte) 26);
                }
            }
            if (var100.field283 != null) {
                for (int var102 = 3; var102 < (var100.field283.length - 2); var102 += 2) {
                    var100.field283[var102] = var3.method335((byte) 26);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var3.method335((byte) 26);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var3.method335((byte) 26);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class25 var97 = var19[var55];
            if (var97.field283 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field283.length; var99 += 2) {
                    var98 = var3.method366(-16505) + var98 + 1;
                    var97.field283[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class25 var94 = var19[var56];
            if (var94.field273 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field273.length; var96 += 2) {
                    var95 = (var95 + var3.method366(-16505)) + 1;
                    var94.field273[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var3.method366(-16505);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 += var3.method366(-16505) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[1];
            byte var60 = var22[0];
            for (int var61 = 0; var61 < var60; var61++) {
                this.field410[var61] = (byte) (this.field410[var61] * var59 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62];
                int var66 = (var65 - var60) * var59 + ((var65 - var60) / 2);
                byte var67 = var22[var62 + 1];
                for (int var68 = var60; var68 < var65; var68++) {
                    int var69 = class124.method961(false, var65 - var60, var66);
                    var66 += var67 - var59;
                    this.field410[var68] = (byte) (this.field410[var68] * var69 + 32 >> 6);
                }
                var62 += 2;
                var59 = var67;
                var60 = var65;
            }
            for (int var63 = var60; var63 < 128; var63++) {
                this.field410[var63] = (byte) (this.field410[var63] * var59 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var25 != null) {
            int var70 = var3.method366(-16505);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 = var3.method366(-16505) + var70 + 1;
                var25[var71] = (byte) var70;
            }
            int var72 = var25[1] << 1;
            byte var73 = var25[0];
            for (int var74 = 0; var74 < var73; var74++) {
                int var85 = (this.field418[var74] & 0xFF) + var72;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field418[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var25.length) {
                byte var79 = var25[var75];
                int var80 = var25[var75 + 1] << 1;
                var75 += 2;
                int var81 = (var79 - var73) / 2 + (var79 - var73) * var72;
                for (int var82 = var73; var82 < var79; var82++) {
                    int var83 = class124.method961(false, var79 - var73, var81);
                    int var84 = (this.field418[var82] & 0xFF) + var83;
                    var81 += var80 - var72;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field418[var82] = (byte) var84;
                }
                var72 = var80;
                var73 = var79;
            }
            for (int var76 = var73; var76 < 128; var76++) {
                int var78 = (this.field418[var76] & 0xFF) + var72;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field418[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field272 = var3.method366(-16505);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class25 var93 = var19[var87];
            if (var93.field273 != null) {
                var93.field281 = var3.method366(-16505);
            }
            if (var93.field283 != null) {
                var93.field275 = var3.method366(-16505);
            }
            if (var93.field272 > 0) {
                var93.field282 = var3.method366(-16505);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field285 = var3.method366(-16505);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class25 var92 = var19[var89];
            if (var92.field285 > 0) {
                var92.field284 = var3.method366(-16505);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class25 var91 = var19[var90];
            if (var91.field284 > 0) {
                var91.field280 = var3.method366(-16505);
            }
        }
    }
}
