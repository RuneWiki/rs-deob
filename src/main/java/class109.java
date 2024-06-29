import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class109 extends class134 {

    @OriginalMember(owner = "client!qda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1559 = new String[] { method1013(method1012("HonQ&\u0011")), method1013(method1012("W~c\u0013")), method1013(method1012("B%!Q\u001a")), method1013(method1012("HonQ#\u0011")), method1013(method1012("HonQ$\u0011")) };

    @OriginalMember(owner = "client!qda", name = "r", descriptor = "[I")
    public static int[] field1555 = new int[2];

    @OriginalMember(owner = "client!qda", name = "p", descriptor = "Lhl;")
    public static class556 field1550 = new class556(103, 6);

    @OriginalMember(owner = "client!qda", name = "u", descriptor = "I")
    private int field1551;

    @OriginalMember(owner = "client!qda", name = "x", descriptor = "I")
    private int field1552;

    @OriginalMember(owner = "client!qda", name = "s", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!qda", name = "q", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!qda", name = "v", descriptor = "I")
    private int field1556;

    @OriginalMember(owner = "client!qda", name = "w", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!qda", name = "t", descriptor = "I")
    private int field1558;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)V", line = 5)
    public static void method1011(byte arg0) {
        try {
            field1555 = null;
            if (arg0 == -99) {
                field1550 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1559[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lsca;I)V", line = 16)
    public final void method100(class47 arg0, int arg1) {
        try {
            field1557++;
            if (arg1 >= -81) {
                this.field1552 = -65;
            }
            arg0.method489(this.field1551, -28777, this.field1558, this.field1556, this.field1552);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1559[4] + (arg0 == null ? field1559[1] : field1559[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(ILwq;)V", line = 27)
    public final void method102(int arg0, class176 arg1) {
        try {
            field1553++;
            this.field1552 = arg1.method1622(-18712);
            this.field1551 = arg1.method1622(-18712);
            this.field1558 = arg1.method1645((byte) -95);
            this.field1556 = arg1.method1645((byte) -122);
            int var3 = 41 / ((83 - arg0) / 34);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1559[3] + arg0 + ',' + (arg1 == null ? field1559[1] : field1559[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1012(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x67);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1013(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 57;
                    break;
                case 1:
                    var10005 = 11;
                    break;
                case 2:
                    var10005 = 15;
                    break;
                case 3:
                    var10005 = 127;
                    break;
                default:
                    var10005 = 103;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
