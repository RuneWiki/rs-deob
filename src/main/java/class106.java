import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class106 extends class137 {

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public int field1653;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public int field1651;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "Lad;")
    public static class275 field1652 = new class275(260);

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public static int field1654 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public static int field1656 = 0;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "Lgi;")
    public static class164 field1657;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "Lclient;")
    public static client field1658;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)V")
    public static final void method749(int arg0, int arg1) {
        field1650++;
        if (arg0 <= 120) {
            field1655 = -81;
        }
        class291 var2 = class61.method389(arg1, 7, 0);
        var2.method2010(0);
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V")
    public static void method750(int arg0) {
        field1652 = null;
        if (arg0 != -3944) {
            method750(-39);
        }
        field1657 = null;
        field1658 = null;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(II)V")
    public class106(int arg0, int arg1) {
        this.field1653 = arg1;
        this.field1651 = arg0;
    }
}
