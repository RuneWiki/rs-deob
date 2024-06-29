import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class703 extends class518 {

    @OriginalMember(owner = "client!hu", name = "D", descriptor = "I")
    private int field9826 = 4096;

    @OriginalMember(owner = "client!hu", name = "G", descriptor = "I")
    private int field9824 = 4096;

    @OriginalMember(owner = "client!hu", name = "F", descriptor = "I")
    private int field9830 = 4096;

    @OriginalMember(owner = "client!hu", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field9832 = new String[] { method5057(method5056("XN\u0007\u007fw")), method5057(method5056("XN\u0007|w")), method5057(method5056("^NEQ")), method5057(method5056("K\u0015\u0007\u0013\"")), method5057(method5056("XN\u0007~w")) };

    @OriginalMember(owner = "client!hu", name = "J", descriptor = "[B")
    public static byte[] field9827 = new byte[520];

    @OriginalMember(owner = "client!hu", name = "E", descriptor = "Lac;")
    public static class560 field9829 = new class560();

    @OriginalMember(owner = "client!hu", name = "I", descriptor = "I")
    public static int field9823;

    @OriginalMember(owner = "client!hu", name = "B", descriptor = "I")
    public static int field9825;

    @OriginalMember(owner = "client!hu", name = "H", descriptor = "I")
    public static int field9831;

    @OriginalMember(owner = "client!hu", name = "K", descriptor = "[Lit;")
    public static class464[] field9828;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "(B)V", line = 10)
    public static void method5055(byte arg0) {
        try {
            field9829 = null;
            if (arg0 != 47) {
                field9829 = null;
            }
            field9828 = null;
            field9827 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9832[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)[[I", line = 22)
    public final int[][] method349(int arg0, int arg1) {
        try {
            ++field9825;
            int[][] var3 = super.field7575.method1955(arg1, -2);
            if (arg0 != 0) {
                field9831 = -41;
            }
            if (super.field7575.field3416) {
                int[][] var4 = this.method3943(0, arg1, arg0 ^ -23583);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class110.field1436 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var7[var11];
                    int var14 = var6[var11];
                    if (~var12 == ~var13 && var13 == var14) {
                        var8[var11] = this.field9826 * var12 >> 12;
                        var9[var11] = this.field9824 * var13 >> 12;
                        var10[var11] = this.field9830 * var14 >> 12;
                    } else {
                        var8[var11] = this.field9826;
                        var9[var11] = this.field9824;
                        var10[var11] = this.field9830;
                    }
                }
            }
            return var3;
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field9832[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "()V", line = 85)
    public class703() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjc;I)V", line = 99)
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            if (arg2 == -3) {
                if (arg0 != 0) {
                    if (~arg0 != -2) {
                        if (~arg0 == -3) {
                            this.field9830 = arg1.method5116((byte) -112);
                        }
                    } else {
                        this.field9824 = arg1.method5116((byte) -123);
                    }
                } else {
                    this.field9826 = arg1.method5116((byte) -124);
                }
                ++field9823;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9832[4] + arg0 + ',' + (arg1 != null ? field9832[3] : field9832[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5056(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 95);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5057(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 48;
                    break;
                case 1:
                    var10005 = 59;
                    break;
                case 2:
                    var10005 = 41;
                    break;
                case 3:
                    var10005 = 61;
                    break;
                default:
                    var10005 = 95;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
