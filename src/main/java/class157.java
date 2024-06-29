import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class157 {

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field2130 = 0;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "[B")
    public static byte[] field2129 = new byte[520];

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "[I")
    public static int[] field2131;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method970(int arg0, int arg1) {
        field2126++;
        if (arg0 == 100 && class122.field1693 > 0) {
            byte[] var2 = class63.field845[--class122.field1693];
            class63.field845[class122.field1693] = null;
            return var2;
        } else if (arg0 == 5000 && class34.field473 > 0) {
            byte[] var3 = class75.field1073[--class34.field473];
            class75.field1073[class34.field473] = null;
            return var3;
        } else if (arg1 != -8691) {
            return null;
        } else if (arg0 == 30000 && class313.field4576 > 0) {
            byte[] var4 = class349.field5071[--class313.field4576];
            class349.field5071[class313.field4576] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
    public static final void method971(int arg0) {
        class68.field875 = arg0;
        for (int var1 = 0; var1 < class104.field1436; var1++) {
            for (int var2 = 0; var2 < class214.field2858; var2++) {
                if (class213.field2852[arg0][var1][var2] == null) {
                    class213.field2852[arg0][var1][var2] = new class254(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIII)V")
    public static final void method972(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2132++;
        class263 var5 = class47.method337(arg4, 0, arg2);
        var5.method1807((byte) -122);
        var5.field3813 = arg0;
        var5.field3809 = arg1;
        var5.field3820 = arg3;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILwm;I)V")
    public static final void method973(int arg0, class298 arg1, int arg2) {
        field2128++;
        int var3 = -1;
        int var4 = 0;
        if (class28.field418 < arg1.field4345) {
            class75.method553(arg1, 0);
        } else if (class28.field418 > arg1.field4322) {
            class375.method2431(false, 27994, arg1);
            var3 = class294.field4213;
            var4 = class21.field278;
        } else {
            class1.method1(arg1, (byte) 110);
        }
        if (arg1.field740 < 128 || arg1.field734 < 128 || arg1.field740 >= class192.field2574 * 128 - 128 || arg1.field734 >= (class364.field5262 - 1) * 128) {
            arg1.field4326 = -1;
            arg1.field4290 = -1;
            arg1.field4345 = 0;
            arg1.field4322 = 0;
            arg1.field740 = arg1.field4360[0] * 128 + (arg1.method168(-113) * 64);
            arg1.field734 = arg1.field4362[0] * 128 + (arg1.method168(-127) * 64);
            arg1.method2046(false);
        }
        if (class227.field2988 == arg1 && (arg1.field740 < 1536 || arg1.field734 < 1536 || ((class192.field2574 - 12) * 128) <= arg1.field740 || arg1.field734 >= (class364.field5262 * 128 - 1536))) {
            arg1.field4326 = -1;
            arg1.field4290 = -1;
            arg1.field4345 = 0;
            arg1.field4322 = 0;
            arg1.field740 = arg1.field4360[0] * 128 + arg1.method168(-119) * 64;
            arg1.field734 = arg1.field4362[0] * 128 + arg1.method168(-121) * 64;
            arg1.method2046(false);
        }
        int var5 = class2.method17(arg1, (byte) -86);
        class368.method2391(var5, var3, false, arg1, var4);
        class143.method913(arg1, false);
        if (arg2 < 42) {
            field2129 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)Z")
    public static final boolean method974(int arg0) {
        field2127++;
        if (arg0 != 14648) {
            return false;
        }
        class236 var1 = class445.field6523;
        synchronized (class445.field6523) {
            if (class213.field2846 == class134.field1870) {
                return false;
            } else {
                class90.field1275 = class103.field1418[class213.field2846];
                class331.field4810 = class223.field2940[class213.field2846];
                class213.field2846 = class213.field2846 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V")
    public static void method975(int arg0) {
        field2129 = null;
        if (arg0 != 64) {
            field2129 = null;
        }
        field2131 = null;
    }
}
