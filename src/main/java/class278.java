import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class278 {

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public int field3930;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public int field3935;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public int field3925;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public int field3929;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "[[I")
    public int[][] field3932;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "[[J")
    public static long[][] field3931 = new long[8][256];

    @OriginalMember(owner = "client!s", name = "j", descriptor = "[J")
    public static long[] field3934 = new long[11];

    @OriginalMember(owner = "client!s", name = "l", descriptor = "[I")
    public static int[] field3936;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "[I")
    public static int[] field3937;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZ)Z")
    public static boolean method1808(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method1809(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1810(class180 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1811(class180 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method1812(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method1813(class180 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method1814(int arg0) {
        field3937 = null;
        if (arg0 != 5871) {
            field3931 = null;
        }
        field3931 = null;
        field3936 = null;
        field3934 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I")
    public final int method1815(int arg0, int arg1, int arg2) {
        field3926++;
        int var4 = arg1 >> this.field3929;
        int var5 = arg0 >> this.field3929;
        if (var4 < 0 || var5 < 0 || this.field3935 - 1 < var4 || var5 > this.field3930 - 1) {
            return 0;
        }
        int var6 = -113 / ((arg2 + 78) / 44);
        int var7 = arg1 & this.field3925 - 1;
        int var8 = this.field3925 - 1 & arg0;
        int var9 = (this.field3925 - var7) * this.field3932[var4][var5] + (this.field3932[var4 + 1][var5] * var7) >> this.field3929;
        int var10 = (this.field3925 - var7) * this.field3932[var4][var5 + 1] + this.field3932[var4 + 1][var5 + 1] * var7 >> this.field3929;
        return (this.field3925 - var8) * var9 + var8 * var10 >> this.field3929;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BII)I")
    public final int method1816(byte arg0, int arg1, int arg2) {
        int var4 = -28 / ((89 - arg0) / 32);
        field3927++;
        return this.field3932[arg2][arg1];
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method1817(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1818(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1819(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1820(boolean arg0, int arg1) {
        field3933++;
        if (!arg0) {
            field3937 = null;
        }
        return arg1 == 5 || arg1 == 51 || arg1 == 50 || arg1 == 9 || arg1 == 2 || arg1 == 19 || arg1 == 30;
    }

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method1821();

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class180 method1822(int arg0, int arg1, class180 arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method1823(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lwi;[I)V")
    public abstract void method1824(class465 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1825(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V")
    public class278(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field3930 = arg1;
        this.field3935 = arg0;
        int var5 = 0;
        while (arg2 > 1) {
            var5++;
            arg2 >>= 0x1;
        }
        this.field3925 = 0x1 << var5;
        this.field3929 = var5;
        this.field3932 = arg3;
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
            long var14 = var12 ^ var4;
            field3931[0][var0] = class744.method4145(class744.method4145(class744.method4145(var10 << 16, class744.method4145(class744.method4145(class744.method4145(var8 << 40, class744.method4145(var4 << 56, var4 << 48)), var4 << 32), var12 << 24)), var6 << 8), var14);
            for (int var16 = 1; var16 < 8; var16++) {
                field3931[var16][var0] = class744.method4145(field3931[var16 - 1][var0] >>> 8, field3931[var16 - 1][var0] << 56);
            }
        }
        field3934[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = (var1 - 1) * 8;
            field3934[var1] = class166.method1085(class166.method1085(class166.method1085(class21.method132(16711680L, field3931[5][var2 + 5]), class166.method1085(class166.method1085(class21.method132(1095216660480L, field3931[3][var2 + 3]), class166.method1085(class21.method132(field3931[2][var2 + 2], 280375465082880L), class166.method1085(class21.method132(field3931[1][var2 + 1], 71776119061217280L), class21.method132(-72057594037927936L, field3931[0][var2])))), class21.method132(field3931[4][var2 + 4], 4278190080L))), class21.method132(65280L, field3931[6][var2 + 6])), class21.method132(255L, field3931[7][var2 + 7]));
        }
        field3936 = new int[3];
    }
}
