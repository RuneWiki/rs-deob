import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class167 {

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field2946 = 0;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "Lpj;")
    public static class237 field2950 = class33.method353("Lade Texturen )2 ", 84);

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "Lpj;")
    private static class237 field2951 = class33.method353("Loading wordpack )2 ", 17);

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "Lpj;")
    public static class237 field2953 = field2951;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "Lpj;")
    public static class237 field2955 = class33.method353("Titelbild ge-Offnet)3", 53);

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field2960 = 0;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "Lpj;")
    public static class237 field2959 = class33.method353(" x ", 32);

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "[[B")
    public static byte[][] field2949;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1165(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class224.field3852 = arg1;
        class182.field3211 = arg2;
        class159.field2860 = arg3;
        class115.field2027 = new class35[arg0][class224.field3852][class182.field3211];
        class74.field1421 = new int[arg0][class224.field3852 + 1][class182.field3211 + 1];
        if (arg4) {
            class69.field1355 = new class35[1][class224.field3852][class182.field3211];
            class123.field2166 = new int[class224.field3852][class182.field3211];
            class206.field3509 = new int[1][class224.field3852 + 1][class182.field3211 + 1];
        } else {
            class69.field1355 = null;
            class123.field2166 = null;
            class206.field3509 = null;
        }
        class162.method1144(false);
        class164.field2926 = new class36[500];
        class27.field489 = 0;
        class190.field3310 = new class36[500];
        class234.field4050 = 0;
        class249.field4332 = new int[arg0][class224.field3852 + 1][class182.field3211 + 1];
        class185.field3239 = new class191[5000];
        class85.field1579 = 0;
        class261.field4476 = new class191[100];
        class56.field1152 = new boolean[class159.field2860 + class159.field2860 + 1][class159.field2860 + class159.field2860 + 1];
        class83.field1553 = new boolean[class159.field2860 + class159.field2860 + 2][class159.field2860 + class159.field2860 + 2];
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lhi;I)V")
    public static final void method1166(class210 arg0, int arg1) {
        field2947++;
        for (class249 var2 = (class249) class82.field1536.method673(false); var2 != null; var2 = (class249) class82.field1536.method680(107)) {
            if (var2.field4310 == arg0) {
                if (var2.field4333 != null) {
                    class74.field1424.method583(var2.field4333);
                    var2.field4333 = null;
                }
                var2.method629(0);
                return;
            }
        }
        if (arg1 > -63) {
            method1170((byte) -58);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public static final void method1167(byte arg0) {
        field2952++;
        if (class275.field4827 == -1 || class21.field388 == -1) {
            return;
        }
        float[] var1 = new float[3];
        int var2 = ((class115.field2031 - class207.field3537) * class252.field4339 >> 16) + class207.field3537;
        class252.field4339 += var2;
        int var3 = class102.field1808 * 2;
        if (class252.field4339 >= 65535) {
            if (class196.field3406) {
                class34.field732 = false;
            } else {
                class34.field732 = true;
            }
            class252.field4339 = 65535;
            class196.field3406 = true;
        } else {
            class196.field3406 = false;
            class34.field732 = false;
        }
        float var4 = (float) class252.field4339 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class141.field2543[class275.field4827][var3][var5] * 3;
            int var22 = class141.field2543[class275.field4827][var3 + 1][var5] * 3;
            int var23 = class141.field2543[class275.field4827][var3][var5];
            int var24 = (class141.field2543[class275.field4827][var3 + 2][var5] + class141.field2543[class275.field4827][var3 + 2][var5] - class141.field2543[class275.field4827][var3 + 3][var5]) * 3;
            int var25 = class141.field2543[class275.field4827][var3 + 2][var5] + var22 - var23 - var24;
            int var26 = var21 + var24 - (var22 * 2);
            int var27 = var22 - var21;
            var1[var5] = (((float) var25 * var4 + (float) var26) * var4 + (float) var27) * var4 + (float) var23;
        }
        field2957 = (int) var1[2] - (class27.field494 * 128);
        class20.field380 = (int) var1[0] - class235.field4087 * 128;
        int var6 = class181.field3169 * 2;
        class112.field1957 = (int) var1[1] * -1;
        float[] var7 = new float[3];
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class141.field2543[class21.field388][var6][var8] * 3;
            int var15 = class141.field2543[class21.field388][var6 + 1][var8] * 3;
            int var16 = (class141.field2543[class21.field388][var6 + 2][var8] - (class141.field2543[class21.field388][var6 + 3][var8] - class141.field2543[class21.field388][var6 + 2][var8])) * 3;
            int var17 = class141.field2543[class21.field388][var6][var8];
            int var18 = class141.field2543[class21.field388][var6 + 2][var8] + var15 - var16 - var17;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = var15 - var14;
            var7[var8] = (((float) var18 * var4 + (float) var19) * var4 + (float) var20) * var4 + (float) var17;
        }
        if (arg0 != -25) {
            field2953 = null;
        }
        float var9 = (var7[1] - var1[1]) * -1.0F;
        float var10 = var7[2] - var1[2];
        float var11 = var7[0] - var1[0];
        double var12 = Math.sqrt((double) (var10 * var10 + var11 * var11));
        class216.field3757 = (float) Math.atan2((double) var9, var12);
        class273.field4729 = -((float) Math.atan2((double) var11, (double) var10));
        class189.field3289 = (int) ((double) class273.field4729 * 325.949D) & 0x7FF;
        class214.field3654 = (int) ((double) class216.field3757 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIBLw;I)V")
    public static final void method1168(int arg0, int arg1, byte arg2, class141 arg3, int arg4) {
        class96.method718((byte) -52);
        class192.method1309(arg0, arg1, arg3.field2575 + arg0, arg3.field2490 + arg1);
        int var5 = 27 / ((arg2 + 84) / 36);
        if (class111.field1952 == 2 || class111.field1952 == 5 || class160.field2880 == null) {
            class192.method1305(arg0, arg1, 0, arg3.field2442, arg3.field2429);
        } else {
            int var6 = class257.field4417 + class13.field222 & 0x7FF;
            int var7 = class229.field3911.field3710 / 32 + 48;
            int var8 = 464 - (class229.field3911.field3700 / 32);
            ((class225) class160.field2880).method814(arg0, arg1, arg3.field2575, arg3.field2490, var7, var8, var6, class85.field1577 + 256, arg3.field2442, arg3.field2429);
            if (class44.field961 != null) {
                for (int var9 = 0; var9 < class44.field961.field1000; var9++) {
                    if (class44.field961.method429(var9, -1702768738)) {
                        int var10 = (class44.field961.field987[var9] - class27.field494) * 4 + 2 - (class229.field3911.field3700 / 32);
                        int var11 = class150.field2670[var6];
                        int var12 = (class44.field961.field1007[var9] - class235.field4087) * 4 + 2 - (class229.field3911.field3710 / 32);
                        int var13 = class150.field2676[var6];
                        int var14 = var11 * 256 / (class85.field1577 + 256);
                        int var15 = var13 * 256 / (class85.field1577 + 256);
                        int var16 = var10 * var14 + var12 * var15 >> 16;
                        int var17 = var10 * var15 - (var12 * var14) >> 16;
                        class194 var18 = class96.field1708;
                        if (class44.field961.method427(true, var9) == 1) {
                            var18 = class227.field3884;
                        }
                        if (class44.field961.method427(true, var9) == 2) {
                            var18 = class80.field1507;
                        }
                        int var19 = var18.method1324(class44.field961.field1002[var9], 100);
                        int var20 = var16 - var19 / 2;
                        if (-arg3.field2575 <= var20 && arg3.field2575 >= var20 && (-arg3.field2490) <= var17 && arg3.field2490 >= var17) {
                            int var21 = 16777215;
                            if (class44.field961.field1001[var9] != -1) {
                                var21 = class44.field961.field1001[var9];
                            }
                            class192.method1296(arg3.field2442, arg3.field2429);
                            var18.method1343(class44.field961.field1002[var9], arg3.field2575 / 2 + var20 + arg0, arg1 - (-(arg3.field2490 / 2) - -var17), var19, 50, var21, 0, 256, 1, 0, 0);
                            class192.method1314();
                        }
                    }
                }
            }
            for (int var22 = 0; var22 < class247.field4303; var22++) {
                int var57 = class259.field4453[var22] * 4 + 2 - (class229.field3911.field3710 / 32);
                int var58 = class14.field241[var22] * 4 + 2 - (class229.field3911.field3700 / 32);
                class28 var59 = class94.method700(-71, class224.field3864[var22]);
                if (var59.field537 != null) {
                    var59 = var59.method262(true);
                    if (var59 == null || var59.field553 == -1) {
                        continue;
                    }
                }
                class69.method561(arg0, class50.field1073[var59.field553], var57, arg3, arg1, var58, 124);
            }
            for (int var23 = 0; var23 < 104; var23++) {
                for (int var53 = 0; var53 < 104; var53++) {
                    class88 var54 = class32.field674[class274.field4798][var23][var53];
                    if (var54 != null) {
                        int var55 = var53 * 4 - (class229.field3911.field3700 / 32 - 2);
                        int var56 = var23 * 4 + 2 - (class229.field3911.field3710 / 32);
                        class69.method561(arg0, class10.field193[0], var56, arg3, arg1, var55, 124);
                    }
                }
            }
            for (int var24 = 0; var24 < class89.field1636; var24++) {
                class210 var49 = class232.field4022[class263.field4498[var24]];
                if (var49 != null && var49.method1403((byte) 119)) {
                    class231 var50 = var49.field3586;
                    if (var50 != null && var50.field3991 != null) {
                        var50 = var50.method1530(-1);
                    }
                    if (var50 != null && var50.field3967 && var50.field3974) {
                        int var51 = var49.field3710 / 32 - (class229.field3911.field3710 / 32);
                        int var52 = var49.field3700 / 32 - class229.field3911.field3700 / 32;
                        class69.method561(arg0, class10.field193[1], var51, arg3, arg1, var52, 127);
                    }
                }
            }
            for (int var25 = 0; var25 < class258.field4439; var25++) {
                class271 var39 = class232.field4025[class126.field2202[var25]];
                if (var39 != null && var39.method1403((byte) 92)) {
                    int var40 = var39.field3710 / 32 - (class229.field3911.field3710 / 32);
                    int var41 = var39.field3700 / 32 - (class229.field3911.field3700 / 32);
                    boolean var42 = false;
                    long var43 = var39.field4655.method1616(0);
                    for (int var45 = 0; var45 < class221.field3810; var45++) {
                        if (class144.field2601[var45] == var43 && class71.field1399[var45] != 0) {
                            var42 = true;
                            break;
                        }
                    }
                    boolean var46 = false;
                    for (int var47 = 0; var47 < class260.field4464; var47++) {
                        if (class113.field1971[var47].field1530 == var43) {
                            var46 = true;
                            break;
                        }
                    }
                    boolean var48 = false;
                    if (class229.field3911.field4652 != 0 && var39.field4652 != 0 && class229.field3911.field4652 == var39.field4652) {
                        var48 = true;
                    }
                    if (var42) {
                        class69.method561(arg0, class10.field193[3], var40, arg3, arg1, var41, 124);
                    } else if (var46) {
                        class69.method561(arg0, class10.field193[5], var40, arg3, arg1, var41, 125);
                    } else if (var48) {
                        class69.method561(arg0, class10.field193[4], var40, arg3, arg1, var41, 124);
                    } else {
                        class69.method561(arg0, class10.field193[2], var40, arg3, arg1, var41, 126);
                    }
                }
            }
            class71[] var26 = class144.field2599;
            for (int var27 = 0; var27 < var26.length; var27++) {
                class71 var30 = var26[var27];
                if (var30 != null && var30.field1397 != 0 && (class241.field4246 % 20) < 10) {
                    if (var30.field1397 == 1 && var30.field1391 >= 0 && var30.field1391 < class232.field4022.length) {
                        class210 var31 = class232.field4022[var30.field1391];
                        if (var31 != null) {
                            int var32 = var31.field3710 / 32 - class229.field3911.field3710 / 32;
                            int var33 = var31.field3700 / 32 - class229.field3911.field3700 / 32;
                            class46.method431(var33, arg0, 5953, var32, arg3, arg1, var30.field1388);
                        }
                    }
                    if (var30.field1397 == 2) {
                        int var34 = (var30.field1400 - class235.field4087) * 4 + 2 - (class229.field3911.field3710 / 32);
                        int var35 = (var30.field1387 - class27.field494) * 4 + 2 - (class229.field3911.field3700 / 32);
                        class46.method431(var35, arg0, 5953, var34, arg3, arg1, var30.field1388);
                    }
                    if (var30.field1397 == 10 && var30.field1391 >= 0 && var30.field1391 < class232.field4025.length) {
                        class271 var36 = class232.field4025[var30.field1391];
                        if (var36 != null) {
                            int var37 = var36.field3700 / 32 - class229.field3911.field3700 / 32;
                            int var38 = var36.field3710 / 32 - (class229.field3911.field3710 / 32);
                            class46.method431(var37, arg0, 5953, var38, arg3, arg1, var30.field1388);
                        }
                    }
                }
            }
            if (class36.field815 != 0) {
                int var28 = class36.field815 * 4 - ((class229.field3911.field3710 / 32) - 2);
                int var29 = class135.field2345 * 4 + 2 - (class229.field3911.field3700 / 32);
                class69.method561(arg0, class24.field430, var28, arg3, arg1, var29, 126);
            }
            class192.method1301(arg3.field2575 / 2 + arg0 - 1, arg3.field2490 / 2 + (arg1 - 1), 3, 3, 16777215);
        }
        class114.field2008[arg4] = true;
        field2958++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIII)V")
    public static final void method1169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 14 % ((arg0 - 43) / 47);
        for (int var7 = arg2; var7 <= arg5; var7++) {
            class199.method1361(arg1, arg3, class62.field1241[var7], arg4, 95);
        }
        field2948++;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
    public static void method1170(byte arg0) {
        field2950 = null;
        if (arg0 >= -89) {
            return;
        }
        field2959 = null;
        field2951 = null;
        field2953 = null;
        field2955 = null;
        field2949 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)I")
    public static final int method1171(int arg0, int arg1, int arg2) {
        field2954++;
        class44 var3 = (class44) class64.field1280.method568((long) arg1, -1);
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            int var5 = 0;
            if (arg0 > -12) {
                method1166((class210) null, 99);
            }
            while (var3.field958.length > var5) {
                if (var3.field970[var5] == arg2) {
                    var4 += var3.field958[var5];
                }
                var5++;
            }
            return var4;
        }
    }
}
