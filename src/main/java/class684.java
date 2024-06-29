import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class684 {

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "[I")
    public static int[] field9620 = new int[2048];

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "Z")
    public static boolean field9622 = false;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "Ldb;")
    public static class298 field9624 = new class298(97, 12);

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public int field9621;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public static int field9623;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "Lag;")
    public class641 field9619;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "Lbo;")
    public class684 field9618;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "[Ld;")
    public static class139[] field9625;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
    public static void method3808(int arg0) {
        if (arg0 != -29244) {
            method3808(75);
        }
        field9620 = null;
        field9624 = null;
        field9625 = null;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
    public final void method3809(int arg0) {
        field9623++;
        if (class642.field8624 >= 500) {
            return;
        }
        this.field9618 = class65.field991;
        this.field9619 = null;
        this.field9621 = 0;
        if (arg0 != 2048) {
            this.method3809(-4);
        }
        class65.field991 = this;
        class642.field8624++;
    }
}
