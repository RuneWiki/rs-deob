import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class17 {

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public int field474;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "Z")
    public static boolean field473 = false;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "Lvf;")
    public static class265 field469 = class87.method582(-46, "violet:");

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "Lvf;")
    public static class265 field479 = class87.method582(-46, "M");

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "Lfl;")
    public static class192 field480;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)Lue;")
    public static final class13 method119(int arg0, int arg1, int arg2) {
        field467++;
        if (arg1 >= 0) {
            field469 = null;
        }
        for (class13 var3 = (class13) class48.field1032.method789((byte) -52); var3 != null; var3 = (class13) class48.field1032.method787((byte) -76)) {
            if (var3.field401 && var3.method102(arg0, (byte) 127, arg2)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Lwd;")
    public static final class65 method120(int arg0, int arg1) {
        field481++;
        class65 var2 = (class65) class171.field3088.method1887(119, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class210.field3781.method1332(true, arg1, 1);
        class65 var4 = new class65();
        if (arg0 != -8) {
            field480 = null;
        }
        if (var3 != null) {
            var4.method469(arg1, (byte) 109, new class135(var3));
        }
        class171.field3088.method1892(var4, (long) arg1, (byte) -124);
        return var4;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static void method121(int arg0) {
        field469 = null;
        int var1 = 56 / ((45 - arg0) / 36);
        field480 = null;
        field479 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lvf;I)V")
    public static final void method122(class265 arg0, int arg1) {
        field471++;
        class13 var2 = (class13) class48.field1032.method789((byte) -109);
        if (arg1 != -3) {
            return;
        }
        while (var2 != null) {
            if (var2.field410.method1776((byte) -118, arg0)) {
                class181.field3211 = var2;
                return;
            }
            var2 = (class13) class48.field1032.method787((byte) -76);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)Lvf;")
    public static final class265 method123(int arg0, int arg1) {
        field470++;
        class265 var2 = class241.method1609(true, arg0);
        for (int var3 = var2.method1808((byte) -15) - 3; var3 > 0; var3 -= 3) {
            var2 = class148.method1022(10, new class265[] { var2.method1772(var3, 0, (byte) 108), class282.field4973, var2.method1810(-1, var3) });
        }
        if (arg1 < var2.method1808((byte) -15)) {
            return class148.method1022(arg1 ^ 0x3, new class265[] { class10.field328, var2.method1772(var2.method1808((byte) -15) - 8, 0, (byte) 94), class57.field1169, class163.field2974, var2, class146.field2735 });
        } else if (var2.method1808((byte) -15) > 6) {
            return class148.method1022(10, new class265[] { class188.field3381, var2.method1772(var2.method1808((byte) -15) - 4, 0, (byte) 117), class257.field4417, class163.field2974, var2, class146.field2735 });
        } else {
            return class148.method1022(10, new class265[] { class169.field3053, var2, class197.field3514 });
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class17() {
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)I")
    public static final int method124(int arg0) {
        field478++;
        if ((double) class144.field2687 == 3.0D) {
            return 37;
        } else if ((double) class144.field2687 == 4.0D) {
            return 50;
        } else {
            if (arg0 != 22124) {
                field469 = null;
            }
            if ((double) class144.field2687 == 6.0D) {
                return 75;
            } else if ((double) class144.field2687 == 8.0D) {
                return 100;
            } else {
                return 200;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lub;)V")
    public class17(class17 arg0) {
        this.field474 = arg0.field474;
        this.field468 = arg0.field468;
        this.field477 = arg0.field477;
        this.field472 = arg0.field472;
    }
}
