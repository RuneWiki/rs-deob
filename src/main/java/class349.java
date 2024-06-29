import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class349 {

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    private int field5037 = -32768;

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "Z")
    private boolean field5047 = false;

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "Z")
    private boolean field5052 = false;

    @OriginalMember(owner = "client!fs", name = "w", descriptor = "I")
    private int field5058 = -1;

    @OriginalMember(owner = "client!fs", name = "A", descriptor = "I")
    private int field5062 = -1;

    @OriginalMember(owner = "client!fs", name = "x", descriptor = "I")
    public int field5059;

    @OriginalMember(owner = "client!fs", name = "O", descriptor = "I")
    private int field5076;

    @OriginalMember(owner = "client!fs", name = "D", descriptor = "I")
    private int field5065;

    @OriginalMember(owner = "client!fs", name = "t", descriptor = "B")
    private byte field5055;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public int field5038;

    @OriginalMember(owner = "client!fs", name = "M", descriptor = "I")
    public int field5074;

    @OriginalMember(owner = "client!fs", name = "Q", descriptor = "B")
    private byte field5078;

    @OriginalMember(owner = "client!fs", name = "H", descriptor = "Z")
    private boolean field5069;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
    public static int field5048 = 0;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "[[Z")
    public static boolean[][] field5043 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!fs", name = "y", descriptor = "I")
    public static int field5060 = 0;

    @OriginalMember(owner = "client!fs", name = "J", descriptor = "[[B")
    public static byte[][] field5071 = new byte[50][];

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    private int field5041;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
    private int field5054;

    @OriginalMember(owner = "client!fs", name = "v", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!fs", name = "z", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!fs", name = "B", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!fs", name = "C", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!fs", name = "E", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!fs", name = "F", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!fs", name = "G", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!fs", name = "K", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!fs", name = "L", descriptor = "I")
    private int field5073;

    @OriginalMember(owner = "client!fs", name = "P", descriptor = "I")
    private int field5077;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "Lrj;")
    private class12 field5044;

    @OriginalMember(owner = "client!fs", name = "u", descriptor = "Llm;")
    public static class347 field5056;

    @OriginalMember(owner = "client!fs", name = "N", descriptor = "Ldc;")
    private class375 field5075;

    @OriginalMember(owner = "client!fs", name = "I", descriptor = "Lkr;")
    public class6 field5070;

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "Lri;")
    private class98 field5053;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "Z")
    public static boolean field5042;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "[I")
    public static int[] field5050;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "[Z")
    private boolean[] field5036;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIZLui;)V")
    public static final void method2289(int arg0, int arg1, int arg2, int arg3, boolean arg4, class365 arg5) {
        field5049++;
        if (arg5.field5271 == -1 && arg5.field5290 == null) {
            return;
        }
        int var6 = 0;
        if (!arg4) {
            return;
        }
        int var7 = class156.field2123 * arg5.field5268 >> 8;
        if (arg5.field5270 < arg0) {
            var6 += arg0 - arg5.field5270;
        } else if (arg0 < arg5.field5264) {
            var6 += arg5.field5264 - arg0;
        }
        if (arg5.field5284 < arg2) {
            var6 += arg2 - arg5.field5284;
        } else if (arg5.field5293 > arg2) {
            var6 += arg5.field5293 - arg2;
        }
        if (arg5.field5283 == 0 || arg5.field5283 < var6 - 64 || class156.field2123 == 0 || arg5.field5274 != arg1) {
            if (arg5.field5275 != null) {
                class156.field2122.method2502(arg5.field5275);
                arg5.field5275 = null;
            }
            if (arg5.field5266 != null) {
                class156.field2122.method2502(arg5.field5266);
                arg5.field5266 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg5.field5283 - var6) * var7 / arg5.field5283;
        if (arg5.field5275 != null) {
            arg5.field5275.method863(var8);
        } else if (arg5.field5271 >= 0) {
            class285 var9 = class285.method1959(class309.field4551, arg5.field5271, 0);
            if (var9 != null) {
                class13 var10 = var9.method1958().method92(class375.field5450);
                class137 var11 = class137.method856(var10, 100, var8);
                var11.method887(-1);
                class156.field2122.method2506(var11);
                arg5.field5275 = var11;
            }
        }
        if (arg5.field5266 != null) {
            arg5.field5266.method863(var8);
            if (!arg5.field5266.method323((byte) 69)) {
                arg5.field5266 = null;
            }
        } else if (arg5.field5290 != null && (arg5.field5279 -= arg3) <= 0) {
            int var12 = (int) ((double) arg5.field5290.length * Math.random());
            class285 var13 = class285.method1959(class309.field4551, arg5.field5290[var12], 0);
            if (var13 != null) {
                class13 var14 = var13.method1958().method92(class375.field5450);
                class137 var15 = class137.method856(var14, 100, var8);
                var15.method887(0);
                class156.field2122.method2506(var15);
                arg5.field5266 = var15;
                arg5.field5279 = (int) ((double) (arg5.field5287 - arg5.field5265) * Math.random()) + arg5.field5265;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLii;)V")
    public final void method2290(byte arg0, class405 arg1) {
        field5067++;
        this.method2300(-1, true, this.field5065, 131072, arg1, this.field5076, true);
        int var3 = -53 / ((21 - arg0) / 34);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZLn;)I")
    public static final int method2291(boolean arg0, class25 arg1) {
        field5064++;
        if (!arg0) {
            field5042 = false;
        }
        int var2 = arg1.field331;
        class396 var3 = arg1.method2040(false);
        if (arg1.field4285) {
            var2 = arg1.field356;
        } else if (arg1.field4298 == var3.field5859 || arg1.field4298 == var3.field5862 || arg1.field4298 == var3.field5861 || arg1.field4298 == var3.field5860) {
            var2 = arg1.field350;
        } else if (arg1.field4298 == var3.field5867 || arg1.field4298 == var3.field5877 || arg1.field4298 == var3.field5885 || arg1.field4298 == var3.field5844) {
            var2 = arg1.field325;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IB)V")
    public final void method2292(int arg0, byte arg1) {
        this.field5047 = true;
        if (arg1 <= 27) {
            field5060 = 97;
        }
        field5072++;
        this.method2296((byte) 73, arg0);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)I")
    public final int method2293(byte arg0) {
        field5040++;
        return arg0 < 62 ? 4 : this.field5037;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILii;)V")
    public final void method2294(int arg0, class405 arg1) {
        field5051++;
        if (arg0 != 1) {
            this.field5076 = -56;
        }
        if (this.field5053 != null) {
            class142.method903(this.field5053, this.field5078, this.field5065, this.field5076, this.field5036);
            this.field5053 = null;
            this.field5036 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZIZIILdc;ILii;)V")
    public final void method2295(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, class375 arg5, int arg6, class405 arg7) {
        if (arg0) {
            method2291(true, (class25) null);
        }
        field5045++;
        class359[] var9 = arg5.method1577();
        class215[] var10 = arg5.method1616();
        if ((this.field5070 == null || this.field5070.field73) && (var9 != null || var10 != null)) {
            class104 var11 = class329.method2190((byte) 63, this.field5038);
            if (var11.field1518 != null) {
                var11 = var11.method708((byte) 71);
            }
            if (var11 != null) {
                this.field5070 = new class6(class28.field418);
            }
        }
        if (this.field5070 == null) {
            return;
        }
        if (arg2) {
            this.field5070.method36(arg7, (long) class28.field418, var9, var10, false);
        } else {
            this.field5070.method46((long) class28.field418);
        }
        this.field5070.method44(this.field5055, arg4, arg3, arg6, arg1);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BI)V")
    private final void method2296(byte arg0, int arg1) {
        field5057++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class104 var5 = class329.method2190((byte) 63, this.field5038);
            class104 var6 = var5;
            if (var5.field1518 != null) {
                var5 = var5.method708((byte) 115);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field1434 != null) {
                if (this.field5044 != null && var5.method705(-105, this.field5044.field200)) {
                    return;
                }
                var3 = var5.method698(22980);
                if (this.field5062 != var5.field1507) {
                    var4 = var5.field1438;
                }
            } else if (var5.field1445 == -1) {
                if (var6 != null && var6.field1434 != null) {
                    if (this.field5044 != null && var6.method705(-73, this.field5044.field200)) {
                        return;
                    }
                    var3 = var6.method698(22980);
                    if (this.field5062 != var6.field1507) {
                        var4 = var6.field1438;
                    }
                } else if (var6 != null && var6.field1445 != -1 && this.field5062 != var6.field1507) {
                    var3 = var6.field1445;
                    var4 = var6.field1438;
                }
            } else if (this.field5062 != var5.field1507) {
                var3 = var5.field1445;
                var4 = var5.field1438;
            }
        }
        int var7 = -6 / ((arg0 + 23) / 55);
        if (var3 == -1) {
            this.field5044 = null;
            return;
        }
        this.field5075 = null;
        if (this.field5044 == null || this.field5044.field200 != var3) {
            this.field5044 = class33.method221((byte) 102, var3);
        } else if (this.field5044.field193 == 0) {
            return;
        }
        if (this.field5044.field182 == null) {
            this.field5044 = null;
            return;
        }
        if (var4) {
            this.field5054 = (int) (Math.random() * (double) this.field5044.field182.length);
            this.field5041 = (int) ((double) this.field5044.field176[this.field5054] * Math.random()) + 1;
        } else {
            this.field5041 = 1;
            this.field5054 = 0;
        }
        this.field5077 = this.field5054 + 1;
        if (this.field5077 < 0 || this.field5077 >= this.field5044.field182.length) {
            this.field5077 = -1;
        }
        this.field5073 = class28.field418 - this.field5041;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)Z")
    public final boolean method2297(int arg0) {
        field5046++;
        if (arg0 > -38) {
            this.method2290((byte) 93, (class405) null);
        }
        return this.field5069;
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)I")
    public static final int method2298(int arg0) {
        field5063++;
        int var1 = -128 % ((-arg0 - 41) / 62);
        class189 var2 = class211.field2822;
        synchronized (class211.field2822) {
            return class211.field2822.method1143(true);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)V")
    private final void method2299(int arg0, int arg1, int arg2) {
        if (arg2 >= -33) {
            this.field5058 = -56;
        }
        field5061++;
        label92: while (true) {
            if (this.field5044 == null) {
                if (this.field5047) {
                    return;
                }
                this.method2296((byte) 89, -1);
                if (this.field5044 == null) {
                    return;
                }
            }
            int var4 = class28.field418 - this.field5073;
            if (var4 > 100 && this.field5044.field177 > 0) {
                int var5 = this.field5044.field182.length - this.field5044.field177;
                while (var5 > this.field5054 && this.field5044.field176[this.field5054] < var4) {
                    var4 -= this.field5044.field176[this.field5054];
                    this.field5054++;
                }
                if (this.field5054 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field5044.field182.length; var7++) {
                        var6 += this.field5044.field176[var7];
                    }
                    var4 %= var6;
                }
                this.field5077 = this.field5054 + 1;
                if (this.field5077 >= this.field5044.field182.length) {
                    this.field5077 -= this.field5044.field177;
                    if (this.field5077 < 0 || this.field5044.field182.length <= this.field5077) {
                        this.field5077 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field5044.field176[this.field5054] >= var4) {
                            this.field5041 = var4;
                            this.field5073 = class28.field418 - var4;
                            return;
                        }
                        class298.method2049(arg0, false, arg1, 9757, this.field5054, this.field5044);
                        var4 -= this.field5044.field176[this.field5054];
                        this.field5054++;
                        if (this.field5054 >= this.field5044.field182.length) {
                            this.field5054 -= this.field5044.field177;
                            if (this.field5054 < 0 || this.field5054 >= this.field5044.field182.length) {
                                this.field5044 = null;
                                continue label92;
                            }
                        }
                        this.field5077 = this.field5054 + 1;
                    } while (this.field5044.field182.length > this.field5077);
                    this.field5077 -= this.field5044.field177;
                } while (this.field5077 >= 0 && this.field5044.field182.length > this.field5077);
                this.field5077 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZIILii;IZ)Ldc;")
    public final class375 method2300(int arg0, boolean arg1, int arg2, int arg3, class405 arg4, int arg5, boolean arg6) {
        field5068++;
        class104 var8 = class329.method2190((byte) 63, this.field5038);
        if (var8.field1518 != null) {
            var8 = var8.method708((byte) 96);
        }
        if (var8 == null) {
            this.method2294(arg0 ^ 0xFFFFFFFE, arg4);
            this.field5058 = this.field5054;
            this.field5062 = -1;
            return null;
        }
        if (!this.field5047 && this.field5062 != var8.field1507) {
            this.field5075 = null;
            this.method2296((byte) -106, -1);
        }
        this.method2299(arg5, arg2, -68);
        boolean var9 = arg1 & ~class423.field6238 != arg0 & this.field5069;
        boolean var10 = var9 & (this.field5062 != var8.field1507 || (this.field5058 != this.field5054 || this.field5044 != null && (this.field5044.field175 || class120.field1676) && this.field5077 != this.field5054) && class423.field6238 >= 2);
        if (arg6 && !var10) {
            this.field5062 = var8.field1507;
            this.field5058 = this.field5054;
            return null;
        }
        if (var10) {
            class142.method903(this.field5053, this.field5078, this.field5065, this.field5076, this.field5036);
        }
        class351 var11 = class12.field205[this.field5078];
        class351 var12;
        if (this.field5052) {
            var12 = class265.field3846[0];
        } else {
            var12 = this.field5078 >= 3 ? null : class12.field205[this.field5078 + 1];
        }
        class375 var13 = null;
        if (this.field5044 != null) {
            if (var10) {
                arg3 |= 0x20000;
            }
            var13 = var8.method700(this.field5059 == 11 ? 10 : this.field5059, this.field5077, this.field5059 == 11 ? this.field5074 + 4 : this.field5074, arg0 - 73, this.field5065, this.field5054, var12, this.field5041, this.field5076, var11.method745(this.field5065, this.field5076), this.field5044, var11, arg3, arg4);
            if (var13 == null) {
                this.field5037 = 0;
                this.field5053 = null;
                this.field5036 = null;
            } else {
                if (var10) {
                    if (this.field5036 == null) {
                        this.field5036 = new boolean[4];
                    }
                    this.field5053 = var13.method1589(this.field5053);
                    class161.method995(this.field5053, this.field5078, arg2, arg5, this.field5036);
                }
                this.field5037 = var13.method1597();
            }
            this.field5075 = null;
        } else if (this.field5075 != null && (arg3 & this.field5075.method1608()) == arg3 && this.field5062 == var8.field1507) {
            var13 = this.field5075;
        } else {
            if (this.field5075 != null) {
                arg3 |= this.field5075.method1608();
            }
            class386 var14 = var8.method706(false, var12, this.field5076, var10, this.field5065, arg3, this.field5059 == 11 ? 10 : this.field5059, this.field5059 == 11 ? this.field5074 + 4 : this.field5074, var11, var11.method745(this.field5065, this.field5076), arg4);
            if (var14 == null) {
                this.field5053 = null;
                this.field5036 = null;
                this.field5037 = 0;
                this.field5075 = null;
            } else {
                var13 = var14.field5592;
                this.field5075 = var14.field5592;
                if (var10) {
                    this.field5036 = null;
                    this.field5053 = var14.field5595;
                    class161.method995(this.field5053, this.field5078, arg2, arg5, (boolean[]) null);
                }
                this.field5037 = var13.method1597();
            }
        }
        this.field5062 = var8.field1507;
        this.field5058 = this.field5054;
        this.field5076 = arg5;
        this.field5065 = arg2;
        return var13;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lmp;IIIII)V")
    public static final void method2301(class21 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field279 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field277[var6] != null) {
                arg0.field279++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field279; var7++) {
            int var8 = class23.field304[arg1][arg2][arg3];
            while (var8 != 0) {
                class227 var12 = class75.field1078[(var8 & 0xFF) - 1];
                var8 >>>= 0x8;
                if (arg0.field277[var7] == var12) {
                    continue label50;
                }
            }
            int var9 = class23.field304[arg1][arg4][arg5];
            while (var9 != 0) {
                class227 var11 = class75.field1078[(var9 & 0xFF) - 1];
                var9 >>>= 0x8;
                if (arg0.field277[var7] == var11) {
                    continue label50;
                }
            }
            for (int var10 = var7; var10 < arg0.field279 - 1; var10++) {
                arg0.field277[var10] = arg0.field277[var10 + 1];
            }
            arg0.field279--;
        }
    }

    @OriginalMember(owner = "client!fs", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field5066++;
        if (this.field5070 != null) {
            this.field5070.method40();
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(ILii;)V")
    public static final void method2302(int arg0, class405 arg1) {
        field5039++;
        if (arg0 > 41 && class276.field3998 != class227.field2981 && class213.field2852 != null && class17.method108(class227.field2981, arg1, -1)) {
            class276.field3998 = class227.field2981;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)V")
    public static void method2303(boolean arg0) {
        field5043 = null;
        field5056 = null;
        field5071 = null;
        field5050 = null;
        if (!arg0) {
            field5071 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lii;Lge;IIIIIIZI)V")
    public class349(class405 arg0, class104 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field5052 = arg8;
        this.field5059 = arg2;
        this.field5076 = arg7;
        this.field5065 = arg6;
        this.field5055 = (byte) arg4;
        this.field5038 = arg1.field1507;
        this.field5074 = arg3;
        this.field5078 = (byte) arg5;
        this.field5069 = arg0.method1740() && arg1.field1464 && !this.field5052;
        if (arg9 != -1) {
            this.field5047 = true;
        }
        this.method2296((byte) -104, arg9);
    }
}
