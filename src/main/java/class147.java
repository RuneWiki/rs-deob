import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class147 {

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "F")
    public static float field1803;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public int field1811;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    private int field1812;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V", line = 8)
    public final void method874(boolean arg0) {
        this.field1811 &= 0x3FFF;
        field1804++;
        if (arg0) {
            field1803 = -1.3120574F;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IBI)Z", line = 19)
    public static final boolean method875(int arg0, byte arg1, int arg2) {
        int var3 = -61 % ((3 - arg1) / 49);
        field1809++;
        return (arg2 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)Z", line = 34)
    public final boolean method876(int arg0, int arg1, int arg2, int arg3) {
        field1805++;
        if (arg0 <= 122) {
            method875(40, (byte) -64, 76);
        }
        int var5 = this.field1812;
        if (this.field1811 == arg1 && this.field1812 == 0) {
            return false;
        }
        boolean var8;
        if (this.field1812 == 0) {
            if (arg1 > this.field1811 && this.field1811 + arg3 >= arg1 || arg1 < this.field1811 && (this.field1811 - arg3) <= arg1) {
                this.field1811 = arg1;
                return false;
            }
            var8 = true;
        } else if (this.field1812 > 0 && arg1 > this.field1811) {
            int var6 = this.field1812 * this.field1812 / (arg3 * 2);
            int var7 = this.field1811 + var6;
            if (var7 < arg1 && this.field1811 <= var7) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field1812 < 0 && arg1 < this.field1811) {
            int var9 = this.field1812 * this.field1812 / (arg3 * 2);
            int var10 = this.field1811 - var9;
            if (var10 > arg1 && var10 <= this.field1811) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (arg1 <= this.field1811) {
                this.field1812 -= arg3;
                if (arg2 != 0 && -arg2 > this.field1812) {
                    this.field1812 = -arg2;
                }
            } else {
                this.field1812 += arg3;
                if (arg2 != 0 && arg2 < this.field1812) {
                    this.field1812 = arg2;
                }
            }
            if (this.field1812 != var5) {
                int var11 = this.field1812 * this.field1812 / (arg3 * 2);
                if (arg1 > this.field1811) {
                    if ((this.field1811 + var11) > arg1) {
                        this.field1812 = var5;
                    }
                } else if (this.field1811 > arg1 && (this.field1811 - var11) < arg1) {
                    this.field1812 = var5;
                }
            }
        } else if (this.field1812 <= 0) {
            this.field1812 += arg3;
            if (this.field1812 > 0) {
                this.field1812 = 0;
            }
        } else {
            this.field1812 -= arg3;
            if (this.field1812 < 0) {
                this.field1812 = 0;
            }
        }
        this.field1811 += this.field1812 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)I", line = 170)
    public final int method877(int arg0) {
        field1810++;
        return arg0 > -25 ? 26 : this.field1811 & 0x3FFF;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)V", line = 181)
    public final void method878(byte arg0, int arg1) {
        this.field1812 = 0;
        this.field1811 = arg1;
        field1806++;
        if (arg0 != 28) {
            this.field1811 = -112;
        }
    }
}
