import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class411 extends class684 {

    @OriginalMember(owner = "client!taa", name = "x", descriptor = "Ljava/net/Socket;")
    private Socket field5238;

    @OriginalMember(owner = "client!taa", name = "n", descriptor = "Lnba;")
    private class302 field5228;

    @OriginalMember(owner = "client!taa", name = "o", descriptor = "Llt;")
    private class677 field5229;

    @OriginalMember(owner = "client!taa", name = "r", descriptor = "[Lwf;")
    public static class138[] field5232 = new class138[0];

    @OriginalMember(owner = "client!taa", name = "p", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!taa", name = "q", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!taa", name = "s", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!taa", name = "t", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!taa", name = "u", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!taa", name = "v", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!taa", name = "w", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5235++;
        if (class667.field9373 <= arg2 && class225.field2994 >= arg7 && class546.field7619 <= arg5 && arg6 <= class760.field10606) {
            class196.method1303(arg2, (byte) 79, arg3, arg5, arg4, arg7, arg6, arg0);
        } else {
            class597.method3389(69, arg0, arg3, arg5, arg6, arg7, arg2, arg4);
        }
        if (arg1 != 0) {
            method2308(true);
        }
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)V")
    public final void method2303(int arg0) {
        this.field5228.method1799((byte) 109);
        field5231++;
        if (arg0 > -122) {
            field5232 = null;
        }
        this.field5229.method3819(2);
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)Z")
    public final boolean method2304(int arg0, int arg1) throws IOException {
        int var3 = -19 % ((-arg1 - 56) / 43);
        field5230++;
        return this.field5228.method1801(arg0, 111);
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(II[BI)I")
    public final int method2305(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 != 4993) {
            this.method2303(121);
        }
        field5234++;
        return this.field5228.method1800(arg2, arg1, arg3, arg0 - 4993);
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(B[BII)V")
    public final void method2306(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        this.field5229.method3820(arg3, arg2, arg1, true);
        field5233++;
        if (arg0 >= -57) {
            this.method2303(29);
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V")
    public final void method2307(int arg0) {
        field5237++;
        if (arg0 != -1884375310) {
            this.field5238 = null;
        }
        try {
            this.field5238.close();
        } catch (IOException var2) {
        }
        this.field5228.method1798((byte) -18);
        this.field5229.method3822(115);
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(Z)V")
    public static void method2308(boolean arg0) {
        if (arg0) {
            method2302(-27, -40, 35, 118, -26, -85, 43, -92);
        }
        field5232 = null;
    }

    @OriginalMember(owner = "client!taa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method2307(-1884375310);
        field5236++;
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class411(Socket arg0, int arg1) throws IOException {
        this.field5238 = arg0;
        this.field5238.setSoTimeout(30000);
        this.field5238.setTcpNoDelay(true);
        this.field5228 = new class302(this.field5238.getInputStream(), arg1);
        this.field5229 = new class677(this.field5238.getOutputStream(), arg1);
    }
}
