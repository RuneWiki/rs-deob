import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class154 extends class389 {

    @OriginalMember(owner = "client!np", name = "m", descriptor = "J")
    public static long field1953 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!np", name = "k", descriptor = "I")
    public static int field1951 = 0;

    @OriginalMember(owner = "client!np", name = "i", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!np", name = "n", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!np", name = "o", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "Lnp;")
    public class154 field1950;

    @OriginalMember(owner = "client!np", name = "p", descriptor = "Lnp;")
    public class154 field1956;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(I)V", line = 3)
    public final void method1111(int arg0) {
        field1955++;
        if (this.field1950 != null && arg0 <= -28) {
            this.field1950.field1956 = this.field1956;
            this.field1956.field1950 = this.field1950;
            this.field1950 = null;
            this.field1956 = null;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V", line = 20)
    public static final void method1112(byte arg0) {
        class183.field2357++;
        field1952++;
        class11 var1 = class130.method931(class649.field9035, (byte) 54, class519.field6795);
        var1.field114.method2352(true, class62.method528(2));
        var1.field114.method2386(class519.field6796, 1103587288);
        var1.field114.method2386(class461.field6047, 1103587288);
        var1.field114.method2352(true, class260.field3509.field1287);
        class100.method760(var1, 84);
        if (arg0 >= -87) {
            field1951 = 96;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)I", line = 40)
    public static final int method1113(int arg0, int arg1) {
        field1954++;
        if (arg0 <= 58) {
            field1951 = 74;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIIIBF[FI)V", line = 57)
    public static final void method1114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, float arg7, float[] arg8, int arg9) {
        int var10 = arg3 - arg1;
        int var11 = arg4 - arg2;
        int var12 = arg9 - arg0;
        field1949++;
        float var13 = arg8[2] * (float) var11 + arg8[0] * (float) var12 + arg8[1] * (float) var10;
        float var14 = arg8[5] * (float) var11 + arg8[4] * (float) var10 + arg8[3] * (float) var12;
        float var15 = arg8[8] * (float) var11 + arg8[7] * (float) var10 + arg8[6] * (float) var12;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg6 <= 76) {
            method1114(0, 91, -64, 95, 109, -95, (byte) -82, 0.06456513F, null, -93);
        }
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg7 + 0.5F;
        if (arg5 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg5 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg5 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class549.field7129 = var18;
        class5.field37 = var17;
    }
}
