import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class19 {

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field236 = 0;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Lfha;")
    public static class522 field235;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Luha;")
    public static class723 field237;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Ljava/lang/Object;")
    public static Object field238;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static void method94(int arg0) {
        field238 = null;
        if (arg0 == 4) {
            field235 = null;
            field237 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILha;IZLkha;I)V")
    public static final void method95(int arg0, class545 arg1, int arg2, boolean arg3, class30 arg4, int arg5) {
        field234++;
        class403 var6 = class625.field8924.method900(-29491, arg4.field404);
        if (var6.field5600 == -1) {
            return;
        }
        int var8;
        if (arg4.field452) {
            int var7 = arg4.field376 + arg5;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class21 var9 = var6.method2445(arg4.field427, arg1, var8, 511638067);
        if (var9 == null) {
            return;
        }
        if (!arg3) {
            method95(-39, null, 43, false, null, 108);
        }
        int var10 = arg4.field440;
        int var11 = arg4.field446;
        if ((var8 & 0x1) == 1) {
            var10 = arg4.field446;
            var11 = arg4.field440;
        }
        int var12 = var9.method116();
        int var13 = var9.method108();
        if (var6.field5586) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field5589 == 0) {
            var9.method100(arg2, arg0 - ((var11 - 1) * 4), var12, var13);
        } else {
            var9.method110(arg2, arg0 + 4 - (var11 * 4), var12, var13, 0, var6.field5589 | 0xFF000000, 1);
        }
    }
}
