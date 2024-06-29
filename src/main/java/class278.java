import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class278 extends class160 {

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Lsf;")
    public static class108 field4878 = class140.method973(255, "Lade Liste der Welten");

    @OriginalMember(owner = "client!a", name = "s", descriptor = "[I")
    public static int[] field4875 = new int[32];

    @OriginalMember(owner = "client!a", name = "u", descriptor = "Lsf;")
    public static class108 field4877 = class140.method973(255, "M");

    @OriginalMember(owner = "client!a", name = "D", descriptor = "I")
    public static int field4886 = 0;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "Z")
    public static boolean field4884 = false;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "I")
    public int field4887;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "Lsf;")
    public class108 field4881;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "Lsf;")
    public class108 field4882;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "Lca;")
    public static class98 field4879;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "[[[I")
    public static int[][][] field4883;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)Lud;", line = 31)
    public final class285 method2008(int arg0) {
        if (arg0 != 0) {
            field4879 = (class98) null;
        }
        field4880++;
        return class265.field4675[this.field2865];
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V", line = 50)
    public static void method2009(int arg0) {
        field4877 = null;
        if (arg0 > 9) {
            field4879 = null;
            field4878 = null;
            field4875 = null;
            field4883 = (int[][][]) null;
        }
    }
}
