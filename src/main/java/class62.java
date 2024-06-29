import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class62 extends class436 {

    @OriginalMember(owner = "client!co", name = "I", descriptor = "I")
    private int field961 = 3072;

    @OriginalMember(owner = "client!co", name = "G", descriptor = "I")
    private int field959 = 1024;

    @OriginalMember(owner = "client!co", name = "P", descriptor = "I")
    private int field968 = 2048;

    @OriginalMember(owner = "client!co", name = "S", descriptor = "Ljava/lang/String;")
    public static String field971 = null;

    @OriginalMember(owner = "client!co", name = "N", descriptor = "Lng;")
    public static class190 field966 = new class190(64);

    @OriginalMember(owner = "client!co", name = "W", descriptor = "I")
    public static int field975 = 0;

    @OriginalMember(owner = "client!co", name = "X", descriptor = "Lpj;")
    public static class79 field976 = new class79(16);

    @OriginalMember(owner = "client!co", name = "Y", descriptor = "Ltc;")
    public static class196 field977 = new class196();

    @OriginalMember(owner = "client!co", name = "Z", descriptor = "I")
    public static int field978 = 0;

    @OriginalMember(owner = "client!co", name = "H", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!co", name = "J", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!co", name = "K", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!co", name = "L", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!co", name = "M", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!co", name = "O", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!co", name = "Q", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!co", name = "R", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!co", name = "T", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!co", name = "U", descriptor = "Llf;")
    public static class130 field973;

    // $FF: synthetic field
    @OriginalMember(owner = "client!co", name = "ab", descriptor = "Ljava/lang/Class;")
    public static Class field979;

    @OriginalMember(owner = "client!co", name = "V", descriptor = "[[I")
    public static int[][] field974;

    // $FF: synthetic method
    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method423(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method14(int arg0, int arg1) {
        if (arg1 != 18338) {
            this.method18(19, 110, (class371) null);
        }
        ++field960;
        int[] var3 = super.field6258.method2688((byte) -107, arg0);
        if (super.field6258.field6138) {
            int[] var4 = this.method2729(0, 0, arg0);
            for (int var5 = 0; ~var5 > ~class43.field653; ++var5) {
                var3[var5] = this.field959 - -(var4[var5] * this.field968 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V", line = 36)
    public class62() {
        super(1, false);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIILie;ILaa;B)V", line = 39)
    public static final void method418(int arg0, int arg1, int arg2, int arg3, class4 arg4, int arg5, class281 arg6, byte arg7) {
        if (arg7 != 91) {
            method419(false);
        }
        ++field962;
        class161 var8 = null;
        if (arg3 == 0) {
            var8 = (class161) class57.method381(arg5, arg1, arg2);
        }
        if (arg3 == 1) {
            var8 = (class161) class3.method13(arg5, arg1, arg2);
        }
        if (arg3 == 2) {
            var8 = (class161) class32.method245(arg5, arg1, arg2, field979 != null ? field979 : (field979 = method423("tr")));
        }
        if (arg3 == 3) {
            var8 = (class161) class207.method1350(arg5, arg1, arg2);
        }
        if (var8 != null) {
            int var9 = var8.method123((byte) 119);
            int var10 = var8.method124(-11197);
            class369 var11 = class310.method1961(var8.method126(-13482), (byte) 35);
            if (var11.method2366(0)) {
                class305.method1942(arg5, arg2, arg1, var11, arg7 ^ 219);
            }
            if (var8.method127((byte) 43)) {
                var8.method133(arg6, (byte) -102);
            }
            if (~arg3 != -1) {
                if (~arg3 == -2) {
                    class344.method2206(arg5, arg1, arg2);
                    return;
                }
                if (arg3 != 2) {
                    if (~arg3 == -4) {
                        class318.method2027(arg5, arg1, arg2);
                        if (~var11.field5192 == -2) {
                            arg4.method29(arg2, arg1, 127);
                            return;
                        }
                    }
                    return;
                }
                class154.method1037(arg5, arg1, arg2, field979 != null ? field979 : (field979 = method423("tr")));
                if (var11.field5192 != 0 && ~(var11.field5215 + arg1) > ~class432.field6220 && ~class267.field3646 < ~(var11.field5215 + arg2) && class432.field6220 > var11.field5200 + arg1 && ~(var11.field5200 + arg2) > ~class267.field3646) {
                    arg4.method31(arg1, var11.field5215, !var11.field5195, -4, var11.field5200, var11.field5166, var10, arg2);
                    return;
                }
                return;
            }
            class194.method1294(arg5, arg1, arg2);
            if (~var11.field5192 != -1) {
                arg4.method20(arg1, var11.field5166, arg2, var9, !var11.field5195, 1, var10);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V", line = 125)
    public static final void method419(boolean arg0) {
        class190 var1 = class132.field1834;
        synchronized (class132.field1834) {
            class132.field1834.method1243(1000);
        }
        ++field969;
        if (!arg0) {
            method419(false);
        }
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(I)V", line = 138)
    public final void method44(int arg0) {
        this.field968 = -this.field959 + this.field961;
        ++field965;
        if (arg0 != -14) {
            method419(false);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIBIII)V", line = 150)
    public static final void method420(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg4 != -52) {
            field974 = null;
        }
        ++field963;
        if (~arg2 <= ~class379.field5397 && ~arg6 >= ~class43.field659 && arg7 >= class300.field4164 && arg0 <= class398.field5827) {
            class281.method1768(arg2, true, arg5, arg3, arg7, arg1, arg0, arg6);
        } else {
            class429.method2703(0, arg6, arg0, arg5, arg3, arg2, arg1, arg7);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIBI)V", line = 170)
    public static final void method421(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field964;
        for (int var5 = 0; var5 < class75.field1161; ++var5) {
            Rectangle var6 = class60.field840[var5];
            if (~arg2 > ~(var6.x - -var6.width) && ~(arg1 + arg2) < ~var6.x && var6.y - -var6.height > arg4 && ~(arg0 + arg4) < ~var6.y) {
                class259.field3553[var5] = true;
            }
        }
        if (arg3 != 99) {
            method420(-44, 82, -98, -75, (byte) 79, 88, 108, 81);
        }
    }

    @OriginalMember(owner = "client!co", name = "f", descriptor = "(I)V", line = 193)
    public static void method422(int arg0) {
        field971 = null;
        if (arg0 >= -7) {
            method420(125, 9, -1, 117, (byte) -102, -95, -37, 75);
        }
        field974 = null;
        field977 = null;
        field973 = null;
        field966 = null;
        field976 = null;
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(II)[[I", line = 226)
    public final int[][] method85(int arg0, int arg1) {
        ++field970;
        int[][] var3 = super.field6259.method1848((byte) 63, arg1);
        if (arg0 != -13348) {
            method422(-98);
        }
        if (super.field6259.field3950) {
            int[][] var4 = this.method2731(arg1, false, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class43.field653 > var11; ++var11) {
                var8[var11] = (var5[var11] * this.field968 >> 12) + this.field959;
                var9[var11] = this.field959 - -(var6[var11] * this.field968 >> 12);
                var10[var11] = (var7[var11] * this.field968 >> 12) + this.field959;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IILeb;)V", line = 279)
    public final void method18(int arg0, int arg1, class371 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field6256 = arg2.method2429(arg0 ^ 34) == 1;
                }
            } else {
                this.field961 = arg2.method2403((byte) 127);
            }
        } else {
            this.field959 = arg2.method2403((byte) 123);
        }
        if (arg0 != 34) {
            method421(104, -30, -44, (byte) -127, 82);
        }
        ++field972;
    }
}
