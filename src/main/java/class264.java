import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class264 {

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
    public int field3657 = 8;

    @OriginalMember(owner = "client!uu", name = "m", descriptor = "I")
    public int field3669 = 16777215;

    @OriginalMember(owner = "client!uu", name = "k", descriptor = "Ljw;")
    public static class520 field3667 = new class520(8);

    @OriginalMember(owner = "client!uu", name = "n", descriptor = "Lob;")
    public static class691 field3670 = new class691();

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "I")
    public int field3660;

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
    public int field3664;

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "I")
    public int field3665;

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "I")
    public int field3666;

    @OriginalMember(owner = "client!uu", name = "l", descriptor = "I")
    public int field3668;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "Z")
    public boolean field3661;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Z)V")
    public static void method1610(boolean arg0) {
        field3667 = null;
        if (arg0) {
            method1612(-5);
        }
        field3670 = null;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1611(int arg0, boolean arg1) {
        field3658++;
        if (arg0 == 48 || arg0 == 15 || arg0 == 22 || arg0 == 46 || arg0 == 59) {
            return true;
        } else if (arg1) {
            return false;
        } else {
            return arg0 == 57 || arg0 == 1003;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
    public static final void method1612(int arg0) {
        class135.field2199 = arg0;
        for (int var1 = 0; var1 < class657.field8966; var1++) {
            for (int var2 = 0; var2 < class227.field3196; var2++) {
                if (class703.field9899[arg0][var1][var2] == null) {
                    class703.field9899[arg0][var1][var2] = new class24(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZLeh;)V")
    public final void method1613(boolean arg0, class335 arg1) {
        while (true) {
            int var3 = arg1.method2034(255);
            if (var3 == 0) {
                field3659++;
                if (!arg0) {
                    field3670 = null;
                    return;
                }
                return;
            }
            this.method1614(!arg0, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZLeh;I)V")
    private final void method1614(boolean arg0, class335 arg1, int arg2) {
        if (arg0) {
            return;
        }
        field3663++;
        if (arg2 == 1) {
            this.field3657 = arg1.method2001((byte) -83);
        } else if (arg2 == 2) {
            this.field3661 = true;
        } else if (arg2 == 3) {
            this.field3660 = arg1.method2022(-29089);
            this.field3665 = arg1.method2022(-29089);
            this.field3664 = arg1.method2022(-29089);
        } else if (arg2 == 4) {
            this.field3666 = arg1.method2034(255);
        } else if (arg2 == 5) {
            this.field3668 = arg1.method2001((byte) -83);
        } else if (arg2 == 6) {
            this.field3669 = arg1.method2042((byte) 53);
            return;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BLjava/lang/String;I)V")
    public static final void method1615(byte arg0, String arg1, int arg2) {
        class180.method1203((byte) -53);
        field3662++;
        class32.method262(-98);
        class193.method1250(3);
        class442.method2499(arg2, -125, arg1);
        class605.method3327(0);
        class395.method2263(-22082, class10.field197);
        class26.method227(false, class10.field197);
        class566.method3100(class10.field197, (byte) 26, class658.field9155);
        class312.method1862(5121);
        class58.method480(class391.field5159, (byte) -7);
        class449.method2540((byte) -73);
        class511.method2842(true);
        if (arg0 > -38) {
            return;
        }
        if (class32.field525 == 3) {
            class472.method2658(19093, 4);
        } else if (class32.field525 == 7) {
            class472.method2658(19093, 8);
        } else if (class32.field525 == 10) {
            class472.method2658(19093, 11);
        } else if (class32.field525 == 1 || class32.field525 == 2) {
            class690.method3836((byte) -64);
        }
    }
}
