import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class423 extends class330 {

    @OriginalMember(owner = "client!kfa", name = "F", descriptor = "Lul;")
    public static class486 field5877 = new class486("", 16);

    @OriginalMember(owner = "client!kfa", name = "C", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!kfa", name = "D", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!kfa", name = "G", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!kfa", name = "E", descriptor = "Lae;")
    public static class283 field5876;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "()V", line = 3)
    public static final void method2544() {
        class539.field7444 = class539.field7451;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 9)
    public static final void method2545(String arg0, int arg1) {
        class727.method4042("", "", (byte) -55, "", 0, 0, arg0);
        field5874++;
        if (arg1 >= -61) {
            field5876 = null;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)V", line = 20)
    public static void method2546(int arg0) {
        field5877 = null;
        if (arg0 < 64) {
            field5878 = -66;
        }
        field5876 = null;
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "()V", line = 31)
    public class423() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZ)[I", line = 34)
    public final int[] method464(int arg0, boolean arg1) {
        field5875++;
        return arg1 ? null : class404.field5705;
    }
}
