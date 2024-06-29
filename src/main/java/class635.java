import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class635 {

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Ljava/lang/String;")
    public String field8841;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public int field8837;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Ljava/lang/String;")
    public static String field8834 = "";

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field8835;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field8836;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field8840;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "Z")
    public static boolean field8839;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public static void method3508(byte arg0) {
        if (arg0 > 15) {
            field8834 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8838++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
    public static final void method3509(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        field8840++;
        class446.field5735 = arg0;
        class679.field9367 = new class231[class590.field8008[class446.field5735] + 1];
        if (arg1 == -101) {
            class580.field7906 = 0;
            class336.field4351 = 0;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIIIBI)V")
    public static final void method3510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field8836++;
        if (class152.method1106(39, arg1)) {
            if (class160.field2005[arg1] == null) {
                class95.method725(arg2, -1, arg8, class322.field4179[arg1], arg5, arg6, arg0, arg4, (byte) -118, arg3);
            } else {
                class95.method725(arg2, -1, arg8, class160.field2005[arg1], arg5, arg6, arg0, arg4, (byte) -122, arg3);
            }
            if (arg7 < 47) {
                field8834 = null;
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class53.field719[var9] = true;
            }
        } else {
            class53.field719[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class635(String arg0, int arg1) {
        this.field8841 = arg0;
        this.field8837 = arg1;
    }
}
