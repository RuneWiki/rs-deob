import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class73 {

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    private int field1082;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "Lgo;")
    public static class441 field1084 = new class441(11, 0, 1, 2);

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Lri;")
    public static class73 field1085 = new class73(64, 8);

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "Lic;")
    public static class491 field1086;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Lmo;")
    public static final class526 method418(int arg0, int arg1) {
        field1079++;
        class526 var2 = (class526) class285.field4093.method145((long) arg0, (byte) -11);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class297.field4228.method2945(arg0, 0, true);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class526 var4 = class449.method2712(-19364, var3);
            class285.field4093.method151(arg1, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ri", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1081++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method419(int arg0) {
        field1085 = null;
        if (arg0 > -12) {
            method418(115, -23);
        }
        field1084 = null;
        field1086 = null;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)I")
    public final int method420(int arg0) {
        if (arg0 != 1) {
            this.toString();
        }
        field1080++;
        return this.field1082;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(II)V")
    public class73(int arg0, int arg1) {
        this.field1082 = arg0;
        this.field1083 = arg1;
    }
}
