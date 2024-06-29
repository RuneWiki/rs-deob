import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class410 implements class233 {

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public int field5906;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field5905 = new String[100];

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public static void method2533(int arg0) {
        if (arg0 != 16711935) {
            method2533(-75);
        }
        field5905 = null;
    }

    @OriginalMember(owner = "client!ml", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5908++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)I")
    public static final int method2534(byte arg0, int arg1) {
        field5907++;
        if (arg0 != -3) {
            field5905 = null;
        }
        return arg1 == 16711935 ? -1 : class546.method3107(arg1, 20973);
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class410(String arg0, int arg1) {
        this.field5906 = arg1;
    }
}
