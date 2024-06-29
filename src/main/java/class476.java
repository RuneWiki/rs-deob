import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class476 {

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "Ljava/lang/String;")
    public static String field6886 = null;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field6885;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "J")
    public long field6883;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "Luj;")
    public class476 field6879;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "Luj;")
    public class476 field6884;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "[I")
    public static int[] field6880;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Z")
    public final boolean method2790(int arg0) {
        field6881++;
        if (arg0 > -61) {
            this.field6883 = -64L;
        }
        return this.field6879 != null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public final void method2791(byte arg0) {
        field6885++;
        if (this.field6879 == null) {
            return;
        }
        if (arg0 != 112) {
            this.method2791((byte) 6);
        }
        this.field6879.field6884 = this.field6884;
        this.field6884.field6879 = this.field6879;
        this.field6884 = null;
        this.field6879 = null;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V")
    public static void method2792(byte arg0) {
        field6880 = null;
        field6886 = null;
        if (arg0 <= 38) {
            field6886 = null;
        }
    }
}
