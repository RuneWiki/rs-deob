import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class417 {

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Z")
    public static boolean field5880 = false;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Z")
    public static boolean field5879 = false;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Llaa;")
    public static class106 field5877 = new class106(0, 2, 2, 1);

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Lpj;")
    public static class132 field5876;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "Lpj;")
    public static class132 field5882;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "[[B")
    public static byte[][] field5874;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 11)
    public static void method2381(int arg0) {
        field5882 = null;
        if (arg0 == -18350) {
            field5876 = null;
            field5877 = null;
            field5874 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(CB)B", line = 24)
    public static final byte method2382(char arg0, byte arg1) {
        if (arg1 != 71) {
            method2383((byte) -55);
        }
        field5881++;
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V", line = 161)
    public static final void method2383(byte arg0) {
        if (arg0 >= -106) {
            field5878 = 43;
        }
        field5875++;
        for (class137 var1 = (class137) class83.field1161.method1270((byte) -25); var1 != null; var1 = (class137) class83.field1161.method1282(0)) {
            class552 var2 = var1.field1928;
            if (var2.field7483) {
                var1.method2971(1);
                var2.method3035(-1);
            } else if (var2.field7474 <= class239.field3440) {
                var2.method3032(class371.field5290, 8);
                if (var2.field7483) {
                    var1.method2971(1);
                } else {
                    class580.method3224(var2, true);
                }
            }
        }
    }
}
