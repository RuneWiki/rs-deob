import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class186 extends class666 {

    @OriginalMember(owner = "client!tw", name = "E", descriptor = "I")
    private int field2260 = 0;

    @OriginalMember(owner = "client!tw", name = "D", descriptor = "I")
    private int field2259 = 1;

    @OriginalMember(owner = "client!tw", name = "I", descriptor = "I")
    private int field2264 = 0;

    @OriginalMember(owner = "client!tw", name = "K", descriptor = "Lqv;")
    public static class406 field2266 = new class406(6, 1);

    @OriginalMember(owner = "client!tw", name = "F", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!tw", name = "G", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!tw", name = "H", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!tw", name = "J", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!tw", name = "L", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!tw", name = "M", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V", line = 4)
    public final void method118(int arg0) {
        ++field2265;
        if (arg0 != -9) {
            method1082(-87, -18, 13, 75, -43);
        }
        class636.method3561(true);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIII)V", line = 17)
    public static final void method1082(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class398.field5323 != null) {
            class398.field5323[arg0][arg1] = -16777216 | arg2;
        }
        if (class425.field5651 != null) {
            class425.field5651[arg0][arg1] = (short) arg3;
        }
        if (class217.field2625 != null) {
            class217.field2625[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(II)[I", line = 28)
    public final int[] method122(int arg0, int arg1) {
        if (arg0 > -21) {
            return null;
        } else {
            ++field2261;
            int[] var3 = super.field9466.method1811(arg1, 27);
            if (super.field9466.field4172) {
                int var4 = class476.field6935[arg1];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; var6 < class501.field7222; ++var6) {
                    int var7 = class579.field8246[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var9;
                    if (this.field2264 == 0) {
                        var9 = (-var4 + var7) * this.field2259;
                    } else {
                        int var10 = var5 * var5 + var8 * var8 >> 12;
                        int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                        var9 = (int) ((double) (this.field2259 * var11) * 3.141592653589793D);
                    }
                    int var12 = var9 - (var9 & -4096);
                    if (~this.field2260 != -1) {
                        if (~this.field2260 == -3) {
                            var12 -= 2048;
                            if (~var12 > -1) {
                                var12 = -var12;
                            }
                            var12 = -var12 + 2048 << 1;
                        }
                    } else {
                        var12 = class425.field5646[var12 >> 4 & 255] - -4096 >> 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(ILiaa;Z)V", line = 99)
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (!arg2) {
            this.field2259 = 29;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 3) {
                    this.field2259 = arg1.method2541(94);
                }
            } else {
                this.field2260 = arg1.method2541(48);
            }
        } else {
            this.field2264 = arg1.method2541(119);
        }
        ++field2267;
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "()V", line = 142)
    public class186() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "(I)V", line = 150)
    public static void method1083(int arg0) {
        if (arg0 >= -119) {
            field2268 = -16;
        }
        field2266 = null;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IZ)V", line = 174)
    public static final void method1084(int arg0, boolean arg1) {
        ++field2263;
        class653 var2 = class84.field896;
        synchronized (class84.field896) {
            class84.field896.method3691(arg1, arg0);
        }
        class653 var3 = class416.field5522;
        synchronized (class416.field5522) {
            class416.field5522.method3691(arg1, arg0);
        }
    }
}
