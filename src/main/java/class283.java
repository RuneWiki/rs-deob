import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class283 extends class311 {

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "Ljava/net/Socket;")
    private Socket field3442;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "Lqk;")
    private class16 field3439;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "Lib;")
    private class153 field3444;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "Lpia;")
    public static class94 field3447 = new class94(10, 16);

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!ol", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1691(116);
        field3440++;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public final void method1691(int arg0) {
        try {
            this.field3442.close();
        } catch (IOException var2) {
        }
        field3441++;
        if (arg0 <= 36) {
            field3448 = 1;
        }
        this.field3439.method77(-120);
        this.field3444.method940((byte) -23);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([BIII)I")
    public final int method1692(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg2 > -9) {
            this.field3442 = null;
        }
        field3438++;
        return this.field3439.method76(arg3, arg1, arg0, false);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V")
    public static void method1693(boolean arg0) {
        if (arg0) {
            method1693(true);
        }
        field3447 = null;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(II)Z")
    public final boolean method1694(int arg0, int arg1) throws IOException {
        field3446++;
        if (arg1 != 6406) {
            this.method1691(-106);
        }
        return this.field3439.method78(arg0, (byte) -45);
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "([BIII)V")
    public final void method1695(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3445++;
        if (arg2 != -1) {
            field3449 = 57;
        }
        this.field3444.method937(arg3, arg0, arg1, (byte) 127);
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V")
    public final void method1696(int arg0) {
        this.field3439.method79(arg0 - 6408);
        if (arg0 != 6407) {
            this.field3439 = null;
        }
        field3443++;
        this.field3444.method939((byte) 105);
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class283(Socket arg0, int arg1) throws IOException {
        this.field3442 = arg0;
        this.field3442.setSoTimeout(30000);
        this.field3442.setTcpNoDelay(true);
        this.field3439 = new class16(this.field3442.getInputStream(), arg1);
        this.field3444 = new class153(this.field3442.getOutputStream(), arg1);
    }
}
