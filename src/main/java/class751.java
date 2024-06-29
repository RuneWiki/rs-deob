import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class751 {

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "[[I")
    private int[][] field10392;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    private int field10389;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    private int field10397;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "[[I")
    public static int[][] field10386 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field10384;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field10385;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field10387;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field10388;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field10390;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field10391;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public static int field10393;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public static int field10395;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
    public static int field10396;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "Lwia;")
    public static class791 field10394;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)I")
    public final int method4177(int arg0, byte arg1) {
        if (this.field10392 != null) {
            arg0 = (int) ((long) this.field10397 * (long) arg0 / (long) this.field10389) + 6;
        }
        field10387++;
        if (arg1 != -22) {
            field10386 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V")
    public static void method4178(boolean arg0) {
        if (!arg0) {
            field10386 = null;
            field10394 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "([SI)[S")
    public final short[] method4179(short[] arg0, int arg1) {
        if (this.field10392 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field10397 / (long) this.field10389) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                short var10 = arg0[var7];
                int[] var11 = this.field10392[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10 >> 2;
                }
                int var13 = this.field10397 + var6;
                int var14 = var13 / this.field10389;
                var6 = var13 - this.field10389 * var14;
                var5 += var14;
            }
            arg0 = new short[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 8192 >> 14;
                if (var9 < -32768) {
                    arg0[var8] = -32768;
                } else if (var9 > 32767) {
                    arg0[var8] = 32767;
                } else {
                    arg0[var8] = (short) var9;
                }
            }
        }
        int var15 = 56 / ((arg1 + 9) / 60);
        field10384++;
        return arg0;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
    public static final void method4180(int arg0) {
        field10385++;
        class245.method1625(true);
        if (arg0 != 6) {
            method4184((byte) 95, null);
        }
        class626.field8777 = false;
        class110.method835(0, class42.field549, class407.field5549, class54.field679, class109.field1608);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)[Lne;")
    public static final class336[] method4181(byte arg0) {
        if (arg0 != 86) {
            method4182(false, 25, true, 62);
        }
        field10395++;
        return new class336[] { class622.field8739, class211.field3264, class394.field5419, class189.field2913, class694.field9699, class57.field721, class161.field2549 };
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZIZI)Ljava/lang/String;")
    public static final String method4182(boolean arg0, int arg1, boolean arg2, int arg3) {
        field10390++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg2 && arg3 >= 0) {
            if (arg0) {
                method4180(117);
            }
            int var4 = 2;
            for (int var5 = arg3 / arg1; var5 != 0; var5 /= arg1) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg3;
                arg3 /= arg1;
                int var9 = var8 - (arg1 * arg3);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZ)I")
    public final int method4183(int arg0, boolean arg1) {
        field10393++;
        if (this.field10392 != null) {
            arg0 = (int) ((long) this.field10397 * (long) arg0 / (long) this.field10389);
        }
        return arg1 ? arg0 : -18;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLso;)Lcf;")
    public static final class629 method4184(byte arg0, class494 arg1) {
        if (arg0 >= -73) {
            return null;
        } else {
            field10388++;
            class687 var2 = class472.method2808(arg1, (byte) 119);
            int var3 = arg1.method2956(false);
            return new class629(var2.field9553, var2.field9547, var2.field9552, var2.field9548, var2.field9555, var3);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I[B)[B")
    public final byte[] method4185(int arg0, byte[] arg1) {
        if (arg0 > -97) {
            this.method4177(96, (byte) -10);
        }
        if (this.field10392 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field10397 / (long) this.field10389) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field10392[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field10397 + var6;
                int var14 = var13 / this.field10389;
                var5 += var14;
                var6 = var13 - this.field10389 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        field10396++;
        return arg1;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(II)V")
    public class751(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class599.method3490(2, arg1, arg0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field10392 = new int[var4][14];
            this.field10389 = var4;
            this.field10397 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field10392[var6];
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
}
