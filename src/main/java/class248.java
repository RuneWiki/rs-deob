import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class248 {

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "[I")
    public static int[] field3727 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "Lqfa;")
    public static class85 field3728 = new class85(83, -1);

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "[Z")
    public static boolean[] field3731 = new boolean[100];

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "B")
    public static byte field3730;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
    public static void method1673(int arg0) {
        field3728 = null;
        if (arg0 != -9050) {
            field3731 = null;
        }
        field3727 = null;
        field3731 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V")
    public static final void method1674(int arg0, int arg1) {
        class370 var2 = class257.field3792[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class370 var4 = class257.field3792[var3][arg0][arg1] = class257.field3792[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class636 var5 = var4.field5497; var5 != null; var5 = var5.field9171) {
                    class122 var6 = var5.field9172;
                    if (var6.field2220 == arg0 && var6.field2230 == arg1) {
                        var6.field9814--;
                    }
                }
                if (var4.field5494 != null) {
                    var4.field5494.field9814--;
                }
                if (var4.field5491 != null) {
                    var4.field5491.field9814--;
                }
                if (var4.field5493 != null) {
                    var4.field5493.field9814--;
                }
                if (var4.field5501 != null) {
                    var4.field5501.field9814--;
                }
                if (var4.field5503 != null) {
                    var4.field5503.field9814--;
                }
            }
        }
        if (class257.field3792[0][arg0][arg1] == null) {
            class257.field3792[0][arg0][arg1] = new class370(0);
            class257.field3792[0][arg0][arg1].field5506 = 1;
        }
        class257.field3792[0][arg0][arg1].field5492 = var2;
        class257.field3792[3][arg0][arg1] = null;
    }
}
