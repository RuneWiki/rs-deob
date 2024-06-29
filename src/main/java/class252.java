import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class252 extends InputStream {

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!cca", name = "e", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "Ljava/lang/Object;")
    public static Object field3088;

    @OriginalMember(owner = "client!cca", name = "d", descriptor = "[[Llo;")
    public static class488[][] field3090;

    @OriginalMember(owner = "client!cca", name = "read", descriptor = "()I")
    public final int read() {
        class419.method2233(-28448, 30000L);
        field3089++;
        return -1;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)V")
    public static void method1476(int arg0) {
        field3090 = null;
        field3088 = null;
        if (arg0 != -12902) {
            field3088 = null;
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)[Lwea;")
    public static final class259[] method1477(boolean arg0) {
        if (!arg0) {
            method1477(false);
        }
        field3091++;
        return new class259[] { class419.field5270, class551.field7693, class161.field2130, class531.field7170, class484.field6425, class349.field4462, class1.field8, class162.field2133, class78.field1069, class119.field1525 };
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method1478(boolean arg0, byte[] arg1) {
        field3087++;
        if (arg1 == null) {
            return null;
        }
        if (!arg0) {
            method1478(false, null);
        }
        byte[] var2 = new byte[arg1.length];
        class293.method1645(arg1, 0, var2, 0, arg1.length);
        return var2;
    }
}
