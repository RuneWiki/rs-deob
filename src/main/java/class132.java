import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class132 extends class231 {

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    private int field2052 = -1;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    private int field2041 = -32768;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "I")
    private int field2057 = -1;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    private int field2047 = 0;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    private int field2055 = 0;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    private int field2046 = 0;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "Z")
    private boolean field2053 = true;

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "Lgk;")
    private class265 field2065 = null;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    private int field2049;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    private int field2044;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
    private int field2051;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    private int field2062;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    private int field2054;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    private int field2048;

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "Lug;")
    private class190 field2066;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
    private int field2063;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "I")
    private int field2067;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "Luf;")
    public static class168 field2064 = class148.method1019(-1720, "(U2");

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Lej;")
    public static class204 field2043 = new class204(20);

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "[J")
    public static long[] field2068 = new long[256];

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Z", line = 7)
    public static final boolean method918(int arg0, int arg1) {
        field2059++;
        if (arg0 != 256) {
            field2068 = (long[]) null;
        }
        return (arg1 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V", line = 19)
    public static void method919(boolean arg0) {
        if (!arg0) {
            method918(-57, -87);
        }
        field2064 = null;
        field2068 = null;
        field2043 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIII)V", line = 34)
    public final void method920(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2042++;
        this.method922(true, 1);
        if (arg0 != 30592) {
            this.field2044 = -85;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIZ)V", line = 48)
    private final void method921(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field2053 = false;
        }
        field2050++;
        if (this.field2066 == null) {
            return;
        }
        int var4 = class203.field3335 - this.field2067;
        if (var4 > 100 && this.field2066.field3074 > 0) {
            int var5 = this.field2066.field3063.length - this.field2066.field3074;
            while (this.field2063 < var5 && var4 > this.field2066.field3075[this.field2063]) {
                var4 -= this.field2066.field3075[this.field2063];
                this.field2063++;
            }
            if (this.field2063 >= var5) {
                int var6 = 0;
                for (int var7 = var5; var7 < this.field2066.field3063.length; var7++) {
                    var6 += this.field2066.field3075[var7];
                }
                var4 %= var6;
            }
        }
        label61: {
            do {
                do {
                    if (this.field2066.field3075[this.field2063] >= var4) {
                        break label61;
                    }
                    class27.method142(this.field2066, (byte) -119, arg0, this.field2063, arg1, false);
                    var4 -= this.field2066.field3075[this.field2063];
                    this.field2063++;
                } while (this.field2066.field3063.length > this.field2063);
                this.field2063 -= this.field2066.field3074;
            } while (this.field2063 >= 0 && this.field2063 < this.field2066.field3063.length);
            this.field2066 = null;
        }
        this.field2067 = class203.field3335 - var4;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "()I", line = 113)
    public final int method116() {
        field2060++;
        return this.field2041;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)Lf;", line = 124)
    private final class231 method922(boolean arg0, int arg1) {
        field2056++;
        boolean var3 = class227.field3686 != class172.field2804;
        class161 var4 = class15.method64(this.field2054, false);
        if (var4.field2553 != null) {
            var4 = var4.method1135(arg1 - 111);
        }
        if (var4 == null) {
            if (!var3) {
                this.method924((byte) -99);
            }
            return null;
        }
        int var5 = this.field2048 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field2558;
            var7 = var4.field2559;
        } else {
            var6 = var4.field2559;
            var7 = var4.field2558;
        }
        int var8 = (var7 >> 1) + this.field2062;
        int var9 = (arg1 + var7 >> 1) + this.field2062;
        int var10 = this.field2051 + (var6 >> 1);
        int var11 = (var6 + 1 >> 1) + this.field2051;
        this.method921(var8 * 128, var10 * 128, true);
        boolean var12 = !var3 && var4.field2557 && (this.field2057 != var4.field2579 || this.field2063 != this.field2052 && class201.field3310 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int[][] var13 = class227.field3686[this.field2049];
        int var14 = (this.field2062 << 7) + (var7 << 6);
        int var15 = var13[var8][var10] + var13[var8][var11] + var13[var9][var10] + var13[var9][var11] >> 2;
        int var16 = (this.field2051 << 7) + (var6 << 6);
        int[][] var17 = (int[][]) null;
        if (var3) {
            var17 = class172.field2804[0];
        } else if (this.field2049 < 3) {
            var17 = class227.field3686[this.field2049 + 1];
        }
        if (var12) {
            class100.method761(this.field2065, this.field2055, this.field2047, this.field2046);
        }
        boolean var18 = this.field2065 == null;
        class12 var19;
        if (this.field2066 == null) {
            var19 = var4.method1128(this.field2044, var14, var17, var15, var12, var16, this.field2048, false, true, var13, var18 ? class141.field2180 : this.field2065);
        } else {
            var19 = var4.method1133(this.field2048, var17, this.field2044, -24131, this.field2066, var16, var12, var15, var14, var18 ? class141.field2180 : this.field2065, var13, this.field2063);
        }
        if (var19 == null) {
            return null;
        }
        if (var12) {
            if (var18) {
                class141.field2180 = var19.field128;
            }
            int var20 = 0;
            if (this.field2049 != 0) {
                int[][] var21 = class227.field3686[0];
                var20 = var15 - (var21[var8][var10] + var21[var9][var11] + var21[var8][var11] + var21[var9][var10] >> 2);
            }
            class265 var22 = var19.field128;
            if (this.field2053 && class100.method762(var22, var14, var20, var16)) {
                this.field2053 = false;
            }
            if (!this.field2053) {
                class100.method757(var22, var14, var20, var16);
                this.field2055 = var14;
                this.field2047 = var20;
                this.field2065 = var22;
                if (var18) {
                    class141.field2180 = null;
                }
                this.field2046 = var16;
            }
            this.field2057 = var4.field2579;
            this.field2052 = this.field2063;
        }
        return var19.field137;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)Lf;", line = 256)
    private final class231 method923(byte arg0) {
        field2045++;
        if (arg0 <= 80) {
            this.field2066 = (class190) null;
        }
        return this.method922(false, 1);
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIIIIZLf;)V", line = 373)
    public class132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class231 arg8) {
        this.field2049 = arg3;
        this.field2044 = arg1;
        this.field2051 = arg5;
        this.field2062 = arg4;
        this.field2054 = arg0;
        this.field2048 = arg2;
        if (arg8 != null) {
            if (arg8 instanceof class132) {
                ((class132) arg8).method924((byte) -84);
            } else {
                class161 var10 = class15.method64(this.field2054, false);
                if (var10.field2553 != null) {
                    var10 = var10.method1135(-115);
                }
                if (var10 != null) {
                    class211.method1475(this.field2051, -44, this.field2062, var10, this.field2049, this.field2044, 0, 0, this.field2048);
                }
            }
        }
        if (arg6 != -1) {
            this.field2066 = class119.method858(true, arg6);
            this.field2063 = 0;
            this.field2067 = class203.field3335 - 1;
            if (this.field2066.field3060 == 0 && arg8 != null && arg8 instanceof class132) {
                class132 var11 = (class132) arg8;
                if (this.field2066 == var11.field2066) {
                    this.field2067 = var11.field2067;
                    this.field2063 = var11.field2063;
                    return;
                }
            }
            if (arg7 && this.field2066.field3074 != -1) {
                this.field2063 = (int) (Math.random() * (double) this.field2066.field3063.length);
                this.field2067 -= (int) ((double) this.field2066.field3075[this.field2063] * Math.random());
            }
        }
        if (arg8 != null) {
            this.method922(true, 1);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIIJ)V", line = 288)
    public final void method112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2061++;
        class231 var11 = this.method923((byte) 117);
        if (var11 != null) {
            var11.method112(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2041 = var11.method116();
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)V", line = 305)
    public final void method924(byte arg0) {
        field2058++;
        if (this.field2065 != null) {
            class100.method761(this.field2065, this.field2055, this.field2047, this.field2046);
        }
        this.field2052 = -1;
        if (arg0 >= -63) {
            this.field2047 = 81;
        }
        this.field2057 = -1;
        this.field2065 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2068[var0] = var1;
        }
    }
}
