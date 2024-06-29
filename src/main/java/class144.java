import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class144 extends class9 {

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2419 = " is already on your friend list.";

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "[I")
    public static int[] field2421 = new int[2];

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public static int field2423 = -1;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static volatile int field2420 = -1;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "[I")
    public static int[] field2417;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "[I")
    public static int[] field2418;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "[Lob;")
    public static class323[] field2424;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "[[[I")
    public static int[][][] field2427;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIB)Z", line = 4)
    public static final boolean method982(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2422++;
        for (int var6 = arg2; var6 < arg0; var6++) {
            for (int var7 = arg3; var7 < arg1; var7++) {
                if (class316.field5140[var6][var7] == arg4 && class31.field710[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        if (arg5 >= -92) {
            field2423 = -121;
        }
        return false;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V", line = 42)
    public static void method983(int arg0) {
        field2421 = null;
        field2424 = null;
        field2427 = (int[][][]) null;
        if (arg0 == 1158956368) {
            field2418 = null;
            field2419 = null;
            field2417 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIBIII)V", line = 76)
    public static final void method984(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field2425++;
        int var8 = arg5 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class182.field3155 - class47.field953) * var8 / 100 + class47.field953;
        int var10 = arg0 * var9 >> 8;
        int var11 = 2048 - arg3 & 0x7FF;
        int var12 = 2048 - arg7 & 0x7FF;
        int var13 = 0;
        int var14 = 0;
        if (arg4 != 29) {
            field2426 = 12;
        }
        int var15 = var10;
        if (var11 != 0) {
            int var16 = class305.field4959[var11];
            var14 = -var10 * var16 >> 16;
            int var17 = class305.field4957[var11];
            var15 = var10 * var17 >> 16;
        }
        if (var12 != 0) {
            int var18 = class305.field4957[var12];
            int var19 = class305.field4959[var12];
            var13 = var15 * var19 >> 16;
            var15 = var15 * var18 >> 16;
        }
        class141.field2380 = arg6 - var14;
        class298.field4847 = arg3;
        class16.field462 = arg2 - var15;
        class18.field500 = arg7;
        class223.field3693 = arg1 - var13;
    }
}
