import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class212 {

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "Lmf;")
    public static class291 field3376 = new class291();

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field3379 = new String[100];

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field3377 = 0;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "[I")
    public static int[] field3380 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "Ls;")
    public static class186 field3381 = new class186(10, 6);

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "Lje;")
    public static class278 field3382 = new class278(9, 0, 4, 1);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)I", line = 4)
    public static final int method1438(int arg0, int arg1, int arg2) {
        if (arg1 != 12345678) {
            field3378 = -8;
        }
        field3375++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V", line = 41)
    public static void method1439(byte arg0) {
        field3382 = null;
        if (arg0 >= -21) {
            field3377 = 117;
        }
        field3381 = null;
        field3376 = null;
        field3380 = null;
        field3379 = null;
    }
}
