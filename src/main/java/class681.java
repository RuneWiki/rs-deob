import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class681 extends class175 {

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
    private int field9106 = 0;

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "I")
    private int field9108 = 1;

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "I")
    private int field9110 = 0;

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "[Lnn;")
    public static class436[] field9112 = new class436[8];

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "[Lqf;")
    public static class708[] field9109 = new class708[16];

    @OriginalMember(owner = "client!fj", name = "F", descriptor = "I")
    public static int field9107;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
    public static int field9111;

    @OriginalMember(owner = "client!fj", name = "M", descriptor = "I")
    public static int field9113;

    @OriginalMember(owner = "client!fj", name = "N", descriptor = "I")
    public static int field9114;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILdt;Z)V", line = 3)
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        ++field9114;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 3) {
                    this.field9108 = arg1.method1731((byte) 64);
                }
            } else {
                this.field9110 = arg1.method1731((byte) 64);
            }
        } else {
            this.field9106 = arg1.method1731((byte) 64);
        }
        if (arg2) {
            this.field9110 = 58;
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V", line = 53)
    public class681() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(IIB)I", line = 56)
    public static final int method3739(int arg0, int arg1, byte arg2) {
        ++field9107;
        int var3 = 84 / ((arg2 - -57) / 37);
        return ~arg0 != -2 && arg0 != 3 ? class613.field8296[3 & arg1] : class28.field277[3 & arg1];
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZI)[I", line = 75)
    public final int[] method47(boolean arg0, int arg1) {
        ++field9113;
        if (!arg0) {
            this.field9106 = 101;
        }
        int[] var3 = super.field2310.method91(0, arg1);
        if (super.field2310.field169) {
            int var4 = class456.field6536[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~var6 > ~class598.field8136; ++var6) {
                int var7 = class693.field9221[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field9106 == -1) {
                    var9 = (-var4 + var7) * this.field9108;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field9108 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (this.field9110 != 0) {
                    if (~this.field9110 == -3) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class344.field4821[(var12 & 4091) >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V", line = 147)
    public final void method46(int arg0) {
        class647.method3595((byte) -96);
        if (arg0 != -8) {
            this.method46(-9);
        }
        ++field9111;
    }

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "(I)V", line = 158)
    public static void method3740(int arg0) {
        field9112 = null;
        field9109 = null;
        int var1 = 28 / ((-45 - arg0) / 58);
    }
}
