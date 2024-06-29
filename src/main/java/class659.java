import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public abstract class class659 extends class578 {

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field9331;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9338 = new String[] { method4785(method4784("\u00013\u0007i\u0012")), method4785(method4784("\u0014~\u0007\u000fG")), method4785(method4784("\u0001%EM")), method4785(method4784("\u00013\u0007f\u0012")), method4785(method4784("\u00013\u0007\u001dS\u00019]\u001f\u0012")) };

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "Lsb;")
    public static class261 field9334 = new class261(37, -2);

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "Loba;")
    public static class739 field9335 = new class739();

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "Ltd;")
    public static class457 field9336 = new class457();

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Lsb;")
    public static class261 field9337 = new class261(104, 6);

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public int field9332;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field9333;

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class659(OggStreamState arg0) {
        try {
            this.field9331 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9338[4] + (arg0 == null ? field9338[2] : field9338[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public abstract void method879(byte arg0);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V")
    public abstract void method884(int arg0, OggPacket arg1);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static void method4782(int arg0) {
        try {
            field9335 = null;
            field9337 = null;
            field9334 = null;
            field9336 = null;
            if (arg0 != 37) {
                field9334 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9338[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V")
    public final void method4783(OggPacket arg0, int arg1) {
        try {
            if (arg1 >= -49) {
                field9336 = null;
            }
            field9333++;
            this.method884(-9313, arg0);
            this.field9332++;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9338[3] + (arg0 == null ? field9338[2] : field9338[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4784(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4785(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 111;
                    break;
                case 1:
                    var10005 = 80;
                    break;
                case 2:
                    var10005 = 41;
                    break;
                case 3:
                    var10005 = 33;
                    break;
                default:
                    var10005 = 58;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
