import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class412 {

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Llga;")
    private class663 field5842 = new class663(64);

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Lsea;")
    private class648 field5839;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public int field5838;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "Lgi;")
    public static class631 field5840 = new class631();

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field5847 = 0;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "Leg;")
    public static class93 field5846 = new class93();

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field5849 = -1;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "Lsea;")
    public static class648 field5848;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "[Lke;")
    public static class555[] field5844;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static void method2394(int arg0) {
        if (arg0 == 458752) {
            field5848 = null;
            field5844 = null;
            field5846 = null;
            field5840 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)Ldf;")
    public static final class366 method2395(byte arg0, int arg1) {
        field5845++;
        class366 var2 = (class366) class199.field2830.method3747((byte) -66, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class578.field8167.method3654(-15615, 0, arg1);
        class366 var4 = new class366();
        if (arg0 != -28) {
            method2397(-36, 58, 85);
        }
        if (var3 != null) {
            var4.method2112(new class501(var3), true);
        }
        var4.method2114(786483376);
        class199.field2830.method3748((long) arg1, var4, 12537);
        return var4;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(BI)Lbo;")
    public final class680 method2396(byte arg0, int arg1) {
        field5843++;
        if (arg0 != 82) {
            return null;
        }
        class663 var3 = this.field5842;
        class680 var4;
        synchronized (this.field5842) {
            var4 = (class680) this.field5842.method3747((byte) -66, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class648 var5 = this.field5839;
        byte[] var6;
        synchronized (this.field5839) {
            var6 = this.field5839.method3654(-15615, 19, arg1);
        }
        class680 var7 = new class680();
        if (var6 != null) {
            var7.method3857(11, new class501(var6));
        }
        class663 var8 = this.field5842;
        synchronized (this.field5842) {
            this.field5842.method3748((long) arg1, var7, 12537);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)Z")
    public static final boolean method2397(int arg0, int arg1, int arg2) {
        if (arg2 != 29360) {
            method2394(6);
        }
        field5841++;
        return class222.method1408(arg0, (byte) -59, arg1) | (arg0 & 0x70000) != 0 || class639.method3564(arg1, arg0, 124);
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lci;ILsea;)V")
    public class412(class414 arg0, int arg1, class648 arg2) {
        this.field5839 = arg2;
        this.field5838 = this.field5839.method3653(19, true);
    }
}
