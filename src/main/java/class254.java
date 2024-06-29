import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class254 extends class202 {

    @OriginalMember(owner = "client!ir", name = "K", descriptor = "I")
    private int field4109 = 0;

    @OriginalMember(owner = "client!ir", name = "M", descriptor = "I")
    private int field4111 = 1365;

    @OriginalMember(owner = "client!ir", name = "P", descriptor = "I")
    private int field4114 = 0;

    @OriginalMember(owner = "client!ir", name = "O", descriptor = "I")
    private int field4113 = 20;

    @OriginalMember(owner = "client!ir", name = "U", descriptor = "I")
    public static int field4119 = 0;

    @OriginalMember(owner = "client!ir", name = "I", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!ir", name = "J", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!ir", name = "L", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!ir", name = "N", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!ir", name = "Q", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!ir", name = "R", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!ir", name = "S", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!ir", name = "T", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V")
    public class254() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 == 3) {
                        this.field4109 = arg0.method1455(-3387);
                    }
                } else {
                    this.field4114 = arg0.method1455(-3387);
                }
            } else {
                this.field4113 = arg0.method1455(-3387);
            }
        } else {
            this.field4111 = arg0.method1455(-3387);
        }
        int var5 = 123 % ((-46 - arg1) / 50);
        ++field4110;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field4118;
        int[] var3 = super.field3064.method2452((byte) 57, arg0);
        if (!arg1) {
            return null;
        } else {
            if (super.field3064.field5837) {
                for (int var4 = 0; var4 < class276.field4375; ++var4) {
                    int var5 = (class476.field7271[var4] << 12) / this.field4111 - -this.field4114;
                    int var6 = (class521.field7716[arg0] << 12) / this.field4111 + this.field4109;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13 = 0;
                    while (~(var11 + var12) > -16385 && ~var13 > ~this.field4113) {
                        var10 = (var9 * var10 >> 12) * 2 + var8;
                        var9 = -var12 + var11 - -var7;
                        var11 = var9 * var9 >> 12;
                        ++var13;
                        var12 = var10 * var10 >> 12;
                    }
                    var3[var4] = this.field4113 - 1 > var13 ? (var13 << 12) / this.field4113 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(II)Ljava/lang/String;")
    public static final String method1742(int arg0, int arg1) {
        ++field4107;
        if (arg0 != 612130280) {
            method1742(-35, 94);
        }
        return (255 & arg1 >> 24) + "." + ((16724728 & arg1) >> 16) + "." + ((arg1 & 65464) >> 8) + "." + (255 & arg1);
    }

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "(II)I")
    public static final int method1743(int arg0, int arg1) {
        ++field4108;
        if (arg0 != 0) {
            method1743(-117, 119);
        }
        return 255 & arg1;
    }
}
