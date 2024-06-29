import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class237 {

    @OriginalMember(owner = "client!du", name = "a", descriptor = "Lff;")
    public static class9 field3174 = new class9(84, 10);

    @OriginalMember(owner = "client!du", name = "e", descriptor = "[[I")
    public static int[][] field3178 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!du", name = "b", descriptor = "Lff;")
    public static class9 field3175 = new class9(96, -2);

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V", line = 4)
    public static void method1470(int arg0) {
        field3174 = null;
        field3175 = null;
        if (arg0 != 0) {
            field3176 = 91;
        }
        field3178 = null;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IB)C", line = 28)
    public static final char method1471(int arg0, byte arg1) {
        field3177++;
        if (arg0 != 5728) {
            method1471(-23, (byte) -7);
        }
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class106.field1560[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }
}
