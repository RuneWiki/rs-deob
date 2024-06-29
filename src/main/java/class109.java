import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class109 extends class154 {

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    public int field1556;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public int field1558;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "Ljava/lang/String;")
    public static String field1559 = "glow2:";

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "Z")
    public static boolean field1560 = false;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public static int field1554 = -1;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "[[[B")
    public static byte[][][] field1551;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI[BI)Ljava/lang/String;")
    public static final String method695(byte arg0, int arg1, byte[] arg2, int arg3) {
        field1553++;
        if (arg0 != 13) {
            return null;
        }
        char[] var4 = new char[arg1];
        int var5 = 0;
        for (int var6 = 0; var6 < arg1; var6++) {
            int var7 = arg2[arg3 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class85.field1212[var7 - 128];
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

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILnh;)Z")
    public static final boolean method696(int arg0, int arg1, class305 arg2) {
        field1552++;
        byte[] var3 = arg2.method2059(arg0 + arg0, arg1);
        if (var3 == null) {
            return false;
        } else {
            class115.method734(false, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
    public static void method697(int arg0) {
        field1551 = null;
        field1559 = null;
        if (arg0 != -1) {
            method698((byte) 75, (String) null);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method698(byte arg0, String arg1) {
        field1557++;
        int var2 = -44 / ((arg0 - 55) / 41);
        System.out.println("Error: " + class290.method1947((byte) 64, "\n", arg1, "%0a"));
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(II)V")
    public class109(int arg0, int arg1) {
        this.field1556 = arg0;
        this.field1558 = arg1;
    }
}
