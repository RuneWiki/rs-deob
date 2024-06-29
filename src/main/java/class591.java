import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class591 {

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "Lin;")
    public static class380 field8477 = new class380(121, 12);

    @OriginalMember(owner = "client!uia", name = "f", descriptor = "I")
    public static int field8482 = 0;

    @OriginalMember(owner = "client!uia", name = "d", descriptor = "Lrl;")
    public static class713 field8480 = new class713();

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "I")
    public static int field8478;

    @OriginalMember(owner = "client!uia", name = "c", descriptor = "I")
    public static int field8479;

    @OriginalMember(owner = "client!uia", name = "e", descriptor = "I")
    public static int field8481;

    @OriginalMember(owner = "client!uia", name = "g", descriptor = "I")
    public static int field8483;

    @OriginalMember(owner = "client!uia", name = "h", descriptor = "I")
    public static int field8484;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(Lfm;IIILfm;BIIII)V")
    public static final void method3462(class281 arg0, int arg1, int arg2, int arg3, class281 arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        field8483++;
        int var10 = arg4.method200((byte) 41);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class85 var12 = (class85) class267.field3772.method2882((long) var10, (byte) -80);
        if (var12 == null) {
            class418[] var13 = class418.method2472(class176.field2648, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class686.field9702.method487(var13[0], true);
            class267.field3772.method2890(-7307, (long) var10, var12);
        }
        method3466(0, arg2, 0, arg6 >> 1, arg0.field10350, arg1, arg0.field10361, arg0.method209(true) * 256, arg3 >> 1, arg0.field10347);
        int var14 = arg8 + class27.field292[0] - 18;
        int var15 = arg7 / 4 * 18 + var14;
        int var16 = arg9 + class27.field292[1] - 70;
        int var17 = arg7 % 4 * 18 + var16;
        if (arg5 != 43) {
            field8477 = null;
        }
        var12.method759(var15, var17);
        if (arg0 == arg4) {
            class686.field9702.method2771(18, var15 - 1, -256, 126, var17 - 1, 18);
        }
        class528.method3090(3985, var17 + 18, var17 - 1, var15 - 1, var15 + 18);
        class400 var18 = class36.method282((byte) 104);
        var18.field5516 = arg4;
        var18.field5513 = var15 + 16;
        var18.field5517 = var17;
        var18.field5515 = var17 + 16;
        var18.field5510 = var15;
        class209.field3056.method1734(var18, arg5 ^ 0x2B);
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(IC)C")
    public static final char method3463(int arg0, char arg1) {
        field8481++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (~arg1 == arg0 ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(B)V")
    public static void method3464(byte arg0) {
        field8480 = null;
        field8477 = null;
        if (arg0 != 50) {
            method3462(null, 101, 30, -95, null, (byte) 84, 125, 64, 36, -30);
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(Lmha;IIZILmha;Z)I")
    public static final int method3465(class422 arg0, int arg1, int arg2, boolean arg3, int arg4, class422 arg5, boolean arg6) {
        field8479++;
        int var7 = class390.method2343((byte) -110, arg2, arg0, arg6, arg5);
        if (arg1 != var7) {
            return arg6 ? -var7 : var7;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var8 = class390.method2343((byte) -75, arg4, arg0, arg3, arg5);
            return arg3 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method3466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 != 0) {
            return;
        }
        field8478++;
        if (arg9 < 512 || arg4 < 512 || (class192.field2891 - 2) * 512 < arg9 || class456.field6225 * 512 - 1024 < arg4) {
            class27.field292[0] = class27.field292[1] = -1;
            return;
        }
        int var10 = class577.method3399(arg4, arg9, -8724, arg6) - arg0;
        if (class593.field8489) {
            class302.method1879(true, 5117);
        } else {
            class390.field5441.method1558(arg7, 0, 0);
            class686.field9702.method498(class390.field5441);
        }
        if (class765.field10581) {
            class686.field9702.method483(arg9, var10, arg4, class349.field4956, class27.field292);
        } else {
            class686.field9702.method485(arg9, var10, arg4, class27.field292);
        }
        if (class593.field8489) {
            class570.method3301(92);
        } else {
            class390.field5441.method1558(-arg7, 0, 0);
            class686.field9702.method498(class390.field5441);
        }
    }
}
