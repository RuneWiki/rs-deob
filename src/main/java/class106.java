import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class106 {

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "[Lfh;")
    public static class603[] field1642 = new class603[50];

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "Lff;")
    public static class9 field1640 = new class9(10, 2, 2, 0);

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "Lfv;")
    public class106 field1641;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "Lmw;")
    public class454 field1638;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
    public static void method842(int arg0) {
        field1642 = null;
        if (arg0 != 50) {
            field1639 = -124;
        }
        field1640 = null;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V")
    public final void method843(int arg0) {
        field1637++;
        if (class500.field7086 < arg0) {
            this.field1638 = null;
            this.field1641 = class316.field4681;
            class316.field4681 = this;
            class500.field7086++;
        }
    }
}
