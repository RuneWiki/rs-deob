import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class757 {

    @OriginalMember(owner = "client!sha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10997 = new String[] { method5492(method5491("R`'\u0013")), method5492(method5491("O}*Q{\u0014")), method5492(method5491("G;eQD")), method5492(method5491("O}*Qx\u0014")) };

    @OriginalMember(owner = "client!sha", name = "f", descriptor = "I")
    public static int field10993 = 0;

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "Lvha;")
    public static class713 field10991 = new class713(3, 8);

    @OriginalMember(owner = "client!sha", name = "g", descriptor = "I")
    public static int field10995 = 0;

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "Lwq;")
    public static class178 field10996 = new class178(4);

    @OriginalMember(owner = "client!sha", name = "d", descriptor = "I")
    public static int field10992;

    @OriginalMember(owner = "client!sha", name = "c", descriptor = "I")
    public static int field10994;

    @OriginalMember(owner = "client!sha", name = "e", descriptor = "[S")
    public static short[] field10990;

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(I[Ljava/awt/Rectangle;I)V", line = 3)
    public static final void method5489(int arg0, Rectangle[] arg1, int arg2) throws class382 {
        try {
            if (arg2 == 0) {
                field10992++;
                if (class166.field2283 == 1) {
                    class301.field4720.method504(arg1, arg0, class370.field5643, class738.field10736);
                } else {
                    class301.field4720.method504(arg1, arg0, 0, 0);
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10997[1] + arg0 + ',' + (arg1 == null ? field10997[0] : field10997[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(B)V", line = 24)
    public static void method5490(byte arg0) {
        try {
            field10991 = null;
            field10990 = null;
            if (arg0 != -28) {
                method5490((byte) 36);
            }
            field10996 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10997[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5491(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x39);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5492(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 60;
                    break;
                case 1:
                    var10005 = 21;
                    break;
                case 2:
                    var10005 = 75;
                    break;
                case 3:
                    var10005 = 127;
                    break;
                default:
                    var10005 = 57;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
