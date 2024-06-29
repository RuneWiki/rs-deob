import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class277 {

    @OriginalMember(owner = "client!oca", name = "h", descriptor = "Ldia;")
    private class246 field4109;

    @OriginalMember(owner = "client!oca", name = "g", descriptor = "J")
    public long field4108;

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "[J")
    public static long[] field4104 = new long[11];

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "[[J")
    public static long[][] field4107 = new long[8][256];

    @OriginalMember(owner = "client!oca", name = "i", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!oca", name = "j", descriptor = "Lmga;")
    public static class739 field4111;

    @OriginalMember(owner = "client!oca", name = "k", descriptor = "Lmga;")
    public static class739 field4112;

    @OriginalMember(owner = "client!oca", name = "l", descriptor = "Z")
    public static boolean field4113;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "I")
    public static int field4106;

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
            field4107[0][var0] = class683.method3802(class683.method3802(var6 << 8, class683.method3802(class683.method3802(var12 << 24, class683.method3802(var4 << 32, class683.method3802(class683.method3802(var4 << 48, var4 << 56), var8 << 40))), var10 << 16)), var14);
            for (int var16 = 1; var16 < 8; var16++) {
                field4107[var16][var0] = class683.method3802(field4107[var16 - 1][var0] << 56, field4107[var16 - 1][var0] >>> 8);
            }
        }
        field4104[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = (var1 - 1) * 8;
            field4104[var1] = class27.method203(class163.method1185(field4107[7][var2 + 7], 255L), class27.method203(class163.method1185(65280L, field4107[6][var2 + 6]), class27.method203(class163.method1185(field4107[5][var2 + 5], 16711680L), class27.method203(class163.method1185(field4107[4][var2 + 4], 4278190080L), class27.method203(class163.method1185(1095216660480L, field4107[3][var2 + 3]), class27.method203(class163.method1185(280375465082880L, field4107[2][var2 + 2]), class27.method203(class163.method1185(field4107[1][var2 + 1], 71776119061217280L), class163.method1185(-72057594037927936L, field4107[0][var2]))))))));
        }
        field4110 = 1339;
        field4111 = new class739(28, 3);
        field4112 = new class739(86, -1);
        field4113 = false;
    }

    @OriginalMember(owner = "client!oca", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        field4106++;
        this.field4109.method1623(this.field4108, false);
        super.finalize();
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)V", line = 14)
    public static final void method1791(int arg0, int arg1, int arg2) {
        field4102++;
        class347 var3 = class73.field1031[arg1][arg0];
        if (var3 != null) {
            class758.field10511 = var3.field5087;
            class405.field5874 = var3.field5093;
            class599.field8155 = var3.field5097;
        }
        class299.method1896(true);
        if (arg2 > -80) {
            field4111 = null;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)V", line = 36)
    public static void method1792(byte arg0) {
        field4112 = null;
        field4107 = null;
        if (arg0 != -102) {
            method1792((byte) -101);
        }
        field4111 = null;
        field4104 = null;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IILjava/lang/String;)V", line = 57)
    public static final void method1793(int arg0, int arg1, String arg2) {
        field4103++;
        class16 var3 = class94.method753(3, 13175, (long) arg1);
        if (arg0 == 25243) {
            var3.method119(-87);
            var3.field236 = arg2;
        }
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Ldia;J[Lkd;)V", line = 71)
    public class277(class246 arg0, long arg1, class298[] arg2) {
        this.field4109 = arg0;
        this.field4108 = arg1;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(ZLha;Lck;)I", line = 85)
    public static final int method1794(boolean arg0, class65 arg1, class669 arg2) {
        if (!arg0) {
            return 38;
        }
        field4105++;
        if (arg2.field9417 != -1) {
            return arg2.field9417;
        }
        if (arg2.field9405 != -1) {
            class662 var3 = arg1.field912.method1174(arg2.field9405, arg0);
            if (!var3.field9142) {
                return var3.field9137;
            }
        }
        return arg2.field9415;
    }
}
