import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class565 extends IOException {

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "[J")
    public static long[] field7994 = new long[11];

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "[[J")
    public static long[][] field7996 = new long[8][256];

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
    public static int field7992;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    public static int field7993;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
    public static int field7995;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
    public static int field7997;

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
    public static int field7998;

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
    public static int field7999;

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
            long var14 = var4 ^ var12;
            field7996[0][var0] = class110.method928(var14, class110.method928(var6 << 8, class110.method928(var10 << 16, class110.method928(class110.method928(var4 << 32, class110.method928(var8 << 40, class110.method928(var4 << 48, var4 << 56))), var12 << 24))));
            for (int var16 = 1; var16 < 8; var16++) {
                field7996[var16][var0] = class110.method928(field7996[var16 - 1][var0] << 56, field7996[var16 - 1][var0] >>> 8);
            }
        }
        field7994[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = (var1 - 1) * 8;
            field7994[var1] = class439.method2557(class439.method2557(class460.method2645(65280L, field7996[6][var2 + 6]), class439.method2557(class439.method2557(class460.method2645(4278190080L, field7996[4][var2 + 4]), class439.method2557(class460.method2645(1095216660480L, field7996[3][var2 + 3]), class439.method2557(class439.method2557(class460.method2645(71776119061217280L, field7996[1][var2 + 1]), class460.method2645(-72057594037927936L, field7996[0][var2])), class460.method2645(field7996[2][var2 + 2], 280375465082880L)))), class460.method2645(field7996[5][var2 + 5], 16711680L))), class460.method2645(field7996[7][var2 + 7], 255L));
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lkh;ILha;)V", line = 3)
    public static final void method3263(class17 arg0, int arg1, class66 arg2) {
        field7997++;
        boolean var3 = class143.field2427.method1411(arg0.field355, arg0.field389 | 0xFF000000, -1, arg0.field280, arg0.field279, arg2, arg0.field257 ? class235.field3379.field10630 : null, arg0.field293) == null;
        if (var3) {
            class179.field2819.method3594((byte) -97, new class776(arg0.field355, arg0.field279, arg0.field293, arg0.field389 | 0xFF000000, arg0.field280, arg0.field257));
            class410.method2433(arg0, 14049);
        }
        if (arg1 >= -67) {
            field7994 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 22)
    public class565(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)V", line = 27)
    public static void method3264(byte arg0) {
        field7994 = null;
        field7996 = null;
        if (arg0 >= -12) {
            field7992 = -42;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)I", line = 43)
    public static final int method3265(int arg0, int arg1) {
        field7999++;
        if (arg1 != -19952) {
            method3263(null, -84, null);
        }
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)V", line = 57)
    public static final void method3266(int arg0, int arg1) {
        field7993++;
        class80.field1115.method265(arg1, -128);
        class281.field3898.method265(arg1, -77);
        int var2 = 20 % ((9 - arg0) / 52);
        class79.field1110.method265(arg1, -47);
        class642.field8889.method265(arg1, -67);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)I", line = 73)
    public static final int method3267(int arg0, int arg1, int arg2) {
        field7998++;
        int var3 = -119 % ((arg1 - 70) / 32);
        int var4 = class116.method1030(29, arg0 + 45365, arg2 + 91923, 4) - (-(class116.method1030(91, arg0 + 10294, arg2 + 37821, 2) + -128 >> 1) + -(class116.method1030(75, arg0, arg2, 1) + -128 >> 2)) - 128;
        int var5 = (int) ((double) var4 * 0.3D) + 35;
        if (var5 < 10) {
            var5 = 10;
        } else if (var5 > 60) {
            var5 = 60;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V", line = 94)
    public static final void method3268(int arg0) {
        class614.field8549 = 0;
        class475.field6431++;
        field7995++;
        class461.field6266 = 0;
        class660.method3714(-29080);
        class43.method262((byte) -85);
        class771.method4241(13954);
        boolean var1 = false;
        for (int var2 = 0; var2 < class461.field6266; var2++) {
            int var5 = class546.field7418[var2];
            class755 var6 = (class755) class664.field9216.method337((long) var5, 1);
            class666 var7 = var6.field10414;
            if (class611.field8532 && class457.method2636(var5, false)) {
                class388.method2360(true);
            }
            if (class475.field6431 != var7.field5258) {
                if (var7.field9253.method3288(-1)) {
                    class33.method199(true, var7);
                }
                var7.method3764(54, null);
                var1 = true;
                var6.method1207(101);
            }
        }
        if (var1) {
            class406.field5583 = class664.field9216.method343(56);
            class664.field9216.method342(class491.field6712, -20773);
        }
        if (class11.field179 != class262.field3679.field1442) {
            throw new RuntimeException("gnp1 pos:" + class262.field3679.field1442 + " psize:" + class11.field179);
        }
        if (arg0 >= -20) {
            field7994 = null;
        }
        for (int var3 = 0; var3 < class610.field8520; var3++) {
            if (class664.field9216.method337((long) class744.field10273[var3], 1) == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class610.field8520);
            }
        }
        if (class406.field5583 - class610.field8520 != 0) {
            throw new RuntimeException("gnp3 mis:" + (class406.field5583 - class610.field8520));
        }
        for (int var4 = 0; var4 < class406.field5583; var4++) {
            if (class475.field6431 != class491.field6712[var4].field10414.field5258) {
                throw new RuntimeException("gnp4 uk:" + class491.field6712[var4].field10414.field5288);
            }
        }
    }
}
