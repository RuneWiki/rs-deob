import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class179 extends class266 {

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "Z")
    private boolean field2639 = false;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "Z")
    private boolean field2649;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "[Ljs;")
    private class300[] field2651;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    public static int field2646 = 52;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
    public static int field2650 = 0;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "Luc;")
    public static class27 field2644 = new class27(58, 1);

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "Lwn;")
    public static class663 field2655 = new class663();

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "Loj;")
    public static class346 field2656 = new class346(64);

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
    public static int field2657 = -1;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "F")
    public static float field2640;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(B)V", line = 3)
    public static void method1210(byte arg0) {
        int var1 = -24 / ((-49 - arg0) / 36);
        field2656 = null;
        field2655 = null;
        field2644 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)V", line = 14)
    public final void method156(int arg0, int arg1, int arg2) {
        if (this.field2639) {
            super.field3785.method3220(1, -23809);
            super.field3785.method3232(false, this.field2651[arg1 + -1]);
            super.field3785.method3220(0, arg2 + -23809);
        }
        ++field2638;
        if (arg2 != 0) {
            method1211(78, 15, 125);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V", line = 34)
    public final void method155(boolean arg0) {
        ++field2654;
        if (!this.field2639) {
            super.field3785.method3235(class558.field7530, -12912, 0);
        } else {
            super.field3785.method3220(1, -23809);
            super.field3785.method3232(false, (class467) null);
            super.field3785.method286(class570.field7657, 9762);
            super.field3785.method3198((byte) -87);
            if (!this.field2649) {
                super.field3785.method3193(class137.field1929, class137.field1929, 0);
                super.field3785.method3177(0, 93, class558.field7530);
                super.field3785.method3220(2, -23809);
                super.field3785.method3193(class137.field1929, class137.field1929, 0);
                super.field3785.method3177(0, 111, class558.field7530);
                super.field3785.method3177(1, 96, class85.field1174);
                super.field3785.method3235(class558.field7530, -12912, 0);
                super.field3785.method3232(arg0, (class467) null);
            } else {
                super.field3785.method3193(class137.field1929, class137.field1929, 0);
                super.field3785.method3177(0, 122, class558.field7530);
                super.field3785.method3235(class558.field7530, -12912, 0);
            }
            super.field3785.method3220(0, -23809);
            this.field2639 = false;
        }
        if (arg0) {
            field2655 = null;
        }
        super.field3785.method3193(class137.field1929, class137.field1929, 0);
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(III)I", line = 75)
    public static final int method1211(int arg0, int arg1, int arg2) {
        ++field2648;
        if (class101.field1377 == -1) {
            return 1;
        } else {
            if (~class429.field6020 != ~arg1) {
                class339.method2033(arg1, -28863);
                if (~class429.field6020 != ~arg1) {
                    return -1;
                }
            }
            try {
                Dimension var3 = class105.field1413.getSize();
                class364.method2133(class9.field100.method42(class666.field9377, 19572), 0, class668.field9418, true);
                class661 var4 = class383.method2210(false, 0, class317.field4707, class101.field1377);
                long var5 = class680.method3756(-90);
                class630.field8790.method449();
                class37.field500.method1288(0, class634.field8905, 0);
                class630.field8790.method446(class37.field500);
                class630.field8790.method404(var3.width / 2, var3.height / 2, 512, 512);
                class630.field8790.method465(1.0F);
                class630.field8790.method450(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
                class352 var7 = class630.field8790.method379(var4, 2048, 64, 64, 768);
                int var8 = 0;
                label45: for (int var9 = 0; var9 < 500; ++var9) {
                    class630.field8790.method310(0);
                    class630.field8790.method344();
                    for (int var10 = 15; ~var10 <= -1; --var10) {
                        for (int var11 = 0; var11 <= var10; ++var11) {
                            class75.field1040.method1288((int) (((float) var11 + -((float) var10 / 2.0F)) * (float) class658.field9268), 0, (var10 + 1) * class658.field9268);
                            ++var8;
                            var7.method205(class75.field1040, (class494) null, 0);
                            if (~(class680.method3756(-30) - var5) <= ~((long) arg0)) {
                                break label45;
                            }
                        }
                    }
                }
                class630.field8790.method325();
                if (arg2 <= 40) {
                    method1212((class638) null, 83);
                }
                long var12 = (long) (var8 * 1000) / (class680.method3756(-99) + -var5);
                class630.field8790.method310(0);
                class630.field8790.method344();
                return (int) var12;
            } catch (Throwable var15) {
                var15.printStackTrace();
                return -1;
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Loa;I)V", line = 157)
    public static final void method1212(class638 arg0, int arg1) {
        ++field2643;
        arg0.method442(0, 0, class547.field7412, 350);
        arg0.method472(0, 0, class547.field7412, 350, 3351159 | class477.field6669 << 24, 1);
        if (arg1 != 30) {
            field2646 = -123;
        }
        int var2 = 350 / class186.field2742;
        if (class603.field8372 > 0) {
            int var3 = -class186.field2742 + 346 + -4;
            int var4 = var2 * var3 / (class603.field8372 + var2 - 1);
            int var5 = 4;
            if (class603.field8372 > 1) {
                var5 += (-class182.field2680 + -1 + class603.field8372) * (-var4 + var3) / (class603.field8372 + -1);
            }
            arg0.method472(class547.field7412 + -16, var5, 12, var4, 3351159 | class477.field6669 << 24, 2);
            for (int var6 = class182.field2680; var6 < class182.field2680 + var2 && var6 < class603.field8372; ++var6) {
                String[] var7 = class533.method2945(arg1 + -19058, class371.field5278[var6], '\b');
                int var8 = (class547.field7412 + -24) / var7.length;
                for (int var9 = 0; ~var9 > ~var7.length; ++var9) {
                    int var10 = 8 - -(var8 * var9);
                    arg0.method442(var10, 0, var10 - -var8 + -8, 350);
                    class668.field9418.method1307(-class235.field3391 + 350 + -2 + -class226.field3256.field8301 - (-class182.field2680 + var6) * class186.field2742, (byte) 127, -16777216, -1, var7[var9], var10);
                }
            }
        }
        arg0.method442(0, 0, class547.field7412, 350);
        arg0.method3555(-class235.field3391 + 350, class547.field7412, true, 0, -1);
        class548.field7419.method1307(-class432.field6119.field8301 + 350 + -1, (byte) 124, -16777216, -1, "--> " + class591.field8240, 10);
        if (class368.field5268) {
            int var11 = -1;
            if (class239.field3440 % 30 > 15) {
                var11 = 16777215;
            }
            arg0.method3560(350 - class432.field6119.field8301 - 11, var11, arg1 ^ 59, 12, 10 - -class432.field6119.method3314("--> " + class591.field8240.substring(0, class538.field7304), -112));
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lgj;)V", line = 301)
    public class179(class580 arg0) {
        super(arg0);
        if (arg0.field8004) {
            this.field2649 = ~arg0.field8048 > -4;
            int var2 = this.field2649 ? 48 : 127;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 != -1) {
                            if (~var14 == -2) {
                                var15 = var13;
                            } else if (var14 != 2) {
                                if (var14 != 3) {
                                    if (var14 != 4) {
                                        var15 = -var11;
                                    } else {
                                        var15 = var11;
                                    }
                                } else {
                                    var15 = -var12;
                                }
                            } else {
                                var15 = var12;
                            }
                        } else {
                            var15 = -var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var16 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        }
                        var4[var14][var6] = var18 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var16 << 24;
                    }
                    ++var6;
                }
            }
            this.field2651 = new class300[3];
            this.field2651[0] = super.field3785.method324(0, var4, false, 64);
            this.field2651[1] = super.field3785.method324(0, var5, false, 64);
            this.field2651[2] = super.field3785.method324(0, var3, false, 64);
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(IZ)V", line = 230)
    public final void method144(int arg0, boolean arg1) {
        if (arg0 == 1) {
            super.field3785.method3193(class137.field1929, class24.field325, 0);
            ++field2647;
        }
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(B)V", line = 242)
    public static final void method1213(byte arg0) {
        for (class503 var1 = (class503) class638.field9064.method3678(-194); var1 != null; var1 = (class503) class638.field9064.method3678(-194)) {
            class154.method1071(99, var1);
        }
        if (arg0 <= -116) {
            ++field2641;
            int var2;
            int var3;
            if (class274.field3872.method2433(0, class429.field6020)) {
                var2 = 3;
                var3 = 0;
            } else {
                var2 = class122.field1683;
                var3 = class122.field1683;
            }
            client.method1654();
            for (int var4 = var3; ~var2 <= ~var4; ++var4) {
                client.method1639();
                client.method1641(var4);
                client.method1648(var4);
            }
            client.method1645();
            client.method1661();
        }
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(III)Z", line = 289)
    public static final boolean method1214(int arg0, int arg1, int arg2) {
        if (arg2 != 3351159) {
            return false;
        } else {
            ++field2653;
            return ~(2048 & arg1) != -1 && (arg0 & 55) != 0;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)V", line = 420)
    public final void method148(int arg0, boolean arg1) {
        if (this.field2651 != null && arg1) {
            super.field3785.method3220(1, -23809);
            super.field3785.method286(class198.field2926, 9762);
            class367 var3 = super.field3785.method3204(125);
            var3.method1293(1024);
            super.field3785.method3201(arg0 ^ -17, class625.field8725);
            if (this.field2649) {
                super.field3785.method3193(client.field3838, class24.field325, arg0);
                super.field3785.method316(false, class558.field7530, true, 0, false);
                super.field3785.method3235(class391.field5472, -12912, 0);
            } else {
                super.field3785.method3193(class24.field325, class137.field1929, 0);
                super.field3785.method3177(0, 85, class85.field1174);
                super.field3785.method3220(2, -23809);
                super.field3785.method3193(client.field3838, class24.field325, 0);
                super.field3785.method3177(0, 79, class85.field1174);
                super.field3785.method316(false, class85.field1174, true, 1, false);
                super.field3785.method3235(class391.field5472, -12912, 0);
                super.field3785.method3232(false, super.field3785.field7985);
            }
            super.field3785.method3220(0, arg0 ^ -23809);
            this.field2639 = true;
        } else {
            super.field3785.method3235(class391.field5472, -12912, 0);
        }
        ++field2645;
        if (arg0 != 0) {
            field2656 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)Z", line = 465)
    public final boolean method154(int arg0) {
        if (arg0 < 101) {
            return true;
        } else {
            ++field2652;
            return true;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lek;IB)V", line = 476)
    public final void method150(class467 arg0, int arg1, byte arg2) {
        ++field2642;
        super.field3785.method3232(false, arg0);
        super.field3785.method3229(arg1, 12);
        if (arg2 >= -56) {
            field2657 = 91;
        }
    }
}
