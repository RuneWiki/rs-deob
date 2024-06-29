import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class class111 {

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public int field1538;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public int field1536;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public int field1543;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "[C")
    private static char[] field1537 = new char[64];

    @OriginalMember(owner = "client!di", name = "f", descriptor = "F")
    public static float field1541;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "[I")
    public static int[] field1540;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static void method803(int arg0) {
        field1537 = null;
        field1540 = null;
        int var1 = -91 / ((arg0 + 36) / 46);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
    public abstract void method804(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method805(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1539++;
        if (arg0 < 33) {
            field1542 = -94;
        }
        int var8 = arg5 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class280.field3833 - class273.field3745) * var8 / 100 + class273.field3745;
        int var10 = arg1 * var9 >> 8;
        int var11 = 16384 - arg6 & 0x3FFF;
        int var12 = 16384 - arg2 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class597.field8342[var11] * -var10 >> 14;
            var15 = class597.field8344[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class597.field8342[var12] * var15 >> 14;
            var15 = class597.field8344[var12] * var15 >> 14;
        }
        class41.field475 = arg2;
        class11.field114 = arg7 - var15;
        class164.field2363 = 0;
        class685.field9771 = arg6;
        class666.field9335 = arg4 - var13;
        class441.field6102 = arg3 - var14;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(III)V")
    public abstract void method806(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IBI)V")
    public abstract void method807(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(III)V")
    public class111(int arg0, int arg1, int arg2) {
        this.field1538 = arg1;
        this.field1536 = arg2;
        this.field1543 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field1537[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field1537[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field1537[var2] = (char) (var2 + 48 - 52);
        }
        field1537[62] = '*';
        field1537[63] = '-';
    }
}
