import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class348 extends class136 {

    @OriginalMember(owner = "client!od", name = "C", descriptor = "Lho;")
    public static class102 field4827 = new class102(13, 0, 1, 0);

    @OriginalMember(owner = "client!od", name = "F", descriptor = "Lgk;")
    public static class331 field4830 = new class331("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

    @OriginalMember(owner = "client!od", name = "G", descriptor = "[I")
    public static int[] field4831 = new int[200];

    @OriginalMember(owner = "client!od", name = "J", descriptor = "[I")
    public static int[] field4833 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!od", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field4834 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "Lff;")
    public static class9 field4829;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "Z")
    public static boolean field4832;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()V")
    public static final void method2101() {
        class171.method1214(1, class308.field4395);
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    public class348() {
        super(0, true);
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V")
    public static void method2102(int arg0) {
        field4827 = null;
        field4831 = null;
        field4834 = null;
        field4830 = null;
        field4829 = null;
        if (arg0 > 87) {
            field4833 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)[I")
    public final int[] method82(int arg0, int arg1) {
        field4828++;
        int var3 = 34 % ((67 - arg0) / 50);
        return class453.field6672;
    }
}
