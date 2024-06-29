import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class236 {

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "Lsba;")
    public static class200 field3753 = new class200(8);

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "Ldf;")
    public static class368 field3754 = new class368(0, 0);

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    private int field3747;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public int field3748;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 3)
    public static void method1703(int arg0) {
        field3754 = null;
        field3753 = null;
        if (arg0 != -11142) {
            method1703(-29);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)V", line = 15)
    public final void method1704(byte arg0, int arg1) {
        field3752++;
        this.field3747 = 0;
        this.field3748 = arg1;
        if (arg0 != 78) {
            this.method1707(13);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V", line = 35)
    public final void method1705(byte arg0) {
        this.field3748 &= 0x3FFF;
        field3751++;
        if (arg0 > -61) {
            this.method1706(-62, 113, 125, -32);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)Z", line = 47)
    public final boolean method1706(int arg0, int arg1, int arg2, int arg3) {
        field3749++;
        int var5 = this.field3747;
        if (this.field3748 == arg3 && this.field3747 == 0) {
            return false;
        }
        boolean var6;
        if (this.field3747 == 0) {
            if (arg3 > this.field3748 && this.field3748 + arg1 >= arg3 || this.field3748 > arg3 && (this.field3748 - arg1) <= arg3) {
                this.field3748 = arg3;
                return false;
            }
            var6 = true;
        } else if (this.field3747 > 0 && this.field3748 < arg3) {
            int var7 = this.field3747 * this.field3747 / (arg1 * 2);
            int var8 = this.field3748 + var7;
            if (arg3 > var8 && this.field3748 <= var8) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field3747 < 0 && this.field3748 > arg3) {
            int var9 = this.field3747 * this.field3747 / (arg1 * 2);
            int var10 = this.field3748 - var9;
            if (arg3 < var10 && var10 <= this.field3748) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (arg3 <= this.field3748) {
                this.field3747 -= arg1;
                if (arg2 != 0 && this.field3747 < (-arg2)) {
                    this.field3747 = -arg2;
                }
            } else {
                this.field3747 += arg1;
                if (arg2 != 0 && arg2 < this.field3747) {
                    this.field3747 = arg2;
                }
            }
            if (this.field3747 != var5) {
                int var11 = this.field3747 * this.field3747 / (arg1 * 2);
                if (this.field3748 < arg3) {
                    if (this.field3748 + var11 > arg3) {
                        this.field3747 = var5;
                    }
                } else if (this.field3748 > arg3 && arg3 > (this.field3748 - var11)) {
                    this.field3747 = var5;
                }
            }
        } else if (this.field3747 > 0) {
            this.field3747 -= arg1;
            if (this.field3747 < 0) {
                this.field3747 = 0;
            }
        } else {
            this.field3747 += arg1;
            if (this.field3747 > 0) {
                this.field3747 = 0;
            }
        }
        if (arg0 < 21) {
            this.method1706(-20, -27, -73, 15);
        }
        this.field3748 += this.field3747 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)I", line = 186)
    public final int method1707(int arg0) {
        if (arg0 >= -21) {
            this.method1706(20, 28, -127, -112);
        }
        field3746++;
        return this.field3748 & 0x3FFF;
    }
}
