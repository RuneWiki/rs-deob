import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class207 extends class179 {

    @OriginalMember(owner = "client!lm", name = "Q", descriptor = "I")
    private int field3737 = 4096;

    @OriginalMember(owner = "client!lm", name = "V", descriptor = "I")
    private int field3742 = 409;

    @OriginalMember(owner = "client!lm", name = "cb", descriptor = "[I")
    private int[] field3749 = new int[3];

    @OriginalMember(owner = "client!lm", name = "X", descriptor = "I")
    private int field3744 = 4096;

    @OriginalMember(owner = "client!lm", name = "T", descriptor = "I")
    private int field3740 = 4096;

    @OriginalMember(owner = "client!lm", name = "Z", descriptor = "Lij;")
    public static class175 field3746 = new class175();

    @OriginalMember(owner = "client!lm", name = "eb", descriptor = "[I")
    public static int[] field3751 = new int[256];

    @OriginalMember(owner = "client!lm", name = "R", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!lm", name = "S", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!lm", name = "U", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!lm", name = "W", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!lm", name = "Y", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!lm", name = "ab", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!lm", name = "bb", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!lm", name = "db", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)[[I", line = 7)
    public final int[][] method55(int arg0, int arg1) {
        field3741++;
        if (arg0 != 75) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field3169.method463(arg1, arg0 ^ 0x4A);
        if (this.field3169.field1080) {
            int[][] var4 = this.method1314(arg1, 158, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class161.field2858; var11++) {
                int var12 = var5[var11];
                int var13 = var12 - this.field3749[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > this.field3742) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field3749[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 > this.field3742) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field3749[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field3742 >= var17) {
                            var8[var11] = this.field3737 * var12 >> 12;
                            var9[var11] = this.field3740 * var14 >> 12;
                            var10[var11] = this.field3744 * var16 >> 12;
                        } else {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V", line = 107)
    public class207() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "(I)V", line = 118)
    public static final void method1462(int arg0) {
        if (arg0 > -31) {
            field3746 = (class175) null;
        }
        class237.field4046++;
        field3739++;
        class308.field5322.method1599(88, (byte) -107);
        class308.field5322.method366(class168.field2991, -99);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZILng;)Lrd;", line = 131)
    public static final class135 method1463(boolean arg0, int arg1, class138 arg2) {
        field3748++;
        if (class278.method1954(arg1, arg2, 14)) {
            if (!arg0) {
                field3746 = (class175) null;
            }
            return class247.method1669(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILog;)V", line = 146)
    public static final void method1464(int arg0, class279 arg1) {
        if (arg0 > -114) {
            return;
        }
        field3745++;
        for (class187 var2 = (class187) class186.field3272.method1270((byte) -121); var2 != null; var2 = (class187) class186.field3272.method1277(1)) {
            if (var2.field3293 == arg1) {
                if (var2.field3276 != null) {
                    class197.field3603.method2237(var2.field3276);
                    var2.field3276 = null;
                }
                var2.method1199(21966);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIII)I", line = 187)
    public static final int method1465(int arg0, int arg1, int arg2, int arg3) {
        field3743++;
        if (arg1 == arg2) {
            return arg1;
        }
        int var4 = 128 - arg0;
        int var5 = ((arg1 & 0xFF00FF00) >>> 7) * var4 + ((arg2 >>> 7 & 0x1FE01FE) * arg0) & 0xFF00FF00;
        int var6 = (arg1 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00;
        int var7 = 109 % ((arg3 + 27) / 46);
        return (var6 >> 7) + var5;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V", line = 210)
    public static void method1466(byte arg0) {
        field3751 = null;
        field3746 = null;
        if (arg0 != 19) {
            method1464(21, (class279) null);
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)V", line = 239)
    public static final void method1467(byte arg0) {
        field3738++;
        if (arg0 < 3) {
            return;
        }
        for (int var1 = -1; var1 < class67.field1206; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class140.field2463[var1];
            }
            class144 var3 = class300.field5172[var2];
            if (var3 != null) {
                class229.method1562(var3, var3.method515(5373952), 64);
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILra;I)V", line = 270)
    public final void method54(int arg0, class41 arg1, int arg2) {
        field3747++;
        if (arg2 == 0) {
            this.field3742 = arg1.method346(-16);
        } else if (arg2 == 1) {
            this.field3744 = arg1.method346(-16);
        } else if (arg2 == 2) {
            this.field3740 = arg1.method346(-16);
        } else if (arg2 == 3) {
            this.field3737 = arg1.method346(-16);
        } else if (arg2 == 4) {
            int var5 = arg1.method349((byte) -102);
            this.field3749[0] = class150.method1123(267386880, var5 << 4);
            this.field3749[1] = class150.method1123(65280, var5) >> 4;
            this.field3749[2] = class150.method1123(var5 >> 12, 0);
        }
        if (arg0 <= 108) {
            method1462(44);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILla;B)V", line = 339)
    public static final void method1468(int arg0, int arg1, class188 arg2, byte arg3) {
        if (arg2.field3455 == 1) {
            class144.method1057(class46.field844, arg2.field3342, (short) 47, 116, 0, arg2.field3358, -1, 0L);
            class256.field4392++;
        }
        if (arg2.field3455 == 2 && !class320.field5489) {
            class256 var4 = class242.method1623(arg2, (byte) -65);
            if (var4 != null) {
                class144.method1057(class30.method214(new class256[] { class255.field4362, arg2.field3345 }, 29784), arg2.field3342, (short) 50, 110, -1, var4, -1, 0L);
                class57.field1032++;
            }
        }
        if (arg3 >= -20) {
            method1467((byte) 17);
        }
        if (arg2.field3455 == 3) {
            class111.field1937++;
            class144.method1057(class46.field844, arg2.field3342, (short) 3, -29, 0, class72.field1322, -1, 0L);
        }
        if (arg2.field3455 == 4) {
            class144.method1057(class46.field844, arg2.field3342, (short) 42, -120, 0, arg2.field3358, -1, 0L);
            class45.field835++;
        }
        field3750++;
        if (arg2.field3455 == 5) {
            class230.field3932++;
            class144.method1057(class46.field844, arg2.field3342, (short) 2, 105, 0, arg2.field3358, -1, 0L);
        }
        if (arg2.field3455 == 6 && class278.field4815 == null) {
            class206.field3730++;
            class144.method1057(class46.field844, arg2.field3342, (short) 8, 117, -1, arg2.field3358, -1, 0L);
        }
        if (arg2.field3467 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field3390; var6++) {
                for (int var7 = 0; var7 < arg2.field3364; var7++) {
                    int var8 = (arg2.field3367 + 32) * var7;
                    int var9 = (arg2.field3373 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg2.field3310[var5];
                        var9 += arg2.field3456[var5];
                    }
                    if (arg0 >= var8 && var9 <= arg1 && (var8 + 32) > arg0 && var9 + 32 > arg1) {
                        class91.field1658 = arg2;
                        class247.field4205 = var5;
                        if (arg2.field3347[var5] > 0) {
                            class36 var10 = class254.method1753(arg2.field3347[var5] - 1, true);
                            if (class21.field273 == 1 && class214.method1497(client.method828(arg2), 1)) {
                                if (class254.field4352 != arg2.field3342 || class233.field3993 != var5) {
                                    class27.field352++;
                                    class144.method1057(class30.method214(new class256[] { class99.field1765, class313.field5391, var10.field591 }, 29784), arg2.field3342, (short) 20, 101, var5, class251.field4260, -1, (long) var10.field585);
                                }
                            } else if (!class320.field5489 || !class214.method1497(client.method828(arg2), 1)) {
                                class213.field3807++;
                                class256[] var11 = var10.field578;
                                if (class101.field1803) {
                                    var11 = class39.method298(var11, (byte) 43);
                                }
                                if (class214.method1497(client.method828(arg2), 1)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 13;
                                            } else {
                                                var13 = 60;
                                            }
                                            class9.field134++;
                                            class144.method1057(class30.method214(new class256[] { class119.field2107, var10.field591 }, 29784), arg2.field3342, var13, 123, var5, var11[var12], -1, (long) var10.field585);
                                        }
                                    }
                                }
                                if (class162.method1192(client.method828(arg2), 32705)) {
                                    class79.field1473++;
                                    class144.method1057(class30.method214(new class256[] { class119.field2107, var10.field591 }, 29784), arg2.field3342, (short) 7, 111, var5, class251.field4260, class76.field1450, (long) var10.field585);
                                }
                                if (class214.method1497(client.method828(arg2), 1) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class29.field408++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 36;
                                            }
                                            if (var14 == 1) {
                                                var15 = 15;
                                            }
                                            if (var14 == 2) {
                                                var15 = 31;
                                            }
                                            class144.method1057(class30.method214(new class256[] { class119.field2107, var10.field591 }, 29784), arg2.field3342, var15, 123, var5, var11[var14], -1, (long) var10.field585);
                                        }
                                    }
                                }
                                class256[] var16 = arg2.field3399;
                                if (class101.field1803) {
                                    var16 = class39.method298(var16, (byte) 99);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class197.field3599++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 58;
                                            }
                                            if (var17 == 1) {
                                                var18 = 45;
                                            }
                                            if (var17 == 2) {
                                                var18 = 19;
                                            }
                                            if (var17 == 3) {
                                                var18 = 1;
                                            }
                                            if (var17 == 4) {
                                                var18 = 22;
                                            }
                                            class144.method1057(class30.method214(new class256[] { class119.field2107, var10.field591 }, 29784), arg2.field3342, var18, -103, var5, var16[var17], -1, (long) var10.field585);
                                        }
                                    }
                                }
                                class144.method1057(class30.method214(new class256[] { class119.field2107, var10.field591 }, 29784), arg2.field3342, (short) 1007, 109, var5, class88.field1575, class241.field4106, (long) var10.field585);
                            } else if ((class173.field3079 & 0x10) == 16) {
                                class301.field5177++;
                                class144.method1057(class30.method214(new class256[] { class24.field319, class313.field5391, var10.field591 }, 29784), arg2.field3342, (short) 57, 115, var5, class261.field4511, -1, (long) var10.field585);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field3396) {
            return;
        }
        if (!class320.field5489) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class256 var20 = class166.method1215(arg2, (byte) 86, var19);
                if (var20 != null) {
                    class23.field292++;
                    class144.method1057(arg2.field3379, arg2.field3342, (short) 1004, -89, arg2.field3305, var20, class41.method358((byte) -101, var19, arg2), (long) (var19 + 1));
                }
            }
            class256 var21 = class242.method1623(arg2, (byte) -109);
            if (var21 != null) {
                class144.method1057(arg2.field3379, arg2.field3342, (short) 50, -128, arg2.field3305, var21, -1, 0L);
                class57.field1032++;
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                class256 var23 = class166.method1215(arg2, (byte) 86, var22);
                if (var23 != null) {
                    class23.field292++;
                    class144.method1057(arg2.field3379, arg2.field3342, (short) 44, -29, arg2.field3305, var23, class41.method358((byte) -124, var22, arg2), (long) (var22 + 1));
                }
            }
            if (class195.method1418(client.method828(arg2), (byte) -106)) {
                class144.method1057(class46.field844, arg2.field3342, (short) 8, 126, arg2.field3305, class7.field117, -1, 0L);
                class206.field3730++;
            }
        } else if (class86.method632((byte) 110, client.method828(arg2)) && (class173.field3079 & 0x20) == 32) {
            class214.field3826++;
            class144.method1057(class30.method214(new class256[] { class24.field319, class269.field4580, arg2.field3379 }, 29784), arg2.field3342, (short) 21, -50, arg2.field3305, class261.field4511, -1, 0L);
        }
    }
}
