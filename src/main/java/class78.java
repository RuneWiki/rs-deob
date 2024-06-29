import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class78 {

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Lck;")
    private static class119 field1195 = class298.method1987((byte) 113, "red:");

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "[I")
    public static int[] field1198 = new int[256];

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "Lck;")
    public static class119 field1201 = field1195;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "Z")
    public static boolean field1199 = true;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "Lck;")
    public static class119 field1204 = field1195;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "Lck;")
    private static class119 field1206;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "Lck;")
    public static class119 field1207;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Lml;")
    public static class134 field1197;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)Lck;", line = 4)
    public static final class119 method546(byte arg0, int arg1) {
        field1196++;
        class119 var2 = new class119();
        var2.field1825 = 0;
        var2.field1838 = new byte[arg1];
        return arg0 > -32 ? (class119) null : var2;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)V", line = 29)
    public static final void method547(int arg0, boolean arg1) {
        field1203++;
        class106.field1620.method491(-59, arg0);
        if (!arg1) {
            class61.field970.method491(117, arg0);
            class50.field787.method491(-111, arg0);
            class118.field1794.method491(-124, arg0);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII[IIII[BII)V", line = 53)
    public static final void method548(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9, int arg10) {
        int var11 = ((arg7 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg7 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var12 = 256 - arg9;
        field1200++;
        int var13 = -arg1;
        if (arg10 > -9) {
            return;
        }
        while (var13 < 0) {
            for (int var14 = -arg5; var14 < 0; var14++) {
                if (arg8[arg2++] == 0) {
                    arg6++;
                } else {
                    int var15 = arg4[arg6];
                    arg4[arg6++] = var11 + (class19.method151(-16711936, class19.method151(var15, 16711935) * var12) + class19.method151(16711680, class19.method151(var15, 65280) * var12) >> 8);
                }
            }
            arg2 += arg0;
            arg6 += arg3;
            var13++;
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
            field1198[var0] = var1;
        }
        field1205 = 255;
        field1206 = class298.method1987((byte) 15, " from your friend list first)3");
        field1207 = field1206;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V", line = 99)
    public static void method549(boolean arg0) {
        field1198 = null;
        field1197 = null;
        field1206 = null;
        field1204 = null;
        if (!arg0) {
            field1207 = null;
            field1195 = null;
            field1201 = null;
        }
    }
}
