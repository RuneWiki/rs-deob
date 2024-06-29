import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class175 extends class137 {

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "Ljava/lang/String;")
    public static String field2867 = "scroll:";

    @OriginalMember(owner = "client!cf", name = "X", descriptor = "J")
    public static volatile long field2871 = 0L;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "I")
    public int field2855;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "I")
    public int field2857;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
    public int field2865;

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!cf", name = "V", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!cf", name = "W", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "Ljava/lang/String;")
    public String field2854;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)I")
    public final int method1275(byte arg0) {
        ++field2858;
        if (arg0 > -37) {
            method1282(-38, 33, (byte) -51, -115, 79);
        }
        return (int) (255L & super.field2012 >>> 32);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)V")
    public static final void method1276(int arg0, int arg1) {
        int var2 = class148.field2314;
        ++field2868;
        int var3 = class46.field776;
        int var4 = (int) class20.field240;
        if (~var4 > ~(class230.field3731 / 256)) {
            var4 = class230.field3731 / 256;
        }
        int var5 = class104.field1666;
        if (arg0 != 6472) {
            method1284((byte) -26);
        }
        int var6 = class71.field1207;
        int var7 = class264.field4245;
        if (class195.field3155[4] && ~(class179.field2928[4] - -128) < ~var4) {
            var4 = class179.field2928[4] + 128;
        }
        int var8 = 2047 & (int) class90.field1456 + class46.field779;
        class243.method1626(var4, class163.field2646, var4 * 3 + 600, arg1, class162.field2580, true, -50 + class155.method1060((byte) -12, class56.field941, class239.field3829.field710, class239.field3829.field637), var8);
        if (~class148.field2314 == ~var2 && ~class46.field776 == ~var3 && ~class104.field1666 == ~var5 && ~class264.field4245 == ~var7 && class71.field1207 == var6) {
            class120.field1919 = 1;
        } else {
            class306.field4887 = 10;
            class215.field3555 = 10;
            if (~class104.field1666 < ~var5) {
                var5 += class215.field3555 - -((class104.field1666 - var5) * class306.field4887 / 1000);
                if (class104.field1666 > var5) {
                    class104.field1666 = var5;
                }
            }
            if (~class148.field2314 < ~var2) {
                var2 += (-var2 + class148.field2314) * class306.field4887 / 1000 + class215.field3555;
                if (~var2 > ~class148.field2314) {
                    class148.field2314 = var2;
                }
            }
            class161.field2551 = 10;
            if (class46.field776 > var3) {
                var3 += (-var3 + class46.field776) * class306.field4887 / 1000 + class215.field3555;
                if (var3 < class46.field776) {
                    class46.field776 = var3;
                }
            }
            if (var2 > class148.field2314) {
                int var9 = var2 - ((var2 - class148.field2314) * class306.field4887 / 1000 + class215.field3555);
                if (~var9 < ~class148.field2314) {
                    class148.field2314 = var9;
                }
            }
            if (var5 > class104.field1666) {
                int var10 = var5 - ((var5 - class104.field1666) * class306.field4887 / 1000 + class215.field3555);
                if (~class104.field1666 > ~var10) {
                    class104.field1666 = var10;
                }
            }
            class299.field4796 = 10;
            if (~var3 < ~class46.field776) {
                int var11 = var3 - (class215.field3555 - -((-class46.field776 + var3) * class306.field4887 / 1000));
                if (class46.field776 < var11) {
                    class46.field776 = var11;
                }
            }
            int var12 = -var6 + class71.field1207;
            if (var7 < class264.field4245) {
                var7 += class161.field2551 - -((class264.field4245 - var7) * class299.field4796 / 1000);
                if (~var7 > ~class264.field4245) {
                    class264.field4245 = var7;
                }
            }
            if (class264.field4245 < var7) {
                int var13 = var7 - (class161.field2551 - -((-class264.field4245 + var7) * class299.field4796 / 1000));
                if (~class264.field4245 > ~var13) {
                    class264.field4245 = var13;
                }
            }
            if (var12 > 1024) {
                var12 -= 2048;
            }
            if (var12 < -1024) {
                var12 += 2048;
            }
            if (var12 > 0) {
                int var14 = class161.field2551 - -(class299.field4796 * var12 / 1000) + var6;
                var6 = var14 & 2047;
            }
            if (~var12 > -1) {
                int var15 = var6 - (-var12 * class299.field4796 / 1000 + class161.field2551);
                var6 = var15 & 2047;
            }
            int var16 = -var6 + class71.field1207;
            if (var16 > 1024) {
                var16 -= 2048;
            }
            if (~var16 > 1023) {
                var16 += 2048;
            }
            if (~var16 <= -1 || ~var12 >= -1 || var16 > 0 && ~var12 > -1) {
                class71.field1207 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1277(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2860;
        int var6 = class123.method866(class85.field1409, arg3, (byte) 109, class234.field3774);
        if (!arg0) {
            int var7 = class123.method866(class85.field1409, arg1, (byte) -65, class234.field3774);
            int var8 = class123.method866(class82.field1374, arg2, (byte) 48, class259.field4188);
            int var9 = class123.method866(class82.field1374, arg4, (byte) 83, class259.field4188);
            for (int var10 = var6; ~var10 >= ~var7; ++var10) {
                class73.method494(arg5, class204.field3253[var10], 4028, var9, var8);
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
    public final void method1278(byte arg0) {
        super.field2169 = Long.MIN_VALUE & super.field2169 | class191.method1350((byte) -20) + 500L;
        int var2 = -59 % ((arg0 - 36) / 59);
        ++field2862;
        class265.field4264.method395(30985, this);
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)V")
    public final void method1279(byte arg0) {
        if (arg0 != -80) {
            method1276(-12, 24);
        }
        super.field2169 |= Long.MIN_VALUE;
        if (~this.method1285(-56) == -1L) {
            class245.field3897.method395(30985, this);
        }
        ++field2864;
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(B)I")
    public final int method1280(byte arg0) {
        if (arg0 != -119) {
            this.method1279((byte) -81);
        }
        ++field2859;
        return (int) super.field2012;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZII)V")
    public static final void method1281(boolean arg0, int arg1, int arg2) {
        ++class2.field22;
        class314.field5061.method828(104, 211);
        class314.field5061.method1122(arg1, 1162032584);
        class314.field5061.method1111((byte) -102, arg2);
        ++field2861;
        if (!arg0) {
            method1283(47, (byte) -65);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIBII)V")
    public static final void method1282(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 > 76) {
            class82.field1374 = arg1;
            class234.field3774 = arg3;
            class85.field1409 = arg4;
            class259.field4188 = arg0;
            ++field2870;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(IB)V")
    public static final void method1283(int arg0, byte arg1) {
        ++field2869;
        if (arg1 > 46) {
            class84.field1390.method1262(arg0, 2736);
        }
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(B)V")
    public static void method1284(byte arg0) {
        field2867 = null;
        if (arg0 > -78) {
            field2866 = 112;
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(II)V")
    public class175(int arg0, int arg1) {
        super.field2012 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "(I)J")
    public final long method1285(int arg0) {
        if (arg0 > -34) {
            this.field2857 = 86;
        }
        ++field2856;
        return Long.MAX_VALUE & super.field2169;
    }
}
