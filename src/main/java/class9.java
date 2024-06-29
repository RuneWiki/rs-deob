import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 {

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public int field92;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public int field86;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field89 = -1;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field88 = new Hashtable();

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "J")
    public static long field93;

    @OriginalMember(owner = "client!ff", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field87++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static void method53(int arg0) {
        field88 = null;
        if (arg0 < 119) {
            field89 = -109;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(IIII)V")
    public class9(int arg0, int arg1, int arg2, int arg3) {
        this.field92 = arg3;
        this.field91 = arg0;
        this.field86 = arg2;
        this.field90 = arg1;
    }
}
