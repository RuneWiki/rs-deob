import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class687 extends class335 {

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
    private int field9703 = 0;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
    private int field9705 = 1;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
    private int field9708 = 0;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "Luda;")
    public static class549 field9702 = new class549();

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
    public static int field9704;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    public static int field9706;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
    public static int field9707;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
    public static int field9709;

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V", line = 54)
    public class687() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILio;I)V", line = 10)
    public final void method2(int arg0, class157 arg1, int arg2) {
        ++field9707;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -4) {
                    this.field9705 = arg1.method930(255);
                }
            } else {
                this.field9708 = arg1.method930(255);
            }
        } else {
            this.field9703 = arg1.method930(255);
        }
        if (arg2 != -66) {
            this.field9708 = -128;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)I", line = 58)
    public static final int method3887(byte arg0, int arg1) {
        if (arg0 != 125) {
            method3888((byte) 4);
        }
        ++field9704;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V", line = 71)
    public static void method3888(byte arg0) {
        int var1 = 35 / ((arg0 - -75) / 45);
        field9702 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V", line = 83)
    public final void method317(byte arg0) {
        class420.method2371(10779);
        int var2 = -11 % ((arg0 - 58) / 60);
        ++field9706;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)[I", line = 97)
    public final int[] method3(boolean arg0, int arg1) {
        ++field9709;
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (!arg0) {
            this.method317((byte) -119);
        }
        if (super.field4525.field5435) {
            int var4 = class686.field9697[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~class649.field8968 < ~var6; ++var6) {
                int var7 = class376.field4981[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field9703 == -1) {
                    var9 = (-var4 + var7) * this.field9705;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field9705 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (this.field9708 == 0) {
                    var12 = class104.field1239[(4095 & var12) >> 4] + 4096 >> 1;
                } else if (~this.field9708 == -3) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }
}
