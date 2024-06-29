import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class99 extends class115 {

    @OriginalMember(owner = "client!rf", name = "hb", descriptor = "Lqe;")
    public static class168 field1573 = class66.method448("(Z", -117);

    @OriginalMember(owner = "client!rf", name = "eb", descriptor = "Z")
    public static volatile boolean field1570 = true;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "Lqe;")
    public static class168 field1559 = class66.method448("floorshadows", 100);

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "Lqe;")
    private static class168 field1563 = class66.method448("red:", 89);

    @OriginalMember(owner = "client!rf", name = "Z", descriptor = "Lqe;")
    public static class168 field1565 = field1563;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "Lqe;")
    public static class168 field1558 = field1563;

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "Lqe;")
    public static class168 field1564 = class66.method448("overlay)3dat", -116);

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!rf", name = "ab", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!rf", name = "bb", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!rf", name = "cb", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!rf", name = "fb", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!rf", name = "gb", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!rf", name = "ib", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!rf", name = "jb", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "Lub;")
    public static class64 field1560;

    @OriginalMember(owner = "client!rf", name = "db", descriptor = "[Lch;")
    private class151[] field1569;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "(I)V")
    public static void method650(int arg0) {
        field1563 = null;
        if (arg0 <= 50) {
            field1558 = null;
        }
        field1558 = null;
        field1564 = null;
        field1559 = null;
        field1565 = null;
        field1573 = null;
        field1560 = null;
    }

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "(I)V")
    public static final void method651(int arg0) {
        ++field1561;
        if (arg0 != -2) {
            method651(-74);
        }
        class114.field1866.method1322(false);
        class177.field3120 = null;
        class135.field2361 = 1;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(II)V")
    public static final void method652(int arg0, int arg1) {
        ++field1562;
        class170 var2 = (class170) class119.field1941.method1527((long) arg0, (byte) -85);
        if (arg1 >= -108) {
            field1564 = null;
        }
        if (var2 != null) {
            var2.method1234(17216);
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(Z)Lvc;")
    public static final class104 method653(boolean arg0) {
        ++field1556;
        try {
            if (arg0) {
                field1565 = null;
            }
            return (class104) Class.forName("id").newInstance();
        } catch (Throwable var1) {
            return new class120();
        }
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(III)Ldj;")
    public static final class162 method654(int arg0, int arg1, int arg2) {
        class177 var3 = class254.field4395[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3116;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    public class99() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        if (arg1 < 11) {
            return null;
        } else {
            ++field1571;
            int[][] var3 = super.field1882.method1242(arg0, 79);
            if (super.field1882.field3344) {
                int var4 = class62.field855;
                int var5 = class130.field2297;
                int[][][] var6 = super.field1882.method1240(11605);
                int[][] var7 = new int[var4][var5];
                this.method655(var7, 0);
                for (int var8 = 0; var8 < class62.field855; ++var8) {
                    int[] var9 = var7[var8];
                    int[][] var10 = var6[var8];
                    int[] var11 = var10[1];
                    int[] var12 = var10[0];
                    int[] var13 = var10[2];
                    for (int var14 = 0; ~var14 > ~class130.field2297; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class86.method571(255, var15) << 4;
                        var11[var14] = class86.method571(var15, 65280) >> 4;
                        var12[var14] = class86.method571(4080, var15 >> 12);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([[II)V")
    private final void method655(int[][] arg0, int arg1) {
        ++field1572;
        int var3 = class62.field855;
        int var4 = class130.field2297;
        class241.method1570(arg0, 96);
        class187.method1217((byte) 122, arg1, 0, class38.field522, class134.field2350);
        if (this.field1569 != null) {
            for (int var5 = 0; var5 < this.field1569.length; ++var5) {
                class151 var6 = this.field1569[var5];
                int var7 = var6.field2627;
                int var8 = var6.field2637;
                if (var8 >= 0) {
                    if (var7 >= 0) {
                        var6.method422(var4, (byte) -66, var3);
                    } else {
                        var6.method424(-1, var3, var4);
                    }
                } else if (~var7 <= -1) {
                    var6.method426(var4, (byte) -110, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        ++field1568;
        int[] var3 = super.field1872.method182((byte) -102, arg0);
        if (arg1 <= 37) {
            return null;
        } else {
            if (super.field1872.field341) {
                this.method655(super.field1872.method181((byte) -29), 0);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        if (arg0 != 107) {
            this.method5(91, (byte) -100);
        }
        ++field1557;
        if (~arg2 == -1) {
            this.field1569 = new class151[arg1.method758(true)];
            for (int var4 = 0; this.field1569.length > var4; ++var4) {
                int var5 = arg1.method758(true);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field1569[var4] = class120.method823(arg0 + -876, arg1);
                            }
                        } else {
                            this.field1569[var4] = class85.method562(arg1, 0);
                        }
                    } else {
                        this.field1569[var4] = class168.method1117(arg1, 1);
                    }
                } else {
                    this.field1569[var4] = class26.method172(-20325, arg1);
                }
            }
        } else if (~arg2 == -2) {
            super.field1879 = ~arg1.method758(true) == -2;
        }
    }
}
