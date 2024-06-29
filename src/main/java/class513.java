import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class513 extends class55 {

    @OriginalMember(owner = "client!uca", name = "m", descriptor = "I")
    public int field6940 = -1;

    @OriginalMember(owner = "client!uca", name = "v", descriptor = "Z")
    public boolean field6949 = false;

    @OriginalMember(owner = "client!uca", name = "o", descriptor = "Lea;")
    public static class547 field6942 = new class547(118, 1);

    @OriginalMember(owner = "client!uca", name = "u", descriptor = "Lwr;")
    public static class459 field6948 = new class459(16);

    @OriginalMember(owner = "client!uca", name = "w", descriptor = "I")
    public static int field6950 = 0;

    @OriginalMember(owner = "client!uca", name = "k", descriptor = "I")
    public int field6938;

    @OriginalMember(owner = "client!uca", name = "l", descriptor = "I")
    public int field6939;

    @OriginalMember(owner = "client!uca", name = "n", descriptor = "I")
    public int field6941;

    @OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
    public int field6943;

    @OriginalMember(owner = "client!uca", name = "q", descriptor = "I")
    public static int field6944;

    @OriginalMember(owner = "client!uca", name = "r", descriptor = "I")
    public int field6945;

    @OriginalMember(owner = "client!uca", name = "t", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!uca", name = "s", descriptor = "Lufa;")
    public static class680 field6946;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIIIII)V")
    public static final void method2840(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6944++;
        if (arg2 == arg4) {
            class473.method2666(arg0, arg2, true, arg1, arg5);
            return;
        }
        if (arg3 != 16977) {
            field6942 = null;
        }
        if (class122.field1604 <= (arg1 - arg2) && arg1 + arg2 <= class165.field2070 && arg0 - arg4 >= class759.field10576 && class29.field238 >= (arg0 + arg4)) {
            class271.method1625(arg0, arg2, arg5, (byte) -119, arg1, arg4);
        } else {
            class574.method3226(arg4, arg1, arg2, arg0, arg3 - 17066, arg5);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)V")
    public static void method2841(int arg0) {
        field6942 = null;
        field6946 = null;
        int var1 = -84 / ((arg0 - 11) / 35);
        field6948 = null;
    }

    @OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(I)V")
    public class513(int arg0) {
        this.field6940 = arg0;
    }
}
