import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public abstract class class4 {

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
    public int field31;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "[B")
    public static byte[] field30;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(III)V")
    public abstract void method19(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIII)I")
    public static final int method20(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= -61) {
            return 101;
        }
        field29++;
        if ((class690.field9676[arg1][arg2][arg3] & 0x8) == 0) {
            return arg1 <= 0 || (class690.field9676[1][arg2][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(III)V")
    public abstract void method21(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIB)V")
    public abstract void method22(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)V")
    public static void method23(byte arg0) {
        if (arg0 == 105) {
            field30 = null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(III)V")
    public class4(int arg0, int arg1, int arg2) {
        this.field31 = arg2;
        this.field28 = arg1;
        this.field32 = arg0;
    }
}
