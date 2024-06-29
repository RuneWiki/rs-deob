import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class584 extends class109 {

    @OriginalMember(owner = "client!po", name = "w", descriptor = "[I")
    public static int[] field7945 = new int[13];

    @OriginalMember(owner = "client!po", name = "I", descriptor = "Lmw;")
    public static class517 field7957 = new class517(2, 3);

    @OriginalMember(owner = "client!po", name = "R", descriptor = "I")
    public static int field7965 = -1;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "F")
    public float field7927;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "F")
    public float field7929;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "F")
    public float field7932;

    @OriginalMember(owner = "client!po", name = "l", descriptor = "F")
    public float field7934;

    @OriginalMember(owner = "client!po", name = "r", descriptor = "F")
    public float field7940;

    @OriginalMember(owner = "client!po", name = "B", descriptor = "F")
    public float field7950;

    @OriginalMember(owner = "client!po", name = "C", descriptor = "F")
    public float field7951;

    @OriginalMember(owner = "client!po", name = "D", descriptor = "F")
    public float field7952;

    @OriginalMember(owner = "client!po", name = "E", descriptor = "F")
    public float field7953;

    @OriginalMember(owner = "client!po", name = "G", descriptor = "F")
    public float field7955;

    @OriginalMember(owner = "client!po", name = "H", descriptor = "F")
    public float field7956;

    @OriginalMember(owner = "client!po", name = "P", descriptor = "F")
    public float field7963;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public static int field7928;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "I")
    public static int field7930;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "I")
    public static int field7931;

    @OriginalMember(owner = "client!po", name = "k", descriptor = "I")
    public static int field7933;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "I")
    public static int field7935;

    @OriginalMember(owner = "client!po", name = "n", descriptor = "I")
    public static int field7936;

    @OriginalMember(owner = "client!po", name = "o", descriptor = "I")
    public static int field7937;

    @OriginalMember(owner = "client!po", name = "p", descriptor = "I")
    public static int field7938;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "I")
    public static int field7939;

    @OriginalMember(owner = "client!po", name = "s", descriptor = "I")
    public static int field7941;

    @OriginalMember(owner = "client!po", name = "t", descriptor = "I")
    public static int field7942;

    @OriginalMember(owner = "client!po", name = "u", descriptor = "I")
    public static int field7943;

    @OriginalMember(owner = "client!po", name = "v", descriptor = "I")
    public static int field7944;

    @OriginalMember(owner = "client!po", name = "x", descriptor = "I")
    public static int field7946;

    @OriginalMember(owner = "client!po", name = "y", descriptor = "I")
    public static int field7947;

    @OriginalMember(owner = "client!po", name = "z", descriptor = "I")
    public static int field7948;

    @OriginalMember(owner = "client!po", name = "A", descriptor = "I")
    public static int field7949;

    @OriginalMember(owner = "client!po", name = "F", descriptor = "I")
    public static int field7954;

    @OriginalMember(owner = "client!po", name = "J", descriptor = "I")
    public static int field7958;

    @OriginalMember(owner = "client!po", name = "K", descriptor = "I")
    public static int field7959;

    @OriginalMember(owner = "client!po", name = "L", descriptor = "I")
    public static int field7960;

    @OriginalMember(owner = "client!po", name = "M", descriptor = "I")
    public static int field7961;

    @OriginalMember(owner = "client!po", name = "O", descriptor = "I")
    public static int field7962;

    @OriginalMember(owner = "client!po", name = "Q", descriptor = "I")
    public static int field7964;

    @OriginalMember(owner = "client!po", name = "S", descriptor = "[Lhh;")
    public static class140[] field7966;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIBII)V")
    public static final void method3284(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg1 <= arg3) {
            for (int var5 = arg1; var5 < arg3; var5++) {
                class228.field2951[var5][arg4] = arg0;
            }
        } else {
            for (int var6 = arg3; var6 < arg1; var6++) {
                class228.field2951[var6][arg4] = arg0;
            }
        }
        field7944++;
        int var7 = 15 % ((arg2 + 71) / 37);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(FI[FFFF)V")
    public final void method3285(float arg0, int arg1, float[] arg2, float arg3, float arg4, float arg5) {
        field7937++;
        float var8;
        float var9;
        float var10;
        if ((arg0 > 0.00390625F) || (arg0 < -0.00390625F)) {
            float var12 = -arg4 / arg0;
            var9 = this.field7929 * var12 + this.field7940;
            var10 = this.field7953 * var12 + this.field7956;
            var8 = this.field7950 * var12 + this.field7952;
        } else if ((arg5 > 0.00390625F) || (arg5 < -0.00390625F)) {
            float var11 = -arg4 / arg5;
            var8 = this.field7951 * var11 + this.field7952;
            var10 = this.field7963 * var11 + this.field7956;
            var9 = this.field7927 * var11 + this.field7940;
        } else {
            float var7 = -arg4 / arg3;
            var8 = this.field7934 * var7 + this.field7952;
            var9 = this.field7932 * var7 + this.field7940;
            var10 = this.field7955 * var7 + this.field7956;
        }
        arg2[1] = this.field7932 * arg3 + this.field7929 * arg0 + this.field7927 * arg5;
        arg2[2] = this.field7955 * arg3 + this.field7963 * arg5 + this.field7953 * arg0;
        arg2[arg1] = this.field7934 * arg3 + this.field7951 * arg5 + this.field7950 * arg0;
        arg2[3] = -(arg2[2] * var10 + arg2[0] * var8 + arg2[1] * var9);
    }

    @OriginalMember(owner = "client!po", name = "h", descriptor = "(I)[F")
    public final float[] method3286(int arg0) {
        class327.field4641[1] = this.field7929;
        class327.field4641[2] = this.field7953;
        class327.field4641[13] = this.field7940;
        if (arg0 > -54) {
            field7966 = null;
        }
        class327.field4641[10] = this.field7955;
        class327.field4641[12] = this.field7952;
        class327.field4641[4] = this.field7951;
        field7964++;
        class327.field4641[0] = this.field7950;
        class327.field4641[6] = this.field7963;
        class327.field4641[14] = this.field7956;
        class327.field4641[9] = this.field7932;
        class327.field4641[8] = this.field7934;
        class327.field4641[5] = this.field7927;
        return class327.field4641;
    }

    @OriginalMember(owner = "client!po", name = "g", descriptor = "(I)V")
    public final void method825(int arg0) {
        this.field7950 = 1.0F;
        field7930++;
        this.field7927 = this.field7955 = class311.field4399[arg0 & 0x3FFF];
        this.field7963 = class311.field4400[arg0 & 0x3FFF];
        this.field7951 = this.field7934 = this.field7952 = this.field7929 = this.field7940 = this.field7953 = this.field7956 = 0.0F;
        this.field7932 = -this.field7963;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V")
    public final void method814(int arg0, int arg1, int arg2) {
        this.field7950 = this.field7927 = this.field7955 = 1.0F;
        field7958++;
        this.field7940 = arg1;
        this.field7956 = arg2;
        this.field7929 = this.field7953 = this.field7951 = this.field7963 = this.field7934 = this.field7932 = 0.0F;
        this.field7952 = arg0;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIII)V")
    public final void method823(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7933++;
        float var7 = class311.field4399[arg3 & 0x3FFF];
        float var8 = class311.field4400[arg3 & 0x3FFF];
        float var9 = class311.field4399[arg4 & 0x3FFF];
        float var10 = class311.field4400[arg4 & 0x3FFF];
        float var11 = class311.field4399[arg5 & 0x3FFF];
        float var12 = class311.field4400[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field7953 = var7 * var10;
        this.field7963 = -var8;
        this.field7927 = var7 * var11;
        this.field7950 = var9 * var11 + var10 * var14;
        this.field7951 = var7 * var12;
        this.field7932 = var9 * var13 + var10 * var12;
        this.field7934 = -var10 * var11 + var9 * var14;
        this.field7955 = var7 * var9;
        this.field7929 = -var9 * var12 + var10 * var13;
        this.field7940 = (float) (-arg0) * this.field7929 - ((float) arg1 * this.field7927) - (float) arg2 * this.field7932;
        this.field7956 = (float) (-arg0) * this.field7953 - ((float) arg1 * this.field7963) - (float) arg2 * this.field7955;
        this.field7952 = (float) (-arg0) * this.field7950 - (float) arg1 * this.field7951 - ((float) arg2 * this.field7934);
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V")
    public final void method817(int arg0) {
        field7938++;
        float var2 = class311.field4399[arg0 & 0x3FFF];
        float var3 = class311.field4400[arg0 & 0x3FFF];
        float var4 = this.field7950;
        float var5 = this.field7951;
        float var6 = this.field7934;
        this.field7950 = this.field7953 * var3 + var2 * var4;
        float var7 = this.field7952;
        this.field7953 = this.field7953 * var2 - (var3 * var4);
        this.field7951 = this.field7963 * var3 + var2 * var5;
        this.field7963 = this.field7963 * var2 - (var3 * var5);
        this.field7934 = this.field7955 * var3 + var2 * var6;
        this.field7952 = this.field7956 * var3 + var2 * var7;
        this.field7955 = this.field7955 * var2 - var3 * var6;
        this.field7956 = this.field7956 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!po", name = "i", descriptor = "(I)V")
    public static void method3287(int arg0) {
        field7957 = null;
        field7966 = null;
        field7945 = null;
        if (arg0 >= -64) {
            field7945 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(III[I)V")
    public final void method820(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field7955 + (float) arg0 * this.field7953 + (float) arg1 * this.field7963 + this.field7956);
        field7960++;
        arg3[0] = (int) ((float) arg2 * this.field7934 + (float) arg0 * this.field7950 + (float) arg1 * this.field7951 + this.field7952);
        arg3[1] = (int) ((float) arg2 * this.field7932 + (float) arg0 * this.field7929 + (float) arg1 * this.field7927 + this.field7940);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "()Lal;")
    public final class109 method813() {
        field7954++;
        class584 var1 = new class584();
        var1.field7927 = this.field7927;
        var1.field7932 = this.field7932;
        var1.field7956 = this.field7956;
        var1.field7929 = this.field7929;
        var1.field7953 = this.field7953;
        var1.field7940 = this.field7940;
        var1.field7963 = this.field7963;
        var1.field7952 = this.field7952;
        var1.field7951 = this.field7951;
        var1.field7950 = this.field7950;
        var1.field7955 = this.field7955;
        var1.field7934 = this.field7934;
        return var1;
    }

    @OriginalMember(owner = "client!po", name = "j", descriptor = "(I)V")
    public static final void method3288(int arg0) {
        field7961++;
        try {
            if (class289.field4115 == 1) {
                int var1 = class311.field4406.method423(2097152);
                if (var1 > 0 && class311.field4406.method418(-2580)) {
                    int var2 = var1 - class709.field9701;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class311.field4406.method400((byte) -100, var2);
                    return;
                }
                class311.field4406.method408(true);
                class311.field4406.method401(-757903192);
                class774.field10652 = null;
                if (class765.field10514 == null) {
                    class289.field4115 = 0;
                } else {
                    class289.field4115 = 2;
                }
                class82.field1144 = null;
            }
            int var3 = 100 % ((-arg0 - 42) / 38);
            if (class289.field4115 == 3) {
                int var4 = class311.field4406.method423(2097152);
                if (var4 < class460.field6563 && class311.field4406.method418(-2580)) {
                    int var5 = class458.field6542 + var4;
                    if (var5 > class460.field6563) {
                        var5 = class460.field6563;
                    }
                    class311.field4406.method400((byte) -109, var5);
                } else {
                    class289.field4115 = 0;
                    class458.field6542 = 0;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class311.field4406.method408(true);
            class348.field5049 = null;
            class774.field10652 = null;
            class765.field10514 = null;
            class82.field1144 = null;
            class289.field4115 = 0;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
    public final void method810(int arg0) {
        field7946++;
        this.field7927 = 1.0F;
        this.field7950 = this.field7955 = class311.field4399[arg0 & 0x3FFF];
        this.field7934 = class311.field4400[arg0 & 0x3FFF];
        this.field7953 = -this.field7934;
        this.field7951 = this.field7952 = this.field7929 = this.field7932 = this.field7940 = this.field7963 = this.field7956 = 0.0F;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III[I)V")
    public final void method812(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field7934 + (float) arg0 * this.field7950 + (float) arg1 * this.field7951);
        arg3[2] = (int) ((float) arg2 * this.field7955 + (float) arg0 * this.field7953 + (float) arg1 * this.field7963);
        field7948++;
        arg3[1] = (int) ((float) arg2 * this.field7932 + (float) arg0 * this.field7929 + (float) arg1 * this.field7927);
    }

    @OriginalMember(owner = "client!po", name = "k", descriptor = "(I)V")
    public final void method3289(int arg0) {
        if (arg0 != 7540) {
            this.field7929 = 0.59709287F;
        }
        this.field7955 = -this.field7955;
        this.field7927 = -this.field7927;
        field7962++;
        this.field7932 = -this.field7932;
        this.field7929 = -this.field7929;
        this.field7963 = -this.field7963;
        this.field7956 = -this.field7956;
        this.field7940 = -this.field7940;
        this.field7953 = -this.field7953;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(III[I)V")
    public final void method815(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg2 - this.field7956);
        field7949++;
        int var6 = (int) ((float) arg1 - this.field7940);
        int var7 = (int) ((float) arg0 - this.field7952);
        arg3[2] = (int) ((float) var5 * this.field7955 + (float) var6 * this.field7932 + (float) var7 * this.field7934);
        arg3[1] = (int) ((float) var5 * this.field7963 + (float) var6 * this.field7927 + (float) var7 * this.field7951);
        arg3[0] = (int) ((float) var5 * this.field7953 + (float) var6 * this.field7929 + (float) var7 * this.field7950);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lal;)V")
    public final void method816(class109 arg0) {
        field7939++;
        class584 var2 = (class584) arg0;
        this.field7953 = var2.field7953;
        this.field7950 = var2.field7950;
        this.field7927 = var2.field7927;
        this.field7929 = var2.field7929;
        this.field7963 = var2.field7963;
        this.field7956 = var2.field7956;
        this.field7952 = var2.field7952;
        this.field7934 = var2.field7934;
        this.field7940 = var2.field7940;
        this.field7932 = var2.field7932;
        this.field7955 = var2.field7955;
        this.field7951 = var2.field7951;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IBFFIFI)V")
    public final void method3290(int arg0, byte arg1, float arg2, float arg3, int arg4, float arg5, int arg6) {
        if (arg0 == 0) {
            this.field7927 = arg4;
            this.field7950 = arg6;
            this.field7955 = 1.0F;
            this.field7929 = this.field7953 = this.field7951 = this.field7963 = this.field7934 = this.field7932 = 0.0F;
        } else {
            float var8 = class311.field4399[arg0 & 0x3FFF];
            float var9 = class311.field4400[arg0 & 0x3FFF];
            this.field7955 = 1.0F;
            this.field7950 = (float) arg6 * var8;
            this.field7929 = (float) arg6 * var9;
            this.field7953 = this.field7963 = this.field7934 = this.field7932 = 0.0F;
            this.field7951 = (float) arg4 * -var9;
            this.field7927 = (float) arg4 * var8;
        }
        field7935++;
        this.field7956 = arg3;
        this.field7940 = arg2;
        if (arg1 <= -2) {
            this.field7952 = arg5;
        }
    }

    @OriginalMember(owner = "client!po", name = "f", descriptor = "(I)V")
    public final void method824(int arg0) {
        field7931++;
        float var2 = class311.field4399[arg0 & 0x3FFF];
        float var3 = class311.field4400[arg0 & 0x3FFF];
        float var4 = this.field7950;
        float var5 = this.field7951;
        float var6 = this.field7934;
        float var7 = this.field7952;
        this.field7950 = var2 * var4 - this.field7929 * var3;
        this.field7929 = this.field7929 * var2 + var3 * var4;
        this.field7951 = var2 * var5 - (this.field7927 * var3);
        this.field7927 = this.field7927 * var2 + var3 * var5;
        this.field7934 = var2 * var6 - (this.field7932 * var3);
        this.field7932 = this.field7932 * var2 + var3 * var6;
        this.field7952 = var2 * var7 - (this.field7940 * var3);
        this.field7940 = this.field7940 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(III)V")
    public final void method818(int arg0, int arg1, int arg2) {
        this.field7940 += arg1;
        field7936++;
        this.field7952 += arg0;
        this.field7956 += arg2;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "([I)V")
    public final void method809(int[] arg0) {
        field7959++;
        float var2 = (float) arg0[0] - this.field7952;
        float var3 = (float) arg0[1] - this.field7940;
        float var4 = (float) arg0[2] - this.field7956;
        arg0[2] = (int) (this.field7955 * var4 + this.field7934 * var2 + this.field7932 * var3);
        arg0[0] = (int) (this.field7953 * var4 + this.field7950 * var2 + this.field7929 * var3);
        arg0[1] = (int) (this.field7963 * var4 + this.field7951 * var2 + this.field7927 * var3);
    }

    @OriginalMember(owner = "client!po", name = "l", descriptor = "(I)[F")
    public final float[] method3291(int arg0) {
        class327.field4641[0] = this.field7950;
        class327.field4641[6] = this.field7963;
        class327.field4641[13] = 0.0F;
        field7947++;
        class327.field4641[12] = 0.0F;
        class327.field4641[1] = this.field7929;
        class327.field4641[5] = this.field7927;
        class327.field4641[4] = this.field7951;
        class327.field4641[14] = 0.0F;
        class327.field4641[9] = this.field7932;
        class327.field4641[2] = this.field7953;
        class327.field4641[10] = this.field7955;
        if (arg0 >= -77) {
            return null;
        } else {
            class327.field4641[8] = this.field7934;
            return class327.field4641;
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V")
    public final void method811(int arg0) {
        field7942++;
        float var2 = class311.field4399[arg0 & 0x3FFF];
        float var3 = class311.field4400[arg0 & 0x3FFF];
        float var4 = this.field7929;
        float var5 = this.field7927;
        float var6 = this.field7932;
        float var7 = this.field7940;
        this.field7929 = var2 * var4 - (this.field7953 * var3);
        this.field7927 = var2 * var5 - (this.field7963 * var3);
        this.field7953 = this.field7953 * var2 + var3 * var4;
        this.field7963 = this.field7963 * var2 + var3 * var5;
        this.field7932 = var2 * var6 - (this.field7955 * var3);
        this.field7940 = var2 * var7 - this.field7956 * var3;
        this.field7955 = this.field7955 * var2 + var3 * var6;
        this.field7956 = this.field7956 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lal;B)V")
    public final void method3292(class109 arg0, byte arg1) {
        if (arg1 != 95) {
            return;
        }
        field7928++;
        class584 var3 = (class584) arg0;
        this.field7951 = var3.field7929;
        this.field7934 = var3.field7953;
        this.field7950 = var3.field7950;
        this.field7927 = var3.field7927;
        this.field7953 = var3.field7934;
        this.field7929 = var3.field7951;
        this.field7932 = var3.field7963;
        this.field7955 = var3.field7955;
        this.field7952 = -(this.field7934 * var3.field7956 + this.field7951 * var3.field7940 + this.field7950 * var3.field7952);
        this.field7963 = var3.field7932;
        this.field7940 = -(this.field7932 * var3.field7956 + this.field7929 * var3.field7952 + this.field7927 * var3.field7940);
        this.field7956 = -(this.field7955 * var3.field7956 + this.field7963 * var3.field7940 + this.field7953 * var3.field7952);
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V")
    public class584() {
        this.method822();
    }

    @OriginalMember(owner = "client!po", name = "e", descriptor = "(I)V")
    public final void method821(int arg0) {
        field7941++;
        this.field7955 = 1.0F;
        this.field7950 = this.field7927 = class311.field4399[arg0 & 0x3FFF];
        this.field7929 = class311.field4400[arg0 & 0x3FFF];
        this.field7951 = -this.field7929;
        this.field7934 = this.field7952 = this.field7932 = this.field7940 = this.field7953 = this.field7963 = this.field7956 = 0.0F;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "()V")
    public final void method822() {
        this.field7950 = this.field7927 = this.field7955 = 1.0F;
        field7943++;
        this.field7929 = this.field7953 = this.field7951 = this.field7963 = this.field7934 = this.field7932 = this.field7952 = this.field7940 = this.field7956 = 0.0F;
    }
}
