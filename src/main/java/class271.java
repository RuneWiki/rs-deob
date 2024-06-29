import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class271 {

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Lus;")
    public static class328 field3430 = new class328(3, 7);

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "Lan;")
    public static class182 field3432 = new class182(5, 16);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)[B", line = 4)
    public static final synchronized byte[] method1624(byte arg0, int arg1) {
        field3431++;
        if (arg0 < 107) {
            return null;
        } else if (arg1 == 100 && class530.field7473 > 0) {
            byte[] var2 = class290.field3774[--class530.field7473];
            class290.field3774[class530.field7473] = null;
            return var2;
        } else if (arg1 == 5000 && class40.field581 > 0) {
            byte[] var3 = class267.field3377[--class40.field581];
            class267.field3377[class40.field581] = null;
            return var3;
        } else if (arg1 == 30000 && class502.field7068 > 0) {
            byte[] var4 = class557.field7806[--class502.field7068];
            class557.field7806[class502.field7068] = null;
            return var4;
        } else {
            if (class465.field6720 != null) {
                for (int var5 = 0; var5 < class421.field5991.length; var5++) {
                    if (class421.field5991[var5] == arg1 && class101.field1244[var5] > 0) {
                        byte[] var6 = class465.field6720[var5][--class101.field1244[var5]];
                        class465.field6720[var5][class101.field1244[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 63)
    public static void method1625(int arg0) {
        field3432 = null;
        if (arg0 != -5001) {
            field3430 = null;
        }
        field3430 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Z", line = 74)
    public static final boolean method1626(int arg0, int arg1, int arg2) {
        if (arg0 == -1) {
            field3428++;
            return (arg1 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[B)V", line = 89)
    public static final synchronized void method1627(int arg0, byte[] arg1) {
        field3429++;
        if (arg1.length == 100 && class530.field7473 < 1000) {
            class290.field3774[class530.field7473++] = arg1;
        } else if (arg1.length == 5000 && class40.field581 < 250) {
            class267.field3377[class40.field581++] = arg1;
        } else if (~arg1.length == arg0 && class502.field7068 < 50) {
            class557.field7806[class502.field7068++] = arg1;
        } else if (class465.field6720 != null) {
            for (int var2 = 0; var2 < class421.field5991.length; var2++) {
                if (class421.field5991[var2] == arg1.length && class101.field1244[var2] < class465.field6720[var2].length) {
                    class465.field6720[var2][class101.field1244[var2]++] = arg1;
                    return;
                }
            }
        }
    }
}
