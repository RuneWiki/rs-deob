import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class106 extends class32 {

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "Z")
    public boolean field2541 = false;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
    public int field2546;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "Z")
    public boolean field2544;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "[I")
    private int[] field2540;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "[I")
    private int[] field2539;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "[I")
    private int[] field2542;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "[I")
    private int[] field2543;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public int field2537;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    private int field2536;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "[I")
    public int[] field2538;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "[I")
    private static int[] field2545;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "()V")
    public static void method857() {
        field2545 = null;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "()V")
    public final void method858() {
        this.field2538 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(DILla;)Z")
    public final boolean method859(double arg0, int arg1, class77 arg2) {
        for (int var5 = 0; var5 < this.field2540.length; var5++) {
            if (arg2.method574(-2, this.field2540[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2538 = new int[var6];
        for (int var7 = 0; var7 < this.field2540.length; var7++) {
            class144 var8 = class124.method931(-963, arg2, this.field2540[var7]);
            var8.method1063();
            byte[] var9 = var8.field3286;
            int[] var10 = var8.field3283;
            int var11 = this.field2543[var7];
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
                var10[var17] = class45.method300(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field2539[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field3280 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field2538[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3280 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field2538[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3280 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field2538[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)V")
    public final void method860(int arg0) {
        if (this.field2538 == null) {
            return;
        }
        if (this.field2537 == 1 || this.field2537 == 3) {
            if (field2545 == null || field2545.length < this.field2538.length) {
                field2545 = new int[this.field2538.length];
            }
            short var2;
            if (this.field2538.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2538.length;
            int var4 = arg0 * var2 * this.field2536;
            int var5 = var3 - 1;
            if (this.field2537 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field2545[var6] = this.field2538[var17];
            }
            int[] var7 = this.field2538;
            this.field2538 = field2545;
            field2545 = var7;
        }
        if (this.field2537 != 2 && this.field2537 != 4) {
            return;
        }
        if (field2545 == null || field2545.length < this.field2538.length) {
            field2545 = new int[this.field2538.length];
        }
        short var8;
        if (this.field2538.length == 4096) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field2538.length;
        int var10 = this.field2536 * arg0;
        int var11 = var8 - 1;
        if (this.field2537 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field2545[var15] = this.field2538[var16];
            }
        }
        int[] var13 = this.field2538;
        this.field2538 = field2545;
        field2545 = var13;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lne;)V")
    public class106(class95 arg0) {
        this.field2546 = arg0.method795(1);
        this.field2544 = arg0.method790((byte) 73) == 1;
        int var2 = arg0.method790((byte) 73);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2540 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2540[var3] = arg0.method795(1);
        }
        if (var2 > 1) {
            this.field2539 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2539[var4] = arg0.method790((byte) 73);
            }
        }
        if (var2 > 1) {
            this.field2542 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2542[var5] = arg0.method790((byte) 73);
            }
        }
        this.field2543 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2543[var6] = arg0.method740((byte) 36);
        }
        this.field2537 = arg0.method790((byte) 73);
        this.field2536 = arg0.method790((byte) 73);
        this.field2538 = null;
    }
}
