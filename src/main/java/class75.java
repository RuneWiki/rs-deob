import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class75 {

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Lqk;")
    private static class207 field1372 = class24.method212(255, "Nov");

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Lqk;")
    private static class207 field1371 = class24.method212(255, "Jun");

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "Lqk;")
    private static class207 field1385 = class24.method212(255, "Feb");

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "Lqk;")
    private static class207 field1377 = class24.method212(255, "Oct");

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "S")
    public static short field1383 = 1;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "Lqk;")
    private static class207 field1375 = class24.method212(255, "Jul");

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "Lqk;")
    private static class207 field1379 = class24.method212(255, "Dec");

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "Lqk;")
    private static class207 field1389 = class24.method212(255, "Mar");

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "Lqk;")
    private static class207 field1386 = class24.method212(255, "Aug");

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "Lqk;")
    private static class207 field1376 = class24.method212(255, "Jan");

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "Lqk;")
    public static class207 field1374 = class24.method212(255, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Lqk;")
    private static class207 field1378 = class24.method212(255, "Sep");

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "Lqk;")
    private static class207 field1391 = class24.method212(255, "May");

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "Lqk;")
    private static class207 field1392 = class24.method212(255, "Apr");

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "[Lqk;")
    public static class207[] field1380 = new class207[] { field1376, field1385, field1389, field1392, field1391, field1371, field1375, field1386, field1378, field1377, field1372, field1379 };

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "Lqk;")
    public static class207 field1393 = class24.method212(255, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "F")
    public static float field1390;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "Lqe;")
    public static class96 field1384;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "[[[B")
    public static byte[][][] field1388;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)Lqk;")
    public static final class207 method541(int arg0, int arg1, int arg2) {
        field1373++;
        int var3 = arg0 - arg1;
        if (var3 < arg2) {
            return class88.field1600;
        } else if (var3 < -6) {
            return client.field2688;
        } else if (var3 < -3) {
            return class225.field4101;
        } else if (var3 < 0) {
            return class10.field147;
        } else if (var3 > 9) {
            return class133.field2298;
        } else if (var3 > 6) {
            return class9.field136;
        } else if (var3 > 3) {
            return class287.field5126;
        } else if (var3 > 0) {
            return class40.field801;
        } else {
            return class196.field3446;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIZII)V")
    public static final void method542(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field1387++;
        int var7 = class21.method123(arg1, -15466, class204.field3580, class204.field3602);
        int var8 = class21.method123(arg0, -15466, class204.field3580, class204.field3602);
        int var9 = class21.method123(arg5, -15466, class124.field2158, class88.field1599);
        int var10 = class21.method123(arg3, -15466, class124.field2158, class88.field1599);
        int var11 = class21.method123(arg1 + arg2, -15466, class204.field3580, class204.field3602);
        int var12 = class21.method123(arg0 - arg2, -15466, class204.field3580, class204.field3602);
        if (!arg4) {
            method541(-115, 34, 90);
        }
        for (int var13 = var7; var13 < var11; var13++) {
            class215.method1544(var9, var10, class15.field238[var13], arg6, 90);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class215.method1544(var9, var10, class15.field238[var14], arg6, -53);
        }
        int var15 = class21.method123(arg2 + arg5, -15466, class124.field2158, class88.field1599);
        int var16 = class21.method123(arg3 - arg2, -15466, class124.field2158, class88.field1599);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class15.field238[var17];
            class215.method1544(var9, var15, var18, arg6, 120);
            class215.method1544(var16, var10, var18, arg6, 96);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static void method543(int arg0) {
        field1393 = null;
        field1384 = null;
        field1379 = null;
        field1371 = null;
        field1389 = null;
        field1388 = null;
        field1374 = null;
        field1376 = null;
        if (arg0 != -9863) {
            return;
        }
        field1378 = null;
        field1392 = null;
        field1372 = null;
        field1391 = null;
        field1377 = null;
        field1380 = null;
        field1385 = null;
        field1375 = null;
        field1386 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V")
    public static final void method544(boolean arg0) {
        class158.field2795++;
        field1382++;
        class261.field4645.method767(219, (byte) 57);
        class261.field4645.method1048((byte) 77, 0L);
        if (arg0) {
            field1377 = null;
        }
    }
}
