import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class234 extends class102 {

    @OriginalMember(owner = "client!w", name = "S", descriptor = "I")
    private int field4318 = 4096;

    @OriginalMember(owner = "client!w", name = "W", descriptor = "I")
    private int field4322 = 4096;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "I")
    private int field4313 = 4096;

    @OriginalMember(owner = "client!w", name = "R", descriptor = "I")
    public static int field4317 = 0;

    @OriginalMember(owner = "client!w", name = "X", descriptor = "Lqe;")
    public static class179 field4323 = class206.method1380("Bitte starten Sie eine Mitgliedschaft", (byte) -1);

    @OriginalMember(owner = "client!w", name = "Y", descriptor = "I")
    public static int field4324 = -1;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!w", name = "T", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!w", name = "U", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!w", name = "V", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lpd;)V")
    public static final void method1522(class167 arg0) {
        for (int var1 = arg0.field3006; var1 <= arg0.field3011; ++var1) {
            for (int var2 = arg0.field3018; var2 <= arg0.field3023; ++var2) {
                class197 var3 = class229.field4232[arg0.field3013][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3662; ++var4) {
                        if (var3.field3672[var4] == arg0) {
                            --var3.field3662;
                            for (int var5 = var4; var5 < var3.field3662; ++var5) {
                                var3.field3672[var5] = var3.field3672[var5 + 1];
                                var3.field3674[var5] = var3.field3674[var5 + 1];
                            }
                            var3.field3672[var3.field3662] = null;
                            break;
                        }
                    }
                    var3.field3686 = 0;
                    for (int var6 = 0; var6 < var3.field3662; ++var6) {
                        var3.field3686 |= var3.field3674[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
    public static final void method1523(int arg0) {
        ++field4314;
        class180.field3307 = true;
        int var1 = -79 % ((arg0 - -59) / 63);
        class195.field3624 = true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Leh;III)[Lfc;")
    public static final class58[] method1524(class52 arg0, int arg1, int arg2, int arg3) {
        ++field4315;
        if (arg2 != -1653) {
            return null;
        } else {
            return !class77.method495(20480, arg3, arg1, arg0) ? null : class95.method614(0);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (~arg1 == -3) {
                        this.field4322 = arg0.method1252(2);
                    }
                } else {
                    this.field4313 = arg0.method1252(2);
                }
            } else {
                this.field4318 = arg0.method1252(2);
            }
            ++field4319;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([BIBI)I")
    public static final int method1525(byte[] arg0, int arg1, byte arg2, int arg3) {
        ++field4320;
        int var4 = -1;
        for (int var5 = arg3; arg1 > var5; ++var5) {
            var4 = class136.field2513[(arg0[var5] ^ var4) & 255] ^ var4 >>> 8;
        }
        if (arg2 >= -1) {
            field4324 = 12;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
    public class234() {
        super(1, false);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        ++field4312;
        int[][] var3 = super.field1950.method598((byte) -48, arg0);
        if (super.field1950.field1724) {
            int[][] var4 = this.method677(92, arg0, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class155.field2796 < ~var11; ++var11) {
                int var12 = var7[var11];
                int var13 = var5[var11];
                int var14 = var6[var11];
                if (~var12 == ~var14 && var13 == var14) {
                    var9[var11] = this.field4318 * var12 >> 12;
                    var8[var11] = this.field4313 * var14 >> 12;
                    var10[var11] = this.field4322 * var13 >> 12;
                } else {
                    var9[var11] = this.field4318;
                    var8[var11] = this.field4313;
                    var10[var11] = this.field4322;
                }
            }
        }
        return arg1 != 64 ? null : var3;
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V")
    public static void method1526(int arg0) {
        field4323 = null;
        if (arg0 >= -84) {
            method1522((class167) null);
        }
    }
}
