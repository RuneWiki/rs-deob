import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class337 extends class371 {

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
    private int field4943 = 4096;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
    private int field4945 = 4096;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "I")
    private int field4947 = 4096;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIII)V")
    public static final void method2100(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class483.field7334 = arg3;
        class401.field5755 = arg0;
        ++field4948;
        class202.field3021 = arg4;
        class130.field1712 = arg2;
        if (arg1 >= -52) {
            method2100(-102, 53, 37, 34, 83);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBLps;)V")
    public final void method81(int arg0, byte arg1, class428 arg2) {
        ++field4942;
        int var4 = -95 % ((-15 - arg1) / 39);
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field4945 = arg2.method2620(99);
                }
            } else {
                this.field4943 = arg2.method2620(41);
            }
        } else {
            this.field4947 = arg2.method2620(27);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)[[I")
    public final int[][] method78(byte arg0, int arg1) {
        ++field4946;
        if (arg0 != 36) {
            this.method78((byte) -51, -24);
        }
        int[][] var3 = super.field5364.method3064(arg0 ^ 37, arg1);
        if (super.field5364.field7632) {
            int[][] var4 = this.method2263((byte) -120, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class41.field455; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && var13 == var14) {
                    var8[var11] = this.field4947 * var12 >> 12;
                    var9[var11] = this.field4943 * var13 >> 12;
                    var10[var11] = this.field4945 * var14 >> 12;
                } else {
                    var8[var11] = this.field4947;
                    var9[var11] = this.field4943;
                    var10[var11] = this.field4945;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
    public class337() {
        super(1, false);
    }
}
