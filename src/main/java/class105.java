import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class105 {

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    private int field1747 = -1;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "Z")
    private boolean field1753 = true;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    private int field1759;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    private int field1752;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "[Llp;")
    private class266[] field1745;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    private int field1756;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    private int field1741;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "Llp;")
    private class266 field1755;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "[Llp;")
    private class266[] field1760;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "[I")
    public static int[] field1758 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field1757 = 0;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    private int field1749;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    private int field1751;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Lf;")
    private class529 field1742;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 3)
    public static void method790(int arg0) {
        if (arg0 != 5350) {
            field1757 = -75;
        }
        field1758 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIILqa;II)V", line = 23)
    public final void method791(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class162 arg7, int arg8, int arg9) {
        int var11 = arg8 + arg1 & 0x3FFF;
        field1743++;
        if (this.field1759 == -1) {
            arg7.method253(arg9, arg0, arg6, arg3, arg5, 0);
        } else {
            class83 var12 = class405.field6073.method956(arg4 + 19543, this.field1759);
            if (this.field1742 == null && class405.field6073.method959(this.field1759, (byte) 94)) {
                int[] var13 = var12.field1441 ? class405.field6073.method958(this.field1759, this.field1751, this.field1751, true, false, 0.7F) : class405.field6073.method957(false, this.field1759, this.field1751, 0.7F, this.field1751, 26878);
                this.field1742 = arg7.method306(var13, 0, this.field1751, this.field1751, this.field1751);
            }
            if (!var12.field1441) {
                arg7.method253(arg9, arg0, arg6, arg3, arg5, 0);
            }
            if (this.field1742 != null) {
                int var14 = var12.field1441 ? 0 : 1;
                int var15 = arg2 * arg3 / -4096;
                int var16;
                for (var16 = arg3 * var11 / 4096 + (arg6 - arg3) / 2; var16 > arg3; var16 -= arg3) {
                }
                while (var15 > arg3) {
                    var15 -= arg3;
                }
                while (var16 < 0) {
                    var16 += arg3;
                }
                while (var15 < 0) {
                    var15 += arg3;
                }
                for (int var17 = var16 - arg3; var17 < arg6; var17 += arg3) {
                    for (int var18 = var15 - arg3; var18 < arg3; var18 += arg3) {
                        this.field1742.method105(arg9 + var17, arg0 + var18, arg3, arg3, 1, 0, var14);
                    }
                }
            }
        }
        if (arg4 != -20488) {
            field1758 = null;
        }
        for (int var19 = this.field1749 - 1; var19 >= 0; var19--) {
            this.field1760[var19].method1715(arg7, arg9, arg0, arg6, arg3, arg2, var11);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V", line = 101)
    public static final void method792(int arg0, int arg1, int arg2, int arg3) {
        field1748++;
        class54 var4 = class442.method2651(arg3, 9, arg1 - 13208);
        var4.method480(arg1);
        var4.field934 = arg2;
        var4.field930 = arg0;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V", line = 114)
    public final void method793(int arg0) {
        field1754++;
        if (this.field1745 != null) {
            for (int var2 = 0; var2 < this.field1745.length; var2++) {
                this.field1745[var2].method1712();
            }
        }
        if (arg0 == 99) {
            this.field1742 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 143)
    public static final void method794(byte arg0) {
        field1744++;
        for (class208 var1 = (class208) class339.field5122.method2427(126); var1 != null; var1 = (class208) class339.field5122.method2422(-81)) {
            if (class77.method613((byte) 36, var1.field3005)) {
                class480.method2862(var1, (byte) 82);
            }
        }
        int var2 = 38 / ((arg0 - 26) / 59);
        if (class363.field5500 == 1) {
            class197.field2903 = false;
            class62.method534((byte) 60, class499.field7375, class87.field1529, class106.field1766, class215.field3104);
            return;
        }
        class62.method534((byte) 60, class499.field7375, class87.field1529, class106.field1766, class215.field3104);
        int var3 = class501.field7392.method2136(class297.field4210.method2180(client.field2870, 29491), 13216);
        for (class208 var4 = (class208) class339.field5122.method2427(120); var4 != null; var4 = (class208) class339.field5122.method2422(-94)) {
            int var5 = class429.method2570(var4, -1);
            if (var3 < var5) {
                var3 = var5;
            }
        }
        class499.field7375 = var3 + 8;
        class87.field1529 = (class295.field4199 ? 26 : 22) + class363.field5500 * 16;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I[Llp;IIII)V", line = 298)
    public class105(int arg0, class266[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1759 = arg0;
        this.field1752 = arg4;
        this.field1745 = arg1;
        this.field1756 = arg5;
        this.field1741 = arg3;
        if (arg1 == null) {
            this.field1755 = null;
            this.field1760 = null;
        } else {
            this.field1760 = new class266[arg1.length];
            this.field1755 = arg2 < 0 ? null : arg1[arg2];
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BII)Z", line = 203)
    public static final boolean method795(byte arg0, int arg1, int arg2) {
        int var3 = 78 % ((arg0 + 63) / 63);
        field1750++;
        return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILqa;I)Z", line = 213)
    public final boolean method796(int arg0, class162 arg1, int arg2) {
        if (this.field1747 != arg2) {
            this.field1747 = arg2;
            int var4 = class51.method464(1905326856, arg2);
            if (arg2 < var4) {
                var4 = class338.method2165(arg2, 1006);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field1751 != var4) {
                this.field1742 = null;
                this.field1751 = var4;
            }
            if (this.field1745 != null) {
                this.field1749 = 0;
                int[] var5 = new int[this.field1745.length];
                for (int var6 = 0; var6 < this.field1745.length; var6++) {
                    class266 var7 = this.field1745[var6];
                    if (var7.method1711(this.field1741, this.field1752, this.field1756, this.field1747)) {
                        var5[this.field1749] = var7.field3833;
                        this.field1760[this.field1749++] = var7;
                    }
                }
                class438.method2618(this.field1749 - 1, this.field1760, var5, 0, (byte) -96);
            }
            this.field1753 = true;
        }
        if (arg0 < 27) {
            method794((byte) -28);
        }
        field1746++;
        boolean var8 = false;
        if (this.field1753) {
            this.field1753 = false;
            for (int var9 = this.field1749 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field1760[var9].method1709(arg1, this.field1755);
                this.field1753 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }
}
