import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class50 extends class27 {

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
    private int field803 = 32768;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "[[B")
    public static byte[][] field795 = new byte[50][];

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "Lkb;")
    public static class93 field804 = class76.method390("rect_debug=", 0);

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        ++field799;
        int[] var3 = super.field447.method1238(arg1, arg0);
        if (super.field447.field3737) {
            int[] var4 = this.method145(1, (byte) 119, arg0);
            int[] var5 = this.method145(2, (byte) 127, arg0);
            for (int var6 = 0; var6 < class159.field3209; ++var6) {
                int var7 = var5[var6] * this.field803 >> 12;
                int var8 = var4[var6] >> 4 & 255;
                int var9 = class27.field440[var8] * var7 >> 12;
                int var10 = class78.field1402 & (var9 >> 12) + var6;
                int var11 = class130.field2464[var8] * var7 >> 12;
                int var12 = arg0 - -(var11 >> 12) & class190.field3715;
                int[] var13 = this.method145(0, (byte) 120, var12);
                var3[var6] = var13[var10];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)[[I")
    public final int[][] method19(int arg0, int arg1) {
        ++field797;
        int[][] var3 = super.field436.method537(0, arg1);
        if (super.field436.field1771) {
            int[] var4 = this.method145(1, (byte) 121, arg1);
            int[] var5 = this.method145(2, (byte) 122, arg1);
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            for (int var9 = 0; ~class159.field3209 < ~var9; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field803 >> 12;
                int var12 = class130.field2464[var10] * var11 >> 12;
                int var13 = arg1 - -(var12 >> 12) & class190.field3715;
                int var14 = class27.field440[var10] * var11 >> 12;
                int var15 = class78.field1402 & (var14 >> 12) + var9;
                int[][] var16 = this.method152(var13, 0, 105);
                var7[var9] = var16[0][var15];
                var8[var9] = var16[1][var15];
                var6[var9] = var16[2][var15];
            }
        }
        int var17 = 120 / ((42 - arg0) / 54);
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V")
    public static final void method264(int arg0) {
        ++field801;
        class43.field701.method676(30626);
        if (arg0 != 960816300) {
            method265(96);
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)V")
    public final void method154(byte arg0) {
        ++field805;
        class6.method35(true);
        if (arg0 <= 77) {
            method265(56);
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
    public class50() {
        super(3, false);
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)V")
    public static void method265(int arg0) {
        field804 = null;
        if (arg0 > -46) {
            method265(7);
        }
        field795 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        if (arg0 < 106) {
            field804 = null;
        }
        if (arg1 != 0) {
            if (~arg1 == -2) {
                super.field435 = ~arg2.method1054(128) == -2;
            }
        } else {
            this.field803 = arg2.method1071(28101) << 4;
        }
        ++field806;
    }
}
