import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class28 extends class20 {

    @OriginalMember(owner = "client!df", name = "I", descriptor = "Z")
    public boolean field541 = false;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "I")
    public int field536;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "Z")
    public boolean field543;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "[I")
    private int[] field538;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "[I")
    private int[] field537;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "[I")
    private int[] field534;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "[I")
    private int[] field542;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "I")
    public int field544;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "I")
    private int field540;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "[I")
    public int[] field539;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "[I")
    private static int[] field535;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
    public final void method232() {
        this.field539 = null;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public final void method233(int arg0) {
        if (this.field539 == null) {
            return;
        }
        if (this.field544 == 1 || this.field544 == 3) {
            if (field535 == null || field535.length < this.field539.length) {
                field535 = new int[this.field539.length];
            }
            short var2;
            if (this.field539.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field539.length;
            int var4 = arg0 * var2 * this.field540;
            int var5 = var3 - 1;
            if (this.field544 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var17 = var4 + var6 & var5;
                field535[var6] = this.field539[var17];
            }
            int[] var7 = this.field539;
            this.field539 = field535;
            field535 = var7;
        }
        if (this.field544 != 2 && this.field544 != 4) {
            return;
        }
        if (field535 == null || field535.length < this.field539.length) {
            field535 = new int[this.field539.length];
        }
        short var8;
        if (this.field539.length == 4096) {
            var8 = 64;
        } else {
            var8 = 128;
        }
        int var9 = this.field539.length;
        int var10 = this.field540 * arg0;
        int var11 = var8 - 1;
        if (this.field544 == 2) {
            var10 = -var10;
        }
        for (int var12 = 0; var12 < var9; var12 += var8) {
            for (int var14 = 0; var14 < var8; var14++) {
                int var15 = var12 + var14;
                int var16 = (var10 + var14 & var11) + var12;
                field535[var15] = this.field539[var16];
            }
        }
        int[] var13 = this.field539;
        this.field539 = field535;
        field535 = var13;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(DILsf;)Z")
    public final boolean method234(double arg0, int arg1, class131 arg2) {
        for (int var5 = 0; var5 < this.field538.length; var5++) {
            if (arg2.method1026(this.field538[var5], false) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field539 = new int[var6];
        for (int var7 = 0; var7 < this.field538.length; var7++) {
            class56 var8 = class120.method914(false, arg2, this.field538[var7]);
            var8.method431();
            byte[] var9 = var8.field1239;
            int[] var10 = var8.field1241;
            int var11 = this.field542[var7];
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
                var10[var17] = class114.method881(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field537[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field1237 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field539[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field1237 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field539[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field1237 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field539[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()V")
    public static void method235() {
        field535 = null;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lmc;)V")
    public class28(class86 arg0) {
        this.field536 = arg0.method632((byte) -80);
        this.field543 = arg0.method646(-15447) == 1;
        int var2 = arg0.method646(-15447);
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field538 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field538[var3] = arg0.method632((byte) -80);
        }
        if (var2 > 1) {
            this.field537 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field537[var4] = arg0.method646(-15447);
            }
        }
        if (var2 > 1) {
            this.field534 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field534[var5] = arg0.method646(-15447);
            }
        }
        this.field542 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field542[var6] = arg0.method666(1183700424);
        }
        this.field544 = arg0.method646(-15447);
        this.field540 = arg0.method646(-15447);
        this.field539 = null;
    }
}
