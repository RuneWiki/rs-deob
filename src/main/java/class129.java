import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class129 extends class17 {

    @OriginalMember(owner = "client!ad", name = "ab", descriptor = "I")
    private int field2192 = 0;

    @OriginalMember(owner = "client!ad", name = "db", descriptor = "I")
    private int field2195 = 204;

    @OriginalMember(owner = "client!ad", name = "hb", descriptor = "I")
    private int field2199 = 4;

    @OriginalMember(owner = "client!ad", name = "jb", descriptor = "I")
    private int field2201 = 81;

    @OriginalMember(owner = "client!ad", name = "eb", descriptor = "I")
    private int field2196 = 8;

    @OriginalMember(owner = "client!ad", name = "qb", descriptor = "I")
    private int field2208 = 1024;

    @OriginalMember(owner = "client!ad", name = "xb", descriptor = "I")
    private int field2215 = 1024;

    @OriginalMember(owner = "client!ad", name = "mb", descriptor = "I")
    private int field2204 = 409;

    @OriginalMember(owner = "client!ad", name = "gb", descriptor = "Lsf;")
    private static class108 field2198 = class140.method973(255, "white:");

    @OriginalMember(owner = "client!ad", name = "lb", descriptor = "Lsf;")
    public static class108 field2203 = field2198;

    @OriginalMember(owner = "client!ad", name = "ob", descriptor = "Lsf;")
    public static class108 field2206 = class140.method973(255, " de votre liste d(Wamis)3");

    @OriginalMember(owner = "client!ad", name = "rb", descriptor = "Lsf;")
    public static class108 field2209 = class140.method973(255, "::cardmem");

    @OriginalMember(owner = "client!ad", name = "cb", descriptor = "I")
    public static int field2194 = 0;

    @OriginalMember(owner = "client!ad", name = "Bb", descriptor = "Lsf;")
    public static class108 field2219 = field2198;

    @OriginalMember(owner = "client!ad", name = "bb", descriptor = "I")
    private int field2193;

    @OriginalMember(owner = "client!ad", name = "fb", descriptor = "I")
    private int field2197;

    @OriginalMember(owner = "client!ad", name = "ib", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!ad", name = "pb", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!ad", name = "sb", descriptor = "I")
    private int field2210;

    @OriginalMember(owner = "client!ad", name = "tb", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!ad", name = "ub", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!ad", name = "vb", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!ad", name = "wb", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!ad", name = "zb", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!ad", name = "Ab", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!ad", name = "Cb", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!ad", name = "nb", descriptor = "[I")
    private int[] field2205;

    @OriginalMember(owner = "client!ad", name = "yb", descriptor = "[[B")
    public static byte[][] field2216;

    @OriginalMember(owner = "client!ad", name = "kb", descriptor = "[[I")
    private int[][] field2202;

    @OriginalMember(owner = "client!ad", name = "Db", descriptor = "[[I")
    private int[][] field2221;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(II)[I", line = 6)
    public final int[] method120(int arg0, int arg1) {
        if (arg0 >= -95) {
            return (int[]) null;
        }
        field2200++;
        int[] var3 = this.field217.method1698(-15, arg1);
        if (this.field217.field4295) {
            int var4 = 0;
            int var5;
            for (var5 = class36.field504[arg1] + this.field2192; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field2196 && var5 >= this.field2205[var4]) {
                var4++;
            }
            boolean var6 = (var4 & 0x1) == 0;
            int var7 = var4 - 1;
            int var8 = this.field2205[var4 - 1];
            int var9 = this.field2205[var4];
            if (var8 + this.field2197 < var5 && var5 < (var9 - this.field2197)) {
                for (int var10 = 0; var10 < class116.field2008; var10++) {
                    int var11 = 0;
                    int var12 = var6 ? this.field2208 : -this.field2208;
                    int var13;
                    for (var13 = class61.field979[var10] + (this.field2193 * var12 >> 12); var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field2199 > var11 && var13 >= this.field2202[var7][var11]) {
                        var11++;
                    }
                    int var14 = this.field2202[var7][var11];
                    int var15 = var11 - 1;
                    int var16 = this.field2202[var7][var15];
                    if ((var16 + this.field2197) < var13 && var14 - this.field2197 > var13) {
                        var3[var10] = this.field2221[var7][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class23.method155(var3, 0, class116.field2008, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIIII)V", line = 105)
    public static final void method887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2211++;
        if (arg4 < 128 || arg2 < 128 || arg4 > 13056 || arg2 > 13056) {
            class169.field3035 = -1;
            class180.field3307 = -1;
            return;
        }
        int var8 = class45.method321(121, arg2, arg4, class295.field5159) - arg0;
        int var9 = arg4 - class15.field193;
        int var10 = var8 - class42.field560;
        int var11 = arg2 - class255.field4443;
        int var12 = class263.field4649[class135.field2346];
        int var13 = class263.field4653[class135.field2346];
        int var14 = class263.field4653[class330.field5640];
        int var15 = class263.field4649[class330.field5640];
        int var16 = var9 * var15 + var11 * var14 >> 16;
        int var17 = var11 * var15 - (var9 * var14) >> 16;
        int var19 = var10 * var12 - var13 * var17 >> 16;
        int var20 = var10 * var13 + var12 * var17 >> 16;
        if (arg5 < 91) {
            method890(60);
        }
        if (var20 < 50) {
            class180.field3307 = -1;
            class169.field3035 = -1;
        } else if (class231.field4051) {
            int var22 = arg7 * 512 >> 8;
            int var23 = arg1 * 512 >> 8;
            class169.field3035 = var16 * var23 / var20 + arg6;
            class180.field3307 = var19 * var22 / var20 + arg3;
        } else {
            class180.field3307 = (var19 << 9) / var20 + arg3;
            class169.field3035 = (var16 << 9) / var20 + arg6;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V", line = 358)
    public class129() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLrm;I)V", line = 193)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        field2214++;
        if (arg0 != -114) {
            field2206 = (class108) null;
        }
        if (arg2 == 0) {
            this.field2199 = arg1.method1731(true);
        } else if (arg2 == 1) {
            this.field2196 = arg1.method1731(true);
        } else if (arg2 == 2) {
            this.field2204 = arg1.method1712(-1);
        } else if (arg2 == 3) {
            this.field2195 = arg1.method1712(-1);
        } else if (arg2 == 4) {
            this.field2208 = arg1.method1712(-1);
        } else if (arg2 == 5) {
            this.field2192 = arg1.method1712(-1);
        } else if (arg2 == 6) {
            this.field2201 = arg1.method1712(arg0 + 113);
        } else if (arg2 == 7) {
            this.field2215 = arg1.method1712(arg0 ^ 0x71);
        }
    }

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "(I)V", line = 278)
    public static void method888(int arg0) {
        if (arg0 != -2048) {
            return;
        }
        field2203 = null;
        field2216 = (byte[][]) null;
        field2198 = null;
        field2206 = null;
        field2209 = null;
        field2219 = null;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)V", line = 295)
    private final void method889(byte arg0) {
        Random var2 = new Random((long) this.field2196);
        field2213++;
        this.field2205 = new int[this.field2196 + 1];
        this.field2205[0] = 0;
        this.field2202 = new int[this.field2196][this.field2199 + 1];
        this.field2193 = 4096 / this.field2199;
        this.field2210 = 4096 / this.field2196;
        int var3 = this.field2193 / 2;
        this.field2221 = new int[this.field2196][this.field2199];
        if (arg0 != 65) {
            return;
        }
        int var4 = this.field2210 / 2;
        this.field2197 = this.field2201 / 2;
        for (int var5 = 0; var5 < this.field2196; var5++) {
            if (var5 > 0) {
                int var6 = this.field2210;
                int var7 = (class109.method792(-11163, var2, 4096) - 2048) * this.field2195 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field2205[var5] = this.field2205[var5 - 1] + var8;
            }
            this.field2202[var5][0] = 0;
            for (int var9 = 0; var9 < this.field2199; var9++) {
                if (var9 > 0) {
                    int var10 = this.field2193;
                    int var11 = (class109.method792(-11163, var2, 4096) - 2048) * this.field2204 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field2202[var5][var9] = this.field2202[var5][var9 - 1] + var12;
                }
                this.field2221[var5][var9] = this.field2215 <= 0 ? 4096 : 4096 - class109.method792(-11163, var2, this.field2215);
            }
            this.field2202[var5][this.field2199] = 4096;
        }
        this.field2205[this.field2196] = 4096;
    }

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "(I)V", line = 369)
    public static final void method890(int arg0) {
        field2220++;
        if (class166.field2988 == 5) {
            int var1 = -99 % ((48 - arg0) / 51);
            class166.field2988 = 6;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)V", line = 401)
    public final void method116(boolean arg0) {
        if (!arg0) {
            this.field2221 = (int[][]) ((int[][]) null);
        }
        this.method889((byte) 65);
        field2212++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lsf;BLsf;I)V", line = 441)
    public static final void method891(class108 arg0, byte arg1, class108 arg2, int arg3) {
        class303.field5255 = arg3;
        field2218++;
        class63.field1014 = arg2;
        class63.field1009 = arg0;
        if (class63.field1014.method779(class63.field1016, 74) || class63.field1009.method779(class63.field1016, 71)) {
            class211.field3766 = 3;
        } else if (class182.field3334 == -1) {
            class288.field5038 = 1;
            class84.field1318 = 0;
            class105.field1825 = 0;
            class211.field3766 = -3;
            if (arg1 <= 70) {
                method887(-13, -62, 79, -62, -115, 113, 34, 11);
            }
            class249 var4 = new class249(128);
            var4.method1759(-32768, 10);
            var4.method1724(false, (int) (Math.random() * 99999.0D));
            var4.method1724(false, 524);
            var4.method1735((byte) -122, class63.field1014.method743(false));
            var4.method1741((int) (Math.random() * 9.9999999E7D), -1580277072);
            var4.method1708(class63.field1009, 7733);
            var4.method1741((int) (Math.random() * 9.9999999E7D), -1580277072);
            var4.method1730(class184.field3379, -13560, class234.field4133);
            class256.field4471.field4314 = 0;
            class256.field4471.method1759(-32768, 177);
            class256.field4471.method1759(-32768, var4.field4314);
            class256.field4471.method1732(3, var4.field4338, 0, var4.field4314);
        } else {
            class134.method919(-1);
        }
    }
}
