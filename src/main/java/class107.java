import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class107 extends class96 {

    @OriginalMember(owner = "client!re", name = "C", descriptor = "Z")
    public boolean field2592 = false;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "I")
    public int field2597;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "Z")
    public boolean field2595;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "[I")
    private int[] field2596;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "[I")
    private int[] field2598;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "[I")
    private int[] field2589;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "[I")
    private int[] field2594;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public int field2588;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "I")
    private int field2591;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "[I")
    public int[] field2593;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "[I")
    private static int[] field2590;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "()V", line = 7)
    public static void method806() {
        field2590 = null;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "()V", line = 12)
    public final void method807() {
        this.field2593 = null;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lfe;)V", line = 299)
    public class107(class36 arg0) {
        this.field2597 = arg0.method351((byte) -122);
        this.field2595 = arg0.method365((byte) -121) == 1;
        int var2 = arg0.method365((byte) -127);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2596 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2596[var3] = arg0.method351((byte) -104);
        }
        if (var2 > 1) {
            this.field2598 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2598[var4] = arg0.method365((byte) -121);
            }
        }
        if (var2 > 1) {
            this.field2589 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2589[var5] = arg0.method365((byte) -123);
            }
        }
        this.field2594 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2594[var6] = arg0.method361((byte) 65);
        }
        this.field2588 = arg0.method365((byte) -123);
        this.field2591 = arg0.method365((byte) -124);
        this.field2593 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(DILk;)Z", line = 23)
    public final boolean method808(double arg0, int arg1, class60 arg2) {
        for (int var5 = 0; var5 < this.field2596.length; var5++) {
            if (arg2.method497((byte) 24, this.field2596[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2593 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field2596.length; var7++) {
            class100 var10 = class115.method889(arg2, 2, this.field2596[var7]);
            var10.method748();
            byte[] var11 = var10.field2412;
            int[] var12 = var10.field2410;
            int var13 = this.field2594[var7];
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
                var12[var19] = class12.method91(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field2598[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field2407 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field2593[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field2407 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field2593[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field2407 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field2593[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field2593[var8] &= 0xF8F8FF;
            int var9 = this.field2593[var8];
            this.field2593[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field2593[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field2593[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V", line = 199)
    public final void method809(int arg0) {
        if (this.field2593 == null) {
            return;
        }
        if (this.field2588 == 1 || this.field2588 == 3) {
            if (field2590 == null || field2590.length < this.field2593.length) {
                field2590 = new int[this.field2593.length];
            }
            short var2;
            if (this.field2593.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2593.length / 4;
            int var4 = arg0 * var2 * this.field2591;
            int var5 = var3 - 1;
            if (this.field2588 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field2590[var6] = this.field2593[var17];
                field2590[var3 + var6] = this.field2593[var3 + var17];
                field2590[var3 + var6 + var3] = this.field2593[var3 + var17 + var3];
                field2590[var3 + var6 + var3 + var3] = this.field2593[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field2593;
            this.field2593 = field2590;
            field2590 = var7;
        }
        if (this.field2588 != 2 && this.field2588 != 4) {
            return;
        }
        if (field2590 == null || field2590.length < this.field2593.length) {
            field2590 = new int[this.field2593.length];
        }
        short var8;
        if (this.field2593.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field2593.length / 4;
        int var10 = this.field2591 * arg0;
        int var11 = var8 - 1;
        if (this.field2588 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field2590[var15] = this.field2593[var16];
                field2590[var9 + var15] = this.field2593[var9 + var16];
                field2590[var9 + var15 + var9] = this.field2593[var9 + var16 + var9];
                field2590[var9 + var15 + var9 + var9] = this.field2593[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field2593;
        this.field2593 = field2590;
        field2590 = var13;
    }
}
