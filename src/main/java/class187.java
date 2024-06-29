import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class187 extends class74 {

    @OriginalMember(owner = "client!je", name = "N", descriptor = "I")
    private int field2813 = 0;

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "I")
    private int field2816 = 20;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "I")
    private int field2812 = 0;

    @OriginalMember(owner = "client!je", name = "W", descriptor = "I")
    private int field2822 = 1365;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "Ljava/lang/String;")
    public static String field2815 = " from your ignore list first.";

    @OriginalMember(owner = "client!je", name = "R", descriptor = "[I")
    public static int[] field2817 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!je", name = "S", descriptor = "I")
    public static int field2818 = -1;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "I")
    public static volatile int field2820 = 0;

    @OriginalMember(owner = "client!je", name = "Y", descriptor = "Z")
    public static boolean field2824 = false;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!je", name = "T", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!je", name = "V", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!je", name = "X", descriptor = "[I")
    public static int[] field2823;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        ++field2819;
        if (arg0 == -79) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (~arg2 != -3) {
                        if (arg2 == 3) {
                            this.field2812 = arg1.method293(-123);
                        }
                    } else {
                        this.field2813 = arg1.method293(117);
                    }
                } else {
                    this.field2816 = arg1.method293(-32);
                }
            } else {
                this.field2822 = arg1.method293(6);
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
    public class187() {
        super(0, true);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        if (arg0 != 4) {
            return null;
        } else {
            int[] var3 = super.field1254.method1328((byte) -108, arg1);
            if (super.field1254.field3118) {
                for (int var4 = 0; ~var4 > ~class178.field2662; ++var4) {
                    int var5 = (class224.field3522[var4] << 12) / this.field2822 + this.field2813;
                    int var6 = var5;
                    int var7 = (class207.field3212[arg1] << 12) / this.field2822 + this.field2812;
                    int var8 = var5;
                    int var9 = var7;
                    int var10 = var7;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var7 * var7 >> 12;
                    int var13 = 0;
                    while (~(var11 + var12) > -16385 && ~this.field2816 < ~var13) {
                        ++var13;
                        var10 = (var8 * var10 >> 12) * 2 - -var9;
                        var8 = -var12 + var6 + var11;
                        var11 = var8 * var8 >> 12;
                        var12 = var10 * var10 >> 12;
                    }
                    var3[var4] = ~var13 > ~(this.field2816 + -1) ? (var13 << 12) / this.field2816 : 0;
                }
            }
            ++field2814;
            return var3;
        }
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(I)V")
    public static void method1258(int arg0) {
        int var1 = -116 / ((arg0 - 58) / 59);
        field2817 = null;
        field2815 = null;
        field2823 = null;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)Z")
    public static final boolean method1259(byte arg0) {
        ++field2821;
        if (arg0 >= -118) {
            return false;
        } else {
            if (class76.field1278) {
                try {
                    class138.method959("showVideoAd", (byte) -65, class22.field329.field934);
                    return true;
                } catch (Throwable var1) {
                }
            }
            return false;
        }
    }
}
