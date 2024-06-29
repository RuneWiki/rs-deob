import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class231 {

    @OriginalMember(owner = "client!to", name = "a", descriptor = "[B")
    public static byte[] field2883 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

    @OriginalMember(owner = "client!to", name = "b", descriptor = "Lae;")
    public static class40 field2884 = new class40();

    @OriginalMember(owner = "client!to", name = "h", descriptor = "I")
    public static int field2890 = 0;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "I")
    public static int field2889 = 0;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "Ljava/applet/Applet;")
    public static Applet field2887;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIB)Z", line = 3)
    public static final boolean method1390(int arg0, int arg1, byte arg2) {
        if (arg2 != -36) {
            method1393(-117);
        }
        field2885++;
        return (arg0 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lqda;Z)Z", line = 16)
    public static final boolean method1391(class172 arg0, boolean arg1) {
        boolean var2 = class699.field9887 == class491.field6485;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method1092(0);
        if (arg0.field2247 < 0 || arg0.field2243 < 0 || arg0.field2254 >= class429.field5383 || arg0.field2244 >= class37.field508) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field2247; var7 <= arg0.field2254; var7++) {
            for (int var11 = arg0.field2243; var11 <= arg0.field2244; var11++) {
                class75 var12 = class128.method683(arg0.field6470, var7, var11);
                if (var12 != null) {
                    class138 var13 = class377.method2045((byte) 97, arg0);
                    class138 var14 = var12.field1024;
                    if (var14 == null) {
                        var12.field1024 = var13;
                    } else {
                        while (var14.field1789 != null) {
                            var14 = var14.field1789;
                        }
                        var14.field1789 = var13;
                    }
                    if (var2 && (class540.field7230[var7][var11] & 0xFF000000) != 0) {
                        var3 = class540.field7230[var7][var11];
                        var4 = class180.field2320[var7][var11];
                        var5 = class319.field4080[var7][var11];
                    }
                    if (!arg1 && var12.field1031 != null && var12.field1031.field4919 > var6) {
                        var6 = var12.field1031.field4919;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field2247; var8 <= arg0.field2254; var8++) {
                for (int var9 = arg0.field2243; var9 <= arg0.field2244; var9++) {
                    if ((class540.field7230[var8][var9] & 0xFF000000) == 0) {
                        class540.field7230[var8][var9] = var3;
                        class180.field2320[var8][var9] = var4;
                        class319.field4080[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class11.field191[class103.field1389++] = arg0;
        } else {
            int var10 = class699.field9887 == class491.field6485 ? 1 : 0;
            if (!arg0.method68((byte) 115)) {
                class252.field3090[var10][class469.field5960[var10]++] = arg0;
            } else if (arg0.method83((byte) 23)) {
                class337.field4341[var10][class173.field2256[var10]++] = arg0;
            } else {
                class102.field1375[var10][class593.field8335[var10]++] = arg0;
            }
        }
        if (arg1) {
            arg0.field6458 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIII)V", line = 127)
    public static final void method1392(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2888++;
        class651[] var7 = class52.field784;
        if (arg3 != -14564) {
            field2890 = -1;
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class651 var9 = var7[var8];
            if (var9 != null && var9.field9181 == 2) {
                class513.method2769(var9.field9194, arg0 >> 1, arg2, var9.field9189, arg4, (byte) 46, arg1 >> 1, var9.field9184 * 2, var9.field9196);
                if (class273.field3450[0] > -1 && (class133.field1735 % 20) < 10) {
                    class475.field6026[var9.field9182].method2902(arg6 + class273.field3450[0] - 12, arg5 - -class273.field3450[1] + -28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V", line = 162)
    public static void method1393(int arg0) {
        field2887 = null;
        field2884 = null;
        field2883 = null;
        if (arg0 != 23460) {
            field2883 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(III)V", line = 184)
    public static final void method1394(int arg0, int arg1, int arg2) {
        field2886++;
        class592 var3 = class61.method371(arg0, arg2, (byte) 123);
        var3.method3256((byte) 11);
        var3.field8314 = arg1;
    }
}
