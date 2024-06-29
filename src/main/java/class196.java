import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class196 extends class160 {

    @OriginalMember(owner = "client!vi", name = "ab", descriptor = "I")
    private int field3102 = 1;

    @OriginalMember(owner = "client!vi", name = "W", descriptor = "I")
    private int field3098 = 0;

    @OriginalMember(owner = "client!vi", name = "bb", descriptor = "I")
    private int field3103 = 0;

    @OriginalMember(owner = "client!vi", name = "U", descriptor = "Ljava/lang/String;")
    public static String field3096 = "Continue";

    @OriginalMember(owner = "client!vi", name = "Z", descriptor = "Z")
    public static boolean field3101 = true;

    @OriginalMember(owner = "client!vi", name = "V", descriptor = "I")
    public static int field3097 = 0;

    @OriginalMember(owner = "client!vi", name = "S", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!vi", name = "T", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!vi", name = "X", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!vi", name = "Y", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        ++field3100;
        int[] var3 = super.field2488.method15((byte) 122, arg0);
        if (arg1 != 57) {
            return null;
        } else {
            if (super.field2488.field42) {
                int var4 = class103.field1713[arg0];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; var6 < class240.field3896; ++var6) {
                    int var7 = class190.field2946[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var9;
                    if (~this.field3103 == -1) {
                        var9 = (-var4 + var7) * this.field3102;
                    } else {
                        int var10 = var8 * var8 - -(var5 * var5) >> 12;
                        int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                        var9 = (int) ((double) (this.field3102 * var11) * 3.141592653589793D);
                    }
                    int var12 = var9 - (-4096 & var9);
                    if (this.field3098 != 0) {
                        if (~this.field3098 == -3) {
                            var12 -= 2048;
                            if (~var12 > -1) {
                                var12 = -var12;
                            }
                            var12 = -var12 + 2048 << 1;
                        }
                    } else {
                        var12 = class106.field1759[var12 >> 4 & 255] - -4096 >> 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class196() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        ++field3095;
        if (arg1 < 11) {
            this.method210((byte) -6);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 3) {
                    this.field3102 = arg0.method633(52);
                }
            } else {
                this.field3098 = arg0.method633(74);
            }
        } else {
            this.field3103 = arg0.method633(61);
        }
    }

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "(B)V")
    public final void method210(byte arg0) {
        class47.method338(-59);
        ++field3094;
        if (arg0 > -124) {
            this.method1(-1, (byte) 112);
        }
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(I)V")
    public static void method1339(int arg0) {
        field3096 = null;
        if (arg0 < 84) {
            field3097 = 116;
        }
    }
}
