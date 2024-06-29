import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class145 extends class23 {

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "I")
    private int field2776 = 204;

    @OriginalMember(owner = "client!nd", name = "ab", descriptor = "I")
    private int field2788 = 1;

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "I")
    private int field2785 = 1;

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "Ldc;")
    public static class37 field2775 = class185.method1233((byte) 86, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!nd", name = "Z", descriptor = "Ldc;")
    public static class37 field2787 = class185.method1233((byte) 86, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "[I")
    public static int[] field2777 = new int[4096];

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!nd", name = "V", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "[[[B")
    public static byte[][][] field2774;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(III)I")
    public static final int method1003(int arg0, int arg1, int arg2) {
        int var3 = 90 % ((-29 - arg0) / 50);
        int var4 = class197.method1310(arg2 - -45365, 4, (byte) -31, arg1 + 91923) - (128 + -(-128 + class197.method1310(arg2 - -10294, 2, (byte) -46, arg1 + 37821) >> 1) - (class197.method1310(arg2, 1, (byte) -63, arg1) + -128 >> 2));
        int var5 = (int) ((double) var4 * 0.3D) + 35;
        if (var5 >= 10) {
            if (~var5 < -61) {
                var5 = 60;
            }
        } else {
            var5 = 10;
        }
        ++field2780;
        return var5;
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(B)V")
    public static final void method1004(byte arg0) {
        class30.field558 = null;
        class235.field4283 = null;
        class38.field792 = null;
        class139.field2694 = null;
        class184.field3394 = null;
        class72.field1286 = null;
        ++field2778;
        class107.field1872 = null;
        if (arg0 == -94) {
            class164.field3109 = 0;
            class106.field1845 = null;
            class120.field2153 = null;
            class228.field4193 = null;
            class13.field183.method1336(arg0 + 178);
            class37.field788.method1336(arg0 ^ -71);
            class193.field3607 = null;
            class133.field2472 = null;
            class214.field4004 = null;
            class5.field40 = null;
            class50.field1012 = null;
            class201.field3753 = null;
            class121.field2167 = null;
            class246.field4499 = null;
            class77.field1350 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIILld;)V")
    public static final void method1005(int arg0, int arg1, int arg2, class123 arg3) {
        ++field2781;
        if (arg3.field3524 == arg2 && arg2 != -1) {
            class208 var4 = class16.method113(arg2, (byte) 118);
            int var5 = var4.field3906;
            if (~var5 == -2) {
                arg3.field3540 = 0;
                arg3.field3474 = 0;
                arg3.field3537 = arg1;
                arg3.field3495 = 0;
                class52.method428(class238.field4382 == arg3, arg3.field3540, arg3.field3505, (byte) 55, arg3.field3490, var4);
            }
            if (~var5 == -3) {
                arg3.field3474 = 0;
            }
        } else if (arg2 == -1 || arg3.field3524 == -1 || class16.method113(arg2, (byte) 123).field3895 >= class16.method113(arg3.field3524, (byte) 109).field3895) {
            arg3.field3540 = 0;
            arg3.field3471 = arg3.field3491;
            arg3.field3495 = 0;
            arg3.field3537 = arg1;
            arg3.field3524 = arg2;
            arg3.field3474 = 0;
            if (arg3.field3524 != -1) {
                class52.method428(class238.field4382 == arg3, arg3.field3540, arg3.field3505, (byte) 93, arg3.field3490, class16.method113(arg3.field3524, (byte) 121));
            }
        }
        if (arg0 != 0) {
            method1007(-106);
        }
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)V")
    public static void method1006(int arg0) {
        field2774 = null;
        field2777 = null;
        field2787 = null;
        if (arg0 <= 99) {
            field2779 = 65;
        }
        field2775 = null;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
    public class145() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "(I)V")
    public static final void method1007(int arg0) {
        ++field2773;
        short var1 = 256;
        if (~class30.field592 >= -1) {
            if (class64.field1162 > 0) {
                for (int var2 = 0; ~var2 > -257; ++var2) {
                    if (~class64.field1162 >= -769) {
                        if (~class64.field1162 < -257) {
                            class15.field233[var2] = class82.field1461[var2];
                        } else {
                            class15.field233[var2] = class195.method1303(class233.field4258[var2], 256 - class64.field1162, 1021638856, class82.field1461[var2]);
                        }
                    } else {
                        class15.field233[var2] = class195.method1303(class82.field1461[var2], -class64.field1162 + 1024, 1021638856, class233.field4258[var2]);
                    }
                }
            } else {
                for (int var3 = 0; ~var3 > -257; ++var3) {
                    class15.field233[var3] = class233.field4258[var3];
                }
            }
        } else {
            for (int var4 = 0; ~var4 > -257; ++var4) {
                if (~class30.field592 >= -769) {
                    if (~class30.field592 >= -257) {
                        class15.field233[var4] = class195.method1303(class233.field4258[var4], -class30.field592 + 256, 1021638856, class94.field1656[var4]);
                    } else {
                        class15.field233[var4] = class94.field1656[var4];
                    }
                } else {
                    class15.field233[var4] = class195.method1303(class94.field1656[var4], -class30.field592 + 1024, 1021638856, class233.field4258[var4]);
                }
            }
        }
        int var5 = class140.field2718.field1837 * 9;
        if (arg0 != 27442) {
            method1007(-57);
        }
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 1; var1 + -1 > var8; ++var8) {
            int var21 = (-var8 + var1) * class72.field1281[var8] / var1 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var7 += var21;
            for (int var22 = var21; var22 < 128; ++var22) {
                int var24 = class103.field1789[var7++];
                int var25 = class140.field2718.field3375[var5++];
                if (~var24 != -1) {
                    int var27 = -var24 + 256;
                    int var28 = class15.field233[var24];
                    class109.field1889.field3375[var6++] = class58.method449(var27 * class58.method449(var25, 16711935) + var24 * class58.method449(var28, 16711935), -16711936) - -class58.method449(var27 * class58.method449(var25, 65280) + class58.method449(var28, 65280) * var24, 16711680) >> 8;
                } else {
                    class109.field1889.field3375[var6++] = var25;
                }
            }
            for (int var23 = 0; var23 < var21; ++var23) {
                class109.field1889.field3375[var6++] = class140.field2718.field3375[var5++];
            }
            var5 += class140.field2718.field1837 + -128;
        }
        int var9 = 0;
        int var10 = 0;
        class109.field1889.method698(0, 9);
        int var11 = class140.field2718.field1837 * 9 + 128;
        for (int var12 = 1; ~var12 > ~(var1 + -1); ++var12) {
            int var13 = (-var12 + var1) * class72.field1281[var12] / var1 + 22;
            if (var13 < 0) {
                var13 = 0;
            }
            for (int var14 = 0; var14 < var13; ++var14) {
                int var10001 = var10++;
                --var11;
                class106.field1844.field3375[var10001] = class140.field2718.field3375[var11];
            }
            for (int var15 = var13; var15 < 128; ++var15) {
                int var16 = class103.field1789[var9++];
                --var11;
                int var17 = class140.field2718.field3375[var11];
                if (var16 != 0) {
                    int var18 = -var16 + 256;
                    int var20 = class15.field233[var16];
                    class106.field1844.field3375[var10++] = class58.method449(16711680, var18 * class58.method449(65280, var17) + var16 * class58.method449(65280, var20)) + class58.method449(class58.method449(16711935, var17) * var18 + class58.method449(var20, 16711935) * var16, -16711936) >> 8;
                } else {
                    class106.field1844.field3375[var10++] = var17;
                }
            }
            var9 += var13;
            var11 += class140.field2718.field1837 + 128;
        }
        class106.field1844.method698(637, 9);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIB)I")
    public static final int method1008(int arg0, int arg1, int arg2, byte arg3) {
        ++field2786;
        int var4 = arg2 >> 7;
        int var5 = arg1 >> 7;
        int var6 = 87 % ((arg3 - 28) / 57);
        if (var5 >= 0 && ~var4 <= -1 && ~var5 >= -104 && ~var4 >= -104) {
            int var7 = arg0;
            if (~arg0 > -4 && ~(class193.field3602[1][var5][var4] & 2) == -3) {
                var7 = arg0 + 1;
            }
            int var8 = 127 & arg1;
            int var9 = 127 & arg2;
            int var10 = (-var8 + 128) * class39.field808[var7][var5][var4] + class39.field808[var7][var5 - -1][var4] * var8 >> 7;
            int var11 = (-var8 + 128) * class39.field808[var7][var5][var4 + 1] + class39.field808[var7][var5 - -1][var4 + 1] * var8 >> 7;
            return (-var9 + 128) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            int[] var3 = super.field405.method1461(arg1, (byte) -127);
            ++field2783;
            if (super.field405.field4114) {
                for (int var4 = 0; ~class199.field3705 < ~var4; ++var4) {
                    int var5 = class133.field2477[var4];
                    int var6 = this.field2785 * var5 >> 12;
                    int var7 = class167.field3196[arg1];
                    int var8 = this.field2788 * var7 >> 12;
                    int var9 = var5 % (4096 / this.field2785) * this.field2785;
                    int var10 = var7 % (4096 / this.field2788) * this.field2788;
                    if (var10 < this.field2776) {
                        for (var6 -= var8; var6 < 0; var6 += 4) {
                        }
                        while (~var6 < -4) {
                            var6 -= 4;
                        }
                        if (var6 != 1) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (this.field2776 > var9) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (var9 < this.field2776) {
                        int var11;
                        for (var11 = var6 - var8; var11 < 0; var11 += 4) {
                        }
                        while (var11 > 3) {
                            var11 -= 4;
                        }
                        if (~var11 < -1) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        if (arg2 != 1000) {
            method1007(119);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field2776 = arg0.method230((byte) -123);
                }
            } else {
                this.field2788 = arg0.method215(-1797813752);
            }
        } else {
            this.field2785 = arg0.method215(-1797813752);
        }
        ++field2782;
    }
}
