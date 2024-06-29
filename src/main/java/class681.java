import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class681 {

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9870 = new String[] { method4993(method4992("\u001aJC4O")), method4993(method4992("\u001aJC7O")) };

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field9866 = 0;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field9869 = 0;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "[J")
    public static long[] field9868 = new long[32];

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field9864;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lvv;")
    public class343 field9867;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Lpb;")
    public class681 field9865;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V", line = 3)
    public static void method4990(boolean arg0) {
        try {
            if (arg0) {
                method4990(false);
            }
            field9868 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9870[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 28)
    public final void method4991(int arg0) {
        try {
            field9864++;
            if (~class379.field5769 > arg0) {
                this.field9867 = null;
                this.field9865 = class206.field3178;
                class206.field3178 = this;
                class379.field5769++;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9870[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4992(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x67);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4993(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 106;
                    break;
                case 1:
                    var10005 = 40;
                    break;
                case 2:
                    var10005 = 109;
                    break;
                case 3:
                    var10005 = 117;
                    break;
                default:
                    var10005 = 103;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
