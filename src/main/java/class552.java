import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class552 implements class318 {

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "I")
    public int field7884;

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "Lgk;")
    public static class616 field7885 = new class616();

    @OriginalMember(owner = "client!eba", name = "h", descriptor = "Z")
    public static boolean field7890 = false;

    @OriginalMember(owner = "client!eba", name = "i", descriptor = "I")
    public static int field7891 = 2;

    @OriginalMember(owner = "client!eba", name = "g", descriptor = "F")
    public static float field7889;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "I")
    public static int field7883;

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "I")
    public static int field7886;

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "I")
    public static int field7887;

    @OriginalMember(owner = "client!eba", name = "f", descriptor = "Ljb;")
    public static class501 field7888;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I[BIIII)V")
    public static final void method3129(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field7883++;
        if (arg5 >= arg2 || arg0 != 26297) {
            return;
        }
        int var6 = arg2 - arg5 >> 2;
        int var7 = arg4 + arg5;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg2 - arg5 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg1[var7++] = 1;
                }
            }
            arg1[var7++] = 1;
            arg1[var7++] = 1;
            arg1[var7++] = 1;
            arg1[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)Lib;")
    public final class14 method203(byte arg0) {
        field7886++;
        return arg0 == -92 ? class652.field9152 : null;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V")
    public static void method3130(int arg0) {
        if (arg0 != -1) {
            field7890 = true;
        }
        field7885 = null;
        field7888 = null;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIIIII)V")
    public static final void method3131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 3072) {
            field7890 = true;
        }
        class475.field6842 = arg2;
        class649.field9139 = arg0;
        class588.field8320 = arg1;
        field7887++;
        class538.field7583 = arg5;
        class152.field1684 = arg4;
        if (class475.field6842 >= 100) {
            int var6 = class538.field7583 * 512 + 256;
            int var7 = class152.field1684 * 512 + 256;
            int var8 = class593.method3335(var7, class169.field1888, 27648, var6) - class588.field8320;
            int var9 = var6 - class516.field7360;
            int var10 = var8 - class44.field432;
            int var11 = var7 - class689.field9698;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var11 * var11)));
            class485.field6986 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class505.field7273 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            if (class485.field6986 < 1024) {
                class485.field6986 = 1024;
            }
            class605.field8502 = 0;
            if (class485.field6986 > 3072) {
                class485.field6986 = 3072;
            }
        }
        class538.field7572 = 2;
        class510.field7319 = -1;
        class307.field3791 = -1;
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(I)V")
    public class552(int arg0) {
        this.field7884 = arg0;
    }
}
