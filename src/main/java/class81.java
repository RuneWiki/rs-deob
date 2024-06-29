import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class81 extends class629 {

    @OriginalMember(owner = "client!u", name = "t", descriptor = "Ljava/net/Socket;")
    private Socket field1111;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "Lrja;")
    private class116 field1107;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "Lwha;")
    private class299 field1108;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "Lkq;")
    public static class620 field1103 = null;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)Z", line = 12)
    public final boolean method765(byte arg0, int arg1) throws IOException {
        field1106++;
        int var3 = -58 % ((arg0 - 23) / 39);
        return this.field1107.method910(arg1, false);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([BIII)I", line = 23)
    public final int method766(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field1109++;
        int var5 = -1 % ((23 - arg2) / 38);
        return this.field1107.method914(arg3, arg1, -112, arg0);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lqha;Lqha;I)V", line = 33)
    public static final void method767(class112 arg0, class112 arg1, int arg2) {
        if (arg0.field1407 != null) {
            arg0.method892(50560);
        }
        field1102++;
        arg0.field1406 = arg1;
        arg0.field1407 = arg1.field1407;
        arg0.field1407.field1406 = arg0;
        if (arg2 < -98) {
            arg0.field1406.field1407 = arg0;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 52)
    public final void method768(int arg0) {
        field1110++;
        try {
            if (arg0 != 0) {
                field1103 = null;
            }
            this.field1111.close();
        } catch (IOException var2) {
        }
        this.field1107.method911((byte) 110);
        this.field1108.method1747(arg0 + 8747);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III[B)V", line = 69)
    public final void method769(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        this.field1108.method1746(arg3, arg1 ^ 0xFFFF9057, arg0, arg2);
        field1100++;
        if (arg1 != -28586) {
            this.field1107 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "finalize", descriptor = "()V", line = 82)
    protected final void finalize() {
        field1101++;
        this.method768(0);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)I", line = 92)
    public static final int method770(int arg0) {
        if (arg0 != -5) {
            field1103 = null;
        }
        field1112++;
        return class727.field10184 == 1 ? class608.field8178 : class632.field8632;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Ljava/net/Socket;I)V", line = 107)
    public class81(Socket arg0, int arg1) throws IOException {
        this.field1111 = arg0;
        this.field1111.setSoTimeout(30000);
        this.field1111.setTcpNoDelay(true);
        this.field1107 = new class116(this.field1111.getInputStream(), arg1);
        this.field1108 = new class299(this.field1111.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 119)
    public final void method771(byte arg0) {
        field1104++;
        this.field1107.method909((byte) -58);
        this.field1108.method1748(123);
        if (arg0 != -24) {
            method772(-100);
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V", line = 131)
    public static void method772(int arg0) {
        if (arg0 == -2968) {
            field1103 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)Z", line = 141)
    public static final boolean method773(int arg0, boolean arg1) {
        if (arg1) {
            method773(25, false);
        }
        field1105++;
        return arg0 == 3 || arg0 == 4;
    }
}
