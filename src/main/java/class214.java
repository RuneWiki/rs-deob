import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class214 implements class81 {

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "Lsr;")
    private class79 field3133;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "Las;")
    private class793 field3130;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3137 = new String[] { method1798(method1797("]R\u0016\r\u0007CSL\u000fF")), method1798(method1797("V\u0014\u0016\u001f\u0013")), method1798(method1797("COT]")), method1798(method1797("]R\u0016wF")), method1798(method1797("]R\u0016pF")), method1798(method1797("]R\u0016tF")), method1798(method1797("]R\u0016zF")) };

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field3132 = 0;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)Z")
    public final boolean method800(byte arg0) {
        try {
            if (arg0 >= -2) {
                this.method800((byte) -121);
            }
            field3134++;
            return this.field3133.method788((byte) 127);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3137[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public final void method802(int arg0) {
        try {
            int var2 = 44 % ((arg0 - 38) / 41);
            field3131++;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3137[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZ)V")
    public final void method801(int arg0, boolean arg1) {
        try {
            int var3 = -123 % ((15 - arg0) / 60);
            field3135++;
            class720 var4 = this.field3133.method787((byte) -106, this.field3130.field11540);
            if (var4 != null) {
                int var5 = this.field3130.field11532.method2058(this.field3130.field11538, class500.field7304, 0) + this.field3130.field11535;
                int var6 = this.field3130.field11536.method4767(23467, this.field3130.field11534, class791.field11507) + this.field3130.field11531;
                if (this.field3130.field11537) {
                    class236.field3418.method212(var5, var6, this.field3130.field11538, this.field3130.field11534, this.field3130.field11528, 0);
                }
                int var7 = var6 + this.method1796((byte) 67, class200.field2954, var4.field10252, 5, var5, var6) * 12;
                int var12 = var7 + 8;
                if (this.field3130.field11537) {
                    class236.field3418.method219(var5, var12, var5 + this.field3130.field11538 - 1, var12, this.field3130.field11528, 0);
                }
                var7 = var12 + 1;
                int var8 = var7 + this.method1796((byte) 62, class200.field2954, var4.field10254, 5, var5, var7) * 12;
                int var13 = var8 + 5;
                int var10000 = var13 + this.method1796((byte) 74, class200.field2954, var4.field10255, 5, var5, var13) * 12;
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field3137[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lsr;Las;)V")
    public class214(class79 arg0, class793 arg1) {
        try {
            this.field3133 = arg0;
            this.field3130 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3137[0] + (arg0 == null ? field3137[2] : field3137[1]) + ',' + (arg1 == null ? field3137[2] : field3137[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLda;Ljava/lang/String;III)I")
    private final int method1796(byte arg0, class216 arg1, String arg2, int arg3, int arg4, int arg5) {
        try {
            field3136++;
            int var7 = -97 / ((7 - arg0) / 45);
            return arg1.method1815(arg3 + arg5, this.field3130.field11542, arg4 + arg3, null, 0, this.field3130.field11534 - (arg3 * 2), 0, 0, 0, 0, null, 126, this.field3130.field11529, null, this.field3130.field11538 - (arg3 * 2), arg2);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field3137[4] + arg0 + ',' + (arg1 == null ? field3137[2] : field3137[1]) + ',' + (arg2 == null ? field3137[2] : field3137[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1797(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1798(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 45;
                    break;
                case 1:
                    var10005 = 58;
                    break;
                case 2:
                    var10005 = 56;
                    break;
                case 3:
                    var10005 = 49;
                    break;
                default:
                    var10005 = 110;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
