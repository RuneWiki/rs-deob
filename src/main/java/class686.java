import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uja")
public class class686 extends class327 implements class225 {

    @OriginalMember(owner = "client!uja", name = "O", descriptor = "I")
    private int field9700;

    @OriginalMember(owner = "client!uja", name = "E", descriptor = "I")
    private int field9691;

    @OriginalMember(owner = "client!uja", name = "G", descriptor = "[J")
    public static long[] field9693 = new long[11];

    @OriginalMember(owner = "client!uja", name = "P", descriptor = "[[J")
    public static long[][] field9701 = new long[8][256];

    @OriginalMember(owner = "client!uja", name = "V", descriptor = "[[I")
    public static int[][] field9707;

    @OriginalMember(owner = "client!uja", name = "C", descriptor = "I")
    public static int field9690;

    @OriginalMember(owner = "client!uja", name = "F", descriptor = "I")
    public static int field9692;

    @OriginalMember(owner = "client!uja", name = "H", descriptor = "I")
    public static int field9694;

    @OriginalMember(owner = "client!uja", name = "J", descriptor = "I")
    public static int field9695;

    @OriginalMember(owner = "client!uja", name = "K", descriptor = "I")
    public static int field9696;

    @OriginalMember(owner = "client!uja", name = "L", descriptor = "I")
    public static int field9697;

    @OriginalMember(owner = "client!uja", name = "M", descriptor = "I")
    public static int field9698;

    @OriginalMember(owner = "client!uja", name = "N", descriptor = "I")
    public static int field9699;

    @OriginalMember(owner = "client!uja", name = "R", descriptor = "I")
    public static int field9703;

    @OriginalMember(owner = "client!uja", name = "S", descriptor = "I")
    public static int field9704;

    @OriginalMember(owner = "client!uja", name = "T", descriptor = "I")
    public static int field9705;

    @OriginalMember(owner = "client!uja", name = "U", descriptor = "I")
    public static int field9706;

    @OriginalMember(owner = "client!uja", name = "W", descriptor = "I")
    public static int field9708;

    @OriginalMember(owner = "client!uja", name = "Q", descriptor = "Lha;")
    public static class475 field9702;

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            char var3 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(var0 / 2);
            long var4 = (long) (~(var0 & 1) == -1 ? var3 >>> 8 : 255 & var3);
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
            field9701[0][var0] = class384.method2321(var14, class384.method2321(class384.method2321(var10 << 16, class384.method2321(class384.method2321(class384.method2321(var8 << 40, class384.method2321(var4 << 48, var4 << 56)), var4 << 32), var12 << 24)), var6 << 8));
            for (int var16 = 1; ~var16 > -9; ++var16) {
                field9701[var16][var0] = class384.method2321(field9701[var16 + -1][var0] >>> 8, field9701[var16 + -1][var0] << 56);
            }
        }
        field9693[0] = 0L;
        for (int var1 = 1; ~var1 >= -11; ++var1) {
            int var2 = var1 * 8 + -8;
            field9693[var1] = class112.method927(class561.method3266(255L, field9701[7][var2 + 7]), class112.method927(class561.method3266(65280L, field9701[6][var2 - -6]), class112.method927(class112.method927(class561.method3266(field9701[4][var2 - -4], 4278190080L), class112.method927(class112.method927(class112.method927(class561.method3266(-72057594037927936L, field9701[0][var2]), class561.method3266(field9701[1][var2 + 1], 71776119061217280L)), class561.method3266(field9701[2][var2 + 2], 280375465082880L)), class561.method3266(1095216660480L, field9701[3][var2 + 3]))), class561.method3266(field9701[5][var2 + 5], 16711680L))));
        }
        field9707 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };
    }

    @OriginalMember(owner = "client!uja", name = "f", descriptor = "(I)V", line = 3)
    public static void method3872(int arg0) {
        if (arg0 != 4) {
            field9702 = null;
        }
        field9702 = null;
        field9693 = null;
        field9701 = null;
        field9707 = null;
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(III[IIII)V", line = 16)
    public final void method336(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6) {
        ++field9696;
        int[] var8 = new int[this.field9700 * this.field9691];
        super.field4645.method988(1, this);
        OpenGL.glGetTexImagei(super.field4667, 0, 32993, 5121, var8, 0);
        int var9 = 0;
        if (arg4 != -7207) {
            this.method330(-2.1062589F, 24);
        }
        while (var9 < arg0) {
            class171.method1262(var8, (arg0 - (1 - arg6 - -var9)) * this.field9691, arg3, arg1 * var9 + arg5, arg1);
            ++var9;
        }
    }

    @OriginalMember(owner = "client!uja", name = "<init>", descriptor = "(Lfc;Lnea;IIZ[FII)V", line = 42)
    public class686(class642 arg0, class600 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class629.field8922, arg2 * arg3, arg4);
        this.field9700 = arg3;
        this.field9691 = arg2;
        super.field4645.method988(1, this);
        if (!arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method1990(arg3, arg2, -105, super.field4667, arg5);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field4667, 0, this.method1987(1683), arg2, arg3, 0, class177.method1293(70, super.field4659), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "([FIIIIIIILnea;)V", line = 65)
    public final void method3873(float[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class600 arg8) {
        super.field4645.method988(1, this);
        if (arg7 <= 117) {
            this.method336(50, 33, -86, (int[]) null, -46, 113, -60);
        }
        ++field9694;
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexSubImage2Df(super.field4667, 0, arg5, arg4, arg1, arg2, class177.method1293(42, arg8), 5121, arg0, arg3);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(IZLnea;I[BIIII)V", line = 79)
    public final void method331(int arg0, boolean arg1, class600 arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field9708;
        super.field4645.method988(1, this);
        OpenGL.glPixelStorei(3317, 1);
        if (!arg1) {
            this.method328(5, 0.54412127F);
        }
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexSubImage2Dub(super.field4667, 0, arg0, arg3, arg6, arg8, class177.method1293(99, arg2), 5121, arg4, arg7);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(II[IIIIII)V", line = 96)
    public final void method329(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field9705;
        super.field4645.method988(1, this);
        OpenGL.glPixelStorei(3314, arg0);
        OpenGL.glTexSubImage2Di(super.field4667, 0, arg5, arg1, arg4, arg3, 32993, super.field4645.field9137, arg2, arg6);
        OpenGL.glPixelStorei(3314, 0);
        if (arg7 != -27716) {
            this.method331(-76, false, (class600) null, 93, (byte[]) null, 122, 74, 94, 118);
        }
    }

    @OriginalMember(owner = "client!uja", name = "<init>", descriptor = "(Lfc;IIZ[III)V", line = 110)
    public class686(class642 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class133.field2225, class629.field8918, arg1 * arg2, arg3);
        this.field9700 = arg2;
        this.field9691 = arg1;
        super.field4645.method988(1, this);
        if (arg3 && arg6 == 0 && arg5 == 0) {
            this.method1993((byte) -28, arg1, super.field4667, arg4, arg2);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field4667, 0, 6408, this.field9691, this.field9700, 0, 32993, super.field4645.field9137, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!uja", name = "b", descriptor = "(I)I", line = 134)
    public final int method338(int arg0) {
        ++field9692;
        int var2 = 48 / ((arg0 - -16) / 52);
        return this.field9700;
    }

    @OriginalMember(owner = "client!uja", name = "<init>", descriptor = "(Lfc;Lnea;Ldr;II)V", line = 144)
    public class686(class642 arg0, class600 arg1, class629 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field9700 = arg4;
        this.field9691 = arg3;
        super.field4645.method988(1, this);
        OpenGL.glTexImage2Dub(super.field4667, 0, this.method1987(1683), arg3, arg4, 0, class177.method1293(121, super.field4659), class3.method23(false, super.field4665), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(FI)F", line = 155)
    public final float method330(float arg0, int arg1) {
        ++field9690;
        int var3 = -80 / ((78 - arg1) / 47);
        return arg0 / (float) this.field9700;
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(ZZI)V", line = 167)
    public final void method333(boolean arg0, boolean arg1, int arg2) {
        ++field9704;
        super.field4645.method988(arg2 ^ 7537, this);
        OpenGL.glTexParameteri(super.field4667, 10242, arg0 ? 10497 : 33071);
        OpenGL.glTexParameteri(super.field4667, 10243, arg1 ? 10497 : 33071);
        if (arg2 != 7536) {
            this.method3873((float[]) null, 8, 2, -20, 126, 37, 44, -66, (class600) null);
        }
    }

    @OriginalMember(owner = "client!uja", name = "<init>", descriptor = "(Lfc;Lnea;IIZ[BII)V", line = 181)
    public class686(class642 arg0, class600 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class629.field8918, arg2 * arg3, arg4);
        this.field9700 = arg3;
        this.field9691 = arg2;
        super.field4645.method988(1, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method1992(arg2, arg5, super.field4667, 55, arg3);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field4667, 0, this.method1987(1683), arg2, arg3, 0, class177.method1293(107, super.field4659), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!uja", name = "b", descriptor = "(B)I", line = 208)
    public final int method334(byte arg0) {
        ++field9699;
        int var2 = 13 % ((arg0 - 30) / 37);
        return this.field9691;
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(IF)F", line = 220)
    public final float method328(int arg0, float arg1) {
        ++field9695;
        if (arg0 != 431) {
            method3875((class431) null, 30);
        }
        return arg1 / (float) this.field9691;
    }

    @OriginalMember(owner = "client!uja", name = "e", descriptor = "(B)I", line = 231)
    public static final int method3874(byte arg0) {
        ++field9697;
        int var1 = -70 % ((arg0 - -63) / 60);
        class475 var2 = field9702;
        boolean var3 = false;
        if (class420.field5820.field9482.method2338(17539) != 0) {
            Canvas var4 = new Canvas();
            var4.setSize(100, 100);
            var2 = class399.method2369(72, (class513) null, 0, var4, 0, (class103) null);
            var3 = true;
        }
        long var5 = class337.method2062(false);
        for (int var7 = 0; ~var7 > -10001; ++var7) {
            var2.method441(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
        }
        int var8 = (int) (class337.method2062(false) + -var5);
        var2.method2765(0, 100, 105, -16777216, 0, 100);
        if (var3) {
            var2.method2779((byte) -92);
        }
        return var8;
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(B)Z", line = 273)
    public final boolean method337(byte arg0) {
        if (arg0 != 7) {
            this.field9691 = -105;
        }
        ++field9698;
        return true;
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lol;I)Lraa;", line = 353)
    public static final class510 method3875(class431 arg0, int arg1) {
        ++field9703;
        if (arg1 > -61) {
            field9702 = null;
        }
        class714 var2 = class677.method3792(arg0, 0);
        int var3 = arg0.method2565((byte) -109);
        int var4 = arg0.method2565((byte) -112);
        int var5 = arg0.method2565((byte) -108);
        int var6 = arg0.method2565((byte) -100);
        int var7 = arg0.method2565((byte) -92);
        int var8 = arg0.method2565((byte) -106);
        return new class510(var2.field9967, var2.field9961, var2.field9958, var2.field9969, var2.field9960, var2.field9968, var2.field9970, var2.field9962, var2.field9959, var3, var4, var5, var6, var7, var8);
    }
}
