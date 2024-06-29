import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class151 extends class320 {

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "[I")
    private int[] field2398;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "[Lbq;")
    public class189[] field2401;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "[B")
    public byte[] field2402;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "[B")
    public byte[] field2396;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "[Lij;")
    public class288[] field2392;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "[S")
    public short[] field2400;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "[B")
    public byte[] field2394;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public int field2397;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "Liv;")
    public static class64 field2399 = new class64(78, 10);

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
    public static int field2403 = -1;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "Lrn;")
    public static class174 field2404 = new class174(48, 15);

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "Z")
    public static boolean field2405 = false;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "Lbu;")
    public static class17 field2407;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "Lf;")
    public static class529 field2406;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
    public final void method1150(int arg0) {
        field2391++;
        if (arg0 == 2) {
            this.field2398 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([B[ILld;I)Z")
    public final boolean method1151(byte[] arg0, int[] arg1, class114 arg2, int arg3) {
        if (arg3 <= 10) {
            return false;
        }
        field2393++;
        boolean var5 = true;
        int var6 = 0;
        class189 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field2398[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method848(arg1, var9 >> 2, 2);
                        } else {
                            var7 = arg2.method845(0, var9 >> 2, arg1);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2401[var8] = var7;
                        this.field2398[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)V")
    public static void method1152(int arg0) {
        field2399 = null;
        field2404 = null;
        if (arg0 != -14015) {
            method1152(-66);
        }
        field2407 = null;
        field2406 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lhi;")
    public static final class137 method1153(Component arg0, byte arg1, boolean arg2) {
        if (arg1 <= 41) {
            return null;
        } else {
            field2395++;
            return new class396(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
    public class151() {
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "([B)V")
    public class151(byte[] arg0) {
        this.field2398 = new int[128];
        this.field2401 = new class189[128];
        this.field2402 = new byte[128];
        this.field2396 = new byte[128];
        this.field2392 = new class288[128];
        this.field2400 = new short[128];
        this.field2394 = new byte[128];
        class145 var2 = new class145(arg0);
        int var3;
        for (var3 = 0; var2.field2270[var2.field2289 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1093(15);
        }
        var3++;
        var2.field2289++;
        int var6 = var2.field2289;
        var2.field2289 += var3;
        int var7;
        for (var7 = 0; var2.field2270[var2.field2289 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1093(15);
        }
        var7++;
        var2.field2289++;
        int var10 = var2.field2289;
        var2.field2289 += var7;
        int var11;
        for (var11 = 0; var2.field2270[var2.field2289 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1093(15);
        }
        var11++;
        var2.field2289++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method1063((byte) 102);
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
        class288[] var18 = new class288[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class288 var102 = var18[var19] = new class288();
            int var103 = var2.method1063((byte) -88);
            if (var103 > 0) {
                var102.field4104 = new byte[var103 * 2];
            }
            int var104 = var2.method1063((byte) 126);
            if (var104 > 0) {
                var102.field4113 = new byte[var104 * 2 + 2];
                var102.field4113[1] = 64;
            }
        }
        int var20 = var2.method1063((byte) 121);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method1063((byte) 111);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field2270[var2.field2289 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method1093(15);
        }
        var2.field2289++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method1063((byte) 116);
            this.field2400[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method1063((byte) 114);
            this.field2400[var30] = (short) (this.field2400[var30] + (var29 << 8));
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
                var33 = var2.method1081(false);
            }
            this.field2400[var34] = (short) (this.field2400[var34] + (class207.method1405(2, var33 - 1) << 14));
            var31--;
            this.field2398[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field2398[var38] != 0) {
                if (var35 == 0) {
                    var37 = var2.field2270[var6++] - 1;
                    if (var4.length <= var36) {
                        var35 = -1;
                    } else {
                        var35 = var4[var36++];
                    }
                }
                this.field2402[var38] = (byte) var37;
                var35--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field2398[var42] != 0) {
                if (var40 == 0) {
                    if (var8.length <= var39) {
                        var40 = -1;
                    } else {
                        var40 = var8[var39++];
                    }
                    var41 = var2.field2270[var10++] + 16 << 2;
                }
                this.field2394[var42] = (byte) var41;
                var40--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class288 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field2398[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var12.length > var43) {
                        var44 = var12[var43++];
                    } else {
                        var44 = -1;
                    }
                }
                var44--;
                this.field2392[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var48 < var25.length) {
                    var47 = var25[var48++];
                } else {
                    var47 = -1;
                }
                if (this.field2398[var50] > 0) {
                    var49 = var2.method1063((byte) 105) + 1;
                }
            }
            this.field2396[var50] = (byte) var49;
            var47--;
        }
        this.field2397 = var2.method1063((byte) 118) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class288 var99 = var18[var51];
            if (var99.field4104 != null) {
                for (int var100 = 1; var100 < var99.field4104.length; var100 += 2) {
                    var99.field4104[var100] = var2.method1093(15);
                }
            }
            if (var99.field4113 != null) {
                for (int var101 = 3; var101 < var99.field4113.length - 2; var101 += 2) {
                    var99.field4113[var101] = var2.method1093(15);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method1093(15);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method1093(15);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class288 var96 = var18[var54];
            if (var96.field4113 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field4113.length; var98 += 2) {
                    var97 = var2.method1063((byte) -102) + var97 + 1;
                    var96.field4113[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class288 var93 = var18[var55];
            if (var93.field4104 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field4104.length; var95 += 2) {
                    var94 += var2.method1063((byte) -30) + 1;
                    var93.field4104[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method1063((byte) -74);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var2.method1063((byte) 125) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field2396[var60] = (byte) (this.field2396[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) * var59 + ((var64 - var58) / 2);
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class184.method1289(var66, var64 - var58, (byte) -28);
                    this.field2396[var67] = (byte) (this.field2396[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var61 += 2;
                var58 = var64;
                var59 = var65;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field2396[var62] = (byte) (this.field2396[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method1063((byte) -105);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var2.method1063((byte) -98) + var69 + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field2394[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field2394[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) * var72 + ((var78 - var71) / 2);
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class184.method1289(var80, var78 - var71, (byte) 122);
                    int var83 = (this.field2394[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field2394[var81] = (byte) var83;
                    var80 += var79 - var72;
                }
                var74 += 2;
                var72 = var79;
                var71 = var78;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field2394[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field2394[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field4105 = var2.method1063((byte) 116);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class288 var92 = var18[var86];
            if (var92.field4104 != null) {
                var92.field4112 = var2.method1063((byte) 102);
            }
            if (var92.field4113 != null) {
                var92.field4102 = var2.method1063((byte) -99);
            }
            if (var92.field4105 > 0) {
                var92.field4107 = var2.method1063((byte) 106);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field4109 = var2.method1063((byte) 103);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class288 var91 = var18[var88];
            if (var91.field4109 > 0) {
                var91.field4110 = var2.method1063((byte) 113);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class288 var90 = var18[var89];
            if (var90.field4110 > 0) {
                var90.field4101 = var2.method1063((byte) 110);
            }
        }
    }
}
