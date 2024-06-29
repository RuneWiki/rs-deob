import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class263 extends class376 {

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "Ljava/lang/String;")
    public static String field3863 = "";

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "Lbg;")
    public static class324 field3864 = new class324(40, 3);

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
    public static int field3867 = 0;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "Lgk;")
    public static class331 field3868 = new class331("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "Lfs;")
    public static class387 field3865;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static void method1686(int arg0) {
        field3864 = null;
        int var1 = 10 % ((-arg0 - 44) / 60);
        field3863 = null;
        field3868 = null;
        field3865 = null;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)I")
    public static final int method1687(int arg0, int arg1) {
        if (arg0 != 255) {
            field3864 = null;
        }
        field3866++;
        return arg1 & 0xFF;
    }
}
