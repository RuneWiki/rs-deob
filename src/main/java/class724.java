import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class724 {

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "Lqj;")
    private class535 field9824 = new class535(64);

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "Luq;")
    private class172 field9825;

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "I")
    public static int field9826;

    @OriginalMember(owner = "client!sea", name = "d", descriptor = "I")
    public static int field9827;

    @OriginalMember(owner = "client!sea", name = "e", descriptor = "I")
    public static int field9828;

    @OriginalMember(owner = "client!sea", name = "f", descriptor = "I")
    public static int field9829;

    @OriginalMember(owner = "client!sea", name = "g", descriptor = "I")
    public static int field9830;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)V")
    public final void method3997(int arg0) {
        if (arg0 != -11553) {
            return;
        }
        class535 var2 = this.field9824;
        synchronized (this.field9824) {
            this.field9824.method3113(-128);
        }
        field9830++;
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(I)V")
    public final void method3998(int arg0) {
        class535 var2 = this.field9824;
        synchronized (this.field9824) {
            this.field9824.method3103(-11294);
        }
        field9827++;
        if (arg0 != 64) {
            this.field9825 = null;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIZII)V")
    public static final void method3999(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field9829++;
        class778 var5 = class389.method2406(-88, (long) arg0, 8);
        var5.method4274(125);
        var5.field10690 = arg1;
        if (!arg2) {
            method3999(7, -90, true, 119, 46);
        }
        var5.field10692 = arg3;
        var5.field10693 = arg4;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IB)V")
    public final void method4000(int arg0, byte arg1) {
        class535 var3 = this.field9824;
        synchronized (this.field9824) {
            this.field9824.method3101(false, arg0);
        }
        if (arg1 == 121) {
            field9826++;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(ZI)Lur;")
    public final class563 method4001(boolean arg0, int arg1) {
        field9828++;
        class535 var3 = this.field9824;
        class563 var4;
        synchronized (this.field9824) {
            var4 = (class563) this.field9824.method3109((byte) 110, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class172 var5 = this.field9825;
        byte[] var6;
        synchronized (this.field9825) {
            var6 = this.field9825.method1188(31, -18047, arg1);
            if (!arg0) {
                this.method4001(true, 85);
            }
        }
        class563 var7 = new class563();
        if (var6 != null) {
            var7.method3208((byte) -93, new class254(var6));
        }
        class535 var8 = this.field9824;
        synchronized (this.field9824) {
            this.field9824.method3108((long) arg1, 16337, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lkw;ILuq;)V")
    public class724(class263 arg0, int arg1, class172 arg2) {
        this.field9825 = arg2;
        this.field9825.method1175(31, (byte) 120);
    }
}
