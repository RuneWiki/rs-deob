import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class692 {

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public int field9725;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public int field9730;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    public int field9732;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public int field9726;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "[I")
    public static int[] field9728 = new int[2];

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "Ldg;")
    public static class376 field9727 = new class376(72, -1);

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public static int field9729;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    public static int field9731;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "Loea;")
    public static class553 field9733;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lqba;IIZI)V")
    public static final void method3805(class370 arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field9729++;
        long var5 = (long) (arg4 << 14 | arg2 << 28 | arg1);
        class44 var7 = (class44) class22.field296.method1405(var5, (byte) -32);
        if (var7 == null) {
            class44 var8 = new class44();
            class22.field296.method1403((byte) -18, var8, var5);
            var8.field705.method474(arg0, 6);
            return;
        }
        class186 var9 = class41.field682.method2228(arg0.field5279, 0);
        int var10 = var9.field2616;
        if (var9.field2684 == 1) {
            var10 = (arg0.field5280 + 1) * var10;
        }
        for (class370 var11 = (class370) var7.field705.method472((byte) -42); var11 != null; var11 = (class370) var7.field705.method482(124)) {
            class186 var12 = class41.field682.method2228(var11.field5279, 0);
            int var13 = var12.field2616;
            if (var12.field2684 == 1) {
                var13 = (var11.field5280 + 1) * var13;
            }
            if (var13 < var10) {
                class581.method3313(0, arg0, var11);
                return;
            }
        }
        if (!arg3) {
            method3805(null, 101, 34, true, 118);
        }
        var7.field705.method474(arg0, 6);
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(IIII)V")
    public class692(int arg0, int arg1, int arg2, int arg3) {
        this.field9725 = arg2;
        this.field9730 = arg3;
        this.field9732 = arg1;
        this.field9726 = arg0;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BI)Lpn;")
    public final class692 method3806(byte arg0, int arg1) {
        int var3 = -79 % ((5 - arg0) / 63);
        field9731++;
        return new class692(this.field9726, arg1, this.field9725, this.field9730);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V")
    public static void method3807(byte arg0) {
        field9733 = null;
        field9727 = null;
        field9728 = null;
        if (arg0 >= -78) {
            field9733 = null;
        }
    }
}
