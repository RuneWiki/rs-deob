import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class470 extends class54 {

    @OriginalMember(owner = "client!pr", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field6834 = new String[] { method3575(method3574("g\"z\u0016S")), method3575(method3574("g\"z\u001eS")), method3575(method3574("g\"z\u0014S")), method3575(method3574("g\"z\u0018S")), method3575(method3574("l~zr\u0006")), method3575(method3574("y%80")), method3575(method3574("g\"z\u0015S")), method3575(method3574("g\"z\u0011S")), method3575(method3574("g\"z\u0019S")), method3575(method3574("g\"z\u001fS")), method3575(method3574("g\"z\u001aS")), method3575(method3574("g\"z\u001dS")), method3575(method3574("g\"z\u001bS")) };

    @OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
    public static int field6826 = -1;

    @OriginalMember(owner = "client!pr", name = "w", descriptor = "I")
    public static int field6830 = -1;

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "Lwia;")
    public static class790 field6821 = new class790(10, 3);

    @OriginalMember(owner = "client!pr", name = "y", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!pr", name = "B", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!pr", name = "x", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!pr", name = "z", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!pr", name = "t", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!pr", name = "s", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!pr", name = "v", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "Lla;")
    public static class476 field6832;

    @OriginalMember(owner = "client!pr", name = "u", descriptor = "[Lpi;")
    public static class523[] field6833;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(Z)I")
    public final int method111(boolean arg0) {
        try {
            ++field6827;
            if (arg0) {
                this.method109(61, (byte) 115);
            }
            return 1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6834[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)Z")
    public final boolean method3567(int arg0) {
        try {
            ++field6829;
            return arg0 == -10243;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6834[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
    public static void method3568(byte arg0) {
        try {
            field6832 = null;
            if (arg0 <= -122) {
                field6821 = null;
                field6833 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6834[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)V")
    public final void method113(int arg0, int arg1) {
        try {
            ++field6822;
            if (arg0 != 0) {
                this.method115(false);
            }
            super.field593 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6834[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method3569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        try {
            ++field6825;
            int var8 = arg0 + arg5;
            int var9 = -arg0 + arg3;
            for (int var10 = arg5; ~var8 < ~var10; ++var10) {
                class319.method2702(class243.field3731[var10], arg1, arg2, true, arg4);
            }
            for (int var11 = arg3; var9 < var11; --var11) {
                class319.method2702(class243.field3731[var11], arg1, arg2, true, arg4);
            }
            int var12 = arg0 + arg1;
            int var13 = -arg0 + arg2;
            for (int var14 = var8; var14 <= var9; ++var14) {
                int[] var15 = class243.field3731[var14];
                class319.method2702(var15, arg1, var12, true, arg4);
                class319.method2702(var15, var12, var13, true, arg6);
                class319.method2702(var15, var13, arg2, true, arg4);
            }
            if (arg7 != -73) {
                method3571(120, 101, -3, 25, 16, (class66) null, 38, (byte) 109);
            }
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field6834[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(IB)I")
    public final int method109(int arg0, byte arg1) {
        try {
            ++field6828;
            if (arg1 >= -106) {
                method3570(-18, 63);
            }
            return arg0 != 0 && ~super.field589.field806.method5516(false) != -2 ? 2 : 1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6834[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(II)V")
    public static final void method3570(int arg0, int arg1) {
        try {
            ++field6819;
            if (arg1 == -30107) {
                class313 var2 = class196.method1670((long) arg0, 10, 81);
                var2.method2635(true);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6834[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIILha;IB)V")
    public static final void method3571(int arg0, int arg1, int arg2, int arg3, int arg4, class66 arg5, int arg6, byte arg7) {
        try {
            ++field6823;
            class301.field4720 = arg5;
            if (arg7 != -48) {
                method3569(67, -119, 91, -119, 68, -76, 13, (byte) -78);
            }
            class80.field901 = class301.field4720.method517();
            class290.field4310 = class301.field4720.method517();
            class497.field7202 = class301.field4720.method517();
            class166.field2283 = 1;
            class283.field4239 = arg4;
            class335.field5236 = arg6;
            class730.field10602 = null;
            class320.field5063 = arg2;
            class759.field11007 = arg3;
            class548.field8188 = 0;
            class772.field11216 = 0;
            class428.method3288(true, arg1, arg0);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field6834[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field6834[4] : field6834[5]) + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(Z)I")
    public final int method3572(boolean arg0) {
        try {
            if (arg0) {
                method3571(110, -51, 55, -75, 105, (class66) null, -65, (byte) -122);
            }
            ++field6831;
            return super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6834[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILjava/awt/Canvas;ILd;)Lha;")
    public static final class66 method3573(int arg0, Canvas arg1, int arg2, class160 arg3) {
        try {
            ++field6820;
            if (arg0 > -83) {
                field6821 = null;
            }
            return new class197(arg1, arg3, arg2);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6834[6] + arg0 + ',' + (arg1 != null ? field6834[4] : field6834[5]) + ',' + arg2 + ',' + (arg3 != null ? field6834[4] : field6834[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
    public final void method115(boolean arg0) {
        try {
            if (~super.field593 != -1 && super.field589.field806.method5516(false) != 1) {
                super.field593 = 0;
            }
            if (arg0) {
                ++field6824;
                if (~super.field593 > -1 || ~super.field593 < -2) {
                    super.field593 = this.method111(false);
                }
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6834[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(ILhia;)V")
    public class470(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lhia;)V")
    public class470(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3574(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 123);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3575(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 23;
                    break;
                case 1:
                    var10005 = 80;
                    break;
                case 2:
                    var10005 = 84;
                    break;
                case 3:
                    var10005 = 92;
                    break;
                default:
                    var10005 = 123;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
