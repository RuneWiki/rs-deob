import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class110 extends class22 {

    @OriginalMember(owner = "client!t", name = "E", descriptor = "Z")
    public boolean field2475 = false;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public int field2466;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "Z")
    public boolean field2467;

    @OriginalMember(owner = "client!t", name = "D", descriptor = "[I")
    private int[] field2474;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "[I")
    private int[] field2470;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "[I")
    private int[] field2472;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "[I")
    private int[] field2473;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    public int field2468;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "I")
    private int field2469;

    @OriginalMember(owner = "client!t", name = "F", descriptor = "[I")
    public int[] field2476;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "[I")
    private static int[] field2471;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V", line = 11)
    public final void method805() {
        this.field2476 = null;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ltc;)V", line = 118)
    public class110(class113 arg0) {
        this.field2466 = arg0.method870(-1);
        this.field2467 = arg0.method821(true) == 1;
        int var2 = arg0.method821(true);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2474 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2474[var3] = arg0.method870(-1);
        }
        if (var2 > 1) {
            this.field2470 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2470[var4] = arg0.method821(true);
            }
        }
        if (var2 > 1) {
            this.field2472 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2472[var5] = arg0.method821(true);
            }
        }
        this.field2473 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2473[var6] = arg0.method822(-708753192);
        }
        this.field2468 = arg0.method821(true);
        this.field2469 = arg0.method821(true);
        this.field2476 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 24)
    public final void method806(int arg0) {
        if (this.field2476 == null) {
            return;
        }
        if (this.field2468 == 1 || this.field2468 == 3) {
            if (field2471 == null || field2471.length < this.field2476.length) {
                field2471 = new int[this.field2476.length];
            }
            short var2;
            if (this.field2476.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2476.length / 4;
            int var4 = arg0 * var2 * this.field2469;
            int var5 = var3 - 1;
            if (this.field2468 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field2471[var6] = this.field2476[var17];
                field2471[var3 + var6] = this.field2476[var3 + var17];
                field2471[var3 + var6 + var3] = this.field2476[var3 + var17 + var3];
                field2471[var3 + var6 + var3 + var3] = this.field2476[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field2476;
            this.field2476 = field2471;
            field2471 = var7;
        }
        if (this.field2468 != 2 && this.field2468 != 4) {
            return;
        }
        if (field2471 == null || field2471.length < this.field2476.length) {
            field2471 = new int[this.field2476.length];
        }
        short var8;
        if (this.field2476.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field2476.length / 4;
        int var10 = this.field2469 * arg0;
        int var11 = var8 - 1;
        if (this.field2468 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field2471[var15] = this.field2476[var16];
                field2471[var9 + var15] = this.field2476[var9 + var16];
                field2471[var9 + var15 + var9] = this.field2476[var9 + var16 + var9];
                field2471[var9 + var15 + var9 + var9] = this.field2476[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field2476;
        this.field2476 = field2471;
        field2471 = var13;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(DILhe;)Z", line = 177)
    public final boolean method807(double arg0, int arg1, class47 arg2) {
        for (int var5 = 0; var5 < this.field2474.length; var5++) {
            if (arg2.method336(this.field2474[var5], 0) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2476 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field2474.length; var7++) {
            class72 var10 = class41.method280(this.field2474[var7], -121, arg2);
            var10.method503();
            byte[] var11 = var10.field1695;
            int[] var12 = var10.field1694;
            int var13 = this.field2473[var7];
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
                var12[var19] = class83.method583(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field2470[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field1696 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field2476[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field1696 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field2476[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field1696 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field2476[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field2476[var8] &= 0xF8F8FF;
            int var9 = this.field2476[var8];
            this.field2476[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field2476[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field2476[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()V", line = 354)
    public static void method808() {
        field2471 = null;
    }
}
