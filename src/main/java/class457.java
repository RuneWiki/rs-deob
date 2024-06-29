import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class457 extends class368 {

    @OriginalMember(owner = "client!iaa", name = "v", descriptor = "Ljava/net/Socket;")
    private Socket field6549;

    @OriginalMember(owner = "client!iaa", name = "s", descriptor = "Lec;")
    private class210 field6546;

    @OriginalMember(owner = "client!iaa", name = "l", descriptor = "Lkk;")
    private class174 field6539;

    @OriginalMember(owner = "client!iaa", name = "q", descriptor = "I")
    public static int field6544 = -1;

    @OriginalMember(owner = "client!iaa", name = "k", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!iaa", name = "m", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!iaa", name = "n", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!iaa", name = "o", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!iaa", name = "p", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!iaa", name = "r", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!iaa", name = "t", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!iaa", name = "u", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Z[BII)V", line = 6)
    public final void method2235(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        this.field6539.method1191((byte) -114, arg1, arg2, arg3);
        field6541++;
        if (arg0) {
            this.finalize();
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)Z", line = 21)
    public final boolean method2233(int arg0, int arg1) throws IOException {
        field6548++;
        if (arg1 != 13) {
            field6544 = -62;
        }
        return this.field6546.method1389((byte) 103, arg0);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lmo;I)Lew;", line = 37)
    public static final class455 method2686(class695 arg0, int arg1) {
        field6542++;
        int var2 = arg0.method3847((byte) 118);
        class109 var3 = class192.method1294(arg1 - 34345)[arg0.method3826(false)];
        class630 var4 = class257.method1709(-102)[arg0.method3826(false)];
        int var5 = arg0.method3814(false);
        if (arg1 != 22466) {
            field6544 = -98;
        }
        int var6 = arg0.method3814(false);
        return new class455(var2, var3, var4, var5, var6);
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(Z)V", line = 58)
    public final void method2234(boolean arg0) {
        field6543++;
        try {
            this.field6549.close();
        } catch (IOException var2) {
        }
        if (arg0) {
            this.field6546 = null;
        }
        this.field6546.method1393(65);
        this.field6539.method1188((byte) -120);
    }

    @OriginalMember(owner = "client!iaa", name = "finalize", descriptor = "()V", line = 75)
    protected final void finalize() {
        this.method2234(false);
        field6547++;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IB)V", line = 84)
    public static final void method2687(int arg0, byte arg1) {
        if (arg1 <= 79) {
            field6544 = -1;
        }
        field6540++;
        if (class313.field4623 == 0) {
            class323.field4762.method402(arg0, (byte) -91);
        } else {
            class596.field8425 = arg0;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Z)V", line = 102)
    public final void method2232(boolean arg0) {
        field6538++;
        this.field6546.method1387(true);
        this.field6539.method1189((byte) 27);
        if (arg0) {
            this.finalize();
        }
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Ljava/net/Socket;I)V", line = 116)
    public class457(Socket arg0, int arg1) throws IOException {
        this.field6549 = arg0;
        this.field6549.setSoTimeout(30000);
        this.field6549.setTcpNoDelay(true);
        this.field6546 = new class210(this.field6549.getInputStream(), arg1);
        this.field6539 = new class174(this.field6549.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II[BI)I", line = 128)
    public final int method2231(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 >= -28) {
            this.finalize();
        }
        field6545++;
        return this.field6546.method1392(arg3, (byte) -46, arg1, arg2);
    }
}
