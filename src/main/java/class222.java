import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class222 {

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Z")
    public static boolean field3160 = false;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field3162 = 0;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Lgv;")
    public static class237 field3158;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3159;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
    public static void method1404(boolean arg0) {
        if (!arg0) {
            field3160 = false;
        }
        field3159 = null;
        field3158 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B[BII)Ljava/lang/String;")
    public static final String method1405(byte arg0, byte[] arg1, int arg2, int arg3) {
        field3161++;
        char[] var4 = new char[arg3];
        int var5 = 0;
        if (arg0 != -20) {
            method1405((byte) -27, null, -99, -30);
        }
        for (int var6 = 0; var6 < arg3; var6++) {
            int var7 = arg1[arg2 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class269.field4005[var7 - 128];
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

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)Llf;")
    public static final class512 method1406(int arg0, int arg1, int arg2) {
        class306 var3 = class236.field3305[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4596;
    }
}
