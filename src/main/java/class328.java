import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class328 extends class601 {

    @OriginalMember(owner = "client!fp", name = "J", descriptor = "I")
    private int field4684 = -1;

    @OriginalMember(owner = "client!fp", name = "G", descriptor = "I")
    public static int field4681 = 0;

    @OriginalMember(owner = "client!fp", name = "F", descriptor = "[[J")
    public static long[][] field4680 = new long[8][256];

    @OriginalMember(owner = "client!fp", name = "O", descriptor = "[J")
    public static long[] field4689 = new long[11];

    @OriginalMember(owner = "client!fp", name = "R", descriptor = "[I")
    public static int[] field4692;

    @OriginalMember(owner = "client!fp", name = "Q", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!fp", name = "C", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!fp", name = "D", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!fp", name = "E", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!fp", name = "H", descriptor = "I")
    public int field4682;

    @OriginalMember(owner = "client!fp", name = "K", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!fp", name = "L", descriptor = "I")
    public int field4686;

    @OriginalMember(owner = "client!fp", name = "M", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!fp", name = "N", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!fp", name = "P", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!fp", name = "I", descriptor = "[I")
    public int[] field4683;

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            char var3 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(var0 / 2);
            long var4 = (long) ((1 & var0) != 0 ? 255 & var3 : var3 >>> 8);
            long var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 ^= 285L;
            }
            long var8 = var6 << 1;
            if (var8 >= 256L) {
                var8 ^= 285L;
            }
            long var10 = var8 ^ var4;
            long var12 = var8 << 1;
            if (var12 >= 256L) {
                var12 ^= 285L;
            }
            long var14 = var4 ^ var12;
            field4680[0][var0] = class338.method2030(var14, class338.method2030(var6 << 8, class338.method2030(class338.method2030(class338.method2030(var4 << 32, class338.method2030(var8 << 40, class338.method2030(var4 << 48, var4 << 56))), var12 << 24), var10 << 16)));
            for (int var16 = 1; ~var16 > -9; ++var16) {
                field4680[var16][var0] = class338.method2030(field4680[var16 + -1][var0] >>> 8, field4680[var16 + -1][var0] << 56);
            }
        }
        field4689[0] = 0L;
        for (int var1 = 1; var1 <= 10; ++var1) {
            int var2 = var1 * 8 + -8;
            field4689[var1] = class484.method2734(class484.method2734(class484.method2734(class484.method2734(class438.method2514(4278190080L, field4680[4][var2 + 4]), class484.method2734(class484.method2734(class484.method2734(class438.method2514(field4680[0][var2], -72057594037927936L), class438.method2514(71776119061217280L, field4680[1][var2 + 1])), class438.method2514(field4680[2][var2 + 2], 280375465082880L)), class438.method2514(1095216660480L, field4680[3][var2 + 3]))), class438.method2514(16711680L, field4680[5][var2 + 5])), class438.method2514(field4680[6][var2 + 6], 65280L)), class438.method2514(field4680[7][var2 + 7], 255L));
        }
        field4692 = new int[8];
        field4691 = -1;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V", line = 3)
    public static void method1982(byte arg0) {
        if (arg0 <= 39) {
            method1982((byte) -75);
        }
        field4680 = null;
        field4689 = null;
        field4692 = null;
    }

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "(I)Z", line = 17)
    public final boolean method1983(int arg0) {
        ++field4678;
        if (this.field4683 != null) {
            return true;
        } else {
            if (arg0 != 65280) {
                this.method1986(true);
            }
            if (~this.field4684 <= -1) {
                class720 var2 = class360.field5067 < 0 ? class720.method4037(class15.field211, this.field4684) : class720.method4034(class15.field211, class360.field5067, this.field4684);
                var2.method4045();
                this.field4683 = var2.method4035();
                this.field4682 = var2.field10028;
                this.field4686 = var2.field10029;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(IZ)[[I", line = 43)
    public int[][] method7(int arg0, boolean arg1) {
        ++field4687;
        int[][] var3 = super.field7890.method3963(1, arg0);
        if (!arg1) {
            return null;
        } else {
            if (super.field7890.field9769 && this.method1983(65280)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = (~class671.field9149 == ~this.field4686 ? arg0 : this.field4686 * arg0 / class671.field9149) * this.field4682;
                if (class171.field2624 != this.field4682) {
                    for (int var8 = 0; var8 < class171.field2624; ++var8) {
                        int var9 = this.field4682 * var8 / class171.field2624;
                        int var10 = this.field4683[var7 + var9];
                        var6[var8] = class48.method346(var10, 255) << 4;
                        var5[var8] = class48.method346(var10 >> 4, 4080);
                        var4[var8] = class48.method346(16711680, var10) >> 12;
                    }
                } else {
                    for (int var11 = 0; ~class171.field2624 < ~var11; ++var11) {
                        int var12 = this.field4683[var7++];
                        var6[var11] = class48.method346(var12 << 4, 4080);
                        var5[var11] = class48.method346(65280, var12) >> 4;
                        var4[var11] = class48.method346(var12 >> 12, 4080);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(I)I", line = 116)
    public final int method1984(int arg0) {
        ++field4685;
        if (arg0 != -1) {
            method1982((byte) -9);
        }
        return this.field4684;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lee;BI)V", line = 131)
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field4684 = arg0.method3807(-1);
        }
        if (arg1 == -61) {
            ++field4690;
        }
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V", line = 145)
    public class328() {
        super(0, false);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ldg;BLdg;)V", line = 148)
    public static final void method1985(class416 arg0, byte arg1, class416 arg2) {
        ++field4688;
        if (arg2.field5744 != null) {
            arg2.method2414((byte) -26);
        }
        arg2.field5744 = arg0.field5744;
        int var3 = -21 % ((66 - arg1) / 60);
        arg2.field5748 = arg0;
        arg2.field5744.field5748 = arg2;
        arg2.field5748.field5744 = arg2;
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(Z)V", line = 178)
    public final void method1986(boolean arg0) {
        super.method1986(arg0);
        ++field4679;
        this.field4683 = null;
    }
}
