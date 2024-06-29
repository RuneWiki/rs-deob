import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class151 {

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "J")
    public static long field2709 = 0L;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2706 = 0;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Ltg;")
    private static class184 field2704 = class135.method812("This world is full)3", 3);

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Ltg;")
    public static class184 field2713 = field2704;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public static int field2717 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "Ltg;")
    public static class184 field2714 = class135.method812("<)4col>", 3);

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public static int field2719 = 50;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "[I")
    public static int[] field2707 = new int[field2719];

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "[I")
    public static int[] field2708 = new int[field2719];

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "[I")
    public static int[] field2703 = new int[field2719];

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "[I")
    public static int[] field2712 = new int[field2719];

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "[Ltg;")
    public static class184[] field2711 = new class184[field2719];

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "[I")
    public static int[] field2710 = new int[field2719];

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "[I")
    public static int[] field2715 = new int[field2719];

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "[I")
    public static int[] field2723 = new int[field2719];

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZJ)V")
    public static final void method924(boolean arg0, long arg1) {
        field2716++;
        if (arg1 == 0L) {
            return;
        }
        if (class9.field170 >= 100) {
            class149.method914(0, class189.field3675, class170.field3242, -55);
            return;
        }
        class184 var3 = class119.method719(arg1, 37).method1147(true);
        for (int var4 = 0; var4 < class9.field170; var4++) {
            if (class103.field1878[var4] == arg1) {
                class149.method914(0, class144.method884(0, new class184[] { var3, class131.field2384 }), class170.field3242, 74);
                return;
            }
        }
        for (int var5 = 0; var5 < class64.field1212; var5++) {
            if (class136.field2481[var5] == arg1) {
                class149.method914(0, class144.method884(0, new class184[] { class204.field3923, var3, class128.field2323 }), class170.field3242, -58);
                return;
            }
        }
        if (var3.method1139(class46.field872.field1299, (byte) 94)) {
            class149.method914(0, class202.field3905, class170.field3242, 100);
            return;
        }
        class103.field1878[class9.field170] = arg1;
        class118.field2129[class9.field170++] = class119.method719(arg1, 37);
        class197.field3848++;
        class158.field2825 = class136.field2471;
        class117.field2122.method106(0, -125);
        class117.field2122.method607(arg1, 84);
        if (arg0) {
            field2715 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public static void method925(int arg0) {
        field2708 = null;
        field2715 = null;
        field2704 = null;
        field2703 = null;
        field2710 = null;
        if (arg0 > -87) {
            return;
        }
        field2712 = null;
        field2713 = null;
        field2723 = null;
        field2714 = null;
        field2707 = null;
        field2711 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BJ)V")
    public static final void method926(byte arg0, long arg1) {
        field2721++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class182.method1126(arg0 ^ 0x65, arg1 - 1L);
            class182.method1126(0, 1L);
        } else {
            class182.method1126(arg0 - 101, arg1);
        }
        if (arg0 != 101) {
            method925(-79);
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public static final void method927(int arg0) {
        class143.field2578 = arg0;
        for (int var1 = 0; var1 < class8.field145; var1++) {
            for (int var2 = 0; var2 < class159.field2853; var2++) {
                if (class190.field3704[arg0][var1][var2] == null) {
                    class190.field3704[arg0][var1][var2] = new class90(arg0, var1, var2);
                }
            }
        }
    }
}
