import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public abstract class class110 {

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "[J")
    public static long[] field1673 = new long[1000];

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field1679 = 0;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "J")
    public static long field1678 = 0L;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1683 = "glow1:";

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public int field1672;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public int field1674;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public int field1677;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public int field1680;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public int field1681;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public int field1682;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V")
    public abstract void method20(int arg0, int arg1);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)V")
    public abstract void method29(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static void method709(int arg0) {
        if (arg0 == -4) {
            field1683 = null;
            field1673 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILkk;II)V")
    public static final void method710(int arg0, class254 arg1, int arg2, int arg3) {
        field1676++;
        if (arg1.field4037 == 1) {
            class175.field2734++;
            class192.method1333(arg1.field4077, arg1.field4118, 0L, "", (short) 30, 0, -1, arg2 - 9552);
        }
        if (arg1.field4037 == 2 && !class70.field1017) {
            String var4 = class239.method1664(897034860, arg1);
            if (var4 != null) {
                class192.method1333(arg1.field4077, var4, 0L, "<col=00ff00>" + arg1.field4096, (short) 42, -1, -1, 9910);
                class215.field3431++;
            }
        }
        if (arg1.field4037 == 3) {
            class192.method1333(arg1.field4077, class121.field1852, 0L, "", (short) 45, 0, -1, 9910);
            class178.field2768++;
        }
        if (arg1.field4037 == 4) {
            class232.field3710++;
            class192.method1333(arg1.field4077, arg1.field4118, 0L, "", (short) 35, 0, -1, arg2 - 9552);
        }
        if (arg1.field4037 == 5) {
            class192.method1333(arg1.field4077, arg1.field4118, 0L, "", (short) 9, 0, -1, 9910);
            class274.field4527++;
        }
        if (arg1.field4037 == 6 && class296.field4862 == null) {
            class192.method1333(arg1.field4077, arg1.field4118, 0L, "", (short) 20, -1, -1, 9910);
            class68.field996++;
        }
        if (arg1.field4052 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg1.field4106; var6++) {
                for (int var7 = 0; var7 < arg1.field4105; var7++) {
                    int var8 = (arg1.field4147 + 32) * var7;
                    int var9 = (arg1.field4109 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg1.field4196[var5];
                        var9 += arg1.field4133[var5];
                    }
                    if (arg0 >= var8 && var9 <= arg3 && arg0 < (var8 + 32) && (var9 + 32) > arg3) {
                        class64.field957 = var5;
                        class218.field3480 = arg1;
                        if (arg1.field4068[var5] > 0) {
                            class237 var10 = client.method1085(arg1);
                            class132 var11 = class14.method92(arg1.field4068[var5] - 1, false);
                            if (class29.field367 == 1 && var10.method1648((byte) -40)) {
                                if (class50.field685 != arg1.field4077 || class141.field2166 != var5) {
                                    class192.method1333(arg1.field4077, class18.field250, (long) var11.field2053, class43.field602 + " -> <col=ff9040>" + var11.field2071, (short) 19, var5, -1, arg2 - 9552);
                                    class162.field2553++;
                                }
                            } else if (class70.field1017 && var10.method1648((byte) -40)) {
                                class139 var12 = class135.field2114 == -1 ? null : class56.method338(class135.field2114, (byte) 108);
                                if ((client.field2581 & 0x10) != 0 && (var12 == null || var11.method892(class135.field2114, var12.field2150, 74) != var12.field2150)) {
                                    class49.field674++;
                                    class192.method1333(arg1.field4077, class70.field1019, (long) var11.field2053, class265.field4368 + " -> <col=ff9040>" + var11.field2071, (short) 60, var5, class44.field611, 9910);
                                }
                            } else {
                                class100.field1500++;
                                String[] var13 = var11.field2093;
                                if (class299.field4915) {
                                    var13 = class270.method1851(false, var13);
                                }
                                if (var10.method1648((byte) -40)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 10;
                                            } else {
                                                var15 = 12;
                                            }
                                            class125.field1916++;
                                            class192.method1333(arg1.field4077, var13[var14], (long) var11.field2053, "<col=ff9040>" + var11.field2071, var15, var5, -1, 9910);
                                        }
                                    }
                                }
                                if (var10.method1652(111)) {
                                    class192.method1333(arg1.field4077, class18.field250, (long) var11.field2053, "<col=ff9040>" + var11.field2071, (short) 43, var5, class19.field258, 9910);
                                    class248.field3955++;
                                }
                                if (var10.method1648((byte) -40) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class179.field2786++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 38;
                                            }
                                            if (var16 == 1) {
                                                var17 = 3;
                                            }
                                            if (var16 == 2) {
                                                var17 = 50;
                                            }
                                            class192.method1333(arg1.field4077, var13[var16], (long) var11.field2053, "<col=ff9040>" + var11.field2071, var17, var5, -1, 9910);
                                        }
                                    }
                                }
                                String[] var18 = arg1.field4160;
                                if (class299.field4915) {
                                    var18 = class270.method1851(false, var18);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class73.field1073++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 14;
                                            }
                                            if (var19 == 1) {
                                                var20 = 31;
                                            }
                                            if (var19 == 2) {
                                                var20 = 37;
                                            }
                                            if (var19 == 3) {
                                                var20 = 59;
                                            }
                                            if (var19 == 4) {
                                                var20 = 5;
                                            }
                                            class192.method1333(arg1.field4077, var18[var19], (long) var11.field2053, "<col=ff9040>" + var11.field2071, var20, var5, -1, 9910);
                                        }
                                    }
                                }
                                class192.method1333(arg1.field4077, class27.field347, (long) var11.field2053, "<col=ff9040>" + var11.field2071, (short) 1004, var5, class208.field3325, 9910);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (arg2 != 19462 || !arg1.field4181) {
            return;
        }
        if (!class70.field1017) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var25 = class31.method186(var21, false, arg1);
                if (var25 != null) {
                    class192.method1333(arg1.field4077, var25, (long) (var21 + 1), arg1.field4146, (short) 1011, arg1.field4040, class71.method448(var21, arg1, arg2 ^ 0x4C7A), 9910);
                    class138.field2141++;
                }
            }
            String var22 = class239.method1664(897034860, arg1);
            if (var22 != null) {
                class192.method1333(arg1.field4077, var22, 0L, arg1.field4146, (short) 42, arg1.field4040, -1, 9910);
                class215.field3431++;
            }
            for (int var23 = 4; var23 >= 0; var23--) {
                String var24 = class31.method186(var23, false, arg1);
                if (var24 != null) {
                    class192.method1333(arg1.field4077, var24, (long) (var23 + 1), arg1.field4146, (short) 36, arg1.field4040, class71.method448(var23, arg1, 60), 9910);
                    class138.field2141++;
                }
            }
            if (client.method1085(arg1).method1651(1)) {
                class68.field996++;
                if (arg1.field4171 != null) {
                    class192.method1333(arg1.field4077, arg1.field4171, 0L, "", (short) 20, arg1.field4040, -1, 9910);
                    return;
                }
                class192.method1333(arg1.field4077, class16.field229, 0L, "", (short) 20, arg1.field4040, -1, arg2 ^ 0x6AB0);
                return;
            }
            return;
        }
        if (client.method1085(arg1).method1650((byte) -110) && (client.field2581 & 0x20) != 0) {
            class192.method1333(arg1.field4077, class70.field1019, 0L, class265.field4368 + " -> " + arg1.field4146, (short) 24, arg1.field4040, class44.field611, 9910);
            class272.field4453++;
            return;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static final String method711(int arg0, byte arg1) {
        if (arg1 != -97) {
            method711(9, (byte) 127);
        }
        field1675++;
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }
}
