import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class456 {

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public int field6501 = 0;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public int field6498 = 0;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "Lfba;")
    private class348 field6495 = new class348(64);

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "Lsd;")
    private class58 field6505 = null;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "Lla;")
    private class423 field6492;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "Lla;")
    private class423 field6502;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "J")
    public static long field6494 = 0L;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public static int field6499 = 0;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "Lkca;")
    public static class755 field6496 = new class755(3);

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "[J")
    public static long[] field6503 = new long[11];

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "[[J")
    public static long[][] field6504 = new long[8][256];

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field6500;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            char var3 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(var0 / 2);
            long var4 = (long) ((var0 & 0x1) == 0 ? var3 >>> 8 : var3 & 0xFF);
            long var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 ^= 0x11DL;
            }
            long var8 = var6 << 1;
            if (var8 >= 256L) {
                var8 ^= 0x11DL;
            }
            long var10 = var8 ^ var4;
            long var12 = var8 << 1;
            if (var12 >= 256L) {
                var12 ^= 0x11DL;
            }
            long var14 = var12 ^ var4;
            field6504[0][var0] = class19.method91(var14, class19.method91(var6 << 8, class19.method91(class19.method91(var12 << 24, class19.method91(class19.method91(var8 << 40, class19.method91(var4 << 48, var4 << 56)), var4 << 32)), var10 << 16)));
            for (int var16 = 1; var16 < 8; var16++) {
                field6504[var16][var0] = class19.method91(field6504[var16 - 1][var0] >>> 8, field6504[var16 - 1][var0] << 56);
            }
        }
        field6503[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = (var1 - 1) * 8;
            field6503[var1] = class82.method659(class82.method659(class82.method659(class666.method3806(16711680L, field6504[5][var2 + 5]), class82.method659(class666.method3806(field6504[4][var2 + 4], 4278190080L), class82.method659(class666.method3806(field6504[3][var2 + 3], 1095216660480L), class82.method659(class666.method3806(field6504[2][var2 + 2], 280375465082880L), class82.method659(class666.method3806(field6504[1][var2 + 1], 71776119061217280L), class666.method3806(-72057594037927936L, field6504[0][var2])))))), class666.method3806(field6504[6][var2 + 6], 65280L)), class666.method3806(255L, field6504[7][var2 + 7]));
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ldj;[IJB)Ljava/lang/String;", line = 3)
    public final String method2777(class703 arg0, int[] arg1, long arg2, byte arg3) {
        field6497++;
        if (this.field6505 != null) {
            String var6 = this.field6505.method551((byte) 64, arg2, arg1, arg0);
            if (var6 != null) {
                return var6;
            }
        }
        if (arg3 <= 40) {
            this.field6498 = 6;
        }
        return Long.toString(arg2);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 34)
    public static void method2778(int arg0) {
        field6504 = null;
        field6503 = null;
        field6496 = null;
        if (arg0 >= -34) {
            field6496 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)Lks;", line = 50)
    public final class714 method2779(int arg0, int arg1) {
        field6500++;
        class714 var3 = (class714) this.field6495.method2216(0, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field6502.method2600(0, 1, arg0);
        } else {
            var4 = this.field6492.method2600(0, 1, arg0 & 0x7FFF);
        }
        class714 var5 = new class714();
        var5.field10078 = this;
        if (var4 != null) {
            var5.method4010(-93, new class479(var4));
        }
        if (arg0 >= 32768) {
            var5.method4011((byte) -123);
        }
        this.field6495.method2213((byte) -16, (long) arg0, var5);
        if (arg1 < 109) {
            field6494 = -41L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(ILla;Lla;Lsd;)V", line = 177)
    public class456(int arg0, class423 arg1, class423 arg2, class58 arg3) {
        this.field6492 = arg2;
        this.field6502 = arg1;
        this.field6505 = arg3;
        if (this.field6502 != null) {
            this.field6501 = this.field6502.method2616(1, 0);
        }
        if (this.field6492 != null) {
            this.field6498 = this.field6492.method2616(1, 0);
        }
    }
}
