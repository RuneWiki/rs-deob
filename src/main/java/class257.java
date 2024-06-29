import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class257 {

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field4201 = -1;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4205 = "cyan:";

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field4206 = 0;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "Lek;")
    public static class206 field4202;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V", line = 4)
    public static void method1797(byte arg0) {
        field4202 = null;
        field4205 = null;
        int var1 = 43 / ((arg0 - 28) / 45);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)I", line = 16)
    public static final int method1798(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)I", line = 30)
    public static final int method1799(int arg0, boolean arg1) {
        int var2 = ((arg0 & 0xAAAAAAAB) >>> 1) + (arg0 & 0x55555555);
        field4204++;
        int var3 = ((var2 & 0xCCCCCCCE) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        if (arg1) {
            field4206 = 104;
        }
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 60)
    public static final void method1800(String arg0, int arg1, int arg2) {
        field4207++;
        if (arg2 != -2) {
            method1797((byte) -111);
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < class252.field4144; var4++) {
            class98 var5 = class182.field3151[class22.field556[var4]];
            if (var5 != null && var5.field1779 != null && var5.field1779.equalsIgnoreCase(arg0)) {
                if (arg1 == 1) {
                    class51.field1038.method291((byte) 61, 142);
                    class51.field1038.method1042((byte) -125, class22.field556[var4]);
                    class335.field5331++;
                    class51.field1038.method1027(0, -20374);
                } else if (arg1 == 4) {
                    class51.field1038.method291((byte) 76, 227);
                    class51.field1038.method1039((byte) -70, class22.field556[var4]);
                    class51.field1038.method1048((byte) 123, 0);
                    class36.field790++;
                } else if (arg1 == 5) {
                    class99.field1815++;
                    class51.field1038.method291((byte) -116, 40);
                    class51.field1038.method1042((byte) -125, class22.field556[var4]);
                    class51.field1038.method1027(0, -20374);
                } else if (arg1 == 6) {
                    class51.field1038.method291((byte) 80, 127);
                    class51.field1038.method1013(0, -126);
                    class37.field806++;
                    class51.field1038.method1042((byte) -125, class22.field556[var4]);
                } else if (arg1 == 7) {
                    class355.field5658++;
                    class51.field1038.method291((byte) 46, 166);
                    class51.field1038.method1042((byte) -125, class22.field556[var4]);
                    class51.field1038.method1048((byte) 98, 0);
                }
                var3 = true;
                break;
            }
        }
        if (!var3) {
            class172.method1225(class231.field3787 + arg0, 0);
        }
    }
}
