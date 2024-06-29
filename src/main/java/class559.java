import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class559 {

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "Ldr;")
    public static class675 field6989 = new class675(17, 8);

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)V", line = 6)
    public static void method2975(int arg0) {
        field6989 = null;
        if (arg0 != 5) {
            method2975(-14);
        }
    }
}
