import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class281 extends class440 {

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "Ljava/net/Socket;")
    private Socket field4444;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Ldr;")
    private class428 field4445;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "Lfl;")
    private class76 field4449;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public final void method1892(int arg0) {
        try {
            this.field4444.close();
        } catch (IOException var2) {
        }
        field4451++;
        this.field4445.method2712((byte) 84);
        if (arg0 != 90) {
            this.field4445 = null;
        }
        this.field4449.method550((byte) -112);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)Z")
    public final boolean method1893(byte arg0, int arg1) throws IOException {
        field4450++;
        if (arg0 != 24) {
            this.method1897((byte) 53);
        }
        return this.field4445.method2710(arg0 ^ 0xFFFFD228, arg1);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V")
    public static final void method1894(int arg0, int arg1) {
        field4452++;
        class456 var2 = class233.method1654(arg0, arg1, arg1 - 15);
        var2.method2862(0);
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class281(Socket arg0, int arg1) throws IOException {
        this.field4444 = arg0;
        this.field4444.setSoTimeout(30000);
        this.field4444.setTcpNoDelay(true);
        this.field4445 = new class428(this.field4444.getInputStream(), arg1);
        this.field4449 = new class76(this.field4444.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II[BI)V")
    public final void method1895(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 != 10) {
            this.method1892(87);
        }
        this.field4449.method549(arg3, arg2, -1, arg1);
        field4447++;
    }

    @OriginalMember(owner = "client!eg", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field4443++;
        this.method1892(90);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[BBI)I")
    public final int method1896(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        field4448++;
        return arg2 <= 13 ? -123 : this.field4445.method2713(arg1, arg0, arg3, 122);
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V")
    public final void method1897(byte arg0) {
        if (arg0 < -116) {
            field4446++;
            this.field4445.method2709(-12);
            this.field4449.method545(117);
        }
    }
}
