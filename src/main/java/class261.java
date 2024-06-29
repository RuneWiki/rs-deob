import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class261 {

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "Z")
    public static boolean field3832 = false;

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "Lbu;")
    public static class21 field3834 = new class21(6, 0);

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "I")
    public int field3835;

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "Ljava/lang/String;")
    public String field3833;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIII[I)Z", line = 3)
    public static final boolean method1695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        if (arg5 < 0) {
            arg5 = 0;
        }
        field3836++;
        if (arg0 > class476.field6672) {
            arg0 = class476.field6672;
        }
        if (arg5 >= arg0) {
            return true;
        }
        int var8 = arg0 - arg5 >> 2;
        int var9 = arg3 * arg5 + arg2;
        int var10 = 25 / ((-arg6 - 63) / 37);
        int var11 = arg5 + arg1 - 1;
        if (class561.field7974 == 1) {
            class710.field9866 += var8;
            while (true) {
                var8--;
                if (var8 < 0) {
                    int var12 = arg0 - arg5 & 0x3;
                    while (true) {
                        var12--;
                        if (var12 < 0) {
                            return true;
                        }
                        var11++;
                        if (var9 < arg7[var11]) {
                            arg7[var11] = var9;
                        }
                        var9 += arg3;
                    }
                }
                var11++;
                if (arg7[var11] > var9) {
                    arg7[var11] = var9;
                }
                int var13 = arg3 + var9;
                var11++;
                if (var13 < arg7[var11]) {
                    arg7[var11] = var13;
                }
                int var14 = arg3 + var13;
                var11++;
                if (arg7[var11] > var14) {
                    arg7[var11] = var14;
                }
                int var15 = arg3 + var14;
                var11++;
                if (var15 < arg7[var11]) {
                    arg7[var11] = var15;
                }
                var9 = arg3 + var15;
            }
        } else {
            int var16 = var9 - 38400;
            while (true) {
                var8--;
                if (var8 < 0) {
                    int var17 = arg0 - arg5 & 0x3;
                    while (true) {
                        var17--;
                        if (var17 < 0) {
                            return true;
                        }
                        int var10000 = ~var16;
                        var11++;
                        if (var10000 > ~arg7[var11]) {
                            return false;
                        }
                        var16 += arg3;
                    }
                }
                var11++;
                if (arg7[var11] > var16) {
                    return false;
                }
                int var18 = arg3 + var16;
                var11++;
                if (arg7[var11] > var18) {
                    return false;
                }
                int var19 = arg3 + var18;
                var11++;
                if (var19 < arg7[var11]) {
                    return false;
                }
                int var20 = arg3 + var19;
                var11++;
                if (arg7[var11] > var20) {
                    return false;
                }
                var16 = arg3 + var20;
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)Lf;", line = 104)
    public static final class788 method1696(int arg0) {
        field3831++;
        try {
            if (arg0 <= 121) {
                field3834 = null;
            }
            return (class788) Class.forName("mha").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class221();
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)V", line = 128)
    public static void method1697(int arg0) {
        if (arg0 != 38400) {
            field3832 = true;
        }
        field3834 = null;
    }
}
