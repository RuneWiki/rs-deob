import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class58 {

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public int field928 = 8;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public int field933 = 16777215;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field932 = 0;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public int field937;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
    public int field938;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "Z")
    public boolean field931;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIII)V")
    public static final void method441(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field929++;
        if (arg3 != -1) {
            return;
        }
        class456 var5 = class233.method1654(arg4, 4, -128);
        var5.method2858(10250);
        var5.field7042 = arg1;
        var5.field7039 = arg2;
        var5.field7041 = arg0;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZLhw;)V")
    public final void method442(boolean arg0, class208 arg1) {
        field935++;
        if (!arg0) {
            this.field934 = 68;
        }
        while (true) {
            int var3 = arg1.method1445(47);
            if (var3 == 0) {
                return;
            }
            this.method444((byte) -60, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)Lho;")
    public static final class224 method443(boolean arg0) {
        field930++;
        if (arg0) {
            return null;
        } else if (class194.field2876 == null || class472.field7217 == null) {
            return null;
        } else {
            class472.field7217.method2837((byte) 92, class194.field2876);
            class224 var1 = (class224) class472.field7217.method2835(-1);
            if (var1 == null) {
                return null;
            } else {
                class210 var2 = class194.field2866.method662(var1.field3759, !arg0);
                return var2 != null && var2.field3274 && var2.method1489((byte) -124, class194.field2867) ? var1 : class390.method2496((byte) 58);
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BILhw;)V")
    private final void method444(byte arg0, int arg1, class208 arg2) {
        field926++;
        if (arg0 > -31) {
            method443(true);
        }
        if (arg1 == 1) {
            this.field928 = arg2.method1455(-3387);
        } else if (arg1 == 2) {
            this.field931 = true;
        } else if (arg1 == 3) {
            this.field925 = arg2.method1456(13329);
            this.field937 = arg2.method1456(13329);
            this.field938 = arg2.method1456(13329);
        } else if (arg1 == 4) {
            this.field934 = arg2.method1445(-103);
        } else if (arg1 == 5) {
            this.field927 = arg2.method1455(-3387);
        } else if (arg1 == 6) {
            this.field933 = arg2.method1452(3);
            return;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method445(boolean arg0, String arg1) {
        if (!arg0) {
            method441(47, -56, 68, -56, 87);
        }
        field936++;
        for (int var2 = 0; var2 < class12.field133.length; var2++) {
            if (class12.field133[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }
}
