import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class203 {

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field2433 = 1406;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIII)I", line = 7)
    public static final int method1089(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != -16939) {
            field2433 = -100;
        }
        field2432++;
        if (class128.field1574 == null) {
            return 0;
        }
        if (arg1 < 3) {
            int var6 = arg3 >> 7;
            int var7 = arg2 >> 7;
            if (arg0 < 0 || arg4 < 0 || arg0 > (class106.field1289 - 1) || arg4 > (class422.field5452 - 1)) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || class106.field1289 - 1 < var6 || var7 > (class422.field5452 - 1)) {
                return 0;
            }
            boolean var8 = (class330.field4304[1][arg3 >> 7][arg2 >> 7] & 0x2) != 0;
            if ((arg3 & 0x7F) == 0) {
                boolean var9 = (class330.field4304[1][var6 - 1][arg2 >> 7] & 0x2) != 0;
                boolean var10 = (class330.field4304[1][var6][arg2 >> 7] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class330.field4304[1][arg0][arg4] & 0x2) != 0;
                }
            }
            if ((arg2 & 0x7F) == 0) {
                boolean var11 = (class330.field4304[1][arg3 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class330.field4304[1][arg3 >> 7][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class330.field4304[1][arg0][arg4] & 0x2) != 0;
                }
            }
            if (var8) {
                arg1++;
            }
        }
        return class128.field1574[arg1].method847(arg3, arg2);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)V", line = 76)
    public static final void method1090(byte arg0, int arg1) {
        if (arg0 != -124) {
            field2433 = 104;
        }
        field2434++;
        class557 var2 = class93.method564(14, -14073, arg1);
        var2.method3264(arg0 ^ 0x3DD8E364);
    }
}
