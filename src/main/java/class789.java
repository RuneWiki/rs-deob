import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class789 extends class56 {

    @OriginalMember(owner = "client!rw", name = "H", descriptor = "[I")
    public static int[] field10868 = new int[16384];

    @OriginalMember(owner = "client!rw", name = "D", descriptor = "[I")
    public static int[] field10864 = new int[16384];

    @OriginalMember(owner = "client!rw", name = "I", descriptor = "[I")
    public static int[] field10869;

    @OriginalMember(owner = "client!rw", name = "E", descriptor = "I")
    public static int field10865;

    @OriginalMember(owner = "client!rw", name = "F", descriptor = "I")
    public static int field10866;

    @OriginalMember(owner = "client!rw", name = "G", descriptor = "I")
    public static int field10867;

    @OriginalMember(owner = "client!rw", name = "J", descriptor = "I")
    public static int field10870;

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "()V")
    public class789() {
        super(3, false);
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(BILes;)V")
    public final void method144(byte arg0, int arg1, class403 arg2) {
        if (arg0 > -44) {
            field10868 = null;
        }
        if (arg1 == 0) {
            super.field762 = ~arg2.method2396((byte) 11) == -2;
        }
        ++field10865;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)[I")
    public final int[] method145(int arg0, int arg1) {
        ++field10867;
        int[] var3 = super.field752.method1308(false, arg1);
        if (super.field752.field2441) {
            int[] var4 = this.method492(0, arg1, (byte) 116);
            int[] var5 = this.method492(1, arg1, (byte) 101);
            int[] var6 = this.method492(2, arg1, (byte) 54);
            for (int var7 = 0; class642.field8759 > var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (~var8 == -1) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        if (arg0 != 0) {
            field10864 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(BI)[[I")
    public final int[][] method187(byte arg0, int arg1) {
        ++field10866;
        if (arg0 <= 35) {
            method4360(true);
        }
        int[][] var3 = super.field759.method220(arg1, (byte) -91);
        if (super.field759.field341) {
            int[] var4 = this.method492(2, arg1, (byte) 72);
            int[][] var5 = this.method495(-63, arg1, 0);
            int[][] var6 = this.method495(-89, arg1, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class642.field8759 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (~var17 != -1) {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                } else {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "(Z)V")
    public static void method4360(boolean arg0) {
        field10869 = null;
        field10864 = null;
        field10868 = null;
        if (arg0) {
            field10870 = -57;
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; ++var2) {
            field10868[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field10864[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
        field10869 = new int[2];
    }
}
