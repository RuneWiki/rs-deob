import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class653 extends class659 {

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9276 = new String[] { method4749(method4748("\u001e5M\u001f\u0016")), method4749(method4748("\u001e5M\u0018\u0016")), method4749(method4748("\u0012xMwC")), method4749(method4748("\u0007#\u000f5")), method4749(method4748("\u001e5M\u001a\u0016")), method4749(method4748("\u001e5M\u001b\u0016")) };

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "Leb;")
    public static class230 field9271 = new class230(8);

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field9272 = new String[200];

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "[Z")
    public static boolean[] field9275 = new boolean[200];

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field9269;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public static int field9270;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field9273;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field9274;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
    public static void method4746(boolean arg0) {
        try {
            field9272 = null;
            if (!arg0) {
                method4747(null, 56, null);
            }
            field9271 = null;
            field9275 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9276[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class653(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public final void method879(byte arg0) {
        try {
            field9269++;
            if (arg0 != 41) {
                method4746(false);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9276[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/awt/Frame;ILft;)V")
    public static final void method4747(Frame arg0, int arg1, class188 arg2) {
        try {
            field9273++;
            if (arg1 != 1) {
                method4747(null, 31, null);
            }
            while (true) {
                class328 var3 = arg2.method1582(arg0, -3824);
                while (var3.field4486 == 0) {
                    class449.method3474(20817, 10L);
                }
                if (var3.field4486 == 1) {
                    arg0.setVisible(false);
                    arg0.dispose();
                    return;
                }
                class449.method3474(20817, 100L);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9276[5] + (arg0 == null ? field9276[3] : field9276[2]) + ',' + arg1 + ',' + (arg2 == null ? field9276[3] : field9276[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V")
    public final void method884(int arg0, OggPacket arg1) {
        try {
            if (arg0 == -9313) {
                field9270++;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9276[4] + arg0 + ',' + (arg1 == null ? field9276[3] : field9276[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4748(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4749(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 105;
                    break;
                case 1:
                    var10005 = 86;
                    break;
                case 2:
                    var10005 = 99;
                    break;
                case 3:
                    var10005 = 89;
                    break;
                default:
                    var10005 = 62;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
