import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class532 extends class578 {

    @OriginalMember(owner = "client!qia", name = "n", descriptor = "I")
    public volatile int field7709 = -1;

    @OriginalMember(owner = "client!qia", name = "p", descriptor = "Ljava/lang/String;")
    public volatile String field7705;

    @OriginalMember(owner = "client!qia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7711 = new String[] { method4028(method4027("@D\u0018n\u000b\u0019")), method4028(method4027("_X\u0015,")), method4028(method4027("@D\u0018nuXC\u00104w\u0019")), method4028(method4027("J\u0003Wn4")), method4028(method4027("@D\u0018n\r\u0019")), method4028(method4027("@D\u0018n\b\u0019")), method4028(method4027("@D\u0018n\n\u0019")) };

    @OriginalMember(owner = "client!qia", name = "i", descriptor = "Lsb;")
    public static class261 field7704 = new class261(47, 6);

    @OriginalMember(owner = "client!qia", name = "l", descriptor = "Lvo;")
    public static class782 field7706 = null;

    @OriginalMember(owner = "client!qia", name = "k", descriptor = "I")
    public static int field7708 = 13156520;

    @OriginalMember(owner = "client!qia", name = "o", descriptor = "[I")
    public static int[] field7710 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!qia", name = "m", descriptor = "I")
    public static int field7703;

    @OriginalMember(owner = "client!qia", name = "j", descriptor = "I")
    public static int field7707;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(II)V", line = 5)
    public static final void method4023(int arg0, int arg1) {
        try {
            if (arg0 != 6) {
                field7704 = null;
            }
            field7707++;
            class230.field3330 = -1;
            class147.field1894 = 3;
            class426.field6140 = 100;
            class570.field8272 = arg1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7711[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(JJ)J", line = 19)
    public static long method4024(long arg0, long arg1) {
        try {
            return arg0 & arg1;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7711[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(III[BI[BIII)V", line = 27)
    public static final void method4025(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        try {
            if (arg2 != 1393) {
                field7704 = null;
            }
            field7703++;
            int var9 = -(arg0 >> 2);
            int var15 = -(arg0 & 0x3);
            for (int var10 = -arg8; var10 < 0; var10++) {
                int var10001;
                for (int var11 = var9; var11 < 0; var11++) {
                    var10001 = arg6++;
                    arg5[var10001] += arg3[arg4++];
                    int var16 = arg6++;
                    arg5[var16] += arg3[arg4++];
                    int var17 = arg6++;
                    arg5[var17] += arg3[arg4++];
                    int var18 = arg6++;
                    arg5[var18] += arg3[arg4++];
                }
                for (int var12 = var15; var12 < 0; var12++) {
                    var10001 = arg6++;
                    arg5[var10001] += arg3[arg4++];
                }
                arg4 += arg7;
                arg6 += arg1;
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field7711[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field7711[1] : field7711[3]) + ',' + arg4 + ',' + (arg5 == null ? field7711[1] : field7711[3]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)V", line = 75)
    public static void method4026(int arg0) {
        try {
            field7706 = null;
            field7710 = null;
            field7704 = null;
            if (arg0 != 0) {
                method4023(-84, -89);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7711[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 99)
    public class532(String arg0) {
        try {
            this.field7705 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7711[2] + (arg0 == null ? field7711[1] : field7711[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4027(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x49);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4028(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 49;
                    break;
                case 1:
                    var10005 = 45;
                    break;
                case 2:
                    var10005 = 121;
                    break;
                case 3:
                    var10005 = 64;
                    break;
                default:
                    var10005 = 73;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
