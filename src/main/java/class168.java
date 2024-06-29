import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class168 {

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    private int field2812 = 0;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "Lpa;")
    private class140 field2810;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field2805 = 0;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "Leg;")
    public static class37 field2804 = class174.method1167("Cache:", 95);

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field2808 = -2;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "Leg;")
    public static class37 field2814 = class174.method1167("", -36);

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "Lbf;")
    public static class202 field2813 = new class202(64);

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "Leg;")
    public static class37 field2815 = class174.method1167("settings=", 101);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "Lei;")
    private class62 field2809;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IJ)V")
    public static final void method1125(int arg0, long arg1) {
        field2806++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class62.field1028; var3++) {
            if (class68.field1068[var3] == arg1) {
                class244.field4392++;
                class62.field1028--;
                for (int var4 = var3; var4 < class62.field1028; var4++) {
                    class68.field1068[var4] = class68.field1068[var4 + 1];
                    class244.field4399[var4] = class244.field4399[var4 + 1];
                }
                class218.field3750 = class221.field3804;
                class273.field4778.method1697(167, 123);
                class273.field4778.method1256(arg1, (byte) 84);
                break;
            }
        }
        if (arg0 < 9) {
            method1125(28, 41L);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static void method1126(int arg0) {
        field2804 = null;
        int var1 = 42 % ((56 - arg0) / 32);
        field2815 = null;
        field2814 = null;
        field2813 = null;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)Lei;")
    public final class62 method1127(int arg0) {
        field2811++;
        if (this.field2812 > 0 && this.field2810.field2403[this.field2812 - 1] != this.field2809) {
            class62 var2 = this.field2809;
            this.field2809 = var2.field1013;
            return var2;
        }
        int var3 = 92 % ((arg0 - 8) / 45);
        while (this.field2812 < this.field2810.field2410) {
            class62 var4 = this.field2810.field2403[this.field2812++].field1013;
            if (this.field2810.field2403[this.field2812 - 1] != var4) {
                this.field2809 = var4.field1013;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)Lei;")
    public final class62 method1128(byte arg0) {
        this.field2812 = 0;
        field2807++;
        if (arg0 != -12) {
            field2814 = null;
        }
        return this.method1127(arg0 ^ 0xFFFFFF8A);
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lpa;)V")
    public class168(class140 arg0) {
        this.field2810 = arg0;
    }
}
