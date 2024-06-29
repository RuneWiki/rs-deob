import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class609 extends class601 {

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "I")
    private int field8131 = 0;

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "I")
    private int field8126 = 1;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
    private int field8127 = 0;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "[I")
    public static int[] field8123 = new int[8];

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "I")
    public static int field8124;

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "I")
    public static int field8125;

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
    public static int field8128;

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "I")
    public static int field8129;

    @OriginalMember(owner = "client!pe", name = "J", descriptor = "I")
    public static int field8130;

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "I")
    public static int field8132;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public final void method108(int arg0) {
        class564.method3118(true);
        ++field8124;
        if (arg0 != 8351) {
            this.field8126 = 80;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lee;BI)V")
    public final void method6(class677 arg0, byte arg1, int arg2) {
        ++field8132;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -4) {
                    this.field8126 = arg0.method3821((byte) -96);
                }
            } else {
                this.field8127 = arg0.method3821((byte) 100);
            }
        } else {
            this.field8131 = arg0.method3821((byte) 127);
        }
        if (arg1 != -61) {
            this.method108(-47);
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    public class609() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class88.field1076 = arg5;
        if (arg2 != 1) {
            field8123 = null;
        }
        class26.field426 = arg1;
        class193.field2907 = arg3;
        class642.field8541 = arg0;
        class299.field4250 = arg4;
        class727.field10095 = arg6;
        ++field8125;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public static void method3322(byte arg0) {
        field8123 = null;
        if (arg0 != 117) {
            field8123 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)[I")
    public final int[] method5(byte arg0, int arg1) {
        ++field8130;
        if (arg0 != -40) {
            this.method108(-82);
        }
        int[] var3 = super.field7902.method382(arg1, true);
        if (super.field7902.field704) {
            int var4 = class250.field3446[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; ~class171.field2624 < ~var6; ++var6) {
                int var7 = class453.field6186[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field8131 == 0) {
                    var9 = (var7 - var4) * this.field8126;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field8126 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field8127 != -1) {
                    if (this.field8127 == 2) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class105.field1442[var12 >> 4 & 255] - -4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)I")
    public static final int method3323(int arg0) {
        ++field8129;
        int var1 = class258.field3537.method226(4);
        if (~var1 > ~(class472.field6456.length - 1)) {
            class258.field3537 = class472.field6456[var1 + 1];
        }
        if (arg0 >= -31) {
            field8123 = null;
        }
        return 100;
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)V")
    public static final void method3324(int arg0) {
        if (arg0 == 4096) {
            ++field8128;
            if (class66.field828.field2892 && class286.field4041.field7338 != -1) {
                class607.method3299((byte) -95, class286.field4041.field7333, class286.field4041.field7338);
            }
        }
    }
}
