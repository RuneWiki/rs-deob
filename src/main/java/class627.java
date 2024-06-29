import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public abstract class class627 extends class578 {

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8951 = new String[] { method4607(method4606("5\u0011?\u0011\u0007")), method4607(method4606("5\u0011?\u001e\u0007")), method4607(method4606(">T?wR")), method4607(method4606("'K#\u0006I0\u0016}")), method4607(method4606("5K \u0006I0\u0016}")), method4607(method4606("+\u000f}5")), method4607(method4606("5K#\u0006I0\u0016}")), method4607(method4606("5\u0011?\u0010\u0007")) };

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "[I")
    public static int[] field8947 = new int[13];

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "[C")
    public static char[] field8950 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field8948;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field8949;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lkj;I)V")
    public abstract void method96(class26 arg0, int arg1);

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljc;I)V")
    public abstract void method97(class711 arg0, int arg1);

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
    public static void method4603(boolean arg0) {
        try {
            field8950 = null;
            field8947 = null;
            if (arg0) {
                method4603(false);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8951[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILlga;)V")
    public static final void method4604(int arg0, class47 arg1) {
        try {
            class121.field1536 = arg1.method502(field8951[4], (byte) -119);
            if (arg0 == 91) {
                field8949++;
                class717.field10218 = arg1.method502(field8951[6], (byte) -107);
                class55.field775 = arg1.method502(field8951[3], (byte) -115);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8951[1] + arg0 + ',' + (arg1 == null ? field8951[5] : field8951[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III[BBI[BII)V")
    public static final void method4605(int arg0, int arg1, int arg2, byte[] arg3, byte arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        try {
            field8948++;
            int var9 = -(arg8 >> 2);
            if (arg4 != -26) {
                method4603(false);
            }
            int var15 = -(arg8 & 0x3);
            for (int var10 = -arg1; var10 < 0; var10++) {
                int var10001;
                for (int var11 = var9; var11 < 0; var11++) {
                    var10001 = arg2++;
                    arg6[var10001] += arg3[arg0++];
                    int var16 = arg2++;
                    arg6[var16] += arg3[arg0++];
                    int var17 = arg2++;
                    arg6[var17] += arg3[arg0++];
                    int var18 = arg2++;
                    arg6[var18] += arg3[arg0++];
                }
                for (int var12 = var15; var12 < 0; var12++) {
                    var10001 = arg2++;
                    arg6[var10001] += arg3[arg0++];
                }
                arg0 += arg7;
                arg2 += arg5;
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field8951[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field8951[5] : field8951[2]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field8951[5] : field8951[2]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4606(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4607(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 69;
                    break;
                case 1:
                    var10005 = 122;
                    break;
                case 2:
                    var10005 = 17;
                    break;
                case 3:
                    var10005 = 89;
                    break;
                default:
                    var10005 = 47;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
