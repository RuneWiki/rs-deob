import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class130 {

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "J")
    public long field1681;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "Lhl;")
    private class529 field1679;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Z")
    public static boolean field1678 = false;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Llga;")
    public static class712 field1677 = new class712(14, 11);

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "Lkf;")
    public static class256 field1685;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static void method821(int arg0) {
        if (arg0 == 14) {
            field1677 = null;
            field1685 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1684++;
        this.field1679.method2929(0, this.field1681);
        super.finalize();
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
    public static final void method822(int arg0) {
        class322.field4321.method1563(arg0 ^ 0x27B6);
        if (arg0 != 10157) {
            field1677 = null;
        }
        field1680++;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILac;III)Liaa;")
    public static final class495 method823(int arg0, class541 arg1, int arg2, int arg3, int arg4) {
        field1682++;
        int var5 = 89 % ((arg3 + 46) / 42);
        if (!arg1.field7637 && (!class143.method891(arg2, 0) || !class143.method891(arg0, 0))) {
            return arg1.field7589 ? new class495(arg1, 34037, arg4, arg2, arg0) : new class495(arg1, arg4, arg2, arg0, class128.method814(423660257, arg2), class128.method814(423660257, arg0));
        } else {
            return new class495(arg1, 3553, arg4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lhl;J[Lon;)V")
    public class130(class529 arg0, long arg1, class339[] arg2) {
        this.field1681 = arg1;
        this.field1679 = arg0;
    }
}
