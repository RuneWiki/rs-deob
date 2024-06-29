import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class153 extends class130 {

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field2945 = 0;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field2947 = 0;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field2952 = 0;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    public static int field2954 = 0;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "[J")
    public static long[] field2955 = new long[32];

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public int field2946;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "Lsg;")
    public static class169 field2949;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "Lcb;")
    public class22 field2950;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "Lje;")
    public class86 field2948;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "[B")
    public byte[] field2953;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
    public static final void method1032(int arg0, int arg1) {
        field2956++;
        if (arg0 != 2071615536) {
            return;
        }
        for (class39 var2 = (class39) class164.field3120.method221(0); var2 != null; var2 = (class39) class164.field3120.method222(-126)) {
            if ((long) arg1 == (var2.field2541 >> 48 & 0xFFFFL)) {
                var2.method915(0);
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)I")
    public static final int method1033(int arg0, int arg1, int arg2) {
        class134 var3 = (class134) class79.field1606.method224(-1, (long) arg0);
        field2951++;
        if (var3 == null) {
            return 0;
        } else if (~arg2 == arg1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field2594.length; var5++) {
                if (var3.field2595[var5] == arg2) {
                    var4 += var3.field2594[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
    public static void method1034(int arg0) {
        int var1 = 27 % ((arg0 - 59) / 42);
        field2949 = null;
        field2955 = null;
    }
}
