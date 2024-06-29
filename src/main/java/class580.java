import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class580 extends class681 {

    @OriginalMember(owner = "client!iu", name = "p", descriptor = "[I")
    public static int[] field8115 = new int[128];

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "I")
    public int field8111;

    @OriginalMember(owner = "client!iu", name = "m", descriptor = "I")
    public int field8112;

    @OriginalMember(owner = "client!iu", name = "n", descriptor = "I")
    public int field8113;

    @OriginalMember(owner = "client!iu", name = "o", descriptor = "I")
    public int field8114;

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "J")
    public static long field8110;

    @OriginalMember(owner = "client!iu", name = "q", descriptor = "Lvl;")
    public class13 field8116;

    static {
        for (int var0 = 0; var0 < field8115.length; var0++) {
            field8115[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field8115[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field8115[var2] = var2 - 71;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field8115[var3] = var3 + 52 - 48;
        }
        field8115[42] = field8115[43] = 62;
        field8115[45] = field8115[47] = 63;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V", line = 46)
    public static void method3306(int arg0) {
        if (arg0 == 48) {
            field8115 = null;
        }
    }
}
