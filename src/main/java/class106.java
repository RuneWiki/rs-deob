import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class106 extends class70 {

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "Z")
    public boolean field2543 = false;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
    public int field2533;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "Z")
    public boolean field2540;

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "[I")
    private int[] field2539;

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "[I")
    private int[] field2542;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "[I")
    private int[] field2536;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "[I")
    private int[] field2541;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "I")
    public int field2535;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "I")
    private int field2537;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "[I")
    public int[] field2534;

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "[I")
    private static int[] field2538;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)V")
    public final void method805(int arg0) {
        if (this.field2534 == null) {
            return;
        }
        if (this.field2535 == 1 || this.field2535 == 3) {
            if (field2538 == null || field2538.length < this.field2534.length) {
                field2538 = new int[this.field2534.length];
            }
            short var2;
            if (this.field2534.length == 16384) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2534.length / 4;
            int var4 = arg0 * var2 * this.field2537;
            int var5 = var3 - 1;
            if (this.field2535 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field2538[var6] = this.field2534[var17];
                field2538[var3 + var6] = this.field2534[var3 + var17];
                field2538[var3 + var6 + var3] = this.field2534[var3 + var17 + var3];
                field2538[var3 + var6 + var3 + var3] = this.field2534[var3 + var17 + var3 + var3];
            }
            int[] var7 = this.field2534;
            this.field2534 = field2538;
            field2538 = var7;
        }
        if (this.field2535 != 2 && this.field2535 != 4) {
            return;
        }
        if (field2538 == null || field2538.length < this.field2534.length) {
            field2538 = new int[this.field2534.length];
        }
        short var8;
        if (this.field2534.length == 16384) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field2534.length / 4;
        int var10 = this.field2537 * arg0;
        int var11 = var8 - 1;
        if (this.field2535 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field2538[var15] = this.field2534[var16];
                field2538[var9 + var15] = this.field2534[var9 + var16];
                field2538[var9 + var15 + var9] = this.field2534[var9 + var16 + var9];
                field2538[var9 + var15 + var9 + var9] = this.field2534[var9 + var16 + var9 + var9];
            }
        }
        int[] var13 = this.field2534;
        this.field2534 = field2538;
        field2538 = var13;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(DILjb;)Z")
    public final boolean method806(double arg0, int arg1, class64 arg2) {
        for (int var5 = 0; var5 < this.field2539.length; var5++) {
            if (arg2.method451((byte) -90, this.field2539[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2534 = new int[var6 * 4];
        for (int var7 = 0; var7 < this.field2539.length; var7++) {
            class118 var10 = class129.method1005(arg2, (byte) -47, this.field2539[var7]);
            var10.method948();
            byte[] var11 = var10.field2833;
            int[] var12 = var10.field2831;
            int var13 = this.field2541[var7];
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
                var12[var19] = class12.method108(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field2542[var7 - 1];
            }
            if (var20 == 0) {
                if (var10.field2835 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field2534[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var10.field2835 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field2534[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var10.field2835 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field2534[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        for (int var8 = 0; var8 < var6; var8++) {
            this.field2534[var8] &= 0xF8F8FF;
            int var9 = this.field2534[var8];
            this.field2534[var6 + var8] = var9 - (var9 >>> 3) & 0xF8F8FF;
            this.field2534[var6 + var8 + var6] = var9 - (var9 >>> 2) & 0xF8F8FF;
            this.field2534[var6 + var8 + var6 + var6] = var9 - (var9 >>> 2) - (var9 >>> 3) & 0xF8F8FF;
        }
        return true;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "()V")
    public static void method807() {
        field2538 = null;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "()V")
    public final void method808() {
        this.field2534 = null;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lla;)V")
    public class106(class77 arg0) {
        this.field2533 = arg0.method597(70);
        this.field2540 = arg0.method570((byte) 123) == 1;
        int var2 = arg0.method570((byte) 123);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2539 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2539[var3] = arg0.method597(99);
        }
        if (var2 > 1) {
            this.field2542 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2542[var4] = arg0.method570((byte) 123);
            }
        }
        if (var2 > 1) {
            this.field2536 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2536[var5] = arg0.method570((byte) 123);
            }
        }
        this.field2541 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2541[var6] = arg0.method554((byte) 116);
        }
        this.field2535 = arg0.method570((byte) 123);
        this.field2537 = arg0.method570((byte) 123);
        this.field2534 = null;
    }
}
