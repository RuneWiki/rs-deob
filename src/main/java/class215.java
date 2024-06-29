import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class215 {

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3439 = "flash1:";

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "[S")
    public static short[] field3446 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field3442 = 0;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "[Z")
    public static boolean[] field3443 = new boolean[8];

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Lclient;")
    public static client field3444;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "[[[I")
    public static int[][][] field3440;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)Z", line = 6)
    public static final boolean method1621(int arg0) {
        field3438++;
        if (class42.field607) {
            return true;
        } else {
            if (arg0 != 25) {
                method1626((byte) 63);
            }
            return class264.field4429;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V", line = 25)
    public static void method1622(byte arg0) {
        field3446 = null;
        if (arg0 > -82) {
            field3442 = -16;
        }
        field3439 = null;
        field3440 = (int[][][]) null;
        field3444 = null;
        field3443 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLth;)V", line = 52)
    public static final void method1623(byte arg0, class57 arg1) {
        field3447++;
        int var2 = -123 / ((38 - arg0) / 38);
        class252.field4262 = arg1;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V", line = 74)
    public static final void method1624(int arg0) {
        field3448++;
        if (arg0 < 79) {
            method1623((byte) 121, (class57) null);
        }
        int var1 = 0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class181.method1418(true, class129.field2184, -86, var1, var3, var2)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIII)V", line = 110)
    public static final void method1625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3441++;
        if (arg6 != 2048) {
            field3443 = (boolean[]) null;
        }
        if (arg2 == arg4) {
            class227.method1735(arg2, arg3, arg7, arg1, arg5, arg0, true);
        } else if ((arg0 - arg2) >= class74.field1269 && (arg0 + arg2) <= class355.field5640 && arg3 - arg4 >= class296.field4758 && (arg3 + arg4) <= class273.field4522) {
            class149.method1152(-1, arg0, arg3, arg2, arg1, arg4, arg7, arg5);
        } else {
            class307.method2184(arg3, arg2, arg7, arg1, (byte) 64, arg5, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V", line = 133)
    public static final void method1626(byte arg0) {
        field3445++;
        class187.method1471();
        class27.method175((byte) 118);
        class175.method1377(-1);
        class185.field2977.method2150((byte) 117);
        class356.field5648 = new class296();
        ((class98) class153.field2439).method756(255);
        class359.method2524();
        class30.field428 = 0;
        class30.field429 = new class314[255];
        class337.method2364();
        class249.method1917();
        class70.method600(382);
        class179.method1406(16, false);
        class109.method835(-115);
        class162.method1257(255);
        if (arg0 <= 91) {
            return;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class258 var2 = class56.field924[var1];
            if (var2 != null) {
                var2.field3478 = null;
            }
        }
        if (class42.field607) {
            class249.method1929(104, 104);
            class44.method326((byte) -90, class238.field3932);
            class158.method1221();
        }
        class176.method1387((byte) 119, class76.field1305, class44.field694);
        client.method348(0, class76.field1305);
        class216.field3465 = null;
        class190.field3043 = null;
        class61.field1027 = null;
        class231.field3839 = null;
        class118.field2002 = null;
        if (class259.field4362 == 5) {
            class201.method1547(2, class76.field1305);
        }
        if (class259.field4362 == 10) {
            class319.method2253(false, -311578841);
        }
        if (class259.field4362 == 30) {
            class22.method143(-29, 25);
        }
    }
}
