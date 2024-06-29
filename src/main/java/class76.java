import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class76 extends Exception {

    @OriginalMember(owner = "client!qw", name = "g", descriptor = "Ljb;")
    public static class493 field991 = null;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!qw", name = "d", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!qw", name = "e", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!qw", name = "f", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIBI[B)V")
    public static final void method605(int arg0, int arg1, int arg2, byte arg3, int arg4, byte[] arg5) {
        field987++;
        if (arg2 >= arg4 || arg3 < 19) {
            return;
        }
        int var6 = arg4 - arg2 >> 2;
        int var7 = arg1 + arg2;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg4 - arg2 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg5[var7++] = 1;
                }
            }
            arg5[var7++] = 1;
            arg5[var7++] = 1;
            arg5[var7++] = 1;
            arg5[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)V")
    public static void method606(byte arg0) {
        field991 = null;
        if (arg0 != 1) {
            method610(-58, null);
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(BLwm;)V")
    public static final void method607(byte arg0, class564 arg1) {
        if (arg0 != 1) {
            method606((byte) -97);
        }
        if (arg1 instanceof class468) {
            class468 var2 = (class468) arg1;
            if (var2.field6632 != null) {
                class378.method2371(var2, class660.field9039.field1266 != var2.field1266, 3415);
            }
        } else if (arg1 instanceof class280) {
            class280 var3 = (class280) arg1;
            class456.method2712(class660.field9039.field1266 != var3.field1266, (byte) 122, var3);
        }
        field990++;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)V")
    public static final void method608(int arg0) {
        if (class151.method1028(-2)) {
            if (class540.field7569 == null) {
                class90.method683((byte) 112);
            }
            class130.field1571 = true;
            class101.field1199 = 0;
        }
        if (arg0 != 12887) {
            method608(-77);
        }
        field986++;
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(I)V")
    public static final void method609(int arg0) {
        class578.field8168 = 0;
        field988++;
        for (int var1 = 0; var1 < 2048; var1++) {
            class522.field7398[var1] = null;
            class471.field6687[var1] = 1;
            class711.field9886[var1] = null;
        }
        if (arg0 >= -12) {
            method607((byte) -43, null);
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILmq;)V")
    public static final void method610(int arg0, class508 arg1) {
        field989++;
        boolean var2 = false;
        arg1.method3311(100);
        if (arg0 > -30) {
            field991 = null;
        }
        for (class508 var3 = (class508) class455.field6429.method4000((byte) -7); var3 != null; var3 = (class508) class455.field6429.method4002(-123)) {
            if (class356.method2290(false, var3.method3002((byte) 79), arg1.method3002((byte) 79))) {
                class420.method2577(-100, var3, arg1);
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class455.field6429.method3999(arg1, 21934);
        }
    }
}
