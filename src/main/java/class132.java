import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class132 extends class299 {

    @OriginalMember(owner = "client!ut", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1888 = new String[] { method1251(method1250("Xpa\u0005j")), method1251(method1250("Xpa\u0004j")), method1251(method1250("Xpa\u0007j")), method1251(method1250("Xpa\u0006j")), method1251(method1250("Xpa\u0003j")), method1251(method1250("Xpa\u0002j")), method1251(method1250("Xpa\u0001j")) };

    @OriginalMember(owner = "client!ut", name = "m", descriptor = "[I")
    public static int[] field1887 = new int[6];

    @OriginalMember(owner = "client!ut", name = "n", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!ut", name = "o", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!ut", name = "i", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "[I")
    public static int[] field1880;

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "[[I")
    public static int[][] field1881;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)I", line = 5)
    public final int method852(int arg0, int arg1) {
        try {
            ++field1883;
            if (arg0 != 1) {
                return -44;
            } else {
                return super.field4850.method3245((byte) -58) ? 3 : 1;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1888[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "(I)Z", line = 20)
    public final boolean method1247(int arg0) {
        try {
            ++field1882;
            if (arg0 != 3) {
                this.method846(11, true);
            }
            return !super.field4850.method3245((byte) -58);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1888[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)V", line = 38)
    public final void method848(int arg0) {
        try {
            if (arg0 == -20456) {
                if (super.field4850.method3245((byte) -58)) {
                    super.field4849 = 2;
                }
                ++field1885;
                if (super.field4849 < 0 || super.field4849 > 2) {
                    super.field4849 = this.method847(0);
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1888[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(Z)I", line = 57)
    public final int method1248(boolean arg0) {
        try {
            if (!arg0) {
                field1880 = null;
            }
            ++field1879;
            return super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1888[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)V", line = 70)
    public static void method1249(byte arg0) {
        try {
            field1887 = null;
            field1880 = null;
            field1881 = null;
            if (arg0 != -96) {
                method1249((byte) 73);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1888[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IZ)V", line = 87)
    public final void method846(int arg0, boolean arg1) {
        try {
            if (arg1) {
                field1880 = null;
            }
            super.field4849 = arg0;
            ++field1884;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1888[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)I", line = 100)
    public final int method847(int arg0) {
        try {
            if (arg0 != 0) {
                return 25;
            } else {
                ++field1886;
                if (!super.field4850.method3245((byte) -58)) {
                    return super.field4850.field6379.method4133(true) && class568.method4172(super.field4850.field6379.method4132(true), 2) ? 1 : 0;
                } else {
                    return 2;
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1888[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(ILes;)V", line = 121)
    public class132(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Les;)V", line = 127)
    public class132(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ut", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1250(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 66);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ut", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1251(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 45;
                    break;
                case 1:
                    var10005 = 4;
                    break;
                case 2:
                    var10005 = 79;
                    break;
                case 3:
                    var10005 = 64;
                    break;
                default:
                    var10005 = 66;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
