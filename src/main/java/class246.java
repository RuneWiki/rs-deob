import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class246 {

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "Ldc;")
    private class5 field3535 = new class5(64);

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Lhe;")
    private class239 field3531;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Lwt;")
    public static class194 field3529 = new class194("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "[I")
    public static int[] field3536 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "[Z")
    public static boolean[] field3538 = new boolean[100];

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1534(int arg0) {
        if (class485.field7020 != null) {
            class485.field7020.method835(1);
            class194.field2741 = null;
            class485.field7020 = null;
        }
        if (arg0 == 117) {
            field3528++;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BIC)C", line = 22)
    public static final char method1535(byte arg0, int arg1, char arg2) {
        if (arg0 != 121) {
            method1535((byte) -48, -93, (char) 65477);
        }
        field3530++;
        if (arg2 >= 'À' && arg2 <= 'ÿ') {
            if (arg2 >= 'À' && arg2 <= 'Æ') {
                return 'A';
            }
            if (arg2 == 'Ç') {
                return 'C';
            }
            if (arg2 >= 'È' && arg2 <= 'Ë') {
                return 'E';
            }
            if (arg2 >= 'Ì' && arg2 <= 'Ï') {
                return 'I';
            }
            if (arg2 == 'Ñ' && arg1 != 0) {
                return 'N';
            }
            if (arg2 >= 'Ò' && arg2 <= 'Ö') {
                return 'O';
            }
            if (arg2 >= 'Ù' && arg2 <= 'Ü') {
                return 'U';
            }
            if (arg2 == 'Ý') {
                return 'Y';
            }
            if (arg2 == 'ß') {
                return 's';
            }
            if (arg2 >= 'à' && arg2 <= 'æ') {
                return 'a';
            }
            if (arg2 == 'ç') {
                return 'c';
            }
            if (arg2 >= 'è' && arg2 <= 'ë') {
                return 'e';
            }
            if (arg2 >= 'ì' && arg2 <= 'ï') {
                return 'i';
            }
            if (arg2 == 'ñ' && arg1 != 0) {
                return 'n';
            }
            if (arg2 >= 'ò' && arg2 <= 'ö') {
                return 'o';
            }
            if (arg2 >= 'ù' && arg2 <= 'ü') {
                return 'u';
            }
            if (arg2 == 'ý' || arg2 == 'ÿ') {
                return 'y';
            }
        }
        if (arg2 == 'Œ') {
            return 'O';
        } else if (arg2 == 'œ') {
            return 'o';
        } else if (arg2 == 'Ÿ') {
            return 'Y';
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BI)Lnk;", line = 109)
    public final class483 method1536(byte arg0, int arg1) {
        field3533++;
        class5 var3 = this.field3535;
        class483 var4;
        synchronized (this.field3535) {
            var4 = (class483) this.field3535.method40(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 >= -118) {
            this.field3535 = null;
        }
        byte[] var5 = this.field3531.method1470(4, arg1, 11);
        class483 var6 = new class483();
        if (var5 != null) {
            var6.method2811(new class156(var5), 23982);
        }
        class5 var7 = this.field3535;
        synchronized (this.field3535) {
            this.field3535.method36(-20960, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V", line = 144)
    public final void method1537(int arg0) {
        class5 var2 = this.field3535;
        synchronized (this.field3535) {
            if (arg0 != 26381) {
                return;
            }
            this.field3535.method38((byte) -30);
        }
        field3539++;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V", line = 162)
    public static void method1538(int arg0) {
        if (arg0 != 18774) {
            field3529 = null;
        }
        field3536 = null;
        field3529 = null;
        field3538 = null;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lci;ILhe;)V", line = 197)
    public class246(class298 arg0, int arg1, class239 arg2) {
        this.field3531 = arg2;
        if (this.field3531 != null) {
            this.field3531.method1473(4309, 11);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V", line = 184)
    public final void method1539(byte arg0) {
        class5 var2 = this.field3535;
        synchronized (this.field3535) {
            if (arg0 >= -101) {
                return;
            }
            this.field3535.method35((byte) -1);
        }
        field3532++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)V", line = 221)
    public final void method1540(int arg0, int arg1) {
        field3534++;
        class5 var3 = this.field3535;
        synchronized (this.field3535) {
            this.field3535.method39(false, arg0);
        }
        int var4 = -107 / ((arg1 - 2) / 48);
    }
}
