import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class class65 {

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field784 = 0;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "Z")
    public static boolean field783 = false;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "[Z")
    public static boolean[] field786 = new boolean[100];

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIC)C")
    public static final char method371(int arg0, int arg1, char arg2) {
        field785++;
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
        int var3 = -11 / ((9 - arg0) / 54);
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

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method372(byte arg0, Component arg1);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)Lqo;")
    public static final class364 method373(int arg0, int arg1, int arg2) {
        class316 var3 = class347.field4722[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4259;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static void method374(int arg0) {
        field786 = null;
        if (arg0 != -26238) {
            method376(-113, -77, -113, (byte) -2);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public abstract void method375(boolean arg0, Component arg1);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIB)I")
    public static final int method376(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = -29 % ((20 - arg3) / 59);
        field782++;
        if (arg2 >= arg0) {
            return arg2 <= arg1 ? arg2 : arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)I")
    public abstract int method377(byte arg0);
}
