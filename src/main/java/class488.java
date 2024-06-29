import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public abstract class class488 {

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "Lmu;")
    public static class303 field6754 = new class303(87, 1);

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field6755 = -1;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Lmu;")
    public static class303 field6757 = new class303(67, 3);

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Ljr;")
    public static class112 field6758 = new class112(128, 4);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "F")
    public static float field6753;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "[I")
    public static int[] field6756;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 11)
    public static void method2871(int arg0) {
        if (arg0 != 3) {
            field6754 = null;
        }
        field6757 = null;
        field6756 = null;
        field6754 = null;
        field6758 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILrd;)Lrd;")
    public abstract class338 method2872(int arg0, class338 arg1);
}
