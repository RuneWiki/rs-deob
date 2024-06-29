import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class262 {

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    private int field3475 = 0;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "Lad;")
    private class268 field3476;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "[I")
    public static int[] field3479 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "Lr;")
    public static class110 field3477;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "Lag;")
    private class445 field3480;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIB)V", line = 6)
    public static final void method1485(int arg0, int arg1, byte arg2) {
        if (arg2 != -42) {
            return;
        }
        field3482++;
        class27 var3 = class177.field2408[arg0][arg1];
        if (var3 != null) {
            class429.field5856 = var3.field349;
            class196.field2669 = var3.field363;
            class70.field966 = var3.field356;
        }
        class306.method1698(true);
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lad;)V", line = 80)
    public class262(class268 arg0) {
        this.field3476 = arg0;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)Lag;", line = 31)
    public final class445 method1486(boolean arg0) {
        field3478++;
        if (this.field3475 > 0 && this.field3476.field3573[this.field3475 - 1] != this.field3480) {
            class445 var2 = this.field3480;
            this.field3480 = var2.field6046;
            return var2;
        }
        while (this.field3475 < this.field3476.field3567) {
            class445 var3 = this.field3476.field3573[this.field3475++].field6046;
            if (this.field3476.field3573[this.field3475 - 1] != var3) {
                this.field3480 = var3.field6046;
                return var3;
            }
        }
        if (arg0) {
            field3477 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)Lag;", line = 68)
    public final class445 method1487(int arg0) {
        field3481++;
        if (arg0 > -66) {
            return null;
        } else {
            this.field3475 = 0;
            return this.method1486(false);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 88)
    public static void method1488(byte arg0) {
        field3479 = null;
        field3477 = null;
        if (arg0 != -2) {
            field3479 = null;
        }
    }
}
