import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class23 {

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Le;")
    private static class191 field325 = class54.method368("Connection lost)3", 2047);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field324 = 0;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "Le;")
    public static class191 field326 = field325;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Le;")
    public static class191 field328 = class54.method368(")3", 2047);

    @OriginalMember(owner = "client!da", name = "h", descriptor = "Le;")
    public static class191 field329 = class54.method368("titlebg", 2047);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "[Lc;")
    public static class60[] field323;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method168(int arg0) {
        if (arg0 != 98) {
            method168(82);
        }
        field323 = null;
        field325 = null;
        field328 = null;
        field329 = null;
        field326 = null;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
    public static final void method169(int arg0) {
        class213 var1 = (class213) class129.field2154.method1173(arg0 + 76);
        if (arg0 != 0) {
            field326 = null;
        }
        field322++;
        while (var1 != null) {
            if (var1.field3775 > 0) {
                var1.field3775--;
            }
            if (var1.field3775 != 0) {
                if (var1.field3756 > 0) {
                    var1.field3756--;
                }
                if (var1.field3756 == 0 && var1.field3770 >= 1 && var1.field3767 >= 1 && var1.field3770 <= 102 && var1.field3767 <= 102 && (var1.field3771 < 0 || class209.method1438(var1.field3771, arg0 - 110, var1.field3766))) {
                    class134.method899(var1.field3767, var1.field3765, var1.field3763, var1.field3766, var1.field3758, true, var1.field3770, var1.field3771);
                    var1.field3756 = -1;
                    if (var1.field3771 == var1.field3757 && var1.field3757 == -1) {
                        var1.method655(arg0 + 63);
                    } else if (var1.field3771 == var1.field3757 && var1.field3763 == var1.field3761 && var1.field3768 == var1.field3766) {
                        var1.method655(63);
                    }
                }
            } else if (var1.field3757 < 0 || class209.method1438(var1.field3757, -126, var1.field3768)) {
                class134.method899(var1.field3767, var1.field3765, var1.field3761, var1.field3768, var1.field3758, true, var1.field3770, var1.field3757);
                var1.method655(63);
            }
            var1 = (class213) class129.field2154.method1175(-1);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILeg;IZ)V")
    public static final void method170(int arg0, class33 arg1, int arg2, boolean arg3) {
        if (arg1.field480 == 0) {
            arg1.field526 = arg1.field529;
        } else if (arg1.field480 == 1) {
            arg1.field526 = (arg0 - arg1.field537) / 2 + arg1.field529;
        } else if (arg1.field480 == 2) {
            arg1.field526 = arg0 - arg1.field537 - arg1.field529;
        } else if (arg1.field480 == 3) {
            arg1.field526 = arg1.field529 * arg0 >> 14;
        } else if (arg1.field480 == 4) {
            arg1.field526 = (arg1.field529 * arg0 >> 14) + (arg0 - arg1.field537) / 2;
        } else {
            arg1.field526 = arg0 - (arg1.field529 * arg0 >> 14) - arg1.field537;
        }
        if (arg1.field497 == 0) {
            arg1.field624 = arg1.field558;
        } else if (arg1.field497 == 1) {
            arg1.field624 = (arg2 - arg1.field561) / 2 + arg1.field558;
        } else if (arg1.field497 == 2) {
            arg1.field624 = arg2 - arg1.field558 - arg1.field561;
        } else if (arg1.field497 == 3) {
            arg1.field624 = arg1.field558 * arg2 >> 14;
        } else if (arg1.field497 == 4) {
            arg1.field624 = (arg1.field558 * arg2 >> 14) + (arg2 - arg1.field561) / 2;
        } else {
            arg1.field624 = arg2 - (arg1.field558 * arg2 >> 14) - arg1.field561;
        }
        field327++;
        if (arg3) {
            field324 = 79;
        }
        if (!class111.field1875 || client.method668(arg1) == 0 && arg1.field493 != 0) {
            return;
        }
        if (arg1.field624 < 0) {
            arg1.field624 = 0;
        } else if (arg1.field624 + arg1.field561 > arg2) {
            arg1.field624 = arg2 - arg1.field561;
        }
        if (arg1.field526 < 0) {
            arg1.field526 = 0;
        } else if ((arg1.field537 + arg1.field526) > arg0) {
            arg1.field526 = arg0 - arg1.field537;
            return;
        }
    }
}
