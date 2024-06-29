import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class85 extends class260 {

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "Loh;")
    public static class263 field1675 = class253.method1681(-118, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!jd", name = "L", descriptor = "Z")
    public static boolean field1670 = false;

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "Loh;")
    public static class263 field1676 = class253.method1681(-128, "<col=ff7000>");

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "I")
    public static int field1679 = 0;

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "I")
    public static int field1677 = 1;

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "I")
    public static int field1681 = 0;

    @OriginalMember(owner = "client!jd", name = "M", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!jd", name = "N", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIZZIIZZ)Lw;")
    public static final class141 method567(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field1671++;
        class72 var8 = class92.method649(-32508, arg5);
        if (arg4 > 1 && var8.field1469 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field1445[var10] <= arg4 && var8.field1445[var10] != 0) {
                    var9 = var8.field1469[var10];
                }
            }
            if (var9 != -1) {
                var8 = class92.method649(-32508, var9);
            }
        }
        class167 var11 = var8.method459(0);
        if (var11 == null) {
            return null;
        }
        class140 var12 = null;
        if (var8.field1507 != -1) {
            var12 = (class140) method567(0, 1, true, false, 10, var8.field1478, false, true);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field1511 != -1) {
            var12 = (class140) method567(arg0, arg1, true, false, arg4, var8.field1477, false, false);
            if (var12 == null) {
                return null;
            }
        }
        int var13 = class133.field2442;
        int[] var14 = new int[4];
        int[] var15 = class133.field2445;
        int var16 = class133.field2449;
        class133.method869(var14);
        class140 var17 = new class140(36, 32);
        class133.method878(var17.field2571, 36, 32);
        class270.method1831();
        class270.method1829(16, 16);
        int var18 = var8.field1448;
        class270.field4759 = arg3;
        if (arg7) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg1 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class270.field4762[var8.field1459] * var18 >> 16;
        int var20 = class270.field4769[var8.field1459] * var18 >> 16;
        var11.method502(0, var8.field1492, var8.field1440, var8.field1459, var8.field1505, (var20 + var8.field1456) - (var11.method106() / 2), var19 - -var8.field1456);
        if (arg1 >= 1) {
            var17.method916(1);
            if (arg1 >= 2) {
                var17.method916(16777215);
            }
            class133.method878(var17.field2571, 36, 32);
        }
        if (arg0 != 0) {
            var17.method918(arg0);
        }
        if (var8.field1507 != -1) {
            var12.method929(0, 0);
        } else if (var8.field1511 != -1) {
            class133.method878(var12.field2571, 36, 32);
            var17.method929(0, 0);
            var17 = var12;
        }
        if (arg6 && (var8.field1487 == 1 || arg4 != 1) && arg4 != -1) {
            class89.field1771.method411(class189.method1241(-91, arg4), 0, 9, 16776960, 1);
        }
        class133.method878(var15, var13, var16);
        class133.method863(var14);
        class270.method1831();
        class270.field4759 = true;
        return var17;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class85() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZIIIIZI)V")
    public static final void method568(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field1680++;
        if (arg2 == 3) {
            method568(true, arg1, class107.field2027, -1, -1, true, -7415);
            return;
        }
        Container var7;
        if (class90.field1774 != null) {
            var7 = class90.field1774;
        } else if (class130.field2381 == null) {
            var7 = class95.field1867.field4557;
        } else {
            var7 = class130.field2381;
        }
        class195.field3527 = var7.getSize().width;
        class225.field3964 = var7.getSize().height;
        if (class130.field2381 == var7) {
            Insets var8 = class130.field2381.getInsets();
            class225.field3964 -= var8.top + var8.bottom;
            class195.field3527 -= var8.right + var8.left;
        }
        if (arg2 >= 2) {
            class114.field2138 = 0;
            class200.field3621 = 0;
            class143.field2616 = class225.field3964;
            class138.field2558 = class195.field3527;
        } else {
            class143.field2616 = 503;
            class114.field2138 = (class195.field3527 - 765) / 2;
            class200.field3621 = 0;
            class138.field2558 = 765;
        }
        if (arg0) {
            class159.method1051((byte) 104, class202.field3648);
            class82.method549(arg6 + 7532, class202.field3648);
            if (class72.field1466 != null) {
                class72.field1466.method194(class202.field3648, 16);
            }
            class233.field4074.method78(-94);
            class122.method790(class202.field3648, (byte) -87);
            class40.method254((byte) -54, class202.field3648);
            if (class72.field1466 != null) {
                class72.field1466.method200(16, class202.field3648);
            }
        } else {
            class202.field3648.setSize(class138.field2558, class143.field2616);
            if (class130.field2381 == var7) {
                Insets var9 = class130.field2381.getInsets();
                class202.field3648.setLocation(class114.field2138 + var9.left, class200.field3621 + var9.top);
            } else {
                class202.field3648.setLocation(class114.field2138, class200.field3621);
            }
        }
        if (arg2 > 0) {
            method568(true, arg1, 0, -1, -1, true, arg6);
            return;
        }
        class40.field897 = !class77.method526(-26670);
        if (class186.field3353 != -1) {
            class82.method553(-32768, true);
        }
        if (class166.field3023 != null && (class271.field4786 == 30 || class271.field4786 == 25)) {
            class148.method973(arg6 + 7335);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class21.field629[var10] = true;
        }
        class125.field2292 = true;
        if (arg6 != -7415) {
            field1678 = 84;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Loh;B)Loh;")
    public static final class263 method569(class263 arg0, byte arg1) {
        if (arg1 == -86) {
            field1672++;
            int var2 = class183.method1213(29370, arg0);
            return var2 == -1 ? class92.field1822 : class34.field814.field357[var2].method1738(class161.field2933, class260.field4496, (byte) -52);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        if (arg1 == 255) {
            field1673++;
            return class70.field1409;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(B)V")
    public static void method570(byte arg0) {
        field1676 = null;
        if (arg0 != -15) {
            method567(-65, -47, false, false, -86, 120, true, true);
        }
        field1675 = null;
    }
}
