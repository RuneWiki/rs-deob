import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class217 {

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "Z")
    private boolean field2952 = false;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public int field2962 = 0;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
    public int field2964 = 0;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    private int field2945;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public int field2951;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public int field2953;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public int field2955;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public int field2956;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public int field2957;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public int field2958;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public int field2960;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public int field2961;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    public int field2965;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "J")
    public long field2959;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1424(boolean arg0, int arg1) {
        if (arg0) {
            method1424(true, 91);
        }
        field2946++;
        return arg1 == 3 || arg1 == 4 || arg1 == 5 || arg1 == 6;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
    public static final void method1425(boolean arg0) {
        field2954++;
        class571.field7223.method1363(3684);
        class235.field3225.method2660(true);
        class115.field1518.method3695((byte) 71);
        class390.field4983.method4288(2);
        class595.field7561.method772(5);
        class640.field8189.method692(arg0);
        class143.field1864.method4263(2);
        class62.field819.method560(86);
        class229.field3089.method225((byte) -128);
        class182.field2489.method2568((byte) -118);
        class451.field5893.method262(false);
        class66.field869.method2051(-121);
        class702.field9289.method2696(arg0);
        class272.field3575.method2326(-8014);
        class55.field713.method1807(-23924);
        class761.field10377.method4100((byte) 73);
        class55.field708.method3870(29);
        class526.field6688.method2957(16);
        class736.field9975.method1979((byte) -99);
        class542.field6810.method2193(-25031);
        class406.field5387.method1718((byte) 63);
        class111.field1482.method1984(58);
        class323.method1876(-105);
        class82.method524((byte) -42);
        class315.method1840(83);
        class191.method1339((byte) -115);
        class551.method2979(-80);
        class83.field1191.method2932((byte) 80);
        class57.field758.method2932((byte) 80);
        class237.field3231.method2932((byte) 80);
        class450.field5877.method2932((byte) 80);
        class760.field10360.method2932((byte) 80);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZILmc;)V")
    private final void method1426(boolean arg0, int arg1, class234 arg2) {
        field2963++;
        if (arg1 == 1) {
            this.field2945 = arg2.method1553((byte) -122);
        } else if (arg1 == 2) {
            arg2.method1509(true);
        } else if (arg1 == 3) {
            this.field2957 = arg2.method1497((byte) 72);
            this.field2960 = arg2.method1497((byte) 57);
            this.field2965 = arg2.method1497((byte) 40);
        } else if (arg1 == 4) {
            this.field2961 = arg2.method1509(true);
            this.field2951 = arg2.method1497((byte) 93);
        } else if (arg1 == 6) {
            this.field2956 = arg2.method1509(true);
        } else if (arg1 == 8) {
            this.field2962 = 1;
        } else if (arg1 == 9) {
            this.field2964 = 1;
        } else if (arg1 == 10) {
            this.field2952 = true;
        }
        if (!arg0) {
            this.field2945 = 39;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLmc;)V")
    public final void method1427(byte arg0, class234 arg1) {
        while (true) {
            int var3 = arg1.method1509(true);
            if (var3 == 0) {
                int var4 = -115 / ((arg0 - 10) / 60);
                field2950++;
                return;
            }
            this.method1426(true, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public final void method1428(int arg0) {
        field2947++;
        this.field2958 = class541.field6806[this.field2945 << 3];
        long var2 = (long) this.field2957;
        long var4 = (long) this.field2960;
        if (arg0 != 127) {
            this.field2951 = 57;
        }
        long var6 = (long) this.field2965;
        this.field2953 = (int) Math.sqrt((double) (var6 * var6 + (var2 * var2 + (var4 * var4))));
        if (this.field2951 == 0) {
            this.field2951 = 1;
        }
        if (this.field2961 == 0) {
            this.field2959 = 2147483647L;
        } else if (this.field2961 == 1) {
            this.field2959 = (this.field2953 * 8 / this.field2951);
            this.field2959 *= this.field2959;
        } else if (this.field2961 == 2) {
            this.field2959 = (this.field2953 * 8 / this.field2951);
        }
        if (this.field2952) {
            this.field2953 *= -1;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static final void method1429(byte arg0) {
        field2949++;
        if (arg0 != 6) {
            method1429((byte) 44);
        }
        for (class136 var1 = (class136) class332.field4061.method3591(0); var1 != null; var1 = (class136) class332.field4061.method3600((byte) 114)) {
            if (var1.field1803) {
                var1.method1946(arg0 ^ 0xFFFFD782);
            } else {
                var1.field1805 = true;
                if (var1.field1800 >= 0 && var1.field1799 >= 0 && var1.field1800 < class240.field3280 && class276.field3602 > var1.field1799) {
                    class278.method1709(var1, (byte) -74);
                }
            }
        }
        for (class136 var2 = (class136) class338.field4126.method3591(0); var2 != null; var2 = (class136) class338.field4126.method3600((byte) 123)) {
            if (var2.field1803) {
                var2.method1946(arg0 ^ 0xFFFFD782);
            } else {
                var2.field1805 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)I")
    public static final int method1430(int arg0, boolean arg1) {
        field2948++;
        return arg1 ? arg0 & 0x7F : 81;
    }
}
