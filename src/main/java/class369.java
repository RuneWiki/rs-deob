import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class369 extends class471 {

    @OriginalMember(owner = "client!rq", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field5640 = new String[] { method2986(method2985("\u0012\u000ecX\u0002")), method2986(method2985("\u0012\u000ecY\u0002")), method2986(method2985("\u0012\u000ec^\u0002")), method2986(method2985("\u0012\u000ec_\u0002")), method2986(method2985("\u0012\u000ecZ\u0002")) };

    @OriginalMember(owner = "client!rq", name = "y", descriptor = "[I")
    public static int[] field5635 = new int[14];

    @OriginalMember(owner = "client!rq", name = "B", descriptor = "Z")
    public static boolean field5631 = false;

    @OriginalMember(owner = "client!rq", name = "D", descriptor = "Lel;")
    public static class573 field5633 = new class573(63, -2);

    @OriginalMember(owner = "client!rq", name = "w", descriptor = "D")
    public static double field5634;

    @OriginalMember(owner = "client!rq", name = "z", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!rq", name = "x", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!rq", name = "A", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!rq", name = "C", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!rq", name = "E", descriptor = "Lkga;")
    public static class571 field5638;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(FB)V", line = 3)
    public final void method1835(float arg0, byte arg1) {
        try {
            ++field5632;
            super.field6838 = arg0;
            if (arg1 != -20) {
                field5634 = 0.12934461419598717D;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5640[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(IIIIIF)V", line = 17)
    public class369(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IB)V", line = 20)
    public static final void method2982(int arg0, byte arg1) {
        try {
            if (~arg0 == -38) {
                class161.field2159 = 3.0F;
            } else if (arg0 != 50) {
                if (~arg0 != -76) {
                    if (~arg0 == -101) {
                        class161.field2159 = 8.0F;
                    } else if (~arg0 == -201) {
                        class161.field2159 = 16.0F;
                    }
                } else {
                    class161.field2159 = 6.0F;
                }
            } else {
                class161.field2159 = 4.0F;
            }
            ++field5637;
            class348.field5385 = -1;
            if (arg1 > 121) {
                class348.field5385 = -1;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5640[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "(B)[Lpi;", line = 52)
    public static final class523[] method2983(byte arg0) {
        try {
            if (arg0 != -63) {
                field5631 = false;
            }
            if (class470.field6833 == null) {
                class523[] var1 = class116.method1023(false, class580.field8601);
                class523[] var2 = new class523[var1.length];
                int var3 = 0;
                int var4 = class289.field4305.field842.method3195(false);
                label92: for (int var5 = 0; ~var5 > ~var1.length; ++var5) {
                    class523 var6 = var1[var5];
                    if ((var6.field7645 <= 0 || ~var6.field7645 <= -25) && var6.field7647 >= 800 && var6.field7642 >= 600 && (var4 != 2 || ~var6.field7647 >= -801 && var6.field7642 <= 600) && (var4 != 1 || ~var6.field7647 >= -1025 && ~var6.field7642 >= -769)) {
                        for (int var7 = 0; var3 > var7; ++var7) {
                            class523 var8 = var2[var7];
                            if (~var6.field7647 == ~var8.field7647 && var6.field7642 == var8.field7642) {
                                if (~var6.field7645 < ~var8.field7645) {
                                    var2[var7] = var6;
                                }
                                continue label92;
                            }
                        }
                        var2[var3] = var6;
                        ++var3;
                    }
                }
                class470.field6833 = new class523[var3];
                class467.method3554(var2, 0, class470.field6833, 0, var3);
                int[] var9 = new int[class470.field6833.length];
                for (int var10 = 0; ~class470.field6833.length < ~var10; ++var10) {
                    class523 var11 = class470.field6833[var10];
                    var9[var10] = var11.field7647 * var11.field7642;
                }
                class238.method2044(true, var9, class470.field6833);
            }
            ++field5639;
            return class470.field6833;
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field5640[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "(B)V", line = 144)
    public static void method2984(byte arg0) {
        try {
            if (arg0 < -127) {
                field5638 = null;
                field5635 = null;
                field5633 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5640[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIII)V", line = 156)
    public final void method1836(int arg0, int arg1, int arg2, int arg3) {
        try {
            super.field6846 = arg2;
            if (arg0 >= -50) {
                field5633 = null;
            }
            super.field6839 = arg1;
            ++field5636;
            super.field6837 = arg3;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5640[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!rq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2985(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 42);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2986(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 96;
                    break;
                case 1:
                    var10005 = 127;
                    break;
                case 2:
                    var10005 = 77;
                    break;
                case 3:
                    var10005 = 27;
                    break;
                default:
                    var10005 = 42;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
