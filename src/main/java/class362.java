import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class362 extends class585 {

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "I")
    private int field5064 = 0;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
    private int field5060 = 0;

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
    private int field5065 = 1;

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V", line = 3)
    public class362() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BII)Z", line = 13)
    public static final boolean method2276(byte arg0, int arg1, int arg2) {
        int var3 = -64 % ((-60 - arg0) / 53);
        ++field5063;
        return ~(arg1 & 384) != -1;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)[I", line = 27)
    public final int[] method55(int arg0, int arg1) {
        ++field5061;
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (arg1 <= 123) {
            this.field5064 = -71;
        }
        if (super.field8255.field3677) {
            int var4 = class633.field8892[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~var6 > ~class293.field4278; ++var6) {
                int var7 = class581.field8200[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field5060 != 0) {
                    int var9 = var8 * var8 - -(var5 * var5) >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field5065 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field5065;
                }
                int var12 = var11 - (var11 & -4096);
                if (~this.field5064 != -1) {
                    if (~this.field5064 == -3) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class145.field2121[var12 >> 4 & 255] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V", line = 108)
    public final void method52(int arg0) {
        class635.method3634((byte) -94);
        ++field5066;
        if (arg0 != -4096) {
            this.field5064 = 118;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lso;II)V", line = 119)
    public final void method54(class494 arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            this.field5060 = -29;
        }
        ++field5062;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -4) {
                    this.field5065 = arg0.method2964((byte) 86);
                }
            } else {
                this.field5064 = arg0.method2964((byte) 41);
            }
        } else {
            this.field5060 = arg0.method2964((byte) 99);
        }
    }
}
