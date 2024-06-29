import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class117 extends class5 {

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "Z")
    public boolean field2744 = false;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
    public int field2742;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "Z")
    public boolean field2748;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "[I")
    private int[] field2752;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "[I")
    private int[] field2743;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "[I")
    private int[] field2745;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "[I")
    private int[] field2750;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    public int field2747;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    private int field2746;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "[I")
    public int[] field2749;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "[I")
    private static int[] field2751;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "()V")
    public static void method882() {
        field2751 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(DILef;)Z")
    public final boolean method883(double arg0, int arg1, class35 arg2) {
        for (int var5 = 0; var5 < this.field2752.length; var5++) {
            if (arg2.method268(true, this.field2752[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2749 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field2752.length; var7++) {
            class20 var10 = class91.method731(arg2, this.field2752[var7], -1);
            var10.method163();
            byte[] var11 = var10.field573;
            int[] var12 = var10.field575;
            int var13 = this.field2750[var7];
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
                var12[var19] = class152.method1147(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field2743[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field574 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field2749[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field574 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field2749[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field574 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field2749[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field2749[var8] &= 0xF8F8FF;
            int var9 = this.field2749[var8];
            this.field2749[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field2749[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field2749[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
    public final void method884(int arg0) {
        if (this.field2749 == null) {
            return;
        }
        if (this.field2747 == 1 || this.field2747 == 3) {
            if (field2751 == null || field2751.length < this.field2749.length) {
                field2751 = new int[this.field2749.length];
            }
            short var2;
            if (this.field2749.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2749.length / 4;
            int var4 = arg0 * var2 * this.field2746;
            int var5 = var3 - 1;
            if (this.field2747 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field2751[var6] = this.field2749[var17];
                field2751[var3 + var6] = this.field2749[var3 + var17];
                field2751[var3 + var6 + var3] = this.field2749[var3 + var17 + var3];
                field2751[var3 + var6 + var3 + var3] = this.field2749[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field2749;
            this.field2749 = field2751;
            field2751 = var7;
        }
        if (this.field2747 != 2 && this.field2747 != 4) {
            return;
        }
        if (field2751 == null || field2751.length < this.field2749.length) {
            field2751 = new int[this.field2749.length];
        }
        short var8;
        if (this.field2749.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field2749.length / 4;
        int var10 = this.field2746 * arg0;
        int var11 = var8 - 1;
        if (this.field2747 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field2751[var15] = this.field2749[var16];
                field2751[var9 + var15] = this.field2749[var9 + var16];
                field2751[var9 + var15 + var9] = this.field2749[var9 + var16 + var9];
                field2751[var9 + var15 + var9 + var9] = this.field2749[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field2749;
        this.field2749 = field2751;
        field2751 = var13;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lm;)V")
    public class117(class83 arg0) {
        this.field2742 = arg0.method631((byte) -117);
        this.field2748 = arg0.method638(0) == 1;
        int var2 = arg0.method638(0);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2752 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2752[var3] = arg0.method631((byte) -101);
        }
        if (var2 > 1) {
            this.field2743 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2743[var4] = arg0.method638(0);
            }
        }
        if (var2 > 1) {
            this.field2745 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2745[var5] = arg0.method638(0);
            }
        }
        this.field2750 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2750[var6] = arg0.method641((byte) 73);
        }
        this.field2747 = arg0.method638(0);
        this.field2746 = arg0.method638(0);
        this.field2749 = null;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "()V")
    public final void method885() {
        this.field2749 = null;
    }
}
