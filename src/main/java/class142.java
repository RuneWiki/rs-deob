import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class142 {

    @OriginalMember(owner = "client!kt", name = "p", descriptor = "Z")
    private boolean field2105 = true;

    @OriginalMember(owner = "client!kt", name = "r", descriptor = "I")
    private int field2107 = -1;

    @OriginalMember(owner = "client!kt", name = "s", descriptor = "I")
    private int field2108;

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
    private int field2094;

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "I")
    private int field2095;

    @OriginalMember(owner = "client!kt", name = "i", descriptor = "[Lhe;")
    private class337[] field2098;

    @OriginalMember(owner = "client!kt", name = "j", descriptor = "I")
    private int field2099;

    @OriginalMember(owner = "client!kt", name = "l", descriptor = "[Lhe;")
    private class337[] field2101;

    @OriginalMember(owner = "client!kt", name = "k", descriptor = "Lhe;")
    private class337 field2100;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
    public static int field2091 = 0;

    @OriginalMember(owner = "client!kt", name = "m", descriptor = "I")
    public static int field2102 = 0;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "I")
    private int field2096;

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!kt", name = "n", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!kt", name = "o", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!kt", name = "q", descriptor = "I")
    private int field2106;

    @OriginalMember(owner = "client!kt", name = "t", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "Lf;")
    private class702 field2092;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
    public static final void method1022(int arg0) {
        field2090++;
        int[] var1 = new int[class41.field682.field5251];
        if (arg0 != -27264) {
            return;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < class41.field682.field5251; var3++) {
            class186 var5 = class41.field682.method2228(var3, arg0 ^ 0xFFFF9580);
            if (var5.field2615 >= 0 || var5.field2639 >= 0) {
                var1[var2++] = var3;
            }
        }
        class554.field7852 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class554.field7852[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZILr;)Z")
    public final boolean method1023(boolean arg0, int arg1, class166 arg2) {
        if (!arg0) {
            method1024((byte) 82, 95, 37);
        }
        field2103++;
        if (this.field2107 != arg1) {
            this.field2107 = arg1;
            int var4 = class405.method2458(arg1, -619912415);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field2096 != var4) {
                this.field2096 = var4;
                this.field2092 = null;
            }
            if (this.field2098 != null) {
                this.field2106 = 0;
                int[] var5 = new int[this.field2098.length];
                for (int var6 = 0; var6 < this.field2098.length; var6++) {
                    class337 var7 = this.field2098[var6];
                    if (var7.method2123(this.field2094, this.field2095, this.field2099, this.field2107)) {
                        var5[this.field2106] = var7.field4966;
                        this.field2101[this.field2106++] = var7;
                    }
                }
                class303.method1939(-704, this.field2106 - 1, 0, this.field2101, var5);
            }
            this.field2105 = true;
        }
        boolean var8 = false;
        if (this.field2105) {
            this.field2105 = false;
            for (int var9 = this.field2106 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field2101[var9].method2117(arg2, this.field2100);
                this.field2105 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BII)Z")
    public static final boolean method1024(byte arg0, int arg1, int arg2) {
        field2104++;
        if (arg0 != -86) {
            method1024((byte) -63, 105, -23);
        }
        return class518.method2960(arg1, (byte) -37, arg2) || class352.method2161(arg2, true, arg1);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIBIIIILr;II)V")
    public final void method1025(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, class166 arg7, int arg8, int arg9) {
        int var11 = arg1 + arg6 & 0x3FFF;
        if (arg2 > -105) {
            this.field2095 = -120;
        }
        field2097++;
        if (this.field2108 == -1) {
            arg7.method114(arg9, arg8, arg3, arg0, arg5, 0);
        } else {
            class159 var12 = class199.field2809.method1386(this.field2108, -6514);
            if (this.field2092 == null && class199.field2809.method1383(this.field2108, -50)) {
                int[] var13 = var12.field2295 ? class199.field2809.method1384(false, this.field2096, this.field2096, this.field2108, 0.7F, (byte) 125) : class199.field2809.method1381(this.field2096, this.field2108, 0.7F, this.field2096, -87, false);
                this.field2092 = arg7.method209(var13, 0, this.field2096, this.field2096, this.field2096);
            }
            if (var12.field2295) {
                arg7.method114(arg9, arg8, arg3, arg0, arg5, 0);
            }
            if (this.field2092 != null) {
                int var14 = var12.field2295 ? 1 : 0;
                int var15 = arg0 * arg4 / -4096;
                int var16;
                for (var16 = arg0 * var11 / 4096 + (arg3 - arg0) / 2; var16 > arg0; var16 -= arg0) {
                }
                while (var16 < 0) {
                    var16 += arg0;
                }
                while (var15 > arg0) {
                    var15 -= arg0;
                }
                while (var15 < 0) {
                    var15 += arg0;
                }
                for (int var17 = var16 - arg0; var17 < arg3; var17 += arg0) {
                    for (int var18 = var15 - arg0; var18 < arg0; var18 += arg0) {
                        this.field2092.method3909(var17 + arg9, arg8 + var18, arg0, arg0, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field2106 - 1; var19 >= 0; var19--) {
            this.field2101[var19].method2118(arg7, arg9, arg8, arg3, arg0, arg4, var11);
        }
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)V")
    public final void method1026(int arg0) {
        if (arg0 != 4039) {
            this.field2107 = -21;
        }
        field2093++;
        if (this.field2098 != null) {
            for (int var2 = 0; var2 < this.field2098.length; var2++) {
                this.field2098[var2].method2124();
            }
        }
        this.field2092 = null;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(I[Lhe;IIII)V")
    public class142(int arg0, class337[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2108 = arg0;
        this.field2094 = arg3;
        this.field2095 = arg4;
        this.field2098 = arg1;
        this.field2099 = arg5;
        if (arg1 == null) {
            this.field2101 = null;
            this.field2100 = null;
        } else {
            this.field2101 = new class337[arg1.length];
            this.field2100 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
