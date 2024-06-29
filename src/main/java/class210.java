import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class210 extends class205 {

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "[B")
    public byte[] field3499;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "Ltm;")
    public static class334 field3496 = new class334(96, 0);

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "Lqi;")
    public static class291 field3498;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(II)V", line = 4)
    public static final void method1523(int arg0, int arg1) {
        if (arg0 == 96) {
            class76.field1114 = arg1;
            field3497++;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)Lqi;", line = 16)
    public static final class291 method1524(int arg0, int arg1, int arg2) {
        class114 var3 = class488.field7062[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1772;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V", line = 25)
    public static void method1525(int arg0) {
        field3498 = null;
        if (arg0 == 96) {
            field3496 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "([B)V", line = 39)
    public class210(byte[] arg0) {
        this.field3499 = arg0;
    }
}
