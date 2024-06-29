import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class21 {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Lkb;")
    public static class93 field333 = class76.method390("::", 0);

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field341 = 0;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field338 = 0;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "Lkb;")
    public static class93 field340 = class76.method390("mapfunction", 0);

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static void method127(int arg0) {
        field340 = null;
        if (arg0 == 20878) {
            field333 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
    public static final int method128(int arg0, int arg1, int arg2) {
        int var3 = -62 / ((arg2 - 21) / 50);
        int var4 = class117.method648(arg1 + 45365, arg0 + 91923, 4, 5723) + (class117.method648(arg1 + 10294, arg0 + 37821, 2, 5723) - 128 >> 1) + (class117.method648(arg1, arg0, 1, 5723) + -128 >> 2) - 128;
        int var5 = (int) ((double) var4 * 0.3D) + 35;
        if (var5 < 10) {
            var5 = 10;
        } else if (var5 > 60) {
            var5 = 60;
        }
        field336++;
        return var5;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
    public static final int method129(int arg0, int arg1) {
        class135 var2 = class34.method191(arg0, -98);
        field334++;
        int var3 = var2.field2617;
        int var4 = var2.field2622;
        if (arg1 == 21497) {
            int var5 = var2.field2630;
            int var6 = class130.field2455[var5 - var4];
            return var6 & class47.field758[var3] >> var4;
        } else {
            return 72;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
    public static final int method130(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 > 243) {
            arg2 >>= 0x4;
        } else if (arg0 > 217) {
            arg2 >>= 0x3;
        } else if (arg0 > 192) {
            arg2 >>= 0x2;
        } else if (arg0 > 179) {
            arg2 >>= 0x1;
        }
        if (arg1 != 1487052578) {
            method127(9);
        }
        field337++;
        return (arg3 >> 2 << 10) + (arg0 >> 1) + (arg2 >> 5 << 7);
    }
}
