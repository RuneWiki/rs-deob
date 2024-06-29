import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class756 {

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field10427;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public int field10428;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field10429;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field10430;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field10431;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    private int field10432;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "[I")
    public static int[] field10433;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method4198(int arg0) {
        if (arg0 != 0) {
            field10433 = null;
        }
        field10433 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIZ)Z")
    public final boolean method4199(int arg0, int arg1, int arg2, boolean arg3) {
        field10430++;
        if (!arg3) {
            this.method4201(-72, 50);
        }
        int var5 = this.field10432;
        if (this.field10428 == arg2 && this.field10432 == 0) {
            return false;
        }
        boolean var6;
        if (this.field10432 == 0) {
            if (arg2 > this.field10428 && arg2 <= (this.field10428 + arg1) || arg2 < this.field10428 && (this.field10428 - arg1) <= arg2) {
                this.field10428 = arg2;
                return false;
            }
            var6 = true;
        } else if (this.field10432 > 0 && arg2 > this.field10428) {
            int var7 = this.field10432 * this.field10432 / (arg1 * 2);
            int var8 = this.field10428 + var7;
            if (arg2 > var8 && var8 >= this.field10428) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field10432 < 0 && arg2 < this.field10428) {
            int var9 = this.field10432 * this.field10432 / (arg1 * 2);
            int var10 = this.field10428 - var9;
            if (arg2 < var10 && var10 <= this.field10428) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (arg2 <= this.field10428) {
                this.field10432 -= arg1;
                if (arg0 != 0 && -arg0 > this.field10432) {
                    this.field10432 = -arg0;
                }
            } else {
                this.field10432 += arg1;
                if (arg0 != 0 && arg0 < this.field10432) {
                    this.field10432 = arg0;
                }
            }
            if (this.field10432 != var5) {
                int var11 = this.field10432 * this.field10432 / (arg1 * 2);
                if (arg2 > this.field10428) {
                    if (arg2 < this.field10428 + var11) {
                        this.field10432 = var5;
                    }
                } else if (arg2 < this.field10428 && arg2 > (this.field10428 - var11)) {
                    this.field10432 = var5;
                }
            }
        } else if (this.field10432 <= 0) {
            this.field10432 += arg1;
            if (this.field10432 > 0) {
                this.field10432 = 0;
            }
        } else {
            this.field10432 -= arg1;
            if (this.field10432 < 0) {
                this.field10432 = 0;
            }
        }
        this.field10428 += this.field10432 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)I")
    public final int method4200(byte arg0) {
        field10429++;
        if (arg0 != -3) {
            method4198(-5);
        }
        return this.field10428 & 0x3FFF;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
    public final void method4201(int arg0, int arg1) {
        this.field10432 = 0;
        field10431++;
        this.field10428 = arg1;
        if (arg0 < 107) {
            this.method4202((byte) 62);
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
    public final void method4202(byte arg0) {
        int var2 = -110 / ((-arg0 - 23) / 63);
        field10427++;
        this.field10428 &= 0x3FFF;
    }
}
