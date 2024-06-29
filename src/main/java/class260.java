import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class260 extends class259 {

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public int field4016;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public int field4021;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "[I")
    public int[] field4027;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "[[I")
    public int[][] field4017;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "[I")
    public int[] field4022;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "[Z")
    public boolean[] field4028;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "Lnh;")
    public static class312 field4018 = new class312(64);

    @OriginalMember(owner = "client!of", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4026 = "Use";

    @OriginalMember(owner = "client!of", name = "z", descriptor = "I")
    public static int field4030 = 0;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "Lba;")
    public static class157 field4029;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(III)I")
    public static final int method1784(int arg0, int arg1, int arg2) {
        class101 var3 = (class101) class142.field2308.method1073(arg0 + 1, (long) arg1);
        field4019++;
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            if (arg0 != -2) {
                field4030 = 10;
            }
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field1713.length; var5++) {
                if (var3.field1717[var5] == arg2) {
                    var4 += var3.field1713[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V")
    public static void method1785(int arg0) {
        if (arg0 != -7909) {
            method1786((class263) null, (byte) 49, 32, 116);
        }
        field4029 = null;
        field4018 = null;
        field4026 = null;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(I[B)V")
    public class260(int arg0, byte[] arg1) {
        this.field4016 = arg0;
        class53 var3 = new class53(arg1);
        this.field4021 = var3.method366(-16505);
        this.field4027 = new int[this.field4021];
        this.field4017 = new int[this.field4021][];
        this.field4022 = new int[this.field4021];
        this.field4028 = new boolean[this.field4021];
        for (int var4 = 0; var4 < this.field4021; var4++) {
            this.field4022[var4] = var3.method366(-16505);
        }
        for (int var5 = 0; var5 < this.field4021; var5++) {
            this.field4028[var5] = var3.method366(-16505) == 1;
        }
        for (int var6 = 0; var6 < this.field4021; var6++) {
            this.field4027[var6] = var3.method331(-118);
        }
        for (int var7 = 0; var7 < this.field4021; var7++) {
            this.field4017[var7] = new int[var3.method366(-16505)];
        }
        for (int var8 = 0; var8 < this.field4021; var8++) {
            for (int var9 = 0; var9 < this.field4017[var8].length; var9++) {
                this.field4017[var8][var9] = var3.method366(-16505);
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lmh;BII)V")
    public static final void method1786(class263 arg0, byte arg1, int arg2, int arg3) {
        field4015++;
        if (arg0.field4136 == 1) {
            class63.method481(0L, arg0.field4083, -1, 0, arg0.field4191, (short) 46, -1, "");
            class49.field681++;
        }
        if (arg0.field4136 == 2 && !class6.field57) {
            String var4 = class298.method2031(-16872, arg0);
            if (var4 != null) {
                class63.method481(0L, arg0.field4083, -1, -1, var4, (short) 48, -1, "<col=00ff00>" + arg0.field4197);
                class267.field4269++;
            }
        }
        if (arg0.field4136 == 3) {
            class63.method481(0L, arg0.field4083, -1, 0, class86.field1371, (short) 21, -1, "");
            class22.field245++;
        }
        if (arg0.field4136 == 4) {
            class183.field2740++;
            class63.method481(0L, arg0.field4083, -1, 0, arg0.field4191, (short) 23, -1, "");
        }
        int var5 = -79 % ((arg1 - 35) / 32);
        if (arg0.field4136 == 5) {
            class63.method481(0L, arg0.field4083, -1, 0, arg0.field4191, (short) 8, -1, "");
            class135.field2206++;
        }
        if (arg0.field4136 == 6 && class195.field2880 == null) {
            class172.field2593++;
            class63.method481(0L, arg0.field4083, -1, -1, arg0.field4191, (short) 5, -1, "");
        }
        if (arg0.field4129 == 2) {
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.field4190; var7++) {
                for (int var8 = 0; var8 < arg0.field4163; var8++) {
                    int var9 = (arg0.field4123 + 32) * var8;
                    int var10 = (arg0.field4094 + 32) * var7;
                    if (var6 < 20) {
                        var9 += arg0.field4146[var6];
                        var10 += arg0.field4170[var6];
                    }
                    if (arg3 >= var9 && arg2 >= var10 && var9 + 32 > arg3 && (var10 + 32) > arg2) {
                        class232.field3406 = var6;
                        class48.field669 = arg0;
                        if (arg0.field4132[var6] > 0) {
                            class250 var11 = client.method903(arg0);
                            class31 var12 = class12.method88(arg0.field4132[var6] - 1, 27838);
                            if (class165.field2539 == 1 && var11.method1722(-1)) {
                                if (class128.field2149 != arg0.field4083 || class294.field4712 != var6) {
                                    class63.method481((long) var12.field352, arg0.field4083, -1, var6, field4026, (short) 24, -1, class221.field3221 + " -> <col=ff9040>" + var12.field349);
                                    class193.field2848++;
                                }
                            } else if (class6.field57 && var11.method1722(-1)) {
                                class192 var13 = class243.field3580 == -1 ? null : class51.method308((byte) -73, class243.field3580);
                                if ((class69.field1111 & 0x10) != 0 && (var13 == null || var12.method203(var13.field2840, class243.field3580, -41) != var13.field2840)) {
                                    class138.field2248++;
                                    class63.method481((long) var12.field352, arg0.field4083, class87.field1380, var6, class169.field2567, (short) 7, -1, class136.field2220 + " -> <col=ff9040>" + var12.field349);
                                }
                            } else {
                                String[] var14 = var12.field385;
                                if (class92.field1489) {
                                    var14 = class135.method1020((byte) 0, var14);
                                }
                                if (var11.method1722(-1)) {
                                    for (int var15 = 4; var15 >= 3; var15--) {
                                        if (var14 != null && var14[var15] != null) {
                                            class190.field2810++;
                                            byte var16;
                                            if (var15 == 3) {
                                                var16 = 6;
                                            } else {
                                                var16 = 34;
                                            }
                                            class63.method481((long) var12.field352, arg0.field4083, -1, var6, var14[var15], var16, -1, "<col=ff9040>" + var12.field349);
                                        }
                                    }
                                }
                                if (var11.method1725(119)) {
                                    class63.method481((long) var12.field352, arg0.field4083, class298.field4788, var6, field4026, (short) 57, -1, "<col=ff9040>" + var12.field349);
                                    class34.field428++;
                                }
                                if (var11.method1722(-1) && var14 != null) {
                                    for (int var17 = 2; var17 >= 0; var17--) {
                                        if (var14[var17] != null) {
                                            class62.field938++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 33;
                                            }
                                            if (var17 == 1) {
                                                var18 = 32;
                                            }
                                            if (var17 == 2) {
                                                var18 = 40;
                                            }
                                            class63.method481((long) var12.field352, arg0.field4083, -1, var6, var14[var17], var18, -1, "<col=ff9040>" + var12.field349);
                                        }
                                    }
                                }
                                class134.field2191++;
                                String[] var19 = arg0.field4108;
                                if (class92.field1489) {
                                    var19 = class135.method1020((byte) 0, var19);
                                }
                                if (var19 != null) {
                                    for (int var20 = 4; var20 >= 0; var20--) {
                                        if (var19[var20] != null) {
                                            class40.field526++;
                                            byte var21 = 0;
                                            if (var20 == 0) {
                                                var21 = 50;
                                            }
                                            if (var20 == 1) {
                                                var21 = 41;
                                            }
                                            if (var20 == 2) {
                                                var21 = 10;
                                            }
                                            if (var20 == 3) {
                                                var21 = 3;
                                            }
                                            if (var20 == 4) {
                                                var21 = 29;
                                            }
                                            class63.method481((long) var12.field352, arg0.field4083, -1, var6, var19[var20], var21, -1, "<col=ff9040>" + var12.field349);
                                        }
                                    }
                                }
                                class63.method481((long) var12.field352, arg0.field4083, class74.field1176, var6, class35.field452, (short) 1005, -1, "<col=ff9040>" + var12.field349);
                            }
                        }
                    }
                    var6++;
                }
            }
        }
        if (!arg0.field4167) {
            return;
        }
        if (!class6.field57) {
            for (int var22 = 9; var22 >= 5; var22--) {
                String var26 = class313.method2105(arg0, 126, var22);
                if (var26 != null) {
                    class63.method481((long) (var22 + 1), arg0.field4083, class209.method1477(var22, (byte) -99, arg0), arg0.field4145, var26, (short) 1004, -1, arg0.field4111);
                    class74.field1174++;
                }
            }
            String var23 = class298.method2031(-16872, arg0);
            if (var23 != null) {
                class63.method481(0L, arg0.field4083, -1, arg0.field4145, var23, (short) 48, -1, arg0.field4111);
                class267.field4269++;
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                String var25 = class313.method2105(arg0, 111, var24);
                if (var25 != null) {
                    class74.field1174++;
                    class63.method481((long) (var24 + 1), arg0.field4083, class209.method1477(var24, (byte) -128, arg0), arg0.field4145, var25, (short) 51, -1, arg0.field4111);
                }
            }
            if (!client.method903(arg0).method1730(-123)) {
                return;
            }
            class172.field2593++;
            if (arg0.field4112 == null) {
                class63.method481(0L, arg0.field4083, -1, arg0.field4145, class112.field1866, (short) 5, -1, "");
                return;
            }
            class63.method481(0L, arg0.field4083, -1, arg0.field4145, arg0.field4112, (short) 5, -1, "");
        } else if (client.method903(arg0).method1726(7) && (class69.field1111 & 0x20) != 0) {
            class131.field2174++;
            class63.method481(0L, arg0.field4083, class87.field1380, arg0.field4145, class169.field2567, (short) 30, -1, class136.field2220 + " -> " + arg0.field4111);
            return;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)V")
    public static final void method1787(int arg0, int arg1) {
        field4020++;
        class36.field463.method1416(arg1, 0);
        if (arg0 != 1005) {
            field4030 = -92;
        }
        class241.field3533.method1416(arg1, 0);
        class301.field4878.method1416(arg1, 0);
    }
}
