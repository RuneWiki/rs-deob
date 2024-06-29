import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class476 extends class744 {

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "Ljava/net/Socket;")
    private Socket field6758;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "Lsb;")
    private class290 field6750;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "Lmw;")
    private class491 field6751;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "Z")
    public static boolean field6748 = false;

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "Z")
    public static boolean field6759 = false;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "Las;")
    public static class151 field6749 = new class151(11, 0, 1, 2);

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "Lqfa;")
    public static class98 field6763 = new class98(117, 1);

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    public static int field6753;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "Lfp;")
    public static class323 field6761;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[BII)V")
    public final void method2843(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        this.field6751.method2928(arg0, -1, arg1, arg3);
        if (arg2 <= -64) {
            field6754++;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V")
    public final void method2844(int arg0) {
        try {
            this.field6758.close();
        } catch (IOException var2) {
        }
        if (arg0 != Integer.MIN_VALUE) {
            this.field6750 = null;
        }
        field6760++;
        this.field6750.method1893(true);
        this.field6751.method2925(19602);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V")
    public final void method2845(byte arg0) {
        field6757++;
        if (arg0 != 125) {
            method2848((byte) 3, null);
        }
        this.field6750.method1896((byte) 48);
        this.field6751.method2926(arg0 ^ 0xFFFFFF82);
    }

    @OriginalMember(owner = "client!ap", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field6756++;
        this.method2844(Integer.MIN_VALUE);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BI)Z")
    public final boolean method2846(byte arg0, int arg1) throws IOException {
        field6752++;
        if (arg0 != 53) {
            field6748 = false;
        }
        return this.field6750.method1894(arg1, (byte) 64);
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(I[BII)I")
    public final int method2847(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field6762++;
        return arg0 == -1 ? this.field6750.method1895(arg3, arg1, -19518, arg2) : -56;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BLmq;)Ljava/lang/String;")
    public static final String method2848(byte arg0, class508 arg1) {
        field6753++;
        if (arg0 >= -31) {
            field6761 = null;
        }
        return arg1.field7270 + " <col=ffffff>>";
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class476(Socket arg0, int arg1) throws IOException {
        this.field6758 = arg0;
        this.field6758.setSoTimeout(30000);
        this.field6758.setTcpNoDelay(true);
        this.field6750 = new class290(this.field6758.getInputStream(), arg1);
        this.field6751 = new class491(this.field6758.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)V")
    public static void method2849(byte arg0) {
        if (arg0 <= -99) {
            field6763 = null;
            field6761 = null;
            field6749 = null;
        }
    }
}
