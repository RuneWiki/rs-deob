import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class112 extends class5 {

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "Z")
    public boolean field2690 = false;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "I")
    public static int field2689 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "Lhe;")
    private static class54 field2687 = class6.method58("You have only just left another world)3", false);

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "Lhe;")
    private static class54 field2695 = class6.method58("Attack", false);

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "Lhe;")
    private static class54 field2694 = class6.method58("Account locked as we suspect it has been stolen)3", false);

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "Lhe;")
    public static class54 field2692 = field2694;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "Lhe;")
    public static class54 field2685 = field2695;

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "I")
    public static int field2698 = 0;

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "Lhe;")
    public static class54 field2697 = field2687;

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "Lsf;")
    public static class131 field2696 = new class131(64);

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "I")
    public int field2686;

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "I")
    public int field2691;

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public static final void method840(int arg0) {
        if (arg0 != 25947) {
            field2694 = null;
        }
        class67.field1675.method992(0);
        field2693++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILeb;ILcb;)V")
    public static final void method841(int arg0, class31 arg1, int arg2, class17 arg3) {
        field2688++;
        byte[] var4 = null;
        class130 var5 = class71.field1771;
        synchronized (class71.field1771) {
            for (class86 var6 = (class86) class71.field1771.method979(-123); var6 != null; var6 = (class86) class71.field1771.method983(18485)) {
                if ((long) arg2 == var6.field154 && var6.field2128 == arg3 && var6.field2135 == 0) {
                    var4 = var6.field2133;
                    break;
                }
            }
        }
        if (var4 != null) {
            arg1.method228(arg3, arg2, var4, true, false);
            return;
        }
        if (arg0 != -6207) {
            field2697 = null;
        }
        byte[] var7 = arg3.method152(arg2, 255);
        arg1.method228(arg3, arg2, var7, true, false);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZ)Lhe;")
    public static final class54 method842(int arg0, boolean arg1) {
        field2684++;
        if (!arg1) {
            method843(false);
        }
        return arg0 < 999999999 ? class147.method1117(-70, arg0) : class21.field586;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
    public static void method843(boolean arg0) {
        if (!arg0) {
            field2685 = null;
        }
        field2685 = null;
        field2695 = null;
        field2694 = null;
        field2692 = null;
        field2697 = null;
        field2696 = null;
        field2687 = null;
    }
}
