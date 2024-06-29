import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class713 {

    @OriginalMember(owner = "client!vha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10338 = new String[] { method5199(method5198("C d\bK\u001d")), method5199(method5198("[=iJ")), method5199(method5198("Nf+\bw")), method5199(method5198("C d\bI\u001d")), method5199(method5198("C d\b~Z\u001bqTc[/-")), method5199(method5198("C d\bH\u001d")) };

    @OriginalMember(owner = "client!vha", name = "d", descriptor = "I")
    public static int field10335 = -1;

    @OriginalMember(owner = "client!vha", name = "e", descriptor = "I")
    public static int field10333;

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "I")
    public static int field10334;

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "I")
    public static int field10337;

    @OriginalMember(owner = "client!vha", name = "c", descriptor = "[I")
    public static int[] field10336;

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(B)V")
    public static void method5195(byte arg0) {
        try {
            if (arg0 != -128) {
                field10335 = 40;
            }
            field10336 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10338[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vha", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field10333++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10338[4] + ')');
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(IJIZ)Ljava/lang/String;")
    public static final String method5196(int arg0, long arg1, int arg2, boolean arg3) {
        try {
            field10337++;
            Calendar var5;
            if (arg3) {
                class254.method2152(arg1, 78);
                var5 = class555.field8262;
            } else {
                class693.method5066(arg1, true);
                var5 = class555.field8270;
            }
            if (arg0 > -120) {
                return null;
            }
            int var6 = var5.get(5);
            int var7 = var5.get(2);
            int var8 = var5.get(1);
            int var9 = var5.get(11);
            int var10 = var5.get(12);
            return arg2 == 3 ? class656.method4814(arg1, arg2, (byte) 115, arg3) : Integer.toString(var6 / 10) + var6 % 10 + "-" + class115.field1369[arg2][var7] + "-" + var8 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field10338[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(III[BII[BII)V")
    public static final void method5197(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        try {
            field10334++;
            int var9 = -(arg0 >> 2);
            int var15 = -(arg0 & 0x3);
            if (arg8 == -1) {
                for (int var10 = -arg1; var10 < 0; var10++) {
                    int var10001;
                    for (int var11 = var9; var11 < 0; var11++) {
                        var10001 = arg4++;
                        arg3[var10001] = (byte) (arg3[var10001] - arg6[arg2++]);
                        int var16 = arg4++;
                        arg3[var16] = (byte) (arg3[var16] - arg6[arg2++]);
                        int var17 = arg4++;
                        arg3[var17] = (byte) (arg3[var17] - arg6[arg2++]);
                        int var18 = arg4++;
                        arg3[var18] = (byte) (arg3[var18] - arg6[arg2++]);
                    }
                    for (int var12 = var15; var12 < 0; var12++) {
                        var10001 = arg4++;
                        arg3[var10001] = (byte) (arg3[var10001] - arg6[arg2++]);
                    }
                    arg4 += arg7;
                    arg2 += arg5;
                }
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field10338[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field10338[1] : field10338[2]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field10338[1] : field10338[2]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!vha", name = "<init>", descriptor = "(II)V")
    public class713(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!vha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5198(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xA);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5199(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 53;
                    break;
                case 1:
                    var10005 = 72;
                    break;
                case 2:
                    var10005 = 5;
                    break;
                case 3:
                    var10005 = 38;
                    break;
                default:
                    var10005 = 10;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
