import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class307 extends class446 {

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "Lar;")
    public class47 field4515 = new class47();

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "Lqf;")
    public class389 field4527 = new class389();

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "Lrh;")
    private class70 field4516;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "[I")
    public static int[] field4518 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "[Lja;")
    public static class90[] field4525 = new class90[16];

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field4520 = new String[100];

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    public static int field4522 = 0;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    public static int field4523 = 0;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "Ltj;")
    public static class429 field4514;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "([III)V")
    public final void method495(int[] arg0, int arg1, int arg2) {
        field4510++;
        this.field4527.method495(arg0, arg1, arg2);
        for (class211 var4 = (class211) this.field4515.method332(-2130841184); var4 != null; var4 = (class211) this.field4515.method343((byte) -89)) {
            if (!this.field4516.method488((byte) 9, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field2815) {
                        this.method2090(var5, var6, var4, true, var5 + var6, arg0);
                        var4.field2815 -= var5;
                        break;
                    }
                    this.method2090(var4.field2815, var6, var4, true, var6 + var5, arg0);
                    var6 += var4.field2815;
                    var5 -= var4.field2815;
                } while (!this.field4516.method505((byte) -84, var6, var5, arg0, var4));
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILdd;ZI[I)V")
    private final void method2090(int arg0, int arg1, class211 arg2, boolean arg3, int arg4, int[] arg5) {
        field4511++;
        if (!arg3) {
            return;
        }
        if ((this.field4516.field967[arg2.field2814] & 0x4) != 0 && arg2.field2802 < 0) {
            int var7 = this.field4516.field909[arg2.field2814] / class9.field153;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field2812) / var7;
                if (arg0 < var8) {
                    arg2.field2812 += arg0 * var7;
                    break;
                }
                arg2.field2809.method495(arg5, arg1, var8);
                arg0 -= var8;
                arg1 += var8;
                arg2.field2812 += var7 * var8 - 1048576;
                int var9 = class9.field153 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class137 var11 = arg2.field2809;
                if (this.field4516.field941[arg2.field2814] == 0) {
                    arg2.field2809 = class137.method889(arg2.field2813, var11.method881(), var11.method866(), var11.method885());
                } else {
                    arg2.field2809 = class137.method889(arg2.field2813, var11.method881(), 0, var11.method885());
                    this.field4516.method487(-121, arg2, arg2.field2824.field486[arg2.field2823] < 0);
                    arg2.field2809.method852(var9, var11.method866());
                }
                if (arg2.field2824.field486[arg2.field2823] < 0) {
                    arg2.field2809.method887(-1);
                }
                var11.method853(var9);
                var11.method495(arg5, arg1, arg4 - arg1);
                if (var11.method857()) {
                    this.field4527.method2506(var11);
                }
            }
        }
        arg2.field2809.method495(arg5, arg1, arg0);
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
    public static void method2091(int arg0) {
        field4520 = null;
        field4525 = null;
        int var1 = -68 % ((arg0 + 4) / 37);
        field4514 = null;
        field4518 = null;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "()Lpl;")
    public final class446 method501() {
        field4524++;
        class211 var1 = (class211) this.field4515.method332(-2130841184);
        if (var1 == null) {
            return null;
        } else if (var1.field2809 == null) {
            return this.method469();
        } else {
            return var1.field2809;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "()Lpl;")
    public final class446 method469() {
        field4512++;
        class211 var1;
        do {
            var1 = (class211) this.field4515.method343((byte) -82);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2809 == null);
        return var1.field2809;
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V")
    public static final void method2092(int arg0) {
        field4526++;
        int var1 = 55 % ((56 - arg0) / 46);
        for (int var2 = 0; var2 < class198.field2637; var2++) {
            int var3 = class398.field5938[var2];
            class43 var4 = class306.field4496[var3];
            if (var4 != null) {
                class157.method973(var4.field606.field3363, var4, 104);
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)Lrf;")
    public static final class442 method2093(int arg0, int arg1) {
        if (arg0 != 3) {
            method2091(123);
        }
        field4519++;
        class189 var2 = class211.field2816;
        class442 var3;
        synchronized (class211.field2816) {
            var3 = (class442) class211.field2816.method1137((long) arg1, arg0 + 2108653708);
            if (var3 == null) {
                var3 = new class442(arg1);
                class211.field2816.method1144((long) arg1, var3, -3480);
            }
        }
        synchronized (var3) {
            return var3.method2786((byte) 16) ? var3 : null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLdd;I)V")
    private final void method2094(boolean arg0, class211 arg1, int arg2) {
        if (arg0) {
            method2092(124);
        }
        if ((this.field4516.field967[arg1.field2814] & 0x4) != 0 && arg1.field2802 < 0) {
            int var4 = this.field4516.field909[arg1.field2814] / class9.field153;
            int var5 = (1048575 - (arg1.field2812 - var4)) / var4;
            arg1.field2812 = arg1.field2812 + (arg2 * var4) & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field4516.field941[arg1.field2814] == 0) {
                    arg1.field2809 = class137.method889(arg1.field2813, arg1.field2809.method881(), arg1.field2809.method866(), arg1.field2809.method885());
                } else {
                    arg1.field2809 = class137.method889(arg1.field2813, arg1.field2809.method881(), 0, arg1.field2809.method885());
                    this.field4516.method487(-115, arg1, arg1.field2824.field486[arg1.field2823] < 0);
                }
                if (arg1.field2824.field486[arg1.field2823] < 0) {
                    arg1.field2809.method887(-1);
                }
                arg2 = arg1.field2812 / var4;
            }
        }
        field4513++;
        arg1.field2809.method470(arg2);
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
    public final void method470(int arg0) {
        field4517++;
        this.field4527.method470(arg0);
        for (class211 var2 = (class211) this.field4515.method332(-2130841184); var2 != null; var2 = (class211) this.field4515.method343((byte) -123)) {
            if (!this.field4516.method488((byte) 42, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field2815 >= var3) {
                        this.method2094(false, var2, var3);
                        var2.field2815 -= var3;
                        break;
                    }
                    this.method2094(false, var2, var2.field2815);
                    var3 -= var2.field2815;
                } while (!this.field4516.method505((byte) -116, 0, var3, (int[]) null, var2));
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lrh;)V")
    public class307(class70 arg0) {
        this.field4516 = arg0;
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "()I")
    public final int method490() {
        field4521++;
        return 0;
    }
}
