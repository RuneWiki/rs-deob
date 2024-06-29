import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class234 extends class265 {

    @OriginalMember(owner = "client!s", name = "p", descriptor = "Lti;")
    private class5 field4073 = null;

    @OriginalMember(owner = "client!s", name = "A", descriptor = "I")
    private int field4084 = -32768;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    private int field4070 = -1;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "I")
    private int field4081 = -1;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    private int field4079;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    private int field4074;

    @OriginalMember(owner = "client!s", name = "I", descriptor = "I")
    private int field4091;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    private int field4068;

    @OriginalMember(owner = "client!s", name = "J", descriptor = "I")
    private int field4092;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    private int field4069;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "Lph;")
    private class78 field4076;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    private int field4072;

    @OriginalMember(owner = "client!s", name = "C", descriptor = "I")
    private int field4086;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "[[I")
    public static int[][] field4071 = new int[104][104];

    @OriginalMember(owner = "client!s", name = "i", descriptor = "[J")
    public static long[] field4066 = new long[100];

    @OriginalMember(owner = "client!s", name = "u", descriptor = "Lp;")
    public static class280 field4078 = class18.method140((byte) -123, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!s", name = "t", descriptor = "Lp;")
    public static class280 field4077 = class18.method140((byte) -119, "Clientscript error in: ");

    @OriginalMember(owner = "client!s", name = "K", descriptor = "Lp;")
    public static class280 field4093 = class18.method140((byte) -120, "brillant2:");

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!s", name = "B", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!s", name = "E", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!s", name = "G", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!s", name = "H", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "Lkc;")
    public static class274 field4082;

    @OriginalMember(owner = "client!s", name = "D", descriptor = "Lla;")
    private class95 field4087;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)I")
    public static int method1572(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIII)V")
    public final void method429(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4075++;
        this.method1576(-101, arg4, arg3);
    }

    @OriginalMember(owner = "client!s", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field4080++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZI)Lrk;")
    private final class265 method1573(boolean arg0, int arg1) {
        field4083++;
        boolean var3 = class168.field2937 != class145.field2529;
        class130 var4 = class32.method277((byte) -94, this.field4068);
        if (var4.field2269 != null) {
            var4 = var4.method891(0);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field4091 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field2277;
            var7 = var4.field2265;
        } else {
            var6 = var4.field2265;
            var7 = var4.field2277;
        }
        int var8 = (var7 >> 1) + this.field4092;
        int var9 = this.field4092 + (var7 + 1 >> 1);
        int var10 = (var6 >> 1) + this.field4074;
        int var11 = (var6 + 1 >> 1) + this.field4074;
        this.method1576(-101, var10 * 128, var8 * 128);
        boolean var12 = !var3 && var4.field2293 && (this.field4070 != var4.field2290 || this.field4081 != this.field4072 && class17.field316 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int[][] var13 = class145.field2529[this.field4069];
        if (arg1 != -32768) {
            this.field4084 = -99;
        }
        int var14 = (this.field4092 << 7) + (var7 << 6);
        boolean var15 = this.field4073 == null;
        int var16 = (this.field4074 << 7) + (var6 << 6);
        int[][] var17 = null;
        if (var3) {
            var17 = class168.field2937[0];
        } else if (this.field4069 < 3) {
            var17 = class145.field2529[this.field4069 + 1];
        }
        int var18 = var13[var9][var10] + var13[var8][var11] + var13[var8][var10] + var13[var9][var11] >> 2;
        class273 var19;
        if (this.field4076 == null) {
            var19 = var4.method897(this.field4091, false, var13, var14, var16, this.field4079, var17, var12, arg1 + 32670, var18, var15 ? class89.field1434 : this.field4073);
        } else {
            var19 = var4.method901(this.field4076, var14, this.field4072, this.field4079, var12, var16, this.field4091, var17, -10872, var13, var15 ? class89.field1434 : this.field4073, var18);
        }
        return var19 == null ? null : var19.field4751;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIIIJILla;)V")
    public final void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class95 arg10) {
        field4065++;
        class265 var13 = this.method1574(121);
        if (var13 != null) {
            var13.method427(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4087);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)Lrk;")
    private final class265 method1574(int arg0) {
        field4085++;
        if (arg0 < 54) {
            method1578(true);
        }
        return this.method1573(false, -32768);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B[Lp;)[Lp;")
    public static final class280[] method1575(byte arg0, class280[] arg1) {
        field4088++;
        class280[] var2 = new class280[5];
        if (arg0 != -88) {
            method1577(72, 88, 22, -32, -114, 0, -97, 88);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class30.method266(new class280[] { class249.method1685((byte) 66, var3), class97.field1557 }, (byte) -87);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class30.method266(new class280[] { var2[var3], arg1[var3] }, (byte) -87);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(III)V")
    private final void method1576(int arg0, int arg1, int arg2) {
        field4089++;
        if (arg0 != -101 || this.field4076 == null) {
            return;
        }
        int var4 = class117.field2104 - this.field4086;
        if (var4 > 100 && this.field4076.field1285 > 0) {
            int var5 = this.field4076.field1275.length - this.field4076.field1285;
            while (this.field4072 < var5 && var4 > this.field4076.field1268[this.field4072]) {
                var4 -= this.field4076.field1268[this.field4072];
                this.field4072++;
            }
            if (var5 <= this.field4072) {
                int var6 = 0;
                for (int var7 = var5; var7 < this.field4076.field1275.length; var7++) {
                    var6 += this.field4076.field1268[var7];
                }
                var4 %= var6;
            }
        }
        while (var4 > this.field4076.field1268[this.field4072]) {
            class150.method1034(arg1, false, this.field4076, this.field4072, arg2, false);
            var4 -= this.field4076.field1268[this.field4072];
            this.field4072++;
            if (this.field4076.field1275.length <= this.field4072) {
                this.field4072 -= this.field4076.field1285;
                if (this.field4072 < 0 || this.field4076.field1275.length <= this.field4072) {
                    this.field4076 = null;
                    break;
                }
            }
        }
        this.field4086 = class117.field2104 - var4;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "()I")
    public final int method426() {
        field4090++;
        return this.field4084;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1577(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4067++;
        if (arg5 < arg2 || arg7 < 128 || arg5 > 13056 || arg7 > 13056) {
            class178.field3091 = -1;
            class261.field4619 = -1;
            return;
        }
        int var8 = class158.method1123(class231.field4013, arg5, arg2 ^ 0xFFFFE72A, arg7) - arg4;
        int var9 = arg7 - class78.field1273;
        int var10 = class146.field2545[class8.field170];
        int var11 = arg5 - client.field2695;
        int var12 = var8 - class22.field406;
        int var13 = class146.field2541[class8.field170];
        int var14 = class146.field2545[class220.field3827];
        int var15 = class146.field2541[class220.field3827];
        int var16 = var9 * var14 + (var11 * var15) >> 16;
        int var17 = var9 * var15 - var11 * var14 >> 16;
        int var19 = var12 * var13 - (var10 * var17) >> 16;
        int var20 = var10 * var12 + var13 * var17 >> 16;
        if (var20 >= 50) {
            class178.field3091 = (var19 << 9) / var20 + arg0;
            class261.field4619 = (var16 << 9) / var20 + arg3;
        } else {
            class261.field4619 = -1;
            class178.field3091 = -1;
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(Z)V")
    public static void method1578(boolean arg0) {
        field4077 = null;
        field4066 = null;
        field4082 = null;
        field4071 = null;
        field4093 = null;
        field4078 = null;
        if (arg0) {
            method1575((byte) -118, (class280[]) null);
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(IIIIIIIZLrk;)V")
    public class234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class265 arg8) {
        this.field4079 = arg1;
        this.field4074 = arg5;
        this.field4091 = arg2;
        this.field4068 = arg0;
        this.field4092 = arg4;
        this.field4069 = arg3;
        if (arg6 != -1) {
            this.field4076 = class207.method1401((byte) -22, arg6);
            this.field4072 = 0;
            this.field4086 = class117.field2104 - 1;
            if (this.field4076.field1290 == 0 && arg8 != null && arg8 instanceof class234) {
                class234 var10 = (class234) arg8;
                if (this.field4076 == var10.field4076) {
                    this.field4086 = var10.field4086;
                    this.field4072 = var10.field4072;
                    return;
                }
            }
            if (arg7 && this.field4076.field1285 != -1) {
                this.field4072 = (int) (Math.random() * (double) this.field4076.field1275.length);
                this.field4086 -= (int) (Math.random() * (double) this.field4076.field1268[this.field4072]);
                return;
            }
        }
    }
}
