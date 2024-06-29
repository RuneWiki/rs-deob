import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class407 {

    @OriginalMember(owner = "client!bu", name = "q", descriptor = "I")
    private int field6186 = 0;

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "I")
    public int field6176;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "[Ljp;")
    public class276[] field6170;

    @OriginalMember(owner = "client!bu", name = "j", descriptor = "Llo;")
    public static class306 field6179 = new class306("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!bu", name = "n", descriptor = "Lnk;")
    public static class326 field6183 = new class326(19, 8);

    @OriginalMember(owner = "client!bu", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field6187 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!bu", name = "t", descriptor = "I")
    public static int field6189 = 0;

    @OriginalMember(owner = "client!bu", name = "v", descriptor = "F")
    public static float field6191;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!bu", name = "l", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!bu", name = "p", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!bu", name = "s", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!bu", name = "m", descriptor = "J")
    private long field6182;

    @OriginalMember(owner = "client!bu", name = "o", descriptor = "Ljp;")
    private class276 field6184;

    @OriginalMember(owner = "client!bu", name = "u", descriptor = "Ljp;")
    private class276 field6190;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(JI)Ljp;")
    public final class276 method2516(long arg0, int arg1) {
        this.field6182 = arg0;
        field6171++;
        class276 var4 = this.field6170[(int) (arg0 & (long) (this.field6176 + arg1))];
        for (this.field6184 = var4.field4535; this.field6184 != var4; this.field6184 = this.field6184.field4535) {
            if (this.field6184.field4542 == arg0) {
                class276 var5 = this.field6184;
                this.field6184 = this.field6184.field4535;
                return var5;
            }
        }
        this.field6184 = null;
        return null;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Ljp;JB)V")
    public final void method2517(class276 arg0, long arg1, byte arg2) {
        field6177++;
        if (arg0.field4530 != null) {
            arg0.method1821((byte) -95);
        }
        int var5 = -82 % ((-arg2 - 54) / 53);
        class276 var6 = this.field6170[(int) ((long) (this.field6176 - 1) & arg1)];
        arg0.field4535 = var6;
        arg0.field4530 = var6.field4530;
        arg0.field4530.field4535 = arg0;
        arg0.field4542 = arg1;
        arg0.field4535.field4530 = arg0;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)Ljp;")
    public final class276 method2518(int arg0) {
        field6175++;
        this.field6186 = 0;
        int var2 = 60 % ((-arg0 - 53) / 58);
        return this.method2524(0);
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)I")
    public final int method2519(int arg0) {
        field6173++;
        if (arg0 > -70) {
            this.method2517(null, -69L, (byte) -116);
        }
        return this.field6176;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILih;Z[IIZ)Lgq;")
    public static final class536 method2520(int arg0, class214 arg1, boolean arg2, int[] arg3, int arg4, boolean arg5) {
        field6180++;
        if (arg2) {
            return null;
        } else if (!arg1.field3739 && (!class137.method1029(arg0, false) || !class137.method1029(arg4, false))) {
            return arg1.field3666 ? new class536(arg1, 34037, arg0, arg4, arg5, arg3) : new class536(arg1, arg0, arg4, class206.method1351(arg0, 101), class206.method1351(arg4, 103), arg3);
        } else {
            return new class536(arg1, 3553, arg0, arg4, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)I")
    public final int method2521(byte arg0) {
        field6174++;
        int var2 = -17 % ((arg0 - 75) / 42);
        int var3 = 0;
        for (int var4 = 0; var4 < this.field6176; var4++) {
            class276 var5 = this.field6170[var4];
            class276 var6 = var5.field4535;
            while (var5 != var6) {
                var6 = var6.field4535;
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Z)V")
    public static void method2522(boolean arg0) {
        field6187 = null;
        field6183 = null;
        if (arg0) {
            field6189 = -51;
        }
        field6179 = null;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I[Ljp;)I")
    public final int method2523(int arg0, class276[] arg1) {
        field6172++;
        if (arg0 <= 86) {
            return 86;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field6176; var4++) {
            class276 var5 = this.field6170[var4];
            for (class276 var6 = var5.field4535; var6 != var5; var6 = var6.field4535) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(I)Ljp;")
    public final class276 method2524(int arg0) {
        field6181++;
        if (arg0 < this.field6186 && this.field6170[this.field6186 - 1] != this.field6190) {
            class276 var2 = this.field6190;
            this.field6190 = var2.field4535;
            return var2;
        }
        while (this.field6186 < this.field6176) {
            class276 var3 = this.field6170[this.field6186++].field4535;
            if (this.field6170[this.field6186 - 1] != var3) {
                this.field6190 = var3.field4535;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "(I)V")
    public final void method2525(int arg0) {
        for (int var2 = arg0; var2 < this.field6176; var2++) {
            class276 var3 = this.field6170[var2];
            while (true) {
                class276 var4 = var3.field4535;
                if (var3 == var4) {
                    break;
                }
                var4.method1821((byte) 17);
            }
        }
        field6185++;
        this.field6184 = null;
        this.field6190 = null;
    }

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "(I)Ljp;")
    public final class276 method2526(int arg0) {
        field6178++;
        if (this.field6184 == null) {
            return null;
        } else if (arg0 > -102) {
            return null;
        } else {
            class276 var2 = this.field6170[(int) (this.field6182 & (long) (this.field6176 - 1))];
            while (this.field6184 != var2) {
                if (this.field6184.field4542 == this.field6182) {
                    class276 var3 = this.field6184;
                    this.field6184 = this.field6184.field4535;
                    return var3;
                }
                this.field6184 = this.field6184.field4535;
            }
            this.field6184 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(I)V")
    public class407(int arg0) {
        this.field6176 = arg0;
        this.field6170 = new class276[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class276 var3 = this.field6170[var2] = new class276();
            var3.field4530 = var3;
            var3.field4535 = var3;
        }
    }
}
