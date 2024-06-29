import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class499 extends InputStream {

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field7169 = 0;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field7170 = 328;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "J")
    public static long field7171 = 0L;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field7175 = 0;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field7172 = 0;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field7177;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field7178;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field7179;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Lla;")
    public static class423 field7173;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "[[Ljw;")
    public static class280[][] field7174;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)Z")
    public static final boolean method3032(int arg0, int arg1, int arg2) {
        if (arg0 != 52) {
            field7179 = 26;
        }
        field7178++;
        return (arg1 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static void method3033(byte arg0) {
        field7173 = null;
        int var1 = -48 % ((53 - arg0) / 61);
        field7174 = null;
    }

    @OriginalMember(owner = "client!nd", name = "read", descriptor = "()I")
    public final int read() {
        class363.method2283(30000L, -24244);
        field7177++;
        return -1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static final void method3034(int arg0) {
        field7176++;
        if (arg0 != -3561) {
            field7179 = -127;
        }
        class503 var1 = class512.method3112(15, 0, 0);
        var1.method3074(-110);
    }
}
