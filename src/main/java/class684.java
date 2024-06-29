import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class684 extends class111 {

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    private int field9764;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
    private int field9769;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    private int field9770;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    private int field9762;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "[B")
    public static byte[] field9763 = new byte[32896];

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    public static int field9765;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public static int field9766;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public static int field9767;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    public static int field9768;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBI)V")
    public final void method807(int arg0, byte arg1, int arg2) {
        if (arg1 == -21) {
            ++field9765;
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(IIIIII)V")
    public class684(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field9764 = arg2;
        this.field9769 = arg1;
        this.field9770 = arg3;
        this.field9762 = arg0;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V")
    public static void method3872(int arg0) {
        if (arg0 != -22888) {
            field9763 = null;
        }
        field9763 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)V")
    public static final void method3873(int arg0, byte arg1) {
        class455.field6320 = arg0;
        ++field9768;
        class462.field6369.method3749(7648);
        if (arg1 != -19) {
            method3872(89);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)V")
    public final void method804(int arg0, int arg1, int arg2) {
        ++field9766;
        int var4 = this.field9762 * arg0 >> 12;
        int var5 = this.field9764 * arg0 >> 12;
        int var6 = this.field9769 * arg1 >> 12;
        if (arg2 < 84) {
            field9763 = null;
        }
        int var7 = this.field9770 * arg1 >> 12;
        class576.method3290(var6, super.field1538, var4, true, var7, var5);
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(III)V")
    public final void method806(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field9763 = null;
        }
        ++field9767;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; ~var1 <= ~var2; ++var2) {
                field9763[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
    }
}
