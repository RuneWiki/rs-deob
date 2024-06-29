import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class125 {

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field2444 = 0;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "Lsg;")
    public static class30 field2447 = class167.method1221((byte) 33, "showVideoAd");

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field2448 = 0;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "[Z")
    public static boolean[] field2446 = new boolean[5];

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field2445 = -1;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field2442 = 0;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Lsg;")
    public static class30 field2449 = class167.method1221((byte) 33, "(U3");

    @OriginalMember(owner = "client!di", name = "c", descriptor = "[Lrc;")
    public static class275[] field2443 = new class275[32768];

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZI)V")
    public static final void method940(boolean arg0, int arg1) {
        field2452++;
        class189.field3446 = new int[arg1];
        class30.field599 = new int[104];
        class170.field3203 = new int[104];
        class232.field4142 = new int[104];
        class239.field4249 = 99;
        class32.field810 = new int[104];
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class16.field329 = new byte[var2][104][104];
        class194.field3505 = new int[var2][105][105];
        class244.field4367 = new byte[var2][104][104];
        class180.field3330 = new byte[var2][104][104];
        class166.field3050 = new byte[var2][105][105];
        class231.field4111 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static final void method941(int arg0) {
        class196.field3553.method1267(87, -9);
        field2451++;
        for (class180 var1 = (class180) class143.field2762.method1178(true); var1 != null; var1 = (class180) class143.field2762.method1176((byte) 22)) {
            if (var1.field3336 == 0) {
                class2.method13((byte) -73, true, var1);
            }
        }
        if (arg0 != 30549) {
            method942(-41, 46, 8, (byte) -128, -14, -69, 75, -91, -40, -69);
        }
        if (class263.field4661 != null) {
            class254.method1771(class263.field4661, 8);
            class263.field4661 = null;
        }
        class212.field3820++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIBIIIIII)V")
    public static final void method942(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 == arg2 && arg0 == arg6 && arg5 == arg9 && arg4 == arg8) {
            class182.method1313(arg4, arg0, arg7, arg1, true, arg9);
        } else {
            int var10 = arg1;
            int var11 = arg0;
            int var12 = arg1 * 3;
            int var13 = arg0 * 3;
            int var14 = arg5 * 3;
            int var15 = arg6 * 3;
            int var16 = arg2 * 3;
            int var17 = arg9 + var16 - arg1 - var14;
            int var18 = arg8 * 3;
            int var19 = var12 + var14 - var16 - var16;
            int var20 = var15 + arg4 - var18 - arg0;
            int var21 = var18 + var13 - var15 - var15;
            int var22 = var16 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var17 * var26;
                int var28 = var20 * var26;
                int var29 = var19 * var25;
                int var30 = var22 * var24;
                int var31 = var23 * var24;
                int var32 = (var27 + var29 + var30 >> 12) + arg1;
                int var33 = var21 * var25;
                int var34 = (var28 + var33 + var31 >> 12) + arg0;
                class182.method1313(var34, var11, arg7, var10, true, var32);
                var11 = var34;
                var10 = var32;
            }
        }
        field2450++;
        if (arg3 != -74) {
            method943(21);
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V")
    public static void method943(int arg0) {
        field2447 = null;
        field2443 = null;
        if (arg0 == 589) {
            field2449 = null;
            field2446 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZ)I")
    public static final int method944(int arg0, boolean arg1) {
        if (!arg1) {
            method941(113);
        }
        field2441++;
        return arg0 >>> 8;
    }
}
