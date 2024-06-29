import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class277 extends class56 {

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
    private int field3242 = 4096;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
    private int field3244 = 4096;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
    private int field3246 = 4096;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "Z")
    public static boolean field3247 = false;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "Lifa;")
    public static class450 field3245 = new class450();

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "Lbt;")
    public static class48 field3243;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BILes;)V")
    public final void method144(byte arg0, int arg1, class403 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field3244 = arg2.method2390((byte) -99);
                }
            } else {
                this.field3246 = arg2.method2390((byte) 10);
            }
        } else {
            this.field3242 = arg2.method2390((byte) 81);
        }
        if (arg0 > -44) {
            field3245 = null;
        }
        ++field3241;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class277() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)V")
    public static void method1612(byte arg0) {
        if (arg0 != 34) {
            field3247 = false;
        }
        field3243 = null;
        field3245 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)[[I")
    public final int[][] method187(byte arg0, int arg1) {
        ++field3248;
        int[][] var3 = super.field759.method220(arg1, (byte) -91);
        if (arg0 <= 35) {
            this.method144((byte) -34, 59, (class403) null);
        }
        if (super.field759.field341) {
            int[][] var4 = this.method495(86, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class642.field8759; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var8[var11] = this.field3242 * var12 >> 12;
                    var9[var11] = this.field3246 * var13 >> 12;
                    var10[var11] = this.field3244 * var14 >> 12;
                } else {
                    var8[var11] = this.field3242;
                    var9[var11] = this.field3246;
                    var10[var11] = this.field3244;
                }
            }
        }
        return var3;
    }
}
