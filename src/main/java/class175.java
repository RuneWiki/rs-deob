import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class175 extends class170 {

    @OriginalMember(owner = "client!di", name = "eb", descriptor = "I")
    private int field3167 = 4096;

    @OriginalMember(owner = "client!di", name = "gb", descriptor = "I")
    private int field3169 = 4096;

    @OriginalMember(owner = "client!di", name = "ib", descriptor = "I")
    private int field3171 = 4096;

    @OriginalMember(owner = "client!di", name = "Y", descriptor = "Lqk;")
    public static class207 field3161 = class24.method212(255, "hitmarks");

    @OriginalMember(owner = "client!di", name = "db", descriptor = "I")
    public static int field3166 = -1;

    @OriginalMember(owner = "client!di", name = "cb", descriptor = "Lqk;")
    public static class207 field3165 = class24.method212(255, "leuchten3:");

    @OriginalMember(owner = "client!di", name = "bb", descriptor = "Lqk;")
    public static class207 field3164 = class24.method212(255, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!di", name = "hb", descriptor = "Lqk;")
    private static class207 field3170 = class24.method212(255, "Discard");

    @OriginalMember(owner = "client!di", name = "ab", descriptor = "Lqk;")
    public static class207 field3163 = field3170;

    @OriginalMember(owner = "client!di", name = "fb", descriptor = "Ldk;")
    public static class275 field3168 = new class275(16);

    @OriginalMember(owner = "client!di", name = "kb", descriptor = "Lqk;")
    private static class207 field3173 = class24.method212(255, "Loading title screen )2 ");

    @OriginalMember(owner = "client!di", name = "mb", descriptor = "Lqk;")
    public static class207 field3175 = field3173;

    @OriginalMember(owner = "client!di", name = "W", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!di", name = "X", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!di", name = "Z", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!di", name = "jb", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!di", name = "lb", descriptor = "[[I")
    public static int[][] field3174;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method32(int arg0, boolean arg1) {
        ++field3159;
        if (arg1) {
            field3165 = null;
        }
        int[][] var3 = super.field3002.method427(arg0, 239);
        if (super.field3002.field1077) {
            int[][] var4 = this.method1223(0, 101, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[2];
            int[] var8 = var4[1];
            int[] var9 = var3[1];
            int[] var10 = var3[0];
            for (int var11 = 0; ~class88.field1595 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var8[var11];
                int var14 = var6[var11];
                if (var12 == var14 && ~var13 == ~var14) {
                    var10[var11] = this.field3171 * var12 >> 12;
                    var9[var11] = this.field3169 * var14 >> 12;
                    var7[var11] = this.field3167 * var13 >> 12;
                } else {
                    var10[var11] = this.field3171;
                    var9[var11] = this.field3169;
                    var7[var11] = this.field3167;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)V")
    public static final void method1255(int arg0, int arg1) {
        ++field3162;
        class90 var2 = class221.method1575(7, arg1, 1651481952);
        if (arg0 != 3008) {
            field3166 = 125;
        }
        var2.method651(-27655);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        ++field3160;
        if (arg1 == 5877) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        this.field3167 = arg0.method1050(1272006568);
                    }
                } else {
                    this.field3169 = arg0.method1050(1272006568);
                }
            } else {
                this.field3171 = arg0.method1050(1272006568);
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(B)V")
    public static void method1256(byte arg0) {
        if (arg0 > -14) {
            field3175 = null;
        }
        field3175 = null;
        field3174 = null;
        field3170 = null;
        field3168 = null;
        field3173 = null;
        field3165 = null;
        field3164 = null;
        field3163 = null;
        field3161 = null;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(B)V")
    public static final void method1257(byte arg0) {
        ++field3172;
        class56.field1043 = 0;
        int var1 = (class202.field3565.field5104 >> 7) - -class21.field349;
        int var2 = (class202.field3565.field5072 >> 7) + class180.field3231;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class56.field1043 = 1;
        }
        if (arg0 >= -62) {
            field3173 = null;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class56.field1043 = 1;
        }
        if (~class56.field1043 == -2 && var1 >= 3139 && ~var1 >= -3200 && var2 >= 3008 && var2 <= 3062) {
            class56.field1043 = 0;
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
    public class175() {
        super(1, false);
    }
}
