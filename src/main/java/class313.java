import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class313 extends class216 {

    @OriginalMember(owner = "client!t", name = "J", descriptor = "Lbd;")
    private class162 field5277 = class278.field4669;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "Lbd;")
    public static class162 field5275 = class17.method142(0, "cookiehost");

    @OriginalMember(owner = "client!t", name = "F", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!t", name = "H", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!t", name = "K", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!t", name = "L", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!t", name = "M", descriptor = "I")
    public int field5280;

    @OriginalMember(owner = "client!t", name = "O", descriptor = "I")
    public int field5282;

    @OriginalMember(owner = "client!t", name = "P", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!t", name = "R", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!t", name = "T", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!t", name = "U", descriptor = "I")
    private int field5288;

    @OriginalMember(owner = "client!t", name = "V", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "Lbe;")
    public class235 field5273;

    @OriginalMember(owner = "client!t", name = "N", descriptor = "Lbe;")
    private class235 field5281;

    @OriginalMember(owner = "client!t", name = "W", descriptor = "Lcd;")
    public static class65 field5290;

    @OriginalMember(owner = "client!t", name = "S", descriptor = "[B")
    public static byte[] field5286;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BI)I", line = 9)
    public final int method2132(byte arg0, int arg1) {
        field5285++;
        if (this.field5273 == null) {
            return this.field5288;
        }
        class188 var3 = (class188) this.field5273.method1672((long) arg1, 19760);
        if (var3 == null) {
            return this.field5288;
        } else {
            if (arg0 != 13) {
                method2139((int[]) null, 29, -95, -96, -88, -123);
            }
            return var3.field3237;
        }
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(B)V", line = 32)
    private final void method2133(byte arg0) {
        this.field5281 = new class235(this.field5273.method1675(true));
        field5287++;
        if (arg0 != -59) {
            this.field5277 = (class162) null;
        }
        for (class93 var2 = (class93) this.field5273.method1666((byte) -97); var2 != null; var2 = (class93) this.field5273.method1673((byte) 69)) {
            class243 var3 = new class243(var2.field1649, (int) var2.field2701);
            this.field5281.method1674(var3, false, var2.field1649.method1262(arg0 ^ 0x6464));
        }
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(B)V", line = 57)
    public static void method2134(byte arg0) {
        field5286 = null;
        field5275 = null;
        if (arg0 > 53) {
            field5290 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILb;)V", line = 71)
    private final void method2135(int arg0, int arg1, class94 arg2) {
        if (arg1 <= 61) {
            return;
        }
        field5283++;
        if (arg0 == 1) {
            this.field5280 = arg2.method756(915905888);
        } else if (arg0 == 2) {
            this.field5282 = arg2.method756(915905888);
        } else if (arg0 == 3) {
            this.field5277 = arg2.method744((byte) 105);
        } else if (arg0 == 4) {
            this.field5288 = arg2.method747(false);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg2.method761((byte) 108);
            this.field5273 = new class235(class237.method1678(var4, -31981));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method747(false);
                class151 var7;
                if (arg0 == 5) {
                    var7 = new class93(arg2.method744((byte) 83));
                } else {
                    var7 = new class188(arg2.method747(false));
                }
                this.field5273.method1674(var7, false, (long) var6);
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILb;)V", line = 134)
    public final void method2136(int arg0, class94 arg1) {
        while (true) {
            int var3 = arg1.method756(915905888);
            if (var3 == 0) {
                field5276++;
                if (arg0 <= 117) {
                    this.field5280 = 41;
                }
                return;
            }
            this.method2135(var3, 125, arg1);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([II[JII)V", line = 152)
    public static final void method2137(int[] arg0, int arg1, long[] arg2, int arg3, int arg4) {
        int var5 = -68 / ((arg4 - 17) / 37);
        field5289++;
        if (arg3 <= arg1) {
            return;
        }
        int var6 = (arg1 + arg3) / 2;
        int var7 = arg1;
        long var8 = arg2[var6];
        arg2[var6] = arg2[arg3];
        arg2[arg3] = var8;
        int var10 = arg0[var6];
        arg0[var6] = arg0[arg3];
        arg0[arg3] = var10;
        for (int var11 = arg1; var11 < arg3; var11++) {
            if ((var8 + ((long) (var11 & 0x1))) > arg2[var11]) {
                long var12 = arg2[var11];
                arg2[var11] = arg2[var7];
                arg2[var7] = var12;
                int var14 = arg0[var11];
                arg0[var11] = arg0[var7];
                arg0[var7++] = var14;
            }
        }
        arg2[arg3] = arg2[var7];
        arg2[var7] = var8;
        arg0[arg3] = arg0[var7];
        arg0[var7] = var10;
        method2137(arg0, arg1, arg2, var7 - 1, -80);
        method2137(arg0, var7 + 1, arg2, arg3, -81);
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II)Z", line = 209)
    public final boolean method2138(int arg0, int arg1) {
        field5278++;
        if (arg1 != 0) {
            return true;
        } else if (this.field5273 == null) {
            return false;
        } else {
            if (this.field5281 == null) {
                this.method2142(arg1 ^ 0x0);
            }
            class188 var3 = (class188) this.field5281.method1672((long) arg0, 19760);
            return var3 != null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([IIIIII)V", line = 235)
    public static final void method2139(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class225 var6 = class288.field4856[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class80 var7 = var6.field3766;
        if (var7 != null) {
            int var8 = var7.field1387;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class164 var10 = var6.field3771;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field2909;
        int var12 = var10.field2906;
        int var13 = var10.field2897;
        int var14 = var10.field2901;
        int[] var15 = class137.field2448[var11];
        int[] var16 = class278.field4673[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILbd;)Z", line = 334)
    public final boolean method2140(int arg0, class162 arg1) {
        if (arg0 != 0) {
            method2137((int[]) null, -15, (long[]) null, -62, -4);
        }
        field5284++;
        if (this.field5273 == null) {
            return false;
        }
        if (this.field5281 == null) {
            this.method2133((byte) -59);
        }
        for (class243 var3 = (class243) this.field5281.method1672(arg1.method1262(-25695), 19760); var3 != null; var3 = (class243) this.field5281.method1668((byte) 124)) {
            if (var3.field4039.method1248(arg1, (byte) 107)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(II)Lbd;", line = 365)
    public final class162 method2141(int arg0, int arg1) {
        field5274++;
        if (this.field5273 == null) {
            return this.field5277;
        } else if (arg0 == 0) {
            class93 var3 = (class93) this.field5273.method1672((long) arg1, arg0 ^ 0x4D30);
            return var3 == null ? this.field5277 : var3.field1649;
        } else {
            return (class162) null;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V", line = 392)
    private final void method2142(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field5279++;
        this.field5281 = new class235(this.field5273.method1675(true));
        for (class188 var2 = (class188) this.field5273.method1666((byte) -64); var2 != null; var2 = (class188) this.field5273.method1673((byte) -124)) {
            class188 var3 = new class188((int) var2.field2701);
            this.field5281.method1674(var3, false, (long) var2.field3237);
        }
    }
}
