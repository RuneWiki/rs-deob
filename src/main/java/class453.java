import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public class class453 {

    @OriginalMember(owner = "client!bja", name = "c", descriptor = "I")
    public int field6627 = -1;

    @OriginalMember(owner = "client!bja", name = "f", descriptor = "Lqu;")
    public class84 field6631;

    @OriginalMember(owner = "client!bja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6635 = new String[] { method3511(method3510("\\[/as\u0016")), method3511(method3510("\\[/ar\u0016")), method3511(method3510("PD\"#")), method3511(method3510("E\u001f`aM")), method3511(method3510("\\[/aq\u0016")), method3511(method3510("\\[/a\fW_';\u000e\u0016")) };

    @OriginalMember(owner = "client!bja", name = "b", descriptor = "Z")
    public static boolean field6626 = false;

    @OriginalMember(owner = "client!bja", name = "e", descriptor = "Lmv;")
    public static class125 field6632 = new class125(5, -1);

    @OriginalMember(owner = "client!bja", name = "d", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!bja", name = "h", descriptor = "I")
    public int field6629;

    @OriginalMember(owner = "client!bja", name = "g", descriptor = "I")
    public int field6630;

    @OriginalMember(owner = "client!bja", name = "i", descriptor = "I")
    public int field6633;

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(Lih;I)I", line = 3)
    public static final int method3507(class717 arg0, int arg1) {
        try {
            field6628++;
            class134 var2 = arg0.field10229;
            if (var2.field1659 != null) {
                var2 = var2.method1178(class734.field10459, (byte) -85);
                if (var2 == null) {
                    return -1;
                }
            }
            int var3 = var2.field1731;
            class765 var4 = arg0.method1430(27750);
            int var5 = arg0.field2182.method837(-93);
            if (arg1 == var5 || arg0.field2204) {
                var3 = var2.field1697;
            } else if (var4.field10902 == var5 || var4.field10905 == var5 || var4.field10920 == var5 || var4.field10932 == var5) {
                var3 = var2.field1708;
            } else if (var4.field10923 == var5 || var4.field10922 == var5 || var4.field10879 == var5 || var4.field10892 == var5) {
                var3 = var2.field1735;
            }
            return var3;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field6635[4] + (arg0 == null ? field6635[2] : field6635[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(ZI)I", line = 41)
    public static final int method3508(boolean arg0, int arg1) {
        try {
            int var2 = -53 % ((arg1 - 31) / 44);
            field6634++;
            int var3 = class101.field1360;
            if (var3 == 0) {
                return arg0 ? 0 : class224.field3263;
            } else if (var3 == 1) {
                return class224.field3263;
            } else if (var3 == 2) {
                return 0;
            } else {
                return 0;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6635[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(I)V", line = 83)
    public static void method3509(int arg0) {
        try {
            field6632 = null;
            int var1 = -37 % ((arg0 - 1) / 51);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6635[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(Lqo;)V", line = 110)
    public class453(class170 arg0) {
        try {
            this.field6631 = new class689(arg0, false);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6635[5] + (arg0 == null ? field6635[2] : field6635[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!bja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3510(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x30);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3511(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 62;
                    break;
                case 1:
                    var10005 = 49;
                    break;
                case 2:
                    var10005 = 78;
                    break;
                case 3:
                    var10005 = 79;
                    break;
                default:
                    var10005 = 48;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
