import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class63 {

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public int field893;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Lui;")
    public static class375 field889 = new class375("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field894 = 0;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "[I")
    public static int[] field895;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "[Lf;")
    public static class191[] field892;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ltl;I)Lot;")
    public static final class495 method429(class91 arg0, int arg1) {
        field891++;
        class495 var2 = new class495();
        if (arg1 == 17094) {
            var2.field7235 = arg0.method631(arg1 ^ 0x6A38);
            var2.field7237 = class84.field1147.method3057(arg1 - 17030, var2.field7235);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field890++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class63(String arg0, int arg1) {
        this.field893 = arg1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static void method430(byte arg0) {
        field895 = null;
        if (arg0 > -56) {
            field889 = null;
        }
        field889 = null;
        field892 = null;
    }
}
