import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class259 extends class261 {

    @OriginalMember(owner = "client!in", name = "m", descriptor = "Lbu;")
    public static class407 field4346 = new class407(8);

    @OriginalMember(owner = "client!in", name = "o", descriptor = "Llo;")
    public static class306 field4348 = new class306("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!in", name = "h", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZB)V")
    public final void method1020(boolean arg0, byte arg1) {
        ++field4341;
        if (arg1 <= 23) {
            field4346 = null;
        }
        super.field4358.method1447((byte) 103, true);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(III)V")
    public final void method1021(int arg0, int arg1, int arg2) {
        int var4 = 125 % ((82 - arg1) / 41);
        ++field4345;
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(I)Z")
    public final boolean method1026(int arg0) {
        ++field4347;
        if (arg0 < 69) {
            field4346 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IILkk;)V")
    public final void method1024(int arg0, int arg1, class179 arg2) {
        ++field4344;
        super.field4358.method1471(true, arg2);
        int var4 = 86 / ((arg1 - 21) / 36);
        super.field4358.method1410(arg0, 7681);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V")
    public static void method1742(byte arg0) {
        field4346 = null;
        if (arg0 != 78) {
            field4346 = null;
        }
        field4348 = null;
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(I)V")
    public final void method1023(int arg0) {
        ++field4343;
        super.field4358.method1447((byte) -77, false);
        if (arg0 != 5000) {
            field4346 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IZ)V")
    public final void method1022(int arg0, boolean arg1) {
        ++field4342;
        int var3 = -39 / ((87 - arg0) / 37);
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lih;)V")
    public class259(class214 arg0) {
        super(arg0);
    }
}
