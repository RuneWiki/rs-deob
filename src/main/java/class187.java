import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class187 {

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "Lpf;")
    public static class500 field2614 = new class500(0, -1);

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "[I")
    public static int[] field2624 = new int[1];

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "I")
    public static int field2625 = 0;

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "S")
    public static short field2626 = 320;

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "S")
    public static short field2623 = 32767;

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "F")
    public static float field2620;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
    public int field2616;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
    private int field2618;

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V")
    public final void method1161(byte arg0) {
        this.field2616 &= 0x3FFF;
        if (arg0 > -74) {
            field2620 = -0.97070456F;
        }
        field2619++;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIII)V")
    public static final void method1162(int arg0, int arg1, int arg2, int arg3) {
        field2627++;
        class80.field1299 = new byte[arg1][arg3][arg0];
        if (arg2 != 0) {
            method1162(-58, -121, 72, 101);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IB)Z")
    public static final boolean method1163(int arg0, byte arg1) {
        field2621++;
        if (arg1 >= -12) {
            method1162(-108, -2, 24, 59);
        }
        return arg0 == 2 || arg0 == 6 || arg0 == 9;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZIII)Z")
    public final boolean method1164(boolean arg0, int arg1, int arg2, int arg3) {
        field2617++;
        int var5 = this.field2618;
        if (this.field2616 == arg2 && this.field2618 == 0) {
            return false;
        }
        boolean var6;
        if (this.field2618 == 0) {
            if (this.field2616 < arg2 && (this.field2616 + arg3) >= arg2 || this.field2616 > arg2 && arg2 >= (this.field2616 - arg3)) {
                this.field2616 = arg2;
                return false;
            }
            var6 = true;
        } else if (this.field2618 > 0 && arg2 > this.field2616) {
            int var7 = this.field2618 * this.field2618 / (arg3 * 2);
            int var8 = this.field2616 + var7;
            if (arg2 > var8 && this.field2616 <= var8) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field2618 < 0 && arg2 < this.field2616) {
            int var9 = this.field2618 * this.field2618 / (arg3 * 2);
            int var10 = this.field2616 - var9;
            if (arg2 < var10 && var10 <= this.field2616) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (this.field2616 >= arg2) {
                this.field2618 -= arg3;
                if (arg1 != 0 && (-arg1) > this.field2618) {
                    this.field2618 = -arg1;
                }
            } else {
                this.field2618 += arg3;
                if (arg1 != 0 && this.field2618 > arg1) {
                    this.field2618 = arg1;
                }
            }
            if (this.field2618 != var5) {
                int var11 = this.field2618 * this.field2618 / (arg3 * 2);
                if (arg2 <= this.field2616) {
                    if (this.field2616 > arg2 && arg2 > (this.field2616 - var11)) {
                        this.field2618 = var5;
                    }
                } else if (this.field2616 + var11 > arg2) {
                    this.field2618 = var5;
                }
            }
        } else if (this.field2618 <= 0) {
            this.field2618 += arg3;
            if (this.field2618 > 0) {
                this.field2618 = 0;
            }
        } else {
            this.field2618 -= arg3;
            if (this.field2618 < 0) {
                this.field2618 = 0;
            }
        }
        this.field2616 += this.field2618 + var5 >> 1;
        if (!arg0) {
            field2624 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)V")
    public final void method1165(int arg0, int arg1) {
        this.field2616 = arg1;
        int var3 = -110 / ((44 - arg0) / 37);
        field2613++;
        this.field2618 = 0;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(B)I")
    public final int method1166(byte arg0) {
        int var2 = -47 % ((23 - arg0) / 42);
        field2615++;
        return this.field2616 & 0x3FFF;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
    public static void method1167(int arg0) {
        field2614 = null;
        if (arg0 != -29533) {
            field2626 = -68;
        }
        field2624 = null;
    }
}
