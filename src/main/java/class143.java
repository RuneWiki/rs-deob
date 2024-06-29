import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class143 {

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "[Lib;")
    public static class76[] field2791 = new class76[32768];

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "Lkb;")
    public static class93 field2787 = class76.method390("Update)2Liste geladen)3", 0);

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "Lkb;")
    private static class93 field2793 = class76.method390(" is already on your ignore list)3", 0);

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Lkb;")
    public static class93 field2790 = field2793;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "Lme;")
    public static class114 field2792;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIII)V")
    public static final void method896(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg3; var5 < class23.field357; var5++) {
            if (class49.field783[var5] + class136.field2645[var5] > arg2 && arg1 + arg2 > class136.field2645[var5] && arg0 < class64.field1024[var5] + class36.field592[var5] && class36.field592[var5] < arg0 + arg4) {
                class88.field1600[var5] = true;
            }
        }
        field2788++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static void method897(int arg0) {
        field2790 = null;
        field2787 = null;
        field2792 = null;
        if (arg0 == 0) {
            field2793 = null;
            field2791 = null;
        }
    }
}
