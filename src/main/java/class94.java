import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class94 extends class176 {

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "[B")
    public byte[] field2251;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "[I")
    private int[] field2266;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "[Lnc;")
    public class120[] field2261;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "[B")
    public byte[] field2246;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "[Lbf;")
    public class17[] field2257;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "[S")
    public short[] field2262;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "[B")
    public byte[] field2255;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public int field2254;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "Lgg;")
    private static class63 field2253 = class116.method911(43, "Loading title screen )2 ");

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "Lgg;")
    public static class63 field2263 = class116.method911(43, "Fallen lassen");

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "Lgg;")
    public static class63 field2264 = field2253;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    public static int field2265 = 0;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "Ljc;")
    public static class85 field2248;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "Ljc;")
    public static class85 field2258;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljb;I[B[I)Z")
    public final boolean method820(class84 arg0, int arg1, byte[] arg2, int[] arg3) {
        if (arg1 > -93) {
            field2264 = null;
        }
        field2247++;
        int var5 = 0;
        class120 var6 = null;
        boolean var7 = true;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field2266[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg0.method739(var9 >> 2, arg3, 74);
                        } else {
                            var6 = arg0.method738(var9 >> 2, arg3, -128);
                        }
                        if (var6 == null) {
                            var7 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field2261[var8] = var6;
                        this.field2266[var8] = 0;
                    }
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public static void method821(int arg0) {
        field2248 = null;
        field2253 = null;
        field2263 = null;
        if (arg0 == 1) {
            field2264 = null;
            field2258 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method822(boolean arg0, Object arg1, int arg2) {
        field2259++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class39.method361(var3, 88) : var3;
        } else {
            if (arg2 != 8) {
                method822(true, null, 71);
            }
            if (!(arg1 instanceof class202)) {
                throw new IllegalArgumentException();
            }
            class202 var4 = (class202) arg1;
            return var4.method1335(127);
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
    public final void method823(int arg0) {
        this.field2266 = null;
        if (arg0 > 115) {
            field2252++;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
    public class94() {
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)Z")
    public static final boolean method824(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class151.field3169; var3++) {
            class121 var4 = class117.field2626[var3];
            if (var4.field2684 == 1) {
                int var5 = var4.field2680 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2671 * var5 >> 8) + var4.field2658;
                    int var7 = (var4.field2677 * var5 >> 8) + var4.field2657;
                    int var8 = (var4.field2678 * var5 >> 8) + var4.field2672;
                    int var9 = (var4.field2686 * var5 >> 8) + var4.field2676;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2684 == 2) {
                int var10 = arg0 - var4.field2680;
                if (var10 > 0) {
                    int var11 = (var4.field2671 * var10 >> 8) + var4.field2658;
                    int var12 = (var4.field2677 * var10 >> 8) + var4.field2657;
                    int var13 = (var4.field2678 * var10 >> 8) + var4.field2672;
                    int var14 = (var4.field2686 * var10 >> 8) + var4.field2676;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2684 == 3) {
                int var15 = var4.field2658 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2679 * var15 >> 8) + var4.field2680;
                    int var17 = (var4.field2683 * var15 >> 8) + var4.field2669;
                    int var18 = (var4.field2678 * var15 >> 8) + var4.field2672;
                    int var19 = (var4.field2686 * var15 >> 8) + var4.field2676;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2684 == 4) {
                int var20 = arg2 - var4.field2658;
                if (var20 > 0) {
                    int var21 = (var4.field2679 * var20 >> 8) + var4.field2680;
                    int var22 = (var4.field2683 * var20 >> 8) + var4.field2669;
                    int var23 = (var4.field2678 * var20 >> 8) + var4.field2672;
                    int var24 = (var4.field2686 * var20 >> 8) + var4.field2676;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2684 == 5) {
                int var25 = arg1 - var4.field2672;
                if (var25 > 0) {
                    int var26 = (var4.field2679 * var25 >> 8) + var4.field2680;
                    int var27 = (var4.field2683 * var25 >> 8) + var4.field2669;
                    int var28 = (var4.field2671 * var25 >> 8) + var4.field2658;
                    int var29 = (var4.field2677 * var25 >> 8) + var4.field2657;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)Lrc;")
    public static final class156 method825(byte arg0) {
        class156 var1 = new class156();
        int var2 = -2 / ((13 - arg0) / 61);
        var1.field3255 = class190.field3868[0];
        var1.field3257 = class85.field2014[0];
        var1.field3256 = class153.field3202;
        field2250++;
        var1.field3261 = class28.field658;
        var1.field3260 = class60.field1521[0];
        var1.field3258 = class110.field2486;
        var1.field3259 = class163.field3366[0];
        var1.field3254 = class190.field3875[0];
        class12.method151((byte) 65);
        return var1;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([B)V")
    public class94(byte[] arg0) {
        this.field2251 = new byte[128];
        this.field2266 = new int[128];
        this.field2261 = new class120[128];
        this.field2246 = new byte[128];
        this.field2257 = new class17[128];
        this.field2262 = new short[128];
        this.field2255 = new byte[128];
        int var2 = 0;
        class3 var3 = new class3(arg0);
        while (var3.field48[var3.field54 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method73((byte) 29);
        }
        var2++;
        var3.field54++;
        int var6 = var3.field54;
        int var7 = 0;
        var3.field54 += var2;
        while (var3.field48[var3.field54 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method73((byte) 29);
        }
        var3.field54++;
        var7++;
        int var10 = var3.field54;
        var3.field54 += var7;
        int var11;
        for (var11 = 0; var3.field48[var3.field54 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method73((byte) 29);
        }
        var11++;
        var3.field54++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var3.method64(31790);
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
        class17[] var18 = new class17[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class17 var102 = var18[var19] = new class17();
            int var103 = var3.method64(31790);
            if (var103 > 0) {
                var102.field406 = new byte[var103 * 2];
            }
            int var104 = var3.method64(31790);
            if (var104 > 0) {
                var102.field402 = new byte[var104 * 2 + 2];
                var102.field402[1] = 64;
            }
        }
        int var20 = var3.method64(31790);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = 0;
        int var23 = var3.method64(31790);
        while (var3.field48[var3.field54 + var22] != 0) {
            var22++;
        }
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        byte[] var25 = new byte[var22];
        for (int var26 = 0; var26 < var22; var26++) {
            var25[var26] = var3.method73((byte) 29);
        }
        var22++;
        var3.field54++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method64(31790);
            this.field2262[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method64(31790);
            this.field2262[var30] = (short) (this.field2262[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var25.length <= var32) {
                    var31 = -1;
                } else {
                    var31 = var25[var32++];
                }
                var33 = var3.method23(255);
            }
            var31--;
            this.field2262[var34] = (short) (this.field2262[var34] + class110.method881(var33 - 1 << 14, 32768));
            this.field2266[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field2266[var38] != 0) {
                if (var37 == 0) {
                    if (var4.length > var35) {
                        var37 = var4[var35++];
                    } else {
                        var37 = -1;
                    }
                    var36 = var3.field48[var6++] - 1;
                }
                this.field2246[var38] = (byte) var36;
                var37--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field2266[var42] != 0) {
                if (var40 == 0) {
                    if (var8.length > var41) {
                        var40 = var8[var41++];
                    } else {
                        var40 = -1;
                    }
                    var39 = var3.field48[var10++] + 16 << 2;
                }
                var40--;
                this.field2251[var42] = (byte) var39;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class17 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field2266[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var43 < var12.length) {
                        var44 = var12[var43++];
                    } else {
                        var44 = -1;
                    }
                }
                var44--;
                this.field2257[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var25.length <= var47) {
                    var48 = -1;
                } else {
                    var48 = var25[var47++];
                }
                if (this.field2266[var50] > 0) {
                    var49 = var3.method64(31790) + 1;
                }
            }
            var48--;
            this.field2255[var50] = (byte) var49;
        }
        this.field2254 = var3.method64(31790) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class17 var99 = var18[var51];
            if (var99.field406 != null) {
                for (int var100 = 1; var100 < var99.field406.length; var100 += 2) {
                    var99.field406[var100] = var3.method73((byte) 29);
                }
            }
            if (var99.field402 != null) {
                for (int var101 = 3; var101 < var99.field402.length - 2; var101 += 2) {
                    var99.field402[var101] = var3.method73((byte) 29);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method73((byte) 29);
            }
        }
        if (var24 != null) {
            for (int var53 = 1; var53 < var24.length; var53 += 2) {
                var24[var53] = var3.method73((byte) 29);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class17 var96 = var18[var54];
            if (var96.field402 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field402.length; var98 += 2) {
                    var97 = var3.method64(31790) + var97 + 1;
                    var96.field402[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class17 var93 = var18[var55];
            if (var93.field406 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field406.length; var95 += 2) {
                    var94 = var3.method64(31790) + var94 + 1;
                    var93.field406[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method64(31790);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 += var3.method64(31790) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field2255[var60] = (byte) (this.field2255[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                int var65 = (var64 - var58) / 2 + (var64 - var58) * var59;
                byte var66 = var21[var61 + 1];
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class133.method974(1780980831, var64 - var58, var65);
                    var65 += var66 - var59;
                    this.field2255[var67] = (byte) (this.field2255[var67] * var68 + 32 >> 6);
                }
                var61 += 2;
                var58 = var64;
                var59 = var66;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field2255[var63] = (byte) (this.field2255[var63] * var59 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var69 = var3.method64(31790);
            var24[0] = (byte) var69;
            for (int var70 = 2; var70 < var24.length; var70 += 2) {
                var69 = var3.method64(31790) + var69 + 1;
                var24[var70] = (byte) var69;
            }
            byte var71 = var24[0];
            int var72 = var24[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field2251[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field2251[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var24.length > var74) {
                byte var78 = var24[var74];
                int var79 = var24[var74 + 1] << 1;
                var74 += 2;
                int var80 = (var78 - var71) * var72 + (var78 - var71) / 2;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class133.method974(1780980831, var78 - var71, var80);
                    var80 += var79 - var72;
                    int var83 = (this.field2251[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field2251[var81] = (byte) var83;
                }
                var71 = var78;
                var72 = var79;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field2251[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field2251[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field407 = var3.method64(31790);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class17 var92 = var18[var86];
            if (var92.field406 != null) {
                var92.field417 = var3.method64(31790);
            }
            if (var92.field402 != null) {
                var92.field410 = var3.method64(31790);
            }
            if (var92.field407 > 0) {
                var92.field421 = var3.method64(31790);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field422 = var3.method64(31790);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class17 var91 = var18[var88];
            if (var91.field422 > 0) {
                var91.field404 = var3.method64(31790);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class17 var90 = var18[var89];
            if (var90.field404 > 0) {
                var90.field420 = var3.method64(31790);
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
    public static final void method826(int arg0) {
        class117.field2620.method282((byte) -72);
        field2256++;
        if (arg0 == -1) {
            class30.field745.method282((byte) -113);
            class169.field3487.method282((byte) -63);
        }
    }
}
