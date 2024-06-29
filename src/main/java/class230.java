import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class230 extends class160 {

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "Lbh;")
    public class234 field3311 = new class234();

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "Lvg;")
    public class31 field3318 = new class31();

    @OriginalMember(owner = "client!wi", name = "F", descriptor = "Lji;")
    private class145 field3317;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
    public static int field3306 = 0;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public static int field3302 = 100;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "[J")
    public static long[] field3307 = new long[100];

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "I")
    public static int field3314 = 0;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!wi", name = "E", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3305;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V")
    public final void method190(int arg0) {
        this.field3318.method190(arg0);
        field3310++;
        for (class271 var2 = (class271) this.field3311.method1532(-78); var2 != null; var2 = (class271) this.field3311.method1523(-78)) {
            if (!this.field3317.method940(var2, false)) {
                int var3 = arg0;
                do {
                    if (var2.field3980 >= var3) {
                        this.method1503(var2, var3, 64);
                        var2.field3980 -= var3;
                        break;
                    }
                    this.method1503(var2, var2.field3980, 81);
                    var3 -= var2.field3980;
                } while (!this.field3317.method936((int[]) null, (byte) -6, var3, 0, var2));
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "()Lic;")
    public final class160 method196() {
        field3312++;
        class271 var1 = (class271) this.field3311.method1532(-115);
        if (var1 == null) {
            return null;
        } else if (var1.field3972 == null) {
            return this.method195();
        } else {
            return var1.field3972;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lva;II)V")
    private final void method1503(class271 arg0, int arg1, int arg2) {
        field3303++;
        if ((this.field3317.field2115[arg0.field3977] & 0x4) != 0 && arg0.field3975 < 0) {
            int var4 = this.field3317.field2085[arg0.field3977] / class50.field571;
            int var5 = (var4 + 1048575 - arg0.field3950) / var4;
            arg0.field3950 = arg1 * var4 + arg0.field3950 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field3317.field2116[arg0.field3977] == 0) {
                    arg0.field3972 = class278.method1804(arg0.field3961, arg0.field3972.method1795(), arg0.field3972.method1817(), arg0.field3972.method1810());
                } else {
                    arg0.field3972 = class278.method1804(arg0.field3961, arg0.field3972.method1795(), 0, arg0.field3972.method1810());
                    this.field3317.method946(arg0, -27087, arg0.field3979.field3422[arg0.field3966] < 0);
                }
                if (arg0.field3979.field3422[arg0.field3966] < 0) {
                    arg0.field3972.method1813(-1);
                }
                arg1 = arg0.field3950 / var4;
            }
        }
        if (arg2 >= 12) {
            arg0.field3972.method190(arg1);
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(B)V")
    public static void method1504(byte arg0) {
        if (arg0 <= 7) {
            method1507(-37, 36, (byte) -47, -115, 51);
        }
        field3305 = null;
        field3307 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "()Lic;")
    public final class160 method195() {
        field3316++;
        class271 var1;
        do {
            var1 = (class271) this.field3311.method1523(-114);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3972 == null);
        return var1.field3972;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZIII)V")
    public static final void method1505(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 0) {
            class94.field1259.method592(117, false);
            class70.field807++;
            class94.field1259.method1373(5, -13985);
        }
        if (arg3 == 1) {
            class94.field1259.method592(235, arg0);
            class251.field3634++;
            class94.field1259.method1373(19, -13985);
        }
        field3315++;
        class94.field1259.method1403(-117, class260.field3784[82] ? 1 : 0);
        if (!arg0) {
            class94.field1259.method1383((byte) -105, class110.field1473 + arg1);
            class94.field1259.method1364(class166.field2383 + arg2, 1024);
            class292.field4626 = arg1;
            class27.field325 = arg2;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILva;II[I)V")
    private final void method1506(int arg0, int arg1, class271 arg2, int arg3, int arg4, int[] arg5) {
        if ((this.field3317.field2115[arg2.field3977] & 0x4) != 0 && arg2.field3975 < 0) {
            int var7 = this.field3317.field2085[arg2.field3977] / class50.field571;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field3950) / var7;
                if (arg1 < var8) {
                    arg2.field3950 += arg1 * var7;
                    break;
                }
                arg2.field3972.method188(arg5, arg4, var8);
                arg1 -= var8;
                arg2.field3950 += var7 * var8 - 1048576;
                int var9 = class50.field571 / 100;
                arg4 += var8;
                class278 var10 = arg2.field3972;
                int var11 = 262144 / var7;
                if (var11 < var9) {
                    var9 = var11;
                }
                if (this.field3317.field2116[arg2.field3977] == 0) {
                    arg2.field3972 = class278.method1804(arg2.field3961, var10.method1795(), var10.method1817(), var10.method1810());
                } else {
                    arg2.field3972 = class278.method1804(arg2.field3961, var10.method1795(), 0, var10.method1810());
                    this.field3317.method946(arg2, -27087, arg2.field3979.field3422[arg2.field3966] < 0);
                    arg2.field3972.method1820(var9, var10.method1817());
                }
                if (arg2.field3979.field3422[arg2.field3966] < 0) {
                    arg2.field3972.method1813(-1);
                }
                var10.method1802(var9);
                var10.method188(arg5, arg4, arg0 - arg4);
                if (var10.method1816()) {
                    this.field3318.method191(var10);
                }
            }
        }
        if (arg3 == 0) {
            field3304++;
            arg2.field3972.method188(arg5, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIBII)V")
    public static final void method1507(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 >= -2) {
            return;
        }
        class66 var5 = class6.method34(8, true, arg0);
        field3308++;
        var5.method408(0);
        var5.field786 = arg1;
        var5.field784 = arg4;
        var5.field782 = arg3;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "()I")
    public final int method193() {
        field3309++;
        return 0;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([III)V")
    public final void method188(int[] arg0, int arg1, int arg2) {
        this.field3318.method188(arg0, arg1, arg2);
        field3319++;
        for (class271 var4 = (class271) this.field3311.method1532(-65); var4 != null; var4 = (class271) this.field3311.method1523(-97)) {
            if (!this.field3317.method940(var4, false)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field3980) {
                        this.method1506(var5 + var6, var5, var4, 0, var6, arg0);
                        var4.field3980 -= var5;
                        break;
                    }
                    this.method1506(var6 + var5, var4.field3980, var4, 0, var6, arg0);
                    var5 -= var4.field3980;
                    var6 += var4.field3980;
                } while (!this.field3317.method936(arg0, (byte) -100, var5, var6, var4));
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lji;)V")
    public class230(class145 arg0) {
        this.field3317 = arg0;
    }
}
