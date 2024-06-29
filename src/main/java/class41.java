import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class41 {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Lqf;")
    private static class117 field805 = class72.method514(109, "Your account is already logged in)3");

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Lqf;")
    public static class117 field807 = class72.method514(105, "titlebox");

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field816 = 0;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "Lqf;")
    public static class117 field818 = class72.method514(106, "logo");

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "Lqf;")
    public static class117 field819 = class72.method514(111, "<col=ffff00>*V");

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field815 = 1;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "Lqf;")
    public static class117 field820 = field805;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "Lqf;")
    private static class117 field808 = class72.method514(111, "Checking for updates )2 ");

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "[I")
    public static int[] field814 = new int[50];

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public static int field821 = -1;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Lqf;")
    public static class117 field812 = field808;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field817 = 0;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "[I")
    public static int[] field806;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "[I")
    public static int[] field809;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILjb;)V")
    public static final void method288(int arg0, class64 arg1) {
        field813++;
        class21.field344 = arg1;
        if (arg0 != 0) {
            method288(53, null);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static void method289(int arg0) {
        field818 = null;
        field814 = null;
        field812 = null;
        field806 = null;
        field805 = null;
        field819 = null;
        field820 = null;
        field809 = null;
        field807 = null;
        field808 = null;
        if (arg0 != 0) {
            method289(-41);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)I")
    public static final int method290(int arg0, int arg1, int arg2) {
        field810++;
        if (arg2 != 0) {
            field820 = null;
        }
        class78 var3 = (class78) client.field395.method1221(arg2 + 43, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var3.field1757.length) {
            return var3.field1757[arg1];
        } else {
            return 0;
        }
    }
}
