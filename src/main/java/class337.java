import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class337 {

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Lwf;")
    private class117 field4655 = new class117(64);

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "Lkda;")
    private class328 field4660;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Lkda;")
    private class328 field4659;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "[[S")
    public static short[][] field4656 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "Lh;")
    public static class572 field4661 = new class572("Loading shaders", "Lade shaders", "Chargement des nuanceurs", "Carregando sombreamento - ");

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Lmk;", line = 9)
    public final class50 method2055(int arg0, int arg1) {
        field4654++;
        class50 var3 = (class50) this.field4655.method842(0, (long) arg0);
        if (var3 != null) {
            return var3;
        } else if (arg1 == -14010) {
            byte[] var4;
            if (arg0 < 32768) {
                var4 = this.field4660.method1966(arg0, 0, true);
            } else {
                var4 = this.field4659.method1966(arg0 & 0x7FFF, 0, true);
            }
            class50 var5 = new class50();
            if (var4 != null) {
                var5.method304(new class148(var4), false);
            }
            if (arg0 >= 32768) {
                var5.method302(false);
            }
            this.field4655.method835((byte) 122, (long) arg0, var5);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IBI)Z", line = 43)
    public static final boolean method2056(int arg0, byte arg1, int arg2) {
        field4657++;
        if (arg1 <= 60) {
            field4656 = null;
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 58)
    public static void method2057(int arg0) {
        field4661 = null;
        field4656 = null;
        if (arg0 != -1506) {
            field4656 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)V", line = 89)
    public static final void method2058(int arg0, int arg1, int arg2, int arg3) {
        field4658++;
        if (arg2 == 4783) {
            class112.field1589.method1058(602643080, arg0);
            class112.field1589.method1027(255, arg1);
            class112.field1589.method1008(false, arg3);
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(ILkda;Lkda;)V", line = 105)
    public class337(int arg0, class328 arg1, class328 arg2) {
        this.field4660 = arg1;
        this.field4659 = arg2;
        if (this.field4660 != null) {
            this.field4660.method1975(101, 0);
        }
        if (this.field4659 != null) {
            this.field4659.method1975(87, 0);
        }
    }
}
