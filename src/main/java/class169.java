import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class169 {

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "[I")
    public static int[] field2212 = new int[1000];

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "[I")
    public static int[] field2213 = new int[32];

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "Z")
    public static boolean field2214;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "[Z")
    public static boolean[] field2215;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[BII)Ljava/lang/String;", line = 19)
    public static final String method1104(int arg0, byte[] arg1, int arg2, int arg3) {
        field2211++;
        char[] var4 = new char[arg0];
        int var5 = 0;
        if (arg2 <= 30) {
            field2216 = 95;
        }
        for (int var6 = 0; var6 < arg0; var6++) {
            int var7 = arg1[arg3 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class210.field2961[var7 - 128];
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

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 79)
    public static void method1105(int arg0) {
        field2212 = null;
        int var1 = -97 % ((25 - arg0) / 37);
        field2213 = null;
        field2215 = null;
    }
}
