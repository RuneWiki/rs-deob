import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class33 {

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "[[I")
    private int[][] field689;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    private int field694;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    private int field683;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "[J")
    public static long[] field695 = new long[200];

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "Lja;")
    public static class63 field690 = new class63(30);

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field698 = 0;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "Lec;")
    public static class32 field696 = class73.method594("(U0a )2 non)2existant gosub script)2num: ", true);

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "[Z")
    public static boolean[] field700 = new boolean[5];

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "Lea;")
    public static class30 field693;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "[I")
    public static int[] field699;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method280(int arg0) {
        field700 = null;
        field699 = null;
        if (arg0 != -10470) {
            field699 = null;
        }
        field695 = null;
        field696 = null;
        field693 = null;
        field690 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([BB)[B")
    public final byte[] method281(byte[] arg0, byte arg1) {
        if (this.field689 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field683 / (long) this.field694) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field689[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field683 + var6;
                int var14 = var13 / this.field694;
                var5 += var14;
                var6 = var13 - this.field694 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        field684++;
        if (arg1 > -103) {
            field697 = 69;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)I")
    public static final int method282(int arg0, int arg1, int arg2, int arg3) {
        field688++;
        int var4 = arg1 & 0x3;
        if (arg0 == var4) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)I")
    public final int method283(int arg0, int arg1) {
        if (arg1 >= 0) {
            return 0;
        }
        field686++;
        if (this.field689 != null) {
            arg0 = (int) ((long) this.field683 * (long) arg0 / (long) this.field694);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
    public static final void method284(boolean arg0) {
        for (class98 var1 = (class98) class63.field1467.method1213(102); var1 != null; var1 = (class98) class63.field1467.method1211(-3)) {
            if (var1.field2249 != null) {
                class37.field882.method909(var1.field2249);
                var1.field2249 = null;
            }
            if (var1.field2273 != null) {
                class37.field882.method909(var1.field2273);
                var1.field2273 = null;
            }
        }
        if (arg0) {
            method286((byte) 16, 54, 127);
        }
        field687++;
        class63.field1467.method1206((byte) -19);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)I")
    public final int method285(byte arg0, int arg1) {
        if (this.field689 != null) {
            arg1 = (int) ((long) this.field683 * (long) arg1 / (long) this.field694) + 6;
        }
        int var3 = -122 / ((arg0 - 16) / 49);
        field692++;
        return arg1;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BII)Z")
    public static final boolean method286(byte arg0, int arg1, int arg2) {
        field681++;
        if (arg0 < 13) {
            method282(-90, -59, -47, -83);
        }
        class53 var3 = class5.method22(-128, arg1);
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method424(-114, arg2);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLea;Lea;ZI)Lrc;")
    public static final class121 method287(byte arg0, class30 arg1, class30 arg2, boolean arg3, int arg4) {
        field685++;
        if (arg0 < 77) {
            return null;
        }
        int[] var5 = arg2.method207(arg4, -94);
        boolean var6 = true;
        for (int var7 = 0; var7 < var5.length; var7++) {
            byte[] var8 = arg2.method217(var5[var7], -50, arg4);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg3) {
                    var10 = arg1.method217(var9, 113, 0);
                } else {
                    var10 = arg1.method217(0, 117, var9);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            return new class121(arg2, arg1, arg4, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(II)V")
    public class33(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class17.method125(arg0, arg1, -103);
            int var4 = arg0 / var3;
            this.field689 = new int[var4][14];
            this.field694 = var4;
            int var5 = arg1 / var3;
            this.field683 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field689[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                double var12 = (double) var5 / (double) var4;
                if (var11 > 14) {
                    var11 = 14;
                }
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
