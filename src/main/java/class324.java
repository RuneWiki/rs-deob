import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class324 {

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "I")
    public static int field4135 = 0;

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "Ltba;")
    public static class56 field4132;

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "[[B")
    public static byte[][] field4136;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(III)Z")
    public static final boolean method1914(int arg0, int arg1, int arg2) {
        field4134++;
        if (arg2 <= 76) {
            return false;
        } else {
            return class177.method1088(arg0, -1, arg1) | (arg0 & 0x70000) != 0 || class506.method2928(arg0, arg1, 16);
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)V")
    public static void method1915(byte arg0) {
        if (arg0 > -87) {
            field4132 = null;
        }
        field4136 = null;
        field4132 = null;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "([BIBI)Ljava/lang/String;")
    public static final String method1916(byte[] arg0, int arg1, byte arg2, int arg3) {
        field4133++;
        char[] var4 = new char[arg3];
        int var5 = 0;
        int var6 = 43 / ((arg2 + 22) / 57);
        for (int var7 = 0; var7 < arg3; var7++) {
            int var8 = arg0[arg1 + var7] & 0xFF;
            if (var8 != 0) {
                if (var8 >= 128 && var8 < 160) {
                    char var9 = class244.field3144[var8 - 128];
                    if (var9 == '\u0000') {
                        var9 = '?';
                    }
                    var8 = var9;
                }
                var4[var5++] = (char) var8;
            }
        }
        return new String(var4, 0, var5);
    }
}
