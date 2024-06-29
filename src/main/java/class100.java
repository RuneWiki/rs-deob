import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class class100 extends class8 {

    @OriginalMember(owner = "client!oc", name = "fb", descriptor = "I")
    public int field2226 = 0;

    @OriginalMember(owner = "client!oc", name = "tb", descriptor = "[[B")
    private byte[][] field2240 = new byte[256][];

    @OriginalMember(owner = "client!oc", name = "nb", descriptor = "[I")
    private int[] field2234;

    @OriginalMember(owner = "client!oc", name = "Gb", descriptor = "[I")
    private int[] field2253;

    @OriginalMember(owner = "client!oc", name = "wb", descriptor = "[I")
    private int[] field2243;

    @OriginalMember(owner = "client!oc", name = "qb", descriptor = "[I")
    private int[] field2237;

    @OriginalMember(owner = "client!oc", name = "Z", descriptor = "I")
    private int field2220;

    @OriginalMember(owner = "client!oc", name = "Db", descriptor = "I")
    private int field2250;

    @OriginalMember(owner = "client!oc", name = "eb", descriptor = "Lje;")
    private static class67 field2225 = class85.method592(255, "gt");

    @OriginalMember(owner = "client!oc", name = "bb", descriptor = "Lje;")
    private static class67 field2222 = class85.method592(255, ")4str");

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "Lje;")
    private static class67 field2219 = class85.method592(255, "lt");

    @OriginalMember(owner = "client!oc", name = "jb", descriptor = "I")
    private static int field2230 = -1;

    @OriginalMember(owner = "client!oc", name = "kb", descriptor = "I")
    private static int field2231 = 0;

    @OriginalMember(owner = "client!oc", name = "cb", descriptor = "I")
    private static int field2223 = -1;

    @OriginalMember(owner = "client!oc", name = "ib", descriptor = "I")
    private static int field2229 = 256;

    @OriginalMember(owner = "client!oc", name = "mb", descriptor = "Lje;")
    private static class67 field2233 = class85.method592(255, ")4shad");

    @OriginalMember(owner = "client!oc", name = "hb", descriptor = "Lje;")
    private static class67 field2228 = class85.method592(255, "str");

    @OriginalMember(owner = "client!oc", name = "ob", descriptor = "Lje;")
    private static class67 field2235 = class85.method592(255, "str=");

    @OriginalMember(owner = "client!oc", name = "gb", descriptor = "Lje;")
    private static class67 field2227 = class85.method592(255, ")4col");

    @OriginalMember(owner = "client!oc", name = "pb", descriptor = "Lje;")
    private static class67 field2236 = class85.method592(255, "img=");

    @OriginalMember(owner = "client!oc", name = "ab", descriptor = "Lje;")
    private static class67 field2221 = class85.method592(255, ")4u");

    @OriginalMember(owner = "client!oc", name = "rb", descriptor = "I")
    private static int field2238 = -1;

    @OriginalMember(owner = "client!oc", name = "zb", descriptor = "I")
    private static int field2246 = 0;

    @OriginalMember(owner = "client!oc", name = "Bb", descriptor = "Lje;")
    private static class67 field2248 = class85.method592(255, "u=");

    @OriginalMember(owner = "client!oc", name = "lb", descriptor = "I")
    private static int field2232 = 0;

    @OriginalMember(owner = "client!oc", name = "db", descriptor = "Lje;")
    private static class67 field2224 = class85.method592(255, "shad=");

    @OriginalMember(owner = "client!oc", name = "Cb", descriptor = "Lje;")
    private static class67 field2249 = class85.method592(255, "col=");

    @OriginalMember(owner = "client!oc", name = "Fb", descriptor = "Lje;")
    private static class67 field2252 = class85.method592(255, "u");

    @OriginalMember(owner = "client!oc", name = "Ab", descriptor = "I")
    private static int field2247 = 0;

    @OriginalMember(owner = "client!oc", name = "Eb", descriptor = "Lje;")
    private static class67 field2251 = class85.method592(255, "br");

    @OriginalMember(owner = "client!oc", name = "sb", descriptor = "I")
    private static int field2239 = -1;

    @OriginalMember(owner = "client!oc", name = "Hb", descriptor = "Lje;")
    private static class67 field2254 = class85.method592(255, "shad");

    @OriginalMember(owner = "client!oc", name = "xb", descriptor = "Ljava/util/Random;")
    private static Random field2244 = new Random();

    @OriginalMember(owner = "client!oc", name = "Ib", descriptor = "[Lje;")
    private static class67[] field2255 = new class67[100];

    @OriginalMember(owner = "client!oc", name = "vb", descriptor = "[B")
    private byte[] field2242;

    @OriginalMember(owner = "client!oc", name = "yb", descriptor = "[I")
    private int[] field2245;

    @OriginalMember(owner = "client!oc", name = "ub", descriptor = "[Lkd;")
    public static class73[] field2241;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lje;II)V")
    private final void method771(class67 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2226;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field1307; var7++) {
            int var8 = arg0.field1324[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class67 var9 = arg0.method448(var5 + 1, var7, -117);
                    var5 = -1;
                    if (var9.method455(field2219, 18909)) {
                        var8 = 60;
                    } else {
                        if (!var9.method455(field2225, 18909)) {
                            if (var9.method454(field2236, (byte) -123)) {
                                try {
                                    int var10 = var9.method463(4, -106).method469((byte) 59);
                                    class73 var11 = field2241[var10];
                                    var11.method531(arg1, this.field2226 + var4 - var11.field1593);
                                    arg1 += var11.field1594;
                                    var6 = -1;
                                } catch (Exception var15) {
                                }
                            } else {
                                this.method788(var9);
                            }
                            continue;
                        }
                        var8 = 62;
                    }
                }
                if (var5 == -1) {
                    if (this.field2242 != null && var6 != -1) {
                        arg1 += this.field2242[(var6 << 8) + var8];
                    }
                    int var12 = this.field2243[var8];
                    int var13 = this.field2237[var8];
                    if (var8 == 32) {
                        if (field2247 > 0) {
                            field2246 += field2247;
                            arg1 += field2246 >> 8;
                            field2246 &= 0xFF;
                        }
                    } else if (field2229 == 256) {
                        if (field2239 != -1) {
                            method783(this.field2240[var8], this.field2234[var8] + arg1 + 1, this.field2253[var8] + var4 + 1, var12, var13, field2239);
                        }
                        this.method776(this.field2240[var8], this.field2234[var8] + arg1, this.field2253[var8] + var4, var12, var13, field2231);
                    } else {
                        if (field2239 != -1) {
                            method777(this.field2240[var8], this.field2234[var8] + arg1 + 1, this.field2253[var8] + var4 + 1, var12, var13, field2239, field2229);
                        }
                        this.method780(this.field2240[var8], this.field2234[var8] + arg1, this.field2253[var8] + var4, var12, var13, field2231, field2229);
                    }
                    int var14 = this.field2245[var8];
                    if (field2230 != -1) {
                        class8.method77(arg1, (int) ((double) this.field2226 * 0.7D) + var4, var14, field2230);
                    }
                    if (field2238 != -1) {
                        class8.method77(arg1, this.field2226 + var4 + 1, var14, field2238);
                    }
                    arg1 += var14;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lje;[I[Lje;)I")
    private final int method772(class67 arg0, int[] arg1, class67[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        class67 var6 = class138.method1050(100, -23);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg0.method445(false);
        for (int var14 = 0; var14 < var13; var14++) {
            int var15 = arg0.method477(var14, (byte) 124);
            if (var15 == 60) {
                var10 = var14;
            } else {
                if (var15 == 62 && var10 != -1) {
                    class67 var16 = arg0.method448(var10 + 1, var14, -115);
                    var10 = -1;
                    var6.method483(60, 0);
                    var6.method446((byte) -122, var16);
                    var6.method483(62, 0);
                    if (var16.method455(field2251, 18909)) {
                        arg2[var12++] = var6.method448(var5, var6.method445(false), -121);
                        var5 = var6.method445(false);
                        var4 = 0;
                        var7 = -1;
                        var11 = -1;
                    } else if (var16.method455(field2219, 18909)) {
                        var4 += this.method792(60);
                        if (this.field2242 != null && var11 != -1) {
                            var4 += this.field2242[(var11 << 8) + 60];
                        }
                        var11 = 60;
                    } else if (var16.method455(field2225, 18909)) {
                        var4 += this.method792(62);
                        if (this.field2242 != null && var11 != -1) {
                            var4 += this.field2242[(var11 << 8) + 62];
                        }
                        var11 = 62;
                    } else if (var16.method454(field2236, (byte) -123)) {
                        try {
                            int var17 = var16.method463(4, -120).method469((byte) 59);
                            var4 += field2241[var17].field1594;
                            var11 = -1;
                        } catch (Exception var18) {
                        }
                    }
                    var15 = -1;
                }
                if (var10 == -1) {
                    if (var15 != -1) {
                        var6.method483(var15, 0);
                        var4 += this.method792(var15);
                        if (this.field2242 != null && var11 != -1) {
                            var4 += this.field2242[(var11 << 8) + var15];
                        }
                        var11 = var15;
                    }
                    if (var15 == 32) {
                        var7 = var6.method445(false);
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var12 < arg1.length ? var12 : arg1.length - 1] && var7 >= 0) {
                        arg2[var12++] = var6.method448(var5, var7 - var9, -115);
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                        var11 = -1;
                    }
                    if (var15 == 45) {
                        var7 = var6.method445(false);
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        if (var6.method445(false) > var5) {
            arg2[var12++] = var6.method448(var5, var6.method445(false), -128);
        }
        return var12;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([I[BIIIIIII)V")
    public static final void method773(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method774(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
        int var7 = arg2[arg5];
        int var8 = arg4[arg5] + var7;
        int var9 = arg2[arg6];
        int var10 = arg4[arg6] + var9;
        int var11 = var7;
        if (var9 > var7) {
            var11 = var9;
        }
        int var12 = var8;
        if (var10 < var8) {
            var12 = var10;
        }
        int var13 = arg3[arg5];
        if (arg3[arg6] < var13) {
            var13 = arg3[arg6];
        }
        byte[] var14 = arg1[arg5];
        byte[] var15 = arg0[arg6];
        int var16 = var11 - var7;
        int var17 = var11 - var9;
        for (int var18 = var11; var18 < var12; var18++) {
            int var19 = var14[var16++] + var15[var17++];
            if (var19 < var13) {
                var13 = var19;
            }
        }
        return -var13;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lje;IIII)V")
    public final void method775(class67 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method787(arg3, arg4);
            this.method771(arg0, arg1 - this.method797(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([BIIIII)V")
    public abstract void method776(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([BIIIIII)V")
    private static final void method777(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class8.field154 * arg2 + arg1;
        int var8 = class8.field154 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class8.field155) {
            int var11 = class8.field155 - arg2;
            arg4 -= var11;
            arg2 = class8.field155;
            var10 += arg3 * var11;
            var7 += class8.field154 * var11;
        }
        if (arg2 + arg4 > class8.field150) {
            arg4 -= arg2 + arg4 - class8.field150;
        }
        if (arg1 < class8.field151) {
            int var12 = class8.field151 - arg1;
            arg3 -= var12;
            arg1 = class8.field151;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class8.field156) {
            int var13 = arg1 + arg3 - class8.field156;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method798(class8.field152, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lje;II[I[I)V")
    private final void method778(class67 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field2226;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field1307; var10++) {
            int var11 = arg0.field1324[var10] & 0xFF;
            if (var11 == 60) {
                var7 = var10;
            } else {
                if (var11 == 62 && var7 != -1) {
                    class67 var12 = arg0.method448(var7 + 1, var10, -120);
                    var7 = -1;
                    if (var12.method455(field2219, 18909)) {
                        var11 = 60;
                    } else {
                        if (!var12.method455(field2225, 18909)) {
                            if (var12.method454(field2236, (byte) -123)) {
                                try {
                                    int var13;
                                    if (arg3 == null) {
                                        var13 = 0;
                                    } else {
                                        var13 = arg3[var9];
                                    }
                                    int var14;
                                    if (arg4 == null) {
                                        var14 = 0;
                                    } else {
                                        var14 = arg4[var9];
                                    }
                                    var9++;
                                    int var15 = var12.method463(4, -105).method469((byte) 59);
                                    class73 var16 = field2241[var15];
                                    var16.method531(arg1 + var13, this.field2226 + var6 - var16.field1593 + var14);
                                    arg1 += var16.field1594;
                                    var8 = -1;
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method788(var12);
                            }
                            continue;
                        }
                        var11 = 62;
                    }
                }
                if (var7 == -1) {
                    if (this.field2242 != null && var8 != -1) {
                        arg1 += this.field2242[(var8 << 8) + var11];
                    }
                    int var17 = this.field2243[var11];
                    int var18 = this.field2237[var11];
                    int var19;
                    if (arg3 == null) {
                        var19 = 0;
                    } else {
                        var19 = arg3[var9];
                    }
                    int var20;
                    if (arg4 == null) {
                        var20 = 0;
                    } else {
                        var20 = arg4[var9];
                    }
                    var9++;
                    if (var11 == 32) {
                        if (field2247 > 0) {
                            field2246 += field2247;
                            arg1 += field2246 >> 8;
                            field2246 &= 0xFF;
                        }
                    } else if (field2229 == 256) {
                        if (field2239 != -1) {
                            method783(this.field2240[var11], this.field2234[var11] + arg1 + var19 + 1, this.field2253[var11] + var6 + 1 + var20, var17, var18, field2239);
                        }
                        this.method776(this.field2240[var11], this.field2234[var11] + arg1 + var19, this.field2253[var11] + var6 + var20, var17, var18, field2231);
                    } else {
                        if (field2239 != -1) {
                            method777(this.field2240[var11], this.field2234[var11] + arg1 + var19 + 1, this.field2253[var11] + var6 + 1 + var20, var17, var18, field2239, field2229);
                        }
                        this.method780(this.field2240[var11], this.field2234[var11] + arg1 + var19, this.field2253[var11] + var6 + var20, var17, var18, field2231, field2229);
                    }
                    int var21 = this.field2245[var11];
                    if (field2230 != -1) {
                        class8.method77(arg1, (int) ((double) this.field2226 * 0.7D) + var6, var21, field2230);
                    }
                    if (field2238 != -1) {
                        class8.method77(arg1, this.field2226 + var6, var21, field2238);
                    }
                    arg1 += var21;
                    var8 = var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([B)V")
    private final void method779(byte[] arg0) {
        this.field2245 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field2245.length; var2++) {
                this.field2245[var2] = arg0[var2] & 0xFF;
            }
            this.field2226 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field2245[var4] = arg0[var3++] & 0xFF;
        }
        int[] var5 = new int[256];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < 256; var7++) {
            var5[var7] = arg0[var3++] & 0xFF;
        }
        for (int var8 = 0; var8 < 256; var8++) {
            var6[var8] = arg0[var3++] & 0xFF;
        }
        byte[][] var9 = new byte[256][];
        for (int var10 = 0; var10 < 256; var10++) {
            var9[var10] = new byte[var5[var10]];
            byte var17 = 0;
            for (int var18 = 0; var18 < var9[var10].length; var18++) {
                var17 += arg0[var3++];
                var9[var10][var18] = var17;
            }
        }
        byte[][] var11 = new byte[256][];
        for (int var12 = 0; var12 < 256; var12++) {
            var11[var12] = new byte[var5[var12]];
            byte var15 = 0;
            for (int var16 = 0; var16 < var11[var12].length; var16++) {
                var15 += arg0[var3++];
                var11[var12][var16] = var15;
            }
        }
        this.field2242 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field2242[(var13 << 8) + var14] = (byte) method774(var9, var11, var6, this.field2245, var5, var13, var14);
                    }
                }
            }
        }
        this.field2226 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "([BIIIIII)V")
    public abstract void method780(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lje;IIIIII)V")
    public final void method781(class67 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method787(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field1307];
        for (int var11 = 0; var11 < arg0.field1307; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method778(arg0, arg1 - this.method797(arg0) / 2, arg2, null, var10);
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "()V")
    public static void method782() {
        field2219 = null;
        field2225 = null;
        field2236 = null;
        field2251 = null;
        field2249 = null;
        field2227 = null;
        field2248 = null;
        field2252 = null;
        field2221 = null;
        field2224 = null;
        field2254 = null;
        field2233 = null;
        field2235 = null;
        field2228 = null;
        field2222 = null;
        field2241 = null;
        field2244 = null;
        field2255 = null;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "([BIIIII)V")
    private static final void method783(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class8.field154 * arg2 + arg1;
        int var7 = class8.field154 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class8.field155) {
            int var10 = class8.field155 - arg2;
            arg4 -= var10;
            arg2 = class8.field155;
            var9 += arg3 * var10;
            var6 += class8.field154 * var10;
        }
        if (arg2 + arg4 > class8.field150) {
            arg4 -= arg2 + arg4 - class8.field150;
        }
        if (arg1 < class8.field151) {
            int var11 = class8.field151 - arg1;
            arg3 -= var11;
            arg1 = class8.field151;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class8.field156) {
            int var12 = arg1 + arg3 - class8.field156;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method773(class8.field152, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lje;IIIII)V")
    public final void method784(class67 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method787(arg3, arg4);
        field2244.setSeed((long) arg5);
        field2229 = (field2244.nextInt() & 0x1F) + 192;
        int[] var7 = new int[arg0.field1307];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.field1307; var9++) {
            var7[var9] = var8;
            if ((field2244.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method778(arg0, arg1, arg2, var7, null);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lje;)Lje;")
    public static final class67 method785(class67 arg0) {
        int var1 = arg0.method445(false);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field1324[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class67 var4 = new class67();
        var4.field1307 = var1 + var2;
        var4.field1324 = new byte[var4.field1307];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field1324[var6];
            if (var7 == 60) {
                var4.field1324[var5++] = 60;
                var4.field1324[var5++] = 108;
                var4.field1324[var5++] = 116;
                var4.field1324[var5++] = 62;
            } else if (var7 == 62) {
                var4.field1324[var5++] = 60;
                var4.field1324[var5++] = 103;
                var4.field1324[var5++] = 116;
                var4.field1324[var5++] = 62;
            } else {
                var4.field1324[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lje;IIIIIIIII)I")
    public final int method786(class67 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method787(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field2226;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field2250 + this.field2220 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method772(arg0, var11, field2255);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field2220 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field2220 - this.field2250 - (var12 - 1) * arg9) / 2 + this.field2220 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field2250 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field2220 - this.field2250 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field2220 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method771(field2255[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method771(field2255[var15], arg1 + (arg3 - this.method797(field2255[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method771(field2255[var15], arg1 + arg3 - this.method797(field2255[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method771(field2255[var15], arg1, var13);
            } else {
                this.method795(field2255[var15], arg3);
                this.method771(field2255[var15], arg1, var13);
                field2247 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V")
    private final void method787(int arg0, int arg1) {
        field2230 = -1;
        field2238 = -1;
        field2223 = arg1;
        field2239 = arg1;
        field2232 = arg0;
        field2231 = arg0;
        field2229 = 256;
        field2247 = 0;
        field2246 = 0;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(Lje;)V")
    private final void method788(class67 arg0) {
        try {
            if (arg0.method454(field2249, (byte) -123)) {
                field2231 = arg0.method463(4, -103).method470(16, 104);
                return;
            }
            if (arg0.method455(field2227, 18909)) {
                field2231 = field2232;
                return;
            }
            if (arg0.method454(field2235, (byte) -123)) {
                field2230 = arg0.method463(4, -101).method470(16, 121);
                return;
            }
            if (arg0.method455(field2228, 18909)) {
                field2230 = 8388608;
                return;
            }
            if (arg0.method455(field2222, 18909)) {
                field2230 = -1;
                return;
            }
            if (arg0.method454(field2248, (byte) -123)) {
                field2238 = arg0.method463(2, -127).method470(16, 117);
                return;
            }
            if (arg0.method455(field2252, 18909)) {
                field2238 = 0;
                return;
            }
            if (arg0.method455(field2221, 18909)) {
                field2238 = -1;
                return;
            }
            if (arg0.method454(field2224, (byte) -123)) {
                field2239 = arg0.method463(5, -94).method470(16, 105);
                return;
            }
            if (arg0.method455(field2254, 18909)) {
                field2239 = 0;
                return;
            }
            if (arg0.method455(field2233, 18909)) {
                field2239 = field2223;
                return;
            }
            if (arg0.method455(field2251, 18909)) {
                this.method787(field2232, field2223);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lje;I)I")
    public final int method789(class67 arg0, int arg1) {
        return this.method772(arg0, new int[] { arg1 }, field2255);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(Lje;IIIII)V")
    public final void method790(class67 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method787(arg3, arg4);
        int[] var7 = new int[arg0.field1307];
        for (int var8 = 0; var8 < arg0.field1307; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method778(arg0, arg1 - this.method797(arg0) / 2, arg2, null, var7);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(Lje;IIII)V")
    public final void method791(class67 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method787(arg3, arg4);
            this.method771(arg0, arg1 - this.method797(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)I")
    private final int method792(int arg0) {
        return this.field2245[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(Lje;IIII)V")
    public final void method793(class67 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method787(arg3, arg4);
            this.method771(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(Lje;IIIII)V")
    public final void method794(class67 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method787(arg3, arg4);
        int[] var7 = new int[arg0.field1307];
        int[] var8 = new int[arg0.field1307];
        for (int var9 = 0; var9 < arg0.field1307; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method778(arg0, arg1 - this.method797(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(Lje;I)V")
    private final void method795(class67 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method445(false); var5++) {
            int var6 = arg0.method477(var5, (byte) 118);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field2247 = (arg1 - this.method797(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(Lje;I)I")
    public final int method796(class67 arg0, int arg1) {
        int var3 = this.method772(arg0, new int[] { arg1 }, field2255);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method797(field2255[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(Lje;)I")
    public final int method797(class67 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field1307; var5++) {
            int var6 = arg0.field1324[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class67 var7 = arg0.method448(var2 + 1, var5, -116);
                    var2 = -1;
                    if (var7.method455(field2219, 18909)) {
                        var6 = 60;
                    } else {
                        if (!var7.method455(field2225, 18909)) {
                            if (var7.method454(field2236, (byte) -123)) {
                                try {
                                    int var8 = var7.method463(4, -100).method469((byte) 59);
                                    var4 += field2241[var8].field1594;
                                    var3 = -1;
                                } catch (Exception var9) {
                                }
                            }
                            continue;
                        }
                        var6 = 62;
                    }
                }
                if (var2 == -1) {
                    var4 += this.field2245[var6];
                    if (this.field2242 != null && var3 != -1) {
                        var4 += this.field2242[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([I[BIIIIIIII)V")
    public static final void method798(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var11 = 256 - arg9;
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = -arg5; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var14 = arg0[arg4];
                    arg0[arg4++] = (((var14 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 & 0xFF0000) >> 8) + var10;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class100(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field2234 = arg1;
        this.field2253 = arg2;
        this.field2243 = arg3;
        this.field2237 = arg4;
        this.method779(arg0);
        this.field2240 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field2253[var10] < var8 && this.field2237[var10] != 0) {
                var8 = this.field2253[var10];
            }
            if (this.field2253[var10] + this.field2237[var10] > var9) {
                var9 = this.field2253[var10] + this.field2237[var10];
            }
        }
        this.field2220 = this.field2226 - var8;
        this.field2250 = var9 - this.field2226;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "([B)V")
    public class100(byte[] arg0) {
        this.method779(arg0);
    }
}
