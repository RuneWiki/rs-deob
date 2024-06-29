import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class410 {

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "I")
    private int field5820 = -1;

    @OriginalMember(owner = "client!qv", name = "m", descriptor = "Z")
    private boolean field5826 = true;

    @OriginalMember(owner = "client!qv", name = "p", descriptor = "I")
    private int field5829;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    private int field5814;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "[Lju;")
    private class110[] field5816;

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "I")
    private int field5821;

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "I")
    private int field5822;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "[Lju;")
    private class110[] field5817;

    @OriginalMember(owner = "client!qv", name = "k", descriptor = "Lju;")
    private class110 field5824;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "[[J")
    public static long[][] field5815 = new long[8][256];

    @OriginalMember(owner = "client!qv", name = "n", descriptor = "[J")
    public static long[] field5827 = new long[11];

    @OriginalMember(owner = "client!qv", name = "u", descriptor = "Z")
    public static boolean field5834 = false;

    @OriginalMember(owner = "client!qv", name = "v", descriptor = "Llh;")
    public static class487 field5835;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
    private int field5819;

    @OriginalMember(owner = "client!qv", name = "l", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!qv", name = "o", descriptor = "I")
    private int field5828;

    @OriginalMember(owner = "client!qv", name = "q", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!qv", name = "r", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!qv", name = "s", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!qv", name = "t", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "Lf;")
    private class702 field5818;

    @OriginalMember(owner = "client!qv", name = "j", descriptor = "Ljava/awt/Font;")
    public static Font field5823;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
    public final void method2387(int arg0) {
        if (this.field5816 != null) {
            for (int var2 = 0; var2 < this.field5816.length; var2++) {
                this.field5816[var2].method798();
            }
        }
        field5833++;
        this.field5818 = null;
        if (arg0 > -109) {
            method2389(null, -25);
        }
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(I)V")
    public static void method2388(int arg0) {
        if (arg0 != -1) {
            field5827 = null;
        }
        field5815 = null;
        field5827 = null;
        field5835 = null;
        field5823 = null;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lmw;I)I")
    public static final int method2389(class455 arg0, int arg1) {
        field5832++;
        int var2 = arg0.method2592((byte) 65, 2);
        if (arg1 > -120) {
            return 74;
        }
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method2592((byte) -105, 5);
        } else if (var2 == 2) {
            var3 = arg0.method2592((byte) 24, 8);
        } else {
            var3 = arg0.method2592((byte) 31, 11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lr;IIIIIIIII)V")
    public final void method2390(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5830++;
        int var11 = arg6 + arg8 & 0x3FFF;
        if (this.field5822 == -1 || this.field5819 == 0) {
            arg0.method110(arg3, arg5, arg1, arg4, arg9, 0);
        } else {
            class686 var12 = class84.field1249.method1365(arg2 ^ 0xFFFFB9E2, this.field5822);
            if (this.field5818 == null && class84.field1249.method1367(this.field5822, false)) {
                int[] var13 = var12.field9784 ? class84.field1249.method1370(0.7F, false, this.field5819, (byte) -16, this.field5819, this.field5822) : class84.field1249.method1366(false, this.field5822, this.field5819, 0.7F, this.field5819, (byte) -118);
                this.field5818 = arg0.method175(var13, 0, this.field5819, this.field5819, this.field5819);
            }
            if (var12.field9784) {
                arg0.method110(arg3, arg5, arg1, arg4, arg9, 0);
            }
            if (this.field5818 != null) {
                int var14 = var12.field9784 ? 1 : 0;
                int var15 = arg4 * arg7 / -4096;
                int var16;
                for (var16 = (arg1 - arg4) / 2 + (arg4 * var11 / 4096); var16 > arg4; var16 -= arg4) {
                }
                while (arg4 < var15) {
                    var15 -= arg4;
                }
                while (var16 < 0) {
                    var16 += arg4;
                }
                while (var15 < 0) {
                    var15 += arg4;
                }
                for (int var17 = var16 - arg4; var17 < arg1; var17 += arg4) {
                    for (int var18 = var15 - arg4; var18 < arg4; var18 += arg4) {
                        this.field5818.method3934(arg3 + var17, var18 - -arg5, arg4, arg4, 1, 0, var14);
                    }
                }
            }
        }
        if (arg2 == 3) {
            for (int var19 = this.field5828 - 1; var19 >= 0; var19--) {
                this.field5817[var19].method795(arg0, arg3, arg5, arg1, arg4, arg7, var11);
            }
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lr;BI)Z")
    public final boolean method2391(class166 arg0, byte arg1, int arg2) {
        if (arg1 != 126) {
            return true;
        }
        field5825++;
        if (this.field5820 != arg2) {
            this.field5820 = arg2;
            int var4 = class180.method1240(arg2, -1);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field5819 != var4) {
                this.field5819 = var4;
                this.field5818 = null;
            }
            if (this.field5816 != null) {
                this.field5828 = 0;
                int[] var5 = new int[this.field5816.length];
                for (int var6 = 0; var6 < this.field5816.length; var6++) {
                    class110 var7 = this.field5816[var6];
                    if (var7.method799(this.field5829, this.field5821, this.field5814, this.field5820)) {
                        var5[this.field5828] = var7.field1522;
                        this.field5817[this.field5828++] = var7;
                    }
                }
                class206.method1335(0, this.field5817, 0, var5, this.field5828 - 1);
            }
            this.field5826 = true;
        }
        boolean var8 = false;
        if (this.field5826) {
            this.field5826 = false;
            for (int var9 = this.field5828 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field5817[var9].method797(arg0, this.field5824);
                var8 |= var10;
                this.field5826 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IZ[BLjava/lang/String;)I")
    public static final int method2392(int arg0, boolean arg1, byte[] arg2, String arg3) {
        field5831++;
        int var4 = arg0;
        int var5 = arg3.length();
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class469.method2657(14198, arg3.charAt(var6));
            int var8 = var6 + 1 < var5 ? class469.method2657(14198, arg3.charAt(var6 + 1)) : -1;
            int var9 = var5 <= var6 + 2 ? -1 : class469.method2657(14198, arg3.charAt(var6 + 2));
            int var10 = var6 + 3 < var5 ? class469.method2657(14198, arg3.charAt(var6 + 3)) : -1;
            arg2[arg0++] = (byte) class647.method3617(var7 << 2, var8 >>> 4);
            if (var9 == -1) {
                break;
            }
            arg2[arg0++] = (byte) class647.method3617(class136.method950(15, var8) << 4, var9 >>> 2);
            if (var10 == -1) {
                break;
            }
            arg2[arg0++] = (byte) class647.method3617(class136.method950(var9, 3) << 6, var10);
        }
        if (arg1) {
            method2392(123, true, null, null);
        }
        return arg0 - var4;
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(I[Lju;IIII)V")
    public class410(int arg0, class110[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5829 = arg3;
        this.field5814 = arg5;
        this.field5816 = arg1;
        this.field5821 = arg4;
        this.field5822 = arg0;
        if (arg1 == null) {
            this.field5817 = null;
            this.field5824 = null;
        } else {
            this.field5817 = new class110[arg1.length];
            this.field5824 = arg2 >= 0 ? arg1[arg2] : null;
        }
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
            field5815[0][var0] = class525.method2990(class525.method2990(var6 << 8, class525.method2990(class525.method2990(class525.method2990(class525.method2990(class525.method2990(var4 << 48, var4 << 56), var8 << 40), var4 << 32), var12 << 24), var10 << 16)), var14);
            for (int var16 = 1; var16 < 8; var16++) {
                field5815[var16][var0] = class525.method2990(field5815[var16 - 1][var0] >>> 8, field5815[var16 - 1][var0] << 56);
            }
        }
        field5827[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = var1 * 8 - 8;
            field5827[var1] = class506.method2889(class231.method1456(255L, field5815[7][var2 + 7]), class506.method2889(class231.method1456(65280L, field5815[6][var2 + 6]), class506.method2889(class231.method1456(16711680L, field5815[5][var2 + 5]), class506.method2889(class231.method1456(4278190080L, field5815[4][var2 + 4]), class506.method2889(class506.method2889(class506.method2889(class231.method1456(field5815[1][var2 + 1], 71776119061217280L), class231.method1456(-72057594037927936L, field5815[0][var2])), class231.method1456(field5815[2][var2 + 2], 280375465082880L)), class231.method1456(field5815[3][var2 + 3], 1095216660480L))))));
        }
        field5835 = new class487(8, -1);
    }
}
