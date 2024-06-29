import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class455 extends class190 {

    @OriginalMember(owner = "client!am", name = "m", descriptor = "Ljava/net/Socket;")
    private Socket field6616;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "Llc;")
    private class466 field6615;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "Lhd;")
    private class532 field6622;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "Lit;")
    public static class465 field6612 = new class465(8);

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public static int field6618 = -50;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!am", name = "finalize", descriptor = "()V", line = 8)
    protected final void finalize() {
        this.method1291(true);
        field6619++;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V", line = 17)
    public final void method1291(boolean arg0) {
        field6613++;
        try {
            if (!arg0) {
                field6620 = 27;
            }
            this.field6616.close();
        } catch (IOException var2) {
        }
        this.field6615.method2770(-12495);
        this.field6622.method3151((byte) -119);
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(Z)V", line = 35)
    public static void method2706(boolean arg0) {
        field6612 = null;
        if (arg0) {
            field6620 = -57;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)Z", line = 45)
    public final boolean method1298(int arg0, int arg1) throws IOException {
        if (arg1 <= 76) {
            this.field6622 = null;
        }
        field6617++;
        return this.field6615.method2765(arg0, 0);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 58)
    public final void method1292(byte arg0) {
        this.field6615.method2769(-8371);
        field6621++;
        this.field6622.method3153(-88);
        if (arg0 != 3) {
            field6612 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(III[B)V", line = 72)
    public final void method1296(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field6611++;
        this.field6622.method3150(arg3, -1, arg1, arg0);
        if (arg2 != 20188) {
            method2706(false);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "([BIII)I", line = 95)
    public final int method1299(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field6614++;
        if (arg3 != 4470) {
            this.finalize();
        }
        return this.field6615.method2771(arg0, arg2, arg1, (byte) 37);
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Ljava/net/Socket;I)V", line = 106)
    public class455(Socket arg0, int arg1) throws IOException {
        this.field6616 = arg0;
        this.field6616.setSoTimeout(30000);
        this.field6616.setTcpNoDelay(true);
        this.field6615 = new class466(this.field6616.getInputStream(), arg1);
        this.field6622 = new class532(this.field6616.getOutputStream(), arg1);
    }
}
