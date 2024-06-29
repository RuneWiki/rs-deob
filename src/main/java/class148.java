import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class148 extends class146 {

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "Z")
    public boolean field3367 = false;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public int field3362;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "Z")
    public boolean field3361;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "[I")
    private int[] field3365;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "[I")
    private int[] field3366;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "[I")
    private int[] field3364;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "[I")
    private int[] field3359;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public int field3358;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    private int field3357;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "[I")
    public int[] field3363;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "[I")
    private static int[] field3360;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)V")
    public final void method1104(int arg0) {
        if (this.field3363 == null) {
            return;
        }
        if (this.field3358 == 1 || this.field3358 == 3) {
            if (field3360 == null || field3360.length < this.field3363.length) {
                field3360 = new int[this.field3363.length];
            }
            short var2;
            if (this.field3363.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field3363.length;
            int var4 = arg0 * var2 * this.field3357;
            int var5 = var3 - 1;
            if (this.field3358 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field3360[var6] = this.field3363[var17];
            }
            int[] var7 = this.field3363;
            this.field3363 = field3360;
            field3360 = var7;
        }
        if (this.field3358 != 2 && this.field3358 != 4) {
            return;
        }
        if (field3360 == null || field3360.length < this.field3363.length) {
            field3360 = new int[this.field3363.length];
        }
        short var8;
        if (this.field3363.length == 4096) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field3363.length;
        int var10 = this.field3357 * arg0;
        int var11 = var8 - 1;
        if (this.field3358 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field3360[var15] = this.field3363[var16];
            }
        }
        int[] var13 = this.field3363;
        this.field3363 = field3360;
        field3360 = var13;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "()V")
    public final void method1105() {
        this.field3363 = null;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "()V")
    public static void method1106() {
        field3360 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(DILea;)Z")
    public final boolean method1107(double arg0, int arg1, class30 arg2) {
        for (int var5 = 0; var5 < this.field3365.length; var5++) {
            if (arg2.method216(this.field3365[var5], -30895) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field3363 = new int[var6];
        for (int var7 = 0; var7 < this.field3365.length; var7++) {
            class51 var8 = class52.method409(-7450, arg2, this.field3365[var7]);
            var8.method399();
            byte[] var9 = var8.field1165;
            int[] var10 = var8.field1167;
            int var11 = this.field3359[var7];
            if ((var11 & 0xFF000000) == 50331648) {
                int var12 = var11 & 0xFF00FF;
                int var13 = var11 >> 8 & 0xFF;
                for (int var14 = 0; var14 < var10.length; var14++) {
                    int var15 = var10[var14];
                    if (var15 >> 8 == (var15 & 0xFFFF)) {
                        int var16 = var15 & 0xFF;
                        var10[var14] = var12 * var16 >> 8 & 0xFF00FF | var13 * var16 & 0xFF00;
                    }
                }
            }
            for (int var17 = 0; var17 < var10.length; var17++) {
                var10[var17] = class7.method37(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field3366[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field1168 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field3363[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field1168 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field3363[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field1168 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field3363[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Ljd;)V")
    public class148(class66 arg0) {
        this.field3362 = arg0.method532(0);
        this.field3361 = arg0.method533(255) == 1;
        int var2 = arg0.method533(255);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field3365 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field3365[var3] = arg0.method532(0);
        }
        if (var2 > 1) {
            this.field3366 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field3366[var4] = arg0.method533(255);
            }
        }
        if (var2 > 1) {
            this.field3364 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field3364[var5] = arg0.method533(255);
            }
        }
        this.field3359 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3359[var6] = arg0.method539(true);
        }
        this.field3358 = arg0.method533(255);
        this.field3357 = arg0.method533(255);
        this.field3363 = null;
    }
}
