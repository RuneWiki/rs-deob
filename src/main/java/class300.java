import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class300 {

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    private int field4843;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "[[I")
    private int[][] field4838;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    private int field4849;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "J")
    public static long field4841 = 0L;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "Z")
    public static boolean field4847 = false;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4840 = "glow1:";

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "[I")
    public static int[] field4851 = new int[] { 0, -2, -2, 0, 1, 0, 0, 0, 1, 0, 6, 8, 0, 0, 0, 0, 0, 15, 8, 20, 0, 0, 0, 3, 0, -2, 4, 0, 0, 0, -1, 12, 0, 3, -2, 9, 0, 0, 3, 0, 7, 0, 6, -2, -1, 0, 8, 7, 0, -2, 0, 0, 2, -2, -1, 1, 0, 0, 0, -1, 5, 0, 0, 7, 0, 10, 0, 0, 0, 0, 0, 0, 2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 8, 0, 10, 12, 0, 0, 8, 0, 2, 0, 2, 0, -1, 3, 0, 0, 4, -1, 15, 0, 0, 0, 0, 0, 17, 0, 12, 7, 3, -2, 0, 0, 0, 3, 0, 0, 0, 0, 0, -1, 0, 0, 6, 3, 4, 0, 14, 0, 6, -2, 3, 6, 0, 0, 0, 0, 0, 6, 0, 0, 2, 8, 0, 5, 8, 10, 6, 0, -2, 2, 0, 6, 0, 0, 0, 14, 0, 6, 0, 28, 0, 2, 0, 0, 0, 8, -2, -1, 0, 5, 11, 0, 4, 0, 0, -1, 12, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 5, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 10, 0, 0, 0, 0, 3, 8, 0, 0, -1, 0, 0, 0, 0, 0, -1, -2, 0, 0 };

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4845 = "Loaded textures";

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "Lch;")
    public static class188 field4848;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "Llc;")
    public static class270 field4850;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    public static final void method2046(byte arg0) {
        field4839++;
        if (class32.field403 == 0) {
            return;
        }
        try {
            if (++class101.field1709 > 1500) {
                if (class281.field4537 != null) {
                    class281.field4537.method1440(-1);
                    class281.field4537 = null;
                }
                if (class98.field1673 >= 1) {
                    class32.field403 = 0;
                    class256.field3878 = -5;
                    return;
                }
                class98.field1673++;
                if (class277.field4479 == class231.field3397) {
                    class277.field4479 = class25.field271;
                } else {
                    class277.field4479 = class231.field3397;
                }
                class32.field403 = 1;
                class101.field1709 = 0;
            }
            if (class32.field403 == 1) {
                class81.field1302 = class273.field4426.method936(-116, class277.field4479, class160.field2483);
                class32.field403 = 2;
            }
            if (class32.field403 == 2) {
                if (class81.field1302.field936 == 2) {
                    throw new IOException();
                }
                if (class81.field1302.field936 != 1) {
                    return;
                }
                class281.field4537 = new class203((Socket) class81.field1302.field932, class273.field4426);
                class81.field1302 = null;
                class281.field4537.method1435(9, 0, class144.field2338.field758, class144.field2338.field735);
                if (class16.field170 != null) {
                    class16.field170.method2011(-1);
                }
                if (class113.field1879 != null) {
                    class113.field1879.method2011(-1);
                }
                int var1 = class281.field4537.method1441(3755);
                if (class16.field170 != null) {
                    class16.field170.method2011(-1);
                }
                if (class113.field1879 != null) {
                    class113.field1879.method2011(-1);
                }
                if (var1 != 101) {
                    class256.field3878 = var1;
                    class32.field403 = 0;
                    class281.field4537.method1440(-1);
                    class281.field4537 = null;
                    return;
                }
                class32.field403 = 3;
            }
            int var2 = -42 % ((-arg0 - 74) / 47);
            if (class32.field403 == 3 && class281.field4537.method1434(0) >= 2) {
                int var3 = class281.field4537.method1441(3755) << 8 | class281.field4537.method1441(3755);
                class276.method1919(var3, (byte) 118);
                if (class114.field1884 == -1) {
                    class256.field3878 = 6;
                    class32.field403 = 0;
                    class281.field4537.method1440(-1);
                    class281.field4537 = null;
                } else {
                    class32.field403 = 0;
                    class281.field4537.method1440(-1);
                    class281.field4537 = null;
                    class78.method585(82);
                }
            }
        } catch (IOException var4) {
            if (class281.field4537 != null) {
                class281.field4537.method1440(-1);
                class281.field4537 = null;
            }
            if (class98.field1673 >= 1) {
                class256.field3878 = -4;
                class32.field403 = 0;
            } else {
                class32.field403 = 1;
                class101.field1709 = 0;
                if (class277.field4479 == class231.field3397) {
                    class277.field4479 = class25.field271;
                } else {
                    class277.field4479 = class231.field3397;
                }
                class98.field1673++;
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)I")
    public final int method2047(int arg0, int arg1) {
        if (this.field4838 != null) {
            arg0 = ((int) ((long) this.field4843 * (long) arg0 / (long) this.field4849)) + 6;
        }
        field4846++;
        int var3 = 0 / ((arg1 + 56) / 62);
        return arg0;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)V")
    public static final void method2048(int arg0, int arg1) {
        class279 var2 = class111.method844(arg0, 2, -1780180960);
        field4844++;
        if (arg1 >= -119) {
            field4848 = null;
        }
        var2.method1934((byte) -114);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I[B)[B")
    public final byte[] method2049(int arg0, byte[] arg1) {
        if (this.field4838 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field4843 / (long) this.field4849) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field4838[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field4843 + var6;
                int var14 = var13 / this.field4849;
                var6 = var13 - this.field4849 * var14;
                var5 += var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        if (arg0 != 0) {
            field4851 = null;
        }
        field4842++;
        return arg1;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(II)V")
    public class300(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class151.method1121(arg1, 64, arg0);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field4843 = var4;
            this.field4838 = new int[var5][14];
            this.field4849 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field4838[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    public static void method2050(int arg0) {
        field4840 = null;
        field4845 = null;
        if (arg0 != 0) {
            method2046((byte) 0);
        }
        field4850 = null;
        field4848 = null;
        field4851 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZI)I")
    public final int method2051(boolean arg0, int arg1) {
        field4837++;
        if (this.field4838 != null) {
            arg1 = (int) ((long) this.field4843 * (long) arg1 / (long) this.field4849);
        }
        return arg0 ? 82 : arg1;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIILff;Lff;IIJ)V")
    public static final void method2052(int arg0, int arg1, int arg2, int arg3, class4 arg4, class4 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class231 var10 = new class231();
        var10.field3393 = arg8;
        var10.field3399 = arg1 * 128 + 64;
        var10.field3403 = arg2 * 128 + 64;
        var10.field3391 = arg3;
        var10.field3401 = arg4;
        var10.field3388 = arg5;
        var10.field3398 = arg6;
        var10.field3389 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class223.field3286[var11][arg1][arg2] == null) {
                class223.field3286[var11][arg1][arg2] = new class313(var11, arg1, arg2);
            }
        }
        class223.field3286[arg0][arg1][arg2].field5012 = var10;
    }
}
