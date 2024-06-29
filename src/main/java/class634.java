import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class634 {

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "Z")
    public boolean field9288;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "[I")
    public static int[] field9290 = new int[1024];

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field9285;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field9287;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Lkda;")
    public static class328 field9289;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Laf;")
    public class370 field9284;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Laf;")
    public class370 field9286;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Z")
    public boolean field9291;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V", line = 3)
    public final void method3687(boolean arg0) {
        if (this.field9284 != null) {
            this.field9284.method281((byte) 80);
        }
        if (arg0) {
            field9287++;
            this.field9291 = false;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)Z", line = 26)
    public final boolean method3688(int arg0) {
        field9285++;
        if (arg0 != 1024) {
            this.field9284 = null;
        }
        return this.field9291 && !this.field9288;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V", line = 38)
    public static void method3689(int arg0) {
        if (arg0 != 1024) {
            method3689(-127);
        }
        field9290 = null;
        field9289 = null;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Z)V", line = 48)
    public class634(boolean arg0) {
        this.field9288 = arg0;
    }
}
