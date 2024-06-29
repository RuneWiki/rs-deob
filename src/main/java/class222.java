import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class222 extends class210 {

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
    private int field3202 = 1;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
    private int field3201 = 1;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    private int field3196 = 204;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "[I")
    public static int[] field3200;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)V")
    public static void method1522(int arg0) {
        field3200 = null;
        if (arg0 != -1016) {
            field3200 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
    public class222() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)I")
    public static final int method1523(int arg0, int arg1, int arg2, int arg3) {
        ++field3197;
        int var4 = -6 / ((arg2 - -54) / 34);
        int var5 = arg0 & 3;
        if (~var5 == -1) {
            return arg3;
        } else if (~var5 == -2) {
            return -arg1 + 1023;
        } else {
            return ~var5 == -3 ? -arg3 + 1023 : arg1;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)[I")
    public final int[] method361(int arg0, byte arg1) {
        ++field3199;
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (arg1 != -38) {
            return null;
        } else {
            if (super.field2950.field4111) {
                for (int var4 = 0; ~class202.field2852 < ~var4; ++var4) {
                    int var5 = class430.field6250[var4];
                    int var6 = class331.field4911[arg0];
                    int var7 = this.field3201 * var5 >> 12;
                    int var8 = this.field3202 * var6 >> 12;
                    int var9 = var5 % (4096 / this.field3201) * this.field3201;
                    int var10 = var6 % (4096 / this.field3202) * this.field3202;
                    if (~this.field3196 < ~var10) {
                        for (var7 -= var8; var7 < 0; var7 += 4) {
                        }
                        while (~var7 < -4) {
                            var7 -= 4;
                        }
                        if (~var7 != -2) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (~var9 > ~this.field3196) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (this.field3196 > var9) {
                        int var11;
                        for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                        }
                        while (var11 > 3) {
                            var11 -= 4;
                        }
                        if (~var11 < -1) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILat;)V")
    public final void method56(int arg0, int arg1, class256 arg2) {
        if (arg1 == -11941) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        this.field3196 = arg2.method1767(1930493576);
                    }
                } else {
                    this.field3202 = arg2.method1738((byte) 117);
                }
            } else {
                this.field3201 = arg2.method1738((byte) -28);
            }
            ++field3198;
        }
    }
}
