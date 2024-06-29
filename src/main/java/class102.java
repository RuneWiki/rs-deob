import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class102 extends class152 {

    @OriginalMember(owner = "client!ok", name = "V", descriptor = "Lce;")
    public static class126 field1635 = class206.method1445(-7923, "null");

    @OriginalMember(owner = "client!ok", name = "Y", descriptor = "I")
    public static int field1638 = 0;

    @OriginalMember(owner = "client!ok", name = "X", descriptor = "Lce;")
    public static class126 field1637 = class206.method1445(-7923, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!ok", name = "bb", descriptor = "Lce;")
    public static class126 field1641 = class206.method1445(-7923, "blaugr-Un:");

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!ok", name = "S", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!ok", name = "U", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!ok", name = "W", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!ok", name = "Z", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!ok", name = "ab", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!ok", name = "cb", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V", line = 6)
    public class102() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLwd;)V", line = 16)
    public static final void method696(byte arg0, class112 arg1) {
        int var2 = arg1.field1885;
        field1634++;
        if (var2 == 324) {
            if (class32.field441 == -1) {
                class218.field3664 = arg1.field1872;
                class32.field441 = arg1.field1795;
            }
            if (class19.field259.field4060) {
                arg1.field1795 = class32.field441;
            } else {
                arg1.field1795 = class218.field3664;
            }
        } else if (var2 == 325) {
            if (class32.field441 == -1) {
                class218.field3664 = arg1.field1872;
                class32.field441 = arg1.field1795;
            }
            if (class19.field259.field4060) {
                arg1.field1795 = class218.field3664;
            } else {
                arg1.field1795 = class32.field441;
            }
        } else if (var2 == 327) {
            arg1.field1843 = 150;
            arg1.field1891 = (int) (Math.sin((double) class249.field4174 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field1800 = 5;
            arg1.field1774 = -1;
        } else if (var2 == 328) {
            if (class286.field4744.field5019 == null) {
                arg1.field1774 = 0;
            } else {
                arg1.field1843 = 150;
                arg1.field1891 = (int) (Math.sin((double) class249.field4174 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field1800 = 5;
                arg1.field1774 = ((int) class286.field4744.field5019.method845((byte) -122) << 11) + 2047;
                arg1.field1824 = class286.field4744.field2501;
                arg1.field1793 = class286.field4744.field2503;
            }
        } else if (arg0 != 86) {
            field1637 = (class126) null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLui;)V", line = 98)
    public static final void method697(byte arg0, class89 arg1) {
        field1632++;
        for (class314 var2 = (class314) class82.field1322.method898(arg0); var2 != null; var2 = (class314) class82.field1322.method893((byte) 94)) {
            if (var2.field5379 == arg1) {
                if (var2.field5382 != null) {
                    class278.field4633.method562(var2.field5382);
                    var2.field5382 = null;
                }
                var2.method499((byte) 64);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIII)V", line = 133)
    public static final void method698(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1636++;
        if (class56.field846) {
            class101.method687(arg1, arg3, arg0 + arg1, arg2 + arg3);
            class101.method689(arg1, arg3, arg0, arg2, 0);
        } else {
            class276.method1862(arg1, arg3, arg0 + arg1, arg2 + arg3);
            class276.method1844(arg1, arg3, arg0, arg2, 0);
        }
        if (class300.field4975 < 100) {
            return;
        }
        if (class318.field5449 == null || class318.field5449.field4595 != arg0 || class318.field5449.field4601 != arg2) {
            class184 var5 = new class184(arg0, arg2);
            class276.method1864(var5.field3196, arg0, arg2);
            class202.method1425(0, class36.field521, class143.field2602, arg2, -1717555696, arg0, 0, 0, 0);
            if (class56.field846) {
                class318.field5449 = new class198(var5);
            } else {
                class318.field5449 = var5;
            }
            if (class56.field846) {
                class276.field4626 = null;
            } else {
                class106.field1668.method137((byte) -127);
            }
        }
        class318.field5449.method1332(arg1, arg3);
        int var6 = arg1 + (class227.field3836 * arg0 / class36.field521);
        int var7 = class286.field4738 * arg2 / class143.field2602;
        int var8 = class273.field4602 * arg2 / class143.field2602 + arg3;
        if (arg4 != 0) {
            field1637 = (class126) null;
        }
        int var9 = class226.field3805 * arg0 / class36.field521;
        int var10 = 16711680;
        if (class23.field335 == 1) {
            var10 = 16777215;
        }
        if (class56.field846) {
            class101.method695(var6, var8, var9, var7, var10, 128);
            class101.method681(var6, var8, var9, var7, var10);
        } else {
            class276.method1853(var6, var8, var9, var7, var10, 128);
            class276.method1842(var6, var8, var9, var7, var10);
        }
        if (class98.field1574 <= 0 || (class98.field1574 % 10) >= 5) {
            return;
        }
        for (class231 var11 = (class231) class7.field84.method898((byte) -121); var11 != null; var11 = (class231) class7.field84.method893((byte) -66)) {
            if (class91.field1435 == var11.field3880) {
                int var12 = var11.field3883 * arg0 / class36.field521 + arg1;
                int var13 = arg3 + (var11.field3878 * arg2 / class143.field2602);
                if (class56.field846) {
                    class101.method689(var12 - 2, var13 + -2, 4, 4, 16776960);
                } else {
                    class276.method1844(var12 - 2, var13 - 2, 4, 4, 16776960);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(B)V", line = 229)
    public static void method699(byte arg0) {
        field1635 = null;
        if (arg0 != 54) {
            method699((byte) 105);
        }
        field1641 = null;
        field1637 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZI)[I", line = 250)
    public final int[] method6(boolean arg0, int arg1) {
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        field1631++;
        if (!arg0) {
            this.method6(true, -93);
        }
        if (this.field2776.field4516) {
            class230.method1565(var3, 0, class244.field4133, class122.field2038[arg1]);
        }
        return var3;
    }
}
