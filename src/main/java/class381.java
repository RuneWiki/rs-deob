import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class381 extends class299 {

    @OriginalMember(owner = "client!rr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6133 = new String[] { method3122(method3121("fP\u0015'O")), method3122(method3121("fP\u0015&O")), method3122(method3121("fP\u0015$O")), method3122(method3121("fP\u0015\"O")), method3122(method3121("fP\u0015 O")), method3122(method3121("fP\u0015+O")), method3122(method3121("zWW\u000f")), method3122(method3121("o\f\u0015M\u001a")), method3122(method3121("fP\u0015!O")), method3122(method3121("fP\u0015%O")) };

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "Liha;")
    public static class29 field6128 = new class29(30);

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "Lvn;")
    public static class330 field6131 = new class330(25, 7);

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Les;)V", line = 4)
    public class381(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILwq;)Lrj;", line = 9)
    public static final class622 method3117(int arg0, class176 arg1) {
        try {
            ++field6127;
            class131 var2 = class270.method2332(arg1, 12523);
            int var3 = arg1.method1622(-18712);
            if (arg0 != -23730) {
                field6128 = null;
            }
            int var4 = arg1.method1622(-18712);
            int var5 = arg1.method1687((byte) -128);
            return new class622(var2.field1875, var2.field1865, var2.field1872, var2.field1874, var2.field1869, var2.field1862, var2.field1859, var2.field1877, var2.field1870, var3, var4, var5);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6133[8] + arg0 + ',' + (arg1 != null ? field6133[7] : field6133[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V", line = 28)
    public static void method3118(int arg0) {
        try {
            field6128 = null;
            field6131 = null;
            if (arg0 > -111) {
                field6128 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6133[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(Z)I", line = 39)
    public final int method3119(boolean arg0) {
        try {
            ++field6130;
            return !arg0 ? -49 : super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6133[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V", line = 50)
    public final void method848(int arg0) {
        try {
            ++field6124;
            if (super.field4850.method3243(-106) == class117.field1711) {
                super.field4849 = 2;
            }
            if (arg0 == -20456) {
                if (super.field4849 < 0 || super.field4849 > 2) {
                    super.field4849 = this.method847(0);
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6133[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)I", line = 68)
    public final int method847(int arg0) {
        try {
            if (arg0 != 0) {
                field6128 = null;
            }
            ++field6132;
            return 1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6133[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(ILes;)V", line = 81)
    public class381(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)I", line = 86)
    public final int method852(int arg0, int arg1) {
        try {
            if (arg0 != 1) {
                field6128 = null;
            }
            ++field6125;
            return 1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6133[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(IZ)V", line = 97)
    public static final void method3120(int arg0, boolean arg1) {
        try {
            ++field6129;
            int var2 = class344.field5594;
            int var3 = class196.field3120;
            if (arg1 && class200.field3163) {
                var2 <<= 1;
                var3 = -var2;
            }
            class662.field9437.method247(var3, var2);
            if (arg0 != 21690) {
                field6131 = null;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6133[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZ)V", line = 124)
    public final void method846(int arg0, boolean arg1) {
        try {
            ++field6126;
            if (!arg1) {
                super.field4849 = arg0;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6133[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3121(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 103);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3122(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 20;
                    break;
                case 1:
                    var10005 = 34;
                    break;
                case 2:
                    var10005 = 59;
                    break;
                case 3:
                    var10005 = 99;
                    break;
                default:
                    var10005 = 103;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
