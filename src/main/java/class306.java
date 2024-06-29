import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class306 extends class337 {

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "I")
    public int field4400;

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
    private int field4395;

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "I")
    private int field4394;

    @OriginalMember(owner = "client!bn", name = "D", descriptor = "I")
    private int field4407;

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
    public int field4398;

    @OriginalMember(owner = "client!bn", name = "B", descriptor = "I")
    private int field4405;

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "I")
    private int field4399;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "I")
    public int field4396;

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
    public int field4401;

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "Z")
    public static boolean field4402 = true;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!bn", name = "A", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!bn", name = "C", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!bn", name = "E", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!bn", name = "z", descriptor = "[Lvg;")
    public static class38[] field4403;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BII)Z")
    public final boolean method1924(byte arg0, int arg1, int arg2) {
        field4406++;
        if (arg0 < 10) {
            return false;
        } else {
            return this.field4396 <= arg2 && this.field4401 >= arg2 && arg1 >= this.field4400 && this.field4398 >= arg1;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BI[II)V")
    public final void method1925(byte arg0, int arg1, int[] arg2, int arg3) {
        arg2[2] = arg1 + this.field4400 - this.field4407;
        arg2[0] = 0;
        field4408++;
        arg2[1] = arg3 + this.field4396 - this.field4394;
        if (arg0 >= -69) {
            method1928(-16, -48, -5, 89, -80, -44, -5, -50);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)Z")
    public final boolean method1926(int arg0, int arg1, int arg2) {
        if (arg0 > -13) {
            return true;
        } else {
            field4404++;
            return arg2 >= this.field4394 && this.field4405 >= arg2 && arg1 >= this.field4407 && arg1 <= this.field4395;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
    public static void method1927(int arg0) {
        if (arg0 == 16383) {
            field4403 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1928(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4393++;
        int var8 = arg6 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class17.field187 - class367.field5611) * var8 / 100 + class367.field5611;
        int var10 = arg3 * var9 >> 8;
        int var11 = 16384 - arg7 & 0x3FFF;
        int var12 = 16384 - arg2 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class457.field6760[var11] * -var10 >> 15;
            var15 = class457.field6759[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class457.field6760[var12] * var15 >> 15;
            var15 = class457.field6759[var12] * var15 >> 15;
        }
        class259.field3812 = arg2;
        class18.field195 = arg7;
        class291.field4175 = arg4 - var14;
        class24.field258 = arg5 - var13;
        class260.field3827 = arg0 - var15;
        class296.field4216 = 0;
        if (arg1 != 34235791) {
            method1927(91);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II[II)V")
    public final void method1929(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg0 != -9341) {
            method1928(33, 26, 33, 81, 82, -128, 78, 16);
        }
        field4392++;
        arg2[1] = this.field4394 + arg1 - this.field4396;
        arg2[2] = this.field4407 + arg3 - this.field4400;
        arg2[0] = this.field4399;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field4400 = arg6;
        this.field4395 = arg4;
        this.field4394 = arg1;
        this.field4407 = arg2;
        this.field4398 = arg8;
        this.field4405 = arg3;
        this.field4399 = arg0;
        this.field4396 = arg5;
        this.field4401 = arg7;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII)Z")
    public final boolean method1930(int arg0, int arg1, int arg2, int arg3) {
        field4397++;
        if (arg0 != 334) {
            this.method1929(13, 70, null, -32);
        }
        return this.field4399 == arg2 && this.field4394 <= arg3 && this.field4405 >= arg3 && arg1 >= this.field4407 && this.field4395 >= arg1;
    }
}
