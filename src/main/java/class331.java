import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class331 {

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5200 = new String[] { method2796(method2795("3B\u0016{;")), method2796(method2795("&\u0019T9")), method2796(method2795(")\u0006\u0016\u0017n")), method2796(method2795(")\u0006\u0016\u0014n")) };

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field5196 = 0;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "F")
    public static float field5197;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field5199;

    static {
        new class550("", 73);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLib;)Lega;", line = 9)
    public static final class738 method2793(byte arg0, class163 arg1) {
        try {
            field5199++;
            class384 var2 = class301.method2531(115, arg1);
            if (arg0 == -108) {
                int var3 = arg1.method1453((byte) 92);
                int var4 = arg1.method1453((byte) 105);
                return new class738(var2.field5805, var2.field5813, var2.field5804, var2.field5807, var2.field5809, var2.field5810, var2.field5814, var2.field5806, var2.field5815, var3, var4);
            } else {
                return null;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5200[3] + arg0 + ',' + (arg1 == null ? field5200[1] : field5200[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I[[BLhaa;)V", line = 29)
    public static final void method2794(int arg0, byte[][] arg1, class89 arg2) {
        try {
            field5195++;
            int var3 = class530.field7791.length;
            if (arg0 >= 23) {
                for (int var4 = 0; var4 < var3; var4++) {
                    byte[] var5 = arg1[var4];
                    if (var5 != null) {
                        int var6 = (class752.field10938[var4] >> 8) * 64 - class494.field7101;
                        int var7 = (class752.field10938[var4] & 0xFF) * 64 - class281.field4219;
                        class318.method2691(1);
                        arg2.method759(var7, (byte) -114, class610.field8913, class429.field6298, var6, var5);
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field5200[2] + arg0 + ',' + (arg1 == null ? field5200[1] : field5200[0]) + ',' + (arg2 == null ? field5200[1] : field5200[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2795(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x46);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2796(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 72;
                    break;
                case 1:
                    var10005 = 108;
                    break;
                case 2:
                    var10005 = 56;
                    break;
                case 3:
                    var10005 = 85;
                    break;
                default:
                    var10005 = 70;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
