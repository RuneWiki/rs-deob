import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class434 {

    @OriginalMember(owner = "client!is", name = "j", descriptor = "J")
    public long field6444;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "Lad;")
    private class362 field6445;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "[I")
    public static int[] field6437 = new int[14];

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public static int field6436;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!is", name = "l", descriptor = "I")
    public static int field6446;

    @OriginalMember(owner = "client!is", name = "m", descriptor = "I")
    public static int field6447;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "Lkea;")
    public static class203 field6438;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IZII)Ljava/lang/String;")
    public static final String method2708(int arg0, boolean arg1, int arg2, int arg3) {
        field6435++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg1 && arg2 >= 0) {
            int var4 = 2;
            int var5 = arg2 / arg0;
            if (arg3 <= 88) {
                field6438 = null;
            }
            while (var5 != 0) {
                var5 /= arg0;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg2;
                arg2 /= arg0;
                int var9 = var8 - (arg0 * arg2);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(B)V")
    public static void method2709(byte arg0) {
        if (arg0 < 78) {
            method2711(36, 8);
        }
        field6438 = null;
        field6437 = null;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
    public static final void method2710(int arg0) {
        field6441++;
        if (class403.field6100 != null) {
            return;
        }
        class403.field6100 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = -21 % ((arg0 - 56) / 60);
        for (int var4 = 0; var4 < 65536; var4++) {
            double var5 = (double) (var4 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var7 = (double) (var4 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var9 = (double) (var4 & 0x7F) / 128.0D;
            double var11 = var9;
            double var13 = var9;
            double var15 = var9;
            if (var7 != 0.0D) {
                double var17;
                if ((var9 < 0.5D)) {
                    var17 = (var7 + 1.0D) * var9;
                } else {
                    var17 = var7 + var9 - var7 * var9;
                }
                double var19 = var9 * 2.0D - var17;
                double var21 = var5 + 0.3333333333333333D;
                if (var21 > 1.0D) {
                    var21--;
                }
                double var25 = var5 - 0.3333333333333333D;
                if (var5 * 6.0D < 1.0D) {
                    var13 = (var17 - var19) * 6.0D * var5 + var19;
                } else if (var5 * 2.0D < 1.0D) {
                    var13 = var17;
                } else if ((var5 * 3.0D < 2.0D)) {
                    var13 = (var17 - var19) * (0.6666666666666666D - var5) * 6.0D + var19;
                } else {
                    var13 = var19;
                }
                if ((var21 * 6.0D < 1.0D)) {
                    var11 = (var17 - var19) * 6.0D * var21 + var19;
                } else if (var21 * 2.0D < 1.0D) {
                    var11 = var17;
                } else if (var21 * 3.0D < 2.0D) {
                    var11 = (var17 - var19) * (0.6666666666666666D - var21) * 6.0D + var19;
                } else {
                    var11 = var19;
                }
                if (var25 < 0.0D) {
                    var25++;
                }
                if (var25 * 6.0D < 1.0D) {
                    var15 = (var17 - var19) * 6.0D * var25 + var19;
                } else if ((var25 * 2.0D < 1.0D)) {
                    var15 = var17;
                } else if ((var25 * 3.0D < 2.0D)) {
                    var15 = (var17 - var19) * (0.6666666666666666D - var25) * 6.0D + var19;
                } else {
                    var15 = var19;
                }
            }
            double var27 = Math.pow(var11, var1);
            double var29 = Math.pow(var13, var1);
            double var31 = Math.pow(var15, var1);
            int var33 = (int) (var27 * 256.0D);
            int var34 = (int) (var29 * 256.0D);
            int var35 = (int) (var31 * 256.0D);
            int var36 = (var33 << 16) + (var34 << 8) + var35;
            class403.field6100[var4] = var36;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(II)I")
    public static final int method2711(int arg0, int arg1) {
        if (arg1 != 261108) {
            method2713(-55, 65, null, -120, null);
        }
        field6447++;
        return (arg0 & 0x3FBF4) >> 11;
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(I)Llq;")
    public static final class480 method2712(int arg0) {
        field6443++;
        if (arg0 != -27868) {
            field6446 = 94;
        }
        if (class182.field2258 == null || class538.field7749 == null) {
            return null;
        }
        class538.field7749.method576((byte) 14, class182.field2258);
        class480 var1 = (class480) class538.field7749.method572(12491);
        if (var1 == null) {
            return null;
        } else {
            class431 var2 = class182.field2242.method1014(var1.field7060, 5187);
            return var2 != null && var2.field6419 && var2.method2689(true, class182.field2245) ? var1 : class302.method2012(126);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(II[II[J)V")
    public static final void method2713(int arg0, int arg1, int[] arg2, int arg3, long[] arg4) {
        field6436++;
        if (arg3 < arg0) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg3;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var7;
            int var9 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg3; var11 < arg0; var11++) {
                if (((long) (var10 & var11) + var7) > arg4[var11]) {
                    long var12 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6] = var12;
                    int var14 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6++] = var14;
                }
            }
            arg4[arg0] = arg4[var6];
            arg4[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var9;
            method2713(var6 - 1, 1, arg2, arg3, arg4);
            method2713(arg0, 1, arg2, var6 + 1, arg4);
        }
        if (arg1 != 1) {
            method2710(54);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ltq;ZZILjava/lang/String;)V")
    public static final void method2714(class545 arg0, boolean arg1, boolean arg2, int arg3, String arg4) {
        field6439++;
        if (arg2) {
            if (class545.field7788.startsWith("win") && arg0.field7804) {
                String var5 = null;
                if (class635.field9135 != null) {
                    var5 = class635.field9135.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class175 var6 = class232.method1490(arg0, arg4, 2, 0);
                    class24.field248 = var6;
                    class601.field8773 = arg0;
                    class441.field6582 = arg4;
                    return;
                }
            }
            if (class545.field7788.startsWith("mac")) {
                String var7 = null;
                if (class635.field9135 != null) {
                    var7 = class635.field9135.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg1) {
                    class232.method1490(arg0, arg4, 2, 1);
                    return;
                }
            }
            class232.method1490(arg0, arg4, 2, 2);
        } else {
            class232.method1490(arg0, arg4, 2, 3);
        }
        if (arg3 != 21545) {
            field6442 = 29;
        }
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lad;J[Lni;)V")
    public class434(class362 arg0, long arg1, class451[] arg2) {
        this.field6444 = arg1;
        this.field6445 = arg0;
    }

    @OriginalMember(owner = "client!is", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field6445.method2292((byte) 14, this.field6444);
        field6440++;
        super.finalize();
    }
}
