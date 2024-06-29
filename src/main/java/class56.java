import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class56 {

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public int field838 = -1;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field833 = 0;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "Z")
    public static volatile boolean field842 = true;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "F")
    public static float field839;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "Lgd;")
    public class156 field841;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "Lel;")
    public static class3 field840;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "[I")
    public int[] field843;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "[Ltl;")
    public class59[] field834;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 24)
    public static void method423(int arg0) {
        field840 = null;
        if (arg0 != 0) {
            field835 = 109;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIBII)V", line = 57)
    public static final void method424(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 >= -45) {
            field835 = 0;
        }
        field837++;
        if (arg4 >= class28.field369 && class62.field957 >= arg4) {
            int var5 = class262.method1808(arg0, class69.field1061, 0, class153.field2504);
            int var6 = class262.method1808(arg1, class69.field1061, 0, class153.field2504);
            class163.method1157(var5, arg4, var6, (byte) -104, arg3);
        }
    }
}
