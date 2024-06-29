import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class138 extends class414 {

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
    public static int field1982 = 2;

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "Ljp;")
    public static class236 field1986 = new class236(8);

    @OriginalMember(owner = "client!ik", name = "L", descriptor = "[I")
    public static int[] field1994 = new int[25];

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "F")
    public float field1963;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "F")
    public float field1964;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "F")
    public float field1965;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "F")
    public float field1970;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "F")
    public float field1973;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "F")
    public float field1975;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "F")
    public float field1977;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "F")
    public float field1979;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "F")
    public float field1980;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "F")
    public float field1987;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "F")
    public float field1988;

    @OriginalMember(owner = "client!ik", name = "K", descriptor = "F")
    public float field1993;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!ik", name = "Q", descriptor = "(IIIIII)V")
    public final void method958(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1981++;
        float var7 = class73.field1095[arg3 & 0x3FFF];
        float var8 = class73.field1103[arg3 & 0x3FFF];
        float var9 = class73.field1095[arg4 & 0x3FFF];
        float var10 = class73.field1103[arg4 & 0x3FFF];
        float var11 = class73.field1095[arg5 & 0x3FFF];
        float var12 = class73.field1103[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field1970 = var7 * var11;
        this.field1977 = var9 * var11 + var10 * var14;
        this.field1965 = var9 * var13 + var10 * var12;
        this.field1979 = var7 * var12;
        this.field1988 = var7 * var10;
        this.field1975 = -var8;
        this.field1987 = -var10 * var11 + var9 * var14;
        this.field1963 = var7 * var9;
        this.field1973 = -var9 * var12 + var10 * var13;
        this.field1980 = (float) (-arg0) * this.field1988 - ((float) arg1 * this.field1975) - (float) arg2 * this.field1963;
        this.field1993 = (float) (-arg0) * this.field1973 - (float) arg1 * this.field1970 - (float) arg2 * this.field1965;
        this.field1964 = (float) (-arg0) * this.field1977 - ((float) arg1 * this.field1979) - (float) arg2 * this.field1987;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III[I)V")
    public final void method968(int arg0, int arg1, int arg2, int[] arg3) {
        field1966++;
        arg3[2] = (int) ((float) arg2 * this.field1963 + (float) arg0 * this.field1988 + (float) arg1 * this.field1975 + this.field1980);
        arg3[1] = (int) ((float) arg2 * this.field1965 + (float) arg0 * this.field1973 + (float) arg1 * this.field1970 + this.field1993);
        arg3[0] = (int) ((float) arg2 * this.field1987 + (float) arg0 * this.field1977 + (float) arg1 * this.field1979 + this.field1964);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "()Lia;")
    public final class414 method962() {
        field1990++;
        class138 var1 = new class138();
        var1.field1988 = this.field1988;
        var1.field1980 = this.field1980;
        var1.field1963 = this.field1963;
        var1.field1965 = this.field1965;
        var1.field1975 = this.field1975;
        var1.field1973 = this.field1973;
        var1.field1964 = this.field1964;
        var1.field1979 = this.field1979;
        var1.field1993 = this.field1993;
        var1.field1970 = this.field1970;
        var1.field1987 = this.field1987;
        var1.field1977 = this.field1977;
        return var1;
    }

    @OriginalMember(owner = "client!ik", name = "HA", descriptor = "()V")
    public final void method964() {
        this.field1977 = this.field1970 = this.field1963 = 1.0F;
        this.field1973 = this.field1988 = this.field1979 = this.field1975 = this.field1987 = this.field1965 = this.field1964 = this.field1993 = this.field1980 = 0.0F;
        field1972++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZZ)Z")
    public static boolean method980(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ik", name = "ma", descriptor = "(I)V")
    public final void method969(int arg0) {
        field1989++;
        this.field1963 = 1.0F;
        this.field1977 = this.field1970 = class73.field1095[arg0 & 0x3FFF];
        this.field1973 = class73.field1103[arg0 & 0x3FFF];
        this.field1987 = this.field1964 = this.field1965 = this.field1993 = this.field1988 = this.field1975 = this.field1980 = 0.0F;
        this.field1979 = -this.field1973;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)[F")
    public final float[] method981(int arg0) {
        class256.field3380[6] = this.field1975;
        class256.field3380[12] = 0.0F;
        class256.field3380[9] = this.field1965;
        class256.field3380[5] = this.field1970;
        class256.field3380[14] = 0.0F;
        class256.field3380[2] = this.field1988;
        class256.field3380[4] = this.field1979;
        class256.field3380[13] = 0.0F;
        class256.field3380[0] = this.field1977;
        class256.field3380[1] = this.field1973;
        class256.field3380[10] = this.field1963;
        class256.field3380[8] = this.field1987;
        field1962++;
        return arg0 == -28545 ? class256.field3380 : null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILia;)V")
    public final void method982(int arg0, class414 arg1) {
        field1992++;
        class138 var3 = (class138) arg1;
        this.field1979 = var3.field1973;
        this.field1987 = var3.field1988;
        this.field1977 = var3.field1977;
        this.field1988 = var3.field1987;
        this.field1970 = var3.field1970;
        this.field1965 = var3.field1975;
        this.field1973 = var3.field1979;
        this.field1964 = -(this.field1987 * var3.field1980 + this.field1979 * var3.field1993 + this.field1977 * var3.field1964);
        this.field1975 = var3.field1965;
        this.field1963 = var3.field1963;
        if (arg0 != 0) {
            this.method967(34);
        }
        this.field1993 = -(this.field1965 * var3.field1980 + this.field1973 * var3.field1964 + this.field1970 * var3.field1993);
        this.field1980 = -(this.field1963 * var3.field1980 + this.field1988 * var3.field1964 + this.field1975 * var3.field1993);
    }

    @OriginalMember(owner = "client!ik", name = "X", descriptor = "([I)V")
    public final void method973(int[] arg0) {
        field1969++;
        float var2 = (float) arg0[0] - this.field1964;
        float var3 = (float) arg0[1] - this.field1993;
        float var4 = (float) arg0[2] - this.field1980;
        arg0[2] = (int) (this.field1963 * var4 + this.field1987 * var2 + this.field1965 * var3);
        arg0[0] = (int) (this.field1988 * var4 + this.field1977 * var2 + this.field1973 * var3);
        arg0[1] = (int) (this.field1975 * var4 + this.field1979 * var2 + this.field1970 * var3);
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V")
    public final void method961(int arg0) {
        field1983++;
        float var2 = class73.field1095[arg0 & 0x3FFF];
        float var3 = class73.field1103[arg0 & 0x3FFF];
        float var4 = this.field1977;
        float var5 = this.field1979;
        float var6 = this.field1987;
        this.field1977 = this.field1988 * var3 + var2 * var4;
        float var7 = this.field1964;
        this.field1979 = this.field1975 * var3 + var2 * var5;
        this.field1988 = this.field1988 * var2 - var3 * var4;
        this.field1975 = this.field1975 * var2 - var3 * var5;
        this.field1987 = this.field1963 * var3 + var2 * var6;
        this.field1964 = this.field1980 * var3 + var2 * var7;
        this.field1963 = this.field1963 * var2 - (var3 * var6);
        this.field1980 = this.field1980 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!ik", name = "ba", descriptor = "(Lia;)V")
    public final void method960(class414 arg0) {
        field1985++;
        class138 var2 = (class138) arg0;
        this.field1963 = var2.field1963;
        this.field1980 = var2.field1980;
        this.field1965 = var2.field1965;
        this.field1977 = var2.field1977;
        this.field1964 = var2.field1964;
        this.field1970 = var2.field1970;
        this.field1973 = var2.field1973;
        this.field1988 = var2.field1988;
        this.field1979 = var2.field1979;
        this.field1993 = var2.field1993;
        this.field1975 = var2.field1975;
        this.field1987 = var2.field1987;
    }

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "(III[I)V")
    public final void method972(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field1963 + (float) arg0 * this.field1988 + (float) arg1 * this.field1975);
        arg3[1] = (int) ((float) arg2 * this.field1965 + (float) arg0 * this.field1973 + (float) arg1 * this.field1970);
        arg3[0] = (int) ((float) arg2 * this.field1987 + (float) arg0 * this.field1977 + (float) arg1 * this.field1979);
        field1971++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZFIIFF)V")
    public final void method983(int arg0, boolean arg1, float arg2, int arg3, int arg4, float arg5, float arg6) {
        field1967++;
        if (arg0 == 0) {
            this.field1973 = this.field1988 = this.field1979 = this.field1975 = this.field1987 = this.field1965 = 0.0F;
            this.field1963 = 1.0F;
            this.field1977 = arg4;
            this.field1970 = arg3;
        } else {
            float var8 = class73.field1095[arg0 & 0x3FFF];
            float var9 = class73.field1103[arg0 & 0x3FFF];
            this.field1970 = (float) arg3 * var8;
            this.field1977 = (float) arg4 * var8;
            this.field1988 = this.field1975 = this.field1987 = this.field1965 = 0.0F;
            this.field1979 = (float) arg3 * -var9;
            this.field1963 = 1.0F;
            this.field1973 = (float) arg4 * var9;
        }
        if (!arg1) {
            this.field1980 = arg5;
            this.field1964 = arg6;
            this.field1993 = arg2;
        }
    }

    @OriginalMember(owner = "client!ik", name = "na", descriptor = "(I)V")
    public final void method966(int arg0) {
        field1974++;
        float var2 = class73.field1095[arg0 & 0x3FFF];
        float var3 = class73.field1103[arg0 & 0x3FFF];
        float var4 = this.field1973;
        float var5 = this.field1970;
        float var6 = this.field1965;
        float var7 = this.field1993;
        this.field1973 = var2 * var4 - (this.field1988 * var3);
        this.field1970 = var2 * var5 - (this.field1975 * var3);
        this.field1988 = this.field1988 * var2 + var3 * var4;
        this.field1965 = var2 * var6 - (this.field1963 * var3);
        this.field1975 = this.field1975 * var2 + var3 * var5;
        this.field1963 = this.field1963 * var2 + var3 * var6;
        this.field1993 = var2 * var7 - (this.field1980 * var3);
        this.field1980 = this.field1980 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)[F")
    public final float[] method984(byte arg0) {
        int var2 = -3 / ((41 - arg0) / 52);
        class256.field3380[5] = this.field1970;
        class256.field3380[13] = this.field1993;
        class256.field3380[12] = this.field1964;
        class256.field3380[8] = this.field1987;
        class256.field3380[0] = this.field1977;
        class256.field3380[10] = this.field1963;
        class256.field3380[1] = this.field1973;
        field1968++;
        class256.field3380[14] = this.field1980;
        class256.field3380[4] = this.field1979;
        class256.field3380[2] = this.field1988;
        class256.field3380[6] = this.field1975;
        class256.field3380[9] = this.field1965;
        return class256.field3380;
    }

    @OriginalMember(owner = "client!ik", name = "YA", descriptor = "(I)V")
    public final void method967(int arg0) {
        this.field1977 = 1.0F;
        field1976++;
        this.field1970 = this.field1963 = class73.field1095[arg0 & 0x3FFF];
        this.field1975 = class73.field1103[arg0 & 0x3FFF];
        this.field1979 = this.field1987 = this.field1964 = this.field1973 = this.field1993 = this.field1988 = this.field1980 = 0.0F;
        this.field1965 = -this.field1975;
    }

    @OriginalMember(owner = "client!ik", name = "ZA", descriptor = "(III)V")
    public final void method970(int arg0, int arg1, int arg2) {
        this.field1980 += arg2;
        this.field1993 += arg1;
        field1978++;
        this.field1964 += arg0;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V")
    public static final void method985(byte arg0) {
        field1995++;
        if (arg0 != -54) {
            method985((byte) 91);
        }
        for (class527 var1 = (class527) class264.field3485.method1771(118); var1 != null; var1 = (class527) class264.field3485.method1774((byte) -23)) {
            var1.method3096();
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
    public static void method986(int arg0) {
        field1994 = null;
        field1986 = null;
        if (arg0 != 8) {
            field1986 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
    public class138() {
        this.method964();
    }

    @OriginalMember(owner = "client!ik", name = "O", descriptor = "(I)V")
    public final void method959(int arg0) {
        field1984++;
        this.field1970 = 1.0F;
        this.field1977 = this.field1963 = class73.field1095[arg0 & 0x3FFF];
        this.field1987 = class73.field1103[arg0 & 0x3FFF];
        this.field1979 = this.field1964 = this.field1973 = this.field1965 = this.field1993 = this.field1975 = this.field1980 = 0.0F;
        this.field1988 = -this.field1987;
    }

    @OriginalMember(owner = "client!ik", name = "R", descriptor = "(III)V")
    public final void method971(int arg0, int arg1, int arg2) {
        this.field1977 = this.field1970 = this.field1963 = 1.0F;
        this.field1980 = arg2;
        this.field1964 = arg0;
        this.field1993 = arg1;
        this.field1973 = this.field1988 = this.field1979 = this.field1975 = this.field1987 = this.field1965 = 0.0F;
        field1991++;
    }
}
