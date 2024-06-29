import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class639 extends class325 {

    @OriginalMember(owner = "client!lea", name = "D", descriptor = "I")
    private int field8877 = 4096;

    @OriginalMember(owner = "client!lea", name = "G", descriptor = "I")
    private int field8880 = 0;

    @OriginalMember(owner = "client!lea", name = "C", descriptor = "I")
    public static int field8876;

    @OriginalMember(owner = "client!lea", name = "E", descriptor = "I")
    public static int field8878;

    @OriginalMember(owner = "client!lea", name = "F", descriptor = "I")
    public static int field8879;

    @OriginalMember(owner = "client!lea", name = "H", descriptor = "I")
    public static int field8881;

    @OriginalMember(owner = "client!lea", name = "I", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!lea", name = "J", descriptor = "I")
    public static int field8883;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ljp;IB)V", line = 8)
    public final void method95(class376 arg0, int arg1, byte arg2) {
        if (arg2 < -41) {
            if (arg1 != 0) {
                if (arg1 == 1) {
                    this.field8877 = arg0.method2359(-1);
                }
            } else {
                this.field8880 = arg0.method2359(-1);
            }
            ++field8882;
        }
    }

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "()V", line = 44)
    public class639() {
        super(1, true);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(BI)[I", line = 56)
    public final int[] method100(byte arg0, int arg1) {
        ++field8879;
        if (arg0 < 21) {
            field8883 = -63;
        }
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (super.field4727.field6067) {
            int[] var4 = this.method2062(arg1, 0, (byte) 33);
            for (int var5 = 0; ~class261.field3874 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field8880 <= var6 && ~var6 >= ~this.field8877 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IZ)I", line = 90)
    public static final int method3561(int arg0, boolean arg1) {
        if (arg1) {
            field8883 = -118;
        }
        ++field8878;
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 != 6409) {
            if (arg0 != 32841) {
                if (~arg0 != -6411) {
                    if (~arg0 != -6408) {
                        if (arg0 == 6408) {
                            return 4;
                        } else {
                            throw new IllegalArgumentException("");
                        }
                    } else {
                        return 3;
                    }
                } else {
                    return 2;
                }
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }
}
