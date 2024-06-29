import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class287 extends class199 {

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "I")
    private int field5103 = -32768;

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "I")
    private int field5114 = -1;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "Z")
    private boolean field5115 = false;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
    private int field5090 = -1;

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "Lch;")
    private class282 field5112 = null;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
    private int field5092;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    private int field5083;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
    private int field5100;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "I")
    private int field5098;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    private int field5088;

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "I")
    private int field5111;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "Lek;")
    private class164 field5105;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
    private int field5108;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
    private int field5101;

    @OriginalMember(owner = "client!ml", name = "R", descriptor = "I")
    private int field5117;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
    private int field5106;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "Lid;")
    private static class149 field5102 = class60.method382("Starting 3d Library", (byte) 93);

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "Lid;")
    public static class149 field5087 = field5102;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "Lid;")
    private static class149 field5095 = class60.method382("Loading interfaces )2 ", (byte) 52);

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "[I")
    public static int[] field5097 = new int[500];

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "I")
    public static int field5119 = 0;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "Lid;")
    public static class149 field5084 = field5095;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "Lve;")
    public static class189 field5096 = new class189(32);

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!ml", name = "S", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "Leg;")
    public static class225 field5116;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "Lal;")
    public static class230 field5093;

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "Lue;")
    private class88 field5110;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BII)V")
    private final void method1964(byte arg0, int arg1, int arg2) {
        if (this.field5105 != null) {
            int var4 = class118.field2022 - this.field5106;
            if (var4 > 100 && this.field5105.field3061 > 0) {
                int var5 = this.field5105.field3035.length - this.field5105.field3061;
                while (this.field5108 < var5 && var4 > this.field5105.field3060[this.field5108]) {
                    var4 -= this.field5105.field3060[this.field5108];
                    this.field5108++;
                }
                if (this.field5108 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field5105.field3035.length; var7++) {
                        var6 += this.field5105.field3060[var7];
                    }
                    var4 %= var6;
                }
                this.field5101 = this.field5108 + 1;
                if (this.field5101 >= this.field5105.field3035.length) {
                    this.field5101 -= this.field5105.field3061;
                    if (this.field5101 < 0 || this.field5101 >= this.field5105.field3035.length) {
                        this.field5101 = -1;
                    }
                }
            }
            while (var4 > this.field5105.field3060[this.field5108]) {
                class94.method686(this.field5105, arg2, -107, arg1, false, this.field5108);
                var4 -= this.field5105.field3060[this.field5108];
                this.field5108++;
                if (this.field5105.field3035.length <= this.field5108) {
                    this.field5108 -= this.field5105.field3061;
                    if (this.field5108 < 0 || this.field5105.field3035.length <= this.field5108) {
                        this.field5105 = null;
                        break;
                    }
                }
                this.field5101 = this.field5108 + 1;
                if (this.field5105.field3035.length <= this.field5101) {
                    this.field5101 -= this.field5105.field3061;
                    if (this.field5101 < 0 || this.field5105.field3035.length <= this.field5101) {
                        this.field5101 = -1;
                    }
                }
            }
            this.field5117 = var4;
            this.field5106 = class118.field2022 - var4;
        }
        if (arg0 < 124) {
            field5097 = null;
        }
        field5104++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lal;III)Lvc;")
    public static final class190 method1965(class230 arg0, int arg1, int arg2, int arg3) {
        field5099++;
        if (class59.method371((byte) -86, arg3, arg2, arg0)) {
            if (arg1 != -13886) {
                field5102 = null;
            }
            return class2.method12((byte) 57);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)Lug;")
    public final class199 method1966(byte arg0) {
        if (arg0 != 35) {
            this.method1964((byte) 9, -40, -1);
        }
        field5085++;
        return this.method1969(false, 0);
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "()I")
    public final int method53() {
        field5089++;
        return this.field5103;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public static void method1967(int arg0) {
        field5102 = null;
        field5087 = null;
        field5097 = null;
        field5095 = null;
        field5093 = null;
        field5096 = null;
        if (arg0 <= 48) {
            method1968(-38, 126, 105, (byte) 89);
        }
        field5084 = null;
        field5116 = null;
    }

    @OriginalMember(owner = "client!ml", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field5107++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIB)I")
    public static final int method1968(int arg0, int arg1, int arg2, byte arg3) {
        field5091++;
        if (class189.field3393 == null) {
            return 0;
        }
        int var4 = arg1 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg0;
        if (arg0 < 3 && (class69.field1215[1][var4][var5] & 0x2) == 2) {
            var6 = arg0 + 1;
        }
        int var7 = -3 / ((49 - arg3) / 38);
        int var8 = arg1 & 0x7F;
        int var9 = arg2 & 0x7F;
        int var10 = (128 - var8) * class189.field3393[var6][var4][var5] + class189.field3393[var6][var4 + 1][var5] * var8 >> 7;
        int var11 = (128 - var8) * class189.field3393[var6][var4][var5 + 1] + class189.field3393[var6][var4 + 1][var5 + 1] * var8 >> 7;
        return (128 - var9) * var10 + (var9 * var11) >> 7;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIIIIJILue;)V")
    public final void method54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class88 arg10) {
        field5109++;
        class199 var13 = this.method1966((byte) 35);
        if (var13 != null) {
            var13.method54(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field5110);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZI)Lug;")
    private final class199 method1969(boolean arg0, int arg1) {
        field5113++;
        boolean var3 = class211.field3759 != class189.field3393;
        class268 var4 = class108.method755(11525, this.field5111);
        int var5 = var4.field4796;
        if (var4.field4767 != null) {
            var4 = var4.method1863((byte) -84);
        }
        if (var4 == null) {
            return null;
        }
        if (class245.field4306 != 0 && this.field5115 && (this.field5105 == null || this.field5105 != null && this.field5105.field3034 != var4.field4796)) {
            int var6 = var4.field4796;
            if (var4.field4796 == -1) {
                var6 = var5;
            }
            if (var6 == -1) {
                this.field5105 = null;
            } else {
                this.field5105 = class69.method436(var6, -32);
            }
            if (this.field5105 != null) {
                if (var4.field4799 && this.field5105.field3061 != -1) {
                    this.field5108 = (int) (Math.random() * (double) this.field5105.field3035.length);
                    this.field5106 -= (int) (Math.random() * (double) this.field5105.field3060[this.field5108]);
                } else {
                    this.field5108 = 0;
                    this.field5106 = class118.field2022 - 1;
                }
            }
        }
        int var7 = this.field5092 & 0x3;
        int var8;
        int var9;
        if (var7 == 1 || var7 == 3) {
            var8 = var4.field4820;
            var9 = var4.field4787;
        } else {
            var8 = var4.field4787;
            var9 = var4.field4820;
        }
        int var10 = this.field5100 + (var9 >> 1);
        int var11 = (var9 + 1 >> 1) + this.field5100;
        int var12 = this.field5098 + (var8 >> 1);
        if (arg1 != 0) {
            this.field5114 = 120;
        }
        int var13 = this.field5098 + (var8 + 1 >> 1);
        this.method1964((byte) 125, var10 * 128, var12 * 128);
        boolean var14 = !var3 && var4.field4822 && (this.field5090 != var4.field4773 || (this.field5114 != this.field5108 || this.field5105 != null && (this.field5105.field3038 || class243.field4265) && this.field5108 != this.field5101) && class281.field4997 >= 2);
        if (arg0 && !var14) {
            return null;
        }
        int[][] var15 = class189.field3393[this.field5083];
        int var16 = var15[var10][var12] + var15[var11][var12] + var15[var10][var13] + var15[var11][var13] >> 2;
        int var17 = (this.field5100 << 7) + (var9 << 6);
        int var18 = (this.field5098 << 7) + (var8 << 6);
        int[][] var19 = null;
        boolean var20 = this.field5112 == null;
        if (var3) {
            var19 = class211.field3759[0];
        } else if (this.field5083 < 3) {
            var19 = class189.field3393[this.field5083 + 1];
        }
        class6 var21;
        if (this.field5105 == null) {
            var21 = var4.method1857(var19, this.field5088, this.field5092, var16, false, (byte) -73, var15, var20 ? class230.field4041 : this.field5112, var18, var17, var14);
        } else {
            var21 = var4.method1864(var16, this.field5088, this.field5101, this.field5117, var18, var17, var15, this.field5092, var14, this.field5108, (byte) 9, var20 ? class230.field4041 : this.field5112, var19, this.field5105);
        }
        return var21 == null ? null : var21.field71;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIII)V")
    public final void method49(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5118++;
        this.method1964((byte) 127, arg3, arg4);
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(IIIIIIIZLug;)V")
    public class287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class199 arg8) {
        this.field5092 = arg2;
        this.field5083 = arg3;
        this.field5100 = arg4;
        this.field5098 = arg5;
        this.field5088 = arg1;
        this.field5111 = arg0;
        if (arg6 != -1) {
            this.field5105 = class69.method436(arg6, -32);
            this.field5108 = 0;
            if (this.field5105.field3035.length <= 1) {
                this.field5101 = 0;
            } else {
                this.field5101 = 1;
            }
            this.field5117 = 1;
            this.field5106 = class118.field2022 - 1;
            if (this.field5105.field3030 == 0 && arg8 != null && arg8 instanceof class287) {
                class287 var10 = (class287) arg8;
                if (this.field5105 == var10.field5105) {
                    this.field5101 = var10.field5101;
                    this.field5106 = var10.field5106;
                    this.field5108 = var10.field5108;
                    this.field5117 = var10.field5117;
                    return;
                }
            }
            if (arg7 && this.field5105.field3061 != -1) {
                this.field5108 = (int) (Math.random() * (double) this.field5105.field3035.length);
                this.field5101 = this.field5108 + 1;
                if (this.field5101 >= this.field5105.field3035.length) {
                    this.field5101 -= this.field5105.field3061;
                    if (this.field5101 < 0 || this.field5101 >= this.field5105.field3035.length) {
                        this.field5101 = -1;
                    }
                }
                this.field5117 = (int) (Math.random() * (double) this.field5105.field3060[this.field5108]) + 1;
                this.field5106 = class118.field2022 - this.field5117;
            }
        }
        if (arg8 == null) {
            class268 var11 = class108.method755(11525, this.field5111);
            if (var11.field4767 != null) {
                this.field5115 = true;
                return;
            }
        }
    }
}
