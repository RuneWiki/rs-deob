import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class155 {

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "[Lwaa;")
    public static class732[] field1920 = new class732[75];

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "[I")
    public static int[] field1919 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "Lifa;")
    public static class450 field1929 = new class450();

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "I")
    private int field1921;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
    public int field1922;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(BII)I", line = 7)
    public static final int method1099(byte arg0, int arg1, int arg2) {
        field1928++;
        if (arg0 == -69) {
            int var3 = arg1 >>> 31;
            return (arg1 + var3) / arg2 - var3;
        } else {
            return -12;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)I", line = 21)
    public final int method1100(byte arg0) {
        if (arg0 == 25) {
            field1924++;
            return this.field1922 & 0x3FFF;
        } else {
            return 58;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V", line = 32)
    public final void method1101(int arg0) {
        this.field1922 &= 0x3FFF;
        if (arg0 != 1) {
            this.method1104(103, (byte) -123);
        }
        field1926++;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIZI)Z", line = 52)
    public final boolean method1102(int arg0, int arg1, boolean arg2, int arg3) {
        field1923++;
        int var5 = this.field1921;
        if (this.field1922 == arg0 && this.field1921 == 0) {
            return false;
        }
        if (!arg2) {
            this.method1102(-53, 120, false, 99);
        }
        boolean var6;
        if (this.field1921 == 0) {
            if (this.field1922 < arg0 && arg0 <= this.field1922 + arg3 || this.field1922 > arg0 && arg0 >= (this.field1922 - arg3)) {
                this.field1922 = arg0;
                return false;
            }
            var6 = true;
        } else if (this.field1921 > 0 && arg0 > this.field1922) {
            int var7 = this.field1921 * this.field1921 / (arg3 * 2);
            int var8 = this.field1922 + var7;
            if (var8 < arg0 && var8 >= this.field1922) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field1921 < 0 && arg0 < this.field1922) {
            int var9 = this.field1921 * this.field1921 / (arg3 * 2);
            int var10 = this.field1922 - var9;
            if (var10 > arg0 && this.field1922 >= var10) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (arg0 <= this.field1922) {
                this.field1921 -= arg3;
                if (arg1 != 0 && -arg1 > this.field1921) {
                    this.field1921 = -arg1;
                }
            } else {
                this.field1921 += arg3;
                if (arg1 != 0 && this.field1921 > arg1) {
                    this.field1921 = arg1;
                }
            }
            if (this.field1921 != var5) {
                int var11 = this.field1921 * this.field1921 / (arg3 * 2);
                if (arg0 > this.field1922) {
                    if (this.field1922 + var11 > arg0) {
                        this.field1921 = var5;
                    }
                } else if (arg0 < this.field1922 && arg0 > this.field1922 - var11) {
                    this.field1921 = var5;
                }
            }
        } else if (this.field1921 > 0) {
            this.field1921 -= arg3;
            if (this.field1921 < 0) {
                this.field1921 = 0;
            }
        } else {
            this.field1921 += arg3;
            if (this.field1921 > 0) {
                this.field1921 = 0;
            }
        }
        this.field1922 += this.field1921 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(IIZI)I", line = 192)
    public static final int method1103(int arg0, int arg1, boolean arg2, int arg3) {
        field1925++;
        if (arg2) {
            return 99;
        } else if (arg0 <= arg1) {
            return arg1 <= arg3 ? arg1 : arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IB)V", line = 205)
    public final void method1104(int arg0, byte arg1) {
        this.field1922 = arg0;
        field1927++;
        if (arg1 >= 49) {
            this.field1921 = 0;
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)V", line = 224)
    public static void method1105(byte arg0) {
        field1919 = null;
        if (arg0 != -59) {
            method1103(-21, 70, false, -22);
        }
        field1920 = null;
        field1929 = null;
    }
}
