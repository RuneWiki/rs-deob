import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class353 {

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field4946 = 0;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "F")
    public static float field4952;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public int field4950;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "Lvo;")
    public static class345 field4948;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "Ldn;")
    public class546 field4953;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "[I")
    public int[] field4949;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "[I")
    public static int[] field4951;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
    public static void method2136(int arg0) {
        field4951 = null;
        field4948 = null;
        if (arg0 != 255) {
            field4952 = 1.788433F;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([BIII)Ljava/lang/String;")
    public static final String method2137(byte[] arg0, int arg1, int arg2, int arg3) {
        field4947++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        for (int var6 = arg3; var6 < arg2; var6++) {
            int var7 = arg0[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class516.field7644[var7 - 128];
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
