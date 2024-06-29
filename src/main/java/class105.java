import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public abstract class class105 {

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "[S")
    public static short[] field1911 = new short[500];

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "Lbd;")
    private static class162 field1917 = class17.method142(0, "Loading world list data");

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field1922 = 1;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field1915 = 0;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field1910 = 0;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field1914 = 1;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "Lbd;")
    public static class162 field1921 = class17.method142(0, "Nehmen");

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "Lbd;")
    public static class162 field1919 = field1917;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "Lbd;")
    public static class162 field1913 = class17.method142(0, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "[J")
    public static long[] field1912 = new long[32];

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "Lda;")
    public static class143 field1920;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILob;I)V", line = 11)
    public static final void method866(int arg0, int arg1, class78 arg2, int arg3) {
        field1923++;
        if (arg2.field1218 == 1) {
            class171.field2975++;
            class143.method1143(0L, (short) 23, 10015, arg2.field1235, 0, arg2.field1305, class244.field4053);
        }
        if (arg2.field1218 == 2 && !class13.field213) {
            class162 var4 = class13.method113(arg2, 0);
            if (var4 != null) {
                class207.field3491++;
                class143.method1143(0L, (short) 10, 10015, arg2.field1235, -1, var4, class135.method1062(new class162[] { class180.field3087, arg2.field1301 }, true));
            }
        }
        if (arg2.field1218 == 3) {
            class84.field1512++;
            class143.method1143(0L, (short) 5, 10015, arg2.field1235, 0, class17.field288, class244.field4053);
        }
        if (arg2.field1218 == 4) {
            class258.field4279++;
            class143.method1143(0L, (short) 32, arg3 + 4577, arg2.field1235, 0, arg2.field1305, class244.field4053);
        }
        if (arg2.field1218 == 5) {
            class282.field4792++;
            class143.method1143(0L, (short) 36, 10015, arg2.field1235, 0, arg2.field1305, class244.field4053);
        }
        if (arg3 != 5438) {
            field1920 = (class143) null;
        }
        if (arg2.field1218 == 6 && class243.field4040 == null) {
            class180.field3095++;
            class143.method1143(0L, (short) 41, 10015, arg2.field1235, -1, arg2.field1305, class244.field4053);
        }
        if (arg2.field1231 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field1278; var6++) {
                for (int var7 = 0; var7 < arg2.field1219; var7++) {
                    int var8 = (arg2.field1346 + 32) * var6;
                    int var9 = (arg2.field1257 + 32) * var7;
                    if (var5 < 20) {
                        var9 += arg2.field1349[var5];
                        var8 += arg2.field1353[var5];
                    }
                    if (var9 <= arg0 && arg1 >= var8 && arg0 < (var9 + 32) && var8 + 32 > arg1) {
                        class235.field3931 = var5;
                        class216.field3606 = arg2;
                        if (arg2.field1381[var5] > 0) {
                            class116 var10 = class304.method2075(arg2.field1381[var5] - 1, 4);
                            if (class148.field2674 == 1 && class59.method408(client.method861(arg2), 121)) {
                                if (class165.field2918 != arg2.field1235 || class87.field1548 != var5) {
                                    class143.method1143((long) var10.field2097, (short) 9, 10015, arg2.field1235, var5, class267.field4443, class135.method1062(new class162[] { class190.field3246, class251.field4191, var10.field2091 }, true));
                                    class223.field3725++;
                                }
                            } else if (!class13.field213 || !class59.method408(client.method861(arg2), 109)) {
                                class20.field321++;
                                class162[] var11 = var10.field2120;
                                if (class50.field796) {
                                    var11 = class146.method1163(0, var11);
                                }
                                if (class59.method408(client.method861(arg2), 95)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            field1916++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 51;
                                            } else {
                                                var13 = 47;
                                            }
                                            class143.method1143((long) var10.field2097, var13, 10015, arg2.field1235, var5, var11[var12], class135.method1062(new class162[] { class207.field3490, var10.field2091 }, true));
                                        } else if (var12 == 4) {
                                            class143.method1143((long) var10.field2097, (short) 47, 10015, arg2.field1235, var5, class42.field689, class135.method1062(new class162[] { class207.field3490, var10.field2091 }, true));
                                            class87.field1550++;
                                        }
                                    }
                                }
                                if (class207.method1525(client.method861(arg2), arg3 ^ 0xB6419212)) {
                                    class170.field2956++;
                                    class143.method1143((long) var10.field2097, (short) 15, 10015, arg2.field1235, var5, class267.field4443, class135.method1062(new class162[] { class207.field3490, var10.field2091 }, true));
                                }
                                if (class59.method408(client.method861(arg2), 93) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class267.field4459++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 19;
                                            }
                                            if (var14 == 1) {
                                                var15 = 57;
                                            }
                                            if (var14 == 2) {
                                                var15 = 59;
                                            }
                                            class143.method1143((long) var10.field2097, var15, 10015, arg2.field1235, var5, var11[var14], class135.method1062(new class162[] { class207.field3490, var10.field2091 }, true));
                                        }
                                    }
                                }
                                class162[] var16 = arg2.field1286;
                                if (class50.field796) {
                                    var16 = class146.method1163(0, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 6;
                                            }
                                            class273.field4536++;
                                            if (var17 == 1) {
                                                var18 = 7;
                                            }
                                            if (var17 == 2) {
                                                var18 = 28;
                                            }
                                            if (var17 == 3) {
                                                var18 = 37;
                                            }
                                            if (var17 == 4) {
                                                var18 = 25;
                                            }
                                            class143.method1143((long) var10.field2097, var18, 10015, arg2.field1235, var5, var16[var17], class135.method1062(new class162[] { class207.field3490, var10.field2091 }, true));
                                        }
                                    }
                                }
                                class143.method1143((long) var10.field2097, (short) 1004, 10015, arg2.field1235, var5, class87.field1539, class135.method1062(new class162[] { class207.field3490, var10.field2091 }, true));
                            } else if ((class60.field930 & 0x10) == 16) {
                                class143.method1143((long) var10.field2097, (short) 24, 10015, arg2.field1235, var5, class245.field4074, class135.method1062(new class162[] { class243.field4042, class251.field4191, var10.field2091 }, true));
                                class240.field3987++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field1229) {
            return;
        }
        if (!class13.field213) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class162 var20 = class277.method1906(arg2, -104, var19);
                if (var20 != null) {
                    class73.field1161++;
                    class143.method1143((long) (var19 + 1), (short) 1003, arg3 + 4577, arg2.field1235, arg2.field1276, var20, arg2.field1320);
                }
            }
            class162 var21 = class13.method113(arg2, 0);
            if (var21 != null) {
                class143.method1143(0L, (short) 10, 10015, arg2.field1235, arg2.field1276, var21, arg2.field1320);
                class207.field3491++;
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                class162 var23 = class277.method1906(arg2, 16, var22);
                if (var23 != null) {
                    class143.method1143((long) (var22 + 1), (short) 29, 10015, arg2.field1235, arg2.field1276, var23, arg2.field1320);
                    class73.field1161++;
                }
            }
            if (class131.method1047((byte) -76, client.method861(arg2))) {
                class143.method1143(0L, (short) 41, 10015, arg2.field1235, arg2.field1276, class173.field2995, class244.field4053);
                class180.field3095++;
            }
        } else if (class144.method1158(1405024758, client.method861(arg2)) && (class60.field930 & 0x20) == 32) {
            class143.method1143(0L, (short) 8, arg3 ^ 0x3221, arg2.field1235, arg2.field1276, class245.field4074, class135.method1062(new class162[] { class243.field4042, class1.field4, arg2.field1320 }, true));
            class58.field907++;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 325)
    public static void method867(int arg0) {
        field1913 = null;
        if (arg0 != -1) {
            return;
        }
        field1919 = null;
        field1917 = null;
        field1921 = null;
        field1911 = null;
        field1920 = null;
        field1912 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)[B")
    public abstract byte[] method192(int arg0, byte arg1);

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)I")
    public abstract int method190(int arg0, int arg1);

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)V")
    public abstract void method191(byte arg0, int arg1);

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)Lvj;")
    public abstract class256 method188(int arg0);
}
