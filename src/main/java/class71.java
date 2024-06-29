import java.util.Calendar;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class71 extends class115 {

    @OriginalMember(owner = "client!ki", name = "Q", descriptor = "I")
    public static int field1075 = 0;

    @OriginalMember(owner = "client!ki", name = "bb", descriptor = "[I")
    public static int[] field1086 = new int[1000];

    @OriginalMember(owner = "client!ki", name = "Y", descriptor = "Lnativeadvert/browsercontrol;")
    public static browsercontrol field1083 = null;

    @OriginalMember(owner = "client!ki", name = "eb", descriptor = "Lqe;")
    public static class168 field1089 = class66.method448("hint_mapmarkers", 112);

    @OriginalMember(owner = "client!ki", name = "U", descriptor = "Lhe;")
    public static class47 field1079 = new class47();

    @OriginalMember(owner = "client!ki", name = "hb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1092 = Calendar.getInstance();

    @OriginalMember(owner = "client!ki", name = "ib", descriptor = "I")
    public static int field1093 = 128;

    @OriginalMember(owner = "client!ki", name = "S", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!ki", name = "T", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!ki", name = "V", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!ki", name = "W", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!ki", name = "X", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!ki", name = "Z", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!ki", name = "ab", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!ki", name = "cb", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!ki", name = "db", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!ki", name = "fb", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!ki", name = "gb", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!ki", name = "jb", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!ki", name = "R", descriptor = "[I")
    public static int[] field1076;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILog;)V")
    public static final void method483(int arg0, class18 arg1) {
        ++field1088;
        arg1.field213 = false;
        if (~arg1.field223 != 0) {
            class237 var2 = class213.method1370(-1, arg1.field223);
            if (var2 != null && var2.field4065 != null) {
                ++arg1.field203;
                if (arg1.field169 < var2.field4065.length && ~arg1.field203 < ~var2.field4069[arg1.field169]) {
                    arg1.field203 = 1;
                    ++arg1.field169;
                    class122.method830(class7.field85 == arg1, (byte) 109, arg1.field169, arg1.field190, arg1.field166, var2);
                }
                if (var2.field4065.length <= arg1.field169) {
                    arg1.field169 = 0;
                    arg1.field203 = 0;
                    class122.method830(class7.field85 == arg1, (byte) 107, arg1.field169, arg1.field190, arg1.field166, var2);
                }
            } else {
                arg1.field223 = -1;
            }
        }
        if (arg1.field198 != -1 && ~class133.field2326 <= ~arg1.field156) {
            if (~arg1.field183 > -1) {
                arg1.field183 = 0;
            }
            int var3 = class128.method865(arg1.field198, arg0 ^ -22689).field3680;
            if (~var3 != 0) {
                class237 var4 = class213.method1370(-1, var3);
                if (var4 != null && var4.field4065 != null) {
                    ++arg1.field217;
                    if (arg1.field183 < var4.field4065.length && ~var4.field4069[arg1.field183] > ~arg1.field217) {
                        ++arg1.field183;
                        arg1.field217 = 1;
                        class122.method830(class7.field85 == arg1, (byte) 114, arg1.field183, arg1.field190, arg1.field166, var4);
                    }
                    if (arg1.field183 >= var4.field4065.length) {
                        arg1.field198 = -1;
                    }
                } else {
                    arg1.field198 = -1;
                }
            } else {
                arg1.field198 = -1;
            }
        }
        if (~arg1.field216 != 0 && arg1.field170 <= 1) {
            class237 var5 = class213.method1370(arg0 + 22689, arg1.field216);
            if (~var5.field4063 == -2 && ~arg1.field220 < -1 && ~arg1.field214 >= ~class133.field2326 && class133.field2326 > arg1.field209) {
                arg1.field170 = 1;
                return;
            }
        }
        if (arg0 != -22690) {
            field1090 = 81;
        }
        if (arg1.field216 != -1 && ~arg1.field170 == -1) {
            class237 var6 = class213.method1370(-1, arg1.field216);
            if (var6 != null && var6.field4065 != null) {
                ++arg1.field174;
                if (~var6.field4065.length < ~arg1.field189 && ~var6.field4069[arg1.field189] > ~arg1.field174) {
                    arg1.field174 = 1;
                    ++arg1.field189;
                    class122.method830(class7.field85 == arg1, (byte) 117, arg1.field189, arg1.field190, arg1.field166, var6);
                }
                if (var6.field4065.length <= arg1.field189) {
                    ++arg1.field168;
                    arg1.field189 -= var6.field4060;
                    if (~var6.field4050 < ~arg1.field168) {
                        if (arg1.field189 >= 0 && arg1.field189 < var6.field4065.length) {
                            class122.method830(class7.field85 == arg1, (byte) 114, arg1.field189, arg1.field190, arg1.field166, var6);
                        } else {
                            arg1.field216 = -1;
                        }
                    } else {
                        arg1.field216 = -1;
                    }
                }
                arg1.field213 = var6.field4061;
            } else {
                arg1.field216 = -1;
            }
        }
        if (arg1.field170 > 0) {
            --arg1.field170;
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
    public class71() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        int[][] var3 = super.field1882.method1242(arg0, -96);
        if (super.field1882.field3344) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class130.field2297; ++var7) {
                this.method488(arg0, var7, (byte) 14);
                int[][] var8 = this.method789(0, (byte) -124, class211.field3648);
                var5[var7] = var8[0][class76.field1140];
                var4[var7] = var8[1][class76.field1140];
                var6[var7] = var8[2][class76.field1140];
            }
        }
        ++field1082;
        if (arg1 <= 11) {
            this.method5(99, (byte) -21);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZB)V")
    public static final void method484(boolean arg0, byte arg1) {
        class208.field3614 = new int[104];
        class31.field378 = 99;
        class30.field369 = new int[104];
        class135.field2360 = new int[104];
        ++field1087;
        class9.field99 = new int[104];
        byte var2;
        if (!arg0) {
            var2 = 4;
        } else {
            var2 = 1;
        }
        class179.field3155 = new byte[var2][105][105];
        class176.field3081 = new byte[var2][104][104];
        if (arg1 < -62) {
            class139.field2467 = new int[var2][105][105];
            class96.field1510 = new byte[var2][104][104];
            class221.field3792 = new byte[var2][104][104];
            class76.field1138 = new byte[var2][104][104];
            class254.field4397 = new int[104];
        }
    }

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "(I)V")
    public static final void method485(int arg0) {
        if (arg0 == 4) {
            ++field1077;
            for (int var1 = 0; var1 < class84.field1278; ++var1) {
                int var2 = class38.field521[var1];
                class121 var3 = class104.field1677[var2];
                int var4 = class112.field1815.method758(true);
                if (~(4 & var4) != -1) {
                    var4 += class112.field1815.method758(true) << 8;
                }
                class178.method1172(0, var3, var2, var4);
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[][][] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, byte arg13, int arg14, int arg15) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class90.field1406 * 128) {
            arg0 = class90.field1406 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class32.field386 * 128) {
            arg2 = class32.field386 * 128 - 1;
        }
        class139.field2449 = class248.field4297[arg3];
        class173.field2997 = class248.field4301[arg3];
        class129.field2243 = class248.field4297[arg4];
        class204.field3550 = class248.field4301[arg4];
        class108.field1739 = arg0;
        class45.field588 = arg1;
        class102.field1648 = arg2;
        class193.field3371 = arg0 / 128;
        class62.field848 = arg2 / 128;
        class6.field69 = arg5;
        class29.field347 = class193.field3371 - class84.field1280;
        if (class29.field347 < 0) {
            class29.field347 = 0;
        }
        class206.field3585 = class62.field848 - class84.field1280;
        if (class206.field3585 < 0) {
            class206.field3585 = 0;
        }
        class107.field1716 = class84.field1280 + class193.field3371;
        if (class107.field1716 > class90.field1406) {
            class107.field1716 = class90.field1406;
        }
        class150.field2614 = class84.field1280 + class62.field848;
        if (class150.field2614 > class32.field386) {
            class150.field2614 = class32.field386;
        }
        short var16 = 3500;
        for (int var17 = 0; var17 < class84.field1280 + class84.field1280 + 2; ++var17) {
            for (int var20 = 0; var20 < class84.field1280 + class84.field1280 + 2; ++var20) {
                int var21 = (var17 - class84.field1280 << 7) - (class108.field1739 & 127);
                int var22 = (var20 - class84.field1280 << 7) - (class102.field1648 & 127);
                int var23 = class193.field3371 - class84.field1280 + var17;
                int var24 = class62.field848 - class84.field1280 + var20;
                if (var23 >= 0 && var24 >= 0 && var23 < class90.field1406 && var24 < class32.field386) {
                    int var25;
                    if (class150.field2603 != null) {
                        var25 = class150.field2603[0][var23][var24] - class45.field588 + 128;
                    } else {
                        var25 = class62.field849[0][var23][var24] - class45.field588 + 128;
                    }
                    int var26 = class62.field849[3][var23][var24] - class45.field588 - 1000;
                    class3.field33[var17][var20] = class177.method1166(var21, var26, var25, var22, var16);
                } else {
                    class3.field33[var17][var20] = false;
                }
            }
        }
        for (int var18 = 0; var18 < class84.field1280 + class84.field1280 + 1; ++var18) {
            for (int var19 = 0; var19 < class84.field1280 + class84.field1280 + 1; ++var19) {
                class197.field3416[var18][var19] = class3.field33[var18][var19] || class3.field33[var18 + 1][var19] || class3.field33[var18][var19 + 1] || class3.field33[var18 + 1][var19 + 1];
            }
        }
        class73.field1111 = arg7;
        class148.field2584 = arg8;
        class192.field3348 = arg9;
        class190.field3304 = arg10;
        class238.field4075 = arg11;
        class117.method800();
        class30.method198(arg0, arg1, arg2, arg6, arg12, arg13, arg14, arg15);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        ++field1085;
        if (arg1 <= 37) {
            method489((byte) -4);
        }
        int[] var3 = super.field1872.method182((byte) -102, arg0);
        if (super.field1872.field341) {
            for (int var4 = 0; ~var4 > ~class130.field2297; ++var4) {
                this.method488(arg0, var4, (byte) -101);
                int[] var5 = this.method792(0, 0, class211.field3648);
                var3[var4] = var5[class76.field1140];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)V")
    public static final void method487(byte arg0) {
        class87.field1348.method672(235, arg0 + 153);
        class87.field1348.method739(0L, -23147);
        ++class105.field1686;
        if (arg0 == 85) {
            ++field1080;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIB)V")
    private final void method488(int arg0, int arg1, byte arg2) {
        ++field1078;
        int var4 = class170.field2963[arg0];
        int var5 = class193.field3367[arg1];
        int var6 = -63 % ((51 - arg2) / 34);
        float var7 = (float) Math.atan2((double) (var5 + -2048), (double) (var4 - 2048));
        if ((double) var7 >= -3.141592653589793D && (double) var7 <= -2.356194490192345D) {
            class211.field3648 = arg0;
            class76.field1140 = arg1;
        } else if ((double) var7 <= -1.5707963267948966D && (double) var7 >= -2.356194490192345D) {
            class76.field1140 = arg0;
            class211.field3648 = arg1;
        } else if ((double) var7 <= -0.7853981633974483D && (double) var7 >= -1.5707963267948966D) {
            class76.field1140 = class130.field2297 - arg0;
            class211.field3648 = arg1;
        } else if (var7 <= 0.0F && (double) var7 >= -0.7853981633974483D) {
            class211.field3648 = -arg0 + class62.field855;
            class76.field1140 = arg1;
        } else if (var7 >= 0.0F && (double) var7 <= 0.7853981633974483D) {
            class76.field1140 = -arg1 + class130.field2297;
            class211.field3648 = class62.field855 - arg0;
        } else if ((double) var7 >= 0.7853981633974483D && (double) var7 <= 1.5707963267948966D) {
            class76.field1140 = -arg0 + class130.field2297;
            class211.field3648 = -arg1 + class62.field855;
        } else if ((double) var7 >= 1.5707963267948966D && (double) var7 <= 2.356194490192345D) {
            class76.field1140 = arg0;
            class211.field3648 = -arg1 + class62.field855;
        } else if ((double) var7 >= 2.356194490192345D && (double) var7 <= 3.141592653589793D) {
            class211.field3648 = arg0;
            class76.field1140 = -arg1 + class130.field2297;
        }
        class211.field3648 &= class38.field522;
        class76.field1140 &= class134.field2350;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        ++field1091;
        if (arg0 != 107) {
            this.method488(105, -8, (byte) -99);
        }
        if (~arg2 == -1) {
            super.field1879 = arg1.method758(true) == 1;
        }
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(B)V")
    public static void method489(byte arg0) {
        field1079 = null;
        field1083 = null;
        if (arg0 != -75) {
            method486(-63, -29, 92, -5, 7, -39, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 112, (byte) -48, -115, -33);
        }
        field1076 = null;
        field1092 = null;
        field1089 = null;
        field1086 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lqe;I)V")
    public static final void method490(class168 arg0, int arg1) {
        if (arg1 != -28518) {
            field1079 = null;
        }
        class4 var2 = class227.method1470(arg0, true);
        ++field1084;
        if (var2 != null) {
            class27.field342 = -class232.field3935 + var2.field51;
            int var3 = (int) ((double) class122.field2021.field2175 / class167.field2852) + class27.field342;
            int var4 = -((int) ((double) class122.field2021.field2175 / class167.field2852)) + class27.field342;
            if (var4 < 0) {
                class27.field342 = (int) ((double) class122.field2021.field2175 / class167.field2852);
            }
            if (~var3 < ~class79.field1189) {
                class27.field342 = -((int) ((double) class122.field2021.field2175 / class167.field2852)) + class79.field1189;
            }
            class68.field971 = class162.field2781 - -class42.field552 + -var2.field47;
            int var5 = -((int) ((double) class122.field2021.field2210 / class167.field2852)) + class68.field971;
            int var6 = (int) ((double) class122.field2021.field2210 / class167.field2852) + class68.field971;
            if (var5 < 0) {
                class68.field971 = (int) ((double) class122.field2021.field2210 / class167.field2852);
            }
            if (~class42.field552 > ~var6) {
                class68.field971 = class42.field552 - (int) ((double) class122.field2021.field2210 / class167.field2852);
            }
        }
    }
}
