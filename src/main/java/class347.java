import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class347 {

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "Z")
    public static boolean field4629 = false;

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "I")
    public static int field4631 = 0;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "Leba;")
    public static class550 field4628 = new class550(66, -1);

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "Z")
    public static boolean field4632 = false;

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)V")
    public static void method2065(int arg0) {
        field4628 = null;
        if (arg0 != 66) {
            method2065(72);
        }
    }
}
