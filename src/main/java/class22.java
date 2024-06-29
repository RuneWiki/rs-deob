import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class22 {

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "Lub;")
    public class182 field474 = new class182();

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field459 = 0;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "[I")
    public static int[] field472 = new int[500];

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Lsg;")
    public static class169 field470 = class165.method1060("Titelbild geladen)3", 1536);

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field469 = 0;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Lsg;")
    private static class169 field461 = class165.method1060("K", 1536);

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "Lsg;")
    public static class169 field471 = field461;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "Lsg;")
    private static class169 field480 = class165.method1060("Please use a different world)3", 1536);

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "Lsg;")
    public static class169 field481 = class165.method1060("Bitte laden Sie die Seite neu)3", 1536);

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Lsg;")
    public static class169 field462 = field461;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Lsg;")
    public static class169 field466 = field480;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "Lsg;")
    public static class169 field482 = field480;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "Lub;")
    private class182 field483;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Z")
    public static boolean field460;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Lub;")
    public final class182 method145(int arg0) {
        field465++;
        class182 var2 = this.field474.field3553;
        if (arg0 != 0) {
            field472 = null;
        }
        if (this.field474 == var2) {
            this.field483 = null;
            return null;
        } else {
            this.field483 = var2.field3553;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Z")
    public static final boolean method146(boolean arg0) {
        field468++;
        try {
            if (class201.field3927 == 2) {
                if (class13.field300 == null) {
                    class13.field300 = class14.method84(class3.field71, class46.field860, class81.field1494);
                    if (class13.field300 == null) {
                        return false;
                    }
                }
                if (class158.field3027 == null) {
                    class158.field3027 = new class65(class203.field3980, class4.field88);
                }
                if (class154.field2971.method1099(class162.field3113, class13.field300, 22050, 124, class158.field3027)) {
                    class154.field2971.method1083(-68);
                    class154.field2971.method1069(-122, class65.field1222);
                    class154.field2971.method1085((byte) 93, class137.field2559, class13.field300);
                    class3.field71 = null;
                    class13.field300 = null;
                    class201.field3927 = 0;
                    class158.field3027 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class154.field2971.method1080(-107);
            class201.field3927 = 0;
            class13.field300 = null;
            class158.field3027 = null;
            class3.field71 = null;
        }
        if (arg0) {
            method154(-90, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)Lub;")
    public final class182 method147(int arg0) {
        if (arg0 != 5633) {
            method146(false);
        }
        field475++;
        class182 var2 = this.field474.field3552;
        if (this.field474 == var2) {
            this.field483 = null;
            return null;
        } else {
            this.field483 = var2.field3552;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lub;Z)V")
    public final void method148(class182 arg0, boolean arg1) {
        if (arg0.field3552 != null) {
            arg0.method1213(9104);
        }
        arg0.field3553 = this.field474.field3553;
        field479++;
        arg0.field3552 = this.field474;
        arg0.field3552.field3553 = arg0;
        if (!arg1) {
            this.method145(122);
        }
        arg0.field3553.field3552 = arg0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILub;)V")
    public final void method149(int arg0, class182 arg1) {
        if (arg0 != 0) {
            field481 = null;
        }
        if (arg1.field3552 != null) {
            arg1.method1213(9104);
        }
        arg1.field3552 = this.field474.field3552;
        arg1.field3553 = this.field474;
        arg1.field3552.field3553 = arg1;
        arg1.field3553.field3552 = arg1;
        field476++;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)Lub;")
    public final class182 method150(int arg0) {
        field473++;
        if (arg0 != 8) {
            field480 = null;
        }
        class182 var2 = this.field474.field3553;
        if (this.field474 == var2) {
            return null;
        } else {
            var2.method1213(9104);
            return var2;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lub;Lub;I)V")
    public final void method151(class182 arg0, class182 arg1, int arg2) {
        field464++;
        if (arg1.field3552 != null) {
            arg1.method1213(9104);
        }
        arg1.field3552 = arg0.field3552;
        arg1.field3553 = arg0;
        arg1.field3552.field3553 = arg1;
        arg1.field3553.field3552 = arg1;
        if (arg2 < 114) {
            field480 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)Lub;")
    public final class182 method152(byte arg0) {
        field478++;
        class182 var2 = this.field483;
        if (this.field474 == var2) {
            this.field483 = null;
            return null;
        } else if (arg0 >= -125) {
            return null;
        } else {
            this.field483 = var2.field3553;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)Lub;")
    public final class182 method153(int arg0) {
        field467++;
        class182 var2 = this.field483;
        if (this.field474 == var2) {
            this.field483 = null;
            return null;
        }
        if (arg0 != -1120) {
            this.method147(104);
        }
        this.field483 = var2.field3552;
        return var2;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[B)V")
    public static final void method154(int arg0, byte[] arg1) {
        class127 var2 = new class127(arg1);
        var2.field2346 = arg1.length - 2;
        field458++;
        class141.field2627 = var2.method785(true);
        class41.field770 = new int[class141.field2627];
        class193.field3814 = new byte[class141.field2627][];
        class203.field3976 = new int[class141.field2627];
        class182.field3544 = new int[class141.field2627];
        class2.field43 = new int[class141.field2627];
        var2.field2346 = arg1.length - class141.field2627 * 8 - 7;
        class16.field334 = var2.method785(true);
        class156.field2992 = var2.method785(true);
        int var3 = (var2.method819((byte) 22) & 0xFF) + 1;
        for (int var4 = arg0; var4 < class141.field2627; var4++) {
            class182.field3544[var4] = var2.method785(true);
        }
        for (int var5 = 0; var5 < class141.field2627; var5++) {
            class41.field770[var5] = var2.method785(true);
        }
        for (int var6 = 0; var6 < class141.field2627; var6++) {
            class203.field3976[var6] = var2.method785(true);
        }
        for (int var7 = 0; var7 < class141.field2627; var7++) {
            class2.field43[var7] = var2.method785(true);
        }
        var2.field2346 = arg1.length + 3 - var3 * 3 - class141.field2627 * 8 - 7;
        class197.field3873 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class197.field3873[var8] = var2.method773((byte) -127);
            if (class197.field3873[var8] == 0) {
                class197.field3873[var8] = 1;
            }
        }
        var2.field2346 = 0;
        for (int var9 = 0; var9 < class141.field2627; var9++) {
            int var10 = class203.field3976[var9];
            int var11 = class2.field43[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class193.field3814[var9] = var13;
            int var14 = var2.method819((byte) 22);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method824((byte) 100);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var10 * var16 + var15] = var2.method824((byte) 79);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V")
    public final void method155(int arg0) {
        field463++;
        if (arg0 != 0) {
            this.method155(105);
        }
        while (true) {
            class182 var2 = this.field474.field3553;
            if (this.field474 == var2) {
                return;
            }
            var2.method1213(9104);
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
    public static void method156(byte arg0) {
        field481 = null;
        field466 = null;
        field470 = null;
        field471 = null;
        field462 = null;
        if (arg0 < 25) {
            field481 = null;
        }
        field482 = null;
        field472 = null;
        field480 = null;
        field461 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method157(byte arg0, byte[] arg1) {
        field477++;
        int var2 = arg1.length;
        if (arg0 == -31) {
            byte[] var3 = new byte[var2];
            class97.method580(arg1, 0, var3, 0, var2);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class22() {
        this.field474.field3553 = this.field474;
        this.field474.field3552 = this.field474;
    }
}
