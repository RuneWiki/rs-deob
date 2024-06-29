import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class303 {

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
    public int field4216;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
    private int field4214;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)I")
    public final int method1966(byte arg0) {
        if (arg0 <= 108) {
            this.field4214 = 110;
        }
        field4213++;
        return this.field4214;
    }

    @OriginalMember(owner = "client!mu", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4217++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(II)V")
    public class303(int arg0, int arg1) {
        this.field4216 = arg1;
        this.field4214 = arg0;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BI)Lbo;")
    public static final class727 method1967(byte arg0, int arg1) {
        field4215++;
        if (arg0 != 95) {
            method1967((byte) 120, -75);
        }
        return new class727(arg1, false);
    }
}
