import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class47 extends class449 {

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "[I")
    public static int[] field712 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    public static int field715 = field719 >> 2;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public static int field714 = field719;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "[I")
    public static int[] field720 = new int[14];

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "[B")
    public static byte[] field722;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "J")
    public long field713;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "Lkj;")
    public class47 field717;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "Lkj;")
    public class47 field718;

    static {
        int var0 = 0;
        field722 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field722[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V", line = 18)
    public static void method478(byte arg0) {
        field712 = null;
        field720 = null;
        if (arg0 == 40) {
            field722 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)V", line = 30)
    public final void method479(byte arg0) {
        field721++;
        if (this.field718 == null) {
            return;
        }
        this.field718.field717 = this.field717;
        this.field717.field718 = this.field718;
        if (arg0 == -8) {
            this.field717 = null;
            this.field718 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)Z", line = 50)
    public final boolean method480(byte arg0) {
        int var2 = -100 % ((arg0 + 49) / 37);
        field716++;
        return this.field718 != null;
    }
}
