import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class111 {

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1445 = new String[] { method1045(method1044(")\u0012Q-\u0000")), method1045(method1044(")\u0012Q.\u0000")), method1045(method1044("+\u0015\u0013\u0000")), method1045(method1044(">NQBU")), method1045(method1044(")\u0012Q/\u0000")) };

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1443 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "J")
    public static long field1444 = -1L;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BILha;I)V", line = 7)
    public static final void method1041(byte arg0, int arg1, class18 arg2, int arg3) {
        try {
            class727.field10423 = arg2;
            class387.field5654 = new class277[arg3][arg1];
            if (arg0 < 69) {
                method1041((byte) -115, 77, null, 97);
            }
            field1441++;
            if (class224.field3254 != null) {
                class167.field2143 = class679.method4878(class224.field3254[0], class224.field3254[5], class224.field3254[4], class224.field3254[1], 90, class224.field3254[3], class224.field3254[2]);
            }
            class340.field4955 = null;
            class164.field2121 = new class277();
            class321.method2542(true);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1445[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1445[2] : field1445[3]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)I", line = 28)
    public static final int method1042(int arg0) {
        try {
            field1442++;
            if (arg0 > -74) {
                return -88;
            } else if (class101.field1360 == 1) {
                return class576.field8332;
            } else {
                return class608.field8720;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1445[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V", line = 45)
    public static void method1043(byte arg0) {
        try {
            if (arg0 <= 101) {
                field1444 = 121L;
            }
            field1443 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1445[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1044(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x28);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1045(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 69;
                    break;
                case 1:
                    var10005 = 96;
                    break;
                case 2:
                    var10005 = 127;
                    break;
                case 3:
                    var10005 = 108;
                    break;
                default:
                    var10005 = 40;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
