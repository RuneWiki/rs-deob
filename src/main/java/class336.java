import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class336 extends class376 {

    @OriginalMember(owner = "client!cl", name = "O", descriptor = "Z")
    public static volatile boolean field4342 = true;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "Lus;")
    public static class328 field4325 = new class328(40, 3);

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "F")
    public float field4314;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "F")
    public float field4323;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "F")
    public float field4326;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "F")
    public float field4329;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "F")
    public float field4330;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "F")
    public float field4334;

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "F")
    public float field4335;

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "F")
    public float field4337;

    @OriginalMember(owner = "client!cl", name = "K", descriptor = "F")
    public float field4338;

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "F")
    public float field4339;

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "F")
    public float field4344;

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "F")
    public float field4345;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!cl", name = "M", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!cl", name = "N", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V", line = 9)
    public final void method1959(int arg0) {
        field4327++;
        float var2 = class55.field796[arg0 & 0x3FFF];
        float var3 = class55.field791[arg0 & 0x3FFF];
        float var4 = this.field4330;
        float var5 = this.field4329;
        float var6 = this.field4314;
        float var7 = this.field4326;
        this.field4330 = this.field4344 * var3 + var2 * var4;
        this.field4329 = this.field4339 * var3 + var2 * var5;
        this.field4344 = this.field4344 * var2 - (var3 * var4);
        this.field4339 = this.field4339 * var2 - var3 * var5;
        this.field4314 = this.field4338 * var3 + var2 * var6;
        this.field4326 = this.field4334 * var3 + var2 * var7;
        this.field4338 = this.field4338 * var2 - (var3 * var6);
        this.field4334 = this.field4334 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II[S)[S", line = 40)
    public static final short[] method1960(int arg0, int arg1, short[] arg2) {
        field4340++;
        if (arg0 != -28315) {
            field4325 = null;
        }
        short[] var3 = new short[arg1];
        class617.method3385(arg2, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lwc;)V", line = 54)
    public final void method1961(class376 arg0) {
        field4317++;
        class336 var2 = (class336) arg0;
        this.field4344 = var2.field4344;
        this.field4335 = var2.field4335;
        this.field4330 = var2.field4330;
        this.field4337 = var2.field4337;
        this.field4326 = var2.field4326;
        this.field4323 = var2.field4323;
        this.field4334 = var2.field4334;
        this.field4338 = var2.field4338;
        this.field4339 = var2.field4339;
        this.field4314 = var2.field4314;
        this.field4345 = var2.field4345;
        this.field4329 = var2.field4329;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "()V", line = 83)
    public final void method1962() {
        field4319++;
        this.field4330 = this.field4323 = this.field4338 = 1.0F;
        this.field4335 = this.field4344 = this.field4329 = this.field4339 = this.field4314 = this.field4337 = this.field4326 = this.field4345 = this.field4334 = 0.0F;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V", line = 92)
    public final void method1963(int arg0, int arg1, int arg2) {
        field4343++;
        this.field4335 = this.field4344 = this.field4329 = this.field4339 = this.field4314 = this.field4337 = 0.0F;
        this.field4334 = arg2;
        this.field4345 = arg1;
        this.field4326 = arg0;
        this.field4330 = this.field4323 = this.field4338 = 1.0F;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V", line = 107)
    public final void method1964(int arg0) {
        this.field4330 = 1.0F;
        field4331++;
        this.field4323 = this.field4338 = class55.field796[arg0 & 0x3FFF];
        this.field4339 = class55.field791[arg0 & 0x3FFF];
        this.field4329 = this.field4314 = this.field4326 = this.field4335 = this.field4345 = this.field4344 = this.field4334 = 0.0F;
        this.field4337 = -this.field4339;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "()Lwc;", line = 119)
    public final class376 method1965() {
        field4324++;
        class336 var1 = new class336();
        var1.field4345 = this.field4345;
        var1.field4314 = this.field4314;
        var1.field4337 = this.field4337;
        var1.field4334 = this.field4334;
        var1.field4330 = this.field4330;
        var1.field4338 = this.field4338;
        var1.field4335 = this.field4335;
        var1.field4339 = this.field4339;
        var1.field4323 = this.field4323;
        var1.field4329 = this.field4329;
        var1.field4344 = this.field4344;
        var1.field4326 = this.field4326;
        return var1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIII)V", line = 145)
    public final void method1966(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4322++;
        float var7 = class55.field796[arg3 & 0x3FFF];
        float var8 = class55.field791[arg3 & 0x3FFF];
        float var9 = class55.field796[arg4 & 0x3FFF];
        float var10 = class55.field791[arg4 & 0x3FFF];
        float var11 = class55.field796[arg5 & 0x3FFF];
        float var12 = class55.field791[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field4344 = var7 * var10;
        this.field4329 = var7 * var12;
        this.field4314 = -var10 * var11 + var9 * var14;
        this.field4330 = var9 * var11 + var10 * var14;
        this.field4323 = var7 * var11;
        this.field4335 = -var9 * var12 + var10 * var13;
        this.field4337 = var9 * var13 + var10 * var12;
        this.field4338 = var7 * var9;
        this.field4339 = -var8;
        this.field4345 = (float) (-arg0) * this.field4335 - (float) arg1 * this.field4323 - (float) arg2 * this.field4337;
        this.field4326 = (float) (-arg0) * this.field4330 - ((float) arg1 * this.field4329) - (float) arg2 * this.field4314;
        this.field4334 = (float) (-arg0) * this.field4344 - (float) arg1 * this.field4339 - ((float) arg2 * this.field4338);
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)V", line = 182)
    public final void method1967(int arg0) {
        field4315++;
        this.field4338 = 1.0F;
        this.field4330 = this.field4323 = class55.field796[arg0 & 0x3FFF];
        this.field4335 = class55.field791[arg0 & 0x3FFF];
        this.field4314 = this.field4326 = this.field4337 = this.field4345 = this.field4344 = this.field4339 = this.field4334 = 0.0F;
        this.field4329 = -this.field4335;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([I)V", line = 199)
    public final void method1968(int[] arg0) {
        field4328++;
        float var2 = (float) arg0[0] - this.field4326;
        float var3 = (float) arg0[1] - this.field4345;
        float var4 = (float) arg0[2] - this.field4334;
        arg0[2] = (int) (this.field4338 * var4 + this.field4337 * var3 + this.field4314 * var2);
        arg0[1] = (int) (this.field4339 * var4 + this.field4329 * var2 + this.field4323 * var3);
        arg0[0] = (int) (this.field4344 * var4 + this.field4335 * var3 + this.field4330 * var2);
    }

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "(I)V", line = 215)
    public static void method1969(int arg0) {
        if (arg0 != -23580) {
            method1960(79, 39, null);
        }
        field4325 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZLeq;)V", line = 225)
    public static final void method1970(boolean arg0, class357 arg1) {
        if (!arg0) {
            method1960(60, -47, null);
        }
        field4332++;
        if (class461.field6641 == null) {
            class728 var2 = new class728();
            byte[] var3 = var2.method4031(128, -1, 128, 16);
            class461.field6641 = class574.method3222(var3, (byte) -89, false);
        }
        if (class280.field3555 == null) {
            class372 var4 = new class372();
            byte[] var5 = var4.method2269(132733924, 128, 16, 128);
            class280.field3555 = class574.method3222(var5, (byte) -113, false);
        }
        class172 var6 = arg1.field4957;
        if (var6.method1072((byte) 78) && class406.field5733 == null) {
            byte[] var7 = class414.method2454(0.5F, 128, 128, 16.0F, (byte) 17, 0.6F, 16, 4.0F, 8, 4.0F, new class130(419684));
            class406.field5733 = class574.method3222(var7, (byte) -128, false);
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(III[I)V", line = 267)
    public final void method1971(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field4337 + (float) arg0 * this.field4335 + (float) arg1 * this.field4323 + this.field4345);
        arg3[0] = (int) ((float) arg2 * this.field4314 + (float) arg0 * this.field4330 + (float) arg1 * this.field4329 + this.field4326);
        arg3[2] = (int) ((float) arg2 * this.field4338 + (float) arg0 * this.field4344 + (float) arg1 * this.field4339 + this.field4334);
        field4313++;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V", line = 277)
    public final void method1972(int arg0) {
        field4336++;
        float var2 = class55.field796[arg0 & 0x3FFF];
        float var3 = class55.field791[arg0 & 0x3FFF];
        float var4 = this.field4330;
        float var5 = this.field4329;
        float var6 = this.field4314;
        float var7 = this.field4326;
        this.field4330 = var2 * var4 - (this.field4335 * var3);
        this.field4335 = this.field4335 * var2 + var3 * var4;
        this.field4329 = var2 * var5 - this.field4323 * var3;
        this.field4323 = this.field4323 * var2 + var3 * var5;
        this.field4314 = var2 * var6 - (this.field4337 * var3);
        this.field4326 = var2 * var7 - (this.field4345 * var3);
        this.field4337 = this.field4337 * var2 + var3 * var6;
        this.field4345 = this.field4345 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(III)V", line = 307)
    public final void method1973(int arg0, int arg1, int arg2) {
        field4318++;
        this.field4345 += arg1;
        this.field4334 += arg2;
        this.field4326 += arg0;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(III[I)V", line = 324)
    public final void method1974(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg1 - this.field4345);
        field4321++;
        int var6 = (int) ((float) arg0 - this.field4326);
        int var7 = (int) ((float) arg2 - this.field4334);
        arg3[0] = (int) ((float) var7 * this.field4344 + (float) var5 * this.field4335 + (float) var6 * this.field4330);
        arg3[1] = (int) ((float) var7 * this.field4339 + (float) var5 * this.field4323 + (float) var6 * this.field4329);
        arg3[2] = (int) ((float) var7 * this.field4338 + (float) var5 * this.field4337 + (float) var6 * this.field4314);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 338)
    public final void method1975(int arg0) {
        field4333++;
        float var2 = class55.field796[arg0 & 0x3FFF];
        float var3 = class55.field791[arg0 & 0x3FFF];
        float var4 = this.field4335;
        float var5 = this.field4323;
        float var6 = this.field4337;
        this.field4335 = var2 * var4 - (this.field4344 * var3);
        float var7 = this.field4345;
        this.field4344 = this.field4344 * var2 + var3 * var4;
        this.field4323 = var2 * var5 - this.field4339 * var3;
        this.field4337 = var2 * var6 - this.field4338 * var3;
        this.field4339 = this.field4339 * var2 + var3 * var5;
        this.field4345 = var2 * var7 - this.field4334 * var3;
        this.field4338 = this.field4338 * var2 + var3 * var6;
        this.field4334 = this.field4334 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)V", line = 371)
    public final void method1976(int arg0) {
        field4320++;
        this.field4323 = 1.0F;
        this.field4330 = this.field4338 = class55.field796[arg0 & 0x3FFF];
        this.field4314 = class55.field791[arg0 & 0x3FFF];
        this.field4329 = this.field4326 = this.field4335 = this.field4337 = this.field4345 = this.field4339 = this.field4334 = 0.0F;
        this.field4344 = -this.field4314;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V", line = 399)
    public class336() {
        this.method1962();
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III[I)V", line = 407)
    public final void method1977(int arg0, int arg1, int arg2, int[] arg3) {
        field4341++;
        arg3[0] = (int) ((float) arg2 * this.field4314 + (float) arg0 * this.field4330 + (float) arg1 * this.field4329);
        arg3[2] = (int) ((float) arg2 * this.field4338 + (float) arg0 * this.field4344 + (float) arg1 * this.field4339);
        arg3[1] = (int) ((float) arg2 * this.field4337 + (float) arg0 * this.field4335 + (float) arg1 * this.field4323);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBIZIIII)V", line = 418)
    public static final void method1978(int arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = -48 / ((-arg1 - 93) / 33);
        if ((arg3 ? class223.field2944.field632.method3601((byte) -125) : class223.field2944.field600.method3601((byte) -121)) != 0 && arg6 != 0 && class111.field1370 < 50 && arg5 != -1) {
            class552.field7756[class111.field1370++] = new class310((byte) (arg3 ? 3 : 2), arg5, arg6, arg2, arg4, arg0, arg7, null);
        }
        field4316++;
    }
}
