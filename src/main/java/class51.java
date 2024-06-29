import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class51 extends class65 {

    @OriginalMember(owner = "client!lca", name = "p", descriptor = "I")
    public int field823;

    @OriginalMember(owner = "client!lca", name = "l", descriptor = "I")
    public int field819;

    @OriginalMember(owner = "client!lca", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field818 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!lca", name = "q", descriptor = "I")
    public static int field824 = 1;

    @OriginalMember(owner = "client!lca", name = "m", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!lca", name = "n", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!lca", name = "o", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V")
    public static void method494(int arg0) {
        int var1 = -43 % ((arg0 + 51) / 33);
        field818 = null;
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(II)V")
    public class51(int arg0, int arg1) {
        this.field823 = arg0;
        this.field819 = arg1;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Ljava/lang/String;IZZLjava/lang/String;)V")
    public static final void method495(String arg0, int arg1, boolean arg2, boolean arg3, String arg4) {
        field821++;
        class597.method3426(arg4, 0, arg0, arg3, arg2, -1, arg1);
    }
}
