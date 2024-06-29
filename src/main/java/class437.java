import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class437 extends class723 {

    @OriginalMember(owner = "client!uj", name = "N", descriptor = "Lqk;")
    public static class148 field6013 = new class148(118, 2);

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "F")
    public float field5979;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "F")
    public float field5980;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "F")
    public float field5989;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "F")
    public float field5993;

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "F")
    public float field5996;

    @OriginalMember(owner = "client!uj", name = "x", descriptor = "F")
    public float field5998;

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "F")
    public float field6000;

    @OriginalMember(owner = "client!uj", name = "A", descriptor = "F")
    public float field6001;

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "F")
    public float field6007;

    @OriginalMember(owner = "client!uj", name = "I", descriptor = "F")
    public float field6008;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "F")
    public float field6009;

    @OriginalMember(owner = "client!uj", name = "M", descriptor = "F")
    public float field6012;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field5978;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field5985;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public static int field5987;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
    public static int field5990;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!uj", name = "D", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!uj", name = "E", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!uj", name = "F", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!uj", name = "L", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "J")
    public static long field5997;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "Lwu;")
    public static class557 field5994;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(III[I)V")
    public final void method872(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field5980 + (float) arg0 * this.field5993 + (float) arg1 * this.field6009);
        arg3[2] = (int) ((float) arg2 * this.field6000 + (float) arg0 * this.field6007 + (float) arg1 * this.field6008);
        field6003++;
        arg3[0] = (int) ((float) arg2 * this.field5996 + (float) arg0 * this.field5989 + (float) arg1 * this.field5979);
    }

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "(I)V")
    public static void method2619(int arg0) {
        if (arg0 < 118) {
            field6013 = null;
        }
        field6013 = null;
        field5994 = null;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(III)V")
    public final void method851(int arg0, int arg1, int arg2) {
        field5987++;
        this.field5998 += arg0;
        this.field6012 += arg1;
        this.field6001 += arg2;
    }

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)V")
    public final void method843(int arg0) {
        this.field5989 = 1.0F;
        field5978++;
        this.field6009 = this.field6000 = class543.field7598[arg0 & 0x3FFF];
        this.field6008 = class543.field7588[arg0 & 0x3FFF];
        this.field5980 = -this.field6008;
        this.field5979 = this.field5996 = this.field5998 = this.field5993 = this.field6012 = this.field6007 = this.field6001 = 0.0F;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Luha;)V")
    public final void method864(class723 arg0) {
        field5983++;
        class437 var2 = (class437) arg0;
        this.field5989 = var2.field5989;
        this.field5979 = var2.field5979;
        this.field5993 = var2.field5993;
        this.field5998 = var2.field5998;
        this.field5980 = var2.field5980;
        this.field6008 = var2.field6008;
        this.field6012 = var2.field6012;
        this.field6000 = var2.field6000;
        this.field6001 = var2.field6001;
        this.field6007 = var2.field6007;
        this.field5996 = var2.field5996;
        this.field6009 = var2.field6009;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(FFIFIII)V")
    public final void method2620(float arg0, float arg1, int arg2, float arg3, int arg4, int arg5, int arg6) {
        if (arg6 >= -121) {
            field6013 = null;
        }
        field6005++;
        if (arg2 == 0) {
            this.field5993 = this.field6007 = this.field5979 = this.field6008 = this.field5996 = this.field5980 = 0.0F;
            this.field5989 = arg4;
            this.field6009 = arg5;
            this.field6000 = 1.0F;
        } else {
            float var8 = class543.field7598[arg2 & 0x3FFF];
            float var9 = class543.field7588[arg2 & 0x3FFF];
            this.field5989 = (float) arg4 * var8;
            this.field6000 = 1.0F;
            this.field5979 = (float) arg5 * -var9;
            this.field6007 = this.field6008 = this.field5996 = this.field5980 = 0.0F;
            this.field5993 = (float) arg4 * var9;
            this.field6009 = (float) arg5 * var8;
        }
        this.field6001 = arg0;
        this.field6012 = arg1;
        this.field5998 = arg3;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(FFFIF[F)V")
    public final void method2621(float arg0, float arg1, float arg2, int arg3, float arg4, float[] arg5) {
        field5977++;
        arg5[2] = this.field6000 * arg0 + this.field6008 * arg1 + this.field6007 * arg2;
        arg5[1] = this.field5980 * arg0 + this.field6009 * arg1 + this.field5993 * arg2;
        float var8;
        float var9;
        float var10;
        if ((arg2 > 0.00390625F) || (arg2 < -0.00390625F)) {
            float var12 = -arg4 / arg2;
            var10 = this.field5989 * var12 + this.field5998;
            var9 = this.field5993 * var12 + this.field6012;
            var8 = this.field6007 * var12 + this.field6001;
        } else if ((arg1 > 0.00390625F) || (arg1 < -0.00390625F)) {
            float var11 = -arg4 / arg1;
            var8 = this.field6008 * var11 + this.field6001;
            var10 = this.field5979 * var11 + this.field5998;
            var9 = this.field6009 * var11 + this.field6012;
        } else {
            float var7 = -arg4 / arg0;
            var8 = this.field6000 * var7 + this.field6001;
            var9 = this.field5980 * var7 + this.field6012;
            var10 = this.field5996 * var7 + this.field5998;
        }
        arg5[arg3] = this.field5996 * arg0 + this.field5989 * arg2 + this.field5979 * arg1;
        arg5[3] = -(arg5[2] * var8 + arg5[1] * var9 + arg5[0] * var10);
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V")
    public final void method873(int arg0) {
        field5992++;
        float var2 = class543.field7598[arg0 & 0x3FFF];
        float var3 = class543.field7588[arg0 & 0x3FFF];
        float var4 = this.field5989;
        float var5 = this.field5979;
        float var6 = this.field5996;
        float var7 = this.field5998;
        this.field5989 = this.field6007 * var3 + var2 * var4;
        this.field5979 = this.field6008 * var3 + var2 * var5;
        this.field6007 = this.field6007 * var2 - (var3 * var4);
        this.field5996 = this.field6000 * var3 + var2 * var6;
        this.field6008 = this.field6008 * var2 - var3 * var5;
        this.field6000 = this.field6000 * var2 - (var3 * var6);
        this.field5998 = this.field6001 * var3 + var2 * var7;
        this.field6001 = this.field6001 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(III[I)V")
    public final void method871(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg2 - this.field6001);
        field5990++;
        int var6 = (int) ((float) arg0 - this.field5998);
        int var7 = (int) ((float) arg1 - this.field6012);
        arg3[2] = (int) ((float) var5 * this.field6000 + (float) var6 * this.field5996 + (float) var7 * this.field5980);
        arg3[0] = (int) ((float) var5 * this.field6007 + (float) var6 * this.field5989 + (float) var7 * this.field5993);
        arg3[1] = (int) ((float) var5 * this.field6008 + (float) var6 * this.field5979 + (float) var7 * this.field6009);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public final void method846(int arg0) {
        field5984++;
        this.field6000 = 1.0F;
        this.field5989 = this.field6009 = class543.field7598[arg0 & 0x3FFF];
        this.field5993 = class543.field7588[arg0 & 0x3FFF];
        this.field5979 = -this.field5993;
        this.field5996 = this.field5998 = this.field5980 = this.field6012 = this.field6007 = this.field6008 = this.field6001 = 0.0F;
    }

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)V")
    public final void method844(int arg0) {
        field5991++;
        float var2 = class543.field7598[arg0 & 0x3FFF];
        float var3 = class543.field7588[arg0 & 0x3FFF];
        float var4 = this.field5993;
        float var5 = this.field6009;
        float var6 = this.field5980;
        this.field5993 = var2 * var4 - (this.field6007 * var3);
        float var7 = this.field6012;
        this.field6009 = var2 * var5 - (this.field6008 * var3);
        this.field6007 = this.field6007 * var2 + var3 * var4;
        this.field6008 = this.field6008 * var2 + var3 * var5;
        this.field5980 = var2 * var6 - this.field6000 * var3;
        this.field6012 = var2 * var7 - (this.field6001 * var3);
        this.field6000 = this.field6000 * var2 + var3 * var6;
        this.field6001 = this.field6001 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "()V")
    public final void method860() {
        field5988++;
        this.field5989 = this.field6009 = this.field6000 = 1.0F;
        this.field5993 = this.field6007 = this.field5979 = this.field6008 = this.field5996 = this.field5980 = this.field5998 = this.field6012 = this.field6001 = 0.0F;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "()Luha;")
    public final class723 method859() {
        field6006++;
        class437 var1 = new class437();
        var1.field5989 = this.field5989;
        var1.field6001 = this.field6001;
        var1.field6012 = this.field6012;
        var1.field5996 = this.field5996;
        var1.field6008 = this.field6008;
        var1.field5980 = this.field5980;
        var1.field6009 = this.field6009;
        var1.field6007 = this.field6007;
        var1.field5998 = this.field5998;
        var1.field5993 = this.field5993;
        var1.field5979 = this.field5979;
        var1.field6000 = this.field6000;
        return var1;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)V")
    public final void method848(int arg0, int arg1, int arg2) {
        this.field6012 = arg1;
        this.field5993 = this.field6007 = this.field5979 = this.field6008 = this.field5996 = this.field5980 = 0.0F;
        field6004++;
        this.field6001 = arg2;
        this.field5989 = this.field6009 = this.field6000 = 1.0F;
        this.field5998 = arg0;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V")
    public final void method2622(boolean arg0) {
        this.field6001 = -this.field6001;
        this.field6000 = -this.field6000;
        this.field5980 = -this.field5980;
        if (arg0) {
            this.method844(-107);
        }
        this.field6012 = -this.field6012;
        this.field6008 = -this.field6008;
        this.field5993 = -this.field5993;
        this.field6007 = -this.field6007;
        field6002++;
        this.field6009 = -this.field6009;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "([I)V")
    public final void method870(int[] arg0) {
        field5986++;
        float var2 = (float) arg0[0] - this.field5998;
        float var3 = (float) arg0[1] - this.field6012;
        float var4 = (float) arg0[2] - this.field6001;
        arg0[0] = (int) (this.field6007 * var4 + this.field5993 * var3 + this.field5989 * var2);
        arg0[2] = (int) (this.field6000 * var4 + this.field5996 * var2 + this.field5980 * var3);
        arg0[1] = (int) (this.field6008 * var4 + this.field6009 * var3 + this.field5979 * var2);
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V")
    public final void method847(int arg0) {
        field5999++;
        float var2 = class543.field7598[arg0 & 0x3FFF];
        float var3 = class543.field7588[arg0 & 0x3FFF];
        float var4 = this.field5989;
        float var5 = this.field5979;
        float var6 = this.field5996;
        float var7 = this.field5998;
        this.field5989 = var2 * var4 - this.field5993 * var3;
        this.field5993 = this.field5993 * var2 + var3 * var4;
        this.field5979 = var2 * var5 - this.field6009 * var3;
        this.field6009 = this.field6009 * var2 + var3 * var5;
        this.field5996 = var2 * var6 - this.field5980 * var3;
        this.field5980 = this.field5980 * var2 + var3 * var6;
        this.field5998 = var2 * var7 - (this.field6012 * var3);
        this.field6012 = this.field6012 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)V")
    public final void method866(int arg0) {
        this.field6009 = 1.0F;
        field6010++;
        this.field5989 = this.field6000 = class543.field7598[arg0 & 0x3FFF];
        this.field5996 = class543.field7588[arg0 & 0x3FFF];
        this.field6007 = -this.field5996;
        this.field5979 = this.field5998 = this.field5993 = this.field5980 = this.field6012 = this.field6008 = this.field6001 = 0.0F;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)[F")
    public final float[] method2623(byte arg0) {
        class327.field4209[9] = this.field5980;
        class327.field4209[6] = this.field6008;
        class327.field4209[2] = this.field6007;
        class327.field4209[4] = this.field5979;
        class327.field4209[13] = 0.0F;
        field6011++;
        class327.field4209[1] = this.field5993;
        class327.field4209[10] = this.field6000;
        if (arg0 < 121) {
            this.field5993 = -0.555329F;
        }
        class327.field4209[0] = this.field5989;
        class327.field4209[12] = 0.0F;
        class327.field4209[5] = this.field6009;
        class327.field4209[14] = 0.0F;
        class327.field4209[8] = this.field5996;
        return class327.field4209;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIII)V")
    public final void method853(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5982++;
        float var7 = class543.field7598[arg3 & 0x3FFF];
        float var8 = class543.field7588[arg3 & 0x3FFF];
        float var9 = class543.field7598[arg4 & 0x3FFF];
        float var10 = class543.field7588[arg4 & 0x3FFF];
        float var11 = class543.field7598[arg5 & 0x3FFF];
        float var12 = class543.field7588[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field5989 = var9 * var11 + var10 * var14;
        this.field6009 = var7 * var11;
        this.field5996 = -var10 * var11 + var9 * var14;
        this.field6008 = -var8;
        this.field6000 = var7 * var9;
        this.field6007 = var7 * var10;
        this.field5979 = var7 * var12;
        this.field5980 = var9 * var13 + var10 * var12;
        this.field5993 = -var9 * var12 + var10 * var13;
        this.field5998 = (float) (-arg0) * this.field5989 - ((float) arg1 * this.field5979) - (float) arg2 * this.field5996;
        this.field6001 = (float) (-arg0) * this.field6007 - ((float) arg1 * this.field6008) - (float) arg2 * this.field6000;
        this.field6012 = (float) (-arg0) * this.field5993 - ((float) arg1 * this.field6009) - ((float) arg2 * this.field5980);
    }

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "(I)[F")
    public final float[] method2624(int arg0) {
        class327.field4209[10] = this.field6000;
        field5985++;
        class327.field4209[4] = this.field5979;
        class327.field4209[5] = this.field6009;
        class327.field4209[1] = this.field5993;
        class327.field4209[6] = this.field6008;
        class327.field4209[8] = this.field5996;
        class327.field4209[13] = this.field6012;
        class327.field4209[9] = this.field5980;
        if (arg0 != -8914) {
            this.method864(null);
        }
        class327.field4209[0] = this.field5989;
        class327.field4209[12] = this.field5998;
        class327.field4209[2] = this.field6007;
        class327.field4209[14] = this.field6001;
        return class327.field4209;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Luha;Z)V")
    public final void method2625(class723 arg0, boolean arg1) {
        field5995++;
        class437 var3 = (class437) arg0;
        this.field5996 = var3.field6007;
        this.field5989 = var3.field5989;
        this.field5979 = var3.field5993;
        this.field5993 = var3.field5979;
        this.field6007 = var3.field5996;
        this.field5980 = var3.field6008;
        this.field6009 = var3.field6009;
        this.field5998 = -(this.field5996 * var3.field6001 + this.field5989 * var3.field5998 + this.field5979 * var3.field6012);
        this.field6000 = var3.field6000;
        if (arg1) {
            this.field6008 = var3.field5980;
            this.field6012 = -(this.field5980 * var3.field6001 + this.field6009 * var3.field6012 + this.field5993 * var3.field5998);
            this.field6001 = -(this.field6000 * var3.field6001 + this.field6008 * var3.field6012 + this.field6007 * var3.field5998);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III[I)V")
    public final void method861(int arg0, int arg1, int arg2, int[] arg3) {
        field5981++;
        arg3[1] = (int) ((float) arg2 * this.field5980 + (float) arg0 * this.field5993 + (float) arg1 * this.field6009 + this.field6012);
        arg3[2] = (int) ((float) arg2 * this.field6000 + (float) arg0 * this.field6007 + (float) arg1 * this.field6008 + this.field6001);
        arg3[0] = (int) ((float) arg2 * this.field5996 + (float) arg0 * this.field5989 + (float) arg1 * this.field5979 + this.field5998);
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
    public class437() {
        this.method860();
    }
}
