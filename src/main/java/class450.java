import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class450 extends class35 {

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "Ljava/lang/String;")
    public String field6531;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Lfg;")
    public static class18 field6534 = new class18(50);

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "Z")
    public static boolean field6535 = false;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "Ljava/lang/String;")
    public static String field6536 = "Connected to update server";

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "[[[I")
    public static int[][][] field6537;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)V", line = 3)
    public static void method2803(byte arg0) {
        if (arg0 <= 63) {
            field6535 = false;
        }
        field6537 = null;
        field6536 = null;
        field6534 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)Ljo;", line = 17)
    public static final class218 method2804(boolean arg0) {
        if (!arg0) {
            field6536 = null;
        }
        field6533++;
        return class221.field3299.length > class287.field4295 ? class221.field3299[class287.field4295++] : null;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V", line = 33)
    public class450() {
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIZ)I", line = 37)
    public static final int method2805(int arg0, int arg1, boolean arg2) {
        field6532++;
        class188 var3 = (class188) class319.field4606.method1219((long) arg1, -103);
        if (var3 == null) {
            return 0;
        } else if (arg2) {
            return -61;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field2780.length; var5++) {
                if (var3.field2781[var5] == arg0) {
                    var4 += var3.field2780[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 84)
    public class450(String arg0) {
        this.field6531 = arg0;
    }
}
