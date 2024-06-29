import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class228 extends class394 {

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "Lmq;")
    public static class472 field2961 = new class472(32);

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    public static int field2973 = 999999;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "Ljava/lang/Object;")
    public static volatile Object field2974 = null;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "F")
    public float field2942;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "F")
    public float field2943;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "F")
    public float field2949;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "F")
    public float field2951;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "F")
    public float field2952;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "F")
    public float field2953;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "F")
    public float field2954;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "F")
    public float field2957;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "F")
    public float field2960;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "F")
    public float field2962;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "F")
    public float field2965;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "F")
    public float field2969;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "Ljava/awt/Image;")
    public static Image field2955;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "(Lq;)V", line = 4)
    public final void method711(class394 arg0) {
        field2966++;
        class228 var2 = (class228) arg0;
        this.field2969 = var2.field2969;
        this.field2952 = var2.field2952;
        this.field2951 = var2.field2951;
        this.field2953 = var2.field2953;
        this.field2965 = var2.field2965;
        this.field2943 = var2.field2943;
        this.field2954 = var2.field2954;
        this.field2949 = var2.field2949;
        this.field2962 = var2.field2962;
        this.field2960 = var2.field2960;
        this.field2942 = var2.field2942;
        this.field2957 = var2.field2957;
    }

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "(I)V", line = 26)
    public final void method722(int arg0) {
        this.field2969 = 1.0F;
        field2956++;
        this.field2953 = this.field2962 = class632.field9087[arg0 & 0x3FFF];
        this.field2957 = class632.field9089[arg0 & 0x3FFF];
        this.field2943 = -this.field2957;
        this.field2965 = this.field2951 = this.field2942 = this.field2954 = this.field2960 = this.field2949 = this.field2952 = 0.0F;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILn;II)V", line = 38)
    public static final void method1383(int arg0, class17 arg1, int arg2, int arg3) {
        field2948++;
        if (class386.field5135 != null || class361.field4805 || arg1 == null || class696.method3910(arg1, true) == null) {
            return;
        }
        class386.field5135 = arg1;
        class441.field6296 = class696.method3910(arg1, true);
        class385.field5121 = arg0;
        class594.field8581 = 0;
        class109.field1421 = arg3;
        if (arg2 == 23266) {
            class214.field2705 = false;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()Lq;", line = 63)
    public final class394 method708() {
        field2941++;
        class228 var1 = new class228();
        var1.field2951 = this.field2951;
        var1.field2949 = this.field2949;
        var1.field2954 = this.field2954;
        var1.field2969 = this.field2969;
        var1.field2960 = this.field2960;
        var1.field2942 = this.field2942;
        var1.field2965 = this.field2965;
        var1.field2943 = this.field2943;
        var1.field2962 = this.field2962;
        var1.field2952 = this.field2952;
        var1.field2953 = this.field2953;
        var1.field2957 = this.field2957;
        return var1;
    }

    @OriginalMember(owner = "client!ae", name = "wa", descriptor = "(III[I)V", line = 85)
    public final void method717(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field2965 + (float) arg0 * this.field2953 + (float) arg1 * this.field2943);
        arg3[1] = (int) ((float) arg2 * this.field2942 + (float) arg0 * this.field2957 + (float) arg1 * this.field2962);
        arg3[2] = (int) ((float) arg2 * this.field2969 + (float) arg0 * this.field2960 + (float) arg1 * this.field2949);
        field2950++;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V", line = 101)
    public static void method1384(int arg0) {
        field2955 = null;
        field2961 = null;
        field2974 = null;
        if (arg0 <= 91) {
            field2973 = -7;
        }
    }

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "(I)V", line = 126)
    public final void method713(int arg0) {
        field2940++;
        float var2 = class632.field9087[arg0 & 0x3FFF];
        float var3 = class632.field9089[arg0 & 0x3FFF];
        float var4 = this.field2957;
        float var5 = this.field2962;
        float var6 = this.field2942;
        float var7 = this.field2954;
        this.field2957 = var2 * var4 - (this.field2960 * var3);
        this.field2962 = var2 * var5 - (this.field2949 * var3);
        this.field2960 = this.field2960 * var2 + var3 * var4;
        this.field2949 = this.field2949 * var2 + var3 * var5;
        this.field2942 = var2 * var6 - this.field2969 * var3;
        this.field2969 = this.field2969 * var2 + var3 * var6;
        this.field2954 = var2 * var7 - (this.field2952 * var3);
        this.field2952 = this.field2952 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ae", name = "DA", descriptor = "(III[I)V", line = 153)
    public final void method725(int arg0, int arg1, int arg2, int[] arg3) {
        field2947++;
        int var5 = (int) ((float) arg2 - this.field2952);
        int var6 = (int) ((float) arg0 - this.field2951);
        int var7 = (int) ((float) arg1 - this.field2954);
        arg3[1] = (int) ((float) var5 * this.field2949 + (float) var6 * this.field2943 + (float) var7 * this.field2962);
        arg3[2] = (int) ((float) var5 * this.field2969 + (float) var6 * this.field2965 + (float) var7 * this.field2942);
        arg3[0] = (int) ((float) var5 * this.field2960 + (float) var6 * this.field2953 + (float) var7 * this.field2957);
    }

    @OriginalMember(owner = "client!ae", name = "YA", descriptor = "([I)V", line = 166)
    public final void method709(int[] arg0) {
        field2964++;
        float var2 = (float) arg0[0] - this.field2951;
        float var3 = (float) arg0[1] - this.field2954;
        float var4 = (float) arg0[2] - this.field2952;
        arg0[1] = (int) (this.field2949 * var4 + this.field2962 * var3 + this.field2943 * var2);
        arg0[0] = (int) (this.field2960 * var4 + this.field2957 * var3 + this.field2953 * var2);
        arg0[2] = (int) (this.field2969 * var4 + this.field2965 * var2 + this.field2942 * var3);
    }

    @OriginalMember(owner = "client!ae", name = "na", descriptor = "(IIIIII)V", line = 184)
    public final void method715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2944++;
        float var7 = class632.field9087[arg3 & 0x3FFF];
        float var8 = class632.field9089[arg3 & 0x3FFF];
        float var9 = class632.field9087[arg4 & 0x3FFF];
        float var10 = class632.field9089[arg4 & 0x3FFF];
        float var11 = class632.field9087[arg5 & 0x3FFF];
        float var12 = class632.field9089[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field2969 = var7 * var9;
        this.field2953 = var9 * var11 + var10 * var14;
        this.field2960 = var7 * var10;
        this.field2949 = -var8;
        this.field2957 = -var9 * var12 + var10 * var13;
        this.field2943 = var7 * var12;
        this.field2942 = var9 * var13 + var10 * var12;
        this.field2962 = var7 * var11;
        this.field2965 = -var10 * var11 + var9 * var14;
        this.field2951 = (float) (-arg0) * this.field2953 - ((float) arg1 * this.field2943) - (float) arg2 * this.field2965;
        this.field2954 = (float) (-arg0) * this.field2957 - ((float) arg1 * this.field2962) - ((float) arg2 * this.field2942);
        this.field2952 = (float) (-arg0) * this.field2960 - ((float) arg1 * this.field2949) - ((float) arg2 * this.field2969);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III[I)V", line = 220)
    public final void method720(int arg0, int arg1, int arg2, int[] arg3) {
        field2970++;
        arg3[1] = (int) ((float) arg2 * this.field2942 + (float) arg0 * this.field2957 + (float) arg1 * this.field2962 + this.field2954);
        arg3[2] = (int) ((float) arg2 * this.field2969 + (float) arg0 * this.field2960 + (float) arg1 * this.field2949 + this.field2952);
        arg3[0] = (int) ((float) arg2 * this.field2965 + (float) arg0 * this.field2953 + (float) arg1 * this.field2943 + this.field2951);
    }

    @OriginalMember(owner = "client!ae", name = "AA", descriptor = "(I)V", line = 236)
    public final void method718(int arg0) {
        field2963++;
        float var2 = class632.field9087[arg0 & 0x3FFF];
        float var3 = class632.field9089[arg0 & 0x3FFF];
        float var4 = this.field2953;
        float var5 = this.field2943;
        float var6 = this.field2965;
        this.field2953 = var2 * var4 - this.field2957 * var3;
        float var7 = this.field2951;
        this.field2957 = this.field2957 * var2 + var3 * var4;
        this.field2943 = var2 * var5 - this.field2962 * var3;
        this.field2962 = this.field2962 * var2 + var3 * var5;
        this.field2965 = var2 * var6 - (this.field2942 * var3);
        this.field2942 = this.field2942 * var2 + var3 * var6;
        this.field2951 = var2 * var7 - (this.field2954 * var3);
        this.field2954 = this.field2954 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "(I)V", line = 263)
    public final void method724(int arg0) {
        field2972++;
        this.field2962 = 1.0F;
        this.field2953 = this.field2969 = class632.field9087[arg0 & 0x3FFF];
        this.field2965 = class632.field9089[arg0 & 0x3FFF];
        this.field2943 = this.field2951 = this.field2957 = this.field2942 = this.field2954 = this.field2949 = this.field2952 = 0.0F;
        this.field2960 = -this.field2965;
    }

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "()V", line = 275)
    public final void method710() {
        this.field2957 = this.field2960 = this.field2943 = this.field2949 = this.field2965 = this.field2942 = this.field2951 = this.field2954 = this.field2952 = 0.0F;
        field2945++;
        this.field2953 = this.field2962 = this.field2969 = 1.0F;
    }

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "(III)V", line = 286)
    public final void method723(int arg0, int arg1, int arg2) {
        field2971++;
        this.field2951 += arg0;
        this.field2954 += arg1;
        this.field2952 += arg2;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIB)Leba;", line = 296)
    public static final class543 method1385(int arg0, int arg1, int arg2, byte arg3) {
        field2946++;
        class543 var4 = null;
        if (arg1 == 0) {
            class543.field7876++;
            var4 = class299.method1780(class84.field1196, class269.field3684, 116);
        }
        if (arg1 == 1) {
            class601.field8667++;
            var4 = class299.method1780(class84.field1196, class519.field7620, 99);
        }
        var4.field7872.method2281((byte) 58, class376.field5043.method1687(arg3 ^ 0x1DF9, 82) ? 1 : 0);
        var4.field7872.method2226(arg0 + class36.field689, (byte) -58);
        var4.field7872.method2261((byte) 55, arg2 + class88.field1239);
        class147.field1798 = arg2;
        class432.field6201 = arg0;
        class276.field3775 = false;
        if (arg3 != -30) {
            method1385(-52, -118, -12, (byte) 6);
        }
        class561.method3278(0);
        return var4;
    }

    @OriginalMember(owner = "client!ae", name = "oa", descriptor = "(I)V", line = 332)
    public final void method721(int arg0) {
        this.field2953 = 1.0F;
        field2968++;
        this.field2962 = this.field2969 = class632.field9087[arg0 & 0x3FFF];
        this.field2949 = class632.field9089[arg0 & 0x3FFF];
        this.field2942 = -this.field2949;
        this.field2943 = this.field2965 = this.field2951 = this.field2957 = this.field2954 = this.field2960 = this.field2952 = 0.0F;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([Ljava/lang/String;I[S)V", line = 344)
    public static final void method1386(String[] arg0, int arg1, short[] arg2) {
        field2958++;
        class493.method2865(arg0, arg2, false, arg0.length - 1, 0);
        int var3 = -69 % ((arg1 - 16) / 60);
    }

    @OriginalMember(owner = "client!ae", name = "ZA", descriptor = "(I)V", line = 356)
    public final void method714(int arg0) {
        field2967++;
        float var2 = class632.field9087[arg0 & 0x3FFF];
        float var3 = class632.field9089[arg0 & 0x3FFF];
        float var4 = this.field2953;
        float var5 = this.field2943;
        float var6 = this.field2965;
        this.field2953 = this.field2960 * var3 + var2 * var4;
        float var7 = this.field2951;
        this.field2960 = this.field2960 * var2 - (var3 * var4);
        this.field2943 = this.field2949 * var3 + var2 * var5;
        this.field2949 = this.field2949 * var2 - (var3 * var5);
        this.field2965 = this.field2969 * var3 + var2 * var6;
        this.field2969 = this.field2969 * var2 - (var3 * var6);
        this.field2951 = this.field2952 * var3 + var2 * var7;
        this.field2952 = this.field2952 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!ae", name = "NA", descriptor = "(III)V", line = 384)
    public final void method712(int arg0, int arg1, int arg2) {
        this.field2953 = this.field2962 = this.field2969 = 1.0F;
        field2959++;
        this.field2957 = this.field2960 = this.field2943 = this.field2949 = this.field2965 = this.field2942 = 0.0F;
        this.field2951 = arg0;
        this.field2952 = arg2;
        this.field2954 = arg1;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V", line = 419)
    public class228() {
        this.method710();
    }
}
