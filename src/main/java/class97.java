import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class97 {

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field1534 = 0;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field1533 = -1;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "F")
    public static float field1530;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "[B")
    public byte[] field1536;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "[S")
    public short[] field1531;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "[S")
    public short[] field1535;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "[S")
    public short[] field1537;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method735(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1532++;
        int var6 = class252.method1631(class333.field4936, class424.field5996, arg5, -73);
        if (arg2 != 19021) {
            method735(24, -73, -85, 49, 47, 98);
        }
        int var7 = class252.method1631(class333.field4936, class424.field5996, arg0, -83);
        int var8 = class252.method1631(class176.field2630, class465.field6763, arg1, -90);
        int var9 = class252.method1631(class176.field2630, class465.field6763, arg4, arg2 ^ 0xFFFFB5D1);
        for (int var10 = var6; var10 <= var7; var10++) {
            class479.method2839(var9, var8, class271.field4078[var10], 105, arg3);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)V", line = 35)
    public static final void method736(int arg0, int arg1) {
        if (arg1 != 0) {
            field1534 = -40;
        }
        field1529++;
        if (class176.field2632 == null || arg0 > class176.field2632.length) {
            class176.field2632 = new int[arg0];
        }
    }
}
