import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class190 extends class118 {

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    private int field3064;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    private int field3073;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    private int field3071;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    private int field3067;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    private int field3066;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    private int field3072;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    private int field3078;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    private int field3076;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "S")
    public static short field3069 = 205;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "[I")
    public static int[] field3075 = new int[100];

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field3077 = 0;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "[I")
    public static int[] field3080 = new int[32];

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V")
    public final void method1(int arg0, int arg1, int arg2) {
        ++field3079;
        if (arg1 >= -40) {
            method1347(44);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method1347(int arg0) {
        if (arg0 != -20689) {
            method1349(-120);
        }
        field3080 = null;
        field3075 = null;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Lqi;")
    public static final class232 method1348(int arg0) {
        ++field3068;
        byte[] var1 = class70.field1192[0];
        int var2 = class60.field976[arg0] * class246.field3916[0];
        class232 var6;
        if (class84.field1389[0]) {
            int[] var3 = new int[var2];
            byte[] var4 = class187.field3044[0];
            for (int var5 = 0; var2 > var5; ++var5) {
                var3[var5] = class173.method1263(class51.method359(var4[var5], 255) << 24, class243.field3870[class51.method359(var1[var5], 255)]);
            }
            var6 = new class200(class255.field4128, class111.field1749, class273.field4380[0], class314.field5058[0], class246.field3916[0], class60.field976[0], var3);
        } else {
            int[] var7 = new int[var2];
            for (int var8 = 0; ~var2 < ~var8; ++var8) {
                var7[var8] = class243.field3870[class51.method359(var1[var8], 255)];
            }
            var6 = new class232(class255.field4128, class111.field1749, class273.field4380[0], class314.field5058[0], class246.field3916[0], class60.field976[0], var7);
        }
        class28.method156(-27424);
        return var6;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3064 = arg7;
        this.field3073 = arg6;
        this.field3071 = arg2;
        this.field3067 = arg1;
        this.field3066 = arg3;
        this.field3072 = arg4;
        this.field3078 = arg5;
        this.field3076 = arg0;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
    public static final void method1349(int arg0) {
        ++field3070;
        class69.field1145 = 0;
        class244.field3873 = 0;
        class115.method820(true);
        class63.method427((byte) -100);
        class70.method482((byte) -123);
        for (int var1 = 0; var1 < class244.field3873; ++var1) {
            int var3 = class108.field1724[var1];
            if (~class29.field360 != ~class12.field127[var3].field695) {
                if (class12.field127[var3].field2056.method1706((byte) 115)) {
                    class298.method1971((byte) 35, class12.field127[var3]);
                }
                class12.field127[var3].method927(true, (class253) null);
                class12.field127[var3] = null;
            }
        }
        if (arg0 > -54) {
            method1347(107);
        }
        if (~class47.field793 != ~class131.field2053.field2568) {
            throw new RuntimeException("gnp1 pos:" + class131.field2053.field2568 + " psize:" + class47.field793);
        } else {
            for (int var2 = 0; class246.field3912 > var2; ++var2) {
                if (class12.field127[class184.field3020[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class246.field3912);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(III)V")
    public final void method4(int arg0, int arg1, int arg2) {
        ++field3065;
        int var4 = this.field3076 * arg2 >> 12;
        int var5 = this.field3071 * arg2 >> 12;
        if (arg0 != 1207757217) {
            method1348(33);
        }
        int var6 = this.field3067 * arg1 >> 12;
        int var7 = this.field3073 * arg2 >> 12;
        int var8 = this.field3072 * arg2 >> 12;
        int var9 = this.field3078 * arg1 >> 12;
        int var10 = this.field3064 * arg1 >> 12;
        int var11 = this.field3066 * arg1 >> 12;
        class279.method1881(true, var6, var7, var10, var4, super.field1898, var9, var5, var8, var11);
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(III)V")
    public final void method2(int arg0, int arg1, int arg2) {
        ++field3063;
        if (arg2 != -6211) {
            this.method4(118, -25, 61);
        }
    }
}
