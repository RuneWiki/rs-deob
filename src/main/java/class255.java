import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class255 extends class128 {

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    private int field3886 = 0;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    private int field3885 = 2048;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    private int field3875 = 12288;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "I")
    private int field3889 = 4096;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    private int field3877 = 2048;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    private int field3884 = 0;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    private int field3883 = 8192;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "I")
    public static int field3876 = -2;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field3892 = null;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "Ljava/lang/String;")
    public static String field3881 = " ";

    @OriginalMember(owner = "client!td", name = "K", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!td", name = "W", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!td", name = "X", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!td", name = "Z", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "Lh;")
    public static class232 field3880;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "[Lbi;")
    public static class91[] field3888;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIILen;Len;IIIIJ)V", line = 3)
    public static final void method1851(int arg0, int arg1, int arg2, int arg3, class47 arg4, class47 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class54 var12 = new class54();
        var12.field656 = arg10;
        var12.field665 = arg1 * 128 + 64;
        var12.field655 = arg2 * 128 + 64;
        var12.field654 = arg3;
        var12.field662 = arg4;
        var12.field669 = arg5;
        var12.field667 = arg6;
        var12.field666 = arg7;
        var12.field659 = arg8;
        var12.field657 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class158.field2184[var13][arg1][arg2] == null) {
                class158.field2184[var13][arg1][arg2] = new class225(var13, arg1, arg2);
            }
        }
        class158.field2184[arg0][arg1][arg2].field3213 = var12;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)V", line = 33)
    public final void method130(boolean arg0) {
        class78.method462(-1);
        if (arg0) {
            this.method126((byte) 15, -107);
        }
        field3879++;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V", line = 49)
    public static final void method1852(byte arg0) {
        int var1 = 120 / ((arg0 + 57) / 46);
        field3878++;
        class229.field3339.method1237((byte) 100);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(BI)[I", line = 63)
    public final int[] method126(byte arg0, int arg1) {
        if (arg0 <= 100) {
            method1853(8, (class263) null);
        }
        int[] var3 = this.field1748.method902(arg1, true);
        if (this.field1748.field1878) {
            int var4 = class49.field600[arg1] - 2048;
            for (int var5 = 0; var5 < class10.field141; var5++) {
                int var6 = class334.field5157[var5] - 2048;
                int var7 = var6 + this.field3885;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = var8 > 2048 ? var8 - 4096 : var8;
                int var10 = this.field3877 + var4;
                int var11 = var4 + this.field3886;
                int var12 = this.field3884 + var6;
                int var13 = var10 >= -2048 ? var10 : var10 + 4096;
                int var14 = var12 >= -2048 ? var12 : var12 + 4096;
                int var15 = var14 <= 2048 ? var14 : var14 - 4096;
                int var16 = var13 <= 2048 ? var13 : var13 - 4096;
                int var17 = var11 < -2048 ? var11 + 4096 : var11;
                int var18 = var17 > 2048 ? var17 - 4096 : var17;
                var3[var5] = this.method1854(9784, var18, var9) || this.method1856(-2075927284, var15, var16) ? 4096 : 0;
            }
        }
        field3893++;
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V", line = 108)
    public class255() {
        super(0, true);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILcc;)Z", line = 112)
    public static final boolean method1853(int arg0, class263 arg1) {
        field3887++;
        if (arg0 >= -85) {
            method1855(true);
        }
        if (arg1.field4135 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field4135.length; var2++) {
            int var3 = class60.method354(arg1, var2, true);
            int var4 = arg1.field3986[var2];
            if (arg1.field4135[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field4135[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field4135[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(III)Z", line = 176)
    private final boolean method1854(int arg0, int arg1, int arg2) {
        field3882++;
        int var4 = (arg1 - arg2) * this.field3875 >> 12;
        if (arg0 != 9784) {
            return true;
        }
        int var5 = class276.field4298[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field3875;
        int var7 = (var6 << 12) / this.field3883;
        int var8 = this.field3889 * var7 >> 12;
        return var8 > (arg1 + arg2) && (-var8) < (arg2 + arg1);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lp;II)V", line = 226)
    public final void method107(class107 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field3885 = arg0.method624(14612);
        } else if (arg1 == 1) {
            this.field3886 = arg0.method624(14612);
        } else if (arg1 == 2) {
            this.field3884 = arg0.method624(14612);
        } else if (arg1 == 3) {
            this.field3877 = arg0.method624(14612);
        } else if (arg1 == 4) {
            this.field3875 = arg0.method624(14612);
        } else if (arg1 == 5) {
            this.field3889 = arg0.method624(14612);
        } else if (arg1 == 6) {
            this.field3883 = arg0.method624(14612);
        }
        if (arg2 >= -85) {
            this.field3886 = 15;
        }
        field3890++;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(Z)V", line = 298)
    public static void method1855(boolean arg0) {
        if (arg0) {
            field3888 = (class91[]) null;
        }
        field3888 = null;
        field3892 = null;
        field3881 = null;
        field3880 = null;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(III)Z", line = 314)
    private final boolean method1856(int arg0, int arg1, int arg2) {
        field3891++;
        if (arg0 != -2075927284) {
            method1851(29, 43, -106, 123, (class47) null, (class47) null, 17, -36, 22, 118, 23L);
        }
        int var4 = (arg1 + arg2) * this.field3875 >> 12;
        int var5 = class276.field4298[(var4 * 255 & 0xFF97E) >> 12];
        int var6 = (var5 << 12) / this.field3875;
        int var7 = (var6 << 12) / this.field3883;
        int var8 = this.field3889 * var7 >> 12;
        return arg2 - arg1 < var8 && arg2 - arg1 > -var8;
    }
}
