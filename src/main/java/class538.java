import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class538 {

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "[I")
    private int[] field7447;

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "I")
    public static int field7451;

    @OriginalMember(owner = "client!uca", name = "f", descriptor = "I")
    public static int field7452;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(BI)I", line = 5)
    public final int method3119(byte arg0, int arg1) {
        field7452++;
        int var3 = (this.field7447.length >> 1) - 1;
        int var4 = var3 & arg1;
        if (arg0 != 36) {
            return 52;
        }
        while (true) {
            int var5 = this.field7447[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field7447[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!uca", name = "<init>", descriptor = "([I)V", line = 36)
    public class538(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field7447 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field7447[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field7447[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field7447[var5 + var5] = arg0[var4];
            this.field7447[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(BII)V", line = 73)
    public static final void method3120(byte arg0, int arg1, int arg2) {
        field7449++;
        class220.field2858 = arg1;
        if (arg0 >= -57) {
            method3120((byte) -47, -59, 68);
        }
        class265.field3899 = arg2;
        if (class206.field2664 == 0) {
            class169.field2222 = class279.field4038 * 2 + class265.field3899;
            class776.field10671 = class719.field9783 * 2 + class220.field2858;
        } else if (class206.field2664 == 1) {
            class1.field2 = class265.field3899 / class533.field7397 + class56.field682 + 2;
            class441.field6352 = class220.field2858 / class607.field8210 + class520.field7234 + 2;
            class169.field2222 = class533.field7397 * class1.field2;
            class776.field10671 = class607.field8210 * class441.field6352;
            class719.field9783 = class776.field10671 - class220.field2858 >> 1;
            class279.field4038 = class169.field2222 - class265.field3899 >> 1;
        } else if (class206.field2664 == 2) {
            class169.field2222 = class265.field3899;
            class776.field10671 = class220.field2858;
            return;
        }
    }
}
