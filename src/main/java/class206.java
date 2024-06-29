import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class206 {

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "J")
    public static long field3173 = 0L;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3169 = "Loading interfaces - ";

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field3175 = 0;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field3176 = 0;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "F")
    public static float field3174;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Lrn;")
    public static class18 field3170;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "[[I")
    public static int[][] field3171;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V", line = 22)
    public static void method1531(byte arg0) {
        field3170 = null;
        int var1 = 3 / ((arg0 + 72) / 44);
        field3169 = null;
        field3171 = (int[][]) null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([BIZI)Ljava/lang/String;", line = 47)
    public static final String method1532(byte[] arg0, int arg1, boolean arg2, int arg3) {
        field3177++;
        if (arg2) {
            return (String) null;
        }
        char[] var4 = new char[arg1];
        int var5 = 0;
        for (int var6 = 0; var6 < arg1; var6++) {
            int var7 = arg0[arg3 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class71.field1068[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }
}
