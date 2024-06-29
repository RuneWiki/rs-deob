import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class446 extends class778 {

    @OriginalMember(owner = "client!hea", name = "T", descriptor = "Lde;")
    public static class558 field6003 = new class558("LIVE", "", "", 0);

    @OriginalMember(owner = "client!hea", name = "k", descriptor = "F")
    public float field5969;

    @OriginalMember(owner = "client!hea", name = "r", descriptor = "F")
    public float field5976;

    @OriginalMember(owner = "client!hea", name = "s", descriptor = "F")
    public float field5977;

    @OriginalMember(owner = "client!hea", name = "w", descriptor = "F")
    public float field5981;

    @OriginalMember(owner = "client!hea", name = "x", descriptor = "F")
    public float field5982;

    @OriginalMember(owner = "client!hea", name = "y", descriptor = "F")
    public float field5983;

    @OriginalMember(owner = "client!hea", name = "B", descriptor = "F")
    public float field5986;

    @OriginalMember(owner = "client!hea", name = "C", descriptor = "F")
    public float field5987;

    @OriginalMember(owner = "client!hea", name = "J", descriptor = "F")
    public float field5993;

    @OriginalMember(owner = "client!hea", name = "L", descriptor = "F")
    public float field5995;

    @OriginalMember(owner = "client!hea", name = "P", descriptor = "F")
    public float field5999;

    @OriginalMember(owner = "client!hea", name = "X", descriptor = "F")
    public float field6007;

    @OriginalMember(owner = "client!hea", name = "j", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!hea", name = "l", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!hea", name = "m", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!hea", name = "n", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!hea", name = "o", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!hea", name = "p", descriptor = "I")
    public static int field5974;

    @OriginalMember(owner = "client!hea", name = "q", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!hea", name = "t", descriptor = "I")
    public static int field5978;

    @OriginalMember(owner = "client!hea", name = "u", descriptor = "I")
    public static int field5979;

    @OriginalMember(owner = "client!hea", name = "v", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!hea", name = "z", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!hea", name = "A", descriptor = "I")
    public static int field5985;

    @OriginalMember(owner = "client!hea", name = "D", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!hea", name = "E", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!hea", name = "F", descriptor = "I")
    public static int field5990;

    @OriginalMember(owner = "client!hea", name = "G", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!hea", name = "I", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!hea", name = "K", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!hea", name = "M", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!hea", name = "N", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!hea", name = "O", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!hea", name = "Q", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!hea", name = "R", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!hea", name = "S", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!hea", name = "U", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!hea", name = "V", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!hea", name = "W", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!hea", name = "Y", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!hea", name = "Z", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!hea", name = "ab", descriptor = "Lhba;")
    public static class10 field6010;

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "(III[I)V", line = 3)
    public final void method134(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg0 - this.field5993);
        field5989++;
        int var6 = (int) ((float) arg1 - this.field5969);
        int var7 = (int) ((float) arg2 - this.field5995);
        arg3[0] = (int) ((float) var7 * this.field6007 + (float) var5 * this.field5987 + (float) var6 * this.field5986);
        arg3[2] = (int) ((float) var7 * this.field5977 + (float) var5 * this.field5999 + (float) var6 * this.field5981);
        arg3[1] = (int) ((float) var7 * this.field5983 + (float) var5 * this.field5976 + (float) var6 * this.field5982);
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(III[I)V", line = 18)
    public final void method132(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field5977 + (float) arg0 * this.field6007 + (float) arg1 * this.field5983 + this.field5995);
        arg3[1] = (int) ((float) arg2 * this.field5981 + (float) arg0 * this.field5986 + (float) arg1 * this.field5982 + this.field5969);
        arg3[0] = (int) ((float) arg2 * this.field5999 + (float) arg0 * this.field5987 + (float) arg1 * this.field5976 + this.field5993);
        field6002++;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIII)V", line = 28)
    public final void method133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5975++;
        float var7 = class655.field9026[arg3 & 0x3FFF];
        float var8 = class655.field9029[arg3 & 0x3FFF];
        float var9 = class655.field9026[arg4 & 0x3FFF];
        float var10 = class655.field9029[arg4 & 0x3FFF];
        float var11 = class655.field9026[arg5 & 0x3FFF];
        float var12 = class655.field9029[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field5983 = -var8;
        this.field5986 = -var9 * var12 + var10 * var13;
        this.field5977 = var7 * var9;
        this.field6007 = var7 * var10;
        this.field5976 = var7 * var12;
        this.field5981 = var9 * var13 + var10 * var12;
        this.field5982 = var7 * var11;
        this.field5999 = -var10 * var11 + var9 * var14;
        this.field5987 = var9 * var11 + var10 * var14;
        this.field5969 = (float) (-arg0) * this.field5986 - (float) arg1 * this.field5982 - ((float) arg2 * this.field5981);
        this.field5995 = (float) (-arg0) * this.field6007 - (float) arg1 * this.field5983 - (float) arg2 * this.field5977;
        this.field5993 = (float) (-arg0) * this.field5987 - ((float) arg1 * this.field5976) - (float) arg2 * this.field5999;
    }

    @OriginalMember(owner = "client!hea", name = "g", descriptor = "(I)V", line = 63)
    public final void method123(int arg0) {
        field5997++;
        float var2 = class655.field9026[arg0 & 0x3FFF];
        float var3 = class655.field9029[arg0 & 0x3FFF];
        float var4 = this.field5986;
        float var5 = this.field5982;
        float var6 = this.field5981;
        this.field5986 = var2 * var4 - this.field6007 * var3;
        float var7 = this.field5969;
        this.field6007 = this.field6007 * var2 + var3 * var4;
        this.field5982 = var2 * var5 - (this.field5983 * var3);
        this.field5981 = var2 * var6 - (this.field5977 * var3);
        this.field5983 = this.field5983 * var2 + var3 * var5;
        this.field5977 = this.field5977 * var2 + var3 * var6;
        this.field5969 = var2 * var7 - this.field5995 * var3;
        this.field5995 = this.field5995 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZB)V", line = 91)
    public static final void method2625(boolean arg0, byte arg1) {
        field5974++;
        class96 var2 = (class96) class477.field6625.method2725(37);
        if (arg1 != 110) {
            return;
        }
        while (var2 != null) {
            if (var2.field1260 != null) {
                class783.field10811.method3257(var2.field1260);
                var2.field1260 = null;
            }
            if (var2.field1272 != null) {
                class783.field10811.method3257(var2.field1272);
                var2.field1272 = null;
            }
            var2.method2219(13630);
            var2 = (class96) class477.field6625.method2726(-121);
        }
        if (!arg0) {
            return;
        }
        for (class96 var3 = (class96) class599.field8109.method2725(37); var3 != null; var3 = (class96) class599.field8109.method2726(arg1 - 226)) {
            if (var3.field1260 != null) {
                class783.field10811.method3257(var3.field1260);
                var3.field1260 = null;
            }
            var3.method2219(arg1 ^ 0x3550);
        }
        for (class96 var4 = (class96) class118.field1501.method2119(arg1 - 230); var4 != null; var4 = (class96) class118.field1501.method2111((byte) -126)) {
            if (var4.field1260 != null) {
                class783.field10811.method3257(var4.field1260);
                var4.field1260 = null;
            }
            var4.method2219(13630);
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(III[I)V", line = 157)
    public final void method135(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field5981 + (float) arg0 * this.field5986 + (float) arg1 * this.field5982);
        arg3[2] = (int) ((float) arg2 * this.field5977 + (float) arg0 * this.field6007 + (float) arg1 * this.field5983);
        field5996++;
        arg3[0] = (int) ((float) arg2 * this.field5999 + (float) arg0 * this.field5987 + (float) arg1 * this.field5976);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "([I)V", line = 169)
    public final void method124(int[] arg0) {
        field5968++;
        float var2 = (float) arg0[0] - this.field5993;
        float var3 = (float) arg0[1] - this.field5969;
        float var4 = (float) arg0[2] - this.field5995;
        arg0[0] = (int) (this.field6007 * var4 + this.field5987 * var2 + this.field5986 * var3);
        arg0[2] = (int) (this.field5977 * var4 + this.field5999 * var2 + this.field5981 * var3);
        arg0[1] = (int) (this.field5983 * var4 + this.field5982 * var3 + this.field5976 * var2);
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "()Lnh;", line = 186)
    public final class778 method136() {
        field5978++;
        class446 var1 = new class446();
        var1.field5983 = this.field5983;
        var1.field5986 = this.field5986;
        var1.field5995 = this.field5995;
        var1.field5982 = this.field5982;
        var1.field5976 = this.field5976;
        var1.field5993 = this.field5993;
        var1.field5977 = this.field5977;
        var1.field5981 = this.field5981;
        var1.field5969 = this.field5969;
        var1.field5999 = this.field5999;
        var1.field6007 = this.field6007;
        var1.field5987 = this.field5987;
        return var1;
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(III)V", line = 216)
    public final void method130(int arg0, int arg1, int arg2) {
        this.field5987 = this.field5982 = this.field5977 = 1.0F;
        field5991++;
        this.field5993 = arg0;
        this.field5995 = arg2;
        this.field5969 = arg1;
        this.field5986 = this.field6007 = this.field5976 = this.field5983 = this.field5999 = this.field5981 = 0.0F;
    }

    @OriginalMember(owner = "client!hea", name = "h", descriptor = "(I)V", line = 228)
    public final void method122(int arg0) {
        this.field5977 = 1.0F;
        field6004++;
        this.field5987 = this.field5982 = class655.field9026[arg0 & 0x3FFF];
        this.field5986 = class655.field9029[arg0 & 0x3FFF];
        this.field5976 = -this.field5986;
        this.field5999 = this.field5993 = this.field5981 = this.field5969 = this.field6007 = this.field5983 = this.field5995 = 0.0F;
    }

    @OriginalMember(owner = "client!hea", name = "i", descriptor = "(I)V", line = 243)
    public static void method2626(int arg0) {
        field6003 = null;
        field6010 = null;
        if (arg0 != 1) {
            field5979 = 18;
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILnh;)V", line = 254)
    public final void method2627(int arg0, class778 arg1) {
        field5971++;
        class446 var3 = (class446) arg1;
        this.field5987 = var3.field5987;
        this.field5999 = var3.field6007;
        this.field5976 = var3.field5986;
        if (arg0 > -101) {
            this.field5983 = -1.6710076F;
        }
        this.field6007 = var3.field5999;
        this.field5981 = var3.field5983;
        this.field5986 = var3.field5976;
        this.field5982 = var3.field5982;
        this.field5983 = var3.field5981;
        this.field5977 = var3.field5977;
        this.field5993 = -(this.field5999 * var3.field5995 + this.field5987 * var3.field5993 + this.field5976 * var3.field5969);
        this.field5969 = -(this.field5981 * var3.field5995 + this.field5986 * var3.field5993 + this.field5982 * var3.field5969);
        this.field5995 = -(this.field5977 * var3.field5995 + this.field6007 * var3.field5993 + this.field5983 * var3.field5969);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(III)V", line = 279)
    public final void method131(int arg0, int arg1, int arg2) {
        field6006++;
        this.field5969 += arg1;
        this.field5993 += arg0;
        this.field5995 += arg2;
    }

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "(I)V", line = 299)
    public final void method125(int arg0) {
        field5994++;
        float var2 = class655.field9026[arg0 & 0x3FFF];
        float var3 = class655.field9029[arg0 & 0x3FFF];
        float var4 = this.field5987;
        float var5 = this.field5976;
        float var6 = this.field5999;
        float var7 = this.field5993;
        this.field5987 = this.field6007 * var3 + var2 * var4;
        this.field6007 = this.field6007 * var2 - (var3 * var4);
        this.field5976 = this.field5983 * var3 + var2 * var5;
        this.field5983 = this.field5983 * var2 - (var3 * var5);
        this.field5999 = this.field5977 * var3 + var2 * var6;
        this.field5993 = this.field5995 * var3 + var2 * var7;
        this.field5977 = this.field5977 * var2 - (var3 * var6);
        this.field5995 = this.field5995 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lnh;)V", line = 329)
    public final void method141(class778 arg0) {
        field5985++;
        class446 var2 = (class446) arg0;
        this.field5999 = var2.field5999;
        this.field5976 = var2.field5976;
        this.field5977 = var2.field5977;
        this.field5982 = var2.field5982;
        this.field5986 = var2.field5986;
        this.field5981 = var2.field5981;
        this.field5969 = var2.field5969;
        this.field5987 = var2.field5987;
        this.field5983 = var2.field5983;
        this.field5995 = var2.field5995;
        this.field6007 = var2.field6007;
        this.field5993 = var2.field5993;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(FFBIFII)V", line = 353)
    public final void method2628(float arg0, float arg1, byte arg2, int arg3, float arg4, int arg5, int arg6) {
        field5973++;
        if (arg3 == 0) {
            this.field5987 = arg5;
            this.field5986 = this.field6007 = this.field5976 = this.field5983 = this.field5999 = this.field5981 = 0.0F;
            this.field5982 = arg6;
            this.field5977 = 1.0F;
        } else {
            float var8 = class655.field9026[arg3 & 0x3FFF];
            float var9 = class655.field9029[arg3 & 0x3FFF];
            this.field5986 = (float) arg5 * var9;
            this.field5987 = (float) arg5 * var8;
            this.field5976 = (float) arg6 * -var9;
            this.field5977 = 1.0F;
            this.field6007 = this.field5983 = this.field5999 = this.field5981 = 0.0F;
            this.field5982 = (float) arg6 * var8;
        }
        if (arg2 != 76) {
            this.field5981 = 0.8039789F;
        }
        this.field5995 = arg0;
        this.field5969 = arg4;
        this.field5993 = arg1;
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(I)V", line = 388)
    public final void method139(int arg0) {
        this.field5982 = 1.0F;
        field6008++;
        this.field5987 = this.field5977 = class655.field9026[arg0 & 0x3FFF];
        this.field5999 = class655.field9029[arg0 & 0x3FFF];
        this.field6007 = -this.field5999;
        this.field5976 = this.field5993 = this.field5986 = this.field5981 = this.field5969 = this.field5983 = this.field5995 = 0.0F;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Z)V", line = 402)
    public final void method2629(boolean arg0) {
        field6001++;
        this.field5983 = -this.field5983;
        if (arg0) {
            this.method138(-22);
        }
        this.field6007 = -this.field6007;
        this.field5977 = -this.field5977;
        this.field5986 = -this.field5986;
        this.field5969 = -this.field5969;
        this.field5981 = -this.field5981;
        this.field5982 = -this.field5982;
        this.field5995 = -this.field5995;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZFFFF[F)V", line = 422)
    public final void method2630(boolean arg0, float arg1, float arg2, float arg3, float arg4, float[] arg5) {
        field5980++;
        if (arg0) {
            method2631(null, true, 83);
        }
        float var8;
        float var9;
        float var10;
        if ((arg4 > 0.00390625F) || (arg4 < -0.00390625F)) {
            float var12 = -arg1 / arg4;
            var9 = this.field5986 * var12 + this.field5969;
            var8 = this.field6007 * var12 + this.field5995;
            var10 = this.field5987 * var12 + this.field5993;
        } else if ((arg2 > 0.00390625F) || (arg2 < -0.00390625F)) {
            float var11 = -arg1 / arg2;
            var10 = this.field5976 * var11 + this.field5993;
            var9 = this.field5982 * var11 + this.field5969;
            var8 = this.field5983 * var11 + this.field5995;
        } else {
            float var7 = -arg1 / arg3;
            var8 = this.field5977 * var7 + this.field5995;
            var9 = this.field5981 * var7 + this.field5969;
            var10 = this.field5999 * var7 + this.field5993;
        }
        arg5[2] = this.field5977 * arg3 + this.field6007 * arg4 + this.field5983 * arg2;
        arg5[1] = this.field5981 * arg3 + this.field5986 * arg4 + this.field5982 * arg2;
        arg5[0] = this.field5999 * arg3 + this.field5987 * arg4 + this.field5976 * arg2;
        arg5[3] = -(arg5[2] * var8 + arg5[0] * var10 + arg5[1] * var9);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 468)
    public static final void method2631(String arg0, boolean arg1, int arg2) {
        field6005++;
        int var3 = class235.field2787;
        int[] var4 = class75.field1040;
        boolean var5 = false;
        if (!arg1) {
            field5979 = -7;
        }
        for (int var6 = 0; var6 < var3; var6++) {
            class521 var7 = class61.field825[var4[var6]];
            if (var7 != null && class300.field3596 != var7 && var7.field7399 != null && var7.field7399.equalsIgnoreCase(arg0)) {
                if (arg2 == 1) {
                    class293.field3507++;
                    class336 var13 = class512.method3076(class580.field7903, class591.field8030, (byte) 116);
                    var13.field4150.method2408((byte) -45, 0);
                    var13.field4150.method2422(29933, var4[var6]);
                    class578.method3334(4, var13);
                } else if (arg2 == 4) {
                    class259.field3068++;
                    class336 var12 = class512.method3076(class435.field5742, class591.field8030, (byte) 105);
                    var12.field4150.method2420(2760, 0);
                    var12.field4150.method2369(-18090, var4[var6]);
                    class578.method3334(4, var12);
                } else if (arg2 == 5) {
                    class592.field8039++;
                    class336 var11 = class512.method3076(class336.field4152, class591.field8030, (byte) 68);
                    var11.field4150.method2397(-32403, 0);
                    var11.field4150.method2380((byte) -9, var4[var6]);
                    class578.method3334(4, var11);
                } else if (arg2 == 6) {
                    class517.field7283++;
                    class336 var10 = class512.method3076(class348.field4347, class591.field8030, (byte) 63);
                    var10.field4150.method2397(-32403, 0);
                    var10.field4150.method2422(29933, var4[var6]);
                    class578.method3334(4, var10);
                } else if (arg2 == 7) {
                    class668.field9174++;
                    class336 var8 = class512.method3076(class112.field1413, class591.field8030, (byte) 124);
                    var8.field4150.method2408((byte) -45, 0);
                    var8.field4150.method2380((byte) -9, var4[var6]);
                    class578.method3334(4, var8);
                } else if (arg2 == 9) {
                    class336 var9 = class512.method3076(class424.field5634, class591.field8030, (byte) 62);
                    var9.field4150.method2380((byte) -9, var4[var6]);
                    var9.field4150.method2420(2760, 0);
                    class578.method3334(4, var9);
                }
                var5 = true;
                break;
            }
        }
        if (!var5) {
            class619.method3512(class637.field8696.method3584(class770.field10592, true) + arg0, 4, false);
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)V", line = 571)
    public final void method138(int arg0) {
        field5970++;
        this.field5987 = 1.0F;
        this.field5982 = this.field5977 = class655.field9026[arg0 & 0x3FFF];
        this.field5983 = class655.field9029[arg0 & 0x3FFF];
        this.field5976 = this.field5999 = this.field5993 = this.field5986 = this.field5969 = this.field6007 = this.field5995 = 0.0F;
        this.field5981 = -this.field5983;
    }

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "(B)[F", line = 583)
    public final float[] method2632(byte arg0) {
        class126.field1593[12] = 0.0F;
        class126.field1593[10] = this.field5977;
        class126.field1593[2] = this.field6007;
        class126.field1593[1] = this.field5986;
        class126.field1593[9] = this.field5981;
        if (arg0 >= -25) {
            return null;
        }
        class126.field1593[6] = this.field5983;
        class126.field1593[13] = 0.0F;
        class126.field1593[14] = 0.0F;
        class126.field1593[0] = this.field5987;
        field5992++;
        class126.field1593[5] = this.field5982;
        class126.field1593[8] = this.field5999;
        class126.field1593[4] = this.field5976;
        return class126.field1593;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "()V", line = 606)
    public final void method128() {
        this.field5986 = this.field6007 = this.field5976 = this.field5983 = this.field5999 = this.field5981 = this.field5993 = this.field5969 = this.field5995 = 0.0F;
        this.field5987 = this.field5982 = this.field5977 = 1.0F;
        field5972++;
    }

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "(B)[F", line = 620)
    public final float[] method2633(byte arg0) {
        class126.field1593[2] = this.field6007;
        class126.field1593[4] = this.field5976;
        class126.field1593[5] = this.field5982;
        class126.field1593[12] = this.field5993;
        class126.field1593[9] = this.field5981;
        class126.field1593[10] = this.field5977;
        class126.field1593[8] = this.field5999;
        int var2 = 39 / ((arg0 + 67) / 59);
        class126.field1593[6] = this.field5983;
        class126.field1593[0] = this.field5987;
        class126.field1593[14] = this.field5995;
        class126.field1593[13] = this.field5969;
        field5998++;
        class126.field1593[1] = this.field5986;
        return class126.field1593;
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "()V", line = 641)
    public class446() {
        this.method128();
    }

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "(I)V", line = 655)
    public final void method126(int arg0) {
        field5984++;
        float var2 = class655.field9026[arg0 & 0x3FFF];
        float var3 = class655.field9029[arg0 & 0x3FFF];
        float var4 = this.field5987;
        float var5 = this.field5976;
        float var6 = this.field5999;
        this.field5987 = var2 * var4 - this.field5986 * var3;
        float var7 = this.field5993;
        this.field5976 = var2 * var5 - (this.field5982 * var3);
        this.field5986 = this.field5986 * var2 + var3 * var4;
        this.field5982 = this.field5982 * var2 + var3 * var5;
        this.field5999 = var2 * var6 - this.field5981 * var3;
        this.field5981 = this.field5981 * var2 + var3 * var6;
        this.field5993 = var2 * var7 - this.field5969 * var3;
        this.field5969 = this.field5969 * var2 + var3 * var7;
    }
}
