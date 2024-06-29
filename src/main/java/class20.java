import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class20 extends class288 {

    @OriginalMember(owner = "client!lh", name = "L", descriptor = "I")
    private int field235 = 32768;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!lh", name = "H", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "Ljj;")
    public static class134 field230;

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "[[I")
    public static int[][] field231;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        ++field229;
        int[] var3 = super.field4609.method579((byte) -62, arg1);
        if (super.field4609.field1059) {
            int[] var4 = this.method1931((byte) -123, 1, arg1);
            int[] var5 = this.method1931((byte) -124, 2, arg1);
            for (int var6 = 0; ~var6 > ~class186.field2986; ++var6) {
                int var7 = (var4[var6] & 4082) >> 4;
                int var8 = var5[var6] * this.field235 >> 12;
                int var9 = class272.field4388[var7] * var8 >> 12;
                int var10 = class34.field422 & (var9 >> 12) + var6;
                int var11 = class50.field709[var7] * var8 >> 12;
                int var12 = class144.field2332 & (var11 >> 12) + arg1;
                int[] var13 = this.method1931((byte) -117, 0, var12);
                var3[var6] = var13[var10];
            }
        }
        if (arg0 != 0) {
            this.field235 = 40;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class20() {
        super(3, false);
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)V")
    public static void method136(int arg0) {
        field230 = null;
        field231 = null;
        if (arg0 != 2959) {
            field230 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)[[I")
    public final int[][] method34(int arg0, int arg1) {
        if (arg0 != 1) {
            field231 = null;
        }
        ++field232;
        int[][] var3 = super.field4598.method812(arg1, 65535);
        if (super.field4598.field1954) {
            int[] var4 = this.method1931((byte) -127, 1, arg1);
            int[] var5 = this.method1931((byte) -117, 2, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~class186.field2986 < ~var9; ++var9) {
                int var10 = (var4[var9] * 255 & 1046690) >> 12;
                int var11 = var5[var9] * this.field235 >> 12;
                int var12 = class50.field709[var10] * var11 >> 12;
                int var13 = class144.field2332 & (var12 >> 12) + arg1;
                int var14 = class272.field4388[var10] * var11 >> 12;
                int var15 = class34.field422 & (var14 >> 12) + var9;
                int[][] var16 = this.method1930(0, var13, (byte) -122);
                var6[var9] = var16[0][var15];
                var7[var9] = var16[1][var15];
                var8[var9] = var16[2][var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public final void method16(byte arg0) {
        if (arg0 != -125) {
            field230 = null;
        }
        ++field228;
        class206.method1389(arg0 ^ -4221);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        ++field233;
        if (arg1 != -19) {
            field230 = null;
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field4612 = ~arg0.method1779(arg1 ^ 89) == -2;
            }
        } else {
            this.field235 = arg0.method1777(-91) << 4;
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(II)I")
    public static final int method137(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }
}
