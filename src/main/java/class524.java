import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class524 extends class391 {

    @OriginalMember(owner = "client!im", name = "L", descriptor = "Lmaa;")
    public static class433 field7154 = new class433("", 10);

    @OriginalMember(owner = "client!im", name = "N", descriptor = "J")
    public static long field7156 = -1L;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "F")
    public float field7126;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "F")
    public float field7127;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "F")
    public float field7128;

    @OriginalMember(owner = "client!im", name = "q", descriptor = "F")
    public float field7133;

    @OriginalMember(owner = "client!im", name = "r", descriptor = "F")
    public float field7134;

    @OriginalMember(owner = "client!im", name = "v", descriptor = "F")
    public float field7138;

    @OriginalMember(owner = "client!im", name = "y", descriptor = "F")
    public float field7141;

    @OriginalMember(owner = "client!im", name = "C", descriptor = "F")
    public float field7145;

    @OriginalMember(owner = "client!im", name = "I", descriptor = "F")
    public float field7151;

    @OriginalMember(owner = "client!im", name = "J", descriptor = "F")
    public float field7152;

    @OriginalMember(owner = "client!im", name = "K", descriptor = "F")
    public float field7153;

    @OriginalMember(owner = "client!im", name = "M", descriptor = "F")
    public float field7155;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field7122;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public static int field7123;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "I")
    public static int field7124;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "I")
    public static int field7131;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!im", name = "s", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!im", name = "t", descriptor = "I")
    public static int field7136;

    @OriginalMember(owner = "client!im", name = "u", descriptor = "I")
    public static int field7137;

    @OriginalMember(owner = "client!im", name = "w", descriptor = "I")
    public static int field7139;

    @OriginalMember(owner = "client!im", name = "x", descriptor = "I")
    public static int field7140;

    @OriginalMember(owner = "client!im", name = "z", descriptor = "I")
    public static int field7142;

    @OriginalMember(owner = "client!im", name = "A", descriptor = "I")
    public static int field7143;

    @OriginalMember(owner = "client!im", name = "B", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!im", name = "D", descriptor = "I")
    public static int field7146;

    @OriginalMember(owner = "client!im", name = "E", descriptor = "I")
    public static int field7147;

    @OriginalMember(owner = "client!im", name = "F", descriptor = "I")
    public static int field7148;

    @OriginalMember(owner = "client!im", name = "G", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!im", name = "H", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!im", name = "pa", descriptor = "(IIIIII)V")
    public final void method1290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7130++;
        float var7 = class232.field3299[arg3 & 0x3FFF];
        float var8 = class232.field3301[arg3 & 0x3FFF];
        float var9 = class232.field3299[arg4 & 0x3FFF];
        float var10 = class232.field3301[arg4 & 0x3FFF];
        float var11 = class232.field3299[arg5 & 0x3FFF];
        float var12 = class232.field3301[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field7126 = var7 * var10;
        this.field7134 = var9 * var11 + var10 * var14;
        this.field7152 = -var8;
        this.field7138 = -var9 * var12 + var10 * var13;
        this.field7155 = var7 * var9;
        this.field7145 = var7 * var11;
        this.field7133 = var9 * var13 + var10 * var12;
        this.field7127 = var7 * var12;
        this.field7151 = -var10 * var11 + var9 * var14;
        this.field7153 = (float) (-arg0) * this.field7138 - ((float) arg1 * this.field7145) - ((float) arg2 * this.field7133);
        this.field7128 = (float) (-arg0) * this.field7134 - ((float) arg1 * this.field7127) - ((float) arg2 * this.field7151);
        this.field7141 = (float) (-arg0) * this.field7126 - (float) arg1 * this.field7152 - ((float) arg2 * this.field7155);
    }

    @OriginalMember(owner = "client!im", name = "S", descriptor = "(I)V")
    public final void method1286(int arg0) {
        field7150++;
        float var2 = class232.field3299[arg0 & 0x3FFF];
        float var3 = class232.field3301[arg0 & 0x3FFF];
        float var4 = this.field7138;
        float var5 = this.field7145;
        float var6 = this.field7133;
        this.field7138 = var2 * var4 - (this.field7126 * var3);
        float var7 = this.field7153;
        this.field7126 = this.field7126 * var2 + var3 * var4;
        this.field7145 = var2 * var5 - this.field7152 * var3;
        this.field7152 = this.field7152 * var2 + var3 * var5;
        this.field7133 = var2 * var6 - this.field7155 * var3;
        this.field7153 = var2 * var7 - this.field7141 * var3;
        this.field7155 = this.field7155 * var2 + var3 * var6;
        this.field7141 = this.field7141 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
    public static void method2902(byte arg0) {
        field7154 = null;
        if (arg0 <= 121) {
            method2906(-44, 44, (byte) 55);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIZIIIIII)Z")
    public static final boolean method2903(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field7132++;
        int var9 = class253.field3576.field6483[arg5];
        int var10 = class253.field3576.field6477[0];
        if (var9 < 0 || class86.field1185 <= var9 || var10 < 0 || class526.field7212 <= var10) {
            return false;
        } else if (arg4 >= 0 && class86.field1185 > arg4 && arg8 >= 0 && class526.field7212 > arg8) {
            int var11 = class371.method2170(arg3, arg8, class480.field6696[class253.field3576.field520], arg2, class315.field4687, false, arg4, arg1, var10, arg0, class66.field871, var9, arg6, class253.field3576.method1722((byte) -123), arg7);
            if (var11 < 1) {
                return false;
            }
            class247.field3508 = class66.field871[var11 - 1];
            class178.field2636 = class315.field4687[var11 - 1];
            class414.field5857 = false;
            class589.method3273(arg5 + 31050);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(FIIIFFI)V")
    public final void method2904(float arg0, int arg1, int arg2, int arg3, float arg4, float arg5, int arg6) {
        if (arg1 == 0) {
            this.field7138 = this.field7126 = this.field7127 = this.field7152 = this.field7151 = this.field7133 = 0.0F;
            this.field7134 = arg6;
            this.field7155 = 1.0F;
            this.field7145 = arg2;
        } else {
            float var8 = class232.field3299[arg1 & 0x3FFF];
            float var9 = class232.field3301[arg1 & 0x3FFF];
            this.field7127 = (float) arg2 * -var9;
            this.field7138 = (float) arg6 * var9;
            this.field7126 = this.field7152 = this.field7151 = this.field7133 = 0.0F;
            this.field7134 = (float) arg6 * var8;
            this.field7145 = (float) arg2 * var8;
            this.field7155 = 1.0F;
        }
        field7129++;
        this.field7128 = arg4;
        if (arg3 != 1) {
            this.field7128 = 0.9155407F;
        }
        this.field7141 = arg5;
        this.field7153 = arg0;
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(I)V")
    public static final void method2905(int arg0) {
        if (class433.field6132 != null) {
            class297[] var1 = class433.field6132;
            for (int var2 = 0; var2 < var1.length; var2++) {
                class297 var3 = var1[var2];
                var3.method1857(-126);
            }
        }
        field7144++;
        if (arg0 != -13994) {
            method2902((byte) 26);
        }
    }

    @OriginalMember(owner = "client!im", name = "la", descriptor = "(Lq;)V")
    public final void method1298(class391 arg0) {
        field7147++;
        class524 var2 = (class524) arg0;
        this.field7141 = var2.field7141;
        this.field7145 = var2.field7145;
        this.field7128 = var2.field7128;
        this.field7155 = var2.field7155;
        this.field7151 = var2.field7151;
        this.field7127 = var2.field7127;
        this.field7134 = var2.field7134;
        this.field7133 = var2.field7133;
        this.field7138 = var2.field7138;
        this.field7152 = var2.field7152;
        this.field7126 = var2.field7126;
        this.field7153 = var2.field7153;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIB)V")
    public static final void method2906(int arg0, int arg1, byte arg2) {
        field7142++;
        if (arg2 > 70) {
            class679 var3 = class669.method3708(13, arg0, 1403048928);
            var3.method3748(true);
            var3.field9574 = arg1;
        }
    }

    @OriginalMember(owner = "client!im", name = "GA", descriptor = "(III)V")
    public final void method1288(int arg0, int arg1, int arg2) {
        field7139++;
        this.field7138 = this.field7126 = this.field7127 = this.field7152 = this.field7151 = this.field7133 = 0.0F;
        this.field7153 = arg1;
        this.field7134 = this.field7145 = this.field7155 = 1.0F;
        this.field7128 = arg0;
        this.field7141 = arg2;
    }

    @OriginalMember(owner = "client!im", name = "ra", descriptor = "(I)V")
    public final void method1292(int arg0) {
        field7140++;
        this.field7155 = 1.0F;
        this.field7134 = this.field7145 = class232.field3299[arg0 & 0x3FFF];
        this.field7138 = class232.field3301[arg0 & 0x3FFF];
        this.field7151 = this.field7128 = this.field7133 = this.field7153 = this.field7126 = this.field7152 = this.field7141 = 0.0F;
        this.field7127 = -this.field7138;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(III[I)V")
    public final void method1291(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field7133 + (float) arg0 * this.field7138 + (float) arg1 * this.field7145 + this.field7153);
        field7136++;
        arg3[0] = (int) ((float) arg2 * this.field7151 + (float) arg0 * this.field7134 + (float) arg1 * this.field7127 + this.field7128);
        arg3[2] = (int) ((float) arg2 * this.field7155 + (float) arg0 * this.field7126 + (float) arg1 * this.field7152 + this.field7141);
    }

    @OriginalMember(owner = "client!im", name = "O", descriptor = "([I)V")
    public final void method1289(int[] arg0) {
        field7143++;
        float var2 = (float) arg0[0] - this.field7128;
        float var3 = (float) arg0[1] - this.field7153;
        float var4 = (float) arg0[2] - this.field7141;
        arg0[0] = (int) (this.field7126 * var4 + this.field7138 * var3 + this.field7134 * var2);
        arg0[1] = (int) (this.field7152 * var4 + this.field7145 * var3 + this.field7127 * var2);
        arg0[2] = (int) (this.field7155 * var4 + this.field7151 * var2 + this.field7133 * var3);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BLq;)V")
    public final void method2907(byte arg0, class391 arg1) {
        field7122++;
        class524 var3 = (class524) arg1;
        this.field7151 = var3.field7126;
        if (arg0 <= 88) {
            this.field7155 = 0.6165987F;
        }
        this.field7127 = var3.field7138;
        this.field7134 = var3.field7134;
        this.field7138 = var3.field7127;
        this.field7145 = var3.field7145;
        this.field7126 = var3.field7151;
        this.field7133 = var3.field7152;
        this.field7155 = var3.field7155;
        this.field7128 = -(this.field7151 * var3.field7141 + this.field7134 * var3.field7128 + this.field7127 * var3.field7153);
        this.field7152 = var3.field7133;
        this.field7153 = -(this.field7133 * var3.field7141 + this.field7145 * var3.field7153 + this.field7138 * var3.field7128);
        this.field7141 = -(this.field7155 * var3.field7141 + this.field7152 * var3.field7153 + this.field7126 * var3.field7128);
    }

    @OriginalMember(owner = "client!im", name = "P", descriptor = "(I)V")
    public final void method1297(int arg0) {
        field7137++;
        float var2 = class232.field3299[arg0 & 0x3FFF];
        float var3 = class232.field3301[arg0 & 0x3FFF];
        float var4 = this.field7134;
        float var5 = this.field7127;
        float var6 = this.field7151;
        float var7 = this.field7128;
        this.field7134 = this.field7126 * var3 + var2 * var4;
        this.field7126 = this.field7126 * var2 - (var3 * var4);
        this.field7127 = this.field7152 * var3 + var2 * var5;
        this.field7151 = this.field7155 * var3 + var2 * var6;
        this.field7152 = this.field7152 * var2 - var3 * var5;
        this.field7128 = this.field7141 * var3 + var2 * var7;
        this.field7155 = this.field7155 * var2 - (var3 * var6);
        this.field7141 = this.field7141 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!im", name = "XA", descriptor = "(I)V")
    public final void method1293(int arg0) {
        this.field7134 = 1.0F;
        field7124++;
        this.field7145 = this.field7155 = class232.field3299[arg0 & 0x3FFF];
        this.field7152 = class232.field3301[arg0 & 0x3FFF];
        this.field7127 = this.field7151 = this.field7128 = this.field7138 = this.field7153 = this.field7126 = this.field7141 = 0.0F;
        this.field7133 = -this.field7152;
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(I)[F")
    public final float[] method2908(int arg0) {
        class266.field3781[12] = this.field7128;
        class266.field3781[8] = this.field7151;
        class266.field3781[5] = this.field7145;
        class266.field3781[0] = this.field7134;
        class266.field3781[arg0] = this.field7133;
        class266.field3781[1] = this.field7138;
        class266.field3781[4] = this.field7127;
        class266.field3781[2] = this.field7126;
        field7146++;
        class266.field3781[10] = this.field7155;
        class266.field3781[13] = this.field7153;
        class266.field3781[6] = this.field7152;
        class266.field3781[14] = this.field7141;
        return class266.field3781;
    }

    @OriginalMember(owner = "client!im", name = "G", descriptor = "(III)V")
    public final void method1285(int arg0, int arg1, int arg2) {
        field7135++;
        this.field7153 += arg1;
        this.field7128 += arg0;
        this.field7141 += arg2;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)[F")
    public final float[] method2909(byte arg0) {
        class266.field3781[10] = this.field7155;
        field7131++;
        class266.field3781[5] = this.field7145;
        class266.field3781[0] = this.field7134;
        class266.field3781[13] = 0.0F;
        if (arg0 != 42) {
            this.method2904(0.46469113F, 34, -88, 44, 0.21802312F, 1.1352798F, 48);
        }
        class266.field3781[4] = this.field7127;
        class266.field3781[8] = this.field7151;
        class266.field3781[2] = this.field7126;
        class266.field3781[9] = this.field7133;
        class266.field3781[14] = 0.0F;
        class266.field3781[6] = this.field7152;
        class266.field3781[12] = 0.0F;
        class266.field3781[1] = this.field7138;
        return class266.field3781;
    }

    @OriginalMember(owner = "client!im", name = "R", descriptor = "(III[I)V")
    public final void method1287(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field7155 + (float) arg0 * this.field7126 + (float) arg1 * this.field7152);
        field7149++;
        arg3[1] = (int) ((float) arg2 * this.field7133 + (float) arg0 * this.field7138 + (float) arg1 * this.field7145);
        arg3[0] = (int) ((float) arg2 * this.field7151 + (float) arg0 * this.field7134 + (float) arg1 * this.field7127);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "()Lq;")
    public final class391 method1295() {
        field7125++;
        class524 var1 = new class524();
        var1.field7127 = this.field7127;
        var1.field7153 = this.field7153;
        var1.field7152 = this.field7152;
        var1.field7155 = this.field7155;
        var1.field7133 = this.field7133;
        var1.field7126 = this.field7126;
        var1.field7138 = this.field7138;
        var1.field7128 = this.field7128;
        var1.field7151 = this.field7151;
        var1.field7141 = this.field7141;
        var1.field7134 = this.field7134;
        var1.field7145 = this.field7145;
        return var1;
    }

    @OriginalMember(owner = "client!im", name = "Y", descriptor = "()V")
    public final void method1296() {
        field7148++;
        this.field7138 = this.field7126 = this.field7127 = this.field7152 = this.field7151 = this.field7133 = this.field7128 = this.field7153 = this.field7141 = 0.0F;
        this.field7134 = this.field7145 = this.field7155 = 1.0F;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
    public final void method1294(int arg0) {
        this.field7145 = 1.0F;
        field7123++;
        this.field7134 = this.field7155 = class232.field3299[arg0 & 0x3FFF];
        this.field7151 = class232.field3301[arg0 & 0x3FFF];
        this.field7127 = this.field7128 = this.field7138 = this.field7133 = this.field7153 = this.field7152 = this.field7141 = 0.0F;
        this.field7126 = -this.field7151;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V")
    public class524() {
        this.method1296();
    }
}
