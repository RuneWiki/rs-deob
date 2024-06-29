import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public abstract class class40 extends class86 {

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "[Z")
    public static boolean[] field597 = new boolean[100];

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    public static int field599 = 1;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "[Lsd;")
    public static class27[] field596;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V", line = 7)
    public static void method357(int arg0) {
        if (arg0 >= -27) {
            method359((byte) 32);
        }
        field597 = null;
        field596 = null;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(B)V", line = 24)
    public static final void method359(byte arg0) {
        class310.field4839 = null;
        class201.field3195 = null;
        class33.field410 = null;
        field600++;
        if (arg0 != -56) {
            method359((byte) 105);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIILfk;)V", line = 39)
    public static final void method360(int arg0, int arg1, int arg2, class45 arg3) {
        if (arg0 != 0) {
            return;
        }
        if (arg3.field4439 == arg1 && arg1 != -1) {
            class162 var4 = class173.method1259((byte) 119, arg1);
            int var5 = var4.field2402;
            if (var5 == 1) {
                arg3.field4536 = 0;
                arg3.field4504 = 1;
                arg3.field4437 = arg2;
                arg3.field4522 = 0;
                arg3.field4508 = 0;
                class158.method1143(arg3.field4496, 112, arg3.field4507, var4, false, arg3.field4536);
            }
            if (var5 == 2) {
                arg3.field4522 = 0;
            }
        } else if (arg1 == -1 || arg3.field4439 == -1 || class173.method1259((byte) 119, arg1).field2405 >= class173.method1259((byte) 119, arg3.field4439).field2405) {
            arg3.field4528 = arg3.field4453;
            arg3.field4508 = 0;
            arg3.field4437 = arg2;
            arg3.field4439 = arg1;
            arg3.field4536 = 0;
            arg3.field4522 = 0;
            arg3.field4504 = 1;
            if (arg3.field4439 != -1) {
                class158.method1143(arg3.field4496, 121, arg3.field4507, class173.method1259((byte) 119, arg3.field4439), false, arg3.field4536);
            }
        }
        field598++;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method358(int arg0);

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(B)Z")
    public abstract boolean method361(byte arg0);
}
