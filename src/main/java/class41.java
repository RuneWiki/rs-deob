import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class41 {

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Z")
    public static boolean field469 = false;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field472 = -1;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "[I")
    public static int[] field467 = new int[4096];

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "[[B")
    public static byte[][] field468;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V", line = 41)
    public static final void method252(int arg0, int arg1) {
        class170.field2315 = arg0;
        field470++;
        class210.field3044 = -1;
        class210.field3044 = -1;
        class93.method699(100);
        if (arg1 != 2) {
            field467 = (int[]) null;
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field467[var0] = class109.method796(113, var0);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIZIII)V", line = 79)
    public static final void method253(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class66.field870 = arg2;
        class232.field3280 = arg1;
        field471++;
        class312.field4718 = arg0;
        class242.field3460 = arg5;
        class314.field4737 = arg6;
        if (arg4 != 3528) {
            return;
        }
        if (arg3 && class232.field3280 >= 100) {
            class275.field4123 = class66.field870 * 128 + 64;
            class198.field2820 = class314.field4737 * 128 + 64;
            class101.field1394 = class135.method985(class275.field4123, class251.field3603, class198.field2820, (byte) -90) - class312.field4718;
        }
        class343.field5168 = 2;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V", line = 120)
    public static void method254(boolean arg0) {
        if (!arg0) {
            method253(61, -28, 78, false, -45, 100, 23);
        }
        field467 = null;
        field468 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V", line = 133)
    public static final void method255(byte arg0) {
        field466++;
        int var1 = class266.field3883.length;
        int var2 = 0;
        if (arg0 < 96) {
            return;
        }
        while (var2 < var1) {
            if (class266.field3883[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class159.field2183; var4++) {
                    if (class256.field3702[var2] == class113.field1542[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class113.field1542[class159.field2183] = class256.field3702[var2];
                    var3 = class159.field2183++;
                }
                class316 var5 = new class316(class266.field3883[var2]);
                int var6 = 0;
                while (class266.field3883[var2].length > var5.field4777 && var6 < 511) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method2220((byte) 58);
                    int var9 = var8 & 0x3F;
                    int var10 = var8 >> 14;
                    int var11 = (class256.field3702[var2] & 0xFF) * 64 + var9 - class296.field4394;
                    int var12 = var8 >> 7 & 0x3F;
                    int var13 = (class256.field3702[var2] >> 8) * 64 + var12 - class132.field1809;
                    class181 var14 = class327.method2285(var5.method2220((byte) 116), true);
                    if (class42.field484[var7] == null && (var14.field2475 & 0x1) > 0 && class270.field4028 == var10 && var13 >= 0 && (var13 + var14.field2424) < 104 && var11 >= 0 && var14.field2424 + var11 < 104) {
                        class42.field484[var7] = new class329();
                        class329 var15 = class42.field484[var7];
                        class257.field3807[class338.field5084++] = var7;
                        var15.field3697 = class329.field4966;
                        var15.method2301(var14, (byte) -6);
                        var15.method1756(var15.field4961.field2424, (byte) 108);
                        var15.field3666 = var15.field3746 = class6.field52[var15.field4961.field2457];
                        var15.field3738 = var15.field4961.field2458;
                        var15.field3665 = var15.field4961.field2473;
                        if (var15.field3665 == 0) {
                            var15.field3746 = 0;
                        }
                        var15.method1757(true, var15.method1653(-1), var11, true, var13);
                    }
                }
            }
            var2++;
        }
    }
}
