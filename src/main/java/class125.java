import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class125 extends class123 {

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    private int field2068 = 0;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    private int field2060 = 0;

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "Z")
    private boolean field2092 = false;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
    private int field2089 = -32768;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    public int field2081;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    public int field2074;

    @OriginalMember(owner = "client!hd", name = "X", descriptor = "I")
    private int field2095;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
    private int field2078;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public int field2062;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    private int field2061;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public int field2063;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
    private int field2084;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "I")
    private int field2083;

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "I")
    public int field2090;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    private int field2065;

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "Ls;")
    private class96 field2091;

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "I")
    public static int field2094 = 5063219;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "Lud;")
    public static class52 field2072 = new class52();

    @OriginalMember(owner = "client!hd", name = "Y", descriptor = "[I")
    public static int[] field2096 = new int[128];

    @OriginalMember(owner = "client!hd", name = "ab", descriptor = "Lmh;")
    public static class62 field2098 = class201.method1405(true, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "D")
    private double field2064;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "D")
    public double field2069;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "D")
    public double field2073;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "D")
    public double field2075;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "D")
    private double field2076;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "D")
    private double field2079;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "D")
    private double field2082;

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "D")
    private double field2093;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
    public int field2071;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
    private int field2080;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!hd", name = "Z", descriptor = "Llf;")
    public static class299 field2097;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V", line = 19)
    public static void method944(byte arg0) {
        field2097 = null;
        if (arg0 >= -119) {
            method948(-19, 54);
        }
        field2096 = null;
        field2072 = null;
        field2098 = null;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V", line = 34)
    public static final void method945(byte arg0) {
        if (arg0 < 20) {
            field2096 = (int[]) null;
        }
        field2087++;
        class15.field130 = new class52();
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "()I", line = 45)
    public final int method278() {
        field2085++;
        return this.field2089;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIIIJ)V", line = 61)
    public final void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2066++;
        class138 var11 = this.method947(0);
        if (var11 != null) {
            var11.method276(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2089 = var11.method278();
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Llf;I)V", line = 80)
    public static final void method946(class299 arg0, int arg1) {
        int var2 = class60.field878;
        int var3 = var2 * 956 / 503;
        class4.field43.method644((class306.field5258 - var3) / 2, 0, var3, var2);
        class272.field4630.method124(class306.field5258 / 2 - (class272.field4630.field276 / arg1), 18);
        arg0.method2018(class192.field3232, class306.field5258 / 2, class60.field878 / 2 - 26, 16777215, -1);
        int var4 = class60.field878 / 2 - 18;
        class311.method2115(class306.field5258 / 2 - 152, var4, 304, 34, 9179409);
        class311.method2115(class306.field5258 / 2 - 151, var4 + 1, 302, 32, 0);
        class311.method2117(class306.field5258 / 2 - 150, var4 + 2, class81.field1361 * 3, 30, 9179409);
        class311.method2117(class306.field5258 / 2 + (class81.field1361 * 3) - 150, var4 - -2, 300 - (class81.field1361 * 3), 30, 0);
        field2088++;
        arg0.method2018(class271.field4622, class306.field5258 / 2, class60.field878 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 295)
    public class125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2081 = arg1;
        this.field2074 = arg9;
        this.field2095 = arg2;
        this.field2078 = arg0;
        this.field2062 = arg5;
        this.field2061 = arg8;
        this.field2063 = arg10;
        this.field2092 = false;
        this.field2084 = arg7;
        this.field2083 = arg4;
        this.field2090 = arg6;
        this.field2065 = arg3;
        int var12 = class115.method895(-110, this.field2078).field4611;
        if (var12 == -1) {
            this.field2091 = null;
        } else {
            this.field2091 = class151.method1085(var12, (byte) 107);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)Lab;", line = 140)
    private final class138 method947(int arg0) {
        field2077++;
        if (arg0 != 0) {
            this.method278();
        }
        class271 var2 = class115.method895(-128, this.field2078);
        class138 var3 = var2.method1862(true, this.field2068);
        if (var3 == null) {
            return null;
        } else {
            var3.method497(this.field2080);
            return var3;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)I", line = 165)
    public static final int method948(int arg0, int arg1) {
        field2067++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 != 2) {
            return -95;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BIIII)V", line = 219)
    public final void method949(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2070++;
        if (!this.field2092) {
            double var6 = (double) (arg1 - this.field2095);
            double var8 = (double) (arg3 - this.field2065);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2075 = (double) this.field2083;
            this.field2069 = (double) this.field2061 * var8 / var10 + (double) this.field2065;
            this.field2073 = (double) this.field2061 * var6 / var10 + (double) this.field2095;
        }
        double var12 = (double) (this.field2090 + 1 - arg4);
        this.field2082 = ((double) arg3 - this.field2069) / var12;
        this.field2079 = ((double) arg1 - this.field2073) / var12;
        this.field2076 = Math.sqrt(this.field2082 * this.field2082 + this.field2079 * this.field2079);
        if (!this.field2092) {
            this.field2064 = -this.field2076 * Math.tan((double) this.field2084 * 0.02454369D);
        }
        if (arg0 < -123) {
            this.field2093 = ((double) arg2 - this.field2075 - (this.field2064 * var12)) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)V", line = 252)
    public final void method950(int arg0, int arg1) {
        this.field2092 = true;
        field2086++;
        this.field2069 += (double) arg1 * this.field2082;
        this.field2073 += (double) arg1 * this.field2079;
        this.field2075 += this.field2093 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field2064;
        this.field2064 += (double) arg1 * this.field2093;
        if (arg0 != 0) {
            this.method276(-47, 88, 110, -20, -66, -102, 49, 77, 23L);
        }
        this.field2071 = (int) (Math.atan2(this.field2079, this.field2082) * 325.949D) + 1024 & 0x7FF;
        this.field2080 = (int) (Math.atan2(this.field2064, this.field2076) * 325.949D) & 0x7FF;
        if (this.field2091 == null) {
            return;
        }
        this.field2060 += arg1;
        while (true) {
            do {
                do {
                    if (this.field2091.field1555[this.field2068] >= this.field2060) {
                        return;
                    }
                    this.field2060 -= this.field2091.field1555[this.field2068];
                    this.field2068++;
                } while (this.field2068 < this.field2091.field1586.length);
                this.field2068 -= this.field2091.field1568;
            } while (this.field2068 >= 0 && this.field2091.field1586.length > this.field2068);
            this.field2068 = 0;
        }
    }
}
