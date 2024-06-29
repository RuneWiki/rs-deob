import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 extends class78 {

    @OriginalMember(owner = "client!f", name = "u", descriptor = "I")
    public static int field687 = 0;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "I")
    public static int field692 = 0;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "Lqk;")
    private static class207 field689 = class24.method212(255, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!f", name = "F", descriptor = "Lqk;")
    public static class207 field697 = field689;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "Lpk;")
    public static class99 field690;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "Z")
    public static boolean field698;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZJBII)Lqk;")
    public static final class207 method259(boolean arg0, long arg1, byte arg2, int arg3, int arg4) {
        field691++;
        class207 var6 = class191.method1335((byte) 121, 0);
        if (arg1 < 0L) {
            arg1 = -arg1;
            var6.method1463(class26.field540, false);
        }
        class207 var7 = class21.field340;
        class207 var8 = class249.field4513;
        if (arg4 == 1) {
            var8 = class21.field340;
            var7 = class249.field4513;
        }
        if (arg4 == 2) {
            var7 = class249.field4513;
            var8 = class286.field5108;
        }
        if (arg2 != -85) {
            field696 = 70;
        }
        if (arg4 == 3) {
            var7 = class249.field4513;
            var8 = class21.field340;
        }
        class207 var9 = class191.method1335((byte) 126, 0);
        class207 var10 = class191.method1335((byte) 110, 0);
        for (int var11 = 0; var11 < arg3; var11++) {
            var10.method1463(class262.method1815((int) (arg1 % 10L), (byte) -128), false);
            arg1 /= 10L;
        }
        if (arg1 == 0L) {
            var9 = class277.field4868;
        }
        int var12 = 0;
        while (arg1 > 0L) {
            if (arg0 && var12 != 0 && (var12 % 3) == 0) {
                var9.method1463(var8, false);
            }
            var12++;
            var9.method1463(class262.method1815((int) (arg1 % 10L), (byte) 5), false);
            arg1 /= 10L;
        }
        if (var10.method1450((byte) 1) > 0) {
            var10.method1463(var7, false);
        }
        return class105.method757(false, new class207[] { var6, var9.method1449((byte) -116), var10.method1449((byte) -116) });
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
    public static final void method260(boolean arg0) {
        class17.field262.method779(true);
        int var1 = class17.field262.method773(1, arg0);
        field693++;
        if (var1 == 0) {
            return;
        }
        int var2 = class17.field262.method773(2, arg0);
        if (var2 == 0) {
            class180.field3233[class65.field1179++] = 2047;
        } else if (var2 == 1) {
            int var3 = class17.field262.method773(3, arg0);
            class202.field3565.method1940(1, var3, 9366);
            int var4 = class17.field262.method773(1, false);
            if (var4 == 1) {
                class180.field3233[class65.field1179++] = 2047;
            }
        } else if (var2 == 2) {
            if (class17.field262.method773(1, false) == 1) {
                int var5 = class17.field262.method773(3, false);
                class202.field3565.method1940(2, var5, 9366);
                int var6 = class17.field262.method773(3, false);
                class202.field3565.method1940(2, var6, 9366);
            } else {
                int var7 = class17.field262.method773(3, arg0);
                class202.field3565.method1940(0, var7, 9366);
            }
            int var8 = class17.field262.method773(1, false);
            if (var8 == 1) {
                class180.field3233[class65.field1179++] = 2047;
            }
        } else if (var2 == 3) {
            int var9 = class17.field262.method773(1, arg0);
            if (var9 == 1) {
                class180.field3233[class65.field1179++] = 2047;
            }
            class93.field1645 = class17.field262.method773(2, arg0);
            int var10 = class17.field262.method773(1, false);
            int var11 = class17.field262.method773(7, false);
            int var12 = class17.field262.method773(7, false);
            class202.field3565.method88((byte) -99, var10 == 1, var11, var12);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static void method261(int arg0) {
        field690 = null;
        int var1 = 55 % ((30 - arg0) / 34);
        field697 = null;
        field689 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)V")
    public static final void method262(int arg0, boolean arg1) {
        if (arg1) {
            field696 = 111;
        }
        field694++;
        class92.field1628.method1383(-8052, arg0);
        class14.field232.method1383(-8052, arg0);
        class185.field3275.method1383(-8052, arg0);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public static final void method263(int arg0) {
        if (arg0 != 0) {
            method260(false);
        }
        class14.field232.method1390((byte) 125);
        field695++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIB)V")
    public static final void method264(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field688++;
        class90 var5 = class221.method1575(8, arg3, 1651481952);
        var5.method648((byte) -103);
        var5.field1613 = arg1;
        var5.field1612 = arg0;
        if (arg4 >= 11) {
            var5.field1621 = arg2;
        }
    }
}
