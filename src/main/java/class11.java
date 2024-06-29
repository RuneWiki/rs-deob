import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class11 extends class98 {

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "I")
    private int field142 = 585;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "[I")
    public static int[] field145 = new int[500];

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "Lva;")
    public static class288 field150;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "Lrs;")
    public static class392 field146;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "Ljj;")
    public static class60 field143;

    static {
        new class362("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field150 = new class288(16);
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)V", line = 5)
    public static final void method78(int arg0) {
        class215.field3043 = arg0;
        ++field147;
        int var1 = (class384.field5422.field3284 >> 7) - -class114.field1403;
        int var2 = (class384.field5422.field3269 >> 7) + class41.field496;
        if (var1 >= 3053 && var1 <= 3156 && ~var2 <= -3057 && var2 <= 3136) {
            class215.field3043 = 1;
        }
        if (var1 >= 3072 && ~var1 >= -3119 && var2 >= 9492 && var2 <= 9535) {
            class215.field3043 = 1;
        }
        if (class215.field3043 == 1 && var1 >= 3139 && var1 <= 3199 && ~var2 <= -3009 && var2 <= 3062) {
            class215.field3043 = 0;
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V", line = 30)
    public class11() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZLfj;)V", line = 36)
    public static final void method79(boolean arg0, class396 arg1) {
        ++field151;
        int var2 = arg1.field5579 - class189.field2726;
        int var3 = arg1.field5644 * 128 - -(arg1.method242(-30129) * 64);
        int var4 = arg1.field5631 * 128 - -(arg1.method242(-30129) * 64);
        arg1.field5666 = 0;
        arg1.field3269 += (var4 - arg1.field3269) / var2;
        arg1.field3284 += (-arg1.field3284 + var3) / var2;
        if (arg0) {
            method79(true, (class396) null);
        }
        if (arg1.field5582 == 0) {
            arg1.method2527(8192, -55);
        }
        if (arg1.field5582 == 1) {
            arg1.method2527(12288, -75);
        }
        if (arg1.field5582 == 2) {
            arg1.method2527(0, -80);
        }
        if (arg1.field5582 == 3) {
            arg1.method2527(4096, -81);
        }
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V", line = 78)
    public static void method80(int arg0) {
        field150 = null;
        field146 = null;
        if (arg0 == 4096) {
            field143 = null;
            field145 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILdg;I)V", line = 92)
    public final void method81(int arg0, class236 arg1, int arg2) {
        ++field149;
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.field142 = arg1.method1617((byte) 48);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(B)V", line = 119)
    public static final void method82(byte arg0) {
        int var1 = -28 / ((-79 - arg0) / 46);
        ++field148;
        class25.field310.method1618(0);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[I", line = 129)
    public final int[] method83(int arg0, int arg1) {
        ++field144;
        int[] var3 = super.field1177.method820(arg1, true);
        if (arg0 != 0) {
            field146 = null;
        }
        if (super.field1177.field1610) {
            int var4 = class163.field2285[arg1];
            for (int var5 = 0; class268.field3811 > var5; ++var5) {
                int var6 = class189.field2722[var5];
                if (~this.field142 > ~var6 && ~var6 > ~(-this.field142 + 4096) && ~var4 < ~(-this.field142 + 2048) && this.field142 + 2048 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field142);
                    var3[var5] = 4096 - var10;
                } else if (~var6 < ~(-this.field142 + 2048) && this.field142 + 2048 > var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field142;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field142 + 2048);
                } else if (this.field142 <= var4 && ~var4 >= ~(-this.field142 + 4096)) {
                    if (~var6 <= ~this.field142 && ~(-this.field142 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field142 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field142;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field142 + 2048);
                }
            }
        }
        return var3;
    }
}
