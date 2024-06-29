import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class379 extends class435 {

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "[Lrh;")
    public class175[] field5485;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "[S")
    public short[] field5487;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "[Ljj;")
    public class77[] field5481;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "[B")
    public byte[] field5489;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "[B")
    public byte[] field5491;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "[B")
    public byte[] field5490;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "[I")
    private int[] field5482;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
    public int field5492;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "Lao;")
    public static class191 field5478 = new class191(62, -2);

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "[I")
    public static int[] field5484 = new int[2];

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIII)V")
    public static final void method2313(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class319.field4256.field4652 != 0 && arg2 != 0 && class347.field4621 < 50 && arg4 != -1) {
            class40.field429[class347.field4621++] = new class282((byte) 1, arg4, arg2, arg3, arg1, 0);
        }
        field5486++;
        if (arg0 < 43) {
            method2313(7, 77, 117, -8, -36);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([I[BLcg;B)Z")
    public final boolean method2314(int[] arg0, byte[] arg1, class92 arg2, byte arg3) {
        field5488++;
        boolean var5 = true;
        int var6 = 0;
        class77 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field5482[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method512(arg0, (byte) 23, var9 >> 2);
                        } else {
                            var7 = arg2.method509(var9 >> 2, arg0, -2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field5481[var8] = var7;
                        this.field5482[var8] = 0;
                    }
                }
            }
        }
        if (arg3 > -111) {
            method2313(103, -125, -69, -55, 123);
        }
        return var5;
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V")
    public static void method2315(int arg0) {
        field5478 = null;
        if (arg0 != -2) {
            field5484 = null;
        }
        field5484 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLwk;)I")
    public static final int method2316(byte arg0, class96 arg1) {
        field5480++;
        if (arg1.field1200 == 0) {
            return 0;
        }
        if (arg1.field1156 != -1) {
            class96 var2 = null;
            if (arg1.field1156 < 32768) {
                var2 = class339.field4484[arg1.field1156];
            } else if (arg1.field1156 >= 32768) {
                var2 = class29.field272[arg1.field1156 - 32768];
            }
            if (var2 != null) {
                int var3 = arg1.field3704 - var2.field3704;
                int var4 = arg1.field3694 - var2.field3694;
                if (var3 != 0 || var4 != 0) {
                    arg1.method536(arg0 + 16409, (int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if (arg0 != -26) {
            return 117;
        }
        if (arg1 instanceof class531) {
            class531 var5 = (class531) arg1;
            if (var5.field7819 != -1 && (var5.field1254 == 0 || var5.field1256 > 0)) {
                var5.method536(16383, var5.field7819);
                var5.field7819 = -1;
            }
        } else if (arg1 instanceof class22) {
            class22 var6 = (class22) arg1;
            if (var6.field225 != -1 && (var6.field1254 == 0 || var6.field1256 > 0)) {
                int var7 = var6.field3704 - ((var6.field225 - class357.field4867 - class357.field4867) * 64);
                int var8 = var6.field3694 - ((var6.field206 - class418.field6074 - class418.field6074) * 64);
                if (var7 != 0 || var8 != 0) {
                    var6.method536(16383, (int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF);
                }
                var6.field225 = -1;
            }
        }
        return arg1.method542((byte) 106);
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)V")
    public final void method2317(int arg0) {
        this.field5482 = null;
        if (arg0 == 1) {
            field5479++;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class379() {
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "([B)V")
    public class379(byte[] arg0) {
        this.field5485 = new class175[128];
        this.field5487 = new short[128];
        this.field5481 = new class77[128];
        this.field5489 = new byte[128];
        this.field5491 = new byte[128];
        this.field5490 = new byte[128];
        this.field5482 = new int[128];
        class396 var2 = new class396(arg0);
        int var3;
        for (var3 = 0; var2.field5761[var2.field5729 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2418(100);
        }
        var3++;
        var2.field5729++;
        int var6 = var2.field5729;
        var2.field5729 += var3;
        int var7;
        for (var7 = 0; var2.field5761[var2.field5729 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2418(103);
        }
        var2.field5729++;
        var7++;
        int var10 = var2.field5729;
        var2.field5729 += var7;
        int var11;
        for (var11 = 0; var2.field5761[var2.field5729 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2418(121);
        }
        var2.field5729++;
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
                int var105 = var2.method2388((byte) -112);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var105) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class175[] var18 = new class175[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class175 var102 = var18[var19] = new class175();
            int var103 = var2.method2388((byte) -117);
            if (var103 > 0) {
                var102.field2253 = new byte[var103 * 2];
            }
            int var104 = var2.method2388((byte) -125);
            if (var104 > 0) {
                var102.field2262 = new byte[var104 * 2 + 2];
                var102.field2262[1] = 64;
            }
        }
        int var20 = var2.method2388((byte) -120);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method2388((byte) -123);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field5761[var2.field5729 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method2418(-14);
        }
        var2.field5729++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method2388((byte) -120);
            this.field5487[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method2388((byte) -116);
            this.field5487[var30] = (short) (this.field5487[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var32 >= var25.length) {
                    var31 = -1;
                } else {
                    var31 = var25[var32++];
                }
                var33 = var2.method2445(0);
            }
            this.field5487[var34] = (short) (this.field5487[var34] + (class95.method534(var33 - 1, 2) << 14));
            var31--;
            this.field5482[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field5482[var38] != 0) {
                if (var35 == 0) {
                    if (var4.length <= var36) {
                        var35 = -1;
                    } else {
                        var35 = var4[var36++];
                    }
                    var37 = var2.field5761[var6++] - 1;
                }
                var35--;
                this.field5489[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field5482[var42] != 0) {
                if (var39 == 0) {
                    var41 = var2.field5761[var10++] + 16 << 2;
                    if (var8.length <= var40) {
                        var39 = -1;
                    } else {
                        var39 = var8[var40++];
                    }
                }
                this.field5491[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class175 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field5482[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var44 < var12.length) {
                        var43 = var12[var44++];
                    } else {
                        var43 = -1;
                    }
                }
                var43--;
                this.field5485[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var25.length > var48) {
                    var47 = var25[var48++];
                } else {
                    var47 = -1;
                }
                if (this.field5482[var50] > 0) {
                    var49 = var2.method2388((byte) -121) + 1;
                }
            }
            var47--;
            this.field5490[var50] = (byte) var49;
        }
        this.field5492 = var2.method2388((byte) -113) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class175 var99 = var18[var51];
            if (var99.field2253 != null) {
                for (int var100 = 1; var100 < var99.field2253.length; var100 += 2) {
                    var99.field2253[var100] = var2.method2418(113);
                }
            }
            if (var99.field2262 != null) {
                for (int var101 = 3; var101 < (var99.field2262.length - 2); var101 += 2) {
                    var99.field2262[var101] = var2.method2418(122);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method2418(-11);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method2418(-117);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class175 var96 = var18[var54];
            if (var96.field2262 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field2262.length; var98 += 2) {
                    var97 = var2.method2388((byte) -120) + (var97 + 1);
                    var96.field2262[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class175 var93 = var18[var55];
            if (var93.field2253 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field2253.length; var95 += 2) {
                    var94 = var2.method2388((byte) -121) + var94 + 1;
                    var93.field2253[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method2388((byte) -124);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var2.method2388((byte) -113) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field5490[var60] = (byte) (this.field5490[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) * var59 + ((var64 - var58) / 2);
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class282.method1705(-1794365889, var66, var64 - var58);
                    var66 += var65 - var59;
                    this.field5490[var67] = (byte) (this.field5490[var67] * var68 + 32 >> 6);
                }
                var61 += 2;
                var59 = var65;
                var58 = var64;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field5490[var62] = (byte) (this.field5490[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method2388((byte) -115);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var2.method2388((byte) -115) + var69 + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field5491[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field5491[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class282.method1705(-1794365889, var80, var78 - var71);
                    int var83 = (this.field5491[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field5491[var81] = (byte) var83;
                    var80 += var79 - var72;
                }
                var74 += 2;
                var72 = var79;
                var71 = var78;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field5491[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field5491[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field2259 = var2.method2388((byte) -116);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class175 var92 = var18[var86];
            if (var92.field2253 != null) {
                var92.field2255 = var2.method2388((byte) -110);
            }
            if (var92.field2262 != null) {
                var92.field2252 = var2.method2388((byte) -119);
            }
            if (var92.field2259 > 0) {
                var92.field2261 = var2.method2388((byte) -116);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field2260 = var2.method2388((byte) -124);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class175 var91 = var18[var88];
            if (var91.field2260 > 0) {
                var91.field2256 = var2.method2388((byte) -112);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class175 var90 = var18[var89];
            if (var90.field2256 > 0) {
                var90.field2257 = var2.method2388((byte) -114);
            }
        }
    }
}
