import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class542 {

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "Lnc;")
    private class26 field7501;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "Lgj;")
    private class659 field7500;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "[I")
    public static int[] field7496;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)V")
    public static final void method3130(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        field7499++;
        class758.field10380 = arg0;
        class211.field2713 = new class150[class308.field4373[class758.field10380] + 1];
        if (arg1 != -1) {
            field7496 = null;
        }
        class600.field8183 = 0;
        class273.field3974 = 0;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)V")
    public static final void method3131(boolean arg0) {
        class714.method3955(16, -1, 255);
        if (!arg0) {
            method3131(false);
        }
        field7498++;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
    public static void method3132(int arg0) {
        if (arg0 == -18087) {
            field7496 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
    public class542() {
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)Lgj;")
    public final class659 method3133(byte arg0) {
        field7497++;
        class659 var2 = this.field7501.field259.field8885;
        if (this.field7501.field259 == var2) {
            this.field7500 = null;
            return null;
        }
        this.field7500 = var2.field8885;
        if (arg0 >= -61) {
            this.field7500 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)Lgj;")
    public final class659 method3134(byte arg0) {
        field7495++;
        class659 var2 = this.field7500;
        if (this.field7501.field259 == var2) {
            this.field7500 = null;
            return null;
        }
        this.field7500 = var2.field8885;
        if (arg0 != 54) {
            this.field7500 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lnc;)V")
    public class542(class26 arg0) {
        this.field7501 = arg0;
    }
}
