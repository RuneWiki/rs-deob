import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class531 {

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "Leea;")
    private class132 field7523;

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "J")
    public long field7520;

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "Lpu;")
    public static class559 field7524 = new class559(6, 7);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "Ljha;")
    public static class692 field7521;

    @OriginalMember(owner = "client!pga", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field7522++;
        this.field7523.method1005(false, this.field7520);
        super.finalize();
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(BII)Z")
    public static final boolean method3124(byte arg0, int arg1, int arg2) {
        int var3 = 118 % ((arg0 - 31) / 45);
        field7519++;
        return class453.method2768(arg2, false, arg1) | (arg1 & 0x70000) != 0 || class555.method3249(arg2, arg1, 34336);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)V")
    public static void method3125(int arg0) {
        field7524 = null;
        field7521 = null;
        if (arg0 < 37) {
            method3124((byte) 58, 121, 49);
        }
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Leea;J[Lib;)V")
    public class531(class132 arg0, long arg1, class152[] arg2) {
        this.field7523 = arg0;
        this.field7520 = arg1;
    }
}
