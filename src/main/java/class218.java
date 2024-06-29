import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class218 {

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Z")
    public static boolean field3275 = false;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field3280 = 0;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field3278 = 0;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3277;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "[I")
    public static int[] field3281;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z[BLfl;)V")
    public final void method1400(boolean arg0, byte[] arg1, class248 arg2) {
        field3276++;
        if (arg2.field3723[arg2.field3748] != 31 || arg2.field3723[arg2.field3748 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3277 == null) {
            this.field3277 = new Inflater(true);
        }
        try {
            this.field3277.setInput(arg2.field3723, arg2.field3748 + 10, -arg2.field3748 - (18 - arg2.field3723.length));
            this.field3277.inflate(arg1);
            if (!arg0) {
                this.method1400(false, (byte[]) null, (class248) null);
            }
        } catch (Exception var4) {
            this.field3277.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field3277.reset();
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIZIZ)V")
    public static final void method1401(int arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        if (arg0 != -9) {
            field3278 = -80;
        }
        field3279++;
        class214.method1370(arg2, arg3, 0, arg4, arg1, class52.field844.length - 1, 2);
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class218() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(III)V")
    private class218(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static void method1402(int arg0) {
        field3281 = null;
        if (arg0 != 18) {
            field3275 = true;
        }
    }
}
