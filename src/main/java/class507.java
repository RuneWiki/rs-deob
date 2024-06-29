import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class507 extends class435 {

    @OriginalMember(owner = "client!jn", name = "s", descriptor = "Z")
    public static boolean field7351 = true;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "I")
    public static int field7344;

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "I")
    public static int field7349;

    @OriginalMember(owner = "client!jn", name = "r", descriptor = "I")
    public static int field7350;

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "J")
    public long field7348;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "Lo;")
    public static class24 field7347;

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "Ljn;")
    public class507 field7345;

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "Ljn;")
    public class507 field7346;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)V", line = 12)
    public final void method3022(byte arg0) {
        field7344++;
        if (this.field7346 == null) {
            return;
        }
        if (arg0 != 54) {
            method3023(101);
        }
        this.field7346.field7345 = this.field7345;
        this.field7345.field7346 = this.field7346;
        this.field7346 = null;
        this.field7345 = null;
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)V", line = 29)
    public static void method3023(int arg0) {
        field7347 = null;
        if (arg0 != 18995) {
            field7351 = false;
        }
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(B)Z", line = 49)
    public final boolean method3024(byte arg0) {
        field7349++;
        if (this.field7346 == null) {
            return false;
        } else {
            int var2 = 123 % ((arg0 + 49) / 61);
            return true;
        }
    }
}
