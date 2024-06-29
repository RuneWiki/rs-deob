import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class698 extends class405 {

    @OriginalMember(owner = "client!hfa", name = "o", descriptor = "Ljava/net/Socket;")
    private Socket field9725;

    @OriginalMember(owner = "client!hfa", name = "j", descriptor = "Lbu;")
    private class150 field9720;

    @OriginalMember(owner = "client!hfa", name = "n", descriptor = "Lnj;")
    private class711 field9724;

    @OriginalMember(owner = "client!hfa", name = "i", descriptor = "Z")
    public static boolean field9719 = false;

    @OriginalMember(owner = "client!hfa", name = "g", descriptor = "I")
    public static int field9717;

    @OriginalMember(owner = "client!hfa", name = "h", descriptor = "I")
    public static int field9718;

    @OriginalMember(owner = "client!hfa", name = "k", descriptor = "I")
    public static int field9721;

    @OriginalMember(owner = "client!hfa", name = "l", descriptor = "I")
    public static int field9722;

    @OriginalMember(owner = "client!hfa", name = "m", descriptor = "I")
    public static int field9723;

    @OriginalMember(owner = "client!hfa", name = "p", descriptor = "I")
    public static int field9726;

    @OriginalMember(owner = "client!hfa", name = "q", descriptor = "I")
    public static int field9727;

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "(Z)V")
    public final void method2461(boolean arg0) {
        if (arg0) {
            return;
        }
        field9722++;
        try {
            this.field9725.close();
        } catch (IOException var2) {
        }
        this.field9720.method965(0);
        this.field9724.method3993((byte) -117);
    }

    @OriginalMember(owner = "client!hfa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method2461(false);
        field9723++;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V")
    public final void method2458(int arg0) {
        this.field9720.method961(false);
        field9727++;
        this.field9724.method3991(arg0 ^ 0xFFFF9BDB);
        if (arg0 != 1) {
            this.method2461(true);
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(II[BI)V")
    public final void method2462(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field9717++;
        this.field9724.method3994(arg2, arg0, arg3, -26012);
        if (arg1 != 1) {
            this.finalize();
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(II)Z")
    public final boolean method2459(int arg0, int arg1) throws IOException {
        if (arg0 != 2) {
            this.method2458(109);
        }
        field9718++;
        return this.field9720.method960(arg1, 6749);
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(III[B)I")
    public final int method2463(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg2 != 11909) {
            this.method2461(false);
        }
        field9721++;
        return this.field9720.method962(arg1, true, arg3, arg0);
    }

    @OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class698(Socket arg0, int arg1) throws IOException {
        this.field9725 = arg0;
        this.field9725.setSoTimeout(30000);
        this.field9725.setTcpNoDelay(true);
        this.field9720 = new class150(this.field9725.getInputStream(), arg1);
        this.field9724 = new class711(this.field9725.getOutputStream(), arg1);
    }
}
