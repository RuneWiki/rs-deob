import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class28 {

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "Lmd;")
    public class132 field626 = new class132();

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field616 = 1;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Lvd;")
    public static class222 field611 = null;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Lvd;")
    private static class222 field608 = class212.method1357("Loaded textures", 10731);

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Lvd;")
    public static class222 field613 = class212.method1357("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", 10731);

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "Lvd;")
    public static class222 field621 = class212.method1357("(U0a )2 non)2existant gosub script)2num: ", 10731);

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Lvd;")
    public static class222 field623 = field608;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public static int field629 = 0;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "Lvd;")
    private static class222 field631 = class212.method1357("Loaded interfaces", 10731);

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "Lvd;")
    public static class222 field625 = field631;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "Lmd;")
    private class132 field630;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Lbg;")
    public static class19 field614;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "[Lbg;")
    public static class19[] field609;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lmd;Z)V")
    public final void method235(class132 arg0, boolean arg1) {
        if (arg0.field2558 != null) {
            arg0.method826(-22101);
        }
        field610++;
        if (!arg1) {
            this.method242(98);
        }
        arg0.field2558 = this.field626.field2558;
        arg0.field2554 = this.field626;
        arg0.field2558.field2554 = arg0;
        arg0.field2554.field2558 = arg0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Lmd;")
    public final class132 method236(int arg0) {
        class132 var2 = this.field626.field2554;
        field617++;
        if (this.field626 == var2) {
            this.field630 = null;
            return null;
        } else {
            this.field630 = var2.field2554;
            return arg0 == 0 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)Lmd;")
    public final class132 method237(boolean arg0) {
        class132 var2 = this.field630;
        field620++;
        if (this.field626 == var2) {
            this.field630 = null;
            return null;
        }
        this.field630 = var2.field2554;
        if (!arg0) {
            field616 = 26;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public final void method238(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field607++;
        while (true) {
            class132 var2 = this.field626.field2554;
            if (this.field626 == var2) {
                return;
            }
            var2.method826(-22101);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)Ltc;")
    public static final class201 method239(int arg0, int arg1, int arg2) {
        class121 var3 = class204.field3800[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2302;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lmd;B)V")
    public final void method240(class132 arg0, byte arg1) {
        if (arg0.field2558 != null) {
            arg0.method826(-22101);
        }
        arg0.field2558 = this.field626;
        arg0.field2554 = this.field626.field2554;
        field619++;
        arg0.field2558.field2554 = arg0;
        arg0.field2554.field2558 = arg0;
        int var3 = -59 % ((arg1 + 43) / 32);
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
    public static void method241(int arg0) {
        field608 = null;
        field613 = null;
        field631 = null;
        field609 = null;
        field614 = null;
        field623 = null;
        field621 = null;
        field611 = null;
        if (arg0 == 1) {
            field625 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)Lmd;")
    public final class132 method242(int arg0) {
        if (arg0 != 1) {
            method243((byte) -81);
        }
        field618++;
        class132 var2 = this.field630;
        if (this.field626 == var2) {
            this.field630 = null;
            return null;
        } else {
            this.field630 = var2.field2558;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static final void method243(byte arg0) {
        if (class54.field1023 != null) {
            class54.field1023.method784(5000);
        }
        field615++;
        if (arg0 <= 51) {
            method239(20, -53, 121);
        }
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)Lmd;")
    public final class132 method244(int arg0) {
        if (arg0 != -4835) {
            return null;
        }
        field628++;
        class132 var2 = this.field626.field2554;
        if (this.field626 == var2) {
            return null;
        } else {
            var2.method826(-22101);
            return var2;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIZIIBLve;)V")
    public static final void method245(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5, class223 arg6) {
        if (arg3 < 87) {
            field631 = null;
        }
        long var7 = (long) ((arg1 << 16) + arg0);
        field612++;
        class212 var9 = (class212) class116.field2224.method1520(var7, 87);
        if (var9 != null) {
            return;
        }
        class212 var10 = (class212) class218.field4045.method1520(var7, 64);
        if (var10 != null) {
            return;
        }
        class212 var11 = (class212) class173.field3241.method1520(var7, 33);
        if (var11 == null) {
            if (!arg2) {
                class212 var12 = (class212) class218.field4048.method1520(var7, 104);
                if (var12 != null) {
                    return;
                }
            }
            class212 var13 = new class212();
            var13.field3938 = arg6;
            var13.field3936 = arg5;
            var13.field3942 = arg4;
            if (arg2) {
                class116.field2224.method1519(true, var13, var7);
                class116.field2216++;
            } else {
                class157.field3012.method1287(false, var13);
                class173.field3241.method1519(true, var13, var7);
                class114.field2162++;
            }
        } else if (arg2) {
            var11.method1362(-2);
            class116.field2224.method1519(true, var11, var7);
            class116.field2216++;
            class114.field2162--;
        }
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)Lmd;")
    public final class132 method246(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field624++;
        class132 var2 = this.field626.field2558;
        if (this.field626 == var2) {
            this.field630 = null;
            return null;
        } else {
            this.field630 = var2.field2558;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lmd;ILmd;)V")
    public final void method247(class132 arg0, int arg1, class132 arg2) {
        if (arg2.field2558 != null) {
            arg2.method826(-22101);
        }
        arg2.field2558 = arg0.field2558;
        arg2.field2554 = arg0;
        arg2.field2558.field2554 = arg2;
        if (arg1 != -18395) {
            this.field630 = null;
        }
        arg2.field2554.field2558 = arg2;
        field622++;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    public class28() {
        this.field626.field2558 = this.field626;
        this.field626.field2554 = this.field626;
    }
}
