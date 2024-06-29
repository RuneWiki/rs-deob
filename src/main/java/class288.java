import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class288 {

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public int field4792;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "[I")
    public int[] field4795;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "[Lli;")
    public class314[] field4796;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4791 = "Take";

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "[I")
    public static int[] field4789 = new int[1000];

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public static final void method2021(byte arg0) {
        int var1 = 59 / ((21 - arg0) / 53);
        field4790++;
        class42.field550 = new class130(32);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)I")
    public static final int method2022(int arg0, int arg1, int arg2) {
        int var3 = arg2 * 57 + arg1;
        if (arg0 > -36) {
            field4789 = null;
        }
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        field4794++;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static final void method2023(int arg0) {
        if (arg0 != 789221) {
            return;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class99.field1483[var1] = false;
        }
        field4793++;
        class163.field2566 = 0;
        class286.field4767 = 0;
        class117.field1778 = -1;
        class92.field1402 = 5;
        class310.field5018 = -1;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
    public static void method2024(byte arg0) {
        if (arg0 == -54) {
            field4789 = null;
            field4791 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(I)V")
    public class288(int arg0) {
        this.field4792 = arg0;
        this.field4795 = new int[this.field4792];
        this.field4796 = new class314[this.field4792];
    }
}
