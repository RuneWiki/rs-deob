import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public abstract class class5 {

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public int field68;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public int field69;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public int field70;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public int field73;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public int field74;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public int field75;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ltl;I)Z", line = 4)
    public static final boolean method27(class197 arg0, int arg1) {
        if (arg1 <= 10) {
            method29((byte) 117);
        }
        field76++;
        if (arg0.field3392 == 205) {
            class79.field1279 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)I", line = 31)
    public static final int method29(byte arg0) {
        if (arg0 >= -9) {
            return 61;
        } else {
            field72++;
            return class32.field515;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIBII[[I)I", line = 69)
    public static final int method30(int arg0, int arg1, byte arg2, int arg3, int arg4, int[][] arg5) {
        int var6 = -91 / ((-arg2 - 54) / 41);
        int var7 = (128 - arg3) * arg5[arg1][arg4 + 1] + (arg5[arg1 + 1][arg4 + 1] * arg3) >> 7;
        field71++;
        int var8 = (128 - arg3) * arg5[arg1][arg4] + (arg5[arg1 + 1][arg4] * arg3) >> 7;
        return (128 - arg0) * var8 + arg0 * var7 >> 7;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V")
    public abstract void method28(int arg0, int arg1);

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)V")
    public abstract void method31(int arg0, int arg1, int arg2);
}
