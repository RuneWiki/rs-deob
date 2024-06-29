import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class97 {

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
    public static int field1370 = 0;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)V")
    public static final void method663(int arg0, int arg1) {
        if (~class73.field1096 == arg1) {
            class47.field668 = arg0;
        } else if (class73.field1096 == 2) {
            class12.field102 = arg0;
        }
        field1371++;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)J")
    public static final synchronized long method664(byte arg0) {
        if (arg0 != -50) {
            field1370 = -9;
        }
        field1369++;
        long var1 = System.currentTimeMillis();
        if (var1 < class332.field4706) {
            class505.field7029 += class332.field4706 - var1;
        }
        class332.field4706 = var1;
        return class505.field7029 + var1;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)B")
    public static final byte method665(int arg0, int arg1, int arg2) {
        field1372++;
        if (arg0 != 9) {
            return 0;
        } else if (arg1 == 10629) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 42;
        }
    }
}
