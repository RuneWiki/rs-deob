import java.awt.Rectangle;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class784 {

    @OriginalMember(owner = "client!hda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11461 = new String[] { method5643(method5642("&@=z0f")), method5643(method5642("\u0007J*5\u001f'@|\u0013)\u0007t|<\u0016/@9&R")), method5643(method5642(" Q08")), method5643(method5642("\u0007J*5\u001f'@|\u0013)\u0007t|7\u001c#T.1\u0000=A8t\u0017/P=u")), method5643(method5642("5\nrz\u000e")), method5643(method5642("&@=z2f")), method5643(method5642("&@=z6f")), method5643(method5642("&@=z1f")), method5643(method5642("&@=z7f")) };

    @OriginalMember(owner = "client!hda", name = "e", descriptor = "I")
    public static int field11451 = 0;

    @OriginalMember(owner = "client!hda", name = "f", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field11455 = new Rectangle[100];

    @OriginalMember(owner = "client!hda", name = "g", descriptor = "D")
    public static double field11456;

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "I")
    public static int field11452;

    @OriginalMember(owner = "client!hda", name = "h", descriptor = "I")
    public static int field11453;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "I")
    public static int field11457;

    @OriginalMember(owner = "client!hda", name = "i", descriptor = "I")
    public static int field11458;

    @OriginalMember(owner = "client!hda", name = "j", descriptor = "I")
    public static int field11459;

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "Lrd;")
    public static class355 field11460;

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field11454;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field11455[var0] = new Rectangle();
        }
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "()V", line = 4)
    public class784() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "([BLwq;I)V", line = 22)
    public final void method5637(byte[] arg0, class176 arg1, int arg2) {
        try {
            field11452++;
            if (arg1.field2805[arg1.field2799] != arg2 || arg1.field2805[arg1.field2799 + 1] != -117) {
                throw new RuntimeException(field11461[1]);
            }
            if (this.field11454 == null) {
                this.field11454 = new Inflater(true);
            }
            try {
                this.field11454.setInput(arg1.field2805, arg1.field2799 + 10, -arg1.field2799 - 10 + arg1.field2805.length + -8);
                this.field11454.inflate(arg0);
            } catch (Exception var5) {
                this.field11454.reset();
                throw new RuntimeException(field11461[3]);
            }
            this.field11454.reset();
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field11461[0] + (arg0 == null ? field11461[2] : field11461[4]) + ',' + (arg1 == null ? field11461[2] : field11461[4]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V", line = 46)
    public static void method5638(int arg0) {
        try {
            field11455 = null;
            if (arg0 == 31) {
                field11460 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11461[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(III)V", line = 57)
    private class784(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "([BB)[B", line = 72)
    public final byte[] method5639(byte[] arg0, byte arg1) {
        try {
            field11453++;
            class176 var3 = new class176(arg0);
            var3.field2799 = arg0.length - 4;
            int var4 = 3 / ((arg1 + 3) / 41);
            int var5 = var3.method1652((byte) 127);
            byte[] var6 = new byte[var5];
            var3.field2799 = 0;
            this.method5637(var6, var3, 31);
            return var6;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field11461[6] + (arg0 == null ? field11461[2] : field11461[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIIIZ)V", line = 91)
    public static final void method5640(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        try {
            if (arg4) {
                method5638(37);
            }
            field11459++;
            class551 var5 = class380.method3113(-120, (long) arg2, 10);
            var5.method4086(-105);
            var5.field8081 = arg0;
            var5.field8076 = arg3;
            var5.field8073 = arg1;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field11461[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIII)Lnq;", line = 114)
    public static final class487 method5641(int arg0, int arg1, int arg2, int arg3) {
        try {
            field11457++;
            class487 var4 = null;
            if (arg3 == 0) {
                class16.field179++;
                var4 = class618.method4519(arg0 ^ 0x10CB, class190.field2995, class185.field2948.field2659);
            }
            if (arg3 == 1) {
                var4 = class618.method4519(127, class559.field8134, class185.field2948.field2659);
                class30.field357++;
            }
            if (arg0 != 4268) {
                method5640(-112, -85, -97, 127, true);
            }
            var4.field7362.method1642(class196.field3117.method1189(82, arg0 + 11440) ? 1 : 0, 19654);
            var4.field7362.method1639(class141.field2011 + arg1, arg0 + -4140);
            var4.field7362.method1640(arg0 ^ 0xDDEE3964, class397.field6289 + arg2);
            class232.field3598 = arg1;
            class499.field7490 = false;
            class83.field1262 = arg2;
            class67.method704(-100);
            return var4;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field11461[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!hda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5642(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x73);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5643(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 78;
                    break;
                case 1:
                    var10005 = 36;
                    break;
                case 2:
                    var10005 = 92;
                    break;
                case 3:
                    var10005 = 84;
                    break;
                default:
                    var10005 = 115;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
