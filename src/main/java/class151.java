import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class151 {

    @OriginalMember(owner = "client!as", name = "d", descriptor = "I")
    public int field2141;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public int field2139;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public int field2144;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public int field2145;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public static int field2140 = 0;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "[Liaa;")
    public static class494[] field2142 = new class494[14];

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
    public static void method1026(int arg0) {
        int var1 = -97 / ((58 - arg0) / 54);
        field2142 = null;
    }

    @OriginalMember(owner = "client!as", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2147++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(IIII)V")
    public class151(int arg0, int arg1, int arg2, int arg3) {
        this.field2141 = arg2;
        this.field2139 = arg3;
        this.field2144 = arg0;
        this.field2145 = arg1;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lhha;I)V")
    public static final void method1027(class519 arg0, int arg1) {
        field2143++;
        class232.field3138.method2770((byte) -13, arg0);
        if (arg1 < -4) {
            arg0.field7379 = arg0.field7384.field9146;
            class176.field2372 += arg0.field7379;
            arg0.field7384.field9146 = 0;
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)Z")
    public static final boolean method1028(int arg0) {
        field2138++;
        return arg0 >= ~class222.field2897;
    }
}
