import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class65 extends class515 {

    @OriginalMember(owner = "client!nr", name = "x", descriptor = "[[J")
    public static long[][] field879 = new long[8][256];

    @OriginalMember(owner = "client!nr", name = "H", descriptor = "[J")
    public static long[] field888 = new long[11];

    @OriginalMember(owner = "client!nr", name = "w", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!nr", name = "y", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!nr", name = "z", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!nr", name = "A", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!nr", name = "B", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!nr", name = "C", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!nr", name = "D", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!nr", name = "E", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!nr", name = "F", descriptor = "Llk;")
    public static class614 field887;

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            char var3 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(var0 / 2);
            long var4 = (long) ((var0 & 1) == 0 ? var3 >>> 8 : 255 & var3);
            long var6 = var4 << 1;
            if (~var6 <= -257L) {
                var6 ^= 285L;
            }
            long var8 = var6 << 1;
            if (~var8 <= -257L) {
                var8 ^= 285L;
            }
            long var10 = var8 ^ var4;
            long var12 = var8 << 1;
            if (var12 >= 256L) {
                var12 ^= 285L;
            }
            long var14 = var12 ^ var4;
            field879[0][var0] = class535.method3181(var14, class535.method3181(class535.method3181(var10 << 16, class535.method3181(class535.method3181(var4 << 32, class535.method3181(class535.method3181(var4 << 48, var4 << 56), var8 << 40)), var12 << 24)), var6 << 8));
            for (int var16 = 1; var16 < 8; ++var16) {
                field879[var16][var0] = class535.method3181(field879[var16 - 1][var0] << 56, field879[var16 - 1][var0] >>> 8);
            }
        }
        field888[0] = 0L;
        for (int var1 = 1; ~var1 >= -11; ++var1) {
            int var2 = var1 * 8 + -8;
            field888[var1] = class139.method1013(class139.method1013(class227.method1401(65280L, field879[6][var2 + 6]), class139.method1013(class139.method1013(class139.method1013(class227.method1401(field879[3][var2 + 3], 1095216660480L), class139.method1013(class227.method1401(field879[2][var2 + 2], 280375465082880L), class139.method1013(class227.method1401(field879[1][var2 + 1], 71776119061217280L), class227.method1401(-72057594037927936L, field879[0][var2])))), class227.method1401(4278190080L, field879[4][var2 + 4])), class227.method1401(16711680L, field879[5][var2 + 5]))), class227.method1401(field879[7][var2 + 7], 255L));
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BIII)V", line = 3)
    public final void method544(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 25) {
            method551(59);
        }
        super.field7255 = arg2;
        super.field7259 = arg3;
        super.field7268 = arg1;
        ++field881;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IF)V", line = 18)
    public final void method545(int arg0, float arg1) {
        ++field885;
        super.field7263 = arg1;
        if (arg0 != 0) {
            method552(-29, -13, 127, 30, 119);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IB)I", line = 30)
    public static final int method546(int arg0, byte arg1) {
        int var2 = -117 / ((arg1 - 33) / 38);
        ++field880;
        if (arg0 == 6406) {
            return 1;
        } else if (~arg0 == -6410) {
            return 1;
        } else if (~arg0 != -32842) {
            if (arg0 != 6410) {
                if (arg0 != 6407) {
                    if (arg0 == 6408) {
                        return 4;
                    } else {
                        throw new IllegalArgumentException("");
                    }
                } else {
                    return 3;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZI)Lhia;", line = 64)
    public static final class73 method547(boolean arg0, int arg1) {
        ++field878;
        class73 var2 = (class73) class55.field738.method1684((long) arg1, -359);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class651.field8990.method437(0, (byte) -28, arg1);
            class73 var4 = new class73();
            if (var3 != null) {
                var4.method690(new class403(var3), arg1, 3);
            }
            class55.field738.method1686(-25638, (long) arg1, var4);
            return arg0 ? null : var4;
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(IIIIIF)V", line = 89)
    public class65(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIJ)Ljava/lang/String;", line = 96)
    public static final String method548(int arg0, int arg1, long arg2) {
        ++field882;
        class200.method1297(-30414, arg2);
        int var4 = class532.field7493.get(5);
        int var5 = class532.field7493.get(2);
        int var6 = -71 % ((arg0 - -44) / 36);
        int var7 = class532.field7493.get(1);
        return arg1 == 3 ? class185.method1232(arg2, 2, arg1) : Integer.toString(var4 / 10) + var4 % 10 + "-" + class112.field1416[arg1][var5] + "-" + var7;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(III)Z", line = 118)
    public static final boolean method549(int arg0, int arg1, int arg2) {
        ++field886;
        if (arg0 != 2048) {
            return false;
        } else {
            return (2048 & arg2) != 0 | class563.method3264(arg1, arg2, -1) || class217.method1352(arg1, arg2, -86);
        }
    }

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "(I)V", line = 131)
    public static void method550(int arg0) {
        field888 = null;
        if (arg0 == 4547) {
            field887 = null;
            field879 = null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "(I)I", line = 145)
    public static final int method551(int arg0) {
        ++field883;
        if ((double) class9.field149 == 3.0D) {
            return 37;
        } else {
            if (arg0 != -27095) {
                field879 = null;
            }
            if ((double) class9.field149 == 4.0D) {
                return 50;
            } else if ((double) class9.field149 == 6.0D) {
                return 75;
            } else {
                return (double) class9.field149 == 8.0D ? 100 : 200;
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIII)V", line = 170)
    public static final void method552(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field884;
        class714 var5 = class350.method2072((long) arg0 << 32 | (long) arg1, arg4, (byte) 111);
        var5.method4043(arg4 ^ 6398);
        var5.field10018 = arg2;
        var5.field10021 = arg3;
    }
}
