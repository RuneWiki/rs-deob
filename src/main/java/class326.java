import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class326 {

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "Lvh;")
    private class240 field4471;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public int field4472;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "[Z")
    public static boolean[] field4473;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V", line = 5)
    public static void method1824(byte arg0) {
        if (arg0 >= 10) {
            field4473 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Llf;ILvh;)V", line = 30)
    public class326(class157 arg0, int arg1, class240 arg2) {
        new class9(64);
        this.field4471 = arg2;
        this.field4472 = this.field4471.method1397((byte) -111, 15);
    }
}
