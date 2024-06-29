import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public abstract class class618 {

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "I")
    public static int field8297 = -1;

    @OriginalMember(owner = "client!dia", name = "f", descriptor = "I")
    public static int field8302 = 0;

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "I")
    public static int field8299;

    @OriginalMember(owner = "client!dia", name = "d", descriptor = "I")
    public static int field8300;

    @OriginalMember(owner = "client!dia", name = "e", descriptor = "I")
    public static int field8301;

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "[I")
    public static int[] field8298;

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)V")
    public static void method3491(int arg0) {
        if (arg0 != 0) {
            method3492(90, 26, (char) 65532);
        }
        field8298 = null;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIC)I")
    public static final int method3492(int arg0, int arg1, char arg2) {
        field8300++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            char var4 = Character.toLowerCase(arg2);
            var3 = (var4 << 4) + 1;
        }
        if (arg0 != 25396) {
            field8299 = 89;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IB)I")
    public static final int method3493(int arg0, byte arg1) {
        field8301++;
        return arg1 == -12 ? arg0 & 0x7F : -17;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(BLmha;)Lmha;")
    public abstract class704 method806(byte arg0, class704 arg1);
}
