import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class174 extends class73 {

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    public static int field2979 = 0;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public static int field2996 = 0;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "Lcb;")
    public static class631 field2973 = new class631(1, 8);

    @OriginalMember(owner = "client!o", name = "U", descriptor = "[I")
    public static int[] field2998 = new int[4096];

    @OriginalMember(owner = "client!o", name = "m", descriptor = "F")
    public float field2964;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "F")
    public float field2965;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "F")
    public float field2969;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "F")
    public float field2976;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "F")
    public float field2978;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "F")
    public float field2982;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "F")
    public float field2985;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "F")
    public float field2988;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "F")
    public float field2991;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "F")
    public float field2992;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "F")
    public float field2994;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "F")
    public float field2995;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "Lns;")
    public static class128 field2980;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FIIFIIF)V", line = 5)
    public final void method1367(float arg0, int arg1, int arg2, float arg3, int arg4, int arg5, float arg6) {
        field2987++;
        if (arg4 == 0) {
            this.field2969 = arg5;
            this.field2976 = arg1;
            this.field2965 = 1.0F;
            this.field2994 = this.field2988 = this.field2985 = this.field2991 = this.field2964 = this.field2995 = 0.0F;
        } else {
            float var8 = class340.field4991[arg4 & 0x3FFF];
            float var9 = class340.field4980[arg4 & 0x3FFF];
            this.field2988 = this.field2991 = this.field2964 = this.field2995 = 0.0F;
            this.field2985 = (float) arg1 * -var9;
            this.field2969 = (float) arg5 * var8;
            this.field2965 = 1.0F;
            this.field2976 = (float) arg1 * var8;
            this.field2994 = (float) arg5 * var9;
        }
        if (arg2 != 1) {
            this.field2985 = -0.3167912F;
        }
        this.field2982 = arg3;
        this.field2992 = arg6;
        this.field2978 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V", line = 39)
    public final void method671(int arg0, int arg1, int arg2) {
        this.field2992 += arg1;
        this.field2982 += arg0;
        this.field2978 += arg2;
        field2986++;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(III[I)V", line = 49)
    public final void method665(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field2965 + (float) arg0 * this.field2988 + (float) arg1 * this.field2991 + this.field2978);
        field2962++;
        arg3[1] = (int) ((float) arg2 * this.field2995 + (float) arg0 * this.field2994 + (float) arg1 * this.field2976 + this.field2992);
        arg3[0] = (int) ((float) arg2 * this.field2964 + (float) arg0 * this.field2969 + (float) arg1 * this.field2985 + this.field2982);
    }

    @OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V", line = 59)
    public final void method678(int arg0) {
        field2997++;
        float var2 = class340.field4991[arg0 & 0x3FFF];
        float var3 = class340.field4980[arg0 & 0x3FFF];
        float var4 = this.field2969;
        float var5 = this.field2985;
        float var6 = this.field2964;
        this.field2969 = this.field2988 * var3 + var2 * var4;
        float var7 = this.field2982;
        this.field2988 = this.field2988 * var2 - var3 * var4;
        this.field2985 = this.field2991 * var3 + var2 * var5;
        this.field2964 = this.field2965 * var3 + var2 * var6;
        this.field2991 = this.field2991 * var2 - (var3 * var5);
        this.field2982 = this.field2978 * var3 + var2 * var7;
        this.field2965 = this.field2965 * var2 - var3 * var6;
        this.field2978 = this.field2978 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V", line = 86)
    public final void method670(int arg0) {
        field2971++;
        this.field2965 = 1.0F;
        this.field2969 = this.field2976 = class340.field4991[arg0 & 0x3FFF];
        this.field2994 = class340.field4980[arg0 & 0x3FFF];
        this.field2964 = this.field2982 = this.field2995 = this.field2992 = this.field2988 = this.field2991 = this.field2978 = 0.0F;
        this.field2985 = -this.field2994;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "()V", line = 98)
    public final void method677() {
        field2981++;
        this.field2969 = this.field2976 = this.field2965 = 1.0F;
        this.field2994 = this.field2988 = this.field2985 = this.field2991 = this.field2964 = this.field2995 = this.field2982 = this.field2992 = this.field2978 = 0.0F;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "()Ltc;", line = 111)
    public final class73 method663() {
        field2983++;
        class174 var1 = new class174();
        var1.field2982 = this.field2982;
        var1.field2992 = this.field2992;
        var1.field2964 = this.field2964;
        var1.field2995 = this.field2995;
        var1.field2985 = this.field2985;
        var1.field2976 = this.field2976;
        var1.field2991 = this.field2991;
        var1.field2994 = this.field2994;
        var1.field2965 = this.field2965;
        var1.field2978 = this.field2978;
        var1.field2988 = this.field2988;
        var1.field2969 = this.field2969;
        return var1;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V", line = 136)
    public final void method672(int arg0) {
        field2968++;
        float var2 = class340.field4991[arg0 & 0x3FFF];
        float var3 = class340.field4980[arg0 & 0x3FFF];
        float var4 = this.field2994;
        float var5 = this.field2976;
        float var6 = this.field2995;
        this.field2994 = var2 * var4 - (this.field2988 * var3);
        float var7 = this.field2992;
        this.field2988 = this.field2988 * var2 + var3 * var4;
        this.field2976 = var2 * var5 - (this.field2991 * var3);
        this.field2991 = this.field2991 * var2 + var3 * var5;
        this.field2995 = var2 * var6 - this.field2965 * var3;
        this.field2992 = var2 * var7 - (this.field2978 * var3);
        this.field2965 = this.field2965 * var2 + var3 * var6;
        this.field2978 = this.field2978 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 163)
    public final void method667(int arg0) {
        field2993++;
        float var2 = class340.field4991[arg0 & 0x3FFF];
        float var3 = class340.field4980[arg0 & 0x3FFF];
        float var4 = this.field2969;
        float var5 = this.field2985;
        float var6 = this.field2964;
        this.field2969 = var2 * var4 - this.field2994 * var3;
        float var7 = this.field2982;
        this.field2985 = var2 * var5 - (this.field2976 * var3);
        this.field2994 = this.field2994 * var2 + var3 * var4;
        this.field2964 = var2 * var6 - this.field2995 * var3;
        this.field2976 = this.field2976 * var2 + var3 * var5;
        this.field2982 = var2 * var7 - (this.field2992 * var3);
        this.field2995 = this.field2995 * var2 + var3 * var6;
        this.field2992 = this.field2992 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([I)V", line = 190)
    public final void method666(int[] arg0) {
        field2970++;
        float var2 = (float) arg0[0] - this.field2982;
        float var3 = (float) arg0[1] - this.field2992;
        float var4 = (float) arg0[2] - this.field2978;
        arg0[1] = (int) (this.field2991 * var4 + this.field2985 * var2 + this.field2976 * var3);
        arg0[0] = (int) (this.field2988 * var4 + this.field2994 * var3 + this.field2969 * var2);
        arg0[2] = (int) (this.field2965 * var4 + this.field2995 * var3 + this.field2964 * var2);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(III[I)V", line = 207)
    public final void method664(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field2965 + (float) arg0 * this.field2988 + (float) arg1 * this.field2991);
        field2972++;
        arg3[0] = (int) ((float) arg2 * this.field2964 + (float) arg0 * this.field2969 + (float) arg1 * this.field2985);
        arg3[1] = (int) ((float) arg2 * this.field2995 + (float) arg0 * this.field2994 + (float) arg1 * this.field2976);
    }

    @OriginalMember(owner = "client!o", name = "h", descriptor = "(I)[F", line = 226)
    public final float[] method1368(int arg0) {
        class248.field3970[9] = this.field2995;
        field2960++;
        class248.field3970[1] = this.field2994;
        class248.field3970[0] = this.field2969;
        class248.field3970[2] = this.field2988;
        class248.field3970[14] = this.field2978;
        class248.field3970[4] = this.field2985;
        class248.field3970[5] = this.field2976;
        class248.field3970[13] = this.field2992;
        class248.field3970[12] = this.field2982;
        class248.field3970[8] = this.field2964;
        class248.field3970[6] = this.field2991;
        if (arg0 != 16383) {
            this.field2985 = -1.0520943F;
        }
        class248.field3970[10] = this.field2965;
        return class248.field3970;
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V", line = 255)
    public final void method674(int arg0) {
        field2975++;
        this.field2969 = 1.0F;
        this.field2976 = this.field2965 = class340.field4991[arg0 & 0x3FFF];
        this.field2991 = class340.field4980[arg0 & 0x3FFF];
        this.field2985 = this.field2964 = this.field2982 = this.field2994 = this.field2992 = this.field2988 = this.field2978 = 0.0F;
        this.field2995 = -this.field2991;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIII)V", line = 274)
    public final void method668(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2974++;
        float var7 = class340.field4991[arg3 & 0x3FFF];
        float var8 = class340.field4980[arg3 & 0x3FFF];
        float var9 = class340.field4991[arg4 & 0x3FFF];
        float var10 = class340.field4980[arg4 & 0x3FFF];
        float var11 = class340.field4991[arg5 & 0x3FFF];
        float var12 = class340.field4980[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field2985 = var7 * var12;
        this.field2995 = var9 * var13 + var10 * var12;
        this.field2994 = -var9 * var12 + var10 * var13;
        this.field2964 = -var10 * var11 + var9 * var14;
        this.field2969 = var9 * var11 + var10 * var14;
        this.field2976 = var7 * var11;
        this.field2988 = var7 * var10;
        this.field2965 = var7 * var9;
        this.field2991 = -var8;
        this.field2978 = (float) (-arg0) * this.field2988 - (float) arg1 * this.field2991 - (float) arg2 * this.field2965;
        this.field2992 = (float) (-arg0) * this.field2994 - (float) arg1 * this.field2976 - ((float) arg2 * this.field2995);
        this.field2982 = (float) (-arg0) * this.field2969 - ((float) arg1 * this.field2985) - (float) arg2 * this.field2964;
    }

    @OriginalMember(owner = "client!o", name = "i", descriptor = "(I)V", line = 309)
    public static void method1369(int arg0) {
        field2980 = null;
        field2998 = null;
        if (arg0 != 1) {
            method1369(63);
        }
        field2973 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)[F", line = 322)
    public final float[] method1370(boolean arg0) {
        class248.field3970[13] = 0.0F;
        if (arg0) {
            return null;
        }
        class248.field3970[4] = this.field2985;
        class248.field3970[12] = 0.0F;
        class248.field3970[6] = this.field2991;
        class248.field3970[14] = 0.0F;
        class248.field3970[10] = this.field2965;
        class248.field3970[0] = this.field2969;
        field2961++;
        class248.field3970[5] = this.field2976;
        class248.field3970[2] = this.field2988;
        class248.field3970[9] = this.field2995;
        class248.field3970[1] = this.field2994;
        class248.field3970[8] = this.field2964;
        return class248.field3970;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III[I)V", line = 347)
    public final void method662(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg1 - this.field2992);
        field2990++;
        int var6 = (int) ((float) arg2 - this.field2978);
        int var7 = (int) ((float) arg0 - this.field2982);
        arg3[1] = (int) ((float) var6 * this.field2991 + (float) var5 * this.field2976 + (float) var7 * this.field2985);
        arg3[0] = (int) ((float) var6 * this.field2988 + (float) var5 * this.field2994 + (float) var7 * this.field2969);
        arg3[2] = (int) ((float) var6 * this.field2965 + (float) var5 * this.field2995 + (float) var7 * this.field2964);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(III)V", line = 360)
    public final void method675(int arg0, int arg1, int arg2) {
        this.field2969 = this.field2976 = this.field2965 = 1.0F;
        this.field2992 = arg1;
        this.field2994 = this.field2988 = this.field2985 = this.field2991 = this.field2964 = this.field2995 = 0.0F;
        this.field2978 = arg2;
        field2977++;
        this.field2982 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(I)V", line = 375)
    public final void method676(int arg0) {
        this.field2976 = 1.0F;
        field2989++;
        this.field2969 = this.field2965 = class340.field4991[arg0 & 0x3FFF];
        this.field2964 = class340.field4980[arg0 & 0x3FFF];
        this.field2985 = this.field2982 = this.field2994 = this.field2995 = this.field2992 = this.field2991 = this.field2978 = 0.0F;
        this.field2988 = -this.field2964;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)V", line = 387)
    public final void method1371(boolean arg0) {
        this.field2976 = -this.field2976;
        this.field2991 = -this.field2991;
        this.field2992 = -this.field2992;
        if (!arg0) {
            return;
        }
        this.field2995 = -this.field2995;
        this.field2965 = -this.field2965;
        field2963++;
        this.field2988 = -this.field2988;
        this.field2978 = -this.field2978;
        this.field2994 = -this.field2994;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLtc;)V", line = 410)
    public final void method1372(boolean arg0, class73 arg1) {
        field2966++;
        class174 var3 = (class174) arg1;
        this.field2985 = var3.field2994;
        this.field2964 = var3.field2988;
        this.field2969 = var3.field2969;
        this.field2994 = var3.field2985;
        this.field2976 = var3.field2976;
        this.field2995 = var3.field2991;
        this.field2988 = var3.field2964;
        this.field2965 = var3.field2965;
        this.field2982 = -(this.field2964 * var3.field2978 + this.field2985 * var3.field2992 + this.field2969 * var3.field2982);
        this.field2991 = var3.field2995;
        this.field2992 = -(this.field2995 * var3.field2978 + this.field2994 * var3.field2982 + this.field2976 * var3.field2992);
        if (!arg0) {
            this.field2988 = 0.81598735F;
        }
        this.field2978 = -(this.field2965 * var3.field2978 + this.field2991 * var3.field2992 + this.field2988 * var3.field2982);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FF[FBFF)V", line = 436)
    public final void method1373(float arg0, float arg1, float[] arg2, byte arg3, float arg4, float arg5) {
        field2984++;
        arg2[1] = this.field2995 * arg0 + this.field2994 * arg1 + this.field2976 * arg4;
        arg2[2] = this.field2965 * arg0 + this.field2991 * arg4 + this.field2988 * arg1;
        arg2[0] = this.field2964 * arg0 + this.field2985 * arg4 + this.field2969 * arg1;
        float var8;
        float var9;
        float var10;
        if ((arg1 > 0.00390625F) || (arg1 < -0.00390625F)) {
            float var12 = -arg5 / arg1;
            var9 = this.field2994 * var12 + this.field2992;
            var10 = this.field2988 * var12 + this.field2978;
            var8 = this.field2969 * var12 + this.field2982;
        } else if ((arg4 > 0.00390625F) || (arg4 < -0.00390625F)) {
            float var11 = -arg5 / arg4;
            var10 = this.field2991 * var11 + this.field2978;
            var8 = this.field2985 * var11 + this.field2982;
            var9 = this.field2976 * var11 + this.field2992;
        } else {
            float var7 = -arg5 / arg0;
            var8 = this.field2964 * var7 + this.field2982;
            var9 = this.field2995 * var7 + this.field2992;
            var10 = this.field2965 * var7 + this.field2978;
        }
        int var13 = 27 / ((62 - arg3) / 46);
        arg2[3] = -(arg2[2] * var10 + arg2[0] * var8 + arg2[1] * var9);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ltc;)V", line = 480)
    public final void method673(class73 arg0) {
        field2967++;
        class174 var2 = (class174) arg0;
        this.field2978 = var2.field2978;
        this.field2969 = var2.field2969;
        this.field2965 = var2.field2965;
        this.field2976 = var2.field2976;
        this.field2985 = var2.field2985;
        this.field2982 = var2.field2982;
        this.field2992 = var2.field2992;
        this.field2964 = var2.field2964;
        this.field2995 = var2.field2995;
        this.field2988 = var2.field2988;
        this.field2991 = var2.field2991;
        this.field2994 = var2.field2994;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V", line = 500)
    public class174() {
        this.method677();
    }
}
