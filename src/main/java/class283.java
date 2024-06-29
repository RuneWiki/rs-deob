import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class283 implements class112 {

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "Lon;")
    private class35 field3798 = new class35(256);

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Lrk;")
    private class427 field3785;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "Lrk;")
    private class427 field3788;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "[Lb;")
    private class122[] field3799;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3786 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field3791 = 52;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "[I")
    public static int[] field3784 = new int[13];

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "[Lkb;")
    public static class80[] field3796;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(FIIZII)[I", line = 4)
    public final int[] method916(float arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg1 < 77) {
            field3791 = -5;
        }
        field3790++;
        return this.method1790((byte) 15, arg2).method1032((byte) 122, arg4, (double) arg0, arg5, this, this.field3785, this.field3799[arg2].field1715);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lpe;I)V", line = 17)
    public static final void method1784(class391 arg0, int arg1) {
        field3787++;
        if (arg1 != -2) {
            field3791 = 93;
        }
        if (class391.field5490 < 0 || class312.field4220 < 0 || class155.field2357 == 0 || class268.field3605 == 0) {
            return;
        }
        arg0.method142(class3.field14, class323.field4379, class155.field2357, class268.field3605);
        arg0.method111(class36.field557, class443.field6390, class155.field2357, class268.field3605);
        class156 var2 = arg0.method239();
        var2.method310(class289.field3879, class315.field4281, class415.field5810, class229.field3184, class229.field3185, class189.field2722);
        arg0.method189(var2);
        if (class363.field5021 == 0 && class265.field3566 != null) {
            int var3 = -1;
            int var4 = -1;
            int var5 = arg0.method116();
            int var6 = (class391.field5490 - class3.field14) * var5 / class155.field2357;
            int var7 = (class312.field4220 - class323.field4379) * var5 / class268.field3605;
            int var8 = arg0.method147();
            int var9 = (class391.field5490 - class3.field14) * var8 / class155.field2357;
            int var10 = (class312.field4220 - class323.field4379) * var8 / class268.field3605;
            int[] var11 = new int[] { var6, var7, var5 };
            var2.method306(var11);
            int[] var12 = new int[] { var9, var10, var8 };
            var2.method306(var12);
            float var13 = 0.0F;
            int var14 = var12[0] - var11[0];
            int var15 = var12[1] - var11[1];
            int var16 = var12[2] - var11[2];
            while (var13 < 1.0F) {
                int var17 = (int) ((float) var14 * var13 + (float) var11[0]);
                int var18 = var17 >> 7;
                int var19 = (int) ((float) var16 * var13 + (float) var11[2]);
                int var20 = var19 >> 7;
                if (var18 > 0 && var20 > 0 && class116.field1621 > var18 && class385.field5425 > var20) {
                    int var21 = class69.field1046;
                    if (var21 < 3 && (class7.field57[1][var18][var20] & 0x2) != 0) {
                        var21++;
                    }
                    if ((float) class265.field3566[var21].method1515(var17, var19) < (float) var15 * var13 + (float) var11[1]) {
                        var3 = (class95.field1379.method2146(-118) - 1) * 64 + var17 >> 7;
                        var4 = (class95.field1379.method2146(90) - 1) * 64 + var19 >> 7;
                        break;
                    }
                }
                var13 = (float) ((double) var13 + 0.01D);
            }
            if (var3 != -1 && var4 != -1) {
                if (class3.field16 && (class280.field3750 & 0x40) != 0) {
                    class139 var22 = class44.method411(class328.field4456, true, class418.field5864);
                    if (var22 == null) {
                        class301.method1932((byte) -125);
                    } else {
                        class361.method2264(var4, class163.field2409, class166.field2465, 0L, arg1 + 103, " ->", 6, var3);
                    }
                } else {
                    if (class42.field640 == 1) {
                        class361.method2264(var4, -1, class391.field5483, 0L, -108, "", 29, var3);
                    }
                    class361.method2264(var4, -1, class365.field5031, 0L, 106, "", 51, var3);
                    class41.field628++;
                }
            }
        }
        class107 var23 = class440.field6321;
        for (class415 var24 = (class415) var23.method891(20838); var24 != null; var24 = (class415) var23.method898(arg1 + 66)) {
            if (var24.method2572(class312.field4220, arg0, (byte) 90, class391.field5490) && class69.field1046 == var24.field5804) {
                if (var24.field5807 instanceof class338) {
                    class338 var25 = (class338) var24.field5807;
                    int var26 = var25.method2146(-119);
                    if ((var26 & 0x1) == 0 && (var25.field3176 & 0x7F) == 0 && (var25.field3167 & 0x7F) == 0 || (var26 & 0x1) == 1 && (var25.field3176 & 0x7F) == 64 && (var25.field3167 & 0x7F) == 64) {
                        int var27 = var25.field3176 - ((var25.method2146(arg1 ^ 0x79) - 1) * 64);
                        int var28 = var25.field3167 + 64 - (var25.method2146(-119) * 64);
                        for (int var29 = 0; var29 < class221.field3055; var29++) {
                            class127 var34 = class298.field4012[class209.field2891[var29]];
                            if (var34 != null && class414.field5793 != var34.field4924 && var34.field4972) {
                                int var35 = 64 - (var34.field1784.field133 * 64 - var34.field3176);
                                int var36 = var34.field3167 + 64 - (var34.field1784.field133 * 64);
                                if (var35 >= var27 && var34.field1784.field133 <= (var25.method2146(-119) - (var35 - var27 >> 7)) && var36 >= var28 && var34.field1784.field133 <= (var25.method2146(18) - (var36 - var28 >> 7))) {
                                    class22.method284(var34, 300);
                                    var34.field4924 = class414.field5793;
                                }
                            }
                        }
                        for (int var30 = 0; var30 < class174.field2579; var30++) {
                            class338 var31 = class220.field3044[class134.field1921[var30]];
                            if (var31 != null && class414.field5793 != var31.field4924 && var25 != var31 && var31.field4972) {
                                int var32 = var31.field3176 - (var31.method2146(-118) * 64 - 64);
                                int var33 = var31.field3167 - (var31.method2146(arg1 + 106) - 1) * 64;
                                if (var27 <= var32 && var31.method2146(-121) <= (var25.method2146(57) - (var32 - var27 >> 7)) && var33 >= var28 && var31.method2146(13) <= var25.method2146(94) - (var33 - var28 >> 7)) {
                                    class57.method538((byte) -47, var31);
                                    var31.field4924 = class414.field5793;
                                }
                            }
                        }
                    }
                    if (class414.field5793 == var25.field4924) {
                        continue;
                    }
                    class57.method538((byte) -47, var25);
                    var25.field4924 = class414.field5793;
                }
                if (var24.field5807 instanceof class127) {
                    class127 var37 = (class127) var24.field5807;
                    if (var37.field1784 != null) {
                        if ((var37.field1784.field133 & 0x1) == 0 && (var37.field3176 & 0x7F) == 0 && (var37.field3167 & 0x7F) == 0 || (var37.field1784.field133 & 0x1) == 1 && (var37.field3176 & 0x7F) == 64 && (var37.field3167 & 0x7F) == 64) {
                            int var38 = var37.field3176 - (var37.field1784.field133 - 1) * 64;
                            int var39 = var37.field3167 - ((var37.field1784.field133 - 1) * 64);
                            for (int var40 = 0; var40 < class221.field3055; var40++) {
                                class127 var45 = class298.field4012[class209.field2891[var40]];
                                if (var45 != null && class414.field5793 != var45.field4924 && var37 != var45 && var45.field4972) {
                                    int var46 = var45.field3176 - ((var45.field1784.field133 - 1) * 64);
                                    int var47 = var45.field3167 + 64 - (var45.field1784.field133 * 64);
                                    if (var38 <= var46 && var45.field1784.field133 <= var37.field1784.field133 - (var46 - var38 >> 7) && var39 <= var47 && var45.field1784.field133 <= (var37.field1784.field133 - (var47 - var39 >> 7))) {
                                        class22.method284(var45, 300);
                                        var45.field4924 = class414.field5793;
                                    }
                                }
                            }
                            for (int var41 = 0; var41 < class174.field2579; var41++) {
                                class338 var42 = class220.field3044[class134.field1921[var41]];
                                if (var42 != null && class414.field5793 != var42.field4924 && var42.field4972) {
                                    int var43 = var42.field3176 - ((var42.method2146(arg1 ^ 0x76) - 1) * 64);
                                    int var44 = var42.field3167 - ((var42.method2146(17) - 1) * 64);
                                    if (var43 >= var38 && var42.method2146(-117) <= var37.field1784.field133 - (var43 - var38 >> 7) && var39 <= var44 && var42.method2146(arg1 ^ 0x79) <= (var37.field1784.field133 - (var44 - var39 >> 7))) {
                                        class57.method538((byte) -47, var42);
                                        var42.field4924 = class414.field5793;
                                    }
                                }
                            }
                        }
                        if (class414.field5793 == var37.field4924) {
                            continue;
                        }
                        class22.method284(var37, arg1 ^ 0xFFFFFED2);
                        var37.field4924 = class414.field5793;
                    }
                }
                if (var24.field5807 instanceof class352) {
                    class396 var48 = (class396) class451.field6514.method614(-116, (long) (var24.field5805 << 14 | var24.field5804 << 28 | var24.field5800));
                    if (var48 != null) {
                        for (class346 var49 = (class346) var48.field5549.method1252(15666); var49 != null; var49 = (class346) var48.field5549.method1243(0)) {
                            class452 var50 = class234.method1569(arg1 ^ 0xFFFFF7A0, var49.field4684);
                            if (class363.field5021 == 1) {
                                class55.field885++;
                                class361.method2264(var24.field5805, class336.field4552, class328.field4458, (long) var49.field4684, arg1 ^ 0xFFFFFFE7, class21.field390 + " -> <col=ff9040>" + var50.field6595, 26, var24.field5800);
                            } else if (class3.field16) {
                                class287 var51 = class386.field5439 == -1 ? null : class345.method2186(class386.field5439, (byte) 78);
                                if ((class280.field3750 & 0x1) != 0 && (var51 == null || var50.method2815((byte) 8, class386.field5439, var51.field3845) != var51.field3845)) {
                                    class447.field6455++;
                                    class361.method2264(var24.field5805, class163.field2409, class166.field2465, (long) var49.field4684, -107, class326.field4421 + " -> <col=ff9040>" + var50.field6595, 47, var24.field5800);
                                }
                            } else {
                                String[] var52 = var50.field6545;
                                for (int var53 = 4; var53 >= 0; var53--) {
                                    if (var52 != null && var52[var53] != null) {
                                        byte var54 = 0;
                                        if (var53 == 0) {
                                            var54 = 46;
                                        }
                                        int var55 = class82.field1210;
                                        if (var53 == 1) {
                                            var54 = 8;
                                        }
                                        if (var53 == 2) {
                                            var54 = 45;
                                        }
                                        if (var53 == 3) {
                                            var54 = 44;
                                        }
                                        if (var50.field6526 == var53) {
                                            var55 = var50.field6583;
                                        }
                                        if (var53 == 4) {
                                            var54 = 24;
                                        }
                                        if (var50.field6530 == var53) {
                                            var55 = var50.field6541;
                                        }
                                        class361.method2264(var24.field5805, var55, var52[var53], (long) var49.field4684, 22, "<col=ff9040>" + var50.field6595, var54, var24.field5800);
                                        class243.field3351++;
                                    }
                                }
                                class276.field3720++;
                                class361.method2264(var24.field5805, class422.field5904, class241.field3333, (long) var49.field4684, -108, "<col=ff9040>" + var50.field6595, 1004, var24.field5800);
                            }
                        }
                    }
                }
                if (var24.field5807 instanceof class111) {
                    class111 var56 = (class111) var24.field5807;
                    class372 var57 = class10.method53(var56.method582((byte) 22), true);
                    if (var57.field5192 != null) {
                        var57 = var57.method2323((byte) -107);
                    }
                    if (var57 != null) {
                        if (class363.field5021 == 1) {
                            class361.method2264(var24.field5805, class336.field4552, class328.field4458, class451.method2807(var56, var24.field5805, -102, var24.field5800), -110, class21.field390 + " -> <col=00ffff>" + var57.field5187, 28, var24.field5800);
                            class155.field2345++;
                        } else if (class3.field16) {
                            class287 var62 = class386.field5439 == -1 ? null : class345.method2186(class386.field5439, (byte) 45);
                            if ((class280.field3750 & 0x4) != 0 && (var62 == null || var57.method2321(var62.field3845, class386.field5439, (byte) 92) != var62.field3845)) {
                                class377.field5310++;
                                class361.method2264(var24.field5805, class163.field2409, class166.field2465, class451.method2807(var56, var24.field5805, 120, var24.field5800), 32, class326.field4421 + " -> <col=00ffff>" + var57.field5187, 59, var24.field5800);
                            }
                        } else {
                            String[] var58 = var57.field5143;
                            if (var58 != null) {
                                for (int var59 = 4; var59 >= 0; var59--) {
                                    if (var58[var59] != null) {
                                        short var60 = 0;
                                        if (var59 == 0) {
                                            var60 = 38;
                                        }
                                        int var61 = class82.field1210;
                                        if (var59 == 1) {
                                            var60 = 33;
                                        }
                                        if (var59 == 2) {
                                            var60 = 2;
                                        }
                                        if (var59 == 3) {
                                            var60 = 19;
                                        }
                                        if (var59 == 4) {
                                            var60 = 1010;
                                        }
                                        if (var57.field5171 == var59) {
                                            var61 = var57.field5186;
                                        }
                                        if (var57.field5212 == var59) {
                                            var61 = var57.field5181;
                                        }
                                        class361.method2264(var24.field5805, var61, var58[var59], class451.method2807(var56, var24.field5805, arg1 ^ 0x40, var24.field5800), 74, "<col=00ffff>" + var57.field5187, var60, var24.field5800);
                                        class7.field64++;
                                    }
                                }
                            }
                            class174.field2563++;
                            class361.method2264(var24.field5805, class422.field5904, class241.field3333, (long) var57.field5157, arg1 ^ 0xFFFFFF92, "<col=00ffff>" + var57.field5187, 1009, var24.field5800);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZIIBF)[F", line = 473)
    public final float[] method915(int arg0, boolean arg1, int arg2, int arg3, byte arg4, float arg5) {
        if (arg4 <= 100) {
            field3796 = null;
        }
        field3789++;
        return this.method1790((byte) -127, arg3).method1030(arg2, arg0, this.field3785, (byte) -52, this, this.field3799[arg3].field1715);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BILjava/util/Random;)I", line = 486)
    public static final int method1785(byte arg0, int arg1, Random arg2) {
        field3782++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class404.method2480(arg1, -120)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            if (arg0 != 23) {
                method1787(-11, -93);
            }
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class153.method1179(var4, arg1, (byte) -112);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BIIILvj;ILbi;Lpe;I)V", line = 518)
    public static final void method1786(byte arg0, int arg1, int arg2, int arg3, class179 arg4, int arg5, class139 arg6, class391 arg7, int arg8) {
        if (arg0 != 95) {
            return;
        }
        field3781++;
        class384 var9 = class212.method1451(arg5, 36);
        if (var9 == null || !var9.field5411 || !var9.method2382(-14605)) {
            return;
        }
        if (var9.field5384 != null) {
            int[] var10 = new int[var9.field5384.length];
            for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                int var13;
                if (class184.field2675 == 4) {
                    var13 = (int) class313.field4229 & 0x3FFF;
                } else {
                    var13 = (int) class313.field4229 + class161.field2395 & 0x3FFF;
                }
                int var14 = class174.field2572[var13];
                int var15 = class174.field2564[var13];
                if (class184.field2675 != 4) {
                    var15 = var15 * 256 / (class398.field5576 + 256);
                    var14 = var14 * 256 / (class398.field5576 + 256);
                }
                var10[var11 * 2] = arg6.field2027 / 2 + ((var9.field5384[var11 * 2 + 1] * 4 + arg8) * var14 + ((var9.field5384[var11 * 2] * 4 + arg2) * var15) >> 15) + arg3;
                var10[var11 * 2 + 1] = arg1 + (arg6.field2011 / 2) - ((var9.field5384[var11 * 2 + 1] * 4 + arg8) * var15 + -((arg2 - -(var9.field5384[var11 * 2] * 4)) * var14) >> 15);
            }
            class217.method1480(arg7, var10, var9.field5398, arg6.field2049, arg6.field2053);
            for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                arg7.method220(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[var12 * 2 + 3], var9.field5391, 1, arg4, arg3, arg1);
            }
            arg7.method220(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field5391, 1, arg4, arg3, arg1);
        }
        class80 var16 = null;
        if (var9.field5396 != -1) {
            var16 = var9.method2378((byte) -26, arg7, false);
            if (var16 != null) {
                class398.method2443(arg8, arg2, arg4, arg3, arg1, arg0 + 4122, arg6, var16);
            }
        }
        if (var9.field5400 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method733();
        }
        class175 var18 = class43.field650;
        class323 var19 = class138.field1946;
        if (var9.field5383 == 1) {
            var19 = class442.field6362;
            var18 = class22.field414;
        }
        if (var9.field5383 == 2) {
            var18 = class96.field1387;
            var19 = class19.field375;
        }
        class330.method2101(arg3, arg4, arg2, arg8, var9.field5400, arg1, var18, arg0 ^ 0xFFFFFFBE, var9.field5385, arg6, var17, var19);
        return;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)I", line = 619)
    public static final int method1787(int arg0, int arg1) {
        if (arg1 > -86) {
            method1787(-102, -99);
        }
        field3795++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 636)
    public static void method1788(int arg0) {
        field3786 = null;
        field3796 = null;
        field3784 = null;
        if (arg0 != 4) {
            method1789(67, 19, 57, 3, -21, 120);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Z", line = 651)
    public final boolean method918(int arg0, int arg1) {
        if (arg1 != -567) {
            method1784((class391) null, -101);
        }
        field3797++;
        class132 var3 = this.method1790((byte) -127, arg0);
        return var3 != null && var3.method1031(this, this.field3785, arg1 ^ 0xFFFFFDB0);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)Lb;", line = 665)
    public final class122 method917(byte arg0, int arg1) {
        if (arg0 < 80) {
            this.field3785 = null;
        }
        field3793++;
        return this.field3799[arg1];
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIII)V", line = 677)
    public static final void method1789(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 1010) {
            field3791 = 110;
        }
        for (int var6 = arg2; var6 <= arg3; var6++) {
            class396.method2436(arg1 ^ 0xFFFFF820, arg5, arg0, class186.field2697[var6], arg4);
        }
        field3779++;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(BI)Lue;", line = 697)
    private final class132 method1790(byte arg0, int arg1) {
        field3783++;
        class295 var3 = this.field3798.method361((long) arg1, (byte) -119);
        if (var3 != null) {
            return (class132) var3;
        }
        int var4 = -82 / ((arg0 + 45) / 46);
        byte[] var5 = this.field3788.method2656(100, arg1);
        if (var5 == null) {
            return null;
        } else {
            class132 var6 = new class132(new class289(var5));
            this.field3798.method360(false, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIZF)[I", line = 734)
    public final int[] method919(int arg0, int arg1, int arg2, int arg3, boolean arg4, float arg5) {
        field3792++;
        if (arg0 > -95) {
            this.field3788 = null;
        }
        return this.method1790((byte) 117, arg3).method1038(-104, arg4, (double) arg5, this.field3799[arg3].field1715, this.field3785, this, arg2, arg1);
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lrk;Lrk;Lrk;)V", line = 747)
    public class283(class427 arg0, class427 arg1, class427 arg2) {
        this.field3785 = arg2;
        this.field3788 = arg1;
        class289 var4 = new class289(arg0.method2633(0, -1, 0));
        int var5 = var4.method1853(-40);
        this.field3799 = new class122[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1861((byte) -72) == 1) {
                this.field3799[var6] = new class122();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field3799[var7] != null) {
                this.field3799[var7].field1708 = var4.method1861((byte) -72) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field3799[var8] != null) {
                this.field3799[var8].field1701 = var4.method1861((byte) -72) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3799[var9] != null) {
                this.field3799[var9].field1703 = var4.method1861((byte) -72) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field3799[var10] != null) {
                this.field3799[var10].field1702 = var4.method1861((byte) -72) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field3799[var11] != null) {
                this.field3799[var11].field1709 = var4.method1868((byte) -122);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field3799[var12] != null) {
                this.field3799[var12].field1719 = var4.method1868((byte) -124);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field3799[var13] != null) {
                this.field3799[var13].field1714 = var4.method1868((byte) -121);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field3799[var14] != null) {
                this.field3799[var14].field1718 = var4.method1868((byte) -120);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field3799[var15] != null) {
                this.field3799[var15].field1707 = (short) var4.method1853(-124);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field3799[var16] != null) {
                this.field3799[var16].field1710 = var4.method1868((byte) -125);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field3799[var17] != null) {
                this.field3799[var17].field1711 = var4.method1868((byte) -126);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field3799[var18] != null) {
                this.field3799[var18].field1713 = var4.method1861((byte) -72) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field3799[var19] != null) {
                this.field3799[var19].field1715 = var4.method1861((byte) -72) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field3799[var20] != null) {
                this.field3799[var20].field1706 = var4.method1868((byte) -127);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field3799[var21] != null) {
                this.field3799[var21].field1721 = var4.method1861((byte) -72) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field3799[var22] != null) {
                this.field3799[var22].field1722 = var4.method1861((byte) -72) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field3799[var23] != null) {
                this.field3799[var23].field1716 = var4.method1861((byte) -72) == 1;
            }
        }
    }
}
