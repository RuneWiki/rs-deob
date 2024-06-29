import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class103 extends class145 {

    @OriginalMember(owner = "client!pc", name = "bd", descriptor = "Lmb;")
    private static class84 field2509 = class79.method672(true, "glow2:");

    @OriginalMember(owner = "client!pc", name = "Wc", descriptor = "Lmb;")
    public static class84 field2504 = class79.method672(true, "backbase1");

    @OriginalMember(owner = "client!pc", name = "Yc", descriptor = "Lmb;")
    private static class84 field2506 = class79.method672(true, "Loaded update list");

    @OriginalMember(owner = "client!pc", name = "Zc", descriptor = "Lmb;")
    public static class84 field2507 = field2509;

    @OriginalMember(owner = "client!pc", name = "Xc", descriptor = "Lmb;")
    public static class84 field2505 = class79.method672(true, "Null");

    @OriginalMember(owner = "client!pc", name = "ad", descriptor = "I")
    public static int field2508 = 0;

    @OriginalMember(owner = "client!pc", name = "gd", descriptor = "Lmb;")
    public static class84 field2514 = field2506;

    @OriginalMember(owner = "client!pc", name = "hd", descriptor = "Lmb;")
    public static class84 field2515 = class79.method672(true, "Name des Gegenstands eingeben:");

    @OriginalMember(owner = "client!pc", name = "ed", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!pc", name = "fd", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!pc", name = "id", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!pc", name = "jd", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!pc", name = "Vc", descriptor = "Lr;")
    public static class112 field2503;

    @OriginalMember(owner = "client!pc", name = "dd", descriptor = "Lsd;")
    public static class122 field2511;

    @OriginalMember(owner = "client!pc", name = "cd", descriptor = "Lve;")
    public class141 field2510;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(Z)V")
    public static void method853(boolean arg0) {
        if (!arg0) {
            method854(false);
        }
        field2509 = null;
        field2515 = null;
        field2505 = null;
        field2503 = null;
        field2506 = null;
        field2507 = null;
        field2504 = null;
        field2514 = null;
        field2511 = null;
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)Ldd;")
    public final class26 method89(int arg0) {
        ++field2516;
        if (this.field2510 == null) {
            return null;
        } else {
            class70 var2 = ~super.field3558 != 0 && super.field3497 == 0 ? class79.method673(super.field3558, false) : null;
            class70 var3 = ~super.field3537 == 0 || super.field3546 == super.field3537 && var2 != null ? null : class79.method673(super.field3537, false);
            class26 var4 = this.field2510.method1149(1, super.field3545, var3, var2, super.field3538);
            if (arg0 != -6767) {
                field2509 = null;
            }
            if (var4 == null) {
                return null;
            } else {
                var4.method175();
                super.field3552 = var4.field1668;
                if (super.field3556 != -1 && super.field3532 != -1) {
                    class26 var5 = class109.method894(super.field3556, (byte) 112).method1059(0, super.field3532);
                    if (var5 != null) {
                        class26[] var6 = new class26[] { var4, var5 };
                        var5.method178(0, -super.field3553, 0);
                        var4 = new class26(var6, 2);
                    }
                }
                if (this.field2510.field3367 == 1) {
                    var4.field592 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)Z")
    public final boolean method569(byte arg0) {
        ++field2512;
        if (arg0 > -22) {
            field2508 = 24;
        }
        return this.field2510 != null;
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "(Z)V")
    public static final void method854(boolean arg0) {
        class124.field3012 = true;
        if (arg0) {
            method853(true);
        }
        class56.field1282 = true;
        ++field2517;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lia;I)Z")
    public static final boolean method855(class57 arg0, int arg1) {
        int var2 = 117 / ((55 - arg1) / 35);
        ++field2513;
        if (arg0.field1445 == null) {
            return false;
        } else {
            for (int var3 = 0; ~var3 > ~arg0.field1445.length; ++var3) {
                int var4 = class111.method904(arg0, true, var3);
                int var5 = arg0.field1383[var3];
                if (~arg0.field1445[var3] == -3) {
                    if (~var4 <= ~var5) {
                        return false;
                    }
                } else if (~arg0.field1445[var3] != -4) {
                    if (~arg0.field1445[var3] != -5) {
                        if (~var4 != ~var5) {
                            return false;
                        }
                    } else if (var4 == var5) {
                        return false;
                    }
                } else if (var4 <= var5) {
                    return false;
                }
            }
            return true;
        }
    }
}
