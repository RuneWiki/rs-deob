import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class226 {

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "Z")
    public static boolean field3188 = false;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "[[Z")
    public static boolean[][] field3187 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "[I")
    public static int[] field3182 = new int[1000];

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "Ljb;")
    public static class425 field3183;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
    public static void method1402(int arg0) {
        field3187 = null;
        field3182 = null;
        if (arg0 == 671288225) {
            field3183 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BII)I")
    public static final int method1403(byte arg0, int arg1, int arg2) {
        field3191++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return arg0 > -11 ? -26 : (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IZIII)Z")
    public static final boolean method1404(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3184++;
        if ((class37.field606[0][arg0][arg2] & 0x2) != 0) {
            return true;
        } else if ((class37.field606[arg3][arg0][arg2] & 0x10) == 0) {
            if (!arg1) {
                method1402(77);
            }
            return class383.method2516(arg0, -49, arg2, arg3) == arg4;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILqj;ZLqj;)V")
    public static final void method1405(int arg0, class238 arg1, boolean arg2, class238 arg3) {
        class192.field2671 = arg2;
        field3185++;
        class396.field5944 = arg3;
        class248.field3459 = arg1;
        if (arg0 != 2) {
            field3187 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static final void method1406(String arg0, Throwable arg1, int arg2) {
        field3190++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class271.method1736((byte) 117, arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class326.method2011(4, var3);
            String var4 = class368.method2431(var3, ":", "%3a", arg2);
            String var5 = class368.method2431(var4, "@", "%40", arg2 + arg2);
            String var6 = class368.method2431(var5, "&", "%26", 0);
            String var7 = class368.method2431(var6, "#", "%23", 0);
            if (class363.field5304.field29 != null) {
                class296 var8 = class363.field5304.method9((byte) 91, new URL(class363.field5304.field29.getCodeBase(), "clienterror.ws?c=" + class413.field6167 + "&u=" + class249.field3595 + "&v1=" + class2.field13 + "&v2=" + class2.field30 + "&e=" + var7));
                while (var8.field4259 == 0) {
                    class404.method2628(-28, 1L);
                }
                if (var8.field4259 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field4262;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIII)V")
    public static final void method1407(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3186++;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg3 * arg3;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg1 << 1) - 3) * var11;
        if (arg2 != 21697) {
            method1403((byte) 27, -93, 29);
        }
        int var19 = (var6 + 1) * var16;
        if (arg4 >= class180.field2375 && class50.field695 >= arg4) {
            int var20 = class143.method950(-15543, class297.field4268, class203.field2942, arg3 + arg5);
            int var21 = class143.method950(-15543, class297.field4268, class203.field2942, arg5 - arg3);
            class370.method2440(var20, class227.field3201[arg4], arg0, var21, arg2 - 21602);
        }
        int var22 = (arg1 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var19 += var16;
                    var6++;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var6++;
                var19 += var16;
                var17 += var16;
            }
            var13 += -var22;
            var14 += -var18;
            var7--;
            var18 -= var15;
            var22 -= var15;
            int var23 = arg4 - var7;
            int var24 = arg4 + var7;
            if (var24 >= class180.field2375 && var23 <= class50.field695) {
                int var25 = class143.method950(-15543, class297.field4268, class203.field2942, arg5 + var6);
                int var26 = class143.method950(-15543, class297.field4268, class203.field2942, arg5 - var6);
                if (class180.field2375 <= var23) {
                    class370.method2440(var25, class227.field3201[var23], arg0, var26, arg2 ^ 0x54A9);
                }
                if (var24 <= class50.field695) {
                    class370.method2440(var25, class227.field3201[var24], arg0, var26, 86);
                }
            }
        }
    }
}
