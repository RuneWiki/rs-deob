import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class123 extends class12 {

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
    public int field2304;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "Lkh;")
    public static class117 field2302 = class224.method1450((byte) 2, "welle:");

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public static int field2299 = 0;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public static int field2303 = 0;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "[I")
    public static int[] field2301 = new int[256];

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "Lkh;")
    public static class117 field2298 = class224.method1450((byte) 116, "cookieprefix");

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "Lkh;")
    public static class117 field2300 = class224.method1450((byte) 115, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "[Lch;")
    public static class31[] field2305;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(B)V")
    public static void method857(byte arg0) {
        field2302 = null;
        field2305 = null;
        field2298 = null;
        int var1 = 47 % ((1 - arg0) / 62);
        field2300 = null;
        field2301 = null;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
    public class123() {
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(I)V")
    public class123(int arg0) {
        this.field2304 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)V")
    public static final void method858(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2306++;
        int var5 = 0;
        int var6 = arg1;
        if (arg3 <= 98) {
            method858(1, 24, -96, -87, 59);
        }
        int var7 = -1;
        int var8 = class119.method843(class240.field4355, -108, arg1 + arg4, class146.field2678);
        int var9 = class119.method843(class240.field4355, -114, arg4 - arg1, class146.field2678);
        class114.method762(var9, 69, var8, arg0, class167.field3030[arg2]);
        int var10 = -arg1;
        while (var6 > var5) {
            var7 += 2;
            var10 += var7;
            if (var10 > 0) {
                var6--;
                int var11 = arg2 - var6;
                int var12 = arg2 + var6;
                var10 -= var6 << 1;
                if (var12 >= class159.field2910 && var11 <= class224.field4040) {
                    int var13 = class119.method843(class240.field4355, -114, arg4 + var5, class146.field2678);
                    int var14 = class119.method843(class240.field4355, -124, arg4 - var5, class146.field2678);
                    if (class224.field4040 >= var12) {
                        class114.method762(var14, 84, var13, arg0, class167.field3030[var12]);
                    }
                    if (var11 >= class159.field2910) {
                        class114.method762(var14, 67, var13, arg0, class167.field3030[var11]);
                    }
                }
            }
            var5++;
            int var15 = arg2 - var5;
            int var16 = arg2 + var5;
            if (class159.field2910 <= var16 && var15 <= class224.field4040) {
                int var17 = class119.method843(class240.field4355, -113, arg4 + var6, class146.field2678);
                int var18 = class119.method843(class240.field4355, -109, arg4 - var6, class146.field2678);
                if (var16 <= class224.field4040) {
                    class114.method762(var18, 75, var17, arg0, class167.field3030[var16]);
                }
                if (var15 >= class159.field2910) {
                    class114.method762(var18, 72, var17, arg0, class167.field3030[var15]);
                }
            }
        }
    }
}
