import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class58 {

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "[[I")
    public static int[][] field794 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Ldp;")
    public static class347 field796 = new class347(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "F")
    public static float field799 = 1.0F;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field797 = 0;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "[Las;")
    public static class18[] field800 = new class18[128];

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Ldp;")
    public static class347 field798 = new class347("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "[I")
    public static int[] field801 = new int[14];

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V", line = 5)
    public static void method416(byte arg0) {
        field796 = null;
        field800 = null;
        field798 = null;
        field794 = null;
        field801 = null;
        int var1 = 118 % ((arg0 + 67) / 42);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIZ)V", line = 19)
    public static final void method417(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field795++;
        long var6 = (long) (arg1 | (arg5 ? Integer.MIN_VALUE : 0));
        class411 var8 = (class411) class214.field3053.method3059(100, var6);
        if (var8 == null) {
            var8 = new class411();
            class214.field3053.method3055(arg0 ^ 0x7, var6, var8);
        }
        if (arg0 != 7) {
            return;
        }
        if (arg3 >= var8.field6200.length) {
            int[] var9 = new int[arg3 + 1];
            int[] var10 = new int[arg3 + 1];
            for (int var11 = 0; var11 < var8.field6200.length; var11++) {
                var9[var11] = var8.field6200[var11];
                var10[var11] = var8.field6201[var11];
            }
            for (int var12 = var8.field6200.length; var12 < arg3; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field6200 = var9;
            var8.field6201 = var10;
        }
        var8.field6200[arg3] = arg2;
        var8.field6201[arg3] = arg4;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)Z", line = 72)
    public static final boolean method418(int arg0, int arg1, int arg2) {
        field793++;
        if (arg0 < 22) {
            field798 = null;
        }
        return (arg1 & 0x800) != 0;
    }
}
