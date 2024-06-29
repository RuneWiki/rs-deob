import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class175 extends class478 {

    @OriginalMember(owner = "client!dq", name = "B", descriptor = "I")
    private int field1953 = 0;

    @OriginalMember(owner = "client!dq", name = "E", descriptor = "I")
    private int field1955 = 1365;

    @OriginalMember(owner = "client!dq", name = "G", descriptor = "I")
    private int field1957 = 0;

    @OriginalMember(owner = "client!dq", name = "L", descriptor = "I")
    private int field1961 = 20;

    @OriginalMember(owner = "client!dq", name = "C", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!dq", name = "F", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!dq", name = "H", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!dq", name = "J", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!dq", name = "K", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(ZI)V")
    public static final void method1067(boolean arg0, int arg1) {
        ++field1954;
        if (arg1 == 2620) {
            class440.method2539(20, class209.field2466, arg0, class146.field1618, class338.field4244);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILnp;I)V")
    public final void method33(int arg0, class115 arg1, int arg2) {
        ++field1960;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 == 3) {
                        this.field1957 = arg1.method643((byte) -77);
                    }
                } else {
                    this.field1953 = arg1.method643((byte) -77);
                }
            } else {
                this.field1961 = arg1.method643((byte) -77);
            }
        } else {
            this.field1955 = arg1.method643((byte) -77);
        }
        if (arg0 != 255) {
            this.field1953 = -38;
        }
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field1959;
        if (arg1 != -11323) {
            return null;
        } else {
            int[] var3 = super.field6886.method789(arg0, (byte) 123);
            if (super.field6886.field1592) {
                for (int var4 = 0; var4 < class436.field6154; ++var4) {
                    int var5 = (class684.field9645[var4] << 12) / this.field1955 + this.field1953;
                    int var6 = (class695.field9740[arg0] << 12) / this.field1955 + this.field1957;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13 = 0;
                    while (var11 + var12 < 16384 && this.field1961 > var13) {
                        var10 = (var9 * var10 >> 12) * 2 + var8;
                        var9 = -var12 - -var7 + var11;
                        var11 = var9 * var9 >> 12;
                        ++var13;
                        var12 = var10 * var10 >> 12;
                    }
                    var3[var4] = ~var13 > ~(this.field1961 - 1) ? (var13 << 12) / this.field1961 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)I")
    public static final int method1068(int arg0) {
        ++field1956;
        return arg0 != 0 ? 68 : class689.field9700++;
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V")
    public class175() {
        super(0, true);
    }
}
