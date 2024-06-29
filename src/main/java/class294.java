import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class294 {

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public int field4336;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public int field4337;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public int field4340;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "[[I")
    public int[][] field4338;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public int field4341;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4342 = new String[] { method2410(method2409("R$c\u000f")), method2410(method2409("R$g\u000f")), method2410(method2409("Z$\u001d\t7")), method2410(method2409("R$b\u000f")), method2410(method2409("O\u007f_K")), method2410(method2409("R$\u000fN$H~\r\u000f")), method2410(method2409("R$a\u000f")) };

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Z")
    public static boolean field4335 = false;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "[Luh;")
    public static class176[] field4339;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BII)I")
    public final int method2404(byte arg0, int arg1, int arg2) {
        try {
            field4332++;
            int var4 = arg1 >> this.field4341;
            int var5 = arg2 >> this.field4341;
            if (var4 < 0 || var5 < 0 || this.field4337 - 1 < var4 || (this.field4336 - 1) < var5) {
                return 0;
            }
            int var6 = this.field4340 - 1 & arg1;
            int var7 = arg2 & this.field4340 - 1;
            if (arg0 < 100) {
                this.method1501(null, 104, 120, -90, 11, true);
            }
            int var8 = (this.field4340 - var6) * this.field4338[var4][var5] + this.field4338[var4 + 1][var5] * var6 >> this.field4341;
            int var9 = (this.field4340 - var6) * this.field4338[var4][var5 + 1] + this.field4338[var4 + 1][var5 + 1] * var6 >> this.field4341;
            return (this.field4340 - var7) * var8 + var7 * var9 >> this.field4341;
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field4342[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method1505(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method2405(int arg0) {
        try {
            int var1 = -47 / ((arg0 + 62) / 55);
            field4339 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4342[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I[BIIIII)Z")
    public static final boolean method2406(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field4334++;
            int var7 = arg2 % arg3;
            int var8;
            if (var7 == 0) {
                var8 = 0;
            } else {
                var8 = arg3 - var7;
            }
            int var9 = -((arg3 + arg5 - 1) / arg3);
            int var10 = -((arg2 + arg3 - 1) / arg3);
            if (arg6 != 297) {
                return true;
            }
            for (int var11 = var9; var11 < 0; var11++) {
                for (int var12 = var10; var12 < 0; var12++) {
                    if (arg1[arg4] == 0) {
                        return true;
                    }
                    arg4 += arg3;
                }
                arg4 -= var8;
                if (arg1[arg4 - 1] == 0) {
                    return true;
                }
                arg4 += arg0;
            }
            return false;
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field4342[3] + arg0 + ',' + (arg1 == null ? field4342[4] : field4342[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method1501(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I")
    public final int method2407(int arg0, int arg1, int arg2) {
        try {
            int var4 = 99 / ((arg2 + 33) / 55);
            field4333++;
            return this.field4338[arg1][arg0];
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4342[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1506(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method1513(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ldf;[Luf;)V")
    public static final void method2408(class420 arg0, class471[] arg1) {
        if (class142.field1713) {
            int var2 = arg0.method630(arg1, true);
            class606.field8877.method573(var2, arg1);
        }
        if (class555.field8261 == class195.field2617) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class343) {
                var5 = ((class343) arg0).field5330;
                var6 = ((class343) arg0).field5329;
            } else {
                var5 = arg0.field6197 >> class602.field8828;
                var6 = arg0.field6211 >> class602.field8828;
            }
            class606.field8877.method480(class184.field2541[0].method2404((byte) 112, arg0.field6197, arg0.field6211), class114.method1005(var5, var6), class218.method1907(var5, var6), class695.method5076(var5, var6));
        }
        class310 var7 = arg0.method1094((byte) -104, class606.field8877);
        if (var7 == null) {
            return;
        }
        if (arg0.field6204) {
            class359[] var8 = var7.field4918;
            for (int var9 = 0; var9 < var8.length; var9++) {
                class359 var10 = var8[var9];
                if (var10.field5492) {
                    class758.method5495((byte) 50, var10.field5497 + var10.field5495, var10.field5493 - var10.field5495, var10.field5496 + var10.field5495, var10.field5494 - var10.field5495);
                }
            }
        }
        if (var7.field4914) {
            var7.field4915 = arg0;
            if (class329.field5187) {
                class214 var11 = class675.field9785;
                synchronized (class675.field9785) {
                    class675.field9785.method1872(24082, var7);
                    return;
                }
            }
            class675.field9785.method1872(24082, var7);
            return;
        }
        class79.method692(var7, 0);
    }

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method1500();

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1514(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method1515(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1503(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class194 method1504(int arg0, int arg1, class194 arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Luf;[I)V")
    public abstract void method1499(class471 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1507(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V")
    public class294(int arg0, int arg1, int arg2, int[][] arg3) {
        try {
            this.field4336 = arg1;
            this.field4337 = arg0;
            int var5 = 0;
            while (arg2 > 1) {
                var5++;
                arg2 >>= 0x1;
            }
            this.field4340 = 0x1 << var5;
            this.field4338 = arg3;
            this.field4341 = var5;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field4342[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field4342[4] : field4342[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method1509(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2409(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!s", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2410(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 33;
                    break;
                case 1:
                    var10005 = 10;
                    break;
                case 2:
                    var10005 = 51;
                    break;
                case 3:
                    var10005 = 39;
                    break;
                default:
                    var10005 = 74;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
