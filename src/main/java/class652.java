import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class652 {

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "I")
    public int field8999 = 2048;

    @OriginalMember(owner = "client!lha", name = "d", descriptor = "I")
    public int field9001 = 0;

    @OriginalMember(owner = "client!lha", name = "g", descriptor = "I")
    public int field9004 = 0;

    @OriginalMember(owner = "client!lha", name = "j", descriptor = "I")
    public int field9007 = 2048;

    @OriginalMember(owner = "client!lha", name = "c", descriptor = "I")
    public static int field9000;

    @OriginalMember(owner = "client!lha", name = "e", descriptor = "I")
    public static int field9002;

    @OriginalMember(owner = "client!lha", name = "f", descriptor = "I")
    public static int field9003;

    @OriginalMember(owner = "client!lha", name = "h", descriptor = "I")
    public static int field9005;

    @OriginalMember(owner = "client!lha", name = "i", descriptor = "I")
    public static int field9006;

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "Ljava/lang/String;")
    public static String field8998;

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(ILpt;Z)Z")
    public static final boolean method3683(int arg0, class557 arg1, boolean arg2) {
        field9000++;
        class720.field10112.method132(arg1.field7744[arg0], arg1.field7746[arg0], arg1.field7741[arg0], class650.field8982);
        int var3 = class650.field8982[2];
        if (var3 < 50) {
            return false;
        }
        arg1.field7739[arg0] = (short) (class650.field8982[0] * class454.field6397 / var3 + class304.field3623);
        arg1.field7735[arg0] = (short) (class650.field8982[1] * class71.field984 / var3 + class495.field6888);
        if (!arg2) {
            field8998 = null;
        }
        arg1.field7747[arg0] = (short) var3;
        return true;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(ZI)V")
    public static final void method3684(boolean arg0, int arg1) {
        field9002++;
        if (!arg0) {
            return;
        }
        class318 var2 = (class318) class444.field5950.method2121(86, (long) arg1);
        if (var2 != null) {
            var2.field3917.method2241((byte) -119);
            class713.method4036(var2.field3915, -1, var2.field3912);
            var2.method2219(13630);
        }
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(I)V")
    public static void method3685(int arg0) {
        if (arg0 != -5) {
            field8998 = null;
        }
        field8998 = null;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(ILes;I)V")
    private final void method3686(int arg0, class403 arg1, int arg2) {
        if (arg0 == 1) {
            this.field9001 = arg1.method2396((byte) 32);
        } else if (arg0 == 2) {
            this.field8999 = arg1.method2390((byte) 126);
        } else if (arg0 == 3) {
            this.field9007 = arg1.method2390((byte) 17);
        } else if (arg0 == 4) {
            this.field9004 = arg1.method2365(true);
        }
        int var4 = -11 / ((-arg2 - 31) / 32);
        field9003++;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lfia;")
    public static final class602 method3687(Throwable arg0, String arg1) {
        field9006++;
        class602 var2;
        if (arg0 instanceof class602) {
            var2 = (class602) arg0;
            var2.field8137 = var2.field8137 + ' ' + arg1;
        } else {
            var2 = new class602(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(Les;Z)V")
    public final void method3688(class403 arg0, boolean arg1) {
        field9005++;
        while (true) {
            int var3 = arg0.method2396((byte) -90);
            if (var3 == 0) {
                if (arg1) {
                    this.field8999 = -62;
                    return;
                } else {
                    return;
                }
            }
            this.method3686(var3, arg0, 52);
        }
    }
}
