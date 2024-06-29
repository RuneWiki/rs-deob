import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class134 extends class88 {

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "Z")
    public boolean field3151 = false;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
    public int field3150;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "Z")
    public boolean field3145;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "[I")
    private int[] field3149;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "[I")
    private int[] field3153;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "[I")
    private int[] field3146;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "[I")
    private int[] field3147;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "I")
    public int field3152;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
    private int field3154;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "[I")
    public int[] field3144;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "[I")
    private static int[] field3148;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()V")
    public final void method1083() {
        this.field3144 = null;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "()V")
    public static void method1084() {
        field3148 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(DILmd;)Z")
    public final boolean method1085(double arg0, int arg1, class87 arg2) {
        for (int var5 = 0; var5 < this.field3149.length; var5++) {
            if (arg2.method648(this.field3149[var5], 2) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field3144 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field3149.length; var7++) {
            class92 var10 = class79.method568(1000, this.field3149[var7], arg2);
            var10.method691();
            byte[] var11 = var10.field2169;
            int[] var12 = var10.field2167;
            int var13 = this.field3147[var7];
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
                var12[var19] = class103.method833(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field3153[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field2170 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field3144[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field2170 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field3144[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field2170 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field3144[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field3144[var8] &= 0xF8F8FF;
            int var9 = this.field3144[var8];
            this.field3144[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field3144[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field3144[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lsb;)V")
    public class134(class127 arg0) {
        this.field3150 = arg0.method1020(false);
        this.field3145 = arg0.method1011(108) == 1;
        int var2 = arg0.method1011(122);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field3149 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field3149[var3] = arg0.method1020(false);
        }
        if (var2 > 1) {
            this.field3153 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field3153[var4] = arg0.method1011(94);
            }
        }
        if (var2 > 1) {
            this.field3146 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field3146[var5] = arg0.method1011(71);
            }
        }
        this.field3147 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3147[var6] = arg0.method986(41);
        }
        this.field3152 = arg0.method1011(58);
        this.field3154 = arg0.method1011(88);
        this.field3144 = null;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
    public final void method1086(int arg0) {
        if (this.field3144 == null) {
            return;
        }
        if (this.field3152 == 1 || this.field3152 == 3) {
            if (field3148 == null || field3148.length < this.field3144.length) {
                field3148 = new int[this.field3144.length];
            }
            short var2;
            if (this.field3144.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field3144.length / 4;
            int var4 = arg0 * var2 * this.field3154;
            int var5 = var3 - 1;
            if (this.field3152 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field3148[var6] = this.field3144[var17];
                field3148[var3 + var6] = this.field3144[var3 + var17];
                field3148[var3 + var6 + var3] = this.field3144[var3 + var17 + var3];
                field3148[var3 + var6 + var3 + var3] = this.field3144[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field3144;
            this.field3144 = field3148;
            field3148 = var7;
        }
        if (this.field3152 != 2 && this.field3152 != 4) {
            return;
        }
        if (field3148 == null || field3148.length < this.field3144.length) {
            field3148 = new int[this.field3144.length];
        }
        short var8;
        if (this.field3144.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field3144.length / 4;
        int var10 = this.field3154 * arg0;
        int var11 = var8 - 1;
        if (this.field3152 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field3148[var15] = this.field3144[var16];
                field3148[var9 + var15] = this.field3144[var9 + var16];
                field3148[var9 + var15 + var9] = this.field3144[var9 + var16 + var9];
                field3148[var9 + var15 + var9 + var9] = this.field3144[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field3144;
        this.field3144 = field3148;
        field3148 = var13;
    }
}
