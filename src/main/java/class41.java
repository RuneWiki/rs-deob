import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class41 {

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field556 = 0;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "Z")
    public static boolean field554 = false;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "[Lck;")
    public static class218[] field558 = new class218[14];

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)Lqh;")
    public abstract class201 method320(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
    public static final void method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field553++;
        if (arg5 < 62) {
            field556 = 53;
        }
        class8.method52(arg0 - arg3, class106.field1637[arg4], arg0 + arg3, arg1, true);
        int var6 = 0;
        int var7 = arg2 * arg2;
        int var8 = arg3 * arg3;
        int var9 = arg2;
        int var10 = var8 << 1;
        int var11 = var7 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var8 + var11;
        int var14 = var8 << 2;
        int var15 = var7 << 2;
        int var16 = ((var6 << 1) + 3) * var11;
        int var17 = var7 - ((var12 - 1) * var10);
        int var18 = ((arg2 << 1) - 3) * var10;
        int var19 = (arg2 - 1) * var14;
        int var20 = (var6 + 1) * var15;
        while (var9 > 0) {
            var9--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var6++;
                    var17 += var20;
                    var20 += var15;
                    var13 += var16;
                    var16 += var15;
                }
            }
            if (var17 < 0) {
                var17 += var20;
                var13 += var16;
                var16 += var15;
                var20 += var15;
                var6++;
            }
            var13 += -var19;
            var19 -= var14;
            var17 += -var18;
            var18 -= var14;
            int var21 = arg4 + var9;
            int var22 = arg0 + var6;
            int var23 = arg0 - var6;
            int var24 = arg4 - var9;
            class8.method52(var23, class106.field1637[var24], var22, arg1, true);
            class8.method52(var23, class106.field1637[var21], var22, arg1, true);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)I")
    public abstract int method322(byte arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[B")
    public abstract byte[] method323(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public static void method324(byte arg0) {
        field558 = null;
        if (arg0 < 97) {
            method324((byte) -74);
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)V")
    public static final void method325(int arg0, int arg1) {
        class23.field290.method1425(arg1, -121);
        field555++;
        class286.field4537.method1425(arg1, -113);
        class182.field2886.method1425(arg1, arg0 + 193822980);
        if (arg0 != -193823103) {
            field557 = -42;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(BI)V")
    public abstract void method326(byte arg0, int arg1);
}
