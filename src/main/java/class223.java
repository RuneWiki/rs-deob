import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public abstract class class223 extends class232 {

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "Z")
    public static boolean field3720 = true;

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "Lok;")
    public static class146 field3719 = class235.method1724(-12908, "Moteur son pr-Bpar-B");

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "I")
    public static int field3718 = 0;

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "Lok;")
    public static class146 field3716 = class235.method1724(-12908, ")1a2)1m");

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "J")
    public static long field3722 = 0L;

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V", line = 25)
    public static void method1645(boolean arg0) {
        field3719 = null;
        field3716 = null;
        if (!arg0) {
            method1647((byte) -40);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIZ)I", line = 62)
    public static final int method1646(int arg0, int arg1, boolean arg2) {
        field3721++;
        int var3 = 1;
        if (!arg2) {
            field3719 = (class146) null;
        }
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg0 >>= 0x1;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(B)V", line = 87)
    public static final void method1647(byte arg0) {
        field3714++;
        for (class185 var1 = (class185) class225.field3751.method1251(-51); var1 != null; var1 = (class185) class225.field3751.method1253(125)) {
            if (var1.field3077 > 0) {
                var1.field3077--;
            }
            if (var1.field3077 != 0) {
                if (var1.field3090 > 0) {
                    var1.field3090--;
                }
                if (var1.field3090 == 0 && var1.field3095 >= 1 && var1.field3087 >= 1 && var1.field3095 <= 102 && var1.field3087 <= 102 && (var1.field3089 < 0 || class190.method1469(var1.field3096, (byte) -70, var1.field3089))) {
                    class143.method1055(var1.field3085, var1.field3087, var1.field3089, var1.field3095, 123, var1.field3075, var1.field3096, var1.field3078);
                    var1.field3090 = -1;
                    if (var1.field3089 == var1.field3080 && var1.field3080 == -1) {
                        var1.method1325(-2935);
                    } else if (var1.field3089 == var1.field3080 && var1.field3091 == var1.field3078 && var1.field3096 == var1.field3088) {
                        var1.method1325(arg0 ^ 0xFFFFF4F0);
                    }
                }
            } else if (var1.field3080 < 0 || class190.method1469(var1.field3088, (byte) -70, var1.field3080)) {
                class143.method1055(var1.field3085, var1.field3087, var1.field3080, var1.field3095, 123, var1.field3075, var1.field3088, var1.field3091);
                var1.method1325(-2935);
            }
        }
        if (arg0 != 121) {
            method1647((byte) 60);
        }
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method722(byte arg0);

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)Z")
    public abstract boolean method721(int arg0);
}
