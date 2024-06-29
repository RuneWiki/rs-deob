import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class200 extends class134 {

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "[Lti;")
    public class178[] field3230;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "[B")
    public byte[] field3226;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "[B")
    public byte[] field3234;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "[Lee;")
    public class116[] field3232;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "[S")
    public short[] field3233;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "[B")
    public byte[] field3222;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "[I")
    private int[] field3223;

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "I")
    public int field3235;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    public static int field3227 = 0;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "[S")
    public static short[] field3228 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    public static int field3224 = 0;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "Z")
    public static boolean field3231 = false;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "Laj;")
    public static class151 field3237;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "[I")
    public static int[] field3221;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)V")
    public static void method1411(int arg0) {
        field3228 = null;
        field3237 = null;
        field3221 = null;
        if (arg0 != -1) {
            field3228 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public final void method1412(byte arg0) {
        if (arg0 <= 59) {
            this.method1413((byte) -119, (class181) null, (int[]) null, (byte[]) null);
        }
        field3225++;
        this.field3223 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLlh;[I[B)Z")
    public final boolean method1413(byte arg0, class181 arg1, int[] arg2, byte[] arg3) {
        int var5 = 98 % ((arg0 + 51) / 39);
        field3236++;
        boolean var6 = true;
        int var7 = 0;
        class178 var8 = null;
        for (int var9 = 0; var9 < 128; var9++) {
            if (arg3 == null || arg3[var9] != 0) {
                int var10 = this.field3223[var9];
                if (var10 != 0) {
                    if (var7 != var10) {
                        var7 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var8 = arg1.method1319(44, arg2, var10 >> 2);
                        } else {
                            var8 = arg1.method1320(var10 >> 2, arg2, -1);
                        }
                        if (var8 == null) {
                            var6 = false;
                        }
                    }
                    if (var8 != null) {
                        this.field3230[var9] = var8;
                        this.field3223[var9] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    public class200() {
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "([B)V")
    public class200(byte[] arg0) {
        this.field3230 = new class178[128];
        this.field3226 = new byte[128];
        this.field3234 = new byte[128];
        this.field3232 = new class116[128];
        this.field3233 = new short[128];
        this.field3222 = new byte[128];
        this.field3223 = new int[128];
        class249 var2 = new class249(arg0);
        int var3;
        for (var3 = 0; var2.field4182[var2.field4160 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1768(122);
        }
        var3++;
        var2.field4160++;
        int var6 = 0;
        int var7 = var2.field4160;
        var2.field4160 += var3;
        while (var2.field4182[var2.field4160 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var2.method1768(75);
        }
        var2.field4160++;
        int var10 = var2.field4160;
        int var11 = 0;
        var6++;
        var2.field4160 += var6;
        while (var2.field4182[var2.field4160 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1768(87);
        }
        var2.field4160++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method1802((byte) -120);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var105 <= var16) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class116[] var18 = new class116[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class116 var102 = var18[var19] = new class116();
            int var103 = var2.method1802((byte) -107);
            if (var103 > 0) {
                var102.field1962 = new byte[var103 * 2];
            }
            int var104 = var2.method1802((byte) -108);
            if (var104 > 0) {
                var102.field1966 = new byte[var104 * 2 + 2];
                var102.field1966[1] = 64;
            }
        }
        int var20 = var2.method1802((byte) 30);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method1802((byte) -111);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field4182[var2.field4160 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method1768(88);
        }
        var2.field4160++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method1802((byte) -86);
            this.field3233[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method1802((byte) 66);
            this.field3233[var30] = (short) (this.field3233[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var25.length > var32) {
                    var31 = var25[var32++];
                } else {
                    var31 = -1;
                }
                var33 = var2.method1772((byte) 76);
            }
            this.field3233[var34] = (short) (this.field3233[var34] + class15.method84(32768, var33 - 1 << 14));
            var31--;
            this.field3223[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field3223[var38] != 0) {
                if (var36 == 0) {
                    if (var4.length > var35) {
                        var36 = var4[var35++];
                    } else {
                        var36 = -1;
                    }
                    var37 = var2.field4182[var7++] - 1;
                }
                this.field3234[var38] = (byte) var37;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3223[var42] != 0) {
                if (var39 == 0) {
                    var40 = var2.field4182[var10++] + 16 << 2;
                    if (var41 >= var8.length) {
                        var39 = -1;
                    } else {
                        var39 = var8[var41++];
                    }
                }
                this.field3226[var42] = (byte) var40;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class116 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3223[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var44 < var12.length) {
                        var43 = var12[var44++];
                    } else {
                        var43 = -1;
                    }
                }
                var43--;
                this.field3232[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var25.length > var49) {
                    var48 = var25[var49++];
                } else {
                    var48 = -1;
                }
                if (this.field3223[var50] > 0) {
                    var47 = var2.method1802((byte) 67) + 1;
                }
            }
            this.field3222[var50] = (byte) var47;
            var48--;
        }
        this.field3235 = var2.method1802((byte) 117) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class116 var99 = var18[var51];
            if (var99.field1962 != null) {
                for (int var100 = 1; var100 < var99.field1962.length; var100 += 2) {
                    var99.field1962[var100] = var2.method1768(84);
                }
            }
            if (var99.field1966 != null) {
                for (int var101 = 3; var101 < (var99.field1966.length - 2); var101 += 2) {
                    var99.field1966[var101] = var2.method1768(87);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method1768(95);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method1768(95);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class116 var96 = var18[var54];
            if (var96.field1966 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field1966.length; var98 += 2) {
                    var97 = var2.method1802((byte) 96) + var97 + 1;
                    var96.field1966[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class116 var93 = var18[var55];
            if (var93.field1962 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field1962.length; var95 += 2) {
                    var94 = var2.method1802((byte) 83) + var94 + 1;
                    var93.field1962[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method1802((byte) -97);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var2.method1802((byte) -114) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field3222[var60] = (byte) (this.field3222[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                var61 += 2;
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class167.method1246(var64 - var58, true, var66);
                    var66 += var65 - var59;
                    this.field3222[var67] = (byte) (this.field3222[var67] * var68 + 32 >> 6);
                }
                var59 = var65;
                var58 = var64;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field3222[var63] = (byte) (this.field3222[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method1802((byte) -117);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = (var69 + var2.method1802((byte) -120)) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field3226[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field3226[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                var74 += 2;
                int var80 = (var78 - var71) * var72 + ((var78 - var71) / 2);
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class167.method1246(var78 - var71, true, var80);
                    var80 += var79 - var72;
                    int var83 = (this.field3226[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field3226[var81] = (byte) var83;
                }
                var72 = var79;
                var71 = var78;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field3226[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field3226[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field1968 = var2.method1802((byte) 42);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class116 var92 = var18[var86];
            if (var92.field1962 != null) {
                var92.field1965 = var2.method1802((byte) -95);
            }
            if (var92.field1966 != null) {
                var92.field1971 = var2.method1802((byte) 106);
            }
            if (var92.field1968 > 0) {
                var92.field1967 = var2.method1802((byte) 73);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field1964 = var2.method1802((byte) -87);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class116 var91 = var18[var88];
            if (var91.field1964 > 0) {
                var91.field1975 = var2.method1802((byte) 75);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class116 var90 = var18[var89];
            if (var90.field1975 > 0) {
                var90.field1961 = var2.method1802((byte) -97);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILaj;Laj;)V")
    public static final void method1414(int arg0, class151 arg1, class151 arg2) {
        class221.field3713 = arg2;
        field3229++;
        int var3 = -10 / ((arg0 + 24) / 57);
        class61.field1055 = arg1;
    }
}
