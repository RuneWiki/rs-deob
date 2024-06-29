import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class450 extends class285 {

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field6714;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Lid;")
    private class508 field6715;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Lpu;")
    private class490 field6718;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Lfj;")
    public static class572 field6717;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "Llba;")
    public static class477 field6724;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field6716;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field6720;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field6725;

    static {
        new class474("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field6717 = new class572("", 15);
        field6724 = new class477();
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II[BI)V", line = 11)
    public final void method1840(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field6720++;
        this.field6718.method2944(arg1, arg2, 6, arg0);
        if (arg3 != 0) {
            this.method1841(-4);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)Z", line = 24)
    public final boolean method1846(int arg0, int arg1) throws IOException {
        field6719++;
        return arg0 == 3139 ? this.field6715.method3030(arg1, (byte) 126) : true;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Ljava/net/Socket;I)V", line = 35)
    public class450(Socket arg0, int arg1) throws IOException {
        this.field6714 = arg0;
        this.field6714.setSoTimeout(30000);
        this.field6714.setTcpNoDelay(true);
        this.field6715 = new class508(this.field6714.getInputStream(), arg1);
        this.field6718 = new class490(this.field6714.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!cb", name = "finalize", descriptor = "()V", line = 47)
    protected final void finalize() {
        this.method1841(-78);
        field6722++;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(II[BI)I", line = 56)
    public final int method1843(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field6723++;
        return arg1 == 1 ? this.field6715.method3027(arg0, arg2, arg1 ^ -2, arg3) : -89;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V", line = 67)
    public static void method2786(int arg0) {
        field6717 = null;
        field6724 = null;
        if (arg0 != 15) {
            field6725 = -20;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 79)
    public final void method1841(int arg0) {
        int var2 = 111 % ((80 - arg0) / 43);
        try {
            this.field6714.close();
        } catch (IOException var3) {
        }
        field6721++;
        this.field6715.method3032((byte) -38);
        this.field6718.method2945((byte) -52);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V", line = 94)
    public final void method1842(int arg0) {
        this.field6715.method3031(-4);
        field6716++;
        if (arg0 == -17446) {
            this.field6718.method2946(arg0 + 17327);
        }
    }
}
