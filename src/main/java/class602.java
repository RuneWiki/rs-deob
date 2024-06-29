import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class602 extends class374 {

    @OriginalMember(owner = "client!fia", name = "M", descriptor = "Ljava/lang/Object;")
    private Object field8193;

    @OriginalMember(owner = "client!fia", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field8189 = new String[100];

    @OriginalMember(owner = "client!fia", name = "L", descriptor = "F")
    public static float field8192;

    @OriginalMember(owner = "client!fia", name = "F", descriptor = "I")
    public static int field8186;

    @OriginalMember(owner = "client!fia", name = "G", descriptor = "I")
    public static int field8187;

    @OriginalMember(owner = "client!fia", name = "J", descriptor = "I")
    public static int field8190;

    @OriginalMember(owner = "client!fia", name = "K", descriptor = "I")
    public static int field8191;

    @OriginalMember(owner = "client!fia", name = "H", descriptor = "[J")
    public static long[] field8188;

    @OriginalMember(owner = "client!fia", name = "f", descriptor = "(I)Z", line = 4)
    public final boolean method2324(int arg0) {
        field8187++;
        return arg0 == 14391 ? false : false;
    }

    @OriginalMember(owner = "client!fia", name = "g", descriptor = "(I)V", line = 17)
    public static void method3348(int arg0) {
        if (arg0 == 26934) {
            field8189 = null;
            field8188 = null;
        }
    }

    @OriginalMember(owner = "client!fia", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 30)
    public final Object method2321(byte arg0) {
        if (arg0 == 20) {
            field8190++;
            return this.field8193;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(ZIIII)V", line = 46)
    public static final void method3349(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field8191++;
        int var5 = class561.field7540;
        if (var5 == 0) {
            return;
        }
        if (var5 == 1) {
            class87.field1219 = arg1;
            class658.field9113 = arg4;
            class561.field7540 = 2;
            class373.field5400 = arg3;
            class628.field8784 = arg2;
        } else if (var5 == 2) {
            if (class628.field8784 < arg2) {
                class628.field8784 = arg2;
            }
            if (class373.field5400 < arg3) {
                class373.field5400 = arg3;
            }
            if (arg4 < class658.field9113) {
                class658.field9113 = arg4;
            }
            if (arg1 < class87.field1219) {
                class87.field1219 = arg1;
            }
        } else if (arg0) {
            method3349(true, 111, -52, 59, 85);
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(II)V", line = 105)
    public static final void method3350(int arg0, int arg1) {
        field8186++;
        class16 var2 = class94.method753(4, 13175, (long) arg0);
        var2.method118(585134072);
        if (arg1 >= -121) {
            method3348(-12);
        }
    }

    @OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 121)
    public class602(Object arg0, int arg1) {
        super(arg1);
        this.field8193 = arg0;
    }
}
