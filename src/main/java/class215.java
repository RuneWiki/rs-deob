import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class215 {

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "J")
    private long field3129;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    private int field3132;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)I", line = 3)
    public final int method1401(int arg0) {
        if (arg0 != 1) {
            this.field3129 = -12L;
        }
        field3133++;
        return this.field3132;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lnk;I)V", line = 16)
    private final void method1402(class657 arg0, int arg1) {
        if (arg1 >= -118) {
            this.field3132 = -29;
        }
        this.field3129 |= (arg0.field9248 << class657.field9258 * this.field3132++);
        field3134++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)I", line = 31)
    private final int method1403(int arg0, int arg1) {
        field3130++;
        if (arg0 != -13308) {
            this.field3129 = 11L;
        }
        return (int) (this.field3129 >> class657.field9258 * arg1) & 0xF;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)Lnk;", line = 45)
    public final class657 method1404(int arg0, int arg1) {
        int var3 = 48 / ((-arg1 - 40) / 41);
        field3131++;
        return class657.method3643((byte) 35)[this.method1403(-13308, arg0)];
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lnk;)V", line = 55)
    public class215(class657 arg0) {
        this.field3129 = arg0.field9248;
        this.field3132 = 1;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([Lnk;)V", line = 64)
    public class215(class657[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method1402(arg0[var2], -120);
        }
    }
}
