import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class160 {

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "[J")
    public static long[] field2319 = new long[10];

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!dca", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field2320++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(III)Z", line = 11)
    public static final boolean method1129(int arg0, int arg1, int arg2) {
        field2318++;
        if (arg2 == 12805) {
            return (arg1 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIILua;ILin;Lf;I)V", line = 22)
    public static final void method1130(int arg0, int arg1, int arg2, class618 arg3, int arg4, class78 arg5, class702 arg6, int arg7) {
        field2317++;
        if (arg6 == null) {
            return;
        }
        int var8;
        if (class203.field2863 == 4) {
            var8 = (int) class705.field9964 & 0x3FFF;
        } else {
            var8 = (int) class705.field9964 + class174.field2526 & 0x3FFF;
        }
        int var9 = Math.max(arg5.field1104 / 2, arg5.field1050 / 2) + 10;
        int var10 = arg2 * arg2 + arg7 * arg7;
        if (var10 > (var9 * var9)) {
            return;
        }
        int var11 = class597.field8342[var8];
        int var12 = class597.field8344[var8];
        if (class203.field2863 != 4) {
            var12 = var12 * 256 / (class216.field3062 + 256);
            var11 = var11 * 256 / (class216.field3062 + 256);
        }
        int var13 = arg2 * var11 + arg7 * var12 >> 14;
        int var14 = arg2 * var12 - arg7 * var11 >> 14;
        if (arg1 != 256) {
            method1131((byte) -24);
        }
        arg6.method932(arg4 + (arg5.field1104 / 2) + var13 - arg6.method1660() / 2, arg5.field1050 / 2 + arg0 - (var14 + arg6.method1661() / 2), arg3, arg4, arg0);
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)V", line = 76)
    public static void method1131(byte arg0) {
        field2319 = null;
        if (arg0 != 31) {
            method1132(-116, -58, (byte) -1);
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIB)Z", line = 89)
    public static final boolean method1132(int arg0, int arg1, byte arg2) {
        if (arg2 != 83) {
            field2319 = null;
        }
        field2321++;
        boolean var3 = (arg0 & 0x37) == 0 ? class302.method1839((byte) 123, arg0, arg1) : class704.method3942(arg1, arg0, -1);
        return var3 | (arg1 & 0x10000) != 0 | class453.method2575(arg2 ^ 0x273, arg1, arg0);
    }
}
