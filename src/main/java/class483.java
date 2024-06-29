import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class483 extends class255 {

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "Ljava/net/Socket;")
    private Socket field6971;

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "Lti;")
    private class328 field6973;

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "Ldb;")
    private class160 field6967;

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
    public static int field6966;

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
    public static int field6968;

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "I")
    public static int field6969;

    @OriginalMember(owner = "client!jr", name = "m", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!jr", name = "r", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!jr", name = "s", descriptor = "I")
    public static int field6976;

    @OriginalMember(owner = "client!jr", name = "t", descriptor = "I")
    public static int field6977;

    @OriginalMember(owner = "client!jr", name = "u", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!jr", name = "q", descriptor = "Ltf;")
    public static class701 field6974;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "[[Lwp;")
    public static class452[][] field6965;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(II)Z")
    public static final boolean method2792(int arg0, int arg1) {
        field6975++;
        if (arg1 == -3) {
            return (arg0 & -arg0) == arg0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
    public final void method1509(int arg0) {
        field6978++;
        if (arg0 != 0) {
            return;
        }
        try {
            this.field6971.close();
        } catch (IOException var2) {
        }
        this.field6973.method1846((byte) -5);
        this.field6967.method872(119);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IB[BI)I")
    public final int method1508(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        field6966++;
        int var5 = -66 % ((arg1 - 4) / 55);
        return this.field6973.method1843(false, arg3, arg0, arg2);
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)V")
    public final void method1513(int arg0) {
        this.field6973.method1848(-1);
        field6977++;
        if (arg0 >= 70) {
            this.field6967.method873(false);
        }
    }

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "(I)V")
    public static void method2793(int arg0) {
        field6965 = null;
        if (arg0 != 16572) {
            method2792(16, -87);
        }
        field6974 = null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)Z")
    public final boolean method1514(int arg0, int arg1) throws IOException {
        field6970++;
        if (arg0 != -28728) {
            this.method1513(-80);
        }
        return this.field6973.method1844(0, arg1);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)[I")
    public static final int[] method2794(byte arg0) {
        field6969++;
        return arg0 == -5 ? new int[] { class613.field8632, class36.field372, class80.field813 } : null;
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class483(Socket arg0, int arg1) throws IOException {
        this.field6971 = arg0;
        this.field6971.setSoTimeout(30000);
        this.field6971.setTcpNoDelay(true);
        this.field6973 = new class328(this.field6971.getInputStream(), arg1);
        this.field6967 = new class160(this.field6971.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZLjava/lang/String;Ljava/lang/String;)V")
    public static final void method2795(int arg0, boolean arg1, String arg2, String arg3) {
        field6976++;
        class76.field779 = arg1;
        class465.field6648 = arg2;
        class79.field803 = arg3;
        if (!class76.field779 && class533.field7494 != 3 && (class465.field6648.equals("") || class79.field803.equals(""))) {
            class123.method707(3, -4);
            return;
        }
        if (class533.field7494 != 1) {
            class48.field503 = -1;
            class365.field4908 = 0;
        }
        class163.field1818 = false;
        class123.method707(-3, -4);
        class579.field8191 = 1;
        class147.field1625 = 0;
        if (arg0 != 19326) {
            method2795(-18, false, null, null);
        }
        class442.field6242 = 0;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(III[B)V")
    public final void method1507(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 == -6768) {
            field6972++;
            this.field6967.method870(-118, arg1, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!jr", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field6968++;
        this.method1509(0);
    }
}
