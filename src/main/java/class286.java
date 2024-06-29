import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class286 extends class56 implements class338 {

    @OriginalMember(owner = "client!nv", name = "u", descriptor = "Lgv;")
    public class56 field3732;

    @OriginalMember(owner = "client!nv", name = "F", descriptor = "I")
    public static int field3743 = 0;

    @OriginalMember(owner = "client!nv", name = "J", descriptor = "I")
    public static int field3747 = 0;

    @OriginalMember(owner = "client!nv", name = "s", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!nv", name = "t", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!nv", name = "w", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!nv", name = "x", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!nv", name = "z", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!nv", name = "A", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!nv", name = "B", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!nv", name = "C", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!nv", name = "D", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!nv", name = "E", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!nv", name = "G", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!nv", name = "H", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!nv", name = "I", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!nv", name = "K", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!nv", name = "L", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!nv", name = "M", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!nv", name = "y", descriptor = "Lf;")
    public static class529 field3736;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILqa;)V")
    public final void method337(int arg0, class162 arg1) {
        field3750++;
        if (arg0 != -7803) {
            this.method342(61);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lqa;Z)V")
    public final void method334(class162 arg0, boolean arg1) {
        field3746++;
        if (!arg1) {
            this.method343(100, 60, null, -62);
        }
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(I)Z")
    public final boolean method338(int arg0) {
        if (arg0 >= -8) {
            field3736 = null;
        }
        field3734++;
        return false;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V")
    public final void method342(int arg0) {
        field3735++;
        int var2 = 72 / ((56 - arg0) / 52);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IILqa;Leq;IIZ)V")
    public final void method127(int arg0, int arg1, class162 arg2, class140 arg3, int arg4, int arg5, boolean arg6) {
        field3737++;
        if (arg0 != 1) {
            this.method334(null, false);
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)Z")
    public final boolean method126(byte arg0) {
        field3745++;
        return arg0 != 54;
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)I")
    public final int method345(int arg0) {
        field3730++;
        if (arg0 != -1736) {
            this.method345(124);
        }
        return 0;
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)I")
    public final int method344(int arg0) {
        field3738++;
        return arg0 == -4534 ? 0 : -21;
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(IIIIILgv;)V")
    public class286(int arg0, int arg1, int arg2, int arg3, int arg4, class56 arg5) {
        super(arg2, arg3, arg4, class433.method2493(arg0, arg1, 0));
        this.field3732 = arg5;
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(ILqa;)Lfm;")
    public final class514 method339(int arg0, class162 arg1) {
        field3740++;
        if (arg0 != 9124) {
            method1689(true, null);
        }
        return null;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IILqa;I)Z")
    public final boolean method343(int arg0, int arg1, class162 arg2, int arg3) {
        if (arg0 == -1) {
            field3731++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLqa;I)Lc;")
    public final class121 method336(byte arg0, class162 arg1, int arg2) {
        if (arg0 != -102) {
            this.method347((byte) -88);
        }
        field3748++;
        return null;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method1689(boolean arg0, String arg1) {
        field3744++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class264.method1587(arg1, -18488);
        if (arg0) {
            method1689(false, null);
        }
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class114.field1621; var3++) {
            String var4 = class227.field3064[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class264.method1587(var4, -18488);
            if (var5 != null && var5.equals(var2)) {
                class114.field1621--;
                for (int var6 = var3; var6 < class114.field1621; var6++) {
                    class227.field3064[var6] = class227.field3064[var6 + 1];
                    class222.field2989[var6] = class222.field2989[var6 + 1];
                    class184.field2622[var6] = class184.field2622[var6 + 1];
                    class309.field4070[var6] = class309.field4070[var6 + 1];
                    class140.field2040[var6] = class140.field2040[var6 + 1];
                }
                class57.field895 = class308.field4051;
                class127.field1851++;
                class118.method822(59, class292.field3839);
                class193.field2708.method2200(7, class125.method912(arg1, 1));
                class193.field2708.method2216(arg1, -122);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)V")
    public final void method125(boolean arg0) {
        if (arg0) {
            field3741++;
        }
    }

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "(I)V")
    public static void method1690(int arg0) {
        if (arg0 != 0) {
            method1691(121, -109, 62);
        }
        field3736 = null;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(III)V")
    public static final void method1691(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            class412.field5694 = arg2 - class6.field172;
            field3739++;
            class250.field3323 = arg1 - class6.field175;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lqa;I)V")
    public final void method340(class162 arg0, int arg1) {
        if (arg1 != 20203) {
            this.method126((byte) 102);
        }
        field3742++;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)I")
    public final int method347(byte arg0) {
        field3733++;
        if (arg0 != -87) {
            this.field3732 = null;
        }
        return 0;
    }
}
