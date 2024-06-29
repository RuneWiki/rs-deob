import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class28 extends class89 {

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "Lqe;")
    public static class179 field621 = class206.method1380("Begeben Sie sich in ein freies Gebiet)1 um", (byte) 8);

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "Ls;")
    public static class194 field617 = new class194(200);

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "Lqe;")
    public static class179 field623 = class206.method1380("::autoshadow off", (byte) 115);

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Lcf;")
    public class28 field615;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "Lcf;")
    public class28 field622;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "Leh;")
    public static class52 field616;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "[I")
    public static int[] field619;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "[Lqe;")
    public static class179[] field614;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 != 26324) {
            method185(71, -35, -35, -80, -24, -22, 85, -122, -19, -78);
        }
        if (class235.field4336 <= arg1 && class40.field869 >= arg1 && class235.field4336 <= arg8 && arg8 <= class40.field869 && class235.field4336 <= arg9 && class40.field869 >= arg9 && class235.field4336 <= arg2 && class40.field869 >= arg2 && class168.field3037 <= arg6 && class70.field1403 >= arg6 && class168.field3037 <= arg0 && arg0 <= class70.field1403 && arg5 >= class168.field3037 && arg5 <= class70.field1403 && arg7 >= class168.field3037 && arg7 <= class70.field1403) {
            class106.method690(arg2, (byte) 113, arg3, arg0, arg7, arg8, arg5, arg9, arg6, arg1);
        } else {
            class152.method970(arg9, arg3, arg7, arg6, arg2, arg1, arg8, -64830388, arg0, arg5);
        }
        field618++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
    public static void method186(boolean arg0) {
        field621 = null;
        field614 = null;
        field623 = null;
        field616 = null;
        field617 = null;
        field619 = null;
        if (!arg0) {
            method186(true);
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)V")
    public final void method187(byte arg0) {
        field620++;
        if (this.field615 == null) {
            return;
        }
        this.field615.field622 = this.field622;
        this.field622.field615 = this.field615;
        this.field615 = null;
        this.field622 = null;
        int var2 = 61 / ((arg0 + 56) / 34);
    }
}
