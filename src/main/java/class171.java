import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class171 {

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Z")
    public boolean field3061 = true;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public int field3058;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public int field3057;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public int field3072;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public int field3065;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public int field3070;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public int field3060;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "Lqe;")
    private static class179 field3062 = class206.method1380("Please subscribe)1 or use a different world)3", (byte) 16);

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "Lqe;")
    public static class179 field3064 = field3062;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "[I")
    public static int[] field3071 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "Lo;")
    public static class152 field3066;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "[Lfc;")
    public static class58[] field3068;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I")
    public static final int method1083(int arg0, int arg1) {
        field3063++;
        if (arg1 >= 65 && arg1 <= 90 || !(arg1 < 192 || arg1 > 222 || arg1 == 215)) {
            return arg1 + 32;
        } else if (arg1 == 159) {
            return 255;
        } else if (arg1 == 140) {
            return 156;
        } else {
            if (arg0 != -223) {
                method1084(62, -47);
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)V")
    public static final void method1084(int arg0, int arg1) {
        field3069++;
        if (arg0 == -1 || !class236.field4346[arg0]) {
            return;
        }
        class227.field4202.method340(1, arg0);
        int var2 = -104 / ((arg1 + 46) / 59);
        if (class199.field3710[arg0] == null) {
            return;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < class199.field3710[arg0].length; var4++) {
            if (class199.field3710[arg0][var4] != null) {
                if (class199.field3710[arg0][var4].field128 == 2) {
                    var3 = false;
                } else {
                    class199.field3710[arg0][var4] = null;
                }
            }
        }
        if (var3) {
            class199.field3710[arg0] = null;
        }
        class236.field4346[arg0] = false;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIII)V")
    public static final void method1085(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3059++;
        if (arg5 >= -70) {
            method1083(-122, -46);
        }
        int var6 = arg0;
        class23.method161(arg2 + arg3, -1, arg1, arg2 - arg3, class14.field331[arg4]);
        int var7 = 0;
        int var8 = arg3 * arg3;
        int var9 = var8 << 1;
        int var10 = arg0 * arg0;
        int var11 = arg0 << 1;
        int var12 = var10 << 1;
        int var13 = (1 - var11) * var8 + var12;
        int var14 = var10 - (var11 - 1) * var9;
        int var15 = var8 << 2;
        int var16 = var10 << 2;
        int var17 = ((var7 << 1) + 3) * var12;
        int var18 = ((arg0 << 1) - 3) * var9;
        int var19 = (var7 + 1) * var16;
        int var20 = (arg0 - 1) * var15;
        while (var6 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var7++;
                    var19 += var16;
                    var17 += var16;
                }
            }
            var6--;
            if (var14 < 0) {
                var14 += var19;
                var19 += var16;
                var13 += var17;
                var7++;
                var17 += var16;
            }
            var14 += -var18;
            int var21 = arg4 - var6;
            var13 += -var20;
            var18 -= var15;
            var20 -= var15;
            int var22 = arg4 + var6;
            int var23 = arg2 + var7;
            int var24 = arg2 - var7;
            class23.method161(var23, -1, arg1, var24, class14.field331[var21]);
            class23.method161(var23, -1, arg1, var24, class14.field331[var22]);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIII)V")
    public static final void method1086(int arg0, int arg1, int arg2, int arg3) {
        class197 var4 = class229.field4232[arg0][arg1][arg2];
        if (var4 != null) {
            class229.field4232[arg0][arg1][arg2].field3660 = arg3;
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(II)I")
    public static int method1087(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static void method1088(int arg0) {
        field3064 = null;
        field3062 = null;
        if (arg0 != -160) {
            field3066 = null;
        }
        field3071 = null;
        field3066 = null;
        field3068 = null;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3058 = arg3;
        this.field3057 = arg5;
        this.field3072 = arg0;
        this.field3065 = arg4;
        this.field3070 = arg1;
        this.field3060 = arg2;
        this.field3061 = arg6;
    }
}
