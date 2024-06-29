import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class406 extends class179 {

    @OriginalMember(owner = "client!th", name = "l", descriptor = "S")
    public short field5896;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field5898 = 0;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "Lbn;")
    public static class295 field5899;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "Llt;")
    public static class458 field5894;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V")
    public static void method2404(int arg0) {
        field5894 = null;
        field5899 = null;
        if (arg0 < 109) {
            method2405(null, 124);
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class406() {
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method2405(String arg0, int arg1) {
        field5895++;
        if (arg1 != -10357) {
            field5894 = null;
        }
        for (int var2 = 0; var2 < class213.field3306.length; var2++) {
            if (class213.field3306[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(S)V")
    public class406(short arg0) {
        this.field5896 = arg0;
    }
}
