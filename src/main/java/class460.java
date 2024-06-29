import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class460 {

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
    public static int field6564 = 0;

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "Z")
    public static boolean field6567 = false;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
    public static int field6565;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIII)I")
    public static final int method2757(int arg0, int arg1, int arg2, int arg3) {
        field6562++;
        if (class485.field6947 == null) {
            return 0;
        }
        int var4 = arg3 >> 9;
        int var5 = arg1 >> 9;
        if (var4 < arg0 || var5 < 0 || class675.field9604 - 1 < var4 || class218.field3316 - 1 < var5) {
            return 0;
        }
        int var6 = arg2;
        if (arg2 < 3 && (class517.field7301[1][var4][var5] & 0x2) != 0) {
            var6 = arg2 + 1;
        }
        return class485.field6947[var6].method552(1, arg3, arg1);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
    public static final void method2758(int arg0) {
        field6566++;
        if (arg0 == 1) {
            class606.method3488((byte) 104);
        }
    }
}
