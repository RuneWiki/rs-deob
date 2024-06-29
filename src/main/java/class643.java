import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class643 {

    @OriginalMember(owner = "client!mfa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9226 = new String[] { method4659(method4658("NA^\u001f\u0011\u000b")), method4659(method4658("NA^\u001f\u0014\u000b")), method4659(method4658("X\t\u0011\u001f(")), method4659(method4658("NA^\u001f\u0016\u000b")), method4659(method4658("\u0003\n\u0001\u0011")), method4659(method4658("MRS]")), method4659(method4658("NA^\u001f\u0017\u000b")) };

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "I")
    public static int field9222;

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "I")
    public static int field9223;

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "I")
    public static int field9225;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "Lgda;")
    public static class58 field9224;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(BLgda;)V", line = 4)
    public static final void method4654(byte arg0, class58 arg1) {
        try {
            field9225++;
            if (arg0 == 29) {
                class540.field7958 = arg1;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9226[6] + arg0 + ',' + (arg1 == null ? field9226[5] : field9226[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IILmj;I)V", line = 21)
    public static final void method4655(int arg0, int arg1, class683 arg2, int arg3) {
        try {
            field9223++;
            if (class501.field7499) {
                class668 var4 = class751.field11065 == -1 ? null : class289.field4655.method97(class751.field11065, (byte) 38);
                if (client.method2695(arg2).method3484(104) && (class513.field7595 & 0x20) != 0 && (var4 == null || arg2.method4980(var4.field9501, class751.field11065, -92) != var4.field9501)) {
                    class101.method954(arg2.field9799, 9, arg2.field9807, class679.field9662, class304.field4915 + field9226[4] + arg2.field9724, class480.field7309, 0L, (long) (arg2.field9774 | arg2.field9799 << 0), (byte) -112, arg2.field9774, false, false, true);
                    class522.field7712++;
                }
            }
            for (int var5 = 9; var5 >= 5; var5--) {
                String var6 = class22.method143(arg2, arg0 + 15067, var5);
                if (var6 != null) {
                    class73.field1024++;
                    class101.method954(arg2.field9799, 1007, arg2.field9807, class139.method1292(arg2, var5, -1), arg2.field9724, var6, (long) (var5 + 1), (long) (arg2.field9799 << 0 | arg2.field9774), (byte) -92, arg2.field9774, false, false, true);
                }
            }
            if (arg0 != -15067) {
                field9224 = null;
            }
            String var7 = class670.method4857(0, arg2);
            if (var7 != null) {
                class101.method954(arg2.field9799, 53, arg2.field9807, arg2.field9839, arg2.field9724, var7, 0L, (long) (arg2.field9774 | arg2.field9799 << 0), (byte) -110, arg2.field9774, false, false, true);
                class760.field11171++;
            }
            for (int var8 = 4; var8 >= 0; var8--) {
                String var9 = class22.method143(arg2, 0, var8);
                if (var9 != null) {
                    class73.field1024++;
                    class101.method954(arg2.field9799, 22, arg2.field9807, class139.method1292(arg2, var8, -1), arg2.field9724, var9, (long) (var8 + 1), (long) (arg2.field9774 | arg2.field9799 << 0), (byte) -114, arg2.field9774, false, false, true);
                }
            }
            if (client.method2695(arg2).method3482((byte) -110)) {
                class784.field11458++;
                if (arg2.field9840 == null) {
                    class101.method954(arg2.field9799, 48, arg2.field9807, -1, "", class709.field10212.method5154(class795.field11624, (byte) 65), 0L, (long) (arg2.field9799 << 0 | arg2.field9774), (byte) -101, arg2.field9774, false, false, true);
                } else {
                    class101.method954(arg2.field9799, 48, arg2.field9807, -1, "", arg2.field9840, 0L, (long) (arg2.field9774 | arg2.field9799 << 0), (byte) -60, arg2.field9774, false, false, true);
                }
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field9226[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field9226[5] : field9226[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(BI)I", line = 103)
    public static final int method4656(byte arg0, int arg1) {
        try {
            if (arg0 >= -7) {
                method4656((byte) -66, -33);
            }
            field9222++;
            return arg1 & 0xFF;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9226[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)V", line = 117)
    public static void method4657(int arg0) {
        try {
            if (arg0 != 10115) {
                field9224 = null;
            }
            field9224 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9226[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4658(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x55);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4659(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 35;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 63;
                    break;
                case 3:
                    var10005 = 49;
                    break;
                default:
                    var10005 = 85;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
