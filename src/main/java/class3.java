import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class3 {

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    private int field37;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "[[I")
    private int[][] field26;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    private int field27;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Ljava/lang/String;")
    public static String field29 = "Opened title screen";

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field28 = 0;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "F")
    public static float field36;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Lwf;")
    public static class306 field33;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "[I")
    public static int[] field32;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V", line = 5)
    public static final void method16(int arg0, int arg1) {
        field41++;
        class345.field5347.method1287(arg1, -16);
        if (arg0 >= 98) {
            class310.field4926.method1287(arg1, 121);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([BB)[B", line = 20)
    public final byte[] method17(byte[] arg0, byte arg1) {
        int var3 = -124 / ((-arg1 - 30) / 57);
        field30++;
        if (this.field26 != null) {
            int var4 = (int) ((long) arg0.length * (long) this.field27 / (long) this.field37) + 14;
            int var5 = 0;
            int[] var6 = new int[var4];
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.length; var8++) {
                byte var9 = arg0[var8];
                int[] var10 = this.field26[var7];
                for (int var11 = 0; var11 < 14; var11++) {
                    var6[var5 + var11] += var10[var11] * var9;
                }
                int var12 = this.field27 + var7;
                int var13 = var12 / this.field37;
                var7 = var12 - this.field37 * var13;
                var5 += var13;
            }
            arg0 = new byte[var4];
            for (int var14 = 0; var14 < var4; var14++) {
                int var15 = var6[var14] + 32768 >> 16;
                if (var15 < -128) {
                    arg0[var14] = -128;
                } else if (var15 > 127) {
                    arg0[var14] = 127;
                } else {
                    arg0[var14] = (byte) var15;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIII)V", line = 91)
    public static final void method18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field34++;
        if (class256.field3995 <= arg6 && class118.field1834 >= arg0 && class323.field5030 <= arg5 && arg2 <= class88.field1324) {
            if (arg4 == 1) {
                class197.method1336(arg1, arg0, arg6, arg5, arg2, 127);
            } else {
                class286.method1868(arg1, arg4, arg5, 6, arg0, arg2, arg6);
            }
        } else if (arg4 == 1) {
            class56.method369(arg5, arg6, arg0, -1, arg2, arg1);
        } else {
            class221.method1478((byte) 6, arg4, arg0, arg1, arg2, arg5, arg6);
        }
        if (arg3 > -47) {
            field36 = 1.1431196F;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 130)
    public static final void method19(byte arg0) {
        class265.field4088.method1296(255);
        field31++;
        if (arg0 <= 30) {
            field36 = -2.072089F;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII)I", line = 141)
    public static final int method20(int arg0, int arg1, int arg2, int arg3) {
        field38++;
        if (arg3 != -27521) {
            method18(8, 80, -43, -101, -103, 119, -107);
        }
        return arg0 <= arg1 ? (arg1 <= arg2 ? arg1 : arg2) : arg0;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)I", line = 155)
    public final int method21(int arg0, int arg1) {
        field40++;
        if (this.field26 != null) {
            arg0 = (int) ((long) this.field27 * (long) arg0 / (long) this.field37);
        }
        return arg1 < 30 ? -65 : arg0;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)I", line = 171)
    public final int method22(int arg0, int arg1) {
        if (this.field26 != null) {
            arg1 = (int) ((long) this.field27 * (long) arg1 / (long) this.field37) + 6;
        }
        if (arg0 != 19142) {
            this.field27 = -56;
        }
        field39++;
        return arg1;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 187)
    public static void method23(int arg0) {
        field29 = null;
        if (arg0 == 127) {
            field32 = null;
            field33 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(II)V", line = 198)
    public class3(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class54.method362(-124, arg0, arg1);
            int var4 = arg0 / var3;
            this.field37 = var4;
            this.field26 = new int[var4][14];
            int var5 = arg1 / var3;
            this.field27 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                double var7 = (double) var6 / (double) var4 + 6.0D;
                int[] var9 = this.field26[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var7 + 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var11 > var10) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var7) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
