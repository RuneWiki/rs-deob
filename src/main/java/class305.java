import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class305 extends class295 {

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "I")
    public int field4138 = 1;

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "Lbi;")
    public static class139 field4133 = null;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "[Z")
    public static boolean[] field4131 = new boolean[100];

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "I")
    public static int field4134 = 0;

    @OriginalMember(owner = "client!dj", name = "G", descriptor = "C")
    public char field4136;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!dj", name = "F", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!dj", name = "H", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!dj", name = "J", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V", line = 6)
    public static final void method1967(int arg0, int arg1, int arg2) {
        class430.field6116 = new class410(arg2);
        field4135++;
        class89.field1330 = new class410(arg0);
        if (arg1 != 3) {
            field4134 = 61;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BILap;)V", line = 19)
    private final void method1968(byte arg0, int arg1, class289 arg2) {
        field4139++;
        if (arg1 == 1) {
            this.field4136 = class393.method2421(arg2.method1868((byte) -125), 20483);
        } else if (arg1 == 2) {
            this.field4138 = 0;
        }
        if (arg0 >= -98) {
            method1972((byte) -124);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lap;I)V", line = 47)
    public final void method1969(class289 arg0, int arg1) {
        field4132++;
        if (arg1 != -15585) {
            return;
        }
        while (true) {
            int var3 = arg0.method1861((byte) -72);
            if (var3 == 0) {
                return;
            }
            this.method1968((byte) -113, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILbi;I)V", line = 75)
    public static final void method1970(int arg0, int arg1, class139 arg2, int arg3) {
        field4140++;
        if (arg2.field2069 == 1) {
            class361.method2264(arg2.field1968, -1, arg2.field2095, 0L, 48, "", 36, 0);
            class199.field2843++;
        }
        if (arg0 != -3) {
            return;
        }
        if (arg2.field2069 == 2 && !class3.field16) {
            String var4 = class173.method1288(arg2, (byte) -67);
            if (var4 != null) {
                class334.field4527++;
                class361.method2264(arg2.field1968, -1, var4, 0L, -127, "<col=00ff00>" + arg2.field1985, 42, -1);
            }
        }
        if (arg2.field2069 == 3) {
            class361.method2264(arg2.field1968, -1, class391.field5481, 0L, -124, "", 30, 0);
            class430.field6121++;
        }
        if (arg2.field2069 == 4) {
            class361.method2264(arg2.field1968, -1, arg2.field2095, 0L, -123, "", 39, 0);
            class346.field4686++;
        }
        if (arg2.field2069 == 5) {
            class330.field4499++;
            class361.method2264(arg2.field1968, -1, arg2.field2095, 0L, 96, "", 25, 0);
        }
        if (arg2.field2069 == 6 && class331.field4502 == null) {
            class385.field5422++;
            class361.method2264(arg2.field1968, -1, arg2.field2095, 0L, arg0 ^ 0x77, "", 60, -1);
        }
        if (arg2.field2023 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field2020; var6++) {
                for (int var7 = 0; var7 < arg2.field1956; var7++) {
                    int var8 = (arg2.field2056 + 32) * var7;
                    int var9 = (arg2.field1966 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg2.field2033[var5];
                        var9 += arg2.field2025[var5];
                    }
                    if (var8 <= arg1 && var9 <= arg3 && var8 + 32 > arg1 && (var9 + 32) > arg3) {
                        class293.field3965 = arg2;
                        class139.field1987 = var5;
                        if (arg2.field2101[var5] > 0) {
                            class126 var10 = client.method1648(arg2);
                            class452 var11 = class234.method1569(arg0 ^ 0xFFFFF7A3, arg2.field2101[var5] - 1);
                            if (class363.field5021 == 1 && var10.method983(97)) {
                                if (class272.field3661 != arg2.field1968 || class22.field413 != var5) {
                                    class361.method2264(arg2.field1968, class336.field4552, class328.field4458, (long) var11.field6549, 86, class21.field390 + " -> <col=ff9040>" + var11.field6595, 20, var5);
                                    class161.field2393++;
                                }
                            } else if (class3.field16 && var10.method983(-119)) {
                                class287 var12 = class386.field5439 == -1 ? null : class345.method2186(class386.field5439, (byte) 93);
                                if ((class280.field3750 & 0x10) != 0 && (var12 == null || var11.method2815((byte) -111, class386.field5439, var12.field3845) != var12.field3845)) {
                                    class361.method2264(arg2.field1968, class163.field2409, class166.field2465, (long) var11.field6549, -105, class326.field4421 + " -> <col=ff9040>" + var11.field6595, 58, var5);
                                    class375.field5288++;
                                }
                            } else {
                                String[] var13 = var11.field6534;
                                if (var10.method983(103)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            int var15 = -1;
                                            byte var16;
                                            if (var14 == 3) {
                                                var16 = 5;
                                            } else {
                                                var16 = 16;
                                            }
                                            if (var11.field6524 == var14) {
                                                var15 = var11.field6578;
                                            }
                                            if (var11.field6588 == var14) {
                                                var15 = var11.field6546;
                                            }
                                            class24.field441++;
                                            class361.method2264(arg2.field1968, var15, var13[var14], (long) var11.field6549, -105, "<col=ff9040>" + var11.field6595, var16, var5);
                                        }
                                    }
                                }
                                if (var10.method986((byte) 79)) {
                                    class361.method2264(arg2.field1968, class336.field4552, class328.field4458, (long) var11.field6549, -126, "<col=ff9040>" + var11.field6595, 31, var5);
                                    class173.field2541++;
                                }
                                if (var10.method983(93) && var13 != null) {
                                    for (int var17 = 2; var17 >= 0; var17--) {
                                        if (var13[var17] != null) {
                                            byte var18 = 0;
                                            int var19 = -1;
                                            if (var17 == 0) {
                                                var18 = 10;
                                            }
                                            if (var17 == 1) {
                                                var18 = 13;
                                            }
                                            if (var11.field6524 == var17) {
                                                var19 = var11.field6578;
                                            }
                                            if (var17 == 2) {
                                                var18 = 49;
                                            }
                                            if (var11.field6588 == var17) {
                                                var19 = var11.field6546;
                                            }
                                            class361.method2264(arg2.field1968, var19, var13[var17], (long) var11.field6549, 35, "<col=ff9040>" + var11.field6595, var18, var5);
                                            class100.field1450++;
                                        }
                                    }
                                }
                                String[] var20 = arg2.field1984;
                                if (var20 != null) {
                                    for (int var21 = 4; var21 >= 0; var21--) {
                                        if (var20[var21] != null) {
                                            byte var22 = 0;
                                            if (var21 == 0) {
                                                var22 = 21;
                                            }
                                            int var23 = -1;
                                            if (var21 == 1) {
                                                var22 = 40;
                                            }
                                            if (var21 == 2) {
                                                var22 = 34;
                                            }
                                            if (var21 == 3) {
                                                var22 = 1;
                                            }
                                            if (var11.field6524 == var21) {
                                                var23 = var11.field6578;
                                            }
                                            if (var21 == 4) {
                                                var22 = 18;
                                            }
                                            if (var11.field6588 == var21) {
                                                var23 = var11.field6546;
                                            }
                                            class421.field5899++;
                                            class361.method2264(arg2.field1968, var23, var20[var21], (long) var11.field6549, 42, "<col=ff9040>" + var11.field6595, var22, var5);
                                        }
                                    }
                                }
                                class361.method2264(arg2.field1968, class422.field5904, class241.field3333, (long) var11.field6549, arg0 - 98, "<col=ff9040>" + var11.field6595, 1006, var5);
                                class451.field6513++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field2048) {
            return;
        }
        if (!class3.field16) {
            for (int var24 = 9; var24 >= 5; var24--) {
                String var28 = class5.method33(arg2, -7058, var24);
                if (var28 != null) {
                    client.field3441++;
                    class361.method2264(arg2.field1968, class441.method2734(var24, -19, arg2), var28, (long) (var24 + 1), -112, arg2.field2096, 1011, arg2.field2094);
                }
            }
            String var25 = class173.method1288(arg2, (byte) -96);
            if (var25 != null) {
                class334.field4527++;
                class361.method2264(arg2.field1968, -1, var25, 0L, -118, arg2.field2096, 42, arg2.field2094);
            }
            for (int var26 = 4; var26 >= 0; var26--) {
                String var27 = class5.method33(arg2, -7058, var26);
                if (var27 != null) {
                    class361.method2264(arg2.field1968, class441.method2734(var26, -114, arg2), var27, (long) (var26 + 1), 50, arg2.field2096, 15, arg2.field2094);
                    client.field3441++;
                }
            }
            if (!client.method1648(arg2).method980(false)) {
                return;
            }
            if (arg2.field2051 == null) {
                class361.method2264(arg2.field1968, -1, class84.field1226, 0L, 48, "", 60, arg2.field2094);
            } else {
                class361.method2264(arg2.field1968, -1, arg2.field2051, 0L, 30, "", 60, arg2.field2094);
            }
            class385.field5422++;
        } else if (client.method1648(arg2).method978(arg0 ^ 0xA19) && (class280.field3750 & 0x20) != 0) {
            class187.field2704++;
            class361.method2264(arg2.field1968, class163.field2409, class166.field2465, 0L, -126, class326.field4421 + " -> " + arg2.field2096, 50, arg2.field2094);
            return;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILrk;)V", line = 422)
    public static final void method1971(int arg0, class427 arg1) {
        if (arg0 != 30567) {
            method1970(-97, 45, (class139) null, 44);
        }
        class36.field561 = arg1;
        field4137++;
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(B)V", line = 441)
    public static void method1972(byte arg0) {
        field4131 = null;
        field4133 = null;
        if (arg0 != 123) {
            field4134 = 107;
        }
    }
}
