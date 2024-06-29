import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class465 {

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public int field6423;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public int field6419;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public int field6417;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public int field6422;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Lff;")
    public static class9 field6418 = new class9(12, -2);

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "[B")
    public static byte[] field6424 = new byte[32896];

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)Lfj;")
    public final class465 method2645(int arg0, int arg1) {
        field6420++;
        if (arg1 != 0) {
            this.method2645(77, -99);
        }
        return new class465(this.field6417, arg0, this.field6419, this.field6423);
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)I")
    public static final int method2646(int arg0, int arg1) {
        field6421++;
        return arg1 == 32896 ? arg0 & 0x3FF : 40;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public static void method2647(byte arg0) {
        field6424 = null;
        field6418 = null;
        if (arg0 < 81) {
            method2646(-18, 76);
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(IIII)V")
    public class465(int arg0, int arg1, int arg2, int arg3) {
        this.field6423 = arg3;
        this.field6419 = arg2;
        this.field6417 = arg0;
        this.field6422 = arg1;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field6424[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }
}
