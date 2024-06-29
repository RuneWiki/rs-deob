import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class247 {

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "[I")
    public static int[] field3507 = new int[128];

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "S")
    public static short field3510;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "[[I")
    public static int[][] field3509;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljr;B)Lqp;")
    public static final class602 method1525(class96 arg0, byte arg1) {
        field3505++;
        return arg1 < 41 ? null : new class602(arg0.method722(4), arg0.method722(4), arg0.method722(4), arg0.method722(4), arg0.method736(-124), arg0.method718(-97));
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static void method1526(byte arg0) {
        if (arg0 >= -84) {
            method1527(true, 100, 87, 110);
        }
        field3507 = null;
        field3509 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZIII)V")
    public static final void method1527(boolean arg0, int arg1, int arg2, int arg3) {
        field3506++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        } else if (arg1 == -18905) {
            class641.field9107 = arg2;
            class581.field8101 = arg0;
            class29.field359 = arg3;
        }
    }

    static {
        for (int var0 = 0; var0 < field3507.length; var0++) {
            field3507[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field3507[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field3507[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field3507[var3] = var3 + 4;
        }
        field3507[45] = field3507[47] = 63;
        field3507[42] = field3507[43] = 62;
        field3508 = -1;
        field3510 = 256;
        field3509 = new int[128][128];
    }
}
