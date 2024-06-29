import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class8 {

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public int field79;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Z")
    public boolean field83;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Z")
    public boolean field85;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "[S")
    public short[] field77;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    public int field98;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    private int field84;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "[J")
    public static long[] field91 = new long[11];

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "[[J")
    public static long[][] field96 = new long[8][256];

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "Ltw;")
    public static class233 field97;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "[B")
    public static byte[] field99;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    private int field76;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    private int field87;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    private int field92;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    private int field95;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Lam;")
    public class289 field90;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIII)V")
    public final void method31(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field76 = arg2;
        this.field92 = arg4;
        if (arg0 != 1202077096) {
            this.method31(-12, -57, 99, 20, -99);
        }
        this.field87 = arg1;
        field86++;
        this.field95 = arg3;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BZ[B)Ljava/lang/Object;")
    public static final Object method32(byte arg0, boolean arg1, byte[] arg2) {
        field78++;
        if (arg0 != -69) {
            method37(-0.87253517F, (byte) 103, -104, 1.6023748F, 1.0785098F);
        }
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class60.field874) {
            try {
                class691 var3 = (class691) Class.forName("oh").getDeclaredConstructor().newInstance();
                var3.method3366(100, arg2);
                return var3;
            } catch (Throwable var4) {
                class60.field874 = true;
            }
        }
        return arg1 ? class484.method2825(arg2, -124) : arg2;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIILr;III)V")
    private final void method33(int arg0, int arg1, int arg2, class98 arg3, int arg4, int arg5, int arg6) {
        this.field90 = arg3.method784(arg5, arg6, arg2, arg0, arg1, (float) arg4);
        field89++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    private final void method34(int arg0) {
        field80++;
        int var2 = this.field98;
        if (var2 == 2) {
            this.field76 = 0;
            this.field92 = 1;
            this.field87 = 2048;
            this.field95 = 2048;
        } else if (var2 == 3) {
            this.field95 = 4096;
            this.field92 = 1;
            this.field76 = 0;
            this.field87 = 2048;
        } else if (var2 == 4) {
            this.field87 = 2048;
            this.field92 = 4;
            this.field95 = 2048;
            this.field76 = 0;
        } else if (var2 == 5) {
            this.field92 = 4;
            this.field76 = 0;
            this.field87 = 2048;
            this.field95 = 8192;
        } else if (var2 == 12) {
            this.field87 = 2048;
            this.field76 = 0;
            this.field95 = 2048;
            this.field92 = 2;
        } else if (var2 == 13) {
            this.field76 = 0;
            this.field95 = 8192;
            this.field87 = 2048;
            this.field92 = 2;
        } else if (var2 == 10) {
            this.field76 = 1536;
            this.field95 = 2048;
            this.field87 = 512;
            this.field92 = 3;
        } else if (var2 == 11) {
            this.field76 = 1536;
            this.field95 = 4096;
            this.field87 = 512;
            this.field92 = 3;
        } else if (var2 == 6) {
            this.field76 = 1280;
            this.field92 = 3;
            this.field87 = 768;
            this.field95 = 2048;
        } else if (var2 == 7) {
            this.field92 = 3;
            this.field95 = 4096;
            this.field87 = 768;
            this.field76 = 1280;
        } else if (var2 == 8) {
            this.field92 = 3;
            this.field87 = 1024;
            this.field76 = 1024;
            this.field95 = 2048;
        } else if (var2 == 9) {
            this.field92 = 3;
            this.field76 = 1024;
            this.field95 = 4096;
            this.field87 = 1024;
        } else if (var2 == 14) {
            this.field76 = 1280;
            this.field95 = 2048;
            this.field87 = 768;
            this.field92 = 1;
        } else if (var2 == 15) {
            this.field87 = 512;
            this.field92 = 1;
            this.field76 = 1536;
            this.field95 = 4096;
        } else if (var2 == 16) {
            this.field92 = 1;
            this.field95 = 8192;
            this.field76 = 1792;
            this.field87 = 256;
        } else {
            this.field87 = 2048;
            this.field76 = 0;
            this.field95 = 2048;
            this.field92 = 0;
        }
        int var3 = 68 % ((arg0 - 13) / 57);
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
    public static final void method35(int arg0) {
        class376.field5209.method2229((byte) -80);
        field88++;
        int var1 = class376.field5209.method2231(8, -98);
        if (var1 < class310.field4304) {
            for (int var2 = var1; var2 < class310.field4304; var2++) {
                class417.field5940[class591.field8601++] = class253.field3667[var2];
            }
        }
        if (class310.field4304 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class310.field4304 = 0;
        int var3 = 105 % ((-arg0 - 22) / 53);
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class253.field3667[var4];
            class88 var6 = ((class6) class314.field4359.method2818(-22803, (long) var5)).field49;
            int var7 = class376.field5209.method2231(1, 86);
            if (var7 == 0) {
                class253.field3667[class310.field4304++] = var5;
                var6.field2431 = class148.field2508;
            } else {
                int var8 = class376.field5209.method2231(2, -121);
                if (var8 == 0) {
                    class253.field3667[class310.field4304++] = var5;
                    var6.field2431 = class148.field2508;
                    class694.field9858[class550.field8070++] = var5;
                } else if (var8 == 1) {
                    class253.field3667[class310.field4304++] = var5;
                    var6.field2431 = class148.field2508;
                    int var9 = class376.field5209.method2231(3, 116);
                    var6.method663(1, var9, -3);
                    int var10 = class376.field5209.method2231(1, 85);
                    if (var10 == 1) {
                        class694.field9858[class550.field8070++] = var5;
                    }
                } else if (var8 == 2) {
                    class253.field3667[class310.field4304++] = var5;
                    var6.field2431 = class148.field2508;
                    if (class376.field5209.method2231(1, -56) == 1) {
                        int var11 = class376.field5209.method2231(3, 86);
                        var6.method663(2, var11, -3);
                        int var12 = class376.field5209.method2231(3, -106);
                        var6.method663(2, var12, -3);
                    } else {
                        int var13 = class376.field5209.method2231(3, 117);
                        var6.method663(0, var13, -3);
                    }
                    int var14 = class376.field5209.method2231(1, -114);
                    if (var14 == 1) {
                        class694.field9858[class550.field8070++] = var5;
                    }
                } else if (var8 == 3) {
                    class417.field5940[class591.field8601++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILwv;ILjava/awt/Component;I)Lpda;")
    public static final class138 method36(int arg0, class705 arg1, int arg2, Component arg3, int arg4) {
        field82++;
        if (class616.field8814 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class138 var5 = (class138) Class.forName("al").getDeclaredConstructor().newInstance();
                var5.field2243 = arg0;
                if (arg2 != 3) {
                    method40((byte) -35);
                }
                var5.field2236 = new int[(class525.field7704 ? 2 : 1) * 256];
                var5.method1056(arg3);
                var5.field2247 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field2247 > 16384) {
                    var5.field2247 = 16384;
                }
                var5.method1049(var5.field2247);
                if (class551.field8077 > 0 && class35.field488 == null) {
                    class35.field488 = new class239();
                    class35.field488.field3522 = arg1;
                    arg1.method3968(class35.field488, class551.field8077, (byte) 13);
                }
                if (class35.field488 != null) {
                    if (class35.field488.field3519[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class35.field488.field3519[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class630 var6 = new class630(arg1, arg4);
                    var6.field2236 = new int[(class525.field7704 ? 2 : 1) * 256];
                    var6.field2243 = arg0;
                    var6.method1056(arg3);
                    var6.field2247 = 16384;
                    var6.method1049(var6.field2247);
                    if (class551.field8077 > 0 && class35.field488 == null) {
                        class35.field488 = new class239();
                        class35.field488.field3522 = arg1;
                        arg1.method3968(class35.field488, class551.field8077, (byte) 13);
                    }
                    if (class35.field488 != null) {
                        if (class35.field488.field3519[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class35.field488.field3519[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class138();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(FBIFF)F")
    public static final float method37(float arg0, byte arg1, int arg2, float arg3, float arg4) {
        field81++;
        if (arg1 >= -15) {
            return -1.1125638F;
        } else {
            float[] var5 = class662.field9305[arg2];
            return var5[2] * arg4 + var5[1] * arg3 + var5[0] * arg0;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BZI)V")
    public final void method38(byte arg0, boolean arg1, int arg2) {
        field93++;
        int var4;
        if (arg1) {
            var4 = 2048;
        } else {
            int var5 = this.field95 * arg2 / 50 + this.field84 & 0x7FF;
            int var6 = this.field92;
            if (var6 == 1) {
                var4 = (class302.field4241[var5 << 3] >> 4) + 1024;
            } else if (var6 == 3) {
                var4 = class694.field9853[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 < 1024 ? var5 : 2048 - var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        if (arg0 != -110) {
            this.method31(22, 114, -15, -77, 6);
        }
        this.field90.method1778((float) ((this.field87 * var4 >> 11) + this.field76) / 2048.0F, (byte) 105);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI[II[Ljava/lang/Object;)V")
    public static final void method39(byte arg0, int arg1, int[] arg2, int arg3, Object[] arg4) {
        if (arg3 > arg1) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg1;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var7;
            Object var8 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
            for (int var10 = arg1; var10 < arg3; var10++) {
                if (arg2[var10] < (var9 & var10) + var7) {
                    int var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    Object var12 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6++] = var12;
                }
            }
            arg2[arg3] = arg2[var6];
            arg2[var6] = var7;
            arg4[arg3] = arg4[var6];
            arg4[var6] = var8;
            method39((byte) -128, arg1, arg2, var6 - 1, arg4);
            method39((byte) -36, var6 + 1, arg2, arg3, arg4);
        }
        if (arg0 >= -21) {
            method37(-1.0987179F, (byte) 58, 81, 1.3974077F, -0.41628072F);
        }
        field94++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static void method40(byte arg0) {
        field96 = null;
        field91 = null;
        field97 = null;
        field99 = null;
        int var1 = -36 / ((7 - arg0) / 57);
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
    protected class8() {
        if (class694.field9853 == null) {
            class65.method541((byte) 110);
        }
        this.method34(-55);
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lr;Lek;I)V")
    public class8(class98 arg0, class465 arg1, int arg2) {
        if (class694.field9853 == null) {
            class65.method541((byte) 97);
        }
        this.field79 = arg1.method2705(-73);
        this.field83 = (this.field79 & 0x8) != 0;
        this.field85 = (this.field79 & 0x10) != 0;
        this.field79 &= 0x7;
        int var4 = arg1.method2755((byte) -49) << arg2;
        int var5 = arg1.method2755((byte) -104) << arg2;
        int var6 = arg1.method2755((byte) -107) << arg2;
        int var7 = arg1.method2705(-31);
        int var8 = var7 * 2 + 1;
        this.field77 = new short[var8];
        for (int var9 = 0; var9 < this.field77.length; var9++) {
            short var13 = (short) arg1.method2755((byte) -105);
            int var14 = var13 >>> 8;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if ((var8 - var14) < var15) {
                var15 = var8 - var14;
            }
            this.field77[var9] = (short) class460.method2676(var15, var14 << 8);
        }
        int var10 = (var7 << class49.field637) + class211.field3229;
        int var11 = class531.field7839 == null ? class324.field4520[class420.method2483(arg1.method2755((byte) -82), 0) & 0xFFFF] : class531.field7839[arg1.method2755((byte) -78)];
        int var12 = arg1.method2705(-19);
        this.field98 = var12 & 0x1F;
        this.field84 = var12 & 0xE0 << 3;
        if (this.field98 != 31) {
            this.method34(82);
        }
        this.method33(var10, var11, var5, arg0, 1, var4, var6);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            char var6 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(var0 / 2);
            long var7 = (long) ((var0 & 0x1) == 0 ? var6 >>> 8 : var6 & 0xFF);
            long var9 = var7 << 1;
            if (var9 >= 256L) {
                var9 ^= 0x11DL;
            }
            long var11 = var9 << 1;
            if (var11 >= 256L) {
                var11 ^= 0x11DL;
            }
            long var13 = var11 ^ var7;
            long var15 = var11 << 1;
            if (var15 >= 256L) {
                var15 ^= 0x11DL;
            }
            long var17 = var7 ^ var15;
            field96[0][var0] = class631.method3564(var17, class631.method3564(class631.method3564(class631.method3564(var15 << 24, class631.method3564(var7 << 32, class631.method3564(var11 << 40, class631.method3564(var7 << 56, var7 << 48)))), var13 << 16), var9 << 8));
            for (int var19 = 1; var19 < 8; var19++) {
                field96[var19][var0] = class631.method3564(field96[var19 - 1][var0] >>> 8, field96[var19 - 1][var0] << 56);
            }
        }
        field91[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var5 = var1 * 8 - 8;
            field91[var1] = class302.method1853(class613.method3468(255L, field96[7][var5 + 7]), class302.method1853(class613.method3468(field96[6][var5 + 6], 65280L), class302.method1853(class302.method1853(class613.method3468(4278190080L, field96[4][var5 + 4]), class302.method1853(class302.method1853(class302.method1853(class613.method3468(-72057594037927936L, field96[0][var5]), class613.method3468(71776119061217280L, field96[1][var5 + 1])), class613.method3468(field96[2][var5 + 2], 280375465082880L)), class613.method3468(field96[3][var5 + 3], 1095216660480L))), class613.method3468(field96[5][var5 + 5], 16711680L))));
        }
        field97 = new class233();
        field99 = new byte[32896];
        int var2 = 0;
        for (int var3 = 0; var3 < 256; var3++) {
            for (int var4 = 0; var4 <= var3; var4++) {
                field99[var2++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var3 * var3 + var4 * var4 + 65535) / 65535.0F))));
            }
        }
    }
}
