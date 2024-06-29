import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class167 {

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "J")
    public static long field2045 = 0L;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V", line = 6)
    public static final void method963(byte arg0) {
        field2044++;
        if (arg0 != -28) {
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class90.field1032; var2++) {
            for (int var3 = 0; var3 < class30.field349; var3++) {
                if (class263.method1738(var1, true, var2, class431.field6408, var3, (byte) -43)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)I", line = 44)
    public static final int method964(int arg0) {
        field2047++;
        if (class600.field8764) {
            return 6;
        } else if (class454.field6790 == null) {
            return 0;
        } else {
            int var1 = -47 % ((37 - arg0) / 53);
            int var2 = class454.field6790.field9100;
            if (class341.method2197(var2, (byte) 102)) {
                return 1;
            } else if (class14.method81(var2, (byte) -102)) {
                return 2;
            } else if (class513.method3048(var2, -122)) {
                return 3;
            } else if (class288.method1864((byte) -104, var2)) {
                return 4;
            } else {
                return 5;
            }
        }
    }
}
