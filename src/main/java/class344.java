import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class344 {

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "Llga;")
    public static class712 field4613 = new class712(31, 3);

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
    public static void method2019(int arg0) {
        field4613 = null;
        if (arg0 != 0) {
            field4613 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)I")
    public static int method2020(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(DI)V")
    public static final void method2021(double arg0, int arg1) {
        class725.field10127.method25(class527.field7074);
        field4612++;
        class725.field10127.method39(0, 0, (int) arg0);
        if (arg1 != 14794) {
            method2019(-123);
        }
        class603.field8409.method367(class725.field10127);
    }
}
