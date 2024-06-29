import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class349 extends class356 implements class57 {

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "Ltj;")
    public class170 field4987;

    @OriginalMember(owner = "client!wl", name = "O", descriptor = "Z")
    private boolean field5002;

    @OriginalMember(owner = "client!wl", name = "Q", descriptor = "I")
    public static int field5004 = 2;

    @OriginalMember(owner = "client!wl", name = "R", descriptor = "Lig;")
    public static class206 field5005;

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!wl", name = "D", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!wl", name = "E", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!wl", name = "F", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!wl", name = "G", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!wl", name = "H", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!wl", name = "I", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!wl", name = "J", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!wl", name = "K", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!wl", name = "M", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!wl", name = "N", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!wl", name = "P", descriptor = "Lew;")
    private class425 field5003;

    @OriginalMember(owner = "client!wl", name = "L", descriptor = "[Lxa;")
    public static class433[] field4999;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(Loa;I)Lew;")
    public final class425 method100(class605 arg0, int arg1) {
        if (arg1 != 28286) {
            field4999 = null;
        }
        ++field4985;
        return this.field5003;
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "(I)I")
    public final int method92(int arg0) {
        if (arg0 != 9812) {
            this.method100((class605) null, -22);
        }
        ++field4990;
        return this.field4987.field2087;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)I")
    public final int method89(int arg0) {
        ++field4994;
        int var2 = 120 / ((11 - arg0) / 51);
        return this.field4987.field2079;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Loa;Lqd;IIIIIZIIIIII)V")
    public class349(class605 arg0, class385 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class276.method1795(4, arg11, arg12));
        this.field4987 = new class170(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field5002 = arg1.field5806 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)Z")
    public final boolean method93(int arg0) {
        ++field5001;
        if (arg0 != -23445) {
            method2226(-118, 84);
        }
        return this.field4987.method979(1597);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILoa;)V")
    public final void method98(int arg0, class605 arg1) {
        if (arg0 != 16343) {
            this.method87(-81);
        }
        this.field4987.method972(arg1, arg0 ^ -26134);
        ++field4989;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Loa;B)Laca;")
    public final class630 method88(class605 arg0, byte arg1) {
        ++field4992;
        class327 var3 = this.field4987.method981(super.field5065, true, super.field5071, 87, 2048, arg0, false);
        if (var3 == null) {
            return null;
        } else {
            class364 var4 = arg0.method342();
            var4.method2014(super.field5069 + super.field5065, super.field5066, super.field5071 + super.field5064);
            if (arg1 > -127) {
                this.field5003 = null;
            }
            class630 var5 = null;
            if (this.field5002) {
                var5 = class471.method2882(-126, 1);
            }
            int var6 = super.field5065 >> 9;
            int var7 = super.field5071 >> 9;
            this.field4987.method976(var4, (byte) 111, var3, var6, true, var7, var6, arg0, var7);
            if (this.field4987.field2075 != null) {
                class33 var8 = this.field4987.field2075.method1334();
                arg0.method307(var3, var8, var4, var5 != null ? var5.field9084[0] : null, 0);
            } else {
                var3.method1380(var4, var5 == null ? null : var5.field9084[0], 0);
            }
            if (this.field5003 == null) {
                this.field5003 = class645.method3676(super.field5071, super.field5066, (byte) -29, super.field5065, var3);
            } else {
                class27.method158(super.field5071, this.field5003, (byte) 119, var3, super.field5065, super.field5066);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "(I)I")
    public final int method548(int arg0) {
        ++field4996;
        if (arg0 != 262144) {
            this.field5002 = true;
        }
        return this.field4987.method978(26895);
    }

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "(I)V")
    public static void method2224(int arg0) {
        field4999 = null;
        if (arg0 == 0) {
            field5005 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method91(int arg0, int arg1, class605 arg2, int arg3) {
        ++field4986;
        class327 var5 = this.field4987.method981(super.field5065, false, super.field5071, 92, 131072, arg2, false);
        if (var5 == null) {
            return false;
        } else {
            class364 var6 = arg2.method342();
            var6.method2014(super.field5069 + super.field5065, super.field5066, super.field5071 + super.field5064);
            return arg0 != -10503 ? false : var5.method1381(arg1, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lkea;ILkea;Lkea;Lkea;)V")
    public static final void method2225(class203 arg0, int arg1, class203 arg2, class203 arg3, class203 arg4) {
        class515.field7512 = arg3;
        ++field5000;
        class585.field8411 = arg4;
        class203.field2728 = arg2;
        class268.field3766 = arg0;
        class297.field4403 = new class593[class515.field7512.method1282(-86)][];
        if (arg1 != 17819) {
            method2224(-77);
        }
        class119.field1484 = new boolean[class515.field7512.method1282(-88)];
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V")
    public final void method87(int arg0) {
        if (arg0 != 7511) {
            this.method91(43, -78, (class605) null, 90);
        }
        ++field4991;
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)I")
    public final int method95(int arg0) {
        ++field4993;
        int var2 = -98 % ((arg0 - 14) / 33);
        return this.field4987.field2098;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)Lka;")
    public static final class407 method2226(int arg0, int arg1) {
        ++field4997;
        class407 var2 = (class407) class212.field2926.method2415((long) arg1, false);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class656.field9485.method1286(0, arg1, (byte) -49);
            if (var3 != null && ~var3.length < -2) {
                class407 var4 = class576.method3348(var3, arg0 ^ -27921);
                class212.field2926.method2411((long) arg1, var4, false);
                if (arg0 != 27920) {
                    method2224(-49);
                }
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BLoa;)V")
    public final void method102(byte arg0, class605 arg1) {
        this.field4987.method975(262144, arg1);
        if (arg0 > -54) {
            this.method89(76);
        }
        ++field4988;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IZLoa;)Lba;")
    public final class327 method94(int arg0, boolean arg1, class605 arg2) {
        if (arg1) {
            return null;
        } else {
            ++field4998;
            return this.field4987.method981(0, false, 0, 107, arg0, arg2, false);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Loa;I)V")
    public final void method90(class605 arg0, int arg1) {
        if (arg1 != -5) {
            this.method100((class605) null, 52);
        }
        ++field4995;
        class327 var3 = this.field4987.method981(super.field5065, true, super.field5071, 105, 262144, arg0, false);
        if (var3 != null) {
            int var4 = super.field5065 >> 9;
            int var5 = super.field5071 >> 9;
            class364 var6 = arg0.method342();
            var6.method2014(super.field5065, super.field5066, super.field5071);
            this.field4987.method976(var6, (byte) 50, var3, var4, false, var5, var4, arg0, var5);
        }
    }

    static {
        new class474("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field5005 = new class206(50, -1);
    }
}
