import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class118 {

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "[I")
    public static int[] field1790 = new int[8];

    @OriginalMember(owner = "client!gw", name = "k", descriptor = "I")
    public static int field1793 = -1;

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "[I")
    public static int[] field1785 = new int[14];

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
    public int field1788;

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "I")
    private int field1791;

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "[Ll;")
    public static class16[] field1789;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)Len;", line = 3)
    public static final class211 method887(int arg0) {
        field1784++;
        if (arg0 != 0) {
            method887(61);
        }
        class211 var1 = (class211) class233.field3759.method1024((byte) 68);
        if (var1 != null) {
            var1.method2677(-22491);
            var1.method2754(-152804768);
            return var1;
        }
        class211 var2;
        do {
            var2 = (class211) class66.field860.method1024((byte) 123);
            if (var2 == null) {
                return null;
            }
            if (var2.method1467((byte) 0) > class493.method2937(-113)) {
                return null;
            }
            var2.method2677(-22491);
            var2.method2754(arg0 - 152804768);
        } while ((Long.MIN_VALUE & var2.field6596) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)V", line = 47)
    public final void method888(int arg0) {
        this.field1788 &= arg0;
        field1786++;
    }

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)I", line = 60)
    public final int method889(int arg0) {
        if (arg0 != 16383) {
            field1793 = 91;
        }
        field1783++;
        return this.field1788 & 0x3FFF;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)V", line = 71)
    public final void method890(int arg0, int arg1) {
        field1792++;
        this.field1788 = arg1;
        if (arg0 != 31095) {
            field1789 = null;
        }
        this.field1791 = 0;
    }

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "(I)V", line = 84)
    public static void method891(int arg0) {
        field1785 = null;
        field1790 = null;
        if (arg0 != 0) {
            field1789 = null;
        }
        field1789 = null;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IBII)Z", line = 100)
    public final boolean method892(int arg0, byte arg1, int arg2, int arg3) {
        field1787++;
        int var5 = this.field1791;
        if (this.field1788 == arg3 && this.field1791 == 0) {
            return false;
        }
        int var6 = -16 % ((-arg1 - 6) / 42);
        boolean var9;
        if (this.field1791 == 0) {
            if (this.field1788 < arg3 && this.field1788 + arg0 >= arg3 || this.field1788 > arg3 && this.field1788 - arg0 <= arg3) {
                this.field1788 = arg3;
                return false;
            }
            var9 = true;
        } else if (this.field1791 > 0 && arg3 > this.field1788) {
            int var7 = this.field1791 * this.field1791 / (arg0 * 2);
            int var8 = this.field1788 + var7;
            if (var8 < arg3 && this.field1788 <= var8) {
                var9 = true;
            } else {
                var9 = false;
            }
        } else if (this.field1791 < 0 && this.field1788 > arg3) {
            int var10 = this.field1791 * this.field1791 / (arg0 * 2);
            int var11 = this.field1788 - var10;
            if (var11 > arg3 && this.field1788 >= var11) {
                var9 = true;
            } else {
                var9 = false;
            }
        } else {
            var9 = false;
        }
        if (var9) {
            if (this.field1788 >= arg3) {
                this.field1791 -= arg0;
                if (arg2 != 0 && this.field1791 < -arg2) {
                    this.field1791 = -arg2;
                }
            } else {
                this.field1791 += arg0;
                if (arg2 != 0 && arg2 < this.field1791) {
                    this.field1791 = arg2;
                }
            }
            if (this.field1791 != var5) {
                int var12 = this.field1791 * this.field1791 / (arg0 * 2);
                if (this.field1788 < arg3) {
                    if (arg3 < this.field1788 + var12) {
                        this.field1791 = var5;
                    }
                } else if (this.field1788 > arg3 && this.field1788 - var12 < arg3) {
                    this.field1791 = var5;
                }
            }
        } else if (this.field1791 <= 0) {
            this.field1791 += arg0;
            if (this.field1791 > 0) {
                this.field1791 = 0;
            }
        } else {
            this.field1791 -= arg0;
            if (this.field1791 < 0) {
                this.field1791 = 0;
            }
        }
        this.field1788 += this.field1791 + var5 >> 1;
        return var9;
    }
}
