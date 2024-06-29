import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class247 extends class299 {

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3818 = new String[] { method2121(method2120("h\u000e4C\u000f")), method2121(method2120("h\u000e4G\u000f")), method2121(method2120("h\u000e4D\u000f")), method2121(method2120("h\u000e4F\u000f")), method2121(method2120("h\u000e4B\u000f")), method2121(method2120("h\u000e4@\u000f")) };

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "Lvn;")
    public static class330 field3814 = new class330(82, 2);

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "[I")
    public static int[] field3817;

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(ILes;)V")
    public class247(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)I")
    public final int method847(int arg0) {
        try {
            if (arg0 != 0) {
                this.method2118(true);
            }
            ++field3813;
            return 0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3818[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
    public final void method848(int arg0) {
        try {
            if (arg0 != -20456) {
                field3814 = null;
            }
            ++field3810;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3818[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Les;)V")
    public class247(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)I")
    public final int method852(int arg0, int arg1) {
        try {
            if (arg0 != 1) {
                return -84;
            } else {
                ++field3811;
                return 1;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3818[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)I")
    public final int method2118(boolean arg0) {
        try {
            if (!arg0) {
                return 54;
            } else {
                ++field3815;
                return super.field4849;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3818[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
    public static void method2119(int arg0) {
        try {
            field3817 = null;
            field3814 = null;
            if (arg0 != -21475) {
                method2119(-98);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3818[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)V")
    public final void method846(int arg0, boolean arg1) {
        try {
            if (arg1) {
                this.method848(-69);
            }
            super.field4849 = arg0;
            ++field3816;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3818[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2120(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 39);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2121(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 4;
                    break;
                case 1:
                    var10005 = 104;
                    break;
                case 2:
                    var10005 = 26;
                    break;
                case 3:
                    var10005 = 5;
                    break;
                default:
                    var10005 = 39;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
