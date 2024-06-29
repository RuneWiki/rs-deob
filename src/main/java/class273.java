import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class273 extends class223 {

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
    private final int field4568;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    private final int field4562;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "I")
    private final int field4571;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    private final int field4559;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "Lph;")
    public static class229 field4573 = class266.method1858("Speicher wird zugewiesen)3", 0);

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public static int field4575 = 0;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZII)V", line = 8)
    public final void method1392(boolean arg0, int arg1, int arg2) {
        int var4 = this.field4559 * arg2 >> 12;
        int var5 = this.field4562 * arg2 >> 12;
        if (arg0) {
            int var6 = this.field4568 * arg1 >> 12;
            field4560++;
            int var7 = this.field4571 * arg1 >> 12;
            class22.method132(this.field3669, var5, var7, 127, var6, var4);
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V", line = 29)
    public static void method1888(byte arg0) {
        if (arg0 > -24) {
            field4567 = 87;
        }
        field4573 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V", line = 40)
    public final void method1396(int arg0, int arg1, int arg2) {
        field4576++;
        if (arg1 >= -66) {
            method1890((class66) null, (class66) null, -116);
        }
        int var4 = this.field4562 * arg2 >> 12;
        int var5 = this.field4559 * arg2 >> 12;
        int var6 = this.field4568 * arg0 >> 12;
        int var7 = this.field4571 * arg0 >> 12;
        class237.method1674(var6, this.field3665, this.field3674, (byte) 89, var5, var4, var7);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)[B", line = 63)
    public static final byte[] method1889(byte arg0, int arg1) {
        field4566++;
        if (arg0 <= 76) {
            return (byte[]) null;
        }
        class161 var2 = (class161) class50.field715.method1027(-62, (long) arg1);
        if (var2 == null) {
            Random var3 = new Random((long) arg1);
            byte[] var4 = new byte[512];
            for (int var5 = 0; var5 < 255; var5++) {
                var4[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class113.method861(var7, (byte) -24, var3);
                byte var9 = var4[var8];
                var4[var8] = var4[var7];
                var4[var7] = var4[511 - var6] = var9;
            }
            var2 = new class161(var4);
            class50.field715.method1026(var2, 120, (long) arg1);
        }
        return var2.field2596;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lsi;Lsi;I)V", line = 120)
    public static final void method1890(class66 arg0, class66 arg1, int arg2) {
        int var3 = -48 % ((72 - arg2) / 34);
        field4572++;
        class160.field2589 = arg1;
        class260.field4357 = arg0;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(IIIIIII)V", line = 130)
    public class273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4568 = arg1;
        this.field4562 = arg0;
        this.field4571 = arg3;
        this.field4559 = arg2;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIB)I", line = 150)
    public static final int method1891(int arg0, int arg1, byte arg2) {
        field4569++;
        int var3 = 0;
        if (arg2 <= 72) {
            field4575 = -107;
        }
        while (arg1 > 0) {
            arg1--;
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lgi;I)V", line = 169)
    public static final void method1892(class306 arg0, int arg1) {
        field4570++;
        if (class319.field5393 == arg0.field5144 || arg0.field5136 == -1 || arg0.field5135 != 0 || (arg0.field5172 + 1) > class53.method362((byte) -109, arg0.field5136).field5236[arg0.field5116]) {
            int var2 = arg0.field5144 - arg0.field5109;
            int var3 = class319.field5393 - arg0.field5109;
            int var4 = arg0.field5105 * 128 + (arg0.method1457(0) * 64);
            int var5 = arg0.field5165 * 128 + (arg0.method1457(0) * 64);
            int var6 = arg0.field5138 * 128 + arg0.method1457(0) * 64;
            int var7 = arg0.field5110 * 128 + (arg0.method1457(arg1 ^ 0x0) * 64);
            arg0.field5168 = ((var2 - var3) * var5 + (var3 * var7)) / var2;
            arg0.field5147 = ((var2 - var3) * var4 + (var3 * var6)) / var2;
        }
        if (arg0.field5127 == 0) {
            arg0.field5163 = 1024;
        }
        arg0.field5145 = arg1;
        if (arg0.field5127 == 1) {
            arg0.field5163 = 1536;
        }
        if (arg0.field5127 == 2) {
            arg0.field5163 = 0;
        }
        if (arg0.field5127 == 3) {
            arg0.field5163 = 512;
        }
        arg0.field5122 = arg0.field5163;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)[Lka;", line = 211)
    public static final class293[] method1893(int arg0) {
        field4574++;
        if (arg0 >= -86) {
            return (class293[]) null;
        }
        class293[] var1 = new class293[class301.field4993];
        for (int var2 = 0; var2 < class301.field4993; var2++) {
            byte[] var3 = class279.field4623[var2];
            int var4 = class36.field597[var2] * class288.field4729[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class314.field5346[class243.method1696(255, var3[var6])];
            }
            if (class99.field1675) {
                var1[var2] = new class87(class266.field4486, class48.field713, class303.field5064[var2], class27.field387[var2], class36.field597[var2], class288.field4729[var2], var5);
            } else {
                var1[var2] = new class327(class266.field4486, class48.field713, class303.field5064[var2], class27.field387[var2], class36.field597[var2], class288.field4729[var2], var5);
            }
        }
        class214.method1517(-25672);
        return var1;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljm;ZILjm;I)I", line = 252)
    public static final int method1894(class134 arg0, boolean arg1, int arg2, class134 arg3, int arg4) {
        field4564++;
        if (arg2 == 1) {
            int var5 = arg0.field2167;
            int var6 = arg3.field2167;
            if (!arg1) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var6 - var5;
        } else if (arg2 == 2) {
            return arg3.method952((byte) 95).field2953.method1613((byte) -100, arg0.method952((byte) 95).field2953);
        } else if (arg2 == 3) {
            if (arg3.field2177.method1618(false, class222.field3652)) {
                if (arg0.field2177.method1618(false, class222.field3652)) {
                    return 0;
                } else if (arg1) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg0.field2177.method1618(false, class222.field3652)) {
                return arg1 ? 1 : -1;
            } else {
                return arg3.field2177.method1613((byte) 9, arg0.field2177);
            }
        } else if (arg2 == 4) {
            return arg3.method947((byte) -122) ? (arg0.method947((byte) -119) ? 0 : 1) : (arg0.method947((byte) -113) ? -1 : 0);
        } else if (arg2 == 5) {
            return arg3.method942((byte) 51) ? (arg0.method942((byte) 51) ? 0 : 1) : (arg0.method942((byte) 51) ? -1 : 0);
        } else if (arg2 == 6) {
            return arg3.method945(-116) ? (arg0.method945(-112) ? 0 : 1) : (arg0.method945(arg4 ^ 0x2921) ? -1 : 0);
        } else {
            if (arg4 != -10572) {
                method1889((byte) 88, -13);
            }
            if (arg2 == 7) {
                return arg3.method944(true) ? (arg0.method944(true) ? 0 : 1) : (arg0.method944(true) ? -1 : 0);
            } else {
                return arg3.field2178 - arg0.field2178;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(III)V", line = 328)
    public final void method1391(int arg0, int arg1, int arg2) {
        field4565++;
        int var4 = this.field4559 * arg2 >> 12;
        if (arg0 >= 83) {
            int var5 = this.field4568 * arg1 >> 12;
            int var6 = this.field4571 * arg1 >> 12;
            int var7 = this.field4562 * arg2 >> 12;
            class277.method1912(var4, this.field3665, var6, (byte) 104, var5, this.field3674, var7, this.field3669);
        }
    }
}
