import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class113 {

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Llga;")
    private class663 field1571 = new class663(128);

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Lsea;")
    private class648 field1569;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "[I")
    public static int[] field1565 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "F")
    public static float field1570;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZI)Liq;", line = 10)
    public final class563 method815(boolean arg0, int arg1) {
        field1567++;
        class663 var3 = this.field1571;
        class563 var4;
        synchronized (this.field1571) {
            var4 = (class563) this.field1571.method3747((byte) -66, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1569.method3654(-15615, class249.method1536(arg0, arg1), class596.method3368(0, arg1));
        class563 var6 = new class563();
        if (var5 != null) {
            var6.method3145((byte) 108, new class501(var5));
        }
        class663 var7 = this.field1571;
        synchronized (this.field1571) {
            this.field1571.method3748((long) arg1, var6, 12537);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 46)
    public static void method816(int arg0) {
        field1565 = null;
        if (arg0 != 28) {
            field1570 = -1.1398966F;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([I[II)V", line = 56)
    public static final void method817(int[] arg0, int[] arg1, int arg2) {
        field1568++;
        if (arg0 == null || arg1 == null) {
            class44.field541 = null;
            class616.field8606 = null;
            class342.field4592 = null;
            return;
        }
        class342.field4592 = arg0;
        class616.field8606 = new int[arg0.length];
        class44.field541 = new byte[arg0.length][][];
        for (int var3 = arg2; var3 < class342.field4592.length; var3++) {
            class44.field541[var3] = new byte[arg1[var3]][];
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lci;ILsea;)V", line = 88)
    public class113(class414 arg0, int arg1, class648 arg2) {
        this.field1569 = arg2;
        if (this.field1569 != null) {
            int var4 = this.field1569.method3649((byte) 112) - 1;
            this.field1569.method3653(var4, true);
        }
    }
}
