import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class288 {

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "I")
    public int field4128;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "I")
    public static int field4124 = 0;

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "J")
    public static long field4125 = -1L;

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!ww", name = "d", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!ww", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4127++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)V")
    public static final void method1905(byte arg0) {
        field4126++;
        if (class449.field6212) {
            return;
        }
        class449.field6212 = true;
        class679.field9449 += (12.0F - class679.field9449) / 2.0F;
        class397.field5710 = true;
        if (arg0 < 76) {
            method1905((byte) -120);
        }
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(II)V")
    public class288(int arg0, int arg1) {
        this.field4128 = arg1;
    }
}
