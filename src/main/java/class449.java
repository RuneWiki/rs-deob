import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class449 extends class260 {

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "[I")
    public static int[] field6269 = new int[4096];

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field6274;

    static {
        for (int var0 = 0; var0 < 4096; ++var0) {
            field6269[var0] = class132.method1054(var0, 0);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)I", line = 6)
    public final int method4(int arg0, byte arg1) {
        ++field6274;
        int var3 = 121 % ((-53 - arg1) / 50);
        return 1;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V", line = 16)
    public static final void method2684(int arg0, int arg1, int arg2) {
        if (arg2 <= 119) {
            field6269 = null;
        }
        ++field6272;
        if (class302.method1905((byte) -48)) {
            if (class450.field6276 != arg1) {
                class652.field9041 = "";
            }
            class39.field623 = arg0;
            class450.field6276 = arg1;
            class300.method1901(6, 2);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)I", line = 52)
    public final int method8(byte arg0) {
        if (arg0 != 4) {
            field6269 = null;
        }
        ++field6271;
        return 3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V", line = 63)
    public final void method2(boolean arg0) {
        if (arg0) {
            this.method4(-21, (byte) 91);
        }
        if (~super.field3868 > -1 || ~super.field3868 < -5) {
            super.field3868 = this.method8((byte) 4);
        }
        ++field6268;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(ILfca;)V", line = 78)
    public class449(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(IB)V", line = 89)
    public final void method9(int arg0, byte arg1) {
        if (arg1 == -107) {
            ++field6270;
            super.field3868 = arg0;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)I", line = 101)
    public final int method2685(int arg0) {
        if (arg0 < 3) {
            this.method8((byte) 67);
        }
        ++field6273;
        return super.field3868;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V", line = 112)
    public static void method2686(int arg0) {
        field6269 = null;
        if (arg0 != 6) {
            method2684(101, -50, 72);
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lfca;)V", line = 122)
    public class449(class92 arg0) {
        super(arg0);
    }
}
