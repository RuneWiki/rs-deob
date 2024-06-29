import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class196 extends class188 {

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
    public int field2981 = 0;

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "[I")
    public int[] field2988 = new int[5];

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "[Lsg;")
    public class44[] field2998 = new class44[5];

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
    public int field2982;

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "I")
    public int field2991;

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "I")
    public int field2992;

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "I")
    public int field2986;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public static int field2978 = -1;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "[I")
    public static int[] field2977 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public static int field2976 = -1;

    @OriginalMember(owner = "client!wk", name = "B", descriptor = "B")
    public byte field2989;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public int field2979;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
    public int field2980;

    @OriginalMember(owner = "client!wk", name = "F", descriptor = "I")
    public int field2993;

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "I")
    public int field2995;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!wk", name = "Q", descriptor = "I")
    public int field3002;

    @OriginalMember(owner = "client!wk", name = "M", descriptor = "Lsf;")
    public class123 field2999;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "Lnk;")
    public static class16 field2975;

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "Lwk;")
    public class196 field2990;

    @OriginalMember(owner = "client!wk", name = "O", descriptor = "Lt;")
    public class281 field3001;

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "Lsd;")
    public class33 field2997;

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "Lra;")
    public class353 field2985;

    @OriginalMember(owner = "client!wk", name = "R", descriptor = "Ldj;")
    public class360 field3003;

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "Loo;")
    public class51 field2987;

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "Lfk;")
    public class54 field2994;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "Z")
    public boolean field2983;

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "Z")
    public boolean field2984;

    @OriginalMember(owner = "client!wk", name = "N", descriptor = "Z")
    public boolean field3000;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V", line = 10)
    public static void method1370(int arg0) {
        field2975 = null;
        if (arg0 != 0) {
            method1372(58);
        }
        field2977 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIIIB)V", line = 23)
    public static final void method1371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field2974++;
        if (arg6 < 128 || arg4 < 128 || arg6 > 13056 || arg4 > 13056) {
            class64.field771 = -1;
            class89.field1167 = -1;
            return;
        }
        int var8 = class14.method80(arg4, class219.field3290, arg6, (byte) -126) - arg3;
        int var9 = var8 - class119.field1657;
        int var10 = arg6 - class10.field96;
        int var11 = arg4 - class280.field4415;
        int var12 = 92 / ((-arg7 - 65) / 43);
        int var13 = class104.field1426[class283.field4508];
        int var14 = class104.field1426[class257.field4067];
        int var15 = class104.field1435[class283.field4508];
        int var16 = class104.field1435[class257.field4067];
        int var17 = var10 * var16 + var11 * var14 >> 16;
        int var18 = var11 * var16 - (var10 * var14) >> 16;
        int var20 = var9 * var15 - (var13 * var18) >> 16;
        int var21 = var9 * var13 + var15 * var18 >> 16;
        if (var21 < 50) {
            class64.field771 = -1;
            class89.field1167 = -1;
        } else if (class272.field4317) {
            int var23 = arg2 * 512 >> 8;
            class89.field1167 = var17 * var23 / var21 + arg5;
            int var24 = arg0 * 512 >> 8;
            class64.field771 = var20 * var24 / var21 + arg1;
        } else {
            class64.field771 = (var20 << 9) / var21 + arg1;
            class89.field1167 = (var17 << 9) / var21 + arg5;
        }
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)Ljava/lang/String;", line = 85)
    public static final String method1372(int arg0) {
        if (arg0 != -26567) {
            field2975 = (class16) null;
        }
        field2972++;
        String var1;
        if (class119.field1662 == 1 && class74.field924 < 2) {
            var1 = class50.field576 + class357.field5672 + class201.field3074 + " ->";
        } else if (class101.field1371 && class74.field924 < 2) {
            var1 = class260.field4110 + class357.field5672 + class191.field2868 + " ->";
        } else if (class67.field847 && class276.field4349[81] && class74.field924 > 2) {
            var1 = class2.method14(class74.field924 - 2, true);
        } else {
            var1 = class2.method14(class74.field924 - 1, true);
        }
        if (class74.field924 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class74.field924 - 2) + class185.field2795;
        }
        return var1;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIB)I", line = 119)
    public static final int method1373(int arg0, int arg1, byte arg2) {
        int var3 = class135.method931(arg0 + 91923, -1, 4, arg1 + 45365) + (class135.method931(arg0 + 37821, -1, 2, arg1 + 10294) - 128 >> 1) + (class135.method931(arg0, -1, 1, arg1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        field2996++;
        if (arg2 != 77) {
            method1372(86);
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(III)V", line = 139)
    public class196(int arg0, int arg1, int arg2) {
        this.field2982 = arg2;
        this.field2992 = this.field2991 = arg0;
        this.field2986 = arg1;
    }
}
