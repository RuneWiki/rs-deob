import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class227 {

    @OriginalMember(owner = "client!la", name = "j", descriptor = "[I")
    private int[] field3847;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "[I")
    private int[] field3846;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Lnk;")
    private class89 field3841;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Lnk;")
    private class89 field3840;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "[Lnk;")
    private class89[] field3843;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "[J")
    public static long[] field3844 = new long[256];

    @OriginalMember(owner = "client!la", name = "h", descriptor = "J")
    public static long field3845 = 0L;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method1469(int arg0) {
        if (arg0 != -8337) {
            method1469(-107);
        }
        field3844 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lod;Lma;Z)Z")
    public final boolean method1470(class15 arg0, class105 arg1, boolean arg2) {
        field3839++;
        for (int var4 = 0; var4 < this.field3846.length; var4++) {
            if (!arg1.method784(this.field3846[var4], -2)) {
                return false;
            }
        }
        if (!arg2) {
            field3845 = 41L;
        }
        for (int var5 = 0; var5 < this.field3847.length; var5++) {
            if (!arg0.method77(this.field3847[var5], -72)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(DZIIBZLod;Lma;)[I")
    public final int[] method1471(double arg0, boolean arg1, int arg2, int arg3, byte arg4, boolean arg5, class15 arg6, class105 arg7) {
        class213.method1371(arg0, -4);
        int[] var10 = new int[arg2 * arg3];
        field3842++;
        class153.field2676 = arg7;
        class116.field2068 = arg6;
        class66.method449(arg3, arg2, (byte) -127);
        for (int var11 = 0; var11 < this.field3843.length; var11++) {
            this.field3843[var11].method650(arg2, arg3, 28953);
        }
        int var12 = 0;
        byte var13;
        int var14;
        int var15;
        if (arg5) {
            var13 = -1;
            var15 = arg3 - 1;
            var14 = -1;
        } else {
            var13 = 1;
            var14 = arg3;
            var15 = 0;
        }
        for (int var16 = 0; var16 < arg2; var16++) {
            if (arg1) {
                var12 = var16;
            }
            int[] var20;
            int[] var21;
            int[] var22;
            if (this.field3841.field1508) {
                int[] var19 = this.field3841.method239(var16, false);
                var20 = var19;
                var21 = var19;
                var22 = var19;
            } else {
                int[][] var23 = this.field3841.method21(true, var16);
                var20 = var23[0];
                var22 = var23[1];
                var21 = var23[2];
            }
            for (int var24 = var15; var24 != var14; var24 += var13) {
                int var25 = var22[var24] >> 4;
                int var26 = var20[var24] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = var21[var24] >> 4;
                if (var25 < 0) {
                    var25 = 0;
                }
                if (var27 > 255) {
                    var27 = 255;
                }
                int var28 = class40.field668[var25];
                if (var27 < 0) {
                    var27 = 0;
                }
                int var29 = class40.field668[var26];
                int var30 = class40.field668[var27];
                var10[var12++] = (var29 << 16) + (var28 << 8) + var30;
                if (arg1) {
                    var12 += arg3 - 1;
                }
            }
        }
        int var17 = -28 % ((24 - arg4) / 54);
        for (int var18 = 0; var18 < this.field3843.length; var18++) {
            this.field3843[var18].method55(0);
        }
        return var10;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
    public class227() {
        this.field3847 = new int[0];
        this.field3846 = new int[0];
        this.field3841 = new class106();
        this.field3841.field1515 = 1;
        this.field3840 = new class106();
        this.field3840.field1515 = 1;
        this.field3843 = new class89[] { this.field3841, this.field3840 };
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lij;)V")
    public class227(class85 arg0) {
        int var2 = arg0.method564((byte) 109);
        this.field3843 = new class89[var2];
        int var3 = 0;
        int[][] var4 = new int[var2][];
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class89 var16 = class107.method798(arg0, -29);
            if (var16.method57(92) >= 0) {
                var3++;
            }
            if (var16.method651((byte) 71) >= 0) {
                var5++;
            }
            int var17 = var16.field1519.length;
            var4[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var4[var6][var18] = arg0.method564((byte) 97);
            }
            this.field3843[var6] = var16;
        }
        this.field3846 = new int[var3];
        this.field3847 = new int[var5];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class89 var11 = this.field3843[var9];
            int var12 = var11.field1519.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1519[var13] = this.field3843[var4[var9][var13]];
            }
            int var14 = var11.method57(111);
            int var15 = var11.method651((byte) 71);
            if (var14 > 0) {
                this.field3846[var8++] = var14;
            }
            if (var15 > 0) {
                this.field3847[var7++] = var15;
            }
            var4[var9] = null;
        }
        this.field3841 = this.field3843[arg0.method564((byte) 54)];
        Object var10 = null;
        this.field3840 = this.field3843[arg0.method564((byte) 89)];
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3844[var0] = var1;
        }
    }
}
