import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class668 {

    @OriginalMember(owner = "client!av", name = "d", descriptor = "Z")
    public boolean field9499 = true;

    @OriginalMember(owner = "client!av", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9502 = new String[] { method4849(method4848("z\u0006c\u0004h")), method4849(method4848("z\u0006c\u0003h")), method4849(method4848("`^ch=")), method4849(method4848("u\u0005!*")), method4849(method4848("z\u0006c\u0005h")), method4849(method4848("z\u0006c\u0002h")), method4849(method4848("z\u0006c\u0007h")) };

    @OriginalMember(owner = "client!av", name = "i", descriptor = "Llt;")
    public static class706 field9492 = new class706(9, 7);

    @OriginalMember(owner = "client!av", name = "f", descriptor = "Lvn;")
    public static class330 field9496 = new class330(52, -1);

    @OriginalMember(owner = "client!av", name = "h", descriptor = "C")
    private char field9498;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "I")
    public static int field9493;

    @OriginalMember(owner = "client!av", name = "j", descriptor = "I")
    public static int field9495;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "I")
    public static int field9497;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "I")
    public static int field9500;

    @OriginalMember(owner = "client!av", name = "e", descriptor = "I")
    public int field9501;

    @OriginalMember(owner = "client!av", name = "g", descriptor = "Ljava/lang/String;")
    public String field9494;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Z)V", line = 4)
    public static void method4843(boolean arg0) {
        try {
            field9496 = null;
            field9492 = null;
            if (!arg0) {
                field9492 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9502[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)Z", line = 21)
    public final boolean method4844(int arg0) {
        try {
            field9500++;
            if (arg0 == 1) {
                return this.field9498 == 's';
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9502[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(II)I", line = 32)
    public static final int method4845(int arg0, int arg1) {
        try {
            field9493++;
            int var2 = -101 / ((arg1 - 63) / 54);
            return arg0 >>> 8;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9502[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lwq;I)V", line = 45)
    public final void method4846(class176 arg0, int arg1) {
        try {
            field9495++;
            while (true) {
                int var3 = arg0.method1645((byte) -103);
                if (var3 == 0) {
                    int var4 = -108 / ((arg1 - 81) / 33);
                    return;
                }
                this.method4847(arg0, 4, var3);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9502[5] + (arg0 == null ? field9502[3] : field9502[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lwq;II)V", line = 72)
    private final void method4847(class176 arg0, int arg1, int arg2) {
        try {
            field9497++;
            if (arg1 != 4) {
                this.method4847(null, -6, 97);
            }
            if (arg2 == 1) {
                this.field9498 = class423.method3359(-6826, arg0.method1672(-77));
            } else if (arg2 == 2) {
                this.field9501 = arg0.method1622(-18712);
            } else if (arg2 == 4) {
                this.field9499 = false;
            } else if (arg2 == 5) {
                this.field9494 = arg0.method1635((byte) 87);
                return;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9502[4] + (arg0 == null ? field9502[3] : field9502[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!av", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4848(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x40);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!av", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4849(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 27;
                    break;
                case 1:
                    var10005 = 112;
                    break;
                case 2:
                    var10005 = 77;
                    break;
                case 3:
                    var10005 = 70;
                    break;
                default:
                    var10005 = 64;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
