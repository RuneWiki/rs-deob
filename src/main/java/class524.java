import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class524 {

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Z")
    public boolean field7398;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Lba;")
    public static class351 field7397 = new class351(0);

    @OriginalMember(owner = "client!k", name = "i", descriptor = "Lmf;")
    public static class382 field7402 = new class382(4);

    @OriginalMember(owner = "client!k", name = "k", descriptor = "Z")
    public static boolean field7404 = false;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field7395;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Lrn;")
    public class241 field7400;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Lrn;")
    public class241 field7401;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Z")
    public boolean field7399;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "[I")
    public static int[] field7403;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)Z", line = 3)
    public final boolean method3013(boolean arg0) {
        field7395++;
        if (arg0) {
            return false;
        } else {
            return this.field7399 && !this.field7398;
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)V", line = 15)
    public final void method3014(boolean arg0) {
        field7394++;
        if (arg0) {
            if (this.field7400 != null) {
                this.field7400.method7(-111);
            }
            this.field7399 = false;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BJ)V", line = 31)
    public static final void method3015(byte arg0, long arg1) {
        field7396++;
        class135 var3 = class262.method1721((byte) -75);
        var3.field1978.method3853((byte) 51, class370.field5288.field6777);
        var3.field1978.method3824(16384, arg1);
        var3.field1978.method3853((byte) 51, class512.field7203);
        class19.method223(var3, 0);
        class619.field8637 = 0;
        class513.field7244 = -3;
        class594.field8391 = 1;
        class661.field9347 = 0;
        if (arg0 >= -52) {
            method3016(false);
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(Z)V", line = 53)
    public static void method3016(boolean arg0) {
        field7403 = null;
        if (arg0) {
            field7397 = null;
            field7402 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Z)V", line = 69)
    public class524(boolean arg0) {
        this.field7398 = arg0;
    }
}
