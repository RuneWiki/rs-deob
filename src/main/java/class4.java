import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 {

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "Lca;")
    public class16 field54 = new class16();

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "Lob;")
    public static class99 field58 = new class99(64);

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Lje;")
    public static class67 field60 = class85.method592(255, "<col=ff7000>");

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "[Lna;")
    public static class91[] field59 = new class91[2048];

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "Lje;")
    public static class67 field69 = class85.method592(255, "::rect_debug");

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "Lje;")
    public static class67 field64 = class85.method592(255, "<img=0>");

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "Lje;")
    private static class67 field68 = class85.method592(255, "No response from server)3");

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "[I")
    public static int[] field71 = new int[200];

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "Lje;")
    public static class67 field67 = field68;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field70 = 0;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "Lje;")
    public static class67 field72 = class85.method592(255, "Sprites geladen)3");

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "Lje;")
    private static class67 field73 = class85.method592(255, "Loaded config");

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "Lje;")
    private static class67 field74 = class85.method592(255, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "Lje;")
    public static class67 field63 = field73;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "Lje;")
    public static class67 field66 = field74;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "Lca;")
    private class16 field57;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "[I")
    public static int[] field61;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "[I")
    public static int[] field65;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)Lca;")
    public final class16 method17(int arg0) {
        if (arg0 != -5226) {
            this.method19((byte) 42, null);
        }
        field48++;
        class16 var2 = this.field57;
        if (this.field54 == var2) {
            this.field57 = null;
            return null;
        } else {
            this.field57 = var2.field285;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)Lca;")
    public final class16 method18(byte arg0) {
        class16 var2 = this.field57;
        field45++;
        if (this.field54 == var2) {
            this.field57 = null;
            return null;
        } else {
            this.field57 = var2.field293;
            return arg0 >= -127 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLca;)V")
    public final void method19(byte arg0, class16 arg1) {
        field46++;
        if (arg1.field285 != null) {
            arg1.method115(26851);
        }
        arg1.field293 = this.field54;
        arg1.field285 = this.field54.field285;
        arg1.field285.field293 = arg1;
        int var3 = -109 / ((11 - arg0) / 44);
        arg1.field293.field285 = arg1;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public static void method20(int arg0) {
        field67 = null;
        field65 = null;
        field61 = null;
        if (arg0 != -25883) {
            method27(-34, 49, (byte) 78);
        }
        field58 = null;
        field66 = null;
        field71 = null;
        field60 = null;
        field68 = null;
        field74 = null;
        field59 = null;
        field69 = null;
        field72 = null;
        field63 = null;
        field64 = null;
        field73 = null;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)Lca;")
    public final class16 method21(byte arg0) {
        field47++;
        class16 var2 = this.field54.field285;
        if (arg0 >= -28) {
            this.method25(-90);
        }
        if (this.field54 == var2) {
            return null;
        } else {
            var2.method115(26851);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)Lca;")
    public final class16 method22(byte arg0) {
        class16 var2 = this.field54.field293;
        field51++;
        if (this.field54 == var2) {
            return null;
        }
        var2.method115(26851);
        if (arg0 < 92) {
            field65 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lca;ILca;)V")
    public final void method23(class16 arg0, int arg1, class16 arg2) {
        field53++;
        if (arg0.field285 != null) {
            arg0.method115(26851);
        }
        arg0.field293 = arg2;
        arg0.field285 = arg2.field285;
        if (arg1 > 38) {
            arg0.field285.field293 = arg0;
            arg0.field293.field285 = arg0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)Lca;")
    public final class16 method24(int arg0) {
        field56++;
        class16 var2 = this.field54.field285;
        if (this.field54 == var2) {
            this.field57 = null;
            return null;
        }
        if (arg0 != -6) {
            this.method28((byte) -111, null);
        }
        this.field57 = var2.field285;
        return var2;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
    public final void method25(int arg0) {
        int var2 = -24 % ((-arg0 - 51) / 43);
        field52++;
        while (true) {
            class16 var3 = this.field54.field293;
            if (this.field54 == var3) {
                return;
            }
            var3.method115(26851);
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(B)Lca;")
    public final class16 method26(byte arg0) {
        int var2 = -101 / ((-arg0 - 28) / 35);
        field55++;
        class16 var3 = this.field54.field293;
        if (this.field54 == var3) {
            this.field57 = null;
            return null;
        } else {
            this.field57 = var3.field293;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIB)Z")
    public static final boolean method27(int arg0, int arg1, byte arg2) {
        if (arg1 == 11) {
            arg1 = 10;
        }
        field49++;
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        if (arg2 == -25) {
            class47 var3 = class130.method993(arg0, (byte) 119);
            return var3.method301(arg1, 65535);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(BLca;)V")
    public final void method28(byte arg0, class16 arg1) {
        field50++;
        if (arg1.field285 != null) {
            arg1.method115(26851);
        }
        arg1.field293 = this.field54.field293;
        arg1.field285 = this.field54;
        arg1.field285.field293 = arg1;
        if (arg0 <= 99) {
            this.method28((byte) 37, null);
        }
        arg1.field293.field285 = arg1;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
    public class4() {
        this.field54.field293 = this.field54;
        this.field54.field285 = this.field54;
    }
}
