import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class613 {

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "I")
    public static int field8921;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
    public static int field8923;

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "Lom;")
    public static class344 field8924;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
    public static void method3522(int arg0) {
        if (arg0 != 0) {
            method3523(126);
        }
        field8924 = null;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)V")
    public static final void method3523(int arg0) {
        if (arg0 != 0) {
            method3522(111);
        }
        field8921++;
        class601.field8616.method1912(-2552);
    }
}
