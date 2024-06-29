import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class439 {

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6484 = new String[] { method3379(method3378("\u0005.lf}")), method3379(method3378("\u0005.le}")), method3379(method3378("\u0005.ld}")), method3379(method3378("\u0006=.K")), method3379(method3378("\u0013fl\t(")) };

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "Lkia;")
    public static class646 field6482 = new class646(method3379(method3378("?\u001c\u000b")), method3379(method3378("\u0007.$N6\r")), method3379(method3378("7?6N")), 5);

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "B")
    public byte field6461;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "B")
    public byte field6466;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "B")
    public byte field6467;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "B")
    public byte field6469;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "B")
    public byte field6475;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "B")
    public byte field6476;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "B")
    public byte field6480;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public int field6462;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public int field6464;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public int field6478;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Lhg;")
    public static class718 field6483;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "S")
    public short field6472;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Z")
    public boolean field6463;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "Z")
    public boolean field6468;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "Z")
    public boolean field6470;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "Z")
    public boolean field6471;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "Z")
    public boolean field6474;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "Z")
    public boolean field6477;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "Z")
    public boolean field6479;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "Z")
    public boolean field6481;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V", line = 11)
    public static final void method3375(int arg0, int arg1) {
        try {
            if (arg0 < 77) {
                field6482 = null;
            }
            field6465++;
            class313 var2 = class196.method1670((long) arg1, 8, 78);
            var2.method2635(true);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6484[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 25)
    public static final int method3376(String arg0, int arg1) {
        try {
            field6473++;
            int var2 = arg0.length();
            int var3 = arg1;
            for (int var4 = 0; var4 < var2; var4++) {
                var3 = (var3 << 5) + arg0.charAt(var4) - var3;
            }
            return var3;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6484[2] + (arg0 == null ? field6484[3] : field6484[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 54)
    public static void method3377(int arg0) {
        try {
            if (arg0 != -1221431323) {
                field6482 = null;
            }
            field6482 = null;
            field6483 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6484[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3378(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x55);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3379(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 104;
                    break;
                case 1:
                    var10005 = 72;
                    break;
                case 2:
                    var10005 = 66;
                    break;
                case 3:
                    var10005 = 39;
                    break;
                default:
                    var10005 = 85;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
