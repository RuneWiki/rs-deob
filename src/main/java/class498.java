import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class498 {

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "[I")
    public static int[] field7090 = new int[4];

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "Lsb;")
    public static class266 field7093 = new class266(46, 3);

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "[Lff;")
    public static class9[] field7099 = new class9[8];

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "[I")
    public static int[] field7098 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "B")
    public byte field7091;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public static int field7089;

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
    public static int field7095;

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "I")
    public int field7097;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "Ljava/lang/String;")
    public String field7088;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "Ljava/lang/String;")
    public String field7092;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "Ljava/lang/String;")
    public String field7096;

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "Ljava/lang/String;")
    public String field7100;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIII)V")
    public static final void method2972(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 4) {
            return;
        }
        field7094++;
        if (arg1 == arg2) {
            class253.method1689(arg1, arg0, (byte) 119, arg5, arg3);
        } else if (arg3 - arg1 >= class704.field9911 && class379.field5612 >= (arg1 + arg3) && arg0 - arg2 >= class309.field4556 && arg0 + arg2 <= client.field4115) {
            class301.method1987(arg5, arg0, arg1, arg3, -113, arg2);
        } else {
            class323.method2086(arg2, 127, arg0, arg5, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V")
    public static void method2973(boolean arg0) {
        if (arg0) {
            field7098 = null;
        }
        field7093 = null;
        field7090 = null;
        field7099 = null;
        field7098 = null;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIII)Z")
    public static final boolean method2974(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7089++;
        int var7 = arg0 + arg5;
        int var8 = arg1 + arg2;
        int var9 = arg3 + arg6;
        if (!class589.method3361(arg3, arg5, var8, var9, var9, -123, var8, arg5, var7, var8)) {
            return false;
        } else if (!class589.method3361(arg3, var7, var8, arg3, var9, -118, var8, arg5, var7, var8)) {
            return false;
        } else if (arg4 == 8963) {
            if (arg5 < class316.field4656) {
                if (!class589.method3361(var9, arg5, var8, arg3, var9, -128, arg2, arg5, arg5, var8)) {
                    return false;
                }
                if (!class589.method3361(var9, arg5, var8, arg3, arg3, arg4 ^ 0xFFFFDC89, arg2, arg5, arg5, arg2)) {
                    return false;
                }
            } else if (!class589.method3361(var9, var7, var8, arg3, var9, -121, arg2, var7, var7, var8)) {
                return false;
            } else if (!class589.method3361(var9, var7, var8, arg3, arg3, -118, arg2, var7, var7, arg2)) {
                return false;
            }
            if (class398.field5801 > arg3) {
                if (!class589.method3361(arg3, arg5, var8, arg3, arg3, -122, arg2, arg5, var7, var8)) {
                    return false;
                }
                if (!class589.method3361(arg3, var7, var8, arg3, arg3, -124, arg2, arg5, var7, arg2)) {
                    return false;
                }
            } else if (!class589.method3361(var9, arg5, var8, var9, var9, arg4 ^ 0xFFFFDC80, arg2, arg5, var7, var8)) {
                return false;
            } else if (!class589.method3361(var9, var7, var8, var9, var9, -123, arg2, arg5, var7, arg2)) {
                return false;
            }
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IBI)Ljava/lang/String;")
    public static final String method2975(int arg0, byte arg1, int arg2) {
        field7095++;
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else {
            int var4 = -11 % ((-arg1 - 42) / 32);
            if (var3 < -3) {
                return "<col=ff7000>";
            } else if (var3 < 0) {
                return "<col=ffb000>";
            } else if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }
}
