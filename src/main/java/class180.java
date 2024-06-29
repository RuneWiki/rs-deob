import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class180 extends class124 {

    @OriginalMember(owner = "client!di", name = "q", descriptor = "Z")
    public static boolean field2522 = false;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "J")
    public static long field2520 = 0L;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field2523 = 0;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "[I")
    public static int[] field2521 = new int[25];

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public static int field2529 = 0;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field2531 = new String[200];

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "Lhc;")
    public static class235 field2525;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "[I")
    public static int[] field2519;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZIIII)V")
    public static final void method1174(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field2528++;
        class273.field4222 = 0L;
        int var5 = class89.method568(-20891);
        if (arg4 == 3 || var5 == 3) {
            arg0 = true;
        }
        boolean var6 = false;
        if (var5 <= 0 == arg4 > 0) {
            var6 = true;
        }
        if (arg2 < 77) {
            field2521 = null;
        }
        if (class244.field3728.startsWith("mac") && arg4 > 0) {
            arg0 = true;
        }
        if (arg0 && arg4 > 0) {
            var6 = true;
        }
        class197.method1259(var6, arg0, var5, (byte) 20, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)V")
    public static void method1175(int arg0) {
        field2525 = null;
        if (arg0 < -75) {
            field2531 = null;
            field2519 = null;
            field2521 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method1176(String arg0, String arg1, boolean arg2, String arg3) {
        field2527++;
        int var4 = arg0.length();
        int var5 = arg3.length();
        int var6 = arg1.length();
        if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
        } else if (arg2) {
            int var7 = var4;
            int var8 = var6 - var5;
            if (var8 != 0) {
                int var9 = 0;
                while (true) {
                    int var10 = arg0.indexOf(arg3, var9);
                    if (var10 < 0) {
                        break;
                    }
                    var7 += var8;
                    var9 = var5 + var10;
                }
            }
            StringBuffer var11 = new StringBuffer(var7);
            int var12 = 0;
            while (true) {
                int var13 = arg0.indexOf(arg3, var12);
                if (var13 < 0) {
                    var11.append(arg0.substring(var12));
                    return var11.toString();
                }
                var11.append(arg0.substring(var12, var13));
                var12 = var5 + var13;
                var11.append(arg1);
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
    public static final void method1177(byte arg0) {
        field2518++;
        if (!class89.field1250) {
            return;
        }
        if (arg0 != 94) {
            method1174(true, -94, -6, -33, -73);
        }
        class219.field3292 = null;
        class229.field3476 = null;
        class89.field1250 = false;
    }
}
