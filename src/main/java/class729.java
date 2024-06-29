import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class729 {

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "Lgw;")
    private class690 field10140 = new class690(64);

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "Lgw;")
    public class690 field10153 = new class690(60);

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "Luu;")
    private class237 field10144;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "Luu;")
    public class237 field10151;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "[[J")
    public static long[][] field10152 = new long[8][256];

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "[J")
    public static long[] field10147 = new long[11];

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "[I")
    public static int[] field10154;

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "Lst;")
    public static class335 field10156;

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
    public static int field10141;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
    public static int field10142;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
    public static int field10143;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
    public static int field10145;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "I")
    public static int field10146;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
    public static int field10148;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
    public static int field10149;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
    public static int field10150;

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "I")
    public int field10155;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)[Lmaa;")
    public static final class508[] method4066(int arg0) {
        if (arg0 != -17469) {
            field10147 = null;
        }
        field10142++;
        return new class508[] { class563.field7815, class67.field1043, class600.field8126, class297.field4228, class596.field8091, class193.field2625, class84.field1198, class697.field9733, class507.field7044, class555.field7739, class3.field17, class261.field3785, class282.field4089, class612.field8231, class11.field101 };
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V")
    public final void method4067(int arg0) {
        int var2 = 16 / ((arg0 - 56) / 60);
        class690 var3 = this.field10140;
        synchronized (this.field10140) {
            this.field10140.method3906(-98);
        }
        field10148++;
        class690 var4 = this.field10153;
        synchronized (this.field10153) {
            this.field10153.method3906(-117);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IB)V")
    public final void method4068(int arg0, byte arg1) {
        this.field10155 = arg0;
        field10150++;
        class690 var3 = this.field10153;
        synchronized (this.field10153) {
            this.field10153.method3906(arg1 - 44);
            if (arg1 != -51) {
                this.method4068(-86, (byte) -73);
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)V")
    public final void method4069(int arg0) {
        field10141++;
        if (arg0 != 12288) {
            return;
        }
        class690 var2 = this.field10140;
        synchronized (this.field10140) {
            this.field10140.method3902(arg0 - 12288);
        }
        class690 var3 = this.field10153;
        synchronized (this.field10153) {
            this.field10153.method3902(0);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)V")
    public static void method4070(boolean arg0) {
        field10152 = null;
        field10147 = null;
        field10154 = null;
        field10156 = null;
        if (!arg0) {
            method4070(false);
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(IB)V")
    public final void method4071(int arg0, byte arg1) {
        class690 var3 = this.field10140;
        synchronized (this.field10140) {
            this.field10140.method3896(1, arg0);
        }
        field10145++;
        if (arg1 >= 69) {
            class690 var4 = this.field10153;
            synchronized (this.field10153) {
                this.field10153.method3896(1, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)Z")
    public static final boolean method4072(int arg0, int arg1) {
        field10143++;
        if (arg1 >= -111) {
            field10156 = null;
        }
        return arg0 >= 4 && arg0 <= 8;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(II)Lll;")
    public final class46 method4073(int arg0, int arg1) {
        field10149++;
        class690 var3 = this.field10140;
        class46 var4;
        synchronized (this.field10140) {
            var4 = (class46) this.field10140.method3898((byte) -42, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class237 var5 = this.field10144;
        byte[] var6;
        synchronized (this.field10144) {
            var6 = this.field10144.method1572(class328.method2111(-1672243896, arg1), arg0 ^ arg0, class456.method2787(arg1, (byte) -74));
        }
        class46 var7 = new class46();
        var7.field599 = this;
        var7.field595 = arg1;
        if (var6 != null) {
            var7.method256(-81, new class63(var6));
        }
        class690 var8 = this.field10140;
        synchronized (this.field10140) {
            this.field10140.method3899(arg0 ^ 0xFFFFE2D6, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lgp;ILuu;Luu;)V")
    public class729(class553 arg0, int arg1, class237 arg2, class237 arg3) {
        this.field10144 = arg2;
        this.field10151 = arg3;
        int var5 = this.field10144.method1584((byte) 72) - 1;
        this.field10144.method1597(var5, 0);
    }

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
            long var10 = var4 ^ var8;
            long var12 = var8 << 1;
            if (var12 >= 256L) {
                var12 ^= 0x11DL;
            }
            long var14 = var4 ^ var12;
            field10152[0][var0] = class670.method3777(class670.method3777(class670.method3777(class670.method3777(var12 << 24, class670.method3777(class670.method3777(var8 << 40, class670.method3777(var4 << 48, var4 << 56)), var4 << 32)), var10 << 16), var6 << 8), var14);
            for (int var16 = 1; var16 < 8; var16++) {
                field10152[var16][var0] = class670.method3777(field10152[var16 - 1][var0] >>> 8, field10152[var16 - 1][var0] << 56);
            }
        }
        field10147[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = (var1 - 1) * 8;
            field10147[var1] = class514.method3068(class605.method3445(255L, field10152[7][var2 + 7]), class514.method3068(class605.method3445(field10152[6][var2 + 6], 65280L), class514.method3068(class514.method3068(class514.method3068(class514.method3068(class514.method3068(class605.method3445(field10152[1][var2 + 1], 71776119061217280L), class605.method3445(-72057594037927936L, field10152[0][var2])), class605.method3445(280375465082880L, field10152[2][var2 + 2])), class605.method3445(field10152[3][var2 + 3], 1095216660480L)), class605.method3445(4278190080L, field10152[4][var2 + 4])), class605.method3445(16711680L, field10152[5][var2 + 5]))));
        }
        field10154 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };
        field10156 = new class335(57, 15);
    }
}
