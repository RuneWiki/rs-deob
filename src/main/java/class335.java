import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class335 extends class176 {

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public int field4461;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public int field4465;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field4464 = -1;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "Ldv;")
    public static class566 field4462 = new class566(47, -1);

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "[I")
    public static int[] field4466 = new int[4096];

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "[Z")
    public static boolean[] field4463;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
    public static void method2037(boolean arg0) {
        field4466 = null;
        field4463 = null;
        if (!arg0) {
            field4462 = null;
        }
        field4462 = null;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(II)V")
    public class335(int arg0, int arg1) {
        this.field4461 = arg0;
        this.field4465 = arg1;
    }
}
