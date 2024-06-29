import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class476 {

    @OriginalMember(owner = "client!jea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7256 = new String[] { method3645(method3644(",]=D!n")), method3645(method3644(",]=D\"n")), method3645(method3644("\u0003U5\u001e\u0017#J/PC")), method3645(method3644(",]=D n")), method3645(method3644("h\u0018\b\u0003\u000e#\u0018(\u000b\b#VfJ")), method3645(method3644("+K")), method3645(method3644("j\u0018.\u001f\r(Q2\rYf")), method3645(method3644("(M0\u0006")), method3645(method3644("\u0016Y.\u001e\n%T9J\u0010?K(\u000f\u000ef[3\u001f\r2\u0002|")), method3645(method3644("=\u0016rD\u001e")), method3645(method3644("fh=\u0018\u0017/[0\u000f\u0010|\u0018")) };

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "Lhl;")
    public static class556 field7245 = new class556(53, 8);

    @OriginalMember(owner = "client!jea", name = "i", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!jea", name = "g", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "Lao;")
    public static class301 field7253;

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "Ljava/applet/Applet;")
    public static Applet field7255;

    @OriginalMember(owner = "client!jea", name = "h", descriptor = "[B")
    public byte[] field7246;

    @OriginalMember(owner = "client!jea", name = "k", descriptor = "[I")
    public static int[] field7254;

    @OriginalMember(owner = "client!jea", name = "e", descriptor = "[S")
    public short[] field7249;

    @OriginalMember(owner = "client!jea", name = "f", descriptor = "[S")
    public short[] field7250;

    @OriginalMember(owner = "client!jea", name = "j", descriptor = "[S")
    public short[] field7251;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)V")
    public static void method3641(int arg0) {
        try {
            field7253 = null;
            field7255 = null;
            field7245 = null;
            if (arg0 != 0) {
                field7253 = null;
            }
            field7254 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7256[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)V")
    public static final void method3642(byte arg0) {
        try {
            field7252++;
            if (arg0 > -112) {
                field7253 = null;
            }
            class683.field9875.method304(1);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7256[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Lha;ZJ)V")
    public static final void method3643(class63 arg0, boolean arg1, long arg2) {
        try {
            class545.field8021 = 0;
            class761.field11180 = 0;
            class302.field4873 = class722.field10604;
            field7247++;
            class722.field10604 = 0;
            long var4 = class712.method5167(-2334);
            if (arg1) {
                field7255 = null;
            }
            for (class92 var6 = (class92) class440.field6871.method749(0); var6 != null; var6 = (class92) class440.field6871.method747((byte) 21)) {
                if (var6.method897(arg0, arg2)) {
                    class545.field8021++;
                }
            }
            if (class652.field9340 && (arg2 % 100L) == 0L) {
                System.out.println(field7256[8] + class440.field6871.method746(0) + field7256[6] + class545.field8021);
                System.out.println(field7256[2] + class761.field11180 + field7256[10] + class722.field10604 + field7256[4] + (class712.method5167(-2334) - var4) + field7256[5]);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field7256[3] + (arg0 == null ? field7256[7] : field7256[9]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3644(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x63);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3645(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 70;
                    break;
                case 1:
                    var10005 = 56;
                    break;
                case 2:
                    var10005 = 92;
                    break;
                case 3:
                    var10005 = 106;
                    break;
                default:
                    var10005 = 99;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
