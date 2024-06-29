import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class182 {

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "J")
    public static long field3040 = 0L;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Leg;")
    public static class37 field3042 = class174.method1167("; version=1; path=)4; domain=", -44);

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "Leg;")
    private static class37 field3045 = class174.method1167("Loading fonts )2 ", 62);

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "Leg;")
    public static class37 field3046 = field3045;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field3044 = 0;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "[Lrk;")
    public static class14[] field3043;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method1200(int arg0) {
        field3046 = null;
        field3042 = null;
        field3043 = null;
        if (arg0 == 0) {
            field3045 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILie;IIZI)V")
    public static final void method1201(int arg0, class2 arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field3039++;
        if (class159.field2658 >= 50 || arg1.field26 == null || arg1.field26.length <= arg5 || arg1.field26[arg5] == null) {
            return;
        }
        int var6 = arg1.field26[arg5][0];
        int var7 = var6 >> 8;
        int var8 = var6 >> 4 & 0x7;
        if (arg1.field26[arg5].length > 1) {
            int var9 = (int) (Math.random() * (double) arg1.field26[arg5].length);
            if (var9 > 0) {
                var7 = arg1.field26[arg5][var9];
            }
        }
        int var10 = var6 & 0xF;
        if (var10 == 0) {
            if (arg4) {
                class79.method534(var8, (byte) 114, 0, var7);
            }
        } else if (class151.field2544 != 0) {
            class202.field3443[class159.field2658] = var7;
            int var11 = (arg3 - 64) / 128;
            class281.field4957[class159.field2658] = var8;
            class235.field4055[class159.field2658] = 0;
            class202.field3446[class159.field2658] = null;
            int var12 = (arg0 - 64) / 128;
            class42.field667[class159.field2658] = (var12 << 16) + (var11 << 8) + var10;
            class159.field2658++;
            if (arg2 != 255) {
                method1200(-71);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljl;I)V")
    public static final void method1202(class101 arg0, int arg1) {
        field3041++;
        class119.field2014 = class240.method1643((byte) 1, arg0, class120.field2033);
        class138.field2355 = new int[256];
        if (arg1 != 6099) {
            field3043 = null;
        }
        for (int var2 = 0; var2 < 3; var2++) {
            int var4 = class166.field2761[var2 + 1] >> 16 & 0xFF;
            float var5 = (float) (class166.field2761[var2] >> 16 & 0xFF);
            float var6 = ((float) var4 - var5) / 64.0F;
            float var7 = (float) (class166.field2761[var2] >> 8 & 0xFF);
            float var8 = (float) (class166.field2761[var2] & 0xFF);
            int var9 = class166.field2761[var2 + 1] >> 8 & 0xFF;
            int var10 = class166.field2761[var2 + 1] & 0xFF;
            float var11 = ((float) var9 - var7) / 64.0F;
            float var12 = ((float) var10 - var8) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class138.field2355[var2 * 64 + var13] = class94.method617(class94.method617((int) var5 << 16, (int) var7 << 8), (int) var8);
                var7 += var11;
                var5 += var6;
                var8 += var12;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class138.field2355[var3] = class166.field2761[3];
        }
        class123.field2059 = new int[32768];
        class274.field4819 = new int[32768];
        class84.method560((class14) null, (byte) 92);
        class189.field3246 = new int[32768];
        class10.field178 = new int[32768];
        class291.field5128 = new class195(128, 254);
    }
}
