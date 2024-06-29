import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public abstract class class423 extends class568 {

    @OriginalMember(owner = "client!df", name = "n", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field6673;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6675 = new String[] { method3365(method3364("\u0010+>n\u0005")), method3365(method3364(":\"~\u0003N\u0004|\"\u0016\u001fT.xB_\u0015.dF_T}h")), method3365(method3364("T=bL[\u001d)uG")), method3365(method3364("\u0010+>l\u0005")), method3365(method3364("\u0010+>s\u0005")), method3365(method3364("\u001a8|O")), method3365(method3364("\u000fc>\rP")), method3365(method3364("\u0010+>m\u0005")), method3365(method3364("\u0010+>\u001fD\u001a$d\u001d\u0005")) };

    @OriginalMember(owner = "client!df", name = "t", descriptor = "Lhl;")
    public static class556 field6665 = new class556(7, 3);

    @OriginalMember(owner = "client!df", name = "p", descriptor = "Lvn;")
    public static class330 field6669 = new class330(81, 7);

    @OriginalMember(owner = "client!df", name = "q", descriptor = "Z")
    public static boolean field6674 = false;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field6667;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public int field6668;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field6670;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public static int field6672;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "Lgda;")
    public static class58 field6671;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IB)C", line = 4)
    public static final char method3359(int arg0, byte arg1) {
        try {
            if (arg0 != -6826) {
                return '\u000e';
            }
            field6666++;
            int var2 = arg1 & 0xFF;
            if (var2 == 0) {
                throw new IllegalArgumentException(field6675[1] + Integer.toString(var2, 16) + field6675[2]);
            }
            if (var2 >= 128 && var2 < 160) {
                char var3 = class64.field875[var2 - 128];
                if (var3 == '\u0000') {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6675[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(BLjagtheora/ogg/OggPacket;)V", line = 32)
    public final void method3360(byte arg0, OggPacket arg1) {
        try {
            if (arg0 < -63) {
                field6672++;
                this.method2086((byte) -127, arg1);
                this.field6668++;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6675[4] + arg0 + ',' + (arg1 == null ? field6675[5] : field6675[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V", line = 44)
    public static void method3361(byte arg0) {
        try {
            if (arg0 >= 0) {
                field6669 = null;
                field6665 = null;
                field6671 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6675[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(JJ)J", line = 64)
    public static long method3362(long arg0, long arg1) {
        try {
            return arg0 ^ arg1;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6675[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", line = 76)
    public static final String method3363(String arg0, String arg1, int arg2, String arg3) {
        int var4 = -100 / ((arg2 + 5) / 49);
        field6667++;
        for (int var5 = arg0.indexOf(arg3); var5 != -1; var5 = arg0.indexOf(arg3, arg1.length() + var5)) {
            arg0 = arg0.substring(0, var5) + arg1 + arg0.substring(var5 + arg3.length());
        }
        return arg0;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 98)
    public class423(OggStreamState arg0) {
        try {
            this.field6673 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6675[8] + (arg0 == null ? field6675[5] : field6675[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLjagtheora/ogg/OggPacket;)V")
    public abstract void method2086(byte arg0, OggPacket arg1);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public abstract void method2090(byte arg0);

    @OriginalMember(owner = "client!df", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3364(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!df", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3365(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 116;
                    break;
                case 1:
                    var10005 = 77;
                    break;
                case 2:
                    var10005 = 16;
                    break;
                case 3:
                    var10005 = 35;
                    break;
                default:
                    var10005 = 45;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
