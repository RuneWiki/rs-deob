import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class17 {

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "Z")
    public static boolean field149 = true;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Lqe;")
    public static class168 field152 = class66.method448("(R", 89);

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field155 = 0;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Lwc;")
    public static class232 field146 = new class232(64);

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public int field147;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public int field150;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public int field151;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "J")
    public long field148;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Lqf;")
    public class13 field153;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 < 56) {
            method85(-119, -102, -75, -75, 92, -34, 10, -15);
        }
        field154++;
        int var8 = 2048 - arg7 & 0x7FF;
        int var9 = 2048 - arg5 & 0x7FF;
        int var10 = 0;
        int var11 = arg4;
        if (var8 != 0) {
            int var12 = class248.field4297[var8];
            int var13 = class248.field4301[var8];
            var10 = -arg4 * var12 >> 16;
            var11 = arg4 * var13 >> 16;
        }
        int var14 = 0;
        if (var9 != 0) {
            int var15 = class248.field4297[var9];
            var14 = var11 * var15 >> 16;
            int var16 = class248.field4301[var9];
            var11 = var11 * var16 >> 16;
        }
        class109.field1747 = arg5;
        class105.field1680 = arg0 - var11;
        class88.field1372 = arg1 - var10;
        class114.field1854 = arg6 - var14;
        class189.field3298 = arg7;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static void method86(int arg0) {
        field146 = null;
        field152 = null;
        if (arg0 != -14231) {
            method86(-55);
        }
    }
}
