import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class547 {

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "I")
    private int field7957 = 0;

    @OriginalMember(owner = "client!ot", name = "o", descriptor = "[I")
    private int[] field7964 = new int[8191];

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "[[Lgk;")
    private class440[][] field7960 = new class440[64][768];

    @OriginalMember(owner = "client!ot", name = "s", descriptor = "[I")
    private int[] field7968 = new int[64];

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "[[Lgk;")
    private class440[][] field7954 = new class440[1600][64];

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "[I")
    private int[] field7952 = new int[1600];

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "Lqf;")
    private class633 field7958;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "Log;")
    private class601 field7951;

    @OriginalMember(owner = "client!ot", name = "r", descriptor = "Log;")
    private class601 field7967;

    @OriginalMember(owner = "client!ot", name = "m", descriptor = "Lbo;")
    private class679 field7962;

    @OriginalMember(owner = "client!ot", name = "p", descriptor = "I")
    public static int field7965 = 52;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field7950;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
    public static int field7953;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
    public static int field7955;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    public static int field7956;

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
    public static int field7959;

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "I")
    public static int field7961;

    @OriginalMember(owner = "client!ot", name = "n", descriptor = "I")
    public static int field7963;

    @OriginalMember(owner = "client!ot", name = "q", descriptor = "I")
    public static int field7966;

    @OriginalMember(owner = "client!ot", name = "t", descriptor = "I")
    public static int field7969;

    @OriginalMember(owner = "client!ot", name = "u", descriptor = "Lri;")
    public static class97 field7970;

    @OriginalMember(owner = "client!ot", name = "v", descriptor = "[I")
    public static int[] field7971;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILrr;)V")
    private final void method3301(int arg0, class332 arg1) {
        class204.field3326 = arg1.field5344;
        field7950++;
        arg1.method2278((byte) -107);
        arg1.method2261((byte) -55, false);
        arg1.method2224((byte) -18, false);
        if (arg0 != -30068) {
            this.method3309((byte) 11, null);
        }
        arg1.method2226(7554);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Ltt;ILrr;I)V")
    public final void method3302(class79 arg0, int arg1, class332 arg2, int arg3) {
        field7963++;
        if (arg2.field5320 == null) {
            return;
        }
        if (arg3 >= 0) {
            this.method3308(925547344, arg3, arg2);
        } else {
            this.method3301(-30068, arg2);
        }
        float var5 = arg2.field5320.field7278;
        float var6 = arg2.field5320.field7276;
        float var7 = arg2.field5320.field7294;
        float var8 = arg2.field5320.field7268;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class253 var12 = arg0.field999.field4346;
            for (class253 var13 = var12.field4042; var13 != var12; var13 = var13.field4042) {
                class440 var14 = (class440) var13;
                int var15 = (int) ((float) (var14.field6710 >> 12) * var7 + (float) (var14.field6711 >> 12) * var5 + (float) (var14.field6705 >> 12) * var6 + var8);
                if (var15 < var10) {
                    var10 = var15;
                }
                this.field7964[var9++] = var15;
                if (var15 > var11) {
                    var11 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 > 1600) {
                var17 = class622.method3610((byte) -127, var16) + 1 - class182.field3059;
                var16 = (var16 >> var17) + 2;
            } else {
                var16 += 2;
                var17 = 0;
            }
            class253 var18 = var12.field4042;
            int var19 = 0;
            int var20 = -2;
            boolean var21 = true;
            if (arg1 != 25030) {
                this.method3307(true, null);
            }
            boolean var22 = true;
            while (var12 != var18) {
                this.field7957 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field7952[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field7968[var24] = 0;
                }
                while (var12 != var18) {
                    class440 var25 = (class440) var18;
                    if (var22) {
                        var20 = var25.field6701;
                        var22 = false;
                        var21 = var25.field6703;
                    }
                    if (var19 > 0 && (var25.field6701 != var20 || var21 != var25.field6703)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field7964[var19++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field7952[var26] < 64) {
                            this.field7954[var26][this.field7952[var26]++] = var25;
                        } else {
                            label106: {
                                if (this.field7952[var26] == 64) {
                                    if (this.field7957 == 64) {
                                        break label106;
                                    }
                                    this.field7952[var26] += this.field7957++ + 1;
                                }
                                this.field7960[this.field7952[var26] - 65][this.field7968[this.field7952[var26] - 64 - 1]++] = var25;
                            }
                        }
                    }
                    var18 = var18.field4042;
                }
                arg2.method2242(false, -14500, ~var20 <= -1 ? var20 : -1, false);
                if (var21 && class204.field3326 != arg2.field5344) {
                    arg2.method342(class204.field3326);
                } else if (arg2.field5344 != 1.0F) {
                    arg2.method342(1.0F);
                }
                this.method3305(0, arg2, var16);
            }
        } catch (Exception var27) {
        }
        this.method3309((byte) -104, arg2);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V")
    public final void method3303(int arg0) {
        if (arg0 == 0) {
            this.field7951.method431(-5517);
            field7956++;
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V")
    public static void method3304(int arg0) {
        if (arg0 == 0) {
            field7970 = null;
            field7971 = null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILrr;I)V")
    private final void method3305(int arg0, class332 arg1, int arg2) {
        field7953++;
        int var4 = arg0;
        class498 var5 = arg1.method2303((byte) 75);
        float var6 = var5.field7287;
        float var7 = var5.field7298;
        float var8 = var5.field7283;
        float var9 = var5.field7266;
        float var10 = var5.field7269;
        float var11 = var5.field7267;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field7951.method1726(true, true);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg1.method2286(var21, (byte) -98);
        if (Stream.method3620()) {
            for (int var48 = arg2 - 1; var48 >= 0; var48--) {
                int var49 = this.field7952[var48] > 64 ? 64 : this.field7952[var48];
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class440 var63 = this.field7954[var48][var50];
                        int var64 = var63.field6708;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field6711 >> 12);
                        float var70 = (float) (var63.field6705 >> 12);
                        float var71 = (float) (var63.field6710 >> 12);
                        int var72 = var63.field6709 >> 12;
                        var22.method3621((float) (-var72) * var12 + var69);
                        var22.method3621((float) (-var72) * var13 + var70);
                        var22.method3621((float) (-var72) * var14 + var71);
                        if (arg1.field5358 == 0) {
                            var22.method3632(var65, var66, var67, var68);
                        } else {
                            var22.method3625(var65, var66, var67, var68);
                        }
                        var22.method3621(0.0F);
                        var22.method3621(0.0F);
                        var22.method3621((float) var72 * var15 + var69);
                        var22.method3621((float) var72 * var16 + var70);
                        var22.method3621((float) var72 * var17 + var71);
                        if (arg1.field5358 == 0) {
                            var22.method3632(var65, var66, var67, var68);
                        } else {
                            var22.method3625(var65, var66, var67, var68);
                        }
                        var22.method3621(1.0F);
                        var22.method3621(0.0F);
                        var22.method3621((float) var72 * var12 + var69);
                        var22.method3621((float) var72 * var13 + var70);
                        var22.method3621((float) var72 * var14 + var71);
                        if (arg1.field5358 == 0) {
                            var22.method3632(var65, var66, var67, var68);
                        } else {
                            var22.method3625(var65, var66, var67, var68);
                        }
                        var22.method3621(1.0F);
                        var22.method3621(1.0F);
                        var22.method3621((float) var72 * var18 + var69);
                        var22.method3621((float) var72 * var19 + var70);
                        var22.method3621((float) var72 * var20 + var71);
                        if (arg1.field5358 == 0) {
                            var22.method3632(var65, var66, var67, var68);
                        } else {
                            var22.method3625(var65, var66, var67, var68);
                        }
                        var22.method3621(0.0F);
                        var4++;
                        var22.method3621(1.0F);
                    }
                    if (this.field7952[var48] > 64) {
                        int var51 = this.field7952[var48] - 1 - 64;
                        for (int var52 = this.field7968[var51] - 1; var52 >= 0; var52--) {
                            class440 var53 = this.field7960[var51][var52];
                            int var54 = var53.field6708;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field6711 >> 12);
                            float var60 = (float) (var53.field6705 >> 12);
                            float var61 = (float) (var53.field6710 >> 12);
                            int var62 = var53.field6709 >> 12;
                            var22.method3621((float) (-var62) * var12 + var59);
                            var22.method3621((float) (-var62) * var13 + var60);
                            var22.method3621((float) (-var62) * var14 + var61);
                            if (arg1.field5358 == 0) {
                                var22.method3632(var55, var56, var57, var58);
                            } else {
                                var22.method3625(var55, var56, var57, var58);
                            }
                            var22.method3621(0.0F);
                            var22.method3621(0.0F);
                            var22.method3621((float) var62 * var15 + var59);
                            var22.method3621((float) var62 * var16 + var60);
                            var22.method3621((float) var62 * var17 + var61);
                            if (arg1.field5358 == 0) {
                                var22.method3632(var55, var56, var57, var58);
                            } else {
                                var22.method3625(var55, var56, var57, var58);
                            }
                            var22.method3621(1.0F);
                            var22.method3621(0.0F);
                            var22.method3621((float) var62 * var12 + var59);
                            var22.method3621((float) var62 * var13 + var60);
                            var22.method3621((float) var62 * var14 + var61);
                            if (arg1.field5358 == 0) {
                                var22.method3632(var55, var56, var57, var58);
                            } else {
                                var22.method3625(var55, var56, var57, var58);
                            }
                            var22.method3621(1.0F);
                            var22.method3621(1.0F);
                            var22.method3621((float) var62 * var18 + var59);
                            var22.method3621((float) var62 * var19 + var60);
                            var22.method3621((float) var62 * var20 + var61);
                            if (arg1.field5358 == 0) {
                                var22.method3632(var55, var56, var57, var58);
                            } else {
                                var22.method3625(var55, var56, var57, var58);
                            }
                            var22.method3621(0.0F);
                            var4++;
                            var22.method3621(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var23 = arg2 - 1; var23 >= 0; var23--) {
                int var24 = this.field7952[var23] <= 64 ? this.field7952[var23] : 64;
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class440 var38 = this.field7954[var23][var25];
                        int var39 = var38.field6708;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field6711 >> 12);
                        float var45 = (float) (var38.field6705 >> 12);
                        float var46 = (float) (var38.field6710 >> 12);
                        int var47 = var38.field6709 >> 12;
                        var22.method3630((float) (-var47) * var12 + var44);
                        var22.method3630((float) (-var47) * var13 + var45);
                        var22.method3630((float) (-var47) * var14 + var46);
                        if (arg1.field5358 == 0) {
                            var22.method3632(var40, var41, var42, var43);
                        } else {
                            var22.method3625(var40, var41, var42, var43);
                        }
                        var22.method3630(0.0F);
                        var22.method3630(0.0F);
                        var22.method3630((float) var47 * var15 + var44);
                        var22.method3630((float) var47 * var16 + var45);
                        var22.method3630((float) var47 * var17 + var46);
                        if (arg1.field5358 == 0) {
                            var22.method3632(var40, var41, var42, var43);
                        } else {
                            var22.method3625(var40, var41, var42, var43);
                        }
                        var22.method3630(1.0F);
                        var22.method3630(0.0F);
                        var22.method3630((float) var47 * var12 + var44);
                        var22.method3630((float) var47 * var13 + var45);
                        var22.method3630((float) var47 * var14 + var46);
                        if (arg1.field5358 == 0) {
                            var22.method3632(var40, var41, var42, var43);
                        } else {
                            var22.method3625(var40, var41, var42, var43);
                        }
                        var22.method3630(1.0F);
                        var22.method3630(1.0F);
                        var22.method3630((float) var47 * var18 + var44);
                        var22.method3630((float) var47 * var19 + var45);
                        var22.method3630((float) var47 * var20 + var46);
                        if (arg1.field5358 == 0) {
                            var22.method3632(var40, var41, var42, var43);
                        } else {
                            var22.method3625(var40, var41, var42, var43);
                        }
                        var22.method3630(0.0F);
                        var22.method3630(1.0F);
                        var4++;
                    }
                    if (this.field7952[var23] > 64) {
                        int var26 = this.field7952[var23] - 64 - 1;
                        for (int var27 = this.field7968[var26] - 1; var27 >= 0; var27--) {
                            class440 var28 = this.field7960[var26][var27];
                            int var29 = var28.field6708;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field6711 >> 12);
                            float var35 = (float) (var28.field6705 >> 12);
                            float var36 = (float) (var28.field6710 >> 12);
                            int var37 = var28.field6709 >> 12;
                            var22.method3630((float) (-var37) * var12 + var34);
                            var22.method3630((float) (-var37) * var13 + var35);
                            var22.method3630((float) (-var37) * var14 + var36);
                            if (arg1.field5358 == 0) {
                                var22.method3632(var30, var31, var32, var33);
                            } else {
                                var22.method3625(var30, var31, var32, var33);
                            }
                            var22.method3630(0.0F);
                            var22.method3630(0.0F);
                            var22.method3630((float) var37 * var15 + var34);
                            var22.method3630((float) var37 * var16 + var35);
                            var22.method3630((float) var37 * var17 + var36);
                            if (arg1.field5358 == 0) {
                                var22.method3632(var30, var31, var32, var33);
                            } else {
                                var22.method3625(var30, var31, var32, var33);
                            }
                            var22.method3630(1.0F);
                            var22.method3630(0.0F);
                            var22.method3630((float) var37 * var12 + var34);
                            var22.method3630((float) var37 * var13 + var35);
                            var22.method3630((float) var37 * var14 + var36);
                            if (arg1.field5358 == 0) {
                                var22.method3632(var30, var31, var32, var33);
                            } else {
                                var22.method3625(var30, var31, var32, var33);
                            }
                            var22.method3630(1.0F);
                            var22.method3630(1.0F);
                            var22.method3630((float) var37 * var18 + var34);
                            var22.method3630((float) var37 * var19 + var35);
                            var22.method3630((float) var37 * var20 + var36);
                            if (arg1.field5358 == 0) {
                                var22.method3632(var30, var31, var32, var33);
                            } else {
                                var22.method3625(var30, var31, var32, var33);
                            }
                            var22.method3630(0.0F);
                            var22.method3630(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        var22.method3626();
        if (this.field7951.method1722(arg0 ^ 0xFFFFA573)) {
            arg1.method178(this.field7951, 0, -103);
            arg1.method178(this.field7967, 1, -89);
            arg1.method137(-83, this.field7958);
            arg1.method120(class646.field9077, var4 * 4, this.field7962, 0, 123, var4 * 2, 0);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZIII)I")
    public static final int method3306(boolean arg0, int arg1, int arg2, int arg3) {
        field7959++;
        class527 var4 = class605.method3523(arg0, (byte) 127, arg3);
        if (var4 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var5 = 0;
            int var6 = 0;
            if (arg2 >= -113) {
                return -111;
            }
            while (var6 < var4.field7697.length) {
                if (var4.field7693[var6] == arg1) {
                    var5 += var4.field7697[var6];
                }
                var6++;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZLrr;)V")
    public final void method3307(boolean arg0, class332 arg1) {
        this.field7951.method1725((byte) 71, 786336, 24);
        if (!arg0) {
            this.field7964 = null;
        }
        field7961++;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IILrr;)V")
    private final void method3308(int arg0, int arg1, class332 arg2) {
        class204.field3326 = arg2.field5344;
        field7955++;
        if (arg0 != 925547344) {
            return;
        }
        arg2.method2279(-17208, (float) arg1);
        arg2.method2231(true);
        arg2.method2261((byte) -123, false);
        arg2.method2224((byte) -18, false);
        arg2.method2226(7554);
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lrr;)V")
    public class547(class332 arg0) {
        this.field7958 = arg0.method105((byte) 123, new class108[] { new class108(new class369[] { class369.field5774, class369.field5776, class369.field5778 }), new class108(class369.field5775) });
        this.field7951 = arg0.method174(true, 75);
        this.field7967 = arg0.method174(false, 105);
        this.field7967.method1725((byte) -123, 393168, 12);
        this.field7962 = arg0.method113(false, 125);
        this.field7962.method424((byte) -116, 49146);
        Buffer var2 = this.field7962.method430(true, (byte) -107);
        if (var2 != null) {
            Stream var3 = arg0.method2286(var2, (byte) -80);
            if (Stream.method3620()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3628(var7);
                    var3.method3628(var7 + 1);
                    var3.method3628(var7 + 2);
                    var3.method3628(var7 + 2);
                    var3.method3628(var7 + 3);
                    var3.method3628(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3623(var5);
                    var3.method3623(var5 + 1);
                    var3.method3623(var5 + 2);
                    var3.method3623(var5 + 2);
                    var3.method3623(var5 + 3);
                    var3.method3623(var5);
                }
            }
            var3.method3626();
            this.field7962.method425(30899);
        }
        Buffer var8 = this.field7967.method1726(true, true);
        if (var8 != null) {
            Stream var9 = arg0.method2286(var8, (byte) -94);
            if (Stream.method3620()) {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3621(0.0F);
                    var9.method3621(-1.0F);
                    var9.method3621(0.0F);
                    var9.method3621(0.0F);
                    var9.method3621(-1.0F);
                    var9.method3621(0.0F);
                    var9.method3621(0.0F);
                    var9.method3621(-1.0F);
                    var9.method3621(0.0F);
                    var9.method3621(0.0F);
                    var9.method3621(-1.0F);
                    var9.method3621(0.0F);
                }
            } else {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3630(0.0F);
                    var9.method3630(-1.0F);
                    var9.method3630(0.0F);
                    var9.method3630(0.0F);
                    var9.method3630(-1.0F);
                    var9.method3630(0.0F);
                    var9.method3630(0.0F);
                    var9.method3630(-1.0F);
                    var9.method3630(0.0F);
                    var9.method3630(0.0F);
                    var9.method3630(-1.0F);
                    var9.method3630(0.0F);
                }
            }
            var9.method3626();
            this.field7967.method1722(-23181);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(BLrr;)V")
    private final void method3309(byte arg0, class332 arg1) {
        arg1.method2224((byte) -18, true);
        field7969++;
        arg1.method2261((byte) -65, true);
        if (class204.field3326 != arg1.field5344) {
            arg1.method342(class204.field3326);
        }
        if (arg0 >= -5) {
            this.method3308(67, 51, null);
        }
    }
}
