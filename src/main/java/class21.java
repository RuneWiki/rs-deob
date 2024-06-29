import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class21 {

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "[[I")
    private int[][] field417;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    private int field392;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field391 = 0;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Lsc;")
    public static class128 field397 = class129.method1017(false, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "Lsc;")
    public static class128 field405 = class129.method1017(false, "<col=ff3000>");

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "Lsc;")
    public static class128 field409 = class129.method1017(false, "Hidden)2");

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field400 = 0;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Lsc;")
    public static class128 field398 = class129.method1017(false, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field395 = 1;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "Lsc;")
    private static class128 field406 = class129.method1017(false, "Loaded textures");

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "Lsc;")
    public static class128 field402 = field406;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "Lsc;")
    private static class128 field414 = class129.method1017(false, "Login");

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "Lsc;")
    public static class128 field413 = field414;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Z")
    public static boolean field396;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "[I")
    public static int[] field412;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "[Lb;")
    public static class8[] field404;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "[[S")
    public static short[][] field403;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "[[S")
    public static short[][] field408;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)I")
    public final int method175(int arg0, boolean arg1) {
        field393++;
        if (this.field417 != null) {
            arg0 = (int) ((long) this.field411 * (long) arg0 / (long) this.field392) + 6;
        }
        if (!arg1) {
            field410 = 18;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)I")
    public final int method176(int arg0, byte arg1) {
        if (arg1 >= -41) {
            return 37;
        }
        if (this.field417 != null) {
            arg0 = (int) ((long) this.field411 * (long) arg0 / (long) this.field392);
        }
        field401++;
        return arg0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static void method177(byte arg0) {
        field408 = null;
        int var1 = -127 / ((arg0 - 56) / 36);
        field414 = null;
        field403 = null;
        field412 = null;
        field409 = null;
        field398 = null;
        field404 = null;
        field397 = null;
        field413 = null;
        field406 = null;
        field405 = null;
        field402 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static final void method178(int arg0) {
        field416++;
        int var1 = class100.field2306;
        int var2 = class99.field2298;
        int var3 = class149.field3441;
        int var4 = class92.field2082;
        int var5 = 6116423;
        class138.method1136(var2, var1, var3, var4, var5);
        class138.method1136(var2 + 1, var1 + 1, var3 - 2, arg0, 0);
        class138.method1128(var2 + 1, var1 + 18, var3 - 2, var4 + -19, 0);
        class97.field2255.method1078(class121.field2745, var2 + 3, var1 + 14, var5, -1);
        int var6 = class64.field1380;
        int var7 = class18.field330;
        for (int var8 = 0; var8 < class7.field103; var8++) {
            int var9 = (class7.field103 - var8 - 1) * 15 + var1 + 31;
            int var10 = 16777215;
            if (var2 < var6 && var6 < var2 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
                var10 = 16776960;
            }
            class97.field2255.method1078(class40.method287((byte) 124, var8), var2 + 3, var9, var10, 0);
        }
        class35.method258(-11, class149.field3441, class100.field2306, class92.field2082, class99.field2298);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(IB)I")
    public static final int method179(int arg0, byte arg1) {
        int var2 = 0;
        field394++;
        int var3 = -118 / ((-arg1 - 71) / 53);
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[B)[B")
    public final byte[] method180(int arg0, byte[] arg1) {
        field407++;
        if (this.field417 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field411 / (long) this.field392) + 14;
            int var4 = 0;
            int[] var5 = new int[var3];
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field417[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var5[var4 + var12] += var11[var12] * var10;
                }
                int var13 = this.field411 + var6;
                int var14 = var13 / this.field392;
                var6 = var13 - this.field392 * var14;
                var4 += var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var5[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        return arg0 == 14 ? arg1 : null;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public static final void method181(int arg0) {
        if (arg0 == 65536) {
            class102.field2329.method919((byte) -104);
            class1.field5.method919((byte) -104);
            field415++;
            class18.field318.method919((byte) -104);
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(II)V")
    public class21(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class42.method303(true, arg1, arg0);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field417 = new int[var5][14];
            this.field411 = var4;
            this.field392 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field417[var6];
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
                while (var10 < var13) {
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
