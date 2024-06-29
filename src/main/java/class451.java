import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class451 extends class299 {

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6986 = new String[] { method3509(method3508("\u0014UV@B")), method3509(method3508("\u0014UVDB")), method3509(method3508("\u0014UVCB")), method3509(method3508("\u0014UVAB")), method3509(method3508("\u0014UVBB")), method3509(method3508("\u0014UVFB")), method3509(method3508("\u0014UVEB")), method3509(method3508("\u0014UVOB")) };

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "Ljj;")
    public static class126 field6976 = new class126();

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Lhl;")
    public static class556 field6984 = new class556(59, 9);

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "Z")
    public static boolean field6985 = false;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field6977;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field6980;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field6981;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field6982;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field6983;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)I")
    public final int method852(int arg0, int arg1) {
        try {
            ++field6979;
            if (arg1 != 0 && ~super.field4850.field6357.method4221(true) != -2) {
                if (arg0 != 1) {
                    field6985 = true;
                }
                return 2;
            } else {
                return 1;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6986[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZ)V")
    public final void method846(int arg0, boolean arg1) {
        try {
            if (arg1) {
                field6984 = null;
            }
            super.field4849 = arg0;
            ++field6983;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6986[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public static void method3504(byte arg0) {
        try {
            field6984 = null;
            if (arg0 == 31) {
                field6976 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6986[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)I")
    public final int method847(int arg0) {
        try {
            ++field6980;
            if (arg0 != 0) {
                field6985 = false;
            }
            return 1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6986[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)Z")
    public final boolean method3505(int arg0) {
        try {
            if (arg0 != 3) {
                field6985 = true;
            }
            ++field6978;
            return true;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6986[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)I")
    public static final int method3506(int arg0, int arg1) {
        try {
            ++field6982;
            return arg1 < 38 ? -102 : arg0 & 127;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6986[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(ILes;)V")
    public class451(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Les;)V")
    public class451(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
    public final void method848(int arg0) {
        try {
            if (~super.field4849 != -1 && ~super.field4850.field6357.method4221(true) != -2) {
                super.field4849 = 0;
            }
            if (arg0 != -20456) {
                this.method852(-55, 79);
            }
            ++field6981;
            if (super.field4849 < 0 || super.field4849 > 1) {
                super.field4849 = this.method847(0);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6986[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(Z)I")
    public final int method3507(boolean arg0) {
        try {
            ++field6977;
            if (!arg0) {
                method3504((byte) 75);
            }
            return super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6986[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3508(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 106);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3509(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 99;
                    break;
                case 1:
                    var10005 = 50;
                    break;
                case 2:
                    var10005 = 120;
                    break;
                case 3:
                    var10005 = 7;
                    break;
                default:
                    var10005 = 106;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
