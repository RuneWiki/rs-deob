import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class133 {

    @OriginalMember(owner = "client!g", name = "i", descriptor = "[I")
    private int[] field2384;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field2376 = 0;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Lli;")
    public static class185 field2378 = class245.method1649(" ", -127);

    @OriginalMember(owner = "client!g", name = "j", descriptor = "[I")
    public static int[] field2385 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field2386 = 1;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Lli;")
    private static class185 field2387 = class245.method1649("Prepared sound engine", -58);

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Lli;")
    public static class185 field2377 = field2387;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "B")
    public static byte field2388;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Lji;")
    public static class87 field2383;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Z")
    public static boolean field2381;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "[I")
    public static int[] field2379;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public static void method940(byte arg0) {
        field2383 = null;
        field2378 = null;
        if (arg0 <= -82) {
            field2377 = null;
            field2387 = null;
            field2379 = null;
            field2385 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIBII)V")
    public static final void method941(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field2382++;
        if (arg3 <= 99) {
            return;
        }
        int var6 = (arg1 - 32) * arg1 / arg2;
        class151.field2858[0].method96(arg0, arg5);
        class151.field2858[1].method96(arg0, arg5 + arg1 - 16);
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg1 - var6 - 32) * arg4 / (arg2 - arg1);
        class159.method1130(arg0, arg5 + 16, 16, arg1 - 32, class130.field2339);
        class159.method1130(arg0, arg5 + var7 + 16, 16, var6, class158.field3001);
        class159.method1128(arg0, var7 + arg5 + 16, var6, class176.field3214);
        class159.method1128(arg0 + 1, arg5 + 16 + var7, var6, class176.field3214);
        class159.method1146(arg0, arg5 + var7 + 16, 16, class176.field3214);
        class159.method1146(arg0, arg5 + var7 + 17, 16, class176.field3214);
        class159.method1128(arg0 + 15, var7 + 16 + arg5, var6, class116.field2070);
        class159.method1128(arg0 + 14, arg5 - -17 + var7, var6 - 1, class116.field2070);
        class159.method1146(arg0, arg5 + var6 - (-15 - var7), 16, class116.field2070);
        class159.method1146(arg0 + 1, arg5 - -var7 - -var6 + 14, 15, class116.field2070);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)I")
    public final int method942(int arg0, int arg1) {
        int var3 = (this.field2384.length >> 1) + arg0;
        int var4 = arg1 & var3;
        field2380++;
        while (true) {
            int var5 = this.field2384[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2384[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "([I)V")
    public class133(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field2384 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2384[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2384[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field2384[var5 + var5] = arg0[var4];
            this.field2384[var5 + var5 + 1] = var4++;
        }
    }
}
