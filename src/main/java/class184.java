import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class184 extends class180 {

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    private final int field3193;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    private final int field3194;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
    private final int field3196;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    private final int field3187;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field3189 = 0;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "Lkm;")
    public static class328 field3186;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "Z")
    public static boolean field3191;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V", line = 6)
    public static final void method1255(byte arg0) {
        field3192++;
        if (class16.field253 == 5) {
            if (arg0 != 54) {
                field3191 = false;
            }
            class16.field253 = 6;
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(IIIIII)V", line = 34)
    public class184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3193 = arg0;
        this.field3194 = arg2;
        this.field3196 = arg3;
        this.field3187 = arg1;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)V", line = 47)
    public final void method787(int arg0, int arg1, int arg2) {
        field3190++;
        int var4 = 51 % ((-arg0 - 20) / 52);
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(III)V", line = 58)
    public final void method789(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            field3189 = -12;
        }
        field3197++;
        int var4 = this.field3194 * arg2 >> 12;
        int var5 = this.field3187 * arg1 >> 12;
        int var6 = this.field3196 * arg1 >> 12;
        int var7 = this.field3193 * arg2 >> 12;
        class3.method17(-14023, var4, var6, var7, this.field3122, var5);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 76)
    public static void method1256(int arg0) {
        field3186 = null;
        if (arg0 > -24) {
            method1256(-88);
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(III)V", line = 87)
    public final void method786(int arg0, int arg1, int arg2) {
        if (arg1 < 71) {
            field3188 = -31;
        }
        field3195++;
    }
}
