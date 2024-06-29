import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class546 extends class518 {

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
    private int field7994 = 4096;

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field7998 = new String[] { method4109(method4108("uYUu\u0014")), method4109(method4108("z\u001dU\u0018A")), method4109(method4108("`\u0002\u00177")), method4109(method4108("z\u001dU\u001cA")), method4109(method4108("z\u001dU\u0019A")) };

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
    public static int field7996;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
    public static int field7997;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "Llga;")
    public static class47 field7995;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILjc;I)V", line = 4)
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            ++field7997;
            if (arg2 != -3) {
                method4107((byte) 113);
            }
            if (arg0 == 0) {
                this.field7994 = arg1.method5116((byte) -127);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7998[1] + arg0 + ',' + (arg1 != null ? field7998[0] : field7998[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)[I", line = 19)
    public final int[] method14(int arg0, int arg1) {
        try {
            int var3 = 6 % ((arg1 - -57) / 55);
            ++field7996;
            int[] var4 = super.field7564.method4462(26041, arg0);
            if (super.field7564.field8652) {
                int[] var5 = this.method3944(class478.field7048 & arg0 + -1, 0, (byte) 73);
                int[] var6 = this.method3944(arg0, 0, (byte) 73);
                int[] var7 = this.method3944(class478.field7048 & arg0 - -1, 0, (byte) 73);
                for (int var8 = 0; class110.field1436 > var8; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * this.field7994;
                    int var10 = (var6[class247.field3543 & var8 + 1] + -var6[class247.field3543 & var8 + -1]) * this.field7994;
                    int var11 = var10 >> 12;
                    int var12 = var9 >> 12;
                    int var13 = var11 * var11 >> 12;
                    int var14 = var12 * var12 >> 12;
                    int var15 = (int) (Math.sqrt((double) ((float) (var13 + 4096 + var14) / 4096.0F)) * 4096.0D);
                    int var16 = ~var15 == -1 ? 0 : 16777216 / var15;
                    var4[var8] = 4096 - var16;
                }
            }
            return var4;
        } catch (RuntimeException var18) {
            throw class665.method4799(var18, field7998[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V", line = 72)
    public class546() {
        super(1, true);
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(B)V", line = 79)
    public static void method4107(byte arg0) {
        try {
            if (arg0 > 23) {
                field7995 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7998[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4108(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 105);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4109(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 14;
                    break;
                case 1:
                    var10005 = 119;
                    break;
                case 2:
                    var10005 = 123;
                    break;
                case 3:
                    var10005 = 91;
                    break;
                default:
                    var10005 = 105;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
