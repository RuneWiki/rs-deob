import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class146 {

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field2678 = 100;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "Ljava/lang/Object;")
    public static Object field2680 = new Object();

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "Lkh;")
    public static class117 field2683 = class224.method1450((byte) -116, "Hier wechseln");

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Lsb;")
    public static class199 field2685 = null;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "[Lr;")
    public static class186[] field2681;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "[[[I")
    public static int[][][] field2684;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Luf;I)V")
    public static final void method1050(class225 arg0, int arg1) {
        field2679++;
        if (arg1 != 100) {
            field2680 = null;
        }
        class11.field378 = arg0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBIIII)V")
    public static final void method1051(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field2682++;
        int var6 = -3 / ((arg1 - 34) / 59);
        if (arg0 > class224.field4040 || arg4 < class159.field2910) {
            return;
        }
        boolean var7;
        if (arg3 < class240.field4355) {
            arg3 = class240.field4355;
            var7 = false;
        } else if (arg3 <= field2678) {
            var7 = true;
        } else {
            arg3 = field2678;
            var7 = false;
        }
        boolean var8;
        if (arg5 < class240.field4355) {
            var8 = false;
            arg5 = class240.field4355;
        } else if (field2678 >= arg5) {
            var8 = true;
        } else {
            var8 = false;
            arg5 = field2678;
        }
        if (arg0 >= class159.field2910) {
            class114.method762(arg3, 83, arg5, arg2, class167.field3030[arg0++]);
        } else {
            arg0 = class159.field2910;
        }
        if (class224.field4040 >= arg4) {
            class114.method762(arg3, 121, arg5, arg2, class167.field3030[arg4--]);
        } else {
            arg4 = class224.field4040;
        }
        if (var7 && var8) {
            for (int var9 = arg0; var9 <= arg4; var9++) {
                int[] var10 = class167.field3030[var9];
                var10[arg3] = var10[arg5] = arg2;
            }
        } else if (var7) {
            for (int var12 = arg0; var12 <= arg4; var12++) {
                class167.field3030[var12][arg3] = arg2;
            }
        } else if (var8) {
            for (int var11 = arg0; var11 <= arg4; var11++) {
                class167.field3030[var11][arg5] = arg2;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static void method1052(int arg0) {
        field2681 = null;
        if (arg0 == -14961) {
            field2680 = null;
            field2684 = null;
            field2683 = null;
        }
    }
}
