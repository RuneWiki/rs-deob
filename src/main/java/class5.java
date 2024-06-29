import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class5 extends class34 {

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "Z")
    private boolean field59 = true;

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "I")
    private int field63 = 4096;

    @OriginalMember(owner = "client!lj", name = "R", descriptor = "[I")
    public static int[] field61 = new int[128];

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "Z")
    public static boolean field60 = false;

    @OriginalMember(owner = "client!lj", name = "S", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!lj", name = "W", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!lj", name = "ab", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!lj", name = "bb", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!lj", name = "Y", descriptor = "Lpk;")
    public static class237 field68;

    @OriginalMember(owner = "client!lj", name = "X", descriptor = "[I")
    public static int[] field67;

    @OriginalMember(owner = "client!lj", name = "Z", descriptor = "[I")
    public static int[] field69;

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
    public class5() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field59 = arg2.method407(255) == 1;
            }
        } else {
            this.field63 = arg2.method423(arg0 ^ -97);
        }
        ++field64;
        if (arg0 != 6) {
            method54(-93);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)Z")
    public static final boolean method51(int arg0, byte arg1) {
        ++field70;
        if (arg0 >= 0 && arg0 < class18.field322.length) {
            return arg1 < 76 ? true : class18.field322[arg0];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        int var3 = -92 % ((arg0 - -54) / 44);
        ++field66;
        int[][] var4 = super.field618.method91(58, arg1);
        if (super.field618.field211) {
            int[] var5 = this.method230(class201.field3014 & arg1 + -1, -15337, 0);
            int[] var6 = this.method230(arg1, -15337, 0);
            int[] var7 = this.method230(arg1 + 1 & class201.field3014, -15337, 0);
            int[] var8 = var4[1];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            for (int var11 = 0; ~class226.field3527 < ~var11; ++var11) {
                int var12 = (var7[var11] + -var5[var11]) * this.field63;
                int var13 = (var6[var11 + 1 & class167.field2457] + -var6[class167.field2457 & var11 - 1]) * this.field63;
                int var14 = var12 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var13 >> 12;
                int var17 = var16 * var16 >> 12;
                int var18 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + var17 + 4096) / 4096.0F)));
                int var19;
                int var20;
                int var21;
                if (~var18 != -1) {
                    var19 = var12 / var18;
                    var20 = 16777216 / var18;
                    var21 = var13 / var18;
                } else {
                    var19 = 0;
                    var20 = 0;
                    var21 = 0;
                }
                if (this.field59) {
                    var20 = 2048 - -(var20 >> 1);
                    var21 = (var21 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                }
                var9[var11] = var21;
                var8[var11] = var19;
                var10[var11] = var20;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(II)V")
    public static final void method53(int arg0, int arg1) {
        class66.field1087 = -1;
        class220.field3433 = arg1;
        ++field62;
        if (arg0 == 16571) {
            class244.field3784 = -1;
            class160.method1083(arg0 ^ 14206);
        }
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)V")
    public static void method54(int arg0) {
        if (arg0 == 0) {
            field67 = null;
            field69 = null;
            field68 = null;
            field61 = null;
        }
    }
}
