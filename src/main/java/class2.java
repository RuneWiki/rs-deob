import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 implements class10 {

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    private int field42 = 128;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    private int field41 = 50;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "Lga;")
    private class58 field49;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "Lga;")
    private class58 field45;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Ltd;")
    private class176 field43;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "Led;")
    public static class43 field50 = class191.method1219("sl_button", false);

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "Led;")
    private static class43 field57 = class191.method1219("You can(Wt add yourself to your own friend list)3", false);

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Led;")
    public static class43 field48 = field57;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "Led;")
    public static class43 field54 = class191.method1219("Keine Antwort vom Server)3", false);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Led;")
    public static class43 field39 = class191.method1219("Geben Sie Ihren Benutzernamen", false);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)Lgb;")
    public static final class59 method7(boolean arg0, int arg1) {
        field40++;
        class59 var2 = (class59) class148.field3023.method1106(100, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class85.field1669.method367(9, arg1, (byte) -34);
        class59 var4 = new class59();
        var4.field1183 = arg1;
        if (arg0) {
            method13((byte) -96);
        }
        if (var3 != null) {
            var4.method376((byte) -91, new class89(var3));
        }
        var4.method368(35);
        class148.field3023.method1107((long) arg1, var4, -114);
        return var4;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Led;ILed;Lga;)Lnb;")
    public static final class120 method8(class43 arg0, int arg1, class43 arg2, class58 arg3) {
        field46++;
        int var4 = arg3.method347(arg2, (byte) -95);
        if (arg1 != -4666) {
            field54 = null;
        }
        int var5 = arg3.method362(arg0, (byte) -47, var4);
        return class206.method1338(var5, arg3, var4, -97);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(FIB)[I")
    public final int[] method9(float arg0, int arg1, byte arg2) {
        field58++;
        if (arg2 != -113) {
            method15(51, null, null, null);
        }
        class154 var4 = this.method12((byte) -95, arg1);
        var4.field3116 = true;
        return var4.method983(this.field49, this, -1, arg0, this.field42);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZ)Z")
    public final boolean method10(int arg0, boolean arg1) {
        field47++;
        if (!arg1) {
            this.method12((byte) 114, 112);
        }
        return this.method12((byte) -117, arg0).field3128;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
    public final void method11(boolean arg0) {
        this.field43 = new class176(this.field41);
        field44++;
        if (arg0) {
            this.method12((byte) -82, -70);
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(BI)Lr;")
    private final class154 method12(byte arg0, int arg1) {
        field62++;
        class154 var3 = (class154) this.field43.method1106(100, (long) arg1);
        if (arg0 >= -59) {
            field57 = null;
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field45.method367(0, arg1, (byte) -34);
        if (var4 == null) {
            return class180.method1169(true);
        } else {
            class89 var5 = new class89(var4);
            class154 var6 = new class154(var5);
            this.field43.method1107((long) arg1, var6, 109);
            return var6;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static void method13(byte arg0) {
        field48 = null;
        field39 = null;
        field57 = null;
        field54 = null;
        int var1 = -84 % ((50 - arg0) / 47);
        field50 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Z")
    public final boolean method14(int arg0, int arg1) {
        if (arg0 != -9926) {
            field54 = null;
        }
        field59++;
        return this.method12((byte) -60, arg1).method979(this.field49, this, true);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILga;Lga;Lga;)V")
    public static final void method15(int arg0, class58 arg1, class58 arg2, class58 arg3) {
        field60++;
        int var4 = -26 % ((-arg0 - 41) / 44);
        class166.field3290 = arg2;
        class74.field1465 = arg1;
        class65.field1318 = arg3;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lga;Lga;II)V")
    public class2(class58 arg0, class58 arg1, int arg2, int arg3) {
        this.field42 = arg3;
        this.field49 = arg1;
        this.field41 = arg2;
        this.field45 = arg0;
        this.field43 = new class176(this.field41);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)[I")
    public final int[] method16(byte arg0, int arg1) {
        if (arg0 != -92) {
            field50 = null;
        }
        field55++;
        class89 var3 = new class89(this.field45.method367(0, arg1, (byte) -34));
        class154 var4 = new class154(var3);
        return var4.method980(this.field42, this, this.field49, 109);
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(IB)V")
    public final void method17(int arg0, byte arg1) {
        field52++;
        for (class154 var3 = (class154) this.field43.method1109((byte) -84); var3 != null; var3 = (class154) this.field43.method1104(118)) {
            if (var3.field3116) {
                var3.method982(33, arg0);
                var3.field3116 = false;
            }
        }
        if (arg1 > -67) {
            field48 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(II)Leg;")
    public static final class46 method18(int arg0, int arg1) {
        field51++;
        class46 var2 = (class46) class58.field1131.method1106(100, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class116.field2268.method367(10, arg0, (byte) -34);
        class46 var4 = new class46();
        var4.field938 = arg0;
        if (var3 != null) {
            var4.method280((byte) 52, new class89(var3));
        }
        var4.method287(128);
        if (~var4.field906 != arg1) {
            var4.method282(method18(var4.field910, 0), 0, method18(var4.field906, 0));
        }
        if (!class198.field3904 && var4.field946) {
            var4.field912 = null;
            var4.field896 = 0;
            var4.field898 = false;
            var4.field905 = class184.field3633;
            var4.field937 = null;
        }
        class58.field1131.method1107((long) arg0, var4, -113);
        return var4;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)Z")
    public final boolean method19(int arg0, byte arg1) {
        field56++;
        int var3 = 101 / ((arg1 + 74) / 52);
        return this.method12((byte) -97, arg0).field3139;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(BI)Z")
    public final boolean method20(byte arg0, int arg1) {
        field53++;
        if (this.field42 == 64 || this.method12((byte) -92, arg1).field3115 == 64) {
            return true;
        } else {
            if (arg0 != -32) {
                this.method17(53, (byte) -37);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)I")
    public final int method21(int arg0, int arg1) {
        if (arg1 <= 122) {
            field57 = null;
        }
        field61++;
        return this.method12((byte) -98, arg0).field3122;
    }
}
