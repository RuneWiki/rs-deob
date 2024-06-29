import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class103 {

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public int field1377;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "[J")
    public static long[] field1372 = new long[32];

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field1374 = 0;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "Loo;")
    public static class10 field1375;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIII)V", line = 8)
    public static final void method777(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class590.field8006 = arg3;
        if (arg0 != 4846) {
            field1374 = -9;
        }
        class195.field2549 = arg1;
        class579.field7893 = arg6;
        class213.field2748 = arg5;
        field1369++;
        class448.field5869 = arg2;
        class626.field8758 = arg4;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)C", line = 31)
    public static final char method778(int arg0, byte arg1) {
        field1371++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class578.field7885[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        if (arg0 != 12270) {
            field1375 = null;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!fl", name = "toString", descriptor = "()Ljava/lang/String;", line = 65)
    public final String toString() {
        field1373++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V", line = 73)
    public static void method779(byte arg0) {
        field1375 = null;
        if (arg0 >= 37) {
            field1372 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(II)V", line = 87)
    public class103(int arg0, int arg1) {
        this.field1377 = arg1;
    }
}
