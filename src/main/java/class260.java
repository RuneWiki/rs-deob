import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class260 extends class181 {

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "Lli;")
    private class185 field4612 = class224.field4103;

    @OriginalMember(owner = "client!ha", name = "Z", descriptor = "I")
    public static int field4623 = 0;

    @OriginalMember(owner = "client!ha", name = "bb", descriptor = "Lli;")
    public static class185 field4625 = class245.method1649("Veuillez commencer par supprimer ", 122);

    @OriginalMember(owner = "client!ha", name = "fb", descriptor = "[[S")
    public static short[][] field4629 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
    public int field4610;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!ha", name = "S", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!ha", name = "V", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!ha", name = "ab", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!ha", name = "cb", descriptor = "I")
    public int field4626;

    @OriginalMember(owner = "client!ha", name = "db", descriptor = "I")
    private int field4627;

    @OriginalMember(owner = "client!ha", name = "eb", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!ha", name = "gb", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "Ldl;")
    public class31 field4614;

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "Ldl;")
    private class31 field4618;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "[I")
    public static int[] field4615;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lbb;III)V")
    public static final void method1759(class75 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class264.field4685) {
            class198 var4 = class153.field2896[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3631 != null && var4.field3631.field4467.method65()) {
                arg0.method70(var4.field3631.field4467, 128, 0, 0, true);
            }
        }
        if (arg3 < class264.field4685) {
            class198 var5 = class153.field2896[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3631 != null && var5.field3631.field4467.method65()) {
                arg0.method70(var5.field3631.field4467, 0, 0, 128, true);
            }
        }
        if (arg2 < class264.field4685 && arg3 < class122.field2214) {
            class198 var6 = class153.field2896[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3631 != null && var6.field3631.field4467.method65()) {
                arg0.method70(var6.field3631.field4467, 128, 0, 128, true);
            }
        }
        if (arg2 < class264.field4685 && arg3 > 0) {
            class198 var7 = class153.field2896[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3631 != null && var7.field3631.field4467.method65()) {
                arg0.method70(var7.field3631.field4467, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
    public static void method1760(int arg0) {
        field4629 = null;
        if (arg0 != 17840) {
            method1759((class75) null, -40, 22, 123);
        }
        field4625 = null;
        field4615 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjd;I)V")
    private final void method1761(int arg0, class118 arg1, int arg2) {
        field4616++;
        if (arg0 != -6389) {
            field4625 = null;
        }
        if (arg2 == 1) {
            this.field4610 = arg1.method867(false);
        } else if (arg2 == 2) {
            this.field4626 = arg1.method867(false);
        } else if (arg2 == 3) {
            this.field4612 = arg1.method865(9199);
        } else if (arg2 == 4) {
            this.field4627 = arg1.method875((byte) 16);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method827(arg0 ^ 0xFFFFE7F4);
            this.field4614 = new class31(class82.method540(false, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method875((byte) 68);
                class73 var7;
                if (arg2 == 5) {
                    var7 = new class229(arg1.method865(9199));
                } else {
                    var7 = new class13(arg1.method875((byte) 45));
                }
                this.field4614.method190(var7, (byte) -93, (long) var6);
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjd;)V")
    public final void method1762(int arg0, class118 arg1) {
        if (arg0 != 0) {
            method1767(20, -37);
        }
        field4622++;
        while (true) {
            int var3 = arg1.method867(false);
            if (var3 == 0) {
                return;
            }
            this.method1761(-6389, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(Z)V")
    public static final void method1763(boolean arg0) {
        field4608++;
        if (!class254.field4504) {
            return;
        }
        class82 var1 = class157.method1115(6684, class140.field2617, class148.field2805);
        if (var1 != null && var1.field1603 != null) {
            class121 var2 = new class121();
            var2.field2196 = var1;
            var2.field2198 = var1.field1603;
            class274.method1877(var2, (byte) -77);
        }
        class158.field2986 = -1;
        class254.field4504 = false;
        class229.method1581(var1, !arg0);
        if (!arg0) {
            field4623 = -42;
        }
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    private final void method1764(int arg0) {
        this.field4618 = new class31(this.field4614.method193((byte) 38));
        for (class13 var2 = (class13) this.field4614.method192(101); var2 != null; var2 = (class13) this.field4614.method189(0)) {
            class13 var3 = new class13((int) var2.field1278);
            this.field4618.method190(var3, (byte) -103, (long) var2.field226);
        }
        field4617++;
        if (arg0 != 107) {
            this.method1771(false);
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IB)Lli;")
    public final class185 method1765(int arg0, byte arg1) {
        field4621++;
        if (this.field4614 == null) {
            return this.field4612;
        } else if (arg1 == -60) {
            class229 var3 = (class229) this.field4614.method195(89, (long) arg0);
            return var3 == null ? this.field4612 : var3.field4169;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I")
    public static int method1766(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V")
    public static final void method1767(int arg0, int arg1) {
        if (arg1 == 37) {
            class169.field3129 = 3.0F;
        } else if (arg1 == 50) {
            class169.field3129 = 4.0F;
        } else if (arg1 == 75) {
            class169.field3129 = 6.0F;
        } else if (arg1 == 100) {
            class169.field3129 = 8.0F;
        } else if (arg1 == 200) {
            class169.field3129 = 16.0F;
        }
        class149.field2824 = -1;
        class149.field2824 = -1;
        field4613++;
        if (arg0 <= 125) {
            field4615 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(IB)V")
    public static final void method1768(int arg0, byte arg1) {
        field4628++;
        class249.field4413.method85((byte) 75, arg0);
        class5.field126.method85((byte) 75, arg0);
        if (arg1 == -27) {
            class38.field589.method85((byte) 75, arg0);
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)Z")
    public final boolean method1769(int arg0, int arg1) {
        if (arg1 != 18267) {
            return false;
        }
        field4620++;
        if (this.field4614 == null) {
            return false;
        }
        if (this.field4618 == null) {
            this.method1764(107);
        }
        class13 var3 = (class13) this.field4618.method195(114, (long) arg0);
        return var3 != null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZ)I")
    public final int method1770(int arg0, boolean arg1) {
        field4619++;
        if (this.field4614 == null) {
            return this.field4627;
        }
        class13 var3 = (class13) this.field4614.method195(42, (long) arg0);
        if (var3 == null) {
            return this.field4627;
        } else {
            if (arg1) {
                method1767(14, -31);
            }
            return var3.field226;
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(Z)V")
    private final void method1771(boolean arg0) {
        field4607++;
        this.field4618 = new class31(this.field4614.method193((byte) 38));
        for (class229 var2 = (class229) this.field4614.method192(101); var2 != null; var2 = (class229) this.field4614.method189(0)) {
            class40 var3 = new class40(var2.field4169, (int) var2.field1278);
            this.field4618.method190(var3, (byte) -110, var2.field4169.method1330(false));
        }
        if (!arg0) {
            this.field4610 = 81;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILli;)Z")
    public final boolean method1772(int arg0, class185 arg1) {
        field4611++;
        if (this.field4614 == null) {
            return false;
        }
        if (arg0 <= 42) {
            this.field4626 = -24;
        }
        if (this.field4618 == null) {
            this.method1771(true);
        }
        for (class40 var3 = (class40) this.field4618.method195(70, arg1.method1330(false)); var3 != null; var3 = (class40) this.field4618.method197(-84)) {
            if (var3.field635.method1329(arg1, (byte) 22)) {
                return true;
            }
        }
        return false;
    }
}
