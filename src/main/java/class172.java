import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class172 extends class171 {

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    private int field2886 = 0;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    private int field2885 = -32768;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
    private int field2894 = 0;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "Z")
    public boolean field2906 = false;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
    public int field2905;

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "I")
    public int field2900;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    private int field2908;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    public int field2898;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public int field2890;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public int field2893;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "Lhj;")
    private class28 field2889;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "Lmc;")
    public static class170 field2902 = new class170();

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "I")
    public static int field2904 = 0;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "S")
    public static short field2903 = 320;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "[I")
    public static int[] field2909 = new int[100];

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "Lwa;")
    public static class75 field2907 = class66.method560("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", false);

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "Lcb;")
    public static class267 field2896;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIIIIJ)V", line = 9)
    public final void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2897++;
        class234 var11 = this.method1273(-39);
        if (var11 != null) {
            var11.method409(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2885 = var11.method443();
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I[Lwa;[S)V", line = 37)
    public static final void method1269(int arg0, class75[] arg1, short[] arg2) {
        class8.method41(0, arg1, arg2, arg1.length - 1, false);
        field2899++;
        if (arg0 != 1313874720) {
            method1269(-94, (class75[]) null, (short[]) null);
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(IIIIIII)V", line = 283)
    public class172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2905 = arg1;
        this.field2900 = arg5 + arg6;
        this.field2908 = arg0;
        this.field2898 = arg4;
        this.field2890 = arg2;
        this.field2893 = arg3;
        int var8 = class65.method556(this.field2908, 100).field4550;
        if (var8 == -1) {
            this.field2906 = true;
        } else {
            this.field2906 = false;
            this.field2889 = class302.method2082(var8, 22);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lvd;ILhe;)Lcg;", line = 53)
    public static final class38 method1270(class126 arg0, int arg1, class87 arg2) {
        if (arg1 != -14517) {
            return (class38) null;
        }
        field2901++;
        long var3 = ((long) arg2.field1453 << 56) + ((long) arg2.field1445 << 32) + (long) ((arg2.field1428 + 1 << 16) - -arg2.field1431);
        class38 var5 = (class38) arg0.method1007(var3, -17004);
        if (var5 == null) {
            var5 = new class38(arg2.field1428, (float) arg2.field1431, true, false, arg2.field1445);
            arg0.method1004((byte) 73, var3, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V", line = 75)
    public static void method1271(boolean arg0) {
        field2909 = null;
        field2907 = null;
        field2902 = null;
        field2896 = null;
        if (arg0) {
            field2909 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "()I", line = 88)
    public final int method443() {
        field2892++;
        return this.field2885;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V", line = 129)
    public final void method1272(int arg0, int arg1) {
        field2895++;
        if (this.field2906) {
            return;
        }
        this.field2886 += arg0;
        while (this.field2886 > this.field2889.field361[this.field2894]) {
            this.field2886 -= this.field2889.field361[this.field2894];
            this.field2894++;
            if (this.field2889.field368.length <= this.field2894) {
                this.field2906 = true;
                break;
            }
        }
        if (arg1 != 21883) {
            this.field2893 = 1;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)Lcc;", line = 159)
    private final class234 method1273(int arg0) {
        field2891++;
        if (arg0 > -11) {
            method1270((class126) null, 73, (class87) null);
        }
        class263 var2 = class65.method556(this.field2908, -127);
        class234 var3;
        if (this.field2906) {
            var3 = var2.method1881(-1, (byte) -56);
        } else {
            var3 = var2.method1881(this.field2894, (byte) -56);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lbm;IIIIIIZ)V", line = 192)
    public static final void method1274(class129 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field2232.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field2232[var9] - class199.field3347;
            int var11 = arg0.field2231[var9] - class300.field5129;
            int var12 = arg0.field2236[var9] - class207.field3509;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field2229 != null) {
                class129.field2222[var9] = var13;
                class129.field2233[var9] = var16;
                class129.field2227[var9] = var17;
            }
            class129.field2235[var9] = (var13 << 9) / var17 + class21.field283;
            class129.field2224[var9] = (var16 << 9) / var17 + class21.field278;
        }
        class21.field291 = 0;
        int var19 = arg0.field2230.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field2230[var20];
            int var22 = arg0.field2220[var20];
            int var23 = arg0.field2221[var20];
            int var24 = class129.field2235[var21];
            int var25 = class129.field2235[var22];
            int var26 = class129.field2235[var23];
            int var27 = class129.field2224[var21];
            int var28 = class129.field2224[var22];
            int var29 = class129.field2224[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0 && class259.field4337 && class221.method1622(class250.field4205 + class21.field283, class21.field278 + class116.field1965, var27, var28, var29, var24, var25, var26)) {
                class232.field3930 = arg5;
                class195.field3283 = arg6;
            }
        }
    }
}
