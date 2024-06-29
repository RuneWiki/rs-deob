import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class28 {

    @OriginalMember(owner = "client!be", name = "g", descriptor = "Ljd;")
    private static class85 field429 = class221.method1499("OFF", (byte) -118);

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Z")
    public static boolean field423 = false;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "Ljd;")
    public static class85 field425 = field429;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "Ljd;")
    public static class85 field433 = class221.method1499("leuchten2:", (byte) -98);

    @OriginalMember(owner = "client!be", name = "f", descriptor = "[J")
    public static long[] field428 = new long[200];

    @OriginalMember(owner = "client!be", name = "n", descriptor = "Z")
    public static boolean field436 = false;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Z")
    public static boolean field432 = false;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "[I")
    public static int[] field424 = new int[4096];

    @OriginalMember(owner = "client!be", name = "q", descriptor = "Ljd;")
    public static class85 field439;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "Lge;")
    public static class68 field431;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "Lge;")
    public static class68 field440;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "[Lc;")
    public static class103[] field434;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lge;B)V")
    public static final void method195(class68 arg0, byte arg1) {
        if (arg1 >= -56) {
            method200(-106);
        }
        class210.field3694 = arg0.method482(-73, class83.field1520);
        field426++;
        class72.field1346 = arg0.method482(-66, class148.field2504);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)[Lc;")
    public static final class103[] method196(int arg0) {
        field438++;
        class103[] var1 = new class103[class95.field1741];
        int var2 = 0;
        if (arg0 != 3) {
            field428 = null;
        }
        while (var2 < class95.field1741) {
            var1[var2] = new class103(class251.field4331, class229.field3961, class246.field4200[var2], class121.field2134[var2], class30.field443[var2], class244.field4165[var2], class178.field3060[var2], class2.field20);
            var2++;
        }
        class47.method322(arg0 ^ 0xFFFF8CC8);
        return var1;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public static void method197(byte arg0) {
        field431 = null;
        field433 = null;
        field440 = null;
        if (arg0 != 111) {
            field439 = null;
        }
        field439 = null;
        field424 = null;
        field434 = null;
        field425 = null;
        field429 = null;
        field428 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILge;)V")
    public static final void method198(int arg0, class68 arg1) {
        if (arg0 > -70) {
            field424 = null;
        }
        class119.field2116 = class135.method903(arg1, -72, class102.field1826);
        class93.field1702 = new int[256];
        field437++;
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) ((class260.field4590[var2] & 0xFF0000) >> 16);
            int var5 = (class260.field4590[var2 + 1] & 0xFF0000) >> 16;
            float var6 = ((float) var5 - var4) / 64.0F;
            float var7 = (float) (class260.field4590[var2] >> 8 & 0xFF);
            float var8 = (float) (class260.field4590[var2] & 0xFF);
            int var9 = (class260.field4590[var2 + 1] & 0xFF00) >> 8;
            float var10 = ((float) var9 - var7) / 64.0F;
            int var11 = class260.field4590[var2 + 1] & 0xFF;
            float var12 = ((float) var11 - var8) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class93.field1702[var2 * 64 + var13] = class75.method528(class75.method528((int) var4 << 16, (int) var7 << 8), (int) var8);
                var8 += var12;
                var4 += var6;
                var7 += var10;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class93.field1702[var3] = class260.field4590[3];
        }
        class30.field453 = new int[32768];
        class85.field1567 = new int[32768];
        class254.method1756((class103) null, (byte) 101);
        class187.field3222 = new int[32768];
        class45.field811 = new int[32768];
        class23.field335 = new class266(128, 254);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public static final void method199(int arg0) {
        field427++;
        if (arg0 <= 114) {
            field429 = null;
        }
        class54.field950.method1270((byte) 107);
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)J")
    public static final synchronized long method200(int arg0) {
        field435++;
        long var1 = System.currentTimeMillis();
        int var3 = 64 % ((45 - arg0) / 46);
        if (class101.field1804 > var1) {
            class187.field3223 += class101.field1804 - var1;
        }
        class101.field1804 = var1;
        return class187.field3223 + var1;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIII)V")
    public static final void method201(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field430++;
        class147.field2496 = arg2;
        class6.field75 = class100.field1793 * arg0 / arg3;
        class168.field2901 = class79.field1458 * arg1 / arg4;
        class150.field2537 = -1;
        class201.method1381(0);
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field424[var0] = class56.method376(var0, 8);
        }
        field439 = class221.method1499(": ", (byte) 96);
    }
}
