import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class223 {

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "Lhj;")
    public static class69 field4062 = class181.method1318("Musik)2Engine vorbereitet)3", (byte) -127);

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "Lhj;")
    public static class69 field4069 = class181.method1318("::fps ", (byte) -125);

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "Lhj;")
    public static class69 field4071 = class181.method1318(" <col=00ff80>", (byte) -115);

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "Lhj;")
    public static class69 field4067 = class181.method1318("AUS", (byte) -122);

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "Lhj;")
    public static class69 field4072 = null;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "[Z")
    public static boolean[] field4066;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
    public static void method1581(byte arg0) {
        field4066 = null;
        if (arg0 >= -114) {
            field4062 = null;
        }
        field4071 = null;
        field4072 = null;
        field4069 = null;
        field4067 = null;
        field4062 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class248.method1747(15, arg1);
        field4061++;
        int var7 = 0;
        int var8 = arg1 - arg4;
        int var9 = -arg1;
        if (arg2 >= -9) {
            field4062 = null;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var10 = arg1;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int[] var14 = class186.field3402[arg6];
        int var15 = -1;
        int var16 = arg0 - var8;
        class99.method740(arg5, var14, -1162793114, var16, arg0 - arg1);
        int var17 = arg0 + var8;
        class99.method740(arg3, var14, -1162793114, var17, var16);
        class99.method740(arg5, var14, -1162793114, arg0 + arg1, var17);
        while (var7 < var10) {
            var13 += 2;
            var15 += 2;
            var9 += var13;
            var12 += var15;
            if (var12 >= 0 && var11 >= 1) {
                class200.field3625[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var9 >= 0) {
                var10--;
                var9 -= var10 << 1;
                if (var10 < var8) {
                    int[] var18 = class186.field3402[arg6 + var10];
                    int var19 = class200.field3625[var10];
                    int[] var20 = class186.field3402[arg6 - var10];
                    int var21 = arg0 - var7;
                    int var22 = arg0 + var7;
                    int var23 = arg0 + var19;
                    int var24 = arg0 - var19;
                    class99.method740(arg5, var18, -1162793114, var24, var21);
                    class99.method740(arg3, var18, -1162793114, var23, var24);
                    class99.method740(arg5, var18, -1162793114, var22, var23);
                    class99.method740(arg5, var20, -1162793114, var24, var21);
                    class99.method740(arg3, var20, -1162793114, var23, var24);
                    class99.method740(arg5, var20, -1162793114, var22, var23);
                } else {
                    int[] var25 = class186.field3402[arg6 - var10];
                    int[] var26 = class186.field3402[arg6 + var10];
                    int var27 = arg0 + var7;
                    int var28 = arg0 - var7;
                    class99.method740(arg5, var26, -1162793114, var27, var28);
                    class99.method740(arg5, var25, -1162793114, var27, var28);
                }
            }
            int[] var29 = class186.field3402[arg6 + var7];
            int[] var30 = class186.field3402[arg6 - var7];
            int var31 = arg0 + var10;
            int var32 = arg0 - var10;
            if (var7 < var8) {
                int var33 = var7 > var11 ? class200.field3625[var7] : var11;
                int var34 = arg0 + var33;
                int var35 = arg0 - var33;
                class99.method740(arg5, var29, -1162793114, var35, var32);
                class99.method740(arg3, var29, -1162793114, var34, var35);
                class99.method740(arg5, var29, -1162793114, var31, var34);
                class99.method740(arg5, var30, -1162793114, var35, var32);
                class99.method740(arg3, var30, -1162793114, var34, var35);
                class99.method740(arg5, var30, -1162793114, var31, var34);
            } else {
                class99.method740(arg5, var29, -1162793114, var31, var32);
                class99.method740(arg5, var30, -1162793114, var31, var32);
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)Lhj;")
    public static final class69 method1583(int arg0, int arg1, int arg2) {
        field4068++;
        if (arg1 != -24055) {
            field4062 = null;
        }
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return class22.field305;
        } else if (var3 < -6) {
            return class109.field2080;
        } else if (var3 < -3) {
            return class89.field1689;
        } else if (var3 < 0) {
            return class170.field3110;
        } else if (var3 > 9) {
            return class34.field474;
        } else if (var3 > 6) {
            return class215.field3892;
        } else if (var3 > 3) {
            return class118.field2236;
        } else if (var3 > 0) {
            return class88.field1679;
        } else {
            return class98.field1857;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)J")
    public static final synchronized long method1584(int arg0) {
        field4070++;
        long var1 = System.currentTimeMillis();
        if (class245.field4489 > var1) {
            class148.field2766 += class245.field4489 - var1;
        }
        class245.field4489 = var1;
        return arg0 == -25392 ? var1 + class148.field2766 : -62L;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ltk;III)V")
    public static final void method1585(class50 arg0, int arg1, int arg2, int arg3) {
        field4063++;
        if (class26.field370 != null || class103.field1936 || arg0 == null || class199.method1445((byte) 47, arg0) == null) {
            return;
        }
        class26.field370 = arg0;
        class61.field1118 = class199.method1445((byte) 15, arg0);
        if (arg2 > -97) {
            method1583(-8, 81, 21);
        }
        class144.field2681 = arg3;
        class115.field2202 = arg1;
        class33.field470 = 0;
        class166.field3068 = false;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIZI[[[Lrg;)Z")
    public static final boolean method1586(int arg0, int arg1, int arg2, boolean arg3, int arg4, class217[][][] arg5) {
        field4065++;
        byte var6 = arg3 ? 1 : (byte) (class62.field1182 & 0xFF);
        if (class202.field3655[class52.field927][arg2][arg4] == var6) {
            return false;
        } else if ((class19.field246[class52.field927][arg2][arg4] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class157.field2923[var7] = arg2;
            int var32 = var7 + 1;
            class230.field4216[var7] = arg4;
            int var9 = -41 % ((arg1 - 27) / 59);
            class202.field3655[class52.field927][arg2][arg4] = var6;
            while (var32 != var8) {
                int var10 = class157.field2923[var8] & 0xFFFF;
                int var11 = (class157.field2923[var8] & 0xFFE575) >> 16;
                int var12 = class157.field2923[var8] >> 24 & 0xFF;
                int var13 = class230.field4216[var8] & 0xFFFF;
                boolean var14 = false;
                if ((class19.field246[class52.field927][var10][var13] & 0x4) == 0) {
                    var14 = true;
                }
                int var15 = (class230.field4216[var8] & 0xFF260A) >> 16;
                boolean var16 = false;
                var8 = var8 + 1 & 0xFFF;
                label225: for (int var17 = class52.field927 + 1; var17 <= 3; var17++) {
                    if ((class19.field246[var17][var10][var13] & 0x8) == 0) {
                        if (var14 && arg5[var17][var10][var13] != null) {
                            if (arg5[var17][var10][var13].field3932 != null) {
                                int var20 = class207.method1504(14, var11);
                                if (arg5[var17][var10][var13].field3932.field2234 == var20 || arg5[var17][var10][var13].field3932.field2228 == var20) {
                                    continue;
                                }
                                if (var12 != 0) {
                                    int var21 = class207.method1504(59, var12);
                                    if (arg5[var17][var10][var13].field3932.field2234 == var21 || arg5[var17][var10][var13].field3932.field2228 == var21) {
                                        continue;
                                    }
                                }
                                if (var15 != 0) {
                                    int var22 = class207.method1504(114, var15);
                                    if (arg5[var17][var10][var13].field3932.field2234 == var22 || arg5[var17][var10][var13].field3932.field2228 == var22) {
                                        continue;
                                    }
                                }
                            }
                            if (arg5[var17][var10][var13].field3933 != null) {
                                for (int var23 = 0; var23 < arg5[var17][var10][var13].field3940; var23++) {
                                    int var24 = (int) (arg5[var17][var10][var13].field3933[var23].field1656 >> 14 & 0x3FL);
                                    if (var24 == 21) {
                                        var24 = 19;
                                    }
                                    int var25 = (int) (arg5[var17][var10][var13].field3933[var23].field1656 >> 20 & 0x3L);
                                    int var26 = var24 | var25 << 6;
                                    if (var11 == var26 || var12 != 0 && var12 == var26 || var15 != 0 && var15 == var26) {
                                        continue label225;
                                    }
                                }
                            }
                        }
                        class217 var27 = arg5[var17][var10][var13];
                        if (var27 != null && var27.field3940 > 0) {
                            for (int var28 = 0; var28 < var27.field3940; var28++) {
                                class85 var29 = var27.field3933[var28];
                                if (var29.field1662 != var29.field1651 || var29.field1655 != var29.field1653) {
                                    for (int var30 = var29.field1662; var30 <= var29.field1651; var30++) {
                                        for (int var31 = var29.field1653; var31 <= var29.field1655; var31++) {
                                            class202.field3655[var17][var30][var31] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class202.field3655[var17][var10][var13] = var6;
                        var16 = true;
                    }
                }
                if (var16) {
                    if (class271.field4793[class52.field927 + 1][var10][var13] > class247.field4520[arg0]) {
                        class247.field4520[arg0] = class271.field4793[class52.field927 + 1][var10][var13];
                    }
                    int var18 = var10 << 7;
                    int var19 = var13 << 7;
                    if (class212.field3861[arg0] > var18) {
                        class212.field3861[arg0] = var18;
                    } else if (class273.field4827[arg0] < var18) {
                        class273.field4827[arg0] = var18;
                    }
                    if (var19 < class148.field2745[arg0]) {
                        class148.field2745[arg0] = var19;
                    } else if (class22.field300[arg0] < var19) {
                        class22.field300[arg0] = var19;
                    }
                }
                if (!var14) {
                    if (var10 >= 1 && class202.field3655[class52.field927][var10 - 1][var13] != var6) {
                        class157.field2923[var32] = class230.method1644(-754974720, class230.method1644(var10 - 1, 1179648));
                        class230.field4216[var32] = class230.method1644(1245184, var13);
                        var32 = var32 + 1 & 0xFFF;
                        class202.field3655[class52.field927][var10 - 1][var13] = var6;
                    }
                    var13++;
                    if (var13 < 104) {
                        if ((var10 - 1) >= 0 && class202.field3655[class52.field927][var10 - 1][var13] != var6 && (class19.field246[class52.field927][var10][var13] & 0x4) == 0 && (class19.field246[class52.field927][var10 - 1][var13 - 1] & 0x4) == 0) {
                            class157.field2923[var32] = class230.method1644(class230.method1644(var10 - 1, 1179648), 1375731712);
                            class230.field4216[var32] = class230.method1644(1245184, var13);
                            var32 = var32 + 1 & 0xFFF;
                            class202.field3655[class52.field927][var10 - 1][var13] = var6;
                        }
                        if (class202.field3655[class52.field927][var10][var13] != var6) {
                            class157.field2923[var32] = class230.method1644(class230.method1644(var10, 5373952), 318767104);
                            class230.field4216[var32] = class230.method1644(var13, 5439488);
                            var32 = var32 + 1 & 0xFFF;
                            class202.field3655[class52.field927][var10][var13] = var6;
                        }
                        if ((var10 + 1) < 104 && class202.field3655[class52.field927][var10 + 1][var13] != var6 && (class19.field246[class52.field927][var10][var13] & 0x4) == 0 && (class19.field246[class52.field927][var10 + 1][var13 - 1] & 0x4) == 0) {
                            class157.field2923[var32] = class230.method1644(-1845493760, class230.method1644(5373952, var10 + 1));
                            class230.field4216[var32] = class230.method1644(var13, 5439488);
                            class202.field3655[class52.field927][var10 + 1][var13] = var6;
                            var32 = var32 + 1 & 0xFFF;
                        }
                    }
                    var13--;
                    if (var10 + 1 < 104 && class202.field3655[class52.field927][var10 + 1][var13] != var6) {
                        class157.field2923[var32] = class230.method1644(1392508928, class230.method1644(9568256, var10 + 1));
                        class230.field4216[var32] = class230.method1644(9633792, var13);
                        var32 = var32 + 1 & 0xFFF;
                        class202.field3655[class52.field927][var10 + 1][var13] = var6;
                    }
                    var13--;
                    if (var13 >= 0) {
                        if (var10 - 1 >= 0 && class202.field3655[class52.field927][var10 - 1][var13] != var6 && (class19.field246[class52.field927][var10][var13] & 0x4) == 0 && (class19.field246[class52.field927][var10 - 1][var13 + 1] & 0x4) == 0) {
                            class157.field2923[var32] = class230.method1644(class230.method1644(13762560, var10 - 1), 301989888);
                            class230.field4216[var32] = class230.method1644(var13, 13828096);
                            class202.field3655[class52.field927][var10 - 1][var13] = var6;
                            var32 = var32 + 1 & 0xFFF;
                        }
                        if (class202.field3655[class52.field927][var10][var13] != var6) {
                            class157.field2923[var32] = class230.method1644(-1828716544, class230.method1644(var10, 13762560));
                            class230.field4216[var32] = class230.method1644(13828096, var13);
                            class202.field3655[class52.field927][var10][var13] = var6;
                            var32 = var32 + 1 & 0xFFF;
                        }
                        if ((var10 + 1) < 104 && class202.field3655[class52.field927][var10 + 1][var13] != var6 && (class19.field246[class52.field927][var10][var13] & 0x4) == 0 && (class19.field246[class52.field927][var10 + 1][var13 + 1] & 0x4) == 0) {
                            class157.field2923[var32] = class230.method1644(-771751936, class230.method1644(var10 + 1, 9568256));
                            class230.field4216[var32] = class230.method1644(9633792, var13);
                            class202.field3655[class52.field927][var10 + 1][var13] = var6;
                            var32 = var32 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class247.field4520[arg0] != -1000000) {
                class247.field4520[arg0] += 10;
                class212.field3861[arg0] -= 50;
                class273.field4827[arg0] += 50;
                class22.field300[arg0] += 50;
                class148.field2745[arg0] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BZ)V")
    public static final void method1587(byte arg0, boolean arg1) {
        class83.field1577 = arg1;
        if (class83.field1577) {
            int var2 = class199.field3595.method937(false);
            class199.field3595.method294(false);
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var22 = 0; var22 < 13; var22++) {
                    for (int var23 = 0; var23 < 13; var23++) {
                        int var24 = class199.field3595.method305(1, 8);
                        if (var24 == 1) {
                            class17.field223[var3][var22][var23] = class199.field3595.method305(26, 8);
                        } else {
                            class17.field223[var3][var22][var23] = -1;
                        }
                    }
                }
            }
            class199.field3595.method303((byte) -88);
            int var4 = (class33.field451 - class199.field3595.field2379) / 16;
            class272.field4814 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var21 = 0; var21 < 4; var21++) {
                    class272.field4814[var5][var21] = class199.field3595.method944(false);
                }
            }
            int var6 = class199.field3595.method912(-82);
            int var7 = class199.field3595.method962((byte) -73);
            int var8 = class199.field3595.method930((byte) 52);
            int var9 = class199.field3595.method961(-268435456);
            class194.field3540 = new int[var4];
            class230.field4204 = new byte[var4][];
            class245.field4486 = new int[var4];
            class51.field911 = null;
            class220.field3955 = null;
            class40.field568 = new byte[var4][];
            class202.field3656 = new int[var4];
            int var10 = 0;
            for (int var11 = 0; var11 < 4; var11++) {
                for (int var12 = 0; var12 < 13; var12++) {
                    for (int var13 = 0; var13 < 13; var13++) {
                        int var14 = class17.field223[var11][var12][var13];
                        if (var14 != -1) {
                            int var15 = var14 >> 14 & 0x3FF;
                            int var16 = (var14 & 0x3FFC) >> 3;
                            int var17 = (var15 / 8 << 8) + var16 / 8;
                            for (int var18 = 0; var18 < var10; var18++) {
                                if (class245.field4486[var18] == var17) {
                                    var17 = -1;
                                    break;
                                }
                            }
                            if (var17 != -1) {
                                class245.field4486[var10] = var17;
                                int var19 = var17 & 0xFF;
                                int var20 = (var17 & 0xFFDA) >> 8;
                                class194.field3540[var10] = class173.field3171.method589((byte) -108, class9.method42(-127, new class69[] { class140.field2614, class98.method727(-229, var20), class266.field4729, class98.method727(-229, var19) }));
                                class202.field3656[var10] = class173.field3171.method589((byte) -121, class9.method42(-75, new class69[] { class23.field340, class98.method727(-229, var20), class266.field4729, class98.method727(-229, var19) }));
                                var10++;
                            }
                        }
                    }
                }
            }
            class167.method1234(var7, var8, var9, var6, -105, false, var2);
        } else {
            int var25 = class199.field3595.method962((byte) 124);
            int var26 = (class33.field451 - class199.field3595.field2379) / 16;
            class272.field4814 = new int[var26][4];
            for (int var27 = 0; var27 < var26; var27++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class272.field4814[var27][var37] = class199.field3595.method940(false);
                }
            }
            int var28 = class199.field3595.method962((byte) -96);
            int var29 = class199.field3595.method926((byte) -93);
            int var30 = class199.field3595.method961(-268435456);
            int var31 = class199.field3595.method961(-268435456);
            class220.field3955 = null;
            class245.field4486 = new int[var26];
            class40.field568 = new byte[var26][];
            class230.field4204 = new byte[var26][];
            class51.field911 = null;
            boolean var32 = false;
            class202.field3656 = new int[var26];
            class194.field3540 = new int[var26];
            int var33 = 0;
            if ((var30 / 8 == 48 || (var30 / 8) == 49) && var25 / 8 == 48) {
                var32 = true;
            }
            if ((var30 / 8) == 48 && var25 / 8 == 148) {
                var32 = true;
            }
            for (int var34 = (var30 - 6) / 8; var34 <= ((var30 + 6) / 8); var34++) {
                for (int var35 = (var25 - 6) / 8; var35 <= ((var25 + 6) / 8); var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (var32 && var35 == 49 || var35 == 149 || var35 == 147 || var34 == 50 || !(var34 != 49 || var35 != 47)) {
                        class245.field4486[var33] = var36;
                        class194.field3540[var33] = -1;
                        class202.field3656[var33] = -1;
                    } else {
                        class245.field4486[var33] = var36;
                        class194.field3540[var33] = class173.field3171.method589((byte) -109, class9.method42(-82, new class69[] { class140.field2614, class98.method727(-229, var34), class266.field4729, class98.method727(-229, var35) }));
                        class202.field3656[var33] = class173.field3171.method589((byte) -103, class9.method42(-108, new class69[] { class23.field340, class98.method727(-229, var34), class266.field4729, class98.method727(-229, var35) }));
                    }
                    var33++;
                }
            }
            class167.method1234(var25, var30, var28, var31, -105, false, var29);
        }
        if (arg0 < -53) {
            field4064++;
        }
    }
}
