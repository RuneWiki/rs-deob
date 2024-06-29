import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class209 extends class166 {

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public int field3260;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public int field3250;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "[I")
    public int[] field3261;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "[[I")
    public int[][] field3252;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "[I")
    public int[] field3253;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "[Z")
    public boolean[] field3256;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "Lbk;")
    public static class21 field3259;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "Lre;")
    public static class228 field3258;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLhc;)V")
    public static final void method1401(byte arg0, class235 arg1) {
        int var2 = -8 % ((arg0 - 57) / 43);
        field3249++;
        class267.field4269 = arg1;
        class241.field3917 = class267.field4269.method1616(16, -12772);
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
    public static void method1402(int arg0) {
        field3258 = null;
        field3259 = null;
        if (arg0 != 0) {
            method1406(109, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILwc;I)V")
    public static final void method1403(int arg0, int arg1, class236 arg2, int arg3) {
        field3255++;
        if (arg2.field2214 == arg0 && arg0 != -1) {
            class30 var4 = class148.method996(-60, arg0);
            int var5 = var4.field450;
            if (var5 == 1) {
                arg2.field2239 = arg1;
                arg2.field2199 = 0;
                arg2.field2220 = 0;
                arg2.field2288 = 0;
                arg2.field2296 = 1;
                class52.method390(class283.field4473 == arg2, var4, arg2.field2199, 119, arg2.field2278, arg2.field2240);
            }
            if (var5 == 2) {
                arg2.field2220 = 0;
            }
        } else if (arg0 == -1 || arg2.field2214 == -1 || class148.method996(-108, arg0).field440 >= class148.method996(arg3 - 45, arg2.field2214).field440) {
            arg2.field2199 = 0;
            arg2.field2214 = arg0;
            arg2.field2288 = 0;
            arg2.field2296 = 1;
            arg2.field2239 = arg1;
            arg2.field2220 = 0;
            arg2.field2281 = arg2.field2263;
            if (arg2.field2214 != -1) {
                class52.method390(class283.field4473 == arg2, class148.method996(-81, arg2.field2214), arg2.field2199, 112, arg2.field2278, arg2.field2240);
            }
        }
        if (arg3 != -2) {
            field3258 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILhc;)V")
    public static final void method1404(int arg0, class235 arg1) {
        field3254++;
        class13.field211 = arg1;
        if (arg0 >= -70) {
            field3258 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIBIZ)V")
    public static final void method1405(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, boolean arg6) {
        class86.field1434 = arg1;
        field3248++;
        class170.field2650 = arg3;
        class168.field2628 = arg5;
        class277.field4401 = arg2;
        int var7 = -41 % ((-arg4 - 28) / 60);
        class272.field4366 = arg0;
        if (arg6 && class168.field2628 >= 100) {
            class293.field4624 = class86.field1434 * 128 + 64;
            class219.field3375 = class272.field4366 * 128 + 64;
            class170.field2653 = class34.method269(class240.field3892, class293.field4624, class219.field3375, 103) - class277.field4401;
        }
        class259.field4130 = 2;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[B)Lvl;")
    public static final class242 method1406(int arg0, byte[] arg1) {
        field3257++;
        if (arg1 == null) {
            return null;
        } else if (arg0 >= -44) {
            return null;
        } else {
            class252 var2 = new class252(arg1, class193.field3066, class108.field1779, class28.field390, class171.field2679, class198.field3123);
            class19.method179(8);
            return var2;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(I[B)V")
    public class209(int arg0, byte[] arg1) {
        this.field3260 = arg0;
        class88 var3 = new class88(arg1);
        this.field3250 = var3.method633(95);
        this.field3261 = new int[this.field3250];
        this.field3252 = new int[this.field3250][];
        this.field3253 = new int[this.field3250];
        this.field3256 = new boolean[this.field3250];
        for (int var4 = 0; var4 < this.field3250; var4++) {
            this.field3253[var4] = var3.method633(78);
        }
        for (int var5 = 0; var5 < this.field3250; var5++) {
            this.field3256[var5] = var3.method633(60) == 1;
        }
        for (int var6 = 0; var6 < this.field3250; var6++) {
            this.field3261[var6] = var3.method645(11596);
        }
        for (int var7 = 0; var7 < this.field3250; var7++) {
            this.field3252[var7] = new int[var3.method633(75)];
        }
        for (int var8 = 0; var8 < this.field3250; var8++) {
            for (int var9 = 0; var9 < this.field3252[var8].length; var9++) {
                this.field3252[var8][var9] = var3.method633(95);
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lek;Lek;I)V")
    public static final void method1407(class166 arg0, class166 arg1, int arg2) {
        field3251++;
        if (arg0.field2602 != null) {
            arg0.method1123(0);
        }
        if (arg2 > 5) {
            arg0.field2602 = arg1.field2602;
            arg0.field2608 = arg1;
            arg0.field2602.field2608 = arg0;
            arg0.field2608.field2602 = arg0;
        }
    }
}
