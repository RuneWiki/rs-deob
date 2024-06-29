import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class35 extends class324 {

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field396 = 0;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "Lig;")
    public static class206 field394 = new class206(109, -2);

    @OriginalMember(owner = "client!i", name = "n", descriptor = "[Lgea;")
    public static class66[] field397 = new class66[14];

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V", line = 6)
    public static final void method194(int arg0, int arg1) {
        field393++;
        class467 var2 = class541.method3144(arg1, (byte) -96, 14);
        var2.method2852(arg0 + arg0);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(Z)V", line = 18)
    public static void method195(boolean arg0) {
        field397 = null;
        if (!arg0) {
            field394 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIILeca;)V", line = 30)
    public static final void method196(int arg0, int arg1, int arg2, class655 arg3) {
        if (arg0 != -1961) {
            return;
        }
        field395++;
        if (arg3.field2502 == arg2 && arg2 != -1) {
            class177 var4 = class259.field3686.method2961(arg2, 8);
            int var5 = var4.field2160;
            if (var5 == 1) {
                arg3.field2482 = arg1;
                arg3.field2491 = 0;
                arg3.field2486 = 1;
                arg3.field2487 = 0;
                arg3.field2490 = 0;
                class405.method2571(class439.field6548 == arg3, arg3.field1764, 77, arg3.field1768, arg3.field1757, var4, arg3.field2491);
            }
            if (var5 == 2) {
                arg3.field2490 = 0;
                return;
            }
        } else if (arg2 == -1 || arg3.field2502 == -1 || class259.field3686.method2961(arg2, 8).field2161 >= class259.field3686.method2961(arg3.field2502, 8).field2161) {
            arg3.field2502 = arg2;
            arg3.field2519 = arg3.field2517;
            arg3.field2482 = arg1;
            arg3.field2486 = 1;
            arg3.field2487 = 0;
            arg3.field2491 = 0;
            arg3.field2490 = 0;
            if (arg3.field2502 == -1) {
                return;
            }
            class405.method2571(class439.field6548 == arg3, arg3.field1764, arg0 ^ 0x789, arg3.field1768, arg3.field1757, class259.field3686.method2961(arg3.field2502, 8), arg3.field2491);
        }
    }
}
