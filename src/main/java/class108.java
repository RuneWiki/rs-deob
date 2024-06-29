import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class108 {

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field2453 = -1;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Lva;")
    private static class121 field2455 = class107.method797("RuneScape has been updated(Q", -10983);

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Lva;")
    public static class121 field2456 = class107.method797("overlay_multiway", -10983);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Lva;")
    public static class121 field2451 = field2455;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Ljava/lang/Object;")
    public static Object field2458 = new Object();

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "J")
    public static long field2460 = 0L;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Lbb;")
    public static class9 field2461 = new class9();

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V", line = 25)
    public static void method800(byte arg0) {
        field2461 = null;
        field2456 = null;
        field2455 = null;
        field2451 = null;
        field2458 = null;
        if (arg0 != 64) {
            method801(60, -48, 11, 81, -57, null, 74, 91, 21);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIILd;III)V", line = 55)
    public static final void method801(int arg0, int arg1, int arg2, int arg3, int arg4, class19 arg5, int arg6, int arg7, int arg8) {
        field2459++;
        if (class33.field812) {
            class52.field1206 = 32;
        } else {
            class52.field1206 = 0;
        }
        int var9 = 97 % ((71 - arg2) / 42);
        class33.field812 = false;
        if (arg6 >= arg4 && arg4 + 16 > arg6 && arg7 <= arg0 && arg0 < arg7 + 16) {
            if (arg3 == 2 || arg3 == 3) {
                class9.field140 = true;
            }
            if (arg3 == 1) {
                class97.field2168 = true;
            }
            arg5.field481 -= class8.field117 * 4;
        } else if (arg6 >= arg4 && arg6 < arg4 + 16 && arg0 >= arg1 + arg7 - 16 && arg0 < arg1 + arg7) {
            if (arg3 == 1) {
                class97.field2168 = true;
            }
            arg5.field481 += class8.field117 * 4;
            if (arg3 == 2 || arg3 == 3) {
                class9.field140 = true;
            }
        } else if (arg6 >= arg4 - class52.field1206 && arg4 + class52.field1206 + 16 > arg6 && arg0 >= arg7 + 16 && arg1 + arg7 - 16 > arg0 && class8.field117 > 0) {
            class33.field812 = true;
            if (arg3 == 1) {
                class97.field2168 = true;
            }
            int var10 = (arg1 - 32) * arg1 / arg8;
            if (var10 < 8) {
                var10 = 8;
            }
            if (arg3 == 2 || arg3 == 3) {
                class9.field140 = true;
            }
            int var11 = arg0 - arg7 - var10 / 2 - 16;
            int var12 = arg1 - var10 - 32;
            arg5.field481 = (arg8 - arg1) * var11 / var12;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILbc;I)V", line = 132)
    public static final void method802(int arg0, int arg1, class10 arg2, int arg3) {
        field2452++;
        int var4 = arg1 * arg1 + arg3 * arg3;
        if (arg0 != -12199) {
            field2451 = null;
        }
        if (var4 <= 4225 || var4 >= 90000) {
            class48.method351(arg1, (byte) -107, arg2, arg3);
            return;
        }
        int var5 = class96.field2149 + class69.field1633 & 0x7FF;
        int var6 = class102.field2323[var5];
        int var7 = class102.field2321[var5];
        int var8 = var6 * 256 / (class28.field700 + 256);
        int var9 = var7 * 256 / (class28.field700 + 256);
        int var10 = arg3 * var8 - arg1 * var9 >> 16;
        int var11 = arg1 * var8 + arg3 * var9 >> 16;
        double var12 = Math.atan2((double) var11, (double) var10);
        int var14 = (int) (Math.sin(var12) * 63.0D);
        int var15 = (int) (Math.cos(var12) * 57.0D);
        class22.field572.method77(var14 + 94 - 6, -var15 + 83 + -20, 20, 20, 15, 15, var12, 256);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V", line = 169)
    public static final void method803(byte arg0) {
        field2454++;
        if (class5.field89 == null) {
            return;
        }
        class9.method62(false);
        if (class97.field2164 > 0) {
            class5.field89.method142(256, (byte) 50);
            class97.field2164 = 0;
        }
        class5.field89.method141(699);
        if (arg0 > 114) {
            class5.field89 = null;
        }
    }
}
