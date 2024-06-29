import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class259 {

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    private int field4339;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    private int field4348;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "[[I")
    private int[][] field4344;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Z")
    public static boolean field4337 = false;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "[[[I")
    public static int[][][] field4338 = new int[4][13][13];

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Z")
    public static boolean field4346 = false;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "[[I")
    public static int[][] field4342;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V", line = 9)
    public static final void method1845(byte arg0) {
        class281.field4848 = 0;
        if (arg0 < 80) {
            return;
        }
        class173.field2924 = 0;
        class203.method1508(-1);
        field4350++;
        class86.method693(31719);
        class292.method2035(-20168);
        class34.method230((byte) -79);
        for (int var1 = 0; var1 < class281.field4848; var1++) {
            int var2 = class83.field1377[var1];
            if (class143.field2463 != class169.field2842[var2].field3271) {
                if (class169.field2842[var2].field1582 > 0) {
                    class34.method228(class169.field2842[var2], true);
                }
                class169.field2842[var2] = null;
            }
        }
        if (class299.field5105 != class136.field2328.field1012) {
            throw new RuntimeException("gpp1 pos:" + class136.field2328.field1012 + " psize:" + class299.field5105);
        }
        for (int var3 = 0; var3 < class229.field3894; var3++) {
            if (class169.field2842[class65.field1131[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class229.field3894);
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)I", line = 59)
    public final int method1846(byte arg0, int arg1) {
        if (this.field4344 != null) {
            arg1 = (int) ((long) this.field4339 * (long) arg1 / (long) this.field4348);
        }
        if (arg0 != 66) {
            this.method1846((byte) -67, -74);
        }
        field4336++;
        return arg1;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I", line = 74)
    public final int method1847(int arg0, int arg1) {
        if (arg0 != 6) {
            return 66;
        }
        field4351++;
        if (this.field4344 != null) {
            arg1 = (int) ((long) this.field4339 * (long) arg1 / (long) this.field4348) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I[B)[B", line = 89)
    public final byte[] method1848(int arg0, byte[] arg1) {
        field4345++;
        if (arg0 != 13) {
            this.field4344 = (int[][]) ((int[][]) null);
        }
        if (this.field4344 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field4339 / (long) this.field4348) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var8 = arg1[var7];
                int[] var9 = this.field4344[var6];
                for (int var10 = 0; var10 < 14; var10++) {
                    var4[var5 + var10] += var9[var10] * var8;
                }
                int var11 = this.field4339 + var6;
                int var12 = var11 / this.field4348;
                var6 = var11 - this.field4348 * var12;
                var5 += var12;
            }
            arg1 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var4[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg1[var13] = -128;
                } else if (var14 > 127) {
                    arg1[var13] = 127;
                } else {
                    arg1[var13] = (byte) var14;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V", line = 165)
    public static final void method1849(byte arg0) {
        for (int var1 = -1; var1 < class229.field3894; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class65.field1131[var1];
            }
            class96 var3 = class169.field2842[var2];
            if (var3 != null && var3.field3275 > 0) {
                var3.field3275--;
                if (var3.field3275 == 0) {
                    var3.field3243 = null;
                }
            }
        }
        field4349++;
        if (arg0 != -6) {
            method1854(-64, false);
        }
        for (int var4 = 0; var4 < class121.field2031; var4++) {
            int var5 = class132.field2281[var4];
            class295 var6 = class35.field521[var5];
            if (var6 != null && var6.field3275 > 0) {
                var6.field3275--;
                if (var6.field3275 == 0) {
                    var6.field3243 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 225)
    public static final void method1850(int arg0) {
        field4352++;
        class195.field3277.method1231(-26981);
        for (int var1 = 0; var1 < 32; var1++) {
            class235.field3973[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class158.field2720[var2] = 0L;
        }
        if (arg0 != 14) {
            field4338 = (int[][][]) ((int[][][]) null);
        }
        class294.field5060 = 0;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V", line = 252)
    public static void method1851(int arg0) {
        int var1 = -54 / ((arg0 - 79) / 34);
        field4338 = (int[][][]) null;
        field4342 = (int[][]) null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lwa;Z)V", line = 265)
    public static final void method1852(class75 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field4347++;
        for (class177 var2 = (class177) class139.field2418.method1250(arg1); var2 != null; var2 = (class177) class139.field2418.method1256((byte) -122)) {
            if (var2.field2974.method660(arg0, -124)) {
                class236.field3981 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lcb;I)V", line = 290)
    public static final void method1853(class267 arg0, int arg1) {
        class176.field2956 = arg0;
        field4340++;
        if (arg1 != -15) {
            field4346 = true;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZ)I", line = 307)
    public static final int method1854(int arg0, boolean arg1) {
        field4341++;
        if (arg0 == 16711935) {
            return -1;
        } else if (arg1) {
            return -117;
        } else {
            return class97.method748((byte) -76, arg0);
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(II)V", line = 338)
    public class259(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class292.method2039(0, arg1, arg0);
            int var4 = arg1 / var3;
            this.field4339 = var4;
            int var5 = arg0 / var3;
            this.field4348 = var5;
            this.field4344 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field4344[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                double var11 = (double) var4 / (double) var5;
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                if (var10 < 0) {
                    var10 = 0;
                }
                while (var10 < var13) {
                    double var14 = var11;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (-1.0E-4D > var16 || var16 > 1.0E-4D) {
                        var14 = var11 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
