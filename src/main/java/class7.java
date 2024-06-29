import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 {

    @OriginalMember(owner = "client!il", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field84 = new String[] { method62(method61("W\f\u0018Z%")), method62(method61("W\f\u0018Y%")), method62(method61("W\f\u0018X%")), method62(method61("W\f\u0018obm\u0014DrcYH")) };

    @OriginalMember(owner = "client!il", name = "d", descriptor = "Lil;")
    public static class7 field74 = new class7();

    @OriginalMember(owner = "client!il", name = "h", descriptor = "Lil;")
    public static class7 field78 = new class7();

    @OriginalMember(owner = "client!il", name = "b", descriptor = "Lil;")
    public static class7 field79 = new class7();

    @OriginalMember(owner = "client!il", name = "c", descriptor = "Lil;")
    public static class7 field80 = new class7();

    @OriginalMember(owner = "client!il", name = "g", descriptor = "[I")
    public static int[] field81 = new int[32];

    @OriginalMember(owner = "client!il", name = "j", descriptor = "Lvn;")
    public static class330 field83 = new class330(63, 3);

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)J", line = 3)
    public static final long method58(int arg0) {
        try {
            field75++;
            if (arg0 != -13262) {
                method58(73);
            }
            return class748.field11042.method3813((byte) -88);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field84[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V", line = 21)
    public static final void method59(int arg0) {
        try {
            field76++;
            if (arg0 < 89) {
                method60(124);
            }
            class640.field9178.method304(1);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field84[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V", line = 32)
    public static void method60(int arg0) {
        try {
            field80 = null;
            field83 = null;
            field79 = null;
            field78 = null;
            field81 = null;
            field74 = null;
            if (arg0 <= 22) {
                method58(-127);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field84[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!il", name = "toString", descriptor = "()Ljava/lang/String;", line = 49)
    public final String toString() {
        try {
            field77++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field84[3] + ')');
        }
    }

    @OriginalMember(owner = "client!il", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method61(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xD);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!il", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method62(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 62;
                    break;
                case 1:
                    var10005 = 96;
                    break;
                case 2:
                    var10005 = 54;
                    break;
                case 3:
                    var10005 = 27;
                    break;
                default:
                    var10005 = 13;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
