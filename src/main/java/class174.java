import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class174 {

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "Lbu;")
    public static class19 field2677 = new class19();

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
    public static final String method1222(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 != -129) {
            method1223(89);
        }
        field2676++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        for (int var6 = 0; var6 < arg2; var6++) {
            int var7 = arg1[arg0 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class360.field4900[var7 - 128];
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

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V")
    public static void method1223(int arg0) {
        field2677 = null;
        if (arg0 != 0) {
            field2677 = null;
        }
    }
}
