import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class409 {

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field5682 = 0;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "[C")
    private static char[] field5684 = new char[64];

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "Leq;")
    public static class209 field5685;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field5684[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field5684[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field5684[var2] = (char) (var2 + 48 - 52);
        }
        field5684[62] = '*';
        field5684[63] = '-';
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)I", line = 7)
    public static final int method2499(byte arg0, int arg1) {
        if (arg0 != -125) {
            field5685 = null;
        }
        field5683++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V", line = 19)
    public static void method2500(byte arg0) {
        field5684 = null;
        field5685 = null;
        if (arg0 != 12) {
            method2500((byte) -43);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BIIII)V", line = 31)
    public static final void method2501(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field5681++;
        int var5 = class434.field6075;
        int var6 = class65.field1177;
        if (class200.field2876) {
            var5 += class228.method1570((byte) 73);
            var6 += class252.method1712((byte) 37);
        }
        if (class369.field5174 == 1) {
            class743 var7 = class631.field9051[class217.field3092 / 100];
            var7.method4135(var5 - 8, var6 + -8);
            class6.method33(true, var7.method83() + var6 - 8, var6 + -8, var5 - 8, var7.method82() + var5 + -8);
        }
        if (arg0 <= 52) {
            method2500((byte) -98);
        }
        if (class369.field5174 == 2) {
            class743 var8 = class631.field9051[class217.field3092 / 100 + 4];
            var8.method4135(var5 - 8, var6 - 8);
            class6.method33(true, var8.method83() + (var6 - 8), var6 + -8, var5 - 8, var5 - 8 - -var8.method82());
        }
        class279.method1829(-3200);
    }
}
