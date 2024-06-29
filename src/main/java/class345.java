import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class345 extends class56 {

    @OriginalMember(owner = "client!vv", name = "F", descriptor = "I")
    private int field4317 = 0;

    @OriginalMember(owner = "client!vv", name = "R", descriptor = "I")
    private int field4328 = 0;

    @OriginalMember(owner = "client!vv", name = "T", descriptor = "I")
    private int field4330 = 0;

    @OriginalMember(owner = "client!vv", name = "E", descriptor = "I")
    private int field4316;

    @OriginalMember(owner = "client!vv", name = "H", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!vv", name = "I", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!vv", name = "J", descriptor = "I")
    private int field4320;

    @OriginalMember(owner = "client!vv", name = "K", descriptor = "I")
    private int field4321;

    @OriginalMember(owner = "client!vv", name = "L", descriptor = "I")
    private int field4322;

    @OriginalMember(owner = "client!vv", name = "M", descriptor = "I")
    private int field4323;

    @OriginalMember(owner = "client!vv", name = "N", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!vv", name = "O", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!vv", name = "Q", descriptor = "I")
    private int field4327;

    @OriginalMember(owner = "client!vv", name = "S", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!vv", name = "U", descriptor = "Ljava/applet/Applet;")
    public static Applet field4331;

    @OriginalMember(owner = "client!vv", name = "D", descriptor = "[Lpt;")
    public static class557[] field4315;

    @OriginalMember(owner = "client!vv", name = "P", descriptor = "[Lsia;")
    public static class766[] field4326;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(BI)[[I", line = 3)
    public final int[][] method187(byte arg0, int arg1) {
        if (arg0 < 35) {
            return null;
        } else {
            ++field4329;
            int[][] var3 = super.field759.method220(arg1, (byte) -91);
            if (super.field759.field341) {
                int[][] var4 = this.method495(104, arg1, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class642.field8759; ++var11) {
                    this.method2053(var6[var11], var5[var11], var7[var11], (byte) 17);
                    this.field4316 += this.field4328;
                    this.field4327 += this.field4330;
                    for (this.field4321 += this.field4317; ~this.field4321 > -1; this.field4321 += 4096) {
                    }
                    while (this.field4321 > 4096) {
                        this.field4321 -= 4096;
                    }
                    if (this.field4316 < 0) {
                        this.field4316 = 0;
                    }
                    if (this.field4316 > 4096) {
                        this.field4316 = 4096;
                    }
                    if (this.field4327 < 0) {
                        this.field4327 = 0;
                    }
                    if (this.field4327 > 4096) {
                        this.field4327 = 4096;
                    }
                    this.method2054(this.field4327, this.field4321, this.field4316, 4883);
                    var8[var11] = this.field4322;
                    var9[var11] = this.field4320;
                    var10[var11] = this.field4323;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIIB)V", line = 79)
    private final void method2053(int arg0, int arg1, int arg2, byte arg3) {
        ++field4324;
        int var5 = ~arg1 < ~arg0 ? arg1 : arg0;
        if (arg3 == 17) {
            int var6 = var5 >= arg2 ? var5 : arg2;
            int var7 = ~arg0 >= ~arg1 ? arg0 : arg1;
            int var8 = ~arg2 <= ~var7 ? var7 : arg2;
            this.field4327 = (var6 + var8) / 2;
            int var9 = var6 - var8;
            if (this.field4327 > 0 && this.field4327 < 4096) {
                this.field4316 = (var9 << 12) / (this.field4327 <= 2048 ? this.field4327 * 2 : -(this.field4327 * 2) + 8192);
            } else {
                this.field4316 = 0;
            }
            if (var9 > 0) {
                int var10 = (var6 - arg1 << 12) / var9;
                int var11 = (-arg0 + var6 << 12) / var9;
                int var12 = (-arg2 + var6 << 12) / var9;
                if (~arg1 != ~var6) {
                    if (~arg0 != ~var6) {
                        this.field4321 = ~arg1 != ~var8 ? 20480 - var10 : 12288 - -var11;
                    } else {
                        this.field4321 = arg2 != var8 ? -var12 + 12288 : 4096 - -var10;
                    }
                } else {
                    this.field4321 = ~arg0 != ~var8 ? -var11 + 4096 : var12 + 20480;
                }
                this.field4321 /= 6;
            } else {
                this.field4321 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(BILes;)V", line = 133)
    public final void method144(byte arg0, int arg1, class403 arg2) {
        ++field4325;
        if (arg0 > -44) {
            this.field4316 = 30;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field4330 = (arg2.method2392(124) << 12) / 100;
                }
            } else {
                this.field4328 = (arg2.method2392(5) << 12) / 100;
            }
        } else {
            this.field4317 = arg2.method2365(true);
        }
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "()V", line = 307)
    public class345() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIII)V", line = 184)
    private final void method2054(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 4883) {
            field4315 = null;
        }
        ++field4319;
        int var5 = arg0 <= 2048 ? (4096 - -arg2) * arg0 >> 12 : arg0 + arg2 + -(arg0 * arg2 >> 12);
        if (var5 > 0) {
            int var6 = arg1 * 6;
            int var7 = arg0 - -arg0 + -var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (~var9 == -1) {
                this.field4323 = var7;
                this.field4322 = var5;
                this.field4320 = var14;
                return;
            }
            if (~var9 == -2) {
                this.field4320 = var5;
                this.field4322 = var15;
                this.field4323 = var7;
                return;
            }
            if (var9 == 2) {
                this.field4320 = var5;
                this.field4323 = var14;
                this.field4322 = var7;
                return;
            }
            if (var9 == 3) {
                this.field4323 = var5;
                this.field4320 = var15;
                this.field4322 = var7;
                return;
            }
            if (var9 == 4) {
                this.field4322 = var14;
                this.field4320 = var7;
                this.field4323 = var5;
                return;
            }
            if (~var9 == -6) {
                this.field4323 = var15;
                this.field4322 = var5;
                this.field4320 = var7;
                return;
            }
        } else {
            this.field4322 = this.field4320 = this.field4323 = arg0;
        }
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(B)V", line = 289)
    public static void method2055(byte arg0) {
        field4331 = null;
        if (arg0 < 47) {
            field4315 = null;
        }
        field4315 = null;
        field4326 = null;
    }
}
