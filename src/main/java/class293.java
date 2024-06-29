import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class293 {

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public int field4704;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public int field4697;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public int field4702;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "[[I")
    public int[][] field4700;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public int field4706;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4709 = new String[] { method2501(method2500("p6j\u0002")), method2501(method2500("p6k\u0002")), method2501(method2500("p6o\u0002")), method2501(method2500("p6h\u0002")), method2501(method2500("x6\u0016\u0004$")), method2501(method2500("mmTF")), method2501(method2500("p6i\u0002")), method2501(method2500("p6l\u0002")), method2501(method2500("p6\u0004C7jl\u0006\u0002")) };

    @OriginalMember(owner = "client!s", name = "b", descriptor = "[I")
    public static int[] field4701 = new int[16];

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field4705 = 0;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BZLjava/lang/String;)V")
    public static final void method2494(byte arg0, boolean arg1, String arg2) {
        try {
            field4707++;
            String var15 = arg2.toLowerCase();
            if (arg0 == 88) {
                short[] var3 = new short[16];
                int var4 = 0;
                int var5 = arg1 ? 32768 : 0;
                int var6 = var5 + (arg1 ? class321.field5228.field9461 : class321.field5228.field9463);
                for (int var7 = var5; var7 < var6; var7++) {
                    class461 var8 = class321.field5228.method4826(var7, 1);
                    if (var8.field7097 && var8.method3565(3855).toLowerCase().indexOf(var15) != -1) {
                        if (var4 >= 50) {
                            class76.field1103 = -1;
                            class711.field10289 = null;
                            return;
                        }
                        if (var4 >= var3.length) {
                            short[] var9 = new short[var3.length * 2];
                            for (int var10 = 0; var10 < var4; var10++) {
                                var9[var10] = var3[var10];
                            }
                            var3 = var9;
                        }
                        var3[var4++] = (short) var7;
                    }
                }
                class590.field8552 = 0;
                class76.field1103 = var4;
                class711.field10289 = var3;
                String[] var11 = new String[class76.field1103];
                for (int var12 = 0; var12 < class76.field1103; var12++) {
                    var11[var12] = class321.field5228.method4826(var3[var12], arg0 - 87).method3565(3855);
                }
                class116.method1150(class711.field10289, false, var11);
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field4709[7] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field4709[5] : field4709[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class192 method712(int arg0, int arg1, class192 arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method715(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method702();

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method711(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method716(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method714(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I")
    public final int method2495(int arg0, int arg1, int arg2) {
        try {
            field4699++;
            if (arg1 != 1) {
                this.method706(28, 79, 53);
            }
            return this.field4700[arg2][arg0];
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4709[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method700(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIZ)V")
    public static final void method2496(int arg0, int arg1, boolean arg2) {
        try {
            field4698++;
            class551 var3 = class380.method3113(2, (long) arg1, 17);
            var3.method4086(-44);
            var3.field8076 = arg0;
            if (!arg2) {
                method2494((byte) -96, false, null);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4709[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lih;[I)V")
    public abstract void method713(class731 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method706(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method705(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BII)I")
    public final int method2497(byte arg0, int arg1, int arg2) {
        try {
            field4708++;
            int var4 = arg1 >> this.field4706;
            int var5 = arg2 >> this.field4706;
            if (var4 < 0 || var5 < 0 || this.field4704 - 1 < var4 || this.field4697 - 1 < var5) {
                return 0;
            } else if (arg0 >= -75) {
                return 8;
            } else {
                int var6 = arg1 & this.field4702 - 1;
                int var7 = this.field4702 - 1 & arg2;
                int var8 = (this.field4702 - var6) * this.field4700[var4][var5] + this.field4700[var4 + 1][var5] * var6 >> this.field4706;
                int var9 = (this.field4702 - var6) * this.field4700[var4][var5 + 1] + this.field4700[var4 + 1][var5 + 1] * var6 >> this.field4706;
                return (this.field4702 - var7) * var8 + (var7 * var9) >> this.field4706;
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field4709[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method703(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method2498(int arg0) {
        try {
            if (arg0 != 17450) {
                field4701 = null;
            }
            field4701 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4709[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[S)[S")
    public static final short[] method2499(int arg0, int arg1, short[] arg2) {
        try {
            if (arg1 != 1509) {
                method2498(52);
            }
            field4703++;
            short[] var3 = new short[arg0];
            class405.method3261(arg2, 0, var3, 0, arg0);
            return var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4709[6] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field4709[5] : field4709[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V")
    public class293(int arg0, int arg1, int arg2, int[][] arg3) {
        try {
            this.field4704 = arg0;
            this.field4697 = arg1;
            int var5 = 0;
            while (arg2 > 1) {
                arg2 >>= 0x1;
                var5++;
            }
            this.field4702 = 0x1 << var5;
            this.field4700 = arg3;
            this.field4706 = var5;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field4709[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field4709[5] : field4709[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method701(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2500(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x59);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!s", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2501(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 3;
                    break;
                case 1:
                    var10005 = 24;
                    break;
                case 2:
                    var10005 = 56;
                    break;
                case 3:
                    var10005 = 42;
                    break;
                default:
                    var10005 = 89;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
