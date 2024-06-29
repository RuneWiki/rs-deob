import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class208 extends class478 {

    @OriginalMember(owner = "client!vu", name = "D", descriptor = "I")
    private int field2460;

    @OriginalMember(owner = "client!vu", name = "C", descriptor = "[J")
    public static long[] field2459 = new long[11];

    @OriginalMember(owner = "client!vu", name = "G", descriptor = "[[J")
    public static long[][] field2463 = new long[8][256];

    @OriginalMember(owner = "client!vu", name = "H", descriptor = "Ljava/lang/String;")
    public static String field2464;

    @OriginalMember(owner = "client!vu", name = "B", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!vu", name = "E", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!vu", name = "F", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IZI)V")
    public static final void method1238(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field2459 = null;
        }
        ++field2458;
        class76 var3 = class3.method28(5, (byte) 42, arg0);
        var3.method403((byte) -121);
        var3.field785 = arg2;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lrb;)V")
    public static final void method1239(class383 arg0) {
        class568.field8078.method970(arg0.field5179, arg0.field5178 + (arg0.method179(3370) >> 1), arg0.field5176, class65.field662);
        arg0.field5173 = class65.field662[0];
        arg0.field5174 = class65.field662[1];
        arg0.field5168 = class65.field662[2];
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(B)V")
    public static void method1240(byte arg0) {
        field2459 = null;
        field2463 = null;
        field2464 = null;
        if (arg0 != 91) {
            method1239((class383) null);
        }
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "()V")
    public class208() {
        this(4096);
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILnp;I)V")
    public final void method33(int arg0, class115 arg1, int arg2) {
        ++field2462;
        if (arg0 == 255) {
            if (~arg2 == -1) {
                this.field2460 = (arg1.method620((byte) 34) << 12) / 255;
            }
        }
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(I)V")
    public class208(int arg0) {
        super(0, true);
        this.field2460 = 4096;
        this.field2460 = arg0;
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field2461;
        int[] var3 = super.field6886.method789(arg0, (byte) 127);
        if (super.field6886.field1592) {
            class567.method3217(var3, 0, class436.field6154, this.field2460);
        }
        if (arg1 != -11323) {
            field2464 = null;
        }
        return var3;
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            char var3 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(var0 / 2);
            long var4 = (long) ((1 & var0) != 0 ? 255 & var3 : var3 >>> 8);
            long var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 ^= 285L;
            }
            long var8 = var6 << 1;
            if (~var8 <= -257L) {
                var8 ^= 285L;
            }
            long var10 = var8 ^ var4;
            long var12 = var8 << 1;
            if (~var12 <= -257L) {
                var12 ^= 285L;
            }
            long var14 = var12 ^ var4;
            field2463[0][var0] = class559.method3171(var14, class559.method3171(class559.method3171(class559.method3171(class559.method3171(var4 << 32, class559.method3171(class559.method3171(var4 << 48, var4 << 56), var8 << 40)), var12 << 24), var10 << 16), var6 << 8));
            for (int var16 = 1; ~var16 > -9; ++var16) {
                field2463[var16][var0] = class559.method3171(field2463[var16 + -1][var0] >>> 8, field2463[var16 + -1][var0] << 56);
            }
        }
        field2459[0] = 0L;
        for (int var1 = 1; var1 <= 10; ++var1) {
            int var2 = (var1 + -1) * 8;
            field2459[var1] = class59.method317(class59.method317(class480.method2767(65280L, field2463[6][var2 + 6]), class59.method317(class59.method317(class480.method2767(4278190080L, field2463[4][var2 + 4]), class59.method317(class59.method317(class480.method2767(field2463[2][var2 - -2], 280375465082880L), class59.method317(class480.method2767(-72057594037927936L, field2463[0][var2]), class480.method2767(field2463[1][var2 + 1], 71776119061217280L))), class480.method2767(1095216660480L, field2463[3][var2 + 3]))), class480.method2767(16711680L, field2463[5][var2 - -5]))), class480.method2767(255L, field2463[7][var2 + 7]));
        }
        field2464 = null;
    }
}
