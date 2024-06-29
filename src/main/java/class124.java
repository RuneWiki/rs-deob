import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class124 {

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Lob;")
    public static class141 field2380 = class175.method1195(40, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Lob;")
    public static class141 field2377 = class175.method1195(40, "p12_full");

    @OriginalMember(owner = "client!me", name = "n", descriptor = "[I")
    public static int[] field2390 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Lob;")
    public static class141 field2384 = class175.method1195(40, "VOLL");

    @OriginalMember(owner = "client!me", name = "l", descriptor = "Lob;")
    private static class141 field2388 = class175.method1195(40, "Checking for updates )2 ");

    @OriginalMember(owner = "client!me", name = "g", descriptor = "Lob;")
    public static class141 field2383 = field2388;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "B")
    public static byte field2382;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public int field2385;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public int field2386;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public int field2389;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "J")
    public long field2391;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "Lca;")
    public static class22 field2393;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Laa;")
    public class2 field2379;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIB)V")
    public static final void method800(int arg0, int arg1, int arg2, byte arg3) {
        field2381++;
        if (arg2 < 128 || arg1 < 128 || arg2 > 13056 || arg1 > 13056) {
            class119.field2321 = -1;
            class15.field273 = -1;
            return;
        }
        int var4 = -77 % ((16 - arg3) / 32);
        int var5 = class206.method1360(class66.field1287, arg2, (byte) 40, arg1) - arg0;
        int var6 = class44.field843[class175.field3474];
        int var7 = class44.field854[class19.field338];
        int var8 = var5 - class191.field3683;
        int var9 = class44.field854[class175.field3474];
        int var10 = class44.field843[class19.field338];
        int var11 = arg1 - class184.field3589;
        int var12 = arg2 - class178.field3508;
        int var13 = var9 * var11 + var6 * var12 >> 16;
        int var14 = var6 * var11 - var9 * var12 >> 16;
        int var16 = var8 * var10 - var7 * var14 >> 16;
        int var17 = var7 * var8 + var10 * var14 >> 16;
        if (var17 >= 50) {
            class119.field2321 = (var16 << 9) / var17 + 167;
            class15.field273 = (var13 << 9) / var17 + 256;
        } else {
            class119.field2321 = -1;
            class15.field273 = -1;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static void method801(int arg0) {
        field2393 = null;
        field2380 = null;
        field2377 = null;
        field2384 = null;
        field2383 = null;
        int var1 = 110 % ((38 - arg0) / 55);
        field2390 = null;
        field2388 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V")
    public static final void method802(int arg0, int arg1, int arg2) {
        class153 var3 = class131.field2506[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < var3.field2933; var4++) {
            class9 var5 = var3.field2935[var4];
            if ((var5.field141 >> 29 & 0x3L) == 2L && var5.field156 == arg1 && var5.field143 == arg2) {
                class1.method6(var5);
                return;
            }
        }
    }
}
