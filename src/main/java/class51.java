import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class51 extends class209 {

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "Lvd;")
    public class155 field617;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    public static int field621 = 0;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "Lk;")
    public static class36 field619 = new class36(64);

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
    public static int field624 = 0;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "Luf;")
    private static class168 field623 = class148.method1019(-1720, "Loaded update list");

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "Luf;")
    public static class168 field626 = field623;

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "Luf;")
    public static class168 field628 = class148.method1019(-1720, ":allyreq:");

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "Z")
    public static boolean field627 = true;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "Lcj;")
    public static class75 field622;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "[[B")
    public static byte[][] field625;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILuf;)V", line = 17)
    public static final void method283(int arg0, int arg1, class168 arg2) {
        int var3 = -64 / ((-arg1 - 66) / 51);
        class249.field4262.method726(45, 2138389379);
        class249.field4262.method1061(arg0, false);
        class284.field4800++;
        field618++;
        class249.field4262.method1066(arg2.method1208((byte) 71), true);
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V", line = 29)
    public static void method284(int arg0) {
        if (arg0 != 45) {
            field622 = (class75) null;
        }
        field622 = null;
        field619 = null;
        field623 = null;
        field628 = null;
        field626 = null;
        field625 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)Lnd;", line = 44)
    public static final class298 method285(int arg0, boolean arg1) {
        field620++;
        if (!arg1) {
            field619 = (class36) null;
        }
        class298 var2 = (class298) class103.field1604.method1424((long) arg0, (byte) 123);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class294.field4981.method1647(3, (byte) 127, arg0);
        class298 var4 = new class298();
        if (var3 != null) {
            var4.method2043(new class153(var3), 21209);
        }
        class103.field1604.method1430(var4, (long) arg0, 13487);
        return var4;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lvd;)V", line = 68)
    public class51(class155 arg0) {
        this.field617 = arg0;
    }
}
