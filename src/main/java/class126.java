import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class126 {

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "[I")
    public int[] field1582;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "[[F")
    public float[][] field1581;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "[I")
    public int[] field1587;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "[I")
    public int[] field1578;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1588 = new String[] { method1125(method1124(",\u00105\u0015v")), method1125(method1124("9KwW")), method1125(method1124("6U5x#")), method1125(method1124("6U5y#")), method1125(method1124("6U5z#")), method1125(method1124("6U5\u0007b9Wo\u0005#")) };

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "[S")
    public static short[] field1580 = new short[256];

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "[I")
    public static int[] field1586 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public static void method1121(byte arg0) {
        try {
            field1586 = null;
            field1580 = null;
            if (arg0 >= -26) {
                field1579 = -5;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1588[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static final void method1122(int arg0) {
        try {
            class537.field7895 = 0;
            class751.field10694 = 0;
            class213.field3123 = 0;
            class427.field6145 = 0;
            class655.field9286 = 0;
            if (arg0 != 120) {
                field1579 = -128;
            }
            class353.field5113 = 0;
            field1584++;
            for (int var1 = 0; var1 < class99.field1336.length; var1++) {
                class99.field1336[var1] = null;
            }
            class646.method4709((byte) 104);
            for (int var2 = 0; var2 < 2048; var2++) {
                class748.field10666[var2] = null;
            }
            class438.field6458 = 0;
            class479.field7063.method3690((byte) 123);
            class715.field10182 = 0;
            class414.field5965.method3690((byte) 77);
            class169.method1420(34);
            class292.field4116 = 0;
            class734.field10459.method3776(30111);
            class343.field4995 = null;
            class611.field8751 = null;
            class299.field4174 = null;
            class30.field382 = null;
            class558.field8118 = 0L;
            class713.field10112 = null;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1588[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "([I[I[I[[F)V")
    public class126(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        try {
            this.field1582 = arg1;
            this.field1581 = arg3;
            this.field1587 = arg2;
            this.field1578 = arg0;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field1588[5] + (arg0 == null ? field1588[1] : field1588[0]) + ',' + (arg1 == null ? field1588[1] : field1588[0]) + ',' + (arg2 == null ? field1588[1] : field1588[0]) + ',' + (arg3 == null ? field1588[1] : field1588[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lha;Lnga;B)I")
    public static final int method1123(class18 arg0, class461 arg1, byte arg2) {
        try {
            field1585++;
            if (arg1.field6720 != -1) {
                return arg1.field6720;
            }
            if (arg1.field6728 != -1) {
                class684 var3 = arg0.field237.method4500(arg2 ^ 0x5C53, arg1.field6728);
                if (!var3.field9583) {
                    return var3.field9596;
                }
            }
            return arg2 == -12 ? arg1.field6726 : -37;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1588[2] + (arg0 == null ? field1588[1] : field1588[0]) + ',' + (arg1 == null ? field1588[1] : field1588[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1124(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xB);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1125(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 87;
                    break;
                case 1:
                    var10005 = 62;
                    break;
                case 2:
                    var10005 = 27;
                    break;
                case 3:
                    var10005 = 59;
                    break;
                default:
                    var10005 = 11;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
