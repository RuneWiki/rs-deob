import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class184 extends class409 {

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "I")
    public int field2466 = -1;

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field2473 = new String[8];

    @OriginalMember(owner = "client!rr", name = "C", descriptor = "I")
    public static int field2479 = 0;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!rr", name = "z", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!rr", name = "B", descriptor = "I")
    public int field2478;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "Lir;")
    public static class185 field2465;

    @OriginalMember(owner = "client!rr", name = "y", descriptor = "Lir;")
    public static class185 field2475;

    @OriginalMember(owner = "client!rr", name = "A", descriptor = "Lvc;")
    public static class225 field2477;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "Ljava/lang/String;")
    public String field2467;

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "Ljava/lang/String;")
    public String field2474;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "[I")
    public static int[] field2464;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V", line = 8)
    public static void method1193(int arg0) {
        field2473 = null;
        field2464 = null;
        field2477 = null;
        field2475 = null;
        if (arg0 == 0) {
            field2465 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZLkg;)V", line = 22)
    public static final void method1194(boolean arg0, class317 arg1) {
        ++field2471;
        if (~class402.field5874 > -401) {
            if (arg0) {
                if (class383.field5609 != arg1) {
                    String var2;
                    if (arg1.field4662 != 0) {
                        var2 = arg1.method2078(2047, true) + " (" + class20.field359 + arg1.field4662 + ")";
                    } else {
                        boolean var3 = true;
                        if (~class383.field5609.field4652 != 0 && arg1.field4652 != -1) {
                            int var4 = arg1.field4661 < class383.field5609.field4661 ? class383.field5609.field4661 : arg1.field4661;
                            int var5 = ~arg1.field4652 >= ~class383.field5609.field4652 ? arg1.field4652 : class383.field5609.field4652;
                            int var6 = 5 - (-(var4 * 10 / 100) + -var5);
                            int var7 = class383.field5609.field4661 - arg1.field4661;
                            if (var7 < 0) {
                                var7 = -var7;
                            }
                            if (var6 < var7) {
                                var3 = false;
                            }
                        }
                        String var8 = ~class396.field5783 != -2 ? class104.field1358 : class7.field97;
                        if (arg1.field4670 > arg1.field4661) {
                            var2 = arg1.method2078(2047, true) + (!var3 ? "<col=ffffff>" : class1.method1(arg1.field4661, -4725, class383.field5609.field4661)) + " (" + var8 + arg1.field4661 + "+" + (-arg1.field4661 + arg1.field4670) + ")";
                        } else {
                            var2 = arg1.method2078(2047, true) + (!var3 ? "<col=ffffff>" : class1.method1(arg1.field4661, -4725, class383.field5609.field4661)) + " (" + var8 + arg1.field4661 + ")";
                        }
                    }
                    if (~class117.field1526 != -2) {
                        if (!class263.field3862) {
                            for (int var9 = 7; ~var9 <= -1; --var9) {
                                if (field2473[var9] != null) {
                                    short var10 = 0;
                                    if (class396.field5783 == 0 && field2473[var9].equalsIgnoreCase(class447.field6444)) {
                                        if (class383.field5609.field4661 < arg1.field4661) {
                                            var10 = 2000;
                                        }
                                        if (class383.field5609.field4663 != 0 && arg1.field4663 != 0) {
                                            if (class383.field5609.field4663 != arg1.field4663) {
                                                var10 = 0;
                                            } else {
                                                var10 = 2000;
                                            }
                                        }
                                    } else if (class116.field1507[var9]) {
                                        var10 = 2000;
                                    }
                                    short var11 = (short) (class296.field4469[var9] + var10);
                                    int var12 = class170.field2305[var9] != -1 ? class170.field2305[var9] : class357.field5289;
                                    ++class160.field2094;
                                    class24.method213(0, field2473[var9], "<col=ffffff>" + var2, var12, (byte) 103, (long) arg1.field2183, 0, var11);
                                }
                            }
                        } else if ((class45.field682 & 8) != 0) {
                            class24.method213(0, class298.field4505, class396.field5787 + " -> <col=ffffff>" + var2, class388.field5685, (byte) 99, (long) arg1.field2183, 0, 34);
                            ++class396.field5789;
                        }
                    } else {
                        class24.method213(0, class429.field6239, class369.field5455 + " -> <col=ffffff>" + var2, class407.field5935, (byte) 103, (long) arg1.field2183, 0, 48);
                        ++class95.field1297;
                    }
                    for (class138 var13 = (class138) class186.field2547.method1575(0); var13 != null; var13 = (class138) class186.field2547.method1573((byte) -128)) {
                        if (~var13.field1777 == -26) {
                            var13.field1785 = "<col=ffffff>" + var2;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)V", line = 166)
    public static final void method1195(byte arg0) {
        class117.field1529.method473(((float) class378.field5531 * 0.1F + 0.7F) * class126.field1645);
        ++field2462;
        class117.field1529.method488(class132.field1725, class384.field5617, class301.field4540, (float) class321.field4785, (float) class290.field4392, (float) class132.field1735);
        int var1 = 109 % ((65 - arg0) / 51);
        class117.field1529.method441(class422.field6134);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lde;IIIII)Ljava/awt/Frame;", line = 178)
    public static final Frame method1196(class364 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 <= 111) {
            return null;
        } else {
            ++field2470;
            if (!arg0.method2390(-57)) {
                return null;
            } else {
                if (~arg5 == -1) {
                    class131[] var6 = class132.method945(false, arg0);
                    if (var6 == null) {
                        return null;
                    }
                    boolean var7 = false;
                    for (int var8 = 0; var8 < var6.length; ++var8) {
                        if (var6[var8].field1720 == arg3 && ~var6[var8].field1715 == ~arg4 && (~arg1 == -1 || var6[var8].field1719 == arg1) && (!var7 || var6[var8].field1716 > arg5)) {
                            var7 = true;
                            arg5 = var6[var8].field1716;
                        }
                    }
                    if (!var7) {
                        return null;
                    }
                }
                class225 var9 = arg0.method2403(arg1, arg5, arg4, arg3, (byte) 114);
                while (var9.field3104 == 0) {
                    class31.method245(10L, -63);
                }
                Frame var10 = (Frame) var9.field3105;
                if (var10 == null) {
                    return null;
                } else if (~var9.field3104 == -3) {
                    class90.method718(var10, arg0, -16783);
                    return null;
                } else {
                    return var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(I)Lum;", line = 259)
    public final class322 method1197(int arg0) {
        ++field2468;
        return arg0 != -1 ? null : class242.field3401[super.field5949];
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIII)V", line = 272)
    public static final void method1198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 2000) {
            field2465 = null;
        }
        ++field2476;
        if (~arg2 <= ~class240.field3368 && class136.field1769 >= arg1 && ~arg0 <= ~class157.field1981 && ~arg4 >= ~class312.field4602) {
            class326.method2138(arg4, arg3, arg1, arg2, arg0, (byte) -123);
        } else {
            class86.method696(arg2, arg4, -1, arg3, arg1, arg0);
        }
    }
}
