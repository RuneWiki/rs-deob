import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class84 extends class27 {

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
    private int field1538 = 4096;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "Z")
    private boolean field1537 = true;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "[I")
    public static int[] field1539 = new int[128];

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "Lkb;")
    public static class93 field1541 = class76.method390("welle:", 0);

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "Lkb;")
    public static class93 field1543 = class76.method390(" loggt sich ein)3", 0);

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[[I")
    public final int[][] method19(int arg0, int arg1) {
        ++field1540;
        int var3 = -5 % ((42 - arg0) / 54);
        int[][] var4 = super.field436.method537(0, arg1);
        if (super.field436.field1771) {
            int[] var5 = this.method145(0, (byte) 126, arg1 - 1 & class190.field3715);
            int[] var6 = this.method145(0, (byte) 120, arg1);
            int[] var7 = this.method145(0, (byte) 126, arg1 - -1 & class190.field3715);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            for (int var11 = 0; ~class159.field3209 < ~var11; ++var11) {
                int var12 = (var7[var11] + -var5[var11]) * this.field1538;
                int var13 = (var6[var11 + 1 & class78.field1402] + -var6[class78.field1402 & var11 + -1]) * this.field1538;
                int var14 = var13 >> 12;
                int var15 = var12 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = var15 * var15 >> 12;
                int var18 = (int) (4096.0D * Math.sqrt((double) ((var16 + var17 + 4096) / 4096)));
                int var19;
                int var20;
                int var21;
                if (~var18 != -1) {
                    var19 = var13 / var18;
                    var20 = 16777216 / var18;
                    var21 = var12 / var18;
                } else {
                    var20 = 0;
                    var19 = 0;
                    var21 = 0;
                }
                if (this.field1537) {
                    var19 = (var19 >> 1) + 2048;
                    var21 = (var21 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var8[var11] = var19;
                var9[var11] = var21;
                var10[var11] = var20;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZI)Lkb;")
    public static final class93 method425(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg1 >= -46) {
            return null;
        } else {
            ++field1536;
            if (~arg0 <= -3 && arg0 <= 36) {
                int var4 = 1;
                int var5 = arg3 / arg0;
                while (~var5 != -1) {
                    var5 /= arg0;
                    ++var4;
                }
                int var6 = var4;
                if (~arg3 > -1 || arg2) {
                    var6 = var4 + 1;
                }
                byte[] var7 = new byte[var6];
                if (arg3 >= 0) {
                    if (arg2) {
                        var7[0] = 43;
                    }
                } else {
                    var7[0] = 45;
                }
                for (int var8 = 0; ~var8 > ~var4; ++var8) {
                    int var10 = arg3 % arg0;
                    arg3 /= arg0;
                    if (var10 < 0) {
                        var10 = -var10;
                    }
                    if (var10 > 9) {
                        var10 += 39;
                    }
                    var7[-var8 + var6 + -1] = (byte) (var10 + 48);
                }
                class93 var9 = new class93();
                var9.field1726 = var7;
                var9.field1701 = var6;
                return var9;
            } else {
                throw new IllegalArgumentException("Invalid radix:" + arg0);
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        if (arg0 > 106) {
            ++field1542;
            if (arg1 != 0) {
                if (arg1 == 1) {
                    this.field1537 = arg2.method1054(128) == 1;
                }
            } else {
                this.field1538 = arg2.method1071(28101);
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
    public class84() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
    public static void method426(int arg0) {
        if (arg0 != -10470) {
            method425(-20, 114, true, 63);
        }
        field1541 = null;
        field1543 = null;
        field1539 = null;
    }
}
