import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class140 extends class175 {

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Ljava/net/Socket;")
    private Socket field1663;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Lvda;")
    private class511 field1668;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Lpfa;")
    private class235 field1670;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field1664 = 0;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "[I")
    public static int[] field1674;

    @OriginalMember(owner = "client!g", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1667++;
        this.method872(-1);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
    public static void method866(byte arg0) {
        field1674 = null;
        if (arg0 != 120) {
            field1674 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIZBIIIII)Z")
    public static final boolean method867(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1673++;
        if (arg3 != 50) {
            field1664 = 117;
        }
        int var9 = class339.field4374.field435[0];
        int var10 = class339.field4374.field426[0];
        if (var9 < 0 || var9 >= class613.field8591 || var10 < 0 || var10 >= class1.field3) {
            return false;
        } else if (arg8 >= 0 && class613.field8591 > arg8 && arg6 >= 0 && class1.field3 > arg6) {
            int var11 = class347.method2036(arg3 ^ 0x30, class410.field5786[class339.field4374.field5779], arg7, var9, arg4, class339.field4374.method253((byte) -27), class2.field9, var10, arg6, arg5, arg8, arg0, arg2, class616.field8621, arg1);
            if (var11 < 1) {
                return false;
            }
            class333.field4292 = class616.field8621[var11 - 1];
            class721.field10159 = class2.field9[var11 - 1];
            class571.field7966 = false;
            class652.method3520(6090);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class140(Socket arg0, int arg1) throws IOException {
        this.field1663 = arg0;
        this.field1663.setSoTimeout(30000);
        this.field1663.setTcpNoDelay(true);
        this.field1668 = new class511(this.field1663.getInputStream(), arg1);
        this.field1670 = new class235(this.field1663.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II[BI)V")
    public final void method868(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 <= 75) {
            method869(103, 24, -24, -29, (byte) -52, 109);
        }
        field1662++;
        this.field1670.method1473(arg1, arg3, (byte) 104, arg2);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIBI)V")
    public static final void method869(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (class223.field2944.field600.method3601((byte) -120) != 0 && arg3 != 0 && class111.field1370 < 50 && arg1 != -1) {
            class552.field7756[class111.field1370++] = new class310((byte) 1, arg1, arg3, arg5, arg0, 0, arg2, null);
        }
        if (arg4 != 42) {
            method869(55, 33, 100, -73, (byte) -42, -33);
        }
        field1669++;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II[BZ)I")
    public final int method870(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        field1666++;
        if (arg3) {
            field1674 = null;
        }
        return this.field1668.method2942(arg0, arg1, 93, arg2);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public final void method871(byte arg0) {
        this.field1668.method2939(0);
        if (arg0 >= -42) {
            this.method871((byte) -40);
        }
        field1672++;
        this.field1670.method1474(false);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
    public final void method872(int arg0) {
        if (arg0 != -1) {
            return;
        }
        try {
            this.field1663.close();
        } catch (IOException var2) {
        }
        field1671++;
        this.field1668.method2940(-119);
        this.field1670.method1477(1);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)Z")
    public final boolean method873(int arg0, byte arg1) throws IOException {
        field1665++;
        if (arg1 >= -126) {
            this.field1663 = null;
        }
        return this.field1668.method2943(arg0, true);
    }
}
