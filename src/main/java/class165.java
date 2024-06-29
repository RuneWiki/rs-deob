import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class165 extends class75 {

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    private int field3063 = -32768;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    private int field3065 = 0;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    private int field3069 = 0;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "Z")
    public boolean field3077 = false;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public int field3071;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "I")
    private int field3081;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public int field3072;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public int field3083;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
    public int field3084;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
    public int field3085;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "Lpa;")
    private class2 field3074;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "Lli;")
    public static class185 field3067 = class245.method1649(":duelstake:", -21);

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "Lgf;")
    public static class7 field3078 = new class7(32);

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "[J")
    public static long[] field3088 = new long[100];

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "Lli;")
    public static class185 field3089 = null;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "[Lwf;")
    public static class47[] field3090 = new class47[4];

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "Lga;")
    private class16 field3075;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "[[[B")
    public static byte[][][] field3091;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "()I")
    public final int method62() {
        field3066++;
        return this.field3063;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static final void method1175(int arg0) {
        if (arg0 > -10) {
            method1176(-26);
        }
        field3073++;
        for (class79 var1 = (class79) class246.field4383.method1375(16259); var1 != null; var1 = (class79) class246.field4383.method1377(-19546)) {
            if (var1.field1383 > 0) {
                var1.field1383--;
            }
            if (var1.field1383 != 0) {
                if (var1.field1387 > 0) {
                    var1.field1387--;
                }
                if (var1.field1387 == 0 && var1.field1368 >= 1 && var1.field1369 >= 1 && var1.field1368 <= 102 && var1.field1369 <= 102 && (var1.field1367 < 0 || class163.method1174(var1.field1385, var1.field1367, 0))) {
                    class269.method1826(var1.field1368, var1.field1386, var1.field1385, -103, var1.field1369, var1.field1372, var1.field1375, var1.field1367);
                    var1.field1387 = -1;
                    if (var1.field1384 == var1.field1367 && var1.field1384 == -1) {
                        var1.method476(102);
                    } else if (var1.field1384 == var1.field1367 && var1.field1378 == var1.field1372 && var1.field1385 == var1.field1379) {
                        var1.method476(-91);
                    }
                }
            } else if (var1.field1384 < 0 || class163.method1174(var1.field1379, var1.field1384, 0)) {
                class269.method1826(var1.field1368, var1.field1386, var1.field1379, -103, var1.field1369, var1.field1378, var1.field1375, var1.field1384);
                var1.method476(-55);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIII)V")
    public final void method46(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3079++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIIIIJILga;)V")
    public final void method48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class16 arg10) {
        class98 var13 = this.method1182((byte) -44);
        field3082++;
        if (var13 != null) {
            var13.method48(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3075);
            this.field3063 = var13.method62();
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
    public static void method1176(int arg0) {
        field3078 = null;
        field3090 = null;
        field3089 = null;
        field3088 = null;
        if (arg0 <= 70) {
            field3090 = null;
        }
        field3091 = null;
        field3067 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
    public final void method1177(int arg0, int arg1) {
        field3076++;
        if (this.field3077) {
            return;
        }
        this.field3069 += arg0;
        if (arg1 >= -56) {
            method1178(-23, (class250) null, 40, 6);
        }
        while (this.field3074.field51[this.field3065] < this.field3069) {
            this.field3069 -= this.field3074.field51[this.field3065];
            this.field3065++;
            if (this.field3074.field37.length <= this.field3065) {
                this.field3077 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILhi;II)Lda;")
    public static final class101 method1178(int arg0, class250 arg1, int arg2, int arg3) {
        if (arg0 != 102) {
            field3090 = null;
        }
        field3087++;
        return class224.method1551(arg3, arg2, arg1, (byte) -94) ? class77.method498(arg0 - 103) : null;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)Lng;")
    public static final class134 method1179(int arg0, int arg1) {
        if (arg0 != 102) {
            method1179(125, 3);
        }
        class134 var2 = (class134) class80.field1395.method82(arg0 ^ 0x19, (long) arg1);
        field3086++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class184.field3392.method1688(0, class66.method444((byte) -91, arg1), class76.method491(-26551, arg1));
        class134 var4 = new class134();
        var4.field2396 = arg1;
        if (var3 != null) {
            var4.method959((byte) -106, new class118(var3));
        }
        var4.method947((byte) -124);
        if (var4.field2442 != -1) {
            var4.method948(method1179(102, var4.field2425), method1179(102, var4.field2442), -110);
        }
        if (var4.field2466 != -1) {
            var4.method951((byte) 95, method1179(102, var4.field2402), method1179(arg0, var4.field2466));
        }
        if (!class259.field4598 && var4.field2398) {
            var4.field2407 = 0;
            var4.field2438 = false;
            var4.field2393 = null;
            var4.field2436 = class242.field4331;
            var4.field2390 = null;
        }
        class80.field1395.method84(86, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIB)V")
    public static final void method1180(int arg0, int arg1, byte arg2) {
        field3064++;
        if (arg2 != -87) {
            field3078 = null;
        }
        class174 var3 = class249.method1671(13, arg0, (byte) 125);
        var3.method1233(0);
        var3.field3186 = arg1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIII)V")
    public static final void method1181(int arg0, int arg1, int arg2, int arg3) {
        field3068++;
        class82 var4 = class157.method1115(arg0 + 6685, arg2, arg1);
        if (var4 != null && var4.field1592 != null) {
            class121 var5 = new class121();
            var5.field2198 = var4.field1592;
            var5.field2196 = var4;
            class274.method1877(var5, (byte) -77);
        }
        if (arg0 != -1) {
            return;
        }
        class214.field3908 = arg3;
        class140.field2617 = arg2;
        class148.field2805 = arg1;
        class254.field4504 = true;
        class229.method1581(var4, false);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)Lic;")
    private final class98 method1182(byte arg0) {
        field3070++;
        class233 var2 = class255.method1728(this.field3081, (byte) 95);
        class98 var3;
        if (this.field3077) {
            var3 = var2.method1595(7208, -1);
        } else {
            var3 = var2.method1595(7208, this.field3065);
        }
        if (var3 == null) {
            return null;
        } else if (arg0 == -44) {
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(IIIIIII)V")
    public class165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3071 = arg3;
        this.field3081 = arg0;
        this.field3072 = arg2;
        this.field3083 = arg4;
        this.field3084 = arg1;
        this.field3085 = arg5 + arg6;
        int var8 = class255.method1728(this.field3081, (byte) 95).field4193;
        if (var8 == -1) {
            this.field3077 = true;
        } else {
            this.field3077 = false;
            this.field3074 = class253.method1712(var8, -124);
        }
    }
}
