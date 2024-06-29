import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class331 extends class19 {

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    private int field5075 = -32768;

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "Z")
    private boolean field5088 = true;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    private int field5095 = 0;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
    private int field5078 = 0;

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "I")
    private int field5099 = 0;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "Z")
    private boolean field5067 = false;

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "I")
    private int field5100 = -1;

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "Lmg;")
    private class113 field5102 = null;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
    private int field5096 = -1;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    private int field5076;

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "I")
    private int field5101;

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "I")
    private int field5103;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
    private int field5080;

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
    private int field5092;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    private int field5074;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "Ldn;")
    private class260 field5090;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    private int field5070;

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "I")
    private int field5084;

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "I")
    private int field5089;

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
    private int field5086;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field5068 = 3;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "[I")
    public static int[] field5081 = new int[1000];

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!pj", name = "V", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "Lnj;")
    public static class204 field5077;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "Lgl;")
    private class275 field5094;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "Lbm;")
    public static class307 field5069;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "Lbm;")
    public static class307 field5073;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "[I")
    public static int[] field5079;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)Lsc;", line = 4)
    public final class19 method2290(int arg0) {
        if (arg0 > -102) {
            return (class19) null;
        } else {
            field5098++;
            return this.method2291(false, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZB)Lsc;", line = 25)
    private final class19 method2291(boolean arg0, byte arg1) {
        boolean var3 = class46.field954 != class45.field923;
        field5085++;
        class31 var4 = class277.method1864(this.field5080, 0);
        int var5 = var4.field604;
        if (var4.field597 != null) {
            var4 = var4.method250((byte) -50);
        }
        if (var4 == null) {
            if (class249.field3893 && !var3) {
                this.method2294(-1650);
            }
            return null;
        }
        if (class324.field4954 != 0 && this.field5067 && (this.field5090 == null || this.field5090 != null && this.field5090.field4053 != var4.field604)) {
            int var6 = var4.field604;
            if (var4.field604 == -1) {
                var6 = var5;
            }
            if (var6 == -1) {
                this.field5090 = null;
            } else {
                this.field5090 = class279.method1882(25397, var6);
            }
            if (this.field5090 != null) {
                if (var4.field595 && this.field5090.field4039 != -1) {
                    this.field5070 = (int) ((double) this.field5090.field4044.length * Math.random());
                    this.field5089 -= (int) (Math.random() * (double) this.field5090.field4041[this.field5070]);
                } else {
                    this.field5089 = class25.field494 - 1;
                    this.field5070 = 0;
                }
            }
        }
        int var7 = this.field5101 & 0x3;
        int var8;
        int var9;
        if (var7 == 1 || var7 == 3) {
            var8 = var4.field616;
            var9 = var4.field589;
        } else {
            var8 = var4.field589;
            var9 = var4.field616;
        }
        int var10 = this.field5074 + (var8 >> 1);
        int var11 = this.field5074 + (var8 + 1 >> 1);
        int var12 = (var9 + 1 >> 1) + this.field5103;
        int var13 = (var9 >> 1) + this.field5103;
        this.method2293(var13 * 128, var10 * 128, -23645);
        boolean var14 = !var3 && var4.field615 && (this.field5100 != var4.field596 || (this.field5096 != this.field5070 || this.field5090 != null && (this.field5090.field4060 || class194.field3131) && this.field5084 != this.field5070) && class305.field4620 >= 2);
        if (arg1 < 111) {
            this.field5094 = (class275) null;
        }
        if (arg0 && !var14) {
            return null;
        }
        int[][] var15 = class45.field923[this.field5076];
        int var16 = (this.field5074 << 7) + (var8 << 6);
        int var17 = var15[var10][var13] + var15[var11][var12] + var15[var10][var12] + var15[var11][var13] >> 2;
        int[][] var18 = (int[][]) null;
        int var19 = (this.field5103 << 7) + (var9 << 6);
        if (var3) {
            var18 = class46.field954[0];
        } else if (this.field5076 < 3) {
            var18 = class45.field923[this.field5076 + 1];
        }
        if (class249.field3893 && var14) {
            class60.method469(this.field5102, this.field5095, this.field5099, this.field5078);
        }
        boolean var20 = this.field5102 == null;
        class15 var21;
        if (this.field5090 == null) {
            var21 = var4.method245(var16, var19, var14, this.field5101, this.field5092, 0, var18, var15, var17, var20 ? class119.field2078 : this.field5102, false);
        } else {
            var21 = var4.method247(var16, var15, var18, this.field5090, this.field5070, this.field5084, var17, this.field5086, var14, this.field5101, this.field5092, var20 ? class119.field2078 : this.field5102, var19, (byte) 83);
        }
        if (var21 == null) {
            return null;
        }
        if (class249.field3893 && var14) {
            int var22 = 0;
            if (var20) {
                class119.field2078 = var21.field282;
            }
            if (this.field5076 != 0) {
                int[][] var23 = class45.field923[0];
                var22 = var17 - (var23[var10][var12] + var23[var11][var12] + (var23[var10][var13] - -var23[var11][var13]) >> 2);
            }
            class113 var24 = var21.field282;
            if (this.field5088 && class60.method462(var24, var16, var22, var19)) {
                this.field5088 = false;
            }
            if (!this.field5088) {
                class60.method464(var24, var16, var22, var19);
                this.field5099 = var22;
                this.field5078 = var19;
                this.field5095 = var16;
                if (var20) {
                    class119.field2078 = null;
                }
                this.field5102 = var24;
            }
            this.field5096 = this.field5070;
            this.field5100 = var4.field596;
        }
        return var21.field283;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "()I", line = 188)
    public final int method39() {
        field5083++;
        return this.field5075;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V", line = 197)
    public static void method2292(byte arg0) {
        field5073 = null;
        if (arg0 != 126) {
            method2295(31);
        }
        field5077 = null;
        field5081 = null;
        field5069 = null;
        field5079 = null;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(III)V", line = 223)
    private final void method2293(int arg0, int arg1, int arg2) {
        field5097++;
        if (this.field5090 != null) {
            int var4 = class25.field494 - this.field5089;
            if (var4 > 100 && this.field5090.field4039 > 0) {
                int var5 = this.field5090.field4044.length - this.field5090.field4039;
                while (this.field5070 < var5 && var4 > this.field5090.field4041[this.field5070]) {
                    var4 -= this.field5090.field4041[this.field5070];
                    this.field5070++;
                }
                if (this.field5070 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field5090.field4044.length; var7++) {
                        var6 += this.field5090.field4041[var7];
                    }
                    var4 %= var6;
                }
                this.field5084 = this.field5070 + 1;
                if (this.field5090.field4044.length <= this.field5084) {
                    this.field5084 -= this.field5090.field4039;
                    if (this.field5084 < 0 || this.field5090.field4044.length <= this.field5084) {
                        this.field5084 = -1;
                    }
                }
            }
            while (var4 > this.field5090.field4041[this.field5070]) {
                class255.method1705(arg0, arg1, (byte) -44, this.field5090, this.field5070, false);
                var4 -= this.field5090.field4041[this.field5070];
                this.field5070++;
                if (this.field5090.field4044.length <= this.field5070) {
                    this.field5070 -= this.field5090.field4039;
                    if (this.field5070 < 0 || this.field5070 >= this.field5090.field4044.length) {
                        this.field5090 = null;
                        break;
                    }
                }
                this.field5084 = this.field5070 + 1;
                if (this.field5090.field4044.length <= this.field5084) {
                    this.field5084 -= this.field5090.field4039;
                    if (this.field5084 < 0 || this.field5084 >= this.field5090.field4044.length) {
                        this.field5084 = -1;
                    }
                }
            }
            this.field5089 = class25.field494 - var4;
            this.field5086 = var4;
        }
        if (arg2 != -23645) {
            field5068 = 73;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIII)V", line = 313)
    public final void method35(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class249.field3893) {
            this.method2291(true, (byte) 125);
        } else {
            this.method2293(arg4, arg3, -23645);
        }
        field5082++;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(IIIIIIIZLsc;)V", line = 432)
    public class331(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class19 arg8) {
        this.field5076 = arg3;
        this.field5101 = arg2;
        this.field5103 = arg5;
        this.field5080 = arg0;
        this.field5092 = arg1;
        this.field5074 = arg4;
        if (class249.field3893 && arg8 != null) {
            if ((arg8 instanceof class331)) {
                ((class331) arg8).method2294(-1650);
            } else {
                class31 var10 = class277.method1864(this.field5080, 0);
                if (var10.field597 != null) {
                    var10 = var10.method250((byte) -119);
                }
                if (var10 != null) {
                    class122.method795(this.field5101, this.field5074, this.field5103, var10, 0, 0, (byte) -123, this.field5092, this.field5076);
                }
            }
        }
        if (arg6 != -1) {
            this.field5090 = class279.method1882(25397, arg6);
            this.field5070 = 0;
            if (this.field5090.field4044.length <= 1) {
                this.field5084 = 0;
            } else {
                this.field5084 = 1;
            }
            this.field5089 = class25.field494 - 1;
            this.field5086 = 1;
            if (this.field5090.field4038 == 0 && arg8 != null && arg8 instanceof class331) {
                class331 var11 = (class331) arg8;
                if (this.field5090 == var11.field5090) {
                    this.field5089 = var11.field5089;
                    this.field5084 = var11.field5084;
                    this.field5086 = var11.field5086;
                    this.field5070 = var11.field5070;
                    return;
                }
            }
            if (arg7 && this.field5090.field4039 != -1) {
                this.field5070 = (int) (Math.random() * (double) this.field5090.field4044.length);
                this.field5084 = this.field5070 + 1;
                if (this.field5084 >= this.field5090.field4044.length) {
                    this.field5084 -= this.field5090.field4039;
                    if (this.field5084 < 0 || this.field5084 >= this.field5090.field4044.length) {
                        this.field5084 = -1;
                    }
                }
                this.field5086 = (int) ((double) this.field5090.field4041[this.field5070] * Math.random()) + 1;
                this.field5089 = class25.field494 - this.field5086;
            }
        }
        if (class249.field3893 && arg8 != null) {
            this.method2291(true, (byte) 117);
        }
        if (arg8 == null) {
            class31 var12 = class277.method1864(this.field5080, 0);
            if (var12.field597 != null) {
                this.field5067 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIIIJILgl;)V", line = 344)
    public final void method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class275 arg10) {
        field5091++;
        class19 var13 = this.method2290(-110);
        if (var13 != null) {
            var13.method26(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field5094);
        }
    }

    @OriginalMember(owner = "client!pj", name = "finalize", descriptor = "()V", line = 370)
    protected final void finalize() {
        field5071++;
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V", line = 403)
    public final void method2294(int arg0) {
        if (this.field5102 != null) {
            class60.method469(this.field5102, this.field5095, this.field5099, this.field5078);
        }
        if (arg0 == -1650) {
            this.field5100 = -1;
            this.field5102 = null;
            field5072++;
            this.field5096 = -1;
        }
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V", line = 528)
    public static final void method2295(int arg0) {
        class234.field3677.method302((byte) 126);
        field5104++;
        if (arg0 != -1) {
            field5093 = -94;
        }
        class37.field714.method575((byte) 124);
        class260.field4052.method575((byte) -43);
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(II)I", line = 542)
    public static int method2296(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
