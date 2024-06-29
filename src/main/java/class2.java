import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class2 extends class207 {

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public int field24;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    public static int field25 = 0;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "Lbj;")
    public static class151 field20;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "La;")
    public static class47 field18;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILjd;)Z")
    public static final boolean method9(int arg0, class86 arg1) {
        int var2 = 36 / ((50 - arg0) / 62);
        field19++;
        if (arg1 == null) {
            return false;
        }
        for (int var3 = 0; var3 < class56.field1146; var3++) {
            if (arg1.method631(12508, class185.field3283[var3])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljd;B)Log;")
    public static final class210 method10(class86 arg0, byte arg1) {
        field23++;
        for (class210 var2 = (class210) class3.field33.method1737((byte) 74); var2 != null; var2 = (class210) class3.field33.method1740(arg1 - 8929)) {
            if (var2.field3795.method625((byte) 79, arg0)) {
                return var2;
            }
        }
        if (arg1 != 86) {
            method11((byte) -16);
        }
        return null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static void method11(byte arg0) {
        field20 = null;
        if (arg0 <= -103) {
            field18 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
    public class2() {
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(I)V")
    public class2(int arg0) {
        this.field24 = arg0;
    }
}
