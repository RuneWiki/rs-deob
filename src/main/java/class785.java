import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class785 extends class578 {

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    private int field11333;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public int field11346;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    private int field11329;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public int field11335;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    private int field11342;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public int field11343;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    private int field11345;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public int field11330;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    private int field11341;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field11349 = new String[] { method5659(method5658("Y\r$rK")), method5659(method5658("Y\r$sK")), method5659(method5658("Y\r$tK")), method5659(method5658("Y\r$pK")), method5659(method5658("Y\r$\t\nY\u0000~\u000bK")), method5659(method5658("Y\r$vK")), method5659(method5658("LG$\u001b\u001e")), method5659(method5658("Y\u001cfY")), method5659(method5658("Y\r$qK")), method5659(method5658("Y\r$wK")) };

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "Z")
    public static boolean field11339 = true;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public static int field11340 = 0;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field11338 = 0;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public static int field11347 = 0;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field11331;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field11332;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field11334;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field11336;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field11344;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
    public static int field11348;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "Ltha;")
    public static class296 field11337;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BIII)Z")
    public final boolean method5651(byte arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg0 <= 94) {
                this.field11345 = -73;
            }
            field11331++;
            return this.field11333 == arg3 && arg2 >= this.field11345 && this.field11341 >= arg2 && arg1 >= this.field11329 && this.field11342 >= arg1;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field11349[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static void method5652(int arg0) {
        try {
            if (arg0 == 0) {
                field11337 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field11349[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBI)V")
    public static final void method5653(int arg0, byte arg1, int arg2) {
        try {
            field11344++;
            if (arg1 != 7) {
                field11347 = -23;
            }
            class294 var3 = class146.method1261((long) arg0, -116, 6);
            var3.method2378(-92);
            var3.field4133 = arg2;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11349[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[III)V")
    public final void method5654(int arg0, int[] arg1, int arg2, int arg3) {
        try {
            arg1[2] = arg2 - (this.field11335 - this.field11329);
            arg1[1] = this.field11345 + arg3 - this.field11330;
            arg1[0] = this.field11333;
            field11348++;
            if (arg0 != 12654) {
                this.field11342 = 124;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field11349[8] + arg0 + ',' + (arg1 == null ? field11349[7] : field11349[6]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZI)Z")
    public final boolean method5655(int arg0, boolean arg1, int arg2) {
        try {
            if (!arg1) {
                this.method5657(-119, 44, -76);
            }
            field11332++;
            return arg0 >= this.field11330 && arg0 <= this.field11346 && arg2 >= this.field11335 && arg2 <= this.field11343;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11349[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I[III)V")
    public final void method5656(int arg0, int[] arg1, int arg2, int arg3) {
        try {
            arg1[1] = this.field11330 + arg3 - this.field11345;
            field11336++;
            arg1[0] = 0;
            arg1[2] = this.field11335 + arg2 - this.field11329;
            if (arg0 >= -29) {
                this.method5656(-81, null, 76, 39);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field11349[9] + arg0 + ',' + (arg1 == null ? field11349[7] : field11349[6]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class785(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            this.field11333 = arg0;
            this.field11346 = arg7;
            this.field11329 = arg2;
            this.field11335 = arg6;
            this.field11342 = arg4;
            this.field11343 = arg8;
            this.field11345 = arg1;
            this.field11330 = arg5;
            this.field11341 = arg3;
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field11349[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)Z")
    public final boolean method5657(int arg0, int arg1, int arg2) {
        try {
            if (arg1 == 2) {
                field11334++;
                return this.field11345 <= arg2 && arg2 <= this.field11341 && this.field11329 <= arg0 && arg0 <= this.field11342;
            } else {
                return false;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11349[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5658(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x63);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5659(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 55;
                    break;
                case 1:
                    var10005 = 105;
                    break;
                case 2:
                    var10005 = 10;
                    break;
                case 3:
                    var10005 = 53;
                    break;
                default:
                    var10005 = 99;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
