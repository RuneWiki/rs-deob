import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class324 {

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public int field4989;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    private int field4990;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)I")
    public final int method2101(int arg0) {
        field4991++;
        if (arg0 >= -85) {
            this.field4990 = -101;
        }
        return this.field4989 & 0x3FFF;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public final void method2102(byte arg0) {
        if (arg0 != -90) {
            this.field4989 = 59;
        }
        this.field4989 &= 0x3FFF;
        field4992++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)Z")
    public final boolean method2103(int arg0, int arg1, int arg2, int arg3) {
        field4987++;
        int var5 = this.field4990;
        if (this.field4989 == arg1 && this.field4990 == 0) {
            return false;
        }
        if (arg0 >= -92) {
            this.method2104(6, -25);
        }
        boolean var6;
        if (this.field4990 == 0) {
            if (arg1 > this.field4989 && arg1 <= (this.field4989 + arg3) || arg1 < this.field4989 && this.field4989 - arg3 <= arg1) {
                this.field4989 = arg1;
                return false;
            }
            var6 = true;
        } else if (this.field4990 > 0 && this.field4989 < arg1) {
            int var7 = this.field4990 * this.field4990 / (arg3 * 2);
            int var8 = this.field4989 + var7;
            if (var8 < arg1 && this.field4989 <= var8) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field4990 < 0 && this.field4989 > arg1) {
            int var9 = this.field4990 * this.field4990 / (arg3 * 2);
            int var10 = this.field4989 - var9;
            if (var10 > arg1 && var10 <= this.field4989) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (this.field4989 < arg1) {
                this.field4990 += arg3;
                if (arg2 != 0 && this.field4990 > arg2) {
                    this.field4990 = arg2;
                }
            } else {
                this.field4990 -= arg3;
                if (arg2 != 0 && -arg2 > this.field4990) {
                    this.field4990 = -arg2;
                }
            }
            if (this.field4990 != var5) {
                int var11 = this.field4990 * this.field4990 / (arg3 * 2);
                if (arg1 > this.field4989) {
                    if (arg1 < this.field4989 + var11) {
                        this.field4990 = var5;
                    }
                } else if (this.field4989 > arg1 && arg1 > (this.field4989 - var11)) {
                    this.field4990 = var5;
                }
            }
        } else if (this.field4990 <= 0) {
            this.field4990 += arg3;
            if (this.field4990 > 0) {
                this.field4990 = 0;
            }
        } else {
            this.field4990 -= arg3;
            if (this.field4990 < 0) {
                this.field4990 = 0;
            }
        }
        this.field4989 += this.field4990 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V")
    public final void method2104(int arg0, int arg1) {
        this.field4990 = 0;
        field4988++;
        if (arg0 == -1) {
            this.field4989 = arg1;
        }
    }
}
