import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class418 extends class656 {

    @OriginalMember(owner = "client!za", name = "l", descriptor = "Lel;")
    public static class548 field5768 = new class548("LIVE", 0);

    @OriginalMember(owner = "client!za", name = "n", descriptor = "[I")
    public static int[] field5770 = new int[1000];

    @OriginalMember(owner = "client!za", name = "i", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!za", name = "j", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!za", name = "k", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!za", name = "m", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!za", name = "o", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!za", name = "p", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;", line = 8)
    public static final Class method2424(String arg0, byte arg1) throws ClassNotFoundException {
        field5767++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1 >= -119) {
            return null;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(I)V", line = 47)
    public static void method2425(int arg0) {
        field5768 = null;
        if (arg0 <= 96) {
            method2427(-45, 101, -43, -19, 61, 87, -81, -27, -78, -126);
        }
        field5770 = null;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IILjava/lang/String;ILjava/lang/String;ZZ)V", line = 58)
    public static final void method2426(int arg0, int arg1, String arg2, int arg3, String arg4, boolean arg5, boolean arg6) {
        if (arg3 < 87) {
            field5770 = null;
        }
        class254.field3491.field5225 = 1;
        field5766++;
        String var7 = arg4.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg1 != -1) {
            class62 var11 = class505.field6754.method4149(-6119, arg1);
            if (var11 == null || arg5 != var11.method536(Integer.MAX_VALUE)) {
                return;
            }
            if (var11.method536(Integer.MAX_VALUE)) {
                var10 = var11.field756;
            } else {
                var9 = var11.field761;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class77.field948.field2463; var13++) {
            class597 var16 = class77.field948.method1165((byte) 78, var13);
            if ((!arg6 || var16.field7815) && var16.field7808 == -1 && var16.field7836 == -1 && var16.field7829 == 0 && var16.field7763.toLowerCase().indexOf(var7) != -1) {
                if (arg1 != -1) {
                    if (arg5) {
                        if (!arg2.equals(var16.method3256(var10, arg1, 5))) {
                            continue;
                        }
                    } else if (var16.method3259(var9, -1, arg1) != arg0) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class468.field6429 = null;
                    class284.field4022 = -1;
                    return;
                }
                if (var12 >= var8.length) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; var18 < var12; var18++) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        class468.field6429 = var8;
        class284.field4022 = var12;
        class80.field964 = 0;
        String[] var14 = new String[class284.field4022];
        for (int var15 = 0; var15 < class284.field4022; var15++) {
            var14[var15] = class77.field948.method1165((byte) 101, var8[var15]).field7763;
        }
        class251.method1532(var14, class468.field6429, -113);
        class254.field3491.method2208(0);
        class254.field3491.field5225 = 2;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIIIIII)V", line = 170)
    public static final void method2427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 >= class261.field3632 && class209.field3090 >= arg5 && arg4 >= class261.field3632 && arg4 <= class209.field3090 && class261.field3632 <= arg7 && arg7 <= class209.field3090 && arg6 >= class261.field3632 && arg6 <= class209.field3090 && class380.field5289 <= arg8 && class431.field5944 >= arg8 && arg3 >= class380.field5289 && arg3 <= class431.field5944 && arg0 >= class380.field5289 && class431.field5944 >= arg0 && class380.field5289 <= arg2 && arg2 <= class431.field5944) {
            class645.method3535(arg6, arg4, -4, arg3, arg9, arg5, arg2, arg7, arg8, arg0);
        } else {
            class63.method544(arg2, arg3, arg8, arg7, arg4, arg9, arg6, arg5, (byte) 100, arg0);
        }
        field5769++;
        if (arg1 != 7000) {
            method2427(-54, -27, -65, -106, -66, 74, 8, -117, 60, -33);
        }
    }
}
