import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class132 extends class86 {

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "[Lhb;")
    public class32[] field2227;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "[I")
    private int[] field2220;

    @OriginalMember(owner = "client!jd", name = "K", descriptor = "[S")
    public short[] field2235;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "[B")
    public byte[] field2218;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "[B")
    public byte[] field2232;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "[Lwl;")
    public class82[] field2223;

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "[B")
    public byte[] field2233;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    public int field2221;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "[I")
    public static int[] field2219 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "Lbe;")
    public static class283 field2225 = class153.method941(-9, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "I")
    public static int field2234 = 0;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "Z")
    public static boolean field2226 = false;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLkg;IIIII)V", line = 8)
    public static final void method820(byte arg0, class69 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != -79) {
            field2219 = (int[]) null;
        }
        field2229++;
        int var7 = arg2 * arg2 + arg4 * arg4;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg1.field1069 / 2, arg1.field1085 / 2);
        if (var8 * var8 >= var7) {
            class256.method1732(arg3, arg4, class159.field2599[arg6], arg1, true, arg2, arg5);
            return;
        }
        var8 -= 10;
        int var9 = class88.field1497 + class203.field3477 & 0x7FF;
        int var10 = class139.field2309[var9];
        int var11 = var10 * 256 / (class24.field358 + 256);
        int var12 = class139.field2316[var9];
        int var13 = var12 * 256 / (class24.field358 + 256);
        int var14 = arg2 * var13 - (arg4 * var11) >> 16;
        int var15 = arg2 * var11 + arg4 * var13 >> 16;
        double var16 = Math.atan2((double) var15, (double) var14);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) (Math.cos(var16) * (double) var8);
        ((class266) class259.field4407[arg6]).method1793(240, 240, (arg1.field1069 / 2 + var18 + arg5) * 16, (arg1.field1085 / 2 + arg3 - var19) * 16, (int) (var16 * 10430.378D), 4096);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)Ldh;", line = 60)
    public static final class157 method821(int arg0, int arg1) {
        field2222++;
        class157 var2 = (class157) class66.field914.method1629(-107, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class142.field2363.method1107(class248.method1687((byte) -121, arg1), class290.method1982(arg1, 127), 115);
        class157 var4 = new class157();
        if (var3 != null) {
            var4.method960(new class229(var3), (byte) -81);
        }
        var4.method958(arg0 - 200);
        if (arg0 != 128) {
            field2225 = (class283) null;
        }
        class66.field914.method1630(true, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([B[ILoa;I)Z", line = 100)
    public final boolean method822(byte[] arg0, int[] arg1, class272 arg2, int arg3) {
        field2231++;
        int var5 = 0;
        boolean var6 = true;
        class32 var7 = null;
        if (arg3 >= -66) {
            this.method822((byte[]) null, (int[]) null, (class272) null, -118);
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field2220[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method1832(arg1, var9 >> 2, -104);
                        } else {
                            var7 = arg2.method1833((byte) -109, arg1, var9 >> 2);
                        }
                        if (var7 == null) {
                            var6 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2227[var8] = var7;
                        this.field2220[var8] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)V", line = 160)
    public static void method823(int arg0) {
        field2219 = null;
        field2225 = null;
        int var1 = 95 % ((-arg0 - 30) / 39);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZILek;BLek;)Lfm;", line = 180)
    public static final class42 method824(boolean arg0, int arg1, class172 arg2, byte arg3, class172 arg4) {
        if (arg3 != -24) {
            return (class42) null;
        }
        int[] var5 = arg2.method1118(arg1, false);
        boolean var6 = true;
        for (int var7 = 0; var7 < var5.length; var7++) {
            byte[] var8 = arg2.method1094(var5[var7], arg1, 110);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg0) {
                    var10 = arg4.method1094(var9, 0, 25);
                } else {
                    var10 = arg4.method1094(0, var9, 21);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        field2224++;
        if (!var6) {
            return null;
        }
        try {
            return new class42(arg2, arg4, arg1, arg0);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V", line = 234)
    public final void method825(boolean arg0) {
        if (!arg0) {
            this.field2220 = null;
            field2230++;
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V", line = 257)
    public class132() {
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "([B)V", line = 262)
    public class132(byte[] arg0) {
        this.field2227 = new class32[128];
        this.field2220 = new int[128];
        this.field2235 = new short[128];
        this.field2218 = new byte[128];
        this.field2232 = new byte[128];
        this.field2223 = new class82[128];
        this.field2233 = new byte[128];
        int var2 = 0;
        class229 var3 = new class229(arg0);
        while (var3.field3879[var3.field3905 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1497(false);
        }
        var2++;
        var3.field3905++;
        int var6 = 0;
        int var7 = var3.field3905;
        var3.field3905 += var2;
        while (var3.field3879[var3.field3905 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method1497(false);
        }
        var3.field3905++;
        var6++;
        int var10 = var3.field3905;
        var3.field3905 += var6;
        int var11;
        for (var11 = 0; var3.field3879[var3.field3905 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method1497(false);
        }
        var11++;
        var3.field3905++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method1535((byte) 114);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var18 <= var15) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var11;
        }
        class82[] var19 = new class82[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class82 var21 = var19[var20] = new class82();
            int var22 = var3.method1535((byte) 104);
            if (var22 > 0) {
                var21.field1394 = new byte[var22 * 2];
            }
            int var23 = var3.method1535((byte) 80);
            if (var23 > 0) {
                var21.field1385 = new byte[var23 * 2 + 2];
                var21.field1385[1] = 64;
            }
        }
        int var24 = var3.method1535((byte) 75);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        int var26 = var3.method1535((byte) 122);
        byte[] var27 = var26 <= 0 ? null : new byte[var26 * 2];
        int var28;
        for (var28 = 0; var3.field3879[var3.field3905 + var28] != 0; var28++) {
        }
        byte[] var29 = new byte[var28];
        for (int var30 = 0; var30 < var28; var30++) {
            var29[var30] = var3.method1497(false);
        }
        int var31 = 0;
        var3.field3905++;
        var28++;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method1535((byte) 111);
            this.field2235[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method1535((byte) 126);
            this.field2235[var34] = (short) (this.field2235[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var29.length > var36) {
                    var35 = var29[var36++];
                } else {
                    var35 = -1;
                }
                var37 = var3.method1553(-64);
            }
            var35--;
            this.field2235[var38] = (short) (this.field2235[var38] + (class178.method1174(var37 - 1, 2) << 14));
            this.field2220[var38] = var37;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field2220[var42] != 0) {
                if (var39 == 0) {
                    var41 = var3.field3879[var7++] - 1;
                    if (var4.length <= var40) {
                        var39 = -1;
                    } else {
                        var39 = var4[var40++];
                    }
                }
                this.field2218[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field2220[var46] != 0) {
                if (var43 == 0) {
                    if (var8.length > var44) {
                        var43 = var8[var44++];
                    } else {
                        var43 = -1;
                    }
                    var45 = var3.field3879[var10++] + 16 << 2;
                }
                var43--;
                this.field2232[var46] = (byte) var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class82 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field2220[var50] != 0) {
                if (var48 == 0) {
                    var49 = var19[var14[var47]];
                    if (var47 < var12.length) {
                        var48 = var12[var47++];
                    } else {
                        var48 = -1;
                    }
                }
                this.field2223[var50] = var49;
                var48--;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var52 == 0) {
                if (var29.length > var51) {
                    var52 = var29[var51++];
                } else {
                    var52 = -1;
                }
                if (this.field2220[var54] > 0) {
                    var53 = var3.method1535((byte) 95) + 1;
                }
            }
            var52--;
            this.field2233[var54] = (byte) var53;
        }
        this.field2221 = var3.method1535((byte) 77) + 1;
        for (int var55 = 0; var55 < var16; var55++) {
            class82 var56 = var19[var55];
            if (var56.field1394 != null) {
                for (int var57 = 1; var57 < var56.field1394.length; var57 += 2) {
                    var56.field1394[var57] = var3.method1497(false);
                }
            }
            if (var56.field1385 != null) {
                for (int var58 = 3; var58 < (var56.field1385.length - 2); var58 += 2) {
                    var56.field1385[var58] = var3.method1497(false);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method1497(false);
            }
        }
        if (var27 != null) {
            for (int var60 = 1; var60 < var27.length; var60 += 2) {
                var27[var60] = var3.method1497(false);
            }
        }
        for (int var61 = 0; var61 < var16; var61++) {
            class82 var62 = var19[var61];
            if (var62.field1385 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field1385.length; var64 += 2) {
                    var63 = var63 + var3.method1535((byte) 84) + 1;
                    var62.field1385[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var16; var65++) {
            class82 var66 = var19[var65];
            if (var66.field1394 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field1394.length; var68 += 2) {
                    var67 = (var67 + var3.method1535((byte) 75)) + 1;
                    var66.field1394[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method1535((byte) 119);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var69 + var3.method1535((byte) 96) + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field2233[var73] = (byte) (this.field2233[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var74 < var25.length) {
                byte var75 = var25[var74];
                int var76 = (var75 - var71) * var72 + ((var75 - var71) / 2);
                byte var77 = var25[var74 + 1];
                var74 += 2;
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class174.method1139(var75 - var71, true, var76);
                    var76 += var77 - var72;
                    this.field2233[var78] = (byte) (this.field2233[var78] * var79 + 32 >> 6);
                }
                var71 = var75;
                var72 = var77;
            }
            for (int var80 = var71; var80 < 128; var80++) {
                this.field2233[var80] = (byte) (this.field2233[var80] * var72 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var27 != null) {
            int var82 = var3.method1535((byte) 110);
            var27[0] = (byte) var82;
            for (int var83 = 2; var83 < var27.length; var83 += 2) {
                var82 += var3.method1535((byte) 91) + 1;
                var27[var83] = (byte) var82;
            }
            byte var84 = var27[0];
            int var85 = var27[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field2232[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field2232[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var88 < var27.length) {
                byte var89 = var27[var88];
                int var90 = (var89 - var84) / 2 + (var89 - var84) * var85;
                int var91 = var27[var88 + 1] << 1;
                var88 += 2;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class174.method1139(var89 - var84, true, var90);
                    int var94 = (this.field2232[var92] & 0xFF) + var93;
                    var90 += var91 - var85;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field2232[var92] = (byte) var94;
                }
                var84 = var89;
                var85 = var91;
            }
            Object var95 = null;
            for (int var96 = var84; var96 < 128; var96++) {
                int var97 = (this.field2232[var96] & 0xFF) + var85;
                if (var97 < 0) {
                    var97 = 0;
                }
                if (var97 > 128) {
                    var97 = 128;
                }
                this.field2232[var96] = (byte) var97;
            }
        }
        for (int var98 = 0; var98 < var16; var98++) {
            var19[var98].field1386 = var3.method1535((byte) 78);
        }
        for (int var99 = 0; var99 < var16; var99++) {
            class82 var100 = var19[var99];
            if (var100.field1394 != null) {
                var100.field1396 = var3.method1535((byte) 100);
            }
            if (var100.field1385 != null) {
                var100.field1392 = var3.method1535((byte) 95);
            }
            if (var100.field1386 > 0) {
                var100.field1383 = var3.method1535((byte) 118);
            }
        }
        for (int var101 = 0; var101 < var16; var101++) {
            var19[var101].field1384 = var3.method1535((byte) 109);
        }
        for (int var102 = 0; var102 < var16; var102++) {
            class82 var103 = var19[var102];
            if (var103.field1384 > 0) {
                var103.field1389 = var3.method1535((byte) 82);
            }
        }
        for (int var104 = 0; var104 < var16; var104++) {
            class82 var105 = var19[var104];
            if (var105.field1389 > 0) {
                var105.field1395 = var3.method1535((byte) 95);
            }
        }
    }
}
