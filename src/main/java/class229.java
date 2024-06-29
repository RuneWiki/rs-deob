import java.awt.Component;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class229 {

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "Lqe;")
    public static class168 field3892 = class66.method448("welle2:", 84);

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "[[S")
    public static short[][] field3891 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Ljava/lang/Object;")
    public static Object field3882 = new Object();

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    public static int field3894 = 0;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "Lqe;")
    public static class168 field3895 = class66.method448("mod_icons", -112);

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "Lhe;")
    public static class47 field3896 = new class47();

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "[Lgg;")
    public static class222[] field3898 = new class222[32768];

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "Lqe;")
    public static class168 field3899 = class66.method448("Benutzen", 55);

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "Lqe;")
    private static class168 field3900 = class66.method448("wave:", 82);

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "Lqe;")
    public static class168 field3901 = field3900;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "[Lnh;")
    public static class112[] field3902 = new class112[2048];

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "Lqe;")
    public static class168 field3897 = field3900;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "Lrd;")
    public static class207 field3884;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BILoe;I)[Lgd;")
    public static final class65[] method1473(byte arg0, int arg1, class256 arg2, int arg3) {
        field3889++;
        int var4 = -4 % ((-arg0 - 27) / 48);
        return class9.method34(arg3, arg2, (byte) -16, arg1) ? class155.method1023(-20842) : null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static void method1474(int arg0) {
        field3899 = null;
        field3891 = null;
        if (arg0 != -21957) {
            return;
        }
        field3884 = null;
        field3901 = null;
        field3902 = null;
        field3898 = null;
        field3897 = null;
        field3896 = null;
        field3895 = null;
        field3900 = null;
        field3882 = null;
        field3892 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lqe;Lqe;II)V")
    public static final void method1475(class168 arg0, class168 arg1, int arg2, int arg3) {
        field3888++;
        class94.method626(arg0, (byte) 91, null, arg3, arg2, arg1);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZI)V")
    public static final void method1476(boolean arg0, int arg1) {
        if (arg0) {
            field3894 = -69;
        }
        field3883++;
        if (class97.method636(arg1, -126)) {
            class208.method1350(-1, -1, class108.field1741[arg1]);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BLjava/lang/Object;Lgj;)V")
    public static final void method1477(byte arg0, Object arg1, class239 arg2) {
        field3893++;
        if (arg2.field4085 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field4085.peekEvent() != null; var3++) {
            class38.method259(1L, 31644);
        }
        if (arg0 >= -22) {
            method1473((byte) -91, -80, null, -107);
        }
        if (arg1 != null) {
            arg2.field4085.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static final void method1478(byte arg0) {
        if (arg0 == -28) {
            class182.field3237.method1497((byte) 46);
            class93.field1465.method14(false);
            field3881++;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILjava/awt/Component;IB)Lba;")
    public static final class3 method1479(int arg0, Component arg1, int arg2, byte arg3) {
        field3887++;
        try {
            if (arg3 <= 7) {
                field3882 = null;
            }
            Class var4 = Class.forName("oi");
            class3 var5 = (class3) var4.getDeclaredConstructor().newInstance();
            var5.method18(103, arg1, arg2, arg0);
            return var5;
        } catch (Throwable var7) {
            class166 var6 = new class166();
            var6.method18(99, arg1, arg2, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
    public static final void method1480(boolean arg0) {
        System.out.println("Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
        System.exit(1);
        if (arg0) {
            field3880++;
        }
    }
}
