import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class34 {

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "I")
    public static int field469 = 0;

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "Lkp;")
    public static class507 field473 = null;

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)I")
    public static final int method219(int arg0) {
        field474++;
        if (arg0 != 0) {
            field473 = null;
        }
        return class2.field17++;
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(I)V")
    public static void method220(int arg0) {
        field473 = null;
        if (arg0 != 0) {
            field473 = null;
        }
    }

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "(I)V")
    public static final void method221(int arg0) {
        if (arg0 != 6870) {
            method219(-11);
        }
        class175.field2268.method398(true);
        field472++;
        class227.field2834.method398(true);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ZB)I")
    public static final int method222(boolean arg0, byte arg1) {
        field471++;
        if (class286.field3558 == null) {
            return 0;
        } else if (arg0 || class27.field402 == null) {
            int var2 = 0;
            for (int var3 = 0; var3 < class286.field3558.length; var3++) {
                int var4 = class286.field3558[var3];
                if (class83.field1174.method3368(1912, var4)) {
                    var2++;
                }
                if (class337.field4323.method3368(1912, var4)) {
                    var2++;
                }
            }
            if (arg1 != -15) {
                field469 = 56;
            }
            return var2;
        } else {
            return class286.field3558.length * 2;
        }
    }

    @OriginalMember(owner = "client!rca", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field470++;
        throw new IllegalStateException();
    }
}
