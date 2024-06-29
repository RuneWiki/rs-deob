import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class131 extends class152 {

    @OriginalMember(owner = "client!dh", name = "R", descriptor = "I")
    private int field2243 = 0;

    @OriginalMember(owner = "client!dh", name = "Z", descriptor = "I")
    private int field2251 = 0;

    @OriginalMember(owner = "client!dh", name = "jb", descriptor = "I")
    private int field2261 = 0;

    @OriginalMember(owner = "client!dh", name = "X", descriptor = "Lce;")
    private static class126 field2249 = class206.method1445(-7923, "");

    @OriginalMember(owner = "client!dh", name = "V", descriptor = "[I")
    public static int[] field2247 = new int[500];

    @OriginalMember(owner = "client!dh", name = "eb", descriptor = "Lce;")
    public static class126 field2256 = field2249;

    @OriginalMember(owner = "client!dh", name = "kb", descriptor = "Lce;")
    public static class126 field2262 = class206.method1445(-7923, "Chargement en cours)3 Veuillez patienter)3");

    @OriginalMember(owner = "client!dh", name = "T", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!dh", name = "W", descriptor = "I")
    private int field2248;

    @OriginalMember(owner = "client!dh", name = "Y", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!dh", name = "ab", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!dh", name = "bb", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!dh", name = "cb", descriptor = "I")
    private int field2254;

    @OriginalMember(owner = "client!dh", name = "db", descriptor = "I")
    private int field2255;

    @OriginalMember(owner = "client!dh", name = "fb", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!dh", name = "gb", descriptor = "I")
    private int field2258;

    @OriginalMember(owner = "client!dh", name = "hb", descriptor = "I")
    private int field2259;

    @OriginalMember(owner = "client!dh", name = "ib", descriptor = "I")
    private int field2260;

    @OriginalMember(owner = "client!dh", name = "S", descriptor = "Ljk;")
    public static class273 field2244;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(II)[[I", line = 12)
    public final int[][] method26(int arg0, int arg1) {
        field2253++;
        if (arg0 != 0) {
            this.field2255 = -23;
        }
        int[][] var3 = this.field2775.method319(-119, arg1);
        if (this.field2775.field775) {
            int[][] var4 = this.method1133(arg1, 0, true);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class244.field4133; var11++) {
                this.method913(var9[var11], var6[var11], 119, var5[var11]);
                this.field2255 += this.field2261;
                this.field2248 += this.field2243;
                if (this.field2248 < 0) {
                    this.field2248 = 0;
                }
                if (this.field2248 > 4096) {
                    this.field2248 = 4096;
                }
                if (this.field2255 < 0) {
                    this.field2255 = 0;
                }
                if (this.field2255 > 4096) {
                    this.field2255 = 4096;
                }
                for (this.field2258 += this.field2251; this.field2258 < 0; this.field2258 += 4096) {
                }
                while (this.field2258 > 4096) {
                    this.field2258 -= 4096;
                }
                this.method914(this.field2255, this.field2258, -61, this.field2248);
                var7[var11] = this.field2254;
                var8[var11] = this.field2260;
                var10[var11] = this.field2259;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V", line = 158)
    public class131() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIII)V", line = 104)
    private final void method913(int arg0, int arg1, int arg2, int arg3) {
        field2257++;
        int var5 = arg1 >= arg3 ? arg1 : arg3;
        int var6 = arg3 >= arg1 ? arg1 : arg3;
        int var7 = arg0 < var6 ? arg0 : var6;
        int var8 = var5 < arg0 ? arg0 : var5;
        if (arg2 <= 100) {
            field2262 = (class126) null;
        }
        int var9 = var8 - var7;
        if (var9 > 0) {
            int var10 = (var8 - arg0 << 12) / var9;
            int var11 = (var8 - arg3 << 12) / var9;
            int var12 = (var8 - arg1 << 12) / var9;
            if (arg3 == var8) {
                this.field2258 = arg1 == var7 ? var10 + 20480 : 4096 - var12;
            } else if (arg1 == var8) {
                this.field2258 = arg0 == var7 ? var11 + 4096 : -var10 + 12288;
            } else {
                this.field2258 = arg3 == var7 ? var12 + 12288 : -var11 + 20480;
            }
            this.field2258 /= 6;
        } else {
            this.field2258 = 0;
        }
        this.field2248 = (var7 + var8) / 2;
        if (this.field2248 > 0 && this.field2248 < 4096) {
            this.field2255 = (var9 << 12) / (this.field2248 > 2048 ? 8192 - (this.field2248 * 2) : this.field2248 * 2);
        } else {
            this.field2255 = 0;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILbb;)V", line = 163)
    public final void method5(int arg0, int arg1, class134 arg2) {
        field2246++;
        if (arg1 == 0) {
            this.field2251 = arg2.method931((byte) 49);
        } else if (arg1 == 1) {
            this.field2261 = (arg2.method977(19773) << 12) / 100;
        } else if (arg1 == 2) {
            this.field2243 = (arg2.method977(19773) << 12) / 100;
        }
        if (arg0 != 8) {
            this.field2248 = -118;
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(IIII)V", line = 226)
    private final void method914(int arg0, int arg1, int arg2, int arg3) {
        field2245++;
        int var5 = -2 / ((59 - arg2) / 53);
        int var6 = arg3 > 2048 ? arg0 + arg3 - (arg0 * arg3 >> 12) : (arg0 + 4096) * arg3 >> 12;
        if (var6 <= 0) {
            this.field2254 = this.field2260 = this.field2259 = arg3;
            return;
        }
        int var7 = arg1 * 6;
        int var8 = arg3 + arg3 - var6;
        int var9 = (var6 - var8 << 12) / var6;
        int var10 = var7 >> 12;
        int var11 = var7 - (var10 << 12);
        int var13 = var9 * var6 >> 12;
        int var14 = var11 * var13 >> 12;
        int var15 = var8 + var14;
        int var16 = var6 - var14;
        if (var10 == 0) {
            this.field2259 = var8;
            this.field2260 = var15;
            this.field2254 = var6;
        } else if (var10 == 1) {
            this.field2259 = var8;
            this.field2254 = var16;
            this.field2260 = var6;
        } else if (var10 == 2) {
            this.field2260 = var6;
            this.field2254 = var8;
            this.field2259 = var15;
        } else if (var10 == 3) {
            this.field2254 = var8;
            this.field2259 = var6;
            this.field2260 = var16;
        } else if (var10 == 4) {
            this.field2259 = var6;
            this.field2260 = var8;
            this.field2254 = var15;
        } else if (var10 == 5) {
            this.field2259 = var16;
            this.field2260 = var8;
            this.field2254 = var6;
        }
    }

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "(I)V", line = 340)
    public static void method915(int arg0) {
        field2249 = null;
        if (arg0 != 3) {
            method915(35);
        }
        field2244 = null;
        field2256 = null;
        field2247 = null;
        field2262 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)Lce;", line = 360)
    public static final class126 method916(byte arg0, int arg1) {
        field2252++;
        if (arg1 < 999999999) {
            return class195.method1386((byte) 20, arg1);
        } else if (arg0 <= 45) {
            return (class126) null;
        } else {
            return class274.field4608;
        }
    }
}
