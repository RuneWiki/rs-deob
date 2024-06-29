import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public abstract class class551 {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Lgl;")
    public static class547 field7860 = new class547(4, 14);

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "[[S")
    public static short[][] field7865 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field7861;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field7862;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public int field7863;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Ljava/lang/String;")
    public String field7864;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)Ljava/net/Socket;", line = 11)
    public final Socket method3108(byte arg0) throws IOException {
        if (arg0 >= -14) {
            return null;
        } else {
            field7862++;
            return new Socket(this.field7864, this.field7863);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V", line = 23)
    public static void method3109(int arg0) {
        field7860 = null;
        field7865 = null;
        if (arg0 >= -95) {
            field7860 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)Ljava/net/Socket;")
    public abstract Socket method1022(byte arg0) throws IOException;
}
