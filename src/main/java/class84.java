import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class84 extends class550 {

    @OriginalMember(owner = "client!qu", name = "o", descriptor = "I")
    public int field1039;

    @OriginalMember(owner = "client!qu", name = "n", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "client!qu", name = "l", descriptor = "I")
    public static int field1036 = 0;

    @OriginalMember(owner = "client!qu", name = "k", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!qu", name = "m", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lrn;Lhv;IIIIIIII)V")
    public class84(class380 arg0, class97 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
        this.field1039 = arg8;
        this.field1038 = arg9;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)Ljv;")
    public final class606 method472(byte arg0) {
        if (arg0 != -110) {
            field1036 = 100;
        }
        field1035++;
        return class56.field787;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(III)V")
    public static final void method473(int arg0, int arg1, int arg2) {
        class651 var3 = class145.field1841[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field9220 != null) {
            var3.field9220 = null;
        }
        if (var3.field9224 != null) {
            var3.field9224 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ICI)C")
    public static final char method474(int arg0, char arg1, int arg2) {
        field1037++;
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
        } else if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            int var3 = 15 % ((arg0 + 42) / 62);
            return arg1;
        }
    }
}
