import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class101 extends class32 {

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    public int field2444 = -1;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    public int field2464 = 0;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "[I")
    public static int[] field2449 = new int[5];

    @OriginalMember(owner = "client!od", name = "D", descriptor = "Lv;")
    public static class146 field2451 = class159.method1226((byte) -37, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!od", name = "H", descriptor = "Z")
    public static boolean field2454 = false;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "Lv;")
    public static class146 field2461 = class159.method1226((byte) -37, "Bitte geben Sie Ihren Benutzenamen ein)3");

    @OriginalMember(owner = "client!od", name = "K", descriptor = "Lv;")
    public static class146 field2457 = class159.method1226((byte) -37, "::clientdrop");

    @OriginalMember(owner = "client!od", name = "N", descriptor = "Lv;")
    public static class146 field2460 = class159.method1226((byte) -37, "::qa_op_test");

    @OriginalMember(owner = "client!od", name = "U", descriptor = "Lv;")
    private static class146 field2467 = class159.method1226((byte) -37, "Loaded fonts");

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    public static int field2459 = 0;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "Lv;")
    public static class146 field2445 = field2467;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field2448 = 0;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public int field2441;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public int field2443;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public int field2446;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    public int field2447;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    public int field2453;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public int field2456;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "I")
    public int field2458;

    @OriginalMember(owner = "client!od", name = "P", descriptor = "I")
    public int field2462;

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
    public int field2463;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!od", name = "T", descriptor = "I")
    public int field2466;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "Lue;")
    public static class144 field2455;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
    public static final void method837(int arg0, int arg1) {
        if (arg0 != 32003) {
            field2467 = null;
        }
        field2440++;
        if (class54.method365(29657, arg1)) {
            class5.method43(-1, class34.field736[arg1], (byte) -109);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII[BIII[Lna;Z)V")
    public static final void method838(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, class91[] arg8, boolean arg9) {
        int var10 = 0;
        if (arg9) {
            field2461 = null;
        }
        while (var10 < 8) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg7 + var10 > 0 && arg7 + var10 < 103 && arg0 + var15 > 0 && arg0 + var15 < 103) {
                    arg8[arg3].field2185[arg7 + var10][arg0 + var15] = class90.method711(arg8[arg3].field2185[arg7 + var10][arg0 + var15], -16777217);
                }
            }
            var10++;
        }
        field2465++;
        class95 var11 = new class95(arg4);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg6 == var12 && var13 >= arg2 && arg2 + 8 > var13 && arg5 <= var14 && arg5 + 8 > var14) {
                        class155.method1159(var11, 0, arg1, class132.method980(arg1, var14 & 0x7, -11375, var13 & 0x7) + arg0, arg3, 0, 97, arg7 + class118.method901(var14 & 0x7, -81, var13 & 0x7, arg1));
                    } else {
                        class155.method1159(var11, 0, 0, -1, 0, 0, -64, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V")
    public static void method839(int arg0) {
        field2460 = null;
        field2449 = null;
        field2461 = null;
        field2451 = null;
        if (arg0 == 64) {
            field2445 = null;
            field2467 = null;
            field2455 = null;
            field2457 = null;
        }
    }
}
