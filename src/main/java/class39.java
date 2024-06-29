import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class39 extends class205 {

    @OriginalMember(owner = "client!df", name = "bb", descriptor = "I")
    public static int field867 = -1;

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "I")
    public static int field865 = 0;

    @OriginalMember(owner = "client!df", name = "V", descriptor = "Lvd;")
    public static class222 field861 = class212.method1357("settings", 10731);

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "Lvd;")
    private static class222 field864 = class212.method1357("Existing User", 10731);

    @OriginalMember(owner = "client!df", name = "X", descriptor = "Lvd;")
    private static class222 field863 = class212.method1357("Please try again)3", 10731);

    @OriginalMember(owner = "client!df", name = "W", descriptor = "Z")
    public static boolean field862 = false;

    @OriginalMember(owner = "client!df", name = "cb", descriptor = "I")
    public static int field868 = 0;

    @OriginalMember(owner = "client!df", name = "eb", descriptor = "[J")
    public static long[] field870 = new long[1000];

    @OriginalMember(owner = "client!df", name = "fb", descriptor = "I")
    public static int field871 = 0;

    @OriginalMember(owner = "client!df", name = "lb", descriptor = "Lvd;")
    public static class222 field877 = class212.method1357("M", 10731);

    @OriginalMember(owner = "client!df", name = "jb", descriptor = "Lvd;")
    public static class222 field875 = field864;

    @OriginalMember(owner = "client!df", name = "kb", descriptor = "Lvd;")
    public static class222 field876 = field863;

    @OriginalMember(owner = "client!df", name = "db", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!df", name = "gb", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!df", name = "ib", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!df", name = "hb", descriptor = "Lve;")
    public static class223 field873;

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "[I")
    public static int[] field866;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(B)V")
    public static final void method312(byte arg0) {
        if (arg0 != 55) {
            method314(true, (class222) null);
        }
        class72.field1406 = true;
        ++field874;
        class122.field2331 = true;
    }

    @OriginalMember(owner = "client!df", name = "h", descriptor = "(I)V")
    public static void method313(int arg0) {
        field876 = null;
        field863 = null;
        field864 = null;
        field873 = null;
        field870 = null;
        field861 = null;
        if (arg0 == 0) {
            field877 = null;
            field875 = null;
            field866 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field872;
        int[] var3 = super.field3810.method557(6978, arg1);
        if (arg0 != 0) {
            this.method4(-50, 100);
        }
        if (super.field3810.field1635) {
            int[][] var4 = this.method1323(0, arg1, -5920);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            for (int var8 = 0; var8 < class118.field2245; ++var8) {
                var3[var8] = (var5[var8] + var7[var8] - -var6[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
    public class39() {
        super(1, true);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZLvd;)V")
    public static final void method314(boolean arg0, class222 arg1) {
        ++field869;
        if (class5.field87 >= 2) {
            if (arg1.method1452(class220.field4078, (byte) -123)) {
                for (int var2 = 0; var2 < 10; ++var2) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class160.method1007(false, class234.method1531(new class222[] { class24.field558, class56.method414(-105, var4), class1.field1 }, -10949), (class222) null, 0);
            }
            if (arg1.method1452(class23.field551, (byte) -125)) {
                class167.method1079((byte) -117);
            }
            if (arg1.method1452(class78.field1514, (byte) -126)) {
                class209.field3886 = true;
            }
            if (arg1.method1452(class93.field1743, (byte) -128)) {
                class209.field3886 = false;
            }
            arg1.method1452(class175.field3283, (byte) -126);
            arg1.method1452(class77.field1494, (byte) -127);
            if (arg1.method1452(class124.field2376, (byte) -126)) {
                for (int var5 = 0; ~var5 > -5; ++var5) {
                    for (int var6 = 1; ~var6 > -104; ++var6) {
                        for (int var7 = 1; var7 < 103; ++var7) {
                            class108.field1993[var5].field132[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg1.method1416(-6354, class123.field2364) && ~class95.field1781 != -1) {
                class108.method657(1000, arg1.method1443(21120, 6).method1446(97));
            }
            if (arg1.method1452(class192.field3541, (byte) -126) && class95.field1781 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method1416(-6354, class78.field1516)) {
                class197.field3600 = arg1.method1443(21120, 12).method1407((byte) -122).method1446(97);
                class160.method1007(arg0, class234.method1531(new class222[] { class55.field1037, class56.method414(-99, class197.field3600) }, -10949), (class222) null, 0);
            }
            if (arg1.method1452(class235.field4394, (byte) -127)) {
                class168.field3211 = true;
            }
        }
        ++class75.field1473;
        class42.field895.method1347((byte) -87, 255);
        if (arg0) {
            method313(34);
        }
        class42.field895.method676(arg1.method1444(-44) - 1, (byte) -3);
        class42.field895.method670(arg1.method1443(21120, 2), (byte) -113);
    }
}
