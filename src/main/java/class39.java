import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class39 {

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "Lia;")
    private static class257 field772 = class28.method234(116, "Mon");

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "Lia;")
    private static class257 field770 = class28.method234(100, "Sat");

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Lia;")
    private static class257 field768 = class28.method234(75, "Wed");

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "Lia;")
    private static class257 field775 = class28.method234(-33, "Tue");

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "Lia;")
    private static class257 field785 = class28.method234(-105, "Thu");

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "Lia;")
    private static class257 field792 = class28.method234(-79, "Sun");

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "Lia;")
    private static class257 field790 = class28.method234(-95, "Fri");

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "[Lia;")
    public static class257[] field774 = new class257[] { field792, field772, field775, field768, field785, field790, field770 };

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "Lie;")
    public static class117 field783 = new class117(50);

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "[Z")
    public static boolean[] field793 = new boolean[112];

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "Lia;")
    public static class257 field794 = null;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public int field767;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public int field773;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public int field786;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    public int field788;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "J")
    public long field771;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Lij;")
    public class166 field765;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "Lij;")
    public class166 field776;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "Lij;")
    public class166 field782;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)I")
    public static final int method314(int arg0) {
        field780++;
        return arg0 == 16 ? 16 : -32;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZLia;)Lob;")
    public static final class209 method315(boolean arg0, class257 arg1) {
        field777++;
        if (arg1.method1679((byte) 58) == 0) {
            return null;
        }
        for (class209 var2 = (class209) class144.field2522.method288(26111); var2 != null; var2 = (class209) class144.field2522.method277(1)) {
            if (var2.field3585.method1712(-30, arg1)) {
                return var2;
            }
        }
        if (!arg0) {
            field785 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg1 + arg5;
        int var8 = arg4 - arg1;
        int var9 = arg2 - arg1;
        for (int var10 = arg5; var10 < var7; var10++) {
            class94.method692(class185.field3220[var10], (byte) -127, arg0, arg3, arg4);
        }
        for (int var11 = arg2; var11 > var9; var11--) {
            class94.method692(class185.field3220[var11], (byte) 80, arg0, arg3, arg4);
        }
        int var12 = arg0 + arg1;
        if (!arg6) {
            method323(106);
        }
        for (int var13 = var7; var13 <= var9; var13++) {
            int[] var14 = class185.field3220[var13];
            class94.method692(var14, (byte) 16, arg0, arg3, var12);
            class94.method692(var14, (byte) -124, var8, arg3, arg4);
        }
        field781++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IJ)V")
    public static final void method317(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
        int var3 = 96 % ((arg0 - 92) / 32);
        field766++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILad;I)V")
    public static final void method318(int arg0, class241 arg1, int arg2) {
        field791++;
        if (arg1.field4155 > class7.field153) {
            class260.method1732(arg1, 128);
        } else if (arg1.field4122 < class7.field153) {
            class57.method438(-1, arg1);
        } else {
            class209.method1403(arg1, arg0 ^ 0x81);
        }
        if (arg1.field4177 < 128 || arg1.field4143 < 128 || arg1.field4177 >= 13184 || arg1.field4143 >= 13184) {
            arg1.field4129 = -1;
            arg1.field4172 = -1;
            arg1.field4177 = arg1.field4182[0] * 128 + arg1.field4128 * 64;
            arg1.field4122 = 0;
            arg1.field4155 = 0;
            arg1.field4143 = arg1.field4119[0] * 128 + arg1.field4128 * 64;
            arg1.method1580(arg0 ^ 0xDA);
        }
        if (class137.field2441 == arg1 && (arg1.field4177 < 1536 || arg1.field4143 < 1536 || arg1.field4177 >= 11776 || arg1.field4143 >= 11776)) {
            arg1.field4177 = arg1.field4182[0] * 128 + arg1.field4128 * 64;
            arg1.field4143 = arg1.field4119[0] * 128 + arg1.field4128 * 64;
            arg1.field4122 = 0;
            arg1.field4172 = -1;
            arg1.field4129 = -1;
            arg1.field4155 = 0;
            arg1.method1580(arg0 ^ 0xFFFFFF21);
        }
        class209.method1405((byte) 73, arg1);
        if (arg0 != 128) {
            method320(-35, -84, -86, -121, -83, (class44) null, -85);
        }
        class157.method1098(13, arg1);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static final void method319(byte arg0) {
        if (class79.field1543 != null) {
            class79.field1543.method634(-107);
        }
        field769++;
        if (class182.field3175 != null) {
            class182.field3175.method634(-102);
        }
        if (arg0 <= 55) {
            field794 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIILme;I)V")
    public static final void method320(int arg0, int arg1, int arg2, int arg3, int arg4, class44 arg5, int arg6) {
        field778++;
        int var7 = arg4 * arg4 + arg6 * arg6;
        if (var7 > 360000) {
            return;
        }
        if (arg1 != 20) {
            field785 = null;
        }
        int var8 = Math.min(arg5.field926 / 2, arg5.field981 / 2);
        if (var7 <= var8 * var8) {
            class167.method1136(-108, arg0, arg6, arg2, arg5, arg4, class201.field3446[arg3]);
            return;
        }
        var8 -= 10;
        int var9 = class25.field479 + class215.field3648 & 0x7FF;
        int var10 = class101.field1872[var9];
        int var11 = var10 * 256 / (class95.field1796 + 256);
        int var12 = class101.field1871[var9];
        int var13 = var12 * 256 / (class95.field1796 + 256);
        int var14 = arg4 * var11 + arg6 * var13 >> 16;
        int var15 = arg4 * var13 - arg6 * var11 >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) (Math.cos(var16) * (double) var8);
        ((class190) class244.field4237[arg3]).method478(arg0 + (arg5.field926 / 2) + var18 - 10, arg2 + -10 - (-(arg5.field981 / 2) - -var19), 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(IJ)Lia;")
    public static final class257 method321(int arg0, long arg1) {
        field779++;
        return arg0 == 11901 ? class207.method1397(-3, false, 10, arg1) : null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIBIII)V")
    public static final void method322(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        class31.field610 = 0;
        field789++;
        for (int var7 = -1; var7 < class231.field3880 + class140.field2487; var7++) {
            class241 var23;
            if (var7 == -1) {
                var23 = class137.field2441;
            } else if (class231.field3880 > var7) {
                var23 = class55.field1180[class132.field2362[var7]];
            } else {
                var23 = class92.field1758[class199.field3412[var7 - class231.field3880]];
            }
            if (var23 != null && var23.method1236(0)) {
                if (var23 instanceof class197) {
                    class198 var24 = ((class197) var23).field3322;
                    if (var24.field3393 != null) {
                        var24 = var24.method1324((byte) 125);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (class231.field3880 <= var7) {
                    class198 var25 = ((class197) var23).field3322;
                    if (var25.field3393 != null) {
                        var25 = var25.method1324((byte) 125);
                    }
                    if (var25.field3345 >= 0 && var25.field3345 < class73.field1425.length) {
                        class195.method1309((byte) -84, arg4 >> 1, var23, var23.method1578((byte) -125) + 15, arg5 >> 1, arg1, arg2);
                        if (class74.field1441 > -1) {
                            class73.field1425[var25.field3345].method486(arg6 + class74.field1441 - 12, class250.field4317 + arg0 + -30);
                        }
                    }
                    class12[] var26 = class156.field2719;
                    for (int var27 = 0; var27 < var26.length; var27++) {
                        class12 var28 = var26[var27];
                        if (var28 != null && var28.field224 == 1 && class199.field3412[var7 - class231.field3880] == var28.field222 && class7.field153 % 20 < 10) {
                            class195.method1309((byte) -87, arg4 >> 1, var23, var23.method1578((byte) -126) + 15, arg5 >> 1, arg1, arg2);
                            if (class74.field1441 > -1) {
                                class241.field4190[var28.field220].method486(arg6 + class74.field1441 - 12, class250.field4317 + -28 + arg0);
                            }
                        }
                    }
                } else {
                    int var29 = 30;
                    class180 var30 = (class180) var23;
                    if (var30.field3119 != -1 || var30.field3138 != -1) {
                        class195.method1309((byte) 43, arg4 >> 1, var23, var23.method1578((byte) -122) + 15, arg5 >> 1, arg1, arg2);
                        if (class74.field1441 > -1) {
                            if (var30.field3119 != -1) {
                                class222.field3753[var30.field3119].method486(arg6 + class74.field1441 - 12, class250.field4317 + arg0 - var29);
                                var29 += 25;
                            }
                            if (var30.field3138 != -1) {
                                class73.field1425[var30.field3138].method486(arg6 - (12 - class74.field1441), class250.field4317 + arg0 + -var29);
                                var29 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class12[] var31 = class156.field2719;
                        for (int var32 = 0; var32 < var31.length; var32++) {
                            class12 var33 = var31[var32];
                            if (var33 != null && var33.field224 == 10 && class132.field2362[var7] == var33.field222) {
                                class195.method1309((byte) -90, arg4 >> 1, var23, var23.method1578((byte) -124) + 15, arg5 >> 1, arg1, arg2);
                                if (class74.field1441 > -1) {
                                    class241.field4190[var33.field220].method486(arg6 + class74.field1441 - 12, class250.field4317 + arg0 + -var29);
                                }
                            }
                        }
                    }
                }
                if (var23.field4168 != null && (var7 >= class231.field3880 || class197.field3329 == 0 || class197.field3329 == 3 || class197.field3329 == 1 && class149.method1007((byte) -96, ((class180) var23).field3140))) {
                    class195.method1309((byte) -128, arg4 >> 1, var23, var23.method1578((byte) -126), arg5 >> 1, arg1, arg2);
                    if (class74.field1441 > -1 && class31.field610 < class161.field2820) {
                        class161.field2832[class31.field610] = class71.field1399.method792(var23.field4168) / 2;
                        class161.field2829[class31.field610] = class71.field1399.field1996;
                        class161.field2830[class31.field610] = class74.field1441;
                        class161.field2833[class31.field610] = class250.field4317;
                        class161.field2815[class31.field610] = var23.field4164;
                        class161.field2814[class31.field610] = var23.field4141;
                        class161.field2824[class31.field610] = var23.field4138;
                        class161.field2817[class31.field610] = var23.field4168;
                        class31.field610++;
                    }
                }
                if (class7.field153 < var23.field4158) {
                    class195.method1309((byte) -120, arg4 >> 1, var23, var23.method1578((byte) -124) + 15, arg5 >> 1, arg1, arg2);
                    if (class74.field1441 > -1) {
                        class23.method198(class74.field1441 + arg6 - 15, class250.field4317 + arg0 + -3, var23.field4137, 5, 65280);
                        class23.method198(var23.field4137 + class74.field1441 + arg6 - 15, arg0 + -3 - -class250.field4317, 30 - var23.field4137, 5, 16711680);
                    }
                }
                for (int var34 = 0; var34 < 4; var34++) {
                    if (var23.field4169[var34] > class7.field153) {
                        class195.method1309((byte) 28, arg4 >> 1, var23, var23.method1578((byte) -128) / 2, arg5 >> 1, arg1, arg2);
                        if (class74.field1441 > -1) {
                            if (var34 == 1) {
                                class250.field4317 -= 20;
                            }
                            if (var34 == 2) {
                                class74.field1441 -= 15;
                                class250.field4317 -= 10;
                            }
                            if (var34 == 3) {
                                class250.field4317 -= 10;
                                class74.field1441 += 15;
                            }
                            class160.field2803[var23.field4166[var34]].method486(arg6 + class74.field1441 - 12, arg0 + -12 + class250.field4317);
                            class14.field310.method794(class111.method808(10, var23.field4174[var34]), class74.field1441 + arg6 - 1, arg0 - -class250.field4317 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg3 < 120) {
            method314(-99);
        }
        for (int var8 = 0; var8 < class31.field610; var8++) {
            int var9 = class161.field2833[var8];
            int var10 = class161.field2830[var8];
            int var11 = class161.field2832[var8];
            int var12 = class161.field2829[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if ((var9 + 2) > (class161.field2833[var22] - class161.field2829[var22]) && class161.field2833[var22] + 2 > -var12 + var9 && var10 - var11 < class161.field2832[var22] + class161.field2830[var22] && var10 + var11 > class161.field2830[var22] + -class161.field2832[var22] && (class161.field2833[var22] - class161.field2829[var22]) < var9) {
                        var9 = class161.field2833[var22] - class161.field2829[var22];
                        var13 = true;
                    }
                }
            }
            class74.field1441 = class161.field2830[var8];
            class250.field4317 = class161.field2833[var8] = var9;
            class257 var14 = class161.field2817[var8];
            if (class229.field3849 == 0) {
                int var15 = 16776960;
                if (class161.field2815[var8] < 6) {
                    var15 = class196.field3315[class161.field2815[var8]];
                }
                if (class161.field2815[var8] == 6) {
                    var15 = (class15.field328 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class161.field2815[var8] == 7) {
                    var15 = class15.field328 % 20 < 10 ? 255 : 65535;
                }
                if (class161.field2815[var8] == 8) {
                    var15 = (class15.field328 % 20) < 10 ? 45056 : 8454016;
                }
                if (class161.field2815[var8] == 9) {
                    int var16 = 150 - class161.field2824[var8];
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 < 100) {
                        var15 = 16776960 - ((var16 - 50) * 327680);
                    } else if (var16 < 150) {
                        var15 = ((var16 - 100) * 5) + 65280;
                    }
                }
                if (class161.field2815[var8] == 10) {
                    int var17 = 150 - class161.field2824[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 33095935 - var17 * 327680;
                    } else if (var17 < 150) {
                        var15 = var17 * 327680 - ((var17 + -100) * 5) - 32767745;
                    }
                }
                if (class161.field2815[var8] == 11) {
                    int var18 = 150 - class161.field2824[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - (var18 * 327685);
                    } else if (var18 < 100) {
                        var15 = (var18 - 50) * 327685 + 65280;
                    } else if (var18 < 150) {
                        var15 = 16777215 + 32768000 - (var18 * 327680);
                    }
                }
                if (class161.field2814[var8] == 0) {
                    class71.field1399.method794(var14, class74.field1441 + arg6, class250.field4317 + arg0, var15, 0);
                }
                if (class161.field2814[var8] == 1) {
                    class71.field1399.method795(var14, class74.field1441 + arg6, class250.field4317 + arg0, var15, 0, class15.field328);
                }
                if (class161.field2814[var8] == 2) {
                    class71.field1399.method784(var14, arg6 + class74.field1441, class250.field4317 + arg0, var15, 0, class15.field328);
                }
                if (class161.field2814[var8] == 3) {
                    class71.field1399.method782(var14, class74.field1441 + arg6, class250.field4317 + arg0, var15, 0, class15.field328, 150 - class161.field2824[var8]);
                }
                if (class161.field2814[var8] == 4) {
                    int var19 = (150 - class161.field2824[var8]) * (class71.field1399.method792(var14) + 100) / 150;
                    class23.method189(arg6 + class74.field1441 - 50, arg0, arg6 + class74.field1441 + 50, arg0 - -arg5);
                    class71.field1399.method790(var14, class74.field1441 + arg6 + 50 - var19, arg0 - -class250.field4317, var15, 0);
                    class23.method187(arg6, arg0, arg6 + arg4, arg0 + arg5);
                }
                if (class161.field2814[var8] == 5) {
                    int var20 = 0;
                    int var21 = 150 - class161.field2824[var8];
                    class23.method189(arg6, arg0 + class250.field4317 - class71.field1399.field1996 - 1, arg4 + arg6, arg0 + class250.field4317 + 5);
                    if (var21 < 25) {
                        var20 = var21 - 25;
                    } else if (var21 > 125) {
                        var20 = var21 - 125;
                    }
                    class71.field1399.method794(var14, class74.field1441 + arg6, arg0 - -class250.field4317 + var20, var15, 0);
                    class23.method187(arg6, arg0, arg4 + arg6, arg0 - -arg5);
                }
            } else {
                class71.field1399.method794(var14, class74.field1441 + arg6, arg0 - -class250.field4317, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    public static void method323(int arg0) {
        field768 = null;
        field774 = null;
        field792 = null;
        field783 = null;
        int var1 = 3 / ((-arg0 - 22) / 46);
        field790 = null;
        field775 = null;
        field793 = null;
        field770 = null;
        field794 = null;
        field785 = null;
        field772 = null;
    }
}
