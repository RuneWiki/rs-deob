import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class570 {

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "I")
    public int field7910;

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
    private int field7915;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
    public static int field7911;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
    public static int field7912;

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
    public static int field7913;

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "I")
    public static int field7916;

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "I")
    public static int field7917;

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "Lgga;")
    public static class513 field7914;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
    public static void method3299(byte arg0) {
        if (arg0 > -106) {
            field7912 = -109;
        }
        field7914 = null;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIJIILgga;Z)V")
    public static final void method3300(int arg0, int arg1, long arg2, int arg3, int arg4, class513 arg5, boolean arg6) {
        class398.method2368(arg1, arg0, 1, arg2, arg6, arg4, arg3, arg5);
        field7913++;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
    public static final void method3301(int arg0) {
        field7911++;
        if (arg0 >= 43) {
            class390.field5440.method498(class775.field10665);
            class390.field5440.method449(class646.field9185, class641.field9023, class445.field6155, class510.field7014);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z)I")
    public final int method3302(boolean arg0) {
        if (!arg0) {
            this.method3302(false);
        }
        field7917++;
        return this.field7915;
    }

    @OriginalMember(owner = "client!sv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7916++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(II)V")
    public class570(int arg0, int arg1) {
        this.field7910 = arg1;
        this.field7915 = arg0;
    }
}
