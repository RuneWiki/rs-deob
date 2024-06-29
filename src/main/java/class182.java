import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class182 extends class417 {

    @OriginalMember(owner = "client!cda", name = "q", descriptor = "J")
    private long field2812 = -1L;

    @OriginalMember(owner = "client!cda", name = "t", descriptor = "Ljava/lang/String;")
    private String field2815 = null;

    @OriginalMember(owner = "client!cda", name = "o", descriptor = "I")
    public static int field2810 = 0;

    @OriginalMember(owner = "client!cda", name = "s", descriptor = "B")
    private byte field2814;

    @OriginalMember(owner = "client!cda", name = "m", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!cda", name = "p", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!cda", name = "r", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!cda", name = "u", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!cda", name = "v", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!cda", name = "w", descriptor = "I")
    private int field2818;

    @OriginalMember(owner = "client!cda", name = "x", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!cda", name = "n", descriptor = "Ljd;")
    public static class241 field2809;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1294(int arg0) {
        field2813++;
        class430 var1 = (class430) class772.field10602.method1731((byte) -127);
        if (arg0 != 12164) {
            method1294(58);
        }
        boolean var2 = class265.field3871 != null || class651.field9094 > 0;
        int var3 = var1.method992((byte) 64);
        int var4 = var1.method991(arg0 - 12157);
        if (var2) {
            class635.field8929 = 1;
        }
        if (var2) {
            class713.field9890 = class694.field9692;
        } else {
            class625.method3596(1, var3, var4, class694.field9692);
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lso;I)V", line = 33)
    public final void method610(class494 arg0, int arg1) {
        if (arg0.method2964((byte) 105) != 255) {
            arg0.field7042--;
            this.field2812 = arg0.method3005(-81);
        }
        field2816++;
        this.field2815 = arg0.method2984((byte) -92);
        if (arg1 > -121) {
            method1296(62);
        }
        this.field2818 = arg0.method2998(true);
        this.field2814 = arg0.method2943((byte) 16);
        arg0.method3005(-55);
        if (class634.field8905) {
            System.out.println("memberhash:" + this.field2812 + " membername:" + this.field2815);
        }
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)V", line = 60)
    public static final void method1295(int arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class147.field2133[var1] = null;
        }
        field2811++;
        class234.field3528 = 0;
        int var2 = 36 / ((-arg0 - 39) / 63);
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lhs;Z)V", line = 85)
    public final void method611(class344 arg0, boolean arg1) {
        field2808++;
        class310 var3 = new class310();
        var3.field4427 = this.field2814;
        if (arg1) {
            var3.field4424 = this.field2818;
            var3.field4428 = this.field2815;
            arg0.method2180(var3, 5);
        }
    }

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "(I)V", line = 119)
    public static void method1296(int arg0) {
        field2809 = null;
        if (arg0 != 255) {
            field2817 = 114;
        }
    }
}
