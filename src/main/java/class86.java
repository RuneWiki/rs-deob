import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public abstract class class86 {

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field1442 = 0;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "[Lda;")
    public static class275[] field1450 = new class275[200];

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field1444 = 0;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "[I")
    public static int[] field1451 = new int[32];

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "Lne;")
    public static class137 field1454 = new class137(200);

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "[B")
    public static byte[] field1460 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "Lda;")
    public static class275 field1459 = class255.method1672(111, "leuchten3:");

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public static int field1461 = 0;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public int field1445;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public int field1452;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public int field1455;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "Lna;")
    public static class255 field1456;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "[I")
    public static int[] field1458;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lah;")
    public static final class1 method614(Throwable arg0, String arg1) {
        field1449++;
        class1 var2;
        if ((arg0 instanceof class1)) {
            var2 = (class1) arg0;
            var2.field3 = var2.field3 + ' ' + arg1;
        } else {
            var2 = new class1(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method615(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 >= class246.field4355 && arg7 <= class96.field1632 && arg0 >= class149.field2603 && class141.field2493 >= arg6) {
            class236.method1534(arg1, arg7, arg4, false, arg5, arg6, arg2, arg0);
        } else {
            class12.method51(true, arg6, arg7, arg2, arg4, arg1, arg5, arg0);
        }
        field1457++;
        if (arg3 <= 113) {
            field1450 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)Z")
    public final boolean method616(int arg0) {
        if (arg0 < 53) {
            field1458 = null;
        }
        field1443++;
        return (this.field1445 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)Z")
    public final boolean method617(byte arg0) {
        if (arg0 == -23) {
            field1446++;
            return (this.field1445 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLij;)Lm;")
    public static final class38 method618(boolean arg0, class85 arg1) {
        field1448++;
        if (arg0) {
            field1459 = null;
        }
        class38 var2 = new class38();
        var2.field639 = arg1.method608(88);
        var2.field631 = class170.method1168(32768, var2.field639);
        return var2;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
    public static void method619(int arg0) {
        field1458 = null;
        field1459 = null;
        field1450 = null;
        field1454 = null;
        field1451 = null;
        if (arg0 != 200) {
            field1458 = null;
        }
        field1456 = null;
        field1460 = null;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)Z")
    public final boolean method620(byte arg0) {
        field1453++;
        int var2 = 30 / ((54 - arg0) / 38);
        return (this.field1445 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)Z")
    public final boolean method621(int arg0) {
        if (arg0 >= -80) {
            return true;
        } else {
            field1441++;
            return (this.field1445 & 0x1) != 0;
        }
    }
}
