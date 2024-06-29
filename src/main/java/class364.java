import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class364 extends class461 {

    @OriginalMember(owner = "client!fda", name = "P", descriptor = "Ljn;")
    public static class324 field5185 = new class324(7, 0, 1, 1);

    @OriginalMember(owner = "client!fda", name = "S", descriptor = "Z")
    public static boolean field5188 = true;

    @OriginalMember(owner = "client!fda", name = "Q", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!fda", name = "R", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "(I)V", line = 17)
    public static void method2308(int arg0) {
        field5185 = null;
        int var1 = 80 / ((23 - arg0) / 53);
    }
}
