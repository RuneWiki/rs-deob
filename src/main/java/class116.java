import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class116 {

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    private int field2240 = 32;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "J")
    private long field2242 = class1.method2((byte) -61);

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "[Lsg;")
    private class186[] field2247 = new class186[8];

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "J")
    private long field2248 = 0L;

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "Z")
    private boolean field2250 = true;

    @OriginalMember(owner = "client!lg", name = "D", descriptor = "I")
    private int field2251 = 0;

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "I")
    private int field2249 = 0;

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "[Lsg;")
    private class186[] field2252 = new class186[8];

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "J")
    private long field2253 = 0L;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
    private int field2256 = 0;

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "I")
    private int field2255 = 0;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field2225 = 0;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "Z")
    public static boolean field2233 = false;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "[Ldg;")
    public static class38[] field2231 = new class38[2048];

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "[[[I")
    public static int[][][] field2237 = new int[4][13][13];

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "Lob;")
    public static class141 field2243 = class175.method1195(40, "sl_flags");

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "I")
    public int field2254;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "I")
    private int field2257;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
    public int field2258;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "Lph;")
    public static class157 field2229;

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "Lsg;")
    private class186 field2246;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "[I")
    public int[] field2238;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "()I")
    public int method82() throws Exception {
        field2234++;
        return this.field2258;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([II)V")
    private final void method744(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class16.field290) {
            var3 = arg1 << 1;
        }
        class149.method1041(arg0, 0, var3);
        this.field2255 -= arg1;
        if (this.field2246 != null && this.field2255 <= 0) {
            this.field2255 += class108.field2080 >> 4;
            class167.method1150(this.field2246, (byte) 108);
            this.method747(-3, this.field2246.method1240(), this.field2246);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class186 var10 = null;
                        class186 var11 = this.field2252[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class198 var12 = var11.field3613;
                                if (var12 == null || var12.field3772 <= var8) {
                                    var11.field3614 = true;
                                    int var13 = var11.method485();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3772 += var13;
                                    }
                                    if (var4 >= this.field2240) {
                                        break label107;
                                    }
                                    class186 var14 = var11.method476();
                                    if (var14 != null) {
                                        int var15 = var11.field3615;
                                        while (var14 != null) {
                                            this.method747(-3, var15 * var14.method1240() >> 8, var14);
                                            var14 = var11.method492();
                                        }
                                    }
                                    class186 var16 = var11.field3616;
                                    var11.field3616 = null;
                                    if (var10 == null) {
                                        this.field2252[var7] = var16;
                                    } else {
                                        var10.field3616 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2247[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3616;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class186 var18 = this.field2252[var17];
                this.field2252[var17] = this.field2247[var17] = null;
                while (var18 != null) {
                    class186 var19 = var18.field3616;
                    var18.field3616 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2255 < 0) {
            this.field2255 = 0;
        }
        if (this.field2246 != null) {
            this.field2246.method474(arg0, 0, arg1);
        }
        this.field2242 = class1.method2((byte) -74);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static void method745(int arg0) {
        field2237 = null;
        field2231 = null;
        if (arg0 == 0) {
            field2243 = null;
            field2229 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "()V")
    public void method80() throws Exception {
        field2230++;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lsg;I)V")
    public final synchronized void method746(class186 arg0, int arg1) {
        field2235++;
        this.field2246 = arg0;
        if (arg1 != 4) {
            this.field2249 = -95;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IILsg;)V")
    private final void method747(int arg0, int arg1, class186 arg2) {
        field2222++;
        int var4 = arg1 >> 5;
        class186 var5 = this.field2247[var4];
        if (arg0 != -3) {
            field2237 = null;
        }
        if (var5 == null) {
            this.field2252[var4] = arg2;
        } else {
            var5.field3616 = arg2;
        }
        this.field2247[var4] = arg2;
        arg2.field3615 = arg1;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
    public final void method748(int arg0) {
        field2232++;
        this.field2250 = true;
        if (arg0 != 0) {
            this.method751(75);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
    public final synchronized void method749(byte arg0) {
        field2241++;
        this.field2250 = true;
        if (arg0 != -47) {
            return;
        }
        try {
            this.method81();
        } catch (Exception var2) {
            this.method83();
            this.field2253 = class1.method2((byte) -96) + 2000L;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)V")
    private final void method750(byte arg0, int arg1) {
        this.field2255 -= arg1;
        if (arg0 < 72) {
            field2243 = null;
        }
        if (this.field2255 < 0) {
            this.field2255 = 0;
        }
        if (this.field2246 != null) {
            this.field2246.method468(arg1);
        }
        field2228++;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "()V")
    public void method83() {
        field2226++;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method85(Component arg0) throws Exception {
        field2239++;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V")
    public void method84(int arg0) throws Exception {
        field2236++;
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)V")
    public final synchronized void method751(int arg0) {
        field2244++;
        if (this.field2238 == null) {
            return;
        }
        long var2 = class1.method2((byte) -123);
        try {
            if (this.field2253 != 0L) {
                if (this.field2253 > var2) {
                    return;
                }
                this.method84(this.field2258);
                this.field2250 = true;
                this.field2253 = 0L;
            }
            int var4 = this.method82();
            int var5 = -94 / ((arg0 - 25) / 56);
            if (this.field2251 < this.field2256 - var4) {
                this.field2251 = this.field2256 - var4;
            }
            int var6 = this.field2257 + this.field2254;
            if (var6 + 256 > 16384) {
                var6 = 16128;
            }
            if (var6 + 256 > this.field2258) {
                this.field2258 += 1024;
                if (this.field2258 > 16384) {
                    this.field2258 = 16384;
                }
                this.method83();
                this.method84(this.field2258);
                if (var6 + 256 > this.field2258) {
                    var6 = this.field2258 - 256;
                    this.field2257 = var6 - this.field2254;
                }
                this.field2250 = true;
                var4 = 0;
            }
            while (var6 > var4) {
                var4 += 256;
                this.method744(this.field2238, 256);
                this.method80();
            }
            if (this.field2248 < var2) {
                if (this.field2250) {
                    this.field2250 = false;
                } else if (this.field2251 == 0 && this.field2249 == 0) {
                    this.method83();
                    this.field2253 = var2 + 2000L;
                    return;
                } else {
                    this.field2257 = Math.min(this.field2249, this.field2251);
                    this.field2249 = this.field2251;
                }
                this.field2251 = 0;
                this.field2248 = var2 + 2000L;
            }
            this.field2256 = var4;
        } catch (Exception var8) {
            this.method83();
            this.field2253 = var2 + 2000L;
        }
        try {
            if (this.field2242 + 500000L < var2) {
                var2 = this.field2242;
            }
            while (this.field2242 + 5000L < var2) {
                this.method750((byte) 74, 256);
                this.field2242 += 256000 / class108.field2080;
            }
        } catch (Exception var7) {
            this.field2242 = var2;
        }
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "()V")
    public void method81() throws Exception {
        field2223++;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)V")
    public final synchronized void method752(byte arg0) {
        field2227++;
        if (arg0 != -25) {
            return;
        }
        if (class109.field2110 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class109.field2110.field2749[var3] == this) {
                    class109.field2110.field2749[var3] = null;
                }
                if (class109.field2110.field2749[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class109.field2110.field2751 = true;
                while (class109.field2110.field2753) {
                    class93.method638(50L, (byte) -8);
                }
                class109.field2110 = null;
            }
        }
        this.method83();
        this.field2238 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([Lhi;IIIIII[BII)V")
    public static final void method753(class79[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9) {
        class146 var10 = new class146(arg7);
        int var11 = -1;
        while (true) {
            int var12 = var10.method1010(-2);
            if (var12 == 0) {
                if (arg9 <= 38) {
                    field2233 = true;
                }
                field2224++;
                return;
            }
            int var13 = 0;
            var11 += var12;
            while (true) {
                int var14 = var10.method1010(-2);
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method991(255);
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg5 == var17 && var16 >= arg2 && arg2 + 8 > var16 && arg6 <= var15 && arg6 + 8 > var15) {
                    class54 var21 = class175.method1198(-14098, var11);
                    int var22 = arg4 + class166.method1143(var16 & 0x7, arg3, var15 & 0x7, var20, var21.field1073, var21.field1079, -3);
                    int var23 = class88.method596(var21.field1079, var15 & 0x7, var20, arg3, var21.field1073, (byte) -127, var16 & 0x7) + arg1;
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg8;
                        class79 var25 = null;
                        if ((class164.field3177[1][var22][var23] & 0x2) == 2) {
                            var24 = arg8 - 1;
                        }
                        if (var24 >= 0) {
                            var25 = arg0[var24];
                        }
                        class7.method43(var20 + arg3 & 0x3, var22, (byte) 70, var11, arg8, class8.field128, var23, arg8, var19, true, var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIII)V")
    public static final void method754(int arg0, int arg1, int arg2, int arg3) {
        class153 var4 = class131.field2506[arg0][arg1][arg2];
        if (var4 != null) {
            class131.field2506[arg0][arg1][arg2].field2937 = arg3;
        }
    }
}
