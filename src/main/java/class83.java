import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class83 {

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    public int field1370 = -1;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "Ldg;")
    public static class376 field1367 = new class376(66, -1);

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "Lnea;")
    public static class664 field1374 = new class664(98, -2);

    @OriginalMember(owner = "client!iv", name = "k", descriptor = "I")
    public static int field1375 = 0;

    @OriginalMember(owner = "client!iv", name = "l", descriptor = "I")
    public static int field1376 = 0;

    @OriginalMember(owner = "client!iv", name = "m", descriptor = "Lnea;")
    public static class664 field1377 = new class664(50, 3);

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "Lmp;")
    public class706 field1366;

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "[I")
    public int[] field1373;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "[Lf;")
    public static class702[] field1371;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "[Ljava/lang/String;")
    public String[] field1365;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)V", line = 8)
    public static void method736(byte arg0) {
        if (arg0 < 34) {
            method736((byte) 84);
        }
        field1367 = null;
        field1371 = null;
        field1374 = null;
        field1377 = null;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ZI[S)[S", line = 21)
    public static final short[] method737(boolean arg0, int arg1, short[] arg2) {
        field1372++;
        short[] var3 = new short[arg1];
        if (arg0) {
            field1376 = -109;
        }
        class476.method2791(arg2, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILpaa;IILet;IILde;)V", line = 36)
    public static final void method738(int arg0, class577 arg1, int arg2, int arg3, class550 arg4, int arg5, int arg6, class491 arg7) {
        field1368++;
        class28 var8 = new class28();
        if (arg5 != -25535) {
            return;
        }
        var8.field409 = arg0 << 9;
        var8.field416 = arg3 << 9;
        var8.field426 = arg2;
        if (arg4 != null) {
            var8.field423 = arg4;
            int var9 = arg4.field7752;
            int var10 = arg4.field7733;
            if (arg6 == 1 || arg6 == 3) {
                var9 = arg4.field7733;
                var10 = arg4.field7752;
            }
            var8.field415 = arg4.field7731;
            var8.field404 = arg4.field7757;
            var8.field406 = arg4.field7802;
            var8.field418 = arg4.field7750;
            var8.field410 = arg4.field7753 << 9;
            var8.field431 = arg3 + var10 << 9;
            var8.field420 = arg4.field7800;
            var8.field413 = arg0 + var9 << 9;
            var8.field419 = arg4.field7814;
            var8.field403 = arg4.field7724;
            if (arg4.field7781 != null) {
                var8.field417 = true;
                var8.method324(0);
            }
            if (var8.field419 != null) {
                var8.field414 = (int) (Math.random() * (double) (var8.field403 - var8.field418)) + var8.field418;
            }
            class436.field6382.method474(var8, 6);
        } else if (arg1 != null) {
            var8.field425 = arg1;
            class592 var11 = arg1.field8121;
            if (var11.field8315 != null) {
                var8.field417 = true;
                var11 = var11.method3356(89, class61.field1163);
            }
            if (var11 != null) {
                var8.field413 = var11.field8345 + arg0 << 9;
                var8.field431 = var11.field8345 + arg3 << 9;
                var8.field406 = class696.method3882((byte) 106, arg1);
                var8.field404 = var11.field8355;
                var8.field415 = var11.field8305;
                var8.field410 = var11.field8291 << 9;
            }
            class490.field6944.method474(var8, 6);
        } else if (arg7 != null) {
            var8.field429 = arg7;
            var8.field413 = arg7.method2553((byte) 95) + arg0 << 9;
            var8.field431 = arg7.method2553((byte) 89) + arg3 << 9;
            var8.field406 = class595.method3369(arg7, false);
            var8.field415 = arg7.field6996;
            var8.field404 = arg7.field6998;
            var8.field410 = arg7.field6986 << 9;
            class423.field6151.method1403((byte) -18, var8, (long) arg7.field6216);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(BLde;IBI)V", line = 129)
    public static final void method739(byte arg0, class491 arg1, int arg2, byte arg3, int arg4) {
        int var5 = -128 % ((arg3 - 18) / 38);
        field1369++;
        int var6 = arg1.field6271[0];
        int var7 = arg1.field6262[0];
        if (var6 < 0 || var6 >= class199.field2812 || var7 < 0 || var7 >= class232.field3611 || arg4 < 0 || class199.field2812 <= arg4 || arg2 < 0 || class232.field3611 <= arg2) {
            return;
        }
        int var8 = class615.method3421(var6, 0, 0, var7, false, class355.field5107, class423.field6155[arg1.field3019], arg2, true, arg4, 0, -4, 0, class178.field2533, arg1.method2553((byte) 113));
        if (var8 >= 1 && var8 <= 3) {
            for (int var9 = 0; var9 < var8 - 1; var9++) {
                arg1.method2852(arg0, -1, class355.field5107[var9], class178.field2533[var9]);
            }
        }
    }
}
