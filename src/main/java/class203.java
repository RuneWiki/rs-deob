import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class203 {

    @OriginalMember(owner = "client!op", name = "a", descriptor = "[I")
    public static int[] field3066 = new int[50];

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "J")
    public static long field3067;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1453(int arg0) {
        field3069++;
        class239[] var1 = class485.field6557;
        synchronized (class485.field6557) {
            for (int var2 = 0; var2 < class485.field6557.length; var2++) {
                class485.field6557[var2] = new class239();
                class215.field3193[var2] = 0;
            }
            if (arg0 != 26093) {
                field3067 = 51L;
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V", line = 25)
    public static void method1454(int arg0) {
        if (arg0 <= -114) {
            field3066 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IILjava/net/Socket;)Liv;", line = 47)
    public static final class107 method1455(int arg0, int arg1, Socket arg2) throws IOException {
        field3068++;
        if (arg0 >= -100) {
            field3067 = -28L;
        }
        return new class596(arg2, arg1);
    }
}
