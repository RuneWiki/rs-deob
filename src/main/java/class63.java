import java.util.Date;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class63 extends class64 {

    @OriginalMember(owner = "client!gh", name = "cb", descriptor = "I")
    private int field1152 = 6;

    @OriginalMember(owner = "client!gh", name = "lb", descriptor = "Lsg;")
    public static class169 field1161 = class165.method1060("titlebox", 1536);

    @OriginalMember(owner = "client!gh", name = "db", descriptor = "Ljava/util/Random;")
    public static Random field1153 = new Random();

    @OriginalMember(owner = "client!gh", name = "ob", descriptor = "[I")
    public static int[] field1164 = new int[100];

    @OriginalMember(owner = "client!gh", name = "rb", descriptor = "[I")
    public static int[] field1167 = new int[2000];

    @OriginalMember(owner = "client!gh", name = "qb", descriptor = "[Lsg;")
    public static class169[] field1166 = new class169[500];

    @OriginalMember(owner = "client!gh", name = "pb", descriptor = "Lsg;")
    private static class169 field1165 = class165.method1060("Press (Wchange your password(W on front page)3", 1536);

    @OriginalMember(owner = "client!gh", name = "mb", descriptor = "Lsg;")
    public static class169 field1162 = field1165;

    @OriginalMember(owner = "client!gh", name = "nb", descriptor = "La;")
    public static class1 field1163 = new class1();

    @OriginalMember(owner = "client!gh", name = "tb", descriptor = "Z")
    public static boolean field1169 = false;

    @OriginalMember(owner = "client!gh", name = "sb", descriptor = "Lsg;")
    public static class169 field1168 = class165.method1060("null", 1536);

    @OriginalMember(owner = "client!gh", name = "bb", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!gh", name = "eb", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!gh", name = "fb", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!gh", name = "gb", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!gh", name = "hb", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!gh", name = "ib", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!gh", name = "jb", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!gh", name = "kb", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        int var4 = -8 % ((arg0 - -60) / 36);
        ++field1158;
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field1183 = ~arg1.method819((byte) 22) == -2;
            }
        } else {
            this.field1152 = arg1.method819((byte) 22);
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(Z)I")
    public static final int method387(boolean arg0) {
        int var1 = 3;
        if (arg0) {
            return 81;
        } else {
            if (class148.field2743 < 310) {
                int var2 = class7.field159 >> 7;
                int var3 = class138.field2569 >> 7;
                if (~(class159.field3040[class61.field1132][var2][var3] & 4) != -1) {
                    var1 = class61.field1132;
                }
                int var4 = class4.field79.field3679 >> 7;
                int var5 = class4.field79.field3698 >> 7;
                int var6;
                if (~var5 >= ~var2) {
                    var6 = -var5 + var2;
                } else {
                    var6 = var5 - var2;
                }
                int var7;
                if (var3 >= var4) {
                    var7 = var3 - var4;
                } else {
                    var7 = var4 - var3;
                }
                if (~var6 >= ~var7) {
                    int var8 = 32768;
                    int var9 = var6 * 65536 / var7;
                    while (~var3 != ~var4) {
                        var8 += var9;
                        if (~var4 < ~var3) {
                            ++var3;
                        } else if (var4 < var3) {
                            --var3;
                        }
                        if ((class159.field3040[class61.field1132][var2][var3] & 4) != 0) {
                            var1 = class61.field1132;
                        }
                        if (~var8 <= -65537) {
                            if (~var2 > ~var5) {
                                ++var2;
                            } else if (var5 < var2) {
                                --var2;
                            }
                            var8 -= 65536;
                            if (~(class159.field3040[class61.field1132][var2][var3] & 4) != -1) {
                                var1 = class61.field1132;
                            }
                        }
                    }
                } else {
                    int var10 = var7 * 65536 / var6;
                    int var11 = 32768;
                    while (~var2 != ~var5) {
                        var11 += var10;
                        if (var5 > var2) {
                            ++var2;
                        } else if (~var2 < ~var5) {
                            --var2;
                        }
                        if (~(4 & class159.field3040[class61.field1132][var2][var3]) != -1) {
                            var1 = class61.field1132;
                        }
                        if (~var11 <= -65537) {
                            if (~var4 < ~var3) {
                                ++var3;
                            } else if (~var3 < ~var4) {
                                --var3;
                            }
                            var11 -= 65536;
                            if ((class159.field3040[class61.field1132][var2][var3] & 4) != 0) {
                                var1 = class61.field1132;
                            }
                        }
                    }
                }
            }
            ++field1151;
            if (~(class159.field3040[class61.field1132][class4.field79.field3698 >> 7][class4.field79.field3679 >> 7] & 4) != -1) {
                var1 = class61.field1132;
            }
            return var1;
        }
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(Z)V")
    public static final void method388(boolean arg0) {
        class68.field1284.method1205(true);
        class162.field3094.method1205(true);
        ++field1156;
        class51.field895.method1205(!arg0);
        if (arg0) {
            field1167 = null;
        }
        class51.field922.method1205(true);
        class201.field3915.method1205(true);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V")
    public static final void method389(int arg0, int arg1) {
        ++field1155;
        class179.method1192((byte) 79);
        class99.method591((byte) -126);
        if (arg0 != 23708) {
            method388(false);
        }
        int var2 = class102.method595((byte) 53, arg1).field1739;
        if (var2 != 0) {
            int var3 = class6.field119[arg1];
            if (~var2 == -2) {
                if (var3 == 1) {
                    class12.method66(0.9F);
                }
                if (~var3 == -3) {
                    class12.method66(0.8F);
                }
                if (var3 == 3) {
                    class12.method66(0.7F);
                }
                if (var3 == 4) {
                    class12.method66(0.6F);
                }
                class202.method1318(true);
            }
            if (~var2 == -4) {
                short var4 = 0;
                if (var3 == 0) {
                    var4 = 255;
                }
                if (~var3 == -2) {
                    var4 = 192;
                }
                if (~var3 == -3) {
                    var4 = 128;
                }
                if (var3 == 3) {
                    var4 = 64;
                }
                if (var3 == 4) {
                    var4 = 0;
                }
                if (~class137.field2554 != ~var4) {
                    if (~class137.field2554 == -1 && ~class114.field2086 != 0) {
                        class65.method409(class201.field3923, 0, arg0 + -44509, false, var4, class114.field2086);
                        class8.field216 = false;
                    } else if (~var4 != -1) {
                        class145.method959(128, var4);
                    } else {
                        class61.method381(-104);
                        class8.field216 = false;
                    }
                    class137.field2554 = var4;
                }
            }
            if (~var2 == -6) {
                class112.field2054 = var3;
            }
            if (var2 == 4) {
                if (var3 == 0) {
                    class32.field676 = 127;
                }
                if (var3 == 1) {
                    class32.field676 = 96;
                }
                if (var3 == 2) {
                    class32.field676 = 64;
                }
                if (var3 == 3) {
                    class32.field676 = 32;
                }
                if (var3 == 4) {
                    class32.field676 = 0;
                }
            }
            if (~var2 == -10) {
                class67.field1253 = var3;
            }
            if (~var2 == -11) {
                if (var3 == 0) {
                    class20.field435 = 127;
                }
                if (var3 == 1) {
                    class20.field435 = 96;
                }
                if (~var3 == -3) {
                    class20.field435 = 64;
                }
                if (var3 == 3) {
                    class20.field435 = 32;
                }
                if (~var3 == -5) {
                    class20.field435 = 0;
                }
            }
            if (var2 == 6) {
                class55.field1010 = var3;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BI)[[I")
    public final int[][] method59(byte arg0, int arg1) {
        ++field1159;
        if (arg0 != -40) {
            field1167 = null;
        }
        int[][] var3 = super.field1195.method177(1193, arg1);
        if (super.field1195.field532) {
            int[][] var4 = this.method402(false, arg1, 0);
            int[][] var5 = this.method402(false, arg1, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            for (int var15 = 0; ~class147.field2715 < ~var15; ++var15) {
                var6[var15] = this.method392((byte) 106, var9[var15], var12[var15]);
                var7[var15] = this.method392((byte) 113, var10[var15], var13[var15]);
                var8[var15] = this.method392((byte) 105, var11[var15], var14[var15]);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "(I)V")
    public static void method390(int arg0) {
        field1167 = null;
        field1168 = null;
        field1165 = null;
        field1153 = null;
        field1164 = null;
        field1163 = null;
        if (arg0 != -1) {
            method390(-128);
        }
        field1166 = null;
        field1162 = null;
        field1161 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILwb;)V")
    public static final void method391(int arg0, int arg1, class200 arg2) {
        ++field1160;
        Object[] var3 = arg2.field3911;
        int var4 = (Integer) var3[0];
        class9 var5 = class128.method833(var4, (byte) 82);
        if (var5 != null) {
            class161.field3086 = 0;
            int var6 = 0;
            int var7 = 0;
            int[] var8 = var5.field240;
            int var9 = -1;
            int[] var10 = var5.field235;
            byte var11 = -1;
            try {
                class69.field1295 = new int[var5.field234];
                int var12 = 0;
                int var13 = 0;
                class6.field124 = new class169[var5.field233];
                if (arg0 == 4894) {
                    for (int var14 = 1; var3.length > var14; ++var14) {
                        if (var3[var14] instanceof Integer) {
                            int var15 = (Integer) var3[var14];
                            if (var15 == -2147483647) {
                                var15 = arg2.field3913;
                            }
                            if (var15 == -2147483646) {
                                var15 = arg2.field3904;
                            }
                            if (~var15 == 2147483644) {
                                var15 = arg2.field3907 == null ? -1 : arg2.field3907.field2878;
                            }
                            if (var15 == -2147483644) {
                                var15 = arg2.field3906;
                            }
                            if (var15 == -2147483643) {
                                var15 = arg2.field3907 != null ? arg2.field3907.field2850 : -1;
                            }
                            if (~var15 == 2147483641) {
                                var15 = arg2.field3909 == null ? -1 : arg2.field3909.field2878;
                            }
                            if (~var15 == 2147483640) {
                                var15 = arg2.field3909 == null ? -1 : arg2.field3909.field2850;
                            }
                            if (~var15 == 2147483639) {
                                var15 = arg2.field3908;
                            }
                            if (var15 == -2147483639) {
                                var15 = arg2.field3901;
                            }
                            class69.field1295[var13++] = var15;
                        } else if (var3[var14] instanceof class169) {
                            class169 var16 = (class169) var3[var14];
                            if (var16.method1121(class81.field1490, 98)) {
                                var16 = arg2.field3903;
                            }
                            class6.field124[var12++] = var16;
                        }
                    }
                    int var17 = 0;
                    label2171: while (true) {
                        ++var17;
                        if (var17 > arg1) {
                            throw new RuntimeException("slow");
                        }
                        ++var9;
                        int var309 = var8[var9];
                        if (~var309 > -101) {
                            if (var309 == 0) {
                                class144.field2683[var6++] = var10[var9];
                                continue;
                            }
                            if (var309 == 1) {
                                int var18 = var10[var9];
                                class144.field2683[var6++] = class6.field119[var18];
                                continue;
                            }
                            if (~var309 == -3) {
                                int var19 = var10[var9];
                                --var6;
                                class6.field119[var19] = class144.field2683[var6];
                                continue;
                            }
                            if (~var309 == -4) {
                                class203.field3975[var7++] = var5.field238[var9];
                                continue;
                            }
                            if (var309 == 6) {
                                var9 += var10[var9];
                                continue;
                            }
                            if (~var309 == -8) {
                                var6 -= 2;
                                if (~class144.field2683[var6 - -1] != ~class144.field2683[var6]) {
                                    var9 += var10[var9];
                                }
                                continue;
                            }
                            if (~var309 == -9) {
                                var6 -= 2;
                                if (~class144.field2683[var6 + 1] == ~class144.field2683[var6]) {
                                    var9 += var10[var9];
                                }
                                continue;
                            }
                            if (~var309 == -10) {
                                var6 -= 2;
                                if (class144.field2683[var6] < class144.field2683[var6 + 1]) {
                                    var9 += var10[var9];
                                }
                                continue;
                            }
                            if (var309 == 10) {
                                var6 -= 2;
                                if (~class144.field2683[var6] < ~class144.field2683[var6 + 1]) {
                                    var9 += var10[var9];
                                }
                                continue;
                            }
                            if (var309 == 21) {
                                if (class161.field3086 == 0) {
                                    return;
                                }
                                class32 var20 = class110.field2005[--class161.field3086];
                                class6.field124 = var20.field673;
                                var5 = var20.field680;
                                var9 = var20.field671;
                                var8 = var5.field240;
                                class69.field1295 = var20.field674;
                                var10 = var5.field235;
                                continue;
                            }
                            if (var309 == 25) {
                                int var21 = var10[var9];
                                class144.field2683[var6++] = class60.method374((byte) 13, var21);
                                continue;
                            }
                            int var10001;
                            if (var309 == 27) {
                                int var22 = var10[var9];
                                var10001 = arg0 + -4976;
                                --var6;
                                class197.method1294(var22, var10001, class144.field2683[var6]);
                                continue;
                            }
                            if (var309 == 31) {
                                var6 -= 2;
                                if (~class144.field2683[var6] >= ~class144.field2683[var6 + 1]) {
                                    var9 += var10[var9];
                                }
                                continue;
                            }
                            if (var309 == 32) {
                                var6 -= 2;
                                if (class144.field2683[var6 - -1] <= class144.field2683[var6]) {
                                    var9 += var10[var9];
                                }
                                continue;
                            }
                            if (~var309 == -34) {
                                class144.field2683[var6++] = class69.field1295[var10[var9]];
                                continue;
                            }
                            if (var309 == 34) {
                                var10001 = var10[var9];
                                --var6;
                                class69.field1295[var10001] = class144.field2683[var6];
                                continue;
                            }
                            if (~var309 == -36) {
                                class203.field3975[var7++] = class6.field124[var10[var9]];
                                continue;
                            }
                            if (var309 == 36) {
                                var10001 = var10[var9];
                                --var7;
                                class6.field124[var10001] = class203.field3975[var7];
                                continue;
                            }
                            if (var309 == 37) {
                                int var23 = var10[var9];
                                var7 -= var23;
                                class169 var24 = class154.method1009(0, var7, class203.field3975, var23);
                                class203.field3975[var7++] = var24;
                                continue;
                            }
                            if (var309 == 38) {
                                --var6;
                                continue;
                            }
                            if (var309 == 39) {
                                --var7;
                                continue;
                            }
                            if (~var309 == -41) {
                                int var25 = var10[var9];
                                class9 var26 = class128.method833(var25, (byte) 82);
                                int[] var27 = new int[var26.field234];
                                class169[] var28 = new class169[var26.field233];
                                for (int var29 = 0; var26.field237 > var29; ++var29) {
                                    var27[var29] = class144.field2683[-var26.field237 + var29 + var6];
                                }
                                for (int var30 = 0; var30 < var26.field232; ++var30) {
                                    var28[var30] = class203.field3975[var7 + var30 - var26.field232];
                                }
                                var7 -= var26.field232;
                                var6 -= var26.field237;
                                class32 var31 = new class32();
                                var31.field674 = class69.field1295;
                                var31.field673 = class6.field124;
                                var31.field671 = var9;
                                var9 = -1;
                                var31.field680 = var5;
                                var5 = var26;
                                class110.field2005[class161.field3086++] = var31;
                                var8 = var26.field240;
                                class6.field124 = var28;
                                class69.field1295 = var27;
                                var10 = var26.field235;
                                continue;
                            }
                            if (var309 == 42) {
                                class144.field2683[var6++] = field1167[var10[var9]];
                                continue;
                            }
                            if (~var309 == -44) {
                                var10001 = var10[var9];
                                --var6;
                                field1167[var10001] = class144.field2683[var6];
                                continue;
                            }
                            if (var309 == 44) {
                                int var32 = var10[var9] >> 16;
                                int var33 = var10[var9] & 65535;
                                --var6;
                                int var34 = class144.field2683[var6];
                                if (var34 >= 0 && var34 <= 5000) {
                                    byte var35 = -1;
                                    if (~var33 == -106) {
                                        var35 = 0;
                                    }
                                    class192.field3798[var32] = var34;
                                    int var36 = 0;
                                    while (true) {
                                        if (var36 >= var34) {
                                            continue label2171;
                                        }
                                        class116.field2140[var32][var36] = var35;
                                        ++var36;
                                    }
                                }
                                throw new RuntimeException();
                            }
                            if (~var309 == -46) {
                                int var37 = var10[var9];
                                --var6;
                                int var38 = class144.field2683[var6];
                                if (~var38 <= -1 && var38 < class192.field3798[var37]) {
                                    class144.field2683[var6++] = class116.field2140[var37][var38];
                                    continue;
                                }
                                throw new RuntimeException();
                            }
                            if (var309 == 46) {
                                var6 -= 2;
                                int var39 = class144.field2683[var6];
                                int var40 = var10[var9];
                                if (~var39 <= -1 && var39 < class192.field3798[var40]) {
                                    class116.field2140[var40][var39] = class144.field2683[var6 - -1];
                                    continue;
                                }
                                throw new RuntimeException();
                            }
                            if (~var309 == -48) {
                                class169 var41 = class58.field1084[var10[var9]];
                                if (var41 == null) {
                                    var41 = class42.field787;
                                }
                                class203.field3975[var7++] = var41;
                                continue;
                            }
                            if (~var309 == -49) {
                                var10001 = var10[var9];
                                --var7;
                                class58.field1084[var10001] = class203.field3975[var7];
                                continue;
                            }
                        }
                        boolean var42;
                        if (~var10[var9] != -2) {
                            var42 = false;
                        } else {
                            var42 = true;
                        }
                        if (~var309 <= -1001) {
                            if (var309 >= 1000 && ~var309 > -1101 || var309 >= 2000 && var309 < 2100) {
                                class150 var43;
                                if (var309 >= 2000) {
                                    var309 -= 1000;
                                    --var6;
                                    var43 = class62.method385((byte) 41, class144.field2683[var6]);
                                } else {
                                    var43 = var42 ? class73.field1353 : class31.field652;
                                }
                                if (~var309 == -1001) {
                                    var6 -= 2;
                                    var43.field2805 = class144.field2683[var6];
                                    var43.field2903 = class144.field2683[var6 + 1];
                                    class64.method404(93, var43);
                                    continue;
                                }
                                if (var309 == 1001) {
                                    var6 -= 2;
                                    var43.field2875 = class144.field2683[var6];
                                    var43.field2770 = class144.field2683[var6 + 1];
                                    class64.method404(104, var43);
                                    continue;
                                }
                                if (var309 == 1003) {
                                    --var6;
                                    boolean var44 = class144.field2683[var6] == 1;
                                    if (var44 == !var43.field2844) {
                                        var43.field2844 = var44;
                                        class64.method404(arg0 ^ 4978, var43);
                                    }
                                    continue;
                                }
                            } else if ((var309 < 1100 || var309 >= 1200) && (var309 < 2100 || var309 >= 2200)) {
                                if ((var309 < 1200 || ~var309 <= -1301) && (var309 < 2200 || var309 >= 2300)) {
                                    if ((~var309 > -1301 || ~var309 <= -1401) && (~var309 > -2301 || var309 >= 2400)) {
                                        if (var309 >= 1400 && var309 < 1500 || ~var309 <= -2401 && var309 < 2500) {
                                            class150 var278;
                                            if (~var309 > -2001) {
                                                var278 = var42 ? class73.field1353 : class31.field652;
                                            } else {
                                                --var6;
                                                var278 = class62.method385((byte) 41, class144.field2683[var6]);
                                                var309 -= 1000;
                                            }
                                            --var7;
                                            class169 var279 = class203.field3975[var7];
                                            int[] var280 = null;
                                            if (var279.method1134(0) > 0 && var279.method1128(255, var279.method1134(0) - 1) == 89) {
                                                --var6;
                                                int var281 = class144.field2683[var6];
                                                if (~var281 < -1) {
                                                    var280 = new int[var281];
                                                    while (~(var281--) < -1) {
                                                        --var6;
                                                        var280[var281] = class144.field2683[var6];
                                                    }
                                                }
                                                var279 = var279.method1132(0, 127, var279.method1134(arg0 ^ 4894) + -1);
                                            }
                                            Object[] var282 = new Object[1 + var279.method1134(0)];
                                            for (int var283 = var282.length + -1; ~var283 <= -2; --var283) {
                                                if (var279.method1128(255, var283 + -1) != 115) {
                                                    --var6;
                                                    var282[var283] = new Integer(class144.field2683[var6]);
                                                } else {
                                                    --var7;
                                                    var282[var283] = class203.field3975[var7];
                                                }
                                            }
                                            --var6;
                                            int var284 = class144.field2683[var6];
                                            if (var284 != -1) {
                                                var282[0] = new Integer(var284);
                                            } else {
                                                var282 = null;
                                            }
                                            if (var309 == 1409) {
                                                var278.field2786 = var282;
                                            }
                                            if (var309 == 1406) {
                                                var278.field2834 = var282;
                                            }
                                            if (~var309 == -1405) {
                                                var278.field2787 = var282;
                                            }
                                            if (var309 == 1421) {
                                                var278.field2840 = var282;
                                            }
                                            if (~var309 == -1403) {
                                                var278.field2895 = var282;
                                            }
                                            if (var309 == 1420) {
                                                var278.field2876 = var282;
                                            }
                                            if (var309 == 1425) {
                                                var278.field2839 = var282;
                                            }
                                            if (~var309 == -1401) {
                                                var278.field2867 = var282;
                                            }
                                            var278.field2818 = true;
                                            if (~var309 == -1413) {
                                                var278.field2894 = var282;
                                            }
                                            if (~var309 == -1406) {
                                                var278.field2804 = var282;
                                            }
                                            if (var309 == 1418) {
                                                var278.field2857 = var282;
                                            }
                                            if (~var309 == -1402) {
                                                var278.field2845 = var282;
                                            }
                                            if (var309 == 1414) {
                                                var278.field2797 = var282;
                                                var278.field2885 = var280;
                                            }
                                            if (~var309 == -1423) {
                                                var278.field2831 = var282;
                                            }
                                            if (~var309 == -1409) {
                                                var278.field2780 = var282;
                                            }
                                            if (var309 == 1411) {
                                                var278.field2853 = var282;
                                            }
                                            if (var309 == 1410) {
                                                var278.field2880 = var282;
                                            }
                                            if (var309 == 1416) {
                                                var278.field2793 = var282;
                                            }
                                            if (~var309 == -1420) {
                                                var278.field2799 = var282;
                                            }
                                            if (var309 == 1407) {
                                                var278.field2777 = var282;
                                                var278.field2861 = var280;
                                            }
                                            if (var309 == 1423) {
                                                var278.field2809 = var282;
                                            }
                                            if (var309 == 1424) {
                                                var278.field2869 = var282;
                                            }
                                            if (~var309 == -1404) {
                                                var278.field2785 = var282;
                                            }
                                            if (var309 == 1415) {
                                                var278.field2795 = var280;
                                                var278.field2823 = var282;
                                            }
                                            if (~var309 == -1418) {
                                                var278.field2881 = var282;
                                            }
                                            continue;
                                        }
                                        if (~var309 > -1601) {
                                            class150 var52 = !var42 ? class31.field652 : class73.field1353;
                                            if (var309 == 1500) {
                                                class144.field2683[var6++] = var52.field2805;
                                                continue;
                                            }
                                            if (var309 == 1501) {
                                                class144.field2683[var6++] = var52.field2903;
                                                continue;
                                            }
                                            if (~var309 == -1503) {
                                                class144.field2683[var6++] = var52.field2875;
                                                continue;
                                            }
                                            if (var309 == 1503) {
                                                class144.field2683[var6++] = var52.field2770;
                                                continue;
                                            }
                                            if (var309 == 1504) {
                                                class144.field2683[var6++] = !var52.field2844 ? 0 : 1;
                                                continue;
                                            }
                                            if (var309 == 1505) {
                                                class144.field2683[var6++] = var52.field2893;
                                                continue;
                                            }
                                        } else if (var309 >= 1700) {
                                            if (var309 >= 1800) {
                                                if (var309 >= 1900) {
                                                    if (var309 >= 2600) {
                                                        if (var309 >= 2700) {
                                                            if (var309 < 2800) {
                                                                if (var309 == 2700) {
                                                                    --var6;
                                                                    class150 var53 = class62.method385((byte) 41, class144.field2683[var6]);
                                                                    class144.field2683[var6++] = var53.field2901;
                                                                    continue;
                                                                }
                                                                if (~var309 == -2702) {
                                                                    --var6;
                                                                    class150 var54 = class62.method385((byte) 41, class144.field2683[var6]);
                                                                    if (var54.field2901 == -1) {
                                                                        class144.field2683[var6++] = 0;
                                                                    } else {
                                                                        class144.field2683[var6++] = var54.field2900;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var309 == -2703) {
                                                                    --var6;
                                                                    int var55 = class144.field2683[var6];
                                                                    class80 var56 = (class80) class202.field3948.method1045((long) var55, (byte) -77);
                                                                    if (var56 != null) {
                                                                        class144.field2683[var6++] = 1;
                                                                    } else {
                                                                        class144.field2683[var6++] = 0;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var309 == -2704) {
                                                                    --var6;
                                                                    class150 var57 = class62.method385((byte) 41, class144.field2683[var6]);
                                                                    if (var57.field2784 == null) {
                                                                        class144.field2683[var6++] = 0;
                                                                        continue;
                                                                    }
                                                                    int var58 = var57.field2784.length;
                                                                    for (int var59 = 0; var59 < var57.field2784.length; ++var59) {
                                                                        if (var57.field2784[var59] == null) {
                                                                            var58 = var59;
                                                                            break;
                                                                        }
                                                                    }
                                                                    class144.field2683[var6++] = var58;
                                                                    continue;
                                                                }
                                                                if (var309 == 2704 || ~var309 == -2706) {
                                                                    var6 -= 2;
                                                                    int var60 = class144.field2683[var6];
                                                                    int var61 = class144.field2683[var6 - -1];
                                                                    class80 var62 = (class80) class202.field3948.method1045((long) var60, (byte) -77);
                                                                    if (var62 != null && var62.field1475 == var61) {
                                                                        class144.field2683[var6++] = 1;
                                                                        continue;
                                                                    }
                                                                    class144.field2683[var6++] = 0;
                                                                    continue;
                                                                }
                                                            } else if (var309 < 2900) {
                                                                --var6;
                                                                class150 var63 = class62.method385((byte) 41, class144.field2683[var6]);
                                                                if (var309 == 2800) {
                                                                    class144.field2683[var6++] = class44.method278(130551, class70.method436(var63, -119));
                                                                    continue;
                                                                }
                                                                if (var309 == 2801) {
                                                                    --var6;
                                                                    int var64 = class144.field2683[var6];
                                                                    int var310 = var64 - 1;
                                                                    if (var63.field2897 != null && ~var63.field2897.length < ~var310 && var63.field2897[var310] != null) {
                                                                        class203.field3975[var7++] = var63.field2897[var310];
                                                                        continue;
                                                                    }
                                                                    class203.field3975[var7++] = class121.field2230;
                                                                    continue;
                                                                }
                                                                if (~var309 == -2803) {
                                                                    if (var63.field2891 != null) {
                                                                        class203.field3975[var7++] = var63.field2891;
                                                                    } else {
                                                                        class203.field3975[var7++] = class121.field2230;
                                                                    }
                                                                    continue;
                                                                }
                                                            } else if (~var309 <= -3201) {
                                                                if (var309 < 3300) {
                                                                    if (var309 == 3200) {
                                                                        var6 -= 3;
                                                                        class187.method1232(class144.field2683[var6 - -2], (byte) 67, class144.field2683[var6 + 1], class144.field2683[var6]);
                                                                        continue;
                                                                    }
                                                                    if (var309 == 3201) {
                                                                        --var6;
                                                                        class150.method985(true, class144.field2683[var6]);
                                                                        continue;
                                                                    }
                                                                    if (var309 == 3202) {
                                                                        var6 -= 2;
                                                                        class16.method92(class144.field2683[var6 - -1], class144.field2683[var6], arg0 + -20706);
                                                                        continue;
                                                                    }
                                                                } else if (var309 < 3400) {
                                                                    if (~var309 == -3301) {
                                                                        class144.field2683[var6++] = class162.field3107;
                                                                        continue;
                                                                    }
                                                                    if (var309 == 3301) {
                                                                        var6 -= 2;
                                                                        int var65 = class144.field2683[var6 + 1];
                                                                        int var66 = class144.field2683[var6];
                                                                        class144.field2683[var6++] = class99.method587(var66, arg0 + -25215, var65);
                                                                        continue;
                                                                    }
                                                                    if (~var309 == -3303) {
                                                                        var6 -= 2;
                                                                        int var67 = class144.field2683[var6 + 1];
                                                                        int var68 = class144.field2683[var6];
                                                                        class144.field2683[var6++] = class195.method1285(var68, var67, 64);
                                                                        continue;
                                                                    }
                                                                    if (var309 == 3303) {
                                                                        var6 -= 2;
                                                                        int var69 = class144.field2683[var6];
                                                                        int var70 = class144.field2683[var6 + 1];
                                                                        class144.field2683[var6++] = class118.method744(-94, var70, var69);
                                                                        continue;
                                                                    }
                                                                    if (~var309 == -3305) {
                                                                        --var6;
                                                                        int var71 = class144.field2683[var6];
                                                                        class144.field2683[var6++] = class163.method1046(0, var71).field1489;
                                                                        continue;
                                                                    }
                                                                    if (var309 == 3305) {
                                                                        --var6;
                                                                        int var72 = class144.field2683[var6];
                                                                        class144.field2683[var6++] = class167.field3195[var72];
                                                                        continue;
                                                                    }
                                                                    if (var309 == 3306) {
                                                                        --var6;
                                                                        int var73 = class144.field2683[var6];
                                                                        class144.field2683[var6++] = class89.field1618[var73];
                                                                        continue;
                                                                    }
                                                                    if (var309 == 3307) {
                                                                        --var6;
                                                                        int var74 = class144.field2683[var6];
                                                                        class144.field2683[var6++] = class128.field2397[var74];
                                                                        continue;
                                                                    }
                                                                    if (~var309 == -3309) {
                                                                        int var75 = (class4.field79.field3698 >> 7) + class179.field3489;
                                                                        int var76 = class61.field1132;
                                                                        int var77 = (class4.field79.field3679 >> 7) + class191.field3761;
                                                                        class144.field2683[var6++] = (var76 << 28) + (var75 << 14) + var77;
                                                                        continue;
                                                                    }
                                                                    if (~var309 == -3310) {
                                                                        --var6;
                                                                        int var78 = class144.field2683[var6];
                                                                        class144.field2683[var6++] = class150.method984(16383, var78 >> 14);
                                                                        continue;
                                                                    }
                                                                    if (var309 == 3310) {
                                                                        --var6;
                                                                        int var79 = class144.field2683[var6];
                                                                        class144.field2683[var6++] = var79 >> 28;
                                                                        continue;
                                                                    }
                                                                    if (~var309 == -3312) {
                                                                        --var6;
                                                                        int var80 = class144.field2683[var6];
                                                                        class144.field2683[var6++] = class150.method984(var80, 16383);
                                                                        continue;
                                                                    }
                                                                    if (var309 == 3312) {
                                                                        class144.field2683[var6++] = class175.field3398 ? 1 : 0;
                                                                        continue;
                                                                    }
                                                                    if (var309 == 3313) {
                                                                        var6 -= 2;
                                                                        int var81 = class144.field2683[var6] + 32768;
                                                                        int var82 = class144.field2683[var6 + 1];
                                                                        class144.field2683[var6++] = class99.method587(var81, -20321, var82);
                                                                        continue;
                                                                    }
                                                                    if (var309 == 3314) {
                                                                        var6 -= 2;
                                                                        int var83 = class144.field2683[var6] + 32768;
                                                                        int var84 = class144.field2683[var6 + 1];
                                                                        class144.field2683[var6++] = class195.method1285(var83, var84, 116);
                                                                        continue;
                                                                    }
                                                                    if (~var309 == -3316) {
                                                                        var6 -= 2;
                                                                        int var85 = class144.field2683[var6 - -1];
                                                                        int var86 = class144.field2683[var6] + 32768;
                                                                        class144.field2683[var6++] = class118.method744(class44.method277(arg0, -4966), var85, var86);
                                                                        continue;
                                                                    }
                                                                    if (var309 == 3316) {
                                                                        if (~class51.field900 > -3) {
                                                                            class144.field2683[var6++] = 0;
                                                                        } else {
                                                                            class144.field2683[var6++] = class51.field900;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var309 == -3318) {
                                                                        class144.field2683[var6++] = class105.field1933;
                                                                        continue;
                                                                    }
                                                                    if (var309 == 3318) {
                                                                        class144.field2683[var6++] = class80.field1482;
                                                                        continue;
                                                                    }
                                                                    if (~var309 == -3322) {
                                                                        class144.field2683[var6++] = class184.field3574;
                                                                        continue;
                                                                    }
                                                                    if (var309 == 3322) {
                                                                        class144.field2683[var6++] = class93.field1746;
                                                                        continue;
                                                                    }
                                                                    if (~var309 == -3324) {
                                                                        if (class51.field900 != 1) {
                                                                            class144.field2683[var6++] = 0;
                                                                        } else {
                                                                            class144.field2683[var6++] = 1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var309 == -3325) {
                                                                        if (~class184.field3578 <= -6 && ~class184.field3578 >= -10) {
                                                                            class144.field2683[var6++] = class184.field3578;
                                                                            continue;
                                                                        }
                                                                        class144.field2683[var6++] = 0;
                                                                        continue;
                                                                    }
                                                                    if (var309 == 3325) {
                                                                        if (class172.field3336 <= 0) {
                                                                            class144.field2683[var6++] = 0;
                                                                        } else {
                                                                            class144.field2683[var6++] = 1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                } else if (~var309 <= -3501) {
                                                                    if (~var309 <= -3701) {
                                                                        if (var309 < 4000) {
                                                                            if (var309 == 3903) {
                                                                                --var6;
                                                                                int var87 = class144.field2683[var6];
                                                                                class144.field2683[var6++] = class91.field1658[var87].method627(false);
                                                                                continue;
                                                                            }
                                                                            if (~var309 == -3905) {
                                                                                --var6;
                                                                                int var88 = class144.field2683[var6];
                                                                                class144.field2683[var6++] = class91.field1658[var88].field1958;
                                                                                continue;
                                                                            }
                                                                            if (var309 == 3905) {
                                                                                --var6;
                                                                                int var89 = class144.field2683[var6];
                                                                                class144.field2683[var6++] = class91.field1658[var89].field1951;
                                                                                continue;
                                                                            }
                                                                            if (~var309 == -3907) {
                                                                                --var6;
                                                                                int var90 = class144.field2683[var6];
                                                                                class144.field2683[var6++] = class91.field1658[var90].field1966;
                                                                                continue;
                                                                            }
                                                                            if (~var309 == -3908) {
                                                                                --var6;
                                                                                int var91 = class144.field2683[var6];
                                                                                class144.field2683[var6++] = class91.field1658[var91].field1963;
                                                                                continue;
                                                                            }
                                                                            if (~var309 == -3909) {
                                                                                --var6;
                                                                                int var92 = class144.field2683[var6];
                                                                                class144.field2683[var6++] = class91.field1658[var92].field1957;
                                                                                continue;
                                                                            }
                                                                            if (var309 == 3910) {
                                                                                --var6;
                                                                                int var93 = class144.field2683[var6];
                                                                                int var94 = class91.field1658[var93].method629(true);
                                                                                class144.field2683[var6++] = ~var94 == -1 ? 1 : 0;
                                                                                continue;
                                                                            }
                                                                            if (~var309 == -3912) {
                                                                                --var6;
                                                                                int var95 = class144.field2683[var6];
                                                                                int var96 = class91.field1658[var95].method629(true);
                                                                                class144.field2683[var6++] = var96 == 2 ? 1 : 0;
                                                                                continue;
                                                                            }
                                                                            if (var309 == 3912) {
                                                                                --var6;
                                                                                int var97 = class144.field2683[var6];
                                                                                int var98 = class91.field1658[var97].method629(true);
                                                                                class144.field2683[var6++] = var98 == 5 ? 1 : 0;
                                                                                continue;
                                                                            }
                                                                        } else if (~var309 <= -4101) {
                                                                            if (~var309 <= -4201) {
                                                                                if (~var309 <= -4301) {
                                                                                    if (~var309 > -5101) {
                                                                                        if (var309 == 5000) {
                                                                                            class144.field2683[var6++] = class42.field791;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var309 == -5002) {
                                                                                            var6 -= 3;
                                                                                            class42.field791 = class144.field2683[var6];
                                                                                            client.field579 = class144.field2683[var6 + 1];
                                                                                            class75.field1415 = class144.field2683[var6 - -2];
                                                                                            ++class64.field1191;
                                                                                            class141.field2621.method1024(168, (byte) -94);
                                                                                            class141.field2621.method821(class42.field791, 64);
                                                                                            class141.field2621.method821(client.field579, 64);
                                                                                            class141.field2621.method821(class75.field1415, 64);
                                                                                            continue;
                                                                                        }
                                                                                        if (var309 == 5002) {
                                                                                            ++class46.field850;
                                                                                            var6 -= 2;
                                                                                            int var99 = class144.field2683[var6];
                                                                                            --var7;
                                                                                            class169 var100 = class203.field3975[var7];
                                                                                            int var101 = class144.field2683[var6 + 1];
                                                                                            class141.field2621.method1024(22, (byte) -94);
                                                                                            class141.field2621.method816(var100.method1133(false), arg0 + -21595);
                                                                                            class141.field2621.method821(var99 + -1, 64);
                                                                                            class141.field2621.method821(var101, 64);
                                                                                            continue;
                                                                                        }
                                                                                        if (~var309 == -5004) {
                                                                                            class169 var102 = null;
                                                                                            --var6;
                                                                                            int var103 = class144.field2683[var6];
                                                                                            if (~var103 > -101) {
                                                                                                var102 = class9.field244[var103];
                                                                                            }
                                                                                            if (var102 == null) {
                                                                                                var102 = class121.field2230;
                                                                                            }
                                                                                            class203.field3975[var7++] = var102;
                                                                                            continue;
                                                                                        }
                                                                                        if (var309 == 5004) {
                                                                                            int var104 = -1;
                                                                                            --var6;
                                                                                            int var105 = class144.field2683[var6];
                                                                                            if (var105 < 100 && class9.field244[var105] != null) {
                                                                                                var104 = class48.field866[var105];
                                                                                            }
                                                                                            class144.field2683[var6++] = var104;
                                                                                            continue;
                                                                                        }
                                                                                        if (var309 == 5005) {
                                                                                            class144.field2683[var6++] = client.field579;
                                                                                            continue;
                                                                                        }
                                                                                        if (var309 == 5008) {
                                                                                            --var7;
                                                                                            class169 var106 = class203.field3975[var7];
                                                                                            if (var106.method1124(class68.field1276, arg0 + -4787)) {
                                                                                                class11.method63(var106, (byte) -34);
                                                                                            } else {
                                                                                                ++class141.field2610;
                                                                                                class169 var107 = var106.method1131((byte) -72);
                                                                                                byte var108 = 0;
                                                                                                if (!var107.method1124(class45.field840, arg0 + -4767)) {
                                                                                                    if (var107.method1124(class27.field561, 115)) {
                                                                                                        var108 = 1;
                                                                                                        var106 = var106.method1106(false, class27.field561.method1134(0));
                                                                                                    } else if (var107.method1124(class122.field2251, arg0 ^ 4969)) {
                                                                                                        var108 = 2;
                                                                                                        var106 = var106.method1106(false, class122.field2251.method1134(0));
                                                                                                    } else if (var107.method1124(class103.field1876, 104)) {
                                                                                                        var108 = 3;
                                                                                                        var106 = var106.method1106(false, class103.field1876.method1134(0));
                                                                                                    } else if (var107.method1124(class195.field3817, 107)) {
                                                                                                        var108 = 4;
                                                                                                        var106 = var106.method1106(false, class195.field3817.method1134(0));
                                                                                                    } else if (var107.method1124(class16.field337, arg0 ^ 4944)) {
                                                                                                        var108 = 5;
                                                                                                        var106 = var106.method1106(false, class16.field337.method1134(0));
                                                                                                    } else if (!var107.method1124(class13.field316, 51)) {
                                                                                                        if (!var107.method1124(class62.field1141, 74)) {
                                                                                                            if (var107.method1124(class54.field994, arg0 ^ 4932)) {
                                                                                                                var106 = var106.method1106(false, class54.field994.method1134(0));
                                                                                                                var108 = 8;
                                                                                                            } else if (var107.method1124(class165.field3162, 98)) {
                                                                                                                var106 = var106.method1106(false, class165.field3162.method1134(0));
                                                                                                                var108 = 9;
                                                                                                            } else if (var107.method1124(class67.field1250, 77)) {
                                                                                                                var106 = var106.method1106(false, class67.field1250.method1134(0));
                                                                                                                var108 = 10;
                                                                                                            } else if (!var107.method1124(class140.field2608, 48)) {
                                                                                                                if (~class154.field2976 != -1) {
                                                                                                                    if (var107.method1124(class45.field841, 61)) {
                                                                                                                        var106 = var106.method1106(false, class45.field841.method1134(0));
                                                                                                                        var108 = 0;
                                                                                                                    } else if (!var107.method1124(class27.field554, 79)) {
                                                                                                                        if (var107.method1124(class122.field2241, 67)) {
                                                                                                                            var108 = 2;
                                                                                                                            var106 = var106.method1106(false, class122.field2241.method1134(0));
                                                                                                                        } else if (var107.method1124(class103.field1891, 82)) {
                                                                                                                            var108 = 3;
                                                                                                                            var106 = var106.method1106(false, class103.field1891.method1134(0));
                                                                                                                        } else if (var107.method1124(class195.field3822, 91)) {
                                                                                                                            var106 = var106.method1106(false, class195.field3822.method1134(0));
                                                                                                                            var108 = 4;
                                                                                                                        } else if (!var107.method1124(class16.field335, arg0 + -4824)) {
                                                                                                                            if (var107.method1124(class13.field312, arg0 + -4790)) {
                                                                                                                                var106 = var106.method1106(false, class13.field312.method1134(0));
                                                                                                                                var108 = 6;
                                                                                                                            } else if (!var107.method1124(class62.field1146, 121)) {
                                                                                                                                if (!var107.method1124(class54.field995, 52)) {
                                                                                                                                    if (!var107.method1124(class165.field3164, 75)) {
                                                                                                                                        if (var107.method1124(class67.field1270, 89)) {
                                                                                                                                            var106 = var106.method1106(false, class67.field1270.method1134(0));
                                                                                                                                            var108 = 10;
                                                                                                                                        } else if (var107.method1124(class140.field2609, 96)) {
                                                                                                                                            var106 = var106.method1106(false, class140.field2609.method1134(arg0 + -4894));
                                                                                                                                            var108 = 11;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        var106 = var106.method1106(false, class165.field3164.method1134(0));
                                                                                                                                        var108 = 9;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    var108 = 8;
                                                                                                                                    var106 = var106.method1106(false, class54.field995.method1134(arg0 + -4894));
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                var106 = var106.method1106(false, class62.field1146.method1134(0));
                                                                                                                                var108 = 7;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var106 = var106.method1106(false, class16.field335.method1134(arg0 + -4894));
                                                                                                                            var108 = 5;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        var106 = var106.method1106(false, class27.field554.method1134(0));
                                                                                                                        var108 = 1;
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                var108 = 11;
                                                                                                                var106 = var106.method1106(false, class140.field2608.method1134(arg0 + -4894));
                                                                                                            }
                                                                                                        } else {
                                                                                                            var106 = var106.method1106(false, class62.field1141.method1134(0));
                                                                                                            var108 = 7;
                                                                                                        }
                                                                                                    } else {
                                                                                                        var108 = 6;
                                                                                                        var106 = var106.method1106(false, class13.field316.method1134(arg0 + -4894));
                                                                                                    }
                                                                                                } else {
                                                                                                    var106 = var106.method1106(false, class45.field840.method1134(arg0 ^ 4894));
                                                                                                    var108 = 0;
                                                                                                }
                                                                                                class169 var109 = var106.method1131((byte) -102);
                                                                                                byte var110 = 0;
                                                                                                if (!var109.method1124(class127.field2372, 85)) {
                                                                                                    if (var109.method1124(class111.field2026, 118)) {
                                                                                                        var110 = 2;
                                                                                                        var106 = var106.method1106(false, class111.field2026.method1134(0));
                                                                                                    } else if (var109.method1124(class93.field1738, 52)) {
                                                                                                        var110 = 3;
                                                                                                        var106 = var106.method1106(false, class93.field1738.method1134(arg0 ^ 4894));
                                                                                                    } else if (!var109.method1124(class143.field2665, 99)) {
                                                                                                        if (var109.method1124(class151.field2916, 113)) {
                                                                                                            var106 = var106.method1106(false, class151.field2916.method1134(0));
                                                                                                            var110 = 5;
                                                                                                        } else if (class154.field2976 != 0) {
                                                                                                            if (var109.method1124(class127.field2377, 113)) {
                                                                                                                var106 = var106.method1106(false, class127.field2377.method1134(0));
                                                                                                                var110 = 1;
                                                                                                            } else if (var109.method1124(class111.field2035, 70)) {
                                                                                                                var106 = var106.method1106(false, class111.field2035.method1134(0));
                                                                                                                var110 = 2;
                                                                                                            } else if (!var109.method1124(class93.field1743, arg0 ^ 4904)) {
                                                                                                                if (var109.method1124(class143.field2666, 65)) {
                                                                                                                    var106 = var106.method1106(false, class143.field2666.method1134(0));
                                                                                                                    var110 = 4;
                                                                                                                } else if (var109.method1124(class151.field2908, arg0 + -4791)) {
                                                                                                                    var110 = 5;
                                                                                                                    var106 = var106.method1106(false, class151.field2908.method1134(0));
                                                                                                                }
                                                                                                            } else {
                                                                                                                var106 = var106.method1106(false, class93.field1743.method1134(0));
                                                                                                                var110 = 3;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        var106 = var106.method1106(false, class143.field2665.method1134(0));
                                                                                                        var110 = 4;
                                                                                                    }
                                                                                                } else {
                                                                                                    var110 = 1;
                                                                                                    var106 = var106.method1106(false, class127.field2372.method1134(arg0 ^ 4894));
                                                                                                }
                                                                                                class141.field2621.method1024(4, (byte) -94);
                                                                                                class141.field2621.method821(0, 64);
                                                                                                int var111 = class141.field2621.field2346;
                                                                                                class141.field2621.method821(var108, 64);
                                                                                                class141.field2621.method821(var110, 64);
                                                                                                class10.method55(var106, 125, class141.field2621);
                                                                                                class141.field2621.method803(class141.field2621.field2346 - var111, 477567000);
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        if (var309 == 5009) {
                                                                                            ++class37.field731;
                                                                                            var7 -= 2;
                                                                                            class169 var112 = class203.field3975[var7];
                                                                                            class169 var113 = class203.field3975[var7 - -1];
                                                                                            class141.field2621.method1024(34, (byte) -94);
                                                                                            class141.field2621.method821(0, 64);
                                                                                            int var114 = class141.field2621.field2346;
                                                                                            class141.field2621.method816(var112.method1133(false), arg0 ^ -21027);
                                                                                            class10.method55(var113, -105, class141.field2621);
                                                                                            class141.field2621.method803(class141.field2621.field2346 - var114, 477567000);
                                                                                            continue;
                                                                                        }
                                                                                        if (var309 == 5010) {
                                                                                            --var6;
                                                                                            int var115 = class144.field2683[var6];
                                                                                            class169 var116 = null;
                                                                                            if (~var115 > -101) {
                                                                                                var116 = class123.field2266[var115];
                                                                                            }
                                                                                            if (var116 == null) {
                                                                                                var116 = class121.field2230;
                                                                                            }
                                                                                            class203.field3975[var7++] = var116;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var309 == -5012) {
                                                                                            --var6;
                                                                                            int var117 = class144.field2683[var6];
                                                                                            class169 var118 = null;
                                                                                            if (var117 < 100) {
                                                                                                var118 = class189.field3691[var117];
                                                                                            }
                                                                                            if (var118 == null) {
                                                                                                var118 = class121.field2230;
                                                                                            }
                                                                                            class203.field3975[var7++] = var118;
                                                                                            continue;
                                                                                        }
                                                                                        if (var309 == 5015) {
                                                                                            class169 var119;
                                                                                            if (class4.field79 != null && class4.field79.field3856 != null) {
                                                                                                var119 = class4.field79.field3856;
                                                                                            } else {
                                                                                                var119 = class43.field807;
                                                                                            }
                                                                                            class203.field3975[var7++] = var119;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var309 == -5017) {
                                                                                            class144.field2683[var6++] = class75.field1415;
                                                                                            continue;
                                                                                        }
                                                                                        if (var309 == 5017) {
                                                                                            class144.field2683[var6++] = class155.field2981;
                                                                                            continue;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    if (var309 == 4200) {
                                                                                        --var6;
                                                                                        int var120 = class144.field2683[var6];
                                                                                        class203.field3975[var7++] = class180.method1196(var120, 0).field1383;
                                                                                        continue;
                                                                                    }
                                                                                    if (var309 == 4201) {
                                                                                        var6 -= 2;
                                                                                        int var121 = class144.field2683[var6];
                                                                                        int var122 = class144.field2683[var6 + 1];
                                                                                        class73 var123 = class180.method1196(var121, arg0 + -4894);
                                                                                        if (var122 >= 1 && ~var122 >= -6 && var123.field1333[var122 + -1] != null) {
                                                                                            class203.field3975[var7++] = var123.field1333[var122 + -1];
                                                                                            continue;
                                                                                        }
                                                                                        class203.field3975[var7++] = class121.field2230;
                                                                                        continue;
                                                                                    }
                                                                                    if (var309 == 4202) {
                                                                                        var6 -= 2;
                                                                                        int var124 = class144.field2683[var6];
                                                                                        int var125 = class144.field2683[var6 + 1];
                                                                                        class73 var126 = class180.method1196(var124, 0);
                                                                                        if (~var125 <= -2 && ~var125 >= -6 && var126.field1367[var125 + -1] != null) {
                                                                                            class203.field3975[var7++] = var126.field1367[var125 + -1];
                                                                                            continue;
                                                                                        }
                                                                                        class203.field3975[var7++] = class121.field2230;
                                                                                        continue;
                                                                                    }
                                                                                    if (var309 == 4203) {
                                                                                        --var6;
                                                                                        int var127 = class144.field2683[var6];
                                                                                        class144.field2683[var6++] = class180.method1196(var127, 0).field1363;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var309 == -4205) {
                                                                                        --var6;
                                                                                        int var128 = class144.field2683[var6];
                                                                                        class144.field2683[var6++] = ~class180.method1196(var128, arg0 + -4894).field1364 == -2 ? 1 : 0;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var309 == -4206) {
                                                                                        --var6;
                                                                                        int var129 = class144.field2683[var6];
                                                                                        class73 var130 = class180.method1196(var129, arg0 + -4894);
                                                                                        if (var130.field1374 == -1 && ~var130.field1341 <= -1) {
                                                                                            class144.field2683[var6++] = var130.field1341;
                                                                                            continue;
                                                                                        }
                                                                                        class144.field2683[var6++] = var129;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var309 == -4207) {
                                                                                        --var6;
                                                                                        int var131 = class144.field2683[var6];
                                                                                        class73 var132 = class180.method1196(var131, arg0 + -4894);
                                                                                        if (var132.field1374 >= 0 && var132.field1341 >= 0) {
                                                                                            class144.field2683[var6++] = var132.field1341;
                                                                                            continue;
                                                                                        }
                                                                                        class144.field2683[var6++] = var131;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var309 == -4208) {
                                                                                        --var6;
                                                                                        int var133 = class144.field2683[var6];
                                                                                        class144.field2683[var6++] = class180.method1196(var133, arg0 + -4894).field1347 ? 1 : 0;
                                                                                        continue;
                                                                                    }
                                                                                    if (var309 == 4210) {
                                                                                        --var7;
                                                                                        class169 var134 = class203.field3975[var7];
                                                                                        --var6;
                                                                                        int var135 = class144.field2683[var6];
                                                                                        class107.method630(65, ~var135 == -2, var134);
                                                                                        class144.field2683[var6++] = class20.field434;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var309 == -4212) {
                                                                                        if (class80.field1481 != null && class20.field434 > class15.field322) {
                                                                                            class144.field2683[var6++] = class150.method984(class80.field1481[class15.field322++], 65535);
                                                                                            continue;
                                                                                        }
                                                                                        class144.field2683[var6++] = -1;
                                                                                        continue;
                                                                                    }
                                                                                    if (var309 == 4212) {
                                                                                        class15.field322 = 0;
                                                                                        continue;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                if (var309 == 4100) {
                                                                                    --var6;
                                                                                    int var136 = class144.field2683[var6];
                                                                                    --var7;
                                                                                    class169 var137 = class203.field3975[var7];
                                                                                    class203.field3975[var7++] = class165.method1058(0, new class169[] { var137, class2.method18((byte) -62, var136) });
                                                                                    continue;
                                                                                }
                                                                                if (~var309 == -4102) {
                                                                                    var7 -= 2;
                                                                                    class169 var138 = class203.field3975[var7];
                                                                                    class169 var139 = class203.field3975[var7 + 1];
                                                                                    class203.field3975[var7++] = class165.method1058(class44.method277(arg0, 4894), new class169[] { var138, var139 });
                                                                                    continue;
                                                                                }
                                                                                if (var309 == 4102) {
                                                                                    --var7;
                                                                                    class169 var140 = class203.field3975[var7];
                                                                                    --var6;
                                                                                    int var141 = class144.field2683[var6];
                                                                                    class203.field3975[var7++] = class165.method1058(0, new class169[] { var140, class122.method758(-27907, var141, true) });
                                                                                    continue;
                                                                                }
                                                                                if (var309 == 4103) {
                                                                                    --var7;
                                                                                    class169 var142 = class203.field3975[var7];
                                                                                    class203.field3975[var7++] = var142.method1131((byte) -122);
                                                                                    continue;
                                                                                }
                                                                                if (~var309 == -4105) {
                                                                                    --var6;
                                                                                    int var143 = class144.field2683[var6];
                                                                                    long var144 = ((long) var143 - -11745L) * 86400000L;
                                                                                    class148.field2733.setTime(new Date(var144));
                                                                                    int var146 = class148.field2733.get(5);
                                                                                    int var147 = class148.field2733.get(2);
                                                                                    int var148 = class148.field2733.get(1);
                                                                                    class203.field3975[var7++] = class165.method1058(0, new class169[] { class2.method18((byte) -62, var146), class82.field1516, class110.field2001[var147], class82.field1516, class2.method18((byte) -62, var148) });
                                                                                    continue;
                                                                                }
                                                                                if (var309 == 4105) {
                                                                                    var7 -= 2;
                                                                                    class169 var149 = class203.field3975[var7];
                                                                                    class169 var150 = class203.field3975[var7 + 1];
                                                                                    if (class4.field79.field3846 != null && class4.field79.field3846.field8) {
                                                                                        class203.field3975[var7++] = var150;
                                                                                        continue;
                                                                                    }
                                                                                    class203.field3975[var7++] = var149;
                                                                                    continue;
                                                                                }
                                                                                if (~var309 == -4107) {
                                                                                    --var6;
                                                                                    int var151 = class144.field2683[var6];
                                                                                    class203.field3975[var7++] = class2.method18((byte) -62, var151);
                                                                                    continue;
                                                                                }
                                                                                if (var309 == 4107) {
                                                                                    var7 -= 2;
                                                                                    class144.field2683[var6++] = class203.field3975[var7].method1136((byte) 13, class203.field3975[var7 + 1]);
                                                                                    continue;
                                                                                }
                                                                                if (~var309 == -4109) {
                                                                                    --var7;
                                                                                    class169 var152 = class203.field3975[var7];
                                                                                    var6 -= 2;
                                                                                    int var153 = class144.field2683[var6];
                                                                                    int var154 = class144.field2683[var6 + 1];
                                                                                    byte[] var155 = class29.field602.method552(0, var154, arg0 ^ 4894);
                                                                                    class71 var156 = new class71(var155);
                                                                                    class144.field2683[var6++] = var156.method738(var152, var153);
                                                                                    continue;
                                                                                }
                                                                                if (~var309 == -4110) {
                                                                                    --var7;
                                                                                    class169 var157 = class203.field3975[var7];
                                                                                    var6 -= 2;
                                                                                    int var158 = class144.field2683[var6];
                                                                                    int var159 = class144.field2683[var6 - -1];
                                                                                    byte[] var160 = class29.field602.method552(0, var159, arg0 ^ 4894);
                                                                                    class71 var161 = new class71(var160);
                                                                                    class144.field2683[var6++] = var161.method725(var157, var158);
                                                                                    continue;
                                                                                }
                                                                                if (var309 == 4110) {
                                                                                    var7 -= 2;
                                                                                    class169 var162 = class203.field3975[var7];
                                                                                    class169 var163 = class203.field3975[var7 + 1];
                                                                                    --var6;
                                                                                    if (~class144.field2683[var6] != -2) {
                                                                                        class203.field3975[var7++] = var163;
                                                                                    } else {
                                                                                        class203.field3975[var7++] = var162;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (~var309 == -4112) {
                                                                                    --var7;
                                                                                    class169 var164 = class203.field3975[var7];
                                                                                    class203.field3975[var7++] = class117.method739(var164);
                                                                                    continue;
                                                                                }
                                                                                if (var309 == 4112) {
                                                                                    --var7;
                                                                                    class169 var165 = class203.field3975[var7];
                                                                                    --var6;
                                                                                    int var166 = class144.field2683[var6];
                                                                                    class203.field3975[var7++] = var165.method1137(var166, (byte) 64);
                                                                                    continue;
                                                                                }
                                                                                if (~var309 == -4114) {
                                                                                    --var6;
                                                                                    int var167 = class144.field2683[var6];
                                                                                    class144.field2683[var6++] = !class181.method1203(-160, var167) ? 0 : 1;
                                                                                    continue;
                                                                                }
                                                                                if (~var309 == -4115) {
                                                                                    --var6;
                                                                                    int var168 = class144.field2683[var6];
                                                                                    class144.field2683[var6++] = !class175.method1168(true, var168) ? 0 : 1;
                                                                                    continue;
                                                                                }
                                                                                if (var309 == 4115) {
                                                                                    --var6;
                                                                                    int var169 = class144.field2683[var6];
                                                                                    class144.field2683[var6++] = !class31.method220(1933798992, var169) ? 0 : 1;
                                                                                    continue;
                                                                                }
                                                                                if (~var309 == -4117) {
                                                                                    --var6;
                                                                                    int var170 = class144.field2683[var6];
                                                                                    class144.field2683[var6++] = class160.method1028(var170, 119) ? 1 : 0;
                                                                                    continue;
                                                                                }
                                                                                if (var309 == 4117) {
                                                                                    --var7;
                                                                                    class169 var171 = class203.field3975[var7];
                                                                                    if (var171 == null) {
                                                                                        class144.field2683[var6++] = 0;
                                                                                    } else {
                                                                                        class144.field2683[var6++] = var171.method1134(0);
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (~var309 == -4119) {
                                                                                    var6 -= 2;
                                                                                    int var172 = class144.field2683[var6];
                                                                                    --var7;
                                                                                    class169 var173 = class203.field3975[var7];
                                                                                    int var174 = class144.field2683[var6 + 1];
                                                                                    class203.field3975[var7++] = var173.method1132(var172, 106, var174);
                                                                                    continue;
                                                                                }
                                                                                if (~var309 == -4120) {
                                                                                    --var7;
                                                                                    class169 var175 = class203.field3975[var7];
                                                                                    class169 var176 = class103.method604((byte) 123, var175.method1134(0));
                                                                                    boolean var177 = false;
                                                                                    for (int var178 = 0; var178 < var175.method1134(0); ++var178) {
                                                                                        int var179 = var175.method1128(255, var178);
                                                                                        if (var179 != 60) {
                                                                                            if (var179 != 62) {
                                                                                                if (!var177) {
                                                                                                    var176.method1140(125, var179);
                                                                                                }
                                                                                            } else {
                                                                                                var177 = false;
                                                                                            }
                                                                                        } else {
                                                                                            var177 = true;
                                                                                        }
                                                                                    }
                                                                                    var176.method1119((byte) 97);
                                                                                    class203.field3975[var7++] = var176;
                                                                                    continue;
                                                                                }
                                                                                if (~var309 == -4121) {
                                                                                    var6 -= 2;
                                                                                    --var7;
                                                                                    class169 var180 = class203.field3975[var7];
                                                                                    int var181 = class144.field2683[var6];
                                                                                    int var182 = class144.field2683[var6 + 1];
                                                                                    class144.field2683[var6++] = var180.method1111(var181, arg0 + 19743, var182);
                                                                                    continue;
                                                                                }
                                                                                if (var309 == 4121) {
                                                                                    var7 -= 2;
                                                                                    class169 var183 = class203.field3975[var7];
                                                                                    class169 var184 = class203.field3975[var7 + 1];
                                                                                    --var6;
                                                                                    int var185 = class144.field2683[var6];
                                                                                    class144.field2683[var6++] = var183.method1139((byte) 118, var185, var184);
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (~var309 == -4001) {
                                                                                var6 -= 2;
                                                                                int var186 = class144.field2683[var6];
                                                                                int var187 = class144.field2683[var6 + 1];
                                                                                class144.field2683[var6++] = var186 + var187;
                                                                                continue;
                                                                            }
                                                                            if (var309 == 4001) {
                                                                                var6 -= 2;
                                                                                int var188 = class144.field2683[var6];
                                                                                int var189 = class144.field2683[var6 + 1];
                                                                                class144.field2683[var6++] = -var189 + var188;
                                                                                continue;
                                                                            }
                                                                            if (var309 == 4002) {
                                                                                var6 -= 2;
                                                                                int var190 = class144.field2683[var6];
                                                                                int var191 = class144.field2683[var6 + 1];
                                                                                class144.field2683[var6++] = var190 * var191;
                                                                                continue;
                                                                            }
                                                                            if (~var309 == -4004) {
                                                                                var6 -= 2;
                                                                                int var192 = class144.field2683[var6 - -1];
                                                                                int var193 = class144.field2683[var6];
                                                                                class144.field2683[var6++] = var193 / var192;
                                                                                continue;
                                                                            }
                                                                            if (var309 == 4004) {
                                                                                --var6;
                                                                                int var194 = class144.field2683[var6];
                                                                                class144.field2683[var6++] = (int) (Math.random() * (double) var194);
                                                                                continue;
                                                                            }
                                                                            if (~var309 == -4006) {
                                                                                --var6;
                                                                                int var195 = class144.field2683[var6];
                                                                                class144.field2683[var6++] = (int) (Math.random() * (double) (var195 + 1));
                                                                                continue;
                                                                            }
                                                                            if (~var309 == -4007) {
                                                                                var6 -= 5;
                                                                                int var196 = class144.field2683[var6 - -3];
                                                                                int var197 = class144.field2683[var6 + 2];
                                                                                int var198 = class144.field2683[var6];
                                                                                int var199 = class144.field2683[var6 - -1];
                                                                                int var200 = class144.field2683[var6 + 4];
                                                                                class144.field2683[var6++] = (var199 - var198) * (-var197 + var200) / (var196 - var197) + var198;
                                                                                continue;
                                                                            }
                                                                            if (var309 == 4007) {
                                                                                var6 -= 2;
                                                                                int var201 = class144.field2683[var6];
                                                                                int var202 = class144.field2683[var6 + 1];
                                                                                class144.field2683[var6++] = var201 * var202 / 100 + var201;
                                                                                continue;
                                                                            }
                                                                            if (~var309 == -4009) {
                                                                                var6 -= 2;
                                                                                int var203 = class144.field2683[var6];
                                                                                int var204 = class144.field2683[var6 + 1];
                                                                                class144.field2683[var6++] = class10.method56(1 << var204, var203);
                                                                                continue;
                                                                            }
                                                                            if (var309 == 4009) {
                                                                                var6 -= 2;
                                                                                int var205 = class144.field2683[var6];
                                                                                int var206 = class144.field2683[var6 + 1];
                                                                                class144.field2683[var6++] = class150.method984(var205, -(1 << var206) + -1);
                                                                                continue;
                                                                            }
                                                                            if (~var309 == -4011) {
                                                                                var6 -= 2;
                                                                                int var207 = class144.field2683[var6];
                                                                                int var208 = class144.field2683[var6 + 1];
                                                                                class144.field2683[var6++] = class150.method984(1 << var208, var207) == 0 ? 0 : 1;
                                                                                continue;
                                                                            }
                                                                            if (~var309 == -4012) {
                                                                                var6 -= 2;
                                                                                int var209 = class144.field2683[var6];
                                                                                int var210 = class144.field2683[var6 + 1];
                                                                                class144.field2683[var6++] = var209 % var210;
                                                                                continue;
                                                                            }
                                                                            if (~var309 == -4013) {
                                                                                var6 -= 2;
                                                                                int var211 = class144.field2683[var6];
                                                                                int var212 = class144.field2683[var6 - -1];
                                                                                if (~var211 == -1) {
                                                                                    class144.field2683[var6++] = 0;
                                                                                } else {
                                                                                    class144.field2683[var6++] = (int) Math.pow((double) var211, (double) var212);
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (var309 == 4013) {
                                                                                var6 -= 2;
                                                                                int var213 = class144.field2683[var6 + 1];
                                                                                int var214 = class144.field2683[var6];
                                                                                if (var214 != 0) {
                                                                                    if (var213 == 0) {
                                                                                        class144.field2683[var6++] = Integer.MAX_VALUE;
                                                                                    } else {
                                                                                        class144.field2683[var6++] = (int) Math.pow((double) var214, 1.0D / (double) var213);
                                                                                    }
                                                                                } else {
                                                                                    class144.field2683[var6++] = 0;
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (var309 == 4014) {
                                                                                var6 -= 2;
                                                                                int var215 = class144.field2683[var6];
                                                                                int var216 = class144.field2683[var6 + 1];
                                                                                class144.field2683[var6++] = class150.method984(var216, var215);
                                                                                continue;
                                                                            }
                                                                            if (~var309 == -4016) {
                                                                                var6 -= 2;
                                                                                int var217 = class144.field2683[var6];
                                                                                int var218 = class144.field2683[var6 - -1];
                                                                                class144.field2683[var6++] = class10.method56(var218, var217);
                                                                                continue;
                                                                            }
                                                                            if (var309 == 4016) {
                                                                                var6 -= 2;
                                                                                int var219 = class144.field2683[var6];
                                                                                int var220 = class144.field2683[var6 + 1];
                                                                                class144.field2683[var6++] = var220 <= var219 ? var220 : var219;
                                                                                continue;
                                                                            }
                                                                            if (var309 == 4017) {
                                                                                var6 -= 2;
                                                                                int var221 = class144.field2683[var6];
                                                                                int var222 = class144.field2683[var6 + 1];
                                                                                class144.field2683[var6++] = var222 >= var221 ? var222 : var221;
                                                                                continue;
                                                                            }
                                                                            if (var309 == 4018) {
                                                                                var6 -= 3;
                                                                                long var223 = (long) class144.field2683[var6];
                                                                                long var225 = (long) class144.field2683[var6 + 2];
                                                                                long var227 = (long) class144.field2683[var6 + 1];
                                                                                class144.field2683[var6++] = (int) (var223 * var225 / var227);
                                                                                continue;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (var309 == 3600) {
                                                                            if (~class44.field827 == -1) {
                                                                                class144.field2683[var6++] = -2;
                                                                            } else if (~class44.field827 != -2) {
                                                                                class144.field2683[var6++] = class57.field1064;
                                                                            } else {
                                                                                class144.field2683[var6++] = -1;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var309 == 3601) {
                                                                            --var6;
                                                                            int var229 = class144.field2683[var6];
                                                                            if (~class44.field827 == -3 && var229 < class57.field1064) {
                                                                                class203.field3975[var7++] = class137.field2553[var229];
                                                                                continue;
                                                                            }
                                                                            class203.field3975[var7++] = class121.field2230;
                                                                            continue;
                                                                        }
                                                                        if (~var309 == -3603) {
                                                                            --var6;
                                                                            int var230 = class144.field2683[var6];
                                                                            if (~class44.field827 == -3 && ~class57.field1064 < ~var230) {
                                                                                class144.field2683[var6++] = class11.field273[var230];
                                                                                continue;
                                                                            }
                                                                            class144.field2683[var6++] = 0;
                                                                            continue;
                                                                        }
                                                                        if (var309 == 3603) {
                                                                            --var6;
                                                                            int var231 = class144.field2683[var6];
                                                                            if (class44.field827 == 2 && ~var231 > ~class57.field1064) {
                                                                                class144.field2683[var6++] = class192.field3801[var231];
                                                                                continue;
                                                                            }
                                                                            class144.field2683[var6++] = 0;
                                                                            continue;
                                                                        }
                                                                        if (var309 == 3604) {
                                                                            --var7;
                                                                            class169 var232 = class203.field3975[var7];
                                                                            --var6;
                                                                            int var233 = class144.field2683[var6];
                                                                            class66.method418(var232, var233, true);
                                                                            continue;
                                                                        }
                                                                        if (~var309 == -3606) {
                                                                            --var7;
                                                                            class169 var234 = class203.field3975[var7];
                                                                            class60.method377(var234.method1133(false), false);
                                                                            continue;
                                                                        }
                                                                        if (var309 == 3606) {
                                                                            --var7;
                                                                            class169 var235 = class203.field3975[var7];
                                                                            class121.method752(var235.method1133(false), 1);
                                                                            continue;
                                                                        }
                                                                        if (~var309 == -3608) {
                                                                            --var7;
                                                                            class169 var236 = class203.field3975[var7];
                                                                            class1.method8(arg0 ^ 4894, var236.method1133(false));
                                                                            continue;
                                                                        }
                                                                        if (~var309 == -3609) {
                                                                            --var7;
                                                                            class169 var237 = class203.field3975[var7];
                                                                            class16.method91(var237.method1133(false), 0);
                                                                            continue;
                                                                        }
                                                                        if (var309 == 3609) {
                                                                            --var7;
                                                                            class169 var238 = class203.field3975[var7];
                                                                            if (var238.method1124(class102.field1869, 93) || var238.method1124(class8.field224, arg0 + -4825)) {
                                                                                var238 = var238.method1106(false, 7);
                                                                            }
                                                                            class144.field2683[var6++] = !client.method204(-1569, var238) ? 0 : 1;
                                                                            continue;
                                                                        }
                                                                        if (var309 == 3611) {
                                                                            if (class110.field2007 != null) {
                                                                                class203.field3975[var7++] = class110.field2007.method1127((byte) -128);
                                                                            } else {
                                                                                class203.field3975[var7++] = class121.field2230;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var309 == 3612) {
                                                                            if (class110.field2007 == null) {
                                                                                class144.field2683[var6++] = 0;
                                                                            } else {
                                                                                class144.field2683[var6++] = class21.field444;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var309 == 3613) {
                                                                            --var6;
                                                                            int var239 = class144.field2683[var6];
                                                                            if (class110.field2007 != null && ~var239 > ~class21.field444) {
                                                                                class203.field3975[var7++] = class35.field696[var239].field1306.method1127((byte) -52);
                                                                                continue;
                                                                            }
                                                                            class203.field3975[var7++] = class121.field2230;
                                                                            continue;
                                                                        }
                                                                        if (~var309 == -3615) {
                                                                            --var6;
                                                                            int var240 = class144.field2683[var6];
                                                                            if (class110.field2007 != null && var240 < class21.field444) {
                                                                                class144.field2683[var6++] = class35.field696[var240].field1309;
                                                                                continue;
                                                                            }
                                                                            class144.field2683[var6++] = 0;
                                                                            continue;
                                                                        }
                                                                        if (~var309 == -3616) {
                                                                            --var6;
                                                                            int var241 = class144.field2683[var6];
                                                                            if (class110.field2007 != null && ~var241 > ~class21.field444) {
                                                                                class144.field2683[var6++] = class35.field696[var241].field1316;
                                                                                continue;
                                                                            }
                                                                            class144.field2683[var6++] = 0;
                                                                            continue;
                                                                        }
                                                                        if (var309 == 3616) {
                                                                            class144.field2683[var6++] = class121.field2226;
                                                                            continue;
                                                                        }
                                                                        if (~var309 == -3618) {
                                                                            --var7;
                                                                            class169 var242 = class203.field3975[var7];
                                                                            class171.method1144((byte) -82, var242);
                                                                            continue;
                                                                        }
                                                                        if (var309 == 3618) {
                                                                            class144.field2683[var6++] = class202.field3954;
                                                                            continue;
                                                                        }
                                                                        if (~var309 == -3620) {
                                                                            --var7;
                                                                            class169 var243 = class203.field3975[var7];
                                                                            class191.method1254(var243.method1133(false), arg0 ^ -4958);
                                                                            continue;
                                                                        }
                                                                        if (var309 == 3620) {
                                                                            class7.method40(arg0 ^ 5021);
                                                                            continue;
                                                                        }
                                                                        if (~var309 == -3622) {
                                                                            if (~class44.field827 != -1) {
                                                                                class144.field2683[var6++] = class206.field4052;
                                                                            } else {
                                                                                class144.field2683[var6++] = -1;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (~var309 == -3623) {
                                                                            --var6;
                                                                            int var244 = class144.field2683[var6];
                                                                            if (~class44.field827 != -1 && ~var244 > ~class206.field4052) {
                                                                                class203.field3975[var7++] = class123.method762(104, class82.field1513[var244]).method1127((byte) -128);
                                                                                continue;
                                                                            }
                                                                            class203.field3975[var7++] = class121.field2230;
                                                                            continue;
                                                                        }
                                                                        if (var309 == 3623) {
                                                                            --var7;
                                                                            class169 var245 = class203.field3975[var7];
                                                                            if (var245.method1124(class102.field1869, 76) || var245.method1124(class8.field224, 61)) {
                                                                                var245 = var245.method1106(false, 7);
                                                                            }
                                                                            class144.field2683[var6++] = class106.method622(-94, var245) ? 1 : 0;
                                                                            continue;
                                                                        }
                                                                        if (~var309 == -3625) {
                                                                            --var6;
                                                                            int var246 = class144.field2683[var6];
                                                                            if (class35.field696 != null && class21.field444 > var246 && class35.field696[var246].field1306.method1110(class4.field79.field3856, arg0 + -4824)) {
                                                                                class144.field2683[var6++] = 1;
                                                                                continue;
                                                                            }
                                                                            class144.field2683[var6++] = 0;
                                                                            continue;
                                                                        }
                                                                        if (var309 == 3625) {
                                                                            if (class112.field2042 == null) {
                                                                                class203.field3975[var7++] = class121.field2230;
                                                                            } else {
                                                                                class203.field3975[var7++] = class112.field2042.method1127((byte) -128);
                                                                            }
                                                                            continue;
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (var309 == 3400) {
                                                                        var6 -= 2;
                                                                        int var247 = class144.field2683[var6 + 1];
                                                                        int var248 = class144.field2683[var6];
                                                                        class190 var249 = class19.method139(8, var248);
                                                                        for (int var250 = 0; ~var250 > ~var249.field3741; ++var250) {
                                                                            if (var249.field3746[var250] == var247) {
                                                                                class203.field3975[var7++] = var249.field3745[var250];
                                                                                var249 = null;
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (var249 != null) {
                                                                            class203.field3975[var7++] = var249.field3748;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var309 == 3408) {
                                                                        var6 -= 4;
                                                                        int var251 = class144.field2683[var6 + 1];
                                                                        int var252 = class144.field2683[var6 + 2];
                                                                        int var253 = class144.field2683[var6];
                                                                        int var254 = class144.field2683[var6 + 3];
                                                                        class190 var255 = class19.method139(8, var252);
                                                                        if (var255.field3744 == var253 && var255.field3743 == var251) {
                                                                            for (int var256 = 0; ~var256 > ~var255.field3741; ++var256) {
                                                                                if (~var255.field3746[var256] == ~var254) {
                                                                                    if (~var251 != -116) {
                                                                                        class144.field2683[var6++] = var255.field3749[var256];
                                                                                    } else {
                                                                                        class203.field3975[var7++] = var255.field3745[var256];
                                                                                    }
                                                                                    var255 = null;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            if (var255 != null) {
                                                                                if (var251 != 115) {
                                                                                    class144.field2683[var6++] = var255.field3747;
                                                                                } else {
                                                                                    class203.field3975[var7++] = var255.field3748;
                                                                                }
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var251 == 115) {
                                                                            class203.field3975[var7++] = class42.field787;
                                                                        } else {
                                                                            class144.field2683[var6++] = 0;
                                                                        }
                                                                        continue;
                                                                    }
                                                                }
                                                            } else {
                                                                if (var309 == 3100) {
                                                                    --var7;
                                                                    class169 var257 = class203.field3975[var7];
                                                                    class199.method1307((byte) 122, class121.field2230, var257, 0);
                                                                    continue;
                                                                }
                                                                if (var309 == 3101) {
                                                                    var6 -= 2;
                                                                    class66.method416(class144.field2683[var6], class4.field79, class144.field2683[var6 + 1], (byte) 75);
                                                                    continue;
                                                                }
                                                                if (var309 == 3103) {
                                                                    class154.method1005((byte) -109);
                                                                    continue;
                                                                }
                                                                if (var309 == 3104) {
                                                                    ++class21.field454;
                                                                    int var258 = 0;
                                                                    --var7;
                                                                    class169 var259 = class203.field3975[var7];
                                                                    if (var259.method1104(-10)) {
                                                                        var258 = var259.method1123(false);
                                                                    }
                                                                    class141.field2621.method1024(173, (byte) -94);
                                                                    class141.field2621.method802((byte) 64, var258);
                                                                    continue;
                                                                }
                                                                if (~var309 == -3106) {
                                                                    ++class28.field573;
                                                                    --var7;
                                                                    class169 var260 = class203.field3975[var7];
                                                                    class141.field2621.method1024(148, (byte) -94);
                                                                    class141.field2621.method816(var260.method1133(false), -16701);
                                                                    continue;
                                                                }
                                                                if (~var309 == -3107) {
                                                                    ++class103.field1888;
                                                                    --var7;
                                                                    class169 var261 = class203.field3975[var7];
                                                                    class141.field2621.method1024(53, (byte) -94);
                                                                    class141.field2621.method821(1 + var261.method1134(0), 64);
                                                                    class141.field2621.method799(var261, (byte) 0);
                                                                    continue;
                                                                }
                                                                if (~var309 == -3108) {
                                                                    --var7;
                                                                    class169 var262 = class203.field3975[var7];
                                                                    --var6;
                                                                    int var263 = class144.field2683[var6];
                                                                    class115.method706(true, var262, var263);
                                                                    continue;
                                                                }
                                                                if (~var309 == -3109) {
                                                                    var6 -= 3;
                                                                    int var264 = class144.field2683[var6];
                                                                    int var265 = class144.field2683[var6 + 2];
                                                                    int var266 = class144.field2683[var6 + 1];
                                                                    class150 var267 = class62.method385((byte) 41, var265);
                                                                    class131.method858(var266, var264, var267, (byte) -104);
                                                                    continue;
                                                                }
                                                                if (var309 == 3109) {
                                                                    var6 -= 2;
                                                                    int var268 = class144.field2683[var6];
                                                                    class150 var269 = !var42 ? class31.field652 : class73.field1353;
                                                                    int var270 = class144.field2683[var6 - -1];
                                                                    class131.method858(var270, var268, var269, (byte) -104);
                                                                    continue;
                                                                }
                                                                if (~var309 == -3111) {
                                                                    ++class202.field3936;
                                                                    --var6;
                                                                    int var271 = class144.field2683[var6];
                                                                    class141.field2621.method1024(47, (byte) -94);
                                                                    class141.field2621.method801(var271, (byte) 87);
                                                                    continue;
                                                                }
                                                            }
                                                        } else {
                                                            --var6;
                                                            class150 var272 = class62.method385((byte) 41, class144.field2683[var6]);
                                                            if (~var309 == -2601) {
                                                                class144.field2683[var6++] = var272.field2860;
                                                                continue;
                                                            }
                                                            if (var309 == 2601) {
                                                                class144.field2683[var6++] = var272.field2811;
                                                                continue;
                                                            }
                                                            if (~var309 == -2603) {
                                                                class203.field3975[var7++] = var272.field2832;
                                                                continue;
                                                            }
                                                            if (~var309 == -2604) {
                                                                class144.field2683[var6++] = var272.field2810;
                                                                continue;
                                                            }
                                                            if (var309 == 2604) {
                                                                class144.field2683[var6++] = var272.field2837;
                                                                continue;
                                                            }
                                                            if (var309 == 2605) {
                                                                class144.field2683[var6++] = var272.field2904;
                                                                continue;
                                                            }
                                                            if (~var309 == -2607) {
                                                                class144.field2683[var6++] = var272.field2888;
                                                                continue;
                                                            }
                                                            if (~var309 == -2608) {
                                                                class144.field2683[var6++] = var272.field2833;
                                                                continue;
                                                            }
                                                            if (~var309 == -2609) {
                                                                class144.field2683[var6++] = var272.field2863;
                                                                continue;
                                                            }
                                                            if (var309 == 2609) {
                                                                class144.field2683[var6++] = var272.field2902;
                                                                continue;
                                                            }
                                                        }
                                                    } else {
                                                        --var6;
                                                        class150 var273 = class62.method385((byte) 41, class144.field2683[var6]);
                                                        if (var309 == 2500) {
                                                            class144.field2683[var6++] = var273.field2805;
                                                            continue;
                                                        }
                                                        if (~var309 == -2502) {
                                                            class144.field2683[var6++] = var273.field2903;
                                                            continue;
                                                        }
                                                        if (~var309 == -2503) {
                                                            class144.field2683[var6++] = var273.field2875;
                                                            continue;
                                                        }
                                                        if (~var309 == -2504) {
                                                            class144.field2683[var6++] = var273.field2770;
                                                            continue;
                                                        }
                                                        if (var309 == 2504) {
                                                            class144.field2683[var6++] = var273.field2844 ? 1 : 0;
                                                            continue;
                                                        }
                                                        if (var309 == 2505) {
                                                            class144.field2683[var6++] = var273.field2893;
                                                            continue;
                                                        }
                                                    }
                                                } else {
                                                    class150 var274 = var42 ? class73.field1353 : class31.field652;
                                                    if (~var309 == -1801) {
                                                        class144.field2683[var6++] = class44.method278(class44.method277(arg0, 126697), class70.method436(var274, 86));
                                                        continue;
                                                    }
                                                    if (~var309 == -1802) {
                                                        --var6;
                                                        int var275 = class144.field2683[var6];
                                                        int var311 = var275 - 1;
                                                        if (var274.field2897 != null && ~var274.field2897.length < ~var311 && var274.field2897[var311] != null) {
                                                            class203.field3975[var7++] = var274.field2897[var311];
                                                            continue;
                                                        }
                                                        class203.field3975[var7++] = class121.field2230;
                                                        continue;
                                                    }
                                                    if (var309 == 1802) {
                                                        if (var274.field2891 != null) {
                                                            class203.field3975[var7++] = var274.field2891;
                                                        } else {
                                                            class203.field3975[var7++] = class121.field2230;
                                                        }
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                class150 var276 = var42 ? class73.field1353 : class31.field652;
                                                if (~var309 == -1701) {
                                                    class144.field2683[var6++] = var276.field2901;
                                                    continue;
                                                }
                                                if (~var309 == -1702) {
                                                    if (~var276.field2901 != 0) {
                                                        class144.field2683[var6++] = var276.field2900;
                                                    } else {
                                                        class144.field2683[var6++] = 0;
                                                    }
                                                    continue;
                                                }
                                                if (~var309 == -1703) {
                                                    class144.field2683[var6++] = var276.field2850;
                                                    continue;
                                                }
                                            }
                                        } else {
                                            class150 var277 = !var42 ? class31.field652 : class73.field1353;
                                            if (~var309 == -1601) {
                                                class144.field2683[var6++] = var277.field2860;
                                                continue;
                                            }
                                            if (var309 == 1601) {
                                                class144.field2683[var6++] = var277.field2811;
                                                continue;
                                            }
                                            if (var309 == 1602) {
                                                class203.field3975[var7++] = var277.field2832;
                                                continue;
                                            }
                                            if (~var309 == -1604) {
                                                class144.field2683[var6++] = var277.field2810;
                                                continue;
                                            }
                                            if (~var309 == -1605) {
                                                class144.field2683[var6++] = var277.field2837;
                                                continue;
                                            }
                                            if (~var309 == -1606) {
                                                class144.field2683[var6++] = var277.field2904;
                                                continue;
                                            }
                                            if (~var309 == -1607) {
                                                class144.field2683[var6++] = var277.field2888;
                                                continue;
                                            }
                                            if (~var309 == -1608) {
                                                class144.field2683[var6++] = var277.field2833;
                                                continue;
                                            }
                                            if (~var309 == -1609) {
                                                class144.field2683[var6++] = var277.field2863;
                                                continue;
                                            }
                                            if (~var309 == -1610) {
                                                class144.field2683[var6++] = var277.field2902;
                                                continue;
                                            }
                                        }
                                    } else {
                                        class150 var48;
                                        if (~var309 <= -2001) {
                                            --var6;
                                            var48 = class62.method385((byte) 41, class144.field2683[var6]);
                                            var309 -= 1000;
                                        } else {
                                            var48 = var42 ? class73.field1353 : class31.field652;
                                        }
                                        if (var309 == 1300) {
                                            --var6;
                                            int var49 = -1 + class144.field2683[var6];
                                            if (~var49 <= -1 && ~var49 >= -10) {
                                                --var7;
                                                var48.method986(class203.field3975[var7], var49, -1);
                                                continue;
                                            }
                                            --var7;
                                            continue;
                                        }
                                        if (var309 == 1301) {
                                            var6 -= 2;
                                            int var50 = class144.field2683[var6];
                                            int var51 = class144.field2683[var6 + 1];
                                            var48.field2788 = class121.method755(var50, arg0 ^ -1865, var51);
                                            continue;
                                        }
                                        if (var309 == 1302) {
                                            --var6;
                                            var48.field2864 = class144.field2683[var6] == 1;
                                            continue;
                                        }
                                        if (var309 == 1303) {
                                            --var6;
                                            var48.field2819 = class144.field2683[var6];
                                            continue;
                                        }
                                        if (var309 == 1304) {
                                            --var6;
                                            var48.field2814 = class144.field2683[var6];
                                            continue;
                                        }
                                        if (var309 == 1305) {
                                            --var7;
                                            var48.field2891 = class203.field3975[var7];
                                            continue;
                                        }
                                        if (~var309 == -1307) {
                                            --var7;
                                            var48.field2848 = class203.field3975[var7];
                                            continue;
                                        }
                                        if (~var309 == -1308) {
                                            var48.field2897 = null;
                                            continue;
                                        }
                                    }
                                } else {
                                    class150 var285;
                                    if (var309 < 2000) {
                                        var285 = !var42 ? class31.field652 : class73.field1353;
                                    } else {
                                        --var6;
                                        var285 = class62.method385((byte) 41, class144.field2683[var6]);
                                        var309 -= 1000;
                                    }
                                    class64.method404(125, var285);
                                    if (var309 == 1200) {
                                        var6 -= 2;
                                        int var286 = class144.field2683[var6 + 1];
                                        int var287 = class144.field2683[var6];
                                        var285.field2901 = var287;
                                        var285.field2900 = var286;
                                        class73 var288 = class180.method1196(var287, 0);
                                        var285.field2820 = var288.field1344;
                                        var285.field2888 = var288.field1356;
                                        var285.field2833 = var288.field1386;
                                        var285.field2904 = var288.field1376;
                                        if (var285.field2875 > 0) {
                                            var285.field2904 = var285.field2904 * 32 / var285.field2875;
                                        }
                                        var285.field2863 = var288.field1348;
                                        var285.field2796 = var288.field1338;
                                        continue;
                                    }
                                    if (~var309 == -1202) {
                                        var285.field2808 = 2;
                                        --var6;
                                        var285.field2803 = class144.field2683[var6];
                                        continue;
                                    }
                                    if (var309 == 1202) {
                                        var285.field2808 = 3;
                                        var285.field2803 = class4.field79.field3846.method2(67);
                                        continue;
                                    }
                                    if (~var309 == -1204) {
                                        var285.field2808 = 6;
                                        --var6;
                                        var285.field2803 = class144.field2683[var6];
                                        continue;
                                    }
                                    if (var309 == 1204) {
                                        var285.field2808 = 5;
                                        --var6;
                                        var285.field2803 = class144.field2683[var6];
                                        continue;
                                    }
                                }
                            } else {
                                class150 var45;
                                if (~var309 <= -2001) {
                                    --var6;
                                    var45 = class62.method385((byte) 41, class144.field2683[var6]);
                                    var309 -= 1000;
                                } else {
                                    var45 = !var42 ? class31.field652 : class73.field1353;
                                }
                                if (~var309 == -1101) {
                                    var6 -= 2;
                                    var45.field2860 = class144.field2683[var6];
                                    if (-var45.field2875 + var45.field2810 < var45.field2860) {
                                        var45.field2860 = -var45.field2875 + var45.field2810;
                                    }
                                    if (~var45.field2860 > -1) {
                                        var45.field2860 = 0;
                                    }
                                    var45.field2811 = class144.field2683[var6 + 1];
                                    if (~(-var45.field2770 + var45.field2837) > ~var45.field2811) {
                                        var45.field2811 = -var45.field2770 + var45.field2837;
                                    }
                                    if (~var45.field2811 > -1) {
                                        var45.field2811 = 0;
                                    }
                                    class64.method404(121, var45);
                                    continue;
                                }
                                if (var309 == 1101) {
                                    --var6;
                                    var45.field2847 = class144.field2683[var6];
                                    class64.method404(107, var45);
                                    continue;
                                }
                                if (var309 == 1102) {
                                    --var6;
                                    var45.field2843 = class144.field2683[var6] == 1;
                                    class64.method404(92, var45);
                                    continue;
                                }
                                if (var309 == 1103) {
                                    --var6;
                                    var45.field2902 = class144.field2683[var6];
                                    class64.method404(96, var45);
                                    continue;
                                }
                                if (~var309 == -1105) {
                                    --var6;
                                    var45.field2815 = class144.field2683[var6];
                                    class64.method404(arg0 + -4780, var45);
                                    continue;
                                }
                                if (var309 == 1105) {
                                    --var6;
                                    var45.field2856 = class144.field2683[var6];
                                    class64.method404(98, var45);
                                    continue;
                                }
                                if (var309 == 1106) {
                                    --var6;
                                    var45.field2883 = class144.field2683[var6];
                                    class64.method404(110, var45);
                                    continue;
                                }
                                if (~var309 == -1108) {
                                    --var6;
                                    var45.field2854 = ~class144.field2683[var6] == -2;
                                    class64.method404(arg0 ^ 4991, var45);
                                    continue;
                                }
                                if (~var309 == -1109) {
                                    var45.field2808 = 1;
                                    --var6;
                                    var45.field2803 = class144.field2683[var6];
                                    class64.method404(121, var45);
                                    continue;
                                }
                                if (var309 == 1109) {
                                    var6 -= 6;
                                    var45.field2820 = class144.field2683[var6];
                                    var45.field2796 = class144.field2683[var6 + 1];
                                    var45.field2888 = class144.field2683[var6 + 2];
                                    var45.field2863 = class144.field2683[var6 - -3];
                                    var45.field2833 = class144.field2683[var6 - -4];
                                    var45.field2904 = class144.field2683[var6 - -5];
                                    class64.method404(119, var45);
                                    continue;
                                }
                                if (var309 == 1110) {
                                    --var6;
                                    int var46 = class144.field2683[var6];
                                    if (~var45.field2836 != ~var46) {
                                        var45.field2836 = var46;
                                        var45.field2846 = 0;
                                        var45.field2874 = 0;
                                        class64.method404(105, var45);
                                    }
                                    continue;
                                }
                                if (~var309 == -1112) {
                                    --var6;
                                    var45.field2866 = ~class144.field2683[var6] == -2;
                                    class64.method404(arg0 + -4774, var45);
                                    continue;
                                }
                                if (~var309 == -1113) {
                                    --var7;
                                    class169 var47 = class203.field3975[var7];
                                    if (!var47.method1121(var45.field2832, 105)) {
                                        var45.field2832 = var47;
                                        class64.method404(114, var45);
                                    }
                                    continue;
                                }
                                if (~var309 == -1114) {
                                    --var6;
                                    var45.field2773 = class144.field2683[var6];
                                    class64.method404(arg0 + -4779, var45);
                                    continue;
                                }
                                if (~var309 == -1115) {
                                    var6 -= 3;
                                    var45.field2865 = class144.field2683[var6];
                                    var45.field2822 = class144.field2683[var6 - -1];
                                    var45.field2871 = class144.field2683[var6 + 2];
                                    class64.method404(arg0 ^ 4979, var45);
                                    continue;
                                }
                                if (~var309 == -1116) {
                                    --var6;
                                    var45.field2772 = ~class144.field2683[var6] == -2;
                                    class64.method404(120, var45);
                                    continue;
                                }
                                if (~var309 == -1117) {
                                    --var6;
                                    var45.field2813 = class144.field2683[var6];
                                    class64.method404(arg0 + -4796, var45);
                                    continue;
                                }
                                if (~var309 == -1118) {
                                    --var6;
                                    var45.field2791 = class144.field2683[var6];
                                    class64.method404(97, var45);
                                    continue;
                                }
                                if (~var309 == -1119) {
                                    --var6;
                                    var45.field2898 = ~class144.field2683[var6] == -2;
                                    class64.method404(arg0 ^ 4977, var45);
                                    continue;
                                }
                                if (~var309 == -1120) {
                                    --var6;
                                    var45.field2771 = class144.field2683[var6] == 1;
                                    class64.method404(arg0 + -4801, var45);
                                    continue;
                                }
                                if (~var309 == -1121) {
                                    var6 -= 2;
                                    var45.field2810 = class144.field2683[var6];
                                    var45.field2837 = class144.field2683[var6 - -1];
                                    class64.method404(120, var45);
                                    continue;
                                }
                            }
                        } else {
                            if (var309 == 100) {
                                var6 -= 3;
                                int var289 = class144.field2683[var6 + 2];
                                int var290 = class144.field2683[var6 + 1];
                                int var291 = class144.field2683[var6];
                                if (~var290 == -1) {
                                    throw new RuntimeException();
                                }
                                class150 var292 = class62.method385((byte) 41, var291);
                                if (var292.field2784 == null) {
                                    var292.field2784 = new class150[var289 + 1];
                                }
                                if (~var289 <= ~var292.field2784.length) {
                                    class150[] var293 = new class150[var289 + 1];
                                    for (int var294 = 0; var292.field2784.length > var294; ++var294) {
                                        var293[var294] = var292.field2784[var294];
                                    }
                                    var292.field2784 = var293;
                                }
                                if (~var289 < -1 && var292.field2784[var289 - 1] == null) {
                                    throw new RuntimeException("Gap at:" + (var289 - 1));
                                }
                                class150 var295 = new class150();
                                var295.field2778 = true;
                                var295.field2850 = var289;
                                var295.field2893 = var295.field2878 = var292.field2878;
                                var295.field2882 = var290;
                                var292.field2784[var289] = var295;
                                if (!var42) {
                                    class31.field652 = var295;
                                } else {
                                    class73.field1353 = var295;
                                }
                                class64.method404(arg0 ^ 4970, var292);
                                continue;
                            }
                            if (var309 == 101) {
                                class150 var296 = var42 ? class73.field1353 : class31.field652;
                                if (~var296.field2850 == 0) {
                                    if (!var42) {
                                        throw new RuntimeException("Tried to cc_delete static active-component!");
                                    }
                                    throw new RuntimeException("Tried to .cc_delete static .active-component!");
                                }
                                class150 var297 = class62.method385((byte) 41, var296.field2878);
                                var297.field2784[var296.field2850] = null;
                                class64.method404(105, var297);
                                continue;
                            }
                            if (~var309 == -103) {
                                --var6;
                                class150 var298 = class62.method385((byte) 41, class144.field2683[var6]);
                                var298.field2784 = null;
                                class64.method404(122, var298);
                                continue;
                            }
                            if (var309 == 200) {
                                var6 -= 2;
                                int var299 = class144.field2683[var6 - -1];
                                int var300 = class144.field2683[var6];
                                class150 var301 = class121.method755(var300, arg0 + -10101, var299);
                                if (var301 != null && ~var299 != 0) {
                                    class144.field2683[var6++] = 1;
                                    if (var42) {
                                        class73.field1353 = var301;
                                    } else {
                                        class31.field652 = var301;
                                    }
                                    continue;
                                }
                                class144.field2683[var6++] = 0;
                                continue;
                            }
                            if (~var309 == -202) {
                                --var6;
                                int var302 = class144.field2683[var6];
                                class150 var303 = class62.method385((byte) 41, var302);
                                if (var303 != null) {
                                    class144.field2683[var6++] = 1;
                                    if (!var42) {
                                        class31.field652 = var303;
                                    } else {
                                        class73.field1353 = var303;
                                    }
                                } else {
                                    class144.field2683[var6++] = 0;
                                }
                                continue;
                            }
                        }
                        throw new IllegalStateException();
                    }
                }
            } catch (Exception var308) {
                if (var5.field239 != null) {
                    class169 var305 = class103.method604((byte) 23, 30);
                    var305.method1105(class190.field3739, true).method1105(var5.field239, true);
                    for (int var306 = class161.field3086 + -1; ~var306 <= -1; --var306) {
                        var305.method1105(class176.field3450, true).method1105(class110.field2005[var306].field680.field239, true);
                    }
                    if (~var11 == -41) {
                        int var307 = var10[var9];
                        var305.method1105(class29.field603, true).method1105(class2.method18((byte) -62, var307), true);
                    }
                    if (class20.field439 != 0) {
                        class199.method1307((byte) 119, class121.field2230, class165.method1058(arg0 ^ 4894, new class169[] { class167.field3213, var5.field239 }), 0);
                    }
                    class21.method142(-113, "CS2 - scr:" + var5.field3543 + " op:" + var11 + new String(var305.method1108((byte) -118)), var308);
                } else {
                    if (~class20.field439 != -1) {
                        class199.method1307((byte) 119, class121.field2230, class68.field1273, 0);
                    }
                    class21.method142(arg0 ^ -4938, "CS2 - scr:" + var5.field3543 + " op:" + var11, var308);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BII)I")
    private final int method392(byte arg0, int arg1, int arg2) {
        ++field1157;
        int var4 = this.field1152;
        if (~var4 != -2) {
            if (var4 != 2) {
                if (~var4 != -4) {
                    if (var4 != 4) {
                        if (~var4 != -6) {
                            if (var4 != 6) {
                                if (var4 != 7) {
                                    if (var4 != 8) {
                                        if (var4 != 9) {
                                            if (~var4 != -11) {
                                                if (var4 != 11) {
                                                    if (~var4 == -13) {
                                                        return arg1 + arg2 + -(arg1 * arg2 >> 11);
                                                    } else {
                                                        if (arg0 < 90) {
                                                            field1163 = null;
                                                        }
                                                        return arg1;
                                                    }
                                                } else {
                                                    return ~arg1 >= ~arg2 ? -arg1 + arg2 : -arg2 + arg1;
                                                }
                                            } else {
                                                return arg1 <= arg2 ? arg2 : arg1;
                                            }
                                        } else {
                                            return arg1 >= arg2 ? arg2 : arg1;
                                        }
                                    } else {
                                        return ~arg1 != -1 ? 4096 - (-arg2 + 4096 << 12) / arg1 : 0;
                                    }
                                } else {
                                    return arg1 != 4096 ? (arg2 << 12) / (-arg1 + 4096) : 4096;
                                }
                            } else {
                                return arg2 >= 2048 ? 4096 - ((-arg1 + 4096) * (-arg2 + 4096) >> 11) : arg1 * arg2 >> 11;
                            }
                        } else {
                            return -((4096 - arg1) * (-arg2 + 4096) >> 12) + 4096;
                        }
                    } else {
                        return arg2 != 0 ? (arg1 << 12) / arg2 : 4096;
                    }
                } else {
                    return arg1 * arg2 >> 12;
                }
            } else {
                return arg1 - arg2;
            }
        } else {
            return arg1 + arg2;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        ++field1154;
        if (arg1 != 19) {
            return null;
        } else {
            int[] var3 = super.field1192.method19((byte) 124, arg0);
            if (super.field1192.field75) {
                int[] var4 = this.method394(20331, 0, arg0);
                int[] var5 = this.method394(arg1 ^ 20344, 1, arg0);
                for (int var6 = 0; ~var6 > ~class147.field2715; ++var6) {
                    var3[var6] = this.method392((byte) 103, var4[var6], var5[var6]);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
    public class63() {
        super(2, false);
    }
}
