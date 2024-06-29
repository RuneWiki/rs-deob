import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class110 extends class123 {

    @OriginalMember(owner = "client!q", name = "M", descriptor = "Z")
    public boolean field2473 = false;

    @OriginalMember(owner = "client!q", name = "O", descriptor = "I")
    public int field2475;

    @OriginalMember(owner = "client!q", name = "J", descriptor = "Z")
    public boolean field2470;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "[I")
    private int[] field2467;

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "[I")
    private int[] field2477;

    @OriginalMember(owner = "client!q", name = "K", descriptor = "[I")
    private int[] field2471;

    @OriginalMember(owner = "client!q", name = "I", descriptor = "[I")
    private int[] field2469;

    @OriginalMember(owner = "client!q", name = "N", descriptor = "I")
    public int field2474;

    @OriginalMember(owner = "client!q", name = "L", descriptor = "I")
    private int field2472;

    @OriginalMember(owner = "client!q", name = "P", descriptor = "[I")
    public int[] field2476;

    @OriginalMember(owner = "client!q", name = "H", descriptor = "[I")
    private static int[] field2468;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()V")
    public static void method900() {
        field2468 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(DILtb;)Z")
    public final boolean method901(double arg0, int arg1, class130 arg2) {
        for (int var5 = 0; var5 < this.field2467.length; var5++) {
            if (arg2.method1063(-12290, this.field2467[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2476 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field2467.length; var7++) {
            class100 var10 = class112.method914(arg2, false, this.field2467[var7]);
            var10.method829();
            byte[] var11 = var10.field2326;
            int[] var12 = var10.field2321;
            int var13 = this.field2469[var7];
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
                var12[var19] = class66.method545(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field2477[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field2325 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field2476[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field2325 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field2476[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field2325 == 128 && arg1 == 64) {
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

    @OriginalMember(owner = "client!q", name = "b", descriptor = "()V")
    public final void method902() {
        this.field2476 = null;
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
    public final void method903(int arg0) {
        if (this.field2476 == null) {
            return;
        }
        if (this.field2474 == 1 || this.field2474 == 3) {
            if (field2468 == null || field2468.length < this.field2476.length) {
                field2468 = new int[this.field2476.length];
            }
            short var2;
            if (this.field2476.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2476.length / 4;
            int var4 = arg0 * var2 * this.field2472;
            int var5 = var3 - 1;
            if (this.field2474 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field2468[var6] = this.field2476[var17];
                field2468[var3 + var6] = this.field2476[var3 + var17];
                field2468[var3 + var6 + var3] = this.field2476[var3 + var17 + var3];
                field2468[var3 + var6 + var3 + var3] = this.field2476[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field2476;
            this.field2476 = field2468;
            field2468 = var7;
        }
        if (this.field2474 != 2 && this.field2474 != 4) {
            return;
        }
        if (field2468 == null || field2468.length < this.field2476.length) {
            field2468 = new int[this.field2476.length];
        }
        short var8;
        if (this.field2476.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field2476.length / 4;
        int var10 = this.field2472 * arg0;
        int var11 = var8 - 1;
        if (this.field2474 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field2468[var15] = this.field2476[var16];
                field2468[var9 + var15] = this.field2476[var9 + var16];
                field2468[var9 + var15 + var9] = this.field2476[var9 + var16 + var9];
                field2468[var9 + var15 + var9 + var9] = this.field2476[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field2476;
        this.field2476 = field2468;
        field2468 = var13;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lb;)V")
    public class110(class8 arg0) {
        this.field2475 = arg0.method68(-2);
        this.field2470 = arg0.method62((byte) 76) == 1;
        int var2 = arg0.method62((byte) 89);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2467 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2467[var3] = arg0.method68(-2);
        }
        if (var2 > 1) {
            this.field2477 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2477[var4] = arg0.method62((byte) 105);
            }
        }
        if (var2 > 1) {
            this.field2471 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2471[var5] = arg0.method62((byte) 76);
            }
        }
        this.field2469 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2469[var6] = arg0.method70(false);
        }
        this.field2474 = arg0.method62((byte) 76);
        this.field2472 = arg0.method62((byte) 103);
        this.field2476 = null;
    }
}
