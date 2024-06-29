import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class633 {

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "Ljava/lang/String;")
    private String field9090 = "null";

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "Lnb;")
    public static class301 field9103 = new class301("game4", 3);

    @OriginalMember(owner = "client!sp", name = "t", descriptor = "[Lig;")
    public static class244[] field9108 = new class244[2048];

    @OriginalMember(owner = "client!sp", name = "s", descriptor = "Z")
    public static boolean field9107 = false;

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "C")
    public char field9100;

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "C")
    public char field9104;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
    public static int field9089;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
    public static int field9091;

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "I")
    public static int field9092;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
    public static int field9094;

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "I")
    public static int field9095;

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "I")
    public static int field9096;

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "I")
    public static int field9098;

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "I")
    private int field9099;

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "I")
    public static int field9101;

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "I")
    public static int field9102;

    @OriginalMember(owner = "client!sp", name = "q", descriptor = "I")
    public static int field9105;

    @OriginalMember(owner = "client!sp", name = "r", descriptor = "I")
    public static int field9106;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "Lpfa;")
    private class295 field9093;

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "Lpfa;")
    public class295 field9097;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V")
    public static void method3628(int arg0) {
        if (arg0 <= 90) {
            field9108 = null;
        }
        field9103 = null;
        field9108 = null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BI)I")
    public final int method3629(byte arg0, int arg1) {
        field9102++;
        if (arg0 < 4) {
            this.method3634(null, 15);
        }
        if (this.field9097 == null) {
            return this.field9099;
        } else {
            class716 var3 = (class716) this.field9097.method1754(false, (long) arg1);
            return var3 == null ? this.field9099 : var3.field10054;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)Z")
    public final boolean method3630(int arg0, int arg1) {
        field9101++;
        if (this.field9097 == null) {
            return false;
        }
        if (this.field9093 == null) {
            this.method3637(6626);
        }
        class716 var3 = (class716) this.field9093.method1754(false, (long) arg0);
        if (arg1 > -4) {
            this.field9099 = 110;
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public final String method3631(int arg0, boolean arg1) {
        field9095++;
        if (this.field9097 == null) {
            return this.field9090;
        } else {
            class551 var3 = (class551) this.field9097.method1754(arg1, (long) arg0);
            return var3 == null ? this.field9090 : var3.field7910;
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V")
    private final void method3632(int arg0) {
        this.field9093 = new class295(this.field9097.method1757(121));
        field9092++;
        for (class551 var2 = (class551) this.field9097.method1753(0); var2 != null; var2 = (class551) this.field9097.method1755(arg0 ^ 0x3F86)) {
            class689 var3 = new class689(var2.field7910, (int) var2.field1522);
            this.field9093.method1751(var3, 3970, class36.method165(var2.field7910, false));
        }
        if (arg0 != -16310) {
            this.field9099 = 26;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILaia;)Z")
    public static final boolean method3633(int arg0, class228 arg1) {
        if (arg0 != 0) {
            return false;
        }
        field9106++;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field2603) {
            return false;
        } else if (!arg1.method1317(class656.field9358, 20099)) {
            return false;
        } else if (class541.field7782.method1754(false, (long) arg1.field2655) == null) {
            return class101.field1046.method1754(false, (long) arg1.field2640) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method3634(String arg0, int arg1) {
        field9089++;
        if (this.field9097 == null) {
            return false;
        }
        if (this.field9093 == null) {
            this.method3632(-16310);
        }
        if (arg1 != -6) {
            return false;
        }
        for (class689 var3 = (class689) this.field9093.method1754(false, class36.method165(arg0, false)); var3 != null; var3 = (class689) this.field9093.method1759(-1)) {
            if (var3.field9722.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lig;BI)V")
    private final void method3635(class244 arg0, byte arg1, int arg2) {
        field9094++;
        if (arg1 != -51) {
            this.field9090 = null;
        }
        if (arg2 == 1) {
            this.field9104 = class169.method1054(arg0.method1448((byte) -111), -161);
        } else if (arg2 == 2) {
            this.field9100 = class169.method1054(arg0.method1448((byte) -128), -161);
        } else if (arg2 == 3) {
            this.field9090 = arg0.method1468(-1468860088);
        } else if (arg2 == 4) {
            this.field9099 = arg0.method1438(118);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method1476(24);
            this.field9097 = new class295(class756.method4202(true, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1438(93);
                class134 var7;
                if (arg2 == 5) {
                    var7 = new class551(arg0.method1468(arg1 - 1468860037));
                } else {
                    var7 = new class716(arg0.method1438(arg1 ^ 0xFFFFFFA6));
                }
                this.field9097.method1751(var7, 3970, (long) var6);
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lig;B)V")
    public final void method3636(class244 arg0, byte arg1) {
        field9098++;
        while (true) {
            int var3 = arg0.method1423(-29);
            if (var3 == 0) {
                if (arg1 >= -28) {
                    this.method3629((byte) 110, 72);
                    return;
                } else {
                    return;
                }
            }
            this.method3635(arg0, (byte) -51, var3);
        }
    }

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)V")
    private final void method3637(int arg0) {
        this.field9093 = new class295(this.field9097.method1757(arg0 ^ 0x199A));
        field9096++;
        for (class716 var2 = (class716) this.field9097.method1753(arg0 ^ arg0); var2 != null; var2 = (class716) this.field9097.method1755(arg0 ^ 0xFFFFE65A)) {
            class716 var3 = new class716((int) var2.field1522);
            this.field9093.method1751(var3, 3970, (long) var2.field10054);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILha;I)Lur;")
    public static final class535 method3638(int arg0, class58 arg1, int arg2) {
        field9091++;
        if (arg0 <= 41) {
            method3638(59, null, 71);
        }
        class667 var3 = class104.method718(95, arg1, true, arg2);
        return var3 == null ? null : var3.field9494;
    }
}
