import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class437 {

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IJ)V")
    public static final void method2503(int arg0, long arg1) {
        field5738++;
        try {
            Thread.sleep(arg1);
            if (arg0 != 27090) {
                method2503(19, -69L);
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(II)V")
    public class437(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!bt", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5737++;
        throw new IllegalStateException();
    }
}
