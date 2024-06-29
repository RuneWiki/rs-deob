import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class144 extends class108 {

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    private int field2551 = -1;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "Lrf;")
    private class30 field2558 = null;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    private int field2550 = -32768;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    private int field2553 = -1;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "I")
    private int field2564;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    private int field2545;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    private int field2557;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    private int field2547;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    private int field2548;

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "I")
    private int field2563;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "Lpk;")
    private class67 field2543;

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "I")
    private int field2562;

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "I")
    private int field2566;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public static int field2546 = 0;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "Lmb;")
    public static class96 field2552 = class243.method1708("Suche nach Updates )2 ", (byte) 94);

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "Lmj;")
    public static class246 field2568;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "[Lmb;")
    public static class96[] field2555;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)Lnb;")
    private final class108 method1063(boolean arg0) {
        field2569++;
        return arg0 ? null : this.method1069(-116, false);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILw;)Lmb;")
    public static final class96 method1064(int arg0, class107 arg1) {
        if (arg0 != -1) {
            field2568 = null;
        }
        field2560++;
        if (class140.method1041(client.method817(arg1), 32677) == 0) {
            return null;
        } else if (arg1.field1959 == null || arg1.field1959.method678((byte) -92).method707(arg0 ^ 0x2C) == 0) {
            return class45.field784 ? class159.field2807 : null;
        } else {
            return arg1.field1959;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIBIII)V")
    public static final void method1065(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field2559++;
        int var6 = class268.method1841(class9.field149, client.field1994, 0, arg5);
        int var7 = class268.method1841(class9.field149, client.field1994, 0, arg4);
        int var8 = class268.method1841(class162.field2884, class9.field145, 0, arg1);
        int var9 = class268.method1841(class162.field2884, class9.field145, 0, arg0);
        for (int var10 = var6; var10 <= var7; var10++) {
            class36.method283(var8, class229.field3939[var10], var9, (byte) -78, arg3);
        }
        int var11 = 58 % ((arg2 + 32) / 36);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "()I")
    public final int method50() {
        field2561++;
        return this.field2550;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIB)V")
    private final void method1066(int arg0, int arg1, byte arg2) {
        if (this.field2543 != null) {
            int var4 = class236.field4053 - this.field2562;
            if (var4 > 100 && this.field2543.field1149 > 0) {
                int var5 = this.field2543.field1140.length - this.field2543.field1149;
                while (var5 > this.field2566 && var4 > this.field2543.field1143[this.field2566]) {
                    var4 -= this.field2543.field1143[this.field2566];
                    this.field2566++;
                }
                if (var5 <= this.field2566) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field2543.field1140.length; var7++) {
                        var6 += this.field2543.field1143[var7];
                    }
                    var4 %= var6;
                }
            }
            label62: {
                do {
                    do {
                        if (this.field2543.field1143[this.field2566] >= var4) {
                            break label62;
                        }
                        class71.method481(arg1, true, this.field2543, arg0, this.field2566, false);
                        var4 -= this.field2543.field1143[this.field2566];
                        this.field2566++;
                    } while (this.field2566 < this.field2543.field1140.length);
                    this.field2566 -= this.field2543.field1149;
                } while (this.field2566 >= 0 && this.field2543.field1140.length > this.field2566);
                this.field2543 = null;
            }
            this.field2562 = class236.field4053 - var4;
        }
        field2554++;
        if (arg2 > -101) {
            this.method1069(15, false);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V")
    public static final void method1067(int arg0, int arg1) {
        field2567++;
        if (arg0 == 2010) {
            class241.field4183.method82((byte) -109, arg1);
            class77.field1315.method82((byte) -109, arg1);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static void method1068(int arg0) {
        field2552 = null;
        if (arg0 != -1) {
            field2552 = null;
        }
        field2555 = null;
        field2568 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZ)Lnb;")
    private final class108 method1069(int arg0, boolean arg1) {
        boolean var3 = class173.field3022 != class106.field1790;
        class196 var4 = class132.method995(this.field2557, 0);
        if (arg0 > -74) {
            return null;
        }
        field2549++;
        if (var4.field3408 != null) {
            var4 = var4.method1377((byte) 31);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field2545 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field3415;
            var7 = var4.field3388;
        } else {
            var6 = var4.field3388;
            var7 = var4.field3415;
        }
        int var8 = this.field2564 + (var7 >> 1);
        int var9 = (var7 + 1 >> 1) + this.field2564;
        int var10 = (var6 + 1 >> 1) + this.field2547;
        int var11 = (var6 >> 1) + this.field2547;
        this.method1066(var8 * 128, var11 * 128, (byte) -120);
        boolean var12 = !var3 && var4.field3380 && (this.field2553 != var4.field3367 || this.field2566 != this.field2551 && class148.field2620 >= 2);
        if (arg1 && !var12) {
            return null;
        }
        int[][] var13 = class173.field3022[this.field2563];
        int var14 = (this.field2564 << 7) + (var7 << 6);
        int var15 = var13[var8][var11] + var13[var9][var11] + var13[var9][var10] + var13[var8][var10] >> 2;
        int[][] var16 = null;
        int var17 = (this.field2547 << 7) + (var6 << 6);
        boolean var18 = this.field2558 == null;
        if (var3) {
            var16 = class106.field1790[0];
        } else if (this.field2563 < 3) {
            var16 = class173.field3022[this.field2563 + 1];
        }
        class78 var19;
        if (this.field2543 == null) {
            var19 = var4.method1361(var17, -15613, var12, var14, var15, var13, this.field2548, this.field2545, var16, false, var18 ? class105.field1756 : this.field2558);
        } else {
            var19 = var4.method1372(-50, var12, this.field2545, var16, var15, var18 ? class105.field1756 : this.field2558, var17, this.field2548, this.field2566, var13, var14, this.field2543);
        }
        return var19 == null ? null : var19.field1332;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2556++;
        class108 var11 = this.method1063(false);
        if (var11 != null) {
            var11.method52(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2550 = var11.method50();
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(IIIIIIIZLnb;)V")
    public class144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class108 arg8) {
        this.field2564 = arg4;
        this.field2545 = arg2;
        this.field2557 = arg0;
        this.field2547 = arg5;
        this.field2548 = arg1;
        this.field2563 = arg3;
        if (arg6 != -1) {
            this.field2543 = class189.method1332(arg6, 2);
            this.field2562 = class236.field4053 - 1;
            this.field2566 = 0;
            if (this.field2543.field1162 == 0 && arg8 != null && arg8 instanceof class144) {
                class144 var10 = (class144) arg8;
                if (this.field2543 == var10.field2543) {
                    this.field2566 = var10.field2566;
                    this.field2562 = var10.field2562;
                    return;
                }
            }
            if (arg7 && this.field2543.field1149 != -1) {
                this.field2566 = (int) (Math.random() * (double) this.field2543.field1140.length);
                this.field2562 -= (int) ((double) this.field2543.field1143[this.field2566] * Math.random());
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIZI)V")
    public final void method827(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            this.method1066(((arg0 - arg1 >> 1) + arg1) * 128 + 64, ((arg2 - arg4 >> 1) + arg4) * 128 + 64, (byte) -115);
            field2565++;
        }
    }
}
