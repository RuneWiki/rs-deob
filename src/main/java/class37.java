import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class37 extends class270 {

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field413 = 0;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "[I")
    public static int[] field416 = new int[1];

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "[Lot;")
    public static class538[] field414;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method199(int arg0) {
        field416 = null;
        field414 = null;
        if (arg0 != -5085) {
            method200(111, -100, -28, null);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[B)Ljava/lang/String;")
    public static final String method200(int arg0, int arg1, int arg2, byte[] arg3) {
        field415++;
        char[] var4 = new char[arg0];
        int var5 = arg1;
        for (int var6 = 0; var6 < arg0; var6++) {
            int var7 = arg3[arg2 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class689.field9726[var7 - 128];
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
