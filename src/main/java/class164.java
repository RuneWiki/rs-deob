import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class164 {

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    private int field2477 = 0;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Lin;")
    private class169 field2476 = null;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    private int field2485 = 0;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    private int field2481 = 0;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "Ltt;")
    private class249 field2472;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "Lmm;")
    private class19 field2487;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "[Lhh;")
    private class509[] field2475;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "Lbf;")
    public class184 field2479;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "Z")
    public static boolean field2480 = false;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "Z")
    public static boolean field2482 = false;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public static int field2484 = -1;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field2486;

    static {
        new class179("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        new class179("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)Z", line = 4)
    public static final boolean method1172(int arg0, byte arg1) {
        if (arg1 >= -21) {
            method1175(null, null, false, -98, false);
        }
        field2483++;
        return arg0 == 6 || arg0 == 8;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)Z", line = 15)
    public final boolean method1173(int arg0, int arg1) {
        int var3 = -98 / ((-arg0 - 41) / 57);
        field2473++;
        return this.field2475[arg1].method124(-32170);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZZIIII)V", line = 36)
    public final void method1174(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = arg0 & this.field2472.method553();
        field2486++;
        if (arg4 >= -35) {
            field2484 = -54;
        }
        if (!var7 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
            if (arg2 == 4) {
                arg3 = arg5;
            }
            arg2 = 2;
        }
        if (arg2 != 0 && arg1) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (this.field2481 != arg2) {
            if (this.field2481 != 0) {
                this.field2475[this.field2481 & Integer.MAX_VALUE].method121((byte) 38);
            }
            if (arg2 != 0) {
                this.field2475[arg2 & Integer.MAX_VALUE].method122(arg1, 64);
                this.field2475[Integer.MAX_VALUE & arg2].method128((byte) 80, arg1);
                this.field2475[Integer.MAX_VALUE & arg2].method123(arg3, arg5, false);
            }
            this.field2477 = arg3;
            this.field2485 = arg5;
            this.field2481 = arg2;
            this.field2476 = null;
        } else if (this.field2481 != 0) {
            this.field2475[this.field2481 & Integer.MAX_VALUE].method128((byte) 104, arg1);
            if (this.field2485 != arg5 || this.field2477 != arg3) {
                this.field2475[Integer.MAX_VALUE & this.field2481].method123(arg3, arg5, false);
                this.field2485 = arg5;
                this.field2477 = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/lang/String;Lgt;ZIZ)V", line = 92)
    public static final void method1175(String arg0, class66 arg1, boolean arg2, int arg3, boolean arg4) {
        int var5 = 122 % ((-arg3 - 4) / 36);
        field2478++;
        if (!arg2) {
            class232.method1564(3, 0, arg0, arg1);
            return;
        }
        if (class66.field1054.startsWith("win") && class66.field1042 != 3) {
            String var6 = null;
            if (arg1.field1062 != null) {
                var6 = arg1.field1062.getParameter("haveie6");
            }
            if (var6 == null || !var6.equals("1")) {
                class329 var7 = class232.method1564(0, 0, arg0, arg1);
                class178.field2740 = var7;
                class485.field7101 = arg1;
                class274.field4303 = arg0;
                return;
            }
        }
        if (class66.field1054.startsWith("mac")) {
            String var8 = null;
            if (arg1.field1062 != null) {
                var8 = arg1.field1062.getParameter("havefirefox");
            }
            if (var8 != null && var8.equals("1") && arg4) {
                class232.method1564(1, 0, arg0, arg1);
                return;
            }
        }
        class232.method1564(2, 0, arg0, arg1);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZILin;)Z", line = 158)
    public final boolean method1176(boolean arg0, int arg1, class169 arg2) {
        field2474++;
        if (this.field2481 == 0) {
            return false;
        } else if (arg0) {
            return false;
        } else {
            if (this.field2476 != arg2) {
                this.field2475[this.field2481 & Integer.MAX_VALUE].method125((byte) 74, arg1, arg2);
                this.field2476 = arg2;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Ltt;)V", line = 211)
    public class164(class249 arg0) {
        this.field2472 = arg0;
        this.field2487 = new class19(arg0);
        this.field2475 = new class509[10];
        this.field2475[1] = new class175(arg0);
        this.field2475[2] = new class162(arg0, this.field2487);
        this.field2475[4] = new class124(arg0, this.field2487);
        this.field2475[5] = new class68(arg0, this.field2487);
        this.field2475[6] = new class213(arg0);
        this.field2475[7] = new class132(arg0);
        this.field2475[3] = this.field2479 = new class184(arg0);
        this.field2475[8] = new class238(arg0, this.field2487);
        this.field2475[9] = new class20(arg0, this.field2487);
        if (!this.field2475[8].method124(-32170)) {
            this.field2475[8] = this.field2475[4];
        }
        if (!this.field2475[9].method124(-32170)) {
            this.field2475[9] = this.field2475[8];
        }
    }
}
