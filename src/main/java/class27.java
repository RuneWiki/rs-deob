import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class27 extends class436 {

    @OriginalMember(owner = "client!i", name = "H", descriptor = "I")
    private int field428 = 0;

    @OriginalMember(owner = "client!i", name = "K", descriptor = "I")
    private int field431 = 0;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "I")
    private int field434 = 1365;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
    private int field436 = 20;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "Lng;")
    public static class190 field432 = new class190(64);

    @OriginalMember(owner = "client!i", name = "P", descriptor = "Z")
    public static boolean field435 = false;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "I")
    public static int field437 = 0;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "[I")
    public static int[] field438 = new int[50];

    @OriginalMember(owner = "client!i", name = "G", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!i", name = "J", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V")
    public static void method216(int arg0) {
        field438 = null;
        if (arg0 != -51) {
            field438 = null;
        }
        field432 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIII)V")
    public static final void method217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field427;
        int var7 = class231.method1452(arg4 ^ 1412547345, class398.field5827, arg3, class300.field4164);
        int var8 = class231.method1452(125, class398.field5827, arg5, class300.field4164);
        int var9 = class231.method1452(107, class43.field659, arg6, class379.field5397);
        if (arg4 == 1412547436) {
            int var10 = class231.method1452(106, class43.field659, arg1, class379.field5397);
            int var11 = class231.method1452(108, class398.field5827, arg3 - -arg0, class300.field4164);
            int var12 = class231.method1452(arg4 + -1412547351, class398.field5827, arg5 - arg0, class300.field4164);
            for (int var13 = var7; var11 > var13; ++var13) {
                class73.method486(var9, class84.field1286[var13], arg2, 112, var10);
            }
            for (int var14 = var8; ~var14 < ~var12; --var14) {
                class73.method486(var9, class84.field1286[var14], arg2, 59, var10);
            }
            int var15 = class231.method1452(123, class43.field659, arg0 + arg6, class379.field5397);
            int var16 = class231.method1452(arg4 ^ 1412547347, class43.field659, -arg0 + arg1, class379.field5397);
            for (int var17 = var11; ~var12 <= ~var17; ++var17) {
                int[] var18 = class84.field1286[var17];
                class73.method486(var9, var18, arg2, -93, var15);
                class73.method486(var16, var18, arg2, arg4 ^ -1412547334, var10);
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZBLlo;III)V")
    public static final void method218(boolean arg0, byte arg1, class449 arg2, int arg3, int arg4, int arg5) {
        ++field429;
        if (~class145.field2115 > -51) {
            if (arg2 != null && arg2.field6514 != null && ~arg3 > ~arg2.field6514.length && arg2.field6514[arg3] != null) {
                if (arg1 >= -83) {
                    field435 = true;
                }
                int var6 = arg2.field6514[arg3][0];
                int var7 = var6 >> 8;
                int var8 = (var6 & 237) >> 5;
                if (~arg2.field6514[arg3].length < -2) {
                    int var9 = (int) ((double) arg2.field6514[arg3].length * Math.random());
                    if (~var9 < -1) {
                        var7 = arg2.field6514[arg3][var9];
                    }
                }
                int var10 = 31 & var6;
                if (var10 == 0) {
                    if (arg0) {
                        class53.method358(255, var7, (byte) 106, var8, 0);
                    }
                } else if (class406.field5895 != 0) {
                    class337.field4592[class145.field2115] = var7;
                    class270.field3681[class145.field2115] = var8;
                    class61.field935[class145.field2115] = 0;
                    class423.field6076[class145.field2115] = null;
                    field438[class145.field2115] = 255;
                    int var11 = (arg5 + -64) / 128;
                    int var12 = (arg4 + -64) / 128;
                    class4.field66[class145.field2115] = (var11 << 16) - -(var12 << 8) + var10;
                    ++class145.field2115;
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILeb;)V")
    public final void method18(int arg0, int arg1, class371 arg2) {
        ++field433;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 == 3) {
                        this.field428 = arg2.method2403((byte) 113);
                    }
                } else {
                    this.field431 = arg2.method2403((byte) 114);
                }
            } else {
                this.field436 = arg2.method2403((byte) 57);
            }
        } else {
            this.field434 = arg2.method2403((byte) 46);
        }
        if (arg0 != 34) {
            this.field428 = 26;
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class27() {
        super(0, true);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        if (arg1 != 18338) {
            return null;
        } else {
            ++field430;
            int[] var3 = super.field6258.method2688((byte) -108, arg0);
            if (super.field6258.field6138) {
                for (int var4 = 0; ~class43.field653 < ~var4; ++var4) {
                    int var5 = (class249.field3455[var4] << 12) / this.field434 + this.field431;
                    int var6 = (class32.field499[arg0] << 12) / this.field434 - -this.field428;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13 = 0;
                    while (var11 + var12 < 16384 && ~this.field436 < ~var13) {
                        var10 = (var9 * var10 >> 12) * 2 - -var8;
                        var9 = -var12 + var11 + var7;
                        var11 = var9 * var9 >> 12;
                        ++var13;
                        var12 = var10 * var10 >> 12;
                    }
                    var3[var4] = ~(this.field436 + -1) < ~var13 ? (var13 << 12) / this.field436 : 0;
                }
            }
            return var3;
        }
    }
}
