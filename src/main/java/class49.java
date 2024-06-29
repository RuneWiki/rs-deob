import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class49 {

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public int field553 = -1;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public int field561 = -1;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public int field563 = -1;

    @OriginalMember(owner = "client!gs", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field564 = new String[] { method380(method379("U=x\u0011-")), method380(method379("U=x\u0012-")) };

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "[I")
    public static int[] field556 = new int[2];

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
    public int field554;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
    public int field555;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
    public int field557;

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
    public int field558;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
    public int field560;

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "I")
    public int field562;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V")
    public static void method377(byte arg0) {
        try {
            field556 = null;
            if (arg0 != 76) {
                field556 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field564[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
    public static final void method378(int arg0) {
        try {
            class511.field7358 = null;
            class163.field2257 = null;
            class106.field1221 = null;
            class710.field10296 = null;
            class269.field4102 = null;
            class286.field4251 = null;
            field559++;
            class753.field10959 = null;
            if (arg0 == 2) {
                class108.field1255 = null;
                class217.field3328 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field564[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lec;)V")
    public class49(class247 arg0) {
    }

    @OriginalMember(owner = "client!gs", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method379(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gs", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method380(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 50;
                    break;
                case 1:
                    var10005 = 78;
                    break;
                case 2:
                    var10005 = 86;
                    break;
                case 3:
                    var10005 = 83;
                    break;
                default:
                    var10005 = 5;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
