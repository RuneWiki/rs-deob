import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class335 {

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    private int field5199;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    private int field5200;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "[[I")
    private int[][] field5207;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "Z")
    public static boolean field5203 = false;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZ)I", line = 12)
    public final int method2163(int arg0, boolean arg1) {
        if (this.field5207 != null) {
            arg0 = (int) ((long) this.field5199 * (long) arg0 / (long) this.field5200);
        }
        field5201++;
        if (arg1) {
            method2167(39);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lqa;I)V", line = 27)
    public static final void method2164(class165 arg0, int arg1) {
        field5208++;
        if (class77.field1118 != class56.field800.field1866 && class443.field6672 != null) {
            int var2 = -37 / ((arg1 + 53) / 59);
            if (class333.method2152(arg0, (byte) 23, class56.field800.field1866)) {
                class77.field1118 = class56.field800.field1866;
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I[B)[B", line = 47)
    public final byte[] method2165(int arg0, byte[] arg1) {
        if (this.field5207 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field5199 / (long) this.field5200) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field5207[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field5199 + var6;
                int var14 = var13 / this.field5200;
                var5 += var14;
                var6 = var13 - this.field5200 * var14;
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
        field5205++;
        int var15 = 78 % ((82 - arg0) / 35);
        return arg1;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([IZ[Ljava/lang/Object;)V", line = 117)
    public static final void method2166(int[] arg0, boolean arg1, Object[] arg2) {
        if (!arg1) {
            field5203 = true;
        }
        class273.method1755(arg0.length - 1, (byte) 126, arg0, arg2, 0);
        field5206++;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 129)
    public static final void method2167(int arg0) {
        client.field2676 = null;
        field5202++;
        if (arg0 <= -89) {
            class453.field6819 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZLnj;)Lko;", line = 141)
    public static final class354 method2168(boolean arg0, class164 arg1) {
        field5209++;
        arg1.method1087(false);
        int var2 = arg1.method1087(!arg0);
        class354 var3 = class521.method3098(var2, false);
        var3.field5472 = arg1.method1087(false);
        int var4 = arg1.method1087(false);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method1087(false);
            var3.method272(arg1, var6, 1638);
        }
        if (!arg0) {
            field5203 = false;
        }
        var3.method357(117);
        return var3;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lia;III[Z)Z", line = 179)
    public static final boolean method2169(class423 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class71.field988 != class306.field4447) {
            int var6 = class414.field6317[arg1].method218(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class23 var8 = class414.field6317[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method218(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method212(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method223(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)I", line = 215)
    public final int method2170(int arg0, int arg1) {
        if (this.field5207 != null) {
            arg1 = (int) ((long) this.field5199 * (long) arg1 / (long) this.field5200) + 6;
        }
        if (arg0 != 6) {
            this.field5199 = -97;
        }
        field5204++;
        return arg1;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(II)V", line = 229)
    public class335(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class205.method1382(arg0, arg1, (byte) -86);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field5199 = var5;
            this.field5200 = var4;
            this.field5207 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field5207[var6];
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
