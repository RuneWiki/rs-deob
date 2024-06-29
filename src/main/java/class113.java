import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class113 extends class217 {

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static volatile int field1776 = -1;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "Z")
    public static boolean field1784 = false;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public static int field1779 = 0;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
    public static int field1783 = 0;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public int field1774;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public int field1780;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
    public int field1782;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "Llb;")
    public static class211 field1775;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V", line = 5)
    public static void method885(int arg0) {
        if (arg0 != -241468758) {
            method886(-73, (class184) null);
        }
        field1775 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILek;)V", line = 16)
    public static final void method886(int arg0, class184 arg1) {
        field1778++;
        if (arg0 >= -3) {
            field1779 = 67;
        }
        class184 var2 = class270.method1878(-14103, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class210.field3314;
            var4 = class125.field1972;
        } else {
            var3 = var2.field2904;
            var4 = var2.field2890;
        }
        class121.method927(var4, (byte) 69, arg1, false, var3);
        class235.method1652(var3, var4, (byte) 24, arg1);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lek;Z)V", line = 53)
    public static final void method887(class184 arg0, boolean arg1) {
        int var2 = arg0.field2881;
        field1773++;
        if (var2 == 324) {
            if (class137.field2142 == -1) {
                class150.field2265 = arg0.field2819;
                class137.field2142 = arg0.field2931;
            }
            if (class317.field4922.field3553) {
                arg0.field2931 = class137.field2142;
            } else {
                arg0.field2931 = class150.field2265;
            }
        } else if (var2 == 325) {
            if (class137.field2142 == -1) {
                class137.field2142 = arg0.field2931;
                class150.field2265 = arg0.field2819;
            }
            if (class317.field4922.field3553) {
                arg0.field2931 = class150.field2265;
            } else {
                arg0.field2931 = class137.field2142;
            }
        } else if (var2 == 327) {
            arg0.field2941 = 150;
            arg0.field2878 = (int) (Math.sin((double) class312.field4852 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2798 = -1;
            arg0.field2930 = 5;
        } else if (var2 == 328) {
            if (class235.field3602.field1895 == null) {
                arg0.field2798 = 0;
            } else {
                arg0.field2941 = 150;
                arg0.field2878 = (int) (Math.sin((double) class312.field4852 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field2930 = 5;
                arg0.field2798 = ((int) class224.method1597(arg1, class235.field3602.field1895) << 11) + 2047;
                arg0.field2925 = class235.field3602.field4436;
                arg0.field2905 = class235.field3602.field4460;
                arg0.field2950 = class235.field3602.field4527;
                arg0.field2892 = 0;
            }
        } else if (!arg1) {
            field1783 = -54;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)I", line = 129)
    public static final int method888(byte arg0, int arg1) {
        field1781++;
        if (arg0 != 6) {
            method886(60, (class184) null);
        }
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V", line = 147)
    public static final void method889(int arg0, int arg1) {
        field1785++;
        if (class305.field4771 == arg1) {
            return;
        }
        if (class305.field4771 == 0) {
            class40.method359((byte) -56);
        }
        if (arg1 == 40) {
            class126.method955(-73);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg1 != 40 && class182.field2727 != null) {
            class182.field2727.method916(-25224);
            class182.field2727 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class163.field2427 = 0;
            class302.field4725 = 1;
            class78.field1102 = 1;
            class55.field824 = 0;
            class78.field1097 = 0;
            class208.method1485(128, true);
        }
        if (arg1 == 25 || arg1 == 10) {
            class310.method2146(-126);
        }
        if (arg1 == 5) {
            class257.method1789(115, class80.field1118);
        } else {
            class161.method1158(4);
        }
        boolean var3 = class305.field4771 == 5 || class305.field4771 == 10 || class305.field4771 == 28;
        if (var3 != var2) {
            if (var2) {
                class287.field4422 = class232.field3584;
                if (class170.field2536 == 0) {
                    class211.method1526(2, -1);
                } else {
                    class227.method1612(class232.field3584, 2, false, true, class178.field2663, 255, 0);
                }
                class110.field1746.method47(false, false);
            } else {
                class211.method1526(2, -1);
                class110.field1746.method47(true, false);
            }
        }
        if (class36.field534 && (arg1 == 25 || arg1 == 28 || arg1 == 40)) {
            class36.method338();
        }
        class305.field4771 = arg1;
        if (arg0 < 84) {
            field1784 = true;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIII)V", line = 233)
    public static final void method890(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 100) {
            field1776 = -41;
        }
        if (arg4 <= arg3) {
            class138.method1047(arg1, arg3, arg4, 7, class320.field4990[arg0]);
        } else {
            class138.method1047(arg1, arg4, arg3, 7, class320.field4990[arg0]);
        }
        field1777++;
    }
}
