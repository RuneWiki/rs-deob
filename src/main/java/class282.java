import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class282 extends class17 {

    @OriginalMember(owner = "client!ns", name = "L", descriptor = "I")
    private int field4152 = 2048;

    @OriginalMember(owner = "client!ns", name = "P", descriptor = "I")
    private int field4156 = 10;

    @OriginalMember(owner = "client!ns", name = "G", descriptor = "I")
    private int field4147 = 0;

    @OriginalMember(owner = "client!ns", name = "M", descriptor = "I")
    public static int field4153 = -1;

    @OriginalMember(owner = "client!ns", name = "Q", descriptor = "[S")
    public static short[] field4157 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ns", name = "I", descriptor = "Leh;")
    public static class246 field4149 = new class246(105, 2);

    @OriginalMember(owner = "client!ns", name = "T", descriptor = "[I")
    public static int[] field4160 = new int[32];

    @OriginalMember(owner = "client!ns", name = "S", descriptor = "Z")
    public static boolean field4159 = false;

    @OriginalMember(owner = "client!ns", name = "H", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!ns", name = "J", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!ns", name = "K", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!ns", name = "O", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!ns", name = "R", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!ns", name = "F", descriptor = "[I")
    private int[] field4146;

    @OriginalMember(owner = "client!ns", name = "N", descriptor = "[I")
    private int[] field4154;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(II)I")
    public static final int method1755(int arg0, int arg1) {
        if (arg0 != -1) {
            method1755(-53, -82);
        }
        ++field4151;
        return ~arg1 == -16711936 ? -1 : class329.method1978(-7816, arg1);
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V")
    public class282() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "(I)V")
    private final void method1756(int arg0) {
        ++field4150;
        int var2 = 0;
        this.field4154 = new int[this.field4156 + arg0];
        this.field4146 = new int[this.field4156 + 1];
        int var3 = 4096 / this.field4156;
        int var4 = this.field4152 * var3 >> 12;
        for (int var5 = 0; ~this.field4156 < ~var5; ++var5) {
            this.field4154[var5] = var2;
            this.field4146[var5] = var2 - -var4;
            var2 += var3;
        }
        this.field4154[this.field4156] = 4096;
        this.field4146[this.field4156] = this.field4146[0] + 4096;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        ++field4148;
        if (arg1 <= 53) {
            this.method31(-14);
        }
        int[] var3 = super.field210.method2683(-17, arg0);
        if (super.field210.field6442) {
            int var4 = class40.field427[arg0];
            if (this.field4147 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field4156; ++var6) {
                    if (~var4 <= ~this.field4154[var6] && ~this.field4154[var6 + 1] < ~var4) {
                        if (~this.field4146[var6] < ~var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class182.method1137(var3, 0, class530.field7763, var5);
            } else {
                for (int var7 = 0; ~var7 > ~class530.field7763; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class492.field6966[var7];
                    int var11 = this.field4147;
                    if (var11 != 1) {
                        if (~var11 != -3) {
                            if (var11 == 3) {
                                var8 = (var10 - var4 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var4 + -4096 + var10 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; ~this.field4156 < ~var12; ++var12) {
                        if (this.field4154[var12] <= var8 && this.field4154[var12 + 1] > var8) {
                            if (~this.field4146[var12] < ~var8) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "(I)V")
    public static void method1757(int arg0) {
        field4157 = null;
        if (arg0 == 105) {
            field4160 = null;
            field4149 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lwm;II)V")
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (arg2 != 5159) {
            this.field4152 = 124;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field4147 = arg0.method2357((byte) 117);
                }
            } else {
                this.field4152 = arg0.method2338(0);
            }
        } else {
            this.field4156 = arg0.method2357((byte) 117);
        }
        ++field4158;
    }

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "(I)V")
    public final void method31(int arg0) {
        ++field4155;
        this.method1756(arg0 ^ -10);
        if (arg0 != -9) {
            field4153 = -70;
        }
    }
}
