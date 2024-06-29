import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class288 extends class64 {

    @OriginalMember(owner = "client!se", name = "t", descriptor = "Lkk;")
    private class77 field4461 = null;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    private int field4463 = -1;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    private int field4470 = 0;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "I")
    private int field4468 = -32768;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "I")
    private int field4481 = 0;

    @OriginalMember(owner = "client!se", name = "P", descriptor = "I")
    private int field4483 = -1;

    @OriginalMember(owner = "client!se", name = "U", descriptor = "Z")
    private boolean field4488 = false;

    @OriginalMember(owner = "client!se", name = "X", descriptor = "Z")
    private boolean field4491 = false;

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "I")
    private int field4492 = 0;

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "Z")
    private boolean field4494 = true;

    @OriginalMember(owner = "client!se", name = "O", descriptor = "I")
    private int field4482;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    private int field4462;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    private int field4486;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "I")
    private int field4476;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "I")
    private int field4477;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    private int field4464;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "Lbg;")
    private class93 field4479;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "I")
    private int field4475;

    @OriginalMember(owner = "client!se", name = "V", descriptor = "I")
    private int field4489;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    private int field4474;

    @OriginalMember(owner = "client!se", name = "T", descriptor = "I")
    private int field4487;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field4469 = 0;

    @OriginalMember(owner = "client!se", name = "bb", descriptor = "I")
    public static int field4495 = 0;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!se", name = "W", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "Lem;")
    private class273 field4460;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BZ)Lqf;", line = 5)
    private final class64 method2079(byte arg0, boolean arg1) {
        field4484++;
        boolean var3 = class277.field4290 != class121.field1924;
        class212 var4 = class43.method437(29, this.field4462);
        if (var4.field3289 != null) {
            var4 = var4.method1568((byte) 56);
        }
        if (var4 == null) {
            if (class240.field3737 && !var3) {
                this.method2085(true);
            }
            this.field4483 = this.field4487;
            this.field4463 = -1;
            return null;
        }
        if (!this.field4488 && this.field4463 != var4.field3334) {
            this.method2081(-1, -31);
        }
        int var5 = this.field4477 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field3306;
            var7 = var4.field3250;
        } else {
            var6 = var4.field3250;
            var7 = var4.field3306;
        }
        int var8 = (var7 + 1 >> 1) + this.field4464;
        int var9 = (var6 >> 1) + this.field4476;
        int var10 = (var7 >> 1) + this.field4464;
        int var11 = (var6 + 1 >> 1) + this.field4476;
        this.method2083(var9 * 128, var10 * 128, 20513);
        boolean var12 = !var3 && var4.field3258 && (this.field4463 != var4.field3334 || (this.field4487 != this.field4483 || this.field4479 != null && (this.field4479.field1417 || class170.field2683) && this.field4487 != this.field4474) && class19.field311 >= 2);
        if (arg1 && !var12) {
            this.field4463 = var4.field3334;
            this.field4483 = this.field4487;
            return null;
        }
        int[][] var13 = class277.field4290[this.field4482];
        int var14 = var13[var8][var9] + var13[var10][var9] + var13[var10][var11] + var13[var8][var11] >> 2;
        int var15 = (this.field4464 << 7) + (var7 << 6);
        int var16 = (this.field4476 << 7) + (var6 << 6);
        int[][] var17 = (int[][]) null;
        int var18 = -65 % ((arg0 - 67) / 54);
        if (var3) {
            var17 = class121.field1924[0];
        } else if (this.field4482 < 3) {
            var17 = class277.field4290[this.field4482 + 1];
        }
        if (class240.field3737 && var12) {
            class127.method1101(this.field4461, this.field4481, this.field4470, this.field4492);
        }
        boolean var19 = this.field4461 == null;
        class118 var20;
        if (this.field4479 == null) {
            var20 = var4.method1571(false, var16, var13, this.field4486, var19 ? class259.field3968 : this.field4461, -85, var15, var14, var12, this.field4477, var17);
        } else {
            var20 = var4.method1576(this.field4475, var17, this.field4487, this.field4486, this.field4477, var13, var14, var16, var12, var19 ? class259.field3968 : this.field4461, this.field4474, true, this.field4479, var15);
        }
        if (var20 == null) {
            this.field4463 = var4.field3334;
            this.field4483 = this.field4487;
            return null;
        }
        if (class240.field3737 && var12) {
            if (var19) {
                class259.field3968 = var20.field1809;
            }
            int var21 = 0;
            if (this.field4482 != 0) {
                int[][] var22 = class277.field4290[0];
                var21 = var14 - (var22[var8][var9] + var22[var10][var9] + var22[var8][var11] + var22[var10][var11] >> 2);
            }
            class77 var23 = var20.field1809;
            if (this.field4494 && class127.method1107(var23, var15, var21, var16)) {
                this.field4494 = false;
            }
            if (!this.field4494) {
                class127.method1102(var23, var15, var21, var16);
                this.field4461 = var23;
                this.field4492 = var16;
                this.field4481 = var15;
                if (var19) {
                    class259.field3968 = null;
                }
                this.field4470 = var21;
            }
        }
        this.field4483 = this.field4487;
        this.field4463 = var4.field3334;
        return var20.field1810;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "()I", line = 156)
    public final int method21() {
        field4493++;
        return this.field4468;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(IIIIIIIZLqf;)V", line = 671)
    public class288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class64 arg8) {
        this.field4482 = arg3;
        this.field4462 = arg0;
        this.field4486 = arg1;
        this.field4476 = arg5;
        this.field4477 = arg2;
        this.field4464 = arg4;
        if (arg8 != null) {
            this.field4488 = true;
            if (arg8 instanceof class288) {
                class288 var10 = (class288) arg8;
                if (class240.field3737) {
                    var10.method2085(true);
                }
                this.field4479 = var10.field4479;
                this.field4475 = var10.field4475;
                this.field4489 = var10.field4489;
                this.field4474 = var10.field4474;
                this.field4487 = var10.field4487;
            } else if (class240.field3737) {
                class212 var11 = class43.method437(86, this.field4462);
                if (var11.field3289 != null) {
                    var11 = var11.method1568((byte) 79);
                }
                if (var11 != null) {
                    class126.method1093(this.field4482, this.field4477, this.field4486, 1, this.field4464, 0, var11, 0, this.field4476);
                }
            }
        }
        if (this.field4488) {
            this.method2081(arg6, -37);
        }
        if (class240.field3737 && arg8 != null) {
            this.method2079((byte) -75, true);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(III)V", line = 184)
    public static final void method2080(int arg0, int arg1, int arg2) {
        field4485++;
        if (class57.field890 > 0) {
            class326.method2307(0, class57.field890);
            class57.field890 = 0;
        }
        short var3 = 256;
        int var4 = class60.field933 * arg2;
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class210.field3240[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var5 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class123.field1975[var5++];
                int var11 = class60.field928[arg0 + (var4++)];
                if (var10 == 0) {
                    class309.field4771.field5720[var6++] = var11;
                } else {
                    int var12 = var10 + 18;
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = 238 - var10;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = class66.field996[var10];
                    class309.field4771.field5720[var6++] = class301.method2169(class301.method2169(var11, 16711935) * var13 + class301.method2169(16711935, var14) * var12, -16711936) + class301.method2169(var12 * class301.method2169(65280, var14) + (var13 * class301.method2169(65280, var11)), 16711680) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class309.field4771.field5720[var6++] = class60.field928[arg0 + (var4++)];
            }
            var4 += class60.field933 - 128;
        }
        if (arg1 <= 81) {
            return;
        }
        if (class240.field3737) {
            class213.method1589(class309.field4771.field5720, arg0, arg2, class309.field4771.field3366, class309.field4771.field3367);
        } else {
            class309.field4771.method9(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V", line = 274)
    private final void method2081(int arg0, int arg1) {
        field4478++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class212 var5 = class43.method437(46, this.field4462);
            class212 var6 = var5;
            if (var5.field3289 != null) {
                var5 = var5.method1568((byte) 123);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field3271 != null) {
                if (this.field4479 != null && var5.method1581(this.field4479.field1415, 25629)) {
                    return;
                }
                var3 = var5.method1563(256);
                if (this.field4463 != var5.field3334) {
                    var4 = var5.field3253;
                }
            } else if (var5.field3300 == -1) {
                if (var6 != null && var6.field3271 != null) {
                    if (this.field4479 != null && var6.method1581(this.field4479.field1415, 25629)) {
                        return;
                    }
                    var3 = var6.method1563(256);
                    if (this.field4463 != var6.field3334) {
                        var4 = var6.field3253;
                    }
                } else if (var6 != null && var6.field3300 != -1 && this.field4463 != var6.field3334) {
                    var3 = var6.field3300;
                    var4 = var6.field3253;
                }
            } else if (this.field4463 != var5.field3334) {
                var4 = var5.field3253;
                var3 = var5.field3300;
            }
        }
        if (var3 == -1) {
            this.field4479 = null;
            return;
        }
        if (this.field4479 == null || this.field4479.field1415 != var3) {
            this.field4479 = class126.method1091((byte) 89, var3);
        } else if (this.field4479.field1405 == 0) {
            return;
        }
        if (var4) {
            this.field4487 = (int) (Math.random() * (double) this.field4479.field1428.length);
            this.field4475 = (int) ((double) this.field4479.field1429[this.field4487] * Math.random()) + 1;
        } else {
            this.field4475 = 1;
            this.field4487 = 0;
        }
        this.field4474 = this.field4487 + 1;
        if (this.field4474 < 0 || this.field4474 >= this.field4479.field1428.length) {
            this.field4474 = -1;
        }
        this.field4489 = class360.field5718 - this.field4475;
        if (arg1 >= -23) {
            this.method2082((class64) null, -25);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lqf;I)V", line = 387)
    private final void method2082(class64 arg0, int arg1) {
        if (arg1 >= -39) {
            this.method2082((class64) null, -126);
        }
        if (class240.field3737) {
            class56 var3 = (class56) arg0;
            if ((this.field4460 == null || this.field4460.field4205) && (var3.field851 != null || var3.field826 != null)) {
                class212 var4 = class43.method437(111, this.field4462);
                if (var4.field3289 != null) {
                    var4 = var4.method1568((byte) 102);
                }
                if (var4 != null) {
                    this.field4460 = new class273(class360.field5718, var4.field3306, var4.field3250);
                }
            }
            if (this.field4460 != null) {
                this.field4460.method2010(var3.field851, var3.field826, false, var3.field844, var3.field857, var3.field842);
            }
        } else {
            class124 var5 = (class124) arg0;
            if ((this.field4460 == null || this.field4460.field4205) && (var5.field2012 != null || var5.field1999 != null)) {
                class212 var6 = class43.method437(123, this.field4462);
                if (var6.field3289 != null) {
                    var6 = var6.method1568((byte) 55);
                }
                if (var6 != null) {
                    this.field4460 = new class273(class360.field5718, var6.field3306, var6.field3250);
                }
            }
            if (this.field4460 != null) {
                this.field4460.method2010(var5.field2012, var5.field1999, false, var5.field2003, var5.field1984, var5.field2023);
            }
        }
        this.field4491 = true;
        field4465++;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(III)V", line = 446)
    private final void method2083(int arg0, int arg1, int arg2) {
        if (arg2 != 20513) {
            this.field4481 = 35;
        }
        field4466++;
        label97: while (true) {
            if (this.field4479 == null) {
                if (this.field4488) {
                    return;
                }
                this.method2081(-1, -68);
                if (this.field4479 == null) {
                    return;
                }
            }
            int var4 = class360.field5718 - this.field4489;
            if (var4 > 100 && this.field4479.field1430 > 0) {
                int var5 = this.field4479.field1428.length - this.field4479.field1430;
                while (this.field4487 < var5 && this.field4479.field1429[this.field4487] < var4) {
                    var4 -= this.field4479.field1429[this.field4487];
                    this.field4487++;
                }
                if (var5 <= this.field4487) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field4479.field1428.length; var7++) {
                        var6 += this.field4479.field1429[var7];
                    }
                    var4 %= var6;
                }
                this.field4474 = this.field4487 + 1;
                if (this.field4474 >= this.field4479.field1428.length) {
                    this.field4474 -= this.field4479.field1430;
                    if (this.field4474 < 0 || this.field4479.field1428.length <= this.field4474) {
                        this.field4474 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field4479.field1429[this.field4487] >= var4) {
                            this.field4475 = var4;
                            this.field4489 = class360.field5718 - var4;
                            return;
                        }
                        class335.method2358(arg1, this.field4487, this.field4479, false, arg0, true);
                        var4 -= this.field4479.field1429[this.field4487];
                        this.field4487++;
                        if (this.field4479.field1428.length <= this.field4487) {
                            this.field4487 -= this.field4479.field1430;
                            if (this.field4487 < 0 || this.field4479.field1428.length <= this.field4487) {
                                this.field4479 = null;
                                continue label97;
                            }
                        }
                        this.field4474 = this.field4487 + 1;
                    } while (this.field4474 < this.field4479.field1428.length);
                    this.field4474 -= this.field4479.field1430;
                } while (this.field4474 >= 0 && this.field4479.field1428.length > this.field4474);
                this.field4474 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIII)V", line = 546)
    public final void method32(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4480++;
        class64 var6 = null;
        if (class240.field3737) {
            var6 = this.method2079((byte) -59, true);
        } else {
            this.method2083(arg4, arg3, 20513);
        }
        if (!this.field4491) {
            if (var6 == null) {
                var6 = this.method2084(0);
            }
            if (var6 == null) {
                return;
            }
            this.method2082(var6, -55);
        }
        if (this.field4460 != null) {
            this.field4460.method2014(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!se", name = "finalize", descriptor = "()V", line = 601)
    protected final void finalize() {
        field4471++;
        if (this.field4460 != null) {
            this.field4460.method2013();
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIIIJILem;)V", line = 611)
    public final void method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class273 arg10) {
        field4467++;
        class64 var13 = this.method2084(0);
        if (var13 != null) {
            this.method2082(var13, -44);
            var13.method27(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4460);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)Lqf;", line = 636)
    public final class64 method2084(int arg0) {
        if (arg0 == 0) {
            field4459++;
            return this.method2079((byte) 125, false);
        } else {
            return (class64) null;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V", line = 650)
    public final void method2085(boolean arg0) {
        if (this.field4461 != null) {
            class127.method1101(this.field4461, this.field4481, this.field4470, this.field4492);
            this.field4461 = null;
        }
        if (!arg0) {
            this.method2082((class64) null, 40);
        }
        field4472++;
    }
}
