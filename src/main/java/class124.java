import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class124 extends class287 {

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "[I")
    public int[] field1784 = new int[5];

    @OriginalMember(owner = "client!sm", name = "y", descriptor = "[Lv;")
    public class263[] field1783 = new class263[5];

    @OriginalMember(owner = "client!sm", name = "G", descriptor = "I")
    public int field1791 = 0;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
    public int field1776;

    @OriginalMember(owner = "client!sm", name = "I", descriptor = "I")
    public int field1793;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
    public int field1777;

    @OriginalMember(owner = "client!sm", name = "L", descriptor = "I")
    public int field1796;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "[Z")
    public static boolean[] field1771 = new boolean[100];

    @OriginalMember(owner = "client!sm", name = "B", descriptor = "I")
    public static int field1786 = -1;

    @OriginalMember(owner = "client!sm", name = "M", descriptor = "I")
    public static int field1797 = 0;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "I")
    public int field1780;

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "I")
    public int field1781;

    @OriginalMember(owner = "client!sm", name = "F", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!sm", name = "J", descriptor = "I")
    public int field1794;

    @OriginalMember(owner = "client!sm", name = "K", descriptor = "I")
    public int field1795;

    @OriginalMember(owner = "client!sm", name = "N", descriptor = "I")
    public int field1798;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "Lig;")
    public class102 field1775;

    @OriginalMember(owner = "client!sm", name = "x", descriptor = "Lsm;")
    public class124 field1782;

    @OriginalMember(owner = "client!sm", name = "D", descriptor = "Lne;")
    public class138 field1788;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "Lak;")
    public class153 field1774;

    @OriginalMember(owner = "client!sm", name = "E", descriptor = "Ltc;")
    public class154 field1789;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "Lug;")
    public static class253 field1770;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "Lof;")
    public class283 field1779;

    @OriginalMember(owner = "client!sm", name = "C", descriptor = "Ljk;")
    public class289 field1787;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "Z")
    public boolean field1778;

    @OriginalMember(owner = "client!sm", name = "A", descriptor = "Z")
    public boolean field1785;

    @OriginalMember(owner = "client!sm", name = "H", descriptor = "Z")
    public boolean field1792;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method905(boolean arg0) {
        if (!arg0) {
            method905(false);
        }
        field1772++;
        if (class52.field665 == 0) {
            return;
        }
        try {
            if (++class46.field605 > 2000) {
                if (class275.field4247 != null) {
                    class275.field4247.method218(true);
                    class275.field4247 = null;
                }
                if (class2.field24 >= 1) {
                    class150.field2354 = -5;
                    class52.field665 = 0;
                    return;
                }
                class46.field605 = 0;
                if (class334.field5197 == class277.field4286) {
                    class277.field4286 = class21.field316;
                } else {
                    class277.field4286 = class334.field5197;
                }
                class52.field665 = 1;
                class2.field24++;
            }
            if (class52.field665 == 1) {
                class1.field7 = class42.field581.method1011(class9.field170, class277.field4286, (byte) -8);
                class52.field665 = 2;
            }
            if (class52.field665 == 2) {
                if (class1.field7.field1595 == 2) {
                    throw new IOException();
                }
                if (class1.field7.field1595 != 1) {
                    return;
                }
                class275.field4247 = new class22((Socket) class1.field7.field1591, class42.field581);
                class1.field7 = null;
                class275.field4247.method221(91, class183.field2965.field115, 0, class183.field2965.field111);
                if (class97.field1278 != null) {
                    class97.field1278.method1774(-104);
                }
                if (class26.field388 != null) {
                    class26.field388.method1774(-100);
                }
                int var1 = class275.field4247.method214((byte) 83);
                if (class97.field1278 != null) {
                    class97.field1278.method1774(-121);
                }
                if (class26.field388 != null) {
                    class26.field388.method1774(-114);
                }
                if (var1 != 21) {
                    class150.field2354 = var1;
                    class52.field665 = 0;
                    class275.field4247.method218(true);
                    class275.field4247 = null;
                    return;
                }
                class52.field665 = 3;
            }
            if (class52.field665 == 3) {
                if (class275.field4247.method217(30000) < 1) {
                    return;
                }
                class339.field5297 = new String[class275.field4247.method214((byte) 83)];
                class52.field665 = 4;
            }
            if (class52.field665 == 4) {
                if (class275.field4247.method217(30000) < (class339.field5297.length * 8)) {
                    return;
                }
                class111.field1544.field111 = 0;
                class275.field4247.method219(class339.field5297.length * 8, 0, class111.field1544.field115, (byte) 24);
                for (int var2 = 0; var2 < class339.field5297.length; var2++) {
                    class339.field5297[var2] = class76.method568(class111.field1544.method37(-1513731168), (byte) -67);
                }
                class52.field665 = 0;
                class150.field2354 = 21;
                class275.field4247.method218(arg0);
                class275.field4247 = null;
                return;
            }
        } catch (IOException var4) {
            if (class275.field4247 != null) {
                class275.field4247.method218(true);
                class275.field4247 = null;
            }
            if (class2.field24 < 1) {
                class52.field665 = 1;
                class2.field24++;
                if (class334.field5197 == class277.field4286) {
                    class277.field4286 = class21.field316;
                } else {
                    class277.field4286 = class334.field5197;
                }
                class46.field605 = 0;
            } else {
                class52.field665 = 0;
                class150.field2354 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V", line = 162)
    public static void method906(int arg0) {
        field1771 = null;
        if (arg0 == -22) {
            field1770 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(III)V", line = 177)
    public class124(int arg0, int arg1, int arg2) {
        this.field1776 = arg1;
        this.field1793 = arg2;
        this.field1796 = this.field1777 = arg0;
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(I)V", line = 200)
    public static final void method907(int arg0) {
        field1790++;
        for (class116 var1 = (class116) class314.field4913.method22((byte) 125); var1 != null; var1 = (class116) class314.field4913.method26((byte) -119)) {
            class99 var2 = var1.field1617;
            if (class154.field2392 != var2.field1313 || class229.field3595 > var2.field1319) {
                var1.method2028(13329);
            } else if (class229.field3595 >= var2.field1297) {
                if (var2.field1300 > 0) {
                    class212 var3 = class59.field870[var2.field1300 - 1];
                    if (var3 != null && var3.field4698 >= 0 && var3.field4698 < 13312 && var3.field4731 >= 0 && var3.field4731 < 13312) {
                        var2.method693(class320.method2245((byte) -91, var3.field4731, var2.field1313, var3.field4698) - var2.field1310, (byte) 77, var3.field4731, var3.field4698, class229.field3595);
                    }
                }
                if (var2.field1300 < 0) {
                    int var4 = -var2.field1300 - 1;
                    class337 var5;
                    if (class92.field1231 == var4) {
                        var5 = class146.field2310;
                    } else {
                        var5 = class284.field4403[var4];
                    }
                    if (var5 != null && var5.field4698 >= 0 && var5.field4698 < 13312 && var5.field4731 >= 0 && var5.field4731 < 13312) {
                        var2.method693(class320.method2245((byte) -20, var5.field4731, var2.field1313, var5.field4698) - var2.field1310, (byte) 127, var5.field4731, var5.field4698, class229.field3595);
                    }
                }
                var2.method694(class153.field2373, true);
                class6.method94(class154.field2392, (int) var2.field1298, (int) var2.field1312, (int) var2.field1318, 60, var2, var2.field1301, -1L, false);
            }
        }
        int var6 = 36 % ((arg0 - 57) / 37);
    }
}
