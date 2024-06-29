import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class622 extends class131 {

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "I")
    public int field8979;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public int field8978;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field8986 = new String[] { method4547(method4546("\t\\\u0003\t\"")), method4547(method4546("\u001c\u0007AK")), method4547(method4546("\u0000\u0018\u0003\u001b6\u001c\u001bY\u0019w")), method4547(method4546("\u0000\u0018\u0003ew")), method4547(method4546("R\u000e\r")), method4547(method4546("T\u0004\u001c\u001a")), method4547(method4546("WF\u001d")), method4547(method4546("W@\u001b")), method4547(method4546("T\u0017\u0010")), method4547(method4546("WAL")), method4547(method4546("W@\u001e")), method4547(method4546("T\u0007\u0010")), method4547(method4546("\u0011\u001eDB1\u0006\u0017_U0\u0000\\ZT`\u0011O")), method4547(method4546("T\u0004\u001f\u001a")), method4547(method4546("\u0000\u0018\u0003dw")), method4547(method4546("\u0000\u0018\u0003cw")) };

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "Lhl;")
    public static class556 field8977 = new class556(61, 3);

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "Lvn;")
    public static class330 field8980 = new class330(86, 7);

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
    public static int field8983 = -1;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "[I")
    public static int[] field8984 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "Lhl;")
    public static class556 field8982 = new class556(4, 4);

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
    public static int field8974;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public static int field8975;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "I")
    public static int field8976;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
    public static int field8981;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "[Lvu;")
    public static class356[] field8985;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V", line = 4)
    public static void method4543(int arg0) {
        try {
            field8985 = null;
            field8977 = null;
            field8982 = null;
            field8984 = null;
            int var1 = -59 / ((27 - arg0) / 50);
            field8980 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8986[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;Z)V", line = 21)
    public static final void method4544(Throwable arg0, String arg1, boolean arg2) {
        field8974++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class714.method5175((byte) 43, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + field8986[4];
                }
                var3 = var3 + arg1;
            }
            class194.method1795(var3, 262144);
            String var4 = class423.method3363(var3, field8986[9], 113, ":");
            String var5 = class423.method3363(var4, field8986[6], -96, "@");
            String var6 = class423.method3363(var5, field8986[7], 91, "&");
            String var7 = class423.method3363(var6, field8986[10], 95, "#");
            if (class400.field6326 != null) {
                class218 var8 = class53.field664.method638(30975, new URL(class400.field6326.getCodeBase(), field8986[12] + class413.field6572 + field8986[11] + (class740.field10907 == null ? String.valueOf(class129.field1849) : class740.field10907) + field8986[5] + class61.field814 + field8986[13] + class61.field803 + field8986[8] + var7));
                if (!arg2) {
                    method4544(null, null, false);
                }
                while (var8.field3402 == 0) {
                    class524.method3918(-4, 1L);
                }
                if (var8.field3402 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field3407;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Ljk;Ltda;IIIIIIIIII)V", line = 82)
    public class622(class662 arg0, class666 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        try {
            this.field8979 = arg10;
            this.field8978 = arg11;
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field8986[2] + (arg0 == null ? field8986[1] : field8986[0]) + ',' + (arg1 == null ? field8986[1] : field8986[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)Lwh;", line = 96)
    public final class155 method989(boolean arg0) {
        try {
            if (arg0) {
                return null;
            } else {
                field8975++;
                return class197.field3129;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8986[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 107)
    public static final void method4545(int arg0) {
        try {
            if (arg0 != 86) {
                method4543(-88);
            }
            field8976++;
            class378.method3105(39);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8986[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4546(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4547(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 114;
                    break;
                case 1:
                    var10005 = 114;
                    break;
                case 2:
                    var10005 = 45;
                    break;
                case 3:
                    var10005 = 39;
                    break;
                default:
                    var10005 = 95;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
