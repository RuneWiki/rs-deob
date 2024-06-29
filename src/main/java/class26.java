import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class26 {

    @OriginalMember(owner = "client!db", name = "b", descriptor = "[I")
    public static int[] field461 = new int[1000];

    @OriginalMember(owner = "client!db", name = "h", descriptor = "Z")
    public static boolean field467 = true;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Lfo;")
    public class228 field460;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Ldb;")
    public class26 field463;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 5)
    public static void method321(int arg0) {
        if (arg0 != 2) {
            field467 = true;
        }
        field461 = null;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)I", line = 27)
    public static final int method322(int arg0) {
        field466++;
        if (arg0 != 22935) {
            method321(-11);
        }
        return 2;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V", line = 39)
    public final void method323(int arg0) {
        field462++;
        if (class338.field4588 >= 500) {
            return;
        }
        this.field464 = arg0;
        this.field463 = class412.field5768;
        this.field460 = null;
        class338.field4588++;
        class412.field5768 = this;
    }
}
