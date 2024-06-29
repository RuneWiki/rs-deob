import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class676 extends class648 {

    @OriginalMember(owner = "client!iha", name = "u", descriptor = "Lqia;")
    public class547 field9188 = new class547();

    @OriginalMember(owner = "client!iha", name = "C", descriptor = "Ldb;")
    public class99 field9196 = new class99();

    @OriginalMember(owner = "client!iha", name = "v", descriptor = "Lnl;")
    private class681 field9189;

    @OriginalMember(owner = "client!iha", name = "x", descriptor = "I")
    public static int field9191 = 0;

    @OriginalMember(owner = "client!iha", name = "t", descriptor = "Lus;")
    public static class328 field9187 = new class328(69, 2);

    @OriginalMember(owner = "client!iha", name = "B", descriptor = "I")
    public static int field9195 = 0;

    @OriginalMember(owner = "client!iha", name = "n", descriptor = "I")
    public static int field9181;

    @OriginalMember(owner = "client!iha", name = "o", descriptor = "I")
    public static int field9182;

    @OriginalMember(owner = "client!iha", name = "p", descriptor = "I")
    public static int field9183;

    @OriginalMember(owner = "client!iha", name = "q", descriptor = "I")
    public static int field9184;

    @OriginalMember(owner = "client!iha", name = "r", descriptor = "I")
    public static int field9185;

    @OriginalMember(owner = "client!iha", name = "s", descriptor = "I")
    public static int field9186;

    @OriginalMember(owner = "client!iha", name = "w", descriptor = "I")
    public static int field9190;

    @OriginalMember(owner = "client!iha", name = "y", descriptor = "I")
    public static int field9192;

    @OriginalMember(owner = "client!iha", name = "z", descriptor = "I")
    public static int field9193;

    @OriginalMember(owner = "client!iha", name = "A", descriptor = "I")
    public static int field9194;

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(Ldg;II[IIZ)V")
    private final void method3632(class206 arg0, int arg1, int arg2, int[] arg3, int arg4, boolean arg5) {
        field9193++;
        if (!arg5) {
            this.method661(115);
        }
        if ((this.field9189.field9265[arg0.field2638] & 0x4) != 0 && arg0.field2629 < 0) {
            int var7 = this.field9189.field9279[arg0.field2638] / class554.field7780;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field2650) / var7;
                if (var8 > arg2) {
                    arg0.field2650 += arg2 * var7;
                    break;
                }
                arg0.field2626.method670(arg3, arg4, var8);
                arg0.field2650 += var7 * var8 - 1048576;
                arg4 += var8;
                arg2 -= var8;
                int var9 = class554.field7780 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class729 var11 = arg0.field2626;
                if (this.field9189.field9273[arg0.field2638] == 0) {
                    arg0.field2626 = class729.method4070(arg0.field2632, var11.method4054(), var11.method4074(), var11.method4052());
                } else {
                    arg0.field2626 = class729.method4070(arg0.field2632, var11.method4054(), 0, var11.method4052());
                    this.field9189.method3686(arg0, arg0.field2643.field550[arg0.field2645] < 0, (byte) -62);
                    arg0.field2626.method4036(var9, var11.method4074());
                }
                if (arg0.field2643.field550[arg0.field2645] < 0) {
                    arg0.field2626.method4040(-1);
                }
                var11.method4067(var9);
                var11.method670(arg3, arg4, arg1 - arg4);
                if (var11.method4063()) {
                    this.field9196.method663(var11);
                }
            }
        }
        arg0.field2626.method670(arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!iha", name = "d", descriptor = "()Lrn;")
    public final class648 method673() {
        field9186++;
        class206 var1;
        do {
            var1 = (class206) this.field9188.method3116(-100);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2626 == null);
        return var1.field2626;
    }

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "()Lrn;")
    public final class648 method662() {
        field9182++;
        class206 var1 = (class206) this.field9188.method3111(53);
        if (var1 == null) {
            return null;
        } else if (var1.field2626 == null) {
            return this.method673();
        } else {
            return var1.field2626;
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(Z)V")
    public static final void method3633(boolean arg0) {
        field9194++;
        if (!arg0) {
            method3635(-52);
        }
        for (class303 var1 = (class303) class274.field3460.method3245(false); var1 != null; var1 = (class303) class274.field3460.method3252(12938)) {
            if (var1.field3898.method1819(108)) {
                class623.method3410(var1.field3899, -127);
            } else {
                var1.field3898.method2951(!arg0);
                try {
                    var1.field3898.method1823(123);
                } catch (Exception var5) {
                    class486.method2844((byte) -1, "TV: " + var1.field3899, var5);
                    class623.method3410(var1.field3899, -128);
                }
                if (!var1.field3892 && !var1.field3893) {
                    class340 var3 = var1.field3898.method1832(-100);
                    if (var3 != null) {
                        class146 var4 = var3.method1994((byte) -109);
                        if (var4 != null) {
                            var4.method910(var1.field3897, -87);
                            class668.field9148.method663(var4);
                            var1.field3892 = true;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)V")
    public final void method661(int arg0) {
        this.field9196.method661(arg0);
        field9181++;
        for (class206 var2 = (class206) this.field9188.method3111(65); var2 != null; var2 = (class206) this.field9188.method3116(-87)) {
            if (!this.field9189.method3662(-26654, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2628) {
                        this.method3637(var3, 0, var2);
                        var2.field2628 -= var3;
                        break;
                    }
                    this.method3637(var2.field2628, 0, var2);
                    var3 -= var2.field2628;
                } while (!this.field9189.method3691(null, var3, 0, var2, (byte) -89));
            }
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IIIBILnga;)Ljava/awt/Frame;")
    public static final Frame method3634(int arg0, int arg1, int arg2, byte arg3, int arg4, class256 arg5) {
        field9190++;
        if (!arg5.method1554((byte) 115)) {
            return null;
        }
        if (arg2 == 0) {
            class434[] var6 = class97.method652((byte) -1, arg5);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field6121 == arg1 && var6[var8].field6117 == arg4 && (arg0 == 0 || var6[var8].field6118 == arg0) && (!var7 || arg2 < var6[var8].field6120)) {
                    var7 = true;
                    arg2 = var6[var8].field6120;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class435 var9 = arg5.method1564(arg4, arg1, arg2, arg0, true);
        while (var9.field6124 == 0) {
            class517.method2965(10L, -92);
        }
        if (arg3 != -76) {
            field9195 = -85;
        }
        Frame var10 = (Frame) var9.field6123;
        if (var10 == null) {
            return null;
        } else if (var9.field6124 == 2) {
            class171.method1069(-126, arg5, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "(I)V")
    public static void method3635(int arg0) {
        field9187 = null;
        if (arg0 != 0) {
            field9187 = null;
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(II)V")
    public static final void method3636(int arg0, int arg1) {
        class108 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class402 var4 = class716.field10106[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class665.field9107; var5++) {
                    for (int var6 = 0; var6 < class90.field1142; var6++) {
                        var2 = var4.method553(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class455.field6383;
                            int var8 = var5 << class455.field6383;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class402 var10 = class716.field10106[var9];
                                if (var10 != null) {
                                    int var11 = var4.method2381(-127, var6, var5) - var10.method2381(-88, var6, var5);
                                    int var12 = var4.method2381(-122, var6 + 1, var5) - var10.method2381(-98, var6 + 1, var5);
                                    int var13 = var4.method2381(-122, var6 + 1, var5 + 1) - var10.method2381(-120, var6 + 1, var5 + 1);
                                    int var14 = var4.method2381(-120, var6, var5 + 1) - var10.method2381(-96, var6, var5 + 1);
                                    var10.method548(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "()I")
    public final int method671() {
        field9184++;
        return 0;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IILdg;)V")
    private final void method3637(int arg0, int arg1, class206 arg2) {
        if ((this.field9189.field9265[arg2.field2638] & 0x4) != 0 && arg2.field2629 < 0) {
            int var4 = this.field9189.field9279[arg2.field2638] / class554.field7780;
            int var5 = (var4 + 1048575 - arg2.field2650) / var4;
            arg2.field2650 = arg2.field2650 + (arg0 * var4) & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field9189.field9273[arg2.field2638] == 0) {
                    arg2.field2626 = class729.method4070(arg2.field2632, arg2.field2626.method4054(), arg2.field2626.method4074(), arg2.field2626.method4052());
                } else {
                    arg2.field2626 = class729.method4070(arg2.field2632, arg2.field2626.method4054(), 0, arg2.field2626.method4052());
                    this.field9189.method3686(arg2, arg2.field2643.field550[arg2.field2645] < 0, (byte) -82);
                }
                if (arg2.field2643.field550[arg2.field2645] < 0) {
                    arg2.field2626.method4040(-1);
                }
                arg0 = arg2.field2650 / var4;
            }
        }
        field9183++;
        if (arg1 == 0) {
            arg2.field2626.method661(arg0);
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IZ)V")
    public static final void method3638(int arg0, boolean arg1) {
        if (arg1 && class341.field4407 != null) {
            class469.field6741 = class341.field4407.field5285;
        } else {
            class469.field6741 = -1;
        }
        field9192++;
        class412.field5821 = null;
        class419.field5962 = null;
        class551.field7754 = 0;
        class341.field4407 = null;
        class341.method2017();
        class341.field4421.method3114(true);
        class295.field3842 = null;
        class341.field4417 = null;
        class169.field2234 = null;
        class70.field950 = null;
        class470.field6749 = null;
        class373.field5246 = null;
        class499.field7057 = null;
        class726.field10170 = null;
        class137.field1624 = null;
        class345.field4470 = arg0;
        class90.field1143 = -1;
        class694.field9821 = null;
        if (class341.field4406 != null) {
            class341.field4406.method2770(-124);
            class341.field4406.method2768(128, (byte) 116, 64);
        }
        if (class341.field4408 != null) {
            class341.field4408.method1482(arg0 + 101, 64, 64);
        }
        if (class341.field4404 != null) {
            class341.field4404.method885(64, (byte) 110);
        }
        class197.field2537.method2535(64, (byte) -8);
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "([III)V")
    public final void method670(int[] arg0, int arg1, int arg2) {
        field9185++;
        this.field9196.method670(arg0, arg1, arg2);
        for (class206 var4 = (class206) this.field9188.method3111(63); var4 != null; var4 = (class206) this.field9188.method3116(-37)) {
            if (!this.field9189.method3662(-26654, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2628) {
                        this.method3632(var4, var5 + var6, var6, arg0, var5, true);
                        var4.field2628 -= var6;
                        break;
                    }
                    this.method3632(var4, var5 + var6, var4.field2628, arg0, var5, true);
                    var6 -= var4.field2628;
                    var5 += var4.field2628;
                } while (!this.field9189.method3691(arg0, var6, var5, var4, (byte) 75));
            }
        }
    }

    @OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(Lnl;)V")
    public class676(class681 arg0) {
        this.field9189 = arg0;
    }
}
