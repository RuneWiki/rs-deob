import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class46 {

    @OriginalMember(owner = "client!aea", name = "i", descriptor = "[I")
    public static int[] field555 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!aea", name = "k", descriptor = "[I")
    public static int[] field557 = new int[1];

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "Lwf;")
    public static class117 field549 = new class117(64);

    @OriginalMember(owner = "client!aea", name = "m", descriptor = "I")
    public static int field559 = 0;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "I")
    public int field547;

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "I")
    public int field550;

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "I")
    public int field551;

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
    public int field552;

    @OriginalMember(owner = "client!aea", name = "g", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!aea", name = "h", descriptor = "I")
    public int field554;

    @OriginalMember(owner = "client!aea", name = "j", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!aea", name = "l", descriptor = "I")
    public int field558;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IZILvp;I)V", line = 8)
    public static final void method289(int arg0, boolean arg1, int arg2, class162 arg3, int arg4) {
        field556++;
        int var5 = arg3.field2527;
        if (arg3.field2487 == 0) {
            arg3.field2527 = arg3.field2450;
        } else if (arg3.field2487 == 1) {
            arg3.field2527 = arg2 - arg3.field2450;
        } else if (arg3.field2487 == 2) {
            arg3.field2527 = arg3.field2450 * arg2 >> 14;
        }
        int var6 = arg3.field2459;
        if (arg3.field2458 == 0) {
            arg3.field2459 = arg3.field2492;
        } else if (arg3.field2458 == 1) {
            arg3.field2459 = arg4 - arg3.field2492;
        } else if (arg3.field2458 == 2) {
            arg3.field2459 = arg3.field2492 * arg4 >> 14;
        }
        if (~arg3.field2487 == arg0) {
            arg3.field2527 = arg3.field2459 * arg3.field2442 / arg3.field2437;
        }
        if (arg3.field2458 == 4) {
            arg3.field2459 = arg3.field2527 * arg3.field2437 / arg3.field2442;
        }
        if (class112.field1592 && (client.method1599(arg3).field9207 != 0 || arg3.field2552 == 0)) {
            if (arg3.field2459 < 5 && arg3.field2527 < 5) {
                arg3.field2527 = 5;
                arg3.field2459 = 5;
            } else {
                if (arg3.field2527 <= 0) {
                    arg3.field2527 = 5;
                }
                if (arg3.field2459 <= 0) {
                    arg3.field2459 = 5;
                }
            }
        }
        if (class610.field9049 == arg3.field2476) {
            class324.field4470 = arg3;
        }
        if (arg1 && arg3.field2485 != null && arg3.field2527 != var5 || arg3.field2459 != var6) {
            class518 var7 = new class518();
            var7.field7376 = arg3;
            var7.field7383 = arg3.field2485;
            class272.field3848.method131(var7, 0);
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lk;III[Z)V", line = 86)
    public static final void method290(class485 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class165.field2609 == class114.field1609) {
            return;
        }
        int var5 = class207.field3077[arg1].method1233(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class176 var7 = class207.field3077[var6];
                if (var7 != null) {
                    var7.method1232(arg0, arg2, var5 - var7.method1233(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)V", line = 114)
    public static void method291(byte arg0) {
        field557 = null;
        field555 = null;
        if (arg0 != 54) {
            method289(54, false, 1, null, -10);
        }
        field549 = null;
    }
}
