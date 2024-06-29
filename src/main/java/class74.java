import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class74 {

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "[[I")
    private int[][] field1224;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    private int field1215;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    private int field1220;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field1211 = 0;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "[I")
    public static int[] field1216 = new int[14];

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public static int field1218 = -1;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "Z")
    public static boolean field1223 = false;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1225 = "M";

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "Lcg;")
    public static class49 field1214;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V", line = 7)
    public static void method692(int arg0) {
        field1225 = null;
        field1216 = null;
        if (arg0 != 32) {
            field1216 = (int[]) null;
        }
        field1214 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "([BI)[B", line = 19)
    public final byte[] method693(byte[] arg0, int arg1) {
        if (this.field1224 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field1220 / (long) this.field1215) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var8 = arg0[var7];
                int[] var9 = this.field1224[var6];
                for (int var10 = 0; var10 < 14; var10++) {
                    var4[var5 + var10] += var9[var10] * var8;
                }
                int var11 = this.field1220 + var6;
                int var12 = var11 / this.field1215;
                var6 = var11 - this.field1215 * var12;
                var5 += var12;
            }
            arg0 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var4[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg0[var13] = -128;
                } else if (var14 <= 127) {
                    arg0[var13] = (byte) var14;
                } else {
                    arg0[var13] = 127;
                }
            }
        }
        if (arg1 >= -43) {
            field1211 = -45;
        }
        field1222++;
        return arg0;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)V", line = 90)
    public static final void method694(int arg0, int arg1, int arg2) {
        if (class133.field2269 != arg1) {
            class8.field104 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class8.field104[var3] = (var3 << 12) / arg1;
            }
            class356.field5620 = arg1 * 32;
            class297.field4731 = arg1 - 1;
            class133.field2269 = arg1;
        }
        if (class77.field1247 != arg2) {
            if (class133.field2269 == arg2) {
                class1.field6 = class8.field104;
            } else {
                class1.field6 = new int[arg2];
                for (int var4 = 0; var4 < arg2; var4++) {
                    class1.field6[var4] = (var4 << 12) / arg2;
                }
            }
            class77.field1247 = arg2;
            class132.field2262 = arg2 - 1;
        }
        field1213++;
        int var5 = 36 % ((arg0 + 3) / 40);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)I", line = 140)
    public final int method695(int arg0, int arg1) {
        if (this.field1224 != null) {
            arg0 = (int) ((long) this.field1220 * (long) arg0 / (long) this.field1215);
        }
        if (arg1 != 65536) {
            field1211 = 20;
        }
        field1212++;
        return arg0;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "([SI)[S", line = 158)
    public static final short[] method696(short[] arg0, int arg1) {
        if (arg1 != 25181) {
            return (short[]) null;
        }
        field1217++;
        if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class345.method2414(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(II)I", line = 187)
    public final int method697(int arg0, int arg1) {
        field1219++;
        if (this.field1224 != null) {
            arg0 = (int) ((long) this.field1220 * (long) arg0 / (long) this.field1215) + 6;
        }
        if (arg1 != 6) {
            field1225 = (String) null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(II)V", line = 204)
    public class74(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class220.method1618(arg1, (byte) 100, arg0);
            int var4 = arg0 / var3;
            this.field1224 = new int[var4][14];
            this.field1215 = var4;
            int var5 = arg1 / var3;
            this.field1220 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field1224[var6];
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
                    if (-1.0E-4D > var14 || var14 > 1.0E-4D) {
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
