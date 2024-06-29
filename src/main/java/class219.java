import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class219 {

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field3813 = 0;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "[Llf;")
    public static class124[] field3817 = new class124[5000];

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Loc;")
    public static class151 field3816 = class137.method873(2, "mapscene");

    @OriginalMember(owner = "client!va", name = "g", descriptor = "Loc;")
    private static class151 field3815 = class137.method873(2, "Loaded interfaces");

    @OriginalMember(owner = "client!va", name = "f", descriptor = "Loc;")
    public static class151 field3814 = field3815;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static final void method1365(int arg0) {
        field3812++;
        int var1 = 0;
        if (arg0 >= -7) {
            return;
        }
        while (class23.field505 > var1) {
            int var2 = class81.field1553[var1];
            class203 var3 = class122.field2190[var2];
            if (var3 != null) {
                class169.method1092(var3, 11416, var3.field3608.field1317);
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIB)V")
    public static final void method1366(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class233.field4281 = arg1;
        class25.field524 = arg2;
        if (arg4 <= 100) {
            method1369(70);
        }
        field3810++;
        class79.field1526 = arg3;
        class154.field2793 = arg0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIBLga;)V")
    public static final void method1367(int arg0, int arg1, int arg2, byte arg3, class67 arg4) {
        field3811++;
        if (class117.field2108 >= 400) {
            return;
        }
        if (arg4.field1291 != null) {
            arg4 = arg4.method446(arg3 - 95);
        }
        if (arg3 != -4 || (arg4 == null || !arg4.field1318)) {
            return;
        }
        class151 var5 = arg4.field1314;
        if (arg4.field1321 != 0) {
            var5 = class126.method761(new class151[] { var5, class65.method434(arg4.field1321, class228.field3975.field435, 1), class228.field3982, class190.field3364, class137.method874(arg4.field1321, false), class175.field3163 }, 10260);
        }
        if (class166.field3017 == 1) {
            class142.method908(arg1, class126.method761(new class151[] { class29.field613, class16.field375, var5 }, 10260), (short) 12, (long) arg0, class14.field318, -122, arg2);
            class93.field1710++;
        } else if (!class159.field2859) {
            class134.field2447++;
            class151[] var6 = arg4.field1306;
            if (class52.field1046) {
                var6 = class38.method282(var6, (byte) 34);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class71.field1385 != 0 || !var6[var7].method995((byte) -22, class208.field3666))) {
                        class194.field3468++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 1;
                        }
                        if (var7 == 1) {
                            var8 = 2;
                        }
                        if (var7 == 2) {
                            var8 = 26;
                        }
                        if (var7 == 3) {
                            var8 = 45;
                        }
                        if (var7 == 4) {
                            var8 = 19;
                        }
                        class142.method908(arg1, class126.method761(new class151[] { class215.field3763, var5 }, arg3 + 10264), var8, (long) arg0, var6[var7], -128, arg2);
                    }
                }
            }
            if (class71.field1385 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method995((byte) -22, class208.field3666)) {
                        short var10 = 0;
                        class192.field3420++;
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 1;
                        }
                        if (class228.field3975.field435 < arg4.field1321) {
                            var10 = 2000;
                        }
                        if (var9 == 1) {
                            var11 = 2;
                        }
                        if (var9 == 2) {
                            var11 = 26;
                        }
                        if (var9 == 3) {
                            var11 = 45;
                        }
                        if (var9 == 4) {
                            var11 = 19;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class142.method908(arg1, class126.method761(new class151[] { class215.field3763, var5 }, arg3 ^ 0xFFFFD7E8), var11, (long) arg0, var6[var9], -98, arg2);
                    }
                }
            }
            class142.method908(arg1, class126.method761(new class151[] { class215.field3763, var5 }, 10260), (short) 1005, (long) arg0, class232.field4262, arg3 ^ 0x77, arg2);
            return;
        } else if ((class54.field1103 & 0x2) == 2) {
            class142.method908(arg1, class126.method761(new class151[] { class20.field447, class16.field375, var5 }, 10260), (short) 15, (long) arg0, class95.field1770, arg3 ^ 0x14, arg2);
            class107.field1893++;
            return;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILwd;)Z")
    public static final boolean method1368(int arg0, class232 arg1) {
        field3809++;
        if (arg1.field4222 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field4222.length; var2++) {
            int var3 = class212.method1327(arg0 + 999999997, var2, arg1);
            int var4 = arg1.field4247[var2];
            if (arg1.field4222[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field4222[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field4222[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg0 != 2) {
            method1369(-36);
        }
        return true;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    public static void method1369(int arg0) {
        field3817 = null;
        field3815 = null;
        if (arg0 != -2) {
            field3815 = null;
        }
        field3816 = null;
        field3814 = null;
    }
}
