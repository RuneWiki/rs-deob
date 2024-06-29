import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class636 {

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Leq;")
    private class357 field8808;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "J")
    public long field8807;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field8804;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field8806;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field8809;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lpg;")
    public static class711 field8805;

    @OriginalMember(owner = "client!ua", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        this.field8808.method2129(11642, this.field8807);
        field8804++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLjava/lang/String;III)V", line = 14)
    public static final void method3452(boolean arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 24296) {
            class81.method577(null, arg1, (byte) -121, false, arg0, arg3, arg2);
            field8806++;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Leq;J[Lci;)V", line = 28)
    public class636(class357 arg0, long arg1, class692[] arg2) {
        this.field8808 = arg0;
        this.field8807 = arg1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 39)
    public static void method3453(byte arg0) {
        if (arg0 != -104) {
            field8805 = null;
        }
        field8805 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lkba;I)V", line = 50)
    public static final void method3454(class24 arg0, int arg1) {
        field8809++;
        int var2 = arg0.field339 - class266.field3368;
        int var3 = arg0.field406 * arg1 + arg0.method253((byte) -27) * 256;
        int var4 = arg0.field366 * 512 + (arg0.method253((byte) -27) * 256);
        arg0.field5790 += (var3 - arg0.field5790) / var2;
        arg0.field5784 += (var4 - arg0.field5784) / var2;
        arg0.field431 = 0;
        if (arg0.field330 == 0) {
            arg0.method266(-127, 8192);
        }
        if (arg0.field330 == 1) {
            arg0.method266(-124, 12288);
        }
        if (arg0.field330 == 2) {
            arg0.method266(-119, 0);
        }
        if (arg0.field330 == 3) {
            arg0.method266(-115, 4096);
        }
    }
}
