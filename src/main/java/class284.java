import java.io.IOException;
import java.net.Socket;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class284 {

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Lec;")
    public static class25 field4745 = new class25(64);

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4753 = Calendar.getInstance();

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field4756 = 0;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "Z")
    public static boolean field4754 = false;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "[I")
    public static int[] field4757 = new int[14];

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public static int field4755 = 0;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "[I")
    public static int[] field4748;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
    public static final void method2001(int arg0, int arg1) {
        class157.field2501 = new int[arg1];
        class216.field3446 = new int[arg1];
        class248.field3942 = new int[arg1];
        class218.field3479 = new int[arg1];
        if (arg0 != 1) {
            method2006(94);
        }
        class93.field1417 = new int[arg1];
        field4746++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2002(String arg0, int arg1) {
        field4751++;
        if (class276.field4567 == null) {
            return;
        }
        if (arg1 != 1) {
            method2006(79);
        }
        class298.field4898++;
        class276.field4572.method1391(0, 100);
        class276.field4572.method1446((byte) 49, class187.method1270((byte) -54, arg0));
        class276.field4572.method1409(arg0, (byte) 77);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2003(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4744++;
        int var7 = arg5 - arg0;
        int var8 = arg0 + arg1;
        int var9 = arg0 + arg4;
        int var10 = arg3 - arg0;
        for (int var11 = arg1; var11 < var8; var11++) {
            class71.method451(arg6, true, arg3, arg4, class130.field2005[var11]);
        }
        if (arg2 != -1112842417) {
            method2007((byte) -14, -32);
        }
        for (int var12 = arg5; var12 > var7; var12--) {
            class71.method451(arg6, true, arg3, arg4, class130.field2005[var12]);
        }
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class130.field2005[var13];
            class71.method451(arg6, true, var9, arg4, var14);
            class71.method451(arg6, true, arg3, var10, var14);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static final void method2004(int arg0) {
        field4752++;
        if (class52.field708 == 0) {
            return;
        }
        try {
            if (++field4756 > 2000) {
                if (class103.field1551 != null) {
                    class103.field1551.method1277(false);
                    class103.field1551 = null;
                }
                if (class235.field3730 >= 1) {
                    class248.field3947 = -5;
                    class52.field708 = 0;
                    return;
                }
                if (class246.field3931 == class148.field2323) {
                    class148.field2323 = class37.field486;
                } else {
                    class148.field2323 = class246.field3931;
                }
                class235.field3730++;
                class52.field708 = 1;
                field4756 = 0;
            }
            if (class52.field708 == 1) {
                class63.field947 = class259.field4254.method1776(class148.field2323, class57.field773, (byte) -75);
                class52.field708 = 2;
            }
            if (class52.field708 == 2) {
                if (class63.field947.field725 == 2) {
                    throw new IOException();
                }
                if (class63.field947.field725 != 1) {
                    return;
                }
                class103.field1551 = new class189((Socket) class63.field947.field723, class259.field4254);
                class63.field947 = null;
                class103.field1551.method1275(0, true, class276.field4572.field3272, class276.field4572.field3234);
                if (class199.field3155 != null) {
                    class199.field3155.method1152((byte) -17);
                }
                if (class60.field921 != null) {
                    class60.field921.method1152((byte) -17);
                }
                int var1 = class103.field1551.method1276(119);
                if (class199.field3155 != null) {
                    class199.field3155.method1152((byte) -17);
                }
                if (class60.field921 != null) {
                    class60.field921.method1152((byte) -17);
                }
                if (var1 != 21) {
                    class52.field708 = 0;
                    class248.field3947 = var1;
                    class103.field1551.method1277(false);
                    class103.field1551 = null;
                    return;
                }
                class52.field708 = 3;
            }
            if (class52.field708 == 3) {
                if (class103.field1551.method1283((byte) -91) < 1) {
                    return;
                }
                class146.field2298 = new String[class103.field1551.method1276(102)];
                class52.field708 = 4;
            }
            if (class52.field708 == 4) {
                if (class103.field1551.method1283((byte) -126) >= (class146.field2298.length * 8)) {
                    class192.field3042.field3272 = 0;
                    class103.field1551.method1280(true, class146.field2298.length * 8, 0, class192.field3042.field3234);
                    for (int var2 = 0; var2 < class146.field2298.length; var2++) {
                        class146.field2298[var2] = class2.method6(class192.field3042.method1430(false), (byte) 125);
                    }
                    class248.field3947 = 21;
                    class52.field708 = 0;
                    class103.field1551.method1277(false);
                    class103.field1551 = null;
                }
            } else if (arg0 >= -53) {
                method2002((String) null, -34);
            }
        } catch (IOException var3) {
            if (class103.field1551 != null) {
                class103.field1551.method1277(false);
                class103.field1551 = null;
            }
            if (class235.field3730 < 1) {
                class235.field3730++;
                field4756 = 0;
                if (class246.field3931 == class148.field2323) {
                    class148.field2323 = class37.field486;
                } else {
                    class148.field2323 = class246.field3931;
                }
                class52.field708 = 1;
            } else {
                class52.field708 = 0;
                class248.field3947 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)I")
    public static final int method2005(boolean arg0) {
        field4743++;
        return arg0 ? ((class175.field2740 ? 1 : 0) << 19) + ((class272.field4462 ? 1 : 0) << 13) + (class163.field2567 & 0x3 << 11) + ((class180.field2800 ? 1 : 0) << 10) + (((class182.field2830 ? 1 : 0) << 9) + ((class208.field3342 ? 1 : 0) << 4) + (class73.field1067 & 0x7) + ((class225.field3571 ? 1 : 0) << 3) - (-((class123.field1878 ? 1 : 0) << 5) - ((class51.field687 ? 1 : 0) << 6) - ((class12.field160 ? 1 : 0) << 7) + -((class135.field2113 ? 1 : 0) << 8) - ((class176.field2746 ? 1 : 0) << 15) - ((class143.field2228 ? 1 : 0) << 16))) + ((class132.field2028 << 17) + ((class11.field145 == 0 ? 0 : 1) << 20) + (((~class223.field3550 == -1 ? 0 : 1) << 21) - -((~class19.field257 == -1 ? 0 : 1) << 22)) - -(class77.method506() << 23)) : -98;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
    public static void method2006(int arg0) {
        if (arg0 == -1) {
            field4753 = null;
            field4757 = null;
            field4748 = null;
            field4745 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)V")
    public static final void method2007(byte arg0, int arg1) {
        field4750++;
        if (arg0 != -53) {
            method2007((byte) 13, -97);
        }
        if (class202.field3238 == 0) {
            class72.field1040.method1982(4029, arg1);
        } else {
            class231.field3705 = arg1;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZIILve;Lve;)I")
    public static final int method2008(boolean arg0, int arg1, int arg2, class203 arg3, class203 arg4) {
        field4747++;
        if (arg1 == 1) {
            int var5 = arg3.field3997;
            int var6 = arg4.field3997;
            if (!arg0) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg1 == 2) {
            return class154.method1013(arg3.method1460((byte) 12).field2526, field4755, arg4.method1460((byte) 12).field2526, 33);
        } else if (arg1 == 3) {
            if (arg3.field3283.equals("-")) {
                if (arg4.field3283.equals("-")) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field3283.equals("-")) {
                return arg0 ? 1 : -1;
            } else {
                return class154.method1013(arg3.field3283, field4755, arg4.field3283, 45);
            }
        } else if (arg1 != 4) {
            if (arg2 != -1) {
                field4754 = true;
            }
            if (arg1 == 5) {
                if (arg3.method1743(2)) {
                    return arg4.method1743(2) ? 0 : 1;
                } else if (arg4.method1743(2)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg1 == 6) {
                if (arg3.method1742((byte) 66)) {
                    return arg4.method1742((byte) 73) ? 0 : 1;
                } else if (arg4.method1742((byte) -123)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg1 != 7) {
                return arg3.field3278 - arg4.field3278;
            } else if (arg3.method1745(9)) {
                return arg4.method1745(126) ? 0 : 1;
            } else if (arg4.method1745(arg2 - 15)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3.method1747(arg2 ^ 0x20)) {
            return arg4.method1747(-33) ? 0 : 1;
        } else if (arg4.method1747(-33)) {
            return -1;
        } else {
            return 0;
        }
    }
}
