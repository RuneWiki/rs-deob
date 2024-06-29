import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class130 extends class117 {

    @OriginalMember(owner = "client!ll", name = "S", descriptor = "[I")
    private int[] field2041 = new int[3];

    @OriginalMember(owner = "client!ll", name = "I", descriptor = "I")
    private int field2032 = 4096;

    @OriginalMember(owner = "client!ll", name = "N", descriptor = "I")
    private int field2036 = 4096;

    @OriginalMember(owner = "client!ll", name = "P", descriptor = "I")
    private int field2038 = 409;

    @OriginalMember(owner = "client!ll", name = "W", descriptor = "I")
    private int field2045 = 4096;

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "Z")
    public static boolean field2033 = true;

    @OriginalMember(owner = "client!ll", name = "U", descriptor = "[I")
    public static int[] field2043 = new int[14];

    @OriginalMember(owner = "client!ll", name = "L", descriptor = "[I")
    public static int[] field2035 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ll", name = "V", descriptor = "I")
    public static int field2044 = 0;

    @OriginalMember(owner = "client!ll", name = "Q", descriptor = "Lqd;")
    public static class173 field2039 = new class173(500);

    @OriginalMember(owner = "client!ll", name = "K", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!ll", name = "O", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!ll", name = "R", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!ll", name = "T", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V")
    public class130() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IZLdk;I)[Lbl;")
    public static final class146[] method920(int arg0, boolean arg1, class251 arg2, int arg3) {
        ++field2034;
        if (!arg1) {
            method920(21, false, (class251) null, -17);
        }
        return !class290.method1932(-45, arg3, arg0, arg2) ? null : class309.method2062(false);
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(B)V")
    public static void method921(byte arg0) {
        field2035 = null;
        if (arg0 != -43) {
            method922(98, -1, -89, -72, 96);
        }
        field2039 = null;
        field2043 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            int var5 = arg0.method1137(31155);
                            this.field2041[0] = class51.method359(267386880, var5 << 4);
                            this.field2041[1] = class51.method359(4080, var5 >> 4);
                            this.field2041[2] = class51.method359(var5, 255) >> 12;
                        }
                    } else {
                        this.field2032 = arg0.method1142(arg1 ^ -19175);
                    }
                } else {
                    this.field2045 = arg0.method1142(-18970);
                }
            } else {
                this.field2036 = arg0.method1142(-18970);
            }
        } else {
            this.field2038 = arg0.method1142(-18970);
        }
        ++field2042;
        if (arg1 != 255) {
            this.method47(38, 94);
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(II)[[I")
    public final int[][] method47(int arg0, int arg1) {
        int var3 = -37 % ((37 - arg1) / 38);
        ++field2037;
        int[][] var4 = super.field1886.method419(arg0, (byte) 94);
        if (super.field1886.field1022) {
            int[][] var5 = this.method838(0, 0, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var5[1];
            int[] var11 = var4[2];
            for (int var12 = 0; ~class168.field2737 < ~var12; ++var12) {
                int var13 = var6[var12];
                int var14 = -this.field2041[0] + var13;
                if (var14 < 0) {
                    var14 = -var14;
                }
                if (var14 > this.field2038) {
                    var8[var12] = var13;
                    var9[var12] = var10[var12];
                    var11[var12] = var7[var12];
                } else {
                    int var15 = var10[var12];
                    int var16 = -this.field2041[1] + var15;
                    if (~var16 > -1) {
                        var16 = -var16;
                    }
                    if (var16 > this.field2038) {
                        var8[var12] = var13;
                        var9[var12] = var15;
                        var11[var12] = var7[var12];
                    } else {
                        int var17 = var7[var12];
                        int var18 = -this.field2041[2] + var17;
                        if (~var18 > -1) {
                            var18 = -var18;
                        }
                        if (~this.field2038 > ~var18) {
                            var8[var12] = var13;
                            var9[var12] = var15;
                            var11[var12] = var17;
                        } else {
                            var8[var12] = this.field2032 * var13 >> 12;
                            var9[var12] = this.field2045 * var15 >> 12;
                            var11[var12] = this.field2036 * var17 >> 12;
                        }
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIII)V")
    public static final void method922(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2040;
        class73.method494(arg3, class204.field3253[arg4], 4028, arg2 - -arg0, -arg0 + arg2);
        if (arg1 != 14) {
            field2035 = null;
        }
        int var5 = -arg0;
        int var6 = arg0;
        int var7 = 0;
        int var8 = -1;
        while (~var7 > ~var6) {
            var8 += 2;
            var5 += var8;
            ++var7;
            if (var5 >= 0) {
                --var6;
                int[] var9 = class204.field3253[arg4 + var6];
                int var10 = arg2 + var7;
                int[] var11 = class204.field3253[arg4 - var6];
                int var12 = -var7 + arg2;
                var5 -= var6 << 1;
                class73.method494(arg3, var9, 4028, var10, var12);
                class73.method494(arg3, var11, 4028, var10, var12);
            }
            int var13 = arg2 - -var6;
            int var14 = -var6 + arg2;
            int[] var15 = class204.field3253[arg4 + var7];
            int[] var16 = class204.field3253[-var7 + arg4];
            class73.method494(arg3, var15, 4028, var13, var14);
            class73.method494(arg3, var16, 4028, var13, var14);
        }
    }
}
