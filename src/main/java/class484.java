import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class484 extends class281 implements class373 {

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    private int field6456;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "[J")
    public static long[] field6446 = new long[11];

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "[[J")
    public static long[][] field6451 = new long[8][256];

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "[F")
    public static float[] field6445 = new float[4];

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field6455 = 0;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "F")
    public static float field6448;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field6447;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "[I")
    public static int[] field6454;

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            char var3 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(var0 / 2);
            long var4 = (long) ((1 & var0) == 0 ? var3 >>> 8 : 255 & var3);
            long var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 ^= 285L;
            }
            long var8 = var6 << 1;
            if (var8 >= 256L) {
                var8 ^= 285L;
            }
            long var10 = var4 ^ var8;
            long var12 = var8 << 1;
            if (~var12 <= -257L) {
                var12 ^= 285L;
            }
            long var14 = var4 ^ var12;
            field6451[0][var0] = class292.method1731(class292.method1731(var6 << 8, class292.method1731(class292.method1731(class292.method1731(class292.method1731(class292.method1731(var4 << 48, var4 << 56), var8 << 40), var4 << 32), var12 << 24), var10 << 16)), var14);
            for (int var16 = 1; ~var16 > -9; ++var16) {
                field6451[var16][var0] = class292.method1731(field6451[var16 + -1][var0] << 56, field6451[var16 - 1][var0] >>> 8);
            }
        }
        field6446[0] = 0L;
        for (int var1 = 1; ~var1 >= -11; ++var1) {
            int var2 = (var1 + -1) * 8;
            field6446[var1] = class370.method2131(class535.method2850(field6451[7][var2 + 7], 255L), class370.method2131(class535.method2850(65280L, field6451[6][var2 + 6]), class370.method2131(class535.method2850(field6451[5][var2 + 5], 16711680L), class370.method2131(class535.method2850(field6451[4][var2 + 4], 4278190080L), class370.method2131(class535.method2850(field6451[3][var2 + 3], 1095216660480L), class370.method2131(class370.method2131(class535.method2850(-72057594037927936L, field6451[0][var2]), class535.method2850(field6451[1][var2 + 1], 71776119061217280L)), class535.method2850(field6451[2][var2 + 2], 280375465082880L)))))));
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)J", line = 6)
    public final long method2143(int arg0) {
        if (arg0 != 20812) {
            field6445 = null;
        }
        ++field6449;
        return super.field3670.getAddress();
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V", line = 18)
    public static void method2666(int arg0) {
        field6445 = null;
        field6446 = null;
        if (arg0 != 0) {
            method2667(48, 44, 105);
        }
        field6454 = null;
        field6451 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)Z", line = 32)
    public static final boolean method2667(int arg0, int arg1, int arg2) {
        ++field6452;
        if (arg1 != -13967) {
            method2668(-85, (class57) null);
        }
        return ~(256 & arg0) != -1;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)I", line = 48)
    public final int method2140(int arg0) {
        ++field6453;
        if (arg0 != 9126) {
            this.method2142((byte) -90);
        }
        return this.field6456;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lji;I[BI)V", line = 59)
    public class484(class622 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field6456 = arg1;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II[BI)V", line = 71)
    public final void method2141(int arg0, int arg1, byte[] arg2, int arg3) {
        this.method1688(arg2, arg0);
        int var5 = 42 % ((2 - arg1) / 61);
        ++field6447;
        this.field6456 = arg3;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILoi;)I", line = 85)
    public static final int method2668(int arg0, class57 arg1) {
        ++field6450;
        String var2 = class45.method419(false, arg1);
        int[] var3 = null;
        if (!class302.method1770(1002, arg1.field776)) {
            if (~arg1.field759 != 0) {
                var3 = class232.field3109.method1292(0, arg1.field759).field9520;
            } else if (!class478.method2652(115, arg1.field776)) {
                if (class226.method1419(arg1.field776, (byte) 101)) {
                    Object var4 = null;
                    class698 var5;
                    if (arg1.field776 != 1004) {
                        var5 = class348.field4436.method1900(24, (int) (arg1.field774 >>> 32 & 2147483647L));
                    } else {
                        var5 = class348.field4436.method1900(-120, (int) arg1.field774);
                    }
                    if (var5.field9630 != null) {
                        var5 = var5.method3815(65535, class397.field5054);
                    }
                    if (var5 != null) {
                        var3 = var5.field9669;
                    }
                }
            } else {
                class234 var6 = (class234) class505.field6640.method39((long) ((int) arg1.field774), 31750);
                if (var6 != null) {
                    class532 var7 = var6.field3131;
                    class699 var8 = var7.field6914;
                    if (var8.field9714 != null) {
                        var8 = var8.method3823(class397.field5054, -32574);
                    }
                    if (var8 != null) {
                        var3 = var8.field9700;
                    }
                }
            }
        } else {
            var3 = class232.field3109.method1292(0, (int) arg1.field774).field9520;
        }
        if (arg0 < 36) {
            field6454 = null;
        }
        if (var3 != null) {
            var2 = var2 + class37.method301((byte) -72, var3);
        }
        int var9 = class411.field5305.method2907(var2, class256.field3469, -1);
        if (arg1.field766) {
            var9 += 4 + class422.field5455.method608();
        }
        return var9;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)I", line = 159)
    public final int method2142(byte arg0) {
        ++field6444;
        if (arg0 != 17) {
            field6448 = 0.6421089F;
        }
        return 0;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lji;ILjaclib/memory/Buffer;)V", line = 243)
    public class484(class622 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field6456 = arg1;
    }
}
