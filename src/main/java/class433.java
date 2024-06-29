import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class433 {

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public int field5581 = -1;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "[I")
    public static int[] field5583 = new int[5];

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Lrn;")
    public static class607 field5585 = new class607();

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "Ljk;")
    public class705 field5582;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "[I")
    public int[] field5587;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "[Ljava/lang/String;")
    public String[] field5586;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 4)
    public static final void method2476(String arg0, boolean arg1, int arg2) {
        class495.method2696(-1, 0, "", arg2, "", arg0, "");
        field5584++;
        if (arg1) {
            field5585 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V", line = 33)
    public static void method2477(byte arg0) {
        if (arg0 != -76) {
            field5585 = null;
        }
        field5585 = null;
        field5583 = null;
    }
}
