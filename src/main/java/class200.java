import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class200 {

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    private int field2988;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "[[I")
    private int[][] field2995;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    private int field2982;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field2989 = 0;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2996 = "rating: ";

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "Llm;")
    public static class210 field2992;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "[Lea;")
    public static class235[] field2984;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V", line = 8)
    public static final void method1366(int arg0, int arg1) {
        field2981++;
        if (arg0 < 11) {
            field2993 = -94;
        }
        class169 var2 = class101.method712(arg1, 7, 2089666400);
        var2.method1178((byte) 65);
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)I", line = 25)
    public final int method1367(int arg0, int arg1) {
        if (this.field2995 != null) {
            arg0 = ((int) ((long) this.field2982 * (long) arg0 / (long) this.field2988)) + 6;
        }
        field2986++;
        if (arg1 != 14) {
            this.field2988 = -45;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)I", line = 43)
    public final int method1368(byte arg0, int arg1) {
        if (this.field2995 != null) {
            arg1 = (int) ((long) this.field2982 * (long) arg1 / (long) this.field2988);
        }
        field2990++;
        if (arg0 <= 2) {
            field2992 = (class210) null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLlm;)V", line = 58)
    public static final void method1369(byte arg0, class210 arg1) {
        if (arg0 == -110) {
            field2985++;
            class168.field2516 = arg1;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V", line = 69)
    public static final void method1370(int arg0, int arg1, int arg2, int arg3) {
        field2987++;
        class169 var4 = class101.method712(arg1, arg2, 2089666400);
        var4.method1183(false);
        var4.field2542 = arg0;
        var4.field2530 = arg3;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BZLjava/lang/String;I)Z", line = 85)
    public static final boolean method1371(byte arg0, boolean arg1, String arg2, int arg3) {
        field2983++;
        if (arg0 != -128) {
            method1371((byte) 73, false, (String) null, 59);
        }
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var5 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg3 <= var11) {
                return false;
            }
            if (var5) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if ((var10 / arg3) != var6) {
                return false;
            }
            var6 = var10;
            var4 = true;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V", line = 161)
    public static void method1372(int arg0) {
        field2992 = null;
        int var1 = -116 / ((arg0 - 69) / 41);
        field2984 = null;
        field2996 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIB)V", line = 172)
    public static final void method1373(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2994++;
        if (arg0 == arg1) {
            class235.method1612(arg4, -93, arg2, arg3, arg0);
            return;
        }
        int var6 = -70 % ((-arg5 - 8) / 33);
        if (arg3 - arg0 >= class157.field2357 && (arg0 + arg3) <= class184.field2761 && class185.field2769 <= arg2 - arg1 && arg1 + arg2 <= class166.field2494) {
            class164.method1159(arg3, 124, arg0, arg2, arg4, arg1);
        } else {
            class169.method1176(arg1, arg0, arg4, arg2, arg3, -1);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([BI)[B", line = 196)
    public final byte[] method1374(byte[] arg0, int arg1) {
        field2991++;
        if (this.field2995 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field2982 / (long) this.field2988) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                int[] var8 = this.field2995[var6];
                byte var9 = arg0[var7];
                for (int var10 = 0; var10 < 14; var10++) {
                    var4[var5 + var10] += var8[var10] * var9;
                }
                int var11 = this.field2982 + var6;
                int var12 = var11 / this.field2988;
                var6 = var11 - this.field2988 * var12;
                var5 += var12;
            }
            arg0 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var4[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg0[var13] = -128;
                } else if (var14 > 127) {
                    arg0[var13] = 127;
                } else {
                    arg0[var13] = (byte) var14;
                }
            }
        }
        if (arg1 != 6) {
            field2992 = (class210) null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(II)V", line = 266)
    public class200(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class70.method462(arg0, arg1, (byte) 86);
            int var4 = arg0 / var3;
            this.field2988 = var4;
            int var5 = arg1 / var3;
            this.field2995 = new int[var4][14];
            this.field2982 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field2995[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var11 > var10) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (-1.0E-4D > var16 || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
