import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class644 {

    @OriginalMember(owner = "client!dia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9167 = new String[] { method4703(method4702("O\")L@\u0003")), method4703(method4702("O\")LC\u0003")) };

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "I")
    public static int field9166 = 100;

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "Lmv;")
    public static class125 field9163 = new class125(41, 7);

    @OriginalMember(owner = "client!dia", name = "d", descriptor = "I")
    public static int field9165;

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "[S")
    public static short[] field9164;

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(B)V", line = 4)
    public static void method4700(byte arg0) {
        try {
            field9164 = null;
            if (arg0 > 110) {
                field9163 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9167[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)V", line = 21)
    public static final void method4701(int arg0) {
        try {
            field9165++;
            int var1 = 0;
            if (arg0 >= -71) {
                field9163 = null;
            }
            while (var1 < class559.field8137) {
                int var2 = class80.method793(true, class559.field8137, class322.field4397 + var1) * class419.field6030;
                for (int var3 = 0; var3 < class419.field6030; var3++) {
                    int var4 = class80.method793(true, class419.field6030, var3 + class109.field1427) + var2;
                    if (class492.field7235[var4] == class613.field8768) {
                        class637.field9013[var4].method687(0, 0, class567.field8258, class389.field5670, class567.field8258 * var3, class389.field5670 * var1, true, true);
                    }
                }
                var1++;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9167[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4702(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4703(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 43;
                    break;
                case 1:
                    var10005 = 75;
                    break;
                case 2:
                    var10005 = 72;
                    break;
                case 3:
                    var10005 = 98;
                    break;
                default:
                    var10005 = 2;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
