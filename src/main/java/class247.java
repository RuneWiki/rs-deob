import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class247 extends class578 {

    @OriginalMember(owner = "client!lba", name = "m", descriptor = "Lqd;")
    private class622 field3528;

    @OriginalMember(owner = "client!lba", name = "D", descriptor = "Lml;")
    private class194 field3525;

    @OriginalMember(owner = "client!lba", name = "n", descriptor = "Lta;")
    private class330 field3546;

    @OriginalMember(owner = "client!lba", name = "z", descriptor = "I")
    private int field3537;

    @OriginalMember(owner = "client!lba", name = "A", descriptor = "I")
    private int field3545;

    @OriginalMember(owner = "client!lba", name = "J", descriptor = "I")
    private int field3534;

    @OriginalMember(owner = "client!lba", name = "G", descriptor = "I")
    private int field3532;

    @OriginalMember(owner = "client!lba", name = "v", descriptor = "[[F")
    private float[][] field3540;

    @OriginalMember(owner = "client!lba", name = "H", descriptor = "[[F")
    private float[][] field3530;

    @OriginalMember(owner = "client!lba", name = "s", descriptor = "[[F")
    private float[][] field3523;

    @OriginalMember(owner = "client!lba", name = "y", descriptor = "I")
    private int field3526;

    @OriginalMember(owner = "client!lba", name = "k", descriptor = "Ljc;")
    private class711 field3522;

    @OriginalMember(owner = "client!lba", name = "w", descriptor = "Lfca;")
    private class318 field3539;

    @OriginalMember(owner = "client!lba", name = "u", descriptor = "Ldfa;")
    private class477 field3544;

    @OriginalMember(owner = "client!lba", name = "p", descriptor = "Lbda;")
    private class181 field3541;

    @OriginalMember(owner = "client!lba", name = "j", descriptor = "Laj;")
    private class94 field3542;

    @OriginalMember(owner = "client!lba", name = "o", descriptor = "Lso;")
    private class316 field3548;

    @OriginalMember(owner = "client!lba", name = "t", descriptor = "Lso;")
    private class316 field3531;

    @OriginalMember(owner = "client!lba", name = "K", descriptor = "[Ljava/lang/String;")
    private static final String[] field3549 = new String[] { method2019(method2018("oUK\u0012\u0018+")), method2019(method2018("oUK\u0012\u0019+")), method2019(method2018("oUK\u0012\u001f+")), method2019(method2018("oUK\u0012ajYCHc+")), method2019(method2018("x\u0019\u0004\u0012 ")), method2019(method2018("mBFP")), method2019(method2018("oUK\u0012\u001e+")), method2019(method2018("oUK\u0012\u001c+")), method2019(method2018("oUK\u0012\u001b+")) };

    @OriginalMember(owner = "client!lba", name = "B", descriptor = "Lsb;")
    public static class261 field3536 = new class261(53, 6);

    @OriginalMember(owner = "client!lba", name = "i", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!lba", name = "F", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!lba", name = "r", descriptor = "I")
    private int field3529;

    @OriginalMember(owner = "client!lba", name = "C", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!lba", name = "I", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!lba", name = "q", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!lba", name = "E", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!lba", name = "x", descriptor = "[I")
    public static int[] field3527;

    @OriginalMember(owner = "client!lba", name = "l", descriptor = "[[[B")
    public static byte[][][] field3547;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I[[ZIII)V", line = 12)
    public final void method2012(int arg0, boolean[][] arg1, int arg2, int arg3, int arg4) {
        try {
            field3538++;
            if (arg0 != 0) {
                this.field3525 = null;
            }
            if (this.field3541 != null && (arg3 + arg4) >= this.field3537 && this.field3545 >= arg3 - arg4 && arg2 + arg4 >= this.field3534 && arg2 - arg4 <= this.field3532) {
                for (int var6 = this.field3534; var6 <= this.field3532; var6++) {
                    for (int var7 = this.field3537; var7 <= this.field3545; var7++) {
                        int var8 = var7 - arg3;
                        int var9 = var6 - arg2;
                        if ((-arg4) < var8 && arg4 > var8 && var9 > (-arg4) && var9 < arg4 && arg1[var8 + arg4][arg4 + var9]) {
                            this.field3525.method1638(false, (int) (this.field3546.method2597(arg0 ^ 0x2) * 255.0F) << 24);
                            this.field3525.method1653(-3461, this.field3531, null, null, this.field3548);
                            this.field3525.method1647(0, this.field3526, this.field3541, -102, 4);
                            return;
                        }
                    }
                }
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field3549[8] + arg0 + ',' + (arg1 == null ? field3549[5] : field3549[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V", line = 76)
    public static final void method2013(int arg0) {
        try {
            if (class236.field3418.method172()) {
                class236.field3418.method220(class560.field8153);
                class414.method3230((byte) 94);
                if (class212.field3119) {
                    class124.method1108(class560.field8153, (byte) 63);
                } else {
                    Dimension var1 = class560.field8153.getSize();
                    class236.field3418.method148(class560.field8153, var1.width, var1.height);
                }
                class236.field3418.method156(class560.field8153);
            } else {
                class279.method2271(7, false, class451.field6612.field9134.method4717(3));
            }
            if (arg0 >= -106) {
                method2013(-51);
            }
            field3533++;
            class591.method4369(0);
            class710.field9925 = true;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3549[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIIIII)V", line = 108)
    private final void method2014(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field3535++;
            long var8 = -1L;
            int var10 = (arg6 << this.field3528.field10692) + arg1;
            int var11 = (arg5 << this.field3528.field10692) + arg0;
            int var12 = this.field3528.method5440((byte) 15, var10, var11);
            if ((arg1 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
                var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
                class578 var13 = this.field3544.method3693(false, var8);
                if (var13 != null) {
                    this.method2017(1, ((class292) var13).field4113);
                    return;
                }
            }
            short var14 = (short) (this.field3529++);
            if (var8 != -1L) {
                this.field3544.method3691(new class292(var14), var8, -1);
            }
            float var15;
            float var16;
            float var17;
            if (arg1 == 0 && arg0 == 0) {
                var16 = this.field3523[arg3][arg2];
                var15 = this.field3540[arg3][arg2];
                var17 = this.field3530[arg3][arg2];
            } else if (this.field3528.field10690 == arg1 && arg0 == 0) {
                var15 = this.field3540[arg3 + 1][arg2];
                var16 = this.field3523[arg3 + 1][arg2];
                var17 = this.field3530[arg3 + 1][arg2];
            } else if (this.field3528.field10690 == arg1 && this.field3528.field10690 == arg0) {
                var15 = this.field3540[arg3 + 1][arg2 + 1];
                var16 = this.field3523[arg3 + 1][arg2 + 1];
                var17 = this.field3530[arg3 + 1][arg2 + 1];
            } else if (arg1 == 0 && this.field3528.field10690 == arg0) {
                var16 = this.field3523[arg3][arg2 + 1];
                var15 = this.field3540[arg3][arg2 + 1];
                var17 = this.field3530[arg3][arg2 + 1];
            } else {
                float var18 = (float) arg1 / (float) this.field3528.field10690;
                float var19 = (float) arg0 / (float) this.field3528.field10690;
                float var20 = this.field3540[arg3][arg2];
                float var21 = this.field3523[arg3][arg2];
                float var22 = this.field3530[arg3][arg2];
                float var23 = this.field3540[arg3 + 1][arg2];
                float var24 = this.field3523[arg3 + 1][arg2];
                float var25 = (this.field3540[arg3][arg2 + 1] - var20) * var18 + var20;
                float var26 = (this.field3523[arg3 + 1][arg2 + 1] - var24) * var18 + var24;
                float var27 = (this.field3530[arg3][arg2 + 1] - var22) * var18 + var22;
                float var28 = this.field3530[arg3 + 1][arg2];
                float var29 = (this.field3523[arg3][arg2 + 1] - var21) * var18 + var21;
                float var30 = (this.field3540[arg3 + 1][arg2 + 1] - var23) * var18 + var23;
                var16 = (var26 - var29) * var19 + var29;
                float var31 = (this.field3530[arg3 + 1][arg2 + 1] - var28) * var18 + var28;
                var15 = (var30 - var25) * var19 + var25;
                var17 = (var31 - var27) * var19 + var27;
            }
            float var32 = (float) (this.field3546.method2595((byte) 125) - var10);
            float var33 = (float) (this.field3546.method2590((byte) 97) - var12);
            float var34 = (float) (this.field3546.method2592(true) - var11);
            float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
            float var36 = 1.0F / var35;
            float var37 = var34 * var36;
            float var38 = var33 * var36;
            float var39 = var32 * var36;
            float var40 = var35 / (float) this.field3546.method2594((byte) 21);
            float var41 = 1.0F - (var40 * var40);
            if (var41 < 0.0F) {
                var41 = 0.0F;
            }
            if (arg4 == 9222) {
                float var42 = var17 * var37 + var15 * var39 + var16 * var38;
                if (var42 < 0.0F) {
                    var42 = 0.0F;
                }
                float var43 = var41 * var42 * 2.0F;
                if (var43 > 1.0F) {
                    var43 = 1.0F;
                }
                int var44 = this.field3546.method2591(arg4 + 1840);
                int var45 = (int) ((float) ((var44 & 0xFFB680) >> 16) * var43);
                if (var45 > 255) {
                    var45 = 255;
                }
                int var46 = (int) ((float) ((var44 & 0xFF84) >> 8) * var43);
                if (var46 > 255) {
                    var46 = 255;
                }
                int var47 = (int) ((float) (var44 & 0xFF) * var43);
                if (this.field3525.field2842) {
                    this.field3539.method2524((float) var10, true);
                    this.field3539.method2524((float) var12, true);
                    this.field3539.method2524((float) var11, true);
                } else {
                    this.field3539.method2527(160744152, (float) var10);
                    this.field3539.method2527(160744152, (float) var12);
                    this.field3539.method2527(160744152, (float) var11);
                }
                if (var47 > 255) {
                    var47 = 255;
                }
                this.field3539.method5114(arg4 - 8967, var45);
                this.field3539.method5114(255, var46);
                this.field3539.method5114(255, var47);
                this.field3539.method5114(arg4 ^ 0x24F9, 255);
                this.method2017(arg4 ^ 0x2407, var14);
            }
        } catch (RuntimeException var49) {
            throw class665.method4799(var49, field3549[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(II)V", line = 285)
    public static final void method2015(int arg0, int arg1) {
        try {
            field3524++;
            int var2 = -71 / ((arg1 - 4) / 59);
            if (arg0 != -1 && class443.field6542[arg0]) {
                class169.field2159.method501(arg0, (byte) -51);
                class9.field117[arg0] = null;
                class646.field9185[arg0] = null;
                class443.field6542[arg0] = false;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3549[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(B)V", line = 305)
    public static void method2016(byte arg0) {
        try {
            field3547 = null;
            field3527 = null;
            field3536 = null;
            if (arg0 <= 28) {
                field3527 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3549[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IS)V", line = 317)
    private final void method2017(int arg0, short arg1) {
        try {
            field3521++;
            if (arg0 != 1) {
                this.field3546 = null;
            }
            if (this.field3525.field2842) {
                this.field3522.method5138((byte) -124, arg1);
            } else {
                this.field3522.method5106(arg1, arg0 - 70);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3549[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(Lml;Lqd;Lta;[I)V", line = 338)
    public class247(class194 arg0, class622 arg1, class330 arg2, int[] arg3) {
        try {
            this.field3528 = arg1;
            this.field3525 = arg0;
            this.field3546 = arg2;
            int var5 = this.field3546.method2594((byte) 21) - (arg1.field10690 >> 1);
            this.field3537 = this.field3546.method2595((byte) -62) - var5 >> arg1.field10692;
            this.field3545 = this.field3546.method2595((byte) -123) + var5 >> arg1.field10692;
            this.field3534 = this.field3546.method2592(true) - var5 >> arg1.field10692;
            this.field3532 = var5 + this.field3546.method2592(true) >> arg1.field10692;
            int var6 = this.field3545 + 1 - this.field3537;
            int var7 = this.field3532 + 1 - this.field3534;
            this.field3540 = new float[var6 + 1][var7 + 1];
            this.field3530 = new float[var6 + 1][var7 + 1];
            this.field3523 = new float[var6 + 1][var7 + 1];
            for (int var8 = 0; var8 <= var7; var8++) {
                int var9 = this.field3534 + var8;
                if (var9 > 0 && var9 < (this.field3528.field10703 - 1)) {
                    for (int var10 = 0; var10 <= var6; var10++) {
                        int var11 = this.field3537 + var10;
                        if (var11 > 0 && var11 < (this.field3528.field10701 - 1)) {
                            int var12 = arg1.method5442(var11 + 1, var9, 31844) - arg1.method5442(var11 - 1, var9, 31844);
                            int var13 = arg1.method5442(var11, var9 + 1, 31844) - arg1.method5442(var11, var9 - 1, 31844);
                            float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536)));
                            this.field3540[var10][var8] = (float) var12 * var14;
                            this.field3523[var10][var8] = var14 * -256.0F;
                            this.field3530[var10][var8] = (float) var13 * var14;
                        }
                    }
                }
            }
            int var15 = 0;
            for (int var16 = this.field3534; var16 <= this.field3532; var16++) {
                if (var16 >= 0 && var16 < arg1.field10703) {
                    for (int var17 = this.field3537; var17 <= this.field3545; var17++) {
                        if (var17 >= 0 && arg1.field10701 > var17) {
                            int var18 = arg3[var15];
                            int[] var19 = arg1.field8856[var17][var16];
                            if (var19 != null && var18 != 0) {
                                if (var18 == 1) {
                                    int var20 = 0;
                                    while (var20 < var19.length) {
                                        if (var19[var20++] != -1 && var19[var20++] != -1 && var19[var20++] != -1) {
                                            this.field3526 += 3;
                                        }
                                    }
                                } else {
                                    this.field3526 += 3;
                                }
                            }
                        }
                        var15++;
                    }
                } else {
                    var15 += this.field3545 - this.field3537;
                }
            }
            if (this.field3526 > 0) {
                this.field3522 = new class711(this.field3526 * 2);
                this.field3539 = new class318(this.field3526 * 16);
                this.field3544 = new class477(class788.method5671(1282334120, this.field3526));
                int var21 = 0;
                int var22 = 0;
                for (int var23 = this.field3534; var23 <= this.field3532; var23++) {
                    if (var23 >= 0 && arg1.field10703 > var23) {
                        int var24 = 0;
                        for (int var25 = this.field3537; var25 <= this.field3545; var25++) {
                            if (var25 >= 0 && var25 < arg1.field10701) {
                                int var26 = arg3[var22];
                                int[] var27 = arg1.field8856[var25][var23];
                                if (var27 != null && var26 != 0) {
                                    if (var26 == 1) {
                                        int[] var28 = arg1.field8864[var25][var23];
                                        int[] var29 = arg1.field8869[var25][var23];
                                        int var30 = 0;
                                        label164: while (true) {
                                            while (true) {
                                                if (var30 >= var27.length) {
                                                    break label164;
                                                }
                                                if (var27[var30] == -1 || var27[var30 + 1] == -1 || var27[var30 + 2] == -1) {
                                                    var30 += 3;
                                                } else {
                                                    this.method2014(var29[var30], var28[var30], var21, var24, 9222, var23, var25);
                                                    var30++;
                                                    this.method2014(var29[var30], var28[var30], var21, var24, 9222, var23, var25);
                                                    var30++;
                                                    this.method2014(var29[var30], var28[var30], var21, var24, 9222, var23, var25);
                                                    var30++;
                                                }
                                            }
                                        }
                                    } else if (var26 == 3) {
                                        this.method2014(0, 0, var21, var24, 9222, var23, var25);
                                        this.method2014(0, arg1.field10690, var21, var24, 9222, var23, var25);
                                        this.method2014(arg1.field10690, 0, var21, var24, 9222, var23, var25);
                                    } else if (var26 == 2) {
                                        this.method2014(0, arg1.field10690, var21, var24, 9222, var23, var25);
                                        this.method2014(arg1.field10690, arg1.field10690, var21, var24, 9222, var23, var25);
                                        this.method2014(0, 0, var21, var24, 9222, var23, var25);
                                    } else if (var26 == 5) {
                                        this.method2014(arg1.field10690, arg1.field10690, var21, var24, 9222, var23, var25);
                                        this.method2014(arg1.field10690, 0, var21, var24, 9222, var23, var25);
                                        this.method2014(0, arg1.field10690, var21, var24, 9222, var23, var25);
                                    } else if (var26 == 4) {
                                        this.method2014(arg1.field10690, 0, var21, var24, 9222, var23, var25);
                                        this.method2014(0, 0, var21, var24, 9222, var23, var25);
                                        this.method2014(arg1.field10690, arg1.field10690, var21, var24, 9222, var23, var25);
                                    }
                                }
                            }
                            var24++;
                            var22++;
                        }
                    } else {
                        var22 += this.field3545 - this.field3537;
                    }
                    var21++;
                }
                this.field3541 = this.field3525.method1612(this.field3522.field9945, false, 5123, true, this.field3522.field9996);
                this.field3542 = this.field3525.method1649(16, this.field3539.field9945, (byte) 67, false, this.field3539.field9996);
                this.field3548 = new class316(this.field3542, 5126, 3, 0);
                this.field3531 = new class316(this.field3542, 5121, 4, 12);
            } else {
                this.field3542 = null;
                this.field3531 = null;
                this.field3541 = null;
                this.field3548 = null;
            }
            this.field3540 = this.field3523 = this.field3530 = null;
            this.field3539 = null;
            this.field3522 = null;
            this.field3544 = null;
        } catch (RuntimeException var32) {
            throw class665.method4799(var32, field3549[3] + (arg0 == null ? field3549[5] : field3549[4]) + ',' + (arg1 == null ? field3549[5] : field3549[4]) + ',' + (arg2 == null ? field3549[5] : field3549[4]) + ',' + (arg3 == null ? field3549[5] : field3549[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!lba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2018(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2019(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 3;
                    break;
                case 1:
                    var10005 = 55;
                    break;
                case 2:
                    var10005 = 42;
                    break;
                case 3:
                    var10005 = 60;
                    break;
                default:
                    var10005 = 93;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
