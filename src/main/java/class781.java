import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class781 {

    @OriginalMember(owner = "client!gfa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11368 = new String[] { method5648(method5647("9TF\u0011M")), method5648(method5647(",\u000f\u0004S")), method5648(method5647("%\u001c\t\u0011sj")), method5648(method5647("%\u001c\t\u0011tj")), method5648(method5647("%\u001c\t\u0011rj")), method5648(method5647("%\u001c\t\u0011qj")) };

    @OriginalMember(owner = "client!gfa", name = "e", descriptor = "Lel;")
    public static class573 field11365 = new class573(116, 9);

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "Leea;")
    public static class144 field11367 = new class144();

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "I")
    public static int field11363;

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "I")
    public static int field11364;

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "I")
    public static int field11366;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)V")
    public static void method5643(byte arg0) {
        try {
            if (arg0 <= -70) {
                field11367 = null;
                field11365 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11368[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(III)V")
    public static final void method5644(int arg0, int arg1, int arg2) {
        try {
            field11364++;
            if (arg1 > 69 && class334.method2801(arg0, 0)) {
                class530.method3996((byte) -52, arg2, class683.field9897[arg0]);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11368[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)V")
    public static final void method5645(int arg0) {
        try {
            if (arg0 != 116) {
                field11365 = null;
            }
            class86.method728(11, (byte) -96);
            field11363++;
            class245.method2083(0);
            System.gc();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11368[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(CLjava/lang/String;B)I")
    public static final int method5646(char arg0, String arg1, byte arg2) {
        try {
            field11366++;
            int var3 = 0;
            int var4 = arg1.length();
            int var5 = 36 % ((-arg2 - 14) / 55);
            for (int var6 = 0; var6 < var4; var6++) {
                if (arg1.charAt(var6) == arg0) {
                    var3++;
                }
            }
            return var3;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field11368[2] + arg0 + ',' + (arg1 == null ? field11368[1] : field11368[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5647(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x30);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5648(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 66;
                    break;
                case 1:
                    var10005 = 122;
                    break;
                case 2:
                    var10005 = 104;
                    break;
                case 3:
                    var10005 = 63;
                    break;
                default:
                    var10005 = 48;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
