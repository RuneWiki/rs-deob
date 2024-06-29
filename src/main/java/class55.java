import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class55 {

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Z")
    public boolean field1094 = true;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public int field1092;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public int field1090;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public int field1098;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public int field1097;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "Lle;")
    public static class71 field1099 = new class71(50);

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public static int field1103 = 0;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "Lrc;")
    private static class105 field1104 = class43.method374("Prepared sound engine", 0);

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field1106 = 0;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "Lrc;")
    private static class105 field1105 = class43.method374("Connecting to friendserver", 0);

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "Lrc;")
    public static class105 field1109 = field1104;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "Lrc;")
    public static class105 field1107 = field1105;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "[Z")
    public static boolean[] field1111 = new boolean[112];

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "Lrc;")
    public static class105 field1110 = class43.method374("Gegenstand f-Ur Mitglieder", 0);

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
    public static int field1112 = -1;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "[I")
    public static int[] field1101 = new int[1000];

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "Lmd;")
    public static class76 field1093;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "[I")
    public static int[] field1102;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V", line = 10)
    public static final void method417(byte arg0) {
        class120.field2886.method602((byte) -70);
        class66.field1493.method602((byte) -70);
        field1091++;
        class117.field2729.method602((byte) -70);
        if (arg0 != 46) {
            field1111 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BII)I", line = 23)
    public static final int method418(byte arg0, int arg1, int arg2) {
        field1095++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 / 128;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg0 != 14) {
            field1093 = null;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)I", line = 64)
    public static int method419(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V", line = 115)
    public static void method420(byte arg0) {
        field1104 = null;
        field1107 = null;
        field1109 = null;
        field1099 = null;
        field1105 = null;
        if (arg0 != -23) {
            method418((byte) -126, -55, 1);
        }
        field1101 = null;
        field1093 = null;
        field1102 = null;
        field1111 = null;
        field1110 = null;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(IIIIIIZ)V", line = 140)
    public class55(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1092 = arg0;
        this.field1090 = arg3;
        this.field1098 = arg5;
        this.field1094 = arg6;
        this.field1100 = arg4;
        this.field1108 = arg1;
        this.field1097 = arg2;
    }
}
