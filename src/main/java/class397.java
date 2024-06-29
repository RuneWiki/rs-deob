import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class397 extends class299 {

    @OriginalMember(owner = "client!ku", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6298 = new String[] { method3215(method3214("\u0016m\u0005,|")), method3215(method3214("\u0013mG\u0007")), method3215(method3214("\u00066\u0005E)")), method3215(method3214("\u0016m\u0005W=\u0013q_U|")), method3215(method3214("\u0016m\u0005*|")), method3215(method3214("\u0016m\u0005/|")), method3215(method3214("\u0016m\u0005-|")), method3215(method3214("\u0016m\u0005)|")), method3215(method3214("\u0016m\u0005(|")), method3215(method3214("\u0016m\u0005#|")), method3215(method3214("\u0016m\u0005.|")) };

    @OriginalMember(owner = "client!ku", name = "p", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!ku", name = "m", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!ku", name = "o", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "Laia;")
    public static class238 field6293;

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "[Luh;")
    public static class174[] field6288;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V", line = 6)
    public static void method3210(byte arg0) {
        try {
            if (arg0 < 58) {
                field6289 = 122;
            }
            field6293 = null;
            field6288 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6298[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)I", line = 18)
    public final int method847(int arg0) {
        try {
            ++field6291;
            return ~super.field4850.method3250((byte) 87).method2094(arg0) > -97 ? 0 : 2;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6298[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)Z", line = 29)
    public final boolean method3211(int arg0) {
        try {
            ++field6294;
            if (~super.field4850.method3250((byte) 87).method2094(0) > -97) {
                return false;
            } else {
                return arg0 != 3 ? true : true;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6298[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)I", line = 49)
    public final int method852(int arg0, int arg1) {
        try {
            ++field6296;
            if (arg0 != 1) {
                return -22;
            } else {
                return ~super.field4850.method3250((byte) 87).method2094(0) > -97 ? 3 : 1;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6298[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IZ)V", line = 66)
    public final void method846(int arg0, boolean arg1) {
        try {
            if (arg1) {
                this.method848(-35);
            }
            super.field4849 = arg0;
            ++field6292;
            class554.method4102((byte) -125, super.field4849);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6298[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(ILes;)V", line = 79)
    public class397(int arg0, class404 arg1) {
        super(arg0, arg1);
        try {
            class554.method4102((byte) -122, super.field4849);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6298[3] + arg0 + ',' + (arg1 != null ? field6298[2] : field6298[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(Z)I", line = 87)
    public final int method3212(boolean arg0) {
        try {
            ++field6295;
            return !arg0 ? 54 : super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6298[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)V", line = 98)
    public final void method848(int arg0) {
        try {
            if (arg0 != -20456) {
                field6288 = null;
            }
            if (~super.field4850.method3250((byte) 87).method2094(arg0 + 20456) > -97) {
                super.field4849 = 0;
            }
            ++field6290;
            if (~super.field4849 > -1 || super.field4849 > 2) {
                super.field4849 = this.method847(arg0 ^ -20456);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6298[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Les;)V", line = 117)
    public class397(class404 arg0) {
        super(arg0);
        try {
            class554.method4102((byte) -121, super.field4849);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6298[3] + (arg0 != null ? field6298[2] : field6298[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(II)V", line = 126)
    public static final void method3213(int arg0, int arg1) {
        try {
            class317.field5174 = arg1;
            int var2 = -100 / ((64 - arg0) / 61);
            class116.field1695 = -1;
            ++field6297;
            class116.field1695 = -1;
            class130.method1239((byte) -86);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6298[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ku", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3214(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 84);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ku", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3215(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 125;
                    break;
                case 1:
                    var10005 = 24;
                    break;
                case 2:
                    var10005 = 43;
                    break;
                case 3:
                    var10005 = 107;
                    break;
                default:
                    var10005 = 84;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
