import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class186 {

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public int field3032 = -1;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public int field3030 = -1;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public int field3031 = -1;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public int field3041 = -1;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public int field3042 = -1;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public int field3040 = 99;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "Z")
    private boolean field3039 = false;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public int field3049 = 5;

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "Z")
    public boolean field3057 = false;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
    public int field3059 = 2;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "Lij;")
    public static class50 field3044 = class78.method578(124, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    public static int field3048 = 0;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "Lij;")
    public static class50 field3051 = class78.method578(127, "Spieler");

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "Lij;")
    public static class50 field3053 = class78.method578(123, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "Ln;")
    public static class138 field3058;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "[I")
    public int[] field3038;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "[I")
    public int[] field3043;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "[I")
    private int[] field3045;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "[I")
    private int[] field3046;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "[[I")
    public int[][] field3034;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "[[[B")
    public static byte[][][] field3056;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lwd;BI)V")
    private final void method1249(class217 arg0, byte arg1, int arg2) {
        field3055++;
        if (arg2 == 1) {
            int var4 = arg0.method1441(arg1 ^ 0x5F);
            this.field3038 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3038[var5] = arg0.method1441(111);
            }
            this.field3043 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3043[var6] = arg0.method1441(124);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3043[var7] = (arg0.method1441(103) << 16) + this.field3043[var7];
            }
        } else if (arg2 == 2) {
            this.field3030 = arg0.method1441(arg1 - 178);
        } else if (arg2 == 3) {
            int var8 = arg0.method1487(arg1 + 199);
            this.field3046 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3046[var9] = arg0.method1487(255);
            }
            this.field3046[var8] = 9999999;
        } else if (arg2 == 4) {
            this.field3057 = true;
        } else if (arg2 == 5) {
            this.field3049 = arg0.method1487(255);
        } else if (arg2 == 6) {
            this.field3032 = arg0.method1441(82);
        } else if (arg2 == 7) {
            this.field3042 = arg0.method1441(89);
        } else if (arg2 == 8) {
            this.field3040 = arg0.method1487(arg1 ^ 0xC7);
        } else if (arg2 == 9) {
            this.field3041 = arg0.method1487(255);
        } else if (arg2 == 10) {
            this.field3031 = arg0.method1487(arg1 ^ 0xC7);
        } else if (arg2 == 11) {
            this.field3059 = arg0.method1487(255);
        } else if (arg2 == 12) {
            int var14 = arg0.method1487(arg1 + 199);
            this.field3045 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field3045[var15] = arg0.method1441(class201.method1339(arg1, 125));
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field3045[var16] += arg0.method1441(68) << 16;
            }
        } else if (arg2 == 13) {
            int var10 = arg0.method1441(74);
            this.field3034 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg0.method1487(255);
                if (var12 > 0) {
                    this.field3034[var11] = new int[var12];
                    this.field3034[var11][0] = arg0.method1447(arg1 - 90);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field3034[var11][var13] = arg0.method1441(arg1 + 19);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field3039 = true;
        }
        if (arg1 != 56) {
            this.field3045 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lwg;II)Lwg;")
    public final class98 method1250(class98 arg0, int arg1, int arg2) {
        field3052++;
        int var4 = this.field3043[arg1];
        class227 var5 = class19.method144(-15731, var4 >> 16);
        int var6 = -83 % ((arg2 - 73) / 46);
        int var7 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method737(true, true);
        } else {
            class98 var8 = arg0.method737(!var5.method1551(2, var7), !this.field3039);
            var8.method738(var5, var7, this.field3039);
            return var8;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public final void method1251(int arg0) {
        if (this.field3031 == -1) {
            if (this.field3046 == null) {
                this.field3031 = 0;
            } else {
                this.field3031 = 2;
            }
        }
        if (~this.field3041 == arg0) {
            if (this.field3046 == null) {
                this.field3041 = 0;
            } else {
                this.field3041 = 2;
            }
        }
        field3060++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILwg;I)Lwg;")
    public final class98 method1252(int arg0, class98 arg1, int arg2) {
        int var4 = this.field3043[arg2];
        field3035++;
        class227 var5 = class19.method144(arg0 ^ 0x8920063D, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method743(true, true);
        } else if (arg0 == 1994376368) {
            class98 var7 = arg1.method743(!var5.method1551(2, var6), !this.field3039);
            var7.method738(var5, var6, this.field3039);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lda;B)V")
    public static final void method1253(class22 arg0, byte arg1) {
        class43.field788 = arg0;
        class255.field4404 = class43.field788.method180(false, 16);
        field3033++;
        int var2 = -110 / ((arg1 - 46) / 33);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lwg;IIZ)Lwg;")
    public final class98 method1254(class98 arg0, int arg1, int arg2, boolean arg3) {
        field3037++;
        int var5 = this.field3043[arg1];
        if (arg3) {
            return null;
        }
        class227 var6 = class19.method144(-15731, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method743(true, true);
        }
        int var8 = arg2 & 0x3;
        class98 var9 = arg0.method743(!var6.method1551(2, var7), !this.field3039);
        if (var8 == 1) {
            var9.method742();
        } else if (var8 == 2) {
            var9.method749();
        } else if (var8 == 3) {
            var9.method740();
        }
        var9.method738(var6, var7, this.field3039);
        if (var8 == 1) {
            var9.method740();
        } else if (var8 == 2) {
            var9.method749();
        } else if (var8 == 3) {
            var9.method742();
        }
        return var9;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILwd;)V")
    public final void method1255(int arg0, class217 arg1) {
        field3050++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method1487(255);
            if (var3 == 0) {
                return;
            }
            this.method1249(arg1, (byte) 56, var3);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIII)V")
    public static final void method1256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class155.method1090(class177.field2963[arg0], arg5 - arg4, arg1, 160, arg4 + arg5);
        field3047++;
        int var6 = 0;
        int var7 = arg4 * arg4;
        int var8 = arg2;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var7 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var7 + var10;
        int var14 = var7 << 2;
        int var15 = var9 - ((var12 - 1) * var11);
        int var16 = var9 << 2;
        int var17 = 23 % ((25 - arg3) / 49);
        int var18 = ((var6 << 1) + 3) * var10;
        int var19 = ((arg2 << 1) - 3) * var11;
        int var20 = (arg2 - 1) * var14;
        int var21 = (var6 + 1) * var16;
        while (var8 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var15 += var21;
                    var13 += var18;
                    var6++;
                    var18 += var16;
                    var21 += var16;
                }
            }
            var8--;
            int var22 = arg0 - var8;
            if (var15 < 0) {
                var15 += var21;
                var13 += var18;
                var6++;
                var21 += var16;
                var18 += var16;
            }
            int var23 = arg5 - var6;
            var13 += -var20;
            int var24 = arg5 + var6;
            var20 -= var14;
            int var25 = arg0 + var8;
            var15 += -var19;
            var19 -= var14;
            class155.method1090(class177.field2963[var22], var23, arg1, 160, var24);
            class155.method1090(class177.field2963[var25], var23, arg1, 160, var24);
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
    public static void method1257(int arg0) {
        field3056 = null;
        field3051 = null;
        field3044 = null;
        field3053 = null;
        field3058 = null;
        if (arg0 > -69) {
            field3051 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(Lwg;II)Lwg;")
    public final class98 method1258(class98 arg0, int arg1, int arg2) {
        field3054++;
        int var4 = this.field3043[arg2];
        class227 var5 = class19.method144(arg1 - 15731, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method743(true, true);
        }
        class227 var7 = null;
        int var8 = arg1;
        if (this.field3045 != null && this.field3045.length > arg2) {
            int var9 = this.field3045[arg2];
            var7 = class19.method144(arg1 ^ 0xFFFFC28D, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class98 var11 = arg0.method743(!var5.method1551(2, var6), !this.field3039);
            var11.method738(var5, var6, this.field3039);
            return var11;
        } else {
            class98 var10 = arg0.method743(!var5.method1551(2, var6) & !var7.method1551(arg1 ^ 0x2, var8), !this.field3039);
            var10.method738(var5, var6, this.field3039);
            var10.method738(var7, var8, this.field3039);
            return var10;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILwg;Lig;B)Lwg;")
    public final class98 method1259(int arg0, int arg1, class98 arg2, class186 arg3, byte arg4) {
        field3036++;
        int var6 = this.field3043[arg1];
        class227 var7 = class19.method144(-15731, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg3.method1252(1994376368, arg2, arg0);
        }
        int var9 = arg3.field3043[arg0];
        class227 var10 = class19.method144(-15731, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class98 var12 = arg2.method743(!var7.method1551(2, var8), !this.field3039);
            var12.method738(var7, var8, this.field3039);
            return var12;
        } else {
            class98 var13 = arg2.method743(!var7.method1551(2, var8) & !var10.method1551(2, var11), !this.field3039 & !arg3.field3039);
            var13.method751(var7, var8, var10, var11, this.field3046, this.field3039 | arg3.field3039);
            int var14 = 11 % ((-arg4 - 22) / 49);
            return var13;
        }
    }
}
