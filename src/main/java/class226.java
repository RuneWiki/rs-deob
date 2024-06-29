import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class226 extends class694 {

    @OriginalMember(owner = "client!nfa", name = "h", descriptor = "Ljava/net/Socket;")
    private Socket field3374;

    @OriginalMember(owner = "client!nfa", name = "k", descriptor = "Lpda;")
    private class489 field3377;

    @OriginalMember(owner = "client!nfa", name = "i", descriptor = "Lwca;")
    private class727 field3375;

    @OriginalMember(owner = "client!nfa", name = "e", descriptor = "Z")
    public static boolean field3371 = false;

    @OriginalMember(owner = "client!nfa", name = "d", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!nfa", name = "g", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!nfa", name = "j", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!nfa", name = "l", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!nfa", name = "m", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!nfa", name = "n", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!nfa", name = "f", descriptor = "Lib;")
    public static class1 field3372;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z)V", line = 3)
    public final void method1576(boolean arg0) {
        this.field3377.method2978((byte) 66);
        field3373++;
        this.field3375.method4063(arg0);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z[BII)I", line = 12)
    public final int method1577(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0) {
            this.method1576(true);
        }
        field3370++;
        return this.field3377.method2979(arg2, arg3, arg1, true);
    }

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(I)V", line = 35)
    public static void method1578(int arg0) {
        if (arg0 == -22598) {
            field3372 = null;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(II)Z", line = 45)
    public final boolean method1579(int arg0, int arg1) throws IOException {
        if (arg1 == 25562) {
            field3379++;
            return this.field3377.method2980(false, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "finalize", descriptor = "()V", line = 56)
    protected final void finalize() {
        this.method1581(false);
        field3378++;
    }

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Ljava/net/Socket;I)V", line = 65)
    public class226(Socket arg0, int arg1) throws IOException {
        this.field3374 = arg0;
        this.field3374.setSoTimeout(30000);
        this.field3374.setTcpNoDelay(true);
        this.field3377 = new class489(this.field3374.getInputStream(), arg1);
        this.field3375 = new class727(this.field3374.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "([BIII)V", line = 77)
    public final void method1580(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3376++;
        this.field3375.method4060(arg1, arg0, arg3, true);
        int var5 = 12 / ((67 - arg2) / 48);
    }

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(Z)V", line = 89)
    public final void method1581(boolean arg0) {
        field3380++;
        try {
            this.field3374.close();
            if (arg0) {
                this.finalize();
            }
        } catch (IOException var2) {
        }
        this.field3377.method2977((byte) -26);
        this.field3375.method4062((byte) 127);
    }
}
