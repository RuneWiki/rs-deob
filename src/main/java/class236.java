import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class236 {

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "Lld;")
    private class114 field3155 = new class114();

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    private int field3156;

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "I")
    private int field3168;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "Lub;")
    private class18 field3157;

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "[I")
    public static int[] field3165 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "[I")
    public static int[] field3158 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
    public static int field3173 = -1;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!jp", name = "r", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!jp", name = "s", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILjava/lang/Object;BJ)V", line = 6)
    private final void method1455(int arg0, Object arg1, byte arg2, long arg3) {
        field3161++;
        if (arg0 > this.field3168) {
            throw new IllegalStateException("s>cs");
        }
        this.method1469(31545, arg3);
        this.field3156 -= arg0;
        if (arg2 < 115) {
            this.method1455(-113, null, (byte) -90, 81L);
        }
        while (this.field3156 < 0) {
            class183 var7 = (class183) this.field3155.method787((byte) 127);
            this.method1466(-29703, var7);
        }
        class303 var6 = new class303(arg1, arg0);
        this.field3157.method173(arg3, var6, (byte) 116);
        this.field3155.method783(var6, (byte) -105);
        var6.field6896 = 0L;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(JI)Ljava/lang/Object;", line = 36)
    public final Object method1456(long arg0, int arg1) {
        field3159++;
        class183 var4 = (class183) this.field3157.method182(arg0, (byte) 91);
        if (arg1 <= 104) {
            return null;
        } else if (var4 == null) {
            return null;
        } else {
            Object var5 = var4.method1200((byte) 57);
            if (var5 == null) {
                var4.method300(false);
                var4.method2856(0);
                this.field3156 += var4.field2606;
                return null;
            }
            if (var4.method1199(21800)) {
                class303 var6 = new class303(var5, var4.field2606);
                this.field3157.method173(var4.field622, var6, (byte) 75);
                this.field3155.method783(var6, (byte) -123);
                var6.field6896 = 0L;
                var4.method300(false);
                var4.method2856(0);
            } else {
                this.field3155.method783(var4, (byte) -97);
                var4.field6896 = 0L;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)I", line = 81)
    public final int method1457(byte arg0) {
        if (arg0 != 22) {
            this.method1459(60);
        }
        field3153++;
        return this.field3156;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(B)V", line = 92)
    public final void method1458(byte arg0) {
        int var2 = -101 / ((2 - arg0) / 56);
        field3154++;
        this.field3155.method784(125);
        this.field3157.method176(-1);
        this.field3156 = this.field3168;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V", line = 107)
    public final void method1459(int arg0) {
        field3162++;
        for (class183 var2 = (class183) this.field3155.method786(1); var2 != null; var2 = (class183) this.field3155.method780((byte) -78)) {
            if (var2.method1199(21800)) {
                var2.method300(false);
                var2.method2856(arg0 - 19088);
                this.field3156 += var2.field2606;
            }
        }
        if (arg0 != 19088) {
            field3158 = null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)Ljava/lang/Object;", line = 133)
    public final Object method1460(boolean arg0) {
        field3167++;
        class183 var2 = (class183) this.field3157.method179(1);
        if (arg0) {
            this.method1458((byte) -33);
        }
        while (var2 != null) {
            Object var3 = var2.method1200((byte) 57);
            if (var3 != null) {
                return var3;
            }
            class183 var4 = var2;
            var2 = (class183) this.field3157.method179(1);
            var4.method300(false);
            var4.method2856(0);
            this.field3156 += var2.field2606;
        }
        return null;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)V", line = 164)
    public final void method1461(int arg0, int arg1) {
        field3166++;
        if (arg0 != -5) {
            this.field3168 = -125;
        }
        if (class13.field256 == null) {
            return;
        }
        for (class183 var3 = (class183) this.field3155.method786(arg0 ^ 0xFFFFFFFA); var3 != null; var3 = (class183) this.field3155.method780((byte) -78)) {
            if (var3.method1199(21800)) {
                if (var3.method1200((byte) 57) == null) {
                    var3.method300(false);
                    var3.method2856(0);
                    this.field3156++;
                }
            } else if (++var3.field6896 > (long) arg1) {
                class183 var4 = class13.field256.method1454(1, var3);
                this.field3157.method173(var3.field622, var4, (byte) 99);
                class51.method383((byte) -108, var3, var4);
                var3.method300(false);
                var3.method2856(arg0 ^ 0xFFFFFFFB);
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/lang/Object;JI)V", line = 214)
    public final void method1462(Object arg0, long arg1, int arg2) {
        field3160++;
        if (arg2 >= -9) {
            this.method1455(-34, null, (byte) -74, -85L);
        }
        this.method1455(1, arg0, (byte) 121, arg1);
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 227)
    public final Object method1463(int arg0) {
        field3170++;
        class183 var2 = (class183) this.field3157.method181((byte) -70);
        while (var2 != null) {
            Object var3 = var2.method1200((byte) 57);
            if (var3 != null) {
                return var3;
            }
            class183 var4 = var2;
            var2 = (class183) this.field3157.method179(arg0 ^ 0xFFFFFFFE);
            var4.method300(false);
            var4.method2856(~arg0);
            this.field3156 += var2.field2606;
        }
        if (arg0 != -1) {
            this.method1458((byte) 21);
        }
        return null;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIILoa;ILjava/lang/String;Lcr;Lre;IBLea;)V", line = 258)
    public static final void method1464(int arg0, int arg1, int arg2, int arg3, class489 arg4, int arg5, String arg6, class403 arg7, class425 arg8, int arg9, byte arg10, class381 arg11) {
        field3164++;
        int var12;
        if (class42.field623 == 4) {
            var12 = (int) class184.field2621 & 0x3FFF;
        } else {
            var12 = (int) class184.field2621 + class361.field4871 & 0x3FFF;
        }
        int var13 = Math.max(arg7.field5450 / 2, arg7.field5404 / 2) + 10;
        int var14 = arg1 * arg1 + arg2 * arg2;
        if (var14 > var13 * var13) {
            return;
        }
        int var15 = class305.field4019[var12];
        int var16 = class305.field4022[var12];
        if (class42.field623 != 4) {
            var16 = var16 * 256 / (class514.field7589 + 256);
            var15 = var15 * 256 / (class514.field7589 + 256);
        }
        int var17 = arg1 * var15 + arg2 * var16 >> 15;
        int var18 = arg1 * var16 - (arg2 * var15) >> 15;
        int var19 = arg8.method2451(100, true, null, arg6);
        int var20 = arg8.method2442(0, arg6, 100, 0, null);
        int var21 = var17 - var19 / 2;
        if (var21 >= (-arg7.field5450) && arg7.field5450 >= var21 && -arg7.field5404 <= var18 && arg7.field5404 >= var18) {
            arg4.method2818(0, arg9, (byte) -128, arg11, 0, arg0 + (arg7.field5404 / 2) - arg5 - var20 - var18, null, arg0, var19, arg3, 50, arg7.field5450 / 2 + var21 + arg9, 0, null, 1, arg6);
            if (arg10 != 81) {
                method1468(95);
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(B)I", line = 307)
    public final int method1465(byte arg0) {
        if (arg0 < 0) {
            return -28;
        } else {
            field3172++;
            return this.field3168;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILs;)V", line = 324)
    private final void method1466(int arg0, class183 arg1) {
        if (arg1 != null) {
            arg1.method300(false);
            arg1.method2856(arg0 ^ 0xFFFF8BF9);
            this.field3156 += arg1.field2606;
        }
        if (arg0 != -29703) {
            this.method1457((byte) 79);
        }
        field3163++;
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(I)V", line = 352)
    public class236(int arg0) {
        this.field3156 = arg0;
        this.field3168 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field3157 = new class18(var2);
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)I", line = 368)
    public final int method1467(int arg0) {
        field3171++;
        int var2 = 81 / ((-arg0 - 29) / 50);
        int var3 = 0;
        for (class183 var4 = (class183) this.field3155.method786(1); var4 != null; var4 = (class183) this.field3155.method780((byte) -78)) {
            if (!var4.method1199(21800)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "(I)V", line = 391)
    public static void method1468(int arg0) {
        field3165 = null;
        field3158 = null;
        if (arg0 != 4649) {
            field3158 = null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IJ)V", line = 402)
    private final void method1469(int arg0, long arg1) {
        field3169++;
        if (arg0 == 31545) {
            class183 var4 = (class183) this.field3157.method182(arg1, (byte) 78);
            this.method1466(arg0 - 61248, var4);
        }
    }
}
