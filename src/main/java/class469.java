import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class469 extends class439 {

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public int field6895 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public int field6900 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public int field6897 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public int field6898 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    public int field6903 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
    public int field6905 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "I")
    public int field6906 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
    public int field6904 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Lda;")
    public class42 field6894;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "[Ljava/lang/String;")
    public static String[] field6908;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "Lao;")
    public static class188 field6907;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    public static int field6899;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field6902;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "J")
    public static long field6901;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "Lds;")
    public static class12 field6896;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "[S")
    public static short[] field6909;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)Z")
    public final boolean method2801(int arg0, int arg1, int arg2) {
        field6902++;
        if (arg1 >= this.field6903 && this.field6906 >= arg1 && this.field6898 <= arg0 && arg0 <= this.field6900) {
            return true;
        } else if (this.field6904 <= arg1 && this.field6905 >= arg1 && this.field6897 <= arg0 && this.field6895 >= arg0) {
            return true;
        } else {
            if (arg2 >= -108) {
                method2802(-61);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
    public static void method2802(int arg0) {
        field6896 = null;
        field6907 = null;
        if (arg0 != Integer.MIN_VALUE) {
            field6909 = null;
        }
        field6908 = null;
        field6909 = null;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lda;)V")
    public class469(class42 arg0) {
        this.field6894 = arg0;
    }

    static {
        new class180("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field6908 = new String[200];
        field6907 = new class188(75, -2);
    }
}
