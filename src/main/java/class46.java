import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class46 extends class132 {

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "Ltg;")
    public static class184 field869 = class135.method812("mn", 3);

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "Ltg;")
    public static class184 field873 = class135.method812("<col=40ff00>", 3);

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "Ldh;")
    public static class38 field866 = new class38();

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "Ltg;")
    private static class184 field877 = class135.method812("Bad session id)3", 3);

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "Ltg;")
    public static class184 field876 = field877;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "[[[B")
    public static byte[][][] field878 = new byte[4][104][104];

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public static int field881 = 0;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "Ltg;")
    public static class184 field879 = class135.method812("Unerwartete Antwort vom Anmelde)2Server", 3);

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "B")
    public byte field870;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
    public int field871;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "Ltg;")
    public class184 field867;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "Lud;")
    public static class190 field868;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "Lgh;")
    public static class67 field872;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILvb;I)Lsc;")
    public static final class171 method265(int arg0, class197 arg1, int arg2) {
        field865++;
        if (arg2 >= -13) {
            method267(-37, -77, -67, -114);
        }
        return class128.method781(-31807, arg0, arg1) ? class154.method935(-121) : null;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public static void method266(int arg0) {
        field869 = null;
        field877 = null;
        field868 = null;
        field873 = null;
        field866 = null;
        field872 = null;
        if (arg0 != 167) {
            field881 = -89;
        }
        field878 = null;
        field879 = null;
        field876 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII)V")
    public static final void method267(int arg0, int arg1, int arg2, int arg3) {
        field874++;
        if (arg0 < 128 || arg3 < 128 || arg0 > 13056 || arg3 > 13056) {
            class88.field1655 = -1;
            class20.field383 = -1;
            return;
        }
        int var4 = class115.method706(arg0, class47.field892, 127, arg3) - arg1;
        if (arg2 != -1) {
            method267(77, -48, 76, 93);
        }
        int var5 = arg0 - class59.field1096;
        int var6 = class23.field422[class119.field2147];
        int var7 = arg3 - class78.field1418;
        int var8 = class23.field422[class34.field590];
        int var9 = var4 - class143.field2585;
        int var10 = class23.field434[class119.field2147];
        int var11 = class23.field434[class34.field590];
        int var12 = var5 * var11 + var7 * var8 >> 16;
        int var13 = var7 * var11 - var5 * var8 >> 16;
        int var15 = var9 * var10 - var6 * var13 >> 16;
        int var16 = var6 * var9 + var10 * var13 >> 16;
        if (var16 < 50) {
            class88.field1655 = -1;
            class20.field383 = -1;
        } else {
            class88.field1655 = (var15 << 9) / var16 + 167;
            class20.field383 = (var12 << 9) / var16 + 256;
        }
    }
}
