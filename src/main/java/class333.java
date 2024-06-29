import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class333 extends class260 {

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "I")
    public volatile int field4516 = -1;

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "Ljava/lang/String;")
    public volatile String field4517;

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "Lqp;")
    public static class466 field4515 = new class466("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIIIBI)V", line = 4)
    public static final void method1915(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field4518++;
        if (arg2 >= 1 && arg4 >= 1 && class527.field7799 - 2 >= arg2 && arg4 <= (class422.field6182 - 2)) {
            int var9 = arg0;
            if (arg0 < 3 && class360.method2159(arg4, false, arg2)) {
                var9 = arg0 + 1;
            }
            if (!class20.field269.method1712(class152.field2332, false) && !class6.method39(class124.field1854, var9, (byte) -107, arg4, arg2)) {
                return;
            }
            if (class89.field1305 == null) {
                return;
            }
            class98.field1484.method2073(arg4, class82.field1229[arg0], arg6, arg2, arg0, false, class269.field3721);
            if (arg1 >= 0) {
                boolean var10 = class20.field269.field7649;
                class20.field269.field7649 = true;
                class98.field1484.method2072(arg1, class269.field3721, arg4, class82.field1229[arg0], var9, arg3, arg2, arg0, (byte) 66, arg5, arg8);
                class20.field269.field7649 = var10;
            }
        }
        int var11 = -86 / ((-arg7 - 59) / 57);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(III)Z", line = 48)
    public static final boolean method1916(int arg0, int arg1, int arg2) {
        field4514++;
        if (arg0 <= 73) {
            field4515 = null;
        }
        return class50.method440(arg2, arg1, 1) & class98.method719((byte) -3, arg2, arg1);
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)V", line = 59)
    public static void method1917(int arg0) {
        field4515 = null;
        if (arg0 != -5143) {
            field4515 = null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 76)
    public class333(String arg0) {
        this.field4517 = arg0;
    }
}
