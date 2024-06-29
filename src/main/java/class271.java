import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class271 {

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "[I")
    public static int[] field4757 = new int[2];

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "[I")
    public static int[] field4762 = new int[2048];

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "Lbj;")
    public static class151 field4759;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "Lre;")
    public static class212 field4755;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "[I")
    public static int[] field4758;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "[Lod;")
    public static class90[] field4756;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static void method1851(int arg0) {
        field4755 = null;
        if (arg0 != 1804) {
            return;
        }
        field4759 = null;
        field4758 = null;
        field4757 = null;
        field4762 = null;
        field4756 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)V")
    public static final void method1852(boolean arg0, int arg1) {
        class42.field951 = new int[arg1];
        field4757 = new int[arg1];
        class234.field4239 = new int[arg1];
        if (!arg0) {
            field4757 = null;
        }
        field4760++;
        class66.field1315 = new int[arg1];
        class273.field4799 = new int[arg1];
    }
}
