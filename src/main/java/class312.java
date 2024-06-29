import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class312 {

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public int field5228 = -1;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public int field5229 = 2;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public int field5242 = -1;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public int field5244 = 5;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    public int field5247 = -1;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public int field5230 = -1;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "Z")
    public boolean field5248 = false;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public int field5241 = 99;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public int field5250 = -1;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Z")
    private boolean field5231 = false;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "Lvm;")
    public static class202 field5238 = new class202(5);

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "[I")
    public static int[] field5255 = new int[32];

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "Lph;")
    private static class229 field5258 = class266.method1858("Loading sprites )2 ", 0);

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "Lph;")
    public static class229 field5257 = field5258;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "[[I")
    public static int[][] field5259 = new int[104][104];

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "Lcc;")
    public static class220 field5256;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "Lsi;")
    public static class66 field5246;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "Ljava/lang/String;")
    public static String field5261;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "[I")
    public int[] field5226;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "[I")
    public int[] field5236;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "[I")
    private int[] field5245;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "[I")
    private int[] field5249;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "[[I")
    public int[][] field5234;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lv;II)Lv;", line = 12)
    public final class286 method2105(class286 arg0, int arg1, int arg2) {
        int var4 = -53 % ((arg2 + 67) / 58);
        field5253++;
        int var5 = this.field5226[arg1];
        class145 var6 = class230.method1648(-96, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method1727(true, true);
        } else {
            class286 var8 = arg0.method1727(!var6.method1069(255, var7), !this.field5231);
            var8.method1716(var6, var7, this.field5231);
            return var8;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 32)
    public static final void method2106(int arg0) {
        field5243++;
        if (class181.field2965 == 0) {
            return;
        }
        try {
            if ((++class112.field1909) > 1500) {
                if (class121.field2031 != null) {
                    class121.field2031.method534(-1);
                    class121.field2031 = null;
                }
                if (class282.field4675 >= 1) {
                    class332.field5661 = -5;
                    class181.field2965 = 0;
                    return;
                }
                class282.field4675++;
                if (class313.field5273 == class148.field2387) {
                    class313.field5273 = class196.field3276;
                } else {
                    class313.field5273 = class148.field2387;
                }
                class181.field2965 = 1;
                class112.field1909 = 0;
            }
            if (class181.field2965 == 1) {
                class314.field5339 = class249.field4143.method683(class313.field5273, arg0 ^ 0x6808, class147.field2376);
                class181.field2965 = 2;
            }
            if (class181.field2965 == 2) {
                if (class314.field5339.field4125 == 2) {
                    throw new IOException();
                }
                if (class314.field5339.field4125 != 1) {
                    return;
                }
                class121.field2031 = new class67((Socket) class314.field5339.field4123, class249.field4143);
                class314.field5339 = null;
                class121.field2031.method527(class121.field2033.field2668, 20737, class121.field2033.field2670, 0);
                if (class307.field5177 != null) {
                    class307.field5177.method662((byte) 93);
                }
                if (class110.field1870 != null) {
                    class110.field1870.method662((byte) 93);
                }
                int var1 = class121.field2031.method529(-27959);
                if (class307.field5177 != null) {
                    class307.field5177.method662((byte) 93);
                }
                if (class110.field1870 != null) {
                    class110.field1870.method662((byte) 93);
                }
                if (var1 != 101) {
                    class181.field2965 = 0;
                    class332.field5661 = var1;
                    class121.field2031.method534(-1);
                    class121.field2031 = null;
                    return;
                }
                class181.field2965 = 3;
            }
            if (arg0 != 26632) {
                return;
            }
            if (class181.field2965 == 3) {
                if (class121.field2031.method525(false) < 2) {
                    return;
                }
                int var2 = class121.field2031.method529(-27959) << 8 | class121.field2031.method529(-27959);
                class288.method1974(var2, -24910);
                if (class209.field3457 != -1) {
                    class181.field2965 = 0;
                    class121.field2031.method534(-1);
                    class121.field2031 = null;
                    class116.method878(26666);
                    return;
                }
                class332.field5661 = 6;
                class181.field2965 = 0;
                class121.field2031.method534(-1);
                class121.field2031 = null;
                return;
            }
        } catch (IOException var4) {
            if (class121.field2031 != null) {
                class121.field2031.method534(arg0 ^ 0xFFFF97F7);
                class121.field2031 = null;
            }
            if (class282.field4675 >= 1) {
                class181.field2965 = 0;
                class332.field5661 = -4;
            } else {
                class181.field2965 = 1;
                class282.field4675++;
                class112.field1909 = 0;
                if (class313.field5273 == class148.field2387) {
                    class313.field5273 = class196.field3276;
                } else {
                    class313.field5273 = class148.field2387;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lhb;IB)V", line = 186)
    private final void method2107(class164 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            int var13 = arg0.method1161(true);
            this.field5236 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field5236[var14] = arg0.method1161(true);
            }
            this.field5226 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field5226[var15] = arg0.method1161(true);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field5226[var16] += arg0.method1161(true) << 16;
            }
        } else if (arg1 == 2) {
            this.field5228 = arg0.method1161(true);
        } else if (arg1 == 3) {
            int var4 = arg0.method1178(8);
            this.field5249 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5249[var5] = arg0.method1178(8);
            }
            this.field5249[var4] = 9999999;
        } else if (arg1 == 4) {
            this.field5248 = true;
        } else if (arg1 == 5) {
            this.field5244 = arg0.method1178(8);
        } else if (arg1 == 6) {
            this.field5230 = arg0.method1161(true);
        } else if (arg1 == 7) {
            this.field5242 = arg0.method1161(true);
        } else if (arg1 == 8) {
            this.field5241 = arg0.method1178(8);
        } else if (arg1 == 9) {
            this.field5250 = arg0.method1178(8);
        } else if (arg1 == 10) {
            this.field5247 = arg0.method1178(8);
        } else if (arg1 == 11) {
            this.field5229 = arg0.method1178(8);
        } else if (arg1 == 12) {
            int var6 = arg0.method1178(8);
            this.field5245 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5245[var7] = arg0.method1161(true);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field5245[var8] = (arg0.method1161(true) << 16) + this.field5245[var8];
            }
        } else if (arg1 == 13) {
            int var9 = arg0.method1161(true);
            this.field5234 = new int[var9][];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = arg0.method1178(8);
                if (var11 > 0) {
                    this.field5234[var10] = new int[var11];
                    this.field5234[var10][0] = arg0.method1176(1048115912);
                    for (int var12 = 1; var12 < var11; var12++) {
                        this.field5234[var10][var12] = arg0.method1161(true);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field5231 = true;
        }
        field5237++;
        if (arg2 >= -92) {
            method2106(-124);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lwa;Lv;IIB)Lv;", line = 344)
    public final class286 method2108(class312 arg0, class286 arg1, int arg2, int arg3, byte arg4) {
        int var6 = this.field5226[arg3];
        field5235++;
        class145 var7 = class230.method1648(-127, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg0.method2114(arg2, arg1, (byte) -2);
        }
        int var9 = -75 / ((arg4 + 64) / 55);
        int var10 = arg0.field5226[arg2];
        class145 var11 = class230.method1648(-25, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            class286 var13 = arg1.method1713(!var7.method1069(255, var8), !this.field5231);
            var13.method1716(var7, var8, this.field5231);
            return var13;
        } else {
            class286 var14 = arg1.method1713(!var7.method1069(255, var8) & !var11.method1069(255, var12), !arg0.field5231 & !this.field5231);
            var14.method1714(var7, var8, var11, var12, this.field5249, this.field5231 | arg0.field5231);
            return var14;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V", line = 378)
    public static void method2109(int arg0) {
        field5238 = null;
        field5256 = null;
        if (arg0 < 55) {
            return;
        }
        field5246 = null;
        field5257 = null;
        field5258 = null;
        field5261 = null;
        field5255 = null;
        field5259 = (int[][]) null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILhb;)V", line = 400)
    public final void method2110(int arg0, class164 arg1) {
        while (true) {
            int var3 = arg1.method1178(8);
            if (var3 == 0) {
                field5251++;
                if (arg0 != 104) {
                    this.method2110(-41, (class164) null);
                }
                return;
            }
            this.method2107(arg1, var3, (byte) -116);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBLv;)Lv;", line = 422)
    public final class286 method2111(int arg0, byte arg1, class286 arg2) {
        int var4 = this.field5226[arg0];
        class145 var5 = class230.method1648(82, var4 >> 16);
        field5233++;
        int var6 = 4 % ((arg1 - 36) / 37);
        int var7 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method1713(true, true);
        }
        int var8 = 0;
        class145 var9 = null;
        if (this.field5245 != null && this.field5245.length > arg0) {
            int var10 = this.field5245[arg0];
            var9 = class230.method1648(64, var10 >> 16);
            var8 = var10 & 0xFFFF;
        }
        if (var9 == null || var8 == 65535) {
            class286 var12 = arg2.method1713(!var5.method1069(255, var7), !this.field5231);
            var12.method1716(var5, var7, this.field5231);
            return var12;
        } else {
            class286 var11 = arg2.method1713(!var5.method1069(255, var7) & !var9.method1069(255, var8), !this.field5231);
            var11.method1716(var5, var7, this.field5231);
            var11.method1716(var9, var8, this.field5231);
            return var11;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lsi;ILsi;ZLfg;)V", line = 465)
    public static final void method2112(class66 arg0, int arg1, class66 arg2, boolean arg3, class81 arg4) {
        field5232++;
        class17.field222 = arg0;
        class121.field2040 = arg2;
        class217.field3561 = arg3;
        int var5 = class121.field2040.method499((byte) -82) - 1;
        class154.field2507 = class121.field2040.method517((byte) -126, var5) + var5 * 256;
        if (arg1 == -1501) {
            class306.field5151 = arg4;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILv;II)Lv;", line = 484)
    public final class286 method2113(int arg0, class286 arg1, int arg2, int arg3) {
        field5227++;
        int var5 = this.field5226[arg3];
        class145 var6 = class230.method1648(-72, var5 >> 16);
        if (arg2 != 0) {
            return (class286) null;
        }
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method1713(true, true);
        }
        int var8 = arg0 & 0x3;
        class286 var9 = arg1.method1713(!var6.method1069(arg2 + 255, var7), !this.field5231);
        if (var8 == 1) {
            var9.method1710();
        } else if (var8 == 2) {
            var9.method1730();
        } else if (var8 == 3) {
            var9.method1733();
        }
        var9.method1716(var6, var7, this.field5231);
        if (var8 == 1) {
            var9.method1733();
        } else if (var8 == 2) {
            var9.method1730();
        } else if (var8 == 3) {
            var9.method1710();
        }
        return var9;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILv;B)Lv;", line = 553)
    public final class286 method2114(int arg0, class286 arg1, byte arg2) {
        int var4 = this.field5226[arg0];
        field5239++;
        if (arg2 != -2) {
            this.field5245 = (int[]) null;
        }
        class145 var5 = class230.method1648(-104, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method1713(true, true);
        } else {
            class286 var7 = arg1.method1713(!var5.method1069(255, var6), !this.field5231);
            var7.method1716(var5, var6, this.field5231);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V", line = 587)
    public final void method2115(boolean arg0) {
        if (this.field5247 == -1) {
            if (this.field5249 == null) {
                this.field5247 = 0;
            } else {
                this.field5247 = 2;
            }
        }
        if (!arg0) {
            this.field5242 = 83;
        }
        field5240++;
        if (this.field5250 != -1) {
            return;
        }
        if (this.field5249 == null) {
            this.field5250 = 0;
        } else {
            this.field5250 = 2;
        }
    }
}
