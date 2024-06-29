import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class404 extends class466 {

    @OriginalMember(owner = "client!gk", name = "F", descriptor = "I")
    private int field5739 = 2048;

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "I")
    private int field5738 = 2048;

    @OriginalMember(owner = "client!gk", name = "P", descriptor = "I")
    private int field5749 = 0;

    @OriginalMember(owner = "client!gk", name = "N", descriptor = "I")
    private int field5747 = 12288;

    @OriginalMember(owner = "client!gk", name = "R", descriptor = "I")
    private int field5751 = 0;

    @OriginalMember(owner = "client!gk", name = "S", descriptor = "I")
    private int field5752 = 4096;

    @OriginalMember(owner = "client!gk", name = "Q", descriptor = "I")
    private int field5750 = 8192;

    @OriginalMember(owner = "client!gk", name = "L", descriptor = "Lcba;")
    public static class471 field5745 = new class471(26, -2);

    @OriginalMember(owner = "client!gk", name = "T", descriptor = "Lej;")
    public static class104 field5753 = new class104("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!gk", name = "G", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!gk", name = "H", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!gk", name = "I", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!gk", name = "J", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!gk", name = "K", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!gk", name = "M", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!gk", name = "O", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (arg1 != -5062) {
            this.method7(-101);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field5750 = arg0.method93((byte) 105);
                                }
                            } else {
                                this.field5752 = arg0.method93((byte) 121);
                            }
                        } else {
                            this.field5747 = arg0.method93((byte) 73);
                        }
                    } else {
                        this.field5739 = arg0.method93((byte) 109);
                    }
                } else {
                    this.field5751 = arg0.method93((byte) 75);
                }
            } else {
                this.field5749 = arg0.method93((byte) 81);
            }
        } else {
            this.field5738 = arg0.method93((byte) 83);
        }
        ++field5743;
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "(III)Z")
    private final boolean method2409(int arg0, int arg1, int arg2) {
        ++field5746;
        int var4 = (-arg2 + arg1) * this.field5747 >> 12;
        int var5 = class46.field898[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field5747;
        int var7 = (var6 << 12) / this.field5750;
        int var8 = this.field5752 * var7 >> 12;
        if (arg0 < 93) {
            this.field5751 = -12;
        }
        return ~(arg1 + arg2) > ~var8 && ~(arg1 + arg2) < ~(-var8);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field5739 = 103;
        }
        ++field5741;
        int[] var3 = super.field6557.method565(arg0, -24728);
        if (super.field6557.field1163) {
            int var4 = class63.field1085[arg0] + -2048;
            for (int var5 = 0; class312.field4207 > var5; ++var5) {
                int var6 = class431.field6129[var5] + -2048;
                int var7 = this.field5738 + var6;
                int var8 = ~var7 > 2047 ? var7 - -4096 : var7;
                int var9 = ~var8 < -2049 ? var8 - 4096 : var8;
                int var10 = this.field5749 + var4;
                int var11 = ~var10 > 2047 ? var10 + 4096 : var10;
                int var12 = ~var11 < -2049 ? var11 + -4096 : var11;
                int var13 = var6 - -this.field5751;
                int var14 = ~var13 <= 2047 ? var13 : var13 - -4096;
                int var15 = var14 <= 2048 ? var14 : var14 + -4096;
                int var16 = var4 - -this.field5739;
                int var17 = var16 < -2048 ? var16 + 4096 : var16;
                int var18 = var17 > 2048 ? var17 + -4096 : var17;
                var3[var5] = !this.method2409(112, var12, var9) && !this.method2413(var18, var15, false) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
    public class404() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V")
    public final void method7(int arg0) {
        if (arg0 != -806066388) {
            this.field5749 = 103;
        }
        class225.method1442(256);
        ++field5748;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/lang/String;IBIIIZJLjava/lang/String;IZ)V")
    public static final void method2410(String arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, boolean arg6, long arg7, String arg8, int arg9, boolean arg10) {
        ++field5742;
        if (arg2 != -120) {
            method2410((String) null, 48, (byte) -24, 84, -106, 12, true, -92L, (String) null, 63, true);
        }
        if (!class483.field6820 && ~class210.field2958 > -501) {
            int var12 = arg9 != -1 ? arg9 : class575.field7926;
            class442 var13 = new class442(arg8, arg0, var12, arg4, arg5, arg7, arg3, arg1, arg6, arg10);
            class448.field6352.method463(var13, -116);
            ++class210.field2958;
        }
    }

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "(III)Lfa;")
    public static final class197 method2411(int arg0, int arg1, int arg2) {
        class622 var3 = class356.field4807[arg0][arg1][arg2];
        return var3 != null && var3.field8979 != null ? var3.field8979 : null;
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(I)V")
    public static void method2412(int arg0) {
        field5753 = null;
        field5745 = null;
        if (arg0 != 4096) {
            method2412(12);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIZ)Z")
    private final boolean method2413(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method2412(31);
        }
        ++field5740;
        int var4 = (arg0 + arg1) * this.field5747 >> 12;
        int var5 = class46.field898[(1044560 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field5747;
        int var7 = (var6 << 12) / this.field5750;
        int var8 = this.field5752 * var7 >> 12;
        return arg0 - arg1 < var8 && ~(-var8) > ~(-arg1 + arg0);
    }
}
