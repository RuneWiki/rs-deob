import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class206 {

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "Lkr;")
    public static class602 field2700 = new class602(86, 4);

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field2703 = -1;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field2704;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIILdw;I)Lgv;")
    public static final class702 method1238(int arg0, int arg1, int arg2, class664 arg3, int arg4) {
        field2701++;
        if (arg0 != -5550) {
            field2704 = null;
        }
        if (!arg3.field9071 && (!class88.method611(arg4, 2) || !class88.method611(arg1, 2))) {
            return arg3.field9057 ? new class702(arg3, 34037, arg2, arg4, arg1) : new class702(arg3, arg2, arg4, arg1, class606.method3450(arg4, (byte) -25), class606.method3450(arg1, (byte) -25));
        } else {
            return new class702(arg3, 3553, arg2, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
    public static final void method1239(boolean arg0) {
        field2698++;
        for (int var1 = 0; var1 < class17.field172; var1++) {
            int var2 = class328.method2109((byte) 101, class17.field172, class517.field7217 + var1) * class557.field7745;
            for (int var3 = 0; var3 < class557.field7745; var3++) {
                int var4 = class328.method2109((byte) 83, class557.field7745, class172.field2389 + var3) + var2;
                if (class321.field4463[var4] == class114.field1525) {
                    class634.field8539[var4].method25(0, 0, class494.field6919, class319.field4441, class494.field6919 * var3, class319.field4441 * var1, true, true);
                }
            }
        }
        if (!arg0) {
            field2700 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(Z)V")
    public static void method1240(boolean arg0) {
        if (arg0) {
            field2704 = null;
            field2700 = null;
        }
    }
}
