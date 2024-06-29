import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class349 {

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "I")
    public int field5122;

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!ofa", name = "d", descriptor = "I")
    public int field5124;

    @OriginalMember(owner = "client!ofa", name = "e", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!ofa", name = "f", descriptor = "I")
    public int field5126;

    @OriginalMember(owner = "client!ofa", name = "h", descriptor = "Ljava/lang/Object;")
    public static Object field5128;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "Z")
    public boolean field5121;

    @OriginalMember(owner = "client!ofa", name = "g", descriptor = "Z")
    public boolean field5127;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIIZI)Z", line = 3)
    public static final boolean method2202(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field5123++;
        if ((class66.field931[0][arg1][arg0] & 0x2) != 0) {
            return true;
        } else if ((class66.field931[arg4][arg1][arg0] & 0x10) != 0) {
            return false;
        } else if (arg3) {
            return true;
        } else {
            return arg2 == class752.method4187(arg0, 2, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "([BIII)Ljava/lang/String;", line = 29)
    public static final String method2203(byte[] arg0, int arg1, int arg2, int arg3) {
        field5125++;
        char[] var4 = new char[arg3];
        int var5 = 0;
        int var6 = 0;
        if (arg1 != 1958) {
            method2203(null, 29, -40, -43);
        }
        while (arg3 > var6) {
            int var7 = arg0[arg2 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class714.field9988[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
            var6++;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)V", line = 76)
    public static void method2204(int arg0) {
        if (arg0 != 128) {
            field5128 = null;
        }
        field5128 = null;
    }
}
