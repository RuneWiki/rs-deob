import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class135 extends class326 {

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
    private int field1967 = 585;

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "Z")
    public static boolean field1970 = false;

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "[Lbp;")
    public static class239[] field1972 = new class239[16];

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "Lgd;")
    public static class206 field1964 = new class206("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "[I")
    public static int[] field1974 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "Lng;")
    public static class208 field1973;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)[I", line = 3)
    public final int[] method30(byte arg0, int arg1) {
        ++field1969;
        int[] var3 = super.field4344.method130(arg1, -102);
        if (arg0 >= -6) {
            this.field1967 = 18;
        }
        if (super.field4344.field286) {
            int var4 = class95.field1400[arg1];
            for (int var5 = 0; ~var5 > ~class181.field2495; ++var5) {
                int var6 = class389.field5375[var5];
                if (~var6 < ~this.field1967 && ~(-this.field1967 + 4096) < ~var6 && 2048 - this.field1967 < var4 && ~var4 > ~(this.field1967 + 2048)) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field1967);
                    var3[var5] = -var10 + 4096;
                } else if (~var6 < ~(2048 - this.field1967) && ~(2048 - -this.field1967) < ~var6) {
                    int var11 = var4 - 2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field1967;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field1967 + 2048);
                } else if (~this.field1967 >= ~var4 && var4 <= 4096 - this.field1967) {
                    if (this.field1967 <= var6 && ~(4096 - this.field1967) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field1967 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field1967;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field1967 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILbt;I)V", line = 86)
    public final void method33(int arg0, class32 arg1, int arg2) {
        if (~arg0 == -1) {
            this.field1967 = arg1.method215((byte) 114);
        }
        ++field1965;
        if (arg2 > -3) {
            this.method30((byte) 38, 89);
        }
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V", line = 115)
    public static void method820(int arg0) {
        int var1 = 46 / ((arg0 - 15) / 47);
        field1974 = null;
        field1964 = null;
        field1973 = null;
        field1972 = null;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V", line = 133)
    public class135() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 137)
    public static final int method821(String arg0, int arg1) {
        ++field1968;
        int var2 = arg0.length();
        int var3 = arg1;
        for (int var4 = 0; ~var4 > ~var2; ++var4) {
            var3 = class332.method1905(arg0.charAt(var4), arg1 ^ 18658) + (var3 << 5) + -var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V", line = 157)
    public static final void method822(int arg0, int arg1) {
        if (arg0 == 4096) {
            ++field1971;
            class106 var2 = class250.method1400(6, 110, arg1);
            var2.method659(97);
        }
    }
}
