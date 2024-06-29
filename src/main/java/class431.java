import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class431 {

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Lwg;")
    private class58 field5866 = new class58(256);

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "Lre;")
    private class582 field5869;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "Ln;")
    private class473 field5875;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "J")
    public static long field5867 = -1L;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "J")
    public static long field5870;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "Lkr;")
    public static class329 field5876;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Ln;")
    public static class473 field5871;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "[[I")
    public static int[][] field5865;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)Lgq;")
    public final class305 method2515(int arg0, int arg1) {
        field5872++;
        Object var3 = this.field5866.method323((long) arg1, -19814);
        if (var3 != null) {
            return (class305) var3;
        } else if (this.field5875.method2144(-20, arg1)) {
            class41 var4 = this.field5875.method2151(true, arg1);
            int var5 = var4.field613 ? 64 : this.field5869.field8394;
            if (arg0 <= 72) {
                return null;
            }
            class305 var7;
            if (var4.field619 && this.field5869.method912()) {
                float[] var6 = this.field5875.method2150(-17640, var5, arg1, var5, false, 0.7F);
                var7 = this.field5869.method3295(var5, var6, var4.field606 != 0, class532.field7430, 0, var5);
            } else {
                int[] var8 = var4.field603 ? this.field5875.method2146(-20243, var5, arg1, var5, false, 0.7F) : this.field5875.method2143(arg1, (byte) 15, true, var5, 0.7F, var5);
                var7 = this.field5869.method3349(-13, var5, var4.field606 != 0, var5, var8);
            }
            var7.method1052(var4.field607, -25920, var4.field616);
            this.field5866.method316((long) arg1, (byte) -116, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)Lov;")
    public static final class346 method2516(int arg0, int arg1) {
        field5873++;
        int var2 = -77 / (-arg0 / 42);
        if (arg1 == 0) {
            if ((double) class614.field8831 == 3.0D) {
                return class212.field2731;
            }
            if ((double) class614.field8831 == 4.0D) {
                return class525.field7308;
            }
            if ((double) class614.field8831 == 6.0D) {
                return class342.field4757;
            }
            if ((double) class614.field8831 >= 8.0D) {
                return class630.field9183;
            }
        } else if (arg1 == 1) {
            if ((double) class614.field8831 == 3.0D) {
                return class342.field4757;
            }
            if ((double) class614.field8831 == 4.0D) {
                return class630.field9183;
            }
            if ((double) class614.field8831 == 6.0D) {
                return class536.field7473;
            }
            if ((double) class614.field8831 >= 8.0D) {
                return class211.field2725;
            }
        } else if (arg1 == 2) {
            if ((double) class614.field8831 == 3.0D) {
                return class536.field7473;
            }
            if ((double) class614.field8831 == 4.0D) {
                return class211.field2725;
            }
            if ((double) class614.field8831 == 6.0D) {
                return class321.field4440;
            }
            if ((double) class614.field8831 >= 8.0D) {
                return class58.field784;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public final void method2517(int arg0) {
        field5864++;
        if (arg0 != 25606) {
            field5876 = null;
        }
        this.field5866.method320(5, -306674912);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
    public final void method2518(boolean arg0) {
        if (arg0) {
            field5863++;
            this.field5866.method315(1);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method2519(byte arg0) {
        field5871 = null;
        int var1 = 39 / ((arg0 + 50) / 49);
        field5865 = null;
        field5876 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(JILjava/lang/String;IIILjava/lang/String;IZZI)V")
    public static final void method2520(long arg0, int arg1, String arg2, int arg3, int arg4, int arg5, String arg6, int arg7, boolean arg8, boolean arg9, int arg10) {
        if (arg5 != 2) {
            method2519((byte) -41);
        }
        field5874++;
        if (!class264.field3373 && class50.field673 < 500) {
            int var12 = arg10 == -1 ? class48.field659 : arg10;
            class245 var13 = new class245(arg6, arg2, var12, arg4, arg7, arg0, arg3, arg1, arg8, arg9);
            class57.field760.method3181(var13, true);
            class50.field673++;
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lre;Ln;)V")
    public class431(class582 arg0, class473 arg1) {
        this.field5869 = arg0;
        this.field5875 = arg1;
    }
}
