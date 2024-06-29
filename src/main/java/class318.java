import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class318 extends class685 {

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Ljava/net/Socket;")
    private Socket field4200;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Lvh;")
    private class330 field4201;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Lao;")
    private class260 field4204;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "Lwo;")
    public static class690 field4203 = new class690(64, 7);

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "[I")
    public static int[] field4208 = new int[200];

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public static int field4209 = 0;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "Lkb;")
    public static class640 field4207;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([BIBI)I")
    public final int method1851(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field4206++;
        return arg2 == -3 ? this.field4201.method1913(arg1, arg0, arg3, (byte) 69) : 52;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
    public final void method1852(int arg0) {
        if (arg0 != -1) {
            method1854(-92);
        }
        field4197++;
        this.field4201.method1917(5);
        this.field4204.method1584((byte) -73);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public final void method1853(byte arg0) {
        field4202++;
        try {
            if (arg0 != 11) {
                return;
            }
            this.field4200.close();
        } catch (IOException var2) {
        }
        this.field4201.method1916(true);
        this.field4204.method1585((byte) 73);
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
    public static void method1854(int arg0) {
        field4208 = null;
        if (arg0 != 0) {
            method1854(86);
        }
        field4207 = null;
        field4203 = null;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class318(Socket arg0, int arg1) throws IOException {
        this.field4200 = arg0;
        this.field4200.setSoTimeout(30000);
        this.field4200.setTcpNoDelay(true);
        this.field4201 = new class330(this.field4200.getInputStream(), arg1);
        this.field4204 = new class260(this.field4200.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III[B)V")
    public final void method1855(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        this.field4204.method1587(arg3, (byte) 35, arg0, arg1);
        field4205++;
        int var5 = -74 / ((arg2 + 31) / 52);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Z")
    public final boolean method1856(int arg0, int arg1) throws IOException {
        field4196++;
        return arg0 == -1 ? this.field4201.method1914(true, arg1) : true;
    }

    @OriginalMember(owner = "client!sc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1853((byte) 11);
        field4198++;
    }
}
