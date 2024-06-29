import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class159 extends class491 {

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field2063 = 100;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "F")
    public float field2058;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "F")
    public float field2062;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "F")
    public float field2064;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "F")
    public float field2065;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "F")
    public float field2066;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "F")
    public float field2070;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "F")
    public float field2071;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "F")
    public float field2072;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "F")
    public float field2075;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "F")
    public float field2080;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "F")
    public float field2084;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "F")
    public float field2086;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "Loj;")
    public static class543 field2060;

    @OriginalMember(owner = "client!db", name = "YA", descriptor = "([I)V")
    public final void method901(int[] arg0) {
        field2069++;
        float var2 = (float) arg0[0] - this.field2084;
        float var3 = (float) arg0[1] - this.field2071;
        float var4 = (float) arg0[2] - this.field2064;
        arg0[2] = (int) (this.field2086 * var4 + this.field2072 * var2 + this.field2062 * var3);
        arg0[0] = (int) (this.field2070 * var4 + this.field2075 * var2 + this.field2066 * var3);
        arg0[1] = (int) (this.field2058 * var4 + this.field2080 * var2 + this.field2065 * var3);
    }

    @OriginalMember(owner = "client!db", name = "J", descriptor = "(I)V")
    public final void method902(int arg0) {
        this.field2086 = 1.0F;
        field2061++;
        this.field2075 = this.field2065 = class447.field5740[arg0 & 0x3FFF];
        this.field2066 = class447.field5738[arg0 & 0x3FFF];
        this.field2072 = this.field2084 = this.field2062 = this.field2071 = this.field2070 = this.field2058 = this.field2064 = 0.0F;
        this.field2080 = -this.field2066;
    }

    @OriginalMember(owner = "client!db", name = "U", descriptor = "(III)V")
    public final void method903(int arg0, int arg1, int arg2) {
        this.field2071 += arg1;
        this.field2084 += arg0;
        this.field2064 += arg2;
        field2078++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BFFF[FF)V")
    public final void method904(byte arg0, float arg1, float arg2, float arg3, float[] arg4, float arg5) {
        field2091++;
        arg4[2] = this.field2086 * arg3 + this.field2070 * arg2 + this.field2058 * arg1;
        arg4[0] = this.field2072 * arg3 + this.field2080 * arg1 + this.field2075 * arg2;
        float var8;
        float var9;
        float var10;
        if ((arg2 > 0.00390625F) || (arg2 < -0.00390625F)) {
            float var12 = -arg5 / arg2;
            var8 = this.field2066 * var12 + this.field2071;
            var9 = this.field2075 * var12 + this.field2084;
            var10 = this.field2070 * var12 + this.field2064;
        } else if ((arg1 > 0.00390625F) || (arg1 < -0.00390625F)) {
            float var11 = -arg5 / arg1;
            var9 = this.field2080 * var11 + this.field2084;
            var8 = this.field2065 * var11 + this.field2071;
            var10 = this.field2058 * var11 + this.field2064;
        } else {
            float var7 = -arg5 / arg3;
            var8 = this.field2062 * var7 + this.field2071;
            var9 = this.field2072 * var7 + this.field2084;
            var10 = this.field2086 * var7 + this.field2064;
        }
        if (arg0 <= 4) {
            this.field2066 = 0.23876107F;
        }
        arg4[1] = this.field2062 * arg3 + this.field2066 * arg2 + this.field2065 * arg1;
        arg4[3] = -(arg4[2] * var10 + arg4[1] * var8 + arg4[0] * var9);
    }

    @OriginalMember(owner = "client!db", name = "wa", descriptor = "(III[I)V")
    public final void method905(int arg0, int arg1, int arg2, int[] arg3) {
        field2067++;
        arg3[1] = (int) ((float) arg2 * this.field2062 + (float) arg0 * this.field2066 + (float) arg1 * this.field2065);
        arg3[2] = (int) ((float) arg2 * this.field2086 + (float) arg0 * this.field2070 + (float) arg1 * this.field2058);
        arg3[0] = (int) ((float) arg2 * this.field2072 + (float) arg0 * this.field2075 + (float) arg1 * this.field2080);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III[I)V")
    public final void method906(int arg0, int arg1, int arg2, int[] arg3) {
        field2092++;
        arg3[1] = (int) ((float) arg2 * this.field2062 + (float) arg0 * this.field2066 + (float) arg1 * this.field2065 + this.field2071);
        arg3[0] = (int) ((float) arg2 * this.field2072 + (float) arg0 * this.field2075 + (float) arg1 * this.field2080 + this.field2084);
        arg3[2] = (int) ((float) arg2 * this.field2086 + (float) arg0 * this.field2070 + (float) arg1 * this.field2058 + this.field2064);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()Lq;")
    public final class491 method907() {
        field2073++;
        class159 var1 = new class159();
        var1.field2075 = this.field2075;
        var1.field2058 = this.field2058;
        var1.field2066 = this.field2066;
        var1.field2071 = this.field2071;
        var1.field2080 = this.field2080;
        var1.field2084 = this.field2084;
        var1.field2086 = this.field2086;
        var1.field2065 = this.field2065;
        var1.field2070 = this.field2070;
        var1.field2062 = this.field2062;
        var1.field2064 = this.field2064;
        var1.field2072 = this.field2072;
        return var1;
    }

    @OriginalMember(owner = "client!db", name = "o", descriptor = "(I)V")
    public final void method908(int arg0) {
        this.field2065 = 1.0F;
        field2077++;
        this.field2075 = this.field2086 = class447.field5740[arg0 & 0x3FFF];
        this.field2072 = class447.field5738[arg0 & 0x3FFF];
        this.field2070 = -this.field2072;
        this.field2080 = this.field2084 = this.field2066 = this.field2062 = this.field2071 = this.field2058 = this.field2064 = 0.0F;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)[F")
    public final float[] method909(boolean arg0) {
        class280.field3519[2] = this.field2070;
        class280.field3519[9] = this.field2062;
        if (!arg0) {
            this.field2070 = 0.15859887F;
        }
        field2059++;
        class280.field3519[14] = this.field2064;
        class280.field3519[12] = this.field2084;
        class280.field3519[0] = this.field2075;
        class280.field3519[10] = this.field2086;
        class280.field3519[8] = this.field2072;
        class280.field3519[6] = this.field2058;
        class280.field3519[1] = this.field2066;
        class280.field3519[5] = this.field2065;
        class280.field3519[4] = this.field2080;
        class280.field3519[13] = this.field2071;
        return class280.field3519;
    }

    @OriginalMember(owner = "client!db", name = "ZA", descriptor = "(I)V")
    public final void method910(int arg0) {
        field2089++;
        float var2 = class447.field5740[arg0 & 0x3FFF];
        float var3 = class447.field5738[arg0 & 0x3FFF];
        float var4 = this.field2075;
        float var5 = this.field2080;
        float var6 = this.field2072;
        this.field2075 = this.field2070 * var3 + var2 * var4;
        float var7 = this.field2084;
        this.field2070 = this.field2070 * var2 - (var3 * var4);
        this.field2080 = this.field2058 * var3 + var2 * var5;
        this.field2058 = this.field2058 * var2 - var3 * var5;
        this.field2072 = this.field2086 * var3 + var2 * var6;
        this.field2086 = this.field2086 * var2 - (var3 * var6);
        this.field2084 = this.field2064 * var3 + var2 * var7;
        this.field2064 = this.field2064 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!db", name = "oa", descriptor = "(I)V")
    public final void method911(int arg0) {
        field2083++;
        this.field2075 = 1.0F;
        this.field2065 = this.field2086 = class447.field5740[arg0 & 0x3FFF];
        this.field2058 = class447.field5738[arg0 & 0x3FFF];
        this.field2080 = this.field2072 = this.field2084 = this.field2066 = this.field2071 = this.field2070 = this.field2064 = 0.0F;
        this.field2062 = -this.field2058;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method912(int arg0, int arg1, boolean arg2) {
        field2068++;
        if (arg2) {
            return true;
        } else {
            return (arg1 & 0x22) != 0;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)V")
    public final void method913(boolean arg0) {
        this.field2065 = -this.field2065;
        this.field2071 = -this.field2071;
        if (arg0) {
            this.method910(4);
        }
        this.field2062 = -this.field2062;
        this.field2064 = -this.field2064;
        field2074++;
        this.field2058 = -this.field2058;
        this.field2070 = -this.field2070;
        this.field2066 = -this.field2066;
        this.field2086 = -this.field2086;
    }

    @OriginalMember(owner = "client!db", name = "NA", descriptor = "(III)V")
    public final void method914(int arg0, int arg1, int arg2) {
        field2057++;
        this.field2064 = arg2;
        this.field2066 = this.field2070 = this.field2080 = this.field2058 = this.field2072 = this.field2062 = 0.0F;
        this.field2075 = this.field2065 = this.field2086 = 1.0F;
        this.field2071 = arg1;
        this.field2084 = arg0;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
    public static void method915(int arg0) {
        if (arg0 != 3790) {
            method915(8);
        }
        field2060 = null;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)[F")
    public final float[] method916(int arg0) {
        if (arg0 != -1801) {
            return null;
        }
        class280.field3519[4] = this.field2080;
        class280.field3519[9] = this.field2062;
        class280.field3519[12] = 0.0F;
        class280.field3519[14] = 0.0F;
        field2087++;
        class280.field3519[10] = this.field2086;
        class280.field3519[1] = this.field2066;
        class280.field3519[6] = this.field2058;
        class280.field3519[5] = this.field2065;
        class280.field3519[2] = this.field2070;
        class280.field3519[13] = 0.0F;
        class280.field3519[0] = this.field2075;
        class280.field3519[8] = this.field2072;
        return class280.field3519;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IBFIFFI)V")
    public final void method917(int arg0, byte arg1, float arg2, int arg3, float arg4, float arg5, int arg6) {
        if (arg3 == 0) {
            this.field2066 = this.field2070 = this.field2080 = this.field2058 = this.field2072 = this.field2062 = 0.0F;
            this.field2065 = arg6;
            this.field2075 = arg0;
            this.field2086 = 1.0F;
        } else {
            float var8 = class447.field5740[arg3 & 0x3FFF];
            float var9 = class447.field5738[arg3 & 0x3FFF];
            this.field2075 = (float) arg0 * var8;
            this.field2080 = (float) arg6 * -var9;
            this.field2086 = 1.0F;
            this.field2065 = (float) arg6 * var8;
            this.field2066 = (float) arg0 * var9;
            this.field2070 = this.field2058 = this.field2072 = this.field2062 = 0.0F;
        }
        field2076++;
        if (arg1 >= -1) {
            this.method914(-64, 118, -4);
        }
        this.field2071 = arg4;
        this.field2064 = arg5;
        this.field2084 = arg2;
    }

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "()V")
    public final void method918() {
        this.field2066 = this.field2070 = this.field2080 = this.field2058 = this.field2072 = this.field2062 = this.field2084 = this.field2071 = this.field2064 = 0.0F;
        this.field2075 = this.field2065 = this.field2086 = 1.0F;
        field2079++;
    }

    @OriginalMember(owner = "client!db", name = "M", descriptor = "(Lq;)V")
    public final void method919(class491 arg0) {
        field2093++;
        class159 var2 = (class159) arg0;
        this.field2075 = var2.field2075;
        this.field2070 = var2.field2070;
        this.field2066 = var2.field2066;
        this.field2072 = var2.field2072;
        this.field2058 = var2.field2058;
        this.field2086 = var2.field2086;
        this.field2084 = var2.field2084;
        this.field2080 = var2.field2080;
        this.field2065 = var2.field2065;
        this.field2062 = var2.field2062;
        this.field2071 = var2.field2071;
        this.field2064 = var2.field2064;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class159() {
        this.method918();
    }

    @OriginalMember(owner = "client!db", name = "na", descriptor = "(IIIIII)V")
    public final void method920(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2082++;
        float var7 = class447.field5740[arg3 & 0x3FFF];
        float var8 = class447.field5738[arg3 & 0x3FFF];
        float var9 = class447.field5740[arg4 & 0x3FFF];
        float var10 = class447.field5738[arg4 & 0x3FFF];
        float var11 = class447.field5740[arg5 & 0x3FFF];
        float var12 = class447.field5738[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field2062 = var9 * var13 + var10 * var12;
        this.field2070 = var7 * var10;
        this.field2066 = -var9 * var12 + var10 * var13;
        this.field2058 = -var8;
        this.field2072 = -var10 * var11 + var9 * var14;
        this.field2065 = var7 * var11;
        this.field2080 = var7 * var12;
        this.field2075 = var9 * var11 + var10 * var14;
        this.field2086 = var7 * var9;
        this.field2084 = (float) (-arg0) * this.field2075 - ((float) arg1 * this.field2080) - ((float) arg2 * this.field2072);
        this.field2064 = (float) (-arg0) * this.field2070 - (float) arg1 * this.field2058 - (float) arg2 * this.field2086;
        this.field2071 = (float) (-arg0) * this.field2066 - (float) arg1 * this.field2065 - ((float) arg2 * this.field2062);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lq;B)V")
    public final void method921(class491 arg0, byte arg1) {
        field2088++;
        class159 var3 = (class159) arg0;
        this.field2075 = var3.field2075;
        this.field2080 = var3.field2066;
        this.field2072 = var3.field2070;
        if (arg1 > -21) {
            return;
        }
        this.field2065 = var3.field2065;
        this.field2066 = var3.field2080;
        this.field2062 = var3.field2058;
        this.field2070 = var3.field2072;
        this.field2086 = var3.field2086;
        this.field2058 = var3.field2062;
        this.field2084 = -(this.field2072 * var3.field2064 + this.field2080 * var3.field2071 + this.field2075 * var3.field2084);
        this.field2071 = -(this.field2062 * var3.field2064 + this.field2066 * var3.field2084 + this.field2065 * var3.field2071);
        this.field2064 = -(this.field2086 * var3.field2064 + this.field2070 * var3.field2084 + this.field2058 * var3.field2071);
    }

    @OriginalMember(owner = "client!db", name = "w", descriptor = "(I)V")
    public final void method922(int arg0) {
        field2081++;
        float var2 = class447.field5740[arg0 & 0x3FFF];
        float var3 = class447.field5738[arg0 & 0x3FFF];
        float var4 = this.field2066;
        float var5 = this.field2065;
        float var6 = this.field2062;
        this.field2066 = var2 * var4 - (this.field2070 * var3);
        float var7 = this.field2071;
        this.field2065 = var2 * var5 - (this.field2058 * var3);
        this.field2070 = this.field2070 * var2 + var3 * var4;
        this.field2062 = var2 * var6 - this.field2086 * var3;
        this.field2058 = this.field2058 * var2 + var3 * var5;
        this.field2086 = this.field2086 * var2 + var3 * var6;
        this.field2071 = var2 * var7 - this.field2064 * var3;
        this.field2064 = this.field2064 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)Ljava/lang/String;")
    public static final String method923(byte arg0) {
        field2090++;
        int var1 = -123 % ((arg0 - 60) / 49);
        return class84.field1188 || class111.field1458 == null ? "" : class111.field1458.field1867;
    }

    @OriginalMember(owner = "client!db", name = "AA", descriptor = "(I)V")
    public final void method924(int arg0) {
        field2085++;
        float var2 = class447.field5740[arg0 & 0x3FFF];
        float var3 = class447.field5738[arg0 & 0x3FFF];
        float var4 = this.field2075;
        float var5 = this.field2080;
        float var6 = this.field2072;
        float var7 = this.field2084;
        this.field2075 = var2 * var4 - this.field2066 * var3;
        this.field2080 = var2 * var5 - (this.field2065 * var3);
        this.field2066 = this.field2066 * var2 + var3 * var4;
        this.field2072 = var2 * var6 - this.field2062 * var3;
        this.field2065 = this.field2065 * var2 + var3 * var5;
        this.field2084 = var2 * var7 - this.field2071 * var3;
        this.field2062 = this.field2062 * var2 + var3 * var6;
        this.field2071 = this.field2071 * var2 + var3 * var7;
    }
}
