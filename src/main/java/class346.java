import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class346 {

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field5335 = 0;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V", line = 9)
    public static final void method2259(byte arg0) {
        if (arg0 > -105) {
            field5335 = 29;
        }
        field5334++;
        while (class158.field2514.method2229(class345.field5331, 0) >= 27) {
            int var1 = class158.field2514.method2225(-67, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class39.field499[var1] == null) {
                class39.field499[var1] = new class50();
                var2 = true;
                class39.field499[var1].field1868 = var1;
            }
            class50 var3 = class39.field499[var1];
            class423.field6253[class397.field5940++] = var1;
            var3.field1839 = class183.field2987;
            if (var3.field615 != null && var3.field615.method1624((byte) -87)) {
                class337.method2222(false, var3);
            }
            int var4 = class158.field2514.method2225(78, 1);
            int var5 = class158.field2514.method2225(94, 5);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class158.field2514.method2225(-104, 1);
            if (var6 == 1) {
                class208.field3349[class21.field274++] = var1;
            }
            var3.method316(class395.method2493(false, class158.field2514.method2225(117, 14)), 0);
            int var7 = class218.field3575[class158.field2514.method2225(96, 3)];
            int var8 = class158.field2514.method2225(99, 5);
            var3.method910(var3.field615.field3779, -13034);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.field1833 = var3.field615.field3753 << 3;
            if (var3.field1833 == 0) {
                var3.method914(0, 16383);
            } else if (var2) {
                var3.method914(var7, 16383);
            }
            var3.method902(class266.field4286, class261.field4201.field1906[0] + var8, var4 == 1, false, var3.method903(-107), class261.field4201.field1916[0] + var5);
            if (var3.field615.method1624((byte) -59)) {
                class224.method1609(var3.field1906[0], (class219) null, class266.field4286, 0, var3, (class127) null, 8500, var3.field1916[0]);
            }
        }
        class158.field2514.method2226(7);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I", line = 90)
    public static final int method2260(int arg0, int arg1, int arg2) {
        field5333++;
        int var3 = class264.method1809(1, 4, arg1 + 45365, arg2 - -91923) + ((class264.method1809(1, 2, arg1 - -10294, arg2 - -37821) + -128 >> 1) - -(class264.method1809(1, 1, arg1, arg2) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        int var5 = -55 % ((-arg0 - 2) / 38);
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V", line = 111)
    public static final void method2261(int arg0) {
        class102.method766(0);
        field5337++;
        class218.method1558(false);
        class263.method1804(-128);
        class345.method2254(-11424);
        class41.method272((byte) 101);
        class341.method2241(0);
        class336.method2216(-14416);
        class271.method1834(-82);
        class161.method1119(90);
        class205.method1451(arg0 ^ 0x58);
        class161.method1121(2);
        class267.method1819(arg0 ^ 0xFFFFD74A);
        class361.method2340(9265);
        class267.method1818((byte) -66);
        class449.method2795(1764384615);
        class102.method767(4550);
        class410.method2572(arg0 ^ 0xFFFFFFF0);
        class305.method2054(arg0 + 85);
        class331.method2195(arg0 ^ 0x5378);
        class110.method817(false);
        class290.method1949(1136);
        class326.method2165(arg0 ^ 0xD);
        if (class348.field5355 != 0) {
            for (int var1 = 0; var1 < class321.field5015.length; var1++) {
                class321.field5015[var1] = null;
            }
            class376.field5686 = 0;
        }
        class349.method2278(arg0 ^ 0xE);
        class32.method217((byte) 49);
        class196.method1372((byte) -113);
        class36.method236((byte) -53);
        class58.method381(-110);
        class17.field229.method335((byte) 111);
        class284.field4547.method626();
        class300.field4763.method1657(-8392);
        class288.method1947(100);
        class79.field998.method2774(-10298);
        class199.field3218.method2774(arg0 ^ 0xFFFFD7C9);
        class220.field3636.method2774(-10298);
        class110.field1525.method2774(-10298);
        if (arg0 != 15) {
            method2262((byte) 75, (class124) null);
        }
        class236.field3950.method2774(-10298);
        class212.field3401.method2774(arg0 - 10313);
        class125.field1930.method2774(-10298);
        class267.field4293.method2774(arg0 - 10313);
        class223.field3727.method2774(-10298);
        class262.field4205.method2774(-10298);
        class391.field5875.method2774(-10298);
        class282.field4531.method2774(arg0 - 10313);
        class377.field5700.method2774(-10298);
        class33.field407.method2774(-10298);
        class156.field2460.method2774(-10298);
        class127.field1990.method2774(-10298);
        class132.field2058.method2774(arg0 ^ 0xFFFFD7C9);
        class150.field2335.method2774(arg0 - 10313);
        class412.field6103.method2774(arg0 ^ 0xFFFFD7C9);
        class56.field698.method2774(-10298);
        class321.field5002.method2774(arg0 ^ 0xFFFFD7C9);
        class27.field309.method2774(-10298);
        class300.field4759.method2774(-10298);
        class311.field4900.method2774(-10298);
        class447.field6512.method2774(-10298);
        class430.field6326.method2774(-10298);
        class47.field590.method2774(-10298);
        class342.field5277.method2774(-10298);
        class256.field4160.method2774(-10298);
        class427.field6300.method335((byte) -64);
        class214.field3439.method335((byte) -110);
        class272.field4367.method335((byte) 77);
        class209.field3362.method335((byte) 92);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLjd;)V", line = 199)
    public static final void method2262(byte arg0, class124 arg1) {
        field5336++;
        boolean var2 = false;
        if (class183.field2987 == arg1.field1888 || arg1.field1878 == -1 || arg1.field1880 != 0) {
            var2 = true;
        } else {
            class417 var3 = class156.method1099(arg1.field1878, 72);
            if (var3.field6156 || var3.field6171[arg1.field1845] < arg1.field1885 + 1) {
                var2 = true;
            }
        }
        int var4 = 55 / ((arg0 + 68) / 39);
        if (var2) {
            int var5 = arg1.field1888 - arg1.field1840;
            int var6 = class183.field2987 - arg1.field1840;
            int var7 = arg1.field1842 * 128 + arg1.method903(-81) * 64;
            int var8 = arg1.field1892 * 128 + arg1.method903(-40) * 64;
            int var9 = arg1.field1889 * 128 + arg1.method903(-94) * 64;
            int var10 = arg1.field1882 * 128 + (arg1.method903(-86) * 64);
            arg1.field724 = ((var5 - var6) * var7 + var6 * var9) / var5;
            arg1.field722 = ((var5 - var6) * var8 + var6 * var10) / var5;
        }
        arg1.field1903 = 0;
        if (arg1.field1895 == 0) {
            arg1.method914(8192, 16383);
        }
        if (arg1.field1895 == 1) {
            arg1.method914(12288, 16383);
        }
        if (arg1.field1895 == 2) {
            arg1.method914(0, 16383);
        }
        if (arg1.field1895 == 3) {
            arg1.method914(4096, 16383);
        }
    }
}
