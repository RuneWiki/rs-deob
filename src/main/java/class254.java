import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class254 {

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "Lft;")
    private class4 field3871;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "[I")
    public static int[] field3877 = new int[14];

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "Lrp;")
    public static class288 field3880 = new class288(64);

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public static int field3882 = 0;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "Lol;")
    private class179 field3874;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "Llt;")
    public static class458 field3878;

    static {
        new class423("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V", line = 5)
    public static void method1523(byte arg0) {
        if (arg0 >= -91) {
            field3877 = null;
        }
        field3878 = null;
        field3880 = null;
        field3877 = null;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)V", line = 22)
    public static final void method1524(byte arg0) {
        if (arg0 != 50) {
            field3878 = null;
        }
        field3876++;
        if (!class304.field4622) {
            return;
        }
        while (true) {
            while (class396.field5771 < class486.field7402.length) {
                class471 var1 = class486.field7402[class396.field5771];
                if (var1 != null && var1.field7209 == -1) {
                    if (class501.field7589 == null) {
                        class501.field7589 = class306.field4638.method1166((byte) -63, var1.field7204);
                    }
                    int var2 = class501.field7589.field6294;
                    if (var2 == -1) {
                        return;
                    }
                    var1.field7209 = var2;
                    class501.field7589 = null;
                    class396.field5771++;
                } else {
                    class396.field5771++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(B)Lol;", line = 65)
    public final class179 method1525(byte arg0) {
        field3873++;
        class179 var2 = this.field3874;
        if (arg0 != 45) {
            this.method1525((byte) 107);
        }
        if (this.field3871.field45 == var2) {
            this.field3874 = null;
            return null;
        } else {
            this.field3874 = var2.field2799;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lft;I)V", line = 89)
    public final void method1526(class4 arg0, int arg1) {
        field3875++;
        this.field3871 = arg0;
        if (arg1 > -61) {
            this.field3871 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V", line = 100)
    public class254() {
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)Lol;", line = 103)
    public final class179 method1527(int arg0) {
        field3879++;
        if (arg0 != -2) {
            return null;
        }
        class179 var2 = this.field3871.field45.field2799;
        if (this.field3871.field45 == var2) {
            this.field3874 = null;
            return null;
        } else {
            this.field3874 = var2.field2799;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIII)V", line = 126)
    public static final void method1528(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 15368) {
            method1524((byte) -26);
        }
        field3872++;
        if (class355.field5296 <= arg4 && class320.field4818 >= arg4) {
            int var5 = class167.method1056(class478.field7310, (byte) -122, class248.field3808, arg0);
            int var6 = class167.method1056(class478.field7310, (byte) -128, class248.field3808, arg1);
            class213.method1309(arg3, arg2 ^ 0x3C08, var5, var6, arg4);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BI)I", line = 144)
    public static final int method1529(byte arg0, int arg1) {
        int var2 = -104 % ((arg0 - 3) / 35);
        field3881++;
        int var3 = arg1 & 0x3F;
        int var4 = arg1 >> 6 & 0x3;
        if (var3 == 18) {
            if (var4 == 0) {
                return 1;
            }
            if (var4 == 1) {
                return 2;
            }
            if (var4 == 2) {
                return 4;
            }
            if (var4 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var4 == 0) {
                return 16;
            }
            if (var4 == 1) {
                return 32;
            }
            if (var4 == 2) {
                return 64;
            }
            if (var4 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lft;)V", line = 197)
    public class254(class4 arg0) {
        this.field3871 = arg0;
    }
}
