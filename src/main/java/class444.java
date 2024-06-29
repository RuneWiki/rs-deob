import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class444 {

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "Lqfa;")
    public static class372 field5608 = new class372("", 16);

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(B)I")
    public static final int method2374(byte arg0) {
        field5610++;
        if (arg0 >= -108) {
            method2377(-48);
        }
        return class34.method222(false, (byte) -15);
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(BC)Z")
    public static final boolean method2375(byte arg0, char arg1) {
        field5609++;
        if (arg0 != 17) {
            method2374((byte) 62);
        }
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class653.method3663(-127, arg1)) {
            return true;
        } else {
            char[] var2 = class287.field3580;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class565.field7886;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(II)I")
    public static int method2376(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V")
    public static void method2377(int arg0) {
        field5608 = null;
        if (arg0 >= -71) {
            method2377(-19);
        }
    }
}
