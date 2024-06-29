import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class89 {

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "[I")
    public static int[] field1484 = new int[1];

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "J")
    public static long field1488;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(BII)I", line = 8)
    public static final int method766(byte arg0, int arg1, int arg2) {
        field1485++;
        int var3 = arg1 >>> 24;
        if (arg0 >= -88) {
            field1484 = null;
        }
        int var4 = 255 - var3;
        int var5 = ((arg1 & 0xFF00) * var3 & 0xFF0000 | (arg1 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
        return (((arg2 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg2 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIZIII)V", line = 30)
    public static final void method767(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -35) {
            method769((byte) 119);
        }
        field1487++;
        if ((arg2 ? class287.field4270.field3691 : class287.field4270.field3697) != 0 && arg4 != 0 && class8.field83 < 50 && arg5 != -1) {
            class106.field1642[class8.field83++] = new class603((byte) (arg2 ? 3 : 2), arg5, arg4, arg1, arg3, 0);
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IZI)Z", line = 49)
    public static final boolean method768(int arg0, boolean arg1, int arg2) {
        field1486++;
        if (arg1) {
            method766((byte) 3, 107, 44);
        }
        return (arg2 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V", line = 68)
    public static void method769(byte arg0) {
        field1484 = null;
        int var1 = -24 % ((40 - arg0) / 36);
    }
}
