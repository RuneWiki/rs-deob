import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class210 extends class217 {

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "[I")
    private int[] field3317;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "[Lbf;")
    public class329[] field3313;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "[B")
    public byte[] field3309;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "[B")
    public byte[] field3311;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "[B")
    public byte[] field3307;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "[Lik;")
    public class259[] field3315;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "[S")
    public short[] field3310;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public int field3305;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field3299 = -2;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field3306 = 0;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "[I")
    public static int[] field3302;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 6)
    public static void method1492(int arg0) {
        if (arg0 != -22349) {
            method1493(-54, -9, -38, 9, true, 51);
        }
        field3302 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIZI)V", line = 20)
    public static final void method1493(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var9 = arg5 + 1;
        class138.method1047(arg0, arg1, arg3, 7, class320.field4990[arg5]);
        field3308++;
        if (!arg4) {
            return;
        }
        int var8 = arg2 - 1;
        class138.method1047(arg0, arg1, arg3, 7, class320.field4990[arg2]);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class320.field4990[var6];
            var7[arg3] = var7[arg1] = arg0;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Leb;I[B[I)Z", line = 47)
    public final boolean method1494(class115 arg0, int arg1, byte[] arg2, int[] arg3) {
        boolean var5 = true;
        int var6 = 0;
        field3304++;
        if (arg1 != -21623) {
            return true;
        }
        class259 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field3317[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method895(5300, arg3, var9 >> 2);
                        } else {
                            var7 = arg0.method901(var9 >> 2, arg3, (byte) 107);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field3315[var8] = var7;
                        this.field3317[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BILld;I)V", line = 112)
    public static final void method1495(byte arg0, int arg1, class121 arg2, int arg3) {
        if (arg0 < 93) {
            field3299 = 4;
        }
        field3316++;
        if (arg2.field4439 == arg3 && arg3 != -1) {
            class162 var4 = class173.method1259((byte) 119, arg3);
            int var5 = var4.field2402;
            if (var5 == 1) {
                arg2.field4522 = 0;
                arg2.field4437 = arg1;
                arg2.field4508 = 0;
                arg2.field4504 = 1;
                arg2.field4536 = 0;
                class158.method1143(arg2.field4496, 93, arg2.field4507, var4, class235.field3602 == arg2, arg2.field4536);
            }
            if (var5 == 2) {
                arg2.field4522 = 0;
            }
        } else if (arg3 == -1 || arg2.field4439 == -1 || class173.method1259((byte) 119, arg3).field2405 >= class173.method1259((byte) 119, arg2.field4439).field2405) {
            arg2.field4504 = 1;
            arg2.field4536 = 0;
            arg2.field4439 = arg3;
            arg2.field4508 = 0;
            arg2.field4522 = 0;
            arg2.field4437 = arg1;
            arg2.field4528 = arg2.field4453;
            if (arg2.field4439 != -1) {
                class158.method1143(arg2.field4496, 91, arg2.field4507, class173.method1259((byte) 119, arg2.field4439), class235.field3602 == arg2, arg2.field4536);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(III)Luc;", line = 173)
    public static final class190 method1496(int arg0, int arg1, int arg2) {
        field3300++;
        for (class190 var3 = (class190) class87.field1276.method986(false); var3 != null; var3 = (class190) class87.field1276.method982(14877)) {
            if (var3.field3030 && var3.method1370(arg2, (byte) -79, arg1)) {
                return var3;
            }
        }
        if (arg0 == 1) {
            return null;
        } else {
            return (class190) null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)V", line = 200)
    public final void method1497(byte arg0) {
        int var2 = 19 % ((-arg0 - 77) / 47);
        field3298++;
        this.field3317 = null;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V", line = 207)
    public class210() {
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "([B)V", line = 209)
    public class210(byte[] arg0) {
        this.field3317 = new int[128];
        this.field3313 = new class329[128];
        this.field3309 = new byte[128];
        this.field3311 = new byte[128];
        this.field3307 = new byte[128];
        this.field3315 = new class259[128];
        int var2 = 0;
        this.field3310 = new short[128];
        class35 var3 = new class35(arg0);
        while (var3.field437[var3.field455 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method242((byte) -93);
        }
        var2++;
        var3.field455++;
        int var6 = var3.field455;
        int var7 = 0;
        var3.field455 += var2;
        while (var3.field437[var3.field455 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method242((byte) -93);
        }
        var3.field455++;
        int var10 = var3.field455;
        var7++;
        var3.field455 += var7;
        int var11;
        for (var11 = 0; var3.field437[var3.field455 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method242((byte) -93);
        }
        var11++;
        var3.field455++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method273(65280);
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
        class329[] var19 = new class329[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class329 var21 = var19[var20] = new class329();
            int var22 = var3.method273(65280);
            if (var22 > 0) {
                var21.field5100 = new byte[var22 * 2];
            }
            int var23 = var3.method273(65280);
            if (var23 > 0) {
                var21.field5095 = new byte[var23 * 2 + 2];
                var21.field5095[1] = 64;
            }
        }
        int var24 = var3.method273(65280);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        int var26 = var3.method273(65280);
        int var27 = 0;
        byte[] var28 = var26 <= 0 ? null : new byte[var26 * 2];
        while (var3.field437[var3.field455 + var27] != 0) {
            var27++;
        }
        byte[] var29 = new byte[var27];
        for (int var30 = 0; var30 < var27; var30++) {
            var29[var30] = var3.method242((byte) -93);
        }
        var27++;
        var3.field455++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method273(65280);
            this.field3310[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method273(65280);
            this.field3310[var34] = (short) (this.field3310[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var29.length <= var36) {
                    var35 = -1;
                } else {
                    var35 = var29[var36++];
                }
                var37 = var3.method238((byte) 47);
            }
            var35--;
            this.field3310[var38] = (short) (this.field3310[var38] + class142.method1078(32768, var37 - 1 << 14));
            this.field3317[var38] = var37;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3317[var42] != 0) {
                if (var41 == 0) {
                    if (var4.length > var39) {
                        var41 = var4[var39++];
                    } else {
                        var41 = -1;
                    }
                    var40 = var3.field437[var6++] - 1;
                }
                var41--;
                this.field3307[var42] = (byte) var40;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3317[var46] != 0) {
                if (var44 == 0) {
                    var45 = var3.field437[var10++] + 16 << 2;
                    if (var43 >= var8.length) {
                        var44 = -1;
                    } else {
                        var44 = var8[var43++];
                    }
                }
                var44--;
                this.field3309[var46] = (byte) var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class329 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field3317[var50] != 0) {
                if (var47 == 0) {
                    var49 = var19[var14[var48]];
                    if (var12.length <= var48) {
                        var47 = -1;
                    } else {
                        var47 = var12[var48++];
                    }
                }
                var47--;
                this.field3313[var50] = var49;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var51 == 0) {
                if (var52 < var29.length) {
                    var51 = var29[var52++];
                } else {
                    var51 = -1;
                }
                if (this.field3317[var54] > 0) {
                    var53 = var3.method273(65280) + 1;
                }
            }
            this.field3311[var54] = (byte) var53;
            var51--;
        }
        this.field3305 = var3.method273(65280) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class329 var56 = var19[var55];
            if (var56.field5100 != null) {
                for (int var57 = 1; var57 < var56.field5100.length; var57 += 2) {
                    var56.field5100[var57] = var3.method242((byte) -93);
                }
            }
            if (var56.field5095 != null) {
                for (int var58 = 3; var58 < (var56.field5095.length - 2); var58 += 2) {
                    var56.field5095[var58] = var3.method242((byte) -93);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method242((byte) -93);
            }
        }
        if (var28 != null) {
            for (int var60 = 1; var60 < var28.length; var60 += 2) {
                var28[var60] = var3.method242((byte) -93);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class329 var62 = var19[var61];
            if (var62.field5095 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field5095.length; var64 += 2) {
                    var63 -= -var3.method273(65280) - 1;
                    var62.field5095[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class329 var66 = var19[var65];
            if (var66.field5100 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field5100.length; var68 += 2) {
                    var67 = var3.method273(65280) + var67 + 1;
                    var66.field5100[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method273(65280);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var69 + var3.method273(65280) + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field3311[var73] = (byte) (this.field3311[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var25.length > var74) {
                byte var75 = var25[var74];
                byte var76 = var25[var74 + 1];
                int var77 = (var75 - var71) / 2 + (var75 - var71) * var72;
                var74 += 2;
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class133.method1008(var75 - var71, (byte) -78, var77);
                    var77 += var76 - var72;
                    this.field3311[var78] = (byte) (this.field3311[var78] * var79 + 32 >> 6);
                }
                var71 = var75;
                var72 = var76;
            }
            for (int var80 = var71; var80 < 128; var80++) {
                this.field3311[var80] = (byte) (this.field3311[var80] * var72 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var28 != null) {
            int var82 = var3.method273(65280);
            var28[0] = (byte) var82;
            for (int var83 = 2; var83 < var28.length; var83 += 2) {
                var82 = var3.method273(65280) + var82 + 1;
                var28[var83] = (byte) var82;
            }
            byte var84 = var28[0];
            int var85 = var28[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field3309[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field3309[var86] = (byte) var87;
            }
            for (int var88 = 2; var88 < var28.length; var88 += 2) {
                byte var89 = var28[var88];
                int var90 = (var89 - var84) * var85 + ((var89 - var84) / 2);
                int var91 = var28[var88 + 1] << 1;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class133.method1008(var89 - var84, (byte) -78, var90);
                    var90 += var91 - var85;
                    int var94 = (this.field3309[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field3309[var92] = (byte) var94;
                }
                var85 = var91;
                var84 = var89;
            }
            Object var95 = null;
            for (int var96 = var84; var96 < 128; var96++) {
                int var97 = (this.field3309[var96] & 0xFF) + var85;
                if (var97 < 0) {
                    var97 = 0;
                }
                if (var97 > 128) {
                    var97 = 128;
                }
                this.field3309[var96] = (byte) var97;
            }
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field5089 = var3.method273(65280);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class329 var100 = var19[var99];
            if (var100.field5100 != null) {
                var100.field5096 = var3.method273(65280);
            }
            if (var100.field5095 != null) {
                var100.field5093 = var3.method273(65280);
            }
            if (var100.field5089 > 0) {
                var100.field5090 = var3.method273(65280);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field5097 = var3.method273(65280);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class329 var103 = var19[var102];
            if (var103.field5097 > 0) {
                var103.field5092 = var3.method273(65280);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class329 var105 = var19[var104];
            if (var105.field5092 > 0) {
                var105.field5091 = var3.method273(65280);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lpj;IIII)V", line = 850)
    public static final void method1498(class183 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3303++;
        if (class6.field62 >= 400) {
            return;
        }
        if (arg0.field2738 != null) {
            arg0 = arg0.method1329(107);
        }
        if (arg1 < 114 || arg0 == null || !arg0.field2785) {
            return;
        }
        String var5 = arg0.field2776;
        if (arg0.field2781 != 0) {
            String var6 = class3.field12 == 1 ? class95.field1384 : class270.field4084;
            var5 = var5 + class198.method1443(-102, arg0.field2781, class235.field3602.field1910) + " (" + var6 + arg0.field2781 + ")";
        }
        if (class327.field5077 == 1) {
            class196.method1419((long) arg4, class307.field4792, class325.field5061, class220.field3452 + " -> <col=ffff00>" + var5, arg2, arg3, (byte) -4, (short) 1);
            class13.field146++;
        } else if (class81.field1136) {
            class144 var14 = class143.field2206 == -1 ? null : class180.method1307(class143.field2206, -122);
            if ((class44.field687 & 0x2) != 0 && (var14 == null || arg0.method1328(class143.field2206, (byte) -107, var14.field2222) != var14.field2222)) {
                class69.field1009++;
                class196.method1419((long) arg4, class309.field4805, class88.field1295, class209.field3290 + " -> <col=ffff00>" + var5, arg2, arg3, (byte) -4, (short) 59);
            }
        } else {
            class289.field4546++;
            String[] var7 = arg0.field2795;
            if (class130.field2034) {
                var7 = class54.method482(0, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class3.field12 != 0 || !var7[var8].equalsIgnoreCase(class153.field2314))) {
                        class113.field1772++;
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 3;
                        }
                        if (var8 == 1) {
                            var9 = 32;
                        }
                        if (var8 == 2) {
                            var9 = 39;
                        }
                        int var10 = -1;
                        if (var8 == 3) {
                            var9 = 42;
                        }
                        if (var8 == 4) {
                            var9 = 50;
                        }
                        if (arg0.field2771 == var8) {
                            var10 = arg0.field2787;
                        }
                        if (arg0.field2769 == var8) {
                            var10 = arg0.field2782;
                        }
                        class196.method1419((long) arg4, var7[var8], var10, "<col=ffff00>" + var5, arg2, arg3, (byte) -4, var9);
                    }
                }
            }
            if (class3.field12 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class153.field2314)) {
                        class268.field4032++;
                        short var12 = 0;
                        if (class235.field3602.field1910 < arg0.field2781) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 3;
                        }
                        if (var11 == 1) {
                            var13 = 32;
                        }
                        if (var11 == 2) {
                            var13 = 39;
                        }
                        if (var11 == 3) {
                            var13 = 42;
                        }
                        if (var11 == 4) {
                            var13 = 50;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class196.method1419((long) arg4, var7[var11], arg0.field2759, "<col=ffff00>" + var5, arg2, arg3, (byte) -4, var13);
                    }
                }
            }
            class196.method1419((long) arg4, class201.field3183, class322.field5007, "<col=ffff00>" + var5, arg2, arg3, (byte) -4, (short) 1001);
        }
    }
}
