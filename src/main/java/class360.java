import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class360 extends class381 {

    @OriginalMember(owner = "client!ho", name = "y", descriptor = "I")
    private int field4888;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
    public int field4880;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
    public int field4875;

    @OriginalMember(owner = "client!ho", name = "z", descriptor = "I")
    public int field4889;

    @OriginalMember(owner = "client!ho", name = "x", descriptor = "I")
    public int field4887;

    @OriginalMember(owner = "client!ho", name = "C", descriptor = "I")
    private int field4892;

    @OriginalMember(owner = "client!ho", name = "B", descriptor = "I")
    private int field4891;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
    private int field4876;

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
    private int field4879;

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field4878 = new String[100];

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "[I")
    public static int[] field4882 = new int[100];

    @OriginalMember(owner = "client!ho", name = "v", descriptor = "I")
    public static volatile int field4885 = 0;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!ho", name = "t", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!ho", name = "u", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!ho", name = "w", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!ho", name = "A", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!ho", name = "F", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!ho", name = "G", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!ho", name = "D", descriptor = "Lkb;")
    public static class80 field4893;

    @OriginalMember(owner = "client!ho", name = "H", descriptor = "[I")
    public static int[] field4897;

    @OriginalMember(owner = "client!ho", name = "E", descriptor = "[[B")
    public static byte[][] field4894;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IBII)Z")
    public final boolean method2256(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 22) {
            this.field4887 = 88;
        }
        field4884++;
        return this.field4892 == arg0 && arg2 >= this.field4891 && arg2 <= this.field4879 && arg3 >= this.field4876 && this.field4888 >= arg3;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(BII)Z")
    public final boolean method2257(byte arg0, int arg1, int arg2) {
        field4883++;
        if (arg0 >= -106) {
            this.field4876 = 127;
        }
        return arg2 >= this.field4891 && arg2 <= this.field4879 && this.field4876 <= arg1 && this.field4888 >= arg1;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(III[I)V")
    public final void method2258(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = this.field4876 + arg2 - this.field4875;
        arg3[1] = this.field4891 + arg0 - this.field4880;
        if (arg1 < -30) {
            field4895++;
            arg3[0] = this.field4892;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IZI)Z")
    public final boolean method2259(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field4889 = -7;
        }
        field4890++;
        return arg0 >= this.field4880 && arg0 <= this.field4889 && this.field4875 <= arg2 && arg2 <= this.field4887;
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V")
    public static final void method2260(int arg0) {
        field4886++;
        if (class421.field5896.length() == 0) {
            return;
        }
        class285.method1796(-11011, "--> " + class421.field5896);
        class368.method2297(false, class421.field5896, (byte) 58);
        if (arg0 <= -60) {
            class421.field5896 = "";
            class148.field2271 = 0;
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(III[I)V")
    public final void method2261(int arg0, int arg1, int arg2, int[] arg3) {
        if (arg2 < -28) {
            arg3[2] = arg1 - (this.field4876 - this.field4875);
            arg3[1] = this.field4880 - (this.field4891 - arg0);
            arg3[0] = 0;
            field4881++;
        }
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(B)V")
    public static void method2262(byte arg0) {
        field4882 = null;
        field4897 = null;
        field4893 = null;
        field4878 = null;
        if (arg0 != 115) {
            field4893 = null;
        }
        field4894 = null;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field4888 = arg4;
        this.field4880 = arg5;
        this.field4875 = arg6;
        this.field4889 = arg7;
        this.field4887 = arg8;
        this.field4892 = arg0;
        this.field4891 = arg1;
        this.field4876 = arg2;
        this.field4879 = arg3;
    }
}
