import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class434 {

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public int field5467;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    private int field5471;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "Lfba;")
    public static class24 field5475;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZ)V", line = 4)
    public final void method2387(int arg0, boolean arg1) {
        this.field5467 = arg0;
        if (arg1) {
            this.field5467 = 51;
        }
        field5470++;
        this.field5471 = 0;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)I", line = 16)
    public final int method2388(int arg0) {
        field5473++;
        return arg0 > -45 ? -48 : this.field5467 & 0x3FFF;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V", line = 27)
    public static void method2389(int arg0) {
        field5475 = null;
        if (arg0 != -1) {
            method2389(116);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIB)V", line = 45)
    public static final void method2390(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field5469++;
        for (int var5 = 0; var5 < class211.field2489; var5++) {
            Rectangle var6 = class68.field824[var5];
            if (arg0 < (var6.x + var6.width) && var6.x < arg0 + arg1 && arg3 < var6.y + var6.height && var6.y < (arg2 + arg3)) {
                class58.field743[var5] = true;
            }
        }
        if (arg4 != -20) {
            field5475 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V", line = 68)
    public final void method2391(int arg0) {
        field5472++;
        this.field5467 &= arg0;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BIII)Z", line = 78)
    public final boolean method2392(byte arg0, int arg1, int arg2, int arg3) {
        field5468++;
        int var5 = this.field5471;
        if (this.field5467 == arg2 && this.field5471 == 0) {
            return false;
        }
        boolean var6;
        if (this.field5471 == 0) {
            if (this.field5467 < arg2 && (this.field5467 + arg1) >= arg2 || arg2 < this.field5467 && arg2 >= (this.field5467 - arg1)) {
                this.field5467 = arg2;
                return false;
            }
            var6 = true;
        } else if (this.field5471 > 0 && arg2 > this.field5467) {
            int var7 = this.field5471 * this.field5471 / (arg1 * 2);
            int var8 = this.field5467 + var7;
            if (var8 < arg2 && this.field5467 <= var8) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field5471 < 0 && arg2 < this.field5467) {
            int var9 = this.field5471 * this.field5471 / (arg1 * 2);
            int var10 = this.field5467 - var9;
            if (var10 > arg2 && var10 <= this.field5467) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (arg2 > this.field5467) {
                this.field5471 += arg1;
                if (arg3 != 0 && arg3 < this.field5471) {
                    this.field5471 = arg3;
                }
            } else {
                this.field5471 -= arg1;
                if (arg3 != 0 && this.field5471 < -arg3) {
                    this.field5471 = -arg3;
                }
            }
            if (this.field5471 != var5) {
                int var11 = this.field5471 * this.field5471 / (arg1 * 2);
                if (arg2 > this.field5467) {
                    if (arg2 < (this.field5467 + var11)) {
                        this.field5471 = var5;
                    }
                } else if (this.field5467 > arg2 && this.field5467 - var11 < arg2) {
                    this.field5471 = var5;
                }
            }
        } else if (this.field5471 <= 0) {
            this.field5471 += arg1;
            if (this.field5471 > 0) {
                this.field5471 = 0;
            }
        } else {
            this.field5471 -= arg1;
            if (this.field5471 < 0) {
                this.field5471 = 0;
            }
        }
        this.field5467 += this.field5471 + var5 >> 1;
        return arg0 > -127 ? false : var6;
    }
}
