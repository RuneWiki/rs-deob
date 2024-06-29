import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public abstract class class299 {

    @OriginalMember(owner = "client!ria", name = "f", descriptor = "Les;")
    public class404 field4850;

    @OriginalMember(owner = "client!ria", name = "d", descriptor = "I")
    public int field4849;

    @OriginalMember(owner = "client!ria", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4855 = new String[] { method2581(method2580("\u001b\u001bK\u0005")), method2581(method2580("\u000e@\tG~")), method2581(method2580("\u0007\u0007FG?\u001c\u0000N\u001d=]")), method2581(method2580("\u0007\u0007FGM]")), method2581(method2580("\u0007\u0007FGN]")) };

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "Lhl;")
    public static class556 field4851 = new class556(31, -2);

    @OriginalMember(owner = "client!ria", name = "c", descriptor = "Liha;")
    public static class29 field4853 = new class29(64);

    @OriginalMember(owner = "client!ria", name = "e", descriptor = "Lhl;")
    public static class556 field4854 = new class556(96, 6);

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lrda;[Lih;)V")
    public static final void method2577(class693 arg0, class731[] arg1) {
        if (class787.field11502) {
            int var2 = arg0.method1739(arg1, false);
            class120.field1734.method218(var2, arg1);
        }
        if (class757.field11125 == class740.field10902) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class185) {
                var5 = ((class185) arg0).field2945;
                var6 = ((class185) arg0).field2946;
            } else {
                var5 = arg0.field9985 >> class165.field2688;
                var6 = arg0.field9983 >> class165.field2688;
            }
            class120.field1734.method214(class493.field7420[0].method2497((byte) -78, arg0.field9985, arg0.field9983), class647.method4707(var5, var6), class260.method2189(var5, var6), class243.method2098(var5, var6));
        }
        class281 var7 = arg0.method52(class120.field1734, (byte) 122);
        if (var7 == null) {
            return;
        }
        if (arg0.field9980) {
            class463[] var8 = var7.field4578;
            for (int var9 = 0; var9 < var8.length; var9++) {
                class463 var10 = var8[var9];
                if (var10.field7120) {
                    class458.method3552(var10.field7117 - var10.field7119, var10.field7119 + var10.field7118, var10.field7119 + var10.field7116, var10.field7121 - var10.field7119, -104);
                }
            }
        }
        if (var7.field4575) {
            var7.field4577 = arg0;
            if (class9.field103) {
                class214 var11 = class239.field3687;
                synchronized (class239.field3687) {
                    class239.field3687.method1926((byte) -78, var7);
                    return;
                }
            }
            class239.field3687.method1926((byte) -128, var7);
            return;
        }
        class234.method2033(var7, (byte) 28);
    }

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "(I)V")
    public abstract void method848(int arg0);

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(II)I")
    public abstract int method852(int arg0, int arg1);

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(BI)V")
    public final void method2578(byte arg0, int arg1) {
        try {
            if (this.method852(1, arg1) != 3) {
                this.method846(arg1, false);
            }
            if (arg0 != 5) {
                this.method852(-69, -10);
            }
            field4852++;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4855[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Z)V")
    public static void method2579(boolean arg0) {
        try {
            field4851 = null;
            field4854 = null;
            if (arg0) {
                field4853 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4855[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(Les;)V")
    public class299(class404 arg0) {
        try {
            this.field4850 = arg0;
            this.field4849 = this.method847(0);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4855[2] + (arg0 == null ? field4855[0] : field4855[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(ILes;)V")
    public class299(int arg0, class404 arg1) {
        try {
            this.field4850 = arg1;
            this.field4849 = arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4855[2] + arg0 + ',' + (arg1 == null ? field4855[0] : field4855[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IZ)V")
    public abstract void method846(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)I")
    public abstract int method847(int arg0);

    @OriginalMember(owner = "client!ria", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2580(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ria", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2581(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 117;
                    break;
                case 1:
                    var10005 = 110;
                    break;
                case 2:
                    var10005 = 39;
                    break;
                case 3:
                    var10005 = 105;
                    break;
                default:
                    var10005 = 3;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
