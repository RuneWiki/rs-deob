import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class157 extends class219 {

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "Lk;")
    public static class47 field2761 = new class47(5000);

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
    public static int field2766 = 0;

    @OriginalMember(owner = "client!hh", name = "S", descriptor = "Lbd;")
    private static class162 field2768 = class17.method142(0, "Connecting to update server");

    @OriginalMember(owner = "client!hh", name = "V", descriptor = "[[S")
    public static short[][] field2771 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!hh", name = "X", descriptor = "Lbd;")
    public static class162 field2773 = field2768;

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "Lbd;")
    private static class162 field2767 = class17.method142(0, "glow1:");

    @OriginalMember(owner = "client!hh", name = "Z", descriptor = "[I")
    public static int[] field2775 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!hh", name = "T", descriptor = "Lbd;")
    public static class162 field2769 = class17.method142(0, "::fps ");

    @OriginalMember(owner = "client!hh", name = "Y", descriptor = "Lbd;")
    public static class162 field2774 = field2767;

    @OriginalMember(owner = "client!hh", name = "W", descriptor = "Lbd;")
    public static class162 field2772 = field2767;

    @OriginalMember(owner = "client!hh", name = "ab", descriptor = "Lbd;")
    public static class162 field2776 = class17.method142(0, "sch-Utteln:");

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!hh", name = "U", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "Lda;")
    public static class143 field2764;

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "Lmg;")
    public static class173 field2762;

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "[I")
    public static int[] field2763;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)[I", line = 6)
    public final int[] method41(boolean arg0, int arg1) {
        int[] var3 = this.field3654.method2032(3, arg1);
        if (this.field3654.field4967) {
            class161.method1230(var3, 0, class128.field2326, class53.field842[arg1]);
        }
        if (!arg0) {
            method1221(40L, 84);
        }
        field2760++;
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V", line = 26)
    public class157() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(B)V", line = 41)
    public static void method1220(byte arg0) {
        field2775 = null;
        field2773 = null;
        field2762 = null;
        field2776 = null;
        field2767 = null;
        field2772 = null;
        field2763 = null;
        field2769 = null;
        field2774 = null;
        field2771 = (short[][]) null;
        field2761 = null;
        field2768 = null;
        field2764 = null;
        if (arg0 != -89) {
            field2771 = (short[][]) ((short[][]) null);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(JI)V", line = 70)
    public static final void method1221(long arg0, int arg1) {
        field2759++;
        if (arg0 == 0L) {
            return;
        }
        if (class135.field2417 >= 100) {
            class82.method633(0, class255.field4224, class244.field4053, -70);
            return;
        }
        class162 var3 = class317.method2178(arg0, (byte) -102).method1265((byte) 46);
        for (int var4 = 0; var4 < class135.field2417; var4++) {
            if (class112.field2026[var4] == arg0) {
                class82.method633(0, class135.method1062(new class162[] { var3, class10.field116 }, true), class244.field4053, -84);
                return;
            }
        }
        for (int var5 = 0; var5 < class264.field4403; var5++) {
            if (class200.field3405[var5] == arg0) {
                class82.method633(0, class135.method1062(new class162[] { class307.field5169, var3, class81.field1414 }, true), class244.field4053, arg1 ^ 0xB9);
                return;
            }
        }
        if (var3.method1248(class122.field2215.field611, (byte) 116)) {
            class82.method633(0, class82.field1423, class244.field4053, arg1 ^ 0xFFFFFF1A);
            return;
        }
        class185.field3191++;
        class112.field2026[class135.field2417] = arg0;
        class9.field108[class135.field2417++] = class317.method2178(arg0, (byte) 89);
        if (arg1 == 200) {
            class149.field2681 = class284.field4808;
            class187.field3229.method338(95, (byte) 8);
            class187.field3229.method745(arg0, (byte) -124);
        }
    }
}
