import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class553 extends class514 {

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "Lub;")
    public class20 field8103;

    @OriginalMember(owner = "client!hr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8105 = new String[] { method4101(method4100("5;\u0002P7")), method4101(method4100("3<@y")), method4101(method4100("&g\u0002;b")), method4101(method4100("5;\u0002S7")), method4101(method4100("5;\u0002)v3 X+7")), method4101(method4100("5;\u0002Q7")), method4101(method4100("5;\u0002T7")), method4101(method4100("5;\u0002V7")), method4101(method4100("9 ^p|)%Crv3i")), method4101(method4100("pd\u00125")), method4101(method4100("5;\u0002W7")) };

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public static int field8102 = 1407;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field8098;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public static int field8099;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
    public static int field8100;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    public static int field8101;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    public static int field8104;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 3)
    public static final String method4094(String arg0, int arg1) {
        try {
            field8104++;
            String var2 = null;
            int var3 = arg0.indexOf(field8105[9]);
            if (var3 >= 0) {
                var2 = arg0.substring(0, var3 + 4);
                arg0 = arg0.substring(var3 + 4);
            }
            if (arg1 <= 110) {
                return null;
            }
            if (arg0.startsWith(field8105[8])) {
                int var4 = arg0.indexOf(" ", field8105[8].length());
                if (var4 >= 0) {
                    int var5 = arg0.length();
                    arg0 = arg0.substring(0, var4) + " ";
                    for (int var6 = var4 + 1; var6 < var5; var6++) {
                        arg0 = arg0 + "*";
                    }
                }
            }
            return var2 == null ? arg0 : var2 + arg0;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field8105[7] + (arg0 == null ? field8105[1] : field8105[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILwq;)Lnk;", line = 51)
    public static final class750 method4095(int arg0, class176 arg1) {
        try {
            field8100++;
            int var2 = arg1.method1622(-18712);
            return arg0 == 5 ? new class750(var2) : null;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8105[3] + arg0 + ',' + (arg1 == null ? field8105[1] : field8105[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lrv;I)I", line = 67)
    public static final int method4096(class117 arg0, int arg1) {
        try {
            field8098++;
            int var2 = arg0.method1163(2, -125);
            int var3 = 116 / ((arg1 + 74) / 38);
            int var4;
            if (var2 == 0) {
                var4 = 0;
            } else if (var2 == 1) {
                var4 = arg0.method1163(5, -125);
            } else if (var2 == 2) {
                var4 = arg0.method1163(8, 91);
            } else {
                var4 = arg0.method1163(11, 42);
            }
            return var4;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8105[5] + (arg0 == null ? field8105[1] : field8105[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)I", line = 93)
    public static final int method4097(int arg0) {
        try {
            field8101++;
            return arg0 == 5510 ? class232.field3589 : 1;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8105[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(III)Z", line = 106)
    public static final boolean method4098(int arg0, int arg1, int arg2) {
        try {
            field8099++;
            if (!class75.method784(arg1, arg2, arg0 - 57685)) {
                return false;
            } else if (arg0 == -7851) {
                return class763.method5508(arg2, arg1, -51) | (arg1 & 0xB000) != 0 | class269.method2323(arg0 ^ 0xFFEFE055, arg2, arg1) ? true : (class319.method2736((byte) 100, arg1, arg2) | class481.method3670(arg1, false, arg2)) & (arg2 & 0x37) == 0;
            } else {
                return true;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8105[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)I", line = 128)
    public static int method4099(int arg0, int arg1) {
        try {
            return arg0 | arg1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8105[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lvf;II[B)V", line = 134)
    public class553(class159 arg0, int arg1, int arg2, byte[] arg3) {
        try {
            this.field8103 = class271.method2337(arg2, arg1, arg0, 6406, arg3, true, 6406, false);
            this.field8103.method4732(false, 125, false);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8105[4] + (arg0 == null ? field8105[1] : field8105[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field8105[1] : field8105[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!hr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4100(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4101(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 93;
                    break;
                case 1:
                    var10005 = 73;
                    break;
                case 2:
                    var10005 = 44;
                    break;
                case 3:
                    var10005 = 21;
                    break;
                default:
                    var10005 = 31;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
