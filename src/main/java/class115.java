import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class115 extends class73 {

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
    public int field2811;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    private int field2803;

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "[[I")
    public int[][] field2809;

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "[I")
    public int[] field2806;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "Lrd;")
    public static class117 field2807 = class95.method812("Die Adresse dieses Computers wurde gesperrt)1", (byte) 8);

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "Lrd;")
    private static class117 field2813 = class95.method812("and choose the (Wcreate account(W", (byte) 8);

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "[I")
    public static int[] field2818 = new int[50];

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "Lrd;")
    private static class117 field2819 = class95.method812("Unable to connect)3", (byte) 8);

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "Lrd;")
    public static class117 field2805 = field2813;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "Lrd;")
    public static class117 field2816 = field2819;

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "Lrd;")
    private static class117 field2808 = class95.method812("Please contact customer support)3", (byte) 8);

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "Lrd;")
    public static class117 field2815 = class95.method812("RuneScape wurde aktualisiert(Q", (byte) 8);

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "Z")
    public static boolean field2812 = false;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
    public static int field2814 = -1;

    @OriginalMember(owner = "client!rb", name = "bb", descriptor = "Lrd;")
    public static class117 field2822 = class95.method812("(X100(U(Y", (byte) 8);

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "Z")
    public static boolean field2821 = false;

    @OriginalMember(owner = "client!rb", name = "cb", descriptor = "Lrd;")
    public static class117 field2823 = field2819;

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "Lrd;")
    public static class117 field2820 = field2808;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "Lga;")
    public static class44 field2804;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(Z)V")
    public static void method931(boolean arg0) {
        field2815 = null;
        field2807 = null;
        field2820 = null;
        field2805 = null;
        field2813 = null;
        field2819 = null;
        field2804 = null;
        field2816 = null;
        if (arg0) {
            method931(false);
        }
        field2823 = null;
        field2808 = null;
        field2818 = null;
        field2822 = null;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(I[B)V")
    public class115(int arg0, byte[] arg1) {
        this.field2811 = arg0;
        class14 var3 = new class14(arg1);
        this.field2803 = var3.method153(true);
        this.field2809 = new int[this.field2803][];
        this.field2806 = new int[this.field2803];
        for (int var4 = 0; var4 < this.field2803; var4++) {
            this.field2806[var4] = var3.method153(true);
        }
        for (int var5 = 0; var5 < this.field2803; var5++) {
            this.field2809[var5] = new int[var3.method153(true)];
        }
        for (int var6 = 0; var6 < this.field2803; var6++) {
            for (int var7 = 0; var7 < this.field2809[var6].length; var7++) {
                this.field2809[var6][var7] = var3.method153(true);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZBZ)I")
    public static final int method932(boolean arg0, byte arg1, boolean arg2) {
        field2817++;
        int var3 = 0;
        int var4 = 52 % ((-arg1 - 1) / 50);
        if (arg0) {
            var3 += class86.field2243 + class116.field2837;
        }
        if (arg2) {
            var3 += class116.field2834 + class132.field3173;
        }
        return var3;
    }
}
