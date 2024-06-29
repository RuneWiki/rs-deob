import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class198 {

    @OriginalMember(owner = "client!im", name = "e", descriptor = "Z")
    public static boolean field3390 = false;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "[I")
    public static int[] field3395 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!im", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3388 = "Use";

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3391;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIZI)I", line = 14)
    public static final int method1492(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field3389++;
        if (arg3) {
            return -55;
        } else {
            int var5 = 65536 - class62.field961[arg4 * 1024 / arg0] >> 1;
            return ((65536 - var5) * arg2 >> 16) + (arg1 * var5 >> 16);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIZ)V", line = 32)
    public static final void method1493(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3393++;
        for (class261 var5 = (class261) class262.field4251.method2297(14204); var5 != null; var5 = (class261) class262.field4251.method2291(76)) {
            class320.method2198(arg3, arg0, arg1, arg2, var5, (byte) -123);
        }
        if (!arg4) {
            field3391 = (FontMetrics) null;
        }
        for (class261 var6 = (class261) class184.field3119.method2297(14204); var6 != null; var6 = (class261) class184.field3119.method2291(-69)) {
            byte var7 = 1;
            class346 var8 = var6.field4234.method980((byte) 73);
            if (var6.field4234.field2000 == var8.field5521) {
                var7 = 0;
            } else if (var6.field4234.field2000 == var8.field5503 || var6.field4234.field2000 == var8.field5506 || var6.field4234.field2000 == var8.field5504 || var6.field4234.field2000 == var8.field5499) {
                var7 = 2;
            } else if (var6.field4234.field2000 == var8.field5522 || var6.field4234.field2000 == var8.field5527 || var6.field4234.field2000 == var8.field5494 || var6.field4234.field2000 == var8.field5518) {
                var7 = 3;
            }
            if (var6.field4218 != var7) {
                int var9 = class28.method257(22401, var6.field4234);
                if (var6.field4223 != var9) {
                    if (var6.field4229 != null) {
                        class1.field9.method1839(var6.field4229);
                        var6.field4229 = null;
                    }
                    var6.field4223 = var9;
                }
                var6.field4218 = var7;
            }
            var6.field4230 = var6.field4234.field2036;
            var6.field4220 = var6.field4234.field2036 + var6.field4234.method987(3047) * 64;
            var6.field4228 = var6.field4234.field1985;
            var6.field4225 = var6.field4234.field1985 + var6.field4234.method987(3047) * 64;
            class320.method2198(arg3, arg0, arg1, arg2, var6, (byte) 113);
        }
        for (class261 var10 = (class261) class305.field4831.method736(2); var10 != null; var10 = (class261) class305.field4831.method727((byte) -110)) {
            byte var11 = 1;
            class346 var12 = var10.field4231.method980((byte) 73);
            if (var10.field4231.field2000 == var12.field5521) {
                var11 = 0;
            } else if (var10.field4231.field2000 == var12.field5503 || var10.field4231.field2000 == var12.field5506 || var10.field4231.field2000 == var12.field5504 || var10.field4231.field2000 == var12.field5499) {
                var11 = 2;
            } else if (var10.field4231.field2000 == var12.field5522 || var10.field4231.field2000 == var12.field5527 || var10.field4231.field2000 == var12.field5494 || var10.field4231.field2000 == var12.field5518) {
                var11 = 3;
            }
            if (var10.field4218 != var11) {
                int var13 = class143.method1157(14845, var10.field4231);
                if (var10.field4223 != var13) {
                    if (var10.field4229 != null) {
                        class1.field9.method1839(var10.field4229);
                        var10.field4229 = null;
                    }
                    var10.field4223 = var13;
                }
                var10.field4218 = var11;
            }
            var10.field4230 = var10.field4231.field2036;
            var10.field4220 = var10.field4231.field2036 + (var10.field4231.method987(3047) * 64);
            var10.field4228 = var10.field4231.field1985;
            var10.field4225 = var10.field4231.field1985 + var10.field4231.method987(3047) * 64;
            class320.method2198(arg3, arg0, arg1, arg2, var10, (byte) -13);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/lang/String;IZ)I", line = 151)
    public static final int method1494(int arg0, String arg1, int arg2, boolean arg3) {
        field3386++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        int var5 = 0;
        boolean var6 = false;
        int var7 = arg1.length();
        if (arg0 != 87) {
            method1494(-83, (String) null, -57, false);
        }
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg2) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var5 + var11;
            if (var10 / arg2 != var5) {
                throw new NumberFormatException();
            }
            var5 = var10;
            var6 = true;
        }
        if (!var6) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V", line = 228)
    public static final void method1495(int arg0) {
        field3387++;
        if (class170.field2947) {
            class38.field566 = null;
            class202.field3436 = null;
            int var1 = 27 / ((-arg0 - 20) / 58);
            class170.field2947 = false;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIZBZ)V", line = 249)
    public static final void method1496(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, boolean arg6) {
        if (arg5 != -105) {
            field3391 = (FontMetrics) null;
        }
        if (arg2 < arg1) {
            int var7 = (arg1 + arg2) / 2;
            int var8 = arg2;
            class20 var9 = class212.field3573[var7];
            class212.field3573[var7] = class212.field3573[arg1];
            class212.field3573[arg1] = var9;
            for (int var10 = arg2; var10 < arg1; var10++) {
                if (class80.method738(var9, class212.field3573[var10], 56, arg0, arg6, arg4, arg3) <= 0) {
                    class20 var11 = class212.field3573[var10];
                    class212.field3573[var10] = class212.field3573[var8];
                    class212.field3573[var8++] = var11;
                }
            }
            class212.field3573[arg1] = class212.field3573[var8];
            class212.field3573[var8] = var9;
            method1496(arg0, var8 - 1, arg2, arg3, arg4, (byte) -105, arg6);
            method1496(arg0, arg1, var8 + 1, arg3, arg4, (byte) -105, arg6);
        }
        field3394++;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(I)V", line = 300)
    public static void method1497(int arg0) {
        field3395 = null;
        int var1 = -6 / ((arg0 + 63) / 41);
        field3391 = null;
        field3388 = null;
    }
}
