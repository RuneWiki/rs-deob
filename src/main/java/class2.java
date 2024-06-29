import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 {

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public int field367;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "Lro;")
    public static class2 field369 = new class2(1);

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "Lro;")
    public static class2 field370 = new class2(2);

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "Lro;")
    public static class2 field371 = new class2(4);

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "Lro;")
    public static class2 field372 = new class2(1);

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "Lro;")
    public static class2 field373 = new class2(2);

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "Lro;")
    public static class2 field374 = new class2(4);

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "Lro;")
    public static class2 field375 = new class2(2);

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "Lro;")
    public static class2 field376 = new class2(4);

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "Lqfa;")
    public static class85 field377 = new class85(13, 17);

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "[I")
    public static int[] field379 = new int[5];

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "Lof;")
    public static class577 field378;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIIIII)Z")
    public static final boolean method187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field366++;
        if (arg3 != 2) {
            return true;
        } else if (arg0 + arg8 > arg2 && arg2 + arg4 > arg8) {
            return arg1 + arg5 > arg7 && arg1 < (arg6 + arg7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)V")
    public static void method188(boolean arg0) {
        field377 = null;
        field373 = null;
        field372 = null;
        if (!arg0) {
            method187(90, -24, -4, 89, -80, -109, -46, 121, -90);
        }
        field375 = null;
        field378 = null;
        field374 = null;
        field379 = null;
        field369 = null;
        field371 = null;
        field376 = null;
        field370 = null;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)I")
    public static int method189(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ro", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field368++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(I)V")
    private class2(int arg0) {
        this.field367 = arg0;
    }
}
