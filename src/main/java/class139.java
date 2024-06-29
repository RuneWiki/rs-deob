import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class139 extends class80 {

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field2342 = 0;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Lhga;")
    public static class158 field2344 = new class158(43, 3);

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Lrw;")
    public static class703 field2340;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "[[I")
    public static int[][] field2345;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static void method1187(int arg0) {
        field2344 = null;
        field2340 = null;
        if (arg0 != -1) {
            field2344 = null;
        }
        field2345 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)I")
    public static final int method1188(int arg0, int arg1, int arg2) {
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        field2341++;
        if (arg2 != -2819) {
            field2344 = null;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII)V")
    public static final void method1189(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2343++;
        class413 var5 = class674.method3852(4, arg1, 124);
        var5.method2633(arg4 + 16783409);
        var5.field6333 = arg2;
        var5.field6337 = arg3;
        if (arg4 != -6194) {
            method1187(-60);
        }
        var5.field6340 = arg0;
    }
}
