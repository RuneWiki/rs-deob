import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class55 extends class129 {

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
    public static int field1097 = 0;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public static int field1094 = 0;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "Lrd;")
    private static class173 field1103 = class133.method843("Please wait 5 minutes before trying again)3", 100);

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "Lrd;")
    public static class173 field1100 = field1103;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "B")
    public byte field1098;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    public int field1104;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "Lrd;")
    public class173 field1096;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "Lrd;")
    public class173 field1101;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "[I")
    public static int[] field1099;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
    public static void method356(byte arg0) {
        field1099 = null;
        int var1 = -1 % ((arg0 - 9) / 49);
        field1100 = null;
        field1103 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIILdd;IJZ)Z")
    public static final boolean method357(int arg0, int arg1, int arg2, int arg3, int arg4, class35 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class177.method1184(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }
}
