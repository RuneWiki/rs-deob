import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public abstract class class2 extends class18 {

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "Llc;")
    public static class86 field6 = new class86();

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "Lhc;")
    public static class235 field10;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(II)V")
    public static final void method4(int arg0, int arg1) {
        field9++;
        class41 var2 = class221.method1492((byte) -42, arg0, arg1);
        var2.method303(arg1 + 23971);
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(B)V")
    public static void method5(byte arg0) {
        field6 = null;
        if (arg0 > -33) {
            field10 = null;
        }
        field10 = null;
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)I")
    public static final int method6(int arg0) {
        if (arg0 < 119) {
            method4(-10, 41);
        }
        field8++;
        return class189.field2925;
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method7(byte arg0);

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)Z")
    public abstract boolean method8(int arg0);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILjava/lang/Object;Lna;)V")
    public static final void method9(int arg0, Object arg1, class32 arg2) {
        field7++;
        if (arg0 >= -15) {
            field6 = null;
        }
        if (arg2.field480 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field480.peekEvent() != null; var3++) {
            class150.method1011((byte) 41, 1L);
        }
        if (arg1 != null) {
            arg2.field480.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
