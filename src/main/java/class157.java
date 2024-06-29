import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class157 extends class148 {

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    private int field2289 = 4096;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    private int field2292 = 4096;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    private int field2294 = 4096;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "[I")
    public static int[] field2288 = new int[50];

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field2291 = 0;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "Llt;")
    public static class475 field2295 = new class475("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "Lic;")
    public static class491 field2296;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
    public static void method1001(boolean arg0) {
        field2295 = null;
        if (arg0) {
            field2296 = null;
            field2288 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method27(boolean arg0, int arg1) {
        ++field2293;
        int[][] var3 = super.field2189.method2422(-2, arg1);
        if (super.field2189.field6033) {
            int[][] var4 = this.method974(true, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class320.field4579 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && var13 == var14) {
                    var8[var11] = this.field2289 * var12 >> 12;
                    var9[var11] = this.field2292 * var13 >> 12;
                    var10[var11] = this.field2294 * var14 >> 12;
                } else {
                    var8[var11] = this.field2289;
                    var9[var11] = this.field2292;
                    var10[var11] = this.field2294;
                }
            }
        }
        if (!arg0) {
            this.field2294 = 96;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILdh;I)V")
    public final void method23(int arg0, class209 arg1, int arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field2294 = arg1.method1450((byte) 54);
                }
            } else {
                this.field2292 = arg1.method1450((byte) 127);
            }
        } else {
            this.field2289 = arg1.method1450((byte) 112);
        }
        int var5 = 6 % ((arg2 - -88) / 33);
        ++field2290;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class157() {
        super(1, false);
    }
}
