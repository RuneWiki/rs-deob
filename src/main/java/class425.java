import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class425 {

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    private int field6247;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field6242 = 0;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "[I")
    public static int[] field6244 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "[S")
    public static short[] field6246 = new short[256];

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static int field6248 = 0;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field6245 = 0;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Lwl;")
    public static class452 field6249 = new class452(57, 8);

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!pf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6243++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)I")
    public final int method2618(byte arg0) {
        if (arg0 == -31) {
            field6241++;
            return this.field6247;
        } else {
            return 121;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)V")
    public static void method2619(byte arg0) {
        if (arg0 < 56) {
            field6244 = null;
        }
        field6244 = null;
        field6246 = null;
        field6249 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILfh;IB)V")
    public static final void method2620(int arg0, class170 arg1, int arg2, byte arg3) {
        field6240++;
        if (arg3 != 75) {
            return;
        }
        if (arg1.field2614 == 0) {
            arg1.field2478 = arg1.field2615;
        } else if (arg1.field2614 == 1) {
            arg1.field2478 = (arg2 - arg1.field2501) / 2 + arg1.field2615;
        } else if (arg1.field2614 == 2) {
            arg1.field2478 = arg2 - arg1.field2615 - arg1.field2501;
        } else if (arg1.field2614 == 3) {
            arg1.field2478 = arg1.field2615 * arg2 >> 14;
        } else if (arg1.field2614 == 4) {
            arg1.field2478 = (arg1.field2615 * arg2 >> 14) + (arg2 - arg1.field2501) / 2;
        } else {
            arg1.field2478 = arg2 - arg1.field2501 - (arg1.field2615 * arg2 >> 14);
        }
        if (arg1.field2530 == 0) {
            arg1.field2476 = arg1.field2523;
        } else if (arg1.field2530 == 1) {
            arg1.field2476 = (arg0 - arg1.field2561) / 2 + arg1.field2523;
        } else if (arg1.field2530 == 2) {
            arg1.field2476 = arg0 - (arg1.field2561 + arg1.field2523);
        } else if (arg1.field2530 == 3) {
            arg1.field2476 = arg1.field2523 * arg0 >> 14;
        } else if (arg1.field2530 == 4) {
            arg1.field2476 = (arg1.field2523 * arg0 >> 14) + (arg0 - arg1.field2561) / 2;
        } else {
            arg1.field2476 = arg0 - (arg1.field2523 * arg0 >> 14) - arg1.field2561;
        }
        if (!class120.field1586) {
            return;
        }
        if (client.method2796(arg1).field4689 == 0 && arg1.field2558 != 0) {
            return;
        }
        if (arg1.field2476 < 0) {
            arg1.field2476 = 0;
        } else if (arg1.field2561 + arg1.field2476 > arg0) {
            arg1.field2476 = arg0 - arg1.field2561;
        }
        if (arg1.field2478 < 0) {
            arg1.field2478 = 0;
            return;
        }
        if ((arg1.field2501 + arg1.field2478) > arg2) {
            arg1.field2478 = arg2 - arg1.field2501;
            return;
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(II)V")
    public class425(int arg0, int arg1) {
        this.field6247 = arg0;
    }
}
