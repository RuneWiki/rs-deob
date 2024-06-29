import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class487 {

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "[Ljava/lang/String;")
    private String[] field7379;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "Lqp;")
    public static class586 field7376 = new class586(82, -2);

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "Lpm;")
    public static class129 field7382 = new class129();

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "[[B")
    public static byte[][] field7384 = new byte[50][];

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field7385 = 0;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field7377;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field7378;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field7381;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "[B")
    public static byte[] field7380;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIZIIIII)V")
    public static final void method2951(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field7378++;
        if (arg2 >= class130.field1712 && class401.field5755 >= arg2 && class130.field1712 <= arg6 && arg6 <= class401.field5755 && arg0 >= class130.field1712 && class401.field5755 >= arg0 && class130.field1712 <= arg7 && arg7 <= class401.field5755 && class483.field7334 <= arg8 && class202.field3021 >= arg8 && arg1 >= class483.field7334 && class202.field3021 >= arg1 && arg9 >= class483.field7334 && arg9 <= class202.field3021 && class483.field7334 <= arg3 && arg3 <= class202.field3021) {
            class644.method3725(11138, arg3, arg8, arg6, arg2, arg1, arg7, arg9, arg5, arg0);
        } else {
            class412.method2446(arg1, arg5, arg8, arg9, arg3, -6706, arg6, arg7, arg0, arg2);
        }
        if (!arg4) {
            field7382 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public static void method2952(int arg0) {
        field7382 = null;
        if (arg0 < 33) {
            method2951(94, -84, -112, 99, true, -122, -71, -126, 66, -99);
        }
        field7376 = null;
        field7380 = null;
        field7384 = null;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class487(String arg0, String arg1, String arg2, String arg3) {
        this.field7379 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method2953(int arg0, int arg1) {
        field7377++;
        if (arg0 != 3181) {
            field7382 = null;
        }
        return this.field7379[arg1];
    }

    @OriginalMember(owner = "client!nj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7381++;
        throw new IllegalStateException();
    }
}
