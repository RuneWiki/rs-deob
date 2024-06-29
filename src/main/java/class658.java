import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class658 {

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public int field8876 = 128;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public int field8878 = 128;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public int field8879;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public int field8873;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public int field8871;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public int field8880;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "[I")
    public static int[] field8874 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field8875 = -1;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field8870;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field8872;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field8877;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZLjk;)V")
    public final void method3653(boolean arg0, class658 arg1) {
        this.field8873 = arg1.field8873;
        field8870++;
        this.field8879 = arg1.field8879;
        this.field8880 = arg1.field8880;
        this.field8876 = arg1.field8876;
        if (arg0) {
            this.field8871 = arg1.field8871;
            this.field8878 = arg1.field8878;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)Ljk;")
    public final class658 method3654(boolean arg0) {
        field8877++;
        if (!arg0) {
            this.field8871 = -79;
        }
        return new class658(this.field8879, this.field8878, this.field8876, this.field8880, this.field8873, this.field8871);
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(I)V")
    public class658(int arg0) {
        this.field8879 = arg0;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
    public static void method3655(byte arg0) {
        field8874 = null;
        int var1 = -21 / ((-arg0 - 46) / 47);
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(IIIIII)V")
    private class658(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8873 = arg4;
        this.field8876 = arg2;
        this.field8871 = arg5;
        this.field8880 = arg3;
        this.field8879 = arg0;
        this.field8878 = arg1;
    }
}
