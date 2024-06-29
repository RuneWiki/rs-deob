import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class112 {

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
    public static int field1577 = -1;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
    public static int field1578 = 0;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "Lbf;")
    public static class372 field1579 = new class372(1, 7);

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "Lfs;")
    public static class387 field1575;

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "[Ll;")
    public static class16[] field1582;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V", line = 6)
    public static void method908(byte arg0) {
        field1582 = null;
        int var1 = -91 / ((arg0 + 47) / 62);
        field1575 = null;
        field1579 = null;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IBLaq;IILsb;Lnf;Lya;)V", line = 23)
    public static final void method909(int arg0, byte arg1, class111 arg2, int arg3, int arg4, class191 arg5, class405 arg6, class38 arg7) {
        field1574++;
        int var8 = arg2.field1569 - (arg3 / 2) - 5;
        int var9 = arg4 + 2;
        if (arg6.field6006 != 0) {
            arg7.method367(var8, arg3 + 10, var9, (byte) 58, arg6.field6006, arg5.method1341() * arg0 + arg4 + 1 - var9);
        }
        if (arg6.field5990 != 0) {
            arg7.method370(var8, arg6.field5990, arg0 * arg5.method1341() + (arg4 - var9) + 1, 8, arg3 + 10, var9);
        }
        int var10 = arg6.field6015;
        int var11 = -124 % ((arg1 - 63) / 61);
        if (arg2.field1561 && arg6.field5992 != -1) {
            var10 = arg6.field5992;
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            String var13 = class193.field2808[var12];
            if (var12 < arg0 - 1) {
                var13 = var13.substring(0, var13.length() - 4);
            }
            arg5.method1342(arg7, var13, arg2.field1569, arg4, var10, true);
            arg4 += arg5.method1341();
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "([I[JI)V", line = 71)
    public static final void method910(int[] arg0, long[] arg1, int arg2) {
        class8.method56(0, (byte) 38, arg1.length - 1, arg0, arg1);
        field1580++;
        if (arg2 != 29621) {
            field1575 = null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)V", line = 85)
    public static final void method911(int arg0, int arg1) {
        field1581++;
        class215 var2 = class171.method1208(arg1, (byte) 118, 6);
        if (arg0 >= 61) {
            var2.method1469((byte) -102);
        }
    }
}
