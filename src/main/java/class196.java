import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class196 extends class175 {

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
    private int field3257 = 585;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "S")
    public static short field3248 = 1;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    public static int field3249 = 127;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "[Z")
    public static boolean[] field3251 = new boolean[200];

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    public static int field3254 = 0;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "[I")
    public static int[] field3255 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "[[[B")
    public static byte[][][] field3250;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        if (~arg1 == -1) {
            this.field3257 = arg2.method1441(79);
        }
        if (!arg0) {
            field3251 = null;
        }
        ++field3258;
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)V")
    public static void method1320(int arg0) {
        field3255 = null;
        field3250 = null;
        if (arg0 <= 126) {
            method1320(-37);
        }
        field3251 = null;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class196() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        ++field3253;
        int[] var3 = super.field2941.method1427(-21281, arg0);
        if (arg1 != -27746) {
            this.method29(72, -124);
        }
        if (super.field2941.field3565) {
            int var4 = class29.field616[arg0];
            for (int var5 = 0; class211.field3514 > var5; ++var5) {
                int var6 = class129.field2272[var5];
                if (var6 > this.field3257 && ~(-this.field3257 + 4096) < ~var6 && -this.field3257 + 2048 < var4 && ~(this.field3257 + 2048) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field3257 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~(2048 - this.field3257) > ~var6 && this.field3257 + 2048 > var6) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field3257;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field3257 + 2048);
                } else if (this.field3257 <= var4 && ~(-this.field3257 + 4096) <= ~var4) {
                    if (~var6 <= ~this.field3257 && ~(4096 - this.field3257) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field3257 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field3257;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field3257);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ln;I)V")
    public static final void method1321(class138 arg0, int arg1) {
        class180 var2 = null;
        ++field3252;
        try {
            class9 var3 = arg0.method965("runescape", arg1);
            while (var3.field133 == 0) {
                class162.method1137(-88, 1L);
            }
            if (~var3.field133 == -2) {
                var2 = (class180) var3.field132;
                class217 var4 = class221.method1515(1);
                var2.method1226(0, true, var4.field3633, var4.field3581);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method1227(-118);
            }
        } catch (Exception var5) {
        }
    }
}
