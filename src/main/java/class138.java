import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class138 {

    @OriginalMember(owner = "client!pda", name = "j", descriptor = "Z")
    private boolean field2229 = false;

    @OriginalMember(owner = "client!pda", name = "k", descriptor = "I")
    private int field2230 = 32;

    @OriginalMember(owner = "client!pda", name = "p", descriptor = "J")
    private long field2235 = class254.method1619(true);

    @OriginalMember(owner = "client!pda", name = "r", descriptor = "I")
    private int field2237 = 0;

    @OriginalMember(owner = "client!pda", name = "t", descriptor = "[Lnr;")
    private class19[] field2239 = new class19[8];

    @OriginalMember(owner = "client!pda", name = "s", descriptor = "J")
    private long field2238 = 0L;

    @OriginalMember(owner = "client!pda", name = "w", descriptor = "Z")
    private boolean field2242 = true;

    @OriginalMember(owner = "client!pda", name = "u", descriptor = "J")
    private long field2240 = 0L;

    @OriginalMember(owner = "client!pda", name = "v", descriptor = "I")
    private int field2241 = 0;

    @OriginalMember(owner = "client!pda", name = "C", descriptor = "[Lnr;")
    private class19[] field2248 = new class19[8];

    @OriginalMember(owner = "client!pda", name = "D", descriptor = "I")
    private int field2249 = 0;

    @OriginalMember(owner = "client!pda", name = "z", descriptor = "I")
    private int field2245 = 0;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!pda", name = "e", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!pda", name = "f", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!pda", name = "g", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!pda", name = "h", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!pda", name = "i", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!pda", name = "m", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!pda", name = "n", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!pda", name = "o", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!pda", name = "x", descriptor = "I")
    public int field2243;

    @OriginalMember(owner = "client!pda", name = "y", descriptor = "I")
    private int field2244;

    @OriginalMember(owner = "client!pda", name = "A", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!pda", name = "B", descriptor = "I")
    public int field2247;

    @OriginalMember(owner = "client!pda", name = "l", descriptor = "Lnr;")
    private class19 field2231;

    @OriginalMember(owner = "client!pda", name = "q", descriptor = "[I")
    public int[] field2236;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(BI)V", line = 4)
    private final void method1047(byte arg0, int arg1) {
        field2233++;
        int var3 = 51 / ((arg0 + 73) / 48);
        this.field2245 -= arg1;
        if (this.field2245 < 0) {
            this.field2245 = 0;
        }
        if (this.field2231 != null) {
            this.field2231.method201(arg1);
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "()V", line = 22)
    public void method1048() throws Exception {
        field2224++;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)V", line = 29)
    public void method1049(int arg0) throws Exception {
        field2246++;
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "()V", line = 41)
    public void method1050() {
        field2228++;
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(BI)I", line = 49)
    public static final int method1051(byte arg0, int arg1) {
        if (arg0 < 80) {
            method1051((byte) 22, 120);
        }
        field2220++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILnr;)V", line = 60)
    public final synchronized void method1052(int arg0, class19 arg1) {
        this.field2231 = arg1;
        if (arg0 != 25185) {
            this.method1054(null, 29, -67);
        }
        field2226++;
    }

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "()I", line = 76)
    public int method1053() throws Exception {
        field2223++;
        return this.field2247;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lnr;II)V", line = 87)
    private final void method1054(class19 arg0, int arg1, int arg2) {
        field2221++;
        int var4 = arg2 >> 5;
        class19 var5 = this.field2239[var4];
        if (var5 == null) {
            this.field2248[var4] = arg0;
        } else {
            var5.field270 = arg0;
        }
        this.field2239[var4] = arg0;
        if (arg1 < -33) {
            arg0.field271 = arg2;
        }
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(I)V", line = 109)
    public final synchronized void method1055(int arg0) {
        if (class35.field488 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class35.field488.field3519[var3] == this) {
                    class35.field488.field3519[var3] = null;
                }
                if (class35.field488.field3519[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class35.field488.field3517 = true;
                while (class35.field488.field3521) {
                    class564.method3300((byte) -60, 50L);
                }
                class35.field488 = null;
            }
        }
        field2225++;
        this.method1050();
        this.field2236 = null;
        if (arg0 > -10) {
            this.field2237 = 32;
        }
        this.field2229 = true;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 163)
    public void method1056(Component arg0) throws Exception {
        field2227++;
    }

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "(I)V", line = 171)
    public final synchronized void method1057(int arg0) {
        field2222++;
        if (this.field2229) {
            return;
        }
        long var2 = class254.method1619(true);
        try {
            if (var2 > this.field2235 + 500000L) {
                this.field2235 = var2 - 500000L;
            }
            if (arg0 != 7677) {
                this.method1054(null, -122, -45);
            }
            while ((this.field2235 + 5000L) < var2) {
                this.method1047((byte) -124, 256);
                this.field2235 += (256000 / class616.field8814);
            }
        } catch (Exception var7) {
            this.field2235 = var2;
        }
        if (this.field2236 == null) {
            return;
        }
        try {
            if (this.field2238 != 0L) {
                if (var2 < this.field2238) {
                    return;
                }
                this.method1049(this.field2247);
                this.field2238 = 0L;
                this.field2242 = true;
            }
            int var4 = this.method1053();
            if ((this.field2249 - var4) > this.field2241) {
                this.field2241 = this.field2249 - var4;
            }
            int var5 = this.field2244 + this.field2243;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field2247 < (var5 + 256)) {
                this.field2247 += 1024;
                if (this.field2247 > 16384) {
                    this.field2247 = 16384;
                }
                this.method1050();
                this.method1049(this.field2247);
                var4 = 0;
                this.field2242 = true;
                if (var5 + 256 > this.field2247) {
                    var5 = this.field2247 - 256;
                    this.field2244 = var5 - this.field2243;
                }
            }
            while (var5 > var4) {
                this.method1059(this.field2236, 256);
                this.method1048();
                var4 += 256;
            }
            if (var2 > this.field2240) {
                if (this.field2242) {
                    this.field2242 = false;
                } else if (this.field2241 == 0 && this.field2237 == 0) {
                    this.method1050();
                    this.field2238 = var2 + 2000L;
                    return;
                } else {
                    this.field2244 = Math.min(this.field2237, this.field2241);
                    this.field2237 = this.field2241;
                }
                this.field2241 = 0;
                this.field2240 = var2 + 2000L;
            }
            this.field2249 = var4;
        } catch (Exception var6) {
            this.method1050();
            this.field2238 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "()V", line = 293)
    public void method1058() throws Exception {
        field2232++;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "([II)V", line = 303)
    private final void method1059(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class525.field7704) {
            var3 = arg1 << 1;
        }
        class553.method3239(arg0, 0, var3);
        this.field2245 -= arg1;
        if (this.field2231 != null && this.field2245 <= 0) {
            this.field2245 += class616.field8814 >> 4;
            class623.method3515(0, this.field2231);
            this.method1054(this.field2231, -61, this.field2231.method206());
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
                        class19 var10 = null;
                        class19 var11 = this.field2248[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class158 var12 = var11.field273;
                                if (var12 == null || var12.field2575 <= var8) {
                                    var11.field272 = true;
                                    int var13 = var11.method205();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2575 += var13;
                                    }
                                    if (var4 >= this.field2230) {
                                        break label107;
                                    }
                                    class19 var14 = var11.method202();
                                    if (var14 != null) {
                                        int var15 = var11.field271;
                                        while (var14 != null) {
                                            this.method1054(var14, -50, var15 * var14.method206() >> 8);
                                            var14 = var11.method207();
                                        }
                                    }
                                    class19 var16 = var11.field270;
                                    var11.field270 = null;
                                    if (var10 == null) {
                                        this.field2248[var7] = var16;
                                    } else {
                                        var10.field270 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2239[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field270;
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
                class19 var18 = this.field2248[var17];
                this.field2248[var17] = this.field2239[var17] = null;
                while (var18 != null) {
                    class19 var19 = var18.field270;
                    var18.field270 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2245 < 0) {
            this.field2245 = 0;
        }
        if (this.field2231 != null) {
            this.field2231.method203(arg0, 0, arg1);
        }
        this.field2235 = class254.method1619(true);
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)V", line = 461)
    public final synchronized void method1060(byte arg0) {
        field2234++;
        this.field2242 = true;
        try {
            this.method1058();
            int var2 = 67 / ((arg0 - 19) / 63);
        } catch (Exception var3) {
            this.method1050();
            this.field2238 = class254.method1619(true) + 2000L;
        }
    }
}
