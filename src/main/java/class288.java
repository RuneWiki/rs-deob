import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class288 extends class333 {

    @OriginalMember(owner = "client!ria", name = "D", descriptor = "I")
    public static int field4090 = 1;

    @OriginalMember(owner = "client!ria", name = "i", descriptor = "F")
    public float field4069;

    @OriginalMember(owner = "client!ria", name = "r", descriptor = "F")
    public float field4078;

    @OriginalMember(owner = "client!ria", name = "t", descriptor = "F")
    public float field4080;

    @OriginalMember(owner = "client!ria", name = "w", descriptor = "F")
    public float field4083;

    @OriginalMember(owner = "client!ria", name = "B", descriptor = "F")
    public float field4088;

    @OriginalMember(owner = "client!ria", name = "F", descriptor = "F")
    public float field4092;

    @OriginalMember(owner = "client!ria", name = "G", descriptor = "F")
    public float field4093;

    @OriginalMember(owner = "client!ria", name = "H", descriptor = "F")
    public float field4094;

    @OriginalMember(owner = "client!ria", name = "M", descriptor = "F")
    public float field4099;

    @OriginalMember(owner = "client!ria", name = "O", descriptor = "F")
    public float field4101;

    @OriginalMember(owner = "client!ria", name = "P", descriptor = "F")
    public float field4102;

    @OriginalMember(owner = "client!ria", name = "T", descriptor = "F")
    public float field4105;

    @OriginalMember(owner = "client!ria", name = "g", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!ria", name = "h", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!ria", name = "j", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!ria", name = "k", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!ria", name = "l", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!ria", name = "m", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!ria", name = "n", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!ria", name = "o", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!ria", name = "p", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!ria", name = "q", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!ria", name = "s", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!ria", name = "x", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!ria", name = "y", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!ria", name = "z", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!ria", name = "A", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!ria", name = "C", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!ria", name = "E", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!ria", name = "I", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!ria", name = "J", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!ria", name = "K", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!ria", name = "L", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!ria", name = "N", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!ria", name = "Q", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!ria", name = "S", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!ria", name = "u", descriptor = "Lhu;")
    public static class133 field4081;

    @OriginalMember(owner = "client!ria", name = "v", descriptor = "Lon;")
    public static class340 field4082;

    @OriginalMember(owner = "client!ria", name = "c", descriptor = "(III[I)V")
    public final void method1723(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg0 - this.field4088);
        field4072++;
        int var6 = (int) ((float) arg2 - this.field4105);
        int var7 = (int) ((float) arg1 - this.field4078);
        arg3[1] = (int) ((float) var6 * this.field4099 + (float) var5 * this.field4092 + (float) var7 * this.field4080);
        arg3[0] = (int) ((float) var6 * this.field4083 + (float) var5 * this.field4102 + (float) var7 * this.field4069);
        arg3[2] = (int) ((float) var6 * this.field4101 + (float) var5 * this.field4093 + (float) var7 * this.field4094);
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIIIII)V")
    public final void method1715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4067++;
        float var7 = class260.field3624[arg3 & 0x3FFF];
        float var8 = class260.field3625[arg3 & 0x3FFF];
        float var9 = class260.field3624[arg4 & 0x3FFF];
        float var10 = class260.field3625[arg4 & 0x3FFF];
        float var11 = class260.field3624[arg5 & 0x3FFF];
        float var12 = class260.field3625[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field4092 = var7 * var12;
        this.field4093 = -var10 * var11 + var9 * var14;
        this.field4102 = var9 * var11 + var10 * var14;
        this.field4083 = var7 * var10;
        this.field4099 = -var8;
        this.field4094 = var9 * var13 + var10 * var12;
        this.field4069 = -var9 * var12 + var10 * var13;
        this.field4101 = var7 * var9;
        this.field4080 = var7 * var11;
        this.field4078 = (float) (-arg0) * this.field4069 - ((float) arg1 * this.field4080) - ((float) arg2 * this.field4094);
        this.field4088 = (float) (-arg0) * this.field4102 - (float) arg1 * this.field4092 - (float) arg2 * this.field4093;
        this.field4105 = (float) (-arg0) * this.field4083 - (float) arg1 * this.field4099 - ((float) arg2 * this.field4101);
    }

    @OriginalMember(owner = "client!ria", name = "h", descriptor = "(I)V")
    public static void method1782(int arg0) {
        if (arg0 == 0) {
            field4082 = null;
            field4081 = null;
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "()Lofa;")
    public final class333 method1703() {
        field4086++;
        class288 var1 = new class288();
        var1.field4093 = this.field4093;
        var1.field4101 = this.field4101;
        var1.field4102 = this.field4102;
        var1.field4083 = this.field4083;
        var1.field4105 = this.field4105;
        var1.field4088 = this.field4088;
        var1.field4094 = this.field4094;
        var1.field4092 = this.field4092;
        var1.field4069 = this.field4069;
        var1.field4099 = this.field4099;
        var1.field4078 = this.field4078;
        var1.field4080 = this.field4080;
        return var1;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "([I)V")
    public final void method1709(int[] arg0) {
        field4087++;
        float var2 = (float) arg0[0] - this.field4088;
        float var3 = (float) arg0[1] - this.field4078;
        float var4 = (float) arg0[2] - this.field4105;
        arg0[1] = (int) (this.field4099 * var4 + this.field4092 * var2 + this.field4080 * var3);
        arg0[0] = (int) (this.field4083 * var4 + this.field4102 * var2 + this.field4069 * var3);
        arg0[2] = (int) (this.field4101 * var4 + this.field4094 * var3 + this.field4093 * var2);
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)V")
    public final void method1713(int arg0) {
        field4096++;
        this.field4080 = 1.0F;
        this.field4102 = this.field4101 = class260.field3624[arg0 & 0x3FFF];
        this.field4093 = class260.field3625[arg0 & 0x3FFF];
        this.field4092 = this.field4088 = this.field4069 = this.field4094 = this.field4078 = this.field4099 = this.field4105 = 0.0F;
        this.field4083 = -this.field4093;
    }

    @OriginalMember(owner = "client!ria", name = "d", descriptor = "(I)V")
    public final void method1705(int arg0) {
        field4071++;
        this.field4102 = 1.0F;
        this.field4080 = this.field4101 = class260.field3624[arg0 & 0x3FFF];
        this.field4099 = class260.field3625[arg0 & 0x3FFF];
        this.field4094 = -this.field4099;
        this.field4092 = this.field4093 = this.field4088 = this.field4069 = this.field4078 = this.field4083 = this.field4105 = 0.0F;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(III)V")
    public final void method1727(int arg0, int arg1, int arg2) {
        this.field4078 = arg1;
        this.field4102 = this.field4080 = this.field4101 = 1.0F;
        field4074++;
        this.field4105 = arg2;
        this.field4069 = this.field4083 = this.field4092 = this.field4099 = this.field4093 = this.field4094 = 0.0F;
        this.field4088 = arg0;
    }

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "(III)V")
    public final void method1730(int arg0, int arg1, int arg2) {
        this.field4088 += arg0;
        field4097++;
        this.field4105 += arg2;
        this.field4078 += arg1;
    }

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "(I)V")
    public final void method1710(int arg0) {
        field4085++;
        float var2 = class260.field3624[arg0 & 0x3FFF];
        float var3 = class260.field3625[arg0 & 0x3FFF];
        float var4 = this.field4102;
        float var5 = this.field4092;
        float var6 = this.field4093;
        this.field4102 = this.field4083 * var3 + var2 * var4;
        float var7 = this.field4088;
        this.field4092 = this.field4099 * var3 + var2 * var5;
        this.field4083 = this.field4083 * var2 - (var3 * var4);
        this.field4093 = this.field4101 * var3 + var2 * var6;
        this.field4099 = this.field4099 * var2 - (var3 * var5);
        this.field4088 = this.field4105 * var3 + var2 * var7;
        this.field4101 = this.field4101 * var2 - var3 * var6;
        this.field4105 = this.field4105 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "()V")
    public final void method1725() {
        this.field4069 = this.field4083 = this.field4092 = this.field4099 = this.field4093 = this.field4094 = this.field4088 = this.field4078 = this.field4105 = 0.0F;
        this.field4102 = this.field4080 = this.field4101 = 1.0F;
        field4104++;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(BLofa;)V")
    public final void method1783(byte arg0, class333 arg1) {
        field4091++;
        class288 var3 = (class288) arg1;
        this.field4093 = var3.field4083;
        this.field4092 = var3.field4069;
        this.field4102 = var3.field4102;
        this.field4094 = var3.field4099;
        this.field4069 = var3.field4092;
        this.field4083 = var3.field4093;
        this.field4080 = var3.field4080;
        this.field4088 = -(this.field4093 * var3.field4105 + this.field4102 * var3.field4088 + this.field4092 * var3.field4078);
        this.field4099 = var3.field4094;
        this.field4101 = var3.field4101;
        this.field4078 = -(this.field4094 * var3.field4105 + this.field4080 * var3.field4078 + this.field4069 * var3.field4088);
        this.field4105 = -(this.field4101 * var3.field4105 + this.field4099 * var3.field4078 + this.field4083 * var3.field4088);
        if (arg0 != 33) {
            this.field4069 = 1.5872078F;
        }
    }

    @OriginalMember(owner = "client!ria", name = "i", descriptor = "(I)V")
    public final void method1784(int arg0) {
        this.field4099 = -this.field4099;
        this.field4083 = -this.field4083;
        int var2 = 1 % ((-arg0 - 20) / 47);
        this.field4094 = -this.field4094;
        field4073++;
        this.field4105 = -this.field4105;
        this.field4078 = -this.field4078;
        this.field4101 = -this.field4101;
        this.field4080 = -this.field4080;
        this.field4069 = -this.field4069;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(FFFIF[F)V")
    public final void method1785(float arg0, float arg1, float arg2, int arg3, float arg4, float[] arg5) {
        field4077++;
        arg5[0] = this.field4093 * arg0 + this.field4102 * arg4 + this.field4092 * arg2;
        arg5[1] = this.field4094 * arg0 + this.field4080 * arg2 + this.field4069 * arg4;
        if (arg3 != 15082) {
            this.method1703();
        }
        arg5[2] = this.field4101 * arg0 + this.field4099 * arg2 + this.field4083 * arg4;
        float var8;
        float var9;
        float var10;
        if ((arg4 > 0.00390625F) || (arg4 < -0.00390625F)) {
            float var12 = -arg1 / arg4;
            var8 = this.field4083 * var12 + this.field4105;
            var10 = this.field4102 * var12 + this.field4088;
            var9 = this.field4069 * var12 + this.field4078;
        } else if ((arg2 > 0.00390625F) || (arg2 < -0.00390625F)) {
            float var11 = -arg1 / arg2;
            var8 = this.field4099 * var11 + this.field4105;
            var10 = this.field4092 * var11 + this.field4088;
            var9 = this.field4080 * var11 + this.field4078;
        } else {
            float var7 = -arg1 / arg0;
            var8 = this.field4101 * var7 + this.field4105;
            var9 = this.field4094 * var7 + this.field4078;
            var10 = this.field4093 * var7 + this.field4088;
        }
        arg5[3] = -(arg5[2] * var8 + arg5[0] * var10 + arg5[1] * var9);
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(B)[F")
    public final float[] method1786(byte arg0) {
        class5.field131[4] = this.field4092;
        class5.field131[1] = this.field4069;
        class5.field131[14] = this.field4105;
        class5.field131[9] = this.field4094;
        class5.field131[8] = this.field4093;
        class5.field131[5] = this.field4080;
        field4068++;
        class5.field131[0] = this.field4102;
        class5.field131[13] = this.field4078;
        class5.field131[12] = this.field4088;
        class5.field131[10] = this.field4101;
        class5.field131[2] = this.field4083;
        class5.field131[6] = this.field4099;
        return arg0 >= -76 ? null : class5.field131;
    }

    @OriginalMember(owner = "client!ria", name = "f", descriptor = "(I)V")
    public final void method1716(int arg0) {
        field4076++;
        float var2 = class260.field3624[arg0 & 0x3FFF];
        float var3 = class260.field3625[arg0 & 0x3FFF];
        float var4 = this.field4102;
        float var5 = this.field4092;
        float var6 = this.field4093;
        this.field4102 = var2 * var4 - (this.field4069 * var3);
        float var7 = this.field4088;
        this.field4092 = var2 * var5 - this.field4080 * var3;
        this.field4069 = this.field4069 * var2 + var3 * var4;
        this.field4080 = this.field4080 * var2 + var3 * var5;
        this.field4093 = var2 * var6 - (this.field4094 * var3);
        this.field4088 = var2 * var7 - this.field4078 * var3;
        this.field4094 = this.field4094 * var2 + var3 * var6;
        this.field4078 = this.field4078 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "(III[I)V")
    public final void method1728(int arg0, int arg1, int arg2, int[] arg3) {
        field4098++;
        arg3[0] = (int) ((float) arg2 * this.field4093 + (float) arg0 * this.field4102 + (float) arg1 * this.field4092);
        arg3[2] = (int) ((float) arg2 * this.field4101 + (float) arg0 * this.field4083 + (float) arg1 * this.field4099);
        arg3[1] = (int) ((float) arg2 * this.field4094 + (float) arg0 * this.field4069 + (float) arg1 * this.field4080);
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IBLaba;)Z")
    public static final boolean method1787(int arg0, byte arg1, class177 arg2) {
        field4100++;
        class200.field3011.method1708(arg2.field2672[arg0], arg2.field2670[arg0], arg2.field2665[arg0], class352.field4953);
        int var3 = class352.field4953[2];
        if (var3 < 50) {
            return false;
        }
        arg2.field2662[arg0] = (short) (class352.field4953[0] * class646.field8583 / var3 + class718.field9913);
        arg2.field2676[arg0] = (short) (class352.field4953[1] * class228.field3255 / var3 + class130.field2134);
        if (arg1 >= -23) {
            return false;
        } else {
            arg2.field2667[arg0] = (short) var3;
            return true;
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(II)V")
    public static final void method1788(int arg0, int arg1) {
        field4079++;
        if (class435.method2502(arg1, (byte) -22)) {
            class512.method2859(class747.field10393[arg1], arg0, (byte) -107);
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lofa;)V")
    public final void method1712(class333 arg0) {
        field4075++;
        class288 var2 = (class288) arg0;
        this.field4069 = var2.field4069;
        this.field4102 = var2.field4102;
        this.field4080 = var2.field4080;
        this.field4092 = var2.field4092;
        this.field4099 = var2.field4099;
        this.field4078 = var2.field4078;
        this.field4093 = var2.field4093;
        this.field4083 = var2.field4083;
        this.field4094 = var2.field4094;
        this.field4101 = var2.field4101;
        this.field4105 = var2.field4105;
        this.field4088 = var2.field4088;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(ZFFFIII)V")
    public final void method1789(boolean arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6) {
        if (arg5 == 0) {
            this.field4102 = arg6;
            this.field4101 = 1.0F;
            this.field4069 = this.field4083 = this.field4092 = this.field4099 = this.field4093 = this.field4094 = 0.0F;
            this.field4080 = arg4;
        } else {
            float var8 = class260.field3624[arg5 & 0x3FFF];
            float var9 = class260.field3625[arg5 & 0x3FFF];
            this.field4080 = (float) arg4 * var8;
            this.field4069 = (float) arg6 * var9;
            this.field4101 = 1.0F;
            this.field4092 = (float) arg4 * -var9;
            this.field4083 = this.field4099 = this.field4093 = this.field4094 = 0.0F;
            this.field4102 = (float) arg6 * var8;
        }
        field4070++;
        if (arg0) {
            field4081 = null;
        }
        this.field4088 = arg2;
        this.field4078 = arg1;
        this.field4105 = arg3;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(III[I)V")
    public final void method1708(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field4101 + (float) arg0 * this.field4083 + (float) arg1 * this.field4099 + this.field4105);
        field4089++;
        arg3[0] = (int) ((float) arg2 * this.field4093 + (float) arg0 * this.field4102 + (float) arg1 * this.field4092 + this.field4088);
        arg3[1] = (int) ((float) arg2 * this.field4094 + (float) arg0 * this.field4069 + (float) arg1 * this.field4080 + this.field4078);
    }

    @OriginalMember(owner = "client!ria", name = "e", descriptor = "(I)V")
    public final void method1700(int arg0) {
        this.field4101 = 1.0F;
        field4084++;
        this.field4102 = this.field4080 = class260.field3624[arg0 & 0x3FFF];
        this.field4069 = class260.field3625[arg0 & 0x3FFF];
        this.field4092 = -this.field4069;
        this.field4093 = this.field4088 = this.field4094 = this.field4078 = this.field4083 = this.field4099 = this.field4105 = 0.0F;
    }

    @OriginalMember(owner = "client!ria", name = "g", descriptor = "(I)V")
    public final void method1718(int arg0) {
        field4095++;
        float var2 = class260.field3624[arg0 & 0x3FFF];
        float var3 = class260.field3625[arg0 & 0x3FFF];
        float var4 = this.field4069;
        float var5 = this.field4080;
        float var6 = this.field4094;
        float var7 = this.field4078;
        this.field4069 = var2 * var4 - (this.field4083 * var3);
        this.field4080 = var2 * var5 - this.field4099 * var3;
        this.field4083 = this.field4083 * var2 + var3 * var4;
        this.field4094 = var2 * var6 - (this.field4101 * var3);
        this.field4099 = this.field4099 * var2 + var3 * var5;
        this.field4101 = this.field4101 * var2 + var3 * var6;
        this.field4078 = var2 * var7 - this.field4105 * var3;
        this.field4105 = this.field4105 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ria", name = "j", descriptor = "(I)[F")
    public final float[] method1790(int arg0) {
        class5.field131[0] = this.field4102;
        class5.field131[6] = this.field4099;
        class5.field131[13] = 0.0F;
        class5.field131[5] = this.field4080;
        class5.field131[12] = 0.0F;
        class5.field131[4] = this.field4092;
        class5.field131[10] = this.field4101;
        class5.field131[14] = 0.0F;
        class5.field131[1] = this.field4069;
        class5.field131[arg0] = this.field4094;
        field4103++;
        class5.field131[8] = this.field4093;
        class5.field131[2] = this.field4083;
        return class5.field131;
    }

    @OriginalMember(owner = "client!ria", name = "<init>", descriptor = "()V")
    public class288() {
        this.method1725();
    }
}
