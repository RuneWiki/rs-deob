import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class509 {

    @OriginalMember(owner = "client!it", name = "e", descriptor = "Lgf;")
    public class46 field7567;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "B")
    public byte field7569;

    @OriginalMember(owner = "client!it", name = "i", descriptor = "S")
    public short field7571;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "B")
    public byte field7566;

    @OriginalMember(owner = "client!it", name = "j", descriptor = "Ljava/lang/String;")
    public static String field7572 = null;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "Lvr;")
    public static class306 field7563 = new class306();

    @OriginalMember(owner = "client!it", name = "b", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "I")
    public static int field7568;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "I")
    public static int field7570;

    static {
        new class375("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIIII)I", line = 7)
    public static final int method3033(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != -10) {
            method3034(true);
        }
        field7570++;
        int var7 = arg5 & 0x3;
        if ((arg2 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg0;
            arg0 = var8;
        }
        if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return 1 + 7 - arg4 - arg1;
        } else if (var7 == 2) {
            return 1 - (arg0 - (7 - arg3));
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)[Lud;", line = 40)
    public static final class63[] method3034(boolean arg0) {
        if (arg0) {
            field7563 = null;
        }
        field7565++;
        return new class63[] { class140.field2031, class26.field424, class372.field5712, class217.field3010, class367.field5658, class493.field7194 };
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "([Lf;I)V", line = 52)
    public static final void method3035(class191[] arg0, int arg1) {
        class158.field2288 = arg0.length;
        field7568++;
        class55.field748 = new class191[class158.field2288 + 10];
        class459.field6743 = new int[class158.field2288 + 10];
        class361.method2280(arg0, 0, class55.field748, 0, class158.field2288);
        if (arg1 != -12168) {
            method3033(-23, 29, -106, 18, -76, -44, -93);
        }
        for (int var2 = 0; var2 < class158.field2288; var2++) {
            class459.field6743[var2] = class55.field748[var2].method219();
        }
        for (int var3 = class158.field2288; var3 < class55.field748.length; var3++) {
            class459.field6743[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V", line = 85)
    public static void method3036(int arg0) {
        if (arg0 != 10040) {
            method3034(true);
        }
        field7572 = null;
        field7563 = null;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IZ)I", line = 97)
    public static final int method3037(int arg0, boolean arg1) {
        field7564++;
        if (arg1) {
            return arg0 == 16711935 ? -1 : class73.method487(-128, arg0);
        } else {
            return -79;
        }
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lgf;III)V", line = 112)
    public class509(class46 arg0, int arg1, int arg2, int arg3) {
        this.field7567 = arg0;
        this.field7569 = (byte) arg3;
        this.field7571 = (short) arg1;
        this.field7566 = (byte) arg2;
    }
}
