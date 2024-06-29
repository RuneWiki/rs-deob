import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class672 {

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "I")
    public static int field9529 = 0;

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "[I")
    public static int[] field9528 = new int[256];

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "I")
    public static int field9527;

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "I")
    public static int field9530;

    @OriginalMember(owner = "client!lw", name = "g", descriptor = "I")
    public int field9533;

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "Lak;")
    public class572 field9531;

    @OriginalMember(owner = "client!lw", name = "f", descriptor = "[I")
    public int[] field9532;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIII)V")
    public static final void method3718(int arg0, int arg1, int arg2, int arg3) {
        field9527++;
        int var4 = class72.field935.field6528 * arg2 >> 8;
        if (var4 != 0 && arg1 != -1) {
            class21.method116(class209.field2740, var4, 0, arg1, false, 8956);
            class677.field9606 = true;
        }
        int var5 = -22 / ((arg0 - 52) / 41);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILfca;)Lfca;")
    public static final class188 method3719(int arg0, class188 arg1) {
        field9530++;
        if (arg1.field2414 != -1) {
            return class557.method3117(arg1.field2414, (byte) 71);
        }
        int var2 = arg1.field2387 >>> 16;
        class384 var3 = new class384(class54.field742);
        if (arg0 != 0) {
            method3719(-88, null);
        }
        for (class524 var4 = (class524) var3.method2317(-54); var4 != null; var4 = (class524) var3.method2318(-415116576)) {
            if (var4.field7256 == var2) {
                return class557.method3117((int) var4.field272, (byte) 71);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V")
    public static void method3720(int arg0) {
        if (arg0 == 1528141512) {
            field9528 = null;
        }
    }
}
