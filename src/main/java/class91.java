import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class91 extends class148 {

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "Z")
    public boolean field2170 = false;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public int field2161;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "Z")
    public boolean field2166;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "[I")
    private int[] field2163;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "[I")
    private int[] field2167;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "[I")
    private int[] field2160;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "[I")
    private int[] field2169;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public int field2168;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    private int field2164;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "[I")
    public int[] field2165;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "[I")
    private static int[] field2162;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
    public final void method709(int arg0) {
        if (this.field2165 == null) {
            return;
        }
        if (this.field2168 == 1 || this.field2168 == 3) {
            if (field2162 == null || field2162.length < this.field2165.length) {
                field2162 = new int[this.field2165.length];
            }
            short var2;
            if (this.field2165.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2165.length / 4;
            int var4 = arg0 * var2 * this.field2164;
            int var5 = var3 - 1;
            if (this.field2168 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field2162[var6] = this.field2165[var17];
                field2162[var3 + var6] = this.field2165[var3 + var17];
                field2162[var3 + var6 + var3] = this.field2165[var3 + var17 + var3];
                field2162[var3 + var6 + var3 + var3] = this.field2165[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field2165;
            this.field2165 = field2162;
            field2162 = var7;
        }
        if (this.field2168 != 2 && this.field2168 != 4) {
            return;
        }
        if (field2162 == null || field2162.length < this.field2165.length) {
            field2162 = new int[this.field2165.length];
        }
        short var8;
        if (this.field2165.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field2165.length / 4;
        int var10 = this.field2164 * arg0;
        int var11 = var8 - 1;
        if (this.field2168 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field2162[var15] = this.field2165[var16];
                field2162[var9 + var15] = this.field2165[var9 + var16];
                field2162[var9 + var15 + var9] = this.field2165[var9 + var16 + var9];
                field2162[var9 + var15 + var9 + var9] = this.field2165[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field2165;
        this.field2165 = field2162;
        field2162 = var13;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()V")
    public static void method710() {
        field2162 = null;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "()V")
    public final void method711() {
        this.field2165 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(DILpd;)Z")
    public final boolean method712(double arg0, int arg1, class108 arg2) {
        for (int var5 = 0; var5 < this.field2163.length; var5++) {
            if (arg2.method875(false, this.field2163[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2165 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field2163.length; var7++) {
            class114 var10 = class3.method12(-26495, this.field2163[var7], arg2);
            var10.method935();
            byte[] var11 = var10.field2620;
            int[] var12 = var10.field2618;
            int var13 = this.field2169[var7];
            if ((var13 & 0xFF000000) == 50331648) {
                int var14 = var13 & 0xFF00FF;
                int var15 = var13 >> 8 & 0xFF;
                for (int var16 = 0; var16 < var12.length; var16++) {
                    int var17 = var12[var16];
                    if (var17 >> 8 == (var17 & 0xFFFF)) {
                        int var18 = var17 & 0xFF;
                        var12[var16] = var14 * var18 >> 8 & 0xFF00FF | var15 * var18 & 0xFF00;
                    }
                }
            }
            for (int var19 = 0; var19 < var12.length; var19++) {
                var12[var19] = class66.method518(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field2167[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field2625 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field2165[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field2625 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field2165[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field2625 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field2165[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field2165[var8] &= 0xF8F8FF;
            int var9 = this.field2165[var8];
            this.field2165[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field2165[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field2165[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Ls;)V")
    public class91(class128 arg0) {
        this.field2161 = arg0.method1041(212464720);
        this.field2166 = arg0.method1025(255) == 1;
        int var2 = arg0.method1025(255);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2163 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2163[var3] = arg0.method1041(212464720);
        }
        if (var2 > 1) {
            this.field2167 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2167[var4] = arg0.method1025(255);
            }
        }
        if (var2 > 1) {
            this.field2160 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2160[var5] = arg0.method1025(255);
            }
        }
        this.field2169 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2169[var6] = arg0.method1037(18834);
        }
        this.field2168 = arg0.method1025(255);
        this.field2164 = arg0.method1025(255);
        this.field2165 = null;
    }
}
