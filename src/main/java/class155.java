import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class155 {

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    private int field2153 = 0;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public int field2150;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "[Lrs;")
    public class449[] field2144;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Lch;")
    public static class151 field2140 = new class151("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "J")
    private long field2149;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "Lrs;")
    private class449 field2146;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "Lrs;")
    private class449 field2154;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "Ld;")
    public static class57 field2152;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([Lrs;B)I", line = 4)
    public final int method1096(class449[] arg0, byte arg1) {
        field2151++;
        if (arg1 != 37) {
            this.field2146 = null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2150; var4++) {
            class449 var5 = this.field2144[var4];
            for (class449 var6 = var5.field6385; var6 != var5; var6 = var6.field6385) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)Lrs;", line = 37)
    public final class449 method1097(int arg0) {
        if (arg0 != 64) {
            this.field2146 = null;
        }
        this.field2153 = 0;
        field2147++;
        return this.method1105(false);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)I", line = 53)
    public final int method1098(boolean arg0) {
        if (!arg0) {
            this.method1099((byte) 34);
        }
        field2145++;
        return this.field2150;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)Lrs;", line = 65)
    public final class449 method1099(byte arg0) {
        field2139++;
        if (this.field2146 == null) {
            return null;
        }
        if (arg0 < 38) {
            this.method1099((byte) 29);
        }
        class449 var2 = this.field2144[(int) (this.field2149 & (long) (this.field2150 - 1))];
        while (this.field2146 != var2) {
            if (this.field2146.field6382 == this.field2149) {
                class449 var3 = this.field2146;
                this.field2146 = this.field2146.field6385;
                return var3;
            }
            this.field2146 = this.field2146.field6385;
        }
        this.field2146 = null;
        return null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lrs;IJ)V", line = 97)
    public final void method1100(class449 arg0, int arg1, long arg2) {
        if (arg0.field6388 != null) {
            arg0.method2714(-123);
        }
        field2142++;
        class449 var5 = this.field2144[(int) ((long) (this.field2150 - 1) & arg2)];
        int var6 = -4 / ((-arg1 - 79) / 32);
        arg0.field6385 = var5;
        arg0.field6388 = var5.field6388;
        arg0.field6388.field6385 = arg0;
        arg0.field6382 = arg2;
        arg0.field6385.field6388 = arg0;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)V", line = 117)
    public final void method1101(byte arg0) {
        for (int var2 = 0; var2 < this.field2150; var2++) {
            class449 var3 = this.field2144[var2];
            while (true) {
                class449 var4 = var3.field6385;
                if (var3 == var4) {
                    break;
                }
                var4.method2714(-58);
            }
        }
        if (arg0 < 33) {
            field2140 = null;
        }
        field2141++;
        this.field2146 = null;
        this.field2154 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIILmm;IZ)V", line = 149)
    public static final void method1102(int arg0, int arg1, int arg2, class31 arg3, int arg4, boolean arg5) {
        field2143++;
        if (arg3.field328 == -1 && arg3.field334 == null) {
            return;
        }
        int var6 = 0;
        if (arg3.field319 < arg4) {
            var6 += arg4 - arg3.field319;
        } else if (arg4 < arg3.field322) {
            var6 += arg3.field322 - arg4;
        }
        int var7 = class339.field4687 * arg3.field321 >> 8;
        if (arg3.field327 < arg1) {
            var6 += arg1 - arg3.field327;
        } else if (arg1 < arg3.field323) {
            var6 += arg3.field323 - arg1;
        }
        if (arg3.field325 == 0 || (var6 - 64) > arg3.field325 || class339.field4687 == 0 || arg3.field314 != arg0) {
            if (arg3.field335 != null) {
                class332.field4613.method2406(arg3.field335);
                arg3.field335 = null;
            }
            if (arg3.field318 != null) {
                class332.field4613.method2406(arg3.field318);
                arg3.field318 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        if (!arg5) {
            field2140 = null;
        }
        int var8 = (arg3.field325 - var6) * var7 / arg3.field325;
        if (arg3.field335 != null) {
            arg3.field335.method1476(var8);
        } else if (arg3.field328 >= 0) {
            class242 var9 = class242.method1682(class74.field1070, arg3.field328, 0);
            if (var9 != null) {
                class44 var10 = var9.method1681().method461(class445.field6349);
                class215 var11 = class215.method1484(var10, 100, var8);
                var11.method1483(-1);
                class332.field4613.method2407(var11);
                arg3.field335 = var11;
            }
        }
        if (arg3.field318 != null) {
            arg3.field318.method1476(var8);
            if (arg3.field318.method2715(-99)) {
                return;
            }
            arg3.field318 = null;
        } else if (arg3.field334 != null && (arg3.field329 -= arg2) <= 0) {
            int var12 = (int) ((double) arg3.field334.length * Math.random());
            class242 var13 = class242.method1682(class74.field1070, arg3.field334[var12], 0);
            if (var13 != null) {
                class44 var14 = var13.method1681().method461(class445.field6349);
                class215 var15 = class215.method1484(var14, 100, var8);
                var15.method1483(0);
                class332.field4613.method2407(var15);
                arg3.field329 = arg3.field315 + ((int) ((double) (arg3.field336 - arg3.field315) * Math.random()));
                arg3.field318 = var15;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V", line = 277)
    public static void method1103(int arg0) {
        int var1 = -84 / ((46 - arg0) / 46);
        field2152 = null;
        field2140 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IJ)Lrs;", line = 288)
    public final class449 method1104(int arg0, long arg1) {
        this.field2149 = arg1;
        field2155++;
        class449 var4 = this.field2144[(int) (arg1 & (long) (this.field2150 - 1))];
        if (arg0 >= -123) {
            method1102(-52, -52, 76, (class31) null, 5, false);
        }
        for (this.field2146 = var4.field6385; this.field2146 != var4; this.field2146 = this.field2146.field6385) {
            if (this.field2146.field6382 == arg1) {
                class449 var5 = this.field2146;
                this.field2146 = this.field2146.field6385;
                return var5;
            }
        }
        this.field2146 = null;
        return null;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(Z)Lrs;", line = 320)
    public final class449 method1105(boolean arg0) {
        field2148++;
        if (arg0) {
            this.field2150 = -108;
        }
        if (this.field2153 > 0 && this.field2144[this.field2153 - 1] != this.field2154) {
            class449 var2 = this.field2154;
            this.field2154 = var2.field6385;
            return var2;
        }
        while (this.field2153 < this.field2150) {
            class449 var3 = this.field2144[this.field2153++].field6385;
            if (this.field2144[this.field2153 - 1] != var3) {
                this.field2154 = var3.field6385;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(I)V", line = 361)
    public class155(int arg0) {
        this.field2150 = arg0;
        this.field2144 = new class449[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class449 var3 = this.field2144[var2] = new class449();
            var3.field6388 = var3;
            var3.field6385 = var3;
        }
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(Z)I", line = 382)
    public final int method1106(boolean arg0) {
        field2138++;
        int var2 = 0;
        if (arg0) {
            return -73;
        }
        for (int var3 = 0; var3 < this.field2150; var3++) {
            class449 var4 = this.field2144[var3];
            for (class449 var5 = var4.field6385; var5 != var4; var5 = var5.field6385) {
                var2++;
            }
        }
        return var2;
    }
}
