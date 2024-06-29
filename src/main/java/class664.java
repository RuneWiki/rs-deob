import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class664 extends class362 {

    @OriginalMember(owner = "client!qt", name = "C", descriptor = "I")
    private int field9218 = 0;

    @OriginalMember(owner = "client!qt", name = "G", descriptor = "I")
    private int field9221 = 0;

    @OriginalMember(owner = "client!qt", name = "M", descriptor = "I")
    private int field9227 = 0;

    @OriginalMember(owner = "client!qt", name = "A", descriptor = "Lcja;")
    public static class46 field9216 = new class46(64);

    @OriginalMember(owner = "client!qt", name = "P", descriptor = "[I")
    public static int[] field9230 = new int[6];

    @OriginalMember(owner = "client!qt", name = "Q", descriptor = "Z")
    public static boolean field9231 = false;

    @OriginalMember(owner = "client!qt", name = "y", descriptor = "I")
    private int field9214;

    @OriginalMember(owner = "client!qt", name = "z", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!qt", name = "B", descriptor = "I")
    private int field9217;

    @OriginalMember(owner = "client!qt", name = "E", descriptor = "I")
    public static int field9219;

    @OriginalMember(owner = "client!qt", name = "F", descriptor = "I")
    public static int field9220;

    @OriginalMember(owner = "client!qt", name = "H", descriptor = "I")
    private int field9222;

    @OriginalMember(owner = "client!qt", name = "I", descriptor = "I")
    public static int field9223;

    @OriginalMember(owner = "client!qt", name = "J", descriptor = "I")
    public static int field9224;

    @OriginalMember(owner = "client!qt", name = "K", descriptor = "I")
    private int field9225;

    @OriginalMember(owner = "client!qt", name = "L", descriptor = "I")
    public static int field9226;

    @OriginalMember(owner = "client!qt", name = "N", descriptor = "I")
    public static int field9228;

    @OriginalMember(owner = "client!qt", name = "O", descriptor = "I")
    private int field9229;

    @OriginalMember(owner = "client!qt", name = "R", descriptor = "I")
    private int field9232;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "(I)V", line = 3)
    public static void method3755(int arg0) {
        if (arg0 >= -63) {
            field9231 = true;
        }
        field9230 = null;
        field9216 = null;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lgj;Z)V", line = 17)
    public static final void method3756(class662 arg0, boolean arg1) {
        if (arg1) {
            field9216 = null;
        }
        class475.field6432 = arg0;
        ++field9219;
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "()V", line = 30)
    public class664() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lfca;II)V", line = 34)
    public final void method154(class93 arg0, int arg1, int arg2) {
        if (arg2 == -1) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (~arg1 == -3) {
                        this.field9227 = (arg0.method766((byte) 122) << 12) / 100;
                    }
                } else {
                    this.field9218 = (arg0.method766((byte) 122) << 12) / 100;
                }
            } else {
                this.field9221 = arg0.method774(-4);
            }
            ++field9224;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIB)V", line = 79)
    private final void method3757(int arg0, int arg1, int arg2, byte arg3) {
        ++field9228;
        int var5 = arg2 > 2048 ? arg0 + arg2 + -(arg0 * arg2 >> 12) : (arg0 + 4096) * arg2 >> 12;
        if (arg3 >= -6) {
            this.field9227 = 111;
        }
        if (~var5 < -1) {
            int var6 = arg1 * 6;
            int var7 = arg2 + arg2 + -var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = var6 - (var9 << 12);
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (~var9 == -1) {
                this.field9225 = var7;
                this.field9222 = var14;
                this.field9232 = var5;
                return;
            }
            if (~var9 == -2) {
                this.field9232 = var15;
                this.field9225 = var7;
                this.field9222 = var5;
                return;
            }
            if (~var9 == -3) {
                this.field9222 = var5;
                this.field9232 = var7;
                this.field9225 = var14;
                return;
            }
            if (~var9 == -4) {
                this.field9225 = var5;
                this.field9232 = var7;
                this.field9222 = var15;
                return;
            }
            if (~var9 == -5) {
                this.field9225 = var5;
                this.field9222 = var7;
                this.field9232 = var14;
                return;
            }
            if (~var9 == -6) {
                this.field9232 = var5;
                this.field9225 = var15;
                this.field9222 = var7;
                return;
            }
        } else {
            this.field9232 = this.field9222 = this.field9225 = arg2;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(BIII)V", line = 194)
    private final void method3758(byte arg0, int arg1, int arg2, int arg3) {
        ++field9215;
        if (arg0 <= 38) {
            this.method3758((byte) -42, 102, 8, -119);
        }
        int var5 = ~arg1 < ~arg3 ? arg1 : arg3;
        int var6 = ~var5 > ~arg2 ? arg2 : var5;
        int var7 = ~arg3 < ~arg1 ? arg1 : arg3;
        int var8 = ~var7 < ~arg2 ? arg2 : var7;
        int var9 = var6 - var8;
        this.field9229 = (var6 + var8) / 2;
        if (~var9 < -1) {
            int var10 = (var6 - arg1 << 12) / var9;
            int var11 = (var6 - arg3 << 12) / var9;
            int var12 = (var6 - arg2 << 12) / var9;
            if (arg1 == var6) {
                this.field9217 = arg3 != var8 ? -var11 + 4096 : var12 + 20480;
            } else if (~arg3 != ~var6) {
                this.field9217 = ~arg1 != ~var8 ? -var10 + 20480 : var11 + 12288;
            } else {
                this.field9217 = ~arg2 == ~var8 ? var10 + 4096 : -var12 + 12288;
            }
            this.field9217 /= 6;
        } else {
            this.field9217 = 0;
        }
        if (this.field9229 > 0 && ~this.field9229 > -4097) {
            this.field9214 = (var9 << 12) / (this.field9229 > 2048 ? -(this.field9229 * 2) + 8192 : this.field9229 * 2);
        } else {
            this.field9214 = 0;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IB)[[I", line = 251)
    public final int[][] method153(int arg0, byte arg1) {
        ++field9223;
        if (arg1 <= 57) {
            return null;
        } else {
            int[][] var3 = super.field4938.method3199(arg0, (byte) 103);
            if (super.field4938.field7848) {
                int[][] var4 = this.method2222(0, arg0, 28008);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class769.field10597; ++var11) {
                    this.method3758((byte) 70, var5[var11], var7[var11], var6[var11]);
                    this.field9229 += this.field9227;
                    this.field9217 += this.field9221;
                    this.field9214 += this.field9218;
                    while (~this.field9217 > -1) {
                        this.field9217 += 4096;
                    }
                    if (~this.field9214 > -1) {
                        this.field9214 = 0;
                    }
                    while (this.field9217 > 4096) {
                        this.field9217 -= 4096;
                    }
                    if (~this.field9229 > -1) {
                        this.field9229 = 0;
                    }
                    if (~this.field9214 < -4097) {
                        this.field9214 = 4096;
                    }
                    if (this.field9229 > 4096) {
                        this.field9229 = 4096;
                    }
                    this.method3757(this.field9214, this.field9217, this.field9229, (byte) -51);
                    var8[var11] = this.field9232;
                    var9[var11] = this.field9222;
                    var10[var11] = this.field9225;
                }
            }
            return var3;
        }
    }
}
