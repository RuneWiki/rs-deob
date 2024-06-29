import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class107 {

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    private int field2253;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "[[I")
    private int[][] field2248;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    private int field2256;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lpe;")
    public static class109 field2243 = class141.method1120("Clientscript error in: ", 0);

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "[[[B")
    public static byte[][][] field2249 = new byte[4][104][104];

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field2247 = 0;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "[I")
    public static int[] field2252 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "[Lpe;")
    public static class109[] field2255 = new class109[200];

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Lre;")
    public static class123 field2241;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "[I")
    public static int[] field2246;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILub;)V")
    public static final void method862(int arg0, int arg1, class141 arg2) {
        if (arg0 != -1316490014) {
            field2246 = null;
        }
        class153.method1181(arg2.field3106, arg1, arg0 + 1316490107, arg2.field3094);
        field2240++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZ)I")
    public final int method863(int arg0, boolean arg1) {
        field2245++;
        if (this.field2248 != null) {
            arg0 = (int) ((long) this.field2253 * (long) arg0 / (long) this.field2256) + 6;
        }
        return arg1 ? arg0 : 113;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
    public static void method864(boolean arg0) {
        field2241 = null;
        field2249 = null;
        field2243 = null;
        field2255 = null;
        if (!arg0) {
            method865(-32, 59, 29);
        }
        field2246 = null;
        field2252 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)I")
    public static final int method865(int arg0, int arg1, int arg2) {
        field2242++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg0 / 128;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg2 > -67) {
            method864(false);
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)I")
    public final int method866(int arg0, int arg1) {
        field2250++;
        if (arg0 != 1) {
            this.method867(-50, null);
        }
        if (this.field2248 != null) {
            arg1 = (int) ((long) this.field2253 * (long) arg1 / (long) this.field2256);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[B)[B")
    public final byte[] method867(int arg0, byte[] arg1) {
        int var3 = 37 % ((-arg0 - 35) / 50);
        if (this.field2248 != null) {
            int var4 = (int) ((long) arg1.length * (long) this.field2253 / (long) this.field2256) + 14;
            int var5 = 0;
            int var6 = 0;
            int[] var7 = new int[var4];
            for (int var8 = 0; var8 < arg1.length; var8++) {
                byte var11 = arg1[var8];
                int[] var12 = this.field2248[var6];
                for (int var13 = 0; var13 < 14; var13++) {
                    var7[var5 + var13] += var12[var13] * var11;
                }
                int var14 = this.field2253 + var6;
                int var15 = var14 / this.field2256;
                var6 = var14 - this.field2256 * var15;
                var5 += var15;
            }
            arg1 = new byte[var4];
            for (int var9 = 0; var9 < var4; var9++) {
                int var10 = var7[var9] + 32768 >> 16;
                if (var10 < -128) {
                    arg1[var9] = -128;
                } else if (var10 <= 127) {
                    arg1[var9] = (byte) var10;
                } else {
                    arg1[var9] = 127;
                }
            }
        }
        field2251++;
        return arg1;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(II)V")
    public class107(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class88.method728(arg0, arg1, (byte) 27);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field2253 = var4;
            this.field2248 = new int[var5][14];
            this.field2256 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field2248[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                double var11 = (double) var4 / (double) var5;
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var11;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var11 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
