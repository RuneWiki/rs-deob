import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class466 implements class246 {

    @OriginalMember(owner = "client!li", name = "b", descriptor = "Lvq;")
    public static class24 field6855 = new class24(39, -1);

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field6857 = 0;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field6863 = 0;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "[I")
    public static int[] field6859 = new int[8];

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field6862;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([IIJZ)Ljava/lang/String;")
    public final String method1635(int[] arg0, int arg1, long arg2, boolean arg3) {
        if (arg3) {
            field6857 = -36;
        }
        field6861++;
        if (arg1 == 0) {
            class214 var6 = class454.method2815(arg3, arg0[0]);
            return var6.method1464(90, (int) arg2);
        } else if (arg1 == 1 || arg1 == 10) {
            class427 var7 = class157.field2119.method176((byte) -45, (int) arg2);
            return var7.field6145;
        } else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
            return class454.method2815(arg3, arg0[0]).method1464(40, (int) arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILge;)V")
    public static final void method2872(int arg0, class108 arg1) {
        field6862++;
        int var2 = 0;
        arg1.method770(8);
        for (int var3 = 0; var3 < class208.field2933; var3++) {
            int var15 = class88.field1085[var3];
            if ((class143.field1949[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    class143.field1949[var15] = (byte) class259.method1785(class143.field1949[var15], 2);
                    var2--;
                } else {
                    int var16 = arg1.method773(1, (byte) 72);
                    if (var16 == 0) {
                        var2 = class346.method2240(arg1, 1);
                        class143.field1949[var15] = (byte) class259.method1785(class143.field1949[var15], 2);
                    } else {
                        class459.method2852(var15, (byte) 125, arg1);
                    }
                }
            }
        }
        arg1.method771((byte) 105);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method770(8);
        for (int var4 = 0; var4 < class208.field2933; var4++) {
            int var13 = class88.field1085[var4];
            if ((class143.field1949[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    class143.field1949[var13] = (byte) class259.method1785(class143.field1949[var13], 2);
                    var2--;
                } else {
                    int var14 = arg1.method773(1, (byte) -125);
                    if (var14 == 0) {
                        var2 = class346.method2240(arg1, 1);
                        class143.field1949[var13] = (byte) class259.method1785(class143.field1949[var13], 2);
                    } else {
                        class459.method2852(var13, (byte) 127, arg1);
                    }
                }
            }
        }
        arg1.method771((byte) 117);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method770(8);
        int var5 = 0;
        if (arg0 <= 28) {
            field6863 = -95;
        }
        while (class241.field3575 > var5) {
            int var11 = class420.field6084[var5];
            if ((class143.field1949[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class143.field1949[var11] = (byte) class259.method1785(class143.field1949[var11], 2);
                    var2--;
                } else {
                    int var12 = arg1.method773(1, (byte) -105);
                    if (var12 == 0) {
                        var2 = class346.method2240(arg1, 1);
                        class143.field1949[var11] = (byte) class259.method1785(class143.field1949[var11], 2);
                    } else if (class411.method2554(arg1, -1234547605, var11)) {
                        class143.field1949[var11] = (byte) class259.method1785(class143.field1949[var11], 2);
                    }
                }
            }
            var5++;
        }
        arg1.method771((byte) 100);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method770(8);
        for (int var6 = 0; var6 < class241.field3575; var6++) {
            int var9 = class420.field6084[var6];
            if ((class143.field1949[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class143.field1949[var9] = (byte) class259.method1785(class143.field1949[var9], 2);
                } else {
                    int var10 = arg1.method773(1, (byte) -112);
                    if (var10 == 0) {
                        var2 = class346.method2240(arg1, 1);
                        class143.field1949[var9] = (byte) class259.method1785(class143.field1949[var9], 2);
                    } else if (class411.method2554(arg1, -1234547605, var9)) {
                        class143.field1949[var9] = (byte) class259.method1785(class143.field1949[var9], 2);
                    }
                }
            }
        }
        arg1.method771((byte) 126);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class208.field2933 = 0;
        class241.field3575 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class143.field1949[var7] = (byte) (class143.field1949[var7] >> 1);
            class380 var8 = class455.field6731[var7];
            if (var8 == null) {
                class420.field6084[class241.field3575++] = var7;
            } else {
                class88.field1085[class208.field2933++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)I")
    public static final int method2873(int arg0) {
        field6858++;
        if (arg0 >= -57) {
            method2873(-109);
        }
        try {
            if (class337.field4971 == 0) {
                if ((class43.method364(-16756) - 5000L) < class372.field5441) {
                    return 0;
                }
                class106.field1428 = class267.field3963.method2206(class304.field4462, class369.field5320, true);
                class212.field2982 = class43.method364(-16756);
                class337.field4971 = 1;
            }
            if (class43.method364(-16756) > (class212.field2982 + 30000L)) {
                return class332.method2166(1000, 0);
            }
            if (class337.field4971 == 1) {
                if (class106.field1428.field5134 == 2) {
                    return class332.method2166(1001, 0);
                }
                if (class106.field1428.field5134 != 1) {
                    return -1;
                }
                class72.field933 = new class440((Socket) class106.field1428.field5129, class267.field3963);
                class106.field1428 = null;
                int var1 = 0;
                if (class296.field4310) {
                    var1 = class92.field1149;
                }
                class159.field2132.field3762 = 0;
                class159.field2132.method1727(-128, class33.field468.field892);
                class159.field2132.method1721(25153, var1);
                class72.field933.method2694(class159.field2132.field3762, 1, class159.field2132.field3764, 0);
                if (class423.field6115 != null) {
                    class423.field6115.method752(-115);
                }
                if (class182.field2565 != null) {
                    class182.field2565.method752(-48);
                }
                int var2 = class72.field933.method2697(-103);
                if (class423.field6115 != null) {
                    class423.field6115.method752(-101);
                }
                if (class182.field2565 != null) {
                    class182.field2565.method752(-95);
                }
                if (var2 != 0) {
                    return class332.method2166(var2, 0);
                }
                class337.field4971 = 2;
            }
            if (class337.field4971 == 2) {
                if (class72.field933.method2705(-63) < 2) {
                    return -1;
                }
                class301.field4397 = class72.field933.method2697(-111);
                class301.field4397 <<= 0x8;
                class301.field4397 += class72.field933.method2697(-108);
                class248.field3657 = new byte[class301.field4397];
                class296.field4305 = 0;
                class337.field4971 = 3;
            }
            if (class337.field4971 != 3) {
                return -1;
            }
            int var3 = class72.field933.method2705(-110);
            if (var3 < 1) {
                return -1;
            }
            if ((class301.field4397 - class296.field4305) < var3) {
                var3 = class301.field4397 - class296.field4305;
            }
            class72.field933.method2702(class296.field4305, var3, class248.field3657, (byte) 89);
            class296.field4305 += var3;
            if (class296.field4305 < class301.field4397) {
                return -1;
            } else if (class307.method2051(0, class248.field3657)) {
                class223.field3277 = new class177[class228.field3434];
                int var4 = 0;
                for (int var5 = class377.field5524; var5 <= class323.field4776; var5++) {
                    class177 var6 = class288.method1929((byte) 14, var5);
                    if (var6 != null) {
                        class223.field3277[var4++] = var6;
                    }
                }
                class388.field5681 = 0;
                class241.field3581 = null;
                class72.field933.method2695(0);
                class72.field933 = null;
                class248.field3657 = null;
                class337.field4971 = 0;
                class400.field5788 = 0;
                class372.field5441 = class43.method364(-16756);
                return 0;
            } else {
                return class332.method2166(1002, 0);
            }
        } catch (IOException var7) {
            return class332.method2166(1003, 0);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIII)V")
    public static final void method2874(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6854++;
        float var5 = (float) class66.field872 / (float) class66.field877;
        int var6 = arg3;
        if (arg2 <= 34) {
            field6859 = null;
        }
        int var7 = arg1;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg3 * var5);
        } else {
            var6 = (int) ((float) arg1 / var5);
        }
        int var8 = arg0 - (arg3 - var6) / 2;
        int var9 = arg4 - (arg1 - var7) / 2;
        class344.field5064 = class66.field877 * var8 / var6;
        class71.field929 = -1;
        class134.field1843 = class66.field872 - (class66.field872 * var9 / var7);
        class4.field68 = -1;
        class132.method884(-1);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
    public static void method2875(byte arg0) {
        field6855 = null;
        field6859 = null;
        int var1 = 63 / ((arg0 + 31) / 57);
    }
}
