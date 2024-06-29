import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class649 {

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "Ltt;")
    public static class338 field8962 = new class338(52, -1);

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "Leba;")
    public static class550 field8966 = new class550(63, 4);

    @OriginalMember(owner = "client!dda", name = "k", descriptor = "Leba;")
    public static class550 field8970 = new class550(111, 3);

    @OriginalMember(owner = "client!dda", name = "l", descriptor = "F")
    public static float field8971;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "I")
    public static int field8960;

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "I")
    public int field8961;

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "I")
    private int field8963;

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "I")
    public static int field8964;

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "I")
    public static int field8965;

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "I")
    public static int field8968;

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "I")
    public static int field8969;

    @OriginalMember(owner = "client!dda", name = "m", descriptor = "I")
    public static int field8972;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)V")
    public static final void method3602(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class149.field2028[var1] = false;
        }
        field8964++;
        class68.field831 = -1;
        class108.field1281 = 0;
        class669.field9514 = -1;
        if (arg0 >= -114) {
            field8962 = null;
        }
        class170.field2427 = 0;
        class83.field1004 = -1;
        class342.field4585 = -1;
        class311.field4200 = 1;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)I")
    public final int method3603(int arg0) {
        if (arg0 != 63) {
            this.field8961 = -28;
        }
        field8967++;
        return this.field8961 & 0x3FFF;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIII)Z")
    public final boolean method3604(int arg0, int arg1, int arg2, int arg3) {
        field8960++;
        int var5 = this.field8963;
        if (this.field8961 == arg0 && this.field8963 == 0) {
            return false;
        }
        boolean var8;
        if (this.field8963 == 0) {
            if (this.field8961 < arg0 && arg0 <= this.field8961 + arg2 || arg0 < this.field8961 && this.field8961 - arg2 <= arg0) {
                this.field8961 = arg0;
                return false;
            }
            var8 = true;
        } else if (this.field8963 > 0 && arg0 > this.field8961) {
            int var6 = this.field8963 * this.field8963 / (arg2 * 2);
            int var7 = this.field8961 + var6;
            if (var7 < arg0 && var7 >= this.field8961) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field8963 < 0 && arg0 < this.field8961) {
            int var9 = this.field8963 * this.field8963 / (arg2 * 2);
            int var10 = this.field8961 - var9;
            if (var10 > arg0 && this.field8961 >= var10) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (arg0 > this.field8961) {
                this.field8963 += arg2;
                if (arg1 != 0 && this.field8963 > arg1) {
                    this.field8963 = arg1;
                }
            } else {
                this.field8963 -= arg2;
                if (arg1 != 0 && this.field8963 < (-arg1)) {
                    this.field8963 = -arg1;
                }
            }
            if (this.field8963 != var5) {
                int var11 = this.field8963 * this.field8963 / (arg2 * 2);
                if (arg0 > this.field8961) {
                    if ((this.field8961 + var11) > arg0) {
                        this.field8963 = var5;
                    }
                } else if (arg0 < this.field8961 && arg0 > this.field8961 - var11) {
                    this.field8963 = var5;
                }
            }
        } else if (this.field8963 > 0) {
            this.field8963 -= arg2;
            if (this.field8963 < 0) {
                this.field8963 = 0;
            }
        } else {
            this.field8963 += arg2;
            if (this.field8963 > 0) {
                this.field8963 = 0;
            }
        }
        this.field8961 += this.field8963 + var5 >> 1;
        if (arg3 > -102) {
            method3602((byte) 6);
        }
        return var8;
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)V")
    public final void method3605(int arg0) {
        if (arg0 < -12) {
            field8969++;
            this.field8961 &= 0x3FFF;
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(B)V")
    public static void method3606(byte arg0) {
        field8970 = null;
        field8966 = null;
        field8962 = null;
        if (arg0 < 38) {
            field8972 = -123;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IZ)V")
    public final void method3607(int arg0, boolean arg1) {
        this.field8963 = 0;
        field8965++;
        this.field8961 = arg0;
        if (!arg1) {
            method3606((byte) 29);
        }
    }
}
