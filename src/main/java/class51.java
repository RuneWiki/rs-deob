import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class51 {

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public int field897 = 5;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public int field896 = 2;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public int field901 = -1;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public int field888 = -1;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public int field894 = -1;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public int field906 = -1;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public int field909 = 99;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public int field905 = -1;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Z")
    private boolean field893 = false;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "Z")
    public boolean field912 = false;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "Luh;")
    public static class198 field907 = new class198();

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "D")
    public static double field904;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "[I")
    private int[] field889;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "[I")
    public int[] field899;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "[I")
    public int[] field910;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "[I")
    private int[] field911;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "[[I")
    public int[][] field887;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "[[[B")
    public static byte[][][] field895;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILnj;)V")
    public final void method294(int arg0, class226 arg1) {
        if (arg0 != 0) {
            this.method299((class48) null, -1, 113);
        }
        while (true) {
            int var3 = arg1.method1471(255);
            if (var3 == 0) {
                field898++;
                return;
            }
            this.method295(arg1, var3, arg0 - 800200304);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lnj;II)V")
    private final void method295(class226 arg0, int arg1, int arg2) {
        field913++;
        if (arg2 != -800200304) {
            this.field897 = 85;
        }
        if (arg1 == 1) {
            int var4 = arg0.method1447(0);
            this.field899 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field899[var5] = arg0.method1447(0);
            }
            this.field910 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field910[var6] = arg0.method1447(0);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field910[var7] += arg0.method1447(0) << 16;
            }
        } else if (arg1 == 2) {
            this.field905 = arg0.method1447(0);
        } else if (arg1 == 3) {
            int var15 = arg0.method1471(255);
            this.field889 = new int[var15 + 1];
            for (int var16 = 0; var16 < var15; var16++) {
                this.field889[var16] = arg0.method1471(255);
            }
            this.field889[var15] = 9999999;
        } else if (arg1 == 4) {
            this.field912 = true;
        } else if (arg1 == 5) {
            this.field897 = arg0.method1471(255);
        } else if (arg1 == 6) {
            this.field901 = arg0.method1447(0);
        } else if (arg1 == 7) {
            this.field894 = arg0.method1447(0);
        } else if (arg1 == 8) {
            this.field909 = arg0.method1471(255);
        } else if (arg1 == 9) {
            this.field888 = arg0.method1471(arg2 ^ 0xD04DE96F);
        } else if (arg1 == 10) {
            this.field906 = arg0.method1471(arg2 + 800200559);
        } else if (arg1 == 11) {
            this.field896 = arg0.method1471(255);
            return;
        } else if (arg1 == 12) {
            int var8 = arg0.method1471(255);
            this.field911 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field911[var9] = arg0.method1447(0);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field911[var10] = (arg0.method1447(0) << 16) + this.field911[var10];
            }
            return;
        } else if (arg1 == 13) {
            int var11 = arg0.method1447(0);
            this.field887 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg0.method1471(255);
                if (var13 > 0) {
                    this.field887[var12] = new int[var13];
                    this.field887[var12][0] = arg0.method1444(171285352);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field887[var12][var14] = arg0.method1447(0);
                    }
                }
            }
            return;
        } else if (arg1 == 14) {
            this.field893 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILbf;)Lbf;")
    public final class48 method296(int arg0, int arg1, class48 arg2) {
        field914++;
        if (arg0 != 1388270704) {
            this.field906 = 27;
        }
        int var4 = this.field910[arg1];
        class241 var5 = class118.method742(arg0 - 1388270667, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method278(true, true);
        } else {
            class48 var7 = arg2.method278(!var5.method1605(var6, 110), !this.field893);
            var7.method268(var5, var6, this.field893);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method297(int arg0) {
        field907 = null;
        field895 = null;
        if (arg0 < 66) {
            field890 = 119;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIILbf;Lqe;)Lbf;")
    public final class48 method298(int arg0, int arg1, int arg2, class48 arg3, class51 arg4) {
        int var6 = this.field910[arg1];
        field903++;
        class241 var7 = class118.method742(37, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg4.method296(1388270704, arg0, arg3);
        }
        int var9 = arg4.field910[arg0];
        class241 var10 = class118.method742(arg2 + 42, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (arg2 != -5) {
            return null;
        } else if (var10 == null) {
            class48 var12 = arg3.method278(!var7.method1605(var8, 122), !this.field893);
            var12.method268(var7, var8, this.field893);
            return var12;
        } else {
            class48 var13 = arg3.method278(!var7.method1605(var8, 122) & !var10.method1605(var11, 114), !arg4.field893 & !this.field893);
            var13.method276(var7, var8, var10, var11, this.field889, this.field893 | arg4.field893);
            return var13;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lbf;II)Lbf;")
    public final class48 method299(class48 arg0, int arg1, int arg2) {
        if (arg2 < 81) {
            this.field905 = 35;
        }
        field891++;
        int var4 = this.field910[arg1];
        class241 var5 = class118.method742(37, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method273(true, true);
        } else {
            class48 var7 = arg0.method273(!var5.method1605(var6, 113), !this.field893);
            var7.method268(var5, var6, this.field893);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
    public final void method300(int arg0) {
        if (this.field888 == -1) {
            if (this.field889 == null) {
                this.field888 = 0;
            } else {
                this.field888 = 2;
            }
        }
        if (this.field906 == -1) {
            if (this.field889 == null) {
                this.field906 = 0;
            } else {
                this.field906 = 2;
            }
        }
        field908++;
        if (arg0 != 0) {
            this.field911 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILbf;II)Lbf;")
    public final class48 method301(int arg0, class48 arg1, int arg2, int arg3) {
        int var5 = this.field910[arg2];
        field900++;
        class241 var6 = class118.method742(37, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method278(true, true);
        }
        int var8 = arg0 & 0x3;
        class48 var9 = arg1.method278(!var6.method1605(var7, 117), !this.field893);
        if (var8 == 1) {
            var9.method285();
        } else if (var8 == 2) {
            var9.method280();
        } else if (var8 == 3) {
            var9.method267();
        }
        var9.method268(var6, var7, this.field893);
        if (~var8 == arg3) {
            var9.method267();
        } else if (var8 == 2) {
            var9.method280();
        } else if (var8 == 3) {
            var9.method285();
        }
        return var9;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lbf;IB)Lbf;")
    public final class48 method302(class48 arg0, int arg1, byte arg2) {
        field892++;
        int var4 = this.field910[arg1];
        class241 var5 = class118.method742(37, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method278(true, true);
        }
        if (arg2 >= -48) {
            this.field905 = 62;
        }
        int var7 = 0;
        class241 var8 = null;
        if (this.field911 != null && arg1 < this.field911.length) {
            int var9 = this.field911[arg1];
            var8 = class118.method742(37, var9 >> 16);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class48 var11 = arg0.method278(!var5.method1605(var6, 115), !this.field893);
            var11.method268(var5, var6, this.field893);
            return var11;
        } else {
            class48 var10 = arg0.method278(!var5.method1605(var6, 114) & !var8.method1605(var7, 118), !this.field893);
            var10.method268(var5, var6, this.field893);
            var10.method268(var8, var7, this.field893);
            return var10;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIZI[Lta;)V")
    public static final void method303(int arg0, int arg1, int arg2, boolean arg3, int arg4, class105[] arg5) {
        field902++;
        for (int var6 = 0; var6 < arg5.length; var6++) {
            class105 var7 = arg5[var6];
            if (var7 != null && var7.field1968 == arg1) {
                class125.method774(arg2, var7, arg3, 12345678, arg4);
                class57.method345(arg4, arg2, var7, (byte) 102);
                if (var7.field1925 > var7.field1842 - var7.field1977) {
                    var7.field1925 = var7.field1842 - var7.field1977;
                }
                if (var7.field1925 < 0) {
                    var7.field1925 = 0;
                }
                if ((var7.field1935 - var7.field1952) < var7.field1986) {
                    var7.field1986 = var7.field1935 - var7.field1952;
                }
                if (var7.field1986 < 0) {
                    var7.field1986 = 0;
                }
                if (var7.field1829 == 0) {
                    class118.method745(var7, arg3, (byte) 34);
                }
            }
        }
        if (arg0 >= -51) {
            field904 = 0.5225143852549338D;
        }
    }
}
