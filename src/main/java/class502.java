import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class502 {

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "Ldb;")
    public static class298 field6712 = new class298(60, -2);

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "Lcu;")
    public static class206 field6714 = new class206(70, -1);

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Lqw;")
    public static class71 field6716 = new class71(9, 7);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Lbf;")
    public class502 field6709;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "Lbf;")
    public class502 field6715;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "[[B")
    public static byte[][] field6717;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V", line = 4)
    public static void method2786(int arg0) {
        field6717 = null;
        field6712 = null;
        field6714 = null;
        if (arg0 == -1) {
            field6716 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V", line = 19)
    public final void method2787(boolean arg0) {
        if (arg0) {
            return;
        }
        field6713++;
        if (this.field6709 != null) {
            this.field6709.field6715 = this.field6715;
            this.field6715.field6709 = this.field6709;
            this.field6709 = null;
            this.field6715 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)V", line = 39)
    public static final void method2788(int arg0, int arg1, int arg2, int arg3) {
        class477.field6362 = new byte[arg3][arg1][arg0];
        if (arg2 == 8) {
            field6708++;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)Ljava/lang/String;", line = 54)
    public static final String method2789(int arg0, int arg1) {
        field6711++;
        if (arg1 != 8) {
            field6717 = null;
        }
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class72.field1097.method546(class516.field6892, (byte) -35) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class72.field1099.method546(class516.field6892, (byte) -35) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIIII)Z", line = 85)
    public static final boolean method2790(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6710++;
        if (arg7 >= (arg3 + arg4) || (arg7 + arg5) <= arg4) {
            return false;
        } else if ((arg2 + arg6) > arg0 && arg0 + arg1 > arg6) {
            return arg8 == -24945 ? true : true;
        } else {
            return false;
        }
    }
}
