import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class573 extends class115 {

    @OriginalMember(owner = "client!lba", name = "p", descriptor = "I")
    public static int field8111 = 0;

    @OriginalMember(owner = "client!lba", name = "q", descriptor = "I")
    public static int field8112 = 16777215;

    @OriginalMember(owner = "client!lba", name = "n", descriptor = "J")
    public static long field8109 = 0L;

    @OriginalMember(owner = "client!lba", name = "m", descriptor = "I")
    public static int field8108;

    @OriginalMember(owner = "client!lba", name = "o", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!lba", name = "r", descriptor = "I")
    public static int field8113;

    @OriginalMember(owner = "client!lba", name = "l", descriptor = "[Lqda;")
    public static class112[] field8107;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(BLwq;)Ljava/lang/String;")
    public static final String method3324(byte arg0, class176 arg1) {
        int var2 = 13 % ((arg0 - 23) / 51);
        field8110++;
        if (client.method2049(arg1).method3748(19) == 0) {
            return null;
        } else if (arg1.field2598 == null || arg1.field2598.trim().length() == 0) {
            return class52.field744 ? "Hidden-use" : null;
        } else {
            return arg1.field2598;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(III)I")
    public static final int method3325(int arg0, int arg1, int arg2) {
        field8108++;
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg2 >= -84) {
            method3325(4, -17, 2);
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "(I)V")
    public static void method3326(int arg0) {
        if (arg0 >= 108) {
            field8107 = null;
        }
    }
}
