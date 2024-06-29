import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class548 {

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    private int field7874 = 0;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "Ljo;")
    private class353 field7873;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Z")
    public static boolean field7872 = false;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field7879 = 0;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field7880 = 0;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field7877 = 0;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field7875;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field7876;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field7878;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Llq;")
    private class577 field7871;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)Llq;")
    public final class577 method3274(boolean arg0) {
        this.field7874 = 0;
        if (arg0) {
            field7876++;
            return this.method3276(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(CB)Z")
    public static final boolean method3275(char arg0, byte arg1) {
        if (arg1 < 88) {
            return false;
        } else {
            field7875++;
            return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)Llq;")
    public final class577 method3276(boolean arg0) {
        field7878++;
        if (this.field7874 > 0 && this.field7873.field4967[this.field7874 - 1] != this.field7871) {
            class577 var2 = this.field7871;
            this.field7871 = var2.field8131;
            return var2;
        }
        while (this.field7874 < this.field7873.field4954) {
            class577 var3 = this.field7873.field4967[this.field7874++].field8131;
            if (this.field7873.field4967[this.field7874 - 1] != var3) {
                this.field7871 = var3.field8131;
                return var3;
            }
        }
        return arg0 ? null : null;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    public class548() {
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Ljo;)V")
    public class548(class353 arg0) {
        this.field7873 = arg0;
    }
}
