import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class492 {

    @OriginalMember(owner = "client!vw", name = "f", descriptor = "[Lhr;")
    public static class556[] field6874 = new class556[14];

    @OriginalMember(owner = "client!vw", name = "i", descriptor = "B")
    public static byte field6877;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "I")
    public int field6870;

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "I")
    public int field6871;

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!vw", name = "e", descriptor = "I")
    public int field6873;

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "I")
    public int field6875;

    @OriginalMember(owner = "client!vw", name = "h", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V")
    public static void method2762(int arg0) {
        field6874 = null;
        if (arg0 >= -42) {
            method2764(26, null, 51, 36);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;)V")
    public static final void method2763(String arg0, boolean arg1, int arg2, String arg3) {
        class111.field1441 = arg3;
        class626.field9101 = arg0;
        class190.field2452 = arg1;
        field6872++;
        if (!class190.field2452 && class554.field7754 != 3 && class111.field1441.equals("") || class626.field9101.equals("")) {
            class372.method2272(3, (byte) -117);
            return;
        }
        class170.field2155 = false;
        if (class554.field7754 != 1) {
            class224.field2862 = 0;
            class286.field3724 = -1;
        }
        class372.method2272(-3, (byte) -83);
        class294.field3824 = 1;
        class606.field8716 = 0;
        class214.field2751 = arg2;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
    public static final String method2764(int arg0, byte[] arg1, int arg2, int arg3) {
        field6869++;
        char[] var4 = new char[arg0];
        int var5 = 0;
        int var6 = 0;
        if (arg2 != -3) {
            field6874 = null;
        }
        while (arg0 > var6) {
            int var7 = arg1[arg3 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class149.field1935[var7 - 128];
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
}
