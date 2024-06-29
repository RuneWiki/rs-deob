import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class246 {

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Lnf;")
    private class160 field3663;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "Lne;")
    private class52 field3675;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "Lpc;")
    private class22 field3670;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field3664 = 0;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3673 = " from your friend list first.";

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field3674 = 0;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field3676 = 0;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Luh;")
    public static class103 field3679 = null;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Lgk;")
    public static class159 field3668 = new class159();

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public static int field3680 = 20;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    public static int field3683 = 0;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "[I")
    public static int[] field3682 = new int[1000];

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "Lik;")
    public static class267 field3681 = new class267(4);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "Lfd;")
    public static class124 field3684;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "Lfl;")
    private class248 field3671;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "[Lre;")
    private class228[] field3662;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "[[[I")
    public static int[][][] field3685;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
    public static final void method1543(int arg0, int arg1) {
        class97.field1531 = new int[arg0];
        class237.field3581 = new int[arg0];
        field3678++;
        if (arg1 > -4) {
            method1548(-84);
        }
        class220.field3310 = new int[arg0];
        class77.field1238 = new int[arg0];
        class180.field2735 = new int[arg0];
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BCI)C")
    public static final char method1544(byte arg0, char arg1, int arg2) {
        field3667++;
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 == 'Ñ' && arg2 != 0) {
                return 'N';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 == 'ñ' && arg2 != 0) {
                return 'n';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 == 'Œ') {
            return 'O';
        }
        if (arg0 != 90) {
            method1548(-62);
        }
        if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)V")
    public static final void method1545(boolean arg0, int arg1) {
        field3677++;
        if (arg0) {
            field3682 = null;
        }
        class187 var2 = class120.method762((byte) -106, 7, arg1);
        var2.method1162(1);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lll;Lll;ZII)Lre;")
    private final class228 method1546(class211 arg0, class211 arg1, boolean arg2, int arg3, int arg4) {
        field3665++;
        if (this.field3671 == null) {
            throw new RuntimeException();
        }
        this.field3671.field3748 = arg3 * 8 + 5;
        if (this.field3671.field3723.length <= this.field3671.field3748) {
            throw new RuntimeException();
        } else if (this.field3662[arg3] == null) {
            if (arg4 < 97) {
                this.field3675 = null;
            }
            int var6 = this.field3671.method1576(-17672);
            int var7 = this.field3671.method1576(-17672);
            class228 var8 = new class228(arg3, arg1, arg0, this.field3675, this.field3663, var6, var7, arg2);
            this.field3662[arg3] = var8;
            return var8;
        } else {
            return this.field3662[arg3];
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILll;ILll;)Lre;")
    public final class228 method1547(int arg0, class211 arg1, int arg2, class211 arg3) {
        if (arg0 != -250) {
            this.field3671 = null;
        }
        field3661++;
        return this.method1546(arg1, arg3, true, arg2, 124);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public static void method1548(int arg0) {
        if (arg0 != 1112) {
            return;
        }
        field3684 = null;
        field3681 = null;
        field3679 = null;
        field3673 = null;
        field3668 = null;
        field3685 = null;
        field3682 = null;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lne;Lnf;)V")
    public class246(class52 arg0, class160 arg1) {
        this.field3663 = arg1;
        this.field3675 = arg0;
        if (!this.field3675.method357(20)) {
            this.field3670 = this.field3675.method350(255, true, (byte) 0, 114, 255);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
    public final void method1549(int arg0) {
        field3669++;
        if (this.field3662 == null) {
            return;
        }
        int var2 = 0;
        if (arg0 >= -4) {
            return;
        }
        while (this.field3662.length > var2) {
            if (this.field3662[var2] != null) {
                this.field3662[var2].method1454(-1);
            }
            var2++;
        }
        for (int var3 = 0; var3 < this.field3662.length; var3++) {
            if (this.field3662[var3] != null) {
                this.field3662[var3].method1460(-5957);
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)Z")
    public final boolean method1550(boolean arg0) {
        field3666++;
        if (this.field3671 != null) {
            return true;
        }
        if (this.field3670 == null) {
            if (this.field3675.method357(20)) {
                return false;
            }
            this.field3670 = this.field3675.method350(255, true, (byte) 0, 104, 255);
        }
        if (arg0) {
            this.field3675 = null;
        }
        if (this.field3670.field4091) {
            return false;
        } else {
            this.field3671 = new class248(this.field3670.method111((byte) 81));
            this.field3662 = new class228[(this.field3671.field3723.length - 5) / 8];
            return true;
        }
    }
}
