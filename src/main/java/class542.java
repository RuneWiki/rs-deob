import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class542 extends class299 {

    @OriginalMember(owner = "client!gq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7988 = new String[] { method4036(method4035("px64w")), method4036(method4035("px66w")), method4036(method4035("px60w")), method4036(method4035("px63w")), method4036(method4035("px62w")), method4036(method4035("px67w")) };

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
    public static int field7985 = 0;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "Z")
    public static boolean field7987 = false;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "Lhl;")
    public static class556 field7981 = new class556(32, 4);

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
    public static int field7980;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
    public static int field7982;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public static int field7983;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public static int field7984;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public static int field7986;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)I", line = 3)
    public final int method847(int arg0) {
        try {
            ++field7980;
            if (arg0 != 0) {
                this.method852(96, -101);
            }
            return super.field4850.method3245((byte) -58) ? 1 : 0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7988[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V", line = 23)
    public final void method848(int arg0) {
        try {
            if (arg0 == -20456) {
                super.field4849 = this.method847(0);
                ++field7983;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7988[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(Z)I", line = 34)
    public final int method4033(boolean arg0) {
        try {
            if (!arg0) {
                return 78;
            } else {
                ++field7986;
                return super.field4849;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7988[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(Z)V", line = 45)
    public static void method4034(boolean arg0) {
        try {
            if (arg0) {
                field7981 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7988[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Les;)V", line = 57)
    public class542(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)I", line = 66)
    public final int method852(int arg0, int arg1) {
        try {
            ++field7982;
            return arg0 != 1 ? 16 : 3;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7988[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IZ)V", line = 78)
    public final void method846(int arg0, boolean arg1) {
        try {
            super.field4849 = arg0;
            if (!arg1) {
                ++field7984;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7988[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(ILes;)V", line = 91)
    public class542(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4035(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 95);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4036(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 23;
                    break;
                case 1:
                    var10005 = 9;
                    break;
                case 2:
                    var10005 = 24;
                    break;
                case 3:
                    var10005 = 113;
                    break;
                default:
                    var10005 = 95;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
