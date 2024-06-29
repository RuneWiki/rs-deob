import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class17 extends class233 {

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    private int field197 = 0;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    private int field200 = 0;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    private int field191 = 0;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "Z")
    private boolean field217 = true;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
    private int field212 = -32768;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
    private int field218 = -1;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    private int field201 = -1;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "Z")
    private boolean field216 = false;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "Lpj;")
    private class59 field202 = null;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    private int field204;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    private int field208;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    private int field192;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "Lof;")
    private class272 field210;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
    private int field214;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
    private int field219;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    private int field198;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field196 = new String[200];

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "Lad;")
    public static class179 field211;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "Lbh;")
    private class18 field193;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "Z")
    public static boolean field209;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V", line = 4)
    public static void method107(boolean arg0) {
        field211 = null;
        if (arg0) {
            field211 = (class179) null;
        }
        field196 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIII)V", line = 18)
    public final void method108(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class117.field1817) {
            this.method109(true, 533503942);
        } else {
            this.method110(-128, arg3, arg4);
        }
        field203++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)Lmd;", line = 41)
    private final class233 method109(boolean arg0, int arg1) {
        boolean var3 = class55.field690 != class294.field4502;
        class22 var4 = class284.method1980(this.field199, (byte) 125);
        int var5 = var4.field328;
        field225++;
        if (var4.field336 != null) {
            var4 = var4.method142(0);
        }
        if (var4 == null) {
            if (class117.field1817 && !var3) {
                this.method113(482);
            }
            return null;
        }
        if (class237.field3555 != 0 && this.field216 && (this.field210 == null || this.field210 != null && this.field210.field4172 != var4.field328)) {
            int var6 = var4.field328;
            if (var4.field328 == -1) {
                var6 = var5;
            }
            if (var6 == -1) {
                this.field210 = null;
            } else {
                this.field210 = class72.method468(var6, arg1 ^ 0x1FCC9FE0);
            }
            if (this.field210 != null) {
                if (var4.field344 && this.field210.field4166 != -1) {
                    this.field214 = (int) ((double) this.field210.field4160.length * Math.random());
                    this.field219 -= (int) ((double) this.field210.field4184[this.field214] * Math.random());
                } else {
                    this.field214 = 0;
                    this.field219 = class304.field4641 - 1;
                }
            }
        }
        int var7 = this.field220 & 0x3;
        int var8;
        int var9;
        if (var7 == 1 || var7 == 3) {
            var8 = var4.field330;
            var9 = var4.field293;
        } else {
            var8 = var4.field293;
            var9 = var4.field330;
        }
        int var10 = (var9 >> 1) + this.field204;
        int var11 = (var8 >> 1) + this.field221;
        int var12 = (var9 + 1 >> 1) + this.field204;
        int var13 = this.field221 + (var8 + 1 >> 1);
        this.method110(-127, var10 * 128, var11 * 128);
        boolean var14 = !var3 && var4.field345 && (this.field201 != var4.field331 || (this.field218 != this.field214 || this.field210 != null && (this.field210.field4176 || class145.field2191) && this.field214 != this.field205) && class284.field4298 >= 2);
        if (arg0 && !var14) {
            return null;
        }
        int[][] var15 = class294.field4502[this.field208];
        int var16 = var15[var10][var11] + var15[var10][var13] - (-var15[var12][var11] - var15[var12][var13]) >> 2;
        int var17 = (this.field204 << 7) + (var9 << 6);
        int var18 = (this.field221 << 7) + (var8 << 6);
        if (arg1 != 533503942) {
            return (class233) null;
        }
        int[][] var19 = (int[][]) null;
        if (var3) {
            var19 = class55.field690[0];
        } else if (this.field208 < 3) {
            var19 = class294.field4502[this.field208 + 1];
        }
        if (class117.field1817 && var14) {
            class32.method234(this.field202, this.field191, this.field197, this.field200);
        }
        boolean var20 = this.field202 == null;
        class245 var21;
        if (this.field210 == null) {
            var21 = var4.method145(this.field192, false, var17, -9367, var19, var20 ? class171.field2568 : this.field202, var16, var15, this.field220, var14, var18);
        } else {
            var21 = var4.method155(this.field214, this.field210, var20 ? class171.field2568 : this.field202, var18, var16, var19, this.field192, this.field220, var14, var17, this.field205, this.field198, arg1 - 533503992, var15);
        }
        if (var21 == null) {
            return null;
        }
        if (class117.field1817 && var14) {
            if (var20) {
                class171.field2568 = var21.field3655;
            }
            int var22 = 0;
            if (this.field208 != 0) {
                int[][] var23 = class294.field4502[0];
                var22 = var16 - (var23[var10][var11] + var23[var12][var11] + var23[var10][var13] + var23[var12][var13] >> 2);
            }
            class59 var24 = var21.field3655;
            if (this.field217 && class32.method219(var24, var17, var22, var18)) {
                this.field217 = false;
            }
            if (!this.field217) {
                class32.method224(var24, var17, var22, var18);
                if (var20) {
                    class171.field2568 = null;
                }
                this.field202 = var24;
                this.field191 = var17;
                this.field197 = var22;
                this.field200 = var18;
            }
            this.field201 = var4.field331;
            this.field218 = this.field214;
        }
        return var21.field3649;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(III)V", line = 206)
    private final void method110(int arg0, int arg1, int arg2) {
        if (arg0 > -125) {
            return;
        }
        if (this.field210 != null) {
            int var4 = class304.field4641 - this.field219;
            if (var4 > 100 && this.field210.field4166 > 0) {
                int var5 = this.field210.field4160.length - this.field210.field4166;
                while (this.field214 < var5 && var4 > this.field210.field4184[this.field214]) {
                    var4 -= this.field210.field4184[this.field214];
                    this.field214++;
                }
                if (this.field214 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field210.field4160.length; var7++) {
                        var6 += this.field210.field4184[var7];
                    }
                    var4 %= var6;
                }
                this.field205 = this.field214 + 1;
                if (this.field205 >= this.field210.field4160.length) {
                    this.field205 -= this.field210.field4166;
                    if (this.field205 < 0 || this.field205 >= this.field210.field4160.length) {
                        this.field205 = -1;
                    }
                }
            }
            while (this.field210.field4184[this.field214] < var4) {
                class167.method1170(arg2, this.field210, this.field214, -64, arg1, false);
                var4 -= this.field210.field4184[this.field214];
                this.field214++;
                if (this.field210.field4160.length <= this.field214) {
                    this.field214 -= this.field210.field4166;
                    if (this.field214 < 0 || this.field214 >= this.field210.field4160.length) {
                        this.field210 = null;
                        break;
                    }
                }
                this.field205 = this.field214 + 1;
                if (this.field210.field4160.length <= this.field205) {
                    this.field205 -= this.field210.field4166;
                    if (this.field205 < 0 || this.field205 >= this.field210.field4160.length) {
                        this.field205 = -1;
                    }
                }
            }
            this.field219 = class304.field4641 - var4;
            this.field198 = var4;
        }
        field213++;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(IIIIIIIZLmd;)V", line = 408)
    public class17(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class233 arg8) {
        this.field204 = arg4;
        this.field220 = arg2;
        this.field199 = arg0;
        this.field221 = arg5;
        this.field208 = arg3;
        this.field192 = arg1;
        if (class117.field1817 && arg8 != null) {
            if ((arg8 instanceof class17)) {
                ((class17) arg8).method113(482);
            } else {
                class22 var10 = class284.method1980(this.field199, (byte) 112);
                if (var10.field336 != null) {
                    var10 = var10.method142(0);
                }
                if (var10 != null) {
                    class40.method269(this.field220, this.field192, 0, 0, var10, this.field208, this.field221, this.field204, 35);
                }
            }
        }
        if (arg6 != -1) {
            this.field210 = class72.method468(arg6, -117);
            this.field214 = 0;
            if (this.field210.field4160.length <= 1) {
                this.field205 = 0;
            } else {
                this.field205 = 1;
            }
            this.field219 = class304.field4641 - 1;
            this.field198 = 1;
            if (this.field210.field4177 == 0 && arg8 != null && arg8 instanceof class17) {
                class17 var11 = (class17) arg8;
                if (this.field210 == var11.field210) {
                    this.field198 = var11.field198;
                    this.field214 = var11.field214;
                    this.field205 = var11.field205;
                    this.field219 = var11.field219;
                    return;
                }
            }
            if (arg7 && this.field210.field4166 != -1) {
                this.field214 = (int) (Math.random() * (double) this.field210.field4160.length);
                this.field205 = this.field214 + 1;
                if (this.field205 >= this.field210.field4160.length) {
                    this.field205 -= this.field210.field4166;
                    if (this.field205 < 0 || this.field210.field4160.length <= this.field205) {
                        this.field205 = -1;
                    }
                }
                this.field198 = (int) ((double) this.field210.field4184[this.field214] * Math.random()) + 1;
                this.field219 = class304.field4641 - this.field198;
            }
        }
        if (class117.field1817 && arg8 != null) {
            this.method109(true, 533503942);
        }
        if (arg8 == null) {
            class22 var12 = class284.method1980(this.field199, (byte) 98);
            if (var12.field336 != null) {
                this.field216 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIIIJILbh;)V", line = 318)
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class18 arg10) {
        class233 var13 = this.method114(-100);
        field224++;
        if (var13 != null) {
            var13.method111(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field193);
        }
    }

    @OriginalMember(owner = "client!ud", name = "finalize", descriptor = "()V", line = 337)
    protected final void finalize() {
        field223++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([JB[Ljava/lang/Object;)V", line = 353)
    public static final void method112(long[] arg0, byte arg1, Object[] arg2) {
        if (arg1 != -106) {
            method107(false);
        }
        field215++;
        class286.method1992(arg2, arg0.length - 1, 19, 0, arg0);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 364)
    public final void method113(int arg0) {
        field222++;
        if (arg0 != 482) {
            return;
        }
        if (this.field202 != null) {
            class32.method234(this.field202, this.field191, this.field197, this.field200);
        }
        this.field218 = -1;
        this.field202 = null;
        this.field201 = -1;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)Lmd;", line = 504)
    public final class233 method114(int arg0) {
        if (arg0 > -91) {
            this.method110(-100, -35, 99);
        }
        field207++;
        return this.method109(false, 533503942);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "()I", line = 516)
    public final int method115() {
        field195++;
        return this.field212;
    }
}
