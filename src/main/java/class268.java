import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class268 extends class346 {

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    private int field3971 = 4;

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "I")
    private int field3977 = 4;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "Lsj;")
    public static class248 field3967 = null;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    public static int field3974 = 0;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
    public static int field3975 = 0;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "Luh;")
    public static class414 field3965;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field3968;
        if (arg1 != 3) {
            this.field3977 = -121;
        }
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (super.field5152.field3004) {
            int var4 = class134.field1753 / this.field3971;
            int var5 = class370.field5474 / this.field3977;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method2294((byte) 54, class370.field5474 * var6 / var5, 0);
            } else {
                var7 = this.method2294((byte) 54, 0, 0);
            }
            for (int var8 = 0; class134.field1753 > var8; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class134.field1753 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
    public static void method1788(int arg0) {
        if (arg0 != -1) {
            field3973 = 112;
        }
        field3967 = null;
        field3965 = null;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)[[I")
    public final int[][] method287(int arg0, int arg1) {
        ++field3966;
        int[][] var3 = super.field5170.method2701(0, arg0);
        if (arg1 >= -3) {
            field3975 = 26;
        }
        if (super.field5170.field6288) {
            int var4 = class134.field1753 / this.field3971;
            int var5 = class370.field5474 / this.field3977;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method2293(0, 0, class370.field5474 * var6 / var5);
            } else {
                var7 = this.method2293(0, 0, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class134.field1753; ++var14) {
                int var15;
                if (~var4 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class134.field1753 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V")
    public static final void method1789(int arg0) {
        class373.field5499.method372(arg0 + 125);
        if (arg0 != 0) {
            method1788(116);
        }
        ++field3970;
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)V")
    public static final void method1790(int arg0) {
        ++field3969;
        class123.field1589.method366(64);
        if (arg0 != -20225) {
            field3965 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lfb;ZI)V")
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field3977 = arg0.method2233((byte) 104);
            }
        } else {
            this.field3971 = arg0.method2233((byte) 104);
        }
        if (arg1) {
            method1791(43, 112, -121, -42);
        }
        ++field3976;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIII)V")
    public static final void method1791(int arg0, int arg1, int arg2, int arg3) {
        if (~arg3 == -1) {
            class140.field1797.method1833(-20379, 40);
            ++class134.field1751;
        }
        ++field3964;
        if (~arg3 == -2) {
            class140.field1797.method1833(-20379, 178);
            ++class330.field4865;
        }
        class140.field1797.method2224((byte) 59, class277.field4063[82] ? 1 : 0);
        class140.field1797.method2250(false, class236.field3292 + arg0);
        class140.field1797.method2254(class90.field1223 + arg2, 1082506952);
        class400.field5859 = false;
        if (arg1 >= -63) {
            field3974 = 9;
        }
        class47.field712 = arg0;
        class142.field1805 = arg2;
        class147.method1015((byte) -75);
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
    public class268() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(Z)V")
    public static final void method1792(boolean arg0) {
        if (arg0) {
            class117.field1529.method483(class409.field5952, class1.field10 ? class290.field4342 + 256 : -1);
            ++field3972;
        }
    }
}
