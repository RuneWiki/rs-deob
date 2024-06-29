import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class75 {

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "[[S")
    public static short[][] field1204 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field1201 = 0;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "Lpk;")
    public static class237 field1202;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
    public static int[] field1199;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
    public static void method598(boolean arg0) {
        if (arg0) {
            field1199 = null;
            field1204 = null;
            field1202 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method599(int arg0, int arg1) {
        String var2 = Integer.toString(arg1);
        field1203++;
        if (arg0 != 8526) {
            method598(true);
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class285.field4377 + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class7.field83 + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)Lsi;")
    public static final class286 method600(boolean arg0, int arg1) {
        field1200++;
        class286 var2 = (class286) class169.field2488.method675(31558, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0) {
            return null;
        } else {
            byte[] var3 = class101.field1483.method1605(-126, arg1, 5);
            class286 var4 = new class286();
            if (var3 != null) {
                var4.method1903(new class54(var3), 123);
            }
            class169.field2488.method677((byte) -15, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)I")
    public static final int method601(boolean arg0) {
        field1194++;
        if (!arg0) {
            field1201 = -85;
        }
        return class267.field4161;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static final void method602(int arg0) {
        if (arg0 != -18707) {
            method603(27);
        }
        class23.field375.method940(113);
        field1196++;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)I")
    public static final int method603(int arg0) {
        field1198++;
        if (class154.field2251 == null) {
            return -1;
        } else if (arg0 == 15051) {
            while (class154.field2251.field3727 > class146.field2118) {
                if (class154.field2251.method1647(class146.field2118, (byte) 115)) {
                    return class146.field2118++;
                }
                class146.field2118++;
            }
            return -1;
        } else {
            return -43;
        }
    }
}
