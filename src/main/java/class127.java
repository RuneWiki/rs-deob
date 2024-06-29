import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class127 extends class139 {

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
    private int field2328 = -1;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    private int field2331 = -32768;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "Lrk;")
    private class179 field2342 = null;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "I")
    private int field2340 = -1;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    private int field2326;

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "I")
    private int field2335;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "I")
    private int field2344;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "I")
    private int field2329;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    private int field2327;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
    private int field2337;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "Lwk;")
    private class170 field2339;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    private int field2320;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
    private int field2334;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "[I")
    public static int[] field2332 = new int[256];

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "Z")
    public static boolean field2341 = false;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILpi;Lpi;Lpi;)V")
    public static final void method981(int arg0, class181 arg1, class181 arg2, class181 arg3) {
        field2333++;
        if (arg0 != -2265) {
            field2341 = true;
        }
        class134.field2436 = arg2;
        class229.field4001 = arg1;
        class216.field3824 = arg3;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIB)V")
    public final void method982(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2325++;
        if (arg4 >= -85) {
            method984(98);
        }
        this.method986(((arg2 - arg3 >> 1) + arg3) * 128 + 64, (byte) 29, ((arg0 - arg1 >> 1) + arg1) * 128 + 64);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "()I")
    public final int method183() {
        field2338++;
        return this.field2331;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(J[III)Lha;")
    public static final class46 method983(long arg0, int[] arg1, int arg2, int arg3) {
        field2336++;
        if (class128.field2350 != null) {
            class46 var5 = class128.field2350.method182(arg0, arg3, arg1, -20459);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg3 == 5) {
            return class277.method1862((byte) -64, arg0).method306(true);
        } else {
            int var6 = 89 / ((arg2 - 66) / 54);
            return class257.method1722((byte) -68, arg0);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static void method984(int arg0) {
        field2332 = null;
        if (arg0 != 128) {
            field2332 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)Lj;")
    private final class139 method985(boolean arg0) {
        if (!arg0) {
            field2332 = null;
        }
        field2322++;
        return this.method988((byte) 121, false);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBI)V")
    private final void method986(int arg0, byte arg1, int arg2) {
        field2343++;
        if (arg1 != 29) {
            method984(-114);
        }
        if (this.field2339 == null) {
            return;
        }
        int var4 = class157.field2803 - this.field2334;
        if (var4 > 100 && this.field2339.field3047 > 0) {
            int var5 = this.field2339.field3020.length - this.field2339.field3047;
            while (var5 > this.field2320 && var4 > this.field2339.field3040[this.field2320]) {
                var4 -= this.field2339.field3040[this.field2320];
                this.field2320++;
            }
            if (this.field2320 >= var5) {
                int var6 = 0;
                for (int var7 = var5; var7 < this.field2339.field3020.length; var7++) {
                    var6 += this.field2339.field3040[var7];
                }
                var4 %= var6;
            }
        }
        while (this.field2339.field3040[this.field2320] < var4) {
            class146.method1084(arg0, this.field2339, 87, arg2, false, this.field2320);
            var4 -= this.field2339.field3040[this.field2320];
            this.field2320++;
            if (this.field2320 >= this.field2339.field3020.length) {
                this.field2320 -= this.field2339.field3047;
                if (this.field2320 < 0 || this.field2339.field3020.length <= this.field2320) {
                    this.field2339 = null;
                    break;
                }
            }
        }
        this.field2334 = class157.field2803 - var4;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)I")
    public static final int method987(int arg0, int arg1) {
        int var7 = arg0 - 1;
        field2321++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return arg1 == 1868387312 ? var6 + 1 : 71;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2324++;
        class139 var11 = this.method985(true);
        if (var11 != null) {
            var11.method185(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2331 = var11.method183();
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BZ)Lj;")
    private final class139 method988(byte arg0, boolean arg1) {
        boolean var3 = class2.field33 != class119.field2228;
        field2330++;
        class236 var4 = class157.method1158(this.field2344, 104);
        if (var4.field4142 != null) {
            var4 = var4.method1610(-22);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field2337 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var7 = var4.field4130;
            var6 = var4.field4152;
        } else {
            var6 = var4.field4130;
            var7 = var4.field4152;
        }
        int var8 = this.field2335 + (var7 + 1 >> 1);
        int var9 = this.field2335 + (var7 >> 1);
        if (arg0 != 121) {
            this.method985(false);
        }
        int var10 = (var6 >> 1) + this.field2329;
        int var11 = (var6 + 1 >> 1) + this.field2329;
        this.method986(var10 * 128, (byte) 29, var9 * 128);
        boolean var12 = !var3 && var4.field4115 && (this.field2328 != var4.field4146 || this.field2340 != this.field2320 && class186.field3326 >= 2);
        if (arg1 && !var12) {
            return null;
        }
        int[][] var13 = class119.field2228[this.field2326];
        int var14 = (this.field2335 << 7) + (var7 << 6);
        int var15 = var13[var8][var10] + var13[var9][var10] + var13[var9][var11] + var13[var8][var11] >> 2;
        int var16 = (this.field2329 << 7) + (var6 << 6);
        boolean var17 = this.field2342 == null;
        int[][] var18 = null;
        if (var3) {
            var18 = class2.field33[0];
        } else if (this.field2326 < 3) {
            var18 = class119.field2228[this.field2326 + 1];
        }
        class167 var19;
        if (this.field2339 == null) {
            var19 = var4.method1618(var17 ? class175.field3157 : this.field2342, false, (byte) 118, var13, this.field2337, var18, var16, var12, this.field2327, var15, var14);
        } else {
            var19 = var4.method1603(var15, var16, (byte) -105, var17 ? class175.field3157 : this.field2342, this.field2337, var13, this.field2320, var12, var18, var14, this.field2327, this.field2339);
        }
        return var19 == null ? null : var19.field2944;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(IIIIIIIZLj;)V")
    public class127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class139 arg8) {
        this.field2326 = arg3;
        this.field2335 = arg4;
        this.field2344 = arg0;
        this.field2329 = arg5;
        this.field2327 = arg1;
        this.field2337 = arg2;
        if (arg6 != -1) {
            this.field2339 = class119.method951(0, arg6);
            this.field2320 = 0;
            this.field2334 = class157.field2803 - 1;
            if (this.field2339.field3035 == 0 && arg8 != null && arg8 instanceof class127) {
                class127 var10 = (class127) arg8;
                if (this.field2339 == var10.field2339) {
                    this.field2320 = var10.field2320;
                    this.field2334 = var10.field2334;
                    return;
                }
            }
            if (arg7 && this.field2339.field3047 != -1) {
                this.field2320 = (int) (Math.random() * (double) this.field2339.field3020.length);
                this.field2334 -= (int) (Math.random() * (double) this.field2339.field3040[this.field2320]);
                return;
            }
        }
    }
}
