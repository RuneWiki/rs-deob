import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class147 {

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "Z")
    private boolean field1854 = true;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
    private int field1861 = -1;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "[Lel;")
    private class642[] field1856;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    private int field1848;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    private int field1859;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
    private int field1860;

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "I")
    private int field1866;

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "[Lel;")
    private class642[] field1864;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "Lel;")
    private class642 field1863;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "Lnj;")
    public static class436 field1855 = new class436(8);

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
    private int field1862;

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!eo", name = "t", descriptor = "I")
    private int field1867;

    @OriginalMember(owner = "client!eo", name = "v", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!eo", name = "u", descriptor = "Lpq;")
    public static class159 field1868;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "Lxa;")
    private class424 field1851;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
    public final void method994(int arg0) {
        field1853++;
        if (this.field1856 != null) {
            for (int var2 = 0; var2 < this.field1856.length; var2++) {
                this.field1856[var2].method3572();
            }
        }
        this.field1851 = null;
        if (arg0 != 0) {
            this.field1863 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIBII[FIIFI)V")
    public static final void method995(int arg0, int arg1, byte arg2, int arg3, int arg4, float[] arg5, int arg6, int arg7, float arg8, int arg9) {
        int var10 = arg7 - arg9;
        field1852++;
        int var11 = arg0 - arg1;
        int var12 = arg3 - arg4;
        float var13 = arg5[2] * (float) var10 + arg5[1] * (float) var11 + arg5[0] * (float) var12;
        if (arg2 != 62) {
            method997(-17, 78, 52);
        }
        float var14 = arg5[5] * (float) var10 + arg5[3] * (float) var12 + arg5[4] * (float) var11;
        float var15 = arg5[8] * (float) var10 + arg5[7] * (float) var11 + arg5[6] * (float) var12;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg8 + 0.5F;
        if (arg6 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg6 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg6 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class381.field5482 = var17;
        class2.field9 = var18;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IBLoa;)Z")
    public final boolean method996(int arg0, byte arg1, class689 arg2) {
        if (arg1 != 126) {
            method1001(-45);
        }
        if (this.field1861 != arg0) {
            this.field1861 = arg0;
            int var4 = class20.method114(arg0, (byte) 109);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field1867 != var4) {
                this.field1851 = null;
                this.field1867 = var4;
            }
            if (this.field1856 != null) {
                this.field1862 = 0;
                int[] var5 = new int[this.field1856.length];
                for (int var6 = 0; var6 < this.field1856.length; var6++) {
                    class642 var7 = this.field1856[var6];
                    if (var7.method3574(this.field1859, this.field1866, this.field1848, this.field1861)) {
                        var5[this.field1862] = var7.field9093;
                        this.field1864[this.field1862++] = var7;
                    }
                }
                class219.method1353(this.field1864, var5, -76, this.field1862 - 1, 0);
            }
            this.field1854 = true;
        }
        field1849++;
        boolean var8 = false;
        if (this.field1854) {
            this.field1854 = false;
            for (int var9 = this.field1862 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field1864[var9].method3573(arg2, this.field1863);
                this.field1854 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)Lwda;")
    public static final class142 method997(int arg0, int arg1, int arg2) {
        class651 var3 = class145.field1841[arg0][arg1][arg2];
        return var3 == null ? null : var3.field9220;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method998(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field1865++;
            return (arg1 & 0x20) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIILoa;IIIIII)V")
    public final void method999(int arg0, int arg1, int arg2, class689 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1857++;
        int var11 = arg6 + arg7 & 0x3FFF;
        if (this.field1860 == -1) {
            arg3.method1926(arg2, arg9, arg1, arg4, arg0, 0);
        } else {
            class568 var12 = class511.field6895.method1728(-96, this.field1860);
            if (this.field1851 == null && class511.field6895.method1732(this.field1860, arg5 ^ 0x69)) {
                int[] var13 = var12.field7868 ? class511.field6895.method1734(true, this.field1867, 0.7F, this.field1867, this.field1860, false) : class511.field6895.method1731(false, 0.7F, 26409, this.field1867, this.field1867, this.field1860);
                this.field1851 = arg3.method1894(var13, 0, this.field1867, this.field1867, this.field1867);
            }
            if (var12.field7868) {
                arg3.method1926(arg2, arg9, arg1, arg4, arg0, 0);
            }
            if (this.field1851 != null) {
                int var14 = var12.field7868 ? 1 : 0;
                int var15 = arg4 * arg8 / -4096;
                int var16;
                for (var16 = arg4 * var11 / 4096 + (arg1 - arg4) / 2; var16 > arg4; var16 -= arg4) {
                }
                while (arg4 < var15) {
                    var15 -= arg4;
                }
                while (var16 < 0) {
                    var16 += arg4;
                }
                while (var15 < 0) {
                    var15 += arg4;
                }
                for (int var17 = var16 - arg4; var17 < arg1; var17 += arg4) {
                    for (int var18 = var15 - arg4; var18 < arg4; var18 += arg4) {
                        this.field1851.method65(var17 + arg2, var18 - -arg9, arg4, arg4, 1, 0, var14);
                    }
                }
            }
        }
        if (arg5 == 0) {
            for (int var19 = this.field1862 - 1; var19 >= 0; var19--) {
                this.field1864[var19].method3576(arg3, arg2, arg9, arg1, arg4, arg8, var11);
            }
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "([SII)[S")
    public static final short[] method1000(short[] arg0, int arg1, int arg2) {
        field1869++;
        short[] var3 = new short[arg2];
        class657.method3637(arg0, arg1, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(I[Lel;IIII)V")
    public class147(int arg0, class642[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1856 = arg1;
        this.field1848 = arg5;
        this.field1859 = arg3;
        this.field1860 = arg0;
        this.field1866 = arg4;
        if (arg1 == null) {
            this.field1864 = null;
            this.field1863 = null;
        } else {
            this.field1864 = new class642[arg1.length];
            this.field1863 = arg2 < 0 ? null : arg1[arg2];
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
    public static final void method1001(int arg0) {
        field1850++;
        class151.field1899.method3144(true);
        class645.field9137.method3144(true);
        class506.field6852.method3144(true);
        class48.field655.method3144(true);
        class620.field8434.method3144(true);
        if (arg0 != -1) {
            method1002((byte) 116);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V")
    public static void method1002(byte arg0) {
        field1868 = null;
        field1855 = null;
        if (arg0 < 111) {
            method997(20, -75, -50);
        }
    }
}
