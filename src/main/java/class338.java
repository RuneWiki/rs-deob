import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class338 extends class172 {

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    private int field5198;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    private int field5199;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "I")
    private int field5205;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    private int field5195;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    public int field5194;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
    public int field5209;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
    public int field5206;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public int field5192;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
    private int field5197;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
    private int field5204;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    public static int field5196 = 10;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "Lbj;")
    public static class314 field5202;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)Z", line = 12)
    public final boolean method2371(int arg0, int arg1, int arg2) {
        field5193++;
        if (arg1 < 5) {
            this.field5197 = 74;
        }
        return this.field5194 <= arg2 && arg2 <= this.field5209 && this.field5206 <= arg0 && arg0 <= this.field5192;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZII)Z", line = 29)
    public final boolean method2372(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field5207++;
            return this.field5197 <= arg1 && arg1 <= this.field5204 && this.field5199 <= arg2 && arg2 <= this.field5198;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIILrg;)V", line = 44)
    public static final void method2373(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class342 arg7) {
        if (arg5 != 0) {
            return;
        }
        field5190++;
        int var8 = arg0 * arg0 + arg6 * arg6;
        if (arg2 < var8) {
            return;
        }
        int var9 = Math.min(arg7.field5374 / 2, arg7.field5339 / 2);
        if ((var9 * var9) >= var8) {
            class217.method1621(arg4, arg0, arg3, arg7, class148.field2429[arg1], arg5 ^ 0xFFFFFFB7, arg6);
            return;
        }
        int var10;
        if (class314.field4858 == 4) {
            var10 = (int) class313.field4846 & 0x7FF;
        } else {
            var10 = (int) class313.field4846 + class290.field4513 & 0x7FF;
        }
        var9 -= 10;
        int var11 = class107.field1604[var10];
        int var12 = class107.field1605[var10];
        if (class314.field4858 != 4) {
            var12 = var12 * 256 / (class236.field3676 + 256);
            var11 = var11 * 256 / (class236.field3676 + 256);
        }
        int var13 = arg0 * var12 + arg6 * var11 >> 16;
        int var14 = arg6 * var12 - (arg0 * var11) >> 16;
        double var15 = Math.atan2((double) var13, (double) var14);
        int var17 = (int) (Math.sin(var15) * (double) var9);
        int var18 = (int) ((double) var9 * Math.cos(var15));
        if (class240.field3737) {
            ((class2) class167.field2665[arg1]).method15(240, 240, (arg7.field5374 / 2 + arg3 + var17) * 16, (arg7.field5339 / 2 + arg4 - var18) * 16, (int) (var15 * 10430.378D), 4096);
        } else {
            ((class361) class167.field2665[arg1]).method521(arg7.field5374 / 2 + var17 + arg3 - 10, arg4 - 10 + arg7.field5339 / 2 + -var18, 20, 20, 15, 15, var15, 256);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIIIII)V", line = 104)
    public static final void method2374(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class285 var10 = (class285) class363.field5747.method2244((byte) -128);
        if (arg1 != 15) {
            method2374(69, -20, 8, -58, 111, -67, -4, -35, 55, 68);
        }
        class285 var11 = null;
        field5191++;
        while (var10 != null) {
            if (var10.field4430 == arg4 && var10.field4416 == arg0 && var10.field4427 == arg9 && var10.field4423 == arg2) {
                var11 = var10;
                break;
            }
            var10 = (class285) class363.field5747.method2241(arg1 - 16);
        }
        if (var11 == null) {
            var11 = new class285();
            var11.field4416 = arg0;
            var11.field4423 = arg2;
            var11.field4427 = arg9;
            var11.field4430 = arg4;
            class89.method803(var11, -1);
            class363.field5747.method2245(var11, 21);
        }
        var11.field4417 = arg3;
        var11.field4431 = arg5;
        var11.field4424 = arg8;
        var11.field4429 = arg6;
        var11.field4420 = arg7;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([IIZI)V", line = 153)
    public final void method2375(int[] arg0, int arg1, boolean arg2, int arg3) {
        field5208++;
        arg0[0] = this.field5205;
        arg0[2] = this.field5206 + arg3 - this.field5199;
        if (arg2) {
            method2374(-125, 112, 32, -115, -47, -39, -35, 40, -4, 86);
        }
        arg0[1] = this.field5194 + arg1 - this.field5197;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lug;I)Lin;", line = 168)
    public static final class362 method2376(class25 arg0, int arg1) {
        if (arg1 != -19396) {
            method2374(27, -42, 22, 106, -125, -59, -3, -54, 111, -56);
        }
        field5203++;
        return new class362(arg0.method296(-108), arg0.method296(-120), arg0.method296(-115), arg0.method296(-87), arg0.method296(-94), arg0.method296(-91), arg0.method296(-102), arg0.method296(-106), arg0.method265(true), arg0.method281(107));
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 184)
    public class338(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field5198 = arg5;
        this.field5199 = arg3;
        this.field5205 = arg1;
        this.field5195 = arg0;
        this.field5194 = arg6;
        this.field5209 = arg8;
        this.field5206 = arg7;
        this.field5192 = arg9;
        this.field5197 = arg2;
        this.field5204 = arg4;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V", line = 202)
    public static void method2377(byte arg0) {
        field5202 = null;
        if (arg0 != -22) {
            field5196 = -29;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IBII)Z", line = 212)
    public final boolean method2378(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -6) {
            this.method2375((int[]) null, -63, true, -33);
        }
        field5201++;
        return this.field5195 == arg0 && arg2 >= this.field5197 && arg2 <= this.field5204 && arg3 >= this.field5199 && arg3 <= this.field5198;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II[IB)V", line = 227)
    public final void method2379(int arg0, int arg1, int[] arg2, byte arg3) {
        arg2[0] = this.field5195;
        arg2[1] = this.field5197 + arg0 - this.field5194;
        arg2[2] = this.field5199 + arg1 - this.field5206;
        if (arg3 <= 92) {
            this.field5197 = 102;
        }
        field5200++;
    }
}
