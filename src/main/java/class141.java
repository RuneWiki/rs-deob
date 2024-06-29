import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class141 {

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public int field1866 = 0;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public int field1870 = 0;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Lad;")
    private class11 field1864 = new class11(64);

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Lqj;")
    private class413 field1877 = null;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Ldn;")
    private class201 field1876;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Ldn;")
    private class201 field1872;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Z")
    public static boolean field1871 = false;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "[J")
    public static long[] field1869 = new long[32];

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field1874 = 0;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII)I", line = 6)
    public static final int method970(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 1150002076) {
            method975(true);
        }
        field1868++;
        if (arg0 < arg3) {
            return arg3;
        } else if (arg1 >= arg0) {
            return arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(ILdn;Ldn;Lqj;)V", line = 221)
    public class141(int arg0, class201 arg1, class201 arg2, class413 arg3) {
        this.field1877 = arg3;
        this.field1876 = arg1;
        this.field1872 = arg2;
        if (this.field1876 != null) {
            this.field1866 = this.field1876.method1302(-90, 1);
        }
        if (this.field1872 != null) {
            this.field1870 = this.field1872.method1302(-90, 1);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIIII)V", line = 25)
    public static final void method971(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 != -1) {
            return;
        }
        field1873++;
        if (class495.method2961(arg7, 79)) {
            if (class221.field2855[arg7] == null) {
                class140.method969(arg1, arg8, arg5, arg0, class296.field3842[arg7], arg6, -10, -1, arg3, arg2);
            } else {
                class140.method969(arg1, arg8, arg5, arg0, class221.field2855[arg7], arg6, -10, -1, arg3, arg2);
            }
        } else if (arg8 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class76.field967[var9] = true;
            }
        } else {
            class76.field967[arg8] = true;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Lqc;", line = 61)
    public final class255 method972(int arg0, int arg1) {
        field1867++;
        class255 var3 = (class255) this.field1864.method78((long) arg1, (byte) -109);
        if (var3 != null) {
            return var3;
        } else if (arg0 == -31926) {
            byte[] var4;
            if (arg1 < 32768) {
                var4 = this.field1876.method1313((byte) -104, 1, arg1);
            } else {
                var4 = this.field1872.method1313((byte) -111, 1, arg1 & 0x7FFF);
            }
            class255 var5 = new class255();
            var5.field3223 = this;
            if (var4 != null) {
                var5.method1598(new class88(var4), -1);
            }
            if (arg1 >= 32768) {
                var5.method1591((byte) 101);
            }
            this.field1864.method88((long) arg1, 85, var5);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZLwt;)V", line = 94)
    public static final void method973(boolean arg0, class16 arg1) {
        arg1.method99(8);
        field1875++;
        int var2 = class166.field2149;
        class518 var3 = class37.field573 = class76.field952[var2] = new class518();
        var3.field5159 = var2;
        int var4 = arg1.method100((byte) 125, 30);
        if (!arg0) {
            method975(true);
        }
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 0x3FFF;
        int var7 = var4 & 0x3FFF;
        var3.field5246[0] = var6 - class35.field545;
        var3.field6239 = (var3.field5246[0] << 7) + (var3.method2342(10804) << 6);
        var3.field5251[0] = var7 - class336.field4299;
        var3.field6241 = (var3.field5251[0] << 7) + (var3.method2342(10804) << 6);
        class366.field4715 = var3.field6220 = var5;
        if (class514.field7559[var2] != null) {
            var3.method3084(class514.field7559[var2], 0);
        }
        class206.field2684 = 0;
        class143.field1892[class206.field2684++] = var2;
        class360.field4664[var2] = 0;
        class199.field2563 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method100((byte) 52, 18);
                int var10 = var9 >> 16;
                int var11 = (var9 & 0xFFD4) >> 8;
                int var12 = var9 & 0xFF;
                class117 var13 = class351.field4491[var8] = new class117();
                var13.field1640 = 0;
                var13.field1634 = -1;
                var13.field1635 = (var10 << 28) + (var11 << 14) + var12;
                var13.field1642 = false;
                class185.field2428[class199.field2563++] = var8;
                class360.field4664[var8] = 0;
            }
        }
        arg1.method102(103);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([IJLjd;I)Ljava/lang/String;", line = 166)
    public final String method974(int[] arg0, long arg1, class408 arg2, int arg3) {
        field1865++;
        if (this.field1877 != null) {
            String var6 = this.field1877.method164(arg2, arg1, true, arg0);
            if (var6 != null) {
                return var6;
            }
        }
        if (arg3 != 0) {
            this.field1870 = -48;
        }
        return Long.toString(arg1);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V", line = 191)
    public static void method975(boolean arg0) {
        field1869 = null;
        if (!arg0) {
            method973(true, null);
        }
    }
}
