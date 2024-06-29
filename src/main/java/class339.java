import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class339 {

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field4809 = 0;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "[I")
    public static int[] field4808 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "Z")
    public static boolean field4813 = false;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field4815 = 0;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Ltq;")
    public static class376 field4812;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "Lgj;")
    public static class381 field4810;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static void method2179(int arg0) {
        if (arg0 != -1) {
            method2180(70, (class236) null);
        }
        field4812 = null;
        field4808 = null;
        field4810 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILdg;)Lhd;")
    public static final class443 method2180(int arg0, class236 arg1) {
        int var2 = -48 / (arg0 / 50);
        field4814++;
        return new class443(arg1.method1613(115), arg1.method1613(108), arg1.method1613(50), arg1.method1613(83), arg1.method1613(74), arg1.method1613(93), arg1.method1613(74), arg1.method1613(81), arg1.method1616(false), arg1.method1574(-120));
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)Lmj;")
    public static final class394 method2181(int arg0, int arg1, int arg2) {
        class193 var3 = class250.field3570[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2771;
    }
}
