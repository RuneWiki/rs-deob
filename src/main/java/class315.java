import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class315 {

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
    private int field5420;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "[[I")
    private int[][] field5411;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    private int field5414;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "Lce;")
    public static class126 field5405 = class206.method1445(-7923, "Utiliser");

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "[I")
    public static int[] field5409 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field5404 = 0;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "[I")
    public static int[] field5419 = new int[5];

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "[J")
    public static long[] field5418 = new long[32];

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "F")
    public static float field5403;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "[I")
    public static int[] field5417;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "[Ljk;")
    public static class273[] field5406;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)Lvb;", line = 4)
    public static final class74 method2195(int arg0, int arg1, int arg2) {
        class5 var3 = class297.field4940[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class74 var4 = var3.field65;
            var3.field65 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BZLce;)V", line = 15)
    public static final void method2196(byte arg0, boolean arg1, class126 arg2) {
        field5416++;
        if (arg1) {
            if (class56.field846 && class186.field3221) {
                try {
                    class92.method636(class161.field2907.field2705, "openjs", new Object[] { arg2.method847(class123.field2087.getCodeBase(), -121).toString() }, true);
                    return;
                } catch (Throwable var8) {
                }
            }
            try {
                class123.field2087.getAppletContext().showDocument(arg2.method847(class123.field2087.getCodeBase(), -68), "_blank");
            } catch (Exception var6) {
            }
        } else {
            try {
                class123.field2087.getAppletContext().showDocument(arg2.method847(class123.field2087.getCodeBase(), -119), "_top");
            } catch (Exception var7) {
            }
        }
        if (arg0 <= 86) {
            method2201(false, -16);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)I", line = 56)
    public final int method2197(int arg0, byte arg1) {
        field5407++;
        if (this.field5411 != null) {
            arg0 = (int) ((long) this.field5414 * (long) arg0 / (long) this.field5420) + 6;
        }
        return arg1 <= 60 ? -126 : arg0;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZ)I", line = 74)
    public final int method2198(int arg0, boolean arg1) {
        field5415++;
        if (this.field5411 != null) {
            arg0 = (int) ((long) this.field5414 * (long) arg0 / (long) this.field5420);
        }
        if (arg1) {
            field5404 = -4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I[B)[B", line = 102)
    public final byte[] method2199(int arg0, byte[] arg1) {
        if (this.field5411 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field5414 / (long) this.field5420) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                int[] var8 = this.field5411[var5];
                byte var9 = arg1[var7];
                for (int var10 = 0; var10 < 14; var10++) {
                    var4[var6 + var10] += var8[var10] * var9;
                }
                int var11 = this.field5414 + var5;
                int var12 = var11 / this.field5420;
                var6 += var12;
                var5 = var11 - this.field5420 * var12;
            }
            arg1 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var4[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg1[var13] = -128;
                } else if (var14 <= 127) {
                    arg1[var13] = (byte) var14;
                } else {
                    arg1[var13] = 127;
                }
            }
        }
        if (arg0 == 0) {
            field5412++;
            return arg1;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 169)
    public static void method2200(int arg0) {
        field5417 = null;
        if (arg0 != 6) {
            return;
        }
        field5409 = null;
        field5419 = null;
        field5418 = null;
        field5406 = null;
        field5405 = null;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(II)V", line = 210)
    public class315(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class134.method926(arg1, arg0, (byte) 59);
            int var4 = arg0 / var3;
            this.field5420 = var4;
            this.field5411 = new int[var4][14];
            int var5 = arg1 / var3;
            this.field5414 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field5411[var6];
                double var8 = (double) var5 / (double) var4;
                double var10 = (double) var6 / (double) var4 + 6.0D;
                int var12 = (int) Math.floor(var10 + 1.0D - 7.0D);
                int var13 = (int) Math.ceil(var10 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                if (var12 < 0) {
                    var12 = 0;
                }
                while (var13 > var12) {
                    double var14 = var8;
                    double var16 = ((double) var12 - var10) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var8 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var12 - var10) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZI)V", line = 277)
    public static final void method2201(boolean arg0, int arg1) {
        if (arg1 != 14) {
            field5413 = 31;
        }
        field5410++;
        if (class286.field4734 != arg0) {
            class286.field4734 = arg0;
            class293.method1942((byte) 122);
        }
    }
}
