import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class762 extends class299 {

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11194 = new String[] { method5505(method5504("o0YVj")), method5505(method5504("o0YWj")), method5505(method5504("o0YQj")), method5505(method5504("o0YSj")), method5505(method5504("o0YRj")), method5505(method5504("o0YUj")) };

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "[Lwq;")
    public static class176[] field11186 = new class176[2048];

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    public static int field11191 = 16777215;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public static int field11187;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    public static int field11188;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
    public static int field11189;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public static int field11190;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public static int field11192;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field11193;

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(ILes;)V")
    public class762(int arg0, class404 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)I")
    public final int method852(int arg0, int arg1) {
        try {
            ++field11193;
            if (arg0 != 1) {
                this.method848(-4);
            }
            return 1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field11194[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZ)V")
    public final void method846(int arg0, boolean arg1) {
        try {
            ++field11189;
            if (arg1) {
                field11186 = null;
            }
            super.field4849 = arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field11194[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V")
    public static void method5502(int arg0) {
        try {
            field11186 = null;
            if (arg0 != -32609) {
                field11186 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11194[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)I")
    public final int method847(int arg0) {
        try {
            ++field11192;
            if (arg0 != 0) {
                field11186 = null;
            }
            return 1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11194[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(Z)I")
    public final int method5503(boolean arg0) {
        try {
            ++field11187;
            if (!arg0) {
                field11191 = 15;
            }
            return super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11194[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Les;)V")
    public class762(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V")
    public final void method848(int arg0) {
        try {
            if (~super.field4849 != -2 && super.field4849 != 0) {
                super.field4849 = this.method847(0);
            }
            ++field11190;
            if (arg0 != -20456) {
                field11191 = -95;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11194[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5504(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 66);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5505(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 12;
                    break;
                case 1:
                    var10005 = 93;
                    break;
                case 2:
                    var10005 = 119;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 66;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
