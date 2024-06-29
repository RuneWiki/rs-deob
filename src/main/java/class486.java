import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class486 extends class72 {

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "J")
    public static long field6884 = 20000000L;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
    public static int field6885;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
    public static int field6888;

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
    public static int field6890;

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "I")
    public static int field6891;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "Lkd;")
    public static class280 field6883;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V", line = 4)
    public static void method2919(byte arg0) {
        if (arg0 >= -37) {
            field6884 = 68L;
        }
        field6883 = null;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(ILcq;)V", line = 20)
    public class486(int arg0, class464 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(I)I", line = 23)
    public final int method2920(int arg0) {
        if (arg0 != 27669) {
            this.method58(55, 72);
        }
        ++field6886;
        return super.field1282;
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(II)V", line = 35)
    public static final void method2921(int arg0, int arg1) {
        class16.field222 = arg0;
        ++field6891;
        if (arg1 != 1) {
            method2921(32, 122);
        }
        class2.field16.method3048(false);
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)I", line = 47)
    public final int method60(int arg0) {
        if (arg0 != -3271) {
            field6884 = -78L;
        }
        ++field6887;
        return 1;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)I", line = 58)
    public final int method58(int arg0, int arg1) {
        if (arg1 != 11260) {
            method2919((byte) 65);
        }
        ++field6890;
        return ~arg0 != -1 && ~super.field1286.field6674.method3652(27669) != -2 ? 2 : 1;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V", line = 76)
    public final void method55(int arg0) {
        ++field6889;
        if (super.field1282 != 0 && ~super.field1286.field6674.method3652(27669) != -2) {
            super.field1282 = 0;
        }
        if (super.field1282 < 0 || super.field1282 > 1) {
            super.field1282 = this.method60(-3271);
        }
        if (arg0 < 30) {
            field6883 = null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lcq;)V", line = 95)
    public class486(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)V", line = 99)
    public final void method59(int arg0, int arg1) {
        super.field1282 = arg0;
        if (arg1 != 3) {
            field6884 = -28L;
        }
        ++field6885;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILwq;[[B)V", line = 110)
    public static final void method2922(int arg0, class166 arg1, byte[][] arg2) {
        ++field6888;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; ~arg1.field4329 < ~var4; ++var4) {
            class565.method3297(69);
            for (int var9 = 0; var9 < class174.field2540 >> 3; ++var9) {
                for (int var10 = 0; ~(class716.field9999 >> 3) < ~var10; ++var10) {
                    int var11 = class247.field3464[var4][var9][var10];
                    if (~var11 != 0) {
                        int var12 = (var11 & 64089113) >> 24;
                        if (!arg1.field4309 || ~var12 == -1) {
                            int var13 = var11 >> 1 & 3;
                            int var14 = (var11 & 16768882) >> 14;
                            int var15 = var11 >> 3 & 2047;
                            int var16 = (var14 / 8 << 8) + var15 / 8;
                            for (int var17 = 0; class412.field5705.length > var17; ++var17) {
                                if (class412.field5705[var17] == var16 && arg2[var17] != null) {
                                    class35 var18 = new class35(arg2[var17]);
                                    arg1.method1988(class630.field9041, var12, (byte) -49, var13, var14, var10 * 8, var9 * 8, var18, var15, var4);
                                    arg1.method1236(var12, var13, (byte) 106, class359.field5046, var4, var9 * 8, var10 * 8, var14, var18, var15, var3[0] != -1 ? null : var3);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var5 = 0; var5 < arg1.field4329; ++var5) {
            class565.method3297(91);
            for (int var6 = 0; class174.field2540 >> 3 > var6; ++var6) {
                for (int var7 = 0; var7 < class716.field9999 >> 3; ++var7) {
                    int var8 = class247.field3464[var5][var6][var7];
                    if (var8 == -1) {
                        arg1.method1979((byte) 126, var7 * 8, var5, var6 * 8, 8, 8);
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class576.field8161 = class206.field2944.method2958(class569.field8108, var3[0], var3[1], var3[3], var3[2], (byte) 20);
            class747.field10446 = var3[4];
        }
        if (arg0 < 50) {
            field6883 = null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "(I)Z", line = 225)
    public final boolean method2923(int arg0) {
        ++field6882;
        if (arg0 <= 97) {
            method2919((byte) 78);
        }
        return true;
    }
}
