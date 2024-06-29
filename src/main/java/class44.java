import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class44 {

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public int field1046 = 0;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public int field1047 = 0;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field1048 = 0;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field1050 = 0;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "[I")
    public static int[] field1051 = new int[256];

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "Laf;")
    public static class7 field1055;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "Laf;")
    public static class7 field1060;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "Laf;")
    public static class7 field1056;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "Laf;")
    private static class7 field1058;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "Laf;")
    public static class7 field1059;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "Laf;")
    private static class7 field1061;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "Laf;")
    public static class7 field1054;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "Laf;")
    public static class7 field1062;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public int field1045;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public int field1049;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "Lod;")
    public class101 field1057;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "Lrd;")
    public static class122 field1043;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
    public static void method383(boolean arg0) {
        if (arg0) {
            field1060 = null;
        }
        field1059 = null;
        field1055 = null;
        field1051 = null;
        field1060 = null;
        field1061 = null;
        field1043 = null;
        field1058 = null;
        field1056 = null;
        field1054 = null;
        field1062 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)I")
    public static final int method384(int arg0, int arg1, int arg2) {
        if (arg0 != 28805) {
            return -82;
        }
        field1052++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg1 < 0) {
                arg1 = 0;
            } else if (arg1 > 127) {
                arg1 = 127;
            }
            return 127 - arg1;
        } else {
            int var4 = (arg2 & 0x7F) * arg1 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg2 & 0xFF80) + var4;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1051[var0] = var1;
        }
        field1055 = class48.method406(40, "<col=ff7000>");
        field1060 = class48.method406(40, "(Udns");
        field1056 = class48.method406(40, "Stufe)2");
        field1058 = class48.method406(40, "Sorry invited players only)3");
        field1059 = field1058;
        field1061 = class48.method406(40, "You can(Wt add yourself to your own friend list");
        field1054 = class48.method406(40, "null");
        field1062 = field1061;
    }
}
