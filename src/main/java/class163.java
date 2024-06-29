import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class class163 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Lgs;")
    public static class576 field2346;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "[Lii;")
    public static class514[] field2347;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Lkm;")
    public abstract class121 method999(int arg0);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)[B")
    public abstract byte[] method1000(int arg0, int arg1);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)I")
    public abstract int method1001(int arg0, byte arg1);

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public static void method1002(int arg0) {
        if (arg0 != 18447) {
            method1002(-9);
        }
        field2346 = null;
        field2347 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public static final void method1003(byte arg0) {
        field2345++;
        if (class226.field2934 == null) {
            return;
        }
        class540.field7407 = new class504();
        class540.field7407.method2865(class352.field4692, class226.field2934.field9820, false, class226.field2934.field9825.method2141(class422.field5539, true), class226.field2934);
        class604.field8439 = new Thread(class540.field7407, "");
        class604.field8439.start();
        int var1 = 102 % ((-arg0 - 35) / 44);
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(IB)V")
    public abstract void method1004(int arg0, byte arg1);

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
    public static final void method1005(int arg0) {
        field2344++;
        class421.field5524 = null;
        if (arg0 != -31312) {
            method1005(39);
        }
    }
}
