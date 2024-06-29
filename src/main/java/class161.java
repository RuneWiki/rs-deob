import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class161 {

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "[B")
    public static byte[] field2762 = new byte[32896];

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "Lpe;")
    public static class100 field2767;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Lp;")
    public static class84 field2761;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "[[[B")
    public static byte[][][] field2766;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static void method1130(int arg0) {
        field2767 = null;
        field2762 = null;
        field2761 = null;
        field2766 = null;
        if (arg0 != 0) {
            method1131(-93, 54, -65);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)I")
    public static final int method1131(int arg0, int arg1, int arg2) {
        field2764++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (arg0 < ~var3) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field2762[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field2767 = new class100(4);
    }
}
