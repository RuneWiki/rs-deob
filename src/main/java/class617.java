import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class617 extends class687 {

    @OriginalMember(owner = "client!k", name = "v", descriptor = "Ldr;")
    public class242 field8800;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8804 = new String[] { method4549(method4548(";\u000b-h\u00169Q/)")), method4549(method4548(">P}m")), method4549(method4548("+\u000b?/\u0005")), method4549(method4548(";\u000bS)")), method4549(method4548(";\u000bP)")) };

    @OriginalMember(owner = "client!k", name = "u", descriptor = "Ljava/lang/String;")
    public static String field8802 = null;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "I")
    public static int field8801;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "[[[S")
    public static short[][][] field8803;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V")
    public static final void method4545(boolean arg0) {
        try {
            field8801++;
            if (arg0) {
                field8803 = null;
            }
            class727.field10423.method160(class119.field1511, class449.field6583, class603.field8654);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8804[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static void method4546(int arg0) {
        try {
            int var1 = 114 / ((arg0 - 61) / 56);
            field8803 = null;
            field8802 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8804[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lrfa;Z[[[BIB)Z")
    public static final boolean method4547(class202 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class765.field10925) {
            return false;
        }
        int var5 = arg0.field2969 >> class179.field2328;
        int var6 = var5;
        int var7 = arg0.field2984 >> class179.field2328;
        int var8 = var7;
        if (arg0 instanceof class604) {
            var6 = ((class604) arg0).field8666;
            var8 = ((class604) arg0).field8661;
            var5 = ((class604) arg0).field8663;
            var7 = ((class604) arg0).field8669;
        }
        for (int var9 = var5; var9 <= var6; var9++) {
            for (int var10 = var7; var10 <= var8; var10++) {
                if (arg0.field2971 < class293.field4121 && var9 >= class123.field1548 && var9 < class159.field2046 && var10 >= class32.field407 && var10 < class618.field8815) {
                    if ((arg2 == null || arg0.field2981 < arg3 || arg2[arg0.field2981][var9][var10] != arg4) && arg0.method43((byte) 119) && !arg0.method45(class531.field7699, (byte) -83)) {
                        return false;
                    }
                    if (!arg1 && var9 >= class269.field3812 - 16 && var9 <= class269.field3812 + 16 && var10 >= class98.field1331 - 16 && var10 <= class98.field1331 + 16) {
                        if (class335.field4851) {
                            class658.field9320[class11.field155++].method2978(arg0, (byte) 102);
                            class11.field155 %= class433.field6280;
                        } else {
                            arg0.method586(class531.field7699, 0);
                        }
                    }
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ldr;)V")
    public class617(class242 arg0) {
        try {
            this.field8800 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8804[0] + (arg0 == null ? field8804[1] : field8804[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!k", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4548(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x78);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!k", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4549(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 80;
                    break;
                case 1:
                    var10005 = 37;
                    break;
                case 2:
                    var10005 = 17;
                    break;
                case 3:
                    var10005 = 1;
                    break;
                default:
                    var10005 = 120;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
