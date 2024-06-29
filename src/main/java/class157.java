import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class157 extends class89 {

    @OriginalMember(owner = "client!lh", name = "W", descriptor = "I")
    private int field2762 = 4;

    @OriginalMember(owner = "client!lh", name = "T", descriptor = "I")
    private int field2759 = 4;

    @OriginalMember(owner = "client!lh", name = "Q", descriptor = "Lda;")
    private static class275 field2756 = class255.method1672(109, " has logged out)3");

    @OriginalMember(owner = "client!lh", name = "Y", descriptor = "Lda;")
    public static class275 field2764 = class255.method1672(116, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!lh", name = "R", descriptor = "Lda;")
    public static class275 field2757 = field2756;

    @OriginalMember(owner = "client!lh", name = "Z", descriptor = "Lda;")
    public static class275 field2765 = class255.method1672(99, "showVideoAd");

    @OriginalMember(owner = "client!lh", name = "U", descriptor = "[Z")
    public static boolean[] field2760 = new boolean[200];

    @OriginalMember(owner = "client!lh", name = "S", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!lh", name = "V", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!lh", name = "X", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!lh", name = "bb", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!lh", name = "db", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!lh", name = "ab", descriptor = "Lma;")
    public static class105 field2766;

    @OriginalMember(owner = "client!lh", name = "cb", descriptor = "[[[B")
    public static byte[][][] field2768;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field2762 = arg1.method564((byte) 60);
            }
        } else {
            this.field2759 = arg1.method564((byte) 55);
        }
        ++field2767;
        if (arg0 != -20503) {
            field2768 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class157() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        ++field2763;
        int[][] var3 = super.field1512.method824(arg1, (byte) -33);
        if (super.field1512.field2007) {
            int var4 = class16.field242 / this.field2762;
            int var5 = class65.field1070 / this.field2759;
            int[][] var6;
            if (~var4 >= -1) {
                var6 = this.method648(arg0, 0, 0);
            } else {
                int var7 = arg1 % var4;
                var6 = this.method648(arg0, 0, class16.field242 * var7 / var4);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class65.field1070; ++var14) {
                int var15;
                if (~var5 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var5;
                    var15 = class65.field1070 * var16 / var5;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        if (!arg0) {
            this.method49(56, (class85) null, 121);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "(I)V")
    public static void method1108(int arg0) {
        if (arg0 != 4) {
            field2758 = -14;
        }
        field2760 = null;
        field2768 = null;
        field2757 = null;
        field2756 = null;
        field2765 = null;
        field2766 = null;
        field2764 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        if (arg1) {
            field2757 = null;
        }
        ++field2761;
        int[] var3 = super.field1503.method229(arg0, (byte) -64);
        if (super.field1503.field664) {
            int var4 = class65.field1070 / this.field2759;
            int var5 = class16.field242 / this.field2762;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method645(74, 0, class16.field242 * var6 / var5);
            } else {
                var7 = this.method645(5, 0, 0);
            }
            for (int var8 = 0; var8 < class65.field1070; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class65.field1070 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }
}
