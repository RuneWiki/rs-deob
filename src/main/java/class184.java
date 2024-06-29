import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class184 extends class43 {

    @OriginalMember(owner = "client!r", name = "W", descriptor = "I")
    private int field3381 = 1;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "I")
    private int field3379 = 1;

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "Lmb;")
    public static class132 field3383 = class166.method1092("Bitte geben Sie Ihr Passwort ein)3", 123);

    @OriginalMember(owner = "client!r", name = "Z", descriptor = "I")
    public static int field3384 = 0;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!r", name = "X", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!r", name = "ab", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!r", name = "bb", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!r", name = "cb", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!r", name = "db", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!r", name = "eb", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()V")
    public static final void method1175() {
        int var0 = class136.field2562[class167.field3047];
        class183[] var1 = class136.field2555[class167.field3047];
        class128.field2379 = 0;
        for (int var2 = 0; var2 < var0; ++var2) {
            class183 var3 = var1[var2];
            if (var3.field3357 == 1) {
                int var4 = var3.field3362 - class155.field2841 + class205.field3756;
                if (var4 >= 0 && var4 <= class205.field3756 + class205.field3756) {
                    int var5 = var3.field3359 - class2.field29 + class205.field3756;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = var3.field3361 - class2.field29 + class205.field3756;
                    if (var6 > class205.field3756 + class205.field3756) {
                        var6 = class205.field3756 + class205.field3756;
                    }
                    boolean var7 = false;
                    while (var5 <= var6) {
                        if (class9.field100[var4][var5++]) {
                            var7 = true;
                            break;
                        }
                    }
                    if (var7) {
                        int var8 = class213.field3897 - var3.field3368;
                        if (var8 > 32) {
                            var3.field3365 = 1;
                        } else {
                            if (var8 >= -32) {
                                continue;
                            }
                            var3.field3365 = 2;
                            var8 = -var8;
                        }
                        var3.field3356 = (var3.field3366 - class191.field3537 << 8) / var8;
                        var3.field3364 = (var3.field3354 - class191.field3537 << 8) / var8;
                        var3.field3369 = (var3.field3367 - class58.field975 << 8) / var8;
                        var3.field3353 = (var3.field3363 - class58.field975 << 8) / var8;
                        class182.field3349[class128.field2379++] = var3;
                    }
                }
            } else if (var3.field3357 == 2) {
                int var9 = var3.field3359 - class2.field29 + class205.field3756;
                if (var9 >= 0 && var9 <= class205.field3756 + class205.field3756) {
                    int var10 = var3.field3362 - class155.field2841 + class205.field3756;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    int var11 = var3.field3373 - class155.field2841 + class205.field3756;
                    if (var11 > class205.field3756 + class205.field3756) {
                        var11 = class205.field3756 + class205.field3756;
                    }
                    boolean var12 = false;
                    while (var10 <= var11) {
                        if (class9.field100[var10++][var9]) {
                            var12 = true;
                            break;
                        }
                    }
                    if (var12) {
                        int var13 = class191.field3537 - var3.field3366;
                        if (var13 > 32) {
                            var3.field3365 = 3;
                        } else {
                            if (var13 >= -32) {
                                continue;
                            }
                            var3.field3365 = 4;
                            var13 = -var13;
                        }
                        var3.field3371 = (var3.field3368 - class213.field3897 << 8) / var13;
                        var3.field3355 = (var3.field3358 - class213.field3897 << 8) / var13;
                        var3.field3369 = (var3.field3367 - class58.field975 << 8) / var13;
                        var3.field3353 = (var3.field3363 - class58.field975 << 8) / var13;
                        class182.field3349[class128.field2379++] = var3;
                    }
                }
            } else if (var3.field3357 == 4) {
                int var14 = var3.field3367 - class58.field975;
                if (var14 > 128) {
                    int var15 = var3.field3359 - class2.field29 + class205.field3756;
                    if (var15 < 0) {
                        var15 = 0;
                    }
                    int var16 = var3.field3361 - class2.field29 + class205.field3756;
                    if (var16 > class205.field3756 + class205.field3756) {
                        var16 = class205.field3756 + class205.field3756;
                    }
                    if (var15 <= var16) {
                        int var17 = var3.field3362 - class155.field2841 + class205.field3756;
                        if (var17 < 0) {
                            var17 = 0;
                        }
                        int var18 = var3.field3373 - class155.field2841 + class205.field3756;
                        if (var18 > class205.field3756 + class205.field3756) {
                            var18 = class205.field3756 + class205.field3756;
                        }
                        boolean var19 = false;
                        label145: for (int var20 = var17; var20 <= var18; ++var20) {
                            for (int var21 = var15; var21 <= var16; ++var21) {
                                if (class9.field100[var20][var21]) {
                                    var19 = true;
                                    break label145;
                                }
                            }
                        }
                        if (var19) {
                            var3.field3365 = 5;
                            var3.field3371 = (var3.field3368 - class213.field3897 << 8) / var14;
                            var3.field3355 = (var3.field3358 - class213.field3897 << 8) / var14;
                            var3.field3356 = (var3.field3366 - class191.field3537 << 8) / var14;
                            var3.field3364 = (var3.field3354 - class191.field3537 << 8) / var14;
                            class182.field3349[class128.field2379++] = var3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(JI)V")
    public static final void method1176(long arg0, int arg1) {
        ++field3378;
        if (arg1 <= 43) {
            method1178(77, (class165) null, (byte) 20);
        }
        if (arg0 != 0L) {
            for (int var3 = 0; ~var3 > ~class138.field2596; ++var3) {
                if (class178.field3282[var3] == arg0) {
                    ++class210.field3850;
                    --class138.field2596;
                    for (int var4 = var3; ~var4 > ~class138.field2596; ++var4) {
                        class178.field3282[var4] = class178.field3282[var4 + 1];
                        class94.field1651[var4] = class94.field1651[var4 + 1];
                    }
                    class113.field2183 = class13.field167;
                    class64.field1054.method660(216, 3);
                    class64.field1054.method709(-27341, arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILmb;)V")
    public static final void method1177(int arg0, class132 arg1) {
        if (arg0 != 1) {
            method1176(46L, 5);
        }
        ++field3386;
        try {
            class230.field4151.getAppletContext().showDocument(arg1.method903(class230.field4151.getCodeBase(), false), "_blank");
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        ++field3382;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field746 = ~arg2.method716(-1308) == -2;
                }
            } else {
                this.field3379 = arg2.method716(arg1 + -1235);
            }
        } else {
            this.field3381 = arg2.method716(-1308);
        }
        if (arg1 != -73) {
            this.method203(102, 62);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILpb;B)[Lhh;")
    public static final class85[] method1178(int arg0, class165 arg1, byte arg2) {
        if (arg2 != 93) {
            method1177(-122, (class132) null);
        }
        ++field3387;
        return !class43.method293(arg0, arg1, -20993) ? null : class71.method434((byte) 73);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        ++field3389;
        int[] var3 = super.field768.method1123(arg1, arg0);
        if (super.field768.field3219) {
            int var4 = this.field3379 - (-this.field3379 + -1);
            int var5 = this.field3381 + 1 + this.field3381;
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][] var8 = new int[var4][];
            for (int var9 = arg0 - this.field3379; var9 <= this.field3379 + arg0; ++var9) {
                int[] var13 = this.method300(102, 0, class185.field3423 & var9);
                int[] var14 = new int[class131.field2427];
                int var15 = 0;
                for (int var16 = -this.field3381; ~var16 >= ~this.field3381; ++var16) {
                    var15 += var13[class90.field1593 & var16];
                }
                int var17 = 0;
                while (var17 < class131.field2427) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field3381 + var17 & class90.field1593];
                    ++var17;
                    var15 = var13[this.field3381 + var17 & class90.field1593] + var18;
                }
                var8[-arg0 + this.field3379 + var9] = var14;
            }
            for (int var10 = 0; ~class131.field2427 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var6 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
    public static void method1179(int arg0) {
        field3383 = null;
        if (arg0 != 8414) {
            method1180(-22, (class159) null, (byte) -121, 115);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[[I")
    public final int[][] method203(int arg0, int arg1) {
        if (arg0 != -1893) {
            this.field3381 = -106;
        }
        ++field3388;
        int[][] var3 = super.field764.method1350((byte) 125, arg1);
        if (super.field764.field3960) {
            int var4 = this.field3379 - (-this.field3379 - 1);
            int var5 = this.field3381 - -this.field3381 + 1;
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field3379 + arg1; this.field3379 + arg1 >= var9; ++var9) {
                int var19 = 0;
                int var20 = 0;
                int[][] var21 = this.method301(var9 & class185.field3423, (byte) -101, 0);
                int[][] var22 = new int[3][class131.field2427];
                int[] var23 = var21[0];
                int[] var24 = var21[2];
                int[] var25 = var21[1];
                int var26 = 0;
                for (int var27 = -this.field3381; var27 <= this.field3381; ++var27) {
                    int var37 = class90.field1593 & var27;
                    var19 += var25[var37];
                    var20 += var23[var37];
                    var26 += var24[var37];
                }
                int[] var28 = var22[0];
                int[] var29 = var22[1];
                int[] var30 = var22[2];
                int var31 = 0;
                while (~class131.field2427 < ~var31) {
                    var28[var31] = var7 * var20 >> 16;
                    var29[var31] = var7 * var19 >> 16;
                    var30[var31] = var7 * var26 >> 16;
                    int var32 = -this.field3381 + var31 & class90.field1593;
                    int var33 = var26 - var24[var32];
                    ++var31;
                    int var34 = var20 - var23[var32];
                    int var35 = var19 - var25[var32];
                    int var36 = class90.field1593 & this.field3381 + var31;
                    var20 = var23[var36] + var34;
                    var26 = var24[var36] + var33;
                    var19 = var25[var36] + var35;
                }
                var8[-arg1 + this.field3379 + var9] = var22;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class131.field2427 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var17 > ~var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var16 += var18[2][var13];
                    var15 += var18[1][var13];
                    var14 += var18[0][var13];
                }
                var10[var13] = var6 * var14 >> 16;
                var11[var13] = var6 * var15 >> 16;
                var12[var13] = var6 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILog;BI)V")
    public static final void method1180(int arg0, class159 arg1, byte arg2, int arg3) {
        ++field3385;
        if (~(arg3 & 32) != -1) {
            arg1.field684 = class118.field2241.method739(arg2 ^ 119);
            arg1.field721 = class118.field2241.method730(arg2 + 1812);
        }
        if ((arg3 & 4) != 0) {
            int var4 = class118.field2241.method763(65280);
            byte[] var5 = new byte[var4];
            class112 var6 = new class112(var5);
            class118.field2241.method749(var5, 0, (byte) -61, var4);
            class187.field3472[arg0] = var6;
            arg1.method1031(var6, arg2 + -36);
        }
        if (~(64 & arg3) != -1) {
            int var7 = class118.field2241.method730(1848);
            int var8 = class118.field2241.method711(-1795);
            int var9 = class118.field2241.method716(-1308);
            int var10 = class118.field2241.field2133;
            if (arg1.field2877 != null && arg1.field2880 != null) {
                long var11 = arg1.field2877.method867(-27410);
                boolean var13 = false;
                if (~var8 >= -2) {
                    for (int var14 = 0; ~class138.field2596 < ~var14; ++var14) {
                        if (~class178.field3282[var14] == ~var11) {
                            var13 = true;
                            break;
                        }
                    }
                }
                if (!var13 && ~class27.field444 == -1) {
                    class78.field1359.field2133 = 0;
                    int var15 = -1;
                    class118.field2241.method723(class78.field1359.field2157, arg2 ^ 36, var9, 0);
                    class78.field1359.field2133 = 0;
                    boolean var16 = (var7 & 32768) != 0;
                    class132 var18;
                    if (var16) {
                        var7 &= 32767;
                        class227 var17 = class122.method805(false, class78.field1359);
                        var15 = var17.field4112;
                        var18 = var17.field4107.method142((byte) -87, class78.field1359);
                    } else {
                        var18 = class107.method682(class234.method1480(true, class78.field1359).method891((byte) 32));
                    }
                    arg1.field668 = var18.method870((byte) 86);
                    arg1.field729 = 150;
                    arg1.field696 = var7 & 255;
                    arg1.field680 = var7 >> 8;
                    if (var8 == 2) {
                        class42.method292(var15, var18, !var16 ? 1 : 17, 0, class187.method1197(new class132[] { class180.field3317, arg1.field2877 }, -122), (class132) null);
                    } else if (~var8 != -2) {
                        class42.method292(var15, var18, !var16 ? 2 : 17, 0, arg1.field2877, (class132) null);
                    } else {
                        class42.method292(var15, var18, var16 ? 17 : 1, 0, class187.method1197(new class132[] { class158.field2868, arg1.field2877 }, -73), (class132) null);
                    }
                }
            }
            class118.field2241.field2133 = var10 - -var9;
        }
        if ((1024 & arg3) != 0) {
            arg1.field714 = class118.field2241.method711(-1795);
            arg1.field678 = class118.field2241.method763(65280);
            arg1.field692 = class118.field2241.method732((byte) 82);
            arg1.field691 = class118.field2241.method763(65280);
            arg1.field704 = class118.field2241.method744((byte) 90) + class30.field460;
            arg1.field741 = class118.field2241.method744((byte) 112) - -class30.field460;
            arg1.field694 = class118.field2241.method716(-1308);
            arg1.field725 = 0;
            arg1.field697 = 1;
        }
        if ((8 & arg3) != 0) {
            arg1.field668 = class118.field2241.method720((byte) 37);
            if (~arg1.field668.method881(0, 70) != -127) {
                if (class210.field3854 == arg1) {
                    class169.method1108(-48, arg1.field668, 2, arg1.field2877);
                }
            } else {
                arg1.field668 = arg1.field668.method873((byte) 58, 1);
                class169.method1108(-62, arg1.field668, 2, arg1.field2877);
            }
            arg1.field729 = 150;
            arg1.field680 = 0;
            arg1.field696 = 0;
        }
        if (~(arg3 & 128) != -1) {
            arg1.field700 = class118.field2241.method730(1848);
            if (arg1.field700 == 65535) {
                arg1.field700 = -1;
            }
        }
        if (~(arg3 & 256) != -1) {
            int var19 = class118.field2241.method732((byte) 80);
            int var20 = class118.field2241.method732((byte) 99);
            arg1.method285(false, var19, class30.field460, var20);
        }
        if (~(arg3 & 16) != -1) {
            int var21 = class118.field2241.method730(1848);
            int var22 = class118.field2241.method711(-1795);
            if (var21 == 65535) {
                var21 = -1;
            }
            class35.method250(true, var22, var21, arg1);
        }
        if (~(arg3 & 2) != -1) {
            int var23 = class118.field2241.method763(65280);
            int var24 = class118.field2241.method716(-1308);
            arg1.method285(false, var23, class30.field460, var24);
            arg1.field672 = class30.field460 - -300;
            arg1.field698 = class118.field2241.method716(-1308);
        }
        if (arg2 == 36) {
            if (~(512 & arg3) != -1) {
                arg1.field731 = class118.field2241.method730(1848);
                int var25 = class118.field2241.method757((byte) 57);
                arg1.field705 = (65535 & var25) + class30.field460;
                if (~arg1.field731 == -65536) {
                    arg1.field731 = -1;
                }
                arg1.field717 = var25 >> 16;
                arg1.field716 = 0;
                arg1.field740 = 0;
                if (~arg1.field705 < ~class30.field460) {
                    arg1.field740 = -1;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    public class184() {
        super(1, false);
    }
}
