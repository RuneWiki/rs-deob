import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class44 extends class160 {

    @OriginalMember(owner = "client!le", name = "S", descriptor = "I")
    private int field622 = 1024;

    @OriginalMember(owner = "client!le", name = "U", descriptor = "I")
    private int field624 = 2048;

    @OriginalMember(owner = "client!le", name = "bb", descriptor = "I")
    private int field631 = 3072;

    @OriginalMember(owner = "client!le", name = "Z", descriptor = "Z")
    public static boolean field629 = false;

    @OriginalMember(owner = "client!le", name = "T", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!le", name = "V", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!le", name = "W", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!le", name = "X", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!le", name = "Y", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!le", name = "ab", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!le", name = "cb", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!le", name = "db", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lua;I)V")
    public static final void method322(class116 arg0, int arg1) {
        class158.method1072(arg1, -5103, arg0);
        ++field626;
    }

    @OriginalMember(owner = "client!le", name = "h", descriptor = "(B)V")
    public final void method210(byte arg0) {
        if (arg0 > -124) {
            field629 = true;
        }
        this.field624 = -this.field622 + this.field631;
        ++field632;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        ++field628;
        int[] var3 = super.field2488.method15((byte) 126, arg0);
        if (arg1 != 57) {
            field629 = false;
        }
        if (super.field2488.field42) {
            int[] var4 = this.method1085(0, arg0, (byte) 122);
            for (int var5 = 0; ~class240.field3896 < ~var5; ++var5) {
                var3[var5] = (var4[var5] * this.field624 >> 12) + this.field622;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method3(int arg0, boolean arg1) {
        ++field625;
        int[][] var3 = super.field2476.method839(false, arg0);
        if (!arg1) {
            this.field631 = 24;
        }
        if (super.field2476.field1950) {
            int[][] var4 = this.method1079(arg0, 93, 0);
            int[] var5 = var4[2];
            int[] var6 = var3[0];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var4[0];
            for (int var11 = 0; var11 < class240.field3896; ++var11) {
                var6[var11] = (var10[var11] * this.field624 >> 12) + this.field622;
                var8[var11] = (var7[var11] * this.field624 >> 12) + this.field622;
                var9[var11] = this.field622 - -(var5[var11] * this.field624 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field2494 = ~arg0.method633(115) == -2;
                }
            } else {
                this.field631 = arg0.method645(11596);
            }
        } else {
            this.field622 = arg0.method645(11596);
        }
        if (arg1 <= 11) {
            this.field631 = -113;
        }
        ++field633;
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V")
    public static final void method323(int arg0) {
        if (arg0 == 1) {
            ++field623;
            class115.field1872.method1888(103);
            class269.field4300.method1888(arg0 + -50);
            class231.field3670.method1888(-56);
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
    public class44() {
        super(1, false);
    }
}
