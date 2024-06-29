import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class98 extends class133 {

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "Ljava/lang/String;")
    public static String field1570 = "wave:";

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "[I")
    public static int[] field1567 = new int[50];

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "Lnf;")
    public static class162 field1571 = new class162(4);

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
    public static int field1573 = 0;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "[Lha;")
    public static class31[] field1575 = new class31[2048];

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    public static int field1576 = 0;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public int field1565;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "Lub;")
    public static class92 field1574;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "Ljava/lang/String;")
    public String field1562;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "Ljava/lang/String;")
    public String field1572;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(I)V")
    public static void method762(int arg0) {
        field1574 = null;
        field1571 = null;
        field1570 = null;
        field1567 = null;
        field1575 = null;
        if (arg0 != 33) {
            method765(19, -22, (class95) null, -32, -78);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZII)Lp;")
    public static final class303 method763(boolean arg0, int arg1, int arg2) {
        ++field1563;
        for (class303 var3 = (class303) class112.field1719.method2049(0); var3 != null; var3 = (class303) class112.field1719.method2047(-99)) {
            if (var3.field4884 && var3.method2034(false, arg1, arg2)) {
                return var3;
            }
        }
        if (arg0) {
            field1573 = 27;
        }
        return null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IILkc;IIII)V")
    public static final void method764(int arg0, int arg1, class296 arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1569;
        class284.method1914(arg2.field4709, arg5, arg6, arg2.field4725, arg1, arg4, arg0, arg3);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IILbi;II)V")
    public static final void method765(int arg0, int arg1, class95 arg2, int arg3, int arg4) {
        ++field1568;
        if (class14.field174 < 400) {
            if (arg2.field1547 != null) {
                arg2 = arg2.method741(103);
            }
            if (arg2 != null) {
                if (arg2.field1518) {
                    String var5 = arg2.field1497;
                    if (~arg2.field1509 != -1) {
                        String var6 = class152.field2248 == 1 ? class49.field811 : class253.field4044;
                        var5 = var5 + class78.method613(-18652, arg2.field1509, class263.field4168.field2052) + " (" + var6 + arg2.field1509 + ")";
                    }
                    if (~class173.field2658 != -2) {
                        if (class162.field2438) {
                            class238 var7 = ~class149.field2213 == 0 ? null : class55.method463(0, class149.field2213);
                            if (~(class28.field486 & 2) != -1 && (var7 == null || arg2.method742(4209, var7.field3753, class149.field2213) != var7.field3753)) {
                                ++class59.field943;
                                class41.method365((short) 41, class203.field3131, (byte) -89, (long) arg3, class202.field3119 + " -> <col=ffff00>" + var5, class201.field3104, arg4, arg0);
                            }
                        } else {
                            ++class162.field2440;
                            String[] var8 = arg2.field1543;
                            if (class221.field3382) {
                                var8 = class200.method1414(-51, var8);
                            }
                            if (var8 != null) {
                                for (int var9 = 4; ~var9 <= -1; --var9) {
                                    if (var8[var9] != null && (class152.field2248 != 0 || !var8[var9].equalsIgnoreCase(class259.field4110))) {
                                        ++class134.field2013;
                                        byte var10 = 0;
                                        int var11 = -1;
                                        if (~var9 == -1) {
                                            var10 = 9;
                                        }
                                        if (arg2.field1508 == var9) {
                                            var11 = arg2.field1515;
                                        }
                                        if (var9 == 1) {
                                            var10 = 24;
                                        }
                                        if (~arg2.field1514 == ~var9) {
                                            var11 = arg2.field1527;
                                        }
                                        if (var9 == 2) {
                                            var10 = 33;
                                        }
                                        if (~var9 == -4) {
                                            var10 = 45;
                                        }
                                        if (~var9 == -5) {
                                            var10 = 44;
                                        }
                                        class41.method365(var10, var11, (byte) -89, (long) arg3, "<col=ffff00>" + var5, var8[var9], arg4, arg0);
                                    }
                                }
                            }
                            if (class152.field2248 == 0 && var8 != null) {
                                for (int var12 = 4; var12 >= 0; --var12) {
                                    if (var8[var12] != null && var8[var12].equalsIgnoreCase(class259.field4110)) {
                                        ++class78.field1188;
                                        short var13 = 0;
                                        if (~class263.field4168.field2052 > ~arg2.field1509) {
                                            var13 = 2000;
                                        }
                                        short var14 = 0;
                                        if (~var12 == -1) {
                                            var14 = 9;
                                        }
                                        if (var12 == 1) {
                                            var14 = 24;
                                        }
                                        if (var12 == 2) {
                                            var14 = 33;
                                        }
                                        if (~var12 == -4) {
                                            var14 = 45;
                                        }
                                        if (~var12 == -5) {
                                            var14 = 44;
                                        }
                                        if (var14 != 0) {
                                            var14 += var13;
                                        }
                                        class41.method365(var14, arg2.field1520, (byte) -89, (long) arg3, "<col=ffff00>" + var5, var8[var12], arg4, arg0);
                                    }
                                }
                            }
                            class41.method365((short) 1006, class37.field631, (byte) -89, (long) arg3, "<col=ffff00>" + var5, class264.field4179, arg4, arg0);
                        }
                    } else {
                        ++class92.field1453;
                        class41.method365((short) 43, class265.field4194, (byte) -89, (long) arg3, class202.field3120 + " -> <col=ffff00>" + var5, class196.field3067, arg4, arg0);
                    }
                    if (arg1 != -11946) {
                        field1567 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(B)Lpj;")
    public final class265 method766(byte arg0) {
        ++field1564;
        if (arg0 != -121) {
            field1567 = null;
        }
        return class156.field2335[super.field2000];
    }
}
