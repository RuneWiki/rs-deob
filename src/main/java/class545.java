import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class545 {

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "Lwu;")
    public static class149 field8041 = new class149(1);

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "I")
    public static int field8044 = 999999;

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "I")
    public static int field8042;

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "I")
    public static int field8043;

    @OriginalMember(owner = "client!tca", name = "e", descriptor = "I")
    public static int field8045;

    @OriginalMember(owner = "client!tca", name = "f", descriptor = "I")
    public static int field8046;

    @OriginalMember(owner = "client!tca", name = "g", descriptor = "I")
    public static int field8047;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(III)Ljp;")
    public static final class361 method3192(int arg0, int arg1, int arg2) {
        class44 var3 = class603.field8695[arg0][arg1][arg2];
        return var3 == null ? null : var3.field667;
    }

    @OriginalMember(owner = "client!tca", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8043++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(III)I")
    public final int method3193(int arg0, int arg1, int arg2) {
        field8047++;
        if (arg0 != -30796) {
            field8044 = 26;
        }
        int var4 = class454.field6538 > arg1 ? class454.field6538 : arg1;
        if (class647.field9305 == this) {
            return 0;
        } else if (class68.field1068 == this) {
            return var4 - arg2;
        } else if (class592.field8598 == this) {
            return (var4 - arg2) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZLjava/lang/String;IBLjava/lang/String;)V")
    public static final void method3194(boolean arg0, String arg1, int arg2, byte arg3, String arg4) {
        class320.method1985(arg0, true, arg4, arg2, arg1, -1, -1);
        if (arg3 == 99) {
            field8042++;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)V")
    public static void method3195(int arg0) {
        field8041 = null;
        int var1 = 57 % ((-arg0 - 24) / 63);
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)V")
    public static final void method3196(int arg0) {
        class141.field2038 = new class268[50];
        field8046++;
        if (arg0 != 17399) {
            field8044 = -9;
        }
        class380.field5732 = 0;
    }
}
