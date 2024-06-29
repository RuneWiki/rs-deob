import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class325 {

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "[B")
    private byte[] field4821;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "[I")
    private int[] field4815;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "[I")
    private int[] field4810;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field4816 = 0;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field4817 = 2;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4820 = "Loading...";

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "Z")
    public static boolean field4808 = false;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([B[BIIII)I", line = 3)
    public final int method2127(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field4818++;
        if (~arg4 == arg2) {
            return 0;
        }
        int var7 = arg4 + arg5;
        int var8 = 0;
        int var9 = arg3;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field4810[var8];
            }
            int var11;
            if ((var11 = this.field4810[var8]) < 0) {
                arg1[arg5++] = (byte) (~var11);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field4810[var8];
            }
            int var12;
            if ((var12 = this.field4810[var8]) < 0) {
                arg1[arg5++] = (byte) (~var12);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field4810[var8];
            }
            int var13;
            if ((var13 = this.field4810[var8]) < 0) {
                arg1[arg5++] = (byte) (~var13);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field4810[var8];
            }
            int var14;
            if ((var14 = this.field4810[var8]) < 0) {
                arg1[arg5++] = (byte) (~var14);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field4810[var8];
            }
            int var15;
            if ((var15 = this.field4810[var8]) < 0) {
                arg1[arg5++] = (byte) (~var15);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field4810[var8];
            }
            int var16;
            if ((var16 = this.field4810[var8]) < 0) {
                arg1[arg5++] = (byte) (~var16);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field4810[var8];
            }
            int var17;
            if ((var17 = this.field4810[var8]) < 0) {
                arg1[arg5++] = (byte) (~var17);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field4810[var8];
            }
            int var18;
            if ((var18 = this.field4810[var8]) < 0) {
                arg1[arg5++] = (byte) (~var18);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 - (arg3 - 1);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V", line = 150)
    public static final void method2128(boolean arg0) {
        if (arg0) {
            class106.field1405 = class197.field2727;
            class266.field3950 = class370.field5469;
        } else {
            class106.field1405 = class189.field2597;
            class266.field3950 = class142.field1804;
        }
        class134.field1752 = class106.field1405.length;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIII)V", line = 173)
    public static final void method2129(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4819++;
        class387 var5 = (class387) class67.field982.method2826(false, (long) arg1);
        if (var5 == null) {
            var5 = new class387();
            class67.field982.method2815(-1, (long) arg1, var5);
        }
        if (arg4 >= var5.field5658.length) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field5658.length; var8++) {
                var6[var8] = var5.field5658[var8];
                var7[var8] = var5.field5657[var8];
            }
            for (int var9 = var5.field5658.length; var9 < arg4; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field5657 = var7;
            var5.field5658 = var6;
        }
        var5.field5658[arg4] = arg2;
        int var10 = -49 % ((-arg3 - 69) / 36);
        var5.field5657[arg4] = arg0;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)V", line = 227)
    public static final void method2130(int arg0, int arg1, int arg2) {
        field4814++;
        class440 var3 = class186.method1241(arg1, 13, (byte) 56);
        var3.method2756(arg2 - 1369670726);
        if (arg2 == 14198) {
            var3.field6375 = arg0;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I[BIIB[B)I", line = 243)
    public final int method2131(int arg0, byte[] arg1, int arg2, int arg3, byte arg4, byte[] arg5) {
        field4809++;
        int var7 = 0;
        int var8 = arg0 << 3;
        int var9 = arg2 + arg3;
        while (arg3 < var9) {
            int var10 = arg1[arg3] & 0xFF;
            int var11 = this.field4815[var10];
            byte var12 = this.field4821[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = var13 + (var12 + var14 - 1 >> 3);
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var7 = class258.method1708(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg5[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg5[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg5[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg5[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var8 += var12;
            arg3++;
        }
        if (arg4 > -91) {
            field4811 = 11;
        }
        return (var8 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ltj;IIIII)V", line = 323)
    public static final void method2132(class298 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.method462(arg4, arg2, arg4 + arg5, arg2 + arg3);
        field4812++;
        arg0.method2023(arg3, arg4, arg2, -11682, arg5, -16777216);
        if (class31.field512 < 100) {
            return;
        }
        float var6 = (float) class200.field2770 / (float) class200.field2779;
        int var7 = arg5;
        int var8 = arg3;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg5 * var6);
        } else {
            var7 = (int) ((float) arg3 / var6);
        }
        int var9 = (arg5 - var7) / 2 + arg4;
        int var10 = (arg3 - var8) / 2 + arg2;
        if (class386.field5638 == null || class386.field5638.method208() != arg5 || class386.field5638.method202() != arg3) {
            class200.method1340(class200.field2782, class200.field2789 + class200.field2770, class200.field2782 - -class200.field2779, class200.field2789, var9, var10, var7 + var9, var10 - -var8);
            class200.method1328(arg0);
            class386.field5638 = arg0.method523(var9, var10, var7, var8, false);
        }
        class386.field5638.method2070(var9, var10);
        int var11 = class30.field487 * var7 / class200.field2779;
        int var12 = class27.field466 * var8 / class200.field2770;
        if (arg1 != 23936) {
            method2129(59, 118, -51, 77, -67);
        }
        int var13 = class265.field3926 * var7 / class200.field2779 + var9;
        int var14 = var10 - (class356.field5270 * var8 / class200.field2770) - (-var8 + var12);
        int var15 = -1996554240;
        if (class396.field5783 == 1) {
            var15 = -1996488705;
        }
        arg0.method435(var13, var14, var11, var12, var15, 1);
        arg0.method511(var13, var14, var11, var12, var15, 0);
        if (class280.field4118 <= 0) {
            return;
        }
        int var16;
        if (class184.field2463 <= 50) {
            var16 = class184.field2463 * 5;
        } else {
            var16 = 500 - (class184.field2463 * 5);
        }
        for (class27 var17 = (class27) class200.field2763.method1575(0); var17 != null; var17 = (class27) class200.field2763.method1573((byte) -128)) {
            class170 var18 = class174.method1160(arg1 ^ 0xFFFFD37E, var17.field462);
            if (class283.method1940(var18, 5)) {
                if (class169.field2281 == var17.field462) {
                    int var19 = var17.field464 * var7 / class200.field2779 + var9;
                    int var20 = (class200.field2770 - var17.field467) * var8 / class200.field2770 + var10;
                    arg0.method2023(4, var19 - 2, var20 - 2, arg1 ^ 0xFFFF8FDE, 4, var16 << 24 | 0xFFFF00);
                } else if (class396.field5784 != -1 && class396.field5784 == var18.field2299) {
                    int var21 = var17.field464 * var7 / class200.field2779 + var9;
                    int var22 = var10 + ((class200.field2770 - var17.field467) * var8 / class200.field2770);
                    arg0.method2023(4, var21 - 2, var22 + -2, -11682, 4, var16 << 24 | 0xFFFF00);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([Lsj;ZI)V", line = 418)
    public static final void method2133(class248[] arg0, boolean arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class248 var4 = arg0[var3];
            if (var4 != null && var4.field3584 == arg2 && (!var4.field3537 || !client.method401(var4))) {
                if (var4.field3555 == 0) {
                    if (!var4.field3537 && client.method401(var4) && class273.field4009 != var4) {
                        continue;
                    }
                    method2133(arg0, true, var4.field3636);
                    if (var4.field3528 != null) {
                        method2133(var4.field3528, true, var4.field3636);
                    }
                    class28 var5 = (class28) class242.field3402.method2826(!arg1, (long) var4.field3636);
                    if (var5 != null) {
                        class7.method42(var5.field482, (byte) -110);
                    }
                }
                if (var4.field3555 == 6) {
                    if (var4.field3600 != -1 || var4.field3666 != -1) {
                        boolean var6 = class274.method1814(var4, -124);
                        int var7;
                        if (var6) {
                            var7 = var4.field3666;
                        } else {
                            var7 = var4.field3600;
                        }
                        if (var7 != -1) {
                            class233 var8 = class73.method597(var7, -1);
                            if (var8 != null) {
                                var4.field3662 += class216.field3021;
                                while (var8.field3248[var4.field3622] < var4.field3662) {
                                    var4.field3662 -= var8.field3248[var4.field3622];
                                    var4.field3622++;
                                    if (var4.field3622 >= var8.field3242.length) {
                                        var4.field3622 -= var8.field3244;
                                        if (var4.field3622 < 0 || var4.field3622 >= var8.field3242.length) {
                                            var4.field3622 = 0;
                                        }
                                    }
                                    var4.field3606 = var4.field3622 + 1;
                                    if (var8.field3242.length <= var4.field3606) {
                                        var4.field3606 -= var8.field3244;
                                        if (var4.field3606 < 0 || var8.field3242.length <= var4.field3606) {
                                            var4.field3606 = -1;
                                        }
                                    }
                                    class92.method744(20491, var4);
                                }
                            }
                        }
                    }
                    if (var4.field3618 != 0 && !var4.field3537) {
                        int var9 = var4.field3618 >> 16;
                        int var10 = class216.field3021 * var9;
                        int var11 = var4.field3618 << 16 >> 16;
                        var4.field3607 = var4.field3607 + var10 & 0x3FFF;
                        int var12 = class216.field3021 * var11;
                        var4.field3548 = var4.field3548 + var12 & 0x3FFF;
                        class92.method744(20491, var4);
                    }
                }
            }
        }
        if (!arg1) {
            method2130(-125, 63, -26);
        }
        field4813++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V", line = 537)
    public static void method2134(byte arg0) {
        field4820 = null;
        if (arg0 != 118) {
            field4808 = true;
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "([B)V", line = 546)
    public class325(byte[] arg0) {
        int var2 = arg0.length;
        this.field4821 = arg0;
        this.field4815 = new int[var2];
        this.field4810 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field4815[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class258.method1708(var11, var12);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field4810[var14] == 0) {
                            this.field4810[var14] = var4;
                        }
                        var14 = this.field4810[var14];
                    }
                    if (this.field4810.length <= var14) {
                        int[] var17 = new int[this.field4810.length * 2];
                        for (int var18 = 0; var18 < this.field4810.length; var18++) {
                            var17[var18] = this.field4810[var18];
                        }
                        this.field4810 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field4810[var14] = ~var5;
            }
        }
    }
}
