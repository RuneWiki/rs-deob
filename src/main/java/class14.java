import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class14 extends class86 {

    @OriginalMember(owner = "client!al", name = "L", descriptor = "I")
    public static int field233 = 0;

    @OriginalMember(owner = "client!al", name = "K", descriptor = "I")
    public static int field232 = 0;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!al", name = "P", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!al", name = "Q", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!al", name = "N", descriptor = "[I")
    public static int[] field235;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(IB)[[I", line = 9)
    public final int[][] method156(int arg0, byte arg1) {
        field238++;
        int[][] var3 = this.field1227.method2025(false, arg0);
        if (arg1 > -126) {
            field235 = (int[]) null;
        }
        if (this.field1227.field4277) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class93.field1424; var7++) {
                this.method159(arg0, var7, 91);
                int[][] var8 = this.method782(class114.field1751, 0, 1);
                var4[var7] = var8[0][class221.field3430];
                var5[var7] = var8[1][class221.field3430];
                var6[var7] = var8[2][class221.field3430];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V", line = 54)
    public class14() {
        super(1, false);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZLug;)V", line = 58)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        if (arg1) {
            this.method158(-42, 78);
        }
        field236++;
        if (arg0 == 0) {
            this.field1228 = arg2.method281(-128) == 1;
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(II)[I", line = 78)
    public final int[] method158(int arg0, int arg1) {
        field237++;
        if (arg1 < 7) {
            field235 = (int[]) null;
        }
        int[] var3 = this.field1225.method1914(arg0, 109);
        if (this.field1225.field3995) {
            for (int var4 = 0; var4 < class93.field1424; var4++) {
                this.method159(arg0, var4, 80);
                int[] var5 = this.method774(0, class114.field1751, 0);
                var3[var4] = var5[class221.field3430];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(III)V", line = 116)
    private final void method159(int arg0, int arg1, int arg2) {
        int var4 = class135.field2257[arg0];
        if (arg2 <= 66) {
            return;
        }
        int var5 = class347.field5515[arg1];
        float var6 = (float) Math.atan2((double) (var5 - 2048), (double) (var4 - 2048));
        if (-3.141592653589793D <= (double) var6 && -2.356194490192345D >= (double) var6) {
            class221.field3430 = arg1;
            class114.field1751 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && -2.356194490192345D <= (double) var6) {
            class221.field3430 = arg0;
            class114.field1751 = arg1;
        } else if (-0.7853981633974483D >= (double) var6 && -1.5707963267948966D <= (double) var6) {
            class114.field1751 = arg1;
            class221.field3430 = class93.field1424 - arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class221.field3430 = arg1;
            class114.field1751 = class181.field2836 - arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class221.field3430 = class93.field1424 - arg1;
            class114.field1751 = class181.field2836 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class114.field1751 = class181.field2836 - arg1;
            class221.field3430 = class93.field1424 - arg0;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class114.field1751 = class181.field2836 - arg1;
            class221.field3430 = arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class221.field3430 = class93.field1424 - arg1;
            class114.field1751 = arg0;
        }
        class114.field1751 &= class280.field4324;
        class221.field3430 &= class313.field4848;
        field234++;
    }

    @OriginalMember(owner = "client!al", name = "g", descriptor = "(I)V", line = 190)
    public static void method160(int arg0) {
        if (arg0 != -13543) {
            method160(46);
        }
        field235 = null;
    }
}
