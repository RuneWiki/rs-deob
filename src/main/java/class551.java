import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public abstract class class551 extends class55 {

    @OriginalMember(owner = "client!cba", name = "o", descriptor = "I")
    private int field7797;

    @OriginalMember(owner = "client!cba", name = "r", descriptor = "I")
    public int field7800;

    @OriginalMember(owner = "client!cba", name = "x", descriptor = "I")
    private int field7806;

    @OriginalMember(owner = "client!cba", name = "p", descriptor = "F")
    public float field7798;

    @OriginalMember(owner = "client!cba", name = "s", descriptor = "I")
    public int field7801;

    @OriginalMember(owner = "client!cba", name = "k", descriptor = "I")
    public int field7793;

    @OriginalMember(owner = "client!cba", name = "w", descriptor = "Lkk;")
    public static class192 field7805 = new class192();

    @OriginalMember(owner = "client!cba", name = "y", descriptor = "Ljava/lang/String;")
    public static String field7807 = "";

    @OriginalMember(owner = "client!cba", name = "l", descriptor = "I")
    public static int field7794;

    @OriginalMember(owner = "client!cba", name = "m", descriptor = "I")
    public static int field7795;

    @OriginalMember(owner = "client!cba", name = "n", descriptor = "I")
    public static int field7796;

    @OriginalMember(owner = "client!cba", name = "q", descriptor = "I")
    public static int field7799;

    @OriginalMember(owner = "client!cba", name = "t", descriptor = "I")
    public static int field7802;

    @OriginalMember(owner = "client!cba", name = "u", descriptor = "I")
    public static int field7803;

    @OriginalMember(owner = "client!cba", name = "v", descriptor = "I")
    public static int field7804;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)I", line = 3)
    public final int method3130(int arg0) {
        if (arg0 != 7019) {
            method3132(70);
        }
        field7794++;
        return this.field7800;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Z)F", line = 19)
    public final float method3131(boolean arg0) {
        field7802++;
        return arg0 ? -0.407301F : this.field7798;
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)V", line = 32)
    public static void method3132(int arg0) {
        if (arg0 == -3509) {
            field7807 = null;
            field7805 = null;
        }
    }

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "(I)I", line = 44)
    public final int method3133(int arg0) {
        field7804++;
        int var2 = 10 % ((66 - arg0) / 58);
        return this.field7806;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIIIIIIII)Z", line = 58)
    public static final boolean method3134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field7796++;
        if (arg5 >= (arg0 + arg1) || arg0 >= (arg5 + arg8)) {
            return false;
        } else if (arg4 + arg6 > arg3 && arg6 < arg3 + arg7) {
            return arg2 >= -100 ? true : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)I", line = 76)
    public final int method3135(byte arg0) {
        field7799++;
        if (arg0 != -78) {
            field7805 = null;
        }
        return this.field7797;
    }

    @OriginalMember(owner = "client!cba", name = "e", descriptor = "(I)I", line = 88)
    public final int method3136(int arg0) {
        field7795++;
        if (arg0 != 28699) {
            this.field7797 = -23;
        }
        return this.field7801;
    }

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "(B)I", line = 103)
    public final int method3137(byte arg0) {
        field7803++;
        if (arg0 < 68) {
            method3134(-59, -92, -21, -124, 59, -109, 69, 61, -32);
        }
        return this.field7793;
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(IIIIIF)V", line = 122)
    public class551(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field7797 = arg4;
        this.field7800 = arg0;
        this.field7806 = arg3;
        this.field7798 = arg5;
        this.field7801 = arg2;
        this.field7793 = arg1;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IBII)V")
    public abstract void method2926(int arg0, byte arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(FI)V")
    public abstract void method2921(float arg0, int arg1);
}
