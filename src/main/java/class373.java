import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class373 extends class206 {

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "[B")
    public byte[] field5700;

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5702 = new String[] { method3011(method3010("A\u0003\u0013U\u000b")), method3011(method3010("P]\u0013:^")), method3011(method3010("E\u0006Qx")), method3011(method3010("A\u0003\u0013(JE\u001aI*\u000b")), method3011(method3010("A\u0003\u0013V\u000b")) };

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "Z")
    public static boolean field5697 = false;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
    public static int field5696 = 0;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "I")
    public static int field5698 = 0;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "([B)V", line = 18)
    public class373(byte[] arg0) {
        try {
            this.field5700 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5702[3] + (arg0 == null ? field5702[2] : field5702[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(III)Z", line = 27)
    public static final boolean method3008(int arg0, int arg1, int arg2) {
        try {
            field5699++;
            if (arg0 != 0) {
                method3008(36, -23, -52);
            }
            return (arg1 & 0x800) != 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5702[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BIII)V", line = 38)
    public static final void method3009(byte arg0, int arg1, int arg2, int arg3) {
        try {
            field5701++;
            if (arg3 == 1012) {
                class782.method5652(class655.field9469, arg1, arg2);
            } else if (arg3 == 1001) {
                class782.method5652(class516.field7455, arg1, arg2);
            } else if (arg3 == 1011) {
                class782.method5652(class212.field3259, arg1, arg2);
            } else if (arg3 == 1010) {
                class782.method5652(class222.field3414, arg1, arg2);
            } else if (arg3 == 1006) {
                class782.method5652(class710.field10286, arg1, arg2);
            }
            int var4 = 96 / ((31 - arg0) / 42);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5702[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3010(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x23);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3011(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 43;
                    break;
                case 1:
                    var10005 = 115;
                    break;
                case 2:
                    var10005 = 61;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 35;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
