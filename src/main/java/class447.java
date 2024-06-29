import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public abstract class class447 {

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Ldh;")
    public static class320 field6459 = new class320(67, -1);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)Lkia;")
    public static final class619 method2766(boolean arg0) {
        if (arg0) {
            field6458++;
            return class568.method3305(-1, 1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLlm;)Llm;")
    public abstract class498 method2767(byte arg0, class498 arg1);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method2768(int arg0) {
        if (arg0 != -30749) {
            field6459 = null;
        }
        field6459 = null;
    }
}
