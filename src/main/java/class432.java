import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public abstract class class432 extends class47 {

    @OriginalMember(owner = "client!hu", name = "G", descriptor = "Lts;")
    public class23 field6111;

    @OriginalMember(owner = "client!hu", name = "B", descriptor = "I")
    public int field6106;

    @OriginalMember(owner = "client!hu", name = "F", descriptor = "I")
    public static int field6110 = -1;

    @OriginalMember(owner = "client!hu", name = "C", descriptor = "Lap;")
    public static class310 field6107 = new class310(12, 3);

    @OriginalMember(owner = "client!hu", name = "H", descriptor = "Lrc;")
    public static class108 field6112 = new class108(34, 17);

    @OriginalMember(owner = "client!hu", name = "I", descriptor = "[[I")
    public static int[][] field6113 = new int[128][128];

    @OriginalMember(owner = "client!hu", name = "K", descriptor = "[Z")
    public static boolean[] field6115 = new boolean[100];

    @OriginalMember(owner = "client!hu", name = "D", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!hu", name = "E", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!hu", name = "J", descriptor = "Lnl;")
    public static class435 field6114;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method2617(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6109++;
        if (arg2 != 128) {
            field6107 = null;
        }
        if (arg1 >= class295.field4153 && arg1 <= class103.field1457) {
            int var5 = class67.method630(0, arg4, class151.field2091, class444.field6338);
            int var6 = class67.method630(0, arg3, class151.field2091, class444.field6338);
            class172.method1250((byte) -118, var5, arg1, arg0, var6);
        }
    }

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "(I)V", line = 25)
    public static void method2618(int arg0) {
        field6113 = null;
        field6115 = null;
        if (arg0 == -1) {
            field6107 = null;
            field6112 = null;
            field6114 = null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)V", line = 40)
    public static final void method2619(boolean arg0) {
        if (!arg0) {
            field6113 = null;
        }
        class336 var1 = class279.field4010;
        synchronized (class279.field4010) {
            class279.field4010.method2119(0);
        }
        field6108++;
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lts;I)V", line = 56)
    public class432(class23 arg0, int arg1) {
        this.field6111 = arg0;
        this.field6106 = arg1;
    }

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method486(int arg0);

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "(I)Z")
    public abstract boolean method487(int arg0);
}
