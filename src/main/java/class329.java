import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class329 extends class73 {

    @OriginalMember(owner = "client!mw", name = "u", descriptor = "I")
    private int field5168;

    @OriginalMember(owner = "client!mw", name = "p", descriptor = "I")
    private int field5163;

    @OriginalMember(owner = "client!mw", name = "o", descriptor = "I")
    private int field5162;

    @OriginalMember(owner = "client!mw", name = "r", descriptor = "I")
    private int field5165;

    @OriginalMember(owner = "client!mw", name = "z", descriptor = "I")
    private int field5173;

    @OriginalMember(owner = "client!mw", name = "q", descriptor = "I")
    private int field5164;

    @OriginalMember(owner = "client!mw", name = "v", descriptor = "I")
    private int field5169;

    @OriginalMember(owner = "client!mw", name = "w", descriptor = "I")
    private int field5170;

    @OriginalMember(owner = "client!mw", name = "s", descriptor = "Lbi;")
    public static class104 field5166 = new class104(97, 6);

    @OriginalMember(owner = "client!mw", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field5176 = new String[100];

    @OriginalMember(owner = "client!mw", name = "F", descriptor = "[I")
    public static int[] field5179 = new int[500];

    @OriginalMember(owner = "client!mw", name = "m", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!mw", name = "n", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!mw", name = "t", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!mw", name = "x", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!mw", name = "y", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!mw", name = "A", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!mw", name = "B", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!mw", name = "E", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!mw", name = "D", descriptor = "[I")
    public static int[] field5177;

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)V")
    public static void method2203(int arg0) {
        field5166 = null;
        field5177 = null;
        if (arg0 != 17570) {
            method2203(125);
        }
        field5179 = null;
        field5176 = null;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(II)I")
    public static final int method2204(int arg0, int arg1) {
        ++field5174;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        if (arg0 != 2178540) {
            field5178 = 117;
        }
        int var3 = arg1 * 6 + -61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIB)V")
    public final void method532(int arg0, int arg1, byte arg2) {
        ++field5171;
        if (arg2 != -67) {
            this.field5162 = -55;
        }
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field5168 = arg5;
        this.field5163 = arg2;
        this.field5162 = arg3;
        this.field5165 = arg1;
        this.field5173 = arg7;
        this.field5164 = arg6;
        this.field5169 = arg4;
        this.field5170 = arg0;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)V")
    public static final void method2205(byte arg0) {
        class410[] var1 = class149.field2003;
        synchronized (class149.field2003) {
            int var2 = 0;
            while (true) {
                if (var2 >= class149.field2003.length) {
                    break;
                }
                class149.field2003[var2] = new class410();
                class59.field945[var2] = 0;
                ++var2;
            }
        }
        if (arg0 < 17) {
            field5179 = null;
        }
        ++field5161;
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(IIB)V")
    public final void method537(int arg0, int arg1, byte arg2) {
        if (arg2 > -78) {
            this.method537(73, 65, (byte) 106);
        }
        ++field5172;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IBZIII)V")
    public static final void method2206(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 1) {
            arg0 = 1;
        }
        ++field5160;
        if (~arg4 > -2) {
            arg4 = 1;
        }
        int var6 = arg0 + -334;
        if (var6 >= 0) {
            if (~var6 < -101) {
                var6 = 100;
            }
        } else {
            var6 = 0;
        }
        int var7 = (-class98.field1402 + class253.field4102) * var6 / 100 + class98.field1402;
        if (~var7 > ~class330.field5186) {
            var7 = class330.field5186;
        } else if (~var7 < ~class468.field7169) {
            var7 = class468.field7169;
        }
        int var8 = arg0 * var7 * 512 / (arg4 * 334);
        if (~class279.field4426 >= ~var8) {
            if (~var8 < ~class163.field2364) {
                short var9 = class163.field2364;
                var7 = arg4 * var9 * 334 / (arg0 * 512);
                if (var7 < class330.field5186) {
                    var7 = class330.field5186;
                    int var10 = arg4 * var9 * 334 / (var7 * 512);
                    int var11 = (-var10 + arg0) / 2;
                    if (arg2) {
                        class19.field198.method1228();
                        class19.field198.method3042(var11, (byte) -102, arg3, -16777216, arg5, arg4);
                        class19.field198.method3042(var11, (byte) -128, -var11 + arg0 + arg3, -16777216, arg5, arg4);
                    }
                    arg0 -= var11 * 2;
                    arg3 += var11;
                }
            }
        } else {
            short var12 = class279.field4426;
            var7 = var12 * 334 * arg4 / (arg0 * 512);
            if (~class468.field7169 > ~var7) {
                var7 = class468.field7169;
                int var13 = arg0 * var7 * 512 / (var12 * 334);
                int var14 = (-var13 + arg4) / 2;
                if (arg2) {
                    class19.field198.method1228();
                    class19.field198.method3042(arg0, (byte) -106, arg3, -16777216, arg5, var14);
                    class19.field198.method3042(arg0, (byte) -112, arg3, -16777216, arg4 + arg5 + -var14, var14);
                }
                arg4 -= var14 * 2;
                arg5 += var14;
            }
        }
        if (arg1 == 98) {
            class116.field1611 = arg0 * var7 / 334;
            class15.field163 = arg5;
            class235.field3863 = (short) arg0;
            class21.field247 = arg3;
            class314.field4917 = (short) arg4;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IZI)V")
    public final void method538(int arg0, boolean arg1, int arg2) {
        ++field5167;
        int var4 = this.field5170 * arg0 >> 12;
        if (!arg1) {
            int var5 = this.field5165 * arg2 >> 12;
            int var6 = this.field5163 * arg0 >> 12;
            int var7 = this.field5162 * arg2 >> 12;
            int var8 = this.field5169 * arg0 >> 12;
            int var9 = this.field5168 * arg2 >> 12;
            int var10 = this.field5164 * arg0 >> 12;
            int var11 = this.field5173 * arg2 >> 12;
            class512.method3092(var5, var8, var6, var4, super.field1098, var9, 0, var10, var7, var11);
        }
    }
}
