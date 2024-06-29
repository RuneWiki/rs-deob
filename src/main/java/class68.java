import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class68 extends class194 {

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    private int field1015;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    private int field1020;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    private int field1024;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    private int field1016;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field1017 = 0;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "Ljava/lang/String;")
    public static String field1025 = "Loading interfaces - ";

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Lik;")
    public static class410 field1018 = new class410(260);

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "[I")
    public static int[] field1027 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "Lik;")
    public static class410 field1026 = new class410(50);

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    public static int field1028 = 0;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V", line = 6)
    public static final void method589(int arg0) {
        class134.field1897 = new class63(class199.field2839, "", class124.field1733, 1002, 0L, 0, 0);
        ++field1023;
        if (arg0 < 55) {
            field1028 = 11;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V", line = 19)
    public static void method590(byte arg0) {
        field1026 = null;
        field1027 = null;
        field1018 = null;
        field1025 = null;
        if (arg0 != 53) {
            field1018 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(II)I", line = 34)
    public static final int method591(int arg0, int arg1) {
        return class122.field1712 != null ? class122.field1712[arg0][arg1] >>> 21 & 2040 : 0;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(III)V", line = 37)
    public final void method592(int arg0, int arg1, int arg2) {
        if (arg0 != 50000) {
            field1026 = null;
        }
        ++field1022;
        int var4 = this.field1015 * arg1 >> 12;
        int var5 = this.field1016 * arg1 >> 12;
        int var6 = this.field1020 * arg2 >> 12;
        int var7 = this.field1024 * arg2 >> 12;
        class74.method642(var5, arg0 ^ -62228, var7, super.field2782, var6, super.field2788, var4);
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IIIIIII)V", line = 59)
    public class68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1015 = arg0;
        this.field1020 = arg1;
        this.field1024 = arg3;
        this.field1016 = arg2;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIB)V", line = 71)
    public final void method593(int arg0, int arg1, byte arg2) {
        ++field1021;
        int var4 = this.field1015 * arg0 >> 12;
        int var5 = this.field1016 * arg0 >> 12;
        int var6 = this.field1020 * arg1 >> 12;
        int var7 = this.field1024 * arg1 >> 12;
        class419.method2589(var4, var7, super.field2787, 49, var6, var5);
        if (arg2 <= 5) {
            this.field1020 = 112;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V", line = 90)
    public final void method594(int arg0, int arg1, int arg2) {
        ++field1019;
        if (arg0 <= -29) {
            int var4 = this.field1015 * arg1 >> 12;
            int var5 = this.field1016 * arg1 >> 12;
            int var6 = this.field1020 * arg2 >> 12;
            int var7 = this.field1024 * arg2 >> 12;
            class241.method1597(var4, var6, var7, super.field2787, super.field2782, var5, -1, super.field2788);
        }
    }
}
