import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class103 extends class50 {

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    private final int field1863;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    private final int field1857;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    private final int field1867;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    private final int field1862;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    private final int field1861;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    private final int field1858;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    private final int field1856;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    private final int field1869;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "Li;")
    private static class88 field1868 = class208.method1425(105, " more options");

    @OriginalMember(owner = "client!je", name = "r", descriptor = "Li;")
    public static class88 field1864 = field1868;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "[I")
    public static int[] field1871 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!je", name = "z", descriptor = "Li;")
    public static class88 field1872 = class208.method1425(105, "Versteckt");

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1863 = arg1;
        this.field1857 = arg7;
        this.field1867 = arg4;
        this.field1862 = arg2;
        this.field1861 = arg5;
        this.field1858 = arg3;
        this.field1856 = arg0;
        this.field1869 = arg6;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIB)V")
    public final void method377(int arg0, int arg1, byte arg2) {
        int var4 = this.field1862 * arg0 >> 12;
        int var5 = this.field1858 * arg1 >> 12;
        int var6 = this.field1861 * arg1 >> 12;
        int var7 = this.field1856 * arg0 >> 12;
        int var8 = this.field1863 * arg1 >> 12;
        int var9 = this.field1869 * arg0 >> 12;
        int var10 = this.field1867 * arg0 >> 12;
        ++field1865;
        int var11 = this.field1857 * arg1 >> 12;
        int var12 = -65 / ((-11 - arg2) / 55);
        class108.method741(var5, var8, var7, var4, var6, var9, 2, var11, super.field927, var10);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Lvb;")
    public static final class231 method712(int arg0, int arg1) {
        ++field1873;
        class231 var2 = (class231) class216.field4049.method666((long) arg0, arg1 ^ arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class129.field2424.method941((byte) 56, arg0, 3);
            class231 var4 = new class231();
            if (var3 != null) {
                var4.method1548(-1, new class46(var3));
            }
            class216.field4049.method664((long) arg0, var4, false);
            return var4;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    public static final void method713(int arg0) {
        class106.field1925.method134(50);
        if (arg0 != 8) {
            method712(-74, 14);
        }
        ++field1875;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)V")
    public static final void method714(int arg0, int arg1) {
        if (arg0 >= -93) {
            method713(92);
        }
        if (class122.field2232 == 0) {
            class31.field503.method1188((byte) -14, arg1);
        } else {
            class11.field159 = arg1;
        }
        ++field1870;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIZ)V")
    public final void method373(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            ++field1866;
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
    public static void method715(int arg0) {
        field1872 = null;
        field1868 = null;
        field1871 = null;
        if (arg0 == 492525772) {
            field1864 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
    public final void method371(int arg0, int arg1, int arg2) {
        ++field1874;
        if (arg2 != 75) {
            method713(58);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IB[Lq;)V")
    public static final void method716(int arg0, byte arg1, class174[] arg2) {
        ++field1860;
        int var3 = 0;
        if (arg1 < 125) {
            method712(107, 112);
        }
        while (var3 < arg2.length) {
            class174 var4 = arg2[var3];
            if (var4 != null && var4.field3506 == arg0 && (!var4.field3412 || !class71.method475(0, var4))) {
                label99: {
                    if (~var4.field3392 == -1) {
                        if (!var4.field3412 && class71.method475(0, var4) && class65.field1177 != var4) {
                            break label99;
                        }
                        method716(var4.field3425, (byte) 126, arg2);
                        if (var4.field3467 != null) {
                            method716(var4.field3425, (byte) 127, var4.field3467);
                        }
                        class168 var5 = (class168) class128.field2397.method1051(-1, (long) var4.field3425);
                        if (var5 != null) {
                            class217.method1473(var5.field3231, -119);
                        }
                    }
                    if (~var4.field3392 == -7) {
                        if (~var4.field3406 != 0 || ~var4.field3388 != 0) {
                            boolean var6 = class80.method533(-31987, var4);
                            int var7;
                            if (var6) {
                                var7 = var4.field3388;
                            } else {
                                var7 = var4.field3406;
                            }
                            if (~var7 != 0) {
                                class109 var8 = class15.method75(var7, (byte) -42);
                                if (var8 != null) {
                                    var4.field3489 += class17.field261;
                                    while (var4.field3489 > var8.field1992[var4.field3381]) {
                                        var4.field3489 -= var8.field1992[var4.field3381];
                                        ++var4.field3381;
                                        if (var4.field3381 >= var8.field1967.length) {
                                            var4.field3381 -= var8.field1974;
                                            if (~var4.field3381 > -1 || var4.field3381 >= var8.field1967.length) {
                                                var4.field3381 = 0;
                                            }
                                        }
                                        class200.method1373(65280, var4);
                                    }
                                }
                            }
                        }
                        if (~var4.field3387 != -1 && !var4.field3412) {
                            int var9 = var4.field3387 << 16 >> 16;
                            int var10 = var4.field3387 >> 16;
                            int var11 = class17.field261 * var10;
                            var4.field3457 = 2047 & var4.field3457 + var11;
                            int var12 = class17.field261 * var9;
                            var4.field3511 = 2047 & var4.field3511 + var12;
                            class200.method1373(65280, var4);
                        }
                    }
                }
            }
            ++var3;
        }
    }
}
