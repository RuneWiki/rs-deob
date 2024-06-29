import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class43 {

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Lrd;")
    private static class117 field1222 = class95.method812("Please wait 1 minute and try again)3", (byte) 8);

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Lrd;")
    public static class117 field1224 = field1222;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lrd;")
    public static class117 field1218 = field1222;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "La;")
    public static class1 field1227 = new class1();

    @OriginalMember(owner = "client!g", name = "o", descriptor = "Lrd;")
    private static class117 field1232 = class95.method812("Please close the interface you have open before using (Wreport abuse(W", (byte) 8);

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field1229 = 0;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "[Lrd;")
    public static class117[] field1236 = new class117[100];

    @OriginalMember(owner = "client!g", name = "r", descriptor = "Lrd;")
    private static class117 field1235 = class95.method812("Please remove ", (byte) 8);

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Lrd;")
    public static class117 field1233 = field1235;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "Lrd;")
    public static class117 field1230 = field1232;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "Lrd;")
    public static class117 field1237 = field1235;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Lrd;")
    private static class117 field1228 = class95.method812("RuneScape is loading )2 please wait)3)3)3", (byte) 8);

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Lrd;")
    public static class117 field1231 = field1228;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "Lwa;")
    public static class144 field1234;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "[I")
    public static int[] field1219;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIII)V")
    public static final void method478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1223++;
        int var7 = 2048 - arg3 & 0x7FF;
        int var8 = 2048 - arg4 & 0x7FF;
        int var9 = 0;
        int var10 = arg6;
        int var11 = 0;
        if (var7 != 0) {
            int var12 = class129.field3131[var7];
            int var13 = class129.field3135[var7];
            int var14 = var11 * var12 - arg6 * var13 >> 16;
            var10 = var11 * var13 + arg6 * var12 >> 16;
            var11 = var14;
        }
        if (var8 != 0) {
            int var15 = class129.field3131[var8];
            int var16 = class129.field3135[var8];
            int var17 = var9 * var15 + var10 * var16 >> 16;
            var10 = var10 * var15 - var9 * var16 >> 16;
            var9 = var17;
        }
        class39.field1131 = arg3;
        class111.field2784 = arg4;
        class4.field105 = arg2 - var10;
        class38.field1117 = arg1 - var11;
        class45.field1271 = arg0 - var9;
        if (arg5 != -728) {
            method482(101);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/awt/Component;IILba;)Lce;")
    public static final class20 method479(int arg0, Component arg1, int arg2, int arg3, class9 arg4) {
        field1225++;
        if (~class85.field2224 == arg2) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class20 var5 = (class20) Class.forName("bd").getDeclaredConstructor().newInstance();
                var5.field518 = arg0;
                var5.field508 = new int[(class59.field1633 ? 2 : 1) * 256];
                var5.method99(arg1);
                var5.field520 = (-1024 & arg0) + 1024;
                if (var5.field520 > 16384) {
                    var5.field520 = 16384;
                }
                var5.method101(var5.field520);
                if (class77.field2096 > 0 && class83.field2176 == null) {
                    class83.field2176 = new class65();
                    arg4.method66(class77.field2096, class83.field2176, true);
                }
                if (class83.field2176 != null) {
                    if (class83.field2176.field1866[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class83.field2176.field1866[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class112 var6 = new class112(arg4, arg3);
                    var6.field508 = new int[(class59.field1633 ? 2 : 1) * 256];
                    var6.field518 = arg0;
                    var6.method99(arg1);
                    var6.field520 = 16384;
                    var6.method101(var6.field520);
                    if (class77.field2096 > 0 && class83.field2176 == null) {
                        class83.field2176 = new class65();
                        arg4.method66(class77.field2096, class83.field2176, true);
                    }
                    if (class83.field2176 != null) {
                        if (class83.field2176.field1866[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class83.field2176.field1866[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class20();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZJ)V")
    public static final void method480(boolean arg0, long arg1) {
        field1221++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class5.field119; var3++) {
            if (class56.field1551[var3] == arg1) {
                class5.field119--;
                class46.field1299++;
                class13.field262 = true;
                for (int var4 = var3; var4 < class5.field119; var4++) {
                    class72.field2025[var4] = class72.field2025[var4 + 1];
                    class35.field1037[var4] = class35.field1037[var4 + 1];
                    class56.field1551[var4] = class56.field1551[var4 + 1];
                    class15.field352[var4] = class15.field352[var4 + 1];
                }
                class84.field2198 = class85.field2236 + 1;
                class25.field754.method739(false, 0);
                class25.field754.method163(-18, arg1);
                break;
            }
        }
        if (arg0) {
            field1236 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method481(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class132 var10 = null;
        field1226++;
        for (class132 var11 = (class132) field1227.method3(false); var11 != null; var11 = (class132) field1227.method14(127)) {
            if (var11.field3169 == arg1 && var11.field3155 == arg5 && var11.field3153 == arg3 && var11.field3167 == arg2) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class132();
            var10.field3169 = arg1;
            var10.field3167 = arg2;
            var10.field3155 = arg5;
            var10.field3153 = arg3;
            class144.method1141(var10, 0);
            field1227.method10(var10, (byte) 93);
        }
        var10.field3162 = arg8;
        if (arg0 == 1) {
            var10.field3160 = arg6;
            var10.field3165 = arg7;
            var10.field3152 = arg9;
            var10.field3151 = arg4;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static void method482(int arg0) {
        field1218 = null;
        field1234 = null;
        field1228 = null;
        field1219 = null;
        field1236 = null;
        field1224 = null;
        field1235 = null;
        int var1 = -47 % ((arg0 + 31) / 35);
        field1230 = null;
        field1231 = null;
        field1232 = null;
        field1227 = null;
        field1233 = null;
        field1222 = null;
        field1237 = null;
    }
}
