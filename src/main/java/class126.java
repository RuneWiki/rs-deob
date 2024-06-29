import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class126 {

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1824 = new String[] { method1218(method1217("^\f kEg\u0012|vDSN")), method1218(method1217("^\f \\\u0002")), method1218(method1217("^\f ^\u0002")), method1218(method1217("Z\u0013bs")), method1218(method1217("^\f [\u0002")), method1218(method1217("OH 1W")), method1218(method1217("^\f ]\u0002")) };

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field1819 = 0;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field1823 = 104;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "F")
    public static float field1822;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public static final void method1213(byte arg0) {
        try {
            if (arg0 != 54) {
                field1823 = -2;
            }
            if (class603.field8714 != null) {
                for (int var1 = 0; var1 < class603.field8714.length; var1++) {
                    for (int var2 = 0; var2 < class603.field8714[var1].length; var2++) {
                        class603.field8714[var1][var2] = class601.field8699;
                    }
                }
            }
            field1820++;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1824[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static final void method1214(int arg0) {
        try {
            field1821++;
            class417.field6594 = 0;
            int var1 = (class438.field6846.field9985 >> 9) + class397.field6289;
            int var2 = (class438.field6846.field9983 >> 9) + class141.field2011;
            if (arg0 == -9726) {
                if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
                    class417.field6594 = 1;
                }
                if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
                    class417.field6594 = 1;
                }
                if (class417.field6594 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
                    class417.field6594 = 0;
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1824[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I")
    public static final int method1215(int arg0, int arg1) {
        try {
            field1817++;
            if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
                return 6407;
            } else if (arg0 != 13522) {
                return -36;
            } else if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
                return 6408;
            } else if (arg1 == 6406 || arg1 == 34844) {
                return 6406;
            } else if (arg1 == 6409 || arg1 == 34846) {
                return 6409;
            } else if (arg1 == 6410 || arg1 == 34847) {
                return 6410;
            } else if (arg1 == 6402) {
                return 6402;
            } else {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1824[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1216(int arg0, String arg1) {
        try {
            int var2 = 100 / ((arg0 + 69) / 35);
            field1818++;
            return arg1.length() + 1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1824[4] + arg0 + ',' + (arg1 == null ? field1824[3] : field1824[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field1816++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1824[0] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1217(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1218(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 52;
                    break;
                case 1:
                    var10005 = 102;
                    break;
                case 2:
                    var10005 = 14;
                    break;
                case 3:
                    var10005 = 31;
                    break;
                default:
                    var10005 = 42;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
