import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class286 extends class152 {

    @OriginalMember(owner = "client!ho", name = "v", descriptor = "Lau;")
    public static class692 field4012 = new class692();

    @OriginalMember(owner = "client!ho", name = "B", descriptor = "Lvh;")
    public static class125 field4018 = new class125(11, -1);

    @OriginalMember(owner = "client!ho", name = "T", descriptor = "S")
    public static short field4036 = 1;

    @OriginalMember(owner = "client!ho", name = "S", descriptor = "Leda;")
    public static class116 field4035 = new class116(21, 4);

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "F")
    public float field3996;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "F")
    public float field4000;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "F")
    public float field4003;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "F")
    public float field4004;

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "F")
    public float field4005;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "F")
    public float field4008;

    @OriginalMember(owner = "client!ho", name = "u", descriptor = "F")
    public float field4011;

    @OriginalMember(owner = "client!ho", name = "y", descriptor = "F")
    public float field4015;

    @OriginalMember(owner = "client!ho", name = "H", descriptor = "F")
    public float field4024;

    @OriginalMember(owner = "client!ho", name = "M", descriptor = "F")
    public float field4029;

    @OriginalMember(owner = "client!ho", name = "N", descriptor = "F")
    public float field4030;

    @OriginalMember(owner = "client!ho", name = "O", descriptor = "F")
    public float field4031;

    @OriginalMember(owner = "client!ho", name = "P", descriptor = "F")
    public static float field4032;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!ho", name = "t", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!ho", name = "w", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!ho", name = "x", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!ho", name = "z", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!ho", name = "A", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!ho", name = "C", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!ho", name = "D", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!ho", name = "F", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!ho", name = "G", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!ho", name = "I", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!ho", name = "J", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!ho", name = "K", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!ho", name = "L", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!ho", name = "Q", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!ho", name = "R", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!ho", name = "U", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!ho", name = "E", descriptor = "Lpda;")
    public static class138 field4021;

    @OriginalMember(owner = "client!ho", name = "V", descriptor = "Lvo;")
    public static class345 field4038;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(III[I)V")
    public final void method169(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field4003 + (float) arg0 * this.field3996 + (float) arg1 * this.field4000 + this.field4029);
        arg3[0] = (int) ((float) arg2 * this.field4015 + (float) arg0 * this.field4030 + (float) arg1 * this.field4031 + this.field4004);
        field4006++;
        arg3[1] = (int) ((float) arg2 * this.field4011 + (float) arg0 * this.field4008 + (float) arg1 * this.field4024 + this.field4005);
    }

    @OriginalMember(owner = "client!ho", name = "U", descriptor = "(III)V")
    public final void method158(int arg0, int arg1, int arg2) {
        this.field4029 += arg2;
        this.field4004 += arg0;
        field3999++;
        this.field4005 += arg1;
    }

    @OriginalMember(owner = "client!ho", name = "J", descriptor = "(I)V")
    public final void method164(int arg0) {
        this.field4003 = 1.0F;
        field4017++;
        this.field4030 = this.field4024 = class369.field5101[arg0 & 0x3FFF];
        this.field4008 = class369.field5108[arg0 & 0x3FFF];
        this.field4015 = this.field4004 = this.field4011 = this.field4005 = this.field3996 = this.field4000 = this.field4029 = 0.0F;
        this.field4031 = -this.field4008;
    }

    @OriginalMember(owner = "client!ho", name = "ZA", descriptor = "(I)V")
    public final void method170(int arg0) {
        field4002++;
        float var2 = class369.field5101[arg0 & 0x3FFF];
        float var3 = class369.field5108[arg0 & 0x3FFF];
        float var4 = this.field4030;
        float var5 = this.field4031;
        float var6 = this.field4015;
        this.field4030 = this.field3996 * var3 + var2 * var4;
        float var7 = this.field4004;
        this.field3996 = this.field3996 * var2 - var3 * var4;
        this.field4031 = this.field4000 * var3 + var2 * var5;
        this.field4000 = this.field4000 * var2 - var3 * var5;
        this.field4015 = this.field4003 * var3 + var2 * var6;
        this.field4003 = this.field4003 * var2 - (var3 * var6);
        this.field4004 = this.field4029 * var3 + var2 * var7;
        this.field4029 = this.field4029 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!ho", name = "w", descriptor = "(I)V")
    public final void method152(int arg0) {
        field3997++;
        float var2 = class369.field5101[arg0 & 0x3FFF];
        float var3 = class369.field5108[arg0 & 0x3FFF];
        float var4 = this.field4008;
        float var5 = this.field4024;
        float var6 = this.field4011;
        float var7 = this.field4005;
        this.field4008 = var2 * var4 - this.field3996 * var3;
        this.field4024 = var2 * var5 - this.field4000 * var3;
        this.field3996 = this.field3996 * var2 + var3 * var4;
        this.field4000 = this.field4000 * var2 + var3 * var5;
        this.field4011 = var2 * var6 - this.field4003 * var3;
        this.field4005 = var2 * var7 - this.field4029 * var3;
        this.field4003 = this.field4003 * var2 + var3 * var6;
        this.field4029 = this.field4029 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIII)V")
    public static final void method1758(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4014++;
        if (arg3 != 1931) {
            return;
        }
        if (arg0 == arg2) {
            class515.method3054(arg2, arg5, 0, arg1, arg4);
        } else if (arg1 - arg2 >= class512.field7620 && class94.field1398 >= arg1 + arg2 && class198.field3084 <= arg4 - arg0 && class627.field8931 >= arg0 + arg4) {
            class406.method2439(true, arg1, arg5, arg2, arg0, arg4);
        } else {
            class535.method3136(arg3 - 31378, arg4, arg5, arg2, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIBFFF)V")
    public final void method1759(int arg0, int arg1, int arg2, byte arg3, float arg4, float arg5, float arg6) {
        if (arg0 == 0) {
            this.field4030 = arg1;
            this.field4003 = 1.0F;
            this.field4008 = this.field3996 = this.field4031 = this.field4000 = this.field4015 = this.field4011 = 0.0F;
            this.field4024 = arg2;
        } else {
            float var8 = class369.field5101[arg0 & 0x3FFF];
            float var9 = class369.field5108[arg0 & 0x3FFF];
            this.field4024 = (float) arg2 * var8;
            this.field4031 = (float) arg2 * -var9;
            this.field4003 = 1.0F;
            this.field4030 = (float) arg1 * var8;
            this.field4008 = (float) arg1 * var9;
            this.field3996 = this.field4000 = this.field4015 = this.field4011 = 0.0F;
        }
        field4028++;
        this.field4029 = arg6;
        this.field4004 = arg4;
        this.field4005 = arg5;
        if (arg3 != -105) {
            this.method1759(26, 98, -26, (byte) 12, 0.1553001F, -0.546634F, 1.5102051F);
        }
    }

    @OriginalMember(owner = "client!ho", name = "NA", descriptor = "(III)V")
    public final void method166(int arg0, int arg1, int arg2) {
        this.field4008 = this.field3996 = this.field4031 = this.field4000 = this.field4015 = this.field4011 = 0.0F;
        this.field4030 = this.field4024 = this.field4003 = 1.0F;
        this.field4004 = arg0;
        this.field4005 = arg1;
        field4037++;
        this.field4029 = arg2;
    }

    @OriginalMember(owner = "client!ho", name = "na", descriptor = "(IIIIII)V")
    public final void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4022++;
        float var7 = class369.field5101[arg3 & 0x3FFF];
        float var8 = class369.field5108[arg3 & 0x3FFF];
        float var9 = class369.field5101[arg4 & 0x3FFF];
        float var10 = class369.field5108[arg4 & 0x3FFF];
        float var11 = class369.field5101[arg5 & 0x3FFF];
        float var12 = class369.field5108[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field4015 = -var10 * var11 + var9 * var14;
        this.field4031 = var7 * var12;
        this.field4008 = -var9 * var12 + var10 * var13;
        this.field4000 = -var8;
        this.field4011 = var9 * var13 + var10 * var12;
        this.field4003 = var7 * var9;
        this.field3996 = var7 * var10;
        this.field4024 = var7 * var11;
        this.field4030 = var9 * var11 + var10 * var14;
        this.field4004 = (float) (-arg0) * this.field4030 - (float) arg1 * this.field4031 - ((float) arg2 * this.field4015);
        this.field4029 = (float) (-arg0) * this.field3996 - ((float) arg1 * this.field4000) - (float) arg2 * this.field4003;
        this.field4005 = (float) (-arg0) * this.field4008 - (float) arg1 * this.field4024 - (float) arg2 * this.field4011;
    }

    @OriginalMember(owner = "client!ho", name = "wa", descriptor = "(III[I)V")
    public final void method183(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field4003 + (float) arg0 * this.field3996 + (float) arg1 * this.field4000);
        arg3[1] = (int) ((float) arg2 * this.field4011 + (float) arg0 * this.field4008 + (float) arg1 * this.field4024);
        arg3[0] = (int) ((float) arg2 * this.field4015 + (float) arg0 * this.field4030 + (float) arg1 * this.field4031);
        field4025++;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "()Lq;")
    public final class152 method180() {
        field4010++;
        class286 var1 = new class286();
        var1.field4031 = this.field4031;
        var1.field4000 = this.field4000;
        var1.field4029 = this.field4029;
        var1.field4008 = this.field4008;
        var1.field4004 = this.field4004;
        var1.field4030 = this.field4030;
        var1.field4015 = this.field4015;
        var1.field4024 = this.field4024;
        var1.field3996 = this.field3996;
        var1.field4003 = this.field4003;
        var1.field4005 = this.field4005;
        var1.field4011 = this.field4011;
        return var1;
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V")
    public static final void method1760(int arg0) {
        if (arg0 <= 15) {
            method1760(-66);
        }
        class140.field2346 = 0;
        class47.field622 = 0;
        class452.field6500 = 0;
        class236.field3495 = 0;
        field4007++;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lq;I)V")
    public final void method1761(class152 arg0, int arg1) {
        field4033++;
        class286 var3 = (class286) arg0;
        this.field4015 = var3.field3996;
        this.field4031 = var3.field4008;
        this.field4030 = var3.field4030;
        this.field3996 = var3.field4015;
        this.field4024 = var3.field4024;
        this.field4008 = var3.field4031;
        this.field4011 = var3.field4000;
        this.field4000 = var3.field4011;
        this.field4004 = -(this.field4015 * var3.field4029 + this.field4031 * var3.field4005 + this.field4030 * var3.field4004);
        this.field4003 = var3.field4003;
        this.field4005 = -(this.field4011 * var3.field4029 + this.field4024 * var3.field4005 + this.field4008 * var3.field4004);
        if (arg1 == 6) {
            this.field4029 = -(this.field4003 * var3.field4029 + this.field4000 * var3.field4005 + this.field3996 * var3.field4004);
        }
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)[F")
    public final float[] method1762(int arg0) {
        class695.field9872[5] = this.field4024;
        if (arg0 <= 80) {
            return null;
        }
        class695.field9872[0] = this.field4030;
        class695.field9872[6] = this.field4000;
        class695.field9872[12] = 0.0F;
        class695.field9872[14] = 0.0F;
        class695.field9872[13] = 0.0F;
        class695.field9872[9] = this.field4011;
        class695.field9872[4] = this.field4031;
        class695.field9872[1] = this.field4008;
        class695.field9872[2] = this.field3996;
        class695.field9872[10] = this.field4003;
        field4034++;
        class695.field9872[8] = this.field4015;
        return class695.field9872;
    }

    @OriginalMember(owner = "client!ho", name = "oa", descriptor = "(I)V")
    public final void method165(int arg0) {
        field4019++;
        this.field4030 = 1.0F;
        this.field4024 = this.field4003 = class369.field5101[arg0 & 0x3FFF];
        this.field4000 = class369.field5108[arg0 & 0x3FFF];
        this.field4011 = -this.field4000;
        this.field4031 = this.field4015 = this.field4004 = this.field4008 = this.field4005 = this.field3996 = this.field4029 = 0.0F;
    }

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "(I)V")
    public final void method1763(int arg0) {
        this.field4008 = -this.field4008;
        this.field3996 = -this.field3996;
        field4026++;
        this.field4000 = -this.field4000;
        this.field4011 = -this.field4011;
        this.field4003 = -this.field4003;
        this.field4029 = -this.field4029;
        this.field4005 = -this.field4005;
        this.field4024 = -this.field4024;
        if (arg0 < 9) {
            this.method171(47);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "([FFBFFF)V")
    public final void method1764(float[] arg0, float arg1, byte arg2, float arg3, float arg4, float arg5) {
        field4016++;
        if (arg2 != -75) {
            this.method169(6, 54, 47, null);
        }
        arg0[0] = this.field4015 * arg3 + this.field4031 * arg4 + this.field4030 * arg5;
        float var8;
        float var9;
        float var10;
        if ((arg5 > 0.00390625F) || (arg5 < -0.00390625F)) {
            float var12 = -arg1 / arg5;
            var8 = this.field3996 * var12 + this.field4029;
            var10 = this.field4030 * var12 + this.field4004;
            var9 = this.field4008 * var12 + this.field4005;
        } else if ((arg4 > 0.00390625F) || (arg4 < -0.00390625F)) {
            float var11 = -arg1 / arg4;
            var10 = this.field4031 * var11 + this.field4004;
            var8 = this.field4000 * var11 + this.field4029;
            var9 = this.field4024 * var11 + this.field4005;
        } else {
            float var7 = -arg1 / arg3;
            var8 = this.field4003 * var7 + this.field4029;
            var9 = this.field4011 * var7 + this.field4005;
            var10 = this.field4015 * var7 + this.field4004;
        }
        arg0[1] = this.field4011 * arg3 + this.field4024 * arg4 + this.field4008 * arg5;
        arg0[2] = this.field4003 * arg3 + this.field4000 * arg4 + this.field3996 * arg5;
        arg0[3] = -(arg0[2] * var8 + arg0[1] * var9 + arg0[0] * var10);
    }

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "(I)V")
    public final void method176(int arg0) {
        field4009++;
        this.field4024 = 1.0F;
        this.field4030 = this.field4003 = class369.field5101[arg0 & 0x3FFF];
        this.field4015 = class369.field5108[arg0 & 0x3FFF];
        this.field4031 = this.field4004 = this.field4008 = this.field4011 = this.field4005 = this.field4000 = this.field4029 = 0.0F;
        this.field3996 = -this.field4015;
    }

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "(I)[F")
    public final float[] method1765(int arg0) {
        class695.field9872[10] = this.field4003;
        class695.field9872[13] = this.field4005;
        class695.field9872[5] = this.field4024;
        if (arg0 != 8797) {
            this.method156(null);
        }
        field4001++;
        class695.field9872[8] = this.field4015;
        class695.field9872[9] = this.field4011;
        class695.field9872[12] = this.field4004;
        class695.field9872[0] = this.field4030;
        class695.field9872[2] = this.field3996;
        class695.field9872[4] = this.field4031;
        class695.field9872[6] = this.field4000;
        class695.field9872[14] = this.field4029;
        class695.field9872[1] = this.field4008;
        return class695.field9872;
    }

    @OriginalMember(owner = "client!ho", name = "Y", descriptor = "()V")
    public final void method167() {
        this.field4030 = this.field4024 = this.field4003 = 1.0F;
        field3998++;
        this.field4008 = this.field3996 = this.field4031 = this.field4000 = this.field4015 = this.field4011 = this.field4004 = this.field4005 = this.field4029 = 0.0F;
    }

    @OriginalMember(owner = "client!ho", name = "M", descriptor = "(Lq;)V")
    public final void method163(class152 arg0) {
        field4027++;
        class286 var2 = (class286) arg0;
        this.field4030 = var2.field4030;
        this.field4031 = var2.field4031;
        this.field4008 = var2.field4008;
        this.field4015 = var2.field4015;
        this.field4004 = var2.field4004;
        this.field4029 = var2.field4029;
        this.field4011 = var2.field4011;
        this.field4024 = var2.field4024;
        this.field4000 = var2.field4000;
        this.field3996 = var2.field3996;
        this.field4003 = var2.field4003;
        this.field4005 = var2.field4005;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(Z)V")
    public static void method1766(boolean arg0) {
        field4038 = null;
        field4035 = null;
        field4012 = null;
        field4018 = null;
        field4021 = null;
        if (!arg0) {
            field4012 = null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "YA", descriptor = "([I)V")
    public final void method156(int[] arg0) {
        field4013++;
        float var2 = (float) arg0[0] - this.field4004;
        float var3 = (float) arg0[1] - this.field4005;
        float var4 = (float) arg0[2] - this.field4029;
        arg0[0] = (int) (this.field3996 * var4 + this.field4030 * var2 + this.field4008 * var3);
        arg0[2] = (int) (this.field4003 * var4 + this.field4015 * var2 + this.field4011 * var3);
        arg0[1] = (int) (this.field4000 * var4 + this.field4031 * var2 + this.field4024 * var3);
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V")
    public class286() {
        this.method167();
    }

    @OriginalMember(owner = "client!ho", name = "AA", descriptor = "(I)V")
    public final void method171(int arg0) {
        field4020++;
        float var2 = class369.field5101[arg0 & 0x3FFF];
        float var3 = class369.field5108[arg0 & 0x3FFF];
        float var4 = this.field4030;
        float var5 = this.field4031;
        float var6 = this.field4015;
        this.field4030 = var2 * var4 - (this.field4008 * var3);
        float var7 = this.field4004;
        this.field4031 = var2 * var5 - (this.field4024 * var3);
        this.field4008 = this.field4008 * var2 + var3 * var4;
        this.field4015 = var2 * var6 - (this.field4011 * var3);
        this.field4024 = this.field4024 * var2 + var3 * var5;
        this.field4011 = this.field4011 * var2 + var3 * var6;
        this.field4004 = var2 * var7 - (this.field4005 * var3);
        this.field4005 = this.field4005 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ho", name = "BA", descriptor = "(III[I)V")
    public final void method178(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg0 - this.field4004);
        field4023++;
        int var6 = (int) ((float) arg2 - this.field4029);
        int var7 = (int) ((float) arg1 - this.field4005);
        arg3[0] = (int) ((float) var6 * this.field3996 + (float) var5 * this.field4030 + (float) var7 * this.field4008);
        arg3[1] = (int) ((float) var6 * this.field4000 + (float) var5 * this.field4031 + (float) var7 * this.field4024);
        arg3[2] = (int) ((float) var6 * this.field4003 + (float) var5 * this.field4015 + (float) var7 * this.field4011);
    }
}
