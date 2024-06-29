import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class161 extends class544 {

    @OriginalMember(owner = "client!op", name = "m", descriptor = "Lml;")
    private class325 field1942;

    @OriginalMember(owner = "client!op", name = "G", descriptor = "Lcba;")
    private class469 field1961;

    @OriginalMember(owner = "client!op", name = "t", descriptor = "Lbda;")
    private class428 field1949;

    @OriginalMember(owner = "client!op", name = "u", descriptor = "I")
    private int field1950;

    @OriginalMember(owner = "client!op", name = "D", descriptor = "I")
    private int field1958;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "I")
    private int field1946;

    @OriginalMember(owner = "client!op", name = "x", descriptor = "I")
    private int field1953;

    @OriginalMember(owner = "client!op", name = "y", descriptor = "[[F")
    private float[][] field1954;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "[[F")
    private float[][] field1944;

    @OriginalMember(owner = "client!op", name = "K", descriptor = "[[F")
    private float[][] field1965;

    @OriginalMember(owner = "client!op", name = "v", descriptor = "I")
    private int field1951;

    @OriginalMember(owner = "client!op", name = "H", descriptor = "Lpt;")
    private class451 field1962;

    @OriginalMember(owner = "client!op", name = "B", descriptor = "Liaa;")
    private class419 field1956;

    @OriginalMember(owner = "client!op", name = "C", descriptor = "Ljaclib/memory/Stream;")
    private Stream field1957;

    @OriginalMember(owner = "client!op", name = "p", descriptor = "Ljaclib/memory/Stream;")
    private Stream field1945;

    @OriginalMember(owner = "client!op", name = "z", descriptor = "Lrq;")
    private class293 field1955;

    @OriginalMember(owner = "client!op", name = "E", descriptor = "I")
    private int field1959;

    @OriginalMember(owner = "client!op", name = "s", descriptor = "Z")
    public static boolean field1948 = false;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!op", name = "r", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!op", name = "w", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!op", name = "F", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!op", name = "J", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!op", name = "I", descriptor = "Lsda;")
    public static class215 field1963;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public static void method880(int arg0) {
        field1963 = null;
        if (arg0 <= 32) {
            method883(32, -117, 104, -112, -73, -10);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIB[[Z)V")
    public final void method881(int arg0, int arg1, int arg2, byte arg3, boolean[][] arg4) {
        field1943++;
        if (this.field1956 == null || this.field1950 > (arg2 + arg0) || this.field1958 < arg2 - arg0 || (arg0 + arg1) < this.field1946 || arg3 != 126 || arg1 - arg0 > this.field1953) {
            return;
        }
        for (int var6 = this.field1946; var6 <= this.field1953; var6++) {
            for (int var7 = this.field1950; var7 <= this.field1958; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg1;
                if (var8 > (-arg0) && arg0 > var8 && var9 > (-arg0) && arg0 > var9 && arg4[arg0 + var8][arg0 + var9]) {
                    this.field1949.method2415((byte) ((int) (this.field1961.method2734((byte) -37) * 255.0F)), (byte) 117);
                    this.field1949.method1837(this.field1949.field5802, arg3 - 117);
                    this.field1949.method1792(this.field1955, 0, (byte) 89);
                    this.field1949.method1801(0, this.field1959, 1440, class384.field5077, this.field1956, this.field1951 / 3, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IS)V")
    private final void method882(int arg0, short arg1) {
        field1952++;
        if (arg0 != 7107) {
            this.field1946 = -37;
        }
        if (Stream.method3340()) {
            this.field1945.method3339(arg1);
        } else {
            this.field1945.method3341(arg1);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method883(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1960++;
        for (int var6 = arg4; var6 <= arg3; var6++) {
            for (int var7 = arg0; var7 <= arg5; var7++) {
                if (class405.field5331[var6][var7] == arg1 && class457.field6296[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        if (arg2 != 1) {
            field1963 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)I")
    public static final int method884(int arg0) {
        field1964++;
        class206 var1 = class210.field2560;
        boolean var2 = false;
        if (class529.field7429 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class206.method1152(var3, 0, (byte) 50, null, null, 0);
        }
        if (arg0 != 1) {
            field1948 = false;
        }
        long var4 = class190.method1030(false);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method264(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class190.method1030(false) - var4);
        var1.method1118(-16777216, (byte) 104, 100, 0, 0, 100);
        if (var2) {
            var1.method1103((byte) 94);
        }
        return var7;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIIIII)V")
    private final void method885(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1947++;
        long var8 = -1L;
        int var10 = arg1 + (arg3 << this.field1942.field2111);
        int var11 = (arg4 << this.field1942.field2111) + arg0;
        int var12 = this.field1942.method847(var10, var11);
        if ((arg1 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class544 var13 = this.field1962.method2645(var8, (byte) -91);
            if (var13 != null) {
                this.method882(7107, ((class492) var13).field6867);
                return;
            }
        }
        short var14 = (short) (this.field1959++);
        if (var8 != -1L) {
            this.field1962.method2640(1, var8, new class492(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg1 == 0 && arg0 == 0) {
            var15 = this.field1954[arg2][arg5];
            var16 = this.field1965[arg2][arg5];
            var17 = this.field1944[arg2][arg5];
        } else if (this.field1942.field2115 == arg1 && arg0 == 0) {
            var16 = this.field1965[arg2 + 1][arg5];
            var17 = this.field1944[arg2 + 1][arg5];
            var15 = this.field1954[arg2 + 1][arg5];
        } else if (this.field1942.field2115 == arg1 && this.field1942.field2115 == arg0) {
            var15 = this.field1954[arg2 + 1][arg5 + 1];
            var16 = this.field1965[arg2 + 1][arg5 + 1];
            var17 = this.field1944[arg2 + 1][arg5 + 1];
        } else if (arg1 == 0 && this.field1942.field2115 == arg0) {
            var16 = this.field1965[arg2][arg5 + 1];
            var17 = this.field1944[arg2][arg5 + 1];
            var15 = this.field1954[arg2][arg5 + 1];
        } else {
            float var18 = (float) arg1 / (float) this.field1942.field2115;
            float var19 = (float) arg0 / (float) this.field1942.field2115;
            float var20 = this.field1944[arg2][arg5];
            float var21 = this.field1965[arg2][arg5];
            float var22 = this.field1954[arg2][arg5];
            float var23 = this.field1944[arg2 + 1][arg5];
            float var24 = this.field1965[arg2 + 1][arg5];
            float var25 = this.field1954[arg2 + 1][arg5];
            float var26 = (this.field1944[arg2][arg5 + 1] - var20) * var18 + var20;
            float var27 = (this.field1965[arg2 + 1][arg5 + 1] - var24) * var18 + var24;
            float var28 = (this.field1965[arg2][arg5 + 1] - var21) * var18 + var21;
            float var29 = (this.field1944[arg2 + 1][arg5 + 1] - var23) * var18 + var23;
            float var30 = (this.field1954[arg2][arg5 + 1] - var22) * var18 + var22;
            float var31 = (this.field1954[arg2 + 1][arg5 + 1] - var25) * var18 + var25;
            var17 = (var29 - var26) * var19 + var26;
            var16 = (var27 - var28) * var19 + var28;
            var15 = (var31 - var30) * var19 + var30;
        }
        float var32 = (float) (this.field1961.method2731((byte) -96) - var10);
        float var33 = (float) (this.field1961.method2730(-1) - var12);
        if (arg6 != 1) {
            field1948 = false;
        }
        float var34 = (float) (this.field1961.method2737((byte) -86) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var34 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field1961.method2735((byte) 80);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var38 + var16 * var37 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field1961.method2736((byte) 70);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF4C) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (Stream.method3340()) {
            this.field1957.method3348((float) var10);
            this.field1957.method3348((float) var12);
            this.field1957.method3348((float) var11);
        } else {
            this.field1957.method3344((float) var10);
            this.field1957.method3344((float) var12);
            this.field1957.method3344((float) var11);
        }
        if (this.field1949.field5766 == 0) {
            this.field1957.method3337(var47);
            this.field1957.method3337(var46);
            this.field1957.method3337(var45);
        } else {
            this.field1957.method3337(var45);
            this.field1957.method3337(var46);
            this.field1957.method3337(var47);
        }
        this.field1957.method3337(255);
        this.method882(7107, var14);
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lbda;Lml;Lcba;[I)V")
    public class161(class428 arg0, class325 arg1, class469 arg2, int[] arg3) {
        this.field1942 = arg1;
        this.field1961 = arg2;
        this.field1949 = arg0;
        int var5 = this.field1961.method2735((byte) 116) - (arg1.field2115 >> 1);
        this.field1950 = this.field1961.method2731((byte) -96) - var5 >> arg1.field2111;
        this.field1958 = this.field1961.method2731((byte) -96) + var5 >> arg1.field2111;
        this.field1946 = this.field1961.method2737((byte) -86) - var5 >> arg1.field2111;
        this.field1953 = var5 + this.field1961.method2737((byte) -86) >> arg1.field2111;
        int var6 = this.field1958 + 1 - this.field1950;
        int var7 = this.field1953 + 1 - this.field1946;
        this.field1954 = new float[var6 + 1][var7 + 1];
        this.field1944 = new float[var6 + 1][var7 + 1];
        this.field1965 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field1946 + var8;
            if (var25 > 0 && this.field1942.field2114 - 1 > var25) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field1950 + var26;
                    if (var27 > 0 && var27 < this.field1942.field2116 - 1) {
                        int var28 = arg1.method855(var27 + 1, var25) - arg1.method855(var27 - 1, var25);
                        int var29 = arg1.method855(var27, var25 + 1) - arg1.method855(var27, var25 - 1);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var28 * var28 + (var29 * var29) + 65536)));
                        this.field1944[var26][var8] = (float) var28 * var30;
                        this.field1965[var26][var8] = var30 * -256.0F;
                        this.field1954[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field1946; var10 <= this.field1953; var10++) {
            if (var10 >= 0 && var10 < arg1.field2114) {
                for (int var22 = this.field1950; var22 <= this.field1958; var22++) {
                    if (var22 >= 0 && var22 < arg1.field2116) {
                        int var23 = arg3[var9];
                        int[] var24 = arg1.field4113[var22][var10];
                        if (var24 != null && var23 != 0) {
                            this.field1951 += var23 == 1 ? var24.length : 3;
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field1958 - this.field1950;
            }
        }
        if (this.field1951 > 0) {
            this.field1962 = new class451(class129.method731(this.field1951, -27265));
            this.field1956 = this.field1949.method1795(false, (byte) -55);
            this.field1956.method644(95, this.field1951);
            NativeHeapBuffer var11 = this.field1949.method2451(false, this.field1951 * 16, true);
            this.field1957 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field1956.method440(-107, true);
                } while (var12 == null);
                this.field1945 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field1946; var15 <= this.field1953; var15++) {
                    if (var15 >= 0 && arg1.field2114 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field1950; var17 <= this.field1958; var17++) {
                            if (var17 >= 0 && arg1.field2116 > var17) {
                                int var18 = arg3[var14];
                                int[] var19 = arg1.field4113[var17][var15];
                                int[] var20 = arg1.field4111[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        for (int var21 = 0; var21 < var19.length; var21++) {
                                            this.method885(var20[var21], var19[var21], var16, var17, var15, var13, 1);
                                        }
                                    } else if (var18 == 3) {
                                        this.method885(0, 0, var16, var17, var15, var13, 1);
                                        this.method885(0, arg1.field2115, var16, var17, var15, var13, 1);
                                        this.method885(arg1.field2115, 0, var16, var17, var15, var13, 1);
                                    } else if (var18 == 2) {
                                        this.method885(0, arg1.field2115, var16, var17, var15, var13, 1);
                                        this.method885(arg1.field2115, arg1.field2115, var16, var17, var15, var13, 1);
                                        this.method885(0, 0, var16, var17, var15, var13, 1);
                                    } else if (var18 == 5) {
                                        this.method885(arg1.field2115, arg1.field2115, var16, var17, var15, var13, 1);
                                        this.method885(arg1.field2115, 0, var16, var17, var15, var13, 1);
                                        this.method885(0, arg1.field2115, var16, var17, var15, var13, 1);
                                    } else if (var18 == 4) {
                                        this.method885(arg1.field2115, 0, var16, var17, var15, var13, 1);
                                        this.method885(0, 0, var16, var17, var15, var13, 1);
                                        this.method885(arg1.field2115, arg1.field2115, var16, var17, var15, var13, 1);
                                    }
                                }
                            }
                            var16++;
                            var14++;
                        }
                    } else {
                        var14 += this.field1958 - this.field1950;
                    }
                    var13++;
                }
                this.field1945.method3342();
                if (this.field1956.method442(-121)) {
                    this.field1957.method3342();
                    this.field1955 = this.field1949.method1823(121, false);
                    this.field1955.method439(this.field1959 * 16, var11, 26190, 16);
                    break;
                }
                this.field1957.method3338(0);
                this.field1962.method2642(true);
            }
        } else {
            this.field1956 = null;
            this.field1955 = null;
        }
        this.field1962 = null;
        this.field1957 = null;
        this.field1944 = this.field1965 = this.field1954 = null;
        this.field1945 = null;
    }
}
