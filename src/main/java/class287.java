import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class287 {

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "J")
    public static long field3753 = 0L;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "[I")
    public static int[] field3751 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "Lvj;")
    public static class304 field3756 = new class304("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    private int field3754;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public int field3755;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Loj;")
    public static class257 field3760;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)I", line = 4)
    public final int method1692(boolean arg0) {
        field3759++;
        return arg0 ? this.field3755 & 0x3FFF : -61;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)V", line = 24)
    public final void method1693(boolean arg0) {
        this.field3755 &= 0x3FFF;
        field3758++;
        if (!arg0) {
            this.field3754 = -64;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIII)Z", line = 41)
    public final boolean method1694(int arg0, int arg1, int arg2, int arg3) {
        field3757++;
        int var5 = this.field3754;
        if (this.field3755 == arg2 && this.field3754 == 0) {
            return false;
        }
        if (arg0 != 2) {
            field3751 = null;
        }
        boolean var6;
        if (this.field3754 == 0) {
            if (this.field3755 < arg2 && this.field3755 + arg3 >= arg2 || arg2 < this.field3755 && arg2 >= this.field3755 - arg3) {
                this.field3755 = arg2;
                return false;
            }
            var6 = true;
        } else if (this.field3754 > 0 && arg2 > this.field3755) {
            int var7 = this.field3754 * this.field3754 / (arg3 * 2);
            int var8 = this.field3755 + var7;
            if (arg2 > var8 && this.field3755 <= var8) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field3754 < 0 && arg2 < this.field3755) {
            int var9 = this.field3754 * this.field3754 / (arg3 * 2);
            int var10 = this.field3755 - var9;
            if (var10 > arg2 && this.field3755 >= var10) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (this.field3755 >= arg2) {
                this.field3754 -= arg3;
                if (arg1 != 0 && (-arg1) > this.field3754) {
                    this.field3754 = -arg1;
                }
            } else {
                this.field3754 += arg3;
                if (arg1 != 0 && arg1 < this.field3754) {
                    this.field3754 = arg1;
                }
            }
            if (this.field3754 != var5) {
                int var11 = this.field3754 * this.field3754 / (arg3 * 2);
                if (arg2 <= this.field3755) {
                    if (arg2 < this.field3755 && this.field3755 - var11 < arg2) {
                        this.field3754 = var5;
                    }
                } else if (arg2 < this.field3755 + var11) {
                    this.field3754 = var5;
                }
            }
        } else if (this.field3754 <= 0) {
            this.field3754 += arg3;
            if (this.field3754 > 0) {
                this.field3754 = 0;
            }
        } else {
            this.field3754 -= arg3;
            if (this.field3754 < 0) {
                this.field3754 = 0;
            }
        }
        this.field3755 += this.field3754 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V", line = 187)
    public static void method1695(byte arg0) {
        int var1 = -54 / ((9 - arg0) / 53);
        field3751 = null;
        field3760 = null;
        field3756 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)V", line = 198)
    public final void method1696(boolean arg0, int arg1) {
        if (!arg0) {
            field3752++;
            this.field3754 = 0;
            this.field3755 = arg1;
        }
    }
}
