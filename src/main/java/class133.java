import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class133 extends class135 {

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "Lqj;")
    public static class196 field1896 = class80.method502(" )2>", -48);

    @OriginalMember(owner = "client!sa", name = "cb", descriptor = "I")
    public static int field1900 = 0;

    @OriginalMember(owner = "client!sa", name = "ab", descriptor = "Z")
    public static boolean field1898 = true;

    @OriginalMember(owner = "client!sa", name = "db", descriptor = "I")
    public static int field1901 = 0;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "Lqj;")
    public static class196 field1894 = class80.method502("null", -48);

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!sa", name = "bb", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!sa", name = "eb", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!sa", name = "fb", descriptor = "Lbk;")
    public static class136 field1903;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(B)V")
    public static void method804(byte arg0) {
        field1896 = null;
        if (arg0 != 15) {
            method804((byte) 40);
        }
        field1903 = null;
        field1894 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        ++field1895;
        if (arg1 == 0) {
            super.field1962 = arg0.method367(1) == 1;
        }
        if (arg2 != -16231) {
            field1898 = true;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        if (arg1) {
            this.method164(11, -107);
        }
        ++field1897;
        int[] var3 = super.field1954.method110(arg0, -128);
        if (super.field1954.field244) {
            int[] var4 = this.method819(-83, 0, arg0);
            int[] var5 = this.method819(-84, 1, arg0);
            int[] var6 = this.method819(-126, 2, arg0);
            for (int var7 = 0; class131.field1862 > var7; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 != 0) {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)[[I")
    public final int[][] method164(int arg0, int arg1) {
        ++field1902;
        int[][] var3 = super.field1947.method511(arg1, -1);
        if (arg0 != 260028743) {
            this.method97((class56) null, 17, -81);
        }
        if (super.field1947.field1180) {
            int[] var4 = this.method819(-112, 2, arg1);
            int[][] var5 = this.method818(2, arg1, 0);
            int[][] var6 = this.method818(2, arg1, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var5[0];
            int[] var10 = var5[1];
            int[] var11 = var3[2];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; class131.field1862 > var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var9[var16];
                    var8[var16] = var10[var16];
                    var11[var16] = var12[var16];
                } else if (var17 != 0) {
                    int var18 = -var17 + 4096;
                    var7[var16] = var9[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var10[var16] * var17 + var14[var16] * var18 >> 12;
                    var11[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                } else {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var11[var16] = var15[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class133() {
        super(3, false);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIII)I")
    public static final int method805(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1893;
        int var5 = -class15.field172[arg3 * arg4 / arg2] + 65536 >> 1;
        return ((-var5 + 65536) * arg0 >> 16) + (arg1 * var5 >> 16);
    }
}
