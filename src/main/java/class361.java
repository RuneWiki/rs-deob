import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class361 extends class306 {

    @OriginalMember(owner = "client!vn", name = "G", descriptor = "I")
    private int field5707 = 0;

    @OriginalMember(owner = "client!vn", name = "O", descriptor = "I")
    private int field5715 = 1;

    @OriginalMember(owner = "client!vn", name = "P", descriptor = "I")
    private int field5716 = 0;

    @OriginalMember(owner = "client!vn", name = "K", descriptor = "I")
    public static int field5711 = 0;

    @OriginalMember(owner = "client!vn", name = "Q", descriptor = "I")
    public static int field5717 = 0;

    @OriginalMember(owner = "client!vn", name = "I", descriptor = "Z")
    public static boolean field5709 = false;

    @OriginalMember(owner = "client!vn", name = "H", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!vn", name = "J", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!vn", name = "L", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!vn", name = "M", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!vn", name = "N", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!vn", name = "R", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!vn", name = "S", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(B)V", line = 4)
    public final void method43(byte arg0) {
        field5719++;
        if (arg0 <= -103) {
            class105.method682((byte) -112);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)[I", line = 17)
    public final int[] method47(int arg0, int arg1) {
        int[] var3 = this.field4757.method903(arg0, arg1 ^ 0x5C2B3C9E);
        if (this.field4757.field1898) {
            int var4 = class111.field1553[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class31.field367; var6++) {
                int var7 = class25.field288[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field5716 == 0) {
                    var9 = (var7 - var4) * this.field5715;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field5715 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & 0xFFFFF000);
                if (this.field5707 == 0) {
                    var12 = class304.field4741[var12 >> 4 & 0xFF] + 4096 >> 1;
                } else if (this.field5707 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg1 != -1546337535) {
            this.field5715 = -24;
        }
        field5708++;
        return var3;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V", line = 88)
    public class361() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILlf;I)V", line = 101)
    public final void method45(int arg0, class143 arg1, int arg2) {
        if (arg0 != -15334) {
            this.method43((byte) 87);
        }
        if (arg2 == 0) {
            this.field5716 = arg1.method1043(true);
        } else if (arg2 == 1) {
            this.field5707 = arg1.method1043(true);
        } else if (arg2 == 3) {
            this.field5715 = arg1.method1043(true);
        }
        field5712++;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILnk;)V", line = 153)
    public static final void method2520(int arg0, class16 arg1) {
        field5718++;
        if (arg0 > 33) {
            class223.field3379 = arg1;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IZ)V", line = 167)
    public static final void method2521(int arg0, boolean arg1) {
        class337.field5384 = arg1;
        field5709 = !class103.method653(-29308);
        if (arg0 <= -33) {
            field5714++;
        }
    }
}
