import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class158 extends InputStream {

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Z")
    public static boolean field2033 = false;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)Lida;", line = 3)
    public static final class650 method983(int arg0) {
        field2030++;
        int var1 = -8 % ((arg0 + 26) / 45);
        class650 var2 = class561.method3171((byte) 125);
        var2.field8929 = 0;
        var2.field8932 = null;
        var2.field8928 = new class757(5000);
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "read", descriptor = "()I", line = 20)
    public final int read() {
        field2032++;
        class517.method2965(30000L, -113);
        return -1;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V", line = 30)
    public static final void method984(int arg0) {
        if (class506.field7142 == 1 || class506.field7142 == 3 || class506.field7142 != class237.field3071 && (class506.field7142 == 0 || class237.field3071 == 0)) {
            class443.field6200 = 0;
            class676.field9195 = 0;
            class563.field7875.method3251(false);
        }
        field2031++;
        if (arg0 <= 95) {
            field2033 = false;
        }
        class237.field3071 = class506.field7142;
    }
}
