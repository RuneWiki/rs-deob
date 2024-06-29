import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class181 extends class242 {

    @OriginalMember(owner = "client!ed", name = "db", descriptor = "I")
    private int field3170;

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "I")
    public static int field3159 = 0;

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "Lp;")
    public static class280 field3163 = class18.method140((byte) -126, "Weiter");

    @OriginalMember(owner = "client!ed", name = "ab", descriptor = "Lp;")
    private static class280 field3167 = class18.method140((byte) -120, "Prepared sound engine");

    @OriginalMember(owner = "client!ed", name = "eb", descriptor = "Lp;")
    public static class280 field3171 = field3167;

    @OriginalMember(owner = "client!ed", name = "fb", descriptor = "S")
    public static short field3172 = 32767;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!ed", name = "V", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!ed", name = "Y", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!ed", name = "Z", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!ed", name = "bb", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!ed", name = "X", descriptor = "Ltg;")
    public static class180 field3164;

    @OriginalMember(owner = "client!ed", name = "cb", descriptor = "Ltg;")
    public static class180 field3169;

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "Ltd;")
    public static class72 field3161;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BII)V")
    public static final void method1263(byte arg0, int arg1, int arg2) {
        class157 var3 = class257.method1740(arg1, (byte) 71, 6);
        if (arg0 >= 60) {
            var3.method1112((byte) 118);
            ++field3162;
            var3.field2748 = arg2;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static void method1264(byte arg0) {
        field3171 = null;
        field3164 = null;
        int var1 = -18 % ((arg0 - -2) / 39);
        field3161 = null;
        field3163 = null;
        field3169 = null;
        field3167 = null;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class181() {
        this(4096);
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(I)V")
    private class181(int arg0) {
        super(0, true);
        this.field3170 = 4096;
        this.field3170 = arg0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILoe;IIB)V")
    public static final void method1265(int arg0, class142 arg1, int arg2, int arg3, byte arg4) {
        ++field3160;
        if (class262.field4631 != arg1) {
            if (~class157.field2745 > -401) {
                if (arg4 != -30) {
                    field3169 = null;
                }
                class280 var5;
                if (arg1.field2478 != 0) {
                    var5 = class30.method266(new class280[] { arg1.method979(-98), class64.field1067, class40.field696, class249.method1685((byte) 83, arg1.field2478), class19.field347 }, (byte) -87);
                } else {
                    boolean var6 = true;
                    if (class262.field4631.field2479 != -1 && arg1.field2479 != -1) {
                        int var7 = ~arg1.field2479 >= ~class262.field4631.field2479 ? arg1.field2479 : class262.field4631.field2479;
                        int var8 = class262.field4631.field2455 > arg1.field2455 ? class262.field4631.field2455 : arg1.field2455;
                        int var9 = 5 - -(var8 * 10 / 100) + var7;
                        int var10 = -arg1.field2455 + class262.field4631.field2455;
                        if (~var10 > -1) {
                            var10 = -var10;
                        }
                        if (var9 < var10) {
                            var6 = false;
                        }
                    }
                    class280 var11 = ~class283.field4992 == -2 ? class203.field3526 : class268.field4703;
                    if (arg1.field2455 < arg1.field2472) {
                        var5 = class30.method266(new class280[] { arg1.method979(-43), !var6 ? class89.field1452 : class97.method676(arg4 + 108, arg1.field2455, class262.field4631.field2455), class64.field1067, var11, class249.method1685((byte) -101, arg1.field2455), class264.field4662, class249.method1685((byte) -118, -arg1.field2455 + arg1.field2472), class19.field347 }, (byte) -87);
                    } else {
                        var5 = class30.method266(new class280[] { arg1.method979(-84), var6 ? class97.method676(arg4 + 137, arg1.field2455, class262.field4631.field2455) : class89.field1452, class64.field1067, var11, class249.method1685((byte) 58, arg1.field2455), class19.field347 }, (byte) -87);
                    }
                }
                if (class112.field1836 != 1) {
                    if (!class263.field4647) {
                        for (int var12 = 7; ~var12 <= -1; --var12) {
                            if (class176.field3068[var12] != null) {
                                ++class275.field4768;
                                short var13 = 0;
                                if (~class283.field4992 == -1 && class176.field3068[var12].method1887((byte) 32, class271.field4737)) {
                                    if (arg1.field2455 > class262.field4631.field2455) {
                                        var13 = 2000;
                                    }
                                    if (~class262.field4631.field2496 != -1 && arg1.field2496 != 0) {
                                        if (~class262.field4631.field2496 == ~arg1.field2496) {
                                            var13 = 2000;
                                        } else {
                                            var13 = 0;
                                        }
                                    }
                                } else if (class81.field1336[var12]) {
                                    var13 = 2000;
                                }
                                boolean var14 = false;
                                short var15 = class24.field437[var12];
                                short var16 = (short) (var13 + var15);
                                class184.method1276(arg0, class176.field3068[var12], 6479, var16, class98.field1589[var12], (long) arg2, class30.method266(new class280[] { class89.field1452, var5 }, (byte) -87), arg3);
                            }
                        }
                    } else if (~(class167.field2931 & 8) == -9) {
                        class184.method1276(arg0, class90.field1473, 6479, (short) 40, -1, (long) arg2, class30.method266(new class280[] { class268.field4702, class182.field3203, var5 }, (byte) -87), arg3);
                        ++class19.field353;
                    }
                } else {
                    ++class29.field550;
                    class184.method1276(arg0, class182.field3199, 6479, (short) 4, class248.field4347, (long) arg2, class30.method266(new class280[] { class48.field791, class182.field3203, var5 }, (byte) -87), arg3);
                }
                for (int var17 = 0; var17 < class157.field2745; ++var17) {
                    if (~class275.field4765[var17] == -34) {
                        class258.field4566[var17] = class30.method266(new class280[] { class89.field1452, var5 }, (byte) -87);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        if (arg0 >= -119) {
            field3164 = null;
        }
        ++field3165;
        if (~arg1 == -1) {
            this.field3170 = (arg2.method189((byte) -103) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        ++field3166;
        int[] var3 = super.field4251.method1417((byte) 121, arg0);
        if (super.field4251.field3655) {
            class143.method986(var3, 0, class264.field4654, this.field3170);
        }
        int var4 = 105 / ((arg1 - 73) / 41);
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILua;ZIB)V")
    public static final void method1266(int arg0, class113 arg1, boolean arg2, int arg3, byte arg4) {
        ++field3158;
        int var5 = arg1.field1995;
        int var6 = arg1.field1869;
        if (arg1.field1895 == 0) {
            arg1.field1995 = arg1.field1957;
        } else if (arg1.field1895 != 1) {
            if (arg1.field1895 == 2) {
                arg1.field1995 = arg1.field1957 * arg3 >> 14;
            } else if (arg1.field1895 == 3) {
                if (~arg1.field1879 == -3) {
                    arg1.field1995 = (arg1.field1957 + -1) * arg1.field1876 + arg1.field1957 * 32;
                } else if (~arg1.field1879 == -8) {
                    arg1.field1995 = (arg1.field1957 - 1) * arg1.field1876 + arg1.field1957 * 12;
                }
            }
        } else {
            arg1.field1995 = -arg1.field1957 + arg3;
        }
        if (arg1.field2021 == 0) {
            arg1.field1869 = arg1.field2005;
        } else if (~arg1.field2021 == -2) {
            arg1.field1869 = -arg1.field2005 + arg0;
        } else if (~arg1.field2021 == -3) {
            arg1.field1869 = arg1.field2005 * arg0 >> 14;
        } else if (~arg1.field2021 == -4) {
            if (~arg1.field1879 != -3) {
                if (arg1.field1879 == 7) {
                    arg1.field1869 = (arg1.field2005 + -1) * arg1.field1878 + arg1.field2005 * 115;
                }
            } else {
                arg1.field1869 = (arg1.field2005 + -1) * arg1.field1878 + arg1.field2005 * 32;
            }
        }
        if (arg1.field2021 == 4) {
            arg1.field1869 = arg1.field1995 * arg1.field1944 / arg1.field1903;
        }
        int var7 = -45 % ((arg4 - 49) / 61);
        if (arg1.field1895 == 4) {
            arg1.field1995 = arg1.field1903 * arg1.field1869 / arg1.field1944;
        }
        if (class250.field4377 && (~client.method1099(arg1) != -1 || arg1.field1879 == 0)) {
            if (~arg1.field1995 > -6 && ~arg1.field1869 > -6) {
                arg1.field1995 = 5;
                arg1.field1869 = 5;
            } else {
                if (arg1.field1869 <= 0) {
                    arg1.field1869 = 5;
                }
                if (arg1.field1995 <= 0) {
                    arg1.field1995 = 5;
                }
            }
        }
        if (arg1.field1899 == 1337) {
            class157.field2740 = arg1;
        }
        if (arg2 && arg1.field2019 != null) {
            if (~arg1.field1869 != ~var6 || ~arg1.field1995 != ~var5) {
                class178 var8 = new class178();
                var8.field3107 = arg1.field2019;
                var8.field3106 = arg1;
                class43.field722.method649(var8, (byte) 120);
            }
        }
    }
}
