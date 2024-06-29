import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class131 extends class21 {

    @OriginalMember(owner = "client!rk", name = "Y", descriptor = "I")
    private int field2219 = 0;

    @OriginalMember(owner = "client!rk", name = "W", descriptor = "I")
    private int field2217 = 0;

    @OriginalMember(owner = "client!rk", name = "N", descriptor = "I")
    private int field2208 = 0;

    @OriginalMember(owner = "client!rk", name = "ab", descriptor = "[Z")
    public static boolean[] field2221 = new boolean[100];

    @OriginalMember(owner = "client!rk", name = "fb", descriptor = "[I")
    public static int[] field2226 = new int[32768];

    @OriginalMember(owner = "client!rk", name = "P", descriptor = "I")
    public static int field2210 = 0;

    @OriginalMember(owner = "client!rk", name = "O", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!rk", name = "Q", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!rk", name = "R", descriptor = "I")
    private int field2212;

    @OriginalMember(owner = "client!rk", name = "S", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!rk", name = "T", descriptor = "I")
    private int field2214;

    @OriginalMember(owner = "client!rk", name = "U", descriptor = "I")
    private int field2215;

    @OriginalMember(owner = "client!rk", name = "V", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!rk", name = "X", descriptor = "I")
    private int field2218;

    @OriginalMember(owner = "client!rk", name = "Z", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!rk", name = "bb", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!rk", name = "cb", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!rk", name = "db", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!rk", name = "eb", descriptor = "I")
    private int field2225;

    @OriginalMember(owner = "client!rk", name = "gb", descriptor = "I")
    private int field2227;

    @OriginalMember(owner = "client!rk", name = "hb", descriptor = "[I")
    public static int[] field2228;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILag;)V", line = 10)
    public final void method178(int arg0, int arg1, class202 arg2) {
        field2223++;
        if (arg1 == 0) {
            this.field2208 = arg2.method1356(false);
        } else if (arg1 == 1) {
            this.field2217 = (arg2.method1333(-127) << 12) / 100;
        } else if (arg1 == 2) {
            this.field2219 = (arg2.method1333(-128) << 12) / 100;
        }
        if (arg0 != -318) {
            method865((String) null, 3);
        }
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(Z)V", line = 54)
    public static void method860(boolean arg0) {
        field2228 = null;
        field2226 = null;
        if (arg0) {
            method863(-99, -26, -114, 124, -75, -83);
        }
        field2221 = null;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(BIII)V", line = 75)
    private final void method861(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 <= 2048 ? (arg3 + 4096) * arg1 >> 12 : arg1 + arg3 - (arg1 * arg3 >> 12);
        if (var5 <= 0) {
            this.field2225 = this.field2227 = this.field2218 = arg1;
        } else {
            int var6 = arg2 * 6;
            int var7 = arg1 + arg1 - var5;
            int var8 = var6 >> 12;
            int var10 = var6 - (var8 << 12);
            int var11 = (var5 - var7 << 12) / var5;
            int var12 = var5 * var11 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var5 - var13;
            int var15 = var7 + var13;
            if (var8 == 0) {
                this.field2225 = var5;
                this.field2227 = var15;
                this.field2218 = var7;
            } else if (var8 == 1) {
                this.field2218 = var7;
                this.field2225 = var14;
                this.field2227 = var5;
            } else if (var8 == 2) {
                this.field2218 = var15;
                this.field2227 = var5;
                this.field2225 = var7;
            } else if (var8 == 3) {
                this.field2218 = var5;
                this.field2225 = var7;
                this.field2227 = var14;
            } else if (var8 == 4) {
                this.field2227 = var7;
                this.field2225 = var15;
                this.field2218 = var5;
            } else if (var8 == 5) {
                this.field2218 = var14;
                this.field2227 = var7;
                this.field2225 = var5;
            }
        }
        field2211++;
        if (arg0 < 33) {
            method865((String) null, -16);
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V", line = 396)
    public class131() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBII)V", line = 187)
    private final void method862(int arg0, byte arg1, int arg2, int arg3) {
        field2209++;
        int var5 = arg3 >= arg2 ? arg3 : arg2;
        int var6 = arg3 > arg2 ? arg2 : arg3;
        if (arg1 != -52) {
            method860(false);
        }
        int var7 = arg0 < var6 ? arg0 : var6;
        int var8 = arg0 <= var5 ? var5 : arg0;
        this.field2214 = (var7 + var8) / 2;
        int var9 = var8 - var7;
        if (this.field2214 > 0 && this.field2214 < 4096) {
            this.field2215 = (var9 << 12) / (this.field2214 <= 2048 ? this.field2214 * 2 : 8192 - this.field2214 * 2);
        } else {
            this.field2215 = 0;
        }
        if (var9 <= 0) {
            this.field2212 = 0;
            return;
        }
        int var10 = (var8 - arg2 << 12) / var9;
        int var11 = (var8 - arg3 << 12) / var9;
        int var12 = (var8 - arg0 << 12) / var9;
        if (arg2 == var8) {
            this.field2212 = arg3 == var7 ? var12 + 20480 : -var11 + 4096;
        } else if (arg3 == var8) {
            this.field2212 = arg0 == var7 ? var10 + 4096 : -var12 + 12288;
        } else {
            this.field2212 = arg2 == var7 ? var11 + 12288 : -var10 + 20480;
        }
        this.field2212 /= 6;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIII)V", line = 247)
    public static final void method863(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2220++;
        if (arg0 <= class186.field3028 && class59.field1162 <= arg3) {
            boolean var6;
            if (arg5 < class147.field2416) {
                arg5 = class147.field2416;
                var6 = false;
            } else if (arg5 > class259.field4024) {
                var6 = false;
                arg5 = class259.field4024;
            } else {
                var6 = true;
            }
            boolean var7;
            if (class147.field2416 > arg2) {
                var7 = false;
                arg2 = class147.field2416;
            } else if (arg2 <= class259.field4024) {
                var7 = true;
            } else {
                arg2 = class259.field4024;
                var7 = false;
            }
            if (arg0 < class59.field1162) {
                arg0 = class59.field1162;
            } else {
                class241.method1598(arg4, arg1 ^ 0xFFFFFFF9, class155.field2522[arg0++], arg2, arg5);
            }
            if (arg3 <= class186.field3028) {
                class241.method1598(arg4, -7, class155.field2522[arg3--], arg2, arg5);
            } else {
                arg3 = class186.field3028;
            }
            if (var6 && var7) {
                for (int var8 = arg0; var8 <= arg3; var8++) {
                    int[] var9 = class155.field2522[var8];
                    var9[arg5] = var9[arg2] = arg4;
                }
            } else if (var6) {
                for (int var11 = arg0; var11 <= arg3; var11++) {
                    class155.field2522[var11][arg5] = arg4;
                }
            } else if (var7) {
                for (int var10 = arg0; var10 <= arg3; var10++) {
                    class155.field2522[var10][arg2] = arg4;
                }
            }
        }
        if (arg1 != 0) {
            field2226 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(III)J", line = 351)
    public static final long method864(int arg0, int arg1, int arg2) {
        class47 var3 = class326.field4975[arg0][arg1][arg2];
        return var3 == null || var3.field967 == null ? 0L : var3.field967.field4446;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 365)
    public static final int method865(String arg0, int arg1) {
        field2216++;
        int var2 = arg0.length();
        int var3 = 0;
        int var4 = -123 / ((arg1 - 34) / 54);
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = class114.method739(false, arg0.charAt(var5)) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILjava/lang/String;)V", line = 387)
    public static final void method866(int arg0, int arg1, String arg2) {
        class2 var3 = class212.method1433(arg1, arg0, -13802);
        var3.method13((byte) -1);
        field2224++;
        var3.field41 = arg2;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(IB)[[I", line = 411)
    public final int[][] method175(int arg0, byte arg1) {
        field2222++;
        int[][] var3 = this.field441.method220(arg0, 17433);
        if (arg1 <= 16) {
            this.method861((byte) 57, -31, 101, -58);
        }
        if (this.field441.field532) {
            int[][] var4 = this.method173(0, arg0, (byte) 124);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class294.field4489; var11++) {
                this.method862(var7[var11], (byte) -52, var5[var11], var6[var11]);
                this.field2214 += this.field2219;
                for (this.field2212 += this.field2208; this.field2212 < 0; this.field2212 += 4096) {
                }
                this.field2215 += this.field2217;
                if (this.field2215 < 0) {
                    this.field2215 = 0;
                }
                if (this.field2215 > 4096) {
                    this.field2215 = 4096;
                }
                if (this.field2214 < 0) {
                    this.field2214 = 0;
                }
                while (this.field2212 > 4096) {
                    this.field2212 -= 4096;
                }
                if (this.field2214 > 4096) {
                    this.field2214 = 4096;
                }
                this.method861((byte) 99, this.field2214, this.field2212, this.field2215);
                var9[var11] = this.field2225;
                var8[var11] = this.field2227;
                var10[var11] = this.field2218;
            }
        }
        return var3;
    }
}
