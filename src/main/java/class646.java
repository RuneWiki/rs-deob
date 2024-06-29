import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public abstract class class646 {

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "Z")
    public static boolean field9151 = false;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field9152 = 0;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field9155 = 1;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "Lqe;")
    public static class465 field9157 = new class465(80, -1);

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public int field9153;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field9154;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "Ljava/lang/String;")
    public String field9156;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)Ljava/net/Socket;")
    public final Socket method3671(byte arg0) throws IOException {
        field9154++;
        return arg0 == -93 ? new Socket(this.field9156, this.field9153) : null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public static void method3672(int arg0) {
        if (arg0 != 1) {
            method3672(-97);
        }
        field9157 = null;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)Ljava/net/Socket;")
    public abstract Socket method2274(byte arg0) throws IOException;
}
