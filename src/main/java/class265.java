import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public abstract class class265 {

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "[I")
    public static int[] field3300 = new int[1];

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "Loj;")
    public static class541 field3301;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V")
    public static void method1564(int arg0) {
        int var1 = -7 / ((-arg0 - 2) / 43);
        field3300 = null;
        field3301 = null;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIIII)V")
    public static final void method1565(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3302++;
        class76 var5 = class3.method28(arg3, (byte) 42, arg0);
        var5.method403((byte) -94);
        var5.field785 = arg1;
        var5.field789 = arg2;
        var5.field780 = arg4;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIFIIF[FIFFI)V")
    public abstract void method711(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, float[] arg6, int arg7, float arg8, float arg9, int arg10);
}
