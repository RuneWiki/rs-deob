import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class593 {

    @OriginalMember(owner = "client!av", name = "c", descriptor = "Llga;")
    private class663 field8298 = new class663(64);

    @OriginalMember(owner = "client!av", name = "l", descriptor = "Llga;")
    public class663 field8307 = new class663(2);

    @OriginalMember(owner = "client!av", name = "d", descriptor = "Lsea;")
    private class648 field8299;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "Lsea;")
    public class648 field8297;

    @OriginalMember(owner = "client!av", name = "h", descriptor = "Z")
    public static boolean field8303 = false;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "F")
    public static float field8296;

    @OriginalMember(owner = "client!av", name = "e", descriptor = "I")
    public static int field8300;

    @OriginalMember(owner = "client!av", name = "f", descriptor = "I")
    public static int field8301;

    @OriginalMember(owner = "client!av", name = "g", descriptor = "I")
    public static int field8302;

    @OriginalMember(owner = "client!av", name = "i", descriptor = "I")
    public static int field8304;

    @OriginalMember(owner = "client!av", name = "j", descriptor = "I")
    public static int field8305;

    @OriginalMember(owner = "client!av", name = "k", descriptor = "I")
    public static int field8306;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Z)V")
    public static final void method3353(boolean arg0) {
        class610.field8463.method105(((float) class366.field4875.field9345 * 0.1F + 0.7F) * class54.field612);
        field8300++;
        if (arg0) {
            field8304 = -11;
        }
        class610.field8463.method117(class525.field7116, class171.field2476, class529.field7167, (float) (class226.field3141 << 2), (float) (class420.field5918 << 2), (float) (class456.field6334 << 2));
        class610.field8463.method128(class284.field3907);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IB)V")
    public final void method3354(int arg0, byte arg1) {
        class663 var3 = this.field8298;
        synchronized (this.field8298) {
            this.field8298.method3754(arg0, true);
        }
        field8302++;
        if (arg1 <= 16) {
            this.field8297 = null;
        }
        class663 var4 = this.field8307;
        synchronized (this.field8307) {
            this.field8307.method3754(arg0, true);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
    public final void method3355(int arg0) {
        field8305++;
        class663 var2 = this.field8298;
        synchronized (this.field8298) {
            if (arg0 != -592204478) {
                return;
            }
            this.field8298.method3755(19713);
        }
        class663 var3 = this.field8307;
        synchronized (this.field8307) {
            this.field8307.method3755(arg0 + 592224191);
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(I)V")
    public final void method3356(int arg0) {
        class663 var2 = this.field8298;
        synchronized (this.field8298) {
            this.field8298.method3749(7648);
            if (arg0 != 33) {
                this.method3356(92);
            }
        }
        field8301++;
        class663 var3 = this.field8307;
        synchronized (this.field8307) {
            this.field8307.method3749(7648);
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(IB)Lhq;")
    public final class143 method3357(int arg0, byte arg1) {
        field8306++;
        class663 var3 = this.field8298;
        class143 var4;
        synchronized (this.field8298) {
            var4 = (class143) this.field8298.method3747((byte) -66, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class648 var5 = this.field8299;
        byte[] var7;
        synchronized (this.field8299) {
            if (arg1 >= -46) {
                return null;
            }
            var7 = this.field8299.method3654(-15615, 33, arg0);
        }
        class143 var8 = new class143();
        var8.field2060 = this;
        if (var7 != null) {
            var8.method1004(new class501(var7), 121);
        }
        class663 var9 = this.field8298;
        synchronized (this.field8298) {
            this.field8298.method3748((long) arg0, var8, 12537);
            return var8;
        }
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lci;ILsea;Lsea;)V")
    public class593(class414 arg0, int arg1, class648 arg2, class648 arg3) {
        this.field8299 = arg2;
        this.field8297 = arg3;
        this.field8299.method3653(33, true);
    }
}
