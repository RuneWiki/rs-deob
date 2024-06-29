import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class231 {

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "[Lie;")
    private class32[] field4237;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field4236 = -1;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field4235 = 0;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field4238 = 2;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "Lbf;")
    public static class199 field4239 = new class199(64);

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "Lmd;")
    public static class220 field4240;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V")
    public static void method1655(boolean arg0) {
        if (arg0) {
            field4238 = 108;
        }
        field4240 = null;
        field4239 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1656(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class233.field4281 * arg0 + class176.field3176 * arg3 >> 16;
        int var6 = class233.field4281 * arg3 - class176.field3176 * arg0 >> 16;
        int var7 = class191.field3378 * arg1 + class13.field192 * var6 >> 16;
        int var8 = class13.field192 * arg1 - class191.field3378 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class191.field3378 * arg2 + class13.field192 * var6 >> 16;
        int var12 = class13.field192 * arg2 - class191.field3378 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class212.field3772 && var13 < class212.field3772) {
            return false;
        } else if (var9 > class259.field4613 && var13 > class259.field4613) {
            return false;
        } else if (var10 < class225.field4100 && var14 < class225.field4100) {
            return false;
        } else {
            return var10 <= class277.field4872 || var14 <= class277.field4872;
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(I)V")
    public class231(int arg0) {
        this.field4237 = new class32[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class32 var3 = this.field4237[var2] = new class32();
            var3.field651 = var3;
            var3.field656 = var3;
        }
    }
}
