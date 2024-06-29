import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class67 {

    @OriginalMember(owner = "client!je", name = "c", descriptor = "[Lid;")
    public static class60[] field1639 = new class60[200];

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Ldf;")
    public static class28 field1640;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Lfd;")
    public static class40 field1637;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Lie;")
    public static class61 field1638;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILie;I)Le;")
    public static final class29 method511(int arg0, class61 arg1, int arg2) {
        field1641++;
        if (class22.method180(arg2, -79, arg1)) {
            return arg0 == -3514 ? class103.method828((byte) -7) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static void method512(byte arg0) {
        field1638 = null;
        field1639 = null;
        field1637 = null;
        field1640 = null;
        int var1 = -112 % ((59 - arg0) / 34);
    }
}
