import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class18 {

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "J")
    public long field546 = 0L;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field543 = 0;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public static int field551 = 0;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "Lud;")
    public static class279 field553 = class130.method1024("(R", 255);

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "Lud;")
    public static class279 field548 = class130.method1024("Versteckt", 255);

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field549 = 0;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "Lud;")
    public static class279 field565 = class130.method1024("ul", 255);

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public int field544;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public int field550;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public int field555;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public int field556;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    public int field557;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public int field558;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    public int field559;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    public int field560;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public int field561;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
    public int field562;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
    public int field564;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "Lsf;")
    public class108 field563;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "[[Lgf;")
    public static class8[][] field545;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZI)V", line = 44)
    public static final void method155(boolean arg0, int arg1) {
        field542++;
        if (arg1 == -1 || !class142.field2573[arg1]) {
            return;
        }
        class112.field2056.method1177(99348609, arg1);
        if (field545[arg1] == null) {
            return;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < field545[arg1].length; var3++) {
            if (field545[arg1][var3] != null) {
                if (field545[arg1][var3].field201 == 2) {
                    var2 = false;
                } else {
                    field545[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            field545[arg1] = null;
        }
        class142.field2573[arg1] = false;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V", line = 90)
    public static void method156(boolean arg0) {
        field553 = null;
        field565 = null;
        if (!arg0) {
            field548 = null;
            field545 = (class8[][]) null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIII)V", line = 123)
    public static final void method157(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field547++;
        int var5 = 123 % ((arg0 - 87) / 35);
        if (arg4 >= arg1) {
            class152.method1208(arg1, arg2, arg4, class182.field3348[arg3], -7);
        } else {
            class152.method1208(arg4, arg2, arg1, class182.field3348[arg3], -7);
        }
    }
}
