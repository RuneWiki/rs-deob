import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class172 extends class12 {

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
    private int field3254 = 4096;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
    private int field3255 = 4096;

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "I")
    private int field3265 = 4096;

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "Lbg;")
    public static class17 field3256 = new class17(5000);

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
    public static int field3262 = 3;

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
    public static int field3260 = 0;

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
    public static int field3266 = 0;

    @OriginalMember(owner = "client!sd", name = "eb", descriptor = "Ltg;")
    public static class184 field3270 = class135.method812("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1", 3);

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "Ltg;")
    private static class184 field3267 = class135.method812("Unexpected server response)3", 3);

    @OriginalMember(owner = "client!sd", name = "fb", descriptor = "Ltg;")
    private static class184 field3271 = class135.method812("flash1:", 3);

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "Ltg;")
    public static class184 field3263 = field3267;

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "Ltg;")
    public static class184 field3268 = field3271;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "Ltg;")
    public static class184 field3261 = field3271;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!sd", name = "db", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "[I")
    public static int[] field3259;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field3255 = arg0.method611(arg2);
                }
            } else {
                this.field3265 = arg0.method611(arg2);
            }
        } else {
            this.field3254 = arg0.method611(false);
        }
        if (arg2) {
            this.field3255 = 38;
        }
        ++field3258;
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)V")
    public static final void method1068(int arg0) {
        class123.field2240.method770(false);
        if (arg0 == 0) {
            ++field3269;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field3264;
        int[][] var3 = super.field232.method673(arg0, 83);
        int var4 = 14 % ((arg1 - -58) / 34);
        if (super.field232.field1962) {
            int[][] var5 = this.method76(arg0, 6218, 0);
            int[] var6 = var5[2];
            int[] var7 = var5[0];
            int[] var8 = var3[0];
            int[] var9 = var5[1];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; class201.field3889 > var12; ++var12) {
                int var13 = var9[var12];
                int var14 = var7[var12];
                int var15 = var6[var12];
                if (var14 == var15 && var13 == var15) {
                    var8[var12] = this.field3254 * var14 >> 12;
                    var10[var12] = this.field3265 * var15 >> 12;
                    var11[var12] = this.field3255 * var13 >> 12;
                } else {
                    var8[var12] = this.field3254;
                    var10[var12] = this.field3265;
                    var11[var12] = this.field3255;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class172() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)V")
    public static final void method1069(byte arg0) {
        ++field3257;
        class14.field275.method770(false);
        if (arg0 != -68) {
            field3268 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)V")
    public static void method1070(int arg0) {
        field3261 = null;
        field3268 = null;
        field3271 = null;
        field3256 = null;
        field3267 = null;
        field3270 = null;
        field3263 = null;
        field3259 = null;
        if (arg0 >= -13) {
            field3268 = null;
        }
    }
}
