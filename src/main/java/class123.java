import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class123 {

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1781 = "Loaded fonts";

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "[I")
    public static int[] field1783 = new int[50];

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static volatile int field1785 = -1;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1784 = "Loaded config";

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field1786 = 0;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "Lve;")
    public static class233 field1787;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public static final void method834(int arg0) {
        field1782++;
        class274.field4403 = null;
        class251.field3831 = null;
        if (arg0 == 28937) {
            class247.field3694 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V")
    public static void method835(int arg0) {
        field1784 = null;
        field1783 = null;
        field1787 = null;
        field1781 = null;
        if (arg0 != 6016) {
            method835(76);
        }
    }
}
