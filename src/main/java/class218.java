import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class218 extends class123 {

    @OriginalMember(owner = "client!ui", name = "Z", descriptor = "I")
    private int field3756 = 0;

    @OriginalMember(owner = "client!ui", name = "Y", descriptor = "I")
    private int field3755 = 1;

    @OriginalMember(owner = "client!ui", name = "kb", descriptor = "I")
    private int field3767 = 0;

    @OriginalMember(owner = "client!ui", name = "ab", descriptor = "Leb;")
    public static class230 field3757 = class68.method589(0, "::errortest");

    @OriginalMember(owner = "client!ui", name = "bb", descriptor = "I")
    public static volatile int field3758 = 0;

    @OriginalMember(owner = "client!ui", name = "eb", descriptor = "[[I")
    public static int[][] field3761 = new int[104][104];

    @OriginalMember(owner = "client!ui", name = "cb", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!ui", name = "db", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!ui", name = "fb", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!ui", name = "hb", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!ui", name = "ib", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!ui", name = "jb", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!ui", name = "gb", descriptor = "[Leh;")
    public static class80[] field3763;

    @OriginalMember(owner = "client!ui", name = "X", descriptor = "[S")
    public static short[] field3754;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        ++field3760;
        if (arg2 != 1876195788) {
            field3759 = -95;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -4) {
                    this.field3755 = arg1.method200(255);
                }
            } else {
                this.field3767 = arg1.method200(255);
            }
        } else {
            this.field3756 = arg1.method200(255);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(JI)V")
    public static final void method1501(long arg0, int arg1) {
        if (arg1 >= 2) {
            ++field3766;
            try {
                Thread.sleep(arg0);
            } catch (InterruptedException var3) {
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
    public final void method257(int arg0) {
        ++field3765;
        class210.method1466(true);
        if (arg0 != 0) {
            this.field3756 = -95;
        }
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(II)I")
    public static final int method1502(int arg0, int arg1) {
        if (arg1 != 158) {
            field3758 = 10;
        }
        ++field3764;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        ++field3762;
        int[] var3 = super.field2160.method1323((byte) -118, arg0);
        if (super.field2160.field3243) {
            int var4 = class154.field2753[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; class140.field2505 > var6; ++var6) {
                int var7 = class214.field3705[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field3756 == -1) {
                    var9 = (var7 - var4) * this.field3755;
                } else {
                    int var10 = var8 * var8 - -(var5 * var5) >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field3755 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (this.field3767 != 0) {
                    if (this.field3767 == 2) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class213.field3695[var12 >> 4 & 255] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        int var13 = 66 / ((-24 - arg1) / 57);
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "(I)V")
    public static void method1503(int arg0) {
        field3763 = null;
        field3761 = null;
        field3754 = null;
        if (arg0 == -25855) {
            field3757 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
    public class218() {
        super(0, true);
    }
}
