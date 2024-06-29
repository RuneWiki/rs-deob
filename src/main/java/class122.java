import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class122 extends class178 {

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "Lwg;")
    public class235 field2185;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "[I")
    public static int[] field2188 = new int[4096];

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "[Lte;")
    public static class203[] field2190;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "[[[B")
    public static byte[][][] field2191;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
    public static void method737(int arg0) {
        field2190 = null;
        field2191 = null;
        field2188 = null;
        if (arg0 != -4097) {
            method739(-127, -98);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)I")
    public static final int method738(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        int var5 = 102 / ((42 - arg3) / 49);
        field2184++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(II)I")
    public static final int method739(int arg0, int arg1) {
        field2187++;
        if (arg1 != 258072555) {
            field2188 = null;
        }
        return arg0 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(II)I")
    public static final int method740(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lwg;)V")
    public class122(class235 arg0) {
        this.field2185 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2188[var0] = class227.method1425(var0, 40960);
        }
        field2189 = 0;
        field2190 = new class203[32768];
        field2191 = new byte[4][104][104];
    }
}
