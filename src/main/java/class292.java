import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class292 extends class205 {

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "[I")
    private final int[] field4881 = new int[this.field3263];

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "I")
    public static int field4880 = 0;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "Lqd;")
    private static class40 field4875 = class147.method1106("cyan:", (byte) -46);

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
    public static int field4878 = 0;

    @OriginalMember(owner = "client!qi", name = "F", descriptor = "I")
    public static int field4888 = 0;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "J")
    public static long field4877 = 0L;

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "Lqd;")
    public static class40 field4883 = field4875;

    @OriginalMember(owner = "client!qi", name = "E", descriptor = "Z")
    public static boolean field4887 = false;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "Lqd;")
    public static class40 field4874 = field4875;

    @OriginalMember(owner = "client!qi", name = "M", descriptor = "I")
    public static int field4895 = 0;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "I")
    private int field4882;

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!qi", name = "G", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!qi", name = "J", descriptor = "I")
    private int field4892;

    @OriginalMember(owner = "client!qi", name = "K", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!qi", name = "L", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!qi", name = "N", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "Lde;")
    public static class58 field4886;

    @OriginalMember(owner = "client!qi", name = "H", descriptor = "Z")
    public static boolean field4890;

    @OriginalMember(owner = "client!qi", name = "O", descriptor = "[B")
    private byte[] field4897;

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "[Lmb;")
    public static class99[] field4884;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(B)V", line = 4)
    public final void method1445(byte arg0) {
        this.field4892 = Math.abs(this.field4892);
        field4876++;
        if (arg0 > -113) {
            method2008((class40) null, -4L, 97, 28, 41, (byte) -98, 76);
        }
        if (this.field4892 >= 4096) {
            this.field4892 = 4095;
        }
        this.method723(this.field4882++, (byte) (this.field4892 >> 4));
        this.field4892 = 0;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIIIF)V", line = 33)
    public class292(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field3263; var7++) {
            this.field4881[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)V", line = 52)
    public void method723(int arg0, byte arg1) {
        this.field4897[this.field4882++] = (byte) (class276.method1923(127, arg1 >> 1) + 127);
        field4896++;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)V", line = 63)
    public static final void method2006(boolean arg0) {
        if (arg0) {
            method2006(true);
        }
        field4894++;
        class122.field2126.method1347(0);
        class274.field4547.method1347(0);
        class256.field4269.method1347(0);
        class158.field2646.method1347(0);
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V", line = 77)
    public final void method1443(byte arg0) {
        field4893++;
        this.field4882 = 0;
        int var2 = 124 % ((arg0 + 34) / 55);
        this.field4892 = 0;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V", line = 88)
    public static void method2007(int arg0) {
        field4874 = null;
        field4875 = null;
        int var1 = 97 / ((19 - arg0) / 57);
        field4883 = null;
        field4886 = null;
        field4884 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V", line = 102)
    public final void method1447(int arg0, int arg1, int arg2) {
        if (arg0 <= 42) {
            this.field4882 = -105;
        }
        this.field4892 += this.field4881[arg1] * arg2 >> 12;
        field4889++;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lqd;JIIIBI)V", line = 124)
    public static final void method2008(class40 arg0, long arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field4891++;
        class26 var8 = new class26(128);
        var8.method218(10, -19914);
        var8.method209(16711680, (int) (Math.random() * 99999.0D));
        var8.method209(16711680, 521);
        var8.method241(arg1, 92);
        var8.method239((byte) -36, (int) (Math.random() * 9.9999999E7D));
        var8.method206(arg0, (byte) -113);
        var8.method239((byte) -74, (int) (Math.random() * 9.9999999E7D));
        var8.method209(16711680, class162.field2691);
        var8.method218(arg6, -19914);
        var8.method218(arg2, -19914);
        var8.method239((byte) 122, (int) (Math.random() * 9.9999999E7D));
        var8.method209(16711680, arg4);
        var8.method209(16711680, arg3);
        var8.method239((byte) 108, (int) (Math.random() * 9.9999999E7D));
        var8.method240(class91.field1653, class253.field4192, (byte) 69);
        class19.field295.field478 = 0;
        class19.field295.method218(20, -19914);
        class19.field295.method218(var8.field478, -19914);
        class19.field295.method189(0, var8.field478, var8.field472, -114);
        class272.field4520 = 1;
        class194.field3125 = 0;
        if (arg5 < 24) {
            field4880 = -20;
        }
        class193.field3116 = 0;
        class189.field3069 = -3;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lkm;", line = 161)
    public static final class314 method2009(int arg0, int arg1) {
        int var2 = 112 % ((arg1 + 41) / 43);
        class314 var3 = (class314) class194.field3133.method1345((long) arg0, 28150);
        field4879++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class189.field3072.method1651(class142.method1039((byte) 61, arg0), class275.method1911((byte) 101, arg0), -1);
        class314 var5 = new class314();
        if (var4 != null) {
            var5.method2171(new class26(var4), -20828);
        }
        class194.field3133.method1350(var5, (long) arg0, -42);
        return var5;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILrb;I)V", line = 230)
    public static final void method2010(int arg0, int arg1, class213 arg2, int arg3) {
        if (arg0 != 22618) {
            return;
        }
        field4885++;
        if (arg2.field3456 == 1) {
            class92.field1673++;
            class277.method1941(arg2.field3507, class264.field4421, (short) 58, 0, 0L, 36, arg2.field3558);
        }
        if (arg2.field3456 == 2 && !class274.field4549) {
            class40 var4 = class135.method1002(arg2, 0);
            if (var4 != null) {
                class277.method1941(arg2.field3507, class153.method1192(new class40[] { class3.field29, arg2.field3492 }, (byte) 124), (short) 8, -1, 0L, 98, var4);
                class71.field1265++;
            }
        }
        if (arg2.field3456 == 3) {
            class277.method1941(arg2.field3507, class264.field4421, (short) 46, 0, 0L, 69, class7.field104);
            class264.field4414++;
        }
        if (arg2.field3456 == 4) {
            class93.field1682++;
            class277.method1941(arg2.field3507, class264.field4421, (short) 34, 0, 0L, arg0 ^ 0x5874, arg2.field3558);
        }
        if (arg2.field3456 == 5) {
            class277.method1941(arg2.field3507, class264.field4421, (short) 23, 0, 0L, 101, arg2.field3558);
            class228.field3760++;
        }
        if (arg2.field3456 == 6 && class41.field792 == null) {
            class9.field140++;
            class277.method1941(arg2.field3507, class264.field4421, (short) 29, -1, 0L, arg0 - 22504, arg2.field3558);
        }
        if (arg2.field3525 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field3439; var6++) {
                for (int var7 = 0; var7 < arg2.field3540; var7++) {
                    int var8 = (arg2.field3455 + 32) * var6;
                    int var9 = (arg2.field3419 + 32) * var7;
                    if (var5 < 20) {
                        var8 += arg2.field3533[var5];
                        var9 += arg2.field3545[var5];
                    }
                    if (var9 <= arg3 && var8 <= arg1 && arg3 < (var9 + 32) && var8 + 32 > arg1) {
                        class134.field2281 = var5;
                        class261.field4382 = arg2;
                        if (arg2.field3532[var5] > 0) {
                            class277 var10 = class165.method1243(-64, arg2.field3532[var5] - 1);
                            if (class274.field4566 == 1 && class212.method1494(false, client.method1720(arg2))) {
                                if (class10.field168 != arg2.field3507 || class9.field147 != var5) {
                                    class296.field4948++;
                                    class277.method1941(arg2.field3507, class153.method1192(new class40[] { class3.field27, class238.field3925, var10.field4628 }, (byte) 126), (short) 11, var5, (long) var10.field4670, 88, class12.field207);
                                }
                            } else if (!class274.field4549 || !class212.method1494(false, client.method1720(arg2))) {
                                class233.field3833++;
                                class40[] var11 = var10.field4656;
                                if (class169.field2782) {
                                    var11 = class210.method1479(var11, (byte) 98);
                                }
                                if (class212.method1494(false, client.method1720(arg2))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class95.field1712++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 15;
                                            } else {
                                                var13 = 30;
                                            }
                                            class277.method1941(arg2.field3507, class153.method1192(new class40[] { class299.field5005, var10.field4628 }, (byte) 124), var13, var5, (long) var10.field4670, 127, var11[var12]);
                                        } else if (var12 == 4) {
                                            class277.method1941(arg2.field3507, class153.method1192(new class40[] { class299.field5005, var10.field4628 }, (byte) 122), (short) 30, var5, (long) var10.field4670, 59, class218.field3642);
                                            class54.field1055++;
                                        }
                                    }
                                }
                                if (class101.method763(-115, client.method1720(arg2))) {
                                    class157.field2632++;
                                    class277.method1941(arg2.field3507, class153.method1192(new class40[] { class299.field5005, var10.field4628 }, (byte) -119), (short) 38, var5, (long) var10.field4670, arg0 - 22510, class12.field207);
                                }
                                if (class212.method1494(false, client.method1720(arg2)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class46.field897++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 7;
                                            }
                                            if (var14 == 1) {
                                                var15 = 36;
                                            }
                                            if (var14 == 2) {
                                                var15 = 39;
                                            }
                                            class277.method1941(arg2.field3507, class153.method1192(new class40[] { class299.field5005, var10.field4628 }, (byte) 125), var15, var5, (long) var10.field4670, 84, var11[var14]);
                                        }
                                    }
                                }
                                class40[] var16 = arg2.field3453;
                                if (class169.field2782) {
                                    var16 = class210.method1479(var16, (byte) 98);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class14.field228++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 18;
                                            }
                                            if (var17 == 1) {
                                                var18 = 28;
                                            }
                                            if (var17 == 2) {
                                                var18 = 9;
                                            }
                                            if (var17 == 3) {
                                                var18 = 57;
                                            }
                                            if (var17 == 4) {
                                                var18 = 51;
                                            }
                                            class277.method1941(arg2.field3507, class153.method1192(new class40[] { class299.field5005, var10.field4628 }, (byte) -105), var18, var5, (long) var10.field4670, 64, var16[var17]);
                                        }
                                    }
                                }
                                class277.method1941(arg2.field3507, class153.method1192(new class40[] { class299.field5005, var10.field4628 }, (byte) 30), (short) 1001, var5, (long) var10.field4670, arg0 - 22514, class81.field1432);
                            } else if ((class306.field5130 & 0x10) == 16) {
                                class277.method1941(arg2.field3507, class153.method1192(new class40[] { class300.field5012, class238.field3925, var10.field4628 }, (byte) 121), (short) 41, var5, (long) var10.field4670, 22, class277.field4638);
                                class218.field3635++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field3520) {
            return;
        }
        if (!class274.field4549) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class40 var20 = class313.method2161(true, arg2, var19);
                if (var20 != null) {
                    class61.field1158++;
                    class277.method1941(arg2.field3507, arg2.field3535, (short) 1002, arg2.field3494, (long) (var19 + 1), 97, var20);
                }
            }
            class40 var21 = class135.method1002(arg2, 0);
            if (var21 != null) {
                class277.method1941(arg2.field3507, arg2.field3535, (short) 8, arg2.field3494, 0L, 97, var21);
                class71.field1265++;
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                class40 var23 = class313.method2161(true, arg2, var22);
                if (var23 != null) {
                    class277.method1941(arg2.field3507, arg2.field3535, (short) 40, arg2.field3494, (long) (var22 + 1), 120, var23);
                    class61.field1158++;
                }
            }
            if (class276.method1922(client.method1720(arg2), (byte) -74)) {
                class9.field140++;
                class277.method1941(arg2.field3507, class264.field4421, (short) 29, arg2.field3494, 0L, 74, class88.field1590);
            }
        } else if (class291.method2005(client.method1720(arg2), (byte) 120) && (class306.field5130 & 0x20) == 32) {
            class109.field1907++;
            class277.method1941(arg2.field3507, class153.method1192(new class40[] { class300.field5012, class57.field1087, arg2.field3535 }, (byte) 126), (short) 21, arg2.field3494, 0L, 41, class277.field4638);
        }
    }
}
