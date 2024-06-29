import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class533 {

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "Ldha;")
    private class84 field7255;

    @OriginalMember(owner = "client!bda", name = "f", descriptor = "J")
    public static long field7259 = 1L;

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "Lee;")
    public static class706 field7257 = new class706(32);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "Ltia;")
    private class281 field7256;

    @OriginalMember(owner = "client!bda", name = "g", descriptor = "Lmn;")
    public static class388 field7260;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)Ltia;")
    public final class281 method3051(byte arg0) {
        field7258++;
        if (arg0 < 51) {
            return null;
        }
        class281 var2 = this.field7255.field1176.field4146;
        if (this.field7255.field1176 == var2) {
            this.field7256 = null;
            return null;
        } else {
            this.field7256 = var2.field4146;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V")
    public static void method3052(int arg0) {
        field7257 = null;
        field7260 = null;
        int var1 = -120 % ((-arg0 - 46) / 33);
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)Ltia;")
    public final class281 method3053(int arg0) {
        if (arg0 != 7782) {
            return null;
        }
        field7254++;
        class281 var2 = this.field7256;
        if (this.field7255.field1176 == var2) {
            this.field7256 = null;
            return null;
        } else {
            this.field7256 = var2.field4146;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bda", name = "<init>", descriptor = "()V")
    public class533() {
    }

    @OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Ldha;)V")
    public class533(class84 arg0) {
        this.field7255 = arg0;
    }
}
