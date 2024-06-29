import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class274 extends class578 {

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3888 = new String[] { method2248(method2247("}r\u000e\"F")), method2248(method2247("}r\u000e F")), method2248(method2247("}r\u000e%F")) };

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3881 = null;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "Lhj;")
    public static class671 field3886 = new class671(0, 2, 2, 1);

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "[I")
    public static int[] field3887 = null;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public int field3879;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public int field3882;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "Lmv;")
    public class125 field3880;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "Leea;")
    public class476 field3885;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)V", line = 6)
    public static final void method2243(int arg0, int arg1) {
        class412 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class751 var4 = class213.field3124[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class700.field9795; var5++) {
                    for (int var6 = 0; var6 < class508.field7455; var6++) {
                        var2 = var4.method2475(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class179.field2328;
                            int var8 = var5 << class179.field2328;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class751 var10 = class213.field3124[var9];
                                if (var10 != null) {
                                    int var11 = var4.method5442(var6, var5, 31844) - var10.method5442(var6, var5, 31844);
                                    int var12 = var4.method5442(var6 + 1, var5, 31844) - var10.method5442(var6 + 1, var5, 31844);
                                    int var13 = var4.method5442(var6 + 1, var5 + 1, 31844) - var10.method5442(var6 + 1, var5 + 1, 31844);
                                    int var14 = var4.method5442(var6, var5 + 1, 31844) - var10.method5442(var6, var5 + 1, 31844);
                                    var10.method2479(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 70)
    public static final void method2244(int arg0) {
        try {
            field3884++;
            class727.field10423.method127(((float) class451.field6612.field9088.method2367(arg0 + 3) * 0.1F + 0.7F) * 1.1523438F);
            class727.field10423.method235(class459.field6676, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
            class727.field10423.method232(class532.field7708, -1, arg0);
            class727.field10423.method228(class167.field2143);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3888[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V", line = 81)
    public static void method2245(int arg0) {
        try {
            field3887 = null;
            field3886 = null;
            field3881 = null;
            if (arg0 >= -79) {
                method2244(65);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3888[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)V", line = 96)
    public final void method2246(int arg0) {
        try {
            if (arg0 != 0) {
                method2245(-66);
            }
            field3883++;
            if (class741.field10534.length > class363.field5266) {
                class741.field10534[class363.field5266++] = this;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3888[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2247(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2248(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 25;
                    break;
                case 1:
                    var10005 = 31;
                    break;
                case 2:
                    var10005 = 32;
                    break;
                case 3:
                    var10005 = 97;
                    break;
                default:
                    var10005 = 110;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
