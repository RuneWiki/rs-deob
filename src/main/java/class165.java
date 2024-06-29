import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class165 {

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "Z")
    public static boolean field1938 = false;

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "[Z")
    public static boolean[] field1940 = new boolean[100];

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "Lls;")
    public static class129 field1941 = new class129("RC", 1);

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!dca", name = "f", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IBI)I")
    public static final int method1009(int arg0, byte arg1, int arg2) {
        if (arg1 >= -120) {
            return -118;
        }
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        field1939++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(II)Lkaa;")
    public static final class44 method1010(int arg0, int arg1) {
        if (arg1 != 24294) {
            return null;
        }
        field1942++;
        if (arg0 == 0) {
            if ((double) class604.field8113 == 3.0D) {
                return class694.field9625;
            }
            if ((double) class604.field8113 == 4.0D) {
                return class64.field784;
            }
            if ((double) class604.field8113 == 6.0D) {
                return class26.field313;
            }
            if ((double) class604.field8113 >= 8.0D) {
                return class670.field9107;
            }
        } else if (arg0 == 1) {
            if ((double) class604.field8113 == 3.0D) {
                return class26.field313;
            }
            if ((double) class604.field8113 == 4.0D) {
                return class670.field9107;
            }
            if ((double) class604.field8113 == 6.0D) {
                return class621.field8434;
            }
            if ((double) class604.field8113 >= 8.0D) {
                return class683.field9309;
            }
        } else if (arg0 == 2) {
            if ((double) class604.field8113 == 3.0D) {
                return class621.field8434;
            }
            if ((double) class604.field8113 == 4.0D) {
                return class683.field9309;
            }
            if ((double) class604.field8113 == 6.0D) {
                return class349.field4486;
            }
            if ((double) class604.field8113 >= 8.0D) {
                return class96.field1245;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)V")
    public static void method1011(byte arg0) {
        if (arg0 >= -52) {
            method1009(100, (byte) -79, 91);
        }
        field1940 = null;
        field1941 = null;
    }
}
