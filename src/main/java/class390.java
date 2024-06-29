import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public abstract class class390 {

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!tha", name = "c", descriptor = "Lsda;")
    public static class783 field4983;

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "[I")
    public static int[] field4981;

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lpfa;I)Lpfa;")
    public abstract class242 method2249(class242 arg0, int arg1);

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(B)V")
    public static void method2250(byte arg0) {
        field4981 = null;
        if (arg0 == 121) {
            field4983 = null;
        }
    }
}
