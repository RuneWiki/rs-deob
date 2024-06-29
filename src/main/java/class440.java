import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class440 {

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "Lsu;")
    private class192 field6201;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
    public static int field6200 = 0;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "Z")
    public static boolean field6198 = false;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "Lia;")
    private class539 field6205;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)Lia;", line = 6)
    public final class539 method2522(int arg0) {
        field6199++;
        if (arg0 != 0) {
            this.method2524(-103);
        }
        class539 var2 = this.field6201.field2826.field7315;
        if (this.field6201.field2826 == var2) {
            this.field6205 = null;
            return null;
        } else {
            this.field6205 = var2.field7315;
            return var2;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lsu;I)V", line = 26)
    public final void method2523(class192 arg0, int arg1) {
        this.field6201 = arg0;
        field6203++;
        if (arg1 != 17333) {
            this.field6205 = null;
        }
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)Lia;", line = 50)
    public final class539 method2524(int arg0) {
        field6202++;
        class539 var2 = this.field6205;
        if (this.field6201.field2826 == var2) {
            this.field6205 = null;
            return null;
        }
        if (arg0 != 20017) {
            this.method2523(null, -123);
        }
        this.field6205 = var2.field7315;
        return var2;
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "()V", line = 73)
    public class440() {
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lsu;)V", line = 75)
    public class440(class192 arg0) {
        this.field6201 = arg0;
    }
}
