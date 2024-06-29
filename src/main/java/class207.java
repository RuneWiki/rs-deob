import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class207 extends class181 {

    @OriginalMember(owner = "client!le", name = "L", descriptor = "Lli;")
    public static class185 field3793 = class245.method1649("(U0a )2 in: ", -103);

    @OriginalMember(owner = "client!le", name = "O", descriptor = "Lli;")
    public static class185 field3796 = class245.method1649(" <col=ffff00>", 126);

    @OriginalMember(owner = "client!le", name = "T", descriptor = "Lli;")
    public static class185 field3801 = class245.method1649("violet:", 125);

    @OriginalMember(owner = "client!le", name = "cb", descriptor = "I")
    public static int field3810 = 0;

    @OriginalMember(owner = "client!le", name = "ab", descriptor = "I")
    public static int field3808 = 0;

    @OriginalMember(owner = "client!le", name = "Z", descriptor = "I")
    public static int field3807 = 50;

    @OriginalMember(owner = "client!le", name = "S", descriptor = "I")
    public static int field3800 = -1;

    @OriginalMember(owner = "client!le", name = "bb", descriptor = "I")
    public static int field3809 = 0;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "I")
    public int field3790;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "I")
    public int field3791;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "I")
    public int field3792;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!le", name = "P", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!le", name = "R", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!le", name = "U", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!le", name = "V", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!le", name = "X", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!le", name = "Y", descriptor = "I")
    public int field3806;

    @OriginalMember(owner = "client!le", name = "eb", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!le", name = "Q", descriptor = "Lli;")
    public class185 field3798;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "[I")
    public int[] field3795;

    @OriginalMember(owner = "client!le", name = "fb", descriptor = "[I")
    public int[] field3813;

    @OriginalMember(owner = "client!le", name = "W", descriptor = "[Lli;")
    public class185[] field3804;

    @OriginalMember(owner = "client!le", name = "db", descriptor = "[Ldl;")
    public class31[] field3811;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(Z)V")
    public static void method1464(boolean arg0) {
        if (!arg0) {
            method1465(109L, (byte) -32);
        }
        field3801 = null;
        field3796 = null;
        field3793 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(JB)V")
    public static final void method1465(long arg0, byte arg1) {
        field3802++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class127.field2276; var3++) {
            if (class165.field3088[var3] == arg0) {
                class6.field134++;
                class127.field2276--;
                for (int var4 = var3; var4 < class127.field2276; var4++) {
                    class165.field3088[var4] = class165.field3088[var4 + 1];
                    class64.field1118[var4] = class64.field1118[var4 + 1];
                }
                class130.field2323 = class38.field593;
                class182.field3349.method577(120, 0);
                class182.field3349.method870(arg0, (byte) 122);
                break;
            }
        }
        if (arg1 > -32) {
            method1466(-86, (byte) 10);
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(IB)V")
    public static final void method1466(int arg0, byte arg1) {
        field3799++;
        if (class65.field1132 == null) {
            class65.field1132 = new byte[4][104][104];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class65.field1132[var2][var3][var4] = arg1;
                }
            }
        }
        if (arg0 != -1) {
            field3808 = 68;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lhi;II)Z")
    public static final boolean method1467(class250 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1697(arg1, (byte) -56);
        field3803++;
        if (var3 == null) {
            return false;
        } else {
            class183.method1290(var3, arg2 + arg2);
            return true;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIILli;JI)V")
    public static final void method1468(int arg0, int arg1, int arg2, int arg3, class185 arg4, long arg5, int arg6) {
        field3797++;
        class118 var8 = new class118(128);
        var8.method877((byte) 105, 10);
        var8.method856(31133, (int) (Math.random() * 99999.0D));
        var8.method856(31133, 527);
        var8.method870(arg5, (byte) 122);
        var8.method842((int) (Math.random() * 9.9999999E7D), -6596);
        var8.method855((byte) 101, arg4);
        var8.method842((int) (Math.random() * 9.9999999E7D), -6596);
        var8.method856(31133, class119.field2175);
        var8.method877((byte) 100, arg1);
        var8.method877((byte) 115, arg3);
        var8.method842((int) (Math.random() * 9.9999999E7D), -6596);
        var8.method856(31133, arg0);
        var8.method856(31133, arg2);
        var8.method842((int) (Math.random() * 9.9999999E7D), -6596);
        var8.method861(class173.field3169, class37.field568, (byte) -20);
        class182.field3349.field2155 = 0;
        class182.field3349.method877((byte) 103, 226);
        class182.field3349.method877((byte) 115, var8.field2155);
        if (arg6 > -110) {
            method1465(-91L, (byte) 71);
        }
        class182.field3349.method848(var8.field2115, 0, (byte) 121, var8.field2155);
        class136.field2552 = 0;
        class111.field1990 = 1;
        class2.field42 = -3;
        class99.field1828 = 0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILgb;)V")
    public static final void method1469(int arg0, class142 arg1) {
        arg1.field2690 = false;
        if (arg1.field2654 != -1) {
            class2 var2 = class253.method1712(arg1.field2654, -127);
            if (var2 == null || var2.field37 == null) {
                arg1.field2654 = -1;
            } else {
                arg1.field2701++;
                if (var2.field37.length > arg1.field2652 && var2.field51[arg1.field2652] < arg1.field2701) {
                    arg1.field2701 = 1;
                    arg1.field2652++;
                    class31.method188(-1, var2, arg1.field2687, class241.field4310 == arg1, arg1.field2652, arg1.field2694);
                }
                if (var2.field37.length <= arg1.field2652) {
                    arg1.field2701 = 0;
                    arg1.field2652 = 0;
                    class31.method188(-1, var2, arg1.field2687, class241.field4310 == arg1, arg1.field2652, arg1.field2694);
                }
            }
        }
        if (arg0 >= -9) {
            field3809 = 57;
        }
        if (arg1.field2709 != -1 && arg1.field2703 <= class211.field3851) {
            int var3 = class255.method1728(arg1.field2709, (byte) 95).field4193;
            if (var3 == -1) {
                arg1.field2709 = -1;
            } else {
                class2 var4 = class253.method1712(var3, -121);
                if (var4 == null || var4.field37 == null) {
                    arg1.field2709 = -1;
                } else {
                    if (arg1.field2656 < 0) {
                        arg1.field2656 = 0;
                        class31.method188(-1, var4, arg1.field2687, class241.field4310 == arg1, 0, arg1.field2694);
                    }
                    arg1.field2664++;
                    if (arg1.field2656 < var4.field37.length && var4.field51[arg1.field2656] < arg1.field2664) {
                        arg1.field2664 = 1;
                        arg1.field2656++;
                        class31.method188(-1, var4, arg1.field2687, class241.field4310 == arg1, arg1.field2656, arg1.field2694);
                    }
                    if (arg1.field2656 >= var4.field37.length) {
                        arg1.field2709 = -1;
                    }
                }
            }
        }
        field3812++;
        if (arg1.field2655 != -1 && arg1.field2691 <= 1) {
            class2 var5 = class253.method1712(arg1.field2655, -126);
            if (var5.field43 == 1 && arg1.field2661 > 0 && class211.field3851 >= arg1.field2702 && class211.field3851 > arg1.field2672) {
                arg1.field2691 = 1;
                return;
            }
        }
        if (arg1.field2655 != -1 && arg1.field2691 == 0) {
            class2 var6 = class253.method1712(arg1.field2655, -126);
            if (var6 == null || var6.field37 == null) {
                arg1.field2655 = -1;
            } else {
                arg1.field2658++;
                if (var6.field37.length > arg1.field2663 && arg1.field2658 > var6.field51[arg1.field2663]) {
                    arg1.field2658 = 1;
                    arg1.field2663++;
                    class31.method188(-1, var6, arg1.field2687, class241.field4310 == arg1, arg1.field2663, arg1.field2694);
                }
                if (var6.field37.length <= arg1.field2663) {
                    arg1.field2663 -= var6.field47;
                    arg1.field2673++;
                    if (arg1.field2673 >= var6.field54) {
                        arg1.field2655 = -1;
                    } else if (arg1.field2663 >= 0 && var6.field37.length > arg1.field2663) {
                        class31.method188(-1, var6, arg1.field2687, class241.field4310 == arg1, arg1.field2663, arg1.field2694);
                    } else {
                        arg1.field2655 = -1;
                    }
                }
                arg1.field2690 = var6.field50;
            }
        }
        if (arg1.field2691 > 0) {
            arg1.field2691--;
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(IB)V")
    public static final void method1470(int arg0, byte arg1) {
        if (arg1 <= 47) {
            field3808 = 33;
        }
        field3805++;
        class174 var2 = class249.method1671(5, arg0, (byte) -103);
        var2.method1234((byte) -25);
    }
}
