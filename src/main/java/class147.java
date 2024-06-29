import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class147 {

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    private int field2234 = -1;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "Z")
    private boolean field2229 = false;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "Z")
    private boolean field2223 = false;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    private int field2241 = -1;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
    private int field2248 = -32768;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "B")
    private byte field2249;

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "B")
    private byte field2256;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public int field2224;

    @OriginalMember(owner = "client!dj", name = "H", descriptor = "I")
    public int field2255;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    public int field2247;

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "I")
    private int field2251;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
    private int field2246;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "Z")
    private boolean field2236;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Lhi;")
    public static class45 field2228 = new class45(45, 4);

    @OriginalMember(owner = "client!dj", name = "F", descriptor = "Lhi;")
    public static class45 field2253 = new class45(80, -1);

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "F")
    public static float field2260 = 0.25F;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    private int field2227;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    private int field2232;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    private int field2243;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!dj", name = "G", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!dj", name = "J", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "I")
    private int field2259;

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "Li;")
    private class197 field2239;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "Le;")
    private class285 field2222;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "Lbv;")
    public class471 field2235;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "Ljp;")
    private class55 field2225;

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "[Z")
    private boolean[] field2252;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lza;I)V")
    public final void method1048(class295 arg0, int arg1) {
        if (arg1 != -15800) {
            return;
        }
        field2231++;
        if (this.field2239 != null) {
            class161.method1135(this.field2239, this.field2256, this.field2246, this.field2251, this.field2252);
            this.field2239 = null;
            this.field2252 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILza;IIIZLe;I)V")
    public final void method1049(int arg0, class295 arg1, int arg2, int arg3, int arg4, boolean arg5, class285 arg6, int arg7) {
        field2250++;
        class51[] var9 = arg6.method715();
        class502[] var10 = arg6.method709();
        if ((this.field2235 == null || this.field2235.field6785) && (var9 != null || var10 != null)) {
            class103 var11 = class452.field6629.method603((byte) 126, this.field2255);
            if (var11.field1613 != null) {
                var11 = var11.method795(arg0 ^ 0xFFFF86C4, class309.field4200);
            }
            if (var11 != null) {
                this.field2235 = new class471(class28.field417);
            }
        }
        if (arg0 != 0) {
            this.field2248 = 123;
        }
        if (this.field2235 == null) {
            return;
        }
        if (arg5) {
            this.field2235.method2738(arg1, (long) class28.field417, var9, var10, false);
        } else {
            this.field2235.method2733((long) class28.field417);
        }
        this.field2235.method2734(this.field2249, arg4, arg3, arg2, arg7);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIBIIII)V")
    public static final void method1050(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field2237++;
        class426.method2545((byte) 78, arg5);
        int var7 = 0;
        if (arg2 <= 13) {
            field2260 = -0.3662603F;
        }
        int var8 = arg5 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (class23.field320 <= arg1 && arg1 <= class233.field3241) {
            int[] var14 = class42.field626[arg1];
            int var15 = class486.method2879((byte) -104, arg6 - arg5, class375.field5387, class519.field7633);
            int var16 = class486.method2879((byte) -87, arg5 + arg6, class375.field5387, class519.field7633);
            int var17 = class486.method2879((byte) 43, arg6 - var8, class375.field5387, class519.field7633);
            int var18 = class486.method2879((byte) -94, arg6 + var8, class375.field5387, class519.field7633);
            class188.method1259(var15, (byte) 27, var17, arg3, var14);
            class188.method1259(var17, (byte) 27, var18, arg0, var14);
            class188.method1259(var18, (byte) 27, var16, arg3, var14);
        }
        int var19 = -1;
        while (var9 > var7) {
            var19 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var19;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class80.field1133[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg1 - var9;
                int var21 = arg1 + var9;
                if (class23.field320 <= var21 && class233.field3241 >= var20) {
                    if (var9 < var8) {
                        int var22 = class80.field1133[var9];
                        int var23 = class486.method2879((byte) 92, arg6 + var7, class375.field5387, class519.field7633);
                        int var24 = class486.method2879((byte) -93, arg6 - var7, class375.field5387, class519.field7633);
                        int var25 = class486.method2879((byte) -128, arg6 + var22, class375.field5387, class519.field7633);
                        int var26 = class486.method2879((byte) 75, arg6 - var22, class375.field5387, class519.field7633);
                        if (class233.field3241 >= var21) {
                            int[] var27 = class42.field626[var21];
                            class188.method1259(var24, (byte) 27, var26, arg3, var27);
                            class188.method1259(var26, (byte) 27, var25, arg0, var27);
                            class188.method1259(var25, (byte) 27, var23, arg3, var27);
                        }
                        if (var20 >= class23.field320) {
                            int[] var28 = class42.field626[var20];
                            class188.method1259(var24, (byte) 27, var26, arg3, var28);
                            class188.method1259(var26, (byte) 27, var25, arg0, var28);
                            class188.method1259(var25, (byte) 27, var23, arg3, var28);
                        }
                    } else {
                        int var29 = class486.method2879((byte) -107, arg6 + var7, class375.field5387, class519.field7633);
                        int var30 = class486.method2879((byte) 22, arg6 - var7, class375.field5387, class519.field7633);
                        if (class233.field3241 >= var21) {
                            class188.method1259(var30, (byte) 27, var29, arg3, class42.field626[var21]);
                        }
                        if (class23.field320 <= var20) {
                            class188.method1259(var30, (byte) 27, var29, arg3, class42.field626[var20]);
                        }
                    }
                }
            }
            int var31 = arg1 - var7;
            int var32 = arg1 + var7;
            if (var32 >= class23.field320 && var31 <= class233.field3241) {
                int var33 = arg6 + var9;
                int var34 = arg6 - var9;
                if (class519.field7633 <= var33 && class375.field5387 >= var34) {
                    int var35 = class486.method2879((byte) -117, var33, class375.field5387, class519.field7633);
                    int var36 = class486.method2879((byte) -116, var34, class375.field5387, class519.field7633);
                    if (var7 >= var8) {
                        if (var32 <= class233.field3241) {
                            class188.method1259(var36, (byte) 27, var35, arg3, class42.field626[var32]);
                        }
                        if (class23.field320 <= var31) {
                            class188.method1259(var36, (byte) 27, var35, arg3, class42.field626[var31]);
                        }
                    } else {
                        int var37 = var7 > var11 ? class80.field1133[var7] : var11;
                        int var38 = class486.method2879((byte) 27, arg6 + var37, class375.field5387, class519.field7633);
                        int var39 = class486.method2879((byte) 103, arg6 - var37, class375.field5387, class519.field7633);
                        if (var32 <= class233.field3241) {
                            int[] var40 = class42.field626[var32];
                            class188.method1259(var36, (byte) 27, var39, arg3, var40);
                            class188.method1259(var39, (byte) 27, var38, arg0, var40);
                            class188.method1259(var38, (byte) 27, var35, arg3, var40);
                        }
                        if (class23.field320 <= var31) {
                            int[] var41 = class42.field626[var31];
                            class188.method1259(var36, (byte) 27, var39, arg3, var41);
                            class188.method1259(var39, (byte) 27, var38, arg0, var41);
                            class188.method1259(var38, (byte) 27, var35, arg3, var41);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)Z")
    public final boolean method1051(int arg0) {
        field2233++;
        if (arg0 != 17971) {
            this.method1051(-60);
        }
        return this.field2236;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lha;ZZI)V")
    public static final void method1052(class91 arg0, boolean arg1, boolean arg2, int arg3) {
        field2245++;
        int var4 = arg0.field1460;
        int var5 = (int) arg0.field6883;
        arg0.method2791((byte) 112);
        if (arg2) {
            class378.method2257(-17958, var4);
        }
        class235.method1436(var4, (byte) 52);
        class444 var6 = class22.method138(-95, var5);
        if (var6 != null) {
            class151.method1093(var6, arg3 ^ 0xFFFFFF93);
        }
        class502.method2983(arg3 + 30);
        if (!arg1 && class236.field3268 != -1) {
            class264.method1554((byte) 82, 1, class236.field3268);
        }
        if (arg3 != -4) {
            field2253 = null;
        }
        class510 var7 = new class510(class425.field6168);
        for (class91 var8 = (class91) var7.method3024((byte) 61); var8 != null; var8 = (class91) var7.method3027(9104)) {
            if (!var8.method2790(arg3 - 100)) {
                var8 = (class91) var7.method3024((byte) 91);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field1461 == 3) {
                int var9 = (int) var8.field6883;
                if (var9 >>> 16 == var4) {
                    method1052(var8, arg1, true, -4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)V")
    public final void method1053(int arg0, byte arg1) {
        field2244++;
        this.field2223 = true;
        if (arg1 != -108) {
            this.method1051(-5);
        }
        this.method1059(arg0, arg1 + 24669);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZIZLza;IIZ)Le;")
    public final class285 method1054(boolean arg0, int arg1, boolean arg2, class295 arg3, int arg4, int arg5, boolean arg6) {
        if (!arg0) {
            field2260 = 0.010442219F;
        }
        field2242++;
        class103 var8 = class452.field6629.method603((byte) 121, this.field2255);
        if (var8.field1613 != null) {
            var8 = var8.method795(-31036, class309.field4200);
        }
        if (var8 == null) {
            this.method1048(arg3, -15800);
            this.field2234 = -1;
            this.field2241 = this.field2243;
            return null;
        }
        if (!this.field2223 && this.field2234 != var8.field1646) {
            this.field2222 = null;
            this.method1059(-1, 24561);
        }
        this.method1058(arg5, (byte) 109, arg1);
        boolean var9 = arg6 & this.field2236 & class76.field1075.method1593(class195.field2849, 108) != 0;
        boolean var10 = var9 & (this.field2234 != var8.field1646 || (this.field2243 != this.field2241 || this.field2225 != null && (this.field2225.field815 || class434.field6286) && this.field2243 != this.field2227) && class76.field1075.method1593(class195.field2849, 64) >= 2);
        if (arg2 && !var10) {
            this.field2241 = this.field2243;
            this.field2234 = var8.field1646;
            return null;
        }
        if (var10) {
            class161.method1135(this.field2239, this.field2256, this.field2246, this.field2251, this.field2252);
        }
        class11 var11 = class492.field7122[this.field2256];
        class11 var12;
        if (this.field2229) {
            var12 = class348.field5000[0];
        } else {
            var12 = this.field2256 < 3 ? class492.field7122[this.field2256 + 1] : null;
        }
        class285 var13 = null;
        if (this.field2225 != null) {
            if (var10) {
                arg4 |= 0x40000;
            }
            var13 = var8.method794(this.field2251, this.field2224 == 11 ? 10 : this.field2224, arg4, 97, this.field2227, var11.method79(this.field2246, this.field2251), this.field2243, this.field2225, this.field2246, this.field2232, var12, var11, arg3, this.field2224 == 11 ? this.field2247 + 4 : this.field2247);
            if (var13 == null) {
                this.field2252 = null;
                this.field2248 = 0;
                this.field2239 = null;
            } else {
                if (var10) {
                    if (this.field2252 == null) {
                        this.field2252 = new boolean[4];
                    }
                    this.field2239 = var13.method662(this.field2239);
                    class125.method903(this.field2239, this.field2256, arg5, arg1, this.field2252);
                }
                this.field2248 = var13.method670();
            }
            this.field2222 = null;
        } else if (this.field2222 != null && (arg4 & this.field2222.method671()) == arg4 && this.field2234 == var8.field1646) {
            var13 = this.field2222;
        } else {
            if (this.field2222 != null) {
                arg4 |= this.field2222.method671();
            }
            class135 var14 = var8.method801(this.field2224 == 11 ? 10 : this.field2224, arg4, this.field2246, false, var11.method79(this.field2246, this.field2251), var12, arg3, var11, this.field2251, this.field2224 == 11 ? this.field2247 + 4 : this.field2247, var10);
            if (var14 == null) {
                this.field2248 = 0;
                this.field2252 = null;
                this.field2239 = null;
                this.field2222 = null;
            } else {
                var13 = var14.field2051;
                this.field2222 = var14.field2051;
                if (var10) {
                    this.field2239 = var14.field2053;
                    this.field2252 = null;
                    class125.method903(this.field2239, this.field2256, arg5, arg1, null);
                }
                this.field2248 = var13.method670();
            }
        }
        this.field2246 = arg5;
        this.field2234 = var8.field1646;
        this.field2251 = arg1;
        this.field2241 = this.field2243;
        return var13;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)I")
    public final int method1055(boolean arg0) {
        field2257++;
        if (!arg0) {
            this.field2243 = -107;
        }
        return this.field2248;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public static void method1056(byte arg0) {
        if (arg0 != 9) {
            method1060(-57, -7);
        }
        field2253 = null;
        field2228 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILjava/lang/String;Lpg;)Lud;")
    public static final class94 method1057(int arg0, int arg1, String arg2, class333 arg3) {
        field2238++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramStringARB(arg0, arg1, arg2);
        OpenGL.glGetIntegerv(34379, class119.field1864, 0);
        if (class119.field1864[0] == -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class94(arg3, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field2230++;
        if (this.field2235 != null) {
            this.field2235.method2732();
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IBI)V")
    private final void method1058(int arg0, byte arg1, int arg2) {
        field2240++;
        if (arg1 < 103) {
            this.method1054(false, 80, false, null, 30, -110, false);
        }
        label90: while (true) {
            if (this.field2225 == null) {
                if (this.field2223) {
                    return;
                }
                this.method1059(-1, 24561);
                if (this.field2225 == null) {
                    return;
                }
            }
            int var4 = class28.field417 - this.field2259;
            if (var4 > 100 && this.field2225.field807 > 0) {
                int var5 = this.field2225.field796.length - this.field2225.field807;
                while (var5 > this.field2243 && this.field2225.field788[this.field2243] < var4) {
                    var4 -= this.field2225.field788[this.field2243];
                    this.field2243++;
                }
                if (var5 <= this.field2243) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field2225.field796.length; var7++) {
                        var6 += this.field2225.field788[var7];
                    }
                    var4 %= var6;
                }
                this.field2227 = this.field2243 + 1;
                if (this.field2225.field796.length <= this.field2227) {
                    this.field2227 -= this.field2225.field807;
                    if (this.field2227 < 0 || this.field2227 >= this.field2225.field796.length) {
                        this.field2227 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field2225.field788[this.field2243] >= var4) {
                            this.field2259 = class28.field417 - var4;
                            this.field2232 = var4;
                            return;
                        }
                        class196.method1286(this.field2225, arg2, false, (byte) 1, this.field2249, arg0, this.field2243);
                        var4 -= this.field2225.field788[this.field2243];
                        this.field2243++;
                        if (this.field2225.field796.length <= this.field2243) {
                            this.field2243 -= this.field2225.field807;
                            if (this.field2243 < 0 || this.field2243 >= this.field2225.field796.length) {
                                this.field2225 = null;
                                continue label90;
                            }
                        }
                        this.field2227 = this.field2243 + 1;
                    } while (this.field2227 < this.field2225.field796.length);
                    this.field2227 -= this.field2225.field807;
                } while (this.field2227 >= 0 && this.field2227 < this.field2225.field796.length);
                this.field2227 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V")
    private final void method1059(int arg0, int arg1) {
        field2254++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class103 var5 = class452.field6629.method603((byte) 90, this.field2255);
            class103 var6 = var5;
            if (var5.field1613 != null) {
                var5 = var5.method795(arg1 ^ 0xFFFFD935, class309.field4200);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field1659 != null) {
                if (this.field2225 != null && var5.method805(this.field2225.field801, false)) {
                    return;
                }
                var3 = var5.method809(arg1 ^ 0xFFFFA05D);
                if (this.field2234 != var5.field1646) {
                    var4 = var5.field1672;
                }
            } else if (var5.field1648 == -1) {
                if (var6 != null && var6.field1659 != null) {
                    if (this.field2225 != null && var6.method805(this.field2225.field801, false)) {
                        return;
                    }
                    var3 = var6.method809(arg1 - 24681);
                    if (this.field2234 != var6.field1646) {
                        var4 = var6.field1672;
                    }
                } else if (var6 != null && var6.field1648 != -1 && this.field2234 != var6.field1646) {
                    var4 = var6.field1672;
                    var3 = var6.field1648;
                }
            } else if (this.field2234 != var5.field1646) {
                var3 = var5.field1648;
                var4 = var5.field1672;
            }
        }
        if (var3 == -1) {
            this.field2225 = null;
            return;
        }
        this.field2222 = null;
        if (this.field2225 == null || this.field2225.field801 != var3) {
            this.field2225 = class50.field716.method831(var3, (byte) 54);
        } else if (this.field2225.field792 == 0) {
            return;
        }
        if (this.field2225.field796 == null) {
            this.field2225 = null;
            return;
        }
        if (var4) {
            this.field2243 = (int) ((double) this.field2225.field796.length * Math.random());
            this.field2232 = (int) (Math.random() * (double) this.field2225.field788[this.field2243]) + 1;
        } else {
            this.field2243 = 0;
            this.field2232 = 1;
        }
        this.field2227 = this.field2243 + 1;
        if (this.field2227 < 0 || this.field2225.field796.length <= this.field2227) {
            this.field2227 = -1;
        }
        if (arg1 != 24561) {
            this.field2239 = null;
        }
        this.field2259 = class28.field417 - this.field2232;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)V")
    public static final void method1060(int arg0, int arg1) {
        class229.field3218 = arg0;
        field2226++;
        class473 var2 = client.field7546;
        synchronized (client.field7546) {
            client.field7546.method2764(arg1 ^ 0x6115);
            if (arg1 != -25110) {
                method1050(40, -51, (byte) 59, 49, 33, 110, -103);
            }
        }
        class473 var3 = class134.field2044;
        synchronized (class134.field2044) {
            class134.field2044.method2764(-769);
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(Lza;I)V")
    public final void method1061(class295 arg0, int arg1) {
        field2258++;
        if (arg1 != -1) {
            this.field2255 = 47;
        }
        this.method1054(true, this.field2251, true, arg0, 262144, this.field2246, true);
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lza;Lpm;IIIIIIZI)V")
    public class147(class295 arg0, class103 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field2249 = (byte) arg4;
        this.field2256 = (byte) arg5;
        this.field2229 = arg8;
        this.field2224 = arg2;
        this.field2255 = arg1.field1646;
        this.field2247 = arg3;
        this.field2251 = arg7;
        this.field2246 = arg6;
        this.field2236 = arg0.method498() && arg1.field1614 && !this.field2229;
        if (arg9 != -1) {
            this.field2223 = true;
        }
        this.method1059(arg9, 24561);
    }
}
