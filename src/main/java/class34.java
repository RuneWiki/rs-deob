import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class34 {

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field555 = 0;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "[B")
    public static byte[] field554 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Ljava/lang/String;")
    public static String field560 = "Face here";

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "[J")
    public static long[] field561 = new long[32];

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field563;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pc", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field564;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "[S")
    public static short[] field557;

    // $FF: synthetic method
    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method284(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)I", line = 4)
    public static final int method278(int arg0, byte arg1) {
        field562++;
        if (arg1 < 74) {
            field554 = null;
        }
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg0;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V", line = 22)
    public static final void method279(byte arg0) {
        field563++;
        try {
            Method var1 = (field564 == null ? (field564 = method284("java.lang.Runtime")) : field564).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class413.field6187 = var3;
                } catch (Throwable var4) {
                }
            }
            if (arg0 >= -50) {
                field554 = null;
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V", line = 56)
    public static void method280(byte arg0) {
        field561 = null;
        field560 = null;
        field554 = null;
        if (arg0 != -117) {
            method282(127, -111, -8, -29, 42, 16);
        }
        field557 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)Z", line = 69)
    public static final boolean method281(int arg0) {
        if (arg0 == 14848) {
            field556++;
            return class59.field849 != 0 || class227.field3206 >= 2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIII)V", line = 95)
    public static final void method282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field558++;
        int var6 = (arg1 - 32) * arg1 / arg3;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg1 - var6 - 32) * arg5 / (arg3 - arg1);
        class197.field2825[0].method1499(arg0, arg2);
        class197.field2825[1].method1499(arg0, arg2 + arg1 - 16);
        if (arg4 >= -53) {
            field554 = null;
        }
        class35.field574.method2766(16, arg1 - 32, arg0, arg2 + 16, class165.field2147, 77);
        class35.field574.method2766(16, var6, arg0, var7 + arg2 + 16, class54.field800, 83);
        class35.field574.method2771(true, arg2 + var7 + 16, class234.field3290, arg0, var6);
        class35.field574.method2771(true, arg2 - (-var7 - 16), class234.field3290, arg0 + 1, var6);
        class35.field574.method2769(arg0, class234.field3290, (byte) -96, 16, arg2 + var7 + 16);
        class35.field574.method2769(arg0, class234.field3290, (byte) -94, 16, arg2 + var7 + 17);
        class35.field574.method2771(true, arg2 + var7 + 16, class64.field905, arg0 + 15, var6);
        class35.field574.method2771(true, arg2 - (-var7 - 17), class64.field905, arg0 + 14, var6 + -1);
        class35.field574.method2769(arg0, class64.field905, (byte) -123, 16, arg2 + 15 - (-var6 + -var7));
        class35.field574.method2769(arg0 + 1, class64.field905, (byte) -127, 15, arg2 - (-var7 - var6 - 14));
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLta;III)V", line = 131)
    public static final void method283(byte arg0, class404 arg1, int arg2, int arg3, int arg4) {
        field559++;
        if (arg0 <= 82) {
            field557 = null;
        }
        for (class166 var5 = (class166) class70.field965.method2649(0); var5 != null; var5 = (class166) class70.field965.method2656(0)) {
            if (var5.field2161 == arg4 && arg2 * 128 == var5.field2184 && arg3 * 128 == var5.field2176 && var5.field2185.field6059 == arg1.field6059) {
                if (var5.field2162 != null) {
                    class405.field6092.method166(var5.field2162);
                    var5.field2162 = null;
                }
                if (var5.field2160 != null) {
                    class405.field6092.method166(var5.field2160);
                    var5.field2160 = null;
                }
                var5.method2574((byte) 124);
                return;
            }
        }
    }
}
