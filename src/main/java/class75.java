import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class75 extends class465 {

    @OriginalMember(owner = "client!no", name = "w", descriptor = "Lrn;")
    public static class633 field1049 = new class633(54, -1);

    @OriginalMember(owner = "client!no", name = "e", descriptor = "F")
    public float field1031;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "F")
    public float field1033;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "F")
    public float field1035;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "F")
    public float field1037;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "F")
    public float field1043;

    @OriginalMember(owner = "client!no", name = "t", descriptor = "F")
    public float field1046;

    @OriginalMember(owner = "client!no", name = "u", descriptor = "F")
    public float field1047;

    @OriginalMember(owner = "client!no", name = "y", descriptor = "F")
    public float field1051;

    @OriginalMember(owner = "client!no", name = "C", descriptor = "F")
    public float field1055;

    @OriginalMember(owner = "client!no", name = "I", descriptor = "F")
    public float field1060;

    @OriginalMember(owner = "client!no", name = "K", descriptor = "F")
    public float field1062;

    @OriginalMember(owner = "client!no", name = "M", descriptor = "F")
    public float field1063;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!no", name = "n", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!no", name = "o", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!no", name = "r", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!no", name = "s", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!no", name = "v", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!no", name = "x", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!no", name = "z", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!no", name = "A", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!no", name = "B", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!no", name = "E", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!no", name = "F", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!no", name = "G", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!no", name = "H", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!no", name = "J", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!no", name = "N", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!no", name = "O", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!no", name = "P", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!no", name = "Q", descriptor = "[Lbha;")
    public static class318[] field1067;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(III[I)V")
    public final void method446(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field1037 + (float) arg0 * this.field1046 + (float) arg1 * this.field1062 + this.field1033);
        arg3[2] = (int) ((float) arg2 * this.field1031 + (float) arg0 * this.field1060 + (float) arg1 * this.field1063 + this.field1035);
        arg3[0] = (int) ((float) arg2 * this.field1055 + (float) arg0 * this.field1043 + (float) arg1 * this.field1047 + this.field1051);
        field1057++;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "([I)V")
    public final void method447(int[] arg0) {
        field1053++;
        float var2 = (float) arg0[0] - this.field1051;
        float var3 = (float) arg0[1] - this.field1033;
        float var4 = (float) arg0[2] - this.field1035;
        arg0[0] = (int) (this.field1060 * var4 + this.field1046 * var3 + this.field1043 * var2);
        arg0[1] = (int) (this.field1063 * var4 + this.field1062 * var3 + this.field1047 * var2);
        arg0[2] = (int) (this.field1031 * var4 + this.field1055 * var2 + this.field1037 * var3);
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(I)V")
    public final void method448(int arg0) {
        field1058++;
        float var2 = class465.field6031[arg0 & 0x3FFF];
        float var3 = class465.field6033[arg0 & 0x3FFF];
        float var4 = this.field1043;
        float var5 = this.field1047;
        float var6 = this.field1055;
        this.field1043 = this.field1060 * var3 + var2 * var4;
        float var7 = this.field1051;
        this.field1060 = this.field1060 * var2 - var3 * var4;
        this.field1047 = this.field1063 * var3 + var2 * var5;
        this.field1063 = this.field1063 * var2 - (var3 * var5);
        this.field1055 = this.field1031 * var3 + var2 * var6;
        this.field1031 = this.field1031 * var2 - (var3 * var6);
        this.field1051 = this.field1035 * var3 + var2 * var7;
        this.field1035 = this.field1035 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(III)V")
    public final void method449(int arg0, int arg1, int arg2) {
        this.field1046 = this.field1060 = this.field1047 = this.field1063 = this.field1055 = this.field1037 = 0.0F;
        this.field1043 = this.field1062 = this.field1031 = 1.0F;
        this.field1051 = arg0;
        field1032++;
        this.field1035 = arg2;
        this.field1033 = arg1;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(III)V")
    public final void method450(int arg0, int arg1, int arg2) {
        this.field1033 += arg1;
        this.field1035 += arg2;
        field1066++;
        this.field1051 += arg0;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILoha;)V")
    public final void method451(int arg0, class465 arg1) {
        field1059++;
        class75 var3 = (class75) arg1;
        this.field1043 = var3.field1043;
        if (arg0 != 10) {
            this.field1035 = -2.7423894F;
        }
        this.field1047 = var3.field1046;
        this.field1055 = var3.field1060;
        this.field1046 = var3.field1047;
        this.field1037 = var3.field1063;
        this.field1060 = var3.field1055;
        this.field1062 = var3.field1062;
        this.field1051 = -(this.field1055 * var3.field1035 + this.field1047 * var3.field1033 + this.field1043 * var3.field1051);
        this.field1063 = var3.field1037;
        this.field1031 = var3.field1031;
        this.field1033 = -(this.field1037 * var3.field1035 + this.field1062 * var3.field1033 + this.field1046 * var3.field1051);
        this.field1035 = -(this.field1031 * var3.field1035 + this.field1063 * var3.field1033 + this.field1060 * var3.field1051);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIFFIFI)V")
    public final void method452(int arg0, int arg1, float arg2, float arg3, int arg4, float arg5, int arg6) {
        field1054++;
        if (arg6 == 0) {
            this.field1062 = arg4;
            this.field1031 = 1.0F;
            this.field1043 = arg0;
            this.field1046 = this.field1060 = this.field1047 = this.field1063 = this.field1055 = this.field1037 = 0.0F;
        } else {
            float var8 = class465.field6031[arg6 & 0x3FFF];
            float var9 = class465.field6033[arg6 & 0x3FFF];
            this.field1046 = (float) arg0 * var9;
            this.field1060 = this.field1063 = this.field1055 = this.field1037 = 0.0F;
            this.field1062 = (float) arg4 * var8;
            this.field1043 = (float) arg0 * var8;
            this.field1047 = (float) arg4 * -var9;
            this.field1031 = 1.0F;
        }
        this.field1035 = arg3;
        this.field1033 = arg5;
        if (arg1 == -11255) {
            this.field1051 = arg2;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)[F")
    public final float[] method453(byte arg0) {
        class520.field6620[12] = 0.0F;
        class520.field6620[9] = this.field1037;
        class520.field6620[1] = this.field1046;
        class520.field6620[13] = 0.0F;
        class520.field6620[10] = this.field1031;
        class520.field6620[5] = this.field1062;
        class520.field6620[2] = this.field1060;
        field1040++;
        if (arg0 <= 85) {
            method459((byte) 9);
        }
        class520.field6620[8] = this.field1055;
        class520.field6620[0] = this.field1043;
        class520.field6620[14] = 0.0F;
        class520.field6620[4] = this.field1047;
        class520.field6620[6] = this.field1063;
        return class520.field6620;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
    public final void method454(int arg0) {
        field1048++;
        this.field1062 = 1.0F;
        this.field1043 = this.field1031 = class465.field6031[arg0 & 0x3FFF];
        this.field1055 = class465.field6033[arg0 & 0x3FFF];
        this.field1047 = this.field1051 = this.field1046 = this.field1037 = this.field1033 = this.field1063 = this.field1035 = 0.0F;
        this.field1060 = -this.field1055;
    }

    @OriginalMember(owner = "client!no", name = "h", descriptor = "(I)[F")
    public final float[] method455(int arg0) {
        class520.field6620[1] = this.field1046;
        class520.field6620[5] = this.field1062;
        class520.field6620[12] = this.field1051;
        class520.field6620[10] = this.field1031;
        class520.field6620[4] = this.field1047;
        class520.field6620[8] = this.field1055;
        class520.field6620[14] = this.field1035;
        if (arg0 < 15) {
            field1061 = 7;
        }
        class520.field6620[6] = this.field1063;
        class520.field6620[2] = this.field1060;
        class520.field6620[0] = this.field1043;
        field1039++;
        class520.field6620[9] = this.field1037;
        class520.field6620[13] = this.field1033;
        return class520.field6620;
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
    public final void method456(int arg0) {
        field1052++;
        float var2 = class465.field6031[arg0 & 0x3FFF];
        float var3 = class465.field6033[arg0 & 0x3FFF];
        float var4 = this.field1043;
        float var5 = this.field1047;
        float var6 = this.field1055;
        float var7 = this.field1051;
        this.field1043 = var2 * var4 - this.field1046 * var3;
        this.field1046 = this.field1046 * var2 + var3 * var4;
        this.field1047 = var2 * var5 - this.field1062 * var3;
        this.field1062 = this.field1062 * var2 + var3 * var5;
        this.field1055 = var2 * var6 - (this.field1037 * var3);
        this.field1051 = var2 * var7 - this.field1033 * var3;
        this.field1037 = this.field1037 * var2 + var3 * var6;
        this.field1033 = this.field1033 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(III[I)V")
    public final void method457(int arg0, int arg1, int arg2, int[] arg3) {
        field1050++;
        int var5 = (int) ((float) arg2 - this.field1035);
        int var6 = (int) ((float) arg1 - this.field1033);
        int var7 = (int) ((float) arg0 - this.field1051);
        arg3[1] = (int) ((float) var5 * this.field1063 + (float) var6 * this.field1062 + (float) var7 * this.field1047);
        arg3[0] = (int) ((float) var5 * this.field1060 + (float) var6 * this.field1046 + (float) var7 * this.field1043);
        arg3[2] = (int) ((float) var5 * this.field1031 + (float) var6 * this.field1037 + (float) var7 * this.field1055);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "()Loha;")
    public final class465 method458() {
        field1034++;
        class75 var1 = new class75();
        var1.field1031 = this.field1031;
        var1.field1043 = this.field1043;
        var1.field1037 = this.field1037;
        var1.field1046 = this.field1046;
        var1.field1047 = this.field1047;
        var1.field1060 = this.field1060;
        var1.field1033 = this.field1033;
        var1.field1062 = this.field1062;
        var1.field1035 = this.field1035;
        var1.field1055 = this.field1055;
        var1.field1051 = this.field1051;
        var1.field1063 = this.field1063;
        return var1;
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(B)V")
    public static void method459(byte arg0) {
        field1067 = null;
        if (arg0 != 67) {
            method459((byte) -1);
        }
        field1049 = null;
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(III[I)V")
    public final void method460(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field1055 + (float) arg0 * this.field1043 + (float) arg1 * this.field1047);
        arg3[2] = (int) ((float) arg2 * this.field1031 + (float) arg0 * this.field1060 + (float) arg1 * this.field1063);
        field1041++;
        arg3[1] = (int) ((float) arg2 * this.field1037 + (float) arg0 * this.field1046 + (float) arg1 * this.field1062);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(FIF[FFF)V")
    public final void method461(float arg0, int arg1, float arg2, float[] arg3, float arg4, float arg5) {
        field1065++;
        arg3[2] = this.field1031 * arg5 + this.field1063 * arg0 + this.field1060 * arg2;
        float var8;
        float var9;
        float var10;
        if ((arg2 > 0.00390625F) || (arg2 < -0.00390625F)) {
            float var12 = -arg4 / arg2;
            var8 = this.field1043 * var12 + this.field1051;
            var10 = this.field1060 * var12 + this.field1035;
            var9 = this.field1046 * var12 + this.field1033;
        } else if ((arg0 > 0.00390625F) || (arg0 < -0.00390625F)) {
            float var11 = -arg4 / arg0;
            var10 = this.field1063 * var11 + this.field1035;
            var8 = this.field1047 * var11 + this.field1051;
            var9 = this.field1062 * var11 + this.field1033;
        } else {
            float var7 = -arg4 / arg5;
            var8 = this.field1055 * var7 + this.field1051;
            var9 = this.field1037 * var7 + this.field1033;
            var10 = this.field1031 * var7 + this.field1035;
        }
        arg3[0] = this.field1055 * arg5 + this.field1047 * arg0 + this.field1043 * arg2;
        arg3[arg1] = this.field1037 * arg5 + this.field1062 * arg0 + this.field1046 * arg2;
        arg3[3] = -(arg3[2] * var10 + arg3[0] * var8 + arg3[1] * var9);
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "()V")
    public final void method462() {
        field1038++;
        this.field1043 = this.field1062 = this.field1031 = 1.0F;
        this.field1046 = this.field1060 = this.field1047 = this.field1063 = this.field1055 = this.field1037 = this.field1051 = this.field1033 = this.field1035 = 0.0F;
    }

    @OriginalMember(owner = "client!no", name = "e", descriptor = "(I)V")
    public final void method463(int arg0) {
        this.field1043 = 1.0F;
        field1042++;
        this.field1062 = this.field1031 = class465.field6031[arg0 & 0x3FFF];
        this.field1063 = class465.field6033[arg0 & 0x3FFF];
        this.field1047 = this.field1055 = this.field1051 = this.field1046 = this.field1033 = this.field1060 = this.field1035 = 0.0F;
        this.field1037 = -this.field1063;
    }

    @OriginalMember(owner = "client!no", name = "i", descriptor = "(I)V")
    public final void method464(int arg0) {
        this.field1062 = -this.field1062;
        this.field1060 = -this.field1060;
        this.field1033 = -this.field1033;
        field1044++;
        this.field1031 = -this.field1031;
        this.field1063 = -this.field1063;
        this.field1035 = -this.field1035;
        if (arg0 != 2) {
            method459((byte) 70);
        }
        this.field1046 = -this.field1046;
        this.field1037 = -this.field1037;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIII)V")
    public final void method465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1056++;
        float var7 = class465.field6031[arg3 & 0x3FFF];
        float var8 = class465.field6033[arg3 & 0x3FFF];
        float var9 = class465.field6031[arg4 & 0x3FFF];
        float var10 = class465.field6033[arg4 & 0x3FFF];
        float var11 = class465.field6031[arg5 & 0x3FFF];
        float var12 = class465.field6033[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field1037 = var9 * var13 + var10 * var12;
        this.field1062 = var7 * var11;
        this.field1047 = var7 * var12;
        this.field1043 = var9 * var11 + var10 * var14;
        this.field1060 = var7 * var10;
        this.field1055 = -var10 * var11 + var9 * var14;
        this.field1031 = var7 * var9;
        this.field1063 = -var8;
        this.field1046 = -var9 * var12 + var10 * var13;
        this.field1051 = (float) (-arg0) * this.field1043 - ((float) arg1 * this.field1047) - (float) arg2 * this.field1055;
        this.field1033 = (float) (-arg0) * this.field1046 - (float) arg1 * this.field1062 - (float) arg2 * this.field1037;
        this.field1035 = (float) (-arg0) * this.field1060 - (float) arg1 * this.field1063 - ((float) arg2 * this.field1031);
    }

    @OriginalMember(owner = "client!no", name = "g", descriptor = "(I)V")
    public final void method466(int arg0) {
        this.field1031 = 1.0F;
        field1045++;
        this.field1043 = this.field1062 = class465.field6031[arg0 & 0x3FFF];
        this.field1046 = class465.field6033[arg0 & 0x3FFF];
        this.field1047 = -this.field1046;
        this.field1055 = this.field1051 = this.field1037 = this.field1033 = this.field1060 = this.field1063 = this.field1035 = 0.0F;
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(I)V")
    public final void method467(int arg0) {
        field1036++;
        float var2 = class465.field6031[arg0 & 0x3FFF];
        float var3 = class465.field6033[arg0 & 0x3FFF];
        float var4 = this.field1046;
        float var5 = this.field1062;
        float var6 = this.field1037;
        this.field1046 = var2 * var4 - (this.field1060 * var3);
        float var7 = this.field1033;
        this.field1060 = this.field1060 * var2 + var3 * var4;
        this.field1062 = var2 * var5 - (this.field1063 * var3);
        this.field1063 = this.field1063 * var2 + var3 * var5;
        this.field1037 = var2 * var6 - this.field1031 * var3;
        this.field1033 = var2 * var7 - this.field1035 * var3;
        this.field1031 = this.field1031 * var2 + var3 * var6;
        this.field1035 = this.field1035 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Loha;)V")
    public final void method468(class465 arg0) {
        field1064++;
        class75 var2 = (class75) arg0;
        this.field1033 = var2.field1033;
        this.field1046 = var2.field1046;
        this.field1031 = var2.field1031;
        this.field1047 = var2.field1047;
        this.field1043 = var2.field1043;
        this.field1063 = var2.field1063;
        this.field1055 = var2.field1055;
        this.field1060 = var2.field1060;
        this.field1062 = var2.field1062;
        this.field1037 = var2.field1037;
        this.field1051 = var2.field1051;
        this.field1035 = var2.field1035;
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V")
    public class75() {
        this.method462();
    }
}
