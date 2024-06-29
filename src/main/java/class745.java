import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class745 {

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "Ldh;")
    public static class320 field10396 = new class320(97, 2);

    @OriginalMember(owner = "client!wga", name = "m", descriptor = "[I")
    public static int[] field10407 = new int[5];

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "I")
    public static int field10395;

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "I")
    public static int field10397;

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "I")
    public static int field10398;

    @OriginalMember(owner = "client!wga", name = "e", descriptor = "I")
    public static int field10399;

    @OriginalMember(owner = "client!wga", name = "f", descriptor = "I")
    public static int field10400;

    @OriginalMember(owner = "client!wga", name = "g", descriptor = "I")
    public int field10401;

    @OriginalMember(owner = "client!wga", name = "h", descriptor = "I")
    private int field10402;

    @OriginalMember(owner = "client!wga", name = "i", descriptor = "I")
    public static int field10403;

    @OriginalMember(owner = "client!wga", name = "j", descriptor = "I")
    public static int field10404;

    @OriginalMember(owner = "client!wga", name = "l", descriptor = "I")
    public static int field10406;

    @OriginalMember(owner = "client!wga", name = "n", descriptor = "I")
    public static int field10408;

    @OriginalMember(owner = "client!wga", name = "k", descriptor = "Loh;")
    public static class404 field10405;

    @OriginalMember(owner = "client!wga", name = "o", descriptor = "[Lmfa;")
    public static class614[] field10409;

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIII)Z")
    public final boolean method4140(int arg0, int arg1, int arg2, int arg3) {
        field10397++;
        int var5 = this.field10402;
        if (this.field10401 == arg1 && this.field10402 == 0) {
            return false;
        }
        boolean var8;
        if (this.field10402 == 0) {
            if (arg1 > this.field10401 && this.field10401 + arg3 >= arg1 || this.field10401 > arg1 && this.field10401 - arg3 <= arg1) {
                this.field10401 = arg1;
                return false;
            }
            var8 = true;
        } else if (this.field10402 > 0 && arg1 > this.field10401) {
            int var6 = this.field10402 * this.field10402 / (arg3 * 2);
            int var7 = this.field10401 + var6;
            if (var7 < arg1 && this.field10401 <= var7) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field10402 < 0 && this.field10401 > arg1) {
            int var9 = this.field10402 * this.field10402 / (arg3 * 2);
            int var10 = this.field10401 - var9;
            if (var10 > arg1 && var10 <= this.field10401) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (this.field10401 >= arg1) {
                this.field10402 -= arg3;
                if (arg0 != 0 && (-arg0) > this.field10402) {
                    this.field10402 = -arg0;
                }
            } else {
                this.field10402 += arg3;
                if (arg0 != 0 && arg0 < this.field10402) {
                    this.field10402 = arg0;
                }
            }
            if (this.field10402 != var5) {
                int var11 = this.field10402 * this.field10402 / (arg3 * 2);
                if (arg1 <= this.field10401) {
                    if (arg1 < this.field10401 && this.field10401 - var11 < arg1) {
                        this.field10402 = var5;
                    }
                } else if (this.field10401 + var11 > arg1) {
                    this.field10402 = var5;
                }
            }
        } else if (this.field10402 > 0) {
            this.field10402 -= arg3;
            if (this.field10402 < 0) {
                this.field10402 = 0;
            }
        } else {
            this.field10402 += arg3;
            if (this.field10402 > 0) {
                this.field10402 = 0;
            }
        }
        if (arg2 < 61) {
            method4143(41);
        }
        this.field10401 += this.field10402 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)I")
    public final int method4141(int arg0) {
        if (arg0 != -2117887806) {
            field10407 = null;
        }
        field10399++;
        return this.field10401 & 0x3FFF;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(III)I")
    public static final int method4142(int arg0, int arg1, int arg2) {
        field10406++;
        int var3 = (class228.method1316(4, arg1 + 45365, arg2 + 91923, -31999) + (class228.method1316(2, arg1 + 10294, arg2 + 37821, -31999) - 128 >> 1)) + (class228.method1316(1, arg1, arg2, -31999) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg0 != -1) {
            field10408 = 28;
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(I)V")
    public static final void method4143(int arg0) {
        field10400++;
        class469.field6700.method1758(127);
        int var1 = 83 / ((arg0 - 69) / 46);
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(II)V")
    public final void method4144(int arg0, int arg1) {
        this.field10402 = arg1;
        this.field10401 = arg0;
        field10398++;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZI)V")
    public static final void method4145(boolean arg0, int arg1) {
        class200.field2371 = new int[arg1];
        class11.field91 = new int[arg1];
        if (arg0) {
            field10408 = 47;
        }
        class219.field2538 = new int[arg1];
        field10403++;
        class368.field4706 = new int[arg1];
        class169.field1892 = new int[arg1];
    }

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "(I)V")
    public final void method4146(int arg0) {
        if (arg0 == 22764) {
            field10404++;
            this.field10401 &= 0x3FFF;
        }
    }

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "(I)V")
    public static void method4147(int arg0) {
        if (arg0 <= -3) {
            field10409 = null;
            field10407 = null;
            field10405 = null;
            field10396 = null;
        }
    }
}
