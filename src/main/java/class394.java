import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class394 extends class619 {

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "Ldea;")
    public class225 field5764;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field5758 = -1;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "[I")
    public static int[] field5761 = new int[50];

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "Ldh;")
    public static class295 field5757;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "Ljava/awt/Image;")
    public static Image field5759;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/String;BZLjava/lang/String;I)V")
    public static final void method2430(String arg0, byte arg1, boolean arg2, String arg3, int arg4) {
        field5763++;
        class22.method453(-1, arg4, -124, true, arg3, arg2, arg0);
        if (arg1 <= 105) {
            method2431(-62);
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)I")
    public static final int method2431(int arg0) {
        field5760++;
        return arg0 == 6406 ? 19 : 38;
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
    public static void method2432(int arg0) {
        field5759 = null;
        if (arg0 != 0) {
            method2432(-27);
        }
        field5757 = null;
        field5761 = null;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lus;II[B)V")
    public class394(class1 arg0, int arg1, int arg2, byte[] arg3) {
        this.field5764 = class680.method3824(2, arg1, 6406, false, arg2, 6406, arg0, arg3);
        this.field5764.method1971(false, -114, false);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(CLjava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method2433(char arg0, String arg1, byte arg2) {
        field5762++;
        int var3 = -77 % ((arg2 - 20) / 34);
        int var4 = class13.method306(arg0, 30656, arg1);
        String[] var5 = new String[var4 + 1];
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; var8 < var4; var8++) {
            int var9;
            for (var9 = var7; arg1.charAt(var9) != arg0; var9++) {
            }
            var5[var6++] = arg1.substring(var7, var9);
            var7 = var9 + 1;
        }
        var5[var4] = arg1.substring(var7);
        return var5;
    }
}
