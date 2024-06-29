import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class220 extends class199 {

    @OriginalMember(owner = "client!te", name = "H", descriptor = "Lsb;")
    public static class98 field3796 = class47.method368("gleiten:", 0);

    @OriginalMember(owner = "client!te", name = "I", descriptor = "Lsb;")
    public static class98 field3797 = class47.method368("cookieprefix", 0);

    @OriginalMember(owner = "client!te", name = "L", descriptor = "Lsb;")
    public static class98 field3800 = class47.method368("Fps:", 0);

    @OriginalMember(owner = "client!te", name = "K", descriptor = "Lsb;")
    public static class98 field3799 = class47.method368("Sprites geladen)3", 0);

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!te", name = "N", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!te", name = "M", descriptor = "Ltg;")
    public static class75 field3801;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "[Lqh;")
    public static class24[] field3792;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "[Z")
    public static boolean[] field3791;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
    public static final void method1518(int arg0) {
        field3789++;
        for (int var1 = 0; var1 < 5; var1++) {
            class137.field2429[var1] = false;
        }
        class207.field3549 = arg0;
        class151.field2780 = -1;
        class171.field3022 = -1;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(B)Z")
    public static final boolean method1519(byte arg0) {
        field3790++;
        if (arg0 != 26) {
            field3797 = null;
        }
        if (class124.field2252 != 0) {
            try {
                if ((Boolean) class192.field3355.method707(32, class119.field2145.field76)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
    public static void method1520(int arg0) {
        field3799 = null;
        field3796 = null;
        field3792 = null;
        field3801 = null;
        field3800 = null;
        field3797 = null;
        field3791 = null;
        if (arg0 != -6174) {
            method1520(-72);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)V")
    public static final void method1521(int arg0, int arg1) {
        field3798++;
        if (class249.field4370 == arg0) {
            return;
        }
        if (arg1 != 0) {
            method1523(-99, (class75) null, (class75) null);
        }
        if (class249.field4370 == 0) {
            class224.method1544(6740);
        }
        if (arg0 == 40) {
            class189.method1302(class205.field3511, class233.field4017, (byte) 9, class233.field4010);
        }
        if (arg0 != 40 && class109.field1951 != null) {
            class109.field1951.method790(false);
            class109.field1951 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class256.field4536 = 1;
            class138.field2443 = 0;
            class76.field1347 = 0;
            class204.field3484 = 0;
            class51.field837 = 1;
            class95.method688(116);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 == 5) {
            class76.method580((byte) -58, class31.field549);
        } else {
            class10.method99((byte) -44);
        }
        boolean var3 = class249.field4370 == 5 || class249.field4370 == 10 || class249.field4370 == 28;
        if (var2 != var3) {
            if (var2) {
                class143.field2527 = class199.field3416;
                if (class167.field2978 == 0) {
                    class79.method593(2, 65);
                } else {
                    class232.method1592(false, 255, 0, class199.field3416, 2, (byte) 28, class143.field2525);
                }
                class236.method1616(false, true);
            } else {
                class79.method593(2, arg1 + 110);
                class236.method1616(true, true);
            }
        }
        class249.field4370 = arg0;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIBIII)V")
    public static final void method1522(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field3794++;
        int var9 = arg4 - arg7;
        int var10 = arg3 - arg1;
        if (arg5 != -78) {
            field3797 = null;
        }
        int var11 = (arg2 - arg0 << 16) / var9;
        int var12 = (arg6 - arg8 << 16) / var10;
        class119.method886(arg4, var11, var12, arg3, arg7, -6, arg1, arg8, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILtg;Ltg;)V")
    public static final void method1523(int arg0, class75 arg1, class75 arg2) {
        if (arg0 != 6627) {
            method1522(-5, -115, 71, -114, -2, (byte) 6, -29, -34, -1);
        }
        class185.field3201 = arg1;
        class125.field2263 = arg2;
        field3793++;
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V")
    public static final void method1524(int arg0) {
        field3788++;
        int var1 = class90.method661(26483);
        if (arg0 != 3409) {
            field3791 = null;
        }
        if (var1 == 0) {
            class205.field3493 = null;
            class154.method1123(0, (byte) -116);
        } else if (var1 == 1) {
            class107.method821(104, (byte) 0);
            class154.method1123(512, (byte) -127);
            class199.method1358((byte) 76);
        } else {
            class107.method821(arg0 - 3305, (byte) (class202.field3444 - 4 & 0xFF));
            class154.method1123(2, (byte) -79);
        }
    }
}
