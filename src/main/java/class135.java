import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class135 extends class38 {

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "Lu;")
    public static class117 field2432 = new class117();

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "Lv;")
    public static class147 field2433 = new class147(64);

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "[I")
    public static int[] field2437 = new int[32];

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "Lb;")
    public static class82 field2436;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILkk;)V")
    public static final void method1045(int arg0, class223 arg1) {
        field2430++;
        if (arg0 != 64) {
            method1046(67);
        }
        class15.field352 = arg1;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
    public static void method1046(int arg0) {
        field2436 = null;
        field2437 = null;
        field2432 = null;
        field2433 = null;
        int var1 = -109 / ((arg0 - 1) / 46);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIBIII)V")
    public static final void method1047(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 <= 100) {
            return;
        }
        field2438++;
        int var6 = class106.method882(class15.field345, 1, class259.field4587, arg1);
        int var7 = class106.method882(class15.field345, 1, class259.field4587, arg0);
        int var8 = class106.method882(class78.field1404, 1, class42.field769, arg4);
        int var9 = class106.method882(class78.field1404, 1, class42.field769, arg5);
        for (int var10 = var6; var10 <= var7; var10++) {
            class182.method1311(arg3, var9, true, class66.field1254[var10], var8);
        }
    }
}
