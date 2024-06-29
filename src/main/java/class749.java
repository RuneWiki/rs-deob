import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class749 extends class101 {

    @OriginalMember(owner = "client!dw", name = "C", descriptor = "[B")
    public byte[] field10326;

    @OriginalMember(owner = "client!dw", name = "E", descriptor = "[S")
    public short[] field10328;

    @OriginalMember(owner = "client!dw", name = "B", descriptor = "[B")
    public byte[] field10325;

    @OriginalMember(owner = "client!dw", name = "u", descriptor = "[Lwia;")
    public class791[] field10318;

    @OriginalMember(owner = "client!dw", name = "y", descriptor = "[Lks;")
    public class465[] field10322;

    @OriginalMember(owner = "client!dw", name = "n", descriptor = "[B")
    public byte[] field10311;

    @OriginalMember(owner = "client!dw", name = "z", descriptor = "[I")
    private int[] field10323;

    @OriginalMember(owner = "client!dw", name = "r", descriptor = "I")
    public int field10315;

    @OriginalMember(owner = "client!dw", name = "s", descriptor = "[I")
    public static int[] field10316 = new int[16384];

    @OriginalMember(owner = "client!dw", name = "A", descriptor = "[I")
    public static int[] field10324 = new int[16384];

    @OriginalMember(owner = "client!dw", name = "D", descriptor = "[Z")
    public static boolean[] field10327;

    @OriginalMember(owner = "client!dw", name = "o", descriptor = "I")
    public static int field10312;

    @OriginalMember(owner = "client!dw", name = "p", descriptor = "I")
    public static int field10313;

    @OriginalMember(owner = "client!dw", name = "q", descriptor = "I")
    public static int field10314;

    @OriginalMember(owner = "client!dw", name = "t", descriptor = "I")
    public static int field10317;

    @OriginalMember(owner = "client!dw", name = "v", descriptor = "I")
    public static int field10319;

    @OriginalMember(owner = "client!dw", name = "w", descriptor = "I")
    public static int field10320;

    @OriginalMember(owner = "client!dw", name = "x", descriptor = "I")
    public static int field10321;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field10324[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field10316[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
        field10327 = new boolean[100];
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)V", line = 7)
    public static void method4136(byte arg0) {
        if (arg0 != 85) {
            method4141(122);
        }
        field10327 = null;
        field10316 = null;
        field10324 = null;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIZ)V", line = 21)
    public static final void method4137(int arg0, int arg1, int arg2, boolean arg3) {
        field10319++;
        int var4 = arg1 << 3;
        int var5 = arg0 << 3;
        int var6 = arg2 << 3;
        class282.field4151 = var5;
        class135.field1974 = var6;
        if (class502.field6938 == 2) {
            class253.field3733 = var5;
            class718.field10019 = var6;
            class162.field2209 = var4;
        }
        class320.method2033((byte) 59);
        class757.field10501 = true;
        if (arg3) {
            field10327 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B[B[ILmp;)Z", line = 47)
    public final boolean method4138(byte arg0, byte[] arg1, int[] arg2, class793 arg3) {
        field10312++;
        boolean var5 = true;
        int var6 = 0;
        if (arg0 >= -44) {
            method4140(19, null);
        }
        class465 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field10323[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method4369((byte) -122, arg2, var9 >> 2);
                        } else {
                            var7 = arg3.method4367(arg2, var9 >> 2, (byte) 47);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field10322[var8] = var7;
                        this.field10323[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V", line = 103)
    public final void method4139(int arg0) {
        this.field10323 = null;
        field10320++;
        if (arg0 != 1) {
            method4137(-29, 44, 3, true);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILor;)Lor;", line = 116)
    public static final class668 method4140(int arg0, class668 arg1) {
        field10313++;
        if (arg1.field9336 != -1) {
            return class536.method3067(arg1.field9336, 0);
        } else if (arg0 == 1) {
            int var2 = arg1.field9221 >>> 16;
            class394 var3 = new class394(class609.field8283);
            for (class237 var4 = (class237) var3.method2490(72); var4 != null; var4 = (class237) var3.method2486((byte) -15)) {
                if (var4.field3202 == var2) {
                    return class536.method3067((int) var4.field1409, arg0 ^ 0x1);
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)V", line = 164)
    public static final void method4141(int arg0) {
        class298.field4317.method1295(5, -31533);
        field10321++;
        class473.field6534.method2307(5, -3000);
        class381.field5566.method1158((byte) -96, 5);
        class350.field5132.method3729((byte) -43, 5);
        class364.field5309.method3343(124, 5);
        if (arg0 < 29) {
            return;
        }
        class770.field10602.method2464(5, true);
        class6.field65.method1028(5, (byte) -123);
        class784.field10798.method3972((byte) -25, 5);
        class642.field8904.method3236(5, (byte) 68);
        class488.field6763.method2179((byte) -126, 5);
        class89.field1234.method3742((byte) 125, 5);
        class719.field10024.method2127((byte) 68, 5);
        class495.field6846.method2235((byte) 114, 5);
        class159.field2194.method390((byte) 92, 5);
        class206.field2703.method3910(5, -10301);
        class564.field7557.method3255(5, (byte) 55);
        class457.field6339.method786(5, (byte) -43);
        class563.field7548.method2280((byte) 64, 5);
        class723.field10061.method4099(5, true);
        class93.field1329.method4273(-84, 5);
        class273.field4057.method2562((byte) 93, 5);
        class493.field6825.method4284(5, (byte) 63);
        class196.method1345(80, 5);
        class682.method3798(-120, 50);
        class289.method1835(50, (byte) -117);
        class178.method1253((byte) -86, 5);
        class764.method4245(9339, 5);
        class527.field7224.method1546(5, (byte) -8);
        class87.field1226.method1546(5, (byte) -8);
        class167.field2247.method1546(5, (byte) -8);
        class549.field7422.method1546(5, (byte) -8);
        class173.field2322.method1546(5, (byte) -8);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IB)V", line = 220)
    public static final void method4142(int arg0, byte arg1) {
        field10314++;
        if (arg1 < 13) {
            method4142(110, (byte) -69);
        }
        class16 var2 = class94.method753(10, 13175, (long) arg0);
        var2.method118(585134072);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(BI)V", line = 240)
    public static final void method4143(byte arg0, int arg1) {
        class86.field1193 = arg1;
        field10317++;
        class239 var2 = class593.field8007;
        synchronized (class593.field8007) {
            if (arg0 >= -51) {
                method4143((byte) 125, -56);
            }
            class593.field8007.method1555((byte) -3);
        }
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V", line = 253)
    public class749() {
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "([B)V", line = 255)
    public class749(byte[] arg0) {
        this.field10326 = new byte[128];
        this.field10328 = new short[128];
        this.field10325 = new byte[128];
        this.field10318 = new class791[128];
        this.field10322 = new class465[128];
        this.field10311 = new byte[128];
        this.field10323 = new int[128];
        class376 var2 = new class376(arg0);
        int var3;
        for (var3 = 0; var2.field5518[var2.field5459 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2387((byte) 67);
        }
        var3++;
        var2.field5459++;
        int var6 = var2.field5459;
        var2.field5459 += var3;
        int var7;
        for (var7 = 0; var2.field5518[var2.field5459 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2387((byte) 33);
        }
        var7++;
        var2.field5459++;
        int var10 = var2.field5459;
        var2.field5459 += var7;
        int var11;
        for (var11 = 0; var2.field5518[var2.field5459 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2387((byte) 31);
        }
        var11++;
        var2.field5459++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method2398(-1372747256);
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
        class791[] var18 = new class791[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class791 var102 = var18[var19] = new class791();
            int var103 = var2.method2398(-1372747256);
            if (var103 > 0) {
                var102.field10876 = new byte[var103 * 2];
            }
            int var104 = var2.method2398(-1372747256);
            if (var104 > 0) {
                var102.field10883 = new byte[var104 * 2 + 2];
                var102.field10883[1] = 64;
            }
        }
        int var20 = var2.method2398(-1372747256);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method2398(-1372747256);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field5518[var2.field5459 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method2387((byte) 119);
        }
        var24++;
        var2.field5459++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method2398(-1372747256);
            this.field10328[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method2398(-1372747256);
            this.field10328[var30] = (short) (this.field10328[var30] + (var29 << 8));
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
                var33 = var2.method2392(-1);
            }
            this.field10328[var34] = (short) (this.field10328[var34] + (class440.method2643(var33 - 1, 2) << 14));
            this.field10323[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field10323[var38] != 0) {
                if (var35 == 0) {
                    var37 = var2.field5518[var6++] - 1;
                    if (var36 >= var4.length) {
                        var35 = -1;
                    } else {
                        var35 = var4[var36++];
                    }
                }
                var35--;
                this.field10325[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field10323[var42] != 0) {
                if (var40 == 0) {
                    if (var39 < var8.length) {
                        var40 = var8[var39++];
                    } else {
                        var40 = -1;
                    }
                    var41 = var2.field5518[var10++] + 16 << 2;
                }
                this.field10326[var42] = (byte) var41;
                var40--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class791 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field10323[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var12.length > var44) {
                        var43 = var12[var44++];
                    } else {
                        var43 = -1;
                    }
                }
                var43--;
                this.field10318[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var25.length > var47) {
                    var48 = var25[var47++];
                } else {
                    var48 = -1;
                }
                if (this.field10323[var50] > 0) {
                    var49 = var2.method2398(-1372747256) + 1;
                }
            }
            var48--;
            this.field10311[var50] = (byte) var49;
        }
        this.field10315 = var2.method2398(-1372747256) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class791 var99 = var18[var51];
            if (var99.field10876 != null) {
                for (int var100 = 1; var100 < var99.field10876.length; var100 += 2) {
                    var99.field10876[var100] = var2.method2387((byte) 66);
                }
            }
            if (var99.field10883 != null) {
                for (int var101 = 3; var101 < (var99.field10883.length - 2); var101 += 2) {
                    var99.field10883[var101] = var2.method2387((byte) 60);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method2387((byte) 18);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method2387((byte) -102);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class791 var96 = var18[var54];
            if (var96.field10883 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field10883.length; var98 += 2) {
                    var97 = var2.method2398(-1372747256) + var97 + 1;
                    var96.field10883[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class791 var93 = var18[var55];
            if (var93.field10876 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field10876.length; var95 += 2) {
                    var94 = var2.method2398(-1372747256) + var94 + 1;
                    var93.field10876[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method2398(-1372747256);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 += var2.method2398(-1372747256) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field10311[var60] = (byte) (this.field10311[var60] * var59 + 32 >> 6);
            }
            for (int var61 = 2; var61 < var21.length; var61 += 2) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class566.method3165(var64 - var58, -1682735553, var66);
                    this.field10311[var67] = (byte) (this.field10311[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var59 = var65;
                var58 = var64;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field10311[var63] = (byte) (this.field10311[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method2398(-1372747256);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 += var2.method2398(-1372747256) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field10326[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field10326[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class566.method3165(var78 - var71, -1682735553, var80);
                    int var83 = (this.field10326[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field10326[var81] = (byte) var83;
                    var80 += var79 - var72;
                }
                var74 += 2;
                var72 = var79;
                var71 = var78;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field10326[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field10326[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field10879 = var2.method2398(-1372747256);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class791 var92 = var18[var86];
            if (var92.field10876 != null) {
                var92.field10884 = var2.method2398(-1372747256);
            }
            if (var92.field10883 != null) {
                var92.field10873 = var2.method2398(-1372747256);
            }
            if (var92.field10879 > 0) {
                var92.field10886 = var2.method2398(-1372747256);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field10878 = var2.method2398(-1372747256);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class791 var91 = var18[var88];
            if (var91.field10878 > 0) {
                var91.field10880 = var2.method2398(-1372747256);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class791 var90 = var18[var89];
            if (var90.field10880 > 0) {
                var90.field10874 = var2.method2398(-1372747256);
            }
        }
    }
}
