import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class514 extends class440 {

    @OriginalMember(owner = "client!jw", name = "G", descriptor = "I")
    private int field7261 = 12288;

    @OriginalMember(owner = "client!jw", name = "I", descriptor = "I")
    private int field7263 = 4096;

    @OriginalMember(owner = "client!jw", name = "Q", descriptor = "I")
    private int field7271 = 2048;

    @OriginalMember(owner = "client!jw", name = "C", descriptor = "I")
    private int field7258 = 0;

    @OriginalMember(owner = "client!jw", name = "M", descriptor = "I")
    private int field7267 = 0;

    @OriginalMember(owner = "client!jw", name = "S", descriptor = "I")
    private int field7273 = 2048;

    @OriginalMember(owner = "client!jw", name = "R", descriptor = "I")
    private int field7272 = 8192;

    @OriginalMember(owner = "client!jw", name = "P", descriptor = "Z")
    public static boolean field7270 = false;

    @OriginalMember(owner = "client!jw", name = "H", descriptor = "Lnp;")
    public static class453 field7262 = class568.method3230((byte) 110);

    @OriginalMember(owner = "client!jw", name = "D", descriptor = "I")
    public static int field7259;

    @OriginalMember(owner = "client!jw", name = "E", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!jw", name = "J", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!jw", name = "K", descriptor = "I")
    public static int field7265;

    @OriginalMember(owner = "client!jw", name = "L", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!jw", name = "N", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!jw", name = "O", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!jw", name = "T", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILmo;I)V", line = 8)
    public final void method234(int arg0, class695 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field7272 = arg1.method3847((byte) 118);
                                }
                            } else {
                                this.field7263 = arg1.method3847((byte) 118);
                            }
                        } else {
                            this.field7261 = arg1.method3847((byte) 118);
                        }
                    } else {
                        this.field7273 = arg1.method3847((byte) 118);
                    }
                } else {
                    this.field7258 = arg1.method3847((byte) 118);
                }
            } else {
                this.field7267 = arg1.method3847((byte) 118);
            }
        } else {
            this.field7271 = arg1.method3847((byte) 118);
        }
        if (arg0 != 5) {
            this.field7273 = -111;
        }
        ++field7264;
    }

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "(III)Z", line = 87)
    private final boolean method2940(int arg0, int arg1, int arg2) {
        if (arg2 != -185888532) {
            this.method234(85, (class695) null, 29);
        }
        ++field7268;
        int var4 = (-arg0 + arg1) * this.field7261 >> 12;
        int var5 = class453.field6514[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field7261;
        int var7 = (var6 << 12) / this.field7272;
        int var8 = this.field7263 * var7 >> 12;
        return arg0 - -arg1 < var8 && -var8 < arg0 - -arg1;
    }

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "()V", line = 125)
    public class514() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(Z)V", line = 109)
    public static final void method2941(boolean arg0) {
        ++field7269;
        class307.field4539.method475(6);
        if (arg0) {
            field7265 = 21;
        }
        class451.field6497 = 0;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(BI)[I", line = 128)
    public final int[] method229(byte arg0, int arg1) {
        ++field7274;
        int[] var3 = super.field6412.method3250((byte) 5, arg1);
        int var4 = -19 / ((-56 - arg0) / 41);
        if (super.field6412.field8047) {
            int var5 = class418.field6099[arg1] + -2048;
            for (int var6 = 0; class549.field7715 > var6; ++var6) {
                int var7 = class499.field7073[var6] + -2048;
                int var8 = this.field7271 + var7;
                int var9 = var8 < -2048 ? var8 + 4096 : var8;
                int var10 = ~var9 < -2049 ? var9 + -4096 : var9;
                int var11 = this.field7267 + var5;
                int var12 = ~var11 > 2047 ? var11 - -4096 : var11;
                int var13 = ~var12 >= -2049 ? var12 : var12 - 4096;
                int var14 = this.field7258 + var7;
                int var15 = var14 < -2048 ? var14 - -4096 : var14;
                int var16 = ~var15 >= -2049 ? var15 : var15 + -4096;
                int var17 = this.field7273 + var5;
                int var18 = var17 < -2048 ? var17 + 4096 : var17;
                int var19 = ~var18 < -2049 ? var18 - 4096 : var18;
                var3[var6] = !this.method2940(var10, var13, -185888532) && !this.method2943(var19, (byte) -54, var16) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "(Z)V", line = 177)
    public static void method2942(boolean arg0) {
        if (!arg0) {
            method2942(false);
        }
        field7262 = null;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)V", line = 187)
    public final void method230(int arg0) {
        class31.method354((byte) 81);
        if (arg0 == -9) {
            ++field7260;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IBI)Z", line = 214)
    private final boolean method2943(int arg0, byte arg1, int arg2) {
        int var4 = -32 / ((arg1 - 45) / 56);
        ++field7259;
        int var5 = (arg0 - -arg2) * this.field7261 >> 12;
        int var6 = class453.field6514[var5 * 255 >> 12 & 255];
        int var7 = (var6 << 12) / this.field7261;
        int var8 = (var7 << 12) / this.field7272;
        int var9 = this.field7263 * var8 >> 12;
        return var9 > -arg2 + arg0 && ~(-var9) > ~(-arg2 + arg0);
    }
}
