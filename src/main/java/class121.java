import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class121 extends class40 {

    @OriginalMember(owner = "client!va", name = "A", descriptor = "Z")
    public boolean field2606 = false;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public int field2598;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "Z")
    public boolean field2601;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "[I")
    private int[] field2605;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "[I")
    private int[] field2600;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "[I")
    private int[] field2599;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "[I")
    private int[] field2603;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public int field2597;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "I")
    private int field2602;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "[I")
    public int[] field2604;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "[I")
    private static int[] field2607;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public final void method919(int arg0) {
        if (this.field2604 == null) {
            return;
        }
        if (this.field2597 == 1 || this.field2597 == 3) {
            if (field2607 == null || field2607.length < this.field2604.length) {
                field2607 = new int[this.field2604.length];
            }
            short var2;
            if (this.field2604.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2604.length / 4;
            int var4 = arg0 * var2 * this.field2602;
            int var5 = var3 - 1;
            if (this.field2597 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field2607[var6] = this.field2604[var17];
                field2607[var3 + var6] = this.field2604[var3 + var17];
                field2607[var3 + var6 + var3] = this.field2604[var3 + var17 + var3];
                field2607[var3 + var6 + var3 + var3] = this.field2604[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field2604;
            this.field2604 = field2607;
            field2607 = var7;
        }
        if (this.field2597 != 2 && this.field2597 != 4) {
            return;
        }
        if (field2607 == null || field2607.length < this.field2604.length) {
            field2607 = new int[this.field2604.length];
        }
        short var8;
        if (this.field2604.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field2604.length / 4;
        int var10 = this.field2602 * arg0;
        int var11 = var8 - 1;
        if (this.field2597 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field2607[var15] = this.field2604[var16];
                field2607[var9 + var15] = this.field2604[var9 + var16];
                field2607[var9 + var15 + var9] = this.field2604[var9 + var16 + var9];
                field2607[var9 + var15 + var9 + var9] = this.field2604[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field2604;
        this.field2604 = field2607;
        field2607 = var13;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(DILvb;)Z")
    public final boolean method920(double arg0, int arg1, class122 arg2) {
        for (int var5 = 0; var5 < this.field2605.length; var5++) {
            if (arg2.method945(1, this.field2605[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2604 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field2605.length; var7++) {
            class128 var10 = class124.method953(arg2, (byte) 110, this.field2605[var7]);
            var10.method974();
            byte[] var11 = var10.field2754;
            int[] var12 = var10.field2760;
            int var13 = this.field2603[var7];
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
                var12[var19] = class60.method487(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field2600[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field2756 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field2604[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field2756 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field2604[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field2756 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field2604[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field2604[var8] &= 0xF8F8FF;
            int var9 = this.field2604[var8];
            this.field2604[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field2604[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field2604[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "()V")
    public final void method921() {
        this.field2604 = null;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "()V")
    public static void method922() {
        field2607 = null;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lud;)V")
    public class121(class119 arg0) {
        this.field2598 = arg0.method903(2);
        this.field2601 = arg0.method879((byte) 45) == 1;
        int var2 = arg0.method879((byte) 45);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2605 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2605[var3] = arg0.method903(2);
        }
        if (var2 > 1) {
            this.field2600 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2600[var4] = arg0.method879((byte) 45);
            }
        }
        if (var2 > 1) {
            this.field2599 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2599[var5] = arg0.method879((byte) 45);
            }
        }
        this.field2603 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2603[var6] = arg0.method882(121);
        }
        this.field2597 = arg0.method879((byte) 45);
        this.field2602 = arg0.method879((byte) 45);
        this.field2604 = null;
    }
}
