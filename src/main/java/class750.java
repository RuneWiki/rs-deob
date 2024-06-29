import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public abstract class class750 extends class693 {

    @OriginalMember(owner = "client!nca", name = "i", descriptor = "[I")
    public static int[] field10476 = new int[] { 7500, 500 };

    @OriginalMember(owner = "client!nca", name = "j", descriptor = "Luv;")
    public static class363 field10477;

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(I)V", line = 10)
    public static void method4170(int arg0) {
        field10477 = null;
        if (arg0 == -26007) {
            field10476 = null;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)Lsaa;")
    public abstract class326 method1875(byte arg0);
}
