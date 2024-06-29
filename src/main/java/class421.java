import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class421 extends class176 {

    @OriginalMember(owner = "client!iaa", name = "B", descriptor = "I")
    public int field5918 = 0;

    @OriginalMember(owner = "client!iaa", name = "u", descriptor = "[[J")
    public static long[][] field5911 = new long[8][256];

    @OriginalMember(owner = "client!iaa", name = "t", descriptor = "[J")
    public static long[] field5910 = new long[11];

    @OriginalMember(owner = "client!iaa", name = "I", descriptor = "Lej;")
    public static class104 field5925;

    @OriginalMember(owner = "client!iaa", name = "p", descriptor = "I")
    public int field5906;

    @OriginalMember(owner = "client!iaa", name = "r", descriptor = "I")
    public int field5908;

    @OriginalMember(owner = "client!iaa", name = "s", descriptor = "I")
    public int field5909;

    @OriginalMember(owner = "client!iaa", name = "w", descriptor = "I")
    public int field5913;

    @OriginalMember(owner = "client!iaa", name = "x", descriptor = "I")
    public int field5914;

    @OriginalMember(owner = "client!iaa", name = "y", descriptor = "I")
    public int field5915;

    @OriginalMember(owner = "client!iaa", name = "z", descriptor = "I")
    public int field5916;

    @OriginalMember(owner = "client!iaa", name = "A", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!iaa", name = "C", descriptor = "I")
    public int field5919;

    @OriginalMember(owner = "client!iaa", name = "F", descriptor = "I")
    public int field5922;

    @OriginalMember(owner = "client!iaa", name = "G", descriptor = "I")
    public int field5923;

    @OriginalMember(owner = "client!iaa", name = "H", descriptor = "I")
    public int field5924;

    @OriginalMember(owner = "client!iaa", name = "D", descriptor = "Lhh;")
    public class109 field5920;

    @OriginalMember(owner = "client!iaa", name = "q", descriptor = "Lbea;")
    public class188 field5907;

    @OriginalMember(owner = "client!iaa", name = "m", descriptor = "Lvn;")
    public class260 field5903;

    @OriginalMember(owner = "client!iaa", name = "n", descriptor = "Lvn;")
    public class260 field5904;

    @OriginalMember(owner = "client!iaa", name = "o", descriptor = "Lss;")
    public class364 field5905;

    @OriginalMember(owner = "client!iaa", name = "v", descriptor = "Z")
    public boolean field5912;

    @OriginalMember(owner = "client!iaa", name = "E", descriptor = "[I")
    public int[] field5921;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)V")
    public final void method2516(int arg0) {
        field5917++;
        int var2 = this.field5915;
        if (this.field5905 != null) {
            class364 var5 = this.field5905.method2183(true, class189.field2681);
            if (var5 == null) {
                this.field5919 = 0;
                this.field5915 = -1;
                this.field5908 = 0;
                this.field5924 = 0;
                this.field5921 = null;
                this.field5916 = 0;
            } else {
                this.field5924 = var5.field4945;
                this.field5908 = var5.field4941;
                this.field5915 = var5.field4899;
                this.field5919 = var5.field4933;
                this.field5916 = var5.field4952 << 7;
                this.field5921 = var5.field4878;
            }
        } else if (this.field5920 != null) {
            int var3 = class522.method3011(this.field5920, true);
            if (var2 != var3) {
                this.field5915 = var3;
                class593 var4 = this.field5920.field1669;
                if (var4.field8532 != null) {
                    var4 = var4.method3516(class189.field2681, 102);
                }
                if (var4 == null) {
                    this.field5908 = this.field5916 = 0;
                } else {
                    this.field5916 = var4.field8524 << 7;
                    this.field5908 = var4.field8531;
                }
            }
        } else if (this.field5907 != null) {
            this.field5915 = class443.method2622(-75, this.field5907);
            this.field5916 = this.field5907.field2663 << 7;
            this.field5908 = this.field5907.field2635;
        }
        if (arg0 != 0) {
            this.field5913 = 2;
        }
        if (this.field5915 != var2 && this.field5904 != null) {
            class204.field2869.method2731(this.field5904);
            this.field5904 = null;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(I)V")
    public static void method2517(int arg0) {
        field5925 = null;
        if (arg0 != 0) {
            field5910 = null;
        }
        field5911 = null;
        field5910 = null;
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
            field5911[0][var0] = class501.method2902(var14, class501.method2902(var6 << 8, class501.method2902(class501.method2902(class501.method2902(class501.method2902(class501.method2902(var4 << 48, var4 << 56), var8 << 40), var4 << 32), var12 << 24), var10 << 16)));
            for (int var16 = 1; var16 < 8; var16++) {
                field5911[var16][var0] = class501.method2902(field5911[var16 - 1][var0] << 56, field5911[var16 - 1][var0] >>> 8);
            }
        }
        field5910[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = (var1 - 1) * 8;
            field5910[var1] = class344.method2082(class253.method1580(255L, field5911[7][var2 + 7]), class344.method2082(class344.method2082(class253.method1580(16711680L, field5911[5][var2 + 5]), class344.method2082(class253.method1580(field5911[4][var2 + 4], 4278190080L), class344.method2082(class344.method2082(class344.method2082(class253.method1580(field5911[1][var2 + 1], 71776119061217280L), class253.method1580(field5911[0][var2], -72057594037927936L)), class253.method1580(field5911[2][var2 + 2], 280375465082880L)), class253.method1580(1095216660480L, field5911[3][var2 + 3])))), class253.method1580(65280L, field5911[6][var2 + 6])));
        }
        field5925 = new class104("M", "M", "M", "M");
        new class104(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
    }
}
