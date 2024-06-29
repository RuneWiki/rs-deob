import java.awt.Frame;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public abstract class class349 extends class449 {

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    public static int field4807 = 0;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "[Lnc;")
    public static class135[] field4803 = new class135[14];

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field4802 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "Lcf;")
    public static class92 field4808 = new class92();

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lis;IILjava/lang/String;)Lor;")
    public static final class275 method2161(class65 arg0, int arg1, int arg2, String arg3) {
        if (arg1 != 12241) {
            field4808 = null;
        }
        field4806++;
        if (arg2 == 0) {
            return arg0.method602(-98, arg3);
        } else if (arg2 == 1) {
            try {
                class32.method202(arg0.field960, "openjs", (byte) -71, new Object[] { (new URL(arg0.field960.getCodeBase(), arg3)).toString() });
                class275 var4 = new class275();
                var4.field3979 = 1;
                return var4;
            } catch (Throwable var10) {
                class275 var5 = new class275();
                var5.field3979 = 2;
                return var5;
            }
        } else if (arg2 == 2) {
            try {
                arg0.field960.getAppletContext().showDocument(new URL(arg0.field960.getCodeBase(), arg3), "_blank");
                class275 var6 = new class275();
                var6.field3979 = 1;
                return var6;
            } catch (Exception var11) {
                class275 var7 = new class275();
                var7.field3979 = 2;
                return var7;
            }
        } else if (arg2 == 3) {
            try {
                class32.method200("loggedout", (byte) -90, arg0.field960);
            } catch (Throwable var13) {
            }
            try {
                arg0.field960.getAppletContext().showDocument(new URL(arg0.field960.getCodeBase(), arg3), "_top");
                class275 var8 = new class275();
                var8.field3979 = 1;
                return var8;
            } catch (Exception var12) {
                class275 var9 = new class275();
                var9.field3979 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V")
    public static void method2162(int arg0) {
        field4802 = null;
        if (arg0 != 0) {
            method2164(-1, (class361) null);
        }
        field4808 = null;
        field4803 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([BIZ)I")
    public static final int method2163(byte[] arg0, int arg1, boolean arg2) {
        if (arg2) {
            method2163((byte[]) null, -42, false);
        }
        field4809++;
        return class345.method2148(arg0, arg1, 0, (byte) -65);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILwg;)I")
    public static final int method2164(int arg0, class361 arg1) {
        if (arg0 != -15368) {
            field4804 = 102;
        }
        field4805++;
        class37 var2 = arg1.field4952;
        if (var2.field434 != null) {
            var2 = var2.method232(class416.field5691, arg0 ^ 0x3C07);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field458;
        class389 var4 = arg1.method2506(arg0 ^ 0x3D6);
        if (arg1.field5765) {
            var3 = var2.field435;
        } else if (arg1.field5763 == var4.field5343 || arg1.field5763 == var4.field5348 || arg1.field5763 == var4.field5351 || arg1.field5763 == var4.field5352) {
            var3 = var2.field444;
        } else if (arg1.field5763 == var4.field5361 || arg1.field5763 == var4.field5344 || arg1.field5763 == var4.field5336 || arg1.field5763 == var4.field5350) {
            var3 = var2.field441;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZIIILis;)Ljava/awt/Frame;")
    public static final Frame method2165(int arg0, boolean arg1, int arg2, int arg3, int arg4, class65 arg5) {
        field4801++;
        if (!arg5.method607(83)) {
            return null;
        }
        if (arg2 == 0) {
            class473[] var6 = class175.method1267(2, arg5);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field6661 == arg3 && var6[var8].field6656 == arg4 && (arg0 == 0 || var6[var8].field6657 == arg0) && (!var7 || var6[var8].field6654 > arg2)) {
                    arg2 = var6[var8].field6654;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        if (!arg1) {
            method2165(22, true, 107, -124, 36, (class65) null);
        }
        class275 var9 = arg5.method610(0, arg0, arg2, arg3, arg4);
        while (var9.field3979 == 0) {
            class89.method752(0, 10L);
        }
        Frame var10 = (Frame) var9.field3984;
        if (var10 == null) {
            return null;
        } else if (var9.field3979 == 2) {
            class480.method2834(var10, arg5, 0);
            return null;
        } else {
            return var10;
        }
    }
}
