import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class348 extends class154 {

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "I")
    public int field4693;

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "I")
    public int field4694;

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "Lfja;")
    public static class783 field4692 = new class783(61, 2);

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
    public static void method2149(int arg0) {
        field4692 = null;
        if (arg0 != 2) {
            method2149(-53);
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(II)V")
    public class348(int arg0, int arg1) {
        this.field4693 = arg1;
        this.field4694 = arg0;
    }
}
